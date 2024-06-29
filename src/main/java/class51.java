import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class51 extends class425 {

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    private int field965 = 0;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
    private int field972 = -1;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
    private int field968 = 0;

    @OriginalMember(owner = "client!nr", name = "U", descriptor = "Z")
    public boolean field982 = false;

    @OriginalMember(owner = "client!nr", name = "V", descriptor = "I")
    private int field983 = 0;

    @OriginalMember(owner = "client!nr", name = "Y", descriptor = "I")
    private int field986 = -32768;

    @OriginalMember(owner = "client!nr", name = "W", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    private int field967;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "Ldba;")
    private class78 field963;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "Lcba;")
    public static class471 field974 = new class471(104, -2);

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "[I")
    public static int[] field979 = new int[14];

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!nr", name = "X", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!nr", name = "Z", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "Ljw;")
    private class475 field975;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field971;
        if (!arg0) {
            return null;
        } else {
            class157 var3 = this.method489(2048 | (this.field983 != 0 ? 5 : 0), this.field984, (byte) -36, arg1);
            if (var3 == null) {
                return null;
            } else {
                if (~this.field983 != -1) {
                    var3.method140(this.field983 * 2048);
                }
                class163 var4 = arg1.method1344();
                var4.method1054(super.field6037, super.field6042, super.field6029);
                if (this.field975 != null) {
                    class274 var5 = this.field975.method2768();
                    arg1.method1366(var3, var5, var4, (class631) null, 0);
                } else {
                    var3.method154(var4, (class631) null, 0);
                }
                this.field986 = var3.method133();
                this.method493(arg1, false, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V")
    public final void method484(int arg0, int arg1) {
        ++field980;
        if (!this.field982) {
            if (arg0 != 0) {
                this.field961 = -74;
            }
            this.field968 += arg1;
            while (this.field963.field1260[this.field965] < this.field968) {
                this.field968 -= this.field963.field1260[this.field965];
                ++this.field965;
                if (this.field965 >= this.field963.field1261.length) {
                    this.field982 = true;
                    break;
                }
            }
            if (!this.field982) {
                class170.method1085(super.field6029, super.field6035, false, (byte) -127, this.field965, this.field963, super.field6037);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field984 = arg0;
        this.field961 = arg1 + arg2;
        this.field983 = arg12;
        this.field967 = arg4;
        class258 var14 = class78.field1263.method1564(this.field984, 5);
        int var15 = var14.field3583;
        if (var15 == -1) {
            this.field982 = true;
        } else {
            this.field963 = class331.field4418.method195(var15, (byte) 13);
            this.field982 = false;
        }
        if (~this.field961 == ~arg2) {
            class170.method1085(super.field6029, super.field6035, false, (byte) -124, this.field965, this.field963, super.field6037);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        if (arg2 < 79) {
            this.finalize();
        }
        ++field985;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)Z")
    public static final boolean method485(byte arg0, int arg1) {
        ++field987;
        int var2 = 39 % ((77 - arg0) / 46);
        return ~arg1 == -4 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (this.field975 != null) {
            this.field975.method2762();
        }
        if (arg0 == 4008) {
            ++field964;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        ++field978;
        class157 var3 = this.method489(0, this.field984, (byte) -36, arg0);
        if (arg1 != 21) {
            this.field972 = 62;
        }
        if (var3 != null) {
            this.method493(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        ++field981;
        if (arg3 != 1) {
            this.method490(false, (class207) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIBLqa;)Lr;")
    private final class157 method489(int arg0, int arg1, byte arg2, class207 arg3) {
        ++field976;
        class258 var5 = class78.field1263.method1564(arg1, 5);
        if (arg2 != -36) {
            return null;
        } else {
            class174 var6 = class608.field8767[super.field6035];
            class174 var7 = this.field967 >= 3 ? null : class608.field8767[this.field967 - -1];
            return this.field982 ? var5.method1659(super.field6042, super.field6029, arg3, -1, 0, (byte) 12, arg0, class331.field4418, var7, super.field6037, var6, true, -1) : var5.method1659(super.field6042, super.field6029, arg3, this.field965, this.field968, (byte) 12, arg0, class331.field4418, var7, super.field6037, var6, true, this.field972);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        ++field966;
        if (arg0) {
            this.method493((class207) null, false, (class157) null);
        }
        return null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
    public static void method491(byte arg0) {
        if (arg0 > 35) {
            field974 = null;
            field979 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)I")
    public final int method492(int arg0) {
        if (arg0 != 0) {
            this.field982 = false;
        }
        ++field969;
        return this.field986;
    }

    @OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field975 != null) {
            this.field975.method2762();
        }
        ++field977;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        ++field973;
        if (arg0 != 1) {
            this.field986 = 74;
        }
        return false;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lqa;ZLr;)V")
    private final void method493(class207 arg0, boolean arg1, class157 arg2) {
        ++field970;
        class203[] var4 = arg2.method161();
        if (arg1) {
            this.field972 = -110;
        }
        class225[] var5 = arg2.method131();
        if ((this.field975 == null || this.field975.field6686) && (var4 != null || var5 != null)) {
            this.field975 = class475.method2757(class405.field5763);
        }
        if (this.field975 != null) {
            this.field975.method2767(arg0, (long) class405.field5763, var4, var5, false);
            this.field975.method2759(super.field6035, super.field6036, super.field6030, super.field6028, super.field6031);
        }
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field962;
        if (arg0 != 1) {
            field979 = null;
        }
        throw new IllegalStateException();
    }
}
