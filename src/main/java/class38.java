import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class38 extends class144 {

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "Z")
    private boolean field450 = true;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "Z")
    private boolean field452 = true;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field454 = 0;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "Lrc;")
    public static class9 field464 = new class9(100);

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "Lbc;")
    public static class282 field465;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "Lwe;")
    public static class82 field462;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "[Lci;")
    public static class60[] field455;

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public static final void method236(int arg0) {
        class71.field840.method71(-68);
        if (arg0 < 31) {
            method237(50);
        }
        class166.field2382.method71(-122);
        ++field456;
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V")
    public static void method237(int arg0) {
        field464 = null;
        if (arg0 != -1) {
            method239((byte) 117, 21, (String[]) null, (short[]) null, -113);
        }
        field462 = null;
        field455 = null;
        field465 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lbc;IZ)[Lpk;")
    public static final class43[] method238(class282 arg0, int arg1, boolean arg2) {
        ++field451;
        if (arg2) {
            method243(-59, 18);
        }
        return !class185.method1211(0, arg0, arg1) ? null : class284.method1897(18467);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI[Ljava/lang/String;[SI)V")
    public static final void method239(byte arg0, int arg1, String[] arg2, short[] arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; ++var9) {
                if (var7 == null || arg2[var9] != null && ~arg2[var9].compareTo(var7) > ~(var9 & 1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var8;
            method239((byte) -10, arg1, arg2, arg3, var6 + -1);
            method239((byte) 92, var6 + 1, arg2, arg3, arg4);
        }
        int var12 = -60 % ((arg0 - 39) / 38);
        ++field457;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        int[][] var3 = super.field2053.method1542(arg0 + 112, arg1);
        if (arg0 != 5) {
            return null;
        } else {
            ++field453;
            if (super.field2053.field3408) {
                int[][] var4 = this.method927(!this.field452 ? arg1 : -arg1 + class166.field2391, true, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                if (this.field450) {
                    for (int var11 = 0; class104.field1411 > var11; ++var11) {
                        var8[var11] = var5[-var11 + class112.field1487];
                        var10[var11] = var6[class112.field1487 - var11];
                        var9[var11] = var7[-var11 + class112.field1487];
                    }
                } else {
                    for (int var12 = 0; ~class104.field1411 < ~var12; ++var12) {
                        var8[var12] = var5[var12];
                        var10[var12] = var6[var12];
                        var9[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(I)V")
    public static final void method240(int arg0) {
        ++field463;
        int var1 = 57 / ((-56 - arg0) / 44);
        for (int var2 = -1; class238.field3432 > var2; ++var2) {
            int var6;
            if (~var2 != 0) {
                var6 = class46.field540[var2];
            } else {
                var6 = 2047;
            }
            class240 var7 = class253.field3656[var6];
            if (var7 != null && ~var7.field4525 < -1) {
                --var7.field4525;
                if (var7.field4525 == 0) {
                    var7.field4596 = null;
                }
            }
        }
        for (int var3 = 0; class294.field4642 > var3; ++var3) {
            int var4 = class14.field176[var3];
            class54 var5 = class20.field244[var4];
            if (var5 != null && var5.field4525 > 0) {
                --var5.field4525;
                if (~var5.field4525 == -1) {
                    var5.field4596 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lbc;BI)Lwj;")
    public static final class130 method241(class282 arg0, byte arg1, int arg2) {
        int var3 = -12 / ((37 - arg1) / 60);
        ++field458;
        return !class185.method1211(0, arg0, arg2) ? null : class103.method629(133862865);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field460;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[] var4 = this.method934(-18877, 0, this.field452 ? -arg0 + class166.field2391 : arg0);
            if (!this.field450) {
                class194.method1262(var4, 0, var3, 0, class104.field1411);
            } else {
                for (int var5 = 0; var5 < class104.field1411; ++var5) {
                    var3[var5] = var4[-var5 + class112.field1487];
                }
            }
        }
        if (arg1 != 255) {
            this.method12(-128, -78);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(III)I")
    public static final int method242(int arg0, int arg1, int arg2) {
        int var3 = arg1 >>> 31;
        if (arg0 != -2913) {
            method237(-10);
        }
        ++field461;
        return (arg1 - -var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
    public static final void method243(int arg0, int arg1) {
        if (class296.field4676 == 0) {
            class296.field4684.method961(arg0, 32632);
        } else {
            class110.field1475 = arg0;
        }
        if (arg1 > -5) {
            field455 = null;
        }
        ++field459;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 == 20630) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        super.field2059 = arg1.method1407(125) == 1;
                    }
                } else {
                    this.field452 = arg1.method1407(117) == 1;
                }
            } else {
                this.field450 = arg1.method1407(107) == 1;
            }
            ++field449;
        }
    }
}
