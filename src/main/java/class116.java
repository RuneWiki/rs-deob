import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class116 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[I")
    public static int[] field1690 = new int[32];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[Z")
    public static boolean[] field1694;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lnm;")
    public static class221 field1697;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lnm;")
    public static class221 field1698;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    public static int[] field1693;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
    public static int[] field1696;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 7)
    public static void method754(byte arg0) {
        field1693 = null;
        field1698 = null;
        field1697 = null;
        field1694 = null;
        field1690 = null;
        int var1 = -21 % ((76 - arg0) / 43);
        field1696 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[B)Llk;", line = 32)
    public static final class280 method755(int arg0, byte[] arg1) {
        field1691++;
        class280 var2 = new class280();
        class313 var3 = new class313(arg1);
        var3.field5137 = var3.field5124.length - 2;
        int var4 = var3.method2250(arg0 ^ 0xCA1019A8);
        int var5 = var3.field5124.length - var4 - 2 - 12;
        var3.field5137 = var5;
        int var6 = var3.method2231((byte) -124);
        var2.field4616 = var3.method2250(-1613178296);
        var2.field4606 = var3.method2250(-1613178296);
        if (arg0 != 1439220704) {
            field1690 = (int[]) null;
        }
        var2.field4605 = var3.method2250(-1613178296);
        var2.field4610 = var3.method2250(-1613178296);
        int var7 = var3.method2224(arg0 - 1439220827);
        if (var7 > 0) {
            var2.field4615 = new class4[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2250(-1613178296);
                class4 var10 = new class4(class329.method2347(var9, (byte) -96));
                var2.field4615[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2231((byte) -126);
                    int var12 = var3.method2231((byte) -126);
                    var10.method37(false, new class94(var12), (long) var11);
                }
            }
        }
        var3.field5137 = 0;
        var2.field4603 = var3.method2247(1159038341);
        var2.field4611 = new int[var6];
        var2.field4604 = new int[var6];
        int var13 = 0;
        var2.field4602 = new String[var6];
        while (var5 > var3.field5137) {
            int var14 = var3.method2250(-1613178296);
            if (var14 == 3) {
                var2.field4602[var13] = var3.method2198(-430).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field4604[var13] = var3.method2224(-124);
            } else {
                var2.field4604[var13] = var3.method2231((byte) -128);
            }
            var2.field4611[var13++] = var14;
        }
        return var2;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1690[var1] = var0 - 1;
            var0 += var0;
        }
        field1694 = new boolean[100];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIBIII)Z", line = 117)
    public static final boolean method756(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field1699++;
        long var8 = class47.method355(arg6, arg1 + arg7, arg2 + arg5);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x34E309) >> 20;
            int var11 = ((int) var8 & 0x7C4E8) >> 14;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class126 var13 = class165.method1155((byte) 99, var12);
            if (var13.field1922 == -1) {
                int[] var14 = class317.field5228;
                int var15 = arg3;
                if (var8 > 0L) {
                    var15 = arg0;
                }
                int var16 = arg1 * 4 + ((-arg2 + 103) * 512 * 4) + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 1) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 512 + 3] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1537] = var15;
                        var14[var16 + 1538] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 515] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
            } else if (!class20.method123(arg2, var10, (byte) 81, arg1, var13, arg7, arg5)) {
                return false;
            }
        }
        if (arg4 != -125) {
            return false;
        }
        long var17 = class113.method743(arg6, arg1 + arg7, arg2 + arg5);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3FB9EF) >> 20;
            int var20 = ((int) var17 & 0x7C829) >> 14;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class126 var22 = class165.method1155((byte) -106, var21);
            if (var22.field1922 == -1) {
                if (var20 == 9) {
                    int var23 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
                    int[] var24 = class317.field5228;
                    int var25 = 15658734;
                    if (var17 > 0L) {
                        var25 = 15597568;
                    }
                    if (var19 == 0 || var19 == 2) {
                        var24[var23 + 1536] = var25;
                        var24[var23 + 1024 + 1] = var25;
                        var24[var23 + 512 + 2] = var25;
                        var24[var23 + 3] = var25;
                    } else {
                        var24[var23] = var25;
                        var24[var23 + 512 + 1] = var25;
                        var24[var23 + 1024 + 2] = var25;
                        var24[var23 + 1539] = var25;
                    }
                }
            } else if (!class20.method123(arg2, var19, (byte) 81, arg1, var22, arg7, arg5)) {
                return false;
            }
        }
        long var26 = class13.method96(arg6, arg1 + arg7, arg2 + arg5);
        if (var26 != 0L) {
            int var28 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class126 var29 = class165.method1155((byte) 119, var28);
            int var30 = ((int) var26 & 0x3CB437) >> 20;
            if (var29.field1922 != -1 && !class20.method123(arg2, var30, (byte) 71, arg1, var29, arg7, arg5)) {
                return false;
            }
        }
        return true;
    }
}
