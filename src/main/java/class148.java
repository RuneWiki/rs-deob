import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class148 extends class95 {

    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "Z")
    private boolean field2732 = false;

    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "Z")
    private volatile boolean field2735 = false;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    private int field2721 = -1;

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
    private int field2728;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "Lpg;")
    private class142 field2726;

    @OriginalMember(owner = "client!qd", name = "Bb", descriptor = "Lpg;")
    private class142 field2745;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "Lsg;")
    private static class169 field2725 = class165.method1060("To create a new account you need to", 1536);

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lsg;")
    public static class169 field2716 = field2725;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field2718 = 0;

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "Lsg;")
    public static class169 field2729 = class165.method1060("runes", 1536);

    @OriginalMember(owner = "client!qd", name = "vb", descriptor = "[[I")
    public static int[][] field2739 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2733 = Calendar.getInstance();

    @OriginalMember(owner = "client!qd", name = "Ab", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    private int field2720;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "I")
    private int field2736;

    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!qd", name = "ub", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!qd", name = "wb", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!qd", name = "yb", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!qd", name = "zb", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "Lke;")
    public static class95 field2717;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "[I")
    public static int[] field2719;

    @OriginalMember(owner = "client!qd", name = "xb", descriptor = "[Z")
    private volatile boolean[] field2741;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILqf;)Lsg;")
    public static final class169 method963(int arg0, class150 arg1) {
        ++field2740;
        if (~class44.method278(130551, class70.method436(arg1, -105)) == -1) {
            return null;
        } else if (arg1.field2848 != null && arg1.field2848.method1107(-1).method1134(0) != 0) {
            if (arg0 != 255) {
                method967((byte) -115, (byte[]) null);
            }
            return arg1.field2848;
        } else {
            return class172.field3335 ? class7.field168 : null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lpg;I[BZI)V")
    public final void method964(class142 arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field2738;
        if (this.field2745 == arg0) {
            if (this.field2735) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class106.method621(this.field2720, (byte) 0, (byte) -87, true, 255, this, this.field2728);
                return;
            }
            class179.field3481.reset();
            class179.field3481.update(arg2, 0, arg2.length);
            int var6 = (int) class179.field3481.getValue();
            class127 var7 = new class127(method967((byte) -26, arg2));
            int var8 = var7.method819((byte) 22);
            if (~var8 != -6 && ~var8 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
            }
            int var9 = 0;
            if (var8 >= 6) {
                var9 = var7.method814(8);
            }
            if (this.field2720 != var6 || this.field2736 != var9) {
                class106.method621(this.field2720, (byte) 0, (byte) -87, true, 255, this, this.field2728);
                return;
            }
            this.method555((byte) -36, arg2);
            this.method972(-705);
        } else {
            if (!arg3 && this.field2721 == arg1) {
                this.field2735 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2741[arg1] = false;
                if (this.field2732 || arg3) {
                    class106.method621(super.field1803[arg1], (byte) 2, (byte) -87, arg3, this.field2728, this, arg1);
                }
                return;
            }
            class179.field3481.reset();
            class179.field3481.update(arg2, 0, arg2.length + -2);
            int var10 = (int) class179.field3481.getValue();
            int var11 = ((255 & arg2[arg2.length - 2]) << 8) + (arg2[arg2.length + -1] & 255);
            if (~super.field1803[arg1] != ~var10 || super.field1806[arg1] != var11) {
                this.field2741[arg1] = false;
                if (this.field2732 || arg3) {
                    class106.method621(super.field1803[arg1], (byte) 2, (byte) -87, arg3, this.field2728, this, arg1);
                }
                return;
            }
            this.field2741[arg1] = true;
            if (arg3) {
                super.field1764[arg1] = class111.method687(arg2, 106, false);
            }
        }
        if (arg4 < 123) {
            method963(32, (class150) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(II)I")
    private final int method965(int arg0, int arg1) {
        ++field2730;
        if (super.field1764[arg1] != null) {
            return 100;
        } else {
            if (arg0 >= -63) {
                field2718 = -82;
            }
            return this.field2741[arg1] ? 100 : class169.method1126(-126, arg1, this.field2728);
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(II)V")
    public final void method575(int arg0, int arg1) {
        int var3 = -79 / ((arg1 - -8) / 36);
        if (this.field2726 != null && this.field2741 != null && this.field2741[arg0]) {
            class103.method600(this, this.field2726, arg0, (byte) -118);
        } else {
            class106.method621(super.field1803[arg0], (byte) 2, (byte) -87, true, this.field2728, this, arg0);
        }
        ++field2723;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I")
    public final int method966(int arg0) {
        ++field2734;
        if (this.field2735) {
            return 100;
        } else if (super.field1764 != null) {
            return 99;
        } else {
            int var2 = class169.method1126(-127, this.field2728, 255);
            if (arg0 <= var2) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lpg;Lpg;IZZZ)V")
    public class148(class142 arg0, class142 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2728 = arg2;
        this.field2726 = arg0;
        this.field2745 = arg1;
        this.field2732 = arg5;
        class94.method548(this.field2728, this, 58);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B[B)[B")
    public static final byte[] method967(byte arg0, byte[] arg1) {
        if (arg0 != -26) {
            return null;
        } else {
            class127 var2 = new class127(arg1);
            ++field2722;
            int var3 = var2.method819((byte) 22);
            int var4 = var2.method814(8);
            if (var4 >= 0 && (class206.field4044 == 0 || var4 <= class206.field4044)) {
                if (var3 == 0) {
                    byte[] var7 = new byte[var4];
                    var2.method786(419699672, var4, 0, var7);
                    return var7;
                } else {
                    int var5 = var2.method814(8);
                    if (var5 >= 0 && (class206.field4044 == 0 || class206.field4044 >= var5)) {
                        byte[] var6 = new byte[var5];
                        if (~var3 == -2) {
                            class47.method295(var6, var5, arg1, var4, 9);
                        } else {
                            class140.field2606.method996(var2, arg0 + -32084, var6);
                        }
                        return var6;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BZZIB)V")
    public final void method968(byte[] arg0, boolean arg1, boolean arg2, int arg3, byte arg4) {
        ++field2737;
        if (!arg2) {
            arg0[arg0.length + -2] = (byte) (super.field1806[arg3] >> 8);
            arg0[arg0.length + -1] = (byte) super.field1806[arg3];
            if (this.field2726 != null) {
                class101.method592(arg3, this.field2726, arg0, arg4 ^ 3);
                this.field2741[arg3] = true;
            }
            if (arg1) {
                super.field1764[arg3] = class111.method687(arg0, arg4 + 86, false);
            }
        } else {
            if (this.field2735) {
                throw new RuntimeException();
            }
            if (this.field2745 != null) {
                class101.method592(this.field2728, this.field2745, arg0, 1);
            }
            this.method555((byte) -36, arg0);
            this.method972(arg4 ^ -707);
        }
        if (arg4 != 2) {
            this.method551(44, (byte) 14);
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(III)V")
    public final void method969(int arg0, int arg1, int arg2) {
        if (arg2 != 24657) {
            this.method551(75, (byte) -32);
        }
        this.field2720 = arg1;
        ++field2742;
        this.field2736 = arg0;
        if (this.field2745 != null) {
            class103.method600(this, this.field2745, this.field2728, (byte) 108);
        } else {
            class106.method621(this.field2720, (byte) 0, (byte) -87, true, 255, this, this.field2728);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)I")
    public final int method970(boolean arg0) {
        ++field2724;
        if (!arg0) {
            return 53;
        } else {
            int var2 = 0;
            int var3 = 0;
            for (int var4 = 0; ~super.field1764.length < ~var4; ++var4) {
                if (~super.field1788[var4] < -1) {
                    var3 += this.method965(-95, var4);
                    var2 += 100;
                }
            }
            if (~var2 == -1) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    public static void method971(int arg0) {
        field2729 = null;
        field2719 = null;
        field2717 = null;
        if (arg0 != -1) {
            method971(56);
        }
        field2716 = null;
        field2733 = null;
        field2739 = null;
        field2725 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
    public final void method551(int arg0, byte arg1) {
        ++field2731;
        class5.method34(this.field2728, arg1 + -42, arg0);
        if (arg1 != -87) {
            this.method966(12);
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    private final void method972(int arg0) {
        ++field2727;
        this.field2741 = new boolean[super.field1764.length];
        for (int var2 = 0; this.field2741.length > var2; ++var2) {
            this.field2741[var2] = false;
        }
        if (this.field2726 == null) {
            this.field2735 = true;
        } else {
            this.field2721 = -1;
            if (arg0 != -705) {
                field2716 = null;
            }
            for (int var3 = 0; ~this.field2741.length < ~var3; ++var3) {
                if (~super.field1788[var3] < -1) {
                    class111.method686(this.field2726, arg0 ^ -704, this, var3);
                    this.field2721 = var3;
                }
            }
            if (this.field2721 == -1) {
                this.field2735 = true;
            }
        }
    }
}
