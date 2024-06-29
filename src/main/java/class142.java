import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class142 extends class119 {

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Z")
    public boolean field2684;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "[Lpf;")
    public class142[] field2678;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Lai;")
    private static class10 field2668 = class44.method278("Loading textures )2 ", 118);

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Lai;")
    public static class10 field2667 = field2668;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Lai;")
    public static class10 field2681 = class44.method278("60 Sekunden noch einmal)3)3)3", 107);

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "Lai;")
    public static class10 field2679 = class44.method278("lila:", 95);

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Lai;")
    public static class10 field2688 = class44.method278("Mitglieder)2Welt", -44);

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field2677 = 0;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lpe;")
    public class141 field2666;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "Luc;")
    public class184 field2683;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "[[I")
    public static int[][] field2682;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)I")
    public int method217(int arg0) {
        field2674++;
        int var2 = 95 % ((arg0 - 79) / 32);
        return -1;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public void method80(int arg0) {
        field2672++;
        if (arg0 != -1) {
            this.field2666 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lic;")
    public static final class77 method958(byte arg0, int arg1) {
        field2669++;
        class77 var2 = (class77) class46.field756.method222(-67, (long) arg1);
        if (arg0 > -93) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class99.field1821.method159((byte) 109, arg1, 12);
            class77 var4 = new class77();
            if (var3 != null) {
                var4.method478(-2, new class114(var3));
            }
            var4.method481(-29187);
            class46.field756.method225(-21284, (long) arg1, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(BI)V")
    public static final void method959(byte arg0, int arg1) {
        if (arg0 != 22) {
            return;
        }
        field2676++;
        class25.field387 = null;
        class149.field2872 = 0;
        class6.field76 = -1;
        class75.field1290 = 1;
        class157.field3022 = arg1;
        class122.field2348 = -1;
        class172.field3332 = false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
    public int[][] method86(int arg0, boolean arg1) {
        if (arg1) {
            this.method78(null, 10, (byte) -66);
        }
        field2691++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZI)V")
    public final void method960(int arg0, boolean arg1, int arg2) {
        field2680++;
        if (!arg1) {
            field2681 = null;
        }
        int var4 = this.field2671 == 255 ? arg0 : this.field2671;
        if (this.field2684) {
            this.field2683 = new class184(var4, arg0, arg2);
        } else {
            this.field2666 = new class141(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[[I")
    public final int[][] method961(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            return null;
        }
        field2686++;
        if (!this.field2678[arg1].field2684) {
            return this.field2678[arg1].method86(arg2, false);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field2678[arg1].method6(false, arg2);
        var4[1] = var5;
        var4[0] = var5;
        var4[2] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method962(byte arg0) {
        field2682 = null;
        field2688 = null;
        field2668 = null;
        field2681 = null;
        field2679 = null;
        if (arg0 > -75) {
            method958((byte) 113, 19);
        }
        field2667 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)[I")
    public final int[] method963(byte arg0, int arg1, int arg2) {
        field2665++;
        if (arg0 == -121) {
            return this.field2678[arg1].field2684 ? this.field2678[arg1].method6(false, arg2) : this.field2678[arg1].method86(arg2, false)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLai;)V")
    public static final void method964(boolean arg0, class10 arg1) {
        field2689++;
        if (class111.field2057 >= 2) {
            if (arg1.method70((byte) 107, class9.field100)) {
                System.gc();
            }
            if (arg1.method70((byte) 103, class200.field3817)) {
                class175.method1145(-1);
            }
            if (arg1.method70((byte) 116, class78.field1385)) {
                class123.field2358 = true;
            }
            if (arg1.method70((byte) 118, class28.field421)) {
                class123.field2358 = false;
            }
            if (arg1.method70((byte) 127, class77.field1353)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class58.field1022[var2].field1852[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method70((byte) 109, class192.field3660) && class128.field2427 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method36((byte) 69, class203.field3966)) {
                class93.field1682 = arg1.method52((byte) -118, 12).method68(-49).method55((byte) -66);
                class6.method20(0, class67.method440(0, new class10[] { class121.field2321, class119.method846(0, class93.field1682) }), (byte) 117, null);
            }
            if (arg1.method70((byte) 122, class124.field2371)) {
                class206.field4004 = true;
            }
        }
        class76.field1323.method635((byte) -103, 251);
        class30.field462++;
        class76.field1323.method781(0, arg1.method40((byte) 122) - 1);
        if (!arg0) {
            field2668 = null;
        }
        class76.field1323.method769(0, arg1.method52((byte) -118, 2));
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public final void method965(int arg0) {
        if (arg0 != -104) {
            this.method960(-122, false, -107);
        }
        field2687++;
        if (this.field2684) {
            this.field2683.method1188(127);
            this.field2683 = null;
        } else {
            this.field2666.method955(-974755577);
            this.field2666 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lme;IB)V")
    public void method78(class114 arg0, int arg1, byte arg2) {
        field2690++;
        if (arg2 >= -34) {
            field2688 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
    public int method966(byte arg0) {
        field2685++;
        if (arg0 <= 70) {
            field2679 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)[I")
    public int[] method6(boolean arg0, int arg1) {
        field2675++;
        if (arg0) {
            field2681 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IZ)V")
    public class142(int arg0, boolean arg1) {
        this.field2684 = arg1;
        this.field2678 = new class142[arg0];
    }
}
