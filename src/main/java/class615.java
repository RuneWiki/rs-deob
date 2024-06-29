import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class615 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ltb;")
    private class453 field8303 = null;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Z")
    private boolean field8302;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lss;")
    private class275 field8326;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public int field8306;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "[Ljava/lang/Object;")
    private Object[] field8337;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field8311;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 4)
    public final void method3337(int arg0) {
        if (this.field8311 != null) {
            for (int var2 = 0; var2 < this.field8311.length; var2++) {
                this.field8311[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.method3369((byte) -88, 50);
        }
        field8321++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V", line = 28)
    private final void method3338(int arg0, byte arg1) {
        if (this.field8302) {
            this.field8337[arg0] = this.field8326.method1669(arg0, (byte) 64);
        } else {
            this.field8337[arg0] = class708.method3882(-137, this.field8326.method1669(arg0, (byte) 64), false);
        }
        field8334++;
        if (arg1 != -102) {
            this.field8326 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I", line = 45)
    public final int method3339(int arg0) {
        int var2 = -13 % ((arg0 + 44) / 56);
        field8336++;
        if (!this.method3350(2)) {
            throw new IllegalStateException("");
        }
        return this.field8303.field5895;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 59)
    private final boolean method3340(String arg0, String arg1, byte arg2) {
        field8313++;
        if (!this.method3350(2)) {
            return false;
        } else if (arg2 == -106) {
            String var4 = arg1.toLowerCase();
            String var5 = arg0.toLowerCase();
            int var6 = this.field8303.field5904.method2177(-1, class113.method858(var4, (byte) 18));
            if (this.method3361(arg2 ^ 0x15, var6)) {
                int var7 = this.field8303.field5896[var6].method2177(-1, class113.method858(var5, (byte) 18));
                return this.method3343(var6, var7, (byte) 105);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I", line = 85)
    public final int method3341(int arg0, int arg1) {
        field8329++;
        if (this.method3361(arg1 + 19064, arg0)) {
            if (arg1 != -19046) {
                this.field8311 = null;
            }
            return this.field8303.field5909[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z", line = 105)
    public final boolean method3342(int arg0, int arg1) {
        field8341++;
        if (!this.method3361(-18, arg0)) {
            return false;
        } else if (this.field8337[arg0] != null) {
            return true;
        } else if (arg1 == -18212) {
            this.method3338(arg0, (byte) -102);
            return this.field8337[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)Z", line = 127)
    public final boolean method3343(int arg0, int arg1, byte arg2) {
        field8323++;
        if (arg2 < 77) {
            return true;
        } else if (!this.method3364(arg1, (byte) 126, arg0)) {
            return false;
        } else if (this.field8311[arg0] != null && this.field8311[arg0][arg1] != null) {
            return true;
        } else if (this.field8337[arg0] == null) {
            this.method3338(arg0, (byte) -102);
            return this.field8337[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([IZII)[B", line = 158)
    public final byte[] method3344(int[] arg0, boolean arg1, int arg2, int arg3) {
        field8318++;
        if (!this.method3364(arg3, (byte) 125, arg2)) {
            return null;
        }
        if (this.field8311[arg2] == null || this.field8311[arg2][arg3] == null) {
            boolean var5 = this.method3368(0, arg3, arg2, arg0);
            if (!var5) {
                this.method3338(arg2, (byte) -102);
                boolean var6 = this.method3368(0, arg3, arg2, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class310.method1807((byte) -34, false, this.field8311[arg2][arg3]);
        if (this.field8306 == 1) {
            this.field8311[arg2][arg3] = null;
            if (this.field8303.field5909[arg2] == 1) {
                this.field8311[arg2] = null;
            }
        } else if (this.field8306 == 2) {
            this.field8311[arg2] = null;
        }
        if (!arg1) {
            this.field8337 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 206)
    public final void method3345(String arg0, boolean arg1) {
        if (arg1) {
            this.field8337 = null;
        }
        field8308++;
        if (this.method3350(2)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field8303.field5904.method2177(-1, class113.method858(var3, (byte) 18));
            this.method3353(var4, 0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)[B", line = 225)
    public final byte[] method3346(int arg0, int arg1, int arg2) {
        field8327++;
        return arg0 == -1 ? this.method3344(null, true, arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/lang/String;)I", line = 238)
    public final int method3347(byte arg0, String arg1) {
        field8331++;
        if (!this.method3350(2)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -31) {
            this.method3352(null, 34);
        }
        int var4 = this.field8303.field5904.method2177(arg0 + 30, class113.method858(var3, (byte) 18));
        return this.method3356(var4, false);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)I", line = 256)
    public final int method3348(boolean arg0, int arg1) {
        field8312++;
        if (!this.method3350(2)) {
            return -1;
        }
        if (arg0) {
            this.method3344(null, false, -104, 89);
        }
        int var3 = this.field8303.field5904.method2177(-1, arg1);
        return this.method3361(-13, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I", line = 281)
    public final int method3349(boolean arg0) {
        field8325++;
        if (!this.method3350(2)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field8337.length; var4++) {
            if (this.field8303.field5900[var4] > 0) {
                var3 += this.method3356(var4, false);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else if (arg0) {
            return -13;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z", line = 321)
    private final boolean method3350(int arg0) {
        if (arg0 != 2) {
            this.method3341(-97, 112);
        }
        field8316++;
        if (this.field8303 == null) {
            this.field8303 = this.field8326.method1671((byte) -22);
            if (this.field8303 == null) {
                return false;
            }
            this.field8311 = new Object[this.field8303.field5899][];
            this.field8337 = new Object[this.field8303.field5899];
        }
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 345)
    public final boolean method3351(int arg0, String arg1, String arg2) {
        field8310++;
        if (!this.method3350(2)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        int var5 = -127 / ((arg0 - 39) / 46);
        String var6 = arg1.toLowerCase();
        int var7 = this.field8303.field5904.method2177(-1, class113.method858(var4, (byte) 18));
        if (var7 < 0) {
            return false;
        } else {
            int var8 = this.field8303.field5896[var7].method2177(-1, class113.method858(var6, (byte) 18));
            return var8 >= 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 371)
    public final boolean method3352(String arg0, int arg1) {
        field8338++;
        int var3 = this.method3359("", (byte) -111);
        return arg1 == var3 ? this.method3340("", arg0, (byte) -106) : this.method3340(arg0, "", (byte) -106);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V", line = 385)
    private final void method3353(int arg0, int arg1) {
        this.field8326.method1664((byte) -102, arg0);
        if (arg1 != 0) {
            this.field8306 = 68;
        }
        field8335++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 400)
    public final boolean method3354(String arg0, int arg1) {
        field8314++;
        if (!this.method3350(2)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field8303.field5904.method2177(-1, class113.method858(var3, (byte) 18));
        if (arg1 == 0) {
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 424)
    public final byte[] method3355(int arg0, String arg1, String arg2) {
        field8319++;
        if (!this.method3350(arg0 + 2)) {
            return null;
        } else if (arg0 == 0) {
            String var4 = arg2.toLowerCase();
            String var5 = arg1.toLowerCase();
            int var6 = this.field8303.field5904.method2177(-1, class113.method858(var4, (byte) 18));
            if (this.method3361(arg0 - 122, var6)) {
                int var7 = this.field8303.field5896[var6].method2177(-1, class113.method858(var5, (byte) 18));
                return this.method3346(~arg0, var6, var7);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lss;ZI)V", line = 1093)
    public class615(class275 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field8302 = arg1;
        this.field8326 = arg0;
        this.field8306 = arg2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)I", line = 453)
    private final int method3356(int arg0, boolean arg1) {
        field8315++;
        if (!this.method3361(72, arg0)) {
            return 0;
        } else if (arg1) {
            return 26;
        } else if (this.field8337[arg0] == null) {
            return this.field8326.method1665(78, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Z", line = 470)
    public final boolean method3357(int arg0) {
        field8339++;
        if (!this.method3350(2)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field8303.field5906.length; var3++) {
            int var4 = this.field8303.field5906[var3];
            if (this.field8337[var4] == null) {
                this.method3338(var4, (byte) -102);
                if (this.field8337[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 504)
    public static final void method3358(byte arg0) {
        class222.field2906 = -1;
        if (arg0 != -11) {
            return;
        }
        class57.field769 = 1;
        field8305++;
        long var1 = 0L;
        if (class285.field3701 == null) {
            class252.method1602(-103, 35);
        } else {
            class418 var3 = new class418(class597.method3236((byte) -114, class99.method739((byte) -110, class285.field3701)));
            long var4 = var3.method2377(-605269408);
            class510.field6690 = var3.method2377(-605269408);
            class540.method2866(true, class84.method641(arg0 ^ 0xFFFFFFD0, var4), arg0 + 11, "");
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 534)
    public final int method3359(String arg0, byte arg1) {
        if (arg1 >= -108) {
            this.method3362(114, -29);
        }
        field8309++;
        if (this.method3350(2)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field8303.field5904.method2177(-1, class113.method858(var3, (byte) 18));
            return this.method3361(-120, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(ZI)V", line = 557)
    public final void method3360(boolean arg0, int arg1) {
        field8333++;
        if (!this.method3361(-128, arg1)) {
            return;
        }
        if (!arg0) {
            this.method3347((byte) -35, null);
        }
        if (this.field8311 != null) {
            this.field8311[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)Z", line = 574)
    private final boolean method3361(int arg0, int arg1) {
        field8304++;
        int var3 = -95 % ((-arg0 - 82) / 34);
        if (!this.method3350(2)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field8303.field5909.length && this.field8303.field5909[arg1] != 0) {
            return true;
        } else if (class135.field1775) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(II)Z", line = 599)
    public final boolean method3362(int arg0, int arg1) {
        if (arg1 >= -96) {
            this.method3366(101);
        }
        field8322++;
        if (!this.method3350(2)) {
            return false;
        } else if (this.field8303.field5909.length == 1) {
            return this.method3343(0, arg0, (byte) 102);
        } else if (!this.method3361(62, arg0)) {
            return false;
        } else if (this.field8303.field5909[arg0] == 1) {
            return this.method3343(arg0, 0, (byte) 118);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIZ)V", line = 628)
    public final void method3363(boolean arg0, int arg1, boolean arg2) {
        field8328++;
        if (!this.method3350(2)) {
            return;
        }
        if (arg0) {
            this.field8303.field5913 = null;
            this.field8303.field5904 = null;
        }
        if (arg2) {
            this.field8303.field5915 = null;
            this.field8303.field5896 = null;
        }
        if (arg1 > -7) {
            this.method3361(-102, -50);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)Z", line = 657)
    private final boolean method3364(int arg0, byte arg1, int arg2) {
        if (arg1 < 124) {
            return false;
        }
        field8332++;
        if (!this.method3350(2)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field8303.field5909.length && this.field8303.field5909[arg2] > arg0) {
            return true;
        } else if (class135.field1775) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IB)[B", line = 681)
    public final byte[] method3365(int arg0, byte arg1) {
        field8340++;
        if (!this.method3350(2)) {
            return null;
        } else if (this.field8303.field5909.length == 1) {
            return this.method3346(-1, 0, arg0);
        } else if (!this.method3361(55, arg0)) {
            return null;
        } else if (this.field8303.field5909[arg0] == 1) {
            return this.method3346(-1, arg0, 0);
        } else {
            if (arg1 < 81) {
                this.field8306 = 55;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I", line = 718)
    public final int method3366(int arg0) {
        if (arg0 >= -50) {
            this.field8306 = -35;
        }
        field8317++;
        return this.method3350(2) ? this.field8303.field5909.length : -1;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V", line = 732)
    public final void method3367(int arg0) {
        if (this.field8337 != null) {
            for (int var2 = 0; var2 < this.field8337.length; var2++) {
                this.field8337[var2] = null;
            }
        }
        if (arg0 == 0) {
            field8324++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[I)Z", line = 758)
    private final boolean method3368(int arg0, int arg1, int arg2, int[] arg3) {
        field8320++;
        if (!this.method3361(-116, arg2)) {
            return false;
        } else if (this.field8337[arg2] == null) {
            return false;
        } else {
            int var5 = this.field8303.field5900[arg2];
            int[] var6 = this.field8303.field5901[arg2];
            if (this.field8311[arg2] == null) {
                this.field8311[arg2] = new Object[this.field8303.field5909[arg2]];
            }
            Object[] var7 = this.field8311[arg2];
            boolean var8 = true;
            for (int var9 = arg0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class310.method1807((byte) -17, false, this.field8337[arg2]);
            } else {
                var11 = class310.method1807((byte) -56, true, this.field8337[arg2]);
                class418 var12 = new class418(var11);
                var12.method2366(1849688067, 5, arg3, var12.field5393.length);
            }
            byte[] var13;
            try {
                var13 = class376.method2152((byte) 58, var11);
            } catch (RuntimeException var49) {
                throw class8.method37(var49, "T3 - " + (arg3 != null) + "," + arg2 + "," + var11.length + "," + class365.method2099(var11, 3228, var11.length) + "," + class365.method2099(var11, 3228, var11.length - 2) + "," + this.field8303.field5903[arg2] + "," + this.field8303.field5895);
            }
            if (this.field8302) {
                this.field8337[arg2] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field8306 == 0) {
                    var7[var15] = class708.method3882(-137, var13, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field8306 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * 4 * var33;
                class418 var35 = new class418(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field5367 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method2355(121);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg1 == var41) {
                            var36 += var39;
                            var37 = var41;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field5367 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method2355(73);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg1 == var48) {
                            class443.method2514(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class418 var19 = new class418(var13);
                var19.field5367 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method2355(51);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field5367 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method2355(56);
                        class443.method2514(var13, var26, var24[var29], var20[var29], var28);
                        var26 += var28;
                        var20[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field8306 == 0) {
                        var7[var31] = class708.method3882(-137, var24[var30], false);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)[I", line = 1040)
    public final int[] method3369(byte arg0, int arg1) {
        field8307++;
        if (!this.method3361(-123, arg1)) {
            return null;
        }
        int[] var3 = this.field8303.field5901[arg1];
        if (var3 == null) {
            var3 = new int[this.field8303.field5900[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        if (arg0 != -101) {
            this.method3344(null, true, -120, -37);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Ljava/lang/String;I)Z", line = 1069)
    public final boolean method3370(String arg0, int arg1) {
        field8330++;
        if (!this.method3350(arg1 ^ 0xFFFFFFFC)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field8303.field5904.method2177(-1, class113.method858(var3, (byte) 18));
        if (arg1 != -2) {
            this.field8306 = -14;
        }
        return this.method3342(var4, -18212);
    }
}
