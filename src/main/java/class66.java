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

@OriginalClass("client!XQFIPMSR")
public class class66 extends class23 implements Runnable {

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "[B")
    private byte[] field1644 = new byte[500];

    @OriginalMember(owner = "client!XQFIPMSR", name = "d", descriptor = "Z")
    private boolean field1647 = false;

    @OriginalMember(owner = "client!XQFIPMSR", name = "f", descriptor = "Z")
    private boolean field1649 = false;

    @OriginalMember(owner = "client!XQFIPMSR", name = "g", descriptor = "LDMMTBJKZ;")
    private class12 field1650 = new class12((byte) 5);

    @OriginalMember(owner = "client!XQFIPMSR", name = "j", descriptor = "[[I")
    private int[][] field1653 = new int[4][];

    @OriginalMember(owner = "client!XQFIPMSR", name = "k", descriptor = "Z")
    private boolean field1654 = true;

    @OriginalMember(owner = "client!XQFIPMSR", name = "p", descriptor = "LDMMTBJKZ;")
    private class12 field1659 = new class12((byte) 5);

    @OriginalMember(owner = "client!XQFIPMSR", name = "q", descriptor = "I")
    private int field1660 = 37281;

    @OriginalMember(owner = "client!XQFIPMSR", name = "r", descriptor = "I")
    private int field1661 = 4;

    @OriginalMember(owner = "client!XQFIPMSR", name = "t", descriptor = "[[B")
    private byte[][] field1663 = new byte[4][];

    @OriginalMember(owner = "client!XQFIPMSR", name = "u", descriptor = "LDMMTBJKZ;")
    private class12 field1664 = new class12((byte) 5);

    @OriginalMember(owner = "client!XQFIPMSR", name = "v", descriptor = "LHRSVWDNF;")
    private class27 field1665 = new class27((byte) 77);

    @OriginalMember(owner = "client!XQFIPMSR", name = "w", descriptor = "Z")
    private boolean field1666 = false;

    @OriginalMember(owner = "client!XQFIPMSR", name = "x", descriptor = "I")
    private int field1667 = 42058;

    @OriginalMember(owner = "client!XQFIPMSR", name = "y", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1668 = new CRC32();

    @OriginalMember(owner = "client!XQFIPMSR", name = "E", descriptor = "[B")
    private byte[] field1674 = new byte[65000];

    @OriginalMember(owner = "client!XQFIPMSR", name = "G", descriptor = "LDMMTBJKZ;")
    private class12 field1676 = new class12((byte) 5);

    @OriginalMember(owner = "client!XQFIPMSR", name = "J", descriptor = "I")
    private int field1679 = -236;

    @OriginalMember(owner = "client!XQFIPMSR", name = "K", descriptor = "LDMMTBJKZ;")
    private class12 field1680 = new class12((byte) 5);

    @OriginalMember(owner = "client!XQFIPMSR", name = "M", descriptor = "Ljava/lang/String;")
    public String field1682 = "";

    @OriginalMember(owner = "client!XQFIPMSR", name = "O", descriptor = "[[I")
    private int[][] field1684 = new int[4][];

    @OriginalMember(owner = "client!XQFIPMSR", name = "e", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!XQFIPMSR", name = "i", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!XQFIPMSR", name = "l", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!XQFIPMSR", name = "m", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!XQFIPMSR", name = "z", descriptor = "I")
    private int field1669;

    @OriginalMember(owner = "client!XQFIPMSR", name = "H", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client!XQFIPMSR", name = "I", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "client!XQFIPMSR", name = "L", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!XQFIPMSR", name = "Q", descriptor = "I")
    private int field1686;

    @OriginalMember(owner = "client!XQFIPMSR", name = "R", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "client!XQFIPMSR", name = "S", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!XQFIPMSR", name = "P", descriptor = "J")
    private long field1685;

    @OriginalMember(owner = "client!XQFIPMSR", name = "D", descriptor = "LPKGIHVSX;")
    private class45 field1673;

    @OriginalMember(owner = "client!XQFIPMSR", name = "F", descriptor = "Lclient;")
    private client field1675;

    @OriginalMember(owner = "client!XQFIPMSR", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field1651;

    @OriginalMember(owner = "client!XQFIPMSR", name = "B", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1671;

    @OriginalMember(owner = "client!XQFIPMSR", name = "N", descriptor = "Ljava/net/Socket;")
    private Socket field1683;

    @OriginalMember(owner = "client!XQFIPMSR", name = "o", descriptor = "[B")
    private byte[] field1658;

    @OriginalMember(owner = "client!XQFIPMSR", name = "b", descriptor = "[I")
    private int[] field1645;

    @OriginalMember(owner = "client!XQFIPMSR", name = "c", descriptor = "[I")
    private int[] field1646;

    @OriginalMember(owner = "client!XQFIPMSR", name = "n", descriptor = "[I")
    private int[] field1657;

    @OriginalMember(owner = "client!XQFIPMSR", name = "s", descriptor = "[I")
    private int[] field1662;

    @OriginalMember(owner = "client!XQFIPMSR", name = "A", descriptor = "[I")
    private int[] field1670;

    @OriginalMember(owner = "client!XQFIPMSR", name = "C", descriptor = "[I")
    private int[] field1672;

    @OriginalMember(owner = "client!XQFIPMSR", name = "b", descriptor = "(I)V")
    public final void method559(int arg0) {
        class12 var2 = this.field1680;
        synchronized (this.field1680) {
            this.field1680.method204();
        }
        int var3 = 29 / arg0;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(IB)I")
    public final int method560(int arg0, byte arg1) {
        return arg1 == 7 ? this.field1653[arg0].length : this.field1661;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(IIB[B)Z")
    private final boolean method561(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        if (arg2 != -123) {
            throw new NullPointerException();
        }
        this.field1668.reset();
        this.field1668.update(arg3, 0, var5);
        int var7 = (int) this.field1668.getValue();
        if (arg1 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(B)V")
    private final void method562(byte arg0) {
        if (arg0 != 6) {
            this.field1679 = -44;
        }
        try {
            int var2 = this.field1651.available();
            if (this.field1678 == 0 && var2 >= 6) {
                this.field1647 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1651.read(this.field1644, var3, 6 - var3)) {
                }
                int var4 = this.field1644[0] & 0xFF;
                int var5 = ((this.field1644[1] & 0xFF) << 8) + (this.field1644[2] & 0xFF);
                int var6 = ((this.field1644[3] & 0xFF) << 8) + (this.field1644[4] & 0xFF);
                int var7 = this.field1644[5] & 0xFF;
                this.field1673 = null;
                for (class45 var8 = (class45) this.field1664.method200(); var8 != null; var8 = (class45) this.field1664.method202(569)) {
                    if (var8.field1277 == var4 && var8.field1273 == var5) {
                        this.field1673 = var8;
                    }
                    if (this.field1673 != null) {
                        var8.field1275 = 0;
                    }
                }
                if (this.field1673 != null) {
                    this.field1669 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1673.field1276 = null;
                        if (this.field1673.field1274) {
                            class12 var9 = this.field1650;
                            synchronized (this.field1650) {
                                this.field1650.method197(this.field1673);
                            }
                        } else {
                            this.field1673.method205();
                        }
                        this.field1673 = null;
                    } else {
                        if (this.field1673.field1276 == null && var7 == 0) {
                            this.field1673.field1276 = new byte[var6];
                        }
                        if (this.field1673.field1276 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1677 = var7 * 500;
                this.field1678 = 500;
                if (this.field1678 > var6 - var7 * 500) {
                    this.field1678 = var6 - var7 * 500;
                }
            }
            if (this.field1678 > 0 && var2 >= this.field1678) {
                this.field1647 = true;
                byte[] var10 = this.field1644;
                int var11 = 0;
                if (this.field1673 != null) {
                    var10 = this.field1673.field1276;
                    var11 = this.field1677;
                }
                for (int var12 = 0; var12 < this.field1678; var12 += this.field1651.read(var10, var11 + var12, this.field1678 - var12)) {
                }
                if (this.field1678 + this.field1677 >= var10.length && this.field1673 != null) {
                    if (this.field1675.field415[0] != null) {
                        this.field1675.field415[this.field1673.field1277 + 1].method224(var10.length, -78, this.field1673.field1273, var10);
                    }
                    if (!this.field1673.field1274 && this.field1673.field1277 == 3) {
                        this.field1673.field1274 = true;
                        this.field1673.field1277 = 93;
                    }
                    if (this.field1673.field1274) {
                        class12 var13 = this.field1650;
                        synchronized (this.field1650) {
                            this.field1650.method197(this.field1673);
                        }
                    } else {
                        this.field1673.method205();
                    }
                }
                this.field1678 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1683.close();
            } catch (Exception var15) {
            }
            this.field1683 = null;
            this.field1651 = null;
            this.field1671 = null;
            this.field1678 = 0;
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(IBBI)V")
    public final void method563(int arg0, byte arg1, byte arg2, int arg3) {
        if (this.field1675.field415[0] == null || this.field1653[arg0][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field1675.field415[arg0 + 1].method223((byte) 5, arg3);
        if (this.method561(this.field1684[arg0][arg3], this.field1653[arg0][arg3], (byte) -123, var5)) {
            return;
        }
        this.field1663[arg0][arg3] = arg1;
        if (arg2 == 8) {
            boolean var6 = false;
        } else {
            this.field1666 = !this.field1666;
        }
        if (arg1 > this.field1688) {
            this.field1688 = arg1;
        }
        this.field1655++;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "()V")
    public final void method564() {
        this.field1654 = false;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(I)V")
    public final void method346(int arg0) {
        this.method577(0, arg0);
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(II)Z")
    public final boolean method565(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1670.length; var3++) {
            if (this.field1646[var3] == arg1) {
                return true;
            }
        }
        if (arg0 < 1 || arg0 > 1) {
            this.field1649 = !this.field1649;
        }
        return false;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(III)V")
    public final void method566(int arg0, int arg1, int arg2) {
        if (this.field1675.field415[0] == null || (this.field1653[arg2][arg0] == 0 || (this.field1663[arg2][arg0] == 0 || this.field1688 == 0))) {
            return;
        }
        class45 var4 = new class45();
        if (arg1 != 0) {
            this.field1649 = !this.field1649;
        }
        var4.field1277 = arg2;
        var4.field1273 = arg0;
        var4.field1274 = false;
        class12 var5 = this.field1680;
        synchronized (this.field1680) {
            this.field1680.method197(var4);
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "c", descriptor = "(I)V")
    private final void method567(int arg0) {
        this.field1686 = 0;
        this.field1687 = 0;
        if (arg0 < 8 || arg0 > 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (class45 var3 = (class45) this.field1664.method200(); var3 != null; var3 = (class45) this.field1664.method202(569)) {
            if (var3.field1274) {
                this.field1686++;
            } else {
                this.field1687++;
            }
        }
        while (this.field1686 < 10) {
            class45 var4 = (class45) this.field1676.method199();
            if (var4 == null) {
                break;
            }
            if (this.field1663[var4.field1277][var4.field1273] != 0) {
                this.field1652++;
            }
            this.field1663[var4.field1277][var4.field1273] = 0;
            this.field1664.method197(var4);
            this.field1686++;
            this.method578(true, var4);
            this.field1647 = true;
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(ZI)V")
    public final void method568(boolean arg0, int arg1) {
        int var3 = this.field1670.length;
        if (arg1 != -47244) {
            this.field1667 = -354;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1657[var4] != 0) {
                this.method563(3, (byte) 2, (byte) 8, this.field1646[var4]);
                this.method563(3, (byte) 2, (byte) 8, this.field1672[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(LHBJEXSJX;Lclient;)V")
    public final void method569(class24 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method348(var3[var4], null);
            int var27 = var26.length / 2;
            class18 var28 = new class18(var26, 0);
            this.field1653[var4] = new int[var27];
            this.field1663[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1653[var4][var29] = var28.method241();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method348(var5[var6], null);
            int var23 = var22.length / 4;
            class18 var24 = new class18(var22, 0);
            this.field1684[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1684[var6][var25] = var24.method244();
            }
        }
        byte[] var7 = arg0.method348("model_index", null);
        int var8 = this.field1653[0].length;
        this.field1658 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1658[var9] = var7[var9];
            } else {
                this.field1658[var9] = 0;
            }
        }
        byte[] var10 = arg0.method348("map_index", null);
        class18 var11 = new class18(var10, 0);
        int var12 = var10.length / 7;
        this.field1670 = new int[var12];
        this.field1672 = new int[var12];
        this.field1646 = new int[var12];
        this.field1657 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1670[var13] = var11.method241();
            this.field1672[var13] = var11.method241();
            this.field1646[var13] = var11.method241();
            this.field1657[var13] = var11.method239();
        }
        byte[] var14 = arg0.method348("anim_index", null);
        class18 var15 = new class18(var14, 0);
        int var16 = var14.length / 2;
        this.field1662 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1662[var17] = var15.method241();
        }
        byte[] var18 = arg0.method348("midi_index", null);
        class18 var19 = new class18(var18, 0);
        int var20 = var18.length;
        this.field1645 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1645[var21] = var19.method239();
        }
        this.field1675 = arg1;
        this.field1654 = true;
        this.field1675.method139(this, 2);
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "b", descriptor = "(II)I")
    public final int method570(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1661 = -228;
        }
        return this.field1658[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "b", descriptor = "()LPKGIHVSX;")
    public final class45 method571() {
        class12 var1 = this.field1650;
        class45 var2;
        synchronized (this.field1650) {
            var2 = (class45) this.field1650.method199();
        }
        if (var2 == null) {
            return null;
        }
        class27 var3 = this.field1665;
        synchronized (this.field1665) {
            var2.method583();
        }
        if (var2.field1276 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1276));
            while (true) {
                if (this.field1674.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1674, var4, this.field1674.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1276 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1276[var7] = this.field1674[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "d", descriptor = "(I)V")
    private final void method572(int arg0) {
        label87: while (true) {
            if (arg0 >= 0) {
                int var2 = 1;
                while (true) {
                    if (var2 <= 0) {
                        continue label87;
                    }
                    var2++;
                }
            }
            while (this.field1686 == 0) {
                if (this.field1687 >= 10 || this.field1688 == 0) {
                    return;
                }
                class12 var3 = this.field1680;
                class45 var4;
                synchronized (this.field1680) {
                    var4 = (class45) this.field1680.method199();
                }
                while (var4 != null) {
                    if (this.field1663[var4.field1277][var4.field1273] != 0) {
                        this.field1663[var4.field1277][var4.field1273] = 0;
                        this.field1664.method197(var4);
                        this.method578(true, var4);
                        this.field1647 = true;
                        if (this.field1652 < this.field1655) {
                            this.field1652++;
                        }
                        this.field1682 = "Loading extra files - " + this.field1652 * 100 / this.field1655 + "%";
                        this.field1687++;
                        if (this.field1687 == 10) {
                            return;
                        }
                    }
                    class12 var5 = this.field1680;
                    synchronized (this.field1680) {
                        var4 = (class45) this.field1680.method199();
                    }
                }
                for (int var6 = 0; var6 < 4; var6++) {
                    byte[] var7 = this.field1663[var6];
                    int var8 = var7.length;
                    for (int var9 = 0; var9 < var8; var9++) {
                        if (var7[var9] == this.field1688) {
                            var7[var9] = 0;
                            class45 var10 = new class45();
                            var10.field1277 = var6;
                            var10.field1273 = var9;
                            var10.field1274 = false;
                            this.field1664.method197(var10);
                            this.method578(true, var10);
                            this.field1647 = true;
                            if (this.field1652 < this.field1655) {
                                this.field1652++;
                            }
                            this.field1682 = "Loading extra files - " + this.field1652 * 100 / this.field1655 + "%";
                            this.field1687++;
                            if (this.field1687 == 10) {
                                return;
                            }
                        }
                    }
                }
                this.field1688--;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(Z)I")
    public final int method573(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1662.length;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(BIII)I")
    public final int method574(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg3 << 8) + arg1;
        for (int var6 = 0; var6 < this.field1670.length; var6++) {
            if (this.field1670[var6] == var5) {
                if (arg2 == 0) {
                    return this.field1672[var6];
                }
                return this.field1646[var6];
            }
        }
        if (arg0 != 12) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "c", descriptor = "()I")
    public final int method575() {
        class27 var1 = this.field1665;
        synchronized (this.field1665) {
            return this.field1665.method360();
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "e", descriptor = "(I)V")
    private final void method576(int arg0) {
        if (this.field1660 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class12 var3 = this.field1659;
        class45 var4;
        synchronized (this.field1659) {
            var4 = (class45) this.field1659.method199();
        }
        while (var4 != null) {
            this.field1647 = true;
            byte[] var5 = null;
            if (this.field1675.field415[0] != null) {
                var5 = this.field1675.field415[var4.field1277 + 1].method223((byte) 5, var4.field1273);
            }
            if (!this.method561(this.field1684[var4.field1277][var4.field1273], this.field1653[var4.field1277][var4.field1273], (byte) -123, var5)) {
                var5 = null;
            }
            class12 var6 = this.field1659;
            synchronized (this.field1659) {
                if (var5 == null) {
                    this.field1676.method197(var4);
                } else {
                    var4.field1276 = var5;
                    class12 var7 = this.field1650;
                    synchronized (this.field1650) {
                        this.field1650.method197(var4);
                    }
                }
                var4 = (class45) this.field1659.method199();
            }
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "c", descriptor = "(II)V")
    public final void method577(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1653.length || arg1 < 0 || arg1 > this.field1653[arg0].length || this.field1653[arg0][arg1] == 0) {
            return;
        }
        class27 var3 = this.field1665;
        synchronized (this.field1665) {
            for (class45 var4 = (class45) this.field1665.method358(); var4 != null; var4 = (class45) this.field1665.method359(569)) {
                if (var4.field1277 == arg0 && var4.field1273 == arg1) {
                    return;
                }
            }
            class45 var5 = new class45();
            var5.field1277 = arg0;
            var5.field1273 = arg1;
            var5.field1274 = true;
            class12 var6 = this.field1659;
            synchronized (this.field1659) {
                this.field1659.method197(var5);
            }
            this.field1665.method356(var5);
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "a", descriptor = "(ZLPKGIHVSX;)V")
    private final void method578(boolean arg0, class45 arg1) {
        if (!arg0) {
            this.field1667 = 17;
        }
        try {
            if (this.field1683 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1685 < 4000L) {
                    return;
                }
                this.field1685 = var3;
                this.field1683 = this.field1675.method134(client.field209 + 43594);
                this.field1651 = this.field1683.getInputStream();
                this.field1671 = this.field1683.getOutputStream();
                this.field1671.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1651.read();
                }
                this.field1669 = 0;
            }
            this.field1644[0] = (byte) arg1.field1277;
            this.field1644[1] = (byte) (arg1.field1273 >> 8);
            this.field1644[2] = (byte) arg1.field1273;
            if (arg1.field1274) {
                this.field1644[3] = 2;
            } else if (this.field1675.field521) {
                this.field1644[3] = 0;
            } else {
                this.field1644[3] = 1;
            }
            this.field1671.write(this.field1644, 0, 4);
            this.field1656 = 0;
            this.field1648 = -10000;
        } catch (IOException var8) {
            try {
                this.field1683.close();
            } catch (Exception var7) {
            }
            this.field1683 = null;
            this.field1651 = null;
            this.field1671 = null;
            this.field1678 = 0;
            this.field1648++;
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1654) {
                this.field1681++;
                byte var1 = 20;
                if (this.field1688 == 0 && this.field1675.field415[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1647 = true;
                for (int var2 = 0; var2 < 100 && this.field1647; var2++) {
                    this.field1647 = false;
                    this.method576(37281);
                    this.method567(8);
                    if (this.field1686 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method572(-479);
                    if (this.field1651 != null) {
                        this.method562((byte) 6);
                    }
                }
                boolean var3 = false;
                for (class45 var4 = (class45) this.field1664.method200(); var4 != null; var4 = (class45) this.field1664.method202(569)) {
                    if (var4.field1274) {
                        var3 = true;
                        var4.field1275++;
                        if (var4.field1275 > 50) {
                            var4.field1275 = 0;
                            this.method578(true, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class45 var5 = (class45) this.field1664.method200(); var5 != null; var5 = (class45) this.field1664.method202(569)) {
                        var3 = true;
                        var5.field1275++;
                        if (var5.field1275 > 50) {
                            var5.field1275 = 0;
                            this.method578(true, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1669++;
                    if (this.field1669 > 750) {
                        try {
                            this.field1683.close();
                        } catch (Exception var8) {
                        }
                        this.field1683 = null;
                        this.field1651 = null;
                        this.field1671 = null;
                        this.field1678 = 0;
                    }
                } else {
                    this.field1669 = 0;
                    this.field1682 = "";
                }
                if (this.field1675.field521 && this.field1683 != null && this.field1671 != null && (this.field1688 > 0 || this.field1675.field415[0] == null)) {
                    this.field1656++;
                    if (this.field1656 > 500) {
                        this.field1656 = 0;
                        this.field1644[0] = 0;
                        this.field1644[1] = 0;
                        this.field1644[2] = 0;
                        this.field1644[3] = 10;
                        try {
                            this.field1671.write(this.field1644, 0, 4);
                        } catch (IOException var7) {
                            this.field1669 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!XQFIPMSR", name = "d", descriptor = "(II)Z")
    public final boolean method579(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1661 = 274;
        }
        return this.field1645[arg1] == 1;
    }
}
