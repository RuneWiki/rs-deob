import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class598 extends class561 {

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "Lim;")
    public static class353 field8631;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "Lim;")
    public static class353 field8637;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "[I")
    public static int[] field8640;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "Lim;")
    public static class353 field8639;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "Ljava/lang/String;")
    public String field8634;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "[C")
    public char[] field8629;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "[C")
    public char[] field8633;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "[I")
    public int[] field8630;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "[I")
    public int[] field8635;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    public static void method3441(int arg0) {
        field8639 = null;
        field8631 = null;
        if (arg0 == 512) {
            field8637 = null;
            field8640 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    public final void method3442(int arg0) {
        field8625++;
        if (this.field8635 != null) {
            for (int var2 = 0; var2 < this.field8635.length; var2++) {
                this.field8635[var2] = class292.method1790(this.field8635[var2], 32768);
            }
        }
        if (this.field8630 != null) {
            for (int var3 = 0; var3 < this.field8630.length; var3++) {
                this.field8630[var3] = class292.method1790(this.field8630[var3], 32768);
            }
        }
        if (arg0 != 322) {
            this.method3445('F', (byte) -16);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lge;I)V")
    public final void method3443(class551 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3045(-127);
            if (var3 == 0) {
                field8627++;
                if (arg1 != 512) {
                    this.field8629 = null;
                    return;
                }
                return;
            }
            this.method3447((byte) 110, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IC)I")
    public final int method3444(int arg0, char arg1) {
        field8632++;
        if (this.field8635 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8635.length; var3++) {
            if (this.field8633[var3] == arg1) {
                return this.field8635[var3];
            }
        }
        if (arg0 != -1) {
            this.field8630 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(CB)I")
    public final int method3445(char arg0, byte arg1) {
        field8626++;
        if (this.field8630 == null) {
            return -1;
        }
        if (arg1 != 77) {
            this.field8635 = null;
        }
        for (int var3 = 0; var3 < this.field8630.length; var3++) {
            if (this.field8629[var3] == arg0) {
                return this.field8630[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3446(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8628++;
        if (!arg4 && class460.field6561 == arg1 && class190.field2449 == arg2 && class475.field6698 == class187.field2407 || class501.field6954.method3539(class428.field5845, 2)) {
            return;
        }
        class460.field6561 = arg1;
        class190.field2449 = arg2;
        class475.field6698 = class187.field2407;
        if (class501.field6954.method3539(class428.field5845, 2)) {
            class475.field6698 = 0;
        }
        class597.method3438((byte) 124, arg3);
        class410.method2447(class512.field7135.method2157(class245.field3103, 4074), true, -25375, class522.field7281);
        int var5 = class525.field7310;
        int var6 = class58.field786;
        class525.field7310 = (class460.field6561 - (class139.field1760 >> 4)) * 8;
        class58.field786 = (class190.field2449 - (class369.field5135 >> 4)) * 8;
        class410.field5637 = class614.method3506(class460.field6561 * 8, class190.field2449 * 8);
        class438.field5988 = null;
        if (arg0 != 512) {
            field8631 = null;
        }
        int var7 = class525.field7310 - var5;
        int var8 = class58.field786 - var6;
        if (arg3 == 10) {
            for (int var17 = 0; var17 < class604.field8710; var17++) {
                class480 var30 = class179.field2310[var17];
                if (var30 != null) {
                    class585 var31 = var30.field6729;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field419[var32] -= var7;
                        var31.field417[var32] -= var8;
                    }
                    var31.field6368 -= var8 * 512;
                    var31.field6362 -= var7 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class551.field7652 = 0;
            int var10 = class139.field1760 * 512 - 512;
            int var11 = class369.field5135 * 512 - 512;
            for (int var12 = 0; var12 < class604.field8710; var12++) {
                class480 var13 = class179.field2310[var12];
                if (var13 != null) {
                    class585 var14 = var13.field6729;
                    var14.field6368 -= var8 * 512;
                    var14.field6362 -= var7 * 512;
                    if (var14.field6362 >= 0 && var10 >= var14.field6362 && var14.field6368 >= 0 && var11 >= var14.field6368) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field419[var16] -= var7;
                            var14.field417[var16] -= var8;
                            if (var14.field419[var16] < 0 || class139.field1760 <= var14.field419[var16] || var14.field417[var16] < 0 || class369.field5135 <= var14.field417[var16]) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class286.field3739[class551.field7652++] = var14.field366;
                        } else {
                            var14.method3374(-99, null);
                            var13.method589(arg0 - 9392);
                            var9 = true;
                        }
                    } else {
                        var14.method3374(arg0 - 595, null);
                        var9 = true;
                        var13.method589(-8880);
                    }
                }
            }
            if (var9) {
                class604.field8710 = class131.field1619.method3480(-24064);
                class131.field1619.method3477(class179.field2310, (byte) -101);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class20 var28 = class364.field5092[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field419[var29] -= var7;
                    var28.field417[var29] -= var8;
                }
                var28.field6368 -= var8 * 512;
                var28.field6362 -= var7 * 512;
            }
        }
        class617[] var19 = class610.field8771;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class617 var27 = var19[var20];
            if (var27 != null) {
                var27.field8890 -= var8 * 512;
                var27.field8884 -= var7 * 512;
            }
        }
        for (class596 var21 = (class596) class556.field7781.method3188((byte) -100); var21 != null; var21 = (class596) class556.field7781.method3182((byte) -114)) {
            var21.field8590 -= var8;
            var21.field8595 -= var7;
            if (class403.field5520 != 4 && (var21.field8595 < 0 || var21.field8590 < 0 || class139.field1760 <= var21.field8595 || var21.field8590 >= class369.field5135)) {
                var21.method589(-8880);
            }
        }
        if (class403.field5520 != 4) {
            for (class247 var22 = (class247) class241.field3066.method3473(-27089); var22 != null; var22 = (class247) class241.field3066.method3478((byte) 5)) {
                int var23 = (int) (var22.field1401 & 0x3FFFL);
                int var24 = var23 - class525.field7310;
                int var25 = (int) (var22.field1401 >> 14 & 0x3FFFL);
                int var26 = var25 - class58.field786;
                if (var24 < 0 || var26 < 0 || class139.field1760 <= var24 || class369.field5135 <= var26) {
                    var22.method589(-8880);
                }
            }
        }
        if (class281.field3673 != 0) {
            class64.field868 -= var8;
            class281.field3673 -= var7;
        }
        class181.method1112(false);
        if (arg3 != 10) {
            class6.field58 -= var8;
            class434.field5901 -= var8 * 512;
            class344.field4771 -= var8;
            class351.field4941 -= var7;
            class174.field2248 -= var7;
            class196.field2555 -= var7 * 512;
            if (Math.abs(var7) > class139.field1760 || Math.abs(var8) > class369.field5135) {
                class9.method37(2);
            }
        } else if (class621.field8952 == 4) {
            class21.field301 -= var8 * 512;
            class20.field292 -= var8 * 512;
            class223.field2859 -= var7 * 512;
            class626.field9074 -= var7 * 512;
        } else {
            class621.field8952 = 1;
        }
        class429.method2510((byte) 96);
        class317.method1979((byte) 127);
        class239.field3052.method3178(-8299);
        class196.field2540.method3178(arg0 - 8811);
        class374.field5215.method1874(-24444);
        class645.method3715(true);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLge;I)V")
    private final void method3447(byte arg0, class551 arg1, int arg2) {
        field8624++;
        if (arg2 == 1) {
            this.field8634 = arg1.method3077(-20739);
        } else if (arg2 == 2) {
            int var4 = arg1.method3045(-128);
            this.field8630 = new int[var4];
            this.field8629 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8630[var5] = arg1.method3090(-114);
                byte var6 = arg1.method3051((byte) 72);
                this.field8629[var5] = var6 == 0 ? 0 : class515.method2865(0, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method3045(-128);
            this.field8635 = new int[var7];
            this.field8633 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field8635[var8] = arg1.method3090(-116);
                byte var9 = arg1.method3051((byte) -128);
                this.field8633[var8] = var9 == 0 ? 0 : class515.method2865(0, var9);
            }
        }
        int var10 = -82 % ((-arg0 - 66) / 49);
    }

    static {
        new class344(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field8636 = 0;
        field8631 = new class353(71, 0);
        field8637 = new class353(82, 5);
        field8638 = 0;
        field8640 = new int[] { 16, 32, 64, 128 };
        field8639 = new class353(100, 17);
        field8641 = 0;
    }
}
