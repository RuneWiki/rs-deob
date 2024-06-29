import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class209 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Z")
    public static boolean field3961 = false;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Li;")
    public static class88 field3974 = class208.method1425(105, "");

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Li;")
    public static class88 field3969 = field3974;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Li;")
    public static class88 field3972 = field3974;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Li;")
    public static class88 field3965 = field3974;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Li;")
    public static class88 field3978 = class208.method1425(105, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Li;")
    public static class88 field3981 = field3974;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Li;")
    public static class88 field3982 = field3974;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Li;")
    public static class88 field3984 = class208.method1425(105, "(Y<)4col>");

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Li;")
    public static class88 field3983 = field3974;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "J")
    private long field3976;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "J")
    private long field3980;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lnb;")
    public static class144 field3970;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Z")
    public boolean field3959;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[I")
    private int[] field3964;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[I")
    private int[] field3968;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
    public final int method1429(int arg0) {
        field3973++;
        if (arg0 <= 13) {
            return 65;
        } else if (this.field3977 == -1) {
            return (this.field3968[11] << 5) + (this.field3964[0] << 25) + (this.field3964[4] << 20) + (this.field3968[0] << 15) + (this.field3968[8] << 10) + this.field3968[1];
        } else {
            return class147.method987(this.field3977, -117).field2316 + 305419896;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLk;I)Lcg;")
    public final class30 method1430(byte arg0, class109 arg1, int arg2) {
        field3966++;
        if (this.field3977 != -1) {
            return class147.method987(this.field3977, -97).method866(arg2, 0, arg1);
        }
        if (arg0 != 113) {
            this.method1434((byte) 46, -109, 41);
        }
        class30 var4 = (class30) class142.field2618.method135(-126, this.field3976);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field3968[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class103.method712(var15 & 0x3FFFFFFF, 3).method1547((byte) -122)) {
                        var5 = true;
                    }
                } else if (!class71.method472(var15 & 0x3FFFFFFF, (byte) -114).method1017(this.field3959, 115)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class82[] var8 = new class82[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field3968[var9];
                if ((var12 & 0x40000000) != 0) {
                    class82 var14 = class71.method472(var12 & 0x3FFFFFFF, (byte) -96).method1018((byte) 82, this.field3959);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class82 var13 = class103.method712(var12 & 0x3FFFFFFF, 3).method1545(true);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class82 var10 = new class82(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field3964[var11] < class7.field96[var11].length) {
                    var10.method564(class14.field219[var11], class7.field96[var11][this.field3964[var11]]);
                }
                if (this.field3964[var11] < class87.field1596[var11].length) {
                    var10.method564(class146.field2752[var11], class87.field1596[var11][this.field3964[var11]]);
                }
            }
            var4 = var10.method546(64, 768, -50, -10, -50);
            class142.field2618.method130(37, this.field3976, var4);
        }
        if (arg1 != null) {
            var4 = arg1.method760(arg2, var4, (byte) -83);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    private final void method1431(int arg0) {
        field3963++;
        long var2 = this.field3976;
        this.field3976 = -1L;
        long[] var4 = class141.field2610;
        for (int var5 = arg0; var5 < 12; var5++) {
            this.field3976 = var4[(int) (((long) (this.field3968[var5] >> 24) ^ this.field3976) & 0xFFL)] ^ this.field3976 >>> 8;
            this.field3976 = this.field3976 >>> 8 ^ var4[(int) (((long) (this.field3968[var5] >> 16) ^ this.field3976) & 0xFFL)];
            this.field3976 = this.field3976 >>> 8 ^ var4[(int) (((long) (this.field3968[var5] >> 8) ^ this.field3976) & 0xFFL)];
            this.field3976 = this.field3976 >>> 8 ^ var4[(int) (((long) this.field3968[var5] ^ this.field3976) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3976 = var4[(int) (((long) this.field3964[var6] ^ this.field3976) & 0xFFL)] ^ this.field3976 >>> 8;
        }
        this.field3976 = var4[(int) ((this.field3976 ^ (long) (this.field3959 ? 1 : 0)) & 0xFFL)] ^ this.field3976 >>> 8;
        if (var2 != 0L && this.field3976 != var2) {
            class93.field1741.method133(false, var2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lk;IIILk;)Lcg;")
    public final class30 method1432(class109 arg0, int arg1, int arg2, int arg3, class109 arg4) {
        field3979++;
        if (this.field3977 != -1) {
            return class147.method987(this.field3977, -113).method867(0, arg0, arg3, arg2, arg4);
        }
        long var6 = this.field3976;
        int[] var8 = this.field3968;
        if (arg4 != null && (arg4.field2002 >= 0 || arg4.field1977 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3968[var9];
            }
            if (arg4.field2002 >= 0) {
                if (arg4.field2002 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class204.method1405(1073741824, arg4.field2002);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg4.field1977 >= 0) {
                if (arg4.field1977 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class204.method1405(arg4.field1977, 1073741824);
                    var6 ^= var8[3];
                }
            }
        }
        class30 var10 = (class30) class93.field1741.method135(-103, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class103.method712(var30 & 0x3FFFFFFF, 3).method1549((byte) -118)) {
                        var11 = true;
                    }
                } else if (!class71.method472(var30 & 0x3FFFFFFF, (byte) -92).method1024(this.field3959, (byte) -113)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3980 != -1L) {
                    var10 = (class30) class93.field1741.method135(arg1 - 1549114430, this.field3980);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class82[] var13 = new class82[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class82 var28 = class71.method472(var27 & 0x3FFFFFFF, (byte) -118).method1013(this.field3959, 71);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class82 var29 = class103.method712(var27 & 0x3FFFFFFF, 3).method1542(255);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class149 var17 = class71.method472(var16 & 0x3FFFFFFF, (byte) -117);
                    if (var17.field2841 != null) {
                        for (int var18 = 0; var18 < var17.field2841.length; var18++) {
                            int var19 = var17.field2841[var18][1];
                            int var20 = var17.field2841[var18][3];
                            int var21 = var17.field2841[var18][0];
                            int var22 = var17.field2841[var18][2];
                            int var23 = var17.field2841[var18][4];
                            int var24 = var17.field2841[var18][5];
                            var13[var18 + 1].method549(var21, var19, var22);
                            var13[var18 + 1].method565(var20, var23, var24);
                        }
                    }
                }
                class82 var25 = new class82(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field3964[var26] < class7.field96[var26].length) {
                        var25.method564(class14.field219[var26], class7.field96[var26][this.field3964[var26]]);
                    }
                    if (class87.field1596[var26].length > this.field3964[var26]) {
                        var25.method564(class146.field2752[var26], class87.field1596[var26][this.field3964[var26]]);
                    }
                }
                var10 = var25.method546(64, 850, -30, -50, -30);
                class93.field1741.method130(37, var6, var10);
                this.field3980 = var6;
            }
        }
        if (arg4 == null && arg0 == null) {
            return var10;
        }
        class30 var31;
        if (arg4 != null && arg0 != null) {
            var31 = arg4.method756(arg2, arg0, arg3, (byte) 82, var10);
        } else if (arg4 == null) {
            var31 = arg0.method752(65535, arg3, var10);
        } else {
            var31 = arg4.method752(arg1 - 1549048777, arg2, var10);
        }
        return arg1 == 1549114312 ? var31 : null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ[I[IZ)V")
    public final void method1433(int arg0, boolean arg1, int[] arg2, int[] arg3, boolean arg4) {
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class23.field374; var7++) {
                    class231 var8 = class103.method712(var7, 3);
                    if (var8 != null && !var8.field4339 && var6 + (arg4 ? 7 : 0) == var8.field4343) {
                        arg2[class55.field1023[var6]] = class204.method1405(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3968 = arg2;
        this.field3964 = arg3;
        if (!arg1) {
            this.field3959 = arg4;
            field3971++;
            this.field3977 = arg0;
            this.method1431(0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)V")
    public final void method1434(byte arg0, int arg1, int arg2) {
        this.field3964[arg2] = arg1;
        int var4 = 83 % ((-arg0 - 16) / 51);
        field3962++;
        this.method1431(0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1435(byte arg0) {
        field3981 = null;
        field3982 = null;
        field3974 = null;
        field3972 = null;
        field3984 = null;
        field3970 = null;
        field3978 = null;
        field3969 = null;
        int var1 = -49 / ((-arg0 - 5) / 62);
        field3965 = null;
        field3983 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
    public final void method1436(int arg0, boolean arg1) {
        if (arg0 == 11) {
            field3960++;
            this.field3959 = arg1;
            this.method1431(0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)V")
    public final void method1437(int arg0, byte arg1, int arg2) {
        int var4 = class55.field1023[arg0];
        field3958++;
        if (arg1 < -21 && (this.field3968[var4] != 0 && class103.method712(arg2, 3) != null)) {
            this.field3968[var4] = class204.method1405(Integer.MIN_VALUE, arg2);
            this.method1431(0);
        }
    }
}
