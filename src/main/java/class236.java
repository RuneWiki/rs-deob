import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class236 {

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    private int field3850 = -1;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    private int field3856 = 0;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3845 = "Select";

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3842 = 0;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Z")
    public static boolean field3851 = true;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lj;")
    public static class165 field3855;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[I")
    public static int[] field3847;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    private final void method1639(int arg0, int arg1) {
        field3853++;
        double var3 = (double) ((arg0 & 0xFFB180) >> 16) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 < var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var9) {
            var9 = var5;
        }
        if (arg1 != 20511) {
            this.field3844 = 99;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 > var7) {
            var11 = var7;
        }
        if (var11 > var5) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field3841 = (int) (var17 * 256.0D);
        if (this.field3841 < 0) {
            this.field3841 = 0;
        } else if (this.field3841 > 255) {
            this.field3841 = 255;
        }
        if (var9 != var11) {
            if (var3 == var9) {
                var13 = (var7 - var5) / (var9 - var11);
            } else if (var7 == var9) {
                var13 = (var5 - var3) / (var9 - var11) + 2.0D;
            } else if (var5 == var9) {
                var13 = (var3 - var7) / (var9 - var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        double var19 = var13 / 6.0D;
        this.field3849 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field3844 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3844 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3844 < 1) {
            this.field3844 = 1;
        }
        this.field3854 = (int) ((double) this.field3844 * var19);
        if (this.field3849 < 0) {
            this.field3849 = 0;
        } else if (this.field3849 > 255) {
            this.field3849 = 255;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Log;IB)V")
    public final void method1640(class221 arg0, int arg1, byte arg2) {
        field3843++;
        if (arg2 >= -96) {
            this.field3841 = -15;
        }
        while (true) {
            int var4 = arg0.method1517((byte) -96);
            if (var4 == 0) {
                return;
            }
            this.method1643(-5383, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method1641(boolean arg0) {
        field3847 = null;
        field3855 = null;
        if (arg0) {
            field3845 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZIJII)Ljava/lang/String;")
    public static final String method1642(boolean arg0, int arg1, long arg2, int arg3, int arg4) {
        char var6 = '.';
        char var7 = ',';
        if (arg3 == 0) {
            var7 = '.';
            var6 = ',';
        }
        field3848++;
        boolean var8 = false;
        if (arg2 < 0L) {
            var8 = true;
            arg2 = -arg2;
        }
        if (arg3 == 2) {
            var6 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var7);
        }
        if (arg1 != 10) {
            return null;
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg2 * 10));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILog;I)V")
    private final void method1643(int arg0, int arg1, class221 arg2, int arg3) {
        if (arg1 == 1) {
            this.field3856 = arg2.method1531(65280);
            this.method1639(this.field3856, 20511);
        } else if (arg1 == 2) {
            this.field3850 = arg2.method1521((byte) 113);
            if (this.field3850 == 65535) {
                this.field3850 = -1;
            }
        } else if (arg1 == 3) {
            arg2.method1521((byte) 113);
        }
        if (arg0 != -5383) {
            this.method1639(-93, -85);
        }
        field3852++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lqh;Lqh;I)V")
    public static final void method1644(class201 arg0, class201 arg1, int arg2) {
        class158.field2555 = class154.method1071(arg1, arg0, 0, -10727, class29.field472);
        class48.field865 = (class104) class158.field2555;
        class184.field2892 = class154.method1071(arg1, arg0, 0, -10727, class209.field3426);
        class262.field4165 = class154.method1071(arg1, arg0, 0, -10727, class53.field917);
        field3846++;
        if (arg2 != -16789) {
            field3842 = 73;
        }
    }
}
