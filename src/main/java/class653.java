import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class653 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    private int field8986;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "[Lab;")
    private class623[] field8987;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field8993 = -1;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "J")
    private long field8995;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Lab;")
    private class623 field8996;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(CB)I")
    public static final int method3521(char arg0, byte arg1) {
        field8989++;
        if (arg1 == 10) {
            return arg0 >= '\u0000' && class394.field5492.length > arg0 ? class394.field5492[arg0] : -1;
        } else {
            return -26;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Lab;")
    public final class623 method3522(byte arg0) {
        field8994++;
        if (this.field8996 == null) {
            return null;
        } else if (arg0 < 42) {
            return null;
        } else {
            class623 var2 = this.field8987[(int) ((long) (this.field8986 - 1) & this.field8995)];
            while (this.field8996 != var2) {
                if (this.field8996.field8700 == this.field8995) {
                    class623 var3 = this.field8996;
                    this.field8996 = this.field8996.field8705;
                    return var3;
                }
                this.field8996 = this.field8996.field8705;
            }
            this.field8996 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3523(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class619.method3397((byte) 114);
        field8988++;
        class728.field10195 = 0L;
        int var5 = class126.method814((byte) 23);
        if (arg1 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class458.field6407.method113()) {
            arg4 = true;
        }
        class138.method862(arg4, arg2, arg1, var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lab;JI)V")
    public final void method3524(class623 arg0, long arg1, int arg2) {
        if (arg0.field8708 != null) {
            arg0.method3409(125);
        }
        field8990++;
        if (arg2 != -22787) {
            return;
        }
        class623 var5 = this.field8987[(int) (arg1 & (long) (this.field8986 - 1))];
        arg0.field8708 = var5.field8708;
        arg0.field8705 = var5;
        arg0.field8708.field8705 = arg0;
        arg0.field8700 = arg1;
        arg0.field8705.field8708 = arg0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)I")
    public static final int method3525(int arg0, int arg1) {
        return class224.field2949 == null ? 0 : class224.field2949[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method3526(String arg0, boolean arg1) {
        field8985++;
        if (!class304.field3906.field3251) {
            return -1;
        } else if (class368.field5201.containsKey(arg0)) {
            return 100;
        } else if (arg1) {
            return 36;
        } else {
            String var2 = class437.method2582(-271, arg0);
            if (var2 == null) {
                return -1;
            }
            String var3 = class395.field5507 + var2;
            if (!class514.field7245.method3843(var3, "", true)) {
                return -1;
            } else if (class514.field7245.method3825(var3, (byte) -128)) {
                byte[] var4 = class514.field7245.method3813(var3, "", -47);
                Object var5 = null;
                File var6;
                try {
                    var6 = class392.method2341(var2, -2);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class581.method3238(-94, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class304.field3906.method1549(var4, 0, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class760.method4233(arg0, false, var6);
                return 100;
            } else {
                return class514.field7245.method3823(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
    public class653(int arg0) {
        this.field8986 = arg0;
        this.field8987 = new class623[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class623 var3 = this.field8987[var2] = new class623();
            var3.field8708 = var3;
            var3.field8705 = var3;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lkha;BI)Ltba;")
    public static final class56 method3527(class687 arg0, byte arg1, int arg2) {
        field8992++;
        if (arg1 > -48) {
            return null;
        } else {
            byte[] var3 = arg0.method3836(arg2, true);
            return var3 == null ? null : new class56(var3);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IJ)Lab;")
    public final class623 method3528(int arg0, long arg1) {
        this.field8995 = arg1;
        field8991++;
        if (arg0 != 12014) {
            method3526(null, true);
        }
        class623 var4 = this.field8987[(int) ((long) (this.field8986 - 1) & arg1)];
        for (this.field8996 = var4.field8705; this.field8996 != var4; this.field8996 = this.field8996.field8705) {
            if (this.field8996.field8700 == arg1) {
                class623 var5 = this.field8996;
                this.field8996 = this.field8996.field8705;
                return var5;
            }
        }
        this.field8996 = null;
        return null;
    }
}
