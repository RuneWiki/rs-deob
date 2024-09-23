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

@OriginalClass("XZFDFADG")
public class class67 extends class7 implements Runnable {

    @OriginalMember(owner = "XZFDFADG", name = "b", descriptor = "LVYBZTNTY;")
    private class57 field1638 = new class57((byte) 55);

    @OriginalMember(owner = "XZFDFADG", name = "f", descriptor = "[B")
    private byte[] field1642 = new byte[65000];

    @OriginalMember(owner = "XZFDFADG", name = "h", descriptor = "[[I")
    private int[][] field1644 = new int[4][];

    @OriginalMember(owner = "XZFDFADG", name = "i", descriptor = "LVYBZTNTY;")
    private class57 field1645 = new class57((byte) 55);

    @OriginalMember(owner = "XZFDFADG", name = "m", descriptor = "LVYBZTNTY;")
    private class57 field1649 = new class57((byte) 55);

    @OriginalMember(owner = "XZFDFADG", name = "q", descriptor = "B")
    private byte field1653 = 1;

    @OriginalMember(owner = "XZFDFADG", name = "r", descriptor = "[[B")
    private byte[][] field1654 = new byte[4][];

    @OriginalMember(owner = "XZFDFADG", name = "s", descriptor = "[B")
    private byte[] field1655 = new byte[500];

    @OriginalMember(owner = "XZFDFADG", name = "u", descriptor = "I")
    private int field1657 = -459;

    @OriginalMember(owner = "XZFDFADG", name = "v", descriptor = "Z")
    private boolean field1658 = false;

    @OriginalMember(owner = "XZFDFADG", name = "x", descriptor = "Ljava/lang/String;")
    public String field1660 = "";

    @OriginalMember(owner = "XZFDFADG", name = "A", descriptor = "LVYBZTNTY;")
    private class57 field1663 = new class57((byte) 55);

    @OriginalMember(owner = "XZFDFADG", name = "C", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1665 = new CRC32();

    @OriginalMember(owner = "XZFDFADG", name = "D", descriptor = "Z")
    private boolean field1666 = false;

    @OriginalMember(owner = "XZFDFADG", name = "G", descriptor = "I")
    private int field1669 = 5;

    @OriginalMember(owner = "XZFDFADG", name = "K", descriptor = "LPNEYGONI;")
    private class37 field1673 = new class37((byte) 33);

    @OriginalMember(owner = "XZFDFADG", name = "M", descriptor = "[[I")
    private int[][] field1675 = new int[4][];

    @OriginalMember(owner = "XZFDFADG", name = "N", descriptor = "LVYBZTNTY;")
    private class57 field1676 = new class57((byte) 55);

    @OriginalMember(owner = "XZFDFADG", name = "Q", descriptor = "Z")
    private boolean field1679 = true;

    @OriginalMember(owner = "XZFDFADG", name = "c", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "XZFDFADG", name = "d", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "XZFDFADG", name = "k", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "XZFDFADG", name = "l", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "XZFDFADG", name = "n", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "XZFDFADG", name = "t", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "XZFDFADG", name = "y", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "XZFDFADG", name = "B", descriptor = "I")
    private int field1664;

    @OriginalMember(owner = "XZFDFADG", name = "E", descriptor = "I")
    private int field1667;

    @OriginalMember(owner = "XZFDFADG", name = "I", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "XZFDFADG", name = "J", descriptor = "I")
    private int field1672;

    @OriginalMember(owner = "XZFDFADG", name = "o", descriptor = "J")
    private long field1651;

    @OriginalMember(owner = "XZFDFADG", name = "z", descriptor = "LRPOURQXY;")
    private class45 field1662;

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "Lclient;")
    private client field1637;

    @OriginalMember(owner = "XZFDFADG", name = "O", descriptor = "Ljava/io/InputStream;")
    private InputStream field1677;

