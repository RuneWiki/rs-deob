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

@OriginalClass("client!VYNRIVYZ")
public class class62 extends class11 implements Runnable {

    @OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "LELLPUVEP;")
    private class13 field1576 = new class13((byte) 5);

    @OriginalMember(owner = "client!VYNRIVYZ", name = "d", descriptor = "Z")
    private boolean field1578 = true;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "i", descriptor = "LFEIPMYNH;")
    private class15 field1583 = new class15(true);

    @OriginalMember(owner = "client!VYNRIVYZ", name = "j", descriptor = "I")
    private int field1584 = 2;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "l", descriptor = "Ljava/lang/String;")
    public String field1586 = "";

    @OriginalMember(owner = "client!VYNRIVYZ", name = "p", descriptor = "LFEIPMYNH;")
    private class15 field1590 = new class15(true);

    @OriginalMember(owner = "client!VYNRIVYZ", name = "q", descriptor = "Z")
    private boolean field1591 = false;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "s", descriptor = "[[I")
    private int[][] field1593 = new int[4][];

    @OriginalMember(owner = "client!VYNRIVYZ", name = "u", descriptor = "Z")
    private boolean field1595 = true;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "w", descriptor = "LFEIPMYNH;")
    private class15 field1597 = new class15(true);

    @OriginalMember(owner = "client!VYNRIVYZ", name = "y", descriptor = "[B")
    private byte[] field1599 = new byte[500];

    @OriginalMember(owner = "client!VYNRIVYZ", name = "z", descriptor = "Z")
    private boolean field1600 = true;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "A", descriptor = "LFEIPMYNH;")
    private class15 field1601 = new class15(true);

    @OriginalMember(owner = "client!VYNRIVYZ", name = "D", descriptor = "B")
    private byte field1604 = -33;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "H", descriptor = "[[B")
    private byte[][] field1608 = new byte[4][];

    @OriginalMember(owner = "client!VYNRIVYZ", name = "I", descriptor = "[[I")
    private int[][] field1609 = new int[4][];

    @OriginalMember(owner = "client!VYNRIVYZ", name = "J", descriptor = "Z")
    private boolean field1610 = false;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "K", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1611 = new CRC32();

    @OriginalMember(owner = "client!VYNRIVYZ", name = "L", descriptor = "[B")
    private byte[] field1612 = new byte[65000];

    @OriginalMember(owner = "client!VYNRIVYZ", name = "M", descriptor = "I")
    private int field1613 = -964;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "S", descriptor = "I")
    private int field1619 = -198;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "U", descriptor = "I")
    private int field1621 = -341;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "V", descriptor = "LFEIPMYNH;")
    private class15 field1622 = new class15(true);

    @OriginalMember(owner = "client!VYNRIVYZ", name = "f", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "g", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "m", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "o", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "v", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "B", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "E", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "F", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "G", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "R", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "T", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "Q", descriptor = "J")
    private long field1617;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "n", descriptor = "LIIWNEACY;")
    private class24 field1588;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "e", descriptor = "Lclient;")
    private client field1579;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1577;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "C", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1603;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field1592;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "h", descriptor = "[B")
    private byte[] field1582;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "k", descriptor = "[I")
    private int[] field1585;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "t", descriptor = "[I")
    private int[] field1594;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "x", descriptor = "[I")
    private int[] field1598;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "N", descriptor = "[I")
    private int[] field1614;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "O", descriptor = "[I")
    private int[] field1615;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "P", descriptor = "[I")
    private int[] field1616;

    @OriginalMember(owner = "client!VYNRIVYZ", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1578) {
                this.field1605++;
                byte var1 = 20;
                if (this.field1618 == 0 && this.field1579.field282[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1610 = true;
                for (int var2 = 0; var2 < 100 && this.field1610; var2++) {
                    this.field1610 = false;
                    this.method540(true);
                    this.method547(5);
                    if (this.field1580 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method550(false);
                    if (this.field1577 != null) {
                        this.method545(true);
                    }
                }
                boolean var3 = false;
                for (class24 var4 = (class24) this.field1622.method300(); var4 != null; var4 = (class24) this.field1622.method302(true)) {
                    if (var4.field836) {
                        var3 = true;
                        var4.field835++;
                        if (var4.field835 > 50) {
                            var4.field835 = 0;
                            this.method557(var4, this.field1621);
                        }
                    }
                }
                if (!var3) {
                    for (class24 var5 = (class24) this.field1622.method300(); var5 != null; var5 = (class24) this.field1622.method302(true)) {
                        var3 = true;
                        var5.field835++;
                        if (var5.field835 > 50) {
                            var5.field835 = 0;
                            this.method557(var5, this.field1621);
                        }
                    }
                }
                if (var3) {
                    this.field1596++;
                    if (this.field1596 > 750) {
                        try {
                            this.field1592.close();
                        } catch (Exception var8) {
                        }
                        this.field1592 = null;
                        this.field1577 = null;
                        this.field1603 = null;
                        this.field1607 = 0;
                    }
                } else {
                    this.field1596 = 0;
                    this.field1586 = "";
                }
                if (this.field1579.field322 && this.field1592 != null && this.field1603 != null && (this.field1618 > 0 || this.field1579.field282[0] == null)) {
                    this.field1620++;
                    if (this.field1620 > 500) {
                        this.field1620 = 0;
                        this.field1599[0] = 0;
                        this.field1599[1] = 0;
                        this.field1599[2] = 0;
                        this.field1599[3] = 10;
                        try {
                            this.field1603.write(this.field1599, 0, 4);
                        } catch (IOException var7) {
                            this.field1596 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(I)V")
    public final void method277(int arg0) {
        this.method556(0, arg0);
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(II)I")
    public final int method539(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1595 = !this.field1595;
        }
        return this.field1582[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(Z)V")
    private final void method540(boolean arg0) {
        if (!arg0) {
            return;
        }
        class15 var2 = this.field1590;
        class24 var3;
        synchronized (this.field1590) {
            var3 = (class24) this.field1590.method299();
        }
        while (var3 != null) {
            this.field1610 = true;
            byte[] var4 = null;
            if (this.field1579.field282[0] != null) {
                var4 = this.field1579.field282[var3.field837 + 1].method514(7, var3.field838);
            }
            if (!this.method555(this.field1593[var3.field837][var3.field838], var4, this.field1609[var3.field837][var3.field838], false)) {
                var4 = null;
            }
            class15 var5 = this.field1590;
            synchronized (this.field1590) {
                if (var4 == null) {
                    this.field1597.method297(var3);
                } else {
                    var3.field834 = var4;
                    class15 var6 = this.field1601;
                    synchronized (this.field1601) {
                        this.field1601.method297(var3);
                    }
                }
                var3 = (class24) this.field1590.method299();
            }
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(IZII)I")
    public final int method541(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = (arg2 << 8) + arg3;
        if (arg1) {
            return 1;
        }
        for (int var6 = 0; var6 < this.field1616.length; var6++) {
            if (this.field1616[var6] == var5) {
                if (arg0 == 0) {
                    return this.field1594[var6];
                }
                return this.field1615[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(B)I")
    public final int method542(byte arg0) {
        if (this.field1604 != arg0) {
            this.field1595 = !this.field1595;
        }
        return this.field1598.length;
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "(II)Z")
    public final boolean method543(int arg0, int arg1) {
        if (arg1 != 454) {
            this.field1591 = !this.field1591;
        }
        return this.field1585[arg0] == 1;
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "(II)I")
    public final int method544(int arg0, int arg1) {
        if (arg1 < this.field1584 || arg1 > this.field1584) {
            this.field1591 = !this.field1591;
        }
        return this.field1593[arg0].length;
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "(Z)V")
    private final void method545(boolean arg0) {
        if (!arg0) {
            this.field1619 = 234;
        }
        try {
            int var2 = this.field1577.available();
            if (this.field1607 == 0 && var2 >= 6) {
                this.field1610 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1577.read(this.field1599, var3, 6 - var3)) {
                }
                int var4 = this.field1599[0] & 0xFF;
                int var5 = ((this.field1599[1] & 0xFF) << 8) + (this.field1599[2] & 0xFF);
                int var6 = ((this.field1599[3] & 0xFF) << 8) + (this.field1599[4] & 0xFF);
                int var7 = this.field1599[5] & 0xFF;
                this.field1588 = null;
                for (class24 var8 = (class24) this.field1622.method300(); var8 != null; var8 = (class24) this.field1622.method302(true)) {
                    if (var8.field837 == var4 && var8.field838 == var5) {
                        this.field1588 = var8;
                    }
                    if (this.field1588 != null) {
                        var8.field835 = 0;
                    }
                }
                if (this.field1588 != null) {
                    this.field1596 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1588.field834 = null;
                        if (this.field1588.field836) {
                            class15 var9 = this.field1601;
                            synchronized (this.field1601) {
                                this.field1601.method297(this.field1588);
                            }
                        } else {
                            this.field1588.method518();
                        }
                        this.field1588 = null;
                    } else {
                        if (this.field1588.field834 == null && var7 == 0) {
                            this.field1588.field834 = new byte[var6];
                        }
                        if (this.field1588.field834 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1606 = var7 * 500;
                this.field1607 = 500;
                if (this.field1607 > var6 - var7 * 500) {
                    this.field1607 = var6 - var7 * 500;
                }
            }
            if (this.field1607 > 0 && var2 >= this.field1607) {
                this.field1610 = true;
                byte[] var10 = this.field1599;
                int var11 = 0;
                if (this.field1588 != null) {
                    var10 = this.field1588.field834;
                    var11 = this.field1606;
                }
                for (int var12 = 0; var12 < this.field1607; var12 += this.field1577.read(var10, var11 + var12, this.field1607 - var12)) {
                }
                if (this.field1607 + this.field1606 >= var10.length && this.field1588 != null) {
                    if (this.field1579.field282[0] != null) {
                        this.field1579.field282[this.field1588.field837 + 1].method515(this.field1588.field838, var10, var10.length, (byte) 1);
                    }
                    if (!this.field1588.field836 && this.field1588.field837 == 3) {
                        this.field1588.field836 = true;
                        this.field1588.field837 = 93;
                    }
                    if (this.field1588.field836) {
                        class15 var13 = this.field1601;
                        synchronized (this.field1601) {
                            this.field1601.method297(this.field1588);
                        }
                    } else {
                        this.field1588.method518();
                    }
                }
                this.field1607 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1592.close();
            } catch (Exception var15) {
            }
            this.field1592 = null;
            this.field1577 = null;
            this.field1603 = null;
            this.field1607 = 0;
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "d", descriptor = "(II)Z")
    public final boolean method546(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1616.length; var3++) {
            if (this.field1615[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "(I)V")
    private final void method547(int arg0) {
        this.field1580 = 0;
        this.field1581 = 0;
        class24 var2 = (class24) this.field1622.method300();
        if (arg0 < 5 || arg0 > 5) {
            this.field1613 = -461;
        }
        while (var2 != null) {
            if (var2.field836) {
                this.field1580++;
            } else {
                this.field1581++;
            }
            var2 = (class24) this.field1622.method302(true);
        }
        while (this.field1580 < 10) {
            class24 var3 = (class24) this.field1597.method299();
            if (var3 == null) {
                break;
            }
            if (this.field1608[var3.field837][var3.field838] != 0) {
                this.field1587++;
            }
            this.field1608[var3.field837][var3.field838] = 0;
            this.field1622.method297(var3);
            this.field1580++;
            this.method557(var3, this.field1621);
            this.field1610 = true;
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(IBII)V")
    public final void method548(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field1579.field282[0] == null || this.field1593[arg3][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field1579.field282[arg3 + 1].method514(7, arg0);
        if (arg2 >= 0) {
            this.field1613 = 297;
        }
        if (this.method555(this.field1593[arg3][arg0], var5, this.field1609[arg3][arg0], false)) {
            return;
        }
        this.field1608[arg3][arg0] = arg1;
        if (arg1 > this.field1618) {
            this.field1618 = arg1;
        }
        this.field1602++;
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(IIB)V")
    public final void method549(int arg0, int arg1, byte arg2) {
        if (this.field1579.field282[0] == null || (this.field1593[arg0][arg1] == 0 || (this.field1608[arg0][arg1] == 0 || this.field1618 == 0))) {
            return;
        }
        class24 var4 = new class24();
        if (arg2 != -23) {
            return;
        }
        var4.field837 = arg0;
        var4.field838 = arg1;
        var4.field836 = false;
        class15 var5 = this.field1583;
        synchronized (this.field1583) {
            this.field1583.method297(var4);
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "(Z)V")
    private final void method550(boolean arg0) {
        if (arg0) {
            return;
        }
        while (this.field1580 == 0) {
            if (this.field1581 >= 10 || this.field1618 == 0) {
                return;
            }
            class15 var2 = this.field1583;
            class24 var3;
            synchronized (this.field1583) {
                var3 = (class24) this.field1583.method299();
            }
            while (var3 != null) {
                if (this.field1608[var3.field837][var3.field838] != 0) {
                    this.field1608[var3.field837][var3.field838] = 0;
                    this.field1622.method297(var3);
                    this.method557(var3, this.field1621);
                    this.field1610 = true;
                    if (this.field1587 < this.field1602) {
                        this.field1587++;
                    }
                    this.field1586 = "Loading extra files - " + this.field1587 * 100 / this.field1602 + "%";
                    this.field1581++;
                    if (this.field1581 == 10) {
                        return;
                    }
                }
                class15 var4 = this.field1583;
                synchronized (this.field1583) {
                    var3 = (class24) this.field1583.method299();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1608[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1618) {
                        var6[var8] = 0;
                        class24 var9 = new class24();
                        var9.field837 = var5;
                        var9.field838 = var8;
                        var9.field836 = false;
                        this.field1622.method297(var9);
                        this.method557(var9, this.field1621);
                        this.field1610 = true;
                        if (this.field1587 < this.field1602) {
                            this.field1587++;
                        }
                        this.field1586 = "Loading extra files - " + this.field1587 * 100 / this.field1602 + "%";
                        this.field1581++;
                        if (this.field1581 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1618--;
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "()LIIWNEACY;")
    public final class24 method551() {
        class15 var1 = this.field1601;
        class24 var2;
        synchronized (this.field1601) {
            var2 = (class24) this.field1601.method299();
        }
        if (var2 == null) {
            return null;
        }
        class13 var3 = this.field1576;
        synchronized (this.field1576) {
            var2.method320();
        }
        if (var2.field834 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field834));
            while (true) {
                if (this.field1612.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1612, var4, this.field1612.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field834 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field834[var7] = this.field1612[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "()I")
    public final int method552() {
        class13 var1 = this.field1576;
        synchronized (this.field1576) {
            return this.field1576.method284();
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(LSMIVAFST;Lclient;)V")
    public final void method553(class52 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method512(var3[var4], null);
            int var27 = var26.length / 2;
            class7 var28 = new class7(var26, (byte) 3);
            this.field1593[var4] = new int[var27];
            this.field1608[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1593[var4][var29] = var28.method49();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method512(var5[var6], null);
            int var23 = var22.length / 4;
            class7 var24 = new class7(var22, (byte) 3);
            this.field1609[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1609[var6][var25] = var24.method52();
            }
        }
        byte[] var7 = arg0.method512("model_index", null);
        int var8 = this.field1593[0].length;
        this.field1582 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1582[var9] = var7[var9];
            } else {
                this.field1582[var9] = 0;
            }
        }
        byte[] var10 = arg0.method512("map_index", null);
        class7 var11 = new class7(var10, (byte) 3);
        int var12 = var10.length / 7;
        this.field1616 = new int[var12];
        this.field1594 = new int[var12];
        this.field1615 = new int[var12];
        this.field1614 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1616[var13] = var11.method49();
            this.field1594[var13] = var11.method49();
            this.field1615[var13] = var11.method49();
            this.field1614[var13] = var11.method47();
        }
        byte[] var14 = arg0.method512("anim_index", null);
        class7 var15 = new class7(var14, (byte) 3);
        int var16 = var14.length / 2;
        this.field1598 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1598[var17] = var15.method49();
        }
        byte[] var18 = arg0.method512("midi_index", null);
        class7 var19 = new class7(var18, (byte) 3);
        int var20 = var18.length;
        this.field1585 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1585[var21] = var19.method47();
        }
        this.field1579 = arg1;
        this.field1578 = true;
        this.field1579.method164(this, 2);
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "(I)V")
    public final void method554(int arg0) {
        class15 var2 = this.field1583;
        synchronized (this.field1583) {
            this.field1583.method304();
        }
        if (arg0 < 0 || arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(I[BIZ)Z")
    private final boolean method555(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field1591 = !this.field1591;
        }
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field1611.reset();
        this.field1611.update(arg1, 0, var5);
        int var7 = (int) this.field1611.getValue();
        if (arg0 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "e", descriptor = "(II)V")
    public final void method556(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1593.length || arg1 < 0 || arg1 > this.field1593[arg0].length || this.field1593[arg0][arg1] == 0) {
            return;
        }
        class13 var3 = this.field1576;
        synchronized (this.field1576) {
            for (class24 var4 = (class24) this.field1576.method282(); var4 != null; var4 = (class24) this.field1576.method283(true)) {
                if (var4.field837 == arg0 && var4.field838 == arg1) {
                    return;
                }
            }
            class24 var5 = new class24();
            var5.field837 = arg0;
            var5.field838 = arg1;
            var5.field836 = true;
            class15 var6 = this.field1590;
            synchronized (this.field1590) {
                this.field1590.method297(var5);
            }
            this.field1576.method280(var5);
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(LIIWNEACY;I)V")
    private final void method557(class24 arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1600 = !this.field1600;
        }
        try {
            if (this.field1592 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1617 < 4000L) {
                    return;
                }
                this.field1617 = var3;
                this.field1592 = this.field1579.method176(client.field607 + 43594);
                this.field1577 = this.field1592.getInputStream();
                this.field1603 = this.field1592.getOutputStream();
                this.field1603.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1577.read();
                }
                this.field1596 = 0;
            }
            this.field1599[0] = (byte) arg0.field837;
            this.field1599[1] = (byte) (arg0.field838 >> 8);
            this.field1599[2] = (byte) arg0.field838;
            if (arg0.field836) {
                this.field1599[3] = 2;
            } else if (this.field1579.field322) {
                this.field1599[3] = 0;
            } else {
                this.field1599[3] = 1;
            }
            this.field1603.write(this.field1599, 0, 4);
            this.field1620 = 0;
            this.field1589 = -10000;
        } catch (IOException var8) {
            try {
                this.field1592.close();
            } catch (Exception var7) {
            }
            this.field1592 = null;
            this.field1577 = null;
            this.field1603 = null;
            this.field1607 = 0;
            this.field1589++;
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(IZ)V")
    public final void method558(int arg0, boolean arg1) {
        int var3 = this.field1616.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1614[var4] != 0) {
                this.method548(this.field1615[var4], (byte) 2, -198, 3);
                this.method548(this.field1594[var4], (byte) 2, -198, 3);
            }
        }
        if (arg0 == 11404) {
            ;
        }
    }

    @OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "()V")
    public final void method559() {
        this.field1578 = false;
    }
}
