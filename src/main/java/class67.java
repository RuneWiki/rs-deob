import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class67 extends class178 {

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public int field1286 = -1;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    private int field1289 = 0;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    private int field1287 = -1;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    private int field1284 = 128;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "S")
    public short field1283 = 0;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    public int field1301 = -1;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Z")
    public boolean field1292 = true;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public int field1293 = -1;

    @OriginalMember(owner = "client!ga", name = "rb", descriptor = "I")
    public int field1310 = -1;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "Z")
    public boolean field1300 = true;

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "Z")
    public boolean field1304 = false;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
    private int field1298 = 128;

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
    private int field1299 = 0;

    @OriginalMember(owner = "client!ga", name = "qb", descriptor = "I")
    public int field1309 = -1;

    @OriginalMember(owner = "client!ga", name = "nb", descriptor = "[Loc;")
    public class151[] field1306 = new class151[5];

    @OriginalMember(owner = "client!ga", name = "vb", descriptor = "Loc;")
    public class151 field1314 = class29.field622;

    @OriginalMember(owner = "client!ga", name = "zb", descriptor = "Z")
    public boolean field1318 = true;

    @OriginalMember(owner = "client!ga", name = "Cb", descriptor = "I")
    public int field1321 = -1;

    @OriginalMember(owner = "client!ga", name = "sb", descriptor = "I")
    public int field1311 = -1;

    @OriginalMember(owner = "client!ga", name = "ub", descriptor = "I")
    public int field1313 = -1;

    @OriginalMember(owner = "client!ga", name = "yb", descriptor = "I")
    public int field1317 = 1;

    @OriginalMember(owner = "client!ga", name = "Gb", descriptor = "I")
    public int field1325 = 32;

    @OriginalMember(owner = "client!ga", name = "xb", descriptor = "S")
    public short field1316 = 0;

    @OriginalMember(owner = "client!ga", name = "Ib", descriptor = "I")
    private int field1327 = -1;

    @OriginalMember(owner = "client!ga", name = "Jb", descriptor = "I")
    public int field1328 = -1;

    @OriginalMember(owner = "client!ga", name = "mb", descriptor = "[Z")
    public static boolean[] field1305 = new boolean[8];

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ga", name = "ob", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ga", name = "wb", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ga", name = "Ab", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ga", name = "Bb", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ga", name = "Fb", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!ga", name = "Hb", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "Lsd;")
    public static class192 field1281;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "[I")
    public int[] field1291;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "[I")
    private int[] field1294;

    @OriginalMember(owner = "client!ga", name = "pb", descriptor = "[I")
    private int[] field1308;

    @OriginalMember(owner = "client!ga", name = "tb", descriptor = "[I")
    public static int[] field1312;

    @OriginalMember(owner = "client!ga", name = "Eb", descriptor = "[I")
    public static int[] field1323;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "[S")
    private short[] field1295;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "[S")
    private short[] field1296;

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "[S")
    private short[] field1303;

    @OriginalMember(owner = "client!ga", name = "Db", descriptor = "[S")
    private short[] field1322;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILwa;I)V")
    private final void method440(int arg0, class229 arg1, int arg2) {
        if (arg0 == 1) {
            int var4 = arg1.method1475(255);
            this.field1308 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1308[var5] = arg1.method1490((byte) 73);
            }
        } else if (arg0 == 2) {
            this.field1314 = arg1.method1443((byte) -128);
        } else if (arg0 == 12) {
            this.field1317 = arg1.method1475(255);
        } else if (arg0 == 13) {
            this.field1328 = arg1.method1490((byte) 73);
        } else if (arg0 == 14) {
            this.field1293 = arg1.method1490((byte) 73);
        } else if (arg0 == 15) {
            this.field1313 = arg1.method1490((byte) 73);
        } else if (arg0 == 16) {
            this.field1301 = arg1.method1490((byte) 73);
        } else if (arg0 == 17) {
            this.field1293 = arg1.method1490((byte) 73);
            this.field1311 = arg1.method1490((byte) 73);
            this.field1309 = arg1.method1490((byte) 73);
            this.field1286 = arg1.method1490((byte) 73);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field1306[arg0 - 30] = arg1.method1443((byte) -73);
            if (this.field1306[arg0 - 30].method995((byte) -22, class213.field3740)) {
                this.field1306[arg0 - 30] = null;
            }
        } else if (arg0 == 40) {
            int var12 = arg1.method1475(255);
            this.field1296 = new short[var12];
            this.field1322 = new short[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1296[var13] = (short) arg1.method1490((byte) 73);
                this.field1322[var13] = (short) arg1.method1490((byte) 73);
            }
        } else if (arg0 == 41) {
            int var10 = arg1.method1475(255);
            this.field1303 = new short[var10];
            this.field1295 = new short[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1303[var11] = (short) arg1.method1490((byte) 73);
                this.field1295[var11] = (short) arg1.method1490((byte) 73);
            }
        } else if (arg0 == 60) {
            int var8 = arg1.method1475(255);
            this.field1294 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1294[var9] = arg1.method1490((byte) 73);
            }
        } else if (arg0 == 93) {
            this.field1300 = false;
        } else if (arg0 == 95) {
            this.field1321 = arg1.method1490((byte) 73);
        } else if (arg0 == 97) {
            this.field1284 = arg1.method1490((byte) 73);
        } else if (arg0 == 98) {
            this.field1298 = arg1.method1490((byte) 73);
        } else if (arg0 == 99) {
            this.field1304 = true;
        } else if (arg0 == 100) {
            this.field1289 = arg1.method1457(-2);
        } else if (arg0 == 101) {
            this.field1299 = arg1.method1457(-2) * 5;
        } else if (arg0 == 102) {
            this.field1310 = arg1.method1490((byte) 73);
        } else if (arg0 == 103) {
            this.field1325 = arg1.method1490((byte) 73);
        } else if (arg0 == 106) {
            this.field1287 = arg1.method1490((byte) 73);
            if (this.field1287 == 65535) {
                this.field1287 = -1;
            }
            this.field1327 = arg1.method1490((byte) 73);
            if (this.field1327 == 65535) {
                this.field1327 = -1;
            }
            int var6 = arg1.method1475(255);
            this.field1291 = new int[var6 + 1];
            for (int var7 = 0; var7 <= var6; var7++) {
                this.field1291[var7] = arg1.method1490((byte) 73);
                if (this.field1291[var7] == 65535) {
                    this.field1291[var7] = -1;
                }
            }
        } else if (arg0 == 107) {
            this.field1318 = false;
        } else if (arg0 == 109) {
            this.field1292 = false;
        } else if (arg0 != 111) {
            if (arg0 == 113) {
                arg1.method1490((byte) 73);
                arg1.method1490((byte) 73);
            } else if (arg0 == 114) {
                arg1.method1457(-2);
                arg1.method1457(-2);
            } else if (arg0 == 115) {
                this.field1283 = (short) (arg1.method1475(255) * 4);
                this.field1316 = (short) (arg1.method1475(255) * 4);
            }
        }
        int var14 = -75 % ((47 - arg2) / 54);
        field1290++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZILbh;)V")
    public static final void method441(int arg0, boolean arg1, int arg2, class20 arg3) {
        if (arg1) {
            method451(false, null, 19);
        }
        if ((arg2 & 0x1) != 0) {
            int var4 = class1.field34.method1489(252);
            byte[] var5 = new byte[var4];
            class229 var6 = new class229(var5);
            class1.field34.method1462(-128, 0, var5, var4);
            class2.field43[arg0] = var6;
            arg3.method171(126, var6);
        }
        field1285++;
        if ((arg2 & 0x200) != 0) {
            arg3.field4006 = class1.field34.method1489(252);
            arg3.field3994 = class1.field34.method1459(255);
            arg3.field4000 = class1.field34.method1459(255);
            arg3.field3996 = class1.field34.method1475(255);
            arg3.field4015 = class1.field34.method1441(0) + class200.field3541;
            arg3.field4040 = class1.field34.method1441(0) + class200.field3541;
            arg3.field3997 = class1.field34.method1459(255);
            arg3.field3999 = 1;
            arg3.field4001 = 0;
        }
        if ((arg2 & 0x4) != 0) {
            int var7 = class1.field34.method1465(-128);
            int var8 = class1.field34.method1489(252);
            arg3.method1429(class200.field3541, var7, var8, (byte) 3);
            arg3.field4041 = class200.field3541 + 300;
            arg3.field3986 = class1.field34.method1459(255);
        }
        if ((arg2 & 0x100) != 0) {
            int var9 = class1.field34.method1475(255);
            int var10 = class1.field34.method1465(-121);
            arg3.method1429(class200.field3541, var9, var10, (byte) 3);
        }
        if ((arg2 & 0x80) != 0) {
            arg3.field3969 = class1.field34.method1441(0);
            if (arg3.field3969 == 65535) {
                arg3.field3969 = -1;
            }
        }
        if ((arg2 & 0x40) != 0) {
            arg3.field4018 = class1.field34.method1486((byte) -65);
            arg3.field3990 = class1.field34.method1441(0);
        }
        if ((arg2 & 0x2) != 0) {
            arg3.field4033 = class1.field34.method1443((byte) -62);
            if (arg3.field4033.method979(0, (byte) 126) == 126) {
                arg3.field4033 = arg3.field4033.method989(1, (byte) -62);
                client.method246(2, (byte) -115, arg3.field416, arg3.field4033);
            } else if (class228.field3975 == arg3) {
                client.method246(2, (byte) -86, arg3.field416, arg3.field4033);
            }
            arg3.field4009 = 0;
            arg3.field4026 = 150;
            arg3.field3985 = 0;
        }
        if ((arg2 & 0x8) != 0) {
            int var11 = class1.field34.method1486((byte) -65);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = class1.field34.method1489(252);
            class149.method946((byte) -96, var12, arg3, var11);
        }
        if ((arg2 & 0x10) != 0) {
            int var13 = class1.field34.method1486((byte) -65);
            int var14 = class1.field34.method1489(252);
            int var15 = class1.field34.method1475(255);
            int var16 = class1.field34.field4101;
            if (arg3.field416 != null && arg3.field439 != null) {
                long var17 = arg3.field416.method981(arg1);
                boolean var19 = false;
                if (var14 <= 1) {
                    for (int var20 = 0; var20 < class32.field658; var20++) {
                        if (class224.field3909[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                }
                if (!var19 && class19.field397 == 0) {
                    client.field686.field4101 = 0;
                    int var21 = -1;
                    class1.field34.method1462(-128, 0, client.field686.field4087, var15);
                    client.field686.field4101 = 0;
                    boolean var22 = (var13 & 0x8000) != 0;
                    class151 var24;
                    if (var22) {
                        var13 &= 0x7FFF;
                        class161 var23 = class75.method488(client.field686, 22341);
                        var21 = var23.field2901;
                        var24 = var23.field2916.method1406(4, client.field686);
                    } else {
                        var24 = class201.method1278(class226.method1417(client.field686, 50).method997(true));
                    }
                    arg3.field4033 = var24.method972(0);
                    arg3.field4009 = var13 & 0xFF;
                    arg3.field3985 = var13 >> 8;
                    arg3.field4026 = 150;
                    if (var14 == 2) {
                        method448(var21, null, -1, var22 ? 17 : 1, var24, class126.method761(new class151[] { class16.field367, arg3.field416 }, 10260));
                    } else if (var14 == 1) {
                        method448(var21, null, -1, var22 ? 17 : 1, var24, class126.method761(new class151[] { class220.field3824, arg3.field416 }, 10260));
                    } else {
                        method448(var21, null, -1, var22 ? 17 : 2, var24, arg3.field416);
                    }
                }
            }
            class1.field34.field4101 = var16 + var15;
        }
        if ((arg2 & 0x400) == 0) {
            return;
        }
        arg3.field4016 = class1.field34.method1441(0);
        int var25 = class1.field34.method1437(425528536);
        arg3.field4008 = var25 >> 16;
        arg3.field4039 = (var25 & 0xFFFF) + class200.field3541;
        arg3.field4030 = 0;
        if (class200.field3541 < arg3.field4039) {
            arg3.field4030 = -1;
        }
        arg3.field3977 = 0;
        if (arg3.field4016 == 65535) {
            arg3.field4016 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public static void method442(boolean arg0) {
        field1312 = null;
        field1281 = null;
        field1305 = null;
        field1323 = null;
        if (arg0) {
            field1312 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method443(byte arg0, KeyEvent arg1) {
        field1302++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (arg0 != -121) {
            method452(-94, (byte) 86);
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public final void method444(int arg0) {
        if (arg0 != 15759) {
            method442(false);
        }
        field1326++;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)Z")
    public final boolean method445(int arg0) {
        field1320++;
        if (this.field1291 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field1287 != -1) {
            var2 = class181.method1140(this.field1287, (byte) -127);
        } else if (this.field1327 != -1) {
            var2 = class156.field2836[this.field1327];
        }
        if (var2 < 0 || this.field1291.length <= var2 || this.field1291[var2] == -1) {
            return false;
        } else {
            if (arg0 < 90) {
                method442(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)Lga;")
    public final class67 method446(int arg0) {
        field1297++;
        int var2 = -1;
        if (arg0 != -99) {
            method452(126, (byte) -101);
        }
        if (this.field1287 != -1) {
            var2 = class181.method1140(this.field1287, (byte) -122);
        } else if (this.field1327 != -1) {
            var2 = class156.field2836[this.field1327];
        }
        return var2 < 0 || var2 >= this.field1291.length || this.field1291[var2] == -1 ? null : class131.method814(true, this.field1291[var2]);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILkg;ILkg;I)Lbf;")
    public final class18 method447(int arg0, class115 arg1, int arg2, class115 arg3, int arg4) {
        field1315++;
        if (this.field1291 != null) {
            class67 var6 = this.method446(-99);
            return var6 == null ? null : var6.method447(-125, arg1, arg2, arg3, arg4);
        }
        class18 var7 = (class18) class155.field2813.method1028((long) this.field1324, false);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1308.length; var9++) {
                if (!class215.field3758.method1187(-1, this.field1308[var9], 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class10[] var10 = new class10[this.field1308.length];
            for (int var11 = 0; var11 < this.field1308.length; var11++) {
                var10[var11] = class10.method67(class215.field3758, this.field1308[var11], 0);
            }
            class10 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class10(var10, var10.length);
            }
            if (this.field1296 != null) {
                for (int var13 = 0; var13 < this.field1296.length; var13++) {
                    var12.method76(this.field1296[var13], this.field1322[var13]);
                }
            }
            if (this.field1303 != null) {
                for (int var14 = 0; var14 < this.field1303.length; var14++) {
                    var12.method66(this.field1303[var14], this.field1295[var14]);
                }
            }
            var7 = var12.method58(this.field1289 + 64, this.field1299 + 850, -30, -50, -30);
            class155.field2813.method1025(var7, false, (long) this.field1324);
        }
        int var15 = 101 / ((arg0 + 31) / 61);
        class18 var16;
        if (arg3 != null && arg1 != null) {
            var16 = arg3.method692(var7, (byte) -63, arg4, arg1, arg2);
        } else if (arg3 != null) {
            var16 = arg3.method694(var7, 1, arg4);
        } else if (arg1 == null) {
            var16 = var7.method161(true);
        } else {
            var16 = arg1.method694(var7, 1, arg2);
        }
        if (this.field1284 != 128 || this.field1298 != 128) {
            var16.method163(this.field1284, this.field1298, this.field1284);
        }
        return var16;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILoc;IILoc;Loc;)V")
    public static final void method448(int arg0, class151 arg1, int arg2, int arg3, class151 arg4, class151 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class50.field1003[var6] = class50.field1003[var6 - 1];
            class148.field2644[var6] = class148.field2644[var6 - 1];
            class31.field644[var6] = class31.field644[var6 - 1];
            class16.field391[var6] = class16.field391[var6 - 1];
            class101.field1829[var6] = class101.field1829[var6 - 1];
        }
        if (arg2 != -1) {
            method448(-96, null, -90, -70, null, null);
        }
        class177.field3201++;
        class50.field1003[0] = arg3;
        class43.field878 = class1.field35;
        field1282++;
        class101.field1829[0] = arg0;
        class148.field2644[0] = arg5;
        class31.field644[0] = arg4;
        class16.field391[0] = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lwa;B)V")
    public final void method449(class229 arg0, byte arg1) {
        if (arg1 >= -80) {
            return;
        }
        while (true) {
            int var3 = arg0.method1475(255);
            if (var3 == 0) {
                field1307++;
                return;
            }
            this.method440(var3, arg0, 126);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBLkg;)Lbf;")
    public final class18 method450(int arg0, byte arg1, class115 arg2) {
        int var4 = 6 % ((-arg1 - 5) / 45);
        field1319++;
        if (this.field1291 != null) {
            class67 var5 = this.method446(-99);
            return var5 == null ? null : var5.method450(arg0, (byte) 68, arg2);
        } else if (this.field1294 == null) {
            return null;
        } else {
            class18 var6 = (class18) class216.field3778.method1028((long) this.field1324, false);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < this.field1294.length; var8++) {
                    if (!class215.field3758.method1187(-1, this.field1294[var8], 0)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class10[] var9 = new class10[this.field1294.length];
                for (int var10 = 0; var10 < this.field1294.length; var10++) {
                    var9[var10] = class10.method67(class215.field3758, this.field1294[var10], 0);
                }
                class10 var11;
                if (var9.length == 1) {
                    var11 = var9[0];
                } else {
                    var11 = new class10(var9, var9.length);
                }
                if (this.field1296 != null) {
                    for (int var12 = 0; var12 < this.field1296.length; var12++) {
                        var11.method76(this.field1296[var12], this.field1322[var12]);
                    }
                }
                if (this.field1303 != null) {
                    for (int var13 = 0; var13 < this.field1303.length; var13++) {
                        var11.method66(this.field1303[var13], this.field1295[var13]);
                    }
                }
                var6 = var11.method58(64, 768, -50, -10, -50);
                class216.field3778.method1025(var6, false, (long) this.field1324);
            }
            if (arg2 != null) {
                var6 = arg2.method689((byte) -20, arg0, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLk;I)V")
    public static final void method451(boolean arg0, class108 arg1, int arg2) {
        if (!arg0) {
            field1280 = 56;
        }
        field1288++;
        while (true) {
            class19 var3 = (class19) class168.field3067.method1358(-29726);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field400; var5++) {
                if (var3.field395[var5] != null) {
                    if (var3.field395[var5].field1501 == 2) {
                        var3.field410[var5] = -5;
                    }
                    if (var3.field395[var5].field1501 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field398[var5] != null) {
                    if (var3.field398[var5].field1501 == 2) {
                        var3.field410[var5] = -6;
                    }
                    if (var3.field398[var5].field1501 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method650(-13721, arg2);
            arg1.method1447(-1, 0);
            int var6 = arg1.field4101;
            arg1.method1461(var3.field401, (byte) 43);
            for (int var7 = 0; var7 < var3.field400; var7++) {
                if (var3.field410[var7] == 0) {
                    try {
                        int var8 = var3.field408[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field395[var7].field1503;
                            int var13 = var12.getInt(null);
                            arg1.method1447(-1, 0);
                            arg1.method1461(var13, (byte) 43);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field395[var7].field1503;
                            var9.setInt(null, var3.field409[var7]);
                            arg1.method1447(-1, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field395[var7].field1503;
                            int var11 = var10.getModifiers();
                            arg1.method1447(-1, 0);
                            arg1.method1461(var11, (byte) 70);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field398[var7].field1503;
                            byte[][] var15 = var3.field407[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method1447(-1, 0);
                            } else if (var19 instanceof Number) {
                                arg1.method1447(-1, 1);
                                arg1.method1458((byte) 86, ((Number) var19).longValue());
                            } else if (var19 instanceof class151) {
                                arg1.method1447(-1, 2);
                                arg1.method1479((class151) var19, 165744536);
                            } else {
                                arg1.method1447(-1, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field398[var7].field1503;
                            int var21 = var20.getModifiers();
                            arg1.method1447(-1, 0);
                            arg1.method1461(var21, (byte) 38);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1447(-1, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method1447(-1, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1447(-1, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method1447(-1, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method1447(-1, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1447(-1, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method1447(-1, -16);
                    } catch (SecurityException var29) {
                        arg1.method1447(-1, -17);
                    } catch (IOException var30) {
                        arg1.method1447(-1, -18);
                    } catch (NullPointerException var31) {
                        arg1.method1447(-1, -19);
                    } catch (Exception var32) {
                        arg1.method1447(-1, -20);
                    } catch (Throwable var33) {
                        arg1.method1447(-1, -21);
                    }
                } else {
                    arg1.method1447(-1, var3.field410[var7]);
                }
            }
            arg1.method1446(var6, -1);
            arg1.method1434(-124, arg1.field4101 - var6);
            var3.method636(67);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
    public static final boolean method452(int arg0, byte arg1) {
        if (arg1 != 120) {
            return false;
        }
        field1279++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
