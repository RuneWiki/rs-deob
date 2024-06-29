import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class164 implements class173 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Z")
    private boolean field2478 = false;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    private int field2477 = 50;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lni;")
    private class202 field2481;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "Lni;")
    private class202 field2513;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lwj;")
    private class153 field2493;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Lwj;")
    private class153 field2508;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "[Z")
    private boolean[] field2498;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "[B")
    private byte[] field2485;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "[Z")
    private boolean[] field2483;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[B")
    private byte[] field2479;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[B")
    private byte[] field2482;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "[B")
    private byte[] field2516;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[Z")
    private boolean[] field2484;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "[Z")
    private boolean[] field2505;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[Z")
    private boolean[] field2480;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "[S")
    private short[] field2503;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "[I")
    public static int[] field2500 = new int[32];

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field2486 = 0;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Lbf;")
    public static class209 field2496 = new class209(16);

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "Lma;")
    public static class5 field2514 = class12.method119("compass", (byte) 123);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "Lgh;")
    public static class219 field2511;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 5)
    public static void method1083(byte arg0) {
        field2511 = null;
        field2496 = null;
        field2500 = null;
        field2514 = null;
        if (arg0 >= -64) {
            method1095(69, 90, -55, (byte) -13, -44);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I", line = 27)
    public final int[] method1084(int arg0, int arg1) {
        field2512++;
        if (arg0 == 220) {
            class21 var3 = this.method1094(24524, arg1);
            return var3 == null ? null : var3.method171(this.field2513, this, this.field2478 || this.field2498[arg1], -9);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BZ)V", line = 56)
    public final void method1085(byte arg0, boolean arg1) {
        field2488++;
        this.field2478 = arg1;
        this.method1100((byte) -48);
        if (arg0 <= 107) {
            method1095(89, -20, 53, (byte) -68, 124);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)Z", line = 73)
    public final boolean method1086(int arg0, boolean arg1) {
        field2509++;
        if (arg1) {
            this.method1092(2, 52);
        }
        return this.field2478 || this.field2498[arg0];
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(II)Lhg;", line = 88)
    private final class281 method1087(int arg0, int arg1) {
        field2501++;
        class281 var3 = (class281) this.field2508.method964(-257, (long) arg1);
        if (arg0 != 59) {
            field2511 = (class219) null;
        }
        if (var3 == null) {
            class281 var4 = new class281(this.field2503[arg1] & 0xFFFF);
            this.field2508.method966(var4, (long) arg1, (byte) 73);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(IB)I", line = 106)
    public final int method1088(int arg0, byte arg1) {
        field2515++;
        if (arg1 != -69) {
            this.field2503 = (short[]) null;
        }
        return this.field2503[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(II)V", line = 118)
    public final void method1089(int arg0, int arg1) {
        field2504++;
        for (class21 var3 = (class21) this.field2493.method970(false); var3 != null; var3 = (class21) this.field2493.method963((byte) 55)) {
            if (var3.field368) {
                var3.method176(26, arg1);
                var3.field368 = false;
            }
        }
        if (arg0 != -29209) {
            method1083((byte) 41);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lni;Lni;Lni;IZ)V", line = 479)
    public class164(class202 arg0, class202 arg1, class202 arg2, int arg3, boolean arg4) {
        this.field2481 = arg0;
        this.field2478 = arg4;
        this.field2477 = arg3;
        this.field2513 = arg2;
        this.field2493 = new class153(this.field2477);
        this.field2508 = new class153(this.field2477);
        class221 var6 = new class221(arg1.method1342(-91, 0, 0));
        int var7 = var6.method1524((byte) 61);
        this.field2498 = new boolean[var7];
        this.field2485 = new byte[var7];
        this.field2483 = new boolean[var7];
        this.field2479 = new byte[var7];
        this.field2482 = new byte[var7];
        this.field2516 = new byte[var7];
        this.field2484 = new boolean[var7];
        this.field2505 = new boolean[var7];
        this.field2480 = new boolean[var7];
        this.field2503 = new short[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2505[var8] = var6.method1509(true) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2505[var9]) {
                this.field2483[var9] = var6.method1509(true) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2505[var10]) {
                this.field2484[var10] = var6.method1509(true) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2505[var11]) {
                this.field2498[var11] = var6.method1509(true) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2505[var12]) {
                this.field2480[var12] = var6.method1509(true) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2505[var13]) {
                this.field2479[var13] = var6.method1543(false);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2505[var14]) {
                this.field2516[var14] = var6.method1543(false);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2505[var15]) {
                this.field2482[var15] = var6.method1543(false);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2505[var16]) {
                this.field2485[var16] = var6.method1543(false);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2505[var17]) {
                this.field2503[var17] = (short) var6.method1524((byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(II)Z", line = 148)
    public final boolean method1090(int arg0, int arg1) {
        field2494++;
        if (arg1 != 0) {
            this.method1086(-49, false);
        }
        return this.field2484[arg0];
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(II)I", line = 170)
    public final int method1091(int arg0, int arg1) {
        if (arg0 != 255) {
            this.field2516 = (byte[]) null;
        }
        field2490++;
        return this.field2479[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Z", line = 182)
    public final boolean method1092(int arg0, int arg1) {
        field2507++;
        if (arg0 != -2) {
            this.method1097(9, (byte) 47);
        }
        return this.field2483[arg1];
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(BI)Z", line = 206)
    public final boolean method1093(byte arg0, int arg1) {
        class21 var3 = this.method1094(24524, arg1);
        field2497++;
        if (var3 == null) {
            return false;
        } else {
            if (arg0 != -75) {
                this.method1101((byte) -114, -106);
            }
            return var3.method174(this.field2513, this, false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "(II)Lna;", line = 225)
    private final class21 method1094(int arg0, int arg1) {
        if (arg0 != 24524) {
            this.field2482 = (byte[]) null;
        }
        class21 var3 = (class21) this.field2493.method964(-257, (long) arg1);
        field2476++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2481.method1342(-120, arg1, 0);
        if (var4 == null) {
            return null;
        } else {
            class221 var5 = new class221(var4);
            class21 var6 = new class21(var5);
            this.field2493.method966(var6, (long) arg1, (byte) 73);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIBI)V", line = 255)
    public static final void method1095(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class124.method822(arg1, arg4, arg1 + arg2, arg4 - -arg0);
        class124.method826(arg1, arg4, arg2, arg0, 0);
        int var5 = -50 / ((arg3 + 37) / 61);
        field2495++;
        if (class130.field1948 < 100) {
            return;
        }
        if (class157.field2335 == null || class157.field2335.field3918 != arg2 || class157.field2335.field3914 != arg0) {
            class222 var6 = new class222(arg2, arg0);
            class191.method1254(var6.field3652, arg2, arg0);
            class104.method660(class97.field1460, arg0, 0, 0, 0, class139.field2066, true, 0, arg2);
            class157.field2335 = new class109(var6);
            class191.field2981 = null;
        }
        class157.field2335.method214(arg1, arg4);
        int var7 = class93.field1414 * arg2 / class139.field2066 + arg1;
        int var8 = arg4 + (class270.field4634 * arg0 / class97.field1460);
        int var9 = class62.field973 * arg0 / class97.field1460;
        int var10 = class136.field2017 * arg2 / class139.field2066;
        class124.method830(var7, var8, var10, var9, 16711680, 128);
        class124.method823(var7, var8, var10, var9, 16711680);
        if (class286.field4819 <= 0 || class286.field4819 % 10 >= 5) {
            return;
        }
        for (class260 var11 = (class260) class59.field925.method1475(14); var11 != null; var11 = (class260) class59.field925.method1486(38)) {
            if (class155.field2303 == var11.field4432) {
                int var12 = var11.field4440 * arg0 / class97.field1460 + arg4;
                int var13 = var11.field4427 * arg2 / class139.field2066 + arg1;
                class124.method826(var13 - 2, var12 - 2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 326)
    public static final void method1096(boolean arg0) {
        field2506++;
        if (!arg0) {
            method1096(true);
        }
        if (class154.field2280.toLowerCase().indexOf("microsoft") != -1) {
            class116.field1722[187] = 27;
            class116.field1722[190] = 72;
            class116.field1722[219] = 42;
            class116.field1722[222] = 59;
            class116.field1722[189] = 26;
            class116.field1722[221] = 43;
            class116.field1722[192] = 58;
            class116.field1722[223] = 28;
            class116.field1722[220] = 74;
            class116.field1722[191] = 73;
            class116.field1722[188] = 71;
            class116.field1722[186] = 57;
            return;
        }
        class116.field1722[93] = 43;
        class116.field1722[92] = 74;
        class116.field1722[91] = 42;
        if (class154.field2265 == null) {
            class116.field1722[222] = 59;
            class116.field1722[192] = 58;
        } else {
            class116.field1722[192] = 28;
            class116.field1722[222] = 58;
            class116.field1722[520] = 59;
        }
        class116.field1722[61] = 27;
        class116.field1722[46] = 72;
        class116.field1722[59] = 57;
        class116.field1722[45] = 26;
        class116.field1722[44] = 71;
        class116.field1722[47] = 73;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)I", line = 376)
    public final int method1097(int arg0, byte arg1) {
        if (arg1 != 103) {
            this.field2508 = (class153) null;
        }
        field2489++;
        return this.field2485[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IB)Z", line = 401)
    public final boolean method1098(int arg0, byte arg1) {
        int var3 = 11 % ((arg1 - 30) / 59);
        field2499++;
        return this.field2480[arg0];
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(BI)I", line = 411)
    public final int method1099(byte arg0, int arg1) {
        if (arg0 >= -67) {
            this.field2479 = (byte[]) null;
        }
        field2491++;
        return this.field2482[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V", line = 423)
    public final void method1100(byte arg0) {
        field2492++;
        this.field2493.method971(67);
        this.field2508.method971(39);
        if (arg0 >= -43) {
            this.method1090(-115, 59);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)I", line = 441)
    public final int method1101(byte arg0, int arg1) {
        int var3 = 47 / ((-arg0 - 61) / 43);
        field2487++;
        return this.field2516[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)V", line = 453)
    public final void method1102(int arg0, int arg1) {
        class264.method1814(this.field2482[arg0] & arg1, this.field2485[arg0] & 0xFF, (byte) 58);
        field2510++;
        boolean var3 = false;
        class21 var4 = this.method1094(24524, arg0);
        if (var4 != null) {
            var3 = var4.method173(this.field2478 || this.field2498[arg0], (byte) -107, this, this.field2513);
        }
        if (!var3) {
            class281 var5 = this.method1087(59, arg0);
            var5.method1901(102);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IFI)[I", line = 604)
    public final int[] method1103(int arg0, float arg1, int arg2) {
        field2502++;
        int var4 = 58 / ((arg0 + 40) / 54);
        class21 var5 = this.method1094(24524, arg2);
        if (var5 == null) {
            return null;
        } else {
            var5.field368 = true;
            return var5.method166(this.field2513, -14, arg1, this, this.field2478 || this.field2498[arg2]);
        }
    }
}
