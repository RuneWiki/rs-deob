import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class85 {

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Luc;")
    private class58 field951 = new class58(256);

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Luc;")
    private class58 field958 = new class58(256);

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lam;")
    private class286 field954;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lam;")
    private class286 field949;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
    public static int[] field946 = new int[32];

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[Lc;")
    public static class158[] field957;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method460(int arg0) {
        field944++;
        if (class351.field4913 == 0) {
            return;
        }
        if (arg0 != 0) {
            method462(true);
        }
        try {
            if ((++class428.field6286) > 2000) {
                if (class264.field3605 != null) {
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                }
                if (class309.field4181 >= 1) {
                    class388.field5529 = -5;
                    class351.field4913 = 0;
                    return;
                }
                if (class379.field5353 == class359.field5077) {
                    class379.field5353 = class73.field813;
                } else {
                    class379.field5353 = class359.field5077;
                }
                class428.field6286 = 0;
                class309.field4181++;
                class351.field4913 = 1;
            }
            if (class351.field4913 == 1) {
                class77.field875 = class159.field2055.method2783(class379.field5353, arg0, class420.field6136);
                class351.field4913 = 2;
            }
            if (class351.field4913 == 2) {
                if (class77.field875.field4123 == 2) {
                    throw new IOException();
                }
                if (class77.field875.field4123 != 1) {
                    return;
                }
                class264.field3605 = new class278((Socket) class77.field875.field4126, class159.field2055);
                class77.field875 = null;
                class264.field3605.method1537(class281.field3857.field3406, false, class281.field3857.field3389, 0);
                if (class281.field3855 != null) {
                    class281.field3855.method2153(-73);
                }
                if (class414.field5973 != null) {
                    class414.field5973.method2153(arg0 ^ 0xFFFFFFBF);
                }
                int var1 = class264.field3605.method1540(1824);
                if (class281.field3855 != null) {
                    class281.field3855.method2153(arg0 ^ 0xFFFFFF8D);
                }
                if (class414.field5973 != null) {
                    class414.field5973.method2153(arg0 - 109);
                }
                if (var1 != 21) {
                    class388.field5529 = var1;
                    class351.field4913 = 0;
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                    return;
                }
                class351.field4913 = 3;
            }
            if (class351.field4913 == 3) {
                if (class264.field3605.method1539(-32565) < 1) {
                    return;
                }
                class96.field1144 = new String[class264.field3605.method1540(1824)];
                class351.field4913 = 4;
            }
            if (class351.field4913 == 4 && class264.field3605.method1539(arg0 - 32565) >= class96.field1144.length * 8) {
                class448.field6514.field3389 = 0;
                class264.field3605.method1529(class448.field6514.field3406, class96.field1144.length * 8, -18094, 0);
                for (int var2 = 0; var2 < class96.field1144.length; var2++) {
                    class96.field1144[var2] = class322.method1863(class448.field6514.method1379(class379.method2318(arg0, -948919160)), (byte) -102);
                }
                class388.field5529 = 21;
                class351.field4913 = 0;
                class264.field3605.method1538((byte) 5);
                class264.field3605 = null;
            }
        } catch (IOException var3) {
            if (class264.field3605 != null) {
                class264.field3605.method1538((byte) 5);
                class264.field3605 = null;
            }
            if (class309.field4181 >= 1) {
                class388.field5529 = -4;
                class351.field4913 = 0;
            } else {
                class309.field4181++;
                class428.field6286 = 0;
                class351.field4913 = 1;
                if (class379.field5353 == class359.field5077) {
                    class379.field5353 = class73.field813;
                } else {
                    class379.field5353 = class359.field5077;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z[III)Lwo;")
    private final class52 method461(boolean arg0, int[] arg1, int arg2, int arg3) {
        field945++;
        int var5 = (arg2 >>> 12 | (arg2 & 0xC0000FFF) << 4) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class52 var9 = (class52) this.field958.method308(var7, (byte) -107);
        if (var9 != null) {
            return var9;
        } else if (arg1 != null && arg1[0] <= 0) {
            return null;
        } else if (arg0) {
            class93 var10 = class93.method511(this.field954, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class52 var11 = var10.method509();
            this.field958.method314(var7, var11, 7079);
            if (arg1 != null) {
                arg1[0] -= var11.field504.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method462(boolean arg0) {
        if (arg0) {
            field957 = null;
        }
        field946 = null;
        field957 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method463(String arg0, boolean arg1) {
        field956++;
        if (!arg1) {
            method468(false, -99);
        }
        for (int var2 = 0; var2 < class299.field4081.length; var2++) {
            if (class299.field4081[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIIIIZ)V")
    public static final void method464(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field947++;
        if (!arg0 && class296.field4016 == arg6 && class242.field3289 == arg5 && class351.field4891 == arg4 || class138.method758(-10762)) {
            return;
        }
        class242.field3289 = arg5;
        class351.field4891 = arg4;
        class296.field4016 = arg6;
        if (class138.method758(-10762)) {
            class351.field4891 = 0;
        }
        if (arg7) {
            class352.method2159(28, (byte) 65);
        } else {
            class352.method2159(25, (byte) 65);
        }
        class88.method484(class105.field1296, arg3, class337.field4499, true);
        int var8 = class70.field767;
        int var9 = class291.field3961;
        class70.field767 = (class296.field4016 - (class315.field4214 >> 4)) * 8;
        class291.field3961 = (class242.field3289 - (class340.field4549 >> 4)) * 8;
        class441.field6439 = class443.method2741(class296.field4016 * 8, class242.field3289 * 8);
        class448.field6516 = null;
        int var10 = class70.field767 - var8;
        int var11 = class291.field3961 - var9;
        if (arg7) {
            class244.field3320 = 0;
            int var15 = class315.field4214 * 128 - 128;
            int var16 = class340.field4549 * 128 - 128;
            for (int var17 = 0; var17 < 32768; var17++) {
                class91 var22 = class38.field397[var17];
                if (var22 != null) {
                    var22.field152 -= var10 * 128;
                    var22.field154 -= var11 * 128;
                    if (var22.field152 >= 0 && var15 >= var22.field152 && var22.field154 >= 0 && var22.field154 <= var16) {
                        boolean var23 = true;
                        for (int var24 = 0; var24 < 10; var24++) {
                            var22.field6119[var24] -= var10;
                            var22.field6109[var24] -= var11;
                            if (var22.field6119[var24] < 0 || var22.field6119[var24] >= class315.field4214 || var22.field6109[var24] < 0 || var22.field6109[var24] >= class340.field4549) {
                                var23 = false;
                            }
                        }
                        if (var23) {
                            class308.field4175[class244.field3320++] = var17;
                        } else {
                            class38.field397[var17].method503((class345) null, -31893);
                            class38.field397[var17] = null;
                        }
                    } else {
                        class38.field397[var17].method503((class345) null, arg3 - 31893);
                        class38.field397[var17] = null;
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < 32768; var12++) {
                class91 var13 = class38.field397[var12];
                if (var13 != null) {
                    for (int var14 = 0; var14 < 10; var14++) {
                        var13.field6119[var14] -= var10;
                        var13.field6109[var14] -= var11;
                    }
                    var13.field154 -= var11 * 128;
                    var13.field152 -= var10 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class158 var20 = field957[var18];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field6119[var21] -= var10;
                    var20.field6109[var21] -= var11;
                }
                var20.field152 -= var10 * 128;
                var20.field154 -= var11 * 128;
            }
        }
        class263.field3592 = arg4;
        class427.field6264.method853(class263.field3592, (byte) 77, arg2, false, arg1);
        class56.method292(123, var11, var10);
        for (class436 var19 = (class436) class308.field4167.method814((byte) 90); var19 != null; var19 = (class436) class308.field4167.method827(-127)) {
            var19.field6386 -= var11;
            var19.field6378 -= var10;
            if (var19.field6378 < 0 || var19.field6386 < 0 || var19.field6378 >= class315.field4214 || class340.field4549 <= var19.field6386) {
                var19.method1967(-1);
            }
        }
        class119.field1487 = 0;
        if (class324.field4321 != arg3) {
            class149.field1894 -= var11;
            class324.field4321 -= var10;
        }
        if (arg7) {
            class127.field1633 -= var10 * 128;
            class330.field4397 -= var11;
            class180.field2272 -= var11 * 128;
            class128.field1654 -= var10;
            class324.field4324 -= var10;
            class139.field1781 -= var11;
            if (Math.abs(var10) > class315.field4214 || Math.abs(var11) > class340.field4549) {
                class232.method1258(95);
            }
        } else if (class294.field3993 == 4) {
            class275.field3706 -= var11 * 128;
            class274.field3698 -= var10 * 128;
            class449.field6526 -= var10 * 128;
            class91.field1030 -= var11 * 128;
        } else {
            class294.field3993 = 1;
        }
        class116.method630((byte) -60);
        class131.field1687.method829(false);
        class401.field5852.method829(false);
        class118.field1467.method989(1);
        class432.method2679((byte) -84);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([III)Lwo;")
    public final class52 method465(int[] arg0, int arg1, int arg2) {
        field948++;
        if (this.field949.method1676(82) == 1) {
            return this.method466(1013445904, 0, arg0, arg2);
        } else if (this.field949.method1691(arg2, 0) == 1) {
            return this.method466(arg1 ^ 0x3C67F590, arg2, arg0, 0);
        } else if (arg1 == 128) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[II)Lwo;")
    private final class52 method466(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != 1013445904) {
            this.field954 = null;
        }
        field943++;
        int var5 = arg3 ^ ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class52 var9 = (class52) this.field958.method308(var7, (byte) -125);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var10 = (class102) this.field951.method308(var7, (byte) -106);
            if (var10 == null) {
                var10 = class102.method545(this.field949, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field951.method314(var7, var10, arg0 - 1013438825);
            }
            class52 var11 = var10.method549(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1967(-1);
                this.field958.method314(var7, var11, 7079);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([III)Lwo;")
    public final class52 method467(int[] arg0, int arg1, int arg2) {
        field955++;
        if (this.field954.method1676(84) == 1) {
            return this.method461(true, arg0, 0, arg2);
        } else if (this.field954.method1691(arg2, 0) == 1) {
            return this.method461(true, arg0, arg2, 0);
        } else {
            if (arg1 != 21) {
                this.method466(-42, 72, (int[]) null, 22);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
    public static final void method468(boolean arg0, int arg1) {
        field950++;
        class398.field5748 = arg0;
        if (class398.field5748) {
            int var17 = class448.field6514.method1364(90);
            boolean var18 = class448.field6514.method1331(true) == 1;
            int var19 = class448.field6514.method1356((byte) -52);
            int var20 = class448.field6514.method1331(true);
            int var21 = class448.field6514.method1387(-2);
            int var22 = class448.field6514.method1374(-2);
            int var23 = class448.field6514.method1334(-17290);
            class194.method1045(true, var20);
            class448.field6514.method297(false);
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var39 = 0; var39 < (class315.field4214 >> 3); var39++) {
                    for (int var40 = 0; var40 < class340.field4549 >> 3; var40++) {
                        int var41 = class448.field6514.method305(1, arg1 ^ 0xFFFFE04F);
                        if (var41 == 1) {
                            class94.field1085[var24][var39][var40] = class448.field6514.method305(26, class379.method2318(arg1, -8113));
                        } else {
                            class94.field1085[var24][var39][var40] = -1;
                        }
                    }
                }
            }
            class448.field6514.method299((byte) 76);
            int var25 = (class161.field2065 - class448.field6514.field3389) / 16;
            class432.field6336 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var38 = 0; var38 < 4; var38++) {
                    class432.field6336[var26][var38] = class448.field6514.method1359(class379.method2318(arg1, 127));
                }
            }
            class65.field681 = new byte[var25][];
            class297.field4042 = new byte[var25][];
            class452.field6576 = new int[var25];
            class140.field1796 = null;
            class110.field1363 = new int[var25];
            class296.field4037 = null;
            class295.field4011 = new byte[var25][];
            class405.field5893 = new int[var25];
            class105.field1293 = new byte[var25][];
            class248.field3340 = new int[var25];
            class138.field1777 = new int[var25];
            int var27 = 0;
            for (int var28 = 0; var28 < 4; var28++) {
                for (int var29 = 0; var29 < class315.field4214 >> 3; var29++) {
                    for (int var30 = 0; var30 < (class340.field4549 >> 3); var30++) {
                        int var31 = class94.field1085[var28][var29][var30];
                        if (var31 != -1) {
                            int var32 = (var31 & 0xFFE32C) >> 14;
                            int var33 = (var31 & 0x3FFB) >> 3;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < var27; var35++) {
                                if (class138.field1777[var35] == var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                class138.field1777[var27] = var34;
                                int var36 = (var34 & 0xFFB7) >> 8;
                                int var37 = var34 & 0xFF;
                                class452.field6576[var27] = class371.field5195.method1700("m" + var36 + "_" + var37, (byte) -70);
                                class248.field3340[var27] = class371.field5195.method1700("l" + var36 + "_" + var37, (byte) -70);
                                class110.field1363[var27] = class371.field5195.method1700("um" + var36 + "_" + var37, (byte) -70);
                                class405.field5893[var27] = class371.field5195.method1700("ul" + var36 + "_" + var37, (byte) -70);
                                var27++;
                            }
                        }
                    }
                }
            }
            method464(var18, var22, var23, 0, var21, var19, var17, false);
        } else {
            boolean var2 = class448.field6514.method1387(-2) == 1;
            int var3 = class448.field6514.method1364(90);
            int var4 = class448.field6514.method1364(90);
            int var5 = class448.field6514.method1387(-2);
            int var6 = class448.field6514.method1364(90);
            int var7 = (class161.field2065 - class448.field6514.field3389) / 16;
            class432.field6336 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var16 = 0; var16 < 4; var16++) {
                    class432.field6336[var8][var16] = class448.field6514.method1359(255);
                }
            }
            int var9 = class448.field6514.method1364(90);
            int var10 = class448.field6514.method1350(31351);
            class194.method1045(true, var5);
            class140.field1796 = null;
            class110.field1363 = new int[var7];
            class105.field1293 = new byte[var7][];
            class248.field3340 = new int[var7];
            class295.field4011 = new byte[var7][];
            class65.field681 = new byte[var7][];
            class296.field4037 = null;
            class138.field1777 = new int[var7];
            class452.field6576 = new int[var7];
            class405.field5893 = new int[var7];
            class297.field4042 = new byte[var7][];
            boolean var11 = false;
            if ((var3 / 8 == 48 || (var3 / 8) == 49) && (var9 / 8) == 48) {
                var11 = true;
            }
            int var12 = 0;
            if (var3 / 8 == 48 && var9 / 8 == 148) {
                var11 = true;
            }
            for (int var13 = (var3 - (class315.field4214 >> 4)) / 8; var13 <= (((class315.field4214 >> 4) + var3) / 8); var13++) {
                for (int var14 = (var9 - (class340.field4549 >> 4)) / 8; var14 <= ((class340.field4549 >> 4) + var9) / 8; var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class138.field1777[var12] = var15;
                        class452.field6576[var12] = -1;
                        class248.field3340[var12] = -1;
                        class110.field1363[var12] = -1;
                        class405.field5893[var12] = -1;
                    } else {
                        class138.field1777[var12] = var15;
                        class452.field6576[var12] = class371.field5195.method1700("m" + var13 + "_" + var14, (byte) -70);
                        class248.field3340[var12] = class371.field5195.method1700("l" + var13 + "_" + var14, (byte) -70);
                        class110.field1363[var12] = class371.field5195.method1700("um" + var13 + "_" + var14, (byte) -70);
                        class405.field5893[var12] = class371.field5195.method1700("ul" + var13 + "_" + var14, (byte) -70);
                    }
                    var12++;
                }
            }
            method464(var2, var6, var4, 0, var10, var9, var3, false);
        }
        if (arg1 != 128) {
            field952 = 18;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lam;Lam;)V")
    public class85(class286 arg0, class286 arg1) {
        this.field954 = arg0;
        this.field949 = arg1;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field946[var1] = var0 - 1;
            var0 += var0;
        }
        field952 = 0;
        field953 = 0;
        field957 = new class158[2048];
    }
}
