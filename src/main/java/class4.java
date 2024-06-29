import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
    public static boolean field31 = false;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "B")
    public byte field27;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "B")
    public byte field29;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "B")
    public byte field33;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "B")
    public byte field40;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lug;")
    public static class321 field32;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "S")
    public short field28;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Z")
    public boolean field30;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
    public boolean field34;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Z")
    public boolean field41;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Z")
    public boolean field44;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Z")
    public boolean field45;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)Lcn;", line = 9)
    public static final class281 method15(int arg0, byte arg1) {
        field39++;
        class281 var2 = (class281) class101.field1543.method1619((long) arg0, 96);
        if (var2 != null) {
            return var2;
        }
        int var3 = 117 / ((-arg1 - 47) / 50);
        byte[] var4 = class342.field5322.method250(true, 29, arg0);
        class281 var5 = new class281();
        if (var4 != null) {
            var5.method1994(arg0, new class192(var4), -14903);
        }
        class101.field1543.method1621((long) arg0, 61, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZIII)V", line = 41)
    public static final void method16(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field36++;
        if (!arg4) {
            field35 = 64;
        }
        if (arg0 == arg6) {
            class245.method1737(arg3, arg7, (byte) -114, arg0, arg1, arg5, arg2);
        } else if ((arg1 - arg0) >= class224.field3575 && arg1 + arg0 <= class231.field3697 && class233.field3721 <= (arg5 - arg6) && (arg5 + arg6) <= class235.field3735) {
            class138.method934(arg6, arg2, arg0, arg1, arg5, arg7, arg3, (byte) 38);
        } else {
            class99.method701(arg6, arg1, arg3, arg2, arg0, arg7, arg5, -22030);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 72)
    public static void method17(byte arg0) {
        field32 = null;
        int var1 = -106 % ((arg0 + 70) / 48);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZIZIZLsh;I)Lug;", line = 91)
    public static final class321 method18(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, boolean arg6, class303 arg7, int arg8) {
        class74 var9 = class31.method198(false, arg5);
        if (arg1 > 1 && var9.field957 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field937[var11] && var9.field937[var11] != 0) {
                    var10 = var9.field957[var11];
                }
            }
            if (var10 != -1) {
                var9 = class31.method198(false, var10);
            }
        }
        field42++;
        class76 var12 = var9.method474(arg7, false);
        if (var12 == null) {
            return null;
        }
        class298 var13 = null;
        if (var9.field928 != -1) {
            var13 = (class298) method18(127, 10, true, 1, true, var9.field967, false, arg7, 0);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field974 != -1) {
            var13 = (class298) method18(123, arg1, false, arg3, true, var9.field947, false, arg7, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class216.field3480;
        int[] var15 = new int[4];
        int var16 = class216.field3487;
        int var17 = class216.field3482;
        class216.method1574(var15);
        class298 var18 = new class298(36, 32);
        class216.method1572(var18.field4659, 36, 32);
        class25.method166();
        class25.method164(16, 16);
        int var19 = var9.field963;
        class25.field361 = false;
        if (arg0 <= 115) {
            method16(125, 14, -120, -61, true, -50, -62, 105);
        }
        if (arg2) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg3 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class25.field359[var9.field945] * var19 >> 16;
        int var21 = class25.field355[var9.field945] * var19 >> 16;
        var12.method499(0, var9.field942, var9.field929, var9.field945, var9.field930, var21 + (var9.field954 - (var12.method152() / 2)), var9.field954 + var20, -1L);
        if (arg3 >= 1) {
            var18.method2070(1);
            if (arg3 >= 2) {
                var18.method2070(16777215);
            }
            class216.method1572(var18.field4659, 36, 32);
        }
        if (arg8 != 0) {
            var18.method2073(arg8);
        }
        if (var9.field928 != -1) {
            var13.method84(0, 0);
        } else if (var9.field974 != -1) {
            class216.method1572(var13.field4659, 36, 32);
            var18.method84(0, 0);
            var18 = var13;
        }
        if (arg6 && (var9.field960 == 1 || arg1 != 1) && arg1 != -1) {
            class255.field4044.method1009(class125.method865((byte) -112, arg1), 0, 9, 16776960, 1);
        }
        class216.method1572(var14, var17, var16);
        class216.method1586(var15);
        class25.method166();
        class25.field361 = true;
        return class186.field2991 && !arg4 ? new class14(var18) : var18;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILim;Lgn;)V", line = 226)
    public static final void method19(int arg0, int arg1, class192 arg2, class6 arg3) {
        field38++;
        if (arg0 != -22291) {
            return;
        }
        class226 var4 = new class226();
        var4.field3593 = arg2.method1399(-1172389784);
        var4.field3596 = arg2.method1354((byte) -115);
        var4.field3595 = new int[var4.field3593];
        var4.field3588 = new class217[var4.field3593];
        var4.field3590 = new int[var4.field3593];
        var4.field3599 = new int[var4.field3593];
        var4.field3592 = new class217[var4.field3593];
        var4.field3594 = new byte[var4.field3593][][];
        for (int var5 = 0; var5 < var4.field3593; var5++) {
            try {
                int var6 = arg2.method1399(arg0 - 1172367493);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1355((byte) 124);
                    int var8 = 0;
                    String var9 = arg2.method1355((byte) 61);
                    if (var6 == 1) {
                        var8 = arg2.method1354((byte) -128);
                    }
                    var4.field3595[var5] = var6;
                    var4.field3599[var5] = var8;
                    var4.field3588[var5] = arg3.method39((byte) 55, var9, client.method1893(255, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1355((byte) 123);
                    String var11 = arg2.method1355((byte) 91);
                    int var12 = arg2.method1399(-1172389784);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1355((byte) 96);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1354((byte) -127);
                            var15[var16] = new byte[var17];
                            arg2.method1409((byte) 67, var15[var16], var17, 0);
                        }
                    }
                    var4.field3595[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = client.method1893(class35.method228(arg0, -22510), var13[var19]);
                    }
                    var4.field3592[var5] = arg3.method34(class35.method228(arg0, -511), var11, var18, client.method1893(255, var10));
                    var4.field3594[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field3590[var5] = -1;
            } catch (SecurityException var26) {
                var4.field3590[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field3590[var5] = -3;
            } catch (Exception var28) {
                var4.field3590[var5] = -4;
            } catch (Throwable var29) {
                var4.field3590[var5] = -5;
            }
        }
        class59.field775.method1815((byte) -124, var4);
    }
}
