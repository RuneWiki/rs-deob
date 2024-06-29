import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class48 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Lof;")
    private class328 field611 = new class328(256);

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lmn;")
    private class162 field610;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[I")
    public static int[] field616 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lqu;")
    public static class219 field607 = new class219(6, 4);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public final void method344(int arg0, int arg1) {
        if (arg0 > -80) {
            this.field611 = null;
        }
        field614++;
        class328 var3 = this.field611;
        synchronized (this.field611) {
            this.field611.method2202(0, arg1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method345(int arg0) {
        class328 var2 = this.field611;
        synchronized (this.field611) {
            if (arg0 != -9322) {
                return;
            }
            this.field611.method2189(false);
        }
        field613++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method346(byte arg0) {
        field616 = null;
        field607 = null;
        if (arg0 >= -113) {
            method346((byte) 107);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Ldj;")
    public final class349 method347(int arg0, byte arg1) {
        field615++;
        class328 var3 = this.field611;
        class349 var5;
        synchronized (this.field611) {
            int var4 = 33 % ((arg1 - 47) / 51);
            var5 = (class349) this.field611.method2191((byte) -73, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class162 var6 = this.field610;
        byte[] var7;
        synchronized (this.field610) {
            var7 = this.field610.method1004(26, false, arg0);
        }
        class349 var8 = new class349();
        if (var7 != null) {
            var8.method2302(new class208(var7), false);
        }
        class328 var9 = this.field611;
        synchronized (this.field611) {
            this.field611.method2188(-125, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lgi;III)V")
    public static final void method348(class437 arg0, int arg1, int arg2, int arg3) {
        class506.field7569 = arg3;
        field608++;
        class186.field2713 = arg0;
        int var4 = -120 / ((arg1 - 49) / 41);
        class358.field5550 = arg2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILgh;Ltq;II)V")
    public static final void method349(int arg0, class350 arg1, class276 arg2, int arg3, int arg4) {
        field609++;
        if ((arg4 & 0x10) != 0) {
            int var5 = arg2.method1481(false);
            int var6 = arg2.method1426(8);
            arg1.method427(var6, var5, class88.field1278, -12515);
            arg1.field871 = class88.field1278 + 300;
            arg1.field865 = arg2.method1426(-128);
        }
        byte var7 = -1;
        if ((arg4 & 0x4000) != 0) {
            arg1.field873 = arg2.method1448(65535);
            if (arg1.field873.charAt(0) == '~') {
                arg1.field873 = arg1.field873.substring(1);
                class528.method3140(arg1.method2318(true, 255), arg1.method2311((byte) 104, false), arg1.field873, -122, 2, 0);
            } else if (class358.field5565 == arg1) {
                class528.method3140(arg1.method2318(true, 255), arg1.method2311((byte) 104, false), arg1.field873, -8, 2, 0);
            }
            arg1.field879 = 0;
            arg1.field833 = 150;
            arg1.field848 = 0;
        }
        if ((arg4 & 0x40) != 0) {
            int var8 = arg2.method1417(2);
            if (var8 == 65535) {
                var8 = -1;
            }
            arg1.field829 = var8;
        }
        if ((arg4 & 0x40000) != 0) {
            int var9 = arg2.method1475(255);
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = arg2.method1417(2);
                if (var14 == 65535) {
                    var14 = -1;
                }
                var10[var13] = var14;
                var11[var13] = arg2.method1445(-113);
                var12[var13] = arg2.method1417(2);
            }
            class310.method2086(var11, var10, true, arg1, var12);
        }
        if ((arg4 & 0x10000) != 0) {
            int var15 = arg2.method1417(2);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var16 = arg2.method1436((byte) 99);
            int var17 = arg2.method1445(71);
            arg1.method422(-126, var16, var17, var15, true);
        }
        if ((arg4 & 0x4) != 0) {
            arg1.field5461 = arg2.method1431(65280);
            if (arg1.field898 == 0) {
                arg1.method428(arg1.field5461, (byte) -124);
                arg1.field5461 = -1;
            }
        }
        if (arg3 < 113) {
            field607 = null;
        }
        if ((arg4 & 0x8) != 0) {
            int var18 = arg2.method1460(4);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = arg2.method1475(255);
            class415.method2653(-117, arg1, var19, var18);
        }
        if ((arg4 & 0x1000) != 0) {
            arg1.field5425 = arg2.method1475(255) == 1;
        }
        if ((arg4 & 0x400) != 0) {
            int var20 = class88.field1278;
            int var21 = arg2.method1481(false);
            int var22 = arg2.method1426(-127);
            arg1.method427(var22, var21, var20, -12515);
        }
        if ((arg4 & 0x20) != 0) {
            int var23 = arg2.method1455(-3387);
            int var24 = arg2.method1426(-126);
            int var25 = arg2.method1422(-121);
            int var26 = arg2.field3162;
            boolean var27 = (var23 & 0x8000) != 0;
            if (arg1.field5443 != null && arg1.field5430 != null) {
                boolean var28 = false;
                if (var24 <= 1) {
                    if (!var27 && !(!class504.field7552 || class225.field3771) || class103.field1504) {
                        var28 = true;
                    } else if (class487.method2988(arg1.field5443, -44)) {
                        var28 = true;
                    }
                }
                if (!var28 && class94.field1382 == 0) {
                    class143.field1932.field3162 = 0;
                    arg2.method1447(0, (byte) 118, var25, class143.field1932.field3193);
                    class143.field1932.field3162 = 0;
                    int var29 = -1;
                    String var30;
                    if (var27) {
                        var23 &= 0x7FFF;
                        class385 var31 = class165.method1036(class143.field1932, -24028);
                        var29 = var31.field5885;
                        var30 = var31.field5891.method3064(false, class143.field1932);
                    } else {
                        var30 = class360.method2381(95, class463.method2903(class143.field1932, (byte) 117));
                    }
                    arg1.field873 = var30.trim();
                    arg1.field848 = var23 & 0xFF;
                    arg1.field879 = var23 >> 8;
                    arg1.field833 = 150;
                    int var32;
                    if (var24 == 1 || var24 == 2) {
                        var32 = var27 ? 17 : 1;
                    } else {
                        var32 = var27 ? 17 : 2;
                    }
                    if (var24 == 2) {
                        class34.method215(var29, var30, true, null, "<img=1>" + arg1.method2311((byte) 104, false), "<img=1>" + arg1.method2318(true, 255), var32, 0);
                    } else if (var24 == 1) {
                        class34.method215(var29, var30, true, null, "<img=0>" + arg1.method2311((byte) 104, false), "<img=0>" + arg1.method2318(true, 255), var32, 0);
                    } else {
                        class34.method215(var29, var30, true, null, arg1.method2311((byte) 104, false), arg1.method2318(true, 255), var32, 0);
                    }
                }
            }
            arg2.field3162 = var26 + var25;
        }
        if ((arg4 & 0x100) != 0) {
            var7 = arg2.method1480(113);
        }
        if ((arg4 & 0x80) != 0) {
            int var33 = arg2.method1422(-128);
            byte[] var34 = new byte[var33];
            class208 var35 = new class208(var34);
            arg2.method1425(var34, 0, 0, var33);
            class456.field7044[arg0] = var35;
            arg1.method2312(var35, (byte) 115);
        }
        if ((arg4 & 0x2) != 0) {
            class467.field7156[arg0] = arg2.method1427(false);
        }
        if ((arg4 & 0x20000) != 0) {
            arg1.field843 = arg2.method1427(false);
            arg1.field859 = arg2.method1430((byte) -41);
            arg1.field842 = arg2.method1457((byte) -39);
            arg1.field866 = (byte) arg2.method1426(-124);
            arg1.field824 = class88.field1278 + arg2.method1455(-3387);
            arg1.field880 = class88.field1278 + arg2.method1460(4);
        }
        if ((arg4 & 0x2000) != 0) {
            int var36 = arg2.method1460(4);
            if (var36 == 65535) {
                var36 = -1;
            }
            int var37 = arg2.method1478((byte) 83);
            int var38 = arg2.method1445(-123);
            arg1.method422(-73, var37, var38, var36, false);
        }
        if ((arg4 & 0x200) != 0) {
            arg1.field821 = arg2.method1427(false);
            arg1.field870 = arg2.method1430((byte) -106);
            arg1.field835 = arg2.method1457((byte) -39);
            arg1.field868 = arg2.method1457((byte) -39);
            arg1.field796 = arg2.method1455(-3387) + class88.field1278;
            arg1.field846 = arg2.method1431(65280) + class88.field1278;
            arg1.field811 = arg2.method1426(50);
            arg1.field893 = 0;
            if (arg1.field5454) {
                arg1.field821 += arg1.field5449;
                arg1.field835 += arg1.field5449;
                arg1.field898 = 0;
                arg1.field868 += arg1.field5446;
                arg1.field870 += arg1.field5446;
            } else {
                arg1.field898 = 1;
                arg1.field835 += arg1.field894[0];
                arg1.field821 += arg1.field894[0];
                arg1.field870 += arg1.field899[0];
                arg1.field868 += arg1.field899[0];
            }
        }
        if ((arg4 & 0x800) != 0) {
            int var39 = arg2.method1417(2);
            arg1.field820 = arg2.method1445(-90);
            arg1.field878 = arg2.method1475(255);
            arg1.field830 = (var39 & 0x8000) != 0;
            arg1.field797 = var39 & 0x7FFF;
            arg1.field856 = class88.field1278 - (-arg1.field797 - arg1.field820);
        }
        if (!arg1.field5454) {
            return;
        }
        if (var7 == 127) {
            arg1.method2317(arg1.field5449, 1584974182, arg1.field5446);
            return;
        }
        byte var40;
        if (var7 == -1) {
            var40 = class467.field7156[arg0];
        } else {
            var40 = var7;
        }
        arg1.method2308(arg1.field5446, var40, (byte) -20, arg1.field5449);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public final void method350(int arg0) {
        class328 var2 = this.field611;
        synchronized (this.field611) {
            this.field611.method2187(-1);
        }
        if (arg0 <= 96) {
            field616 = null;
        }
        field612++;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class48(class236 arg0, int arg1, class162 arg2) {
        this.field610 = arg2;
        this.field610.method1008(26, (byte) -21);
    }
}
