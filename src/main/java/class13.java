import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class13 {

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field177 = new String[] { method92(method91("c\u0005\t\u001bh ")), method92(method91("c\u0005\t\u001bm ")), method92(method91("c\u0005\t\u001bl ")), method92(method91("c\u0005\t\u001bj ")), method92(method91("c\u0005\t\u001b\u0015a\b\u0001A\u0017 ")), method92(method91("f\u0013\u0004Y")), method92(method91("sHF\u001bT")), method92(method91("c\u0005\t\u001bk ")) };

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Lsb;")
    public static class261 field173 = new class261(125, -1);

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZII)I")
    public static final int method86(boolean arg0, int arg1, int arg2) {
        try {
            if (!arg0) {
                method89(-94);
            }
            field172++;
            int var3 = arg2 >>> 24;
            int var4 = 255 - var3;
            int var7 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
            return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var7;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field177[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
    public final void method87(byte arg0) {
        try {
            if (arg0 == 103) {
                field175++;
                OpenGL.glEndList();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field177[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(CB)V")
    public final void method88(char arg0, byte arg1) {
        try {
            if (arg1 != -112) {
                field173 = null;
            }
            field171++;
            OpenGL.glCallList(this.field176 + arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field177[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public static void method89(int arg0) {
        try {
            field173 = null;
            if (arg0 <= 126) {
                method89(51);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field177[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)V")
    public final void method90(int arg0, byte arg1) {
        try {
            field174++;
            if (arg1 <= 58) {
                this.field176 = -9;
            }
            OpenGL.glNewList(this.field176 + arg0, 4864);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field177[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lml;I)V")
    public class13(class194 arg0, int arg1) {
        try {
            this.field176 = OpenGL.glGenLists(arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field177[4] + (arg0 == null ? field177[5] : field177[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method91(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method92(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
