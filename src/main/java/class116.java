import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class116 implements class23 {

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "Lgf;")
    private class279 field1877;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "[I")
    public int[] field1880;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "Lve;")
    private class506 field1876;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "[F")
    public float[] field1875;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lhda;")
    public static class752 field1874 = new class752(12, 3);

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field1885++;
        class353.method2113(arg7 ? this.field1877.field3969 : null, arg2, this.field1877.field3929.field3165, arg3, arg0, arg7 ? this.field1875 : null, arg1, arg5, 0, this.field1883, this.field1877.field3929.field3163, arg4, arg6 ? this.field1880 : null);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILkn;BII)V")
    public static final void method955(int arg0, class742 arg1, byte arg2, int arg3, int arg4) {
        field1882++;
        class98 var5 = arg1.method4141(0);
        if (arg2 >= -1) {
            field1879 = 8;
        }
        int var6 = arg1.field10240 - arg1.field10284.field4928 & 0x3FFF;
        if (arg4 == -1) {
            if (var6 != 0 || arg1.field10222 > 25) {
                if (arg3 < 0 && var5.field1219 != -1) {
                    arg1.field10247 = var5.field1219;
                    arg1.field10304 = false;
                } else if (arg3 <= 0 || var5.field1213 == -1) {
                    arg1.field10247 = var5.field1222;
                } else {
                    arg1.field10247 = var5.field1213;
                }
                arg1.field10304 = false;
            } else if (!arg1.field10304 || !var5.method724(arg1.field10247, -29592)) {
                arg1.field10247 = var5.method725(false);
                arg1.field10304 = arg1.field10247 != -1;
            }
        } else if (arg1.field10287 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class468.field6424[arg0] - arg1.field10284.field4928 & 0x3FFF;
            arg1.field10304 = false;
            if (arg4 == 2 && var5.field1209 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1241 != -1) {
                    arg1.field10247 = var5.field1241;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1225 != -1) {
                    arg1.field10247 = var5.field1225;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1212 == -1) {
                    arg1.field10247 = var5.field1209;
                } else {
                    arg1.field10247 = var5.field1212;
                }
            } else if (arg4 == 0 && var5.field1223 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1257 != -1) {
                    arg1.field10247 = var5.field1257;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1211 != -1) {
                    arg1.field10247 = var5.field1211;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1263 == -1) {
                    arg1.field10247 = var5.field1223;
                } else {
                    arg1.field10247 = var5.field1263;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field1260 != -1) {
                arg1.field10247 = var5.field1260;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field1217 != -1) {
                arg1.field10247 = var5.field1217;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field1247 == -1) {
                arg1.field10247 = var5.field1222;
            } else {
                arg1.field10247 = var5.field1247;
            }
        } else if (var6 == 0 && arg1.field10222 <= 25) {
            if (arg4 == 2 && var5.field1209 != -1) {
                arg1.field10247 = var5.field1209;
            } else if (arg4 == 0 && var5.field1223 != -1) {
                arg1.field10247 = var5.field1223;
            } else {
                arg1.field10247 = var5.field1222;
            }
            arg1.field10304 = false;
        } else {
            if (arg4 == 2 && var5.field1209 != -1) {
                if (arg3 < 0 && var5.field1243 != -1) {
                    arg1.field10247 = var5.field1243;
                } else if (arg3 <= 0 || var5.field1221 == -1) {
                    arg1.field10247 = var5.field1209;
                } else {
                    arg1.field10247 = var5.field1221;
                }
            } else if (arg4 == 0 && var5.field1223 != -1) {
                if (arg3 < 0 && var5.field1214 != -1) {
                    arg1.field10247 = var5.field1214;
                } else if (arg3 <= 0 || var5.field1228 == -1) {
                    arg1.field10247 = var5.field1223;
                } else {
                    arg1.field10247 = var5.field1228;
                }
            } else if (arg3 < 0 && var5.field1210 != -1) {
                arg1.field10247 = var5.field1210;
            } else if (arg3 <= 0 || var5.field1264 == -1) {
                arg1.field10247 = var5.field1222;
            } else {
                arg1.field10247 = var5.field1264;
            }
            arg1.field10304 = false;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static final void method956(int arg0) {
        class362.field5097.method558(arg0);
        field1881++;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
    public static void method957(byte arg0) {
        field1874 = null;
        if (arg0 != -44) {
            method955(113, null, (byte) 71, -37, 112);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field1884++;
        class353.method2113(arg7 ? this.field1875 : null, arg2, this.field1880, arg3, arg0, arg7 ? this.field1877.field3969 : null, arg1, arg5, 0, this.field1877.field3929.field3163, this.field1883, arg4, arg6 ? this.field1877.field3929.field3165 : null);
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
    public static final void method958(int arg0) {
        class68.field833 = null;
        int var1 = -42 / ((-arg0 - 64) / 47);
        field1873++;
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lgf;Lhu;Lve;)V")
    public class116(class279 arg0, class133 arg1, class506 arg2) {
        this.field1877 = arg0;
        if ((arg1 instanceof class188)) {
            class188 var5 = (class188) arg1;
            this.field1878 = var5.field10473;
            this.field1880 = var5.field2830;
            this.field1883 = var5.field10452;
        } else if ((arg1 instanceof class522)) {
            class522 var4 = (class522) arg1;
            this.field1878 = var4.field10473;
            this.field1880 = var4.field6946;
            this.field1883 = var4.field10452;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field1876 = arg2;
            if (this.field1876.field6762 != this.field1883 || this.field1876.field6766 != this.field1878) {
                throw new RuntimeException();
            }
            this.field1875 = this.field1876.field6764;
        }
    }
}
