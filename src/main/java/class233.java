import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class233 extends class303 {

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3686 = new String[5];

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field3697 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "Lrb;")
    public static class221 field3694;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)[[I", line = 8)
    public final int[][] method74(int arg0, int arg1) {
        field3688++;
        int[][] var3 = this.field4772.method1175(-122, arg0);
        if (arg1 != 82) {
            this.method65(-10, (class101) null, -16);
        }
        if (this.field4772.field2488) {
            int[][] var4 = this.method2106(arg0, 0, arg1 + 20);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class70.field1108; var11++) {
                var8[var11] = 4096 - var6[var11];
                var7[var11] = 4096 - var9[var11];
                var10[var11] = 4096 - var5[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 59)
    public class233() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V", line = 67)
    public static void method1679(int arg0) {
        field3697 = null;
        field3694 = null;
        if (arg0 != 0) {
            method1683(-70, 115, (class292[]) null);
        }
        field3686 = null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)[I", line = 80)
    public final int[] method67(int arg0, int arg1) {
        field3690++;
        int[] var3 = this.field4763.method394(arg0 + 3, arg1);
        if (arg0 != -3) {
            return (int[]) null;
        }
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1, 0, 0);
            for (int var5 = 0; var5 < class70.field1108; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V", line = 120)
    public static final void method1680(byte arg0) {
        class251.field3871 = null;
        class246.field3811 = null;
        class3.field14 = null;
        class108.field1797 = null;
        field3685++;
        if (arg0 != -12) {
            field3692 = -30;
        }
        class62.field962 = null;
        class270.field4198 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I", line = 142)
    public static final int method1681(int arg0, byte arg1) {
        field3687++;
        if (class127.field2032 != null) {
            class127.field2032.method131(-11918);
            class127.field2032 = null;
        }
        class206.field3256++;
        if (class206.field3256 > 4) {
            class285.field4383 = 0;
            class206.field3256 = 0;
            return arg0;
        } else if (arg1 > -95) {
            return 6;
        } else {
            if (class56.field891 == class250.field3860) {
                class56.field891 = class235.field3704;
            } else {
                class56.field891 = class250.field3860;
            }
            class285.field4383 = 0;
            return -1;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILpe;I)V", line = 177)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4773 = arg1.method741(58) == 1;
        }
        field3695++;
        if (arg0 != -4004) {
            field3686 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIBII)V", line = 191)
    public static final void method1682(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3693++;
        class327.field5067[0].method1526(arg2, arg4);
        int var6 = (arg1 - 32) * arg1 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = 5 / ((56 - arg3) / 41);
        class327.field5067[1].method1526(arg2, arg1 + arg4 - 16);
        int var8 = (arg1 - var6 - 32) * arg5 / (arg0 - arg1);
        if (!class265.field4126) {
            class182.method1360(arg2, arg4 + 16, 16, arg1 - 32, class8.field126);
            class182.method1360(arg2, arg4 + var8 + 16, 16, var6, class141.field2245);
            class182.method1366(arg2, var8 + arg4 + 16, var6, class151.field2429);
            class182.method1366(arg2 + 1, arg4 + 16 + var8, var6, class151.field2429);
            class182.method1350(arg2, var8 + arg4 + 16, 16, class151.field2429);
            class182.method1350(arg2, arg4 + var8 + 17, 16, class151.field2429);
            class182.method1366(arg2 + 15, arg4 + var8 - -16, var6, class197.field3128);
            class182.method1366(arg2 + 14, arg4 + var8 - -17, var6 - 1, class197.field3128);
            class182.method1350(arg2, var6 + arg4 + var8 + 15, 16, class197.field3128);
            class182.method1350(arg2 + 1, arg4 + var6 + 14 - -var8, 15, class197.field3128);
            return;
        }
        class262.method1855(arg2, arg4 + 16, 16, arg1 - 32, class8.field126);
        class262.method1855(arg2, arg4 + var8 + 16, 16, var6, class141.field2245);
        class262.method1857(arg2, arg4 + var8 + 16, var6, class151.field2429);
        class262.method1857(arg2 + 1, var8 + 16 + arg4, var6, class151.field2429);
        class262.method1856(arg2, var8 + arg4 + 16, 16, class151.field2429);
        class262.method1856(arg2, arg4 + var8 + 17, 16, class151.field2429);
        class262.method1857(arg2 + 15, arg4 + var8 + 16, var6, class197.field3128);
        class262.method1857(arg2 + 14, var8 + 17 + arg4, var6 - 1, class197.field3128);
        class262.method1856(arg2, arg4 + 15 - (-var6 - var8), 16, class197.field3128);
        class262.method1856(arg2 + 1, arg4 + 14 + var8 + var6, 15, class197.field3128);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II[Lob;)V", line = 238)
    public static final void method1683(int arg0, int arg1, class292[] arg2) {
        for (int var3 = arg0; var3 < arg2.length; var3++) {
            class292 var4 = arg2[var3];
            if (var4 != null && var4.field4587 == arg1 && (!var4.field4537 || !client.method1790(var4))) {
                if (var4.field4490 == 0) {
                    if (!var4.field4537 && client.method1790(var4) && class193.field3076 != var4) {
                        continue;
                    }
                    method1683(0, var4.field4531, arg2);
                    if (var4.field4553 != null) {
                        method1683(arg0 ^ 0x0, var4.field4531, var4.field4553);
                    }
                    class224 var5 = (class224) class268.field4148.method833(false, (long) var4.field4531);
                    if (var5 != null) {
                        class316.method2176((byte) -99, var5.field3596);
                    }
                }
                if (var4.field4490 == 6) {
                    if (var4.field4471 != -1 || var4.field4520 != -1) {
                        boolean var6 = class123.method932(56, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4520;
                        } else {
                            var7 = var4.field4471;
                        }
                        if (var7 != -1) {
                            class269 var8 = class6.method28(var7, arg0 ^ 0x2);
                            if (var8 != null) {
                                var4.field4565 += class122.field1952;
                                while (var8.field4165[var4.field4479] < var4.field4565) {
                                    var4.field4565 -= var8.field4165[var4.field4479];
                                    var4.field4479++;
                                    if (var8.field4183.length <= var4.field4479) {
                                        var4.field4479 -= var8.field4174;
                                        if (var4.field4479 < 0 || var4.field4479 >= var8.field4183.length) {
                                            var4.field4479 = 0;
                                        }
                                    }
                                    var4.field4484 = var4.field4479 + 1;
                                    if (var8.field4183.length <= var4.field4484) {
                                        var4.field4484 -= var8.field4174;
                                        if (var4.field4484 < 0 || var4.field4484 >= var8.field4183.length) {
                                            var4.field4484 = -1;
                                        }
                                    }
                                    class143.method1091(var4, (byte) 122);
                                }
                            }
                        }
                    }
                    if (var4.field4517 != 0 && !var4.field4537) {
                        int var9 = var4.field4517 << 16 >> 16;
                        int var10 = var4.field4517 >> 16;
                        int var11 = class122.field1952 * var10;
                        int var12 = class122.field1952 * var9;
                        var4.field4511 = var4.field4511 + var12 & 0x7FF;
                        var4.field4509 = var4.field4509 + var11 & 0x7FF;
                        class143.method1091(var4, (byte) 40);
                    }
                }
            }
        }
        field3689++;
    }
}
