import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class102 {

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "Lwd;")
    public static class272 field1058 = new class272(4);

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
    public static int field1059 = 0;

    @OriginalMember(owner = "client!qha", name = "l", descriptor = "S")
    public static short field1060 = 1;

    @OriginalMember(owner = "client!qha", name = "m", descriptor = "I")
    public static int field1061 = 0;

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "[B")
    public static byte[] field1062 = new byte[520];

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "J")
    public static long field1063 = 0L;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "I")
    public static int field1057;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qha", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field1064;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method713(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V", line = 6)
    public static void method704(int arg0) {
        field1058 = null;
        field1062 = null;
        if (arg0 <= 102) {
            field1060 = -80;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IB)V", line = 17)
    public final void method705(int arg0, byte arg1) {
        OpenGL.glNewList(this.field1052 + arg0, 4864);
        int var3 = 50 / ((29 - arg1) / 36);
        field1056++;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIII)Z", line = 30)
    public static final boolean method706(int arg0, int arg1, int arg2, int arg3) {
        field1054++;
        if (arg1 != 8) {
            method707((byte) 17);
        }
        class281 var4 = (class281) class628.method3602(arg0, arg2, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class245.method1486((byte) 105, var4);
        }
        class281 var6 = (class281) class229.method1330(arg0, arg2, arg3, field1064 == null ? (field1064 = method713("wha")) : field1064);
        if (var6 != null) {
            var5 &= class245.method1486((byte) 105, var6);
        }
        class281 var7 = (class281) class199.method1201(arg0, arg2, arg3);
        if (var7 != null) {
            var5 &= class245.method1486((byte) 105, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V", line = 58)
    public static final void method707(byte arg0) {
        field1053++;
        class685.field9675.method3549(0);
        if (arg0 <= 121) {
            field1062 = null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 70)
    public static final String method708(String arg0, int arg1) {
        field1050++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class708.method3965((byte) 122, arg0.charAt(var2))) {
            var2++;
        }
        if (arg1 != -21413) {
            return null;
        }
        while (var2 < var3 && class708.method3965((byte) 122, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class182.method1126(var7, 15555)) {
                char var8 = class28.method144(arg1 ^ 0x53DB, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)Z", line = 125)
    public static final boolean method709(int arg0, int arg1, int arg2) {
        field1051++;
        if (arg2 > -52) {
            return true;
        } else {
            return (arg0 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V", line = 137)
    public static final void method710(int arg0) {
        class629.field9032 = new class327(8);
        field1057++;
        class623.field8920 = arg0;
        for (class257 var1 = (class257) class125.field1310.method2790(116); var1 != null; var1 = (class257) class125.field1310.method2794(87)) {
            var1.method1535();
        }
    }

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V", line = 155)
    public final void method711(int arg0) {
        OpenGL.glEndList();
        if (arg0 == 22972) {
            field1049++;
        }
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lnv;I)V", line = 169)
    public class102(class417 arg0, int arg1) {
        this.field1052 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(CI)V", line = 183)
    public final void method712(char arg0, int arg1) {
        field1055++;
        OpenGL.glCallList(this.field1052 + arg0);
        if (arg1 != 1) {
            field1060 = -54;
        }
    }
}
