import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class655 {

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "Z")
    public boolean field9190 = true;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
    public int field9199 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
    public int field9206 = -1;

    @OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
    private int field9208 = -1;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public int field9193 = -1;

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "I")
    public int field9215 = -1;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
    public int field9198 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kca", name = "D", descriptor = "I")
    private int field9216 = -1;

    @OriginalMember(owner = "client!kca", name = "M", descriptor = "Z")
    public boolean field9224 = true;

    @OriginalMember(owner = "client!kca", name = "I", descriptor = "Z")
    public boolean field9220 = true;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "[Ljava/lang/String;")
    public String[] field9201 = new String[5];

    @OriginalMember(owner = "client!kca", name = "O", descriptor = "I")
    public int field9226 = -1;

    @OriginalMember(owner = "client!kca", name = "K", descriptor = "Z")
    public boolean field9222 = false;

    @OriginalMember(owner = "client!kca", name = "N", descriptor = "I")
    private int field9225 = -1;

    @OriginalMember(owner = "client!kca", name = "R", descriptor = "I")
    public int field9229 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    private int field9203 = -1;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
    public int field9204 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kca", name = "Q", descriptor = "I")
    private int field9228 = -1;

    @OriginalMember(owner = "client!kca", name = "S", descriptor = "I")
    public int field9230 = 0;

    @OriginalMember(owner = "client!kca", name = "u", descriptor = "Lpa;")
    public static class648 field9207 = new class648();

    @OriginalMember(owner = "client!kca", name = "T", descriptor = "Lib;")
    public static class14 field9231 = new class14(1, 2);

    @OriginalMember(owner = "client!kca", name = "U", descriptor = "Lcq;")
    public static class110 field9232 = new class110(2, 6);

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public int field9187;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    private int field9188;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public int field9191;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    private int field9192;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    private int field9195;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    private int field9196;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    public int field9202;

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!kca", name = "w", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!kca", name = "x", descriptor = "I")
    public int field9210;

    @OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
    public int field9211;

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!kca", name = "G", descriptor = "I")
    public int field9218;

    @OriginalMember(owner = "client!kca", name = "J", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!kca", name = "P", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Lfq;")
    public class122 field9189;

    @OriginalMember(owner = "client!kca", name = "L", descriptor = "Lwa;")
    private class661 field9223;

    @OriginalMember(owner = "client!kca", name = "B", descriptor = "Ljava/lang/String;")
    public String field9214;

    @OriginalMember(owner = "client!kca", name = "H", descriptor = "Ljava/lang/String;")
    public String field9219;

    @OriginalMember(owner = "client!kca", name = "A", descriptor = "[I")
    public static int[] field9213;

    @OriginalMember(owner = "client!kca", name = "F", descriptor = "[I")
    public int[] field9217;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;", line = 10)
    public final String method3640(int arg0, String arg1, boolean arg2) {
        field9227++;
        if (this.field9223 == null) {
            return arg1;
        }
        class302 var4 = (class302) this.field9223.method3669((long) arg0, -1);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg2) {
                this.method3644(-106, null);
            }
            return var4.field3752;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lr;I)Lf;", line = 34)
    public final class534 method3641(class564 arg0, int arg1) {
        field9194++;
        class534 var3 = (class534) this.field9189.field1368.method78(0, (long) (this.field9216 | 0x20000 | arg0.field8053 << 29));
        if (var3 != null) {
            return var3;
        }
        if (arg1 != 1293700637) {
            method3647(-115);
        }
        this.field9189.field1362.method3849(this.field9216, false);
        class550 var4 = class550.method3122(this.field9189.field1362, this.field9216, 0);
        if (var4 != null) {
            var3 = arg0.method1041(var4, true);
            this.field9189.field1368.method92(1, (long) (arg0.field8053 << 29 | 0x20000 | this.field9216), var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)I", line = 70)
    public final int method3642(int arg0, int arg1, int arg2) {
        field9197++;
        if (arg1 != 1) {
            this.method3642(-21, -43, -97);
        }
        if (this.field9223 == null) {
            return arg2;
        } else {
            class22 var4 = (class22) this.field9223.method3669((long) arg0, -1);
            return var4 == null ? arg2 : var4.field168;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILnp;)V", line = 90)
    public final void method3643(int arg0, class115 arg1) {
        if (arg0 != 5) {
            return;
        }
        while (true) {
            int var3 = arg1.method620((byte) 66);
            if (var3 == 0) {
                field9205++;
                return;
            }
            this.method3648(arg1, var3, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILks;)Z", line = 121)
    public final boolean method3644(int arg0, class30 arg1) {
        field9212++;
        int var3;
        if (this.field9228 == -1) {
            if (this.field9225 == -1) {
                return true;
            }
            var3 = arg1.method160(-726, this.field9225);
        } else {
            var3 = arg1.method159(this.field9228, 14);
        }
        if (var3 < this.field9192 || var3 > this.field9196) {
            return false;
        }
        if (arg0 != -13401) {
            this.field9204 = 54;
        }
        boolean var4 = false;
        int var5;
        if (this.field9208 == -1) {
            if (this.field9203 == -1) {
                return true;
            }
            var5 = arg1.method160(-726, this.field9203);
        } else {
            var5 = arg1.method159(this.field9208, 14);
        }
        return this.field9195 <= var5 && this.field9188 >= var5;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 160)
    public final void method3645(int arg0) {
        field9200++;
        if (arg0 != 9124) {
            this.field9199 = -17;
        }
        if (this.field9217 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field9217.length; var2 += 2) {
            if (this.field9217[var2] < this.field9199) {
                this.field9199 = this.field9217[var2];
            } else if (this.field9217[var2] > this.field9198) {
                this.field9198 = this.field9217[var2];
            }
            if (this.field9217[var2 + 1] < this.field9229) {
                this.field9229 = this.field9217[var2 + 1];
            } else if (this.field9217[var2 + 1] > this.field9204) {
                this.field9204 = this.field9217[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZZLr;)Lf;", line = 197)
    public final class534 method3646(boolean arg0, boolean arg1, class564 arg2) {
        field9221++;
        int var4 = arg1 ? this.field9226 : this.field9206;
        int var5 = arg2.field8053 << 29 | var4;
        class534 var6 = (class534) this.field9189.field1368.method78(0, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field9189.field1362.method3849(var4, arg0)) {
            class550 var7 = class550.method3122(this.field9189.field1362, var4, 0);
            if (var7 != null) {
                var6 = arg2.method1041(var7, true);
                this.field9189.field1368.method92(1, (long) var5, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V", line = 231)
    public static void method3647(int arg0) {
        field9232 = null;
        if (arg0 == -1) {
            field9207 = null;
            field9213 = null;
            field9231 = null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lnp;IB)V", line = 306)
    private final void method3648(class115 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field9206 = arg0.method643((byte) -77);
        } else if (arg1 == 2) {
            this.field9226 = arg0.method643((byte) -77);
        } else if (arg1 == 3) {
            this.field9214 = arg0.method626(126);
        } else if (arg1 == 4) {
            this.field9202 = arg0.method675(-127);
        } else if (arg1 == 5) {
            this.field9215 = arg0.method675(-125);
        } else if (arg1 == 6) {
            this.field9230 = arg0.method620((byte) 8);
        } else if (arg1 == 7) {
            int var4 = arg0.method620((byte) 43);
            if ((var4 & 0x1) == 0) {
                this.field9190 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field9222 = true;
            }
        } else if (arg1 == 8) {
            this.field9220 = arg0.method620((byte) 93) == 1;
        } else if (arg1 == 9) {
            this.field9225 = arg0.method643((byte) -77);
            if (this.field9225 == 65535) {
                this.field9225 = -1;
            }
            this.field9228 = arg0.method643((byte) -77);
            if (this.field9228 == 65535) {
                this.field9228 = -1;
            }
            this.field9192 = arg0.method631(false);
            this.field9196 = arg0.method631(false);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field9201[arg1 - 10] = arg0.method626(112);
        } else if (arg1 == 15) {
            int var5 = arg0.method620((byte) -128);
            this.field9217 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field9217[var6] = arg0.method676(-5);
            }
            this.field9211 = arg0.method631(false);
            this.field9191 = arg0.method631(false);
        } else if (arg1 == 16) {
            this.field9224 = false;
        } else if (arg1 == 17) {
            this.field9219 = arg0.method626(105);
        } else if (arg1 == 18) {
            this.field9216 = arg0.method643((byte) -77);
        } else if (arg1 == 19) {
            this.field9193 = arg0.method643((byte) -77);
        } else if (arg1 == 20) {
            this.field9203 = arg0.method643((byte) -77);
            if (this.field9203 == 65535) {
                this.field9203 = -1;
            }
            this.field9208 = arg0.method643((byte) -77);
            if (this.field9208 == 65535) {
                this.field9208 = -1;
            }
            this.field9195 = arg0.method631(false);
            this.field9188 = arg0.method631(false);
        } else if (arg1 == 21) {
            this.field9218 = arg0.method631(false);
        } else if (arg1 == 22) {
            this.field9210 = arg0.method631(false);
        } else if (arg1 == 249) {
            int var7 = arg0.method620((byte) -128);
            if (this.field9223 == null) {
                int var8 = class553.method3138(1781323777, var7);
                this.field9223 = new class661(var8);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                boolean var10 = arg0.method620((byte) -22) == 1;
                int var11 = arg0.method675(-127);
                class333 var12;
                if (var10) {
                    var12 = new class302(arg0.method626(82));
                } else {
                    var12 = new class22(arg0.method631(false));
                }
                this.field9223.method3671(false, var12, (long) var11);
            }
        }
        field9209++;
        int var13 = 102 % ((arg2 - 3) / 43);
    }
}
