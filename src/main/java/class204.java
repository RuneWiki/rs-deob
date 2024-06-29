import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class204 extends class447 {

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    private int field2976 = -32768;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    private int field2975 = -1;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "Z")
    private boolean field2978 = false;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    private int field2994 = 0;

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "I")
    private int field2999 = 0;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    private int field2983;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    private int field2966;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
    private int field2995;

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lbq;")
    private class51 field2985;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "I")
    public static int field2997 = 0;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "D")
    private double field2968;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "D")
    private double field2971;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "D")
    private double field2973;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "D")
    private double field2987;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "D")
    private double field2992;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "D")
    private double field2996;

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "D")
    private double field2998;

    @OriginalMember(owner = "client!pb", name = "sb", descriptor = "D")
    private double field3001;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    private int field2989;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!pb", name = "tb", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "Lbl;")
    private class54 field2991;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILja;)V")
    public final void method137(int arg0, class90 arg1) {
        ++field2990;
        int var3 = -14 / ((arg0 - -31) / 51);
        class100 var4 = this.method1549(0, 1480841767, arg1);
        if (var4 != null) {
            class202 var5 = arg1.method709();
            var5.method1529(this.field3002);
            var5.method1534(this.field2989);
            var5.method1528((int) this.field2998, (int) this.field2968, (int) this.field2987);
            this.field2976 = var4.method541();
            this.method1548((byte) 58, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(II)V")
    public final void method1544(int arg0, int arg1) {
        this.field2998 += (double) arg0 * this.field2971;
        this.field2978 = true;
        this.field2987 += (double) arg0 * this.field2996;
        if (~this.field2983 != 0) {
            this.field2968 += this.field2992 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2973;
            this.field2973 += (double) arg0 * this.field2992;
        } else {
            this.field2968 += (double) arg0 * this.field2973;
        }
        ++field2964;
        this.field2989 = 16383 & 8192 + (int) (Math.atan2(this.field2971, this.field2996) * 2607.5945876176133D);
        if (arg1 != -16003) {
            this.field2968 = 1.00282201556227D;
        }
        this.field3002 = (int) (Math.atan2(this.field2973, this.field3001) * 2607.5945876176133D) & 16383;
        if (this.field2985 != null) {
            this.field2999 += arg0;
            while (true) {
                do {
                    do {
                        if (~this.field2985.field845[this.field2994] <= ~this.field2999) {
                            return;
                        }
                        this.field2999 -= this.field2985.field845[this.field2994];
                        ++this.field2994;
                        if (this.field2994 >= this.field2985.field835.length) {
                            this.field2994 -= this.field2985.field838;
                            if (this.field2994 < 0 || ~this.field2985.field835.length >= ~this.field2994) {
                                this.field2994 = 0;
                            }
                        }
                        this.field2975 = this.field2994 + 1;
                    } while (this.field2985.field835.length > this.field2975);
                    this.field2975 -= this.field2985.field838;
                } while (~this.field2975 <= -1 && ~this.field2975 > ~this.field2985.field835.length);
                this.field2975 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLja;)Lkh;")
    public final class69 method134(byte arg0, class90 arg1) {
        ++field3000;
        class100 var3 = this.method1549(1024, 1480841767, arg1);
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = arg1.method709();
            var4.method1529(this.field3002);
            var4.method1534(this.field2989);
            var4.method1528((int) this.field2998, (int) this.field2968, (int) this.field2987);
            if (arg0 < 90) {
                return null;
            } else {
                if (this.field2991 == null) {
                    var3.method530(var4, (class290) null, 0);
                } else {
                    class30 var5 = this.field2991.method427();
                    arg1.method698(var3, var5, var4, (class290) null, 0);
                }
                this.field2976 = var3.method541();
                this.method1548((byte) 104, arg1, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        ++field2986;
        if (arg0 < 58) {
            this.method47(113, (byte) 102, true, 88, -127, (class256) null, (class90) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIII)V")
    public final void method1545(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field2988;
        if (!this.field2978) {
            double var6 = (double) (-super.field6520 + arg2);
            double var8 = (double) (-super.field6519 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2998 = (double) this.field2995 * var6 / var10 + (double) super.field6520;
            this.field2968 = (double) super.field6506;
            this.field2987 = (double) this.field2995 * var8 / var10 + (double) super.field6519;
        }
        double var12 = (double) (this.field2980 - -1 + -arg3);
        this.field2971 = ((double) arg2 - this.field2998) / var12;
        this.field2996 = ((double) arg4 + -this.field2987) / var12;
        this.field3001 = Math.sqrt(this.field2996 * this.field2996 + this.field2971 * this.field2971);
        if (!arg1) {
            this.field2968 = -0.2389688985583175D;
        }
        if (~this.field2983 != 0) {
            if (!this.field2978) {
                this.field2973 = -this.field3001 * Math.tan((double) this.field2983 * 0.02454369D);
            }
            this.field2992 = ((double) arg0 - this.field2968 + -(this.field2973 * var12)) * 2.0D / (var12 * var12);
        } else {
            this.field2973 = ((double) arg0 - this.field2968) / var12;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public final void method1546(int arg0) {
        ++field2982;
        if (this.field2991 != null) {
            this.field2991.method431();
        }
        if (arg0 <= 108) {
            this.field2983 = 69;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
    public final void method1547(byte arg0) {
        super.field6526 = super.field6504 = (short) ((int) (this.field2998 / 128.0D));
        super.field6513 = super.field6508 = (short) ((int) (this.field2987 / 128.0D));
        ++field2977;
        if (arg0 != -115) {
            this.field2973 = 1.3617973772167693D;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public final void method54(int arg0) {
        if (arg0 != 0) {
            this.method54(48);
        }
        ++field2970;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILja;II)Z")
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        if (arg2 != 28033) {
            return true;
        } else {
            ++field2967;
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2984;
        if (this.field2991 != null) {
            this.field2991.method431();
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field2974 = arg5;
        this.field2980 = arg6;
        this.field2983 = arg7;
        this.field2969 = arg10;
        this.field2979 = arg9;
        this.field2966 = arg0;
        this.field2978 = false;
        this.field2995 = arg8;
        int var12 = class321.method2140(this.field2966, (byte) -113).field5597;
        if (~var12 != 0) {
            this.field2985 = class113.method974(var12, (byte) -110);
        } else {
            this.field2985 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLja;Lrc;)V")
    private final void method1548(byte arg0, class90 arg1, class100 arg2) {
        ++field2965;
        if (arg0 <= 21) {
            this.field2978 = true;
        }
        class383[] var4 = arg2.method542();
        class354[] var5 = arg2.method547();
        if ((this.field2991 == null || this.field2991.field864) && (var4 != null || var5 != null)) {
            this.field2991 = new class54(class267.field4002);
        }
        if (this.field2991 != null) {
            this.field2991.method424(arg1, (long) class267.field4002, var4, var5, false);
            this.field2991.method429(super.field6509, super.field6526, super.field6504, super.field6513, super.field6508);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBZIILnf;Lja;)V")
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        if (arg1 != 47) {
            field2997 = 78;
        }
        ++field2972;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILja;)Lrc;")
    private final class100 method1549(int arg0, int arg1, class90 arg2) {
        ++field2993;
        if (arg1 != 1480841767) {
            return null;
        } else {
            class389 var4 = class321.method2140(this.field2966, (byte) -108);
            return var4.method2464(arg2, arg0, this.field2975, this.field2999, this.field2994, 6677);
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)I")
    public final int method136(int arg0) {
        ++field2981;
        return arg0 != 0 ? -39 : this.field2976;
    }
}
