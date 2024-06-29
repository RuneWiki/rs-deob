import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class69 implements class2 {

    @OriginalMember(owner = "client!hj", name = "ib", descriptor = "Z")
    private boolean field1355 = true;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "Lhj;")
    public static class69 field1318 = class181.method1318("<br>", (byte) -115);

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lhj;")
    public static class69 field1304 = class181.method1318("underlay", (byte) -127);

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[I")
    public static int[] field1308 = new int[256];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!hj", name = "gb", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!hj", name = "hb", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!hj", name = "jb", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!hj", name = "kb", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!hj", name = "lb", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!hj", name = "mb", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!hj", name = "nb", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!hj", name = "ob", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!hj", name = "pb", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!hj", name = "qb", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!hj", name = "rb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!hj", name = "sb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Lnc;")
    public static class83 field1339;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hj", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field1366;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "[B")
    public byte[] field1351;

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "[I")
    public static int[] field1350;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLjava/applet/Applet;)Lhj;")
    public final class69 method437(boolean arg0, Applet arg1) {
        String var3 = new String(this.field1351, 0, this.field1331);
        if (arg0) {
            String var4 = arg1.getParameter(var3);
            field1345++;
            return var4 == null ? null : class82.method581(var4, 2462);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lhj;Lhj;I)Lhj;")
    public final class69 method438(class69 arg0, class69 arg1, int arg2) {
        field1301++;
        int var4 = this.field1331;
        int var5 = arg0.field1331 - arg1.field1331;
        int var6 = 0;
        while (true) {
            int var7 = this.method471(113, var6, arg1);
            if (var7 < 0) {
                if (arg2 >= -23) {
                    return null;
                }
                int var8 = 0;
                class69 var9 = class103.method758(var4, true);
                while (true) {
                    int var10 = this.method471(113, var8, arg1);
                    if (var10 < 0) {
                        while (this.field1331 > var8) {
                            var9.method454(this.field1351[var8++] & 0xFF, -69);
                        }
                        return var9;
                    }
                    while (var10 > var8) {
                        var9.method454(this.field1351[var8++] & 0xFF, -60);
                    }
                    var9.method462(8914, arg0);
                    var8 += arg1.field1331;
                }
            }
            var6 = arg1.field1331 + var7;
            var4 += var5;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)J")
    public final long method439(int arg0) {
        field1307++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1331; var4++) {
            var2 = (var2 << 5) + ((long) (this.field1351[var4] & 0xFF)) - var2;
        }
        if (arg0 <= 28) {
            this.method478(126, 94);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I")
    public final int method440(int arg0) {
        field1305++;
        int var2 = 0;
        if (arg0 != -1) {
            this.hashCode();
        }
        for (int var3 = 0; var3 < this.field1331; var3++) {
            var2 = (var2 << 5) - (var2 - (this.field1351[var3] & 0xFF));
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I")
    public final int method441(byte arg0) {
        if (arg0 != 73) {
            this.field1331 = -73;
        }
        field1309++;
        return this.field1331;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)Lhj;")
    public final class69 method442(int arg0) {
        if (arg0 >= -50) {
            field1304 = null;
        }
        int var2 = this.field1331;
        field1335++;
        int var3;
        for (var3 = 0; var3 < this.field1331 && (this.field1351[var3] >= 0 && this.field1351[var3] <= 32 || (this.field1351[var3] & 0xFF) == 160); var3++) {
        }
        while (var2 > var3 && (this.field1351[var2 - 1] >= 0 && this.field1351[var2 - 1] <= 32 || (this.field1351[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field1331 == var2) {
            return this;
        }
        class69 var4 = new class69();
        var4.field1331 = var2 - var3;
        var4.field1351 = new byte[var4.field1331];
        for (int var5 = 0; var5 < var4.field1331; var5++) {
            var4.field1351[var5] = this.field1351[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public static int method443(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLhj;)Z")
    public final boolean method444(byte arg0, class69 arg1) {
        field1324++;
        if (arg1 == null) {
            return false;
        } else if (this.field1331 == arg1.field1331) {
            if (!this.field1355 || !arg1.field1355) {
                if (this.field1361 == 0) {
                    this.field1361 = this.method440(-1);
                    if (this.field1361 == 0) {
                        this.field1361 = 1;
                    }
                }
                if (arg1.field1361 == 0) {
                    arg1.field1361 = arg1.method440(-1);
                    if (arg1.field1361 == 0) {
                        arg1.field1361 = 1;
                    }
                }
                if (this.field1361 != arg1.field1361) {
                    return false;
                }
            }
            if (arg0 != -24) {
                this.field1361 = -44;
            }
            for (int var3 = 0; var3 < this.field1331; var3++) {
                if (this.field1351[var3] != arg1.field1351[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1315++;
        return this.method440(-1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lhj;I)I")
    public final int method445(class69 arg0, int arg1) {
        int var3 = 0;
        field1348++;
        int var4 = this.field1331;
        int var5 = 0;
        int var6 = arg0.field1331;
        int var7 = arg0.field1331;
        int var8 = this.field1331;
        int var9 = 0;
        int var10 = 0;
        while (var4 != 0 && var7 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field1351[var9] & 0xFF;
                var9++;
            }
            if (class212.method1530(var3, false)) {
                var8++;
            } else {
                var4--;
            }
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = arg0.field1351[var10] & 0xFF;
                var10++;
            }
            if (class212.method1530(var5, false)) {
                var6++;
            } else {
                var7--;
            }
            if (class156.field2915[var5] > class156.field2915[var3]) {
                return -1;
            }
            if (class156.field2915[var5] < class156.field2915[var3]) {
                return 1;
            }
        }
        if (arg1 != 10) {
            this.method483((byte) 36, 111);
        }
        if (var8 < var6) {
            return -1;
        } else if (var8 > var6) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lhj;I)Z")
    public final boolean method446(class69 arg0, int arg1) {
        field1326++;
        if (arg0 == null) {
            return false;
        } else if (this.field1331 == arg0.field1331) {
            for (int var3 = 0; var3 < this.field1331; var3++) {
                byte var5 = this.field1351[var3];
                byte var6 = arg0.field1351[var3];
                if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                    var6 = (byte) (var6 + 32);
                }
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var5 != var6) {
                    return false;
                }
            }
            int var4 = 47 % ((-arg1 - 72) / 46);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Lhj;")
    public final class69 method447(int arg0) {
        field1332++;
        long var2 = this.method439(arg0 + 306);
        synchronized (field1366 == null ? (field1366 = method497("hj")) : field1366) {
            if (class147.field2734 == null) {
                class147.field2734 = new class103(4096);
            } else {
                for (class244 var5 = (class244) class147.field2734.method769(true, var2); var5 != null; var5 = (class244) class147.field2734.method764(true)) {
                    if (this.method444((byte) -24, var5.field4475)) {
                        return var5.field4475;
                    }
                }
            }
            class244 var7 = new class244();
            var7.field4475 = this;
            this.field1355 = false;
            class147.field2734.method761(var2, arg0 + 225, var7);
            if (arg0 != -225) {
                field1304 = null;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)Lhj;")
    public final class69 method448(int arg0) {
        if (arg0 != 1) {
            return null;
        }
        field1342++;
        if (!this.field1355) {
            throw new IllegalArgumentException();
        }
        this.field1361 = 0;
        if (this.field1351.length != this.field1331) {
            byte[] var2 = new byte[this.field1331];
            class1.method4(this.field1351, 0, var2, 0, this.field1331);
            this.field1351 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)I")
    public final int method449(byte arg0, int arg1, int arg2) {
        field1330++;
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field1331; var5++) {
            if (this.field1351[var5] == var4) {
                return var5;
            }
        }
        if (arg0 != -118) {
            field1308 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)[B")
    public final byte[] method450(boolean arg0) {
        field1359++;
        if (this.field1331 == 0) {
            return new byte[0];
        }
        int var2 = this.field1331 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (this.field1331 <= var2 - 2 || class217.method1555(-140, this.field1351[var2 - 2]) == -1) {
            var3 -= 2;
        } else if ((var2 - 1) >= this.field1331 || class217.method1555(-140, this.field1351[var2 - 1]) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method453(var4, arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)V")
    public static final void method451(int arg0) {
        field1354++;
        class104.field1952.method1709((byte) -41);
        if (arg0 == 10828) {
            class98.field1826.method1709((byte) -94);
            class193.field3497.method1709((byte) -117);
        }
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)Lhj;")
    public final class69 method452(int arg0) {
        field1333++;
        class69 var2 = new class69();
        var2.field1331 = this.field1331;
        var2.field1351 = new byte[this.field1331];
        boolean var3 = true;
        if (arg0 != 122) {
            method492(86, 49, 31L, (class69) null, (class69) null, 83, (short) -103);
        }
        for (int var4 = 0; var4 < this.field1331; var4++) {
            byte var5 = this.field1351[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1351[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1351[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field1351[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([BZI)I")
    private final int method453(byte[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method449((byte) -30, -120, -125);
        }
        field1295++;
        int var4 = arg2;
        for (int var5 = 0; var5 < this.field1331; var5 += 4) {
            int var6 = class217.method1555(-140, this.field1351[var5]);
            int var7 = (var5 + 1) < this.field1331 ? class217.method1555(-140, this.field1351[var5 + 1]) : -1;
            int var8 = (var5 + 2) >= this.field1331 ? -1 : class217.method1555(-140, this.field1351[var5 + 2]);
            int var9 = this.field1331 > var5 + 3 ? class217.method1555(-140, this.field1351[var5 + 3]) : -1;
            arg0[arg2++] = (byte) class230.method1644(var6 << 2, var7 >>> 4);
            if (var8 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class230.method1644(var8 >>> 2, method443(var7, 15) << 4);
            if (var9 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class230.method1644(var9, method443(var8 << 6, 192));
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Lhj;")
    public final class69 method454(int arg0, int arg1) {
        field1360++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field1355) {
            this.field1361 = 0;
            if (arg1 > -58) {
                return null;
            }
            if (this.field1351.length == this.field1331) {
                int var3;
                for (var3 = 1; var3 <= this.field1331; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class1.method4(this.field1351, 0, var4, 0, this.field1331);
                this.field1351 = var4;
            }
            this.field1351[this.field1331++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)V")
    public final void method455(int arg0) {
        String var2;
        try {
            var2 = new String(this.field1351, 0, this.field1331, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field1351, 0, this.field1331);
        }
        int var3 = 50 % ((arg0 + 80) / 40);
        System.out.println(var2);
        field1363++;
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(I)V")
    public static final void method456(int arg0) {
        field1336++;
        if (class135.field2528 < 0) {
            class135.field2528 = 0;
            class109.field2089 = -1;
            class4.field32 = -1;
        }
        if (arg0 != 1) {
            return;
        }
        if (class135.field2528 > class84.field1626) {
            class4.field32 = -1;
            class135.field2528 = class84.field1626;
            class109.field2089 = -1;
        }
        if (class102.field1905 < 0) {
            class109.field2089 = -1;
            class102.field1905 = 0;
            class4.field32 = -1;
        }
        if (class22.field306 < class102.field1905) {
            class4.field32 = -1;
            class102.field1905 = class22.field306;
            class109.field2089 = -1;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)I")
    public final int method457(byte arg0, int arg1) {
        boolean var3 = false;
        int var4 = 110 % ((-arg0 - 3) / 50);
        field1299++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = 0;
        boolean var6 = false;
        for (int var7 = 0; var7 < this.field1331; var7++) {
            int var8 = this.field1351[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var8) {
                throw new NumberFormatException();
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var5 + var8;
            if ((var9 / arg1) != var5) {
                throw new NumberFormatException();
            }
            var5 = var9;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method458(int arg0, FontMetrics arg1) {
        if (arg0 != -39) {
            this.method482((byte) -12);
        }
        field1317++;
        String var3;
        try {
            var3 = new String(this.field1351, 0, this.field1331, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1351, 0, this.field1331);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIIIII)V")
    public static final void method459(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3 - arg2;
        if (arg0 >= -99) {
            method460(48, 34, 62);
        }
        int var7 = arg4 - arg5;
        field1357++;
        if (var7 == 0) {
            if (var6 != 0) {
                class211.method1524(arg2, arg3, arg1, (byte) 58, arg5);
            }
        } else if (var6 == 0) {
            class104.method775(arg1, arg4, arg2, 16870, arg5);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                arg5 = arg2;
                arg2 = var9;
                int var10 = arg4;
                arg4 = arg3;
                arg3 = var10;
            }
            if (arg5 > arg4) {
                int var11 = arg2;
                arg2 = arg3;
                arg3 = var11;
                int var12 = arg5;
                arg5 = arg4;
                arg4 = var12;
            }
            int var13 = arg4 - arg5;
            int var14 = arg3 - arg2;
            int var15 = -(var13 >> 1);
            int var16 = arg3 > arg2 ? 1 : -1;
            int var17 = arg2;
            if (var14 < 0) {
                var14 = -var14;
            }
            if (var8) {
                for (int var18 = arg5; var18 <= arg4; var18++) {
                    class186.field3402[var18][var17] = arg1;
                    var15 += var14;
                    if (var15 > 0) {
                        var17 += var16;
                        var15 -= var13;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg4; var19++) {
                    var15 += var14;
                    class186.field3402[var17][var19] = arg1;
                    if (var15 > 0) {
                        var15 -= var13;
                        var17 += var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)I")
    public static final int method460(int arg0, int arg1, int arg2) {
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        field1347++;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return arg0 == -1 ? var5 >> 19 & 0xFF : -9;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lhj;III)Lhj;")
    public final class69 method461(class69 arg0, int arg1, int arg2, int arg3) {
        field1329++;
        if (!this.field1355) {
            throw new IllegalArgumentException();
        }
        if (arg1 < 19) {
            this.method488(22);
        }
        if (arg3 < 0 || arg2 < arg3 || arg0.field1331 < arg2) {
            throw new IllegalArgumentException();
        }
        this.field1361 = 0;
        if (this.field1351.length < (this.field1331 + arg2 - arg3)) {
            int var5;
            for (var5 = 1; var5 < (this.field1331 + arg0.field1331); var5 += var5) {
            }
            byte[] var6 = new byte[var5];
            class1.method4(this.field1351, 0, var6, 0, this.field1331);
            this.field1351 = var6;
        }
        class1.method4(arg0.field1351, arg3, this.field1351, this.field1331, arg2 - arg3);
        this.field1331 += arg2 - arg3;
        return this;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILhj;)Lhj;")
    public final class69 method462(int arg0, class69 arg1) {
        field1346++;
        if (!this.field1355) {
            throw new IllegalArgumentException();
        }
        this.field1361 = 0;
        if (this.field1351.length < this.field1331 + arg1.field1331) {
            int var3;
            for (var3 = 1; var3 < (this.field1331 + arg1.field1331); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class1.method4(this.field1351, 0, var4, 0, this.field1331);
            this.field1351 = var4;
        }
        if (arg0 == 8914) {
            class1.method4(arg1.field1351, 0, this.field1351, this.field1331, arg1.field1331);
            this.field1331 += arg1.field1331;
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(BLhj;)Z")
    public final boolean method463(byte arg0, class69 arg1) {
        field1298++;
        if (arg1.field1331 > this.field1331) {
            return false;
        }
        if (arg0 != 85) {
            this.method470((byte) 30);
        }
        for (int var3 = 0; var3 < arg1.field1331; var3++) {
            byte var4 = this.field1351[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field1351[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
    public final void method464(int arg0, byte arg1) {
        this.field1361 = 0;
        field1349++;
        if (!this.field1355) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field1351.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class1.method4(this.field1351, 0, var4, 0, this.field1331);
                this.field1351 = var4;
            }
            if (arg1 == 46) {
                for (int var5 = this.field1331; var5 < arg0; var5++) {
                    this.field1351[var5] = 32;
                }
                this.field1331 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lhj;B)I")
    public final int method465(class69 arg0, byte arg1) {
        int var3;
        if (arg0.field1331 < this.field1331) {
            var3 = arg0.field1331;
        } else {
            var3 = this.field1331;
        }
        field1352++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field1351[var4] & 0xFF) > (this.field1351[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field1351[var4] & 0xFF) < (this.field1351[var4] & 0xFF)) {
                return 1;
            }
        }
        int var5 = 34 % ((61 - arg1) / 45);
        if (arg0.field1331 > this.field1331) {
            return -1;
        } else if (arg0.field1331 < this.field1331) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lkk;B)V")
    public static final void method466(class222 arg0, byte arg1) {
        arg0.field4002 = false;
        field1365++;
        if (arg0.field3996 != -1) {
            class159 var2 = class211.method1521(-81, arg0.field3996);
            if (var2 == null || var2.field2962 == null) {
                arg0.field3996 = -1;
            } else {
                arg0.field4015++;
                if (var2.field2962.length > arg0.field4055 && arg0.field4015 > var2.field2941[arg0.field4055]) {
                    arg0.field4015 = 1;
                    arg0.field4055++;
                    class248.method1748(arg0.field4005, arg0.field3985, var2, 0, arg0.field4055, class156.field2904 == arg0);
                }
                if (var2.field2962.length <= arg0.field4055) {
                    arg0.field4055 = 0;
                    arg0.field4015 = 0;
                    class248.method1748(arg0.field4005, arg0.field3985, var2, -105, arg0.field4055, class156.field2904 == arg0);
                }
            }
        }
        if (arg0.field3992 != -1 && class180.field3272 >= arg0.field4020) {
            int var3 = class213.method1533(128, arg0.field3992).field561;
            if (var3 == -1) {
                arg0.field3992 = -1;
            } else {
                class159 var4 = class211.method1521(-96, var3);
                if (var4 == null || var4.field2962 == null) {
                    arg0.field3992 = -1;
                } else {
                    if (arg0.field4027 < 0) {
                        arg0.field4027 = 0;
                        class248.method1748(arg0.field4005, arg0.field3985, var4, 113, 0, class156.field2904 == arg0);
                    }
                    arg0.field4047++;
                    if (var4.field2962.length > arg0.field4027 && var4.field2941[arg0.field4027] < arg0.field4047) {
                        arg0.field4047 = 1;
                        arg0.field4027++;
                        class248.method1748(arg0.field4005, arg0.field3985, var4, 122, arg0.field4027, class156.field2904 == arg0);
                    }
                    if (arg0.field4027 >= var4.field2962.length) {
                        arg0.field3992 = -1;
                    }
                }
            }
        }
        if (arg0.field4010 != -1 && arg0.field4006 <= 1) {
            class159 var5 = class211.method1521(-90, arg0.field4010);
            if (var5.field2965 == 1 && arg0.field4009 > 0 && arg0.field4028 <= class180.field3272 && class180.field3272 > arg0.field4056) {
                arg0.field4006 = 1;
                return;
            }
        }
        if (arg0.field4010 != -1 && arg0.field4006 == 0) {
            class159 var6 = class211.method1521(-85, arg0.field4010);
            if (var6 == null || var6.field2962 == null) {
                arg0.field4010 = -1;
            } else {
                arg0.field3993++;
                if (var6.field2962.length > arg0.field4022 && arg0.field3993 > var6.field2941[arg0.field4022]) {
                    arg0.field3993 = 1;
                    arg0.field4022++;
                    class248.method1748(arg0.field4005, arg0.field3985, var6, -105, arg0.field4022, class156.field2904 == arg0);
                }
                if (var6.field2962.length <= arg0.field4022) {
                    arg0.field3995++;
                    arg0.field4022 -= var6.field2943;
                    if (var6.field2969 <= arg0.field3995) {
                        arg0.field4010 = -1;
                    } else if (arg0.field4022 >= 0 && arg0.field4022 < var6.field2962.length) {
                        class248.method1748(arg0.field4005, arg0.field3985, var6, 116, arg0.field4022, class156.field2904 == arg0);
                    } else {
                        arg0.field4010 = -1;
                    }
                }
                arg0.field4002 = var6.field2961;
            }
        }
        if (arg1 <= -51 && arg0.field4006 > 0) {
            arg0.field4006--;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
    public final URL method467(URL arg0, int arg1) throws MalformedURLException {
        if (arg1 <= 95) {
            this.field1361 = 7;
        }
        field1321++;
        return new URL(arg0, new String(this.field1351, 0, this.field1331));
    }

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "(I)V")
    public static final void method468(int arg0) {
        if (arg0 != 20513) {
            method456(121);
        }
        if (class29.field421 != null) {
            class29.field421.method1001(2);
        }
        if (class194.field3551 != null) {
            class194.field3551.method1001(2);
        }
        class23.method132(2, 22050, true, class95.field1784);
        class29.field421 = class119.method864(0, class36.field508, class212.field3862, -16729, 22050);
        class29.field421.method994(-7667, class63.field1214);
        class194.field3551 = class119.method864(1, class36.field508, class212.field3862, arg0 ^ 0xFFFFEE86, 2048);
        class194.field3551.method994(arg0 ^ 0xFFFFB22C, class54.field959);
        field1312++;
    }

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)[B")
    public final byte[] method469(int arg0) {
        byte[] var2 = new byte[this.field1331];
        class1.method4(this.field1351, 0, var2, 0, this.field1331);
        field1358++;
        if (arg0 < 125) {
            field1350 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1300++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!hj", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1341++;
        if (!arg0 instanceof class69) {
            throw new IllegalArgumentException();
        }
        return this.method444((byte) -24, (class69) arg0);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Lhj;")
    public final class69 method470(byte arg0) {
        field1323++;
        class69 var2 = new class69();
        if (arg0 != 37) {
            this.field1331 = 51;
        }
        var2.field1331 = this.field1331;
        var2.field1351 = new byte[this.field1331];
        for (int var3 = 0; var3 < this.field1331; var3++) {
            byte var4 = this.field1351[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1351[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILhj;)I")
    public final int method471(int arg0, int arg1, class69 arg2) {
        field1313++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg2.field1331];
        int[] var6 = new int[arg2.field1331];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg2.field1331;
        }
        if (arg0 < 21) {
            return 109;
        }
        for (int var8 = 1; var8 <= arg2.field1331; var8++) {
            var5[var8 - 1] = (arg2.field1331 << 1) - var8;
            var4[method443(arg2.field1351[var8 - 1], 255)] = arg2.field1331 - var8;
        }
        int var9 = arg2.field1331 + 1;
        int var10 = arg2.field1331;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg2.field1331 && arg2.field1351[var9 - 1] != arg2.field1351[var10 - 1]) {
                if ((arg2.field1331 - var10) <= var5[var9 - 1]) {
                    var5[var9 - 1] = arg2.field1331 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = 0;
        int var13 = 1;
        int var14 = arg2.field1331 + 1 - var9;
        int var15 = 1;
        while (var15 <= var14) {
            var6[var15 - 1] = var12;
            while (var12 >= 1 && arg2.field1351[var15 - 1] != arg2.field1351[var12 - 1]) {
                var12 = var6[var12 - 1];
            }
            var15++;
            var12++;
        }
        while (var11 < arg2.field1331) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var5[var18 - 1] >= (var11 + arg2.field1331 - var18)) {
                    var5[var18 - 1] = arg2.field1331 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var14 - var6[var14 + -1];
            var14 = var6[var14 - 1];
        }
        int var17;
        for (int var16 = arg2.field1331 + arg1 - 1; var16 < this.field1331; var16 += Math.max(var4[this.field1351[var16] & 0xFF], var5[var17])) {
            for (var17 = arg2.field1331 - 1; var17 >= 0 && this.field1351[var16] == arg2.field1351[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)I")
    public final int method472(int arg0, boolean arg1) {
        field1334++;
        byte var3 = (byte) arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1331; var5++) {
            if (this.field1351[var5] == var3) {
                var4++;
            }
        }
        if (!arg1) {
            this.method453((byte[]) null, false, -9);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)J")
    public final long method473(byte arg0) {
        field1325++;
        long var2 = 0L;
        if (arg0 <= 45) {
            this.field1351 = null;
        }
        for (int var4 = 0; var4 < this.field1331 && var4 < 12; var4++) {
            byte var5 = this.field1351[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 - 64);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (1 - (97 - var5));
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IB)Z")
    private final boolean method474(int arg0, byte arg1) {
        field1343++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        if (arg1 != 39) {
            return false;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1331; var6++) {
            int var7 = this.field1351[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg0 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)Z")
    public final boolean method475(boolean arg0) {
        if (arg0) {
            field1297++;
            return this.method474(10, (byte) 39);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/applet/Applet;)V")
    public final void method476(int arg0, Applet arg1) throws Throwable {
        String var3 = new String(this.field1351, arg0, this.field1331);
        field1302++;
        class234.method1657(11859, arg1, var3);
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)Ljava/net/URL;")
    public final URL method477(byte arg0) throws MalformedURLException {
        if (arg0 >= -25) {
            this.field1355 = false;
        }
        field1320++;
        return new URL(new String(this.field1351, 0, this.field1331));
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)Lhj;")
    public final class69 method478(int arg0, int arg1) {
        if (arg0 >= -67) {
            this.field1351 = null;
        }
        field1322++;
        return this.method485(this.field1331, arg1, (byte) -20);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)I")
    public final int method479(byte arg0) {
        if (arg0 == -27) {
            field1344++;
            return this.method457((byte) -72, 10);
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;")
    public final Object method480(Applet arg0, int arg1) throws Throwable {
        field1306++;
        String var3 = new String(this.field1351, 0, this.field1331);
        if (arg1 <= 0) {
            return null;
        }
        Object var4 = class234.method1656(arg0, var3, (Object[]) null, -4446);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class38.method209(101, 0, var5.length, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(ILhj;)I")
    public final int method481(int arg0, class69 arg1) {
        if (arg0 == 0) {
            field1303++;
            return this.method471(26, 0, arg1);
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)Lhj;")
    public final class69 method482(byte arg0) {
        field1340++;
        class69 var2 = new class69();
        var2.field1331 = this.field1331;
        var2.field1351 = new byte[var2.field1331];
        for (int var3 = 0; var3 < this.field1331; var3++) {
            var2.field1351[this.field1331 - var3 - 1] = this.field1351[var3];
        }
        if (arg0 > -25) {
            this.method483((byte) 114, -67);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(BI)Lhj;")
    public final class69 method483(byte arg0, int arg1) {
        field1314++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class69 var3 = new class69();
        var3.field1351 = new byte[this.field1331 + 1];
        var3.field1331 = this.field1331 + 1;
        if (arg0 > -115) {
            return null;
        } else {
            class1.method4(this.field1351, 0, var3.field1351, 0, this.field1331);
            var3.field1351[this.field1331] = (byte) arg1;
            return var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)Lhj;")
    public final class69 method484(boolean arg0) {
        if (arg0) {
            field1308 = null;
        }
        field1296++;
        class69 var2 = class101.method749(this.method473((byte) 121), 25801);
        return var2 == null ? class49.field720 : var2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Lhj;")
    public final class69 method485(int arg0, int arg1, byte arg2) {
        field1319++;
        class69 var4 = new class69();
        var4.field1331 = arg0 - arg1;
        var4.field1351 = new byte[arg0 - arg1];
        if (arg2 == -20) {
            class1.method4(this.field1351, arg1, var4.field1351, 0, var4.field1331);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(II)I")
    public final int method486(int arg0, int arg1) {
        if (arg0 == 0) {
            field1362++;
            return this.method449((byte) -118, 0, arg1);
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Lhj;I)Z")
    public final boolean method487(class69 arg0, int arg1) {
        field1338++;
        if (this.field1331 < arg0.field1331) {
            return false;
        }
        int var3 = this.field1331 - arg0.field1331;
        int var4 = 0;
        if (arg1 != 28160) {
            return true;
        }
        while (arg0.field1331 > var4) {
            if (this.field1351[var3 + var4] != arg0.field1351[var4]) {
                return false;
            }
            var4++;
        }
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "(I)Lhj;")
    public final class69 method488(int arg0) {
        if (arg0 != 8) {
            return null;
        }
        field1337++;
        class69 var2 = new class69();
        byte var3 = 2;
        var2.field1331 = this.field1331;
        var2.field1351 = new byte[this.field1331];
        for (int var4 = 0; var4 < this.field1331; var4++) {
            byte var5 = this.field1351[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field1351[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLhj;)Z")
    public final boolean method489(boolean arg0, class69 arg1) {
        field1353++;
        if (!arg0) {
            field1350 = null;
        }
        if (this.field1331 < arg1.field1331) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field1331; var3++) {
            if (this.field1351[var3] != arg1.field1351[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(II)I")
    public final int method490(int arg0, int arg1) {
        if (arg0 < 78) {
            return 37;
        } else {
            field1364++;
            return this.field1351[arg1] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(II)[Lhj;")
    public final class69[] method491(int arg0, int arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1331; var4++) {
            if (this.field1351[var4] == arg0) {
                var3++;
            }
        }
        field1327++;
        class69[] var5 = new class69[arg1 + var3];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field1351[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method485(var7 + var9, var7, (byte) -20);
            var7 += var9 + 1;
        }
        var5[var3] = this.method485(this.field1331, var7, (byte) -20);
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIJLhj;Lhj;IS)V")
    public static final void method492(int arg0, int arg1, long arg2, class69 arg3, class69 arg4, int arg5, short arg6) {
        field1311++;
        if (class103.field1936) {
            return;
        }
        if (class177.field3218 < 500) {
            class26.field374[class177.field3218] = arg4;
            class216.field3917[class177.field3218] = arg3;
            class208.field3782[class177.field3218] = arg6;
            class113.field2177[class177.field3218] = arg2;
            class38.field526[class177.field3218] = arg5;
            class66.field1277[class177.field3218] = arg1;
            class177.field3218++;
        }
        if (arg0 <= 87) {
            method460(38, 63, 108);
        }
    }

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "(I)V")
    public static final void method493(int arg0) {
        field1328++;
        if (class233.field4252 == 2) {
            if (class256.field4601 == class109.field2079 && class240.field4416 == class109.field2087) {
                class233.field4252 = 0;
                class112.method831((byte) -37, class177.field3218 - 1);
            }
        } else if (class56.field1020 == class256.field4601 && class240.field4416 == class207.field3776) {
            class233.field4252 = 0;
            class112.method831((byte) 96, class177.field3218 - 1);
        } else {
            class233.field4252 = 2;
            class109.field2087 = class207.field3776;
            class109.field2079 = class56.field1020;
        }
        if (arg0 != -1) {
            field1308 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(B)V")
    public static void method494(byte arg0) {
        field1339 = null;
        field1318 = null;
        if (arg0 >= -8) {
            method493(102);
        }
        field1304 = null;
        field1350 = null;
        field1308 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[BIII)I")
    public final int method495(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        class1.method4(this.field1351, arg2, arg1, arg4, arg3 - arg2);
        field1356++;
        if (arg0 != 156) {
            this.method438((class69) null, (class69) null, -121);
        }
        return arg3 - arg2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method496(Graphics arg0, int arg1, int arg2, int arg3) {
        field1316++;
        String var5;
        try {
            var5 = new String(this.field1351, arg2, this.field1331, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1351, 0, this.field1331);
        }
        arg0.drawString(var5, arg3, arg1);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method497(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
