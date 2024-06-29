import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class188 extends class196 {

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public int field3571 = -1;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public int field3575 = 1;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Z")
    public boolean field3565 = false;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    private int field3572 = 0;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    private int field3585 = 128;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "[Lai;")
    public class10[] field3577 = new class10[5];

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Z")
    public boolean field3561 = true;

    @OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
    private int field3591 = -1;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public int field3566 = -1;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    private int field3570 = -1;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public int field3563 = -1;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "Lai;")
    public class10 field3569 = class28.field418;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public int field3581 = -1;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "Z")
    public boolean field3583 = true;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public int field3568 = -1;

    @OriginalMember(owner = "client!ug", name = "pb", descriptor = "I")
    public int field3599 = -1;

    @OriginalMember(owner = "client!ug", name = "qb", descriptor = "I")
    private int field3600 = 0;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public int field3567 = -1;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
    public int field3587 = 32;

    @OriginalMember(owner = "client!ug", name = "ob", descriptor = "I")
    public int field3598 = -1;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public int field3586 = -1;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    private int field3573 = 128;

    @OriginalMember(owner = "client!ug", name = "sb", descriptor = "Z")
    public boolean field3602 = true;

    @OriginalMember(owner = "client!ug", name = "ib", descriptor = "Lai;")
    private static class10 field3592 = class44.method278("Loading config )2 ", -42);

    @OriginalMember(owner = "client!ug", name = "nb", descriptor = "Lai;")
    public static class10 field3597 = field3592;

    @OriginalMember(owner = "client!ug", name = "kb", descriptor = "Lai;")
    private static class10 field3594 = class44.method278("button near the top of that page)3", -109);

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Lai;")
    public static class10 field3558 = field3594;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "Lai;")
    public static class10 field3559 = class44.method278("Konfig geladen)3", -105);

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    public static int field3588 = 0;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ug", name = "lb", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!ug", name = "jb", descriptor = "Lk;")
    public static class91 field3593;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "[I")
    private int[] field3580;

    @OriginalMember(owner = "client!ug", name = "mb", descriptor = "[I")
    public int[] field3596;

    @OriginalMember(owner = "client!ug", name = "rb", descriptor = "[I")
    private int[] field3601;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "[S")
    private short[] field3562;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "[S")
    private short[] field3564;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "[S")
    private short[] field3578;

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "[S")
    private short[] field3589;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILme;)V")
    public final void method1201(int arg0, class114 arg1) {
        field3590++;
        while (true) {
            int var3 = arg1.method767(true);
            if (var3 == 0) {
                if (arg0 == 5) {
                    return;
                } else {
                    this.field3596 = null;
                    return;
                }
            }
            this.method1202(arg0 ^ 0x4, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILme;I)V")
    private final void method1202(int arg0, class114 arg1, int arg2) {
        field3584++;
        if (arg2 == 1) {
            int var12 = arg1.method767(true);
            this.field3580 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3580[var13] = arg1.method762((byte) 102);
            }
        } else if (arg2 == 2) {
            this.field3569 = arg1.method764((byte) -126);
        } else if (arg2 == 12) {
            this.field3575 = arg1.method767(true);
        } else if (arg2 == 13) {
            this.field3566 = arg1.method762((byte) 122);
        } else if (arg2 == 14) {
            this.field3586 = arg1.method762((byte) 97);
        } else if (arg2 == 15) {
            this.field3599 = arg1.method762((byte) 80);
        } else if (arg2 == 16) {
            this.field3598 = arg1.method762((byte) 109);
        } else if (arg2 == 17) {
            this.field3586 = arg1.method762((byte) 87);
            this.field3581 = arg1.method762((byte) 104);
            this.field3568 = arg1.method762((byte) 83);
            this.field3563 = arg1.method762((byte) 102);
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field3577[arg2 - 30] = arg1.method764((byte) 81);
            if (this.field3577[arg2 - 30].method70((byte) 98, class155.field3011)) {
                this.field3577[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var10 = arg1.method767(true);
            this.field3564 = new short[var10];
            this.field3562 = new short[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3562[var11] = (short) arg1.method762((byte) 115);
                this.field3564[var11] = (short) arg1.method762((byte) 105);
            }
        } else if (arg2 == 41) {
            int var8 = arg1.method767(true);
            this.field3578 = new short[var8];
            this.field3589 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3578[var9] = (short) arg1.method762((byte) 80);
                this.field3589[var9] = (short) arg1.method762((byte) 98);
            }
        } else if (arg2 == 60) {
            int var6 = arg1.method767(true);
            this.field3601 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3601[var7] = arg1.method762((byte) 125);
            }
        } else if (arg2 == 93) {
            this.field3561 = false;
        } else if (arg2 == 95) {
            this.field3567 = arg1.method762((byte) 102);
        } else if (arg2 == 97) {
            this.field3573 = arg1.method762((byte) 88);
        } else if (arg2 == 98) {
            this.field3585 = arg1.method762((byte) 115);
        } else if (arg2 == 99) {
            this.field3565 = true;
        } else if (arg2 == 100) {
            this.field3572 = arg1.method759((byte) 127);
        } else if (arg2 == 101) {
            this.field3600 = arg1.method759((byte) 127) * 5;
        } else if (arg2 == 102) {
            this.field3571 = arg1.method762((byte) 77);
        } else if (arg2 == 103) {
            this.field3587 = arg1.method762((byte) 83);
        } else if (arg2 == 106) {
            this.field3570 = arg1.method762((byte) 75);
            if (this.field3570 == 65535) {
                this.field3570 = -1;
            }
            this.field3591 = arg1.method762((byte) 115);
            if (this.field3591 == 65535) {
                this.field3591 = -1;
            }
            int var4 = arg1.method767(true);
            this.field3596 = new int[var4 + 1];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3596[var5] = arg1.method762((byte) 99);
                if (this.field3596[var5] == 65535) {
                    this.field3596[var5] = -1;
                }
            }
        } else if (arg2 == 107) {
            this.field3602 = false;
        } else if (arg2 == 109) {
            this.field3583 = false;
        } else if (arg2 != 111) {
            if (arg2 == 113) {
                arg1.method762((byte) 93);
                arg1.method762((byte) 110);
            } else if (arg2 == 114) {
                arg1.method759((byte) 127);
                arg1.method759((byte) 127);
            }
        }
        if (arg0 != 1) {
            this.method1208((byte) -65);
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)V")
    public static void method1203(boolean arg0) {
        field3593 = null;
        field3559 = null;
        if (!arg0) {
            field3592 = null;
            field3594 = null;
            field3558 = null;
            field3597 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)Z")
    public final boolean method1204(int arg0) {
        field3560++;
        if (this.field3596 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field3570 != -1) {
            var2 = class207.method1336((byte) 126, this.field3570);
        } else if (this.field3591 != -1) {
            var2 = class13.field215[this.field3591];
        }
        if (var2 < 0 || var2 >= this.field3596.length || this.field3596[var2] == -1) {
            return false;
        } else {
            if (arg0 != 3089) {
                this.method1207(null, -18, -91, null, -32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILic;I)Lsa;")
    public final class164 method1205(int arg0, class77 arg1, int arg2) {
        field3576++;
        if (this.field3596 != null) {
            class188 var4 = this.method1208((byte) -105);
            return var4 == null ? null : var4.method1205(126, arg1, arg2);
        } else if (arg0 <= 125) {
            return null;
        } else if (this.field3601 == null) {
            return null;
        } else {
            class164 var5 = (class164) class149.field2865.method222(113, (long) this.field3595);
            if (var5 == null) {
                boolean var6 = false;
                for (int var7 = 0; var7 < this.field3601.length; var7++) {
                    if (!class201.field3942.method150(0, this.field3601[var7], -69)) {
                        var6 = true;
                    }
                }
                if (var6) {
                    return null;
                }
                class112[] var8 = new class112[this.field3601.length];
                for (int var9 = 0; var9 < this.field3601.length; var9++) {
                    var8[var9] = class112.method729(class201.field3942, this.field3601[var9], 0);
                }
                class112 var10;
                if (var8.length == 1) {
                    var10 = var8[0];
                } else {
                    var10 = new class112(var8, var8.length);
                }
                if (this.field3562 != null) {
                    for (int var11 = 0; var11 < this.field3562.length; var11++) {
                        var10.method736(this.field3562[var11], this.field3564[var11]);
                    }
                }
                if (this.field3578 != null) {
                    for (int var12 = 0; var12 < this.field3578.length; var12++) {
                        var10.method740(this.field3578[var12], this.field3589[var12]);
                    }
                }
                var5 = var10.method734(64, 768, -50, -10, -50, true, true);
                class149.field2865.method225(-21284, (long) this.field3595, var5);
            }
            if (arg1 != null) {
                var5 = arg1.method477((byte) -102, var5, arg2);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public final void method1206(byte arg0) {
        int var2 = -52 % ((arg0 - 42) / 35);
        field3579++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lic;IILic;I)Lsa;")
    public final class164 method1207(class77 arg0, int arg1, int arg2, class77 arg3, int arg4) {
        field3574++;
        if (this.field3596 != null) {
            class188 var6 = this.method1208((byte) 100);
            return var6 == null ? null : var6.method1207(arg0, arg1, 86, arg3, arg4);
        }
        if (arg2 < 72) {
            field3594 = null;
        }
        class164 var7 = (class164) class146.field2789.method222(1, (long) this.field3595);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field3580.length; var9++) {
                if (!class201.field3942.method150(0, this.field3580[var9], -90)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class112[] var10 = new class112[this.field3580.length];
            for (int var11 = 0; var11 < this.field3580.length; var11++) {
                var10[var11] = class112.method729(class201.field3942, this.field3580[var11], 0);
            }
            class112 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class112(var10, var10.length);
            }
            if (this.field3562 != null) {
                for (int var13 = 0; var13 < this.field3562.length; var13++) {
                    var12.method736(this.field3562[var13], this.field3564[var13]);
                }
            }
            if (this.field3578 != null) {
                for (int var14 = 0; var14 < this.field3578.length; var14++) {
                    var12.method740(this.field3578[var14], this.field3589[var14]);
                }
            }
            var7 = var12.method734(this.field3572 + 64, this.field3600 + 850, -30, -50, -30, true, true);
            class146.field2789.method225(-21284, (long) this.field3595, var7);
        }
        class164 var15;
        if (arg3 != null && arg0 != null) {
            var15 = arg3.method475(var7, arg0, arg4, 4, arg1);
        } else if (arg3 != null) {
            var15 = arg3.method476((byte) -34, var7, arg1);
        } else if (arg0 == null) {
            var15 = var7.method1088(true);
        } else {
            var15 = arg0.method476((byte) -34, var7, arg4);
        }
        if (this.field3573 != 128 || this.field3585 != 128) {
            var15.method1090(this.field3573, this.field3585, this.field3573);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)Lug;")
    public final class188 method1208(byte arg0) {
        int var2 = 84 % ((-arg0 - 32) / 58);
        int var3 = -1;
        if (this.field3570 != -1) {
            var3 = class207.method1336((byte) 84, this.field3570);
        } else if (this.field3591 != -1) {
            var3 = class13.field215[this.field3591];
        }
        field3582++;
        return var3 < 0 || this.field3596.length <= var3 || this.field3596[var3] == -1 ? null : class129.method900((byte) 56, this.field3596[var3]);
    }
}
