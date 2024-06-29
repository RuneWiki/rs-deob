import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class146 {

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    private int field2594 = 0;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[Lh;")
    public class249[] field2585;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
    public static int[] field2587 = new int[1000];

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lmb;")
    public static class96 field2590 = class243.method1708("Bitte entfernen Sie ", (byte) 95);

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lmb;")
    public static class96 field2596 = class243.method1708("scrollen:", (byte) 122);

    @OriginalMember(owner = "client!df", name = "y", descriptor = "[I")
    public static int[] field2604 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "J")
    private long field2583;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lh;")
    private class249 field2591;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lh;")
    private class249 field2598;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "[[Z")
    public static boolean[][] field2603;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)Lh;")
    public final class249 method1074(boolean arg0) {
        if (arg0) {
            this.field2583 = -24L;
        }
        field2586++;
        this.field2594 = 0;
        return this.method1087((byte) -93);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method1075(int arg0) {
        field2587 = null;
        field2604 = null;
        field2596 = null;
        field2603 = null;
        field2590 = null;
        int var1 = -102 % ((-arg0 - 21) / 60);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    public static final void method1076(int arg0, int arg1) {
        field2582++;
        if (class101.field1729 == arg1) {
            return;
        }
        if (class101.field1729 == 0) {
            class189.method1334(-14682);
        }
        if (arg0 != 6938) {
            method1082(83, (byte) 13);
        }
        if (arg1 == 40) {
            class128.method974((byte) 50);
        }
        if (arg1 != 40 && class62.field1057 != null) {
            class62.field1057.method1605(arg0 - 7064);
            class62.field1057 = null;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 25 || arg1 == 28) {
            class76.field1310 = 1;
            class152.field2668 = 0;
            class273.field4745 = 0;
            class9.field151 = 0;
            class140.field2508 = 1;
            class10.method80((byte) -48);
        }
        if (arg1 == 25 || arg1 == 10) {
            class162.method1182(arg0 - 6974);
        }
        if (arg1 == 5) {
            class85.method614(class103.field1735, false);
        } else {
            class106.method788(109);
        }
        boolean var3 = class101.field1729 == 5 || class101.field1729 == 10 || class101.field1729 == 28;
        if (var3 != var2) {
            if (var2) {
                class163.field2897 = class134.field2408;
                if (class92.field1525 == 0) {
                    class169.method1214(2, false);
                } else {
                    class277.method1875(class181.field3155, 0, class134.field2408, 255, 2, false, -71);
                }
                class181.field3128.method734(false, arg0 - 6821);
            } else {
                class169.method1214(2, false);
                class181.field3128.method734(true, arg0 - 6874);
            }
        }
        class101.field1729 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lrg;B)V")
    public static final void method1077(class239 arg0, byte arg1) {
        if (arg1 >= -31) {
            method1077((class239) null, (byte) -86);
        }
        while (true) {
            while (arg0.field4124 < arg0.field4144.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1651(4139) == 1) {
                    var2 = true;
                    var3 = arg0.method1651(4139);
                    var4 = arg0.method1651(4139);
                }
                int var5 = arg0.method1651(4139);
                int var6 = arg0.method1651(4139);
                int var7 = var5 * 64 - class179.field3091;
                int var8 = class176.field3068 + field2592 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class140.field2500 && var8 < class176.field3068) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && (var4 * 8) <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method1656(-81);
                                if (var13 != 0) {
                                    if (class38.field653[var9][var10] == null) {
                                        class38.field653[var9][var10] = new byte[4096];
                                    }
                                    class38.field653[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1656(-67);
                                    if (class45.field775[var9][var10] == null) {
                                        class45.field775[var9][var10] = new byte[4096];
                                    }
                                    class45.field775[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1656(-45);
                        if (var16 != 0) {
                            arg0.field4124++;
                        }
                    }
                }
            }
            field2599++;
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)I")
    public final int method1078(int arg0) {
        field2602++;
        if (arg0 != -26661) {
            this.method1081(-113, 52L);
        }
        return this.field2589;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)I")
    public final int method1079(byte arg0) {
        int var2 = 81 / ((arg0 - 19) / 60);
        field2593++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2589; var4++) {
            class249 var5 = this.field2585[var4];
            for (class249 var6 = var5.field4307; var6 != var5; var6 = var6.field4307) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnb;III)V")
    public static final void method1080(class108 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class264.field4614) {
            class187 var4 = class259.field4487[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3279 != null && var4.field3279.field104.method831()) {
                arg0.method832(var4.field3279.field104, 128, 0, 0, true);
            }
        }
        if (arg3 < class264.field4614) {
            class187 var5 = class259.field4487[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3279 != null && var5.field3279.field104.method831()) {
                arg0.method832(var5.field3279.field104, 0, 0, 128, true);
            }
        }
        if (arg2 < class264.field4614 && arg3 < class17.field254) {
            class187 var6 = class259.field4487[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3279 != null && var6.field3279.field104.method831()) {
                arg0.method832(var6.field3279.field104, 128, 0, 128, true);
            }
        }
        if (arg2 < class264.field4614 && arg3 > 0) {
            class187 var7 = class259.field4487[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3279 != null && var7.field3279.field104.method831()) {
                arg0.method832(var7.field3279.field104, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IJ)Lh;")
    public final class249 method1081(int arg0, long arg1) {
        field2581++;
        this.field2583 = arg1;
        class249 var4 = this.field2585[(int) (arg1 & (long) (this.field2589 - 1))];
        if (arg0 != 0) {
            this.method1087((byte) -74);
        }
        for (this.field2591 = var4.field4307; this.field2591 != var4; this.field2591 = this.field2591.field4307) {
            if (this.field2591.field4304 == arg1) {
                class249 var5 = this.field2591;
                this.field2591 = this.field2591.field4307;
                return var5;
            }
        }
        this.field2591 = null;
        return null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)Lve;")
    public static final class183 method1082(int arg0, byte arg1) {
        field2588++;
        class183 var2 = (class183) class241.field4183.method84(-29, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field2892.method23(class36.method284((byte) -101, arg0), 103, class220.method1512(arg0, 84));
        class183 var4 = new class183();
        var4.field3177 = arg0;
        if (var3 != null) {
            var4.method1287(new class239(var3), -1);
        }
        class241.field4183.method88(var4, 16518, (long) arg0);
        int var5 = -57 % ((-arg1 - 47) / 35);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IB)V")
    public static final void method1083(int arg0, byte arg1) {
        class73.field1254--;
        if (arg1 > -81) {
            return;
        }
        field2580++;
        if (class73.field1254 == arg0) {
            return;
        }
        class102.method775(class208.field3586, arg0 + 1, class208.field3586, arg0, class73.field1254 - arg0);
        class102.method775(class192.field3316, arg0 + 1, class192.field3316, arg0, class73.field1254 - arg0);
        class102.method777(class79.field1346, arg0 + 1, class79.field1346, arg0, class73.field1254 - arg0);
        class102.method774(class214.field3687, arg0 + 1, class214.field3687, arg0, class73.field1254 - arg0);
        class102.method776(class53.field927, arg0 + 1, class53.field927, arg0, class73.field1254 - arg0);
        class102.method776(class78.field1329, arg0 + 1, class78.field1329, arg0, class73.field1254 - arg0);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
    public class146(int arg0) {
        this.field2589 = arg0;
        this.field2585 = new class249[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class249 var3 = this.field2585[var2] = new class249();
            var3.field4307 = var3;
            var3.field4302 = var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLrg;)Lci;")
    public static final class165 method1084(boolean arg0, class239 arg1) {
        field2605++;
        if (arg0) {
            field2592 = -56;
        }
        return new class165(arg1.method1627(!arg0), arg1.method1627(!arg0), arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1660(-335289648), arg1.method1651(4139));
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILh;J)V")
    public final void method1085(int arg0, class249 arg1, long arg2) {
        field2584++;
        if (arg1.field4302 != null) {
            arg1.method1743((byte) 93);
        }
        class249 var5 = this.field2585[(int) ((long) (this.field2589 + arg0) & arg2)];
        arg1.field4302 = var5.field4302;
        arg1.field4307 = var5;
        arg1.field4302.field4307 = arg1;
        arg1.field4304 = arg2;
        arg1.field4307.field4302 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Lh;")
    public final class249 method1086(int arg0) {
        field2597++;
        if (this.field2591 == null) {
            return null;
        }
        class249 var2 = this.field2585[(int) (this.field2583 & (long) (this.field2589 - 1))];
        if (arg0 != 8) {
            return null;
        }
        while (this.field2591 != var2) {
            if (this.field2591.field4304 == this.field2583) {
                class249 var3 = this.field2591;
                this.field2591 = this.field2591.field4307;
                return var3;
            }
            this.field2591 = this.field2591.field4307;
        }
        this.field2591 = null;
        return null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Lh;")
    public final class249 method1087(byte arg0) {
        field2595++;
        if (this.field2594 > 0 && this.field2585[this.field2594 - 1] != this.field2598) {
            class249 var2 = this.field2598;
            this.field2598 = var2.field4307;
            return var2;
        }
        while (this.field2594 < this.field2589) {
            class249 var4 = this.field2585[this.field2594++].field4307;
            if (this.field2585[this.field2594 - 1] != var4) {
                this.field2598 = var4.field4307;
                return var4;
            }
        }
        int var3 = 18 / ((arg0 + 21) / 37);
        return null;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public final void method1088(int arg0) {
        int var2 = 0;
        if (arg0 != -63) {
            return;
        }
        while (var2 < this.field2589) {
            class249 var3 = this.field2585[var2];
            while (true) {
                class249 var4 = var3.field4307;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1743((byte) 30);
            }
        }
        this.field2598 = null;
        field2600++;
        this.field2591 = null;
    }
}
