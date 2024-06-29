import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class219 {

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    private int field3787 = 0;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[Lpb;")
    private class235[] field3768;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lsb;")
    public static class98 field3771 = class47.method368("Mitglieder)2Welt", 0);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lsb;")
    public static class98 field3772 = class47.method368("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 0);

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Lsb;")
    private static class98 field3784 = class47.method368("Please wait )2 attempting to reestablish)3", 0);

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Lsb;")
    public static class98 field3781 = field3784;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field3770 = 2301979;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lsb;")
    private static class98 field3773 = class47.method368("Loading wordpack )2 ", 0);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lsb;")
    public static class98 field3766 = field3773;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "J")
    private long field3779;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lpb;")
    private class235 field3765;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Lpb;")
    private class235 field3786;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lhh;")
    public static class38 field3767;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lqh;I)V")
    public static final void method1507(class24 arg0, int arg1) {
        short var2 = 256;
        field3764++;
        for (int var3 = 0; var3 < class47.field784.length; var3++) {
            class47.field784[var3] = 0;
        }
        int var4 = 117 % ((arg1 - 40) / 56);
        for (int var5 = 0; var5 < 5000; var5++) {
            int var17 = (int) (Math.random() * 128.0D * (double) var2);
            class47.field784[var17] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < var2 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = var15 + (var13 << 7);
                    class146.field2565[var16] = (class47.field784[var16 + 128] + class47.field784[var16 - 1] + class47.field784[var16 + -128] + class47.field784[var16 + 1]) / 4;
                }
            }
            int[] var14 = class47.field784;
            class47.field784 = class146.field2565;
            class146.field2565 = var14;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.field3044; var8++) {
            for (int var9 = 0; var9 < arg0.field3038; var9++) {
                if (arg0.field482[var7++] != 0) {
                    int var10 = var9 - (-arg0.field3043 - 16);
                    int var11 = arg0.field3048 + var8 + 16;
                    int var12 = (var11 << 7) + var10;
                    class47.field784[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B[BI)I")
    public static final int method1508(byte arg0, byte[] arg1, int arg2) {
        field3778++;
        if (arg0 > -125) {
            method1509(-20, (class216) null);
        }
        return class146.method1080(arg1, 0, arg2, 255);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILlj;)V")
    public static final void method1509(int arg0, class216 arg1) {
        field3780++;
        while (true) {
            while (arg1.field3706.length > arg1.field3728) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method1446(5350) == 1) {
                    var3 = true;
                    var2 = arg1.method1446(arg0 + 5342);
                    var4 = arg1.method1446(arg0 ^ 0x14EE);
                }
                int var5 = arg1.method1446(5350);
                int var6 = arg1.method1446(arg0 + 5342);
                int var7 = var5 * 64 - class51.field830;
                int var8 = class255.field4470 - (var6 * 64 - (class148.field2743 - 1));
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class140.field2488 && class148.field2743 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && var11 < (var2 * 8 + 8) && var12 >= (var4 * 8) && (var4 * 8 + 8) > var12) {
                                int var13 = arg1.method1446(arg0 ^ 0x14EE);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1446(5350);
                                        if (class75.field1330[var10][var9] == null) {
                                            class75.field1330[var10][var9] = new byte[4096];
                                        }
                                        class75.field1330[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1487(arg0 ^ 0x56);
                                        if (class206.field3516[var10][var9] == null) {
                                            class206.field3516[var10][var9] = new short[4096];
                                        }
                                        class206.field3516[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method1446(5350) & 0xFF << 16) - (-(arg1.method1446(arg0 + 5342) & 0xFF << 8) - (arg1.method1446(5350) & 0xFF));
                                        if (class25.field489[var10][var9] == null) {
                                            class25.field489[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class21 var17 = class125.method929(var16, (byte) -117);
                                        if (var17.field393 != null) {
                                            var17 = var17.method236(0);
                                            if (var17 == null || var17.field427 == -1) {
                                                continue;
                                            }
                                        }
                                        class25.field489[var10][var9][(63 - var12 << 6) + var11] = var17.field404 + 1;
                                        class253 var18 = new class253();
                                        var18.field4428 = var7;
                                        var18.field4435 = var8;
                                        var18.field4429 = var17.field427;
                                        class192.field3322.method376((byte) 13, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1446(arg0 ^ 0x14EE);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3728++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3728 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3728 += 3;
                            }
                        }
                    }
                }
            }
            if (arg0 != 8) {
                method1509(-59, (class216) null);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)I")
    public final int method1510(byte arg0) {
        field3774++;
        int var2 = 43 % ((arg0 + 71) / 54);
        return this.field3785;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BJ)Lpb;")
    public final class235 method1511(byte arg0, long arg1) {
        if (arg0 > -121) {
            method1507((class24) null, 24);
        }
        this.field3779 = arg1;
        class235 var4 = this.field3768[(int) (arg1 & (long) (this.field3785 - 1))];
        this.field3765 = var4.field4069;
        field3776++;
        while (this.field3765 != var4) {
            if (this.field3765.field4061 == arg1) {
                class235 var5 = this.field3765;
                this.field3765 = this.field3765.field4069;
                return var5;
            }
            this.field3765 = this.field3765.field4069;
        }
        this.field3765 = null;
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1512(int arg0) {
        field3772 = null;
        field3767 = null;
        field3784 = null;
        if (arg0 == 4) {
            field3771 = null;
            field3781 = null;
            field3766 = null;
            field3773 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JLpb;I)V")
    public final void method1513(long arg0, class235 arg1, int arg2) {
        field3782++;
        if (arg1.field4067 != null) {
            arg1.method1611((byte) -126);
        }
        class235 var5 = this.field3768[(int) (arg0 & (long) (this.field3785 + arg2))];
        arg1.field4067 = var5.field4067;
        arg1.field4069 = var5;
        arg1.field4061 = arg0;
        arg1.field4067.field4069 = arg1;
        arg1.field4069.field4067 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)Lpb;")
    public final class235 method1514(byte arg0) {
        if (arg0 < 9) {
            field3771 = null;
        }
        this.field3787 = 0;
        field3783++;
        return this.method1515(118);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)Lpb;")
    public final class235 method1515(int arg0) {
        field3769++;
        if (arg0 <= 82) {
            this.field3765 = null;
        }
        if (this.field3787 > 0 && this.field3768[this.field3787 - 1] != this.field3786) {
            class235 var2 = this.field3786;
            this.field3786 = var2.field4069;
            return var2;
        }
        while (this.field3787 < this.field3785) {
            class235 var3 = this.field3768[this.field3787++].field4069;
            if (this.field3768[this.field3787 - 1] != var3) {
                this.field3786 = var3.field4069;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Lpb;")
    public final class235 method1516(int arg0) {
        field3777++;
        if (this.field3765 == null) {
            return null;
        }
        class235 var2 = this.field3768[(int) ((long) (this.field3785 - 1) & this.field3779)];
        while (this.field3765 != var2) {
            if (this.field3765.field4061 == this.field3779) {
                class235 var3 = this.field3765;
                this.field3765 = this.field3765.field4069;
                return var3;
            }
            this.field3765 = this.field3765.field4069;
        }
        this.field3765 = null;
        return arg0 >= -95 ? null : null;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
    public final void method1517(byte arg0) {
        field3775++;
        for (int var2 = 0; var2 < this.field3785; var2++) {
            class235 var3 = this.field3768[var2];
            while (true) {
                class235 var4 = var3.field4069;
                if (var3 == var4) {
                    break;
                }
                var4.method1611((byte) -14);
            }
        }
        this.field3786 = null;
        if (arg0 == -60) {
            this.field3765 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
    public class219(int arg0) {
        this.field3785 = arg0;
        this.field3768 = new class235[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class235 var3 = this.field3768[var2] = new class235();
            var3.field4067 = var3;
            var3.field4069 = var3;
        }
    }
}
