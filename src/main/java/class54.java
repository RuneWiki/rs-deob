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

@OriginalClass("SSXXGGTR")
public class class54 extends class14 implements Runnable {

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "Ljava/lang/String;")
    public String field1400 = "";

    @OriginalMember(owner = "SSXXGGTR", name = "b", descriptor = "Z")
    private boolean field1401 = true;

    @OriginalMember(owner = "SSXXGGTR", name = "c", descriptor = "[[I")
    private int[][] field1402 = new int[4][];

    @OriginalMember(owner = "SSXXGGTR", name = "i", descriptor = "[[B")
    private byte[][] field1408 = new byte[4][];

    @OriginalMember(owner = "SSXXGGTR", name = "k", descriptor = "[B")
    private byte[] field1410 = new byte[65000];

    @OriginalMember(owner = "SSXXGGTR", name = "m", descriptor = "LJQOEJEDB;")
    private class25 field1412 = new class25(3);

    @OriginalMember(owner = "SSXXGGTR", name = "o", descriptor = "I")
    private int field1414 = 30502;

    @OriginalMember(owner = "SSXXGGTR", name = "p", descriptor = "Z")
    private boolean field1415 = true;

    @OriginalMember(owner = "SSXXGGTR", name = "q", descriptor = "LJQOEJEDB;")
    private class25 field1416 = new class25(3);

    @OriginalMember(owner = "SSXXGGTR", name = "u", descriptor = "[B")
    private byte[] field1420 = new byte[500];

    @OriginalMember(owner = "SSXXGGTR", name = "w", descriptor = "I")
    private int field1422 = -158;

    @OriginalMember(owner = "SSXXGGTR", name = "x", descriptor = "Z")
    private boolean field1423 = true;

    @OriginalMember(owner = "SSXXGGTR", name = "y", descriptor = "LJQOEJEDB;")
    private class25 field1424 = new class25(3);

    @OriginalMember(owner = "SSXXGGTR", name = "B", descriptor = "LMMJBXXXO;")
    private class36 field1427 = new class36(field1418);

    @OriginalMember(owner = "SSXXGGTR", name = "C", descriptor = "LJQOEJEDB;")
    private class25 field1428 = new class25(3);

    @OriginalMember(owner = "SSXXGGTR", name = "H", descriptor = "I")
    private int field1433 = -158;

    @OriginalMember(owner = "SSXXGGTR", name = "P", descriptor = "Z")
    private boolean field1441 = false;

    @OriginalMember(owner = "SSXXGGTR", name = "Q", descriptor = "LJQOEJEDB;")
    private class25 field1442 = new class25(3);

    @OriginalMember(owner = "SSXXGGTR", name = "R", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1443 = new CRC32();

    @OriginalMember(owner = "SSXXGGTR", name = "T", descriptor = "[[I")
    private int[][] field1445 = new int[4][];

    @OriginalMember(owner = "SSXXGGTR", name = "e", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "SSXXGGTR", name = "f", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "SSXXGGTR", name = "l", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "SSXXGGTR", name = "r", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "SSXXGGTR", name = "v", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "SSXXGGTR", name = "A", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "SSXXGGTR", name = "E", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "SSXXGGTR", name = "F", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "SSXXGGTR", name = "G", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "SSXXGGTR", name = "I", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "SSXXGGTR", name = "J", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "SSXXGGTR", name = "M", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "SSXXGGTR", name = "z", descriptor = "J")
    private long field1425;

    @OriginalMember(owner = "SSXXGGTR", name = "t", descriptor = "LLOBJUMRN;")
    private class34 field1419;

    @OriginalMember(owner = "SSXXGGTR", name = "S", descriptor = "Lclient;")
    private client field1444;

    @OriginalMember(owner = "SSXXGGTR", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field1413;

    @OriginalMember(owner = "SSXXGGTR", name = "O", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1440;

    @OriginalMember(owner = "SSXXGGTR", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1403;

    @OriginalMember(owner = "SSXXGGTR", name = "s", descriptor = "Z")
    private static boolean field1418;

    @OriginalMember(owner = "SSXXGGTR", name = "g", descriptor = "[B")
    private byte[] field1406;

    @OriginalMember(owner = "SSXXGGTR", name = "h", descriptor = "[I")
    private int[] field1407;

    @OriginalMember(owner = "SSXXGGTR", name = "j", descriptor = "[I")
    private int[] field1409;

    @OriginalMember(owner = "SSXXGGTR", name = "D", descriptor = "[I")
    private int[] field1429;

    @OriginalMember(owner = "SSXXGGTR", name = "K", descriptor = "[I")
    private int[] field1436;

    @OriginalMember(owner = "SSXXGGTR", name = "L", descriptor = "[I")
    private int[] field1437;

    @OriginalMember(owner = "SSXXGGTR", name = "N", descriptor = "[I")
    private int[] field1439;

    @OriginalMember(owner = "SSXXGGTR", name = "b", descriptor = "(I)V")
    private final void method529(int arg0) {
        class25 var2 = this.field1428;
        class34 var3;
        synchronized (this.field1428) {
            var3 = (class34) this.field1428.method328();
        }
        if (arg0 != 30502) {
            this.field1401 = !this.field1401;
        }
        while (var3 != null) {
            this.field1441 = true;
            byte[] var4 = null;
            if (this.field1444.field169[0] != null) {
                var4 = this.field1444.field169[var3.field1130 + 1].method310(var3.field1132, 1);
            }
            if (!this.method546(this.field1445[var3.field1130][var3.field1132], this.field1402[var3.field1130][var3.field1132], 6, var4)) {
                var4 = null;
            }
            class25 var5 = this.field1428;
            synchronized (this.field1428) {
                if (var4 == null) {
                    this.field1412.method326(var3);
                } else {
                    var3.field1134 = var4;
                    class25 var6 = this.field1416;
                    synchronized (this.field1416) {
                        this.field1416.method326(var3);
                    }
                }
                var3 = (class34) this.field1428.method328();
            }
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(LSYUGXMZF;Lclient;)V")
    public final void method530(class55 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method551(var3[var4], null);
            int var27 = var26.length / 2;
            class30 var28 = new class30(var26, -982);
            this.field1445[var4] = new int[var27];
            this.field1408[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1445[var4][var29] = var28.method351();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method551(var5[var6], null);
            int var23 = var22.length / 4;
            class30 var24 = new class30(var22, -982);
            this.field1402[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1402[var6][var25] = var24.method354();
            }
        }
        byte[] var7 = arg0.method551("model_index", null);
        int var8 = this.field1445[0].length;
        this.field1406 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1406[var9] = var7[var9];
            } else {
                this.field1406[var9] = 0;
            }
        }
        byte[] var10 = arg0.method551("map_index", null);
        class30 var11 = new class30(var10, -982);
        int var12 = var10.length / 7;
        this.field1407 = new int[var12];
        this.field1429 = new int[var12];
        this.field1439 = new int[var12];
        this.field1409 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1407[var13] = var11.method351();
            this.field1429[var13] = var11.method351();
            this.field1439[var13] = var11.method351();
            this.field1409[var13] = var11.method349();
        }
        byte[] var14 = arg0.method551("anim_index", null);
        class30 var15 = new class30(var14, -982);
        int var16 = var14.length / 2;
        this.field1437 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1437[var17] = var15.method351();
        }
        byte[] var18 = arg0.method551("midi_index", null);
        class30 var19 = new class30(var18, -982);
        int var20 = var18.length;
        this.field1436 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1436[var21] = var19.method349();
        }
        this.field1444 = arg1;
        this.field1415 = true;
        this.field1444.method102(this, 2);
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(II)V")
    public final void method531(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1445.length || arg1 < 0 || arg1 > this.field1445[arg0].length || this.field1445[arg0][arg1] == 0) {
            return;
        }
        class36 var3 = this.field1427;
        synchronized (this.field1427) {
            for (class34 var4 = (class34) this.field1427.method406(); var4 != null; var4 = (class34) this.field1427.method407(9)) {
                if (var4.field1130 == arg0 && var4.field1132 == arg1) {
                    return;
                }
            }
            class34 var5 = new class34();
            var5.field1130 = arg0;
            var5.field1132 = arg1;
            var5.field1131 = true;
            class25 var6 = this.field1428;
            synchronized (this.field1428) {
                this.field1428.method326(var5);
            }
            this.field1427.method404(var5);
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "()LLOBJUMRN;")
    public final class34 method532() {
        class25 var1 = this.field1416;
        class34 var2;
        synchronized (this.field1416) {
            var2 = (class34) this.field1416.method328();
        }
        if (var2 == null) {
            return null;
        }
        class36 var3 = this.field1427;
        synchronized (this.field1427) {
            var2.method409();
        }
        if (var2.field1134 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1134));
            while (true) {
                if (this.field1410.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1410, var4, this.field1410.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1134 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1134[var7] = this.field1410[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "SSXXGGTR", name = "b", descriptor = "(II)Z")
    public final boolean method533(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1407.length; var3++) {
            if (this.field1439[var3] == arg1) {
                return true;
            }
        }
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "SSXXGGTR", name = "c", descriptor = "(II)Z")
    public final boolean method534(int arg0, int arg1) {
        if (arg0 != 42477) {
            throw new NullPointerException();
        }
        return this.field1436[arg1] == 1;
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(B)V")
    public final void method535(byte arg0) {
        class25 var2 = this.field1442;
        synchronized (this.field1442) {
            this.field1442.method333();
        }
        if (arg0 != -87) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(IZBI)V")
    public final void method536(int arg0, boolean arg1, byte arg2, int arg3) {
        if (this.field1444.field169[0] == null || this.field1445[arg3][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field1444.field169[arg3 + 1].method310(arg0, 1);
        if (this.method546(this.field1445[arg3][arg0], this.field1402[arg3][arg0], 6, var5)) {
            return;
        }
        this.field1408[arg3][arg0] = arg2;
        if (arg2 > this.field1417) {
            this.field1417 = arg2;
        }
        this.field1426++;
        if (!arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "b", descriptor = "()I")
    public final int method537() {
        class36 var1 = this.field1427;
        synchronized (this.field1427) {
            return this.field1427.method408();
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "c", descriptor = "(I)V")
    private final void method538(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        this.field1404 = 0;
        this.field1405 = 0;
        for (class34 var2 = (class34) this.field1424.method329(); var2 != null; var2 = (class34) this.field1424.method331(9)) {
            if (var2.field1131) {
                this.field1404++;
            } else {
                this.field1405++;
            }
        }
        while (this.field1404 < 10) {
            class34 var3 = (class34) this.field1412.method328();
            if (var3 == null) {
                break;
            }
            if (this.field1408[var3.field1130][var3.field1132] != 0) {
                this.field1435++;
            }
            this.field1408[var3.field1130][var3.field1132] = 0;
            this.field1424.method326(var3);
            this.field1404++;
            this.method547(this.field1433, var3);
            this.field1441 = true;
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(IZ)V")
    public final void method539(int arg0, boolean arg1) {
        int var3 = this.field1407.length;
        if (arg0 != 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1409[var4] != 0) {
                this.method536(this.field1439[var4], true, (byte) 2, 3);
                this.method536(this.field1429[var4], true, (byte) 2, 3);
            }
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "d", descriptor = "(II)I")
    public final int method540(int arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            this.field1401 = !this.field1401;
        }
        return this.field1406[arg0] & 0xFF;
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(IIIZ)I")
    public final int method541(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return 1;
        }
        int var5 = (arg1 << 8) + arg2;
        for (int var6 = 0; var6 < this.field1407.length; var6++) {
            if (this.field1407[var6] == var5) {
                if (arg0 == 0) {
                    return this.field1429[var6];
                }
                return this.field1439[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "SSXXGGTR", name = "d", descriptor = "(I)I")
    public final int method542(int arg0) {
        return arg0 == -7482 ? this.field1437.length : this.field1421;
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(IBI)V")
    public final void method543(int arg0, byte arg1, int arg2) {
        if (arg1 != -65) {
            field1418 = !field1418;
        }
        if (this.field1444.field169[0] == null || (this.field1445[arg2][arg0] == 0 || (this.field1408[arg2][arg0] == 0 || this.field1417 == 0))) {
            return;
        }
        class34 var4 = new class34();
        var4.field1130 = arg2;
        var4.field1132 = arg0;
        var4.field1131 = false;
        class25 var5 = this.field1442;
        synchronized (this.field1442) {
            this.field1442.method326(var4);
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "b", descriptor = "(B)V")
    private final void method544(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field1423 = !this.field1423;
        }
        while (this.field1404 == 0) {
            if (this.field1405 >= 10 || this.field1417 == 0) {
                return;
            }
            class25 var3 = this.field1442;
            class34 var4;
            synchronized (this.field1442) {
                var4 = (class34) this.field1442.method328();
            }
            while (var4 != null) {
                if (this.field1408[var4.field1130][var4.field1132] != 0) {
                    this.field1408[var4.field1130][var4.field1132] = 0;
                    this.field1424.method326(var4);
                    this.method547(this.field1433, var4);
                    this.field1441 = true;
                    if (this.field1435 < this.field1426) {
                        this.field1435++;
                    }
                    this.field1400 = "Loading extra files - " + this.field1435 * 100 / this.field1426 + "%";
                    this.field1405++;
                    if (this.field1405 == 10) {
                        return;
                    }
                }
                class25 var5 = this.field1442;
                synchronized (this.field1442) {
                    var4 = (class34) this.field1442.method328();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field1408[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field1417) {
                        var7[var9] = 0;
                        class34 var10 = new class34();
                        var10.field1130 = var6;
                        var10.field1132 = var9;
                        var10.field1131 = false;
                        this.field1424.method326(var10);
                        this.method547(this.field1433, var10);
                        this.field1441 = true;
                        if (this.field1435 < this.field1426) {
                            this.field1435++;
                        }
                        this.field1400 = "Loading extra files - " + this.field1435 * 100 / this.field1426 + "%";
                        this.field1405++;
                        if (this.field1405 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1417--;
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1415) {
                this.field1434++;
                byte var1 = 20;
                if (this.field1417 == 0 && this.field1444.field169[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1441 = true;
                for (int var2 = 0; var2 < 100 && this.field1441; var2++) {
                    this.field1441 = false;
                    this.method529(this.field1414);
                    this.method538(-295);
                    if (this.field1404 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method544((byte) 5);
                    if (this.field1413 != null) {
                        this.method549((byte) 95);
                    }
                }
                boolean var3 = false;
                for (class34 var4 = (class34) this.field1424.method329(); var4 != null; var4 = (class34) this.field1424.method331(9)) {
                    if (var4.field1131) {
                        var3 = true;
                        var4.field1133++;
                        if (var4.field1133 > 50) {
                            var4.field1133 = 0;
                            this.method547(this.field1433, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class34 var5 = (class34) this.field1424.method329(); var5 != null; var5 = (class34) this.field1424.method331(9)) {
                        var3 = true;
                        var5.field1133++;
                        if (var5.field1133 > 50) {
                            var5.field1133 = 0;
                            this.method547(this.field1433, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1432++;
                    if (this.field1432 > 750) {
                        try {
                            this.field1403.close();
                        } catch (Exception var8) {
                        }
                        this.field1403 = null;
                        this.field1413 = null;
                        this.field1440 = null;
                        this.field1431 = 0;
                    }
                } else {
                    this.field1432 = 0;
                    this.field1400 = "";
                }
                if (this.field1444.field222 && this.field1403 != null && this.field1440 != null && (this.field1417 > 0 || this.field1444.field169[0] == null)) {
                    this.field1438++;
                    if (this.field1438 > 500) {
                        this.field1438 = 0;
                        this.field1420[0] = 0;
                        this.field1420[1] = 0;
                        this.field1420[2] = 0;
                        this.field1420[3] = 10;
                        try {
                            this.field1440.write(this.field1420, 0, 4);
                        } catch (IOException var7) {
                            this.field1432 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "c", descriptor = "()V")
    public final void method545() {
        this.field1415 = false;
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(III[B)Z")
    private final boolean method546(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        if (arg2 < 6 || arg2 > 6) {
            throw new NullPointerException();
        }
        this.field1443.reset();
        this.field1443.update(arg3, 0, var5);
        int var7 = (int) this.field1443.getValue();
        if (arg0 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(I)V")
    public final void method265(int arg0) {
        this.method531(0, arg0);
    }

    @OriginalMember(owner = "SSXXGGTR", name = "a", descriptor = "(ILLOBJUMRN;)V")
    private final void method547(int arg0, class34 arg1) {
        label54: while (true) {
            if (arg0 >= 0) {
                int var3 = 1;
                while (true) {
                    if (var3 <= 0) {
                        continue label54;
                    }
                    var3++;
                }
            }
            try {
                if (this.field1403 == null) {
                    long var4 = System.currentTimeMillis();
                    if (var4 - this.field1425 < 4000L) {
                        return;
                    }
                    this.field1425 = var4;
                    this.field1403 = this.field1444.method184(client.field364 + 43594);
                    this.field1413 = this.field1403.getInputStream();
                    this.field1440 = this.field1403.getOutputStream();
                    this.field1440.write(15);
                    for (int var6 = 0; var6 < 8; var6++) {
                        this.field1413.read();
                    }
                    this.field1432 = 0;
                }
                this.field1420[0] = (byte) arg1.field1130;
                this.field1420[1] = (byte) (arg1.field1132 >> 8);
                this.field1420[2] = (byte) arg1.field1132;
                if (arg1.field1131) {
                    this.field1420[3] = 2;
                } else if (this.field1444.field222) {
                    this.field1420[3] = 0;
                } else {
                    this.field1420[3] = 1;
                }
                this.field1440.write(this.field1420, 0, 4);
                this.field1438 = 0;
                this.field1411 = -10000;
                return;
            } catch (IOException var9) {
                try {
                    this.field1403.close();
                } catch (Exception var8) {
                }
                this.field1403 = null;
                this.field1413 = null;
                this.field1440 = null;
                this.field1431 = 0;
                this.field1411++;
                return;
            }
        }
    }

    @OriginalMember(owner = "SSXXGGTR", name = "e", descriptor = "(II)I")
    public final int method548(int arg0, int arg1) {
        return arg1 == 0 ? this.field1445[arg0].length : 1;
    }

    @OriginalMember(owner = "SSXXGGTR", name = "c", descriptor = "(B)V")
    private final void method549(byte arg0) {
        if (arg0 != 95) {
            return;
        }
        try {
            int var2 = this.field1413.available();
            if (this.field1431 == 0 && var2 >= 6) {
                this.field1441 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1413.read(this.field1420, var3, 6 - var3)) {
                }
                int var4 = this.field1420[0] & 0xFF;
                int var5 = ((this.field1420[1] & 0xFF) << 8) + (this.field1420[2] & 0xFF);
                int var6 = ((this.field1420[3] & 0xFF) << 8) + (this.field1420[4] & 0xFF);
                int var7 = this.field1420[5] & 0xFF;
                this.field1419 = null;
                for (class34 var8 = (class34) this.field1424.method329(); var8 != null; var8 = (class34) this.field1424.method331(9)) {
                    if (var8.field1130 == var4 && var8.field1132 == var5) {
                        this.field1419 = var8;
                    }
                    if (this.field1419 != null) {
                        var8.field1133 = 0;
                    }
                }
                if (this.field1419 != null) {
                    this.field1432 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1419.field1134 = null;
                        if (this.field1419.field1131) {
                            class25 var9 = this.field1416;
                            synchronized (this.field1416) {
                                this.field1416.method326(this.field1419);
                            }
                        } else {
                            this.field1419.method1();
                        }
                        this.field1419 = null;
                    } else {
                        if (this.field1419.field1134 == null && var7 == 0) {
                            this.field1419.field1134 = new byte[var6];
                        }
                        if (this.field1419.field1134 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1430 = var7 * 500;
                this.field1431 = 500;
                if (this.field1431 > var6 - var7 * 500) {
                    this.field1431 = var6 - var7 * 500;
                }
            }
            if (this.field1431 > 0 && var2 >= this.field1431) {
                this.field1441 = true;
                byte[] var10 = this.field1420;
                int var11 = 0;
                if (this.field1419 != null) {
                    var10 = this.field1419.field1134;
                    var11 = this.field1430;
                }
                for (int var12 = 0; var12 < this.field1431; var12 += this.field1413.read(var10, var11 + var12, this.field1431 - var12)) {
                }
                if (this.field1431 + this.field1430 >= var10.length && this.field1419 != null) {
                    if (this.field1444.field169[0] != null) {
                        this.field1444.field169[this.field1419.field1130 + 1].method311((byte) -39, this.field1419.field1132, var10.length, var10);
                    }
                    if (!this.field1419.field1131 && this.field1419.field1130 == 3) {
                        this.field1419.field1131 = true;
                        this.field1419.field1130 = 93;
                    }
                    if (this.field1419.field1131) {
                        class25 var13 = this.field1416;
                        synchronized (this.field1416) {
                            this.field1416.method326(this.field1419);
                        }
                    } else {
                        this.field1419.method1();
                    }
                }
                this.field1431 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1403.close();
            } catch (Exception var15) {
            }
            this.field1403 = null;
            this.field1413 = null;
            this.field1440 = null;
            this.field1431 = 0;
        }
    }
}
