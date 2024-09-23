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

@OriginalClass("WNPVPVVL")
public class class58 extends class69 implements Runnable {

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "LLVGEETWD;")
    private class38 field1438 = new class38((byte) 17);

    @OriginalMember(owner = "WNPVPVVL", name = "b", descriptor = "LFOKYUBQV;")
    private class16 field1439 = new class16(false);

    @OriginalMember(owner = "WNPVPVVL", name = "d", descriptor = "[[B")
    private byte[][] field1441 = new byte[4][];

    @OriginalMember(owner = "WNPVPVVL", name = "e", descriptor = "[B")
    private byte[] field1442 = new byte[65000];

    @OriginalMember(owner = "WNPVPVVL", name = "i", descriptor = "I")
    private int field1446 = -670;

    @OriginalMember(owner = "WNPVPVVL", name = "j", descriptor = "I")
    private int field1447 = -822;

    @OriginalMember(owner = "WNPVPVVL", name = "o", descriptor = "I")
    private int field1452 = -8221;

    @OriginalMember(owner = "WNPVPVVL", name = "w", descriptor = "LFOKYUBQV;")
    private class16 field1460 = new class16(false);

    @OriginalMember(owner = "WNPVPVVL", name = "x", descriptor = "[B")
    private byte[] field1461 = new byte[500];

    @OriginalMember(owner = "WNPVPVVL", name = "z", descriptor = "LFOKYUBQV;")
    private class16 field1463 = new class16(false);

    @OriginalMember(owner = "WNPVPVVL", name = "A", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1464 = new CRC32();

    @OriginalMember(owner = "WNPVPVVL", name = "B", descriptor = "LFOKYUBQV;")
    private class16 field1465 = new class16(false);

    @OriginalMember(owner = "WNPVPVVL", name = "H", descriptor = "Z")
    private boolean field1471 = true;

    @OriginalMember(owner = "WNPVPVVL", name = "K", descriptor = "Z")
    private boolean field1474 = true;

    @OriginalMember(owner = "WNPVPVVL", name = "L", descriptor = "[[I")
    private int[][] field1475 = new int[4][];

    @OriginalMember(owner = "WNPVPVVL", name = "M", descriptor = "I")
    private int field1476 = -661;

    @OriginalMember(owner = "WNPVPVVL", name = "N", descriptor = "LFOKYUBQV;")
    private class16 field1477 = new class16(false);

    @OriginalMember(owner = "WNPVPVVL", name = "O", descriptor = "[[I")
    private int[][] field1478 = new int[4][];

    @OriginalMember(owner = "WNPVPVVL", name = "Q", descriptor = "Z")
    private boolean field1480 = false;

    @OriginalMember(owner = "WNPVPVVL", name = "R", descriptor = "Z")
    private boolean field1481 = true;

    @OriginalMember(owner = "WNPVPVVL", name = "S", descriptor = "Ljava/lang/String;")
    public String field1482 = "";

    @OriginalMember(owner = "WNPVPVVL", name = "c", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "WNPVPVVL", name = "k", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "WNPVPVVL", name = "l", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "WNPVPVVL", name = "m", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "WNPVPVVL", name = "q", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "WNPVPVVL", name = "t", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "WNPVPVVL", name = "v", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "WNPVPVVL", name = "D", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "WNPVPVVL", name = "E", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "WNPVPVVL", name = "G", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "WNPVPVVL", name = "I", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "WNPVPVVL", name = "J", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "WNPVPVVL", name = "f", descriptor = "J")
    private long field1443;

    @OriginalMember(owner = "WNPVPVVL", name = "s", descriptor = "LWHTATTJS;")
    private class56 field1456;

    @OriginalMember(owner = "WNPVPVVL", name = "T", descriptor = "Lclient;")
    private client field1483;

    @OriginalMember(owner = "WNPVPVVL", name = "y", descriptor = "Ljava/io/InputStream;")
    private InputStream field1462;

    @OriginalMember(owner = "WNPVPVVL", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1458;

    @OriginalMember(owner = "WNPVPVVL", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field1445;

    @OriginalMember(owner = "WNPVPVVL", name = "C", descriptor = "[B")
    private byte[] field1466;

    @OriginalMember(owner = "WNPVPVVL", name = "g", descriptor = "[I")
    private int[] field1444;

    @OriginalMember(owner = "WNPVPVVL", name = "n", descriptor = "[I")
    private int[] field1451;

    @OriginalMember(owner = "WNPVPVVL", name = "p", descriptor = "[I")
    private int[] field1453;

    @OriginalMember(owner = "WNPVPVVL", name = "r", descriptor = "[I")
    private int[] field1455;

    @OriginalMember(owner = "WNPVPVVL", name = "F", descriptor = "[I")
    private int[] field1469;

    @OriginalMember(owner = "WNPVPVVL", name = "P", descriptor = "[I")
    private int[] field1479;

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(IB)I")
    public final int method439(int arg0, byte arg1) {
        return arg1 == 4 ? this.field1478[arg0].length : this.field1447;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(IIZ[B)Z")
    private final boolean method440(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        if (!arg2) {
            throw new NullPointerException();
        }
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field1464.reset();
        this.field1464.update(arg3, 0, var5);
        int var7 = (int) this.field1464.getValue();
        if (arg0 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "()LWHTATTJS;")
    public final class56 method441() {
        class16 var1 = this.field1439;
        class56 var2;
        synchronized (this.field1439) {
            var2 = (class56) this.field1439.method198();
        }
        if (var2 == null) {
            return null;
        }
        class38 var3 = this.field1438;
        synchronized (this.field1438) {
            var2.method537();
        }
        if (var2.field1384 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1384));
            while (true) {
                if (this.field1442.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1442, var4, this.field1442.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1384 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1384[var7] = this.field1442[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1471) {
                this.field1454++;
                byte var1 = 20;
                if (this.field1440 == 0 && this.field1483.field206[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1480 = true;
                for (int var2 = 0; var2 < 100 && this.field1480; var2++) {
                    this.field1480 = false;
                    this.method446(-670);
                    this.method460(-171);
                    if (this.field1472 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method450(0);
                    if (this.field1462 != null) {
                        this.method457(-26740);
                    }
                }
                boolean var3 = false;
                for (class56 var4 = (class56) this.field1460.method199(); var4 != null; var4 = (class56) this.field1460.method201(467)) {
                    if (var4.field1382) {
                        var3 = true;
                        var4.field1381++;
                        if (var4.field1381 > 50) {
                            var4.field1381 = 0;
                            this.method453(21528, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class56 var5 = (class56) this.field1460.method199(); var5 != null; var5 = (class56) this.field1460.method201(467)) {
                        var3 = true;
                        var5.field1381++;
                        if (var5.field1381 > 50) {
                            var5.field1381 = 0;
                            this.method453(21528, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1449++;
                    if (this.field1449 > 750) {
                        try {
                            this.field1445.close();
                        } catch (Exception var8) {
                        }
                        this.field1445 = null;
                        this.field1462 = null;
                        this.field1458 = null;
                        this.field1468 = 0;
                    }
                } else {
                    this.field1449 = 0;
                    this.field1482 = "";
                }
                if (this.field1483.field353 && this.field1445 != null && this.field1458 != null && (this.field1440 > 0 || this.field1483.field206[0] == null)) {
                    this.field1450++;
                    if (this.field1450 > 500) {
                        this.field1450 = 0;
                        this.field1461[0] = 0;
                        this.field1461[1] = 0;
                        this.field1461[2] = 0;
                        this.field1461[3] = 10;
                        try {
                            this.field1458.write(this.field1461, 0, 4);
                        } catch (IOException var7) {
                            this.field1449 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(LXMRRKSSB;Lclient;)V")
    public final void method442(class60 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method465(var3[var4], null);
            int var27 = var26.length / 2;
            class62 var28 = new class62(var26, 49938);
            this.field1478[var4] = new int[var27];
            this.field1441[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1478[var4][var29] = var28.method480();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method465(var5[var6], null);
            int var23 = var22.length / 4;
            class62 var24 = new class62(var22, 49938);
            this.field1475[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1475[var6][var25] = var24.method483();
            }
        }
        byte[] var7 = arg0.method465("model_index", null);
        int var8 = this.field1478[0].length;
        this.field1466 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1466[var9] = var7[var9];
            } else {
                this.field1466[var9] = 0;
            }
        }
        byte[] var10 = arg0.method465("map_index", null);
        class62 var11 = new class62(var10, 49938);
        int var12 = var10.length / 7;
        this.field1444 = new int[var12];
        this.field1479 = new int[var12];
        this.field1451 = new int[var12];
        this.field1453 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1444[var13] = var11.method480();
            this.field1479[var13] = var11.method480();
            this.field1451[var13] = var11.method480();
            this.field1453[var13] = var11.method478();
        }
        byte[] var14 = arg0.method465("anim_index", null);
        class62 var15 = new class62(var14, 49938);
        int var16 = var14.length / 2;
        this.field1469 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1469[var17] = var15.method480();
        }
        byte[] var18 = arg0.method465("midi_index", null);
        class62 var19 = new class62(var18, 49938);
        int var20 = var18.length;
        this.field1455 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1455[var21] = var19.method478();
        }
        this.field1483 = arg1;
        this.field1471 = true;
        this.field1483.method102(this, 2);
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(B)I")
    public final int method443(byte arg0) {
        return arg0 == 3 ? this.field1469.length : 2;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(I)V")
    public final void method444(int arg0) {
        this.method451(0, arg0);
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(IZ)Z")
    public final boolean method445(int arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1444.length; var3++) {
            if (this.field1451[var3] == arg0) {
                return true;
            }
        }
        if (arg1) {
            this.field1470 = 454;
        }
        return false;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "b", descriptor = "(I)V")
    private final void method446(int arg0) {
        if (this.field1446 != arg0) {
            return;
        }
        class16 var2 = this.field1477;
        class56 var3;
        synchronized (this.field1477) {
            var3 = (class56) this.field1477.method198();
        }
        while (var3 != null) {
            this.field1480 = true;
            byte[] var4 = null;
            if (this.field1483.field206[0] != null) {
                var4 = this.field1483.field206[var3.field1383 + 1].method229(var3.field1380, 168);
            }
            if (!this.method440(this.field1478[var3.field1383][var3.field1380], this.field1475[var3.field1383][var3.field1380], this.field1474, var4)) {
                var4 = null;
            }
            class16 var5 = this.field1477;
            synchronized (this.field1477) {
                if (var4 == null) {
                    this.field1463.method196(var3);
                } else {
                    var3.field1384 = var4;
                    class16 var6 = this.field1439;
                    synchronized (this.field1439) {
                        this.field1439.method196(var3);
                    }
                }
                var3 = (class56) this.field1477.method198();
            }
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(IIIB)V")
    public final void method447(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field1483.field206[0] == null || this.field1478[arg2][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field1483.field206[arg2 + 1].method229(arg0, 168);
        if (arg1 != 45785) {
            this.field1452 = 139;
        }
        if (this.method440(this.field1478[arg2][arg0], this.field1475[arg2][arg0], this.field1474, var5)) {
            return;
        }
        this.field1441[arg2][arg0] = arg3;
        if (arg3 > this.field1440) {
            this.field1440 = arg3;
        }
        this.field1457++;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(III)V")
    public final void method448(int arg0, int arg1, int arg2) {
        if (this.field1483.field206[0] == null || (this.field1478[arg0][arg1] == 0 || (this.field1441[arg0][arg1] == 0 || this.field1440 == 0))) {
            return;
        }
        class56 var4 = new class56();
        var4.field1383 = arg0;
        var4.field1380 = arg1;
        var4.field1382 = false;
        class16 var5 = this.field1465;
        synchronized (this.field1465) {
            this.field1465.method196(var4);
        }
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(IIII)I")
    public final int method449(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field1452 = 395;
        }
        int var5 = (arg0 << 8) + arg2;
        for (int var6 = 0; var6 < this.field1444.length; var6++) {
            if (this.field1444[var6] == var5) {
                if (arg1 == 0) {
                    return this.field1479[var6];
                }
                return this.field1451[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "c", descriptor = "(I)V")
    private final void method450(int arg0) {
        if (arg0 != 0) {
            return;
        }
        while (this.field1472 == 0) {
            if (this.field1473 >= 10 || this.field1440 == 0) {
                return;
            }
            class16 var2 = this.field1465;
            class56 var3;
            synchronized (this.field1465) {
                var3 = (class56) this.field1465.method198();
            }
            while (var3 != null) {
                if (this.field1441[var3.field1383][var3.field1380] != 0) {
                    this.field1441[var3.field1383][var3.field1380] = 0;
                    this.field1460.method196(var3);
                    this.method453(21528, var3);
                    this.field1480 = true;
                    if (this.field1448 < this.field1457) {
                        this.field1448++;
                    }
                    this.field1482 = "Loading extra files - " + this.field1448 * 100 / this.field1457 + "%";
                    this.field1473++;
                    if (this.field1473 == 10) {
                        return;
                    }
                }
                class16 var4 = this.field1465;
                synchronized (this.field1465) {
                    var3 = (class56) this.field1465.method198();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1441[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1440) {
                        var6[var8] = 0;
                        class56 var9 = new class56();
                        var9.field1383 = var5;
                        var9.field1380 = var8;
                        var9.field1382 = false;
                        this.field1460.method196(var9);
                        this.method453(21528, var9);
                        this.field1480 = true;
                        if (this.field1448 < this.field1457) {
                            this.field1448++;
                        }
                        this.field1482 = "Loading extra files - " + this.field1448 * 100 / this.field1457 + "%";
                        this.field1473++;
                        if (this.field1473 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1440--;
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(II)V")
    public final void method451(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1478.length || arg1 < 0 || arg1 > this.field1478[arg0].length || this.field1478[arg0][arg1] == 0) {
            return;
        }
        class38 var3 = this.field1438;
        synchronized (this.field1438) {
            for (class56 var4 = (class56) this.field1438.method359(); var4 != null; var4 = (class56) this.field1438.method360(467)) {
                if (var4.field1383 == arg0 && var4.field1380 == arg1) {
                    return;
                }
            }
            class56 var5 = new class56();
            var5.field1383 = arg0;
            var5.field1380 = arg1;
            var5.field1382 = true;
            class16 var6 = this.field1477;
            synchronized (this.field1477) {
                this.field1477.method196(var5);
            }
            this.field1438.method357(var5);
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "b", descriptor = "(II)Z")
    public final boolean method452(int arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return this.field1455[arg0] == 1;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(ILWHTATTJS;)V")
    private final void method453(int arg0, class56 arg1) {
        if (arg0 != 21528) {
            return;
        }
        try {
            if (this.field1445 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1443 < 4000L) {
                    return;
                }
                this.field1443 = var3;
                this.field1445 = this.field1483.method36(client.field233 + 43594);
                this.field1462 = this.field1445.getInputStream();
                this.field1458 = this.field1445.getOutputStream();
                this.field1458.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1462.read();
                }
                this.field1449 = 0;
            }
            this.field1461[0] = (byte) arg1.field1383;
            this.field1461[1] = (byte) (arg1.field1380 >> 8);
            this.field1461[2] = (byte) arg1.field1380;
            if (arg1.field1382) {
                this.field1461[3] = 2;
            } else if (this.field1483.field353) {
                this.field1461[3] = 0;
            } else {
                this.field1461[3] = 1;
            }
            this.field1458.write(this.field1461, 0, 4);
            this.field1450 = 0;
            this.field1459 = -10000;
        } catch (IOException var8) {
            try {
                this.field1445.close();
            } catch (Exception var7) {
            }
            this.field1445 = null;
            this.field1462 = null;
            this.field1458 = null;
            this.field1468 = 0;
            this.field1459++;
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "d", descriptor = "(I)V")
    public final void method454(int arg0) {
        class16 var2 = this.field1465;
        synchronized (this.field1465) {
            this.field1465.method203();
        }
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "a", descriptor = "(ZZ)V")
    public final void method455(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field1447 = 496;
        }
        int var3 = this.field1444.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1453[var4] != 0) {
                this.method447(this.field1451[var4], 45785, 3, (byte) 2);
                this.method447(this.field1479[var4], 45785, 3, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "b", descriptor = "()I")
    public final int method456() {
        class38 var1 = this.field1438;
        synchronized (this.field1438) {
            return this.field1438.method361();
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "e", descriptor = "(I)V")
    private final void method457(int arg0) {
        if (arg0 != -26740) {
            this.field1474 = !this.field1474;
        }
        try {
            int var2 = this.field1462.available();
            if (this.field1468 == 0 && var2 >= 6) {
                this.field1480 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1462.read(this.field1461, var3, 6 - var3)) {
                }
                int var4 = this.field1461[0] & 0xFF;
                int var5 = ((this.field1461[1] & 0xFF) << 8) + (this.field1461[2] & 0xFF);
                int var6 = ((this.field1461[3] & 0xFF) << 8) + (this.field1461[4] & 0xFF);
                int var7 = this.field1461[5] & 0xFF;
                this.field1456 = null;
                for (class56 var8 = (class56) this.field1460.method199(); var8 != null; var8 = (class56) this.field1460.method201(467)) {
                    if (var8.field1383 == var4 && var8.field1380 == var5) {
                        this.field1456 = var8;
                    }
                    if (this.field1456 != null) {
                        var8.field1381 = 0;
                    }
                }
                if (this.field1456 != null) {
                    this.field1449 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1456.field1384 = null;
                        if (this.field1456.field1382) {
                            class16 var9 = this.field1439;
                            synchronized (this.field1439) {
                                this.field1439.method196(this.field1456);
                            }
                        } else {
                            this.field1456.method195();
                        }
                        this.field1456 = null;
                    } else {
                        if (this.field1456.field1384 == null && var7 == 0) {
                            this.field1456.field1384 = new byte[var6];
                        }
                        if (this.field1456.field1384 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1467 = var7 * 500;
                this.field1468 = 500;
                if (this.field1468 > var6 - var7 * 500) {
                    this.field1468 = var6 - var7 * 500;
                }
            }
            if (this.field1468 > 0 && var2 >= this.field1468) {
                this.field1480 = true;
                byte[] var10 = this.field1461;
                int var11 = 0;
                if (this.field1456 != null) {
                    var10 = this.field1456.field1384;
                    var11 = this.field1467;
                }
                for (int var12 = 0; var12 < this.field1468; var12 += this.field1462.read(var10, var11 + var12, this.field1468 - var12)) {
                }
                if (this.field1468 + this.field1467 >= var10.length && this.field1456 != null) {
                    if (this.field1483.field206[0] != null) {
                        this.field1483.field206[this.field1456.field1383 + 1].method230(this.field1456.field1380, (byte) 99, var10, var10.length);
                    }
                    if (!this.field1456.field1382 && this.field1456.field1383 == 3) {
                        this.field1456.field1382 = true;
                        this.field1456.field1383 = 93;
                    }
                    if (this.field1456.field1382) {
                        class16 var13 = this.field1439;
                        synchronized (this.field1439) {
                            this.field1439.method196(this.field1456);
                        }
                    } else {
                        this.field1456.method195();
                    }
                }
                this.field1468 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1445.close();
            } catch (Exception var15) {
            }
            this.field1445 = null;
            this.field1462 = null;
            this.field1458 = null;
            this.field1468 = 0;
        }
    }

    @OriginalMember(owner = "WNPVPVVL", name = "c", descriptor = "(II)I")
    public final int method458(int arg0, int arg1) {
        if (arg1 < 7 || arg1 > 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1466[arg0] & 0xFF;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "c", descriptor = "()V")
    public final void method459() {
        this.field1471 = false;
    }

    @OriginalMember(owner = "WNPVPVVL", name = "f", descriptor = "(I)V")
    private final void method460(int arg0) {
        this.field1472 = 0;
        this.field1473 = 0;
        if (arg0 >= 0) {
            return;
        }
        for (class56 var2 = (class56) this.field1460.method199(); var2 != null; var2 = (class56) this.field1460.method201(467)) {
            if (var2.field1382) {
                this.field1472++;
            } else {
                this.field1473++;
            }
        }
        while (this.field1472 < 10) {
            class56 var3 = (class56) this.field1463.method198();
            if (var3 == null) {
                break;
            }
            if (this.field1441[var3.field1383][var3.field1380] != 0) {
                this.field1448++;
            }
            this.field1441[var3.field1383][var3.field1380] = 0;
            this.field1460.method196(var3);
            this.field1472++;
            this.method453(21528, var3);
            this.field1480 = true;
        }
    }
}
