import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("client!QUPTMIEH")
public class class42 extends class63 implements Runnable {

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "[[I")
    private int[][] field1254 = new int[4][];

    @OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "LVGFLNLXH;")
    private class55 field1255 = new class55(826);

    @OriginalMember(owner = "client!QUPTMIEH", name = "c", descriptor = "Ljava/lang/String;")
    public String field1256 = "";

    @OriginalMember(owner = "client!QUPTMIEH", name = "d", descriptor = "LVGFLNLXH;")
    private class55 field1257 = new class55(826);

    @OriginalMember(owner = "client!QUPTMIEH", name = "h", descriptor = "Z")
    private boolean field1261 = true;

    @OriginalMember(owner = "client!QUPTMIEH", name = "i", descriptor = "I")
    private int field1262 = 6;

    @OriginalMember(owner = "client!QUPTMIEH", name = "l", descriptor = "LVGFLNLXH;")
    private class55 field1265 = new class55(826);

    @OriginalMember(owner = "client!QUPTMIEH", name = "p", descriptor = "[[I")
    private int[][] field1269 = new int[4][];

    @OriginalMember(owner = "client!QUPTMIEH", name = "q", descriptor = "LVGFLNLXH;")
    private class55 field1270 = new class55(826);

    @OriginalMember(owner = "client!QUPTMIEH", name = "u", descriptor = "[[B")
    private byte[][] field1274 = new byte[4][];

    @OriginalMember(owner = "client!QUPTMIEH", name = "v", descriptor = "[B")
    private byte[] field1275 = new byte[65000];

    @OriginalMember(owner = "client!QUPTMIEH", name = "w", descriptor = "I")
    private int field1276 = -253;

    @OriginalMember(owner = "client!QUPTMIEH", name = "x", descriptor = "I")
    private int field1277 = -10782;

    @OriginalMember(owner = "client!QUPTMIEH", name = "A", descriptor = "Z")
    private boolean field1280 = false;

    @OriginalMember(owner = "client!QUPTMIEH", name = "B", descriptor = "Z")
    private boolean field1281 = true;

    @OriginalMember(owner = "client!QUPTMIEH", name = "H", descriptor = "Z")
    private boolean field1287 = false;

    @OriginalMember(owner = "client!QUPTMIEH", name = "I", descriptor = "LTSCGUBKV;")
    private class50 field1288 = new class50(-433);

    @OriginalMember(owner = "client!QUPTMIEH", name = "J", descriptor = "[B")
    private byte[] field1289 = new byte[500];

    @OriginalMember(owner = "client!QUPTMIEH", name = "L", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1291 = new CRC32();

    @OriginalMember(owner = "client!QUPTMIEH", name = "R", descriptor = "LVGFLNLXH;")
    private class55 field1297 = new class55(826);

    @OriginalMember(owner = "client!QUPTMIEH", name = "e", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client!QUPTMIEH", name = "f", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!QUPTMIEH", name = "g", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client!QUPTMIEH", name = "j", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!QUPTMIEH", name = "k", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!QUPTMIEH", name = "m", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client!QUPTMIEH", name = "n", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!QUPTMIEH", name = "t", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client!QUPTMIEH", name = "z", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!QUPTMIEH", name = "M", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client!QUPTMIEH", name = "N", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!QUPTMIEH", name = "P", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!QUPTMIEH", name = "s", descriptor = "J")
    private long field1272;

    @OriginalMember(owner = "client!QUPTMIEH", name = "G", descriptor = "LCPQQDQVK;")
    private class7 field1286;

    @OriginalMember(owner = "client!QUPTMIEH", name = "y", descriptor = "Lclient;")
    private client field1278;

    @OriginalMember(owner = "client!QUPTMIEH", name = "Q", descriptor = "Ljava/io/InputStream;")
    private InputStream field1296;

    @OriginalMember(owner = "client!QUPTMIEH", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1271;

    @OriginalMember(owner = "client!QUPTMIEH", name = "O", descriptor = "Ljava/net/Socket;")
    private Socket field1294;

    @OriginalMember(owner = "client!QUPTMIEH", name = "C", descriptor = "[B")
    private byte[] field1282;

    @OriginalMember(owner = "client!QUPTMIEH", name = "o", descriptor = "[I")
    private int[] field1268;

    @OriginalMember(owner = "client!QUPTMIEH", name = "D", descriptor = "[I")
    private int[] field1283;

    @OriginalMember(owner = "client!QUPTMIEH", name = "E", descriptor = "[I")
    private int[] field1284;

    @OriginalMember(owner = "client!QUPTMIEH", name = "F", descriptor = "[I")
    private int[] field1285;

    @OriginalMember(owner = "client!QUPTMIEH", name = "K", descriptor = "[I")
    private int[] field1290;

    @OriginalMember(owner = "client!QUPTMIEH", name = "S", descriptor = "[I")
    private int[] field1298;

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(LXOJZVVDK;Lclient;)V")
    public final void method377(class60 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method560(var3[var4], null);
            int var27 = var26.length / 2;
            class41 var28 = new class41(888, var26);
            this.field1269[var4] = new int[var27];
            this.field1274[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1269[var4][var29] = var28.method342();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method560(var5[var6], null);
            int var23 = var22.length / 4;
            class41 var24 = new class41(888, var22);
            this.field1254[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1254[var6][var25] = var24.method345();
            }
        }
        byte[] var7 = arg0.method560("model_index", null);
        int var8 = this.field1269[0].length;
        this.field1282 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1282[var9] = var7[var9];
            } else {
                this.field1282[var9] = 0;
            }
        }
        byte[] var10 = arg0.method560("map_index", null);
        class41 var11 = new class41(888, var10);
        int var12 = var10.length / 7;
        this.field1284 = new int[var12];
        this.field1268 = new int[var12];
        this.field1298 = new int[var12];
        this.field1283 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1284[var13] = var11.method342();
            this.field1268[var13] = var11.method342();
            this.field1298[var13] = var11.method342();
            this.field1283[var13] = var11.method340();
        }
        byte[] var14 = arg0.method560("anim_index", null);
        class41 var15 = new class41(888, var14);
        int var16 = var14.length / 2;
        this.field1285 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1285[var17] = var15.method342();
        }
        byte[] var18 = arg0.method560("midi_index", null);
        class41 var19 = new class41(888, var18);
        int var20 = var18.length;
        this.field1290 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1290[var21] = var19.method340();
        }
        this.field1278 = arg1;
        this.field1281 = true;
        this.field1278.method139(this, 2);
        if (class8.field622) {
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(II)I")
    public final int method378(int arg0, int arg1) {
        return arg0 < 0 ? this.field1282[arg1] & 0xFF : this.field1273;
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "(I)V")
    private final void method379(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        try {
            int var2 = this.field1296.available();
            if (this.field1259 == 0 && var2 >= 6) {
                this.field1287 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1296.read(this.field1289, var3, 6 - var3)) {
                }
                int var4 = this.field1289[0] & 0xFF;
                int var5 = ((this.field1289[1] & 0xFF) << 8) + (this.field1289[2] & 0xFF);
                int var6 = ((this.field1289[3] & 0xFF) << 8) + (this.field1289[4] & 0xFF);
                int var7 = this.field1289[5] & 0xFF;
                this.field1286 = null;
                for (class7 var8 = (class7) this.field1257.method532(); var8 != null; var8 = (class7) this.field1257.method534(-420)) {
                    if (var8.field616 == var4 && var8.field618 == var5) {
                        this.field1286 = var8;
                    }
                    if (this.field1286 != null) {
                        var8.field614 = 0;
                    }
                }
                if (this.field1286 != null) {
                    this.field1260 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1286.field615 = null;
                        if (this.field1286.field617) {
                            class55 var9 = this.field1255;
                            synchronized (this.field1255) {
                                this.field1255.method529(this.field1286);
                            }
                        } else {
                            this.field1286.method163();
                        }
                        this.field1286 = null;
                    } else {
                        if (this.field1286.field615 == null && var7 == 0) {
                            this.field1286.field615 = new byte[var6];
                        }
                        if (this.field1286.field615 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1258 = var7 * 500;
                this.field1259 = 500;
                if (this.field1259 > var6 - var7 * 500) {
                    this.field1259 = var6 - var7 * 500;
                }
            }
            if (this.field1259 > 0 && var2 >= this.field1259) {
                this.field1287 = true;
                byte[] var10 = this.field1289;
                int var11 = 0;
                if (this.field1286 != null) {
                    var10 = this.field1286.field615;
                    var11 = this.field1258;
                }
                for (int var12 = 0; var12 < this.field1259; var12 += this.field1296.read(var10, var11 + var12, this.field1259 - var12)) {
                }
                if (this.field1259 + this.field1258 >= var10.length && this.field1286 != null) {
                    if (this.field1278.field120[0] != null) {
                        this.field1278.field120[this.field1286.field616 + 1].method569(false, var10, var10.length, this.field1286.field618);
                    }
                    if (!this.field1286.field617 && this.field1286.field616 == 3) {
                        this.field1286.field617 = true;
                        this.field1286.field616 = 93;
                    }
                    if (this.field1286.field617) {
                        class55 var13 = this.field1255;
                        synchronized (this.field1255) {
                            this.field1255.method529(this.field1286);
                        }
                    } else {
                        this.field1286.method163();
                    }
                }
                this.field1259 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1294.close();
            } catch (Exception var15) {
            }
            this.field1294 = null;
            this.field1296 = null;
            this.field1271 = null;
            this.field1259 = 0;
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "(II)Z")
    public final boolean method380(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > 0) {
            this.field1280 = !this.field1280;
        }
        return this.field1290[arg1] == 1;
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(I)V")
    public final void method381(int arg0) {
        this.method382(0, arg0);
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "c", descriptor = "(II)V")
    public final void method382(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1269.length || arg1 < 0 || arg1 > this.field1269[arg0].length || this.field1269[arg0][arg1] == 0) {
            return;
        }
        class50 var3 = this.field1288;
        synchronized (this.field1288) {
            for (class7 var4 = (class7) this.field1288.method461(); var4 != null; var4 = (class7) this.field1288.method462(-420)) {
                if (var4.field616 == arg0 && var4.field618 == arg1) {
                    return;
                }
            }
            class7 var5 = new class7();
            var5.field616 = arg0;
            var5.field618 = arg1;
            var5.field617 = true;
            class55 var6 = this.field1265;
            synchronized (this.field1265) {
                this.field1265.method529(var5);
            }
            this.field1288.method459(var5);
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(III)V")
    public final void method383(int arg0, int arg1, int arg2) {
        if (this.field1278.field120[0] == null || (this.field1269[arg2][arg0] == 0 || (this.field1274[arg2][arg0] == 0 || this.field1266 == 0))) {
            return;
        }
        class7 var4 = new class7();
        var4.field616 = arg2;
        var4.field618 = arg0;
        var4.field617 = false;
        class55 var5 = this.field1270;
        synchronized (this.field1270) {
            this.field1270.method529(var4);
        }
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(IIIB)I")
    public final int method384(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 2) {
            return this.field1273;
        }
        boolean var5 = false;
        int var6 = (arg1 << 8) + arg2;
        for (int var7 = 0; var7 < this.field1284.length; var7++) {
            if (this.field1284[var7] == var6) {
                if (arg0 == 0) {
                    return this.field1268[var7];
                }
                return this.field1298[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "()I")
    public final int method385() {
        class50 var1 = this.field1288;
        synchronized (this.field1288) {
            return this.field1288.method463();
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "c", descriptor = "(I)V")
    private final void method386(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        while (this.field1263 == 0) {
            if (this.field1264 >= 10 || this.field1266 == 0) {
                return;
            }
            class55 var2 = this.field1270;
            class7 var3;
            synchronized (this.field1270) {
                var3 = (class7) this.field1270.method531();
            }
            while (var3 != null) {
                if (this.field1274[var3.field616][var3.field618] != 0) {
                    this.field1274[var3.field616][var3.field618] = 0;
                    this.field1257.method529(var3);
                    this.method397(var3, true);
                    this.field1287 = true;
                    if (this.field1267 < this.field1293) {
                        this.field1267++;
                    }
                    this.field1256 = "Loading extra files - " + this.field1267 * 100 / this.field1293 + "%";
                    this.field1264++;
                    if (this.field1264 == 10) {
                        return;
                    }
                }
                class55 var4 = this.field1270;
                synchronized (this.field1270) {
                    var3 = (class7) this.field1270.method531();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1274[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1266) {
                        var6[var8] = 0;
                        class7 var9 = new class7();
                        var9.field616 = var5;
                        var9.field618 = var8;
                        var9.field617 = false;
                        this.field1257.method529(var9);
                        this.method397(var9, true);
                        this.field1287 = true;
                        if (this.field1267 < this.field1293) {
                            this.field1267++;
                        }
                        this.field1256 = "Loading extra files - " + this.field1267 * 100 / this.field1293 + "%";
                        this.field1264++;
                        if (this.field1264 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1266--;
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "d", descriptor = "(I)I")
    public final int method387(int arg0) {
        return arg0 >= 0 ? this.field1273 : this.field1285.length;
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "()LCPQQDQVK;")
    public final class7 method388() {
        class55 var1 = this.field1255;
        class7 var2;
        synchronized (this.field1255) {
            var2 = (class7) this.field1255.method531();
        }
        if (var2 == null) {
            return null;
        }
        class50 var3 = this.field1288;
        synchronized (this.field1288) {
            var2.method567();
        }
        if (var2.field615 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field615));
            while (true) {
                if (this.field1275.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1275, var4, this.field1275.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field615 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field615[var7] = this.field1275[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(IIBI)V")
    public final void method389(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field1278.field120[0] == null || this.field1269[arg0][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field1278.field120[arg0 + 1].method568(arg3, false);
        if (this.method391(this.field1269[arg0][arg3], var5, 6, this.field1254[arg0][arg3])) {
            return;
        }
        this.field1274[arg0][arg3] = arg2;
        if (arg2 > this.field1266) {
            this.field1266 = arg2;
        }
        this.field1293++;
        if (arg1 <= 0) {
            this.field1273 = 376;
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "d", descriptor = "(II)Z")
    public final boolean method390(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1284.length; var3++) {
            if (this.field1298[var3] == arg1) {
                return true;
            }
        }
        if (arg0 <= 0) {
            this.field1261 = !this.field1261;
        }
        return false;
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(I[BII)Z")
    private final boolean method391(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field1291.reset();
        this.field1291.update(arg1, 0, var5);
        int var7 = (int) this.field1291.getValue();
        if (arg2 < this.field1262 || arg2 > this.field1262) {
            this.field1273 = -115;
        }
        if (arg0 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "e", descriptor = "(I)V")
    public final void method392(int arg0) {
        class55 var2 = this.field1270;
        synchronized (this.field1270) {
            this.field1270.method536();
        }
        if (arg0 != -10941) {
            this.field1280 = !this.field1280;
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(IZ)V")
    public final void method393(int arg0, boolean arg1) {
        int var3 = this.field1284.length;
        if (arg0 >= 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1283[var4] != 0) {
                this.method389(3, 125, (byte) 2, this.field1298[var4]);
                this.method389(3, 125, (byte) 2, this.field1268[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "c", descriptor = "()V")
    public final void method394() {
        this.field1281 = false;
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1281) {
                this.field1279++;
                byte var1 = 20;
                if (this.field1266 == 0 && this.field1278.field120[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1287 = true;
                for (int var2 = 0; var2 < 100 && this.field1287; var2++) {
                    this.field1287 = false;
                    this.method398((byte) 1);
                    this.method395((byte) 0);
                    if (this.field1263 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method386(-253);
                    if (this.field1296 != null) {
                        this.method379(-925);
                    }
                }
                boolean var3 = false;
                for (class7 var4 = (class7) this.field1257.method532(); var4 != null; var4 = (class7) this.field1257.method534(-420)) {
                    if (var4.field617) {
                        var3 = true;
                        var4.field614++;
                        if (var4.field614 > 50) {
                            var4.field614 = 0;
                            this.method397(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (class7 var5 = (class7) this.field1257.method532(); var5 != null; var5 = (class7) this.field1257.method534(-420)) {
                        var3 = true;
                        var5.field614++;
                        if (var5.field614 > 50) {
                            var5.field614 = 0;
                            this.method397(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field1260++;
                    if (this.field1260 > 750) {
                        try {
                            this.field1294.close();
                        } catch (Exception var8) {
                        }
                        this.field1294 = null;
                        this.field1296 = null;
                        this.field1271 = null;
                        this.field1259 = 0;
                    }
                } else {
                    this.field1260 = 0;
                    this.field1256 = "";
                }
                if (this.field1278.field458 && this.field1294 != null && this.field1271 != null && (this.field1266 > 0 || this.field1278.field120[0] == null)) {
                    this.field1292++;
                    if (this.field1292 > 500) {
                        this.field1292 = 0;
                        this.field1289[0] = 0;
                        this.field1289[1] = 0;
                        this.field1289[2] = 0;
                        this.field1289[3] = 10;
                        try {
                            this.field1271.write(this.field1289, 0, 4);
                        } catch (IOException var7) {
                            this.field1260 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(B)V")
    private final void method395(byte arg0) {
        this.field1263 = 0;
        this.field1264 = 0;
        class7 var2 = (class7) this.field1257.method532();
        if (arg0 != 0) {
            this.field1273 = -343;
        }
        while (var2 != null) {
            if (var2.field617) {
                this.field1263++;
            } else {
                this.field1264++;
            }
            var2 = (class7) this.field1257.method534(-420);
        }
        while (this.field1263 < 10) {
            class7 var3 = (class7) this.field1297.method531();
            if (var3 == null) {
                break;
            }
            if (this.field1274[var3.field616][var3.field618] != 0) {
                this.field1267++;
            }
            this.field1274[var3.field616][var3.field618] = 0;
            this.field1257.method529(var3);
            this.field1263++;
            this.method397(var3, true);
            this.field1287 = true;
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "e", descriptor = "(II)I")
    public final int method396(int arg0, int arg1) {
        return arg1 == -42623 ? this.field1269[arg0].length : this.field1273;
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "a", descriptor = "(LCPQQDQVK;Z)V")
    private final void method397(class7 arg0, boolean arg1) {
        if (!arg1) {
            this.field1277 = 23;
        }
        try {
            if (this.field1294 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1272 < 4000L) {
                    return;
                }
                this.field1272 = var3;
                this.field1294 = this.field1278.method85(client.field248 + 43594);
                this.field1296 = this.field1294.getInputStream();
                this.field1271 = this.field1294.getOutputStream();
                this.field1271.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1296.read();
                }
                this.field1260 = 0;
            }
            this.field1289[0] = (byte) arg0.field616;
            this.field1289[1] = (byte) (arg0.field618 >> 8);
            this.field1289[2] = (byte) arg0.field618;
            if (arg0.field617) {
                this.field1289[3] = 2;
            } else if (this.field1278.field458) {
                this.field1289[3] = 0;
            } else {
                this.field1289[3] = 1;
            }
            this.field1271.write(this.field1289, 0, 4);
            this.field1292 = 0;
            this.field1295 = -10000;
        } catch (IOException var8) {
            try {
                this.field1294.close();
            } catch (Exception var7) {
            }
            this.field1294 = null;
            this.field1296 = null;
            this.field1271 = null;
            this.field1259 = 0;
            this.field1295++;
        }
    }

    @OriginalMember(owner = "client!QUPTMIEH", name = "b", descriptor = "(B)V")
    private final void method398(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        boolean var2 = false;
        class55 var3 = this.field1265;
        class7 var4;
        synchronized (this.field1265) {
            var4 = (class7) this.field1265.method531();
        }
        while (var4 != null) {
            this.field1287 = true;
            byte[] var5 = null;
            if (this.field1278.field120[0] != null) {
                var5 = this.field1278.field120[var4.field616 + 1].method568(var4.field618, false);
            }
            if (!this.method391(this.field1269[var4.field616][var4.field618], var5, 6, this.field1254[var4.field616][var4.field618])) {
                var5 = null;
            }
            class55 var6 = this.field1265;
            synchronized (this.field1265) {
                if (var5 == null) {
                    this.field1297.method529(var4);
                } else {
                    var4.field615 = var5;
                    class55 var7 = this.field1255;
                    synchronized (this.field1255) {
                        this.field1255.method529(var4);
                    }
                }
                var4 = (class7) this.field1265.method531();
            }
        }
    }
}
