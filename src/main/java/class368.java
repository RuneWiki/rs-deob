import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class368 {

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "Luf;")
    private class380 field4843 = new class380(128);

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "Lga;")
    private class332 field4839;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "[[I")
    public static int[][] field4840 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V", line = 8)
    public static void method2133(boolean arg0) {
        field4840 = null;
        if (arg0) {
            method2136(true);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZI)V", line = 23)
    public static final void method2134(boolean arg0, int arg1) {
        field4844++;
        class689.field9737++;
        class229 var2 = class97.method550(class71.field841, false, class140.field1907);
        class307.method1805(var2, -14704);
        for (class137 var3 = (class137) class152.field2079.method3053((byte) 80); var3 != null; var3 = (class137) class152.field2079.method3056(18113)) {
            if (!var3.method241(true)) {
                var3 = (class137) class152.field2079.method3053((byte) 81);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field1872 == 0) {
                class3.method17(arg1 - 1718294864, var3, true, arg0);
            }
        }
        if (class495.field6823 != null) {
            class552.method3091(class495.field6823, 12618);
            class495.field6823 = null;
        }
        if (arg1 != 0) {
            method2134(false, 118);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)Lhba;", line = 67)
    public final class440 method2135(int arg0, byte arg1) {
        field4841++;
        class380 var3 = this.field4843;
        class440 var4;
        synchronized (this.field4843) {
            var4 = (class440) this.field4843.method2176(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4839.method1938(class622.method3463(true, arg0), class687.method3887((byte) 125, arg0), -17);
        class440 var6 = new class440();
        if (var5 != null) {
            var6.method2478(new class157(var5), (byte) -28);
        }
        class380 var7 = this.field4843;
        synchronized (this.field4843) {
            if (arg1 >= -74) {
                this.field4839 = null;
            }
            this.field4843.method2174(var6, (long) arg0, (byte) -113);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Z)I", line = 96)
    public static final int method2136(boolean arg0) {
        if (!arg0) {
            return -67;
        }
        field4842++;
        if (class85.field1028 == null) {
            if (!class674.field9590 && class137.field1873 > 0) {
                if (class482.field6723 && class643.field8914.method2106((byte) -110, 81) && class137.field1873 > 2) {
                    return ((class354) class101.field1211.field5887.field547.field547).field4718;
                }
                return ((class354) class101.field1211.field5887.field547).field4718;
            }
            int var1 = class409.field5387.method1890(16777215);
            int var2 = class409.field5387.method1893((byte) 126);
            int var3 = class114.field1464;
            int var4 = class102.field1224;
            int var5 = class172.field2446;
            if (var3 < var1 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class137.field1873; var7++) {
                    if (class218.field2857) {
                        int var12 = (class137.field1873 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > (var12 - 13) && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class137.field1873 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class218 var9 = new class218(class101.field1211);
                    for (class354 var10 = (class354) var9.method1380(117); var10 != null; var10 = (class354) var9.method1383((byte) 1)) {
                        if (var6 == (var8++)) {
                            return var10.field4718;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIZII)V", line = 189)
    public static final void method2137(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        for (class502 var5 = (class502) class552.field7525.method2506(68); var5 != null; var5 = (class502) class552.field7525.method2505(-122)) {
            class50.method265(0, arg1, var5, arg0, arg3, arg4);
        }
        field4845++;
        for (class502 var6 = (class502) class598.field8232.method2506(68); var6 != null; var6 = (class502) class598.field8232.method2505(-111)) {
            byte var11 = 1;
            class266 var12 = var6.field6920.method1432(-1);
            if (var6.field6920.field3021) {
                var11 = 0;
            } else if (var6.field6920.field3067 == var12.field3451 || var6.field6920.field3067 == var12.field3454 || var6.field6920.field3067 == var12.field3449 || var6.field6920.field3067 == var12.field3460) {
                var11 = 2;
            } else if (var6.field6920.field3067 == var12.field3442 || var6.field6920.field3067 == var12.field3470 || var6.field6920.field3067 == var12.field3487 || var6.field6920.field3067 == var12.field3483) {
                var11 = 3;
            }
            if (var6.field6900 != var11) {
                int var13 = class273.method1644(13600, var6.field6920);
                class384 var14 = var6.field6920.field4671;
                if (var14.field5121 != null) {
                    var14 = var14.method2203(3, class564.field7696);
                }
                if (var14 == null || var13 == -1) {
                    var6.field6922 = false;
                    var6.field6894 = -1;
                } else if (var6.field6894 != var13 || var14.field5088 != var6.field6922) {
                    if (var6.field6915 != null) {
                        class126.field1759.method1345(var6.field6915);
                        var6.field6915 = null;
                    }
                    var6.field6917 = null;
                    var6.field6922 = var14.field5088;
                    var6.field6910 = null;
                    var6.field6894 = var13;
                }
                var6.field6900 = var11;
            }
            var6.field6919 = var6.field6920.field398;
            var6.field6904 = var6.field6920.field398 + (var6.field6920.method1435((byte) 95) << 8);
            var6.field6907 = var6.field6920.field397;
            var6.field6891 = var6.field6920.field397 + (var6.field6920.method1435((byte) 123) << 8);
            class50.method265(0, arg1, var6, arg0, arg3, arg4);
        }
        for (class502 var7 = (class502) class140.field1903.method3053((byte) 95); var7 != null; var7 = (class502) class140.field1903.method3056(18113)) {
            byte var8 = 1;
            class266 var9 = var7.field6909.method1432(-1);
            if (var7.field6909.field3021) {
                var8 = 0;
            } else if (var7.field6909.field3067 == var9.field3451 || var7.field6909.field3067 == var9.field3454 || var7.field6909.field3067 == var9.field3449 || var7.field6909.field3067 == var9.field3460) {
                var8 = 2;
            } else if (var7.field6909.field3067 == var9.field3442 || var7.field6909.field3067 == var9.field3470 || var7.field6909.field3067 == var9.field3487 || var7.field6909.field3067 == var9.field3483) {
                var8 = 3;
            }
            if (var7.field6900 != var8) {
                int var10 = class580.method3197(var7.field6909, 0);
                if (var7.field6894 != var10 || var7.field6909.field7802 != var7.field6922) {
                    if (var7.field6915 != null) {
                        class126.field1759.method1345(var7.field6915);
                        var7.field6915 = null;
                    }
                    var7.field6910 = null;
                    var7.field6917 = null;
                    var7.field6894 = var10;
                    var7.field6922 = var7.field6909.field7802;
                }
                var7.field6900 = var8;
            }
            var7.field6919 = var7.field6909.field398;
            var7.field6904 = var7.field6909.field398 + (var7.field6909.method1435((byte) 112) << 8);
            var7.field6907 = var7.field6909.field397;
            var7.field6891 = var7.field6909.field397 + (var7.field6909.method1435((byte) 72) << 8);
            class50.method265(0, arg1, var7, arg0, arg3, arg4);
        }
        if (arg2) {
            field4840 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 325)
    public class368(class650 arg0, int arg1, class332 arg2) {
        this.field4839 = arg2;
        if (this.field4839 != null) {
            int var4 = this.field4839.method1933(-122) - 1;
            this.field4839.method1939(0, var4);
        }
    }
}
