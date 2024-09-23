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

@OriginalClass("SDLNXGIT")
public class class57 extends class49 implements Runnable {

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "[[I")
    private int[][] field1391 = new int[4][];

    @OriginalMember(owner = "SDLNXGIT", name = "b", descriptor = "Ljava/lang/String;")
    public String field1392 = "";

    @OriginalMember(owner = "SDLNXGIT", name = "c", descriptor = "LRKSMLTCN;")
    private class52 field1393 = new class52(42993);

    @OriginalMember(owner = "SDLNXGIT", name = "d", descriptor = "[[B")
    private byte[][] field1394 = new byte[4][];

    @OriginalMember(owner = "SDLNXGIT", name = "e", descriptor = "[B")
    private byte[] field1395 = new byte[65000];

    @OriginalMember(owner = "SDLNXGIT", name = "m", descriptor = "B")
    private byte field1403 = -123;

    @OriginalMember(owner = "SDLNXGIT", name = "o", descriptor = "LEWLVMFRK;")
    private class15 field1405 = new class15(field1398);

    @OriginalMember(owner = "SDLNXGIT", name = "s", descriptor = "B")
    private byte field1409 = -27;

    @OriginalMember(owner = "SDLNXGIT", name = "t", descriptor = "Z")
    private boolean field1410 = true;

    @OriginalMember(owner = "SDLNXGIT", name = "y", descriptor = "[B")
    private byte[] field1415 = new byte[500];

    @OriginalMember(owner = "SDLNXGIT", name = "B", descriptor = "LEWLVMFRK;")
    private class15 field1418 = new class15(field1398);

    @OriginalMember(owner = "SDLNXGIT", name = "D", descriptor = "LEWLVMFRK;")
    private class15 field1420 = new class15(field1398);

    @OriginalMember(owner = "SDLNXGIT", name = "E", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1421 = new CRC32();

    @OriginalMember(owner = "SDLNXGIT", name = "F", descriptor = "B")
    private byte field1422 = -123;

    @OriginalMember(owner = "SDLNXGIT", name = "G", descriptor = "I")
    private int field1423 = 7;

    @OriginalMember(owner = "SDLNXGIT", name = "I", descriptor = "LEWLVMFRK;")
    private class15 field1425 = new class15(field1398);

    @OriginalMember(owner = "SDLNXGIT", name = "J", descriptor = "[[I")
    private int[][] field1426 = new int[4][];

    @OriginalMember(owner = "SDLNXGIT", name = "L", descriptor = "Z")
    private boolean field1428 = false;

    @OriginalMember(owner = "SDLNXGIT", name = "M", descriptor = "I")
    private int field1429 = 631;

    @OriginalMember(owner = "SDLNXGIT", name = "O", descriptor = "B")
    private byte field1431 = -54;

    @OriginalMember(owner = "SDLNXGIT", name = "S", descriptor = "LEWLVMFRK;")
    private class15 field1435 = new class15(field1398);

    @OriginalMember(owner = "SDLNXGIT", name = "h", descriptor = "Z")
    private static boolean field1398 = true;

    @OriginalMember(owner = "SDLNXGIT", name = "n", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "SDLNXGIT", name = "p", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "SDLNXGIT", name = "q", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "SDLNXGIT", name = "v", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "SDLNXGIT", name = "w", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "SDLNXGIT", name = "x", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "SDLNXGIT", name = "A", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "SDLNXGIT", name = "H", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "SDLNXGIT", name = "K", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "SDLNXGIT", name = "N", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "SDLNXGIT", name = "Q", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "SDLNXGIT", name = "i", descriptor = "J")
    private long field1399;

    @OriginalMember(owner = "SDLNXGIT", name = "j", descriptor = "LZLBJQGSS;")
    private class72 field1400;

    @OriginalMember(owner = "SDLNXGIT", name = "u", descriptor = "Lclient;")
    private client field1411;

    @OriginalMember(owner = "SDLNXGIT", name = "z", descriptor = "Ljava/io/InputStream;")
    private InputStream field1416;

    @OriginalMember(owner = "SDLNXGIT", name = "R", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1434;

    @OriginalMember(owner = "SDLNXGIT", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field1401;

    @OriginalMember(owner = "SDLNXGIT", name = "T", descriptor = "[B")
    private byte[] field1436;

    @OriginalMember(owner = "SDLNXGIT", name = "f", descriptor = "[I")
    private int[] field1396;

    @OriginalMember(owner = "SDLNXGIT", name = "g", descriptor = "[I")
    private int[] field1397;

    @OriginalMember(owner = "SDLNXGIT", name = "l", descriptor = "[I")
    private int[] field1402;

    @OriginalMember(owner = "SDLNXGIT", name = "r", descriptor = "[I")
    private int[] field1408;

    @OriginalMember(owner = "SDLNXGIT", name = "C", descriptor = "[I")
    private int[] field1419;

    @OriginalMember(owner = "SDLNXGIT", name = "P", descriptor = "[I")
    private int[] field1432;

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(II)I")
    public final int method429(int arg0, int arg1) {
        int var3 = 91 / arg1;
        return this.field1391[arg0].length;
    }

    @OriginalMember(owner = "SDLNXGIT", name = "b", descriptor = "(II)V")
    public final void method430(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1391.length || arg1 < 0 || arg1 > this.field1391[arg0].length || this.field1391[arg0][arg1] == 0) {
            return;
        }
        class52 var3 = this.field1393;
        synchronized (this.field1393) {
            for (class72 var4 = (class72) this.field1393.method407(); var4 != null; var4 = (class72) this.field1393.method408((byte) 3)) {
                if (var4.field1734 == arg0 && var4.field1735 == arg1) {
                    return;
                }
            }
            class72 var5 = new class72();
            var5.field1734 = arg0;
            var5.field1735 = arg1;
            var5.field1736 = true;
            class15 var6 = this.field1425;
            synchronized (this.field1425) {
                this.field1425.method198(var5);
            }
            this.field1393.method405(var5);
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(B)V")
    private final void method431(byte arg0) {
        if (arg0 != 65) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field1406 == 0) {
            if (this.field1407 >= 10 || this.field1404 == 0) {
                return;
            }
            class15 var3 = this.field1405;
            class72 var4;
            synchronized (this.field1405) {
                var4 = (class72) this.field1405.method200();
            }
            while (var4 != null) {
                if (this.field1394[var4.field1734][var4.field1735] != 0) {
                    this.field1394[var4.field1734][var4.field1735] = 0;
                    this.field1418.method198(var4);
                    this.method444(var4, true);
                    this.field1428 = true;
                    if (this.field1433 < this.field1417) {
                        this.field1433++;
                    }
                    this.field1392 = "Loading extra files - " + this.field1433 * 100 / this.field1417 + "%";
                    this.field1407++;
                    if (this.field1407 == 10) {
                        return;
                    }
                }
                class15 var5 = this.field1405;
                synchronized (this.field1405) {
                    var4 = (class72) this.field1405.method200();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field1394[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field1404) {
                        var7[var9] = 0;
                        class72 var10 = new class72();
                        var10.field1734 = var6;
                        var10.field1735 = var9;
                        var10.field1736 = false;
                        this.field1418.method198(var10);
                        this.method444(var10, true);
                        this.field1428 = true;
                        if (this.field1433 < this.field1417) {
                            this.field1433++;
                        }
                        this.field1392 = "Loading extra files - " + this.field1433 * 100 / this.field1417 + "%";
                        this.field1407++;
                        if (this.field1407 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1404--;
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(ZZ)V")
    public final void method432(boolean arg0, boolean arg1) {
        if (arg0) {
            return;
        }
        int var3 = this.field1396.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1397[var4] != 0) {
                this.method446(3, -79, this.field1432[var4], (byte) 2);
                this.method446(3, -79, this.field1408[var4], (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "b", descriptor = "(I)I")
    public final int method433(int arg0) {
        if (arg0 != 43313) {
            this.field1429 = -316;
        }
        return this.field1402.length;
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(ZII[B)Z")
    private final boolean method434(boolean arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field1421.reset();
        this.field1421.update(arg3, 0, var5);
        if (arg0) {
            throw new NullPointerException();
        }
        int var7 = (int) this.field1421.getValue();
        if (arg2 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(Z)V")
    private final void method435(boolean arg0) {
        if (!arg0) {
            return;
        }
        class15 var2 = this.field1425;
        class72 var3;
        synchronized (this.field1425) {
            var3 = (class72) this.field1425.method200();
        }
        while (var3 != null) {
            this.field1428 = true;
            byte[] var4 = null;
            if (this.field1411.field493[0] != null) {
                var4 = this.field1411.field493[var3.field1734 + 1].method392(this.field1409, var3.field1735);
            }
            if (!this.method434(false, this.field1426[var3.field1734][var3.field1735], this.field1391[var3.field1734][var3.field1735], var4)) {
                var4 = null;
            }
            class15 var5 = this.field1425;
            synchronized (this.field1425) {
                if (var4 == null) {
                    this.field1435.method198(var3);
                } else {
                    var3.field1737 = var4;
                    class15 var6 = this.field1420;
                    synchronized (this.field1420) {
                        this.field1420.method198(var3);
                    }
                }
                var3 = (class72) this.field1425.method200();
            }
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "b", descriptor = "(B)V")
    private final void method436(byte arg0) {
        if (this.field1422 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1406 = 0;
        this.field1407 = 0;
        for (class72 var3 = (class72) this.field1418.method201(); var3 != null; var3 = (class72) this.field1418.method203((byte) 3)) {
            if (var3.field1736) {
                this.field1406++;
            } else {
                this.field1407++;
            }
        }
        while (this.field1406 < 10) {
            class72 var4 = (class72) this.field1435.method200();
            if (var4 == null) {
                break;
            }
            if (this.field1394[var4.field1734][var4.field1735] != 0) {
                this.field1433++;
            }
            this.field1394[var4.field1734][var4.field1735] = 0;
            this.field1418.method198(var4);
            this.field1406++;
            this.method444(var4, true);
            this.field1428 = true;
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "()LZLBJQGSS;")
    public final class72 method437() {
        class15 var1 = this.field1420;
        class72 var2;
        synchronized (this.field1420) {
            var2 = (class72) this.field1420.method200();
        }
        if (var2 == null) {
            return null;
        }
        class52 var3 = this.field1393;
        synchronized (this.field1393) {
            var2.method357();
        }
        if (var2.field1737 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1737));
            while (true) {
                if (this.field1395.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1395, var4, this.field1395.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1737 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1737[var7] = this.field1395[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(IIZI)I")
    public final int method438(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = (arg1 << 8) + arg3;
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < this.field1396.length; var7++) {
            if (this.field1396[var7] == var5) {
                if (arg0 == 0) {
                    return this.field1408[var7];
                }
                return this.field1432[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "SDLNXGIT", name = "c", descriptor = "(II)I")
    public final int method439(int arg0, int arg1) {
        if (arg1 != 21251) {
            field1398 = !field1398;
        }
        return this.field1436[arg0] & 0xFF;
    }

    @OriginalMember(owner = "SDLNXGIT", name = "b", descriptor = "()I")
    public final int method440() {
        class52 var1 = this.field1393;
        synchronized (this.field1393) {
            return this.field1393.method409();
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(III)V")
    public final void method441(int arg0, int arg1, int arg2) {
        if (this.field1411.field493[0] == null || (this.field1391[arg1][arg2] == 0 || (this.field1394[arg1][arg2] == 0 || this.field1404 == 0))) {
            return;
        }
        class72 var4 = new class72();
        int var5 = 58 / arg0;
        var4.field1734 = arg1;
        var4.field1735 = arg2;
        var4.field1736 = false;
        class15 var6 = this.field1405;
        synchronized (this.field1405) {
            this.field1405.method198(var4);
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "c", descriptor = "()V")
    public final void method442() {
        this.field1410 = false;
    }

    @OriginalMember(owner = "SDLNXGIT", name = "d", descriptor = "(II)Z")
    public final boolean method443(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1396.length; var3++) {
            if (this.field1432[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 0) {
            this.field1429 = -172;
        }
        return false;
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(LZLBJQGSS;Z)V")
    private final void method444(class72 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        try {
            if (this.field1401 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1399 < 4000L) {
                    return;
                }
                this.field1399 = var3;
                this.field1401 = this.field1411.method85(client.field370 + 43594);
                this.field1416 = this.field1401.getInputStream();
                this.field1434 = this.field1401.getOutputStream();
                this.field1434.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1416.read();
                }
                this.field1424 = 0;
            }
            this.field1415[0] = (byte) arg0.field1734;
            this.field1415[1] = (byte) (arg0.field1735 >> 8);
            this.field1415[2] = (byte) arg0.field1735;
            if (arg0.field1736) {
                this.field1415[3] = 2;
            } else if (this.field1411.field452) {
                this.field1415[3] = 0;
            } else {
                this.field1415[3] = 1;
            }
            this.field1434.write(this.field1415, 0, 4);
            this.field1414 = 0;
            this.field1427 = -10000;
        } catch (IOException var8) {
            try {
                this.field1401.close();
            } catch (Exception var7) {
            }
            this.field1401 = null;
            this.field1416 = null;
            this.field1434 = null;
            this.field1413 = 0;
            this.field1427++;
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(I)V")
    public final void method400(int arg0) {
        this.method430(0, arg0);
    }

    @OriginalMember(owner = "SDLNXGIT", name = "c", descriptor = "(B)V")
    public final void method445(byte arg0) {
        if (this.field1431 != arg0) {
            this.field1429 = 387;
        }
        class15 var2 = this.field1405;
        synchronized (this.field1405) {
            this.field1405.method205();
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(IIIB)V")
    public final void method446(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field1411.field493[0] == null || this.field1391[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1411.field493[arg0 + 1].method392(this.field1409, arg2);
        if (this.method434(false, this.field1426[arg0][arg2], this.field1391[arg0][arg2], var5)) {
            return;
        }
        this.field1394[arg0][arg2] = arg3;
        while (arg1 >= 0) {
            this.field1429 = 41;
        }
        if (arg3 > this.field1404) {
            this.field1404 = arg3;
        }
        this.field1417++;
    }

    @OriginalMember(owner = "SDLNXGIT", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1410) {
                this.field1430++;
                byte var1 = 20;
                if (this.field1404 == 0 && this.field1411.field493[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1428 = true;
                for (int var2 = 0; var2 < 100 && this.field1428; var2++) {
                    this.field1428 = false;
                    this.method435(true);
                    this.method436(this.field1403);
                    if (this.field1406 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method431((byte) 65);
                    if (this.field1416 != null) {
                        this.method447(this.field1423);
                    }
                }
                boolean var3 = false;
                for (class72 var4 = (class72) this.field1418.method201(); var4 != null; var4 = (class72) this.field1418.method203((byte) 3)) {
                    if (var4.field1736) {
                        var3 = true;
                        var4.field1733++;
                        if (var4.field1733 > 50) {
                            var4.field1733 = 0;
                            this.method444(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (class72 var5 = (class72) this.field1418.method201(); var5 != null; var5 = (class72) this.field1418.method203((byte) 3)) {
                        var3 = true;
                        var5.field1733++;
                        if (var5.field1733 > 50) {
                            var5.field1733 = 0;
                            this.method444(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field1424++;
                    if (this.field1424 > 750) {
                        try {
                            this.field1401.close();
                        } catch (Exception var8) {
                        }
                        this.field1401 = null;
                        this.field1416 = null;
                        this.field1434 = null;
                        this.field1413 = 0;
                    }
                } else {
                    this.field1424 = 0;
                    this.field1392 = "";
                }
                if (this.field1411.field452 && this.field1401 != null && this.field1434 != null && (this.field1404 > 0 || this.field1411.field493[0] == null)) {
                    this.field1414++;
                    if (this.field1414 > 500) {
                        this.field1414 = 0;
                        this.field1415[0] = 0;
                        this.field1415[1] = 0;
                        this.field1415[2] = 0;
                        this.field1415[3] = 10;
                        try {
                            this.field1434.write(this.field1415, 0, 4);
                        } catch (IOException var7) {
                            this.field1424 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "c", descriptor = "(I)V")
    private final void method447(int arg0) {
        if (arg0 < this.field1423 || arg0 > this.field1423) {
            return;
        }
        try {
            int var2 = this.field1416.available();
            if (this.field1413 == 0 && var2 >= 6) {
                this.field1428 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1416.read(this.field1415, var3, 6 - var3)) {
                }
                int var4 = this.field1415[0] & 0xFF;
                int var5 = ((this.field1415[1] & 0xFF) << 8) + (this.field1415[2] & 0xFF);
                int var6 = ((this.field1415[3] & 0xFF) << 8) + (this.field1415[4] & 0xFF);
                int var7 = this.field1415[5] & 0xFF;
                this.field1400 = null;
                for (class72 var8 = (class72) this.field1418.method201(); var8 != null; var8 = (class72) this.field1418.method203((byte) 3)) {
                    if (var8.field1734 == var4 && var8.field1735 == var5) {
                        this.field1400 = var8;
                    }
                    if (this.field1400 != null) {
                        var8.field1733 = 0;
                    }
                }
                if (this.field1400 != null) {
                    this.field1424 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1400.field1737 = null;
                        if (this.field1400.field1736) {
                            class15 var9 = this.field1420;
                            synchronized (this.field1420) {
                                this.field1420.method198(this.field1400);
                            }
                        } else {
                            this.field1400.method396();
                        }
                        this.field1400 = null;
                    } else {
                        if (this.field1400.field1737 == null && var7 == 0) {
                            this.field1400.field1737 = new byte[var6];
                        }
                        if (this.field1400.field1737 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1412 = var7 * 500;
                this.field1413 = 500;
                if (this.field1413 > var6 - var7 * 500) {
                    this.field1413 = var6 - var7 * 500;
                }
            }
            if (this.field1413 > 0 && var2 >= this.field1413) {
                this.field1428 = true;
                byte[] var10 = this.field1415;
                int var11 = 0;
                if (this.field1400 != null) {
                    var10 = this.field1400.field1737;
                    var11 = this.field1412;
                }
                for (int var12 = 0; var12 < this.field1413; var12 += this.field1416.read(var10, var11 + var12, this.field1413 - var12)) {
                }
                if (this.field1413 + this.field1412 >= var10.length && this.field1400 != null) {
                    if (this.field1411.field493[0] != null) {
                        this.field1411.field493[this.field1400.field1734 + 1].method393(var10, var10.length, this.field1400.field1735, 1);
                    }
                    if (!this.field1400.field1736 && this.field1400.field1734 == 3) {
                        this.field1400.field1736 = true;
                        this.field1400.field1734 = 93;
                    }
                    if (this.field1400.field1736) {
                        class15 var13 = this.field1420;
                        synchronized (this.field1420) {
                            this.field1420.method198(this.field1400);
                        }
                    } else {
                        this.field1400.method396();
                    }
                }
                this.field1413 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1401.close();
            } catch (Exception var15) {
            }
            this.field1401 = null;
            this.field1416 = null;
            this.field1434 = null;
            this.field1413 = 0;
        }
    }

    @OriginalMember(owner = "SDLNXGIT", name = "a", descriptor = "(LQKFGLETG;Lclient;)V")
    public final void method448(class50 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method402(var3[var4], null);
            int var27 = var26.length / 2;
            class68 var28 = new class68((byte) 9, var26);
            this.field1391[var4] = new int[var27];
            this.field1394[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1391[var4][var29] = var28.method536();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method402(var5[var6], null);
            int var23 = var22.length / 4;
            class68 var24 = new class68((byte) 9, var22);
            this.field1426[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1426[var6][var25] = var24.method539();
            }
        }
        byte[] var7 = arg0.method402("model_index", null);
        int var8 = this.field1391[0].length;
        this.field1436 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1436[var9] = var7[var9];
            } else {
                this.field1436[var9] = 0;
            }
        }
        byte[] var10 = arg0.method402("map_index", null);
        class68 var11 = new class68((byte) 9, var10);
        int var12 = var10.length / 7;
        this.field1396 = new int[var12];
        this.field1408 = new int[var12];
        this.field1432 = new int[var12];
        this.field1397 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1396[var13] = var11.method536();
            this.field1408[var13] = var11.method536();
            this.field1432[var13] = var11.method536();
            this.field1397[var13] = var11.method534();
        }
        byte[] var14 = arg0.method402("anim_index", null);
        class68 var15 = new class68((byte) 9, var14);
        int var16 = var14.length / 2;
        this.field1402 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1402[var17] = var15.method536();
        }
        byte[] var18 = arg0.method402("midi_index", null);
        class68 var19 = new class68((byte) 9, var18);
        int var20 = var18.length;
        this.field1419 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1419[var21] = var19.method534();
        }
        this.field1411 = arg1;
        this.field1410 = true;
        this.field1411.method106(this, 2);
    }

    @OriginalMember(owner = "SDLNXGIT", name = "e", descriptor = "(II)Z")
    public final boolean method449(int arg0, int arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return this.field1419[arg1] == 1;
    }
}
