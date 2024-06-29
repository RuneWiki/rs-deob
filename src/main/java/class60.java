import java.awt.Graphics;
import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 extends class67 {

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "[B")
    public byte[] field1248;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Lrd;")
    public static class114 field1219 = class84.method656("Texturen geladen)3", (byte) 120);

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "Lrd;")
    public static class114 field1250 = null;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "J")
    public static long field1225 = 0L;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Lrd;")
    public static class114 field1240 = class84.method656("Stufe)2", (byte) 122);

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "Lrd;")
    public static class114 field1253 = class84.method656("p11_full", (byte) 126);

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1233 = 0;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public static int field1252 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!id", name = "Ib", descriptor = "Lrd;")
    private static class114 field1280 = class84.method656("Loading config )2 ", (byte) 123);

    @OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
    public static int field1263 = 0;

    @OriginalMember(owner = "client!id", name = "Lb", descriptor = "Lrd;")
    public static class114 field1283 = class84.method656("Ihr Charakter)2Profil wird in:", (byte) 120);

    @OriginalMember(owner = "client!id", name = "Kb", descriptor = "Lrd;")
    public static class114 field1282 = class84.method656(" hat sich eingeloggt)3", (byte) 114);

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "Lrd;")
    public static class114 field1236 = field1280;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!id", name = "sb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!id", name = "tb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!id", name = "ub", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!id", name = "vb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!id", name = "wb", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!id", name = "xb", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!id", name = "yb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!id", name = "zb", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!id", name = "Ab", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!id", name = "Bb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!id", name = "Cb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!id", name = "Db", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!id", name = "Eb", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!id", name = "Fb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!id", name = "Gb", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!id", name = "Hb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!id", name = "Jb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!id", name = "Mb", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!id", name = "Nb", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!id", name = "Ob", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!id", name = "Pb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!id", name = "Qb", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!id", name = "Sb", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!id", name = "Tb", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "Loa;")
    public static class93 field1251;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "[I")
    public static int[] field1232;

    @OriginalMember(owner = "client!id", name = "Rb", descriptor = "[I")
    public static int[] field1289;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
    public final void method441(byte arg0, int arg1) {
        if (arg0 <= 11) {
            field1241 = 48;
        }
        field1281++;
        this.field1248[this.field1227++] = (byte) (arg1 >> 8);
        this.field1248[this.field1227++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
    public final int method442(byte arg0) {
        if (arg0 >= -16) {
            return 87;
        } else {
            this.field1227 += 4;
            field1255++;
            return ((this.field1248[this.field1227 - 3] & 0xFF) << 16) + (this.field1248[this.field1227 - 4] << 24 & 0xFF000000) + ((this.field1248[this.field1227 + -2] & 0xFF) << 8) + (this.field1248[this.field1227 + -1] & 0xFF);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)I")
    public final int method443(byte arg0) {
        this.field1227 += 2;
        field1247++;
        int var2 = ((this.field1248[this.field1227 - 1] & 0xFF) << 8) + (this.field1248[this.field1227 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        int var3 = -14 % ((67 - arg0) / 56);
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(BI)V")
    public final void method444(byte arg0, int arg1) {
        this.field1248[this.field1227++] = (byte) -arg1;
        field1262++;
        if (arg0 != 108) {
            field1232 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)B")
    public final byte method445(int arg0) {
        field1287++;
        if (arg0 >= -106) {
            this.field1248 = null;
        }
        return (byte) (this.field1248[this.field1227++] - 128);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(Z)I")
    public final int method446(boolean arg0) {
        this.field1227 += 2;
        if (arg0) {
            field1280 = null;
        }
        field1234++;
        int var2 = ((this.field1248[this.field1227 - 2] & 0xFF) << 8) + (this.field1248[this.field1227 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(Z)I")
    public final int method447(boolean arg0) {
        field1254++;
        if (arg0) {
            this.method449(false);
        }
        this.field1227 += 2;
        int var2 = ((this.field1248[this.field1227 - 1] & 0xFF) << 8) + (this.field1248[this.field1227 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lib;")
    public static final class58 method448(Throwable arg0, String arg1) {
        field1256++;
        class58 var2;
        if (arg0 instanceof class58) {
            var2 = (class58) arg0;
            var2.field1199 = var2.field1199 + ' ' + arg1;
        } else {
            var2 = new class58(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(Z)B")
    public final byte method449(boolean arg0) {
        if (arg0) {
            field1268++;
            return this.field1248[this.field1227++];
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
    public final void method450(int arg0, int arg1) {
        field1260++;
        if (arg0 != 0) {
            field1219 = null;
        }
        this.field1248[this.field1227++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)I")
    public final int method451(byte arg0) {
        if (arg0 < 67) {
            return 2;
        } else {
            field1221++;
            return this.field1248[this.field1227++] - 128 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILrd;)V")
    public final void method452(int arg0, class114 arg1) {
        this.field1227 += arg1.method874(arg0 + 6504, 0, this.field1248, this.field1227, arg1.method854(arg0 - 22753));
        if (arg0 != -6595) {
            this.method444((byte) -7, -84);
        }
        field1245++;
        this.field1248[this.field1227++] = 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BII)V")
    public final void method453(int arg0, byte[] arg1, int arg2, int arg3) {
        field1243++;
        int var5 = arg2 + arg3 - 1;
        if (arg0 >= -67) {
            field1225 = -71L;
        }
        while (var5 >= arg3) {
            arg1[var5] = (byte) (this.field1248[this.field1227++] - 128);
            var5--;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
    public final void method454(int arg0, int arg1) {
        field1291++;
        this.field1248[this.field1227++] = (byte) (128 - arg0);
        if (arg1 != -4) {
            this.method456(45);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)V")
    public final void method455(long arg0, int arg1) {
        if (arg1 != 2) {
            field1253 = null;
        }
        this.field1248[this.field1227++] = (byte) (arg0 >> 56);
        this.field1248[this.field1227++] = (byte) (arg0 >> 48);
        field1271++;
        this.field1248[this.field1227++] = (byte) (arg0 >> 40);
        this.field1248[this.field1227++] = (byte) (arg0 >> 32);
        this.field1248[this.field1227++] = (byte) (arg0 >> 24);
        this.field1248[this.field1227++] = (byte) (arg0 >> 16);
        this.field1248[this.field1227++] = (byte) (arg0 >> 8);
        this.field1248[this.field1227++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)Lrd;")
    public final class114 method456(int arg0) {
        if (arg0 != -1) {
            this.method495((byte) 119, -95);
        }
        field1230++;
        int var2 = this.field1227;
        while (this.field1248[this.field1227++] != 0) {
        }
        return class28.method204(this.field1248, this.field1227 - var2 - 1, var2, ~arg0);
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(Z)I")
    public final int method457(boolean arg0) {
        if (arg0) {
            field1283 = null;
        }
        this.field1227 += 2;
        field1223++;
        return ((this.field1248[this.field1227 - 1] & 0xFF) << 8) + (this.field1248[this.field1227 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)I")
    public final int method458(int arg0) {
        this.field1227 += 3;
        field1246++;
        if (arg0 != 22604) {
            this.method485(false);
        }
        return (this.field1248[this.field1227 - 2] & 0xFF) + ((this.field1248[this.field1227 - 3] & 0xFF) << 16) + ((this.field1248[this.field1227 + -1] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(Z)I")
    public final int method459(boolean arg0) {
        field1220++;
        if (arg0) {
            this.method454(0, -118);
        }
        int var2 = this.field1248[this.field1227] & 0xFF;
        return var2 < 128 ? this.method462((byte) 116) - 64 : this.method467(255) + -49152;
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(I)B")
    public final byte method460(int arg0) {
        if (arg0 > -103) {
            this.method444((byte) 54, -120);
        }
        field1229++;
        return (byte) -this.field1248[this.field1227++];
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
    public final void method461(BigInteger arg0, BigInteger arg1, boolean arg2) {
        field1264++;
        int var4 = this.field1227;
        this.field1227 = 0;
        byte[] var5 = new byte[var4];
        this.method471(var4, var5, (byte) 70, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        if (arg2) {
            this.field1227 = 0;
            this.method478((byte) -69, var8.length);
            this.method483(var8, (byte) -67, var8.length, 0);
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)I")
    public final int method462(byte arg0) {
        if (arg0 != 116) {
            method474((byte) -17, false, null);
        }
        field1258++;
        return this.field1248[this.field1227++] & 0xFF;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(II)V")
    public final void method463(int arg0, int arg1) {
        field1224++;
        this.field1248[this.field1227++] = (byte) (arg1 >> arg0);
        this.field1248[this.field1227++] = (byte) (arg1 >> 8);
        this.field1248[this.field1227++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
    public final void method464(int arg0, byte arg1) {
        field1235++;
        if (arg1 > 6) {
            this.field1248[this.field1227++] = (byte) (arg0 >> 8);
            this.field1248[this.field1227++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(II)V")
    public final void method465(int arg0, int arg1) {
        field1269++;
        this.field1248[this.field1227++] = (byte) (arg1 + 128);
        if (arg0 != -19962) {
            this.method473(61, null, 26, 16);
        }
        this.field1248[this.field1227++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(I)I")
    public final int method466(int arg0) {
        field1265++;
        if (arg0 != 0) {
            this.field1227 = -84;
        }
        return -this.field1248[this.field1227++] & 0xFF;
    }

    @OriginalMember(owner = "client!id", name = "j", descriptor = "(I)I")
    public final int method467(int arg0) {
        if (arg0 == 255) {
            this.field1227 += 2;
            field1277++;
            return ((this.field1248[this.field1227 - 2] & 0xFF) << 8) + (this.field1248[this.field1227 - 1] & 0xFF);
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([IIZI)V")
    public final void method468(int[] arg0, int arg1, boolean arg2, int arg3) {
        int var5 = this.field1227;
        field1275++;
        if (arg2) {
            return;
        }
        this.field1227 = arg3;
        int var6 = (arg1 - arg3) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = -957401312;
            int var9 = -1640531527;
            int var10 = this.method442((byte) -79);
            int var11 = 32;
            int var12 = this.method442((byte) -109);
            while (var11-- > 0) {
                var12 -= arg0[var8 >>> 11 & 0x3] + var8 ^ (var10 << 4 ^ var10 >>> 5) + var10;
                var8 -= var9;
                var10 -= (var12 << 4 ^ var12 >>> 5) + var12 ^ arg0[var8 & 0x3] + var8;
            }
            this.field1227 -= 8;
            this.method476(-7155, var10);
            this.method476(-7155, var12);
        }
        this.field1227 = var5;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(B)I")
    public final int method469(byte arg0) {
        field1244++;
        if (arg0 >= -51) {
            this.method450(72, -68);
        }
        int var2 = this.field1248[this.field1227] & 0xFF;
        return var2 < 128 ? this.method462((byte) 116) : this.method467(255) - 32768;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(B)I")
    public final int method470(byte arg0) {
        field1242++;
        if (arg0 <= 112) {
            this.method488(-18, -108);
        }
        this.field1227 += 4;
        return ((this.field1248[this.field1227 - 1] & 0xFF) << 8) + ((this.field1248[this.field1227 - 3] & 0xFF) << 24) + ((this.field1248[this.field1227 + -4] & 0xFF) << 16) + (this.field1248[this.field1227 + -2] & 0xFF);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BBI)V")
    public final void method471(int arg0, byte[] arg1, byte arg2, int arg3) {
        field1222++;
        if (arg2 <= 45) {
            this.method471(23, null, (byte) -90, 117);
        }
        for (int var5 = arg3; var5 < arg3 + arg0; var5++) {
            arg1[var5] = this.field1248[this.field1227++];
        }
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(B)I")
    public final int method472(byte arg0) {
        this.field1227 += 4;
        field1276++;
        if (arg0 != -89) {
            this.method450(111, -105);
        }
        return (this.field1248[this.field1227 - 3] & 0xFF) + ((this.field1248[this.field1227 - 4] & 0xFF) << 8) + ((this.field1248[this.field1227 + -2] & 0xFF) << 24) + ((this.field1248[this.field1227 + -1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I[BII)V")
    public final void method473(int arg0, byte[] arg1, int arg2, int arg3) {
        field1259++;
        int var5 = arg0 + arg2 - 1;
        if (arg3 < -3) {
            while (arg0 <= var5) {
                arg1[var5] = this.field1248[this.field1227++];
                var5--;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BZLff;)V")
    public static final void method474(byte arg0, boolean arg1, class42 arg2) {
        field1267++;
        if (arg0 > -83) {
            field1233 = 52;
        }
        if (class65.field1413 != null) {
            try {
                class65.field1413.method292(25830);
            } catch (Exception var8) {
            }
            class65.field1413 = null;
        }
        class65.field1413 = arg2;
        class84.method643((byte) 94, arg1);
        class67.field1455 = 0;
        class141.field3353.field1227 = 0;
        class127.field3046 = null;
        class102.field2392 = null;
        while (true) {
            class128 var3 = (class128) class114.field2664.method776((byte) 104);
            if (var3 == null) {
                while (true) {
                    class128 var4 = (class128) class109.field2520.method776((byte) 104);
                    if (var4 == null) {
                        if (class120.field2791 != 0) {
                            try {
                                class60 var5 = new class60(4);
                                var5.method478((byte) -29, 4);
                                var5.method478((byte) -86, class120.field2791);
                                var5.method464(0, (byte) 86);
                                class65.field1413.method290(false, 4, 0, var5.field1248);
                            } catch (IOException var7) {
                                try {
                                    class65.field1413.method292(25830);
                                } catch (Exception var6) {
                                }
                                class65.field1413 = null;
                                class13.field295++;
                            }
                        }
                        class65.field1401 = 0;
                        class47.field980 = class99.method747(0);
                        return;
                    }
                    class64.field1368.method110(var4, (byte) -20);
                    class70.field1532.method781((byte) -7, var4.field1448, var4);
                    class92.field2154++;
                    class120.field2802--;
                }
            }
            class132.field3195.method781((byte) -7, var3.field1448, var3);
            class48.field1005--;
            class145.field3453++;
        }
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(B)I")
    public final int method475(byte arg0) {
        field1278++;
        this.field1227 += 2;
        if (arg0 < 77) {
            field1236 = null;
        }
        return ((this.field1248[this.field1227 - 2] & 0xFF) << 8) + (this.field1248[this.field1227 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(II)V")
    public final void method476(int arg0, int arg1) {
        field1290++;
        this.field1248[this.field1227++] = (byte) (arg1 >> 24);
        if (arg0 != -7155) {
            this.method457(false);
        }
        this.field1248[this.field1227++] = (byte) (arg1 >> 16);
        this.field1248[this.field1227++] = (byte) (arg1 >> 8);
        this.field1248[this.field1227++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)V")
    public final void method477(int arg0, byte arg1) {
        field1228++;
        if (arg0 >= 0 && arg0 < 128) {
            this.method478((byte) -62, arg0);
            return;
        }
        if (arg1 <= 26) {
            this.method485(false);
        }
        if (arg0 < 0 || arg0 >= 32768) {
            throw new IllegalArgumentException();
        }
        this.method464(arg0 + 32768, (byte) 83);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(BI)V")
    public final void method478(byte arg0, int arg1) {
        int var3 = 111 / ((33 - arg0) / 53);
        this.field1248[this.field1227++] = (byte) arg1;
        field1239++;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(II)V")
    public final void method479(int arg0, int arg1) {
        this.field1248[this.field1227++] = (byte) (arg1 >> 8);
        this.field1248[this.field1227++] = (byte) arg1;
        this.field1248[this.field1227++] = (byte) (arg1 >> 24);
        this.field1248[this.field1227++] = (byte) (arg1 >> 16);
        if (arg0 != 23538) {
            this.method490(true);
        }
        field1273++;
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(B)I")
    public final int method480(byte arg0) {
        field1286++;
        this.field1227 += 2;
        int var2 = -106 / ((arg0 + 1) / 41);
        return ((this.field1248[this.field1227 - 1] & 0xFF) << 8) + (this.field1248[this.field1227 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!id", name = "k", descriptor = "(I)V")
    public static void method481(int arg0) {
        field1236 = null;
        field1232 = null;
        field1289 = null;
        field1250 = null;
        field1219 = null;
        field1283 = null;
        if (arg0 != 24480) {
            method481(-106);
        }
        field1240 = null;
        field1282 = null;
        field1251 = null;
        field1280 = null;
        field1253 = null;
    }

    @OriginalMember(owner = "client!id", name = "l", descriptor = "(I)I")
    public final int method482(int arg0) {
        if (arg0 == 255) {
            field1284++;
            return 128 - this.field1248[this.field1227++] & 0xFF;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BBII)V")
    public final void method483(byte[] arg0, byte arg1, int arg2, int arg3) {
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            this.field1248[this.field1227++] = arg0[var5];
        }
        if (arg1 != -67) {
            this.method469((byte) -80);
        }
        field1257++;
    }

    @OriginalMember(owner = "client!id", name = "j", descriptor = "(B)V")
    public static final void method484(byte arg0) {
        try {
            Graphics var1 = class114.field2678.getGraphics();
            class74.field1676.method526(0, 0, 4, var1);
            class86.field1933.method526(0, 0, 357, var1);
            if (arg0 <= 72) {
                return;
            }
            class79.field1801.method526(0, 722, 4, var1);
            class90.field2115.method526(0, 743, 205, var1);
            class50.field1048.method526(0, 0, 0, var1);
            class29.field580.method526(0, 516, 4, var1);
            class20.field351.method526(0, 516, 205, var1);
            class56.field1178.method526(0, 496, 357, var1);
            client.field411.method526(0, 0, 338, var1);
        } catch (Exception var2) {
            class114.field2678.repaint();
        }
        field1226++;
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(Z)B")
    public final byte method485(boolean arg0) {
        if (arg0) {
            this.field1248 = null;
        }
        field1266++;
        return (byte) (128 - this.field1248[this.field1227++]);
    }

    @OriginalMember(owner = "client!id", name = "m", descriptor = "(I)I")
    public final int method486(int arg0) {
        if (arg0 != 1331464976) {
            return -16;
        }
        this.field1227 += 2;
        int var2 = ((this.field1248[this.field1227 - 2] & 0xFF) << 8) + (this.field1248[this.field1227 - 1] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        field1279++;
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(BI)Lrd;")
    public static final class114 method487(byte arg0, int arg1) {
        field1288++;
        if (arg0 > -85) {
            method448(null, null);
        }
        return class101.method786((byte) 126, new class114[] { class14.method113(arg1 >> 24 & 0xFF, -31766), class74.field1711, class14.method113(arg1 >> 16 & 0xFF, -31766), class74.field1711, class14.method113(arg1 >> 8 & 0xFF, -31766), class74.field1711, class14.method113(arg1 & 0xFF, -31766) });
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        this.field1248[this.field1227++] = (byte) arg0;
        this.field1248[this.field1227++] = (byte) (arg0 >> 8);
        if (arg1 != 357) {
            method481(47);
        }
        this.field1248[this.field1227++] = (byte) (arg0 >> 16);
        field1237++;
        this.field1248[this.field1227++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
    public class60(int arg0) {
        this.field1248 = class103.method796(arg0, true);
        this.field1227 = 0;
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(II)V")
    public final void method489(int arg0, int arg1) {
        this.field1248[this.field1227++] = (byte) (arg0 >> 16);
        this.field1248[this.field1227++] = (byte) (arg0 >> arg1);
        field1249++;
        this.field1248[this.field1227++] = (byte) arg0;
        this.field1248[this.field1227++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(Z)J")
    public final long method490(boolean arg0) {
        if (arg0) {
            return 80L;
        } else {
            long var2 = (long) this.method442((byte) -105) & 0xFFFFFFFFL;
            field1270++;
            long var4 = (long) this.method442((byte) -18) & 0xFFFFFFFFL;
            return (var2 << 32) + var4;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
    public class60(byte[] arg0) {
        this.field1248 = arg0;
        this.field1227 = 0;
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(II)V")
    public final void method491(int arg0, int arg1) {
        this.field1248[this.field1227 + arg0 - arg1] = (byte) arg1;
        field1274++;
    }

    @OriginalMember(owner = "client!id", name = "k", descriptor = "(B)I")
    public final int method492(byte arg0) {
        field1285++;
        this.field1227 += 4;
        return arg0 == -53 ? ((this.field1248[this.field1227 - 1] & 0xFF) << 24) + (this.field1248[this.field1227 - 4] & 0xFF) + ((this.field1248[this.field1227 + -2] & 0xFF) << 16) + ((this.field1248[this.field1227 + -3] & 0xFF) << 8) : 81;
    }

    @OriginalMember(owner = "client!id", name = "l", descriptor = "(B)I")
    public final int method493(byte arg0) {
        field1231++;
        this.field1227 += 3;
        return arg0 > -28 ? -24 : (this.field1248[this.field1227 - 1] & 0xFF) + ((this.field1248[this.field1227 - 3] & 0xFF) << 16) + ((this.field1248[this.field1227 + -2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!id", name = "j", descriptor = "(Z)I")
    public final int method494(boolean arg0) {
        if (!arg0) {
            return 1;
        }
        field1261++;
        byte var2 = this.field1248[this.field1227++];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 0x7F | var3) << 7;
            var2 = this.field1248[this.field1227++];
        }
        return var3 | var2;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(BI)I")
    public final int method495(byte arg0, int arg1) {
        if (arg0 > -114) {
            return -4;
        } else {
            field1272++;
            int var3 = class25.method192(this.field1248, arg1, -23173, this.field1227);
            this.method476(-7155, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(IB)V")
    public final void method496(int arg0, byte arg1) {
        int var3 = -13 % ((-arg1 - 39) / 62);
        field1238++;
        this.field1248[this.field1227++] = (byte) arg0;
        this.field1248[this.field1227++] = (byte) (arg0 >> 8);
    }
}
