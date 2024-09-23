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

@OriginalClass("SMQPXRFY")
public class class44 extends class62 implements Runnable {

    @OriginalMember(owner = "SMQPXRFY", name = "b", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "SMQPXRFY", name = "e", descriptor = "[B")
    private byte[] field1329 = new byte[500];

    @OriginalMember(owner = "SMQPXRFY", name = "o", descriptor = "Z")
    private boolean field1339 = false;

    @OriginalMember(owner = "SMQPXRFY", name = "r", descriptor = "LYSGENUJE;")
    private class66 field1342 = new class66(-41036);

    @OriginalMember(owner = "SMQPXRFY", name = "s", descriptor = "LYSGENUJE;")
    private class66 field1343 = new class66(-41036);

    @OriginalMember(owner = "SMQPXRFY", name = "w", descriptor = "Ljava/lang/String;")
    public String field1347 = "";

    @OriginalMember(owner = "SMQPXRFY", name = "y", descriptor = "LYSGENUJE;")
    private class66 field1349 = new class66(-41036);

    @OriginalMember(owner = "SMQPXRFY", name = "z", descriptor = "Z")
    private boolean field1350 = true;

    @OriginalMember(owner = "SMQPXRFY", name = "B", descriptor = "[[B")
    private byte[][] field1352 = new byte[4][];

    @OriginalMember(owner = "SMQPXRFY", name = "C", descriptor = "LYSGENUJE;")
    private class66 field1353 = new class66(-41036);

    @OriginalMember(owner = "SMQPXRFY", name = "E", descriptor = "B")
    private byte field1355 = -44;

    @OriginalMember(owner = "SMQPXRFY", name = "G", descriptor = "I")
    private int field1357 = 986;

