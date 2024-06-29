import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class187 {

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    private int field3317 = 0;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lmg;")
    private class252 field3307;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lrk;")
    public static class257 field3313 = new class257();

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lbj;")
    public static class151 field3315;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lce;")
    private class207 field3310;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method1284(byte arg0) {
        field3315 = null;
        field3313 = null;
        int var1 = 85 / ((-arg0 - 55) / 39);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZJ)V")
    public static final void method1285(boolean arg0, long arg1) {
        field3312++;
        if (arg1 != 0L) {
            class143.field2720++;
            class36.field809.method1356(8, arg0);
            class36.field809.method1399((byte) -61, arg1);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lce;")
    public final class207 method1286(int arg0) {
        this.field3317 = 0;
        field3306++;
        return arg0 == 347 ? this.method1289(13052) : null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIBII)V")
    public static final void method1287(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 123) {
            return;
        }
        field3311++;
        if (arg1 >= class49.field1044 && class129.field2473 >= arg0 && arg2 >= class50.field1050 && class56.field1143 >= arg5) {
            class260.method1776(arg1, arg0, arg4, arg2, arg5, arg3 ^ 0xFFFFFC69);
        } else {
            class133.method956(arg1, arg2, arg4, (byte) -75, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public static final void method1288(boolean arg0, int arg1) {
        if ((class124.field2412.field676 >> 7) == class133.field2514 && class124.field2412.field685 >> 7 == class193.field3459) {
            class133.field2514 = 0;
        }
        field3308++;
        int var2 = class209.field3786;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class224 var4;
            long var5;
            if (arg0) {
                var4 = class124.field2412;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class142.field2689[var3] << 32;
                var4 = class186.field3294[class142.field2689[var3]];
            }
            if (var4 != null && var4.method238(-24869)) {
                var4.field4056 = false;
                int var7 = var4.field685 >> 7;
                if ((class42.field936 && class209.field3786 > 200 || class209.field3786 > 50) && !arg0 && var4.field739 == var4.field701) {
                    var4.field4056 = true;
                }
                int var8 = var4.field676 >> 7;
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field4044 == null || var4.field4048 > class236.field4265 || var4.field4049 <= class236.field4265) {
                        if (var4.method240((byte) 15) == 1 && (var4.field676 & 0x7F) == 64 && (var4.field685 & 0x7F) == 64) {
                            if (class205.field3701[var8][var7] == class119.field2338) {
                                continue;
                            }
                            class205.field3701[var8][var7] = class119.field2338;
                        }
                        var4.field744 = class30.method198(31482, var4.field676, var4.field685, class180.field3244);
                        class130.method913(class180.field3244, var4.field676, var4.field685, var4.field744, (var4.method240((byte) -122) - 1) * 64 + 60, var4, var4.field700, var5, var4.field694);
                    } else {
                        var4.field4056 = false;
                        var4.field744 = class30.method198(31482, var4.field676, var4.field685, class180.field3244);
                        class268.method1840(class180.field3244, var4.field676, var4.field685, var4.field744, var4, var4.field700, var5, var4.field4041, var4.field4059, var4.field4052, var4.field4021);
                    }
                }
            }
        }
        if (arg1 > -63) {
            method1285(false, -117L);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Lce;")
    public final class207 method1289(int arg0) {
        if (arg0 != 13052) {
            this.field3310 = null;
        }
        field3309++;
        if (this.field3317 > 0 && this.field3307.field4486[this.field3317 - 1] != this.field3310) {
            class207 var2 = this.field3310;
            this.field3310 = var2.field3765;
            return var2;
        }
        while (this.field3317 < this.field3307.field4473) {
            class207 var3 = this.field3307.field4486[this.field3317++].field3765;
            if (this.field3307.field4486[this.field3317 - 1] != var3) {
                this.field3310 = var3.field3765;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lmg;)V")
    public class187(class252 arg0) {
        this.field3307 = arg0;
    }
}
