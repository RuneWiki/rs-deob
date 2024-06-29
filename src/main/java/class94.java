import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class94 extends class5 {

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "[I")
    public int[] field1373 = new int[] { -1 };

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "[I")
    public int[] field1377 = new int[1];

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field1372 = -1;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field1379 = -1;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "Lla;")
    public static class319 field1378 = new class319(92, 2);

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "Lba;")
    public static class268 field1380;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V", line = 15)
    public static void method628(byte arg0) {
        field1378 = null;
        if (arg0 != 71) {
            method629(-115, -105, -64, false);
        }
        field1380 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIZ)V", line = 26)
    public static final void method629(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 == 1010) {
            class343.method2220(class315.field4584, arg0, arg1);
        } else if (arg2 == 1004) {
            class343.method2220(class279.field3966, arg0, arg1);
        } else if (arg2 == 1001) {
            class343.method2220(class76.field1106, arg0, arg1);
        } else if (arg2 == 1008) {
            class343.method2220(class542.field7924, arg0, arg1);
        } else if (arg2 == 1011) {
            class343.method2220(class211.field2984, arg0, arg1);
        }
        field1375++;
        if (!arg3) {
            method629(-88, -96, -43, false);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZLqi;ILqa;IIIILvr;)Lka;", line = 56)
    public final class334 method630(int arg0, boolean arg1, class405 arg2, int arg3, class165 arg4, int arg5, int arg6, int arg7, int arg8, class91 arg9) {
        field1376++;
        class334 var11 = null;
        int var12 = arg0;
        class485 var13 = null;
        if (arg8 != -1) {
            var13 = class509.field7483.method1556(arg8, false);
        }
        int[] var14 = this.field1373;
        if (var13 != null && var13.field7162 != null) {
            var14 = new int[var13.field7162.length];
            for (int var15 = 0; var15 < var13.field7162.length; var15++) {
                int var16 = var13.field7162[var15];
                if (var16 >= 0 && var16 < this.field1373.length) {
                    var14[var15] = this.field1373[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class425 var24 = null;
        class425 var25 = null;
        if (arg9 != null) {
            var12 = arg0 | 0x20;
            int var26 = arg9.field1315[arg6];
            int var27 = var26 >>> 16;
            var24 = class201.field2707.method485(var27, arg7 + 5);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2591(-1123836575, var21);
                var17 |= var24.method2597(12010, var21);
                var20 |= var24.method2594(arg7 ^ 0x4541, var21);
                var19 |= arg9.field1336;
            }
            if ((arg9.field1339 || class275.field3867) && arg3 != -1 && arg3 < arg9.field1315.length) {
                var23 = arg9.field1313[arg6];
                int var28 = arg9.field1315[arg3];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class201.field2707.method485(var22 >>> 16, 5);
                }
                if (var25 != null) {
                    var18 |= var25.method2591(arg7 - 1123836575, var22);
                    var17 |= var25.method2597(arg7 ^ 0x2EEA, var22);
                    var20 |= var25.method2594(arg7 ^ 0x4541, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method631(var14, (byte) -74, arg8, arg1, arg2 == null ? null : arg2.field6141);
        if (class173.field2324 != null) {
            var11 = (class334) class173.field2324.method2133(var30, (byte) 30);
        }
        if (var11 == null || arg4.method775(var11.method46(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method781(var12, var11.method46());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class103.field1489.method1603((byte) -99, var14[var34]).method513(arg1, (byte) -61)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class387[] var35 = new class387[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class103.field1489.method1603((byte) -99, var14[var36]).method524(arg1, (byte) -90);
                }
            }
            if (var13 != null && var13.field7154 != null) {
                for (int var37 = 0; var37 < var13.field7154.length; var37++) {
                    if (var13.field7154[var37] != null && var35[var37] != null) {
                        int var38 = var13.field7154[var37][0];
                        int var39 = var13.field7154[var37][1];
                        int var40 = var13.field7154[var37][2];
                        int var41 = var13.field7154[var37][3];
                        int var42 = var13.field7154[var37][4];
                        int var43 = var13.field7154[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2430(var43, var41, var42, -1);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2423((byte) 127, var39, var40, var38);
                        }
                    }
                }
            }
            class387 var44 = new class387(var35, var35.length);
            if (arg2 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg4.method833(var44, var32, class274.field3809, 64, 850);
            if (arg2 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class410.field6229[var45].length > arg2.field6141[var45]) {
                        var11.method29(class538.field7885[var45], class410.field6229[var45][arg2.field6141[var45]]);
                    }
                    if (arg2.field6141[var45] < class509.field7487[var45].length) {
                        var11.method29(class1.field9[var45], class509.field7487[var45][arg2.field6141[var45]]);
                    }
                }
            }
            if (class173.field2324 != null) {
                var11.method62(var12);
                class173.field2324.method2131(var11, var30, false);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class334 var46 = var11.method47((byte) 1, var12, true);
            var46.method2161(arg9.field1336, var25, var22, var24, var23, var21, arg5 - 1, arg7, (byte) -79);
            return var46;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([IBIZ[I)J", line = 297)
    private final long method631(int[] arg0, byte arg1, int arg2, boolean arg3, int[] arg4) {
        field1374++;
        long[] var6 = class291.field4254;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) ((var9 ^ (long) arg2) & 0xFFL)] ^ var9 >>> 8;
        if (arg1 > -40) {
            this.method630(109, true, null, -118, null, 111, -60, 123, 126, null);
        }
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg0[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg3 ? 1 : 0) ^ var11) & 0xFFL)];
    }
}