    @OriginalMember(owner = "SMQPXRFY", name = "I", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1359 = new CRC32();

    @OriginalMember(owner = "SMQPXRFY", name = "J", descriptor = "[[I")
    private int[][] field1360 = new int[4][];

    @OriginalMember(owner = "SMQPXRFY", name = "K", descriptor = "I")
    private int field1361 = 5;

    @OriginalMember(owner = "SMQPXRFY", name = "L", descriptor = "LYSGENUJE;")
    private class66 field1362 = new class66(-41036);

    @OriginalMember(owner = "SMQPXRFY", name = "Q", descriptor = "LLOPREVUC;")
    private class28 field1367 = new class28(719);

    @OriginalMember(owner = "SMQPXRFY", name = "R", descriptor = "[B")
    private byte[] field1368 = new byte[65000];

    @OriginalMember(owner = "SMQPXRFY", name = "S", descriptor = "[[I")
    private int[][] field1369 = new int[4][];

    @OriginalMember(owner = "SMQPXRFY", name = "x", descriptor = "I")
    private static int field1348 = -302;

    @OriginalMember(owner = "SMQPXRFY", name = "g", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "SMQPXRFY", name = "i", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "SMQPXRFY", name = "j", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "SMQPXRFY", name = "m", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "SMQPXRFY", name = "n", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "SMQPXRFY", name = "t", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "SMQPXRFY", name = "A", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "SMQPXRFY", name = "D", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "SMQPXRFY", name = "F", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "SMQPXRFY", name = "N", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "SMQPXRFY", name = "O", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "SMQPXRFY", name = "u", descriptor = "J")
    private long field1345;

    @OriginalMember(owner = "SMQPXRFY", name = "c", descriptor = "LSMSHJBOZ;")
    private class45 field1327;

    @OriginalMember(owner = "SMQPXRFY", name = "d", descriptor = "Lclient;")
    private client field1328;

    @OriginalMember(owner = "SMQPXRFY", name = "H", descriptor = "Ljava/io/InputStream;")
    private InputStream field1358;

    @OriginalMember(owner = "SMQPXRFY", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1340;

    @OriginalMember(owner = "SMQPXRFY", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field1346;

    @OriginalMember(owner = "SMQPXRFY", name = "q", descriptor = "[B")
    private byte[] field1341;

    @OriginalMember(owner = "SMQPXRFY", name = "f", descriptor = "[I")
    private int[] field1330;

    @OriginalMember(owner = "SMQPXRFY", name = "h", descriptor = "[I")
    private int[] field1332;

    @OriginalMember(owner = "SMQPXRFY", name = "k", descriptor = "[I")
    private int[] field1335;

    @OriginalMember(owner = "SMQPXRFY", name = "l", descriptor = "[I")
    private int[] field1336;

    @OriginalMember(owner = "SMQPXRFY", name = "M", descriptor = "[I")
    private int[] field1363;

    @OriginalMember(owner = "SMQPXRFY", name = "P", descriptor = "[I")
    private int[] field1366;

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(IIII)I")
    public final int method388(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg2 << 8) + arg3;
        for (int var6 = 0; var6 < this.field1336.length; var6++) {
            if (this.field1336[var6] == var5) {
                if (arg0 == 0) {
                    return this.field1335[var6];
                }
                return this.field1366[var6];
            }
        }
        if (this.field1361 != arg1) {
            this.field1357 = -433;
        }
        return -1;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(ZIIB)V")
    public final void method389(boolean arg0, int arg1, int arg2, byte arg3) {
        if (arg0) {
            this.field1357 = -449;
        }
        if (this.field1328.field456[0] == null || this.field1360[arg1][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1328.field456[arg1 + 1].method439(arg2, (byte) 5);
        if (this.method401(true, var5, this.field1369[arg1][arg2], this.field1360[arg1][arg2])) {
            return;
        }
        this.field1352[arg1][arg2] = arg3;
        if (arg3 > this.field1331) {
            this.field1331 = arg3;
        }
        this.field1344++;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(III)V")
    public final void method390(int arg0, int arg1, int arg2) {
        if (this.field1328.field456[0] == null || (this.field1360[arg1][arg0] == 0 || (this.field1352[arg1][arg0] == 0 || this.field1331 == 0))) {
            return;
        }
        class45 var4 = new class45();
        if (arg2 < 7 || arg2 > 7) {
            return;
        }
        var4.field1370 = arg1;
        var4.field1373 = arg0;
        var4.field1371 = false;
        class66 var5 = this.field1349;
        synchronized (this.field1349) {
            this.field1349.method520(var4);
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "()LSMSHJBOZ;")
    public final class45 method391() {
        class66 var1 = this.field1353;
        class45 var2;
        synchronized (this.field1353) {
            var2 = (class45) this.field1353.method522();
        }
        if (var2 == null) {
            return null;
        }
        class28 var3 = this.field1367;
        synchronized (this.field1367) {
            var2.method37();
        }
        if (var2.field1374 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1374));
            while (true) {
                if (this.field1368.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1368, var4, this.field1368.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1374 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1374[var7] = this.field1368[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "b", descriptor = "(I)V")
    private final void method392(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            return;
        }
        while (this.field1333 == 0) {
            if (this.field1334 >= 10 || this.field1331 == 0) {
                return;
            }
            class66 var2 = this.field1349;
            class45 var3;
            synchronized (this.field1349) {
                var3 = (class45) this.field1349.method522();
            }
            while (var3 != null) {
                if (this.field1352[var3.field1370][var3.field1373] != 0) {
                    this.field1352[var3.field1370][var3.field1373] = 0;
                    this.field1343.method520(var3);
                    this.method404(140, var3);
                    this.field1339 = true;
                    if (this.field1365 < this.field1344) {
                        this.field1365++;
                    }
                    this.field1347 = "Loading extra files - " + this.field1365 * 100 / this.field1344 + "%";
                    this.field1334++;
                    if (this.field1334 == 10) {
                        return;
                    }
                }
                class66 var4 = this.field1349;
                synchronized (this.field1349) {
                    var3 = (class45) this.field1349.method522();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1352[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1331) {
                        var6[var8] = 0;
                        class45 var9 = new class45();
                        var9.field1370 = var5;
                        var9.field1373 = var8;
                        var9.field1371 = false;
                        this.field1343.method520(var9);
                        this.method404(140, var9);
                        this.field1339 = true;
                        if (this.field1365 < this.field1344) {
                            this.field1365++;
                        }
                        this.field1347 = "Loading extra files - " + this.field1365 * 100 / this.field1344 + "%";
                        this.field1334++;
                        if (this.field1334 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1331--;
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(Z)V")
    public final void method393(boolean arg0) {
        class66 var2 = this.field1349;
        synchronized (this.field1349) {
            this.field1349.method527();
        }
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "b", descriptor = "(Z)V")
    private final void method394(boolean arg0) {
        if (arg0) {
            this.field1361 = -172;
        }
        try {
            int var2 = this.field1358.available();
            if (this.field1338 == 0 && var2 >= 6) {
                this.field1339 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1358.read(this.field1329, var3, 6 - var3)) {
                }
                int var4 = this.field1329[0] & 0xFF;
                int var5 = ((this.field1329[1] & 0xFF) << 8) + (this.field1329[2] & 0xFF);
                int var6 = ((this.field1329[3] & 0xFF) << 8) + (this.field1329[4] & 0xFF);
                int var7 = this.field1329[5] & 0xFF;
                this.field1327 = null;
                for (class45 var8 = (class45) this.field1343.method523(); var8 != null; var8 = (class45) this.field1343.method525(-687)) {
                    if (var8.field1370 == var4 && var8.field1373 == var5) {
                        this.field1327 = var8;
                    }
                    if (this.field1327 != null) {
                        var8.field1372 = 0;
                    }
                }
                if (this.field1327 != null) {
                    this.field1354 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1327.field1374 = null;
                        if (this.field1327.field1371) {
                            class66 var9 = this.field1353;
                            synchronized (this.field1353) {
                                this.field1353.method520(this.field1327);
                            }
                        } else {
                            this.field1327.method591();
                        }
                        this.field1327 = null;
                    } else {
                        if (this.field1327.field1374 == null && var7 == 0) {
                            this.field1327.field1374 = new byte[var6];
                        }
                        if (this.field1327.field1374 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1337 = var7 * 500;
                this.field1338 = 500;
                if (this.field1338 > var6 - var7 * 500) {
                    this.field1338 = var6 - var7 * 500;
                }
            }
            if (this.field1338 > 0 && var2 >= this.field1338) {
                this.field1339 = true;
                byte[] var10 = this.field1329;
                int var11 = 0;
                if (this.field1327 != null) {
                    var10 = this.field1327.field1374;
                    var11 = this.field1337;
                }
                for (int var12 = 0; var12 < this.field1338; var12 += this.field1358.read(var10, var11 + var12, this.field1338 - var12)) {
                }
                if (this.field1338 + this.field1337 >= var10.length && this.field1327 != null) {
                    if (this.field1328.field456[0] != null) {
                        this.field1328.field456[this.field1327.field1370 + 1].method440(-34312, var10, var10.length, this.field1327.field1373);
                    }
                    if (!this.field1327.field1371 && this.field1327.field1370 == 3) {
                        this.field1327.field1371 = true;
                        this.field1327.field1370 = 93;
                    }
                    if (this.field1327.field1371) {
                        class66 var13 = this.field1353;
                        synchronized (this.field1353) {
                            this.field1353.method520(this.field1327);
                        }
                    } else {
                        this.field1327.method591();
                    }
                }
                this.field1338 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1346.close();
            } catch (Exception var15) {
            }
            this.field1346 = null;
            this.field1358 = null;
            this.field1340 = null;
            this.field1338 = 0;
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(ZI)I")
    public final int method395(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1341[arg1] & 0xFF;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(B)V")
    private final void method396(byte arg0) {
        this.field1333 = 0;
        this.field1334 = 0;
        if (arg0 != 9) {
            return;
        }
        for (class45 var2 = (class45) this.field1343.method523(); var2 != null; var2 = (class45) this.field1343.method525(-687)) {
            if (var2.field1371) {
                this.field1333++;
            } else {
                this.field1334++;
            }
        }
        while (this.field1333 < 10) {
            class45 var3 = (class45) this.field1342.method522();
            if (var3 == null) {
                break;
            }
            if (this.field1352[var3.field1370][var3.field1373] != 0) {
                this.field1365++;
            }
            this.field1352[var3.field1370][var3.field1373] = 0;
            this.field1343.method520(var3);
            this.field1333++;
            this.method404(140, var3);
            this.field1339 = true;
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1350) {
                this.field1364++;
                byte var1 = 20;
                if (this.field1331 == 0 && this.field1328.field456[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1339 = true;
                for (int var2 = 0; var2 < 100 && this.field1339; var2++) {
                    this.field1339 = false;
                    this.method400(-105);
                    this.method396((byte) 9);
                    if (this.field1333 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method392(3);
                    if (this.field1358 != null) {
                        this.method394(false);
                    }
                }
                boolean var3 = false;
                for (class45 var4 = (class45) this.field1343.method523(); var4 != null; var4 = (class45) this.field1343.method525(-687)) {
                    if (var4.field1371) {
                        var3 = true;
                        var4.field1372++;
                        if (var4.field1372 > 50) {
                            var4.field1372 = 0;
                            this.method404(140, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class45 var5 = (class45) this.field1343.method523(); var5 != null; var5 = (class45) this.field1343.method525(-687)) {
                        var3 = true;
                        var5.field1372++;
                        if (var5.field1372 > 50) {
                            var5.field1372 = 0;
                            this.method404(140, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1354++;
                    if (this.field1354 > 750) {
                        try {
                            this.field1346.close();
                        } catch (Exception var8) {
                        }
                        this.field1346 = null;
                        this.field1358 = null;
                        this.field1340 = null;
                        this.field1338 = 0;
                    }
                } else {
                    this.field1354 = 0;
                    this.field1347 = "";
                }
                if (this.field1328.field535 && this.field1346 != null && this.field1340 != null && (this.field1331 > 0 || this.field1328.field456[0] == null)) {
                    this.field1351++;
                    if (this.field1351 > 500) {
                        this.field1351 = 0;
                        this.field1329[0] = 0;
                        this.field1329[1] = 0;
                        this.field1329[2] = 0;
                        this.field1329[3] = 10;
                        try {
                            this.field1340.write(this.field1329, 0, 4);
                        } catch (IOException var7) {
                            this.field1354 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "b", descriptor = "(ZI)Z")
    public final boolean method397(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1330[arg1] == 1;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "b", descriptor = "()V")
    public final void method398() {
        this.field1350 = false;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(LLYZBHNJP;Lclient;)V")
    public final void method399(class31 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method290(var3[var4], null);
            int var27 = var26.length / 2;
            class69 var28 = new class69(var26, field1348);
            this.field1360[var4] = new int[var27];
            this.field1352[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1360[var4][var29] = var28.method549();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method290(var5[var6], null);
            int var23 = var22.length / 4;
            class69 var24 = new class69(var22, field1348);
            this.field1369[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1369[var6][var25] = var24.method552();
            }
        }
        byte[] var7 = arg0.method290("model_index", null);
        int var8 = this.field1360[0].length;
        this.field1341 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1341[var9] = var7[var9];
            } else {
                this.field1341[var9] = 0;
            }
        }
        byte[] var10 = arg0.method290("map_index", null);
        class69 var11 = new class69(var10, field1348);
        int var12 = var10.length / 7;
        this.field1336 = new int[var12];
        this.field1335 = new int[var12];
        this.field1366 = new int[var12];
        this.field1363 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1336[var13] = var11.method549();
            this.field1335[var13] = var11.method549();
            this.field1366[var13] = var11.method549();
            this.field1363[var13] = var11.method547();
        }
        byte[] var14 = arg0.method290("anim_index", null);
        class69 var15 = new class69(var14, field1348);
        int var16 = var14.length / 2;
        this.field1332 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1332[var17] = var15.method549();
        }
        byte[] var18 = arg0.method290("midi_index", null);
        class69 var19 = new class69(var18, field1348);
        int var20 = var18.length;
        this.field1330 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1330[var21] = var19.method547();
        }
        this.field1328 = arg1;
        this.field1350 = true;
        this.field1328.method124(this, 2);
    }

    @OriginalMember(owner = "SMQPXRFY", name = "c", descriptor = "(I)V")
    private final void method400(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        class66 var2 = this.field1362;
        class45 var3;
        synchronized (this.field1362) {
            var3 = (class45) this.field1362.method522();
        }
        while (var3 != null) {
            this.field1339 = true;
            byte[] var4 = null;
            if (this.field1328.field456[0] != null) {
                var4 = this.field1328.field456[var3.field1370 + 1].method439(var3.field1373, (byte) 5);
            }
            if (!this.method401(true, var4, this.field1369[var3.field1370][var3.field1373], this.field1360[var3.field1370][var3.field1373])) {
                var4 = null;
            }
            class66 var5 = this.field1362;
            synchronized (this.field1362) {
                if (var4 == null) {
                    this.field1342.method520(var3);
                } else {
                    var3.field1374 = var4;
                    class66 var6 = this.field1353;
                    synchronized (this.field1353) {
                        this.field1353.method520(var3);
                    }
                }
                var3 = (class45) this.field1362.method522();
            }
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(Z[BII)Z")
    private final boolean method401(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field1359.reset();
        if (!arg0) {
            this.field1326 = !this.field1326;
        }
        this.field1359.update(arg1, 0, var5);
        int var7 = (int) this.field1359.getValue();
        if (arg3 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(II)I")
    public final int method402(int arg0, int arg1) {
        int var3 = 31 / arg0;
        return this.field1360[arg1].length;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(ZB)V")
    public final void method403(boolean arg0, byte arg1) {
        int var3 = this.field1336.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1363[var4] != 0) {
                this.method389(false, 3, this.field1366[var4], (byte) 2);
                this.method389(false, 3, this.field1335[var4], (byte) 2);
            }
        }
        if (this.field1355 != arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(ILSMSHJBOZ;)V")
    private final void method404(int arg0, class45 arg1) {
        int var3 = 31 / arg0;
        try {
            if (this.field1346 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field1345 < 4000L) {
                    return;
                }
                this.field1345 = var4;
                this.field1346 = this.field1328.method162(client.field390 + 43594);
                this.field1358 = this.field1346.getInputStream();
                this.field1340 = this.field1346.getOutputStream();
                this.field1340.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field1358.read();
                }
                this.field1354 = 0;
            }
            this.field1329[0] = (byte) arg1.field1370;
            this.field1329[1] = (byte) (arg1.field1373 >> 8);
            this.field1329[2] = (byte) arg1.field1373;
            if (arg1.field1371) {
                this.field1329[3] = 2;
            } else if (this.field1328.field535) {
                this.field1329[3] = 0;
            } else {
                this.field1329[3] = 1;
            }
            this.field1340.write(this.field1329, 0, 4);
            this.field1351 = 0;
            this.field1356 = -10000;
        } catch (IOException var9) {
            try {
                this.field1346.close();
            } catch (Exception var8) {
            }
            this.field1346 = null;
            this.field1358 = null;
            this.field1340 = null;
            this.field1338 = 0;
            this.field1356++;
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "c", descriptor = "()I")
    public final int method405() {
        class28 var1 = this.field1367;
        synchronized (this.field1367) {
            return this.field1367.method263();
        }
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(I)V")
    public final void method406(int arg0) {
        this.method409(0, arg0);
    }

    @OriginalMember(owner = "SMQPXRFY", name = "d", descriptor = "(I)I")
    public final int method407(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1332.length;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "a", descriptor = "(IZ)Z")
    public final boolean method408(int arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1336.length; var3++) {
            if (this.field1366[var3] == arg0) {
                return true;
            }
        }
        if (!arg1) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "SMQPXRFY", name = "b", descriptor = "(II)V")
    public final void method409(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1360.length || arg1 < 0 || arg1 > this.field1360[arg0].length || this.field1360[arg0][arg1] == 0) {
            return;
        }
        class28 var3 = this.field1367;
        synchronized (this.field1367) {
            for (class45 var4 = (class45) this.field1367.method261(); var4 != null; var4 = (class45) this.field1367.method262(-687)) {
                if (var4.field1370 == arg0 && var4.field1373 == arg1) {
                    return;
                }
            }
            class45 var5 = new class45();
            var5.field1370 = arg0;
            var5.field1373 = arg1;
            var5.field1371 = true;
            class66 var6 = this.field1362;
            synchronized (this.field1362) {
                this.field1362.method520(var5);
            }
            this.field1367.method259(var5);
        }
    }
}
