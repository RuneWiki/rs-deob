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

@OriginalClass("TXSWXFHQ")
public class class55 extends class60 implements Runnable {

    @OriginalMember(owner = "TXSWXFHQ", name = "b", descriptor = "[[I")
    private int[][] field1474 = new int[4][];

    @OriginalMember(owner = "TXSWXFHQ", name = "d", descriptor = "[B")
    private byte[] field1476 = new byte[65000];

    @OriginalMember(owner = "TXSWXFHQ", name = "e", descriptor = "Z")
    private boolean field1477 = false;

    @OriginalMember(owner = "TXSWXFHQ", name = "f", descriptor = "LILVDIPQT;")
    private class31 field1478 = new class31(-33684);

    @OriginalMember(owner = "TXSWXFHQ", name = "g", descriptor = "[[B")
    private byte[][] field1479 = new byte[4][];

    @OriginalMember(owner = "TXSWXFHQ", name = "h", descriptor = "LILVDIPQT;")
    private class31 field1480 = new class31(-33684);

    @OriginalMember(owner = "TXSWXFHQ", name = "j", descriptor = "LILVDIPQT;")
    private class31 field1482 = new class31(-33684);

    @OriginalMember(owner = "TXSWXFHQ", name = "l", descriptor = "[[I")
    private int[][] field1484 = new int[4][];

    @OriginalMember(owner = "TXSWXFHQ", name = "m", descriptor = "LEOXICPMP;")
    private class16 field1485 = new class16(true);

    @OriginalMember(owner = "TXSWXFHQ", name = "p", descriptor = "B")
    private byte field1488 = 111;

    @OriginalMember(owner = "TXSWXFHQ", name = "r", descriptor = "B")
    private byte field1490 = -7;

    @OriginalMember(owner = "TXSWXFHQ", name = "t", descriptor = "I")
    private int field1492 = 1;

    @OriginalMember(owner = "TXSWXFHQ", name = "w", descriptor = "Z")
    private boolean field1495 = true;

    @OriginalMember(owner = "TXSWXFHQ", name = "x", descriptor = "LILVDIPQT;")
    private class31 field1496 = new class31(-33684);

    @OriginalMember(owner = "TXSWXFHQ", name = "y", descriptor = "I")
    private int field1497 = 5;

    @OriginalMember(owner = "TXSWXFHQ", name = "D", descriptor = "LILVDIPQT;")
    private class31 field1502 = new class31(-33684);

    @OriginalMember(owner = "TXSWXFHQ", name = "G", descriptor = "[B")
    private byte[] field1505 = new byte[500];

    @OriginalMember(owner = "TXSWXFHQ", name = "K", descriptor = "Ljava/lang/String;")
    public String field1509 = "";

    @OriginalMember(owner = "TXSWXFHQ", name = "M", descriptor = "Z")
    private boolean field1511 = true;

    @OriginalMember(owner = "TXSWXFHQ", name = "N", descriptor = "I")
    private int field1512 = -838;

    @OriginalMember(owner = "TXSWXFHQ", name = "P", descriptor = "Z")
    private boolean field1514 = true;

