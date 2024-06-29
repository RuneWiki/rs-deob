import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class50 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    private int field1223 = 0;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
    private boolean field1235 = false;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    private int field1239 = 0;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Z")
    private boolean field1245 = false;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field1230;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lod;")
    private class129 field1228;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field1226;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1222;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lea;")
    public static class38 field1231 = class9.method46((byte) 114, " <col=ffff00>");

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lnd;")
    public static class120 field1232 = new class120(0, 0);

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lea;")
    public static class38 field1240 = class9.method46((byte) 110, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "[Z")
    public static boolean[] field1244 = new boolean[112];

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lpg;")
    public static class141 field1241 = new class141();

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1247 = 0;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "Lea;")
    public static class38 field1248 = class9.method46((byte) 114, "http:)4)4");

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field1250 = 0;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "Ltb;")
    public static class172 field1249;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Lef;")
    public static class43 field1251;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "Lgg;")
    private class61 field1246;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field1252;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field1253;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field1254;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field1255;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field1256;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field1257;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1258;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field1259;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1260;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1261;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1262;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1263;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1264;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field1265;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field1266;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field1267;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field1268;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field1269;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field1270;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field1271;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field1272;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field1273;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Ljava/lang/Class;")
    public static Class field1274;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field1275;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Ljava/lang/Class;")
    public static Class field1276;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field1277;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field1278;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field1279;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "Ljava/lang/Class;")
    public static Class field1280;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field1281;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "Ljava/lang/Class;")
    public static Class field1282;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field1283;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field1284;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field1285;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "ob", descriptor = "Ljava/lang/Class;")
    public static Class field1286;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field1287;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field1288;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Z")
    public static boolean field1234;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[B")
    private byte[] field1220;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Z")
    public static final boolean method359(int arg0, int arg1) {
        field1221++;
        if (arg1 != 65) {
            field1234 = true;
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Ljava/lang/Class;")
    public static final Class method360(int arg0, boolean arg1) {
        field1237++;
        if (arg1) {
            return null;
        } else if (arg0 == 0) {
            return field1252 == null ? (field1252 = method367("l")) : field1252;
        } else if (arg0 == 1) {
            return field1253 == null ? (field1253 = method367("gd")) : field1253;
        } else if (arg0 == 2) {
            return field1254 == null ? (field1254 = method367("rf")) : field1254;
        } else if (arg0 == 3) {
            return field1255 == null ? (field1255 = method367("ve")) : field1255;
        } else if (arg0 == 4) {
            return field1256 == null ? (field1256 = method367("dg")) : field1256;
        } else if (arg0 == 5) {
            return field1257 == null ? (field1257 = method367("nf")) : field1257;
        } else if (arg0 == 6) {
            return field1258 == null ? (field1258 = method367("th")) : field1258;
        } else if (arg0 == 7) {
            return field1259 == null ? (field1259 = method367("sg")) : field1259;
        } else if (arg0 == 8) {
            return field1260 == null ? (field1260 = method367("la")) : field1260;
        } else if (arg0 == 9) {
            return field1261 == null ? (field1261 = method367("sb")) : field1261;
        } else if (arg0 == 10) {
            return field1262 == null ? (field1262 = method367("ke")) : field1262;
        } else if (arg0 == 11) {
            return field1263 == null ? (field1263 = method367("sd")) : field1263;
        } else if (arg0 == 12) {
            return field1264 == null ? (field1264 = method367("ka")) : field1264;
        } else if (arg0 == 13) {
            return field1265 == null ? (field1265 = method367("uh")) : field1265;
        } else if (arg0 == 14) {
            return field1266 == null ? (field1266 = method367("o")) : field1266;
        } else if (arg0 == 15) {
            return field1267 == null ? (field1267 = method367("v")) : field1267;
        } else if (arg0 == 16) {
            return field1268 == null ? (field1268 = method367("qh")) : field1268;
        } else if (arg0 == 17) {
            return field1269 == null ? (field1269 = method367("og")) : field1269;
        } else if (arg0 == 19) {
            return field1270 == null ? (field1270 = method367("jh")) : field1270;
        } else if (arg0 == 20) {
            return field1271 == null ? (field1271 = method367("jd")) : field1271;
        } else if (arg0 == 21) {
            return field1272 == null ? (field1272 = method367("b")) : field1272;
        } else if (arg0 == 22) {
            return field1273 == null ? (field1273 = method367("sa")) : field1273;
        } else if (arg0 == 23) {
            return field1274 == null ? (field1274 = method367("ub")) : field1274;
        } else if (arg0 == 24) {
            return field1275 == null ? (field1275 = method367("pe")) : field1275;
        } else if (arg0 == 25) {
            return field1276 == null ? (field1276 = method367("mb")) : field1276;
        } else if (arg0 == 26) {
            return field1277 == null ? (field1277 = method367("vf")) : field1277;
        } else if (arg0 == 27) {
            return field1278 == null ? (field1278 = method367("hg")) : field1278;
        } else if (arg0 == 30) {
            return field1279 == null ? (field1279 = method367("eg")) : field1279;
        } else if (arg0 == 31) {
            return field1280 == null ? (field1280 = method367("bg")) : field1280;
        } else if (arg0 == 32) {
            return field1281 == null ? (field1281 = method367("ga")) : field1281;
        } else if (arg0 == 33) {
            return field1282 == null ? (field1282 = method367("bf")) : field1282;
        } else if (arg0 == 34) {
            return field1283 == null ? (field1283 = method367("lb")) : field1283;
        } else if (arg0 == 35) {
            return field1284 == null ? (field1284 = method367("qe")) : field1284;
        } else if (arg0 == 36) {
            return field1285 == null ? (field1285 = method367("wh")) : field1285;
        } else if (arg0 == 37) {
            return field1286 == null ? (field1286 = method367("ta")) : field1286;
        } else if (arg0 == 38) {
            return field1287 == null ? (field1287 = method367("kc")) : field1287;
        } else if (arg0 == 39) {
            return field1288 == null ? (field1288 = method367("pb")) : field1288;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
    public final void run() {
        field1224++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1239 == this.field1223) {
                        if (this.field1235) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1223;
                    if (this.field1223 <= this.field1239) {
                        var3 = this.field1239 - this.field1223;
                    } else {
                        var3 = 5000 - this.field1223;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1222.write(this.field1220, var2, var3);
                    } catch (IOException var9) {
                        this.field1245 = true;
                    }
                    this.field1223 = (this.field1223 + var3) % 5000;
                    try {
                        if (this.field1239 == this.field1223) {
                            this.field1222.flush();
                        }
                    } catch (IOException var8) {
                        this.field1245 = true;
                    }
                }
            }
            try {
                if (this.field1226 != null) {
                    this.field1226.close();
                }
                if (this.field1222 != null) {
                    this.field1222.close();
                }
                if (this.field1230 != null) {
                    this.field1230.close();
                }
            } catch (IOException var7) {
            }
            this.field1220 = null;
        } catch (Exception var12) {
            class17.method95(-92, null, var12);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB[BI)V")
    public final void method361(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 < 95) {
            field1250 = -56;
        }
        field1227++;
        if (this.field1235) {
            return;
        }
        if (this.field1245) {
            this.field1245 = false;
            throw new IOException();
        }
        if (this.field1220 == null) {
            this.field1220 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1220[this.field1239] = arg2[arg0 + var6];
                this.field1239 = (this.field1239 + 1) % 5000;
                if ((this.field1223 + 4900) % 5000 == this.field1239) {
                    throw new IOException();
                }
            }
            if (this.field1246 == null) {
                this.field1246 = this.field1228.method953(this, 3, (byte) 65);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)I")
    public final int method362(boolean arg0) throws IOException {
        field1229++;
        if (this.field1235) {
            return 0;
        } else {
            if (arg0) {
                field1249 = null;
            }
            return this.field1226.read();
        }
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method366((byte) -128);
        field1225++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
    public final int method363(int arg0) throws IOException {
        field1242++;
        if (arg0 > -104) {
            this.finalize();
        }
        return this.field1235 ? 0 : this.field1226.available();
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method364(int arg0) {
        field1244 = null;
        if (arg0 != -3) {
            return;
        }
        field1240 = null;
        field1231 = null;
        field1241 = null;
        field1248 = null;
        field1232 = null;
        field1251 = null;
        field1249 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
    public final void method365(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1236++;
        if (arg2 != 122) {
            method364(126);
        }
        if (this.field1235) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1226.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public final void method366(byte arg0) {
        if (arg0 >= -127) {
            return;
        }
        field1238++;
        if (this.field1235) {
            return;
        }
        synchronized (this) {
            this.field1235 = true;
            this.notifyAll();
        }
        if (this.field1246 != null) {
            while (this.field1246.field1486 == 0) {
                class132.method969(1L, (byte) 58);
            }
            if (this.field1246.field1486 == 1) {
                try {
                    ((Thread) this.field1246.field1490).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1246 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lod;)V")
    public class50(Socket arg0, class129 arg1) throws IOException {
        this.field1230 = arg0;
        this.field1228 = arg1;
        this.field1230.setSoTimeout(30000);
        this.field1230.setTcpNoDelay(true);
        this.field1226 = this.field1230.getInputStream();
        this.field1222 = this.field1230.getOutputStream();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method367(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