    @OriginalMember(owner = "XZFDFADG", name = "w", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1659;

    @OriginalMember(owner = "XZFDFADG", name = "L", descriptor = "Ljava/net/Socket;")
    private Socket field1674;

    @OriginalMember(owner = "XZFDFADG", name = "e", descriptor = "[B")
    private byte[] field1641;

    @OriginalMember(owner = "XZFDFADG", name = "g", descriptor = "[I")
    private int[] field1643;

    @OriginalMember(owner = "XZFDFADG", name = "j", descriptor = "[I")
    private int[] field1646;

    @OriginalMember(owner = "XZFDFADG", name = "p", descriptor = "[I")
    private int[] field1652;

    @OriginalMember(owner = "XZFDFADG", name = "F", descriptor = "[I")
    private int[] field1668;

    @OriginalMember(owner = "XZFDFADG", name = "H", descriptor = "[I")
    private int[] field1670;

    @OriginalMember(owner = "XZFDFADG", name = "P", descriptor = "[I")
    private int[] field1678;

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "()LRPOURQXY;")
    public final class45 method557() {
        class57 var1 = this.field1645;
        class45 var2;
        synchronized (this.field1645) {
            var2 = (class45) this.field1645.method518();
        }
        if (var2 == null) {
            return null;
        }
        class37 var3 = this.field1673;
        synchronized (this.field1673) {
            var2.method384();
        }
        if (var2.field1420 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1420));
            while (true) {
                if (this.field1642.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1642, var4, this.field1642.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1420 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1420[var7] = this.field1642[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(II)Z")
    public final boolean method558(int arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1678[arg0] == 1;
    }

    @OriginalMember(owner = "XZFDFADG", name = "b", descriptor = "(I)V")
    private final void method559(int arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field1677.available();
            if (this.field1648 == 0 && var3 >= 6) {
                this.field1666 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1677.read(this.field1655, var4, 6 - var4)) {
                }
                int var5 = this.field1655[0] & 0xFF;
                int var6 = ((this.field1655[1] & 0xFF) << 8) + (this.field1655[2] & 0xFF);
                int var7 = ((this.field1655[3] & 0xFF) << 8) + (this.field1655[4] & 0xFF);
                int var8 = this.field1655[5] & 0xFF;
                this.field1662 = null;
                for (class45 var9 = (class45) this.field1638.method519(); var9 != null; var9 = (class45) this.field1638.method521(5)) {
                    if (var9.field1421 == var5 && var9.field1419 == var6) {
                        this.field1662 = var9;
                    }
                    if (this.field1662 != null) {
                        var9.field1418 = 0;
                    }
                }
                if (this.field1662 != null) {
                    this.field1672 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1662.field1420 = null;
                        if (this.field1662.field1422) {
                            class57 var10 = this.field1645;
                            synchronized (this.field1645) {
                                this.field1645.method516(this.field1662);
                            }
                        } else {
                            this.field1662.method19();
                        }
                        this.field1662 = null;
                    } else {
                        if (this.field1662.field1420 == null && var8 == 0) {
                            this.field1662.field1420 = new byte[var7];
                        }
                        if (this.field1662.field1420 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1647 = var8 * 500;
                this.field1648 = 500;
                if (this.field1648 > var7 - var8 * 500) {
                    this.field1648 = var7 - var8 * 500;
                }
            }
            if (this.field1648 > 0 && var3 >= this.field1648) {
                this.field1666 = true;
                byte[] var11 = this.field1655;
                int var12 = 0;
                if (this.field1662 != null) {
                    var11 = this.field1662.field1420;
                    var12 = this.field1647;
                }
                for (int var13 = 0; var13 < this.field1648; var13 += this.field1677.read(var11, var12 + var13, this.field1648 - var13)) {
                }
                if (this.field1648 + this.field1647 >= var11.length && this.field1662 != null) {
                    if (this.field1637.field481[0] != null) {
                        this.field1637.field481[this.field1662.field1421 + 1].method550(this.field1662.field1419, var11, (byte) 7, var11.length);
                    }
                    if (!this.field1662.field1422 && this.field1662.field1421 == 3) {
                        this.field1662.field1422 = true;
                        this.field1662.field1421 = 93;
                    }
                    if (this.field1662.field1422) {
                        class57 var14 = this.field1645;
                        synchronized (this.field1645) {
                            this.field1645.method516(this.field1662);
                        }
                    } else {
                        this.field1662.method19();
                    }
                }
                this.field1648 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1674.close();
            } catch (Exception var16) {
            }
            this.field1674 = null;
            this.field1677 = null;
            this.field1659 = null;
            this.field1648 = 0;
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(ZZ)V")
    public final void method560(boolean arg0, boolean arg1) {
        int var3 = this.field1652.length;
        if (arg1) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1670[var4] != 0) {
                this.method569(3, (byte) 2, 0, this.field1643[var4]);
                this.method569(3, (byte) 2, 0, this.field1646[var4]);
            }
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(IIII)I")
    public final int method561(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg2 << 8) + arg0;
        for (int var6 = 0; var6 < this.field1652.length; var6++) {
            if (this.field1652[var6] == var5) {
                if (arg3 == 0) {
                    return this.field1646[var6];
                }
                return this.field1643[var6];
            }
        }
        return arg1 == 22558 ? -1 : this.field1657;
    }

    @OriginalMember(owner = "XZFDFADG", name = "b", descriptor = "(II)I")
    public final int method562(int arg0, int arg1) {
        return arg1 <= 0 ? 1 : this.field1641[arg0] & 0xFF;
    }

    @OriginalMember(owner = "XZFDFADG", name = "c", descriptor = "(II)I")
    public final int method563(int arg0, int arg1) {
        int var3 = 50 / arg1;
        return this.field1644[arg0].length;
    }

    @OriginalMember(owner = "XZFDFADG", name = "c", descriptor = "(I)I")
    public final int method564(int arg0) {
        int var2 = 40 / arg0;
        return this.field1668.length;
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "([BIII)Z")
    private final boolean method565(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        if (arg2 != 3) {
            throw new NullPointerException();
        }
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field1665.reset();
        this.field1665.update(arg0, 0, var5);
        int var7 = (int) this.field1665.getValue();
        if (arg1 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(B)V")
    private final void method566(byte arg0) {
        if (arg0 != 1) {
            this.field1658 = !this.field1658;
        }
        while (this.field1639 == 0) {
            if (this.field1640 >= 10 || this.field1656 == 0) {
                return;
            }
            class57 var2 = this.field1676;
            class45 var3;
            synchronized (this.field1676) {
                var3 = (class45) this.field1676.method518();
            }
            while (var3 != null) {
                if (this.field1654[var3.field1421][var3.field1419] != 0) {
                    this.field1654[var3.field1421][var3.field1419] = 0;
                    this.field1638.method516(var3);
                    this.method575((byte) 9, var3);
                    this.field1666 = true;
                    if (this.field1650 < this.field1664) {
                        this.field1650++;
                    }
                    this.field1660 = "Loading extra files - " + this.field1650 * 100 / this.field1664 + "%";
                    this.field1640++;
                    if (this.field1640 == 10) {
                        return;
                    }
                }
                class57 var4 = this.field1676;
                synchronized (this.field1676) {
                    var3 = (class45) this.field1676.method518();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1654[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1656) {
                        var6[var8] = 0;
                        class45 var9 = new class45();
                        var9.field1421 = var5;
                        var9.field1419 = var8;
                        var9.field1422 = false;
                        this.field1638.method516(var9);
                        this.method575((byte) 9, var9);
                        this.field1666 = true;
                        if (this.field1650 < this.field1664) {
                            this.field1650++;
                        }
                        this.field1660 = "Loading extra files - " + this.field1650 * 100 / this.field1664 + "%";
                        this.field1640++;
                        if (this.field1640 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1656--;
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "d", descriptor = "(II)Z")
    public final boolean method567(int arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1652.length; var3++) {
            if (this.field1643[var3] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "XZFDFADG", name = "b", descriptor = "()I")
    public final int method568() {
        class37 var1 = this.field1673;
        synchronized (this.field1673) {
            return this.field1673.method442();
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(IBII)V")
    public final void method569(int arg0, byte arg1, int arg2, int arg3) {
        if (arg2 != 0 || (this.field1637.field481[0] == null || this.field1644[arg0][arg3] == 0)) {
            return;
        }
        byte[] var5 = this.field1637.field481[arg0 + 1].method549(arg3, 0);
        if (this.method565(var5, this.field1644[arg0][arg3], 3, this.field1675[arg0][arg3])) {
            return;
        }
        this.field1654[arg0][arg3] = arg1;
        if (arg1 > this.field1656) {
            this.field1656 = arg1;
        }
        this.field1664++;
    }

    @OriginalMember(owner = "XZFDFADG", name = "d", descriptor = "(I)V")
    public final void method570(int arg0) {
        if (arg0 >= 0) {
            this.field1657 = -56;
        }
        class57 var2 = this.field1676;
        synchronized (this.field1676) {
            this.field1676.method523();
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(LDTIATKJO;Lclient;)V")
    public final void method571(class8 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method168(var3[var4], null);
            int var27 = var26.length / 2;
            class14 var28 = new class14(-527, var26);
            this.field1644[var4] = new int[var27];
            this.field1654[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1644[var4][var29] = var28.method204();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method168(var5[var6], null);
            int var23 = var22.length / 4;
            class14 var24 = new class14(-527, var22);
            this.field1675[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1675[var6][var25] = var24.method207();
            }
        }
        byte[] var7 = arg0.method168("model_index", null);
        int var8 = this.field1644[0].length;
        this.field1641 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1641[var9] = var7[var9];
            } else {
                this.field1641[var9] = 0;
            }
        }
        byte[] var10 = arg0.method168("map_index", null);
        class14 var11 = new class14(-527, var10);
        int var12 = var10.length / 7;
        this.field1652 = new int[var12];
        this.field1646 = new int[var12];
        this.field1643 = new int[var12];
        this.field1670 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1652[var13] = var11.method204();
            this.field1646[var13] = var11.method204();
            this.field1643[var13] = var11.method204();
            this.field1670[var13] = var11.method202();
        }
        byte[] var14 = arg0.method168("anim_index", null);
        class14 var15 = new class14(-527, var14);
        int var16 = var14.length / 2;
        this.field1668 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1668[var17] = var15.method204();
        }
        byte[] var18 = arg0.method168("midi_index", null);
        class14 var19 = new class14(-527, var18);
        int var20 = var18.length;
        this.field1678 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1678[var21] = var19.method202();
        }
        this.field1637 = arg1;
        this.field1679 = true;
        this.field1637.method12(this, 2);
    }

    @OriginalMember(owner = "XZFDFADG", name = "c", descriptor = "()V")
    public final void method572() {
        this.field1679 = false;
    }

    @OriginalMember(owner = "XZFDFADG", name = "e", descriptor = "(I)V")
    private final void method573(int arg0) {
        this.field1639 = 0;
        this.field1640 = 0;
        if (arg0 != 0) {
            this.field1658 = !this.field1658;
        }
        for (class45 var2 = (class45) this.field1638.method519(); var2 != null; var2 = (class45) this.field1638.method521(5)) {
            if (var2.field1422) {
                this.field1639++;
            } else {
                this.field1640++;
            }
        }
        while (this.field1639 < 10) {
            class45 var3 = (class45) this.field1663.method518();
            if (var3 == null) {
                break;
            }
            if (this.field1654[var3.field1421][var3.field1419] != 0) {
                this.field1650++;
            }
            this.field1654[var3.field1421][var3.field1419] = 0;
            this.field1638.method516(var3);
            this.field1639++;
            this.method575((byte) 9, var3);
            this.field1666 = true;
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "f", descriptor = "(I)V")
    private final void method574(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            return;
        }
        class57 var2 = this.field1649;
        class45 var3;
        synchronized (this.field1649) {
            var3 = (class45) this.field1649.method518();
        }
        while (var3 != null) {
            this.field1666 = true;
            byte[] var4 = null;
            if (this.field1637.field481[0] != null) {
                var4 = this.field1637.field481[var3.field1421 + 1].method549(var3.field1419, 0);
            }
            if (!this.method565(var4, this.field1644[var3.field1421][var3.field1419], 3, this.field1675[var3.field1421][var3.field1419])) {
                var4 = null;
            }
            class57 var5 = this.field1649;
            synchronized (this.field1649) {
                if (var4 == null) {
                    this.field1663.method516(var3);
                } else {
                    var3.field1420 = var4;
                    class57 var6 = this.field1645;
                    synchronized (this.field1645) {
                        this.field1645.method516(var3);
                    }
                }
                var3 = (class45) this.field1649.method518();
            }
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(BLRPOURQXY;)V")
    private final void method575(byte arg0, class45 arg1) {
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        try {
            if (this.field1674 == null) {
                long var5 = System.currentTimeMillis();
                if (var5 - this.field1651 < 4000L) {
                    return;
                }
                this.field1651 = var5;
                this.field1674 = this.field1637.method119(client.field274 + 43594);
                this.field1677 = this.field1674.getInputStream();
                this.field1659 = this.field1674.getOutputStream();
                this.field1659.write(15);
                for (int var7 = 0; var7 < 8; var7++) {
                    this.field1677.read();
                }
                this.field1672 = 0;
            }
            this.field1655[0] = (byte) arg1.field1421;
            this.field1655[1] = (byte) (arg1.field1419 >> 8);
            this.field1655[2] = (byte) arg1.field1419;
            if (arg1.field1422) {
                this.field1655[3] = 2;
            } else if (this.field1637.field238) {
                this.field1655[3] = 0;
            } else {
                this.field1655[3] = 1;
            }
            this.field1659.write(this.field1655, 0, 4);
            this.field1667 = 0;
            this.field1661 = -10000;
        } catch (IOException var10) {
            try {
                this.field1674.close();
            } catch (Exception var9) {
            }
            this.field1674 = null;
            this.field1677 = null;
            this.field1659 = null;
            this.field1648 = 0;
            this.field1661++;
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "e", descriptor = "(II)V")
    public final void method576(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1644.length || arg1 < 0 || arg1 > this.field1644[arg0].length || this.field1644[arg0][arg1] == 0) {
            return;
        }
        class37 var3 = this.field1673;
        synchronized (this.field1673) {
            for (class45 var4 = (class45) this.field1673.method440(); var4 != null; var4 = (class45) this.field1673.method441(5)) {
                if (var4.field1421 == arg0 && var4.field1419 == arg1) {
                    return;
                }
            }
            class45 var5 = new class45();
            var5.field1421 = arg0;
            var5.field1419 = arg1;
            var5.field1422 = true;
            class57 var6 = this.field1649;
            synchronized (this.field1649) {
                this.field1649.method516(var5);
            }
            this.field1673.method438(var5);
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(III)V")
    public final void method577(int arg0, int arg1, int arg2) {
        if (this.field1637.field481[0] == null || (this.field1644[arg1][arg0] == 0 || (this.field1654[arg1][arg0] == 0 || this.field1656 == 0))) {
            return;
        }
        class45 var4 = new class45();
        var4.field1421 = arg1;
        var4.field1419 = arg0;
        var4.field1422 = false;
        class57 var5 = this.field1676;
        synchronized (this.field1676) {
            this.field1676.method516(var4);
        }
        if (arg2 < 1 || arg2 > 1) {
            this.field1669 = 163;
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1679) {
                this.field1671++;
                byte var1 = 20;
                if (this.field1656 == 0 && this.field1637.field481[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1666 = true;
                for (int var2 = 0; var2 < 100 && this.field1666; var2++) {
                    this.field1666 = false;
                    this.method574(8);
                    this.method573(0);
                    if (this.field1639 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method566(this.field1653);
                    if (this.field1677 != null) {
                        this.method559(7);
                    }
                }
                boolean var3 = false;
                for (class45 var4 = (class45) this.field1638.method519(); var4 != null; var4 = (class45) this.field1638.method521(5)) {
                    if (var4.field1422) {
                        var3 = true;
                        var4.field1418++;
                        if (var4.field1418 > 50) {
                            var4.field1418 = 0;
                            this.method575((byte) 9, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class45 var5 = (class45) this.field1638.method519(); var5 != null; var5 = (class45) this.field1638.method521(5)) {
                        var3 = true;
                        var5.field1418++;
                        if (var5.field1418 > 50) {
                            var5.field1418 = 0;
                            this.method575((byte) 9, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1672++;
                    if (this.field1672 > 750) {
                        try {
                            this.field1674.close();
                        } catch (Exception var8) {
                        }
                        this.field1674 = null;
                        this.field1677 = null;
                        this.field1659 = null;
                        this.field1648 = 0;
                    }
                } else {
                    this.field1672 = 0;
                    this.field1660 = "";
                }
                if (this.field1637.field238 && this.field1674 != null && this.field1659 != null && (this.field1656 > 0 || this.field1637.field481[0] == null)) {
                    this.field1667++;
                    if (this.field1667 > 500) {
                        this.field1667 = 0;
                        this.field1655[0] = 0;
                        this.field1655[1] = 0;
                        this.field1655[2] = 0;
                        this.field1655[3] = 10;
                        try {
                            this.field1659.write(this.field1655, 0, 4);
                        } catch (IOException var7) {
                            this.field1672 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "XZFDFADG", name = "a", descriptor = "(I)V")
    public final void method166(int arg0) {
        this.method576(0, arg0);
    }
}
