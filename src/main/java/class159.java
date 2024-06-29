import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class159 {

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lra;")
    private class119 field3653 = new class119();

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lv;")
    private static class146 field3644 = method1226((byte) -37, "Loaded update list");

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[Lkf;")
    public static class75[] field3642 = new class75[50];

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lv;")
    public static class146 field3655 = method1226((byte) -37, "blinken3:");

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
    public static int[] field3647 = new int[100];

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field3652 = 0;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lv;")
    public static class146 field3650 = method1226((byte) -37, "(U3");

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Lv;")
    public static class146 field3657 = field3644;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lv;")
    public static class146 field3660 = method1226((byte) -37, "rect_debug=");

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lfc;")
    public static class39 field3661;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILje;B)V")
    public static final void method1225(int arg0, int arg1, int arg2, class67 arg3, byte arg4) {
        if (arg4 != -56) {
            field3642 = null;
        }
        field3643++;
        if (class116.field2696 == arg3 || class13.field208 >= 400) {
            return;
        }
        class146 var5;
        if (arg3.field1500 == 0) {
            var5 = class71.method509(new class146[] { arg3.field1506, class140.method1049(arg3.field1532, arg4 ^ 0xFFFFFFAD, class116.field2696.field1532), class30.field621, class18.field294, class75.method564(false, arg3.field1532), class116.field2718 }, (byte) -83);
        } else {
            var5 = class71.method509(new class146[] { arg3.field1506, class30.field621, class94.field2240, class75.method564(false, arg3.field1500), class116.field2718 }, (byte) -88);
        }
        if (class47.field1087 == 1) {
            class78.field1877++;
            class95.method742(255, 34, arg2, arg1, arg0, class88.field2091, class71.method509(new class146[] { class59.field1359, class52.field1197, var5 }, (byte) 68));
        } else if (!class22.field367) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class95.field2261[var6] != null) {
                    class79.field1905++;
                    boolean var7 = false;
                    short var8 = 0;
                    if (class95.field2261[var6].method1111(class124.field2873, -41)) {
                        if (arg3.field1532 > class116.field2696.field1532) {
                            var8 = 2000;
                        }
                        if (class116.field2696.field1516 != 0 && arg3.field1516 != 0) {
                            if (class116.field2696.field1516 == arg3.field1516) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class136.field3083[var6]) {
                        var8 = 2000;
                    }
                    int var9 = class143.field3272[var6] + var8;
                    class95.method742(arg4 + 311, var9, arg2, arg1, arg0, class95.field2261[var6], class71.method509(new class146[] { class97.field2355, var5 }, (byte) 110));
                }
            }
        } else if ((class142.field3241 & 0x8) == 8) {
            class95.method742(255, 23, arg2, arg1, arg0, class122.field2850, class71.method509(new class146[] { class140.field3206, class52.field1197, var5 }, (byte) -91));
            class24.field381++;
        }
        for (int var10 = 0; var10 < class13.field208; var10++) {
            if (class115.field2671[var10] == 9) {
                class74.field1720[var10] = class71.method509(new class146[] { class97.field2355, var5 }, (byte) -92);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLjava/lang/String;)Lv;")
    public static final class146 method1226(byte arg0, String arg1) {
        field3649++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        if (arg0 != -37) {
            method1226((byte) 47, null);
        }
        class146 var4 = new class146();
        var4.field3365 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3365[var4.field3372++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var4.field3365[var4.field3372++] = (byte) var6;
            }
        }
        var4.method1084((byte) 53);
        return var4.method1109(4096);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method1227(int arg0) {
        field3647 = null;
        field3642 = null;
        if (arg0 != 34) {
            return;
        }
        field3644 = null;
        field3650 = null;
        field3661 = null;
        field3660 = null;
        field3657 = null;
        field3655 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
    public static final int method1228(int arg0, int arg1) {
        field3651++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x73333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 == -12062) {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLra;)V")
    public final void method1229(boolean arg0, class119 arg1) {
        field3658++;
        if (arg1.field2760 != null) {
            arg1.method909((byte) -116);
        }
        arg1.field2765 = this.field3653.field2765;
        arg1.field2760 = this.field3653;
        arg1.field2760.field2765 = arg1;
        if (!arg0) {
            field3647 = null;
        }
        arg1.field2765.field2760 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILra;)V")
    public final void method1230(int arg0, class119 arg1) {
        field3659++;
        if (arg0 != 34) {
            method1225(10, 56, 17, null, (byte) 106);
        }
        if (arg1.field2760 != null) {
            arg1.method909((byte) -108);
        }
        arg1.field2760 = this.field3653.field2760;
        arg1.field2765 = this.field3653;
        arg1.field2760.field2765 = arg1;
        arg1.field2765.field2760 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Lra;")
    public final class119 method1231(boolean arg0) {
        class119 var2 = this.field3653.field2765;
        field3645++;
        if (!arg0) {
            return null;
        } else if (this.field3653 == var2) {
            return null;
        } else {
            var2.method909((byte) -120);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class159() {
        this.field3653.field2765 = this.field3653;
        this.field3653.field2760 = this.field3653;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Lra;")
    public final class119 method1232(byte arg0) {
        class119 var2 = this.field3653.field2765;
        field3641++;
        if (this.field3653 == var2) {
            return null;
        } else if (arg0 >= -91) {
            return null;
        } else {
            return var2;
        }
    }
}
