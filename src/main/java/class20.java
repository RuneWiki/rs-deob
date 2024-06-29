import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class20 extends class447 {

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    private int field295 = 0;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    private int field288 = -1;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    private int field292 = -32768;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "Z")
    public boolean field302 = false;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    private int field301 = 0;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "Lbq;")
    private class51 field304;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public static int field306 = 0;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Lue;")
    public static class131 field293;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Lue;")
    public static class131 field296;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "Lbl;")
    private class54 field294;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z", line = 3)
    public final boolean method53(byte arg0) {
        ++field286;
        if (arg0 < 58) {
            this.method136(-21);
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lrc;Lja;B)V", line = 14)
    private final void method129(class100 arg0, class90 arg1, byte arg2) {
        ++field289;
        class383[] var4 = arg0.method542();
        class354[] var5 = arg0.method547();
        if ((this.field294 == null || this.field294.field864) && (var4 != null || var5 != null)) {
            this.field294 = new class54(class267.field4002);
        }
        if (arg2 < 62) {
            field296 = null;
        }
        if (this.field294 != null) {
            this.field294.method424(arg1, (long) class267.field4002, var4, var5, false);
            this.field294.method429(super.field6509, super.field6526, super.field6504, super.field6513, super.field6508);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 38)
    public static void method130(byte arg0) {
        field296 = null;
        if (arg0 != 92) {
            method130((byte) 20);
        }
        field293 = null;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)V", line = 50)
    public final void method131(byte arg0) {
        ++field299;
        if (this.field294 != null) {
            this.field294.method431();
        }
        if (arg0 != 17) {
            this.method134((byte) 97, (class90) null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILja;II)Z", line = 64)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        if (arg2 != 28033) {
            method135(-119, 23);
        }
        ++field300;
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V", line = 75)
    public final void method133(byte arg0, int arg1) {
        ++field297;
        if (!this.field302) {
            this.field301 += arg1;
            while (~this.field301 < ~this.field304.field845[this.field295]) {
                this.field301 -= this.field304.field845[this.field295];
                ++this.field295;
                if (~this.field295 <= ~this.field304.field835.length) {
                    this.field302 = true;
                    break;
                }
            }
            if (!this.field302) {
                class50.method399(this.field295, super.field6519, (byte) 99, this.field304, super.field6520, false);
            }
            if (arg0 != -29) {
                this.finalize();
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBZIILnf;Lja;)V", line = 106)
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        if (arg1 == 47) {
            ++field305;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLja;)Lkh;", line = 117)
    public final class69 method134(byte arg0, class90 arg1) {
        ++field298;
        class100 var3 = this.method139(arg1, -1, 1024);
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = arg1.method709();
            if (arg0 <= 90) {
                return null;
            } else {
                var4.method1527(super.field6520, super.field6506, super.field6519);
                if (this.field294 == null) {
                    var3.method530(var4, (class290) null, 0);
                } else {
                    class30 var5 = this.field294.method427();
                    arg1.method698(var3, var5, var4, (class290) null, 0);
                }
                this.field292 = var3.method541();
                this.method129(var3, arg1, (byte) 98);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(II)V", line = 154)
    public static final void method135(int arg0, int arg1) {
        if (arg0 == -28262) {
            ++field287;
            class18 var2 = class310.field4521;
            synchronized (class310.field4521) {
                class310.field4521.method104(arg1, (byte) -34);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V", line = 168)
    public final void method54(int arg0) {
        ++field284;
        if (arg0 != 0) {
            field296 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)I", line = 181)
    public final int method136(int arg0) {
        if (arg0 != 0) {
            return -20;
        } else {
            ++field283;
            return this.field292;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 192)
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field285 = arg0;
        this.field303 = arg2 - -arg1;
        int var12 = class321.method2140(this.field285, (byte) 23).field5597;
        if (var12 == -1) {
            this.field302 = true;
        } else {
            this.field302 = false;
            this.field304 = class113.method974(var12, (byte) -123);
        }
        if (~this.field303 == ~arg2) {
            class50.method399(this.field295, super.field6519, (byte) 63, this.field304, super.field6520, false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILja;)V", line = 218)
    public final void method137(int arg0, class90 arg1) {
        ++field282;
        int var3 = -51 / ((-31 - arg0) / 51);
        class100 var4 = this.method139(arg1, -1, 0);
        if (var4 != null) {
            this.method129(var4, arg1, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!lg", name = "finalize", descriptor = "()V", line = 251)
    protected final void finalize() {
        if (this.field294 != null) {
            this.field294.method431();
        }
        ++field290;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 267)
    public static final void method138(int arg0) {
        for (int var1 = arg0; ~class176.field2619 < ~var1; ++var1) {
            int var2 = class218.field3229[var1];
            class127 var3 = class367.field5225[var2];
            int var4 = class268.field4020.method271((byte) 117);
            if ((128 & var4) != 0) {
                var4 += class268.field4020.method271((byte) 123) << 8;
            }
            class420.method2637(var4, var2, (byte) -101, var3);
        }
        ++field307;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lja;II)Lrc;", line = 295)
    private final class100 method139(class90 arg0, int arg1, int arg2) {
        ++field291;
        class389 var4 = class321.method2140(this.field285, (byte) 67);
        if (arg1 != -1) {
            return null;
        } else {
            return this.field302 ? var4.method2464(arg0, arg2, -1, 0, -1, 6677) : var4.method2464(arg0, arg2, this.field288, this.field301, this.field295, 6677);
        }
    }
}
