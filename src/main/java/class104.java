import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class104 {

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public int field1729 = 2;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public int field1726 = -1;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public int field1737 = 64;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
    public boolean field1733 = false;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public int field1735 = 64;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Z")
    public boolean field1738 = false;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public int field1740 = 1;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Lgr;")
    public static class296 field1731 = new class296(13, 2);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Lbu;")
    public static class17 field1727;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lcu;II)V")
    public final void method783(class145 arg0, int arg1, int arg2) {
        if (arg1 != -19832) {
            this.field1737 = -105;
        }
        while (true) {
            int var4 = arg0.method1063((byte) -73);
            if (var4 == 0) {
                field1725++;
                return;
            }
            this.method785(arg2, arg0, var4, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
    public static final void method784(long[] arg0, Object[] arg1, int arg2) {
        class88.method690(arg1, arg0, arg2, arg0.length - 1, arg2 + 1);
        field1739++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILcu;IB)V")
    private final void method785(int arg0, class145 arg1, int arg2, byte arg3) {
        if (arg3 >= -67) {
            return;
        }
        if (arg2 == 1) {
            this.field1726 = arg1.method1069((byte) -49);
            if (this.field1726 == 65535) {
                this.field1726 = -1;
            }
        } else if (arg2 == 2) {
            this.field1735 = arg1.method1069((byte) -107) + 1;
            this.field1737 = arg1.method1069((byte) -39) + 1;
        } else if (arg2 == 3) {
            arg1.method1093(15);
        } else if (arg2 == 4) {
            this.field1729 = arg1.method1063((byte) -54);
        } else if (arg2 == 5) {
            this.field1740 = arg1.method1063((byte) -105);
        } else if (arg2 == 6) {
            this.field1733 = true;
        } else if (arg2 == 7) {
            this.field1738 = true;
        }
        field1730++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static void method786(int arg0) {
        field1727 = null;
        field1731 = null;
        if (arg0 != 2) {
            method787(47, null, null);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILhu;[[B)V")
    public static final void method787(int arg0, class85 arg1, byte[][] arg2) {
        field1732++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class145 var11 = new class145(var10);
                int var12 = class381.field5776[var5] >> 8;
                int var13 = class381.field5776[var5] & 0xFF;
                int var14 = var12 * 64 - class200.field2931;
                int var15 = var13 * 64 - class403.field6059;
                class386.method2389(15804);
                arg1.method73(class141.field2244, var14, class200.field2931, var11, var15, class403.field6059, 0);
                arg1.method655(var3, var15, (byte) -5, var14, var11, class4.field109);
                if (!arg1.field189 && class185.field2771 / 8 == var12 && (class187.field2781 / 8) == var13 && var3[0] != -1) {
                    class381.field5778 = class519.field7721.method1992(var3[3], var3[0], var3[1], -23528, var3[2], class2.field93);
                    class506.field7468 = var3[4];
                }
            }
        }
        if (arg0 != -401286296) {
            field1728 = 111;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class381.field5776[var6] >> 8) * 64 - class200.field2931;
            int var8 = (class381.field5776[var6] & 0xFF) * 64 - class403.field6059;
            byte[] var9 = arg2[var6];
            if (var9 == null && class187.field2781 < 800) {
                class386.method2389(15804);
                arg1.method78(var8, 64, 12449, 64, var7);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method788(String arg0, int arg1) throws ClassNotFoundException {
        field1734++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            int var2 = -127 / ((3 - arg1) / 58);
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lvj;BZ[BIIII)Lmk;")
    public static final class39 method789(class303 arg0, byte arg1, boolean arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field1736++;
        if (arg1 != 82) {
            method787(78, null, null);
        }
        if (!arg0.field4583 && (!class354.method2243(0, arg7) || !class354.method2243(0, arg6))) {
            return arg0.field4538 ? new class39(arg0, 34037, arg5, arg7, arg6, arg2, arg3, arg4) : new class39(arg0, arg5, arg7, arg6, class51.method464(1905326856, arg7), class51.method464(1905326856, arg6), arg3, arg4);
        } else {
            return new class39(arg0, 3553, arg5, arg7, arg6, arg2, arg3, arg4);
        }
    }
}
