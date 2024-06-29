import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class472 extends class624 {

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Z")
    public static boolean field6996 = false;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public int field6986;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lls;")
    public class121 field6990;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Lta;")
    public static class181 field6992;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "[B")
    public byte[] field6985;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "[Lkq;")
    public static class516[] field6987;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[Loo;", line = 6)
    public static final class543[] method2891(int arg0) {
        ++field6991;
        if (arg0 >= -29) {
            field6996 = true;
        }
        return new class543[] { class260.field3706, class67.field736, class213.field2944 };
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILqf;Loa;II)V", line = 18)
    public static final void method2892(int arg0, class593 arg1, class605 arg2, int arg3, int arg4) {
        ++field6995;
        if (arg4 != 128) {
            method2892(-111, (class593) null, (class605) null, 106, -122);
        }
        class199 var5 = arg1.method3456(arg2, true);
        if (var5 != null) {
            arg2.method368(arg0, arg3, arg1.field8570 + arg0, arg3 - -arg1.field8518);
            if (class17.field172 != 2 && class17.field172 != 5 && class191.field2507 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (class236.field3384 != 4) {
                    var6 = class439.field6548.field1764;
                    var7 = 16383 & (int) (-class388.field5967) + class17.field173;
                    var8 = -(class34.field389 * 16) + 4096;
                    var9 = class439.field6548.field1768;
                } else {
                    var9 = class151.field1860;
                    var8 = 4096;
                    var7 = (int) (-class388.field5967) & 16383;
                    var6 = class326.field4703;
                }
                int var10 = -(class90.field1032 * 2) - -208 + var6 / 128 + 48;
                int var11 = 208 - class30.field349 * 2 + class30.field349 * 4 + 48 + -(var9 / 128);
                class191.field2507.method2705((float) arg1.field8570 / 2.0F + (float) arg0, (float) arg1.field8518 / 2.0F + (float) arg3, (float) var10, (float) var11, var8, var7 << 2, var5, arg0, arg3);
                for (class388 var12 = (class388) class155.field1923.method719(false); var12 != null; var12 = (class388) class155.field1923.method716(14)) {
                    int var58 = var12.field5965;
                    int var59 = (class561.field8015.field1693[var58] >> 14 & 16383) + -class287.field3980;
                    int var60 = (class561.field8015.field1693[var58] & 16383) + -class250.field3549;
                    int var61 = var59 * 4 - (var6 / 128 + -2);
                    int var62 = var60 * 4 + -(var9 / 128) + 2;
                    class449.method2784(arg0, arg2, class561.field8015.field1694[var58], var62, arg3, arg1, var61, var5, 2);
                }
                for (int var13 = 0; ~class74.field790 < ~var13; ++var13) {
                    int var55 = class197.field2671[var13] * 4 + 2 + -(var6 / 128);
                    int var56 = class310.field4566[var13] * 4 - -2 + -(var9 / 128);
                    class385 var57 = class575.field8301.method1499(-7532, class479.field7051[var13]);
                    if (var57.field5793 != null) {
                        var57 = var57.method2453(class23.field243, arg4 ^ 128);
                        if (var57 == null || ~var57.field5882 == 0) {
                            continue;
                        }
                    }
                    class449.method2784(arg0, arg2, var57.field5882, var56, arg3, arg1, var55, var5, arg4 ^ 130);
                }
                for (class446 var14 = (class446) class294.field4247.method523(-117); var14 != null; var14 = (class446) class294.field4247.method530(12714)) {
                    int var50 = (int) (var14.field4676 >> 28 & 3L);
                    if (class600.field8763 == var50) {
                        int var51 = (int) (var14.field4676 & 16383L) - class287.field3980;
                        int var52 = -class250.field3549 + (int) (var14.field4676 >> 14 & 16383L);
                        int var53 = var51 * 4 - (-2 - -(var6 / 128));
                        int var54 = var52 * 4 + -(var9 / 128) + 2;
                        class222.method1440(arg3, var54, var53, arg0, arg1, var5, class528.field7651[0], arg4 + -244);
                    }
                }
                for (int var15 = 0; ~class387.field5958 < ~var15; ++var15) {
                    class411 var45 = (class411) class42.field456.method524((byte) 120, (long) class362.field5141[var15]);
                    if (var45 != null) {
                        class78 var46 = var45.field6254;
                        if (var46.method508(0) && ~class439.field6548.field1757 == ~var46.field1757) {
                            class566 var47 = var46.field864;
                            if (var47 != null && var47.field8121 != null) {
                                var47 = var47.method3287(127, class23.field243);
                            }
                            if (var47 != null && var47.field8116 && var47.field8100) {
                                int var48 = var46.field1764 / 128 + -(var6 / 128);
                                int var49 = var46.field1768 / 128 + -(var9 / 128);
                                if (~var47.field8101 == 0) {
                                    class222.method1440(arg3, var49, var48, arg0, arg1, var5, class528.field7651[1], -116);
                                } else {
                                    class449.method2784(arg0, arg2, var47.field8101, var49, arg3, arg1, var48, var5, 2);
                                }
                            }
                        }
                    }
                }
                int var16 = class88.field1018;
                int[] var17 = class457.field6839;
                for (int var18 = 0; ~var16 < ~var18; ++var18) {
                    class655 var37 = class142.field1749[var17[var18]];
                    if (var37 != null && var37.method3740(arg4 ^ 128) && class439.field6548 != var37 && ~class439.field6548.field1757 == ~var37.field1757) {
                        int var38 = var37.field1764 / 128 + -(var6 / 128);
                        int var39 = var37.field1768 / 128 + -(var9 / 128);
                        boolean var40 = false;
                        for (int var41 = 0; var41 < class602.field8781; ++var41) {
                            if (var37.field9452.equals(class37.field408[var41]) && class248.field3519[var41] != 0) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; class294.field4252 > var43; ++var43) {
                            if (var37.field9452.equals(class538.field7747[var43].field7618)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (class439.field6548.field9484 != 0 && ~var37.field9484 != -1 && ~class439.field6548.field9484 == ~var37.field9484) {
                            var44 = true;
                        }
                        if (!var37.field9476) {
                            if (!var40) {
                                if (var42) {
                                    class222.method1440(arg3, var39, var38, arg0, arg1, var5, class528.field7651[5], -111);
                                } else if (var44) {
                                    class222.method1440(arg3, var39, var38, arg0, arg1, var5, class528.field7651[4], -103);
                                } else {
                                    class222.method1440(arg3, var39, var38, arg0, arg1, var5, class528.field7651[2], arg4 ^ -242);
                                }
                            } else {
                                class222.method1440(arg3, var39, var38, arg0, arg1, var5, class528.field7651[3], -111);
                            }
                        } else {
                            class222.method1440(arg3, var39, var38, arg0, arg1, var5, class528.field7651[6], -116);
                        }
                    }
                }
                class360[] var19 = class13.field117;
                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                    class360 var23 = var19[var20];
                    if (var23 != null && ~var23.field5102 != -1 && class287.field3982 % 20 < 10) {
                        if (~var23.field5102 == -2) {
                            class411 var24 = (class411) class42.field456.method524((byte) 105, (long) var23.field5105);
                            if (var24 != null) {
                                class78 var25 = var24.field6254;
                                int var26 = var25.field1764 / 128 + -(var6 / 128);
                                int var27 = var25.field1768 / 128 - var9 / 128;
                                class14.method82(var5, arg0, 360000L, arg1, var23.field5107, var27, var26, arg3, -60);
                            }
                        }
                        if (~var23.field5102 == -3) {
                            int var28 = var23.field5101 / 128 + -(var6 / 128);
                            int var29 = var23.field5096 / 128 - var9 / 128;
                            long var30 = (long) (var23.field5098 << 7);
                            long var32 = var30 * var30;
                            class14.method82(var5, arg0, var32, arg1, var23.field5107, var29, var28, arg3, -60);
                        }
                        if (~var23.field5102 == -11 && ~var23.field5105 <= -1 && ~class142.field1749.length < ~var23.field5105) {
                            class655 var34 = class142.field1749[var23.field5105];
                            if (var34 != null) {
                                int var35 = var34.field1764 / 128 + -(var6 / 128);
                                int var36 = var34.field1768 / 128 + -(var9 / 128);
                                class14.method82(var5, arg0, 360000L, arg1, var23.field5107, var36, var35, arg3, arg4 ^ -188);
                            }
                        }
                    }
                }
                if (class236.field3384 != 4) {
                    if (~class82.field925 != -1) {
                        int var21 = class82.field925 * 4 - (-2 + var6 / 128 + -(2 * (-1 + class439.field6548.method1153(true))));
                        int var22 = class50.field531 * 4 + 2 - (var9 / 128 + -(class439.field6548.method1153(true) * 2)) + -2;
                        class222.method1440(arg3, var22, var21, arg0, arg1, var5, class425.field6327[!class87.field992 ? 0 : 1], -127);
                    }
                    arg2.method3524(3, arg1.field8518 / 2 + arg3 + -1, (byte) 92, -1, 3, arg1.field8570 / 2 + arg0 - 1);
                }
            } else {
                arg2.method312(-16777216, var5, arg0, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V", line = 325)
    public static void method2893(int arg0) {
        field6992 = null;
        field6987 = null;
        if (arg0 != -1) {
            method2896(true, 100, 74, -39, 78, -13, 46);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I", line = 336)
    public final int method600(byte arg0) {
        ++field6994;
        if (arg0 != 54) {
            field6996 = true;
        }
        return super.field9009 ? 0 : 100;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V", line = 354)
    public static final void method2894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class262 var7 = new class262();
        var7.field3731 = arg1 >> class465.field6917;
        var7.field3725 = arg2 >> class465.field6917;
        var7.field3716 = arg3 >> class465.field6917;
        var7.field3726 = arg4 >> class465.field6917;
        var7.field3733 = arg0;
        var7.field3724 = arg1;
        var7.field3730 = arg2;
        var7.field3719 = arg3;
        var7.field3732 = arg4;
        var7.field3720 = arg5;
        var7.field3721 = arg6;
        class92.field1069[class126.field1564++] = var7;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)[B", line = 370)
    public final byte[] method603(byte arg0) {
        ++field6993;
        if (super.field9009) {
            throw new RuntimeException();
        } else {
            if (arg0 <= 101) {
                this.field6990 = null;
            }
            return this.field6985;
        }
    }

    @OriginalMember(owner = "client!md", name = "h", descriptor = "(I)V", line = 390)
    public static final void method2895(int arg0) {
        ++field6988;
        if (~class90.field1039 != arg0) {
            class392.field6007 -= class90.field1039 * 5;
            if (~class429.field6362 >= ~class392.field6007) {
                class392.field6007 = class429.field6362 - 1;
            }
            class90.field1039 = 0;
            if (~class392.field6007 > -1) {
                class392.field6007 = 0;
            }
        }
        if (~class169.field2059 > -103) {
            class169.field2059 += 6;
        }
        for (int var1 = 0; ~var1 > ~class430.field6381; ++var1) {
            class478 var2 = class128.field1576[var1];
            int var3 = var2.method2198((byte) 100);
            char var4 = var2.method2204((byte) -99);
            int var5 = var2.method2199((byte) -98);
            if (~var3 == -85) {
                class400.method2548(~arg0, false);
            }
            if (var3 == 80) {
                class400.method2548(0, true);
            } else if (var3 == 66 && ~(var5 & 4) != -1) {
                if (class446.field6666 != null) {
                    String var10 = "";
                    for (int var11 = class236.field3378.length - 1; var11 >= 0; --var11) {
                        if (class236.field3378[var11] != null && class236.field3378[var11].length() > 0) {
                            var10 = var10 + class236.field3378[var11] + '\n';
                        }
                    }
                    class446.field6666.setContents(new StringSelection(var10), (ClipboardOwner) null);
                }
            } else if (var3 == 67 && (var5 & 4) != 0) {
                if (class446.field6666 != null) {
                    Transferable var6 = class446.field6666.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class293.method1890('\n', (byte) -1, var7);
                                if (var8.length > 1) {
                                    for (int var9 = 0; var8.length > var9; ++var9) {
                                        class309.field4552 = var8[var9];
                                        class400.method2548(0, false);
                                    }
                                } else {
                                    class309.field4552 = class309.field4552 + var7;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (~var3 == -86 && ~class343.field4889 < -1) {
                class309.field4552 = class309.field4552.substring(0, class343.field4889 + -1) + class309.field4552.substring(class343.field4889);
                --class343.field4889;
            } else if (var3 == 101 && class343.field4889 < class309.field4552.length()) {
                class309.field4552 = class309.field4552.substring(0, class343.field4889) + class309.field4552.substring(class343.field4889 + 1);
            } else if (~var3 == -97 && class343.field4889 > 0) {
                --class343.field4889;
            } else if (var3 == 97 && class343.field4889 < class309.field4552.length()) {
                ++class343.field4889;
            } else if (var3 == 102) {
                class343.field4889 = 0;
            } else if (~var3 != -104) {
                if (var3 == 104 && ~class236.field3378.length < ~class655.field9435) {
                    ++class655.field9435;
                    class234.method1510((byte) -119);
                    class343.field4889 = class309.field4552.length();
                } else if (var3 == 105 && class655.field9435 > 0) {
                    --class655.field9435;
                    class234.method1510((byte) -96);
                    class343.field4889 = class309.field4552.length();
                } else if (class506.method3012(var4, true) || ~var4 == -59 || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || ~var4 == -44 || ~var4 == -92 || ~var4 == -94) {
                    class309.field4552 = class309.field4552.substring(0, class343.field4889) + class128.field1576[var1].method2204((byte) -111) + class309.field4552.substring(class343.field4889);
                    ++class343.field4889;
                }
            } else {
                class343.field4889 = class309.field4552.length();
            }
        }
        class430.field6381 = 0;
        class410.method2598(122);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIIIIII)V", line = 561)
    public static final void method2896(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < 109) {
            method2895(-96);
        }
        class258.field3681 = arg4;
        class112.field1382 = arg3;
        class359.field5092 = arg5;
        ++field6989;
        class438.field6516 = arg1;
        class126.field1559 = arg2;
        if (arg0 && ~class359.field5092 <= -101) {
            class207.field2781 = class438.field6516 * 512 + 256;
            class337.field4821 = class112.field1382 * 512 + 256;
            class100.field1192 = class399.method2547(class207.field2781, class337.field4821, (byte) -128, class226.field3179) + -class126.field1559;
        }
        class236.field3384 = 2;
    }
}
