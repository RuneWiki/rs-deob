import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Ljava/lang/String;")
    public String field87;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field88 = new String[] { method61(method60("!a-:m")), method61(method60("!a-E,;gwGm")), method61(method60(";{o\u0015")), method61(method60(". -W8")), method61(method60("!a-=m")), method61(method60("!a-;m")), method61(method60("!a-\r*\u0006zq\u0010+2&")), method61(method60("!a-8m")) };

    @OriginalMember(owner = "client!to", name = "c", descriptor = "F")
    public static float field81;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Lmca;")
    public static class33 field79;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field86;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILha;)V", line = 7)
    public static final void method56(int arg0, class66 arg1) {
        try {
            field82++;
            if (class369.field5631) {
                class149.method1262((byte) -118, arg1);
            } else {
                class610.method4510(arg1, false);
            }
            if (arg0 != 1) {
                method59(126);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field88[4] + arg0 + ',' + (arg1 == null ? field88[2] : field88[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 26)
    public static final void method57(int arg0) {
        try {
            field85++;
            if (arg0 == 2 && class747.field10865 != null) {
                if (class747.field10865.field503 == 1) {
                    class747.field10865 = null;
                    return;
                }
                if (class747.field10865.field503 == 2) {
                    class720.method5249(class391.field5889, (byte) 125, 2, class66.field680);
                    class747.field10865 = null;
                    return;
                }
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field88[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)V", line = 55)
    public static final void method58(int arg0, byte arg1, int arg2, int arg3) {
        try {
            field80++;
            if (class647.field9367 != arg3 || class202.field3150 != arg2 || class204.field3165 != arg0) {
                class647.field9367 = arg3;
                class222.field3412 = true;
                class204.field3165 = arg0;
                class202.field3150 = arg2;
                double var4 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
                double var6 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
                double var8 = Math.cos(var6);
                double var10 = Math.sin(var6);
                double var12 = Math.cos(var4);
                double var14 = Math.sin(var4);
                class605.field8865 = var10 * var14;
                class463.field6743 = var14;
                class265.field4050 = var10;
                int var16 = -30 / ((76 - arg1) / 33);
                class671.field9752 = var12;
                class290.field4309 = var8 * var12;
                class11.field136 = 0.0D;
                class382.field5793 = -var10 * var12;
                class178.field2485 = -var8 * var14;
                class369.field5634 = var8;
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field88[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!to", name = "toString", descriptor = "()Ljava/lang/String;", line = 118)
    public final String toString() {
        try {
            field84++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field88[6] + ')');
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V", line = 132)
    public static void method59(int arg0) {
        try {
            field86 = null;
            if (arg0 != 16384) {
                field81 = -0.28819484F;
            }
            field79 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field88[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 144)
    public class8(String arg0, String arg1, int arg2) {
        try {
            this.field83 = arg2;
            this.field87 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field88[1] + (arg0 == null ? field88[2] : field88[3]) + ',' + (arg1 == null ? field88[2] : field88[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!to", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method60(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!to", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method61(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