    @OriginalMember(owner = "TXSWXFHQ", name = "R", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1516 = new CRC32();

    @OriginalMember(owner = "TXSWXFHQ", name = "k", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "TXSWXFHQ", name = "n", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "TXSWXFHQ", name = "u", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "TXSWXFHQ", name = "v", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "TXSWXFHQ", name = "z", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "TXSWXFHQ", name = "A", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "TXSWXFHQ", name = "C", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "TXSWXFHQ", name = "H", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "TXSWXFHQ", name = "I", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "TXSWXFHQ", name = "J", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "TXSWXFHQ", name = "L", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "TXSWXFHQ", name = "O", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "TXSWXFHQ", name = "B", descriptor = "J")
    private long field1500;

    @OriginalMember(owner = "TXSWXFHQ", name = "c", descriptor = "LEWBEDHEW;")
    private class18 field1475;

    @OriginalMember(owner = "TXSWXFHQ", name = "E", descriptor = "Lclient;")
    private client field1503;

    @OriginalMember(owner = "TXSWXFHQ", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field1481;

    @OriginalMember(owner = "TXSWXFHQ", name = "U", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1519;

    @OriginalMember(owner = "TXSWXFHQ", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field1487;

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "[B")
    private byte[] field1473;

    @OriginalMember(owner = "TXSWXFHQ", name = "q", descriptor = "[I")
    private int[] field1489;

    @OriginalMember(owner = "TXSWXFHQ", name = "s", descriptor = "[I")
    private int[] field1491;

    @OriginalMember(owner = "TXSWXFHQ", name = "F", descriptor = "[I")
    private int[] field1504;

    @OriginalMember(owner = "TXSWXFHQ", name = "Q", descriptor = "[I")
    private int[] field1515;

    @OriginalMember(owner = "TXSWXFHQ", name = "S", descriptor = "[I")
    private int[] field1517;

    @OriginalMember(owner = "TXSWXFHQ", name = "T", descriptor = "[I")
    private int[] field1518;

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(B)V")
    private final void method472(byte arg0) {
        if (arg0 != -62) {
            return;
        }
        class31 var2 = this.field1482;
        class18 var3;
        synchronized (this.field1482) {
            var3 = (class18) this.field1482.method331();
        }
        while (var3 != null) {
            this.field1477 = true;
            byte[] var4 = null;
            if (this.field1503.field230[0] != null) {
                var4 = this.field1503.field230[var3.field678 + 1].method559((byte) 5, var3.field679);
            }
            if (!this.method491(37477, var4, this.field1484[var3.field678][var3.field679], this.field1474[var3.field678][var3.field679])) {
                var4 = null;
            }
            class31 var5 = this.field1482;
            synchronized (this.field1482) {
                if (var4 == null) {
                    this.field1478.method329(var3);
                } else {
                    var3.field677 = var4;
                    class31 var6 = this.field1496;
                    synchronized (this.field1496) {
                        this.field1496.method329(var3);
                    }
                }
                var3 = (class18) this.field1482.method331();
            }
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(BBII)V")
    public final void method473(byte arg0, byte arg1, int arg2, int arg3) {
        if (this.field1503.field230[0] == null || this.field1484[arg2][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field1503.field230[arg2 + 1].method559((byte) 5, arg3);
        if (this.method491(37477, var5, this.field1484[arg2][arg3], this.field1474[arg2][arg3])) {
            return;
        }
        this.field1479[arg2][arg3] = arg1;
        if (arg0 != 4) {
            this.field1497 = 338;
        }
        if (arg1 > this.field1510) {
            this.field1510 = arg1;
        }
        this.field1483++;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "b", descriptor = "(B)V")
    private final void method474(byte arg0) {
        if (this.field1490 != arg0) {
            this.field1492 = -482;
        }
        this.field1506 = 0;
        this.field1507 = 0;
        for (class18 var2 = (class18) this.field1502.method332(); var2 != null; var2 = (class18) this.field1502.method334(-96)) {
            if (var2.field680) {
                this.field1506++;
            } else {
                this.field1507++;
            }
        }
        while (this.field1506 < 10) {
            class18 var3 = (class18) this.field1478.method331();
            if (var3 == null) {
                break;
            }
            if (this.field1479[var3.field678][var3.field679] != 0) {
                this.field1486++;
            }
            this.field1479[var3.field678][var3.field679] = 0;
            this.field1502.method329(var3);
            this.field1506++;
            this.method490(var3, true);
            this.field1477 = true;
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(BIII)I")
    public final int method475(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg2 << 8) + arg1;
        if (arg0 != 76) {
            return this.field1497;
        }
        for (int var6 = 0; var6 < this.field1515.length; var6++) {
            if (this.field1515[var6] == var5) {
                if (arg3 == 0) {
                    return this.field1504[var6];
                }
                return this.field1518[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(III)V")
    public final void method476(int arg0, int arg1, int arg2) {
        if (this.field1503.field230[0] == null || (this.field1484[arg1][arg2] == 0 || (this.field1479[arg1][arg2] == 0 || this.field1510 == 0))) {
            return;
        }
        class18 var4 = new class18();
        var4.field678 = arg1;
        var4.field679 = arg2;
        if (arg0 >= 0) {
            this.field1513 = -462;
        }
        var4.field680 = false;
        class31 var5 = this.field1480;
        synchronized (this.field1480) {
            this.field1480.method329(var4);
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "b", descriptor = "(I)V")
    private final void method477(int arg0) {
        if (arg0 != 0) {
            this.field1495 = !this.field1495;
        }
        try {
            int var2 = this.field1481.available();
            if (this.field1499 == 0 && var2 >= 6) {
                this.field1477 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1481.read(this.field1505, var3, 6 - var3)) {
                }
                int var4 = this.field1505[0] & 0xFF;
                int var5 = ((this.field1505[1] & 0xFF) << 8) + (this.field1505[2] & 0xFF);
                int var6 = ((this.field1505[3] & 0xFF) << 8) + (this.field1505[4] & 0xFF);
                int var7 = this.field1505[5] & 0xFF;
                this.field1475 = null;
                for (class18 var8 = (class18) this.field1502.method332(); var8 != null; var8 = (class18) this.field1502.method334(-96)) {
                    if (var8.field678 == var4 && var8.field679 == var5) {
                        this.field1475 = var8;
                    }
                    if (this.field1475 != null) {
                        var8.field676 = 0;
                    }
                }
                if (this.field1475 != null) {
                    this.field1494 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1475.field677 = null;
                        if (this.field1475.field680) {
                            class31 var9 = this.field1496;
                            synchronized (this.field1496) {
                                this.field1496.method329(this.field1475);
                            }
                        } else {
                            this.field1475.method471();
                        }
                        this.field1475 = null;
                    } else {
                        if (this.field1475.field677 == null && var7 == 0) {
                            this.field1475.field677 = new byte[var6];
                        }
                        if (this.field1475.field677 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1498 = var7 * 500;
                this.field1499 = 500;
                if (this.field1499 > var6 - var7 * 500) {
                    this.field1499 = var6 - var7 * 500;
                }
            }
            if (this.field1499 > 0 && var2 >= this.field1499) {
                this.field1477 = true;
                byte[] var10 = this.field1505;
                int var11 = 0;
                if (this.field1475 != null) {
                    var10 = this.field1475.field677;
                    var11 = this.field1498;
                }
                for (int var12 = 0; var12 < this.field1499; var12 += this.field1481.read(var10, var11 + var12, this.field1499 - var12)) {
                }
                if (this.field1499 + this.field1498 >= var10.length && this.field1475 != null) {
                    if (this.field1503.field230[0] != null) {
                        this.field1503.field230[this.field1475.field678 + 1].method560(var10.length, var10, this.field1475.field679, -356);
                    }
                    if (!this.field1475.field680 && this.field1475.field678 == 3) {
                        this.field1475.field680 = true;
                        this.field1475.field678 = 93;
                    }
                    if (this.field1475.field680) {
                        class31 var13 = this.field1496;
                        synchronized (this.field1496) {
                            this.field1496.method329(this.field1475);
                        }
                    } else {
                        this.field1475.method471();
                    }
                }
                this.field1499 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1487.close();
            } catch (Exception var15) {
            }
            this.field1487 = null;
            this.field1481 = null;
            this.field1519 = null;
            this.field1499 = 0;
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(II)V")
    public final void method478(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1484.length || arg1 < 0 || arg1 > this.field1484[arg0].length || this.field1484[arg0][arg1] == 0) {
            return;
        }
        class16 var3 = this.field1485;
        synchronized (this.field1485) {
            for (class18 var4 = (class18) this.field1485.method221(); var4 != null; var4 = (class18) this.field1485.method222(-96)) {
                if (var4.field678 == arg0 && var4.field679 == arg1) {
                    return;
                }
            }
            class18 var5 = new class18();
            var5.field678 = arg0;
            var5.field679 = arg1;
            var5.field680 = true;
            class31 var6 = this.field1482;
            synchronized (this.field1482) {
                this.field1482.method329(var5);
            }
            this.field1485.method219(var5);
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(ZI)I")
    public final int method479(boolean arg0, int arg1) {
        return arg0 ? 3 : this.field1473[arg1] & 0xFF;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(LCVNWKEAW;Lclient;)V")
    public final void method480(class7 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method180(var3[var4], null);
            int var27 = var26.length / 2;
            class62 var28 = new class62(-417, var26);
            this.field1484[var4] = new int[var27];
            this.field1479[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1484[var4][var29] = var28.method523();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method180(var5[var6], null);
            int var23 = var22.length / 4;
            class62 var24 = new class62(-417, var22);
            this.field1474[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1474[var6][var25] = var24.method526();
            }
        }
        byte[] var7 = arg0.method180("model_index", null);
        int var8 = this.field1484[0].length;
        this.field1473 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1473[var9] = var7[var9];
            } else {
                this.field1473[var9] = 0;
            }
        }
        byte[] var10 = arg0.method180("map_index", null);
        class62 var11 = new class62(-417, var10);
        int var12 = var10.length / 7;
        this.field1515 = new int[var12];
        this.field1504 = new int[var12];
        this.field1518 = new int[var12];
        this.field1489 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1515[var13] = var11.method523();
            this.field1504[var13] = var11.method523();
            this.field1518[var13] = var11.method523();
            this.field1489[var13] = var11.method521();
        }
        byte[] var14 = arg0.method180("anim_index", null);
        class62 var15 = new class62(-417, var14);
        int var16 = var14.length / 2;
        this.field1517 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1517[var17] = var15.method523();
        }
        byte[] var18 = arg0.method180("midi_index", null);
        class62 var19 = new class62(-417, var18);
        int var20 = var18.length;
        this.field1491 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1491[var21] = var19.method521();
        }
        this.field1503 = arg1;
        this.field1514 = true;
        this.field1503.method93(this, 2);
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "b", descriptor = "(II)Z")
    public final boolean method481(int arg0, int arg1) {
        if (arg1 != -47759) {
            this.field1497 = -206;
        }
        for (int var3 = 0; var3 < this.field1515.length; var3++) {
            if (this.field1518[var3] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "()V")
    public final void method482() {
        this.field1514 = false;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "b", descriptor = "(ZI)V")
    public final void method483(boolean arg0, int arg1) {
        int var3 = this.field1515.length;
        if (arg1 <= 0) {
            this.field1497 = 299;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1489[var4] != 0) {
                this.method473((byte) 4, (byte) 2, 3, this.field1518[var4]);
                this.method473((byte) 4, (byte) 2, 3, this.field1504[var4]);
            }
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(Z)V")
    public final void method484(boolean arg0) {
        class31 var2 = this.field1480;
        synchronized (this.field1480) {
            this.field1480.method336();
        }
        if (!arg0) {
            this.field1495 = !this.field1495;
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "b", descriptor = "()LEWBEDHEW;")
    public final class18 method485() {
        class31 var1 = this.field1496;
        class18 var2;
        synchronized (this.field1496) {
            var2 = (class18) this.field1496.method331();
        }
        if (var2 == null) {
            return null;
        }
        class16 var3 = this.field1485;
        synchronized (this.field1485) {
            var2.method215();
        }
        if (var2.field677 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field677));
            while (true) {
                if (this.field1476.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1476, var4, this.field1476.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field677 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field677[var7] = this.field1476[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "c", descriptor = "(II)I")
    public final int method486(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1484[arg1].length;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "c", descriptor = "()I")
    public final int method487() {
        class16 var1 = this.field1485;
        synchronized (this.field1485) {
            return this.field1485.method223();
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "c", descriptor = "(B)I")
    public final int method488(byte arg0) {
        if (this.field1488 != arg0) {
            this.field1513 = 355;
        }
        return this.field1517.length;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(I)V")
    public final void method489(int arg0) {
        this.method478(0, arg0);
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(LEWBEDHEW;Z)V")
    private final void method490(class18 arg0, boolean arg1) {
        if (!arg1) {
            this.field1512 = 36;
        }
        try {
            if (this.field1487 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1500 < 4000L) {
                    return;
                }
                this.field1500 = var3;
                this.field1487 = this.field1503.method135(client.field189 + 43594);
                this.field1481 = this.field1487.getInputStream();
                this.field1519 = this.field1487.getOutputStream();
                this.field1519.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1481.read();
                }
                this.field1494 = 0;
            }
            this.field1505[0] = (byte) arg0.field678;
            this.field1505[1] = (byte) (arg0.field679 >> 8);
            this.field1505[2] = (byte) arg0.field679;
            if (arg0.field680) {
                this.field1505[3] = 2;
            } else if (this.field1503.field179) {
                this.field1505[3] = 0;
            } else {
                this.field1505[3] = 1;
            }
            this.field1519.write(this.field1505, 0, 4);
            this.field1493 = 0;
            this.field1501 = -10000;
        } catch (IOException var8) {
            try {
                this.field1487.close();
            } catch (Exception var7) {
            }
            this.field1487 = null;
            this.field1481 = null;
            this.field1519 = null;
            this.field1499 = 0;
            this.field1501++;
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1514) {
                this.field1508++;
                byte var1 = 20;
                if (this.field1510 == 0 && this.field1503.field230[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1477 = true;
                for (int var2 = 0; var2 < 100 && this.field1477; var2++) {
                    this.field1477 = false;
                    this.method472((byte) -62);
                    this.method474((byte) -7);
                    if (this.field1506 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method493(0);
                    if (this.field1481 != null) {
                        this.method477(0);
                    }
                }
                boolean var3 = false;
                for (class18 var4 = (class18) this.field1502.method332(); var4 != null; var4 = (class18) this.field1502.method334(-96)) {
                    if (var4.field680) {
                        var3 = true;
                        var4.field676++;
                        if (var4.field676 > 50) {
                            var4.field676 = 0;
                            this.method490(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (class18 var5 = (class18) this.field1502.method332(); var5 != null; var5 = (class18) this.field1502.method334(-96)) {
                        var3 = true;
                        var5.field676++;
                        if (var5.field676 > 50) {
                            var5.field676 = 0;
                            this.method490(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field1494++;
                    if (this.field1494 > 750) {
                        try {
                            this.field1487.close();
                        } catch (Exception var8) {
                        }
                        this.field1487 = null;
                        this.field1481 = null;
                        this.field1519 = null;
                        this.field1499 = 0;
                    }
                } else {
                    this.field1494 = 0;
                    this.field1509 = "";
                }
                if (this.field1503.field179 && this.field1487 != null && this.field1519 != null && (this.field1510 > 0 || this.field1503.field230[0] == null)) {
                    this.field1493++;
                    if (this.field1493 > 500) {
                        this.field1493 = 0;
                        this.field1505[0] = 0;
                        this.field1505[1] = 0;
                        this.field1505[2] = 0;
                        this.field1505[3] = 10;
                        try {
                            this.field1519.write(this.field1505, 0, 4);
                        } catch (IOException var7) {
                            this.field1494 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "a", descriptor = "(I[BII)Z")
    private final boolean method491(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        if (arg0 != 37477) {
            throw new NullPointerException();
        }
        this.field1516.reset();
        this.field1516.update(arg1, 0, var5);
        int var7 = (int) this.field1516.getValue();
        if (arg2 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "d", descriptor = "(II)Z")
    public final boolean method492(int arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return this.field1491[arg0] == 1;
    }

    @OriginalMember(owner = "TXSWXFHQ", name = "c", descriptor = "(I)V")
    private final void method493(int arg0) {
        if (arg0 != 0) {
            return;
        }
        while (this.field1506 == 0) {
            if (this.field1507 >= 10 || this.field1510 == 0) {
                return;
            }
            class31 var2 = this.field1480;
            class18 var3;
            synchronized (this.field1480) {
                var3 = (class18) this.field1480.method331();
            }
            while (var3 != null) {
                if (this.field1479[var3.field678][var3.field679] != 0) {
                    this.field1479[var3.field678][var3.field679] = 0;
                    this.field1502.method329(var3);
                    this.method490(var3, true);
                    this.field1477 = true;
                    if (this.field1486 < this.field1483) {
                        this.field1486++;
                    }
                    this.field1509 = "Loading extra files - " + this.field1486 * 100 / this.field1483 + "%";
                    this.field1507++;
                    if (this.field1507 == 10) {
                        return;
                    }
                }
                class31 var4 = this.field1480;
                synchronized (this.field1480) {
                    var3 = (class18) this.field1480.method331();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1479[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1510) {
                        var6[var8] = 0;
                        class18 var9 = new class18();
                        var9.field678 = var5;
                        var9.field679 = var8;
                        var9.field680 = false;
                        this.field1502.method329(var9);
                        this.method490(var9, true);
                        this.field1477 = true;
                        if (this.field1486 < this.field1483) {
                            this.field1486++;
                        }
                        this.field1509 = "Loading extra files - " + this.field1486 * 100 / this.field1483 + "%";
                        this.field1507++;
                        if (this.field1507 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1510--;
        }
    }
}
