import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public abstract class class779 implements class515 {

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "Lgj;")
    private class662 field10736;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "Lgj;")
    public class662 field10741;

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "Ldl;")
    public class70 field10732;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
    public static int field10730;

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "I")
    public static int field10731;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
    public static int field10733;

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "I")
    public static int field10734;

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "I")
    public static int field10735;

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
    public static int field10737;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
    public static int field10739;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    private int field10742;

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "J")
    private long field10738;

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "Lda;")
    private class67 field10740;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)Z")
    public boolean method1789(byte arg0) {
        field10733++;
        if (arg0 != 29) {
            this.field10740 = null;
        }
        boolean var2 = true;
        if (!this.field10741.method3737(this.field10732.field1034, false)) {
            var2 = false;
        }
        if (!this.field10736.method3737(this.field10732.field1034, false)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIZ)V")
    public abstract void method1827(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)I")
    public static final int method4269(boolean arg0) {
        field10730++;
        if (!arg0) {
            method4269(true);
        }
        return class533.field7205++;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZI)V")
    public final void method1102(boolean arg0, int arg1) {
        field10734++;
        int var3 = this.field10732.field1041.method3006(0, class374.field5075, this.field10732.field1031) + this.field10732.field1035;
        int var4 = this.field10732.field1039.method2837(2113, class412.field5635, this.field10732.field1030) + this.field10732.field1033;
        this.method1826(false, arg0, var4, var3);
        this.method1827(arg1 - 1164, var4, var3, arg0);
        String var5 = class695.field9619.method3415((byte) -74);
        if (class197.method1423(1) - this.field10738 > 10000L) {
            var5 = var5 + " (" + class695.field9619.method3412(-32207).method2108((byte) 100) + ")";
        }
        if (arg1 != 1164) {
            method4271(73, (byte) 3, null, null, -106);
        }
        this.field10740.method613(this.field10732.field1031 / 2 + var3, -1, var5, this.field10732.field1040, true, this.field10732.field1032 + var4 + (this.field10732.field1030 / 2) + 4);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
    public void method1790(int arg0) {
        if (arg0 == 6187) {
            field10737++;
            class145 var2 = class502.method2871(-1, this.field10732.field1034, this.field10736);
            this.field10740 = class95.field1472.method476(var2, class49.method372(this.field10741, this.field10732.field1034), true);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZII)V")
    public abstract void method1826(boolean arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)I")
    public final int method4270(int arg0) {
        field10739++;
        int var2 = class695.field9619.method3421(-14079);
        if (arg0 <= 35) {
            this.field10741 = null;
        }
        int var3 = var2 * 100;
        if (this.field10742 == var2 && var2 != 0) {
            int var4 = class695.field9619.method3411(0);
            if (var4 > var2) {
                long var5 = this.field10738 - class695.field9619.method3414(-39);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class197.method1423(1) - this.field10738) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field10742 = var2;
            this.field10738 = class197.method1423(1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBLjava/awt/Component;Llu;I)Llv;")
    public static final class470 method4271(int arg0, byte arg1, Component arg2, class742 arg3, int arg4) {
        field10735++;
        if (class55.field782 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class470 var5 = (class470) Class.forName("vt").getDeclaredConstructor().newInstance();
                var5.field6358 = new int[(class137.field2352 ? 2 : 1) * 256];
                var5.field6374 = arg0;
                var5.method2040(arg2);
                var5.field6365 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field6365 > 16384) {
                    var5.field6365 = 16384;
                }
                var5.method2036(var5.field6365);
                if (class712.field9803 > 0 && class556.field7849 == null) {
                    class556.field7849 = new class116();
                    class556.field7849.field2124 = arg3;
                    arg3.method4116(class712.field9803, class556.field7849, (byte) 124);
                }
                if (class556.field7849 != null) {
                    if (class556.field7849.field2122[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class556.field7849.field2122[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class632 var6 = new class632(arg3, arg4);
                    var6.field6358 = new int[(class137.field2352 ? 2 : 1) * 256];
                    var6.field6374 = arg0;
                    var6.method2040(arg2);
                    var6.field6365 = 16384;
                    var6.method2036(var6.field6365);
                    if (class712.field9803 > 0 && class556.field7849 == null) {
                        class556.field7849 = new class116();
                        class556.field7849.field2124 = arg3;
                        arg3.method4116(class712.field9803, class556.field7849, (byte) 124);
                    }
                    if (class556.field7849 != null) {
                        if (class556.field7849.field2122[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class556.field7849.field2122[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return arg1 == -108 ? new class470() : null;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lgj;Lgj;Ldl;)V")
    public class779(class662 arg0, class662 arg1, class70 arg2) {
        this.field10736 = arg1;
        this.field10741 = arg0;
        this.field10732 = arg2;
    }
}
