import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class97 extends class235 {

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lsb;")
    public class98 field1667;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lwa;")
    public static class219 field1664 = new class219(4096);

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[Lsb;")
    public static class98[] field1670 = new class98[1000];

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1671 = 0;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "Z")
    public static boolean field1672 = false;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JIII)Z")
    public static final boolean method694(long arg0, int arg1, int arg2, int arg3) {
        field1669++;
        int var5 = (int) arg0 >> 20 & 0x3;
        int var6 = (int) arg0 >> 14 & 0x1F;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class21 var8 = class125.method929(var7, (byte) -75);
            int var9 = var8.field391;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field397;
                var11 = var8.field398;
            } else {
                var10 = var8.field398;
                var11 = var8.field397;
            }
            if (var5 != 0) {
                var9 = (var9 >> 4 - var5) + (var9 << var5 & 0xF);
            }
            class87.method643(0, class163.field2943.field4491[0], var10, arg2 - 2103664179, var11, 2, var9, class163.field2943.field4501[0], true, 0, arg3, arg1);
        } else {
            class87.method643(var5, class163.field2943.field4491[0], 0, -2103675568, 0, 2, 0, class163.field2943.field4501[0], true, var6 + 1, arg3, arg1);
        }
        class228.field3923 = class139.field2471;
        class82.field1449 = class250.field4384;
        class51.field836 = 0;
        class108.field1932 = 2;
        if (arg2 != -11389) {
            method698(false, -9, -29, (byte[]) null, (class72[]) null, 99);
        }
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method695(int arg0) {
        field1664 = null;
        field1670 = null;
        if (arg0 != -24454) {
            field1671 = -7;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method696(int arg0) {
        class104.field1855 = arg0;
        class31.field557 = 0;
        class86.method638(2);
        field1666++;
        class56.method416(1);
        class249.method1730(arg0 ^ 0xFFFFFFF4);
        class105.method802((byte) -106);
        for (int var1 = 0; var1 < class31.field557; var1++) {
            int var3 = class115.field2071[var1];
            if (class236.field4071 != class141.field2499[var3].field4456) {
                if (class141.field2499[var3].field3360 > 0) {
                    class119.method883(class141.field2499[var3], (byte) -100);
                }
                class141.field2499[var3] = null;
            }
        }
        if (class47.field789 != class144.field2536.field3728) {
            throw new RuntimeException("gpp1 pos:" + class144.field2536.field3728 + " psize:" + class47.field789);
        }
        for (int var2 = 0; var2 < field1671; var2++) {
            if (class141.field2499[class51.field831[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + field1671);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
    public static final int method697(boolean arg0) {
        field1665++;
        if (arg0) {
            method696(92);
        }
        return ((class90.field1585 == 0 ? 0 : 1) << 22) + ((class167.field2978 == 0 ? 0 : 1) << 21) + ((class37.field627 == 0 ? 0 : 1) << 20) + (class120.field2184 & 0x3 << 17) + ((class115.field2062 ? 1 : 0) << 10) + ((class45.field749 ? 1 : 0) << 9) + ((class12.field238 ? 1 : 0) << 6) + ((class104.field1848 ? 1 : 0) << 5) + ((class85.field1497 ? 1 : 0) << 4) + ((class93.field1640 ? 1 : 0) << 3) + (class120.field2172 & 0x7) + (((class199.field3423 ? 1 : 0) << 7) - -((class91.field1593 ? 1 : 0) << 8) - -((class177.field3069 & 0x3) << 11)) + ((class158.field2873 ? 1 : 0) << 19) - (-((class229.field3932 ? 1 : 0) << 13) - (((class41.field679 ? 1 : 0) << 15) + ((class45.field747 ? 1 : 0) << 16)));
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII[B[Lqb;I)V")
    public static final void method698(boolean arg0, int arg1, int arg2, byte[] arg3, class72[] arg4, int arg5) {
        field1668++;
        int var6 = 109 % ((arg1 - 7) / 55);
        int var7 = -1;
        class216 var8 = new class216(arg3);
        while (true) {
            int var9 = var8.method1485(false);
            if (var9 == 0) {
                return;
            }
            var7 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var8.method1482(26084);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = (var10 & 0xFCB) >> 6;
                int var14 = var10 >> 12;
                int var15 = var8.method1446(5350);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg5 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    class72 var20 = null;
                    if (!arg0) {
                        int var21 = var14;
                        if ((class138.field2461[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg4[var21];
                        }
                    }
                    class148.method1094(var14, -30945, var19, var14, var17, var16, var7, arg0, var20, !arg0, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method699(Object arg0, boolean arg1, int arg2) {
        field1663++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class202.method1371(var3, 122) : var3;
        } else if (arg0 instanceof class6) {
            class6 var4 = (class6) arg0;
            return var4.method40(100);
        } else {
            if (arg2 != 3) {
                method694(108L, 90, -99, -38);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class97() {
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lsb;)V")
    public class97(class98 arg0) {
        this.field1667 = arg0;
    }
}
