import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class149 extends class21 {

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lbm;")
    public static class307 field2443;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 9)
    public static final void method972(int arg0) {
        if (arg0 != 0) {
            method976(-108, 69);
        }
        field2442++;
        for (class164 var1 = (class164) class318.field4798.method424(-53); var1 != null; var1 = (class164) class318.field4798.method425(-32547)) {
            if (var1.field2649 == -1) {
                var1.field2651 = 0;
                class183.method1147((byte) 35, var1);
            } else {
                var1.method278((byte) -105);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 37)
    public class149() {
        super(3, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BJ)V", line = 43)
    public static final void method973(byte arg0, long arg1) {
        if (class135.field2271 == 1 || class135.field2271 == 5) {
            class39.method307(arg1, 21);
        } else if (class135.field2271 == 2) {
            class135.method886((byte) 36);
        } else {
            class313.method2135((byte) 99);
        }
        field2441++;
        if (!class290.field4459) {
            class256.field3998[0] = class103.field1780;
            class169.field2715[0] = class268.field4140;
            class296.field4515[0] = "";
            class120.field2088[0] = 1003;
            class48.field999 = 1;
            if (class15.field273 != 0) {
                class75.field1529 = class276.field4221;
                class189.field3058 = class171.field2764;
            } else if (class187.field3036 == 0) {
                class75.field1529 = class9.field196;
                class189.field3058 = class120.field2083;
            } else {
                class75.field1529 = class72.field1510;
                class189.field3058 = class215.field3441;
            }
        }
        if (class158.field2580 != -1) {
            class130.method858(-1, class158.field2580);
        }
        for (int var3 = 0; var3 < class147.field2401; var3++) {
            if (class337.field5220[var3]) {
                class220.field3490[var3] = true;
            }
            class290.field4453[var3] = class337.field5220[var3];
            class337.field5220[var3] = false;
        }
        class23.field470 = -1;
        class285.field4413 = -1;
        class50.field1011 = class25.field494;
        if (class249.field3893) {
            class33.field660 = true;
        }
        class197.field3168 = null;
        class227.field3595 = null;
        if (class158.field2580 != -1) {
            class147.field2401 = 0;
            class326.method2255(3018);
        }
        if (class249.field3893) {
            class115.method753();
        } else {
            class270.method1810();
        }
        class221.method1471(-30393);
        if (class290.field4459) {
            if (class267.field4117) {
                class286.method1936(-13);
            } else {
                class106.method692(-3);
            }
        } else if (class197.field3168 != null) {
            class72.method556(class197.field3168, class334.field5119, class34.field693, 87);
        } else if (class23.field470 != -1) {
            class72.method556((class68) null, class285.field4413, class23.field470, arg0 + 149);
        }
        int var4 = class290.field4459 ? -1 : class95.method633((byte) 34);
        if (var4 == -1) {
            var4 = class321.field4896;
        }
        class35.method282(var4, (byte) 105);
        if (class62.field1199 == 1) {
            class62.field1199 = 2;
        }
        if (class225.field3555 == 1) {
            class225.field3555 = 2;
        }
        if (class79.field1567 == 3) {
            for (int var5 = 0; var5 < class147.field2401; var5++) {
                if (class290.field4453[var5]) {
                    if (class249.field3893) {
                        class115.method763(class263.field4086[var5], class215.field3444[var5], class77.field1541[var5], class186.field3029[var5], 16711935, 128);
                    } else {
                        class270.method1801(class263.field4086[var5], class215.field3444[var5], class77.field1541[var5], class186.field3029[var5], 16711935, 128);
                    }
                } else if (class220.field3490[var5]) {
                    if (class249.field3893) {
                        class115.method763(class263.field4086[var5], class215.field3444[var5], class77.field1541[var5], class186.field3029[var5], 16711680, 128);
                    } else {
                        class270.method1801(class263.field4086[var5], class215.field3444[var5], class77.field1541[var5], class186.field3029[var5], 16711680, 128);
                    }
                }
            }
        }
        class50.method376(class66.field1265.field1869, class176.field2836, class289.field4438, (byte) 68, class66.field1265.field1872);
        class176.field2836 = 0;
        if (arg0 != -90) {
            method972(126);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILag;)V", line = 202)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg1 == 0) {
            this.field444 = arg2.method1317((byte) -88) == 1;
        }
        if (arg0 != -318) {
            field2443 = (class307) null;
        }
        field2448++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)[[I", line = 215)
    public final int[][] method175(int arg0, byte arg1) {
        field2447++;
        if (arg1 < 16) {
            field2443 = (class307) null;
        }
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int[] var4 = this.method171(2, -74, arg0);
            int[][] var5 = this.method173(0, arg0, (byte) 82);
            int[][] var6 = this.method173(1, arg0, (byte) 56);
            int[] var7 = var3[2];
            int[] var8 = var5[0];
            int[] var9 = var5[1];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var6[0];
            for (int var16 = 0; var16 < class294.field4489; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var10[var16] = var8[var16];
                    var11[var16] = var9[var16];
                    var7[var16] = var12[var16];
                } else if (var17 == 0) {
                    var10[var16] = var15[var16];
                    var11[var16] = var13[var16];
                    var7[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var10[var16] = var8[var16] * var17 + var15[var16] * var18 >> 12;
                    var11[var16] = var9[var16] * var17 + (var13[var16] * var18) >> 12;
                    var7[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[I", line = 297)
    public final int[] method177(int arg0, int arg1) {
        field2449++;
        int[] var3 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[] var4 = this.method171(0, -76, arg1);
            int[] var5 = this.method171(1, 53, arg1);
            int[] var6 = this.method171(2, -82, arg1);
            for (int var7 = 0; var7 < class294.field4489; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        int var9 = -19 / ((arg0 - 33) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V", line = 347)
    public static void method974(boolean arg0) {
        field2443 = null;
        if (arg0) {
            field2443 = (class307) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lbm;II)Ltf;", line = 357)
    public static final class112 method975(class307 arg0, int arg1, int arg2) {
        field2450++;
        if (class148.method966((byte) 102, arg1, arg0)) {
            if (arg2 != 0) {
                field2443 = (class307) null;
            }
            return class228.method1514(arg2 + 3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)I", line = 375)
    public static final int method976(int arg0, int arg1) {
        if (arg1 == -2466) {
            field2445++;
            return arg0 >>> 7;
        } else {
            return 51;
        }
    }
}
