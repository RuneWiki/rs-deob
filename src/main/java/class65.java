import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class65 extends OutputStream {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1065 = "Hidden";

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1068 = "Created gameworld";

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Z")
    public static boolean field1069;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method499(int arg0, String arg1) {
        if (arg0 <= 65) {
            method500(95, -79, 49, 68, -85, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 81, (byte) -118, 92, 54);
        }
        field1064++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class129.field2127 * 128) {
            arg0 = class129.field2127 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class130.field2161 * 128) {
            arg2 = class130.field2161 * 128 - 1;
        }
        class119.field2004 = class95.field1482[arg3];
        class100.field1518 = class95.field1475[arg3];
        class273.field4367 = class95.field1482[arg4];
        class237.field3744 = class95.field1475[arg4];
        class282.field4477 = arg0;
        class89.field1421 = arg1;
        class271.field4346 = arg2;
        class263.field4171 = arg0 / 128;
        class239.field3766 = arg2 / 128;
        class16.field243 = class263.field4171 - class194.field3178;
        if (class16.field243 < 0) {
            class16.field243 = 0;
        }
        class37.field629 = class239.field3766 - class194.field3178;
        if (class37.field629 < 0) {
            class37.field629 = 0;
        }
        class100.field1528 = class263.field4171 + class194.field3178;
        if (class100.field1528 > class129.field2127) {
            class100.field1528 = class129.field2127;
        }
        class127.field2102 = class239.field3766 + class194.field3178;
        if (class127.field2102 > class130.field2161) {
            class127.field2102 = class130.field2161;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class194.field3178 + class194.field3178 + 2; var16++) {
            for (int var19 = 0; var19 < class194.field3178 + class194.field3178 + 2; var19++) {
                int var20 = (var16 - class194.field3178 << 7) - (class282.field4477 & 0x7F);
                int var21 = (var19 - class194.field3178 << 7) - (class271.field4346 & 0x7F);
                int var22 = class263.field4171 + var16 - class194.field3178;
                int var23 = class239.field3766 + var19 - class194.field3178;
                if (var22 >= 0 && var23 >= 0 && var22 < class129.field2127 && var23 < class130.field2161) {
                    int var24;
                    if (class266.field4251 == null) {
                        var24 = class161.field2627[0][var22][var23] + 128 - class89.field1421;
                    } else {
                        var24 = class266.field4251[0][var22][var23] + 128 - class89.field1421;
                    }
                    int var25 = class161.field2627[3][var22][var23] - class89.field1421 - 1000;
                    class174.field2924[var16][var19] = class140.method1043(var20, var25, var24, var21, var15);
                } else {
                    class174.field2924[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class194.field3178 + class194.field3178 + 1; var17++) {
            for (int var18 = 0; var18 < class194.field3178 + class194.field3178 + 1; var18++) {
                class21.field324[var17][var18] = class174.field2924[var17][var18] || class174.field2924[var17 + 1][var18] || class174.field2924[var17][var18 + 1] || class174.field2924[var17 + 1][var18 + 1];
            }
        }
        class191.field3127 = arg6;
        class150.field2466 = arg7;
        class143.field2361 = arg8;
        class252.field4010 = arg9;
        class220.field3529 = arg10;
        class272.method1846();
        if (class5.field61 != null) {
            class161.method1170(true);
            class157.method1130(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class161.method1170(false);
        }
        class157.method1130(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
    public static final void method501(boolean arg0, int arg1) {
        class76.field1239 = arg0;
        field1067++;
        if (arg1 != 0) {
            return;
        }
        if (!class76.field1239) {
            int var2 = class143.field2360.method1011((byte) 71);
            int var3 = class143.field2360.method976((byte) -118);
            int var4 = class143.field2360.method1011((byte) 77);
            boolean var5 = class105.method779(4, class143.field2360.method976((byte) -100));
            int var6 = class143.field2360.method1025((byte) 79);
            int var7 = class143.field2360.method1011((byte) 109);
            int var8 = (class222.field3547 - class143.field2360.field2231) / 16;
            class209.field3352 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class209.field3352[var9][var15] = class143.field2360.method1022(-42);
                }
            }
            class266.field4245 = null;
            class106.field1624 = new int[var8];
            boolean var10 = false;
            if (((var2 / 8) == 48 || (var2 / 8) == 49) && (var4 / 8) == 48) {
                var10 = true;
            }
            class250.field3988 = new int[var8];
            class178.field2967 = new byte[var8][];
            class40.field688 = new int[var8];
            class216.field3474 = new byte[var8][];
            class26.field460 = new int[var8];
            class268.field4291 = new int[var8];
            class92.field1460 = null;
            if ((var2 / 8) == 48 && var4 / 8 == 148) {
                var10 = true;
            }
            int var11 = 0;
            for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                for (int var13 = (var4 - 6) / 8; var13 <= ((var4 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var10 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class268.field4291[var11] = var14;
                        class106.field1624[var11] = -1;
                        class250.field3988[var11] = -1;
                        class40.field688[var11] = -1;
                        class26.field460[var11] = -1;
                    } else {
                        class268.field4291[var11] = var14;
                        class106.field1624[var11] = class91.field1431.method889("m" + var12 + "_" + var13, -1);
                        class250.field3988[var11] = class91.field1431.method889("l" + var12 + "_" + var13, -1);
                        class40.field688[var11] = class91.field1431.method889("um" + var12 + "_" + var13, -1);
                        class26.field460[var11] = class91.field1431.method889("ul" + var12 + "_" + var13, -1);
                    }
                    var11++;
                }
            }
            class206.method1387((byte) 106, var2, var7, false, var5, var3, var4, var6);
            return;
        }
        int var16 = class143.field2360.method1011((byte) 100);
        boolean var17 = class105.method779(4, class143.field2360.method1015((byte) 112));
        int var18 = class143.field2360.method1011((byte) 127);
        class143.field2360.method608(arg1 + 1);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = class143.field2360.method612(1, -121);
                    if (var39 == 1) {
                        class72.field1196[var19][var37][var38] = class143.field2360.method612(26, -126);
                    } else {
                        class72.field1196[var19][var37][var38] = -1;
                    }
                }
            }
        }
        class143.field2360.method605((byte) 21);
        int var20 = (class222.field3547 - class143.field2360.field2231) / 16;
        class209.field3352 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var36 = 0; var36 < 4; var36++) {
                class209.field3352[var21][var36] = class143.field2360.method986(class172.method1232(arg1, -1909920360));
            }
        }
        int var22 = class143.field2360.method988(744911448);
        int var23 = class143.field2360.method1011((byte) 103);
        int var24 = class143.field2360.method1015((byte) -113);
        class178.field2967 = new byte[var20][];
        class266.field4245 = null;
        class216.field3474 = new byte[var20][];
        class92.field1460 = null;
        class106.field1624 = new int[var20];
        class268.field4291 = new int[var20];
        class26.field460 = new int[var20];
        class40.field688 = new int[var20];
        class250.field3988 = new int[var20];
        int var25 = 0;
        for (int var26 = 0; var26 < 4; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                for (int var28 = 0; var28 < 13; var28++) {
                    int var29 = class72.field1196[var26][var27][var28];
                    if (var29 != -1) {
                        int var30 = var29 >> 14 & 0x3FF;
                        int var31 = (var29 & 0x3FFD) >> 3;
                        int var32 = (var30 / 8 << 8) + (var31 / 8);
                        for (int var33 = 0; var33 < var25; var33++) {
                            if (class268.field4291[var33] == var32) {
                                var32 = -1;
                                break;
                            }
                        }
                        if (var32 != -1) {
                            class268.field4291[var25] = var32;
                            int var34 = (var32 & 0xFF1F) >> 8;
                            int var35 = var32 & 0xFF;
                            class106.field1624[var25] = class91.field1431.method889("m" + var34 + "_" + var35, -1);
                            class250.field3988[var25] = class91.field1431.method889("l" + var34 + "_" + var35, arg1 - 1);
                            class40.field688[var25] = class91.field1431.method889("um" + var34 + "_" + var35, -1);
                            class26.field460[var25] = class91.field1431.method889("ul" + var34 + "_" + var35, -1);
                            var25++;
                        }
                    }
                }
            }
        }
        class206.method1387((byte) 106, var18, var16, false, var17, var24, var22, var23);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)I")
    public static final int method502(int arg0, int arg1, int arg2) {
        field1066++;
        if (arg0 != 1795) {
            return -102;
        } else if (arg2 == -1) {
            return 12345678;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ql", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1063++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method503(int arg0) {
        if (arg0 > 112) {
            field1065 = null;
            field1068 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    public static final void method504(int arg0, int arg1) {
        field1070++;
        if (arg0 == -1 || !class279.method1878(arg1 - 149, arg0) || arg1 != 149) {
            return;
        }
        class114[] var2 = class128.field2119[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class114 var4 = var2[var3];
            if (var4.field1853 != null) {
                class196 var5 = new class196();
                var5.field3213 = var4;
                var5.field3205 = var4.field1853;
                class241.method1587(var5, 2000000, true);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)V")
    public static final void method505(int arg0, int arg1, int arg2) {
        class285.field4537 = true;
        class143.field2357 = arg0;
        class211.field3382 = arg1;
        class114.field1748 = arg2;
        class279.field4421 = -1;
        class287.field4586 = -1;
    }
}
