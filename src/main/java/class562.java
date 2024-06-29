import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class562 {

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "[I")
    private int[] field7134 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
    public static int field7147 = 0;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "Luw;")
    public static class208 field7146 = new class208(118, 6);

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "Leba;")
    public class691 field7152;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "[I")
    private int[] field7141;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "[S")
    private short[] field7138;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "[S")
    private short[] field7139;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "[S")
    private short[] field7140;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "[S")
    private short[] field7143;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "[[I")
    public static int[][] field7136;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static void method3038(int arg0) {
        field7136 = null;
        if (arg0 == -1) {
            field7146 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lmc;II)V")
    private final void method3039(class234 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            arg0.method1509(true);
        } else if (arg1 == 2) {
            int var4 = arg0.method1509(true);
            this.field7141 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7141[var5] = arg0.method1553((byte) -122);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg0.method1509(true);
                this.field7139 = new short[var6];
                this.field7138 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field7139[var7] = (short) arg0.method1553((byte) -117);
                    this.field7138[var7] = (short) arg0.method1553((byte) -114);
                }
            } else if (arg1 == 41) {
                int var8 = arg0.method1509(true);
                this.field7140 = new short[var8];
                this.field7143 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field7143[var9] = (short) arg0.method1553((byte) -123);
                    this.field7140[var9] = (short) arg0.method1553((byte) -113);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field7134[arg1 - 60] = arg0.method1553((byte) -9);
            }
        }
        field7150++;
        if (arg2 != 27151) {
            this.method3040((byte) -84);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z")
    public final boolean method3040(byte arg0) {
        field7137++;
        if (arg0 != -19) {
            this.field7140 = null;
        }
        boolean var2 = true;
        class30 var3 = this.field7152.field8884;
        synchronized (this.field7152.field8884) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field7134[var4] != -1 && !this.field7152.field8884.method127((byte) 100, this.field7134[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lsi;IIIB)Z")
    public static final boolean method3041(class721 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7153++;
        if (!class750.field10229 || !class141.field1854) {
            return false;
        } else if (class430.field5647 < 100) {
            return false;
        } else if (class334.method1928(arg2, (byte) -73, arg3, arg1)) {
            if (arg4 > -29) {
                method3041(null, -13, 54, 46, (byte) -19);
            }
            int var5 = arg3 << class88.field1221;
            int var6 = arg1 << class88.field1221;
            int var7 = class116.field1542[arg2].method2060(arg1, -94, arg3) - 1;
            int var8 = arg0.method747(15258) + var7;
            if (arg0.field9466 == 1) {
                if (!class239.method1574(23014, var8, var5, var7, var6, class722.field9480 + var6, var8, var5, var6, var5)) {
                    return false;
                } else if (class239.method1574(23014, var8, var5, var7, var6, class722.field9480 + var6, var7, var5, class722.field9480 + var6, var5)) {
                    class700.field9276++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9466 == 2) {
                if (!class239.method1574(23014, var8, var5, var7, var6 + class722.field9480, class722.field9480 + var6, var8, var5, class722.field9480 + var6, class722.field9480 + var5)) {
                    return false;
                } else if (class239.method1574(23014, var7, var5, var7, class722.field9480 + var6, var6 - -class722.field9480, var8, class722.field9480 + var5, class722.field9480 + var6, class722.field9480 + var5)) {
                    class700.field9276++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9466 == 4) {
                if (!class239.method1574(23014, var8, var5 + class722.field9480, var7, var6, class722.field9480 + var6, var8, class722.field9480 + var5, var6, class722.field9480 + var5)) {
                    return false;
                } else if (class239.method1574(23014, var8, var5 + class722.field9480, var7, var6, class722.field9480 + var6, var7, class722.field9480 + var5, class722.field9480 + var6, class722.field9480 + var5)) {
                    class700.field9276++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9466 == 8) {
                if (!class239.method1574(23014, var8, var5, var7, var6, var6, var8, var5, var6, class722.field9480 + var5)) {
                    return false;
                } else if (class239.method1574(23014, var7, var5, var7, var6, var6, var8, var5 + class722.field9480, var6, class722.field9480 + var5)) {
                    class700.field9276++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9466 == 16) {
                if (class726.method3884(var8, class686.field8834, var5, var6 + class686.field8834, var7, -1, class686.field8834)) {
                    class700.field9276++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9466 == 32) {
                if (class726.method3884(var8, class686.field8834, class686.field8834 + var5, var6 - -class686.field8834, var7, -1, class686.field8834)) {
                    class700.field9276++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9466 == 64) {
                if (class726.method3884(var8, class686.field8834, class686.field8834 + var5, var6, var7, -1, class686.field8834)) {
                    class700.field9276++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field9466 != 128) {
                return true;
            } else if (class726.method3884(var8, class686.field8834, var5, var6, var7, -1, class686.field8834)) {
                class700.field9276++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)Lsu;")
    public final class615 method3042(byte arg0) {
        field7144++;
        if (this.field7141 == null) {
            return null;
        }
        class615[] var2 = new class615[this.field7141.length];
        class30 var3 = this.field7152.field8884;
        synchronized (this.field7152.field8884) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field7141.length) {
                    break;
                }
                var2[var4] = class50.method321((byte) -89, 0, this.field7141[var4], this.field7152.field8884);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field7141.length; var5++) {
            if (var2[var5].field7799 < 13) {
                var2[var5].method3288(arg0 ^ 0x3C, 2);
            }
        }
        if (arg0 != 116) {
            return null;
        }
        class615 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class615(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field7139 != null) {
            for (int var7 = 0; var7 < this.field7139.length; var7++) {
                var6.method3286(this.field7139[var7], arg0 ^ 0x74, this.field7138[var7]);
            }
        }
        if (this.field7143 != null) {
            for (int var8 = 0; var8 < this.field7143.length; var8++) {
                var6.method3298(this.field7143[var8], this.field7140[var8], arg0 - 117);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lmc;I)V")
    public final void method3043(class234 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                int var4 = 31 / ((arg1 - 16) / 62);
                field7142++;
                return;
            }
            this.method3039(arg0, var3, 27151);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
    public static final void method3044(int arg0, int arg1) {
        field7151++;
        class507.field6481 = 1000000000L / (long) arg0;
        if (arg1 != 70) {
            method3038(-56);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)Lsu;")
    public final class615 method3045(boolean arg0) {
        field7145++;
        if (!arg0) {
            return null;
        }
        class615[] var2 = new class615[5];
        int var3 = 0;
        class30 var4 = this.field7152.field8884;
        synchronized (this.field7152.field8884) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field7134[var5] != -1) {
                    var2[var3++] = class50.method321((byte) -89, 0, this.field7134[var5], this.field7152.field8884);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7799 < 13) {
                var2[var6].method3288(122, 2);
            }
        }
        class615 var7 = new class615(var2, var3);
        if (this.field7139 != null) {
            for (int var8 = 0; var8 < this.field7139.length; var8++) {
                var7.method3286(this.field7139[var8], 0, this.field7138[var8]);
            }
        }
        if (this.field7143 != null) {
            for (int var9 = 0; var9 < this.field7143.length; var9++) {
                var7.method3298(this.field7143[var9], this.field7140[var9], -1);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z")
    public final boolean method3046(int arg0) {
        field7149++;
        if (this.field7141 == null) {
            return true;
        }
        boolean var2 = true;
        class30 var3 = this.field7152.field8884;
        synchronized (this.field7152.field8884) {
            for (int var4 = arg0; var4 < this.field7141.length; var4++) {
                if (!this.field7152.field8884.method127((byte) 80, this.field7141[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
