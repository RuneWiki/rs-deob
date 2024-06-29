import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class421 extends class140 {

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "Z")
    public static boolean field6107 = false;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "[C")
    public static char[] field6112 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
    public int field6109;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "Ltc;")
    public static class236 field6113;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "Lvs;")
    public class420 field6111;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "[B")
    public byte[] field6117;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B[BI)I", line = 3)
    public static final int method2599(byte arg0, byte[] arg1, int arg2) {
        ++field6106;
        return arg0 >= -2 ? 7 : class401.method2480(14191, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V", line = 17)
    public static void method2600(byte arg0) {
        field6113 = null;
        field6112 = null;
        if (arg0 != -69) {
            method2599((byte) 43, (byte[]) null, 108);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 28)
    public static final String method2601(boolean arg0, int arg1, int arg2, int arg3) {
        ++field6108;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            if (arg0 && ~arg1 <= -1) {
                int var4 = 2;
                for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                if (arg2 < 74) {
                    return null;
                } else {
                    for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                        int var8 = arg1;
                        arg1 /= arg3;
                        int var9 = -(arg1 * arg3) + var8;
                        if (var9 < 10) {
                            var6[var7] = (char) (var9 + 48);
                        } else {
                            var6[var7] = (char) (var9 + 87);
                        }
                    }
                    return new String(var6);
                }
            } else {
                return Integer.toString(arg1, arg3);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)I", line = 87)
    public final int method864(byte arg0) {
        if (arg0 != 13) {
            method2601(true, -117, 78, -40);
        }
        ++field6110;
        return super.field1861 ? 0 : 100;
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)[B", line = 102)
    public final byte[] method868(int arg0) {
        ++field6114;
        if (super.field1861) {
            throw new RuntimeException();
        } else {
            int var2 = -3 % ((63 - arg0) / 51);
            return this.field6117;
        }
    }

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)J", line = 131)
    public static final long method2602(int arg0) {
        if (arg0 != -1) {
            method2601(true, -99, -13, 34);
        }
        ++field6115;
        return class309.field4144.method985(1);
    }
}
