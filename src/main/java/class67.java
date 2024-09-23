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

@OriginalClass("VCPXACGS")
public class class67 extends class47 implements Runnable {

    @OriginalMember(owner = "VCPXACGS", name = "b", descriptor = "LOUZUCGGU;")
    private class48 field1652 = new class48(-392);

    @OriginalMember(owner = "VCPXACGS", name = "c", descriptor = "Z")
    private boolean field1653 = false;

    @OriginalMember(owner = "VCPXACGS", name = "e", descriptor = "Z")
    private boolean field1655 = true;

    @OriginalMember(owner = "VCPXACGS", name = "h", descriptor = "Z")
    private boolean field1658 = true;

    @OriginalMember(owner = "VCPXACGS", name = "i", descriptor = "I")
    private int field1659 = -308;

    @OriginalMember(owner = "VCPXACGS", name = "n", descriptor = "I")
    private int field1664 = -874;

    @OriginalMember(owner = "VCPXACGS", name = "s", descriptor = "[[I")
    private int[][] field1669 = new int[4][];

    @OriginalMember(owner = "VCPXACGS", name = "t", descriptor = "[B")
    private byte[] field1670 = new byte[500];

    @OriginalMember(owner = "VCPXACGS", name = "u", descriptor = "LOUZUCGGU;")
    private class48 field1671 = new class48(-392);

    @OriginalMember(owner = "VCPXACGS", name = "x", descriptor = "Z")
    private boolean field1674 = true;

    @OriginalMember(owner = "VCPXACGS", name = "y", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1675 = new CRC32();

    @OriginalMember(owner = "VCPXACGS", name = "z", descriptor = "LBOZWYCIO;")
    private class6 field1676 = new class6(field1657);

    @OriginalMember(owner = "VCPXACGS", name = "B", descriptor = "[[B")
    private byte[][] field1678 = new byte[4][];

    @OriginalMember(owner = "VCPXACGS", name = "C", descriptor = "[B")
    private byte[] field1679 = new byte[65000];

    @OriginalMember(owner = "VCPXACGS", name = "I", descriptor = "I")
    private int field1685 = 9;

    @OriginalMember(owner = "VCPXACGS", name = "J", descriptor = "[[I")
    private int[][] field1686 = new int[4][];

    @OriginalMember(owner = "VCPXACGS", name = "K", descriptor = "LOUZUCGGU;")
    private class48 field1687 = new class48(-392);

    @OriginalMember(owner = "VCPXACGS", name = "L", descriptor = "LOUZUCGGU;")
    private class48 field1688 = new class48(-392);

    @OriginalMember(owner = "VCPXACGS", name = "O", descriptor = "Ljava/lang/String;")
    public String field1691 = "";

    @OriginalMember(owner = "VCPXACGS", name = "R", descriptor = "Z")
    private boolean field1694 = true;

    @OriginalMember(owner = "VCPXACGS", name = "S", descriptor = "B")
    private byte field1695 = 63;

    @OriginalMember(owner = "VCPXACGS", name = "T", descriptor = "LOUZUCGGU;")
    private class48 field1696 = new class48(-392);

    @OriginalMember(owner = "VCPXACGS", name = "g", descriptor = "Z")
    private static boolean field1657 = true;

    @OriginalMember(owner = "VCPXACGS", name = "m", descriptor = "I")
    private int field1663;

    @OriginalMember(owner = "VCPXACGS", name = "o", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "VCPXACGS", name = "p", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "VCPXACGS", name = "q", descriptor = "I")
    private int field1667;

    @OriginalMember(owner = "VCPXACGS", name = "r", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "VCPXACGS", name = "v", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "VCPXACGS", name = "w", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "VCPXACGS", name = "D", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "VCPXACGS", name = "F", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "VCPXACGS", name = "P", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "VCPXACGS", name = "Q", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "VCPXACGS", name = "j", descriptor = "J")
    private long field1660;

    @OriginalMember(owner = "VCPXACGS", name = "A", descriptor = "LLMSXRUPQ;")
    private class37 field1677;

    @OriginalMember(owner = "VCPXACGS", name = "V", descriptor = "Lclient;")
    private client field1698;

    @OriginalMember(owner = "VCPXACGS", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field1661;

    @OriginalMember(owner = "VCPXACGS", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1662;

    @OriginalMember(owner = "VCPXACGS", name = "G", descriptor = "Ljava/net/Socket;")
    private Socket field1683;

    @OriginalMember(owner = "VCPXACGS", name = "d", descriptor = "[B")
    private byte[] field1654;

    @OriginalMember(owner = "VCPXACGS", name = "f", descriptor = "[I")
    private int[] field1656;

    @OriginalMember(owner = "VCPXACGS", name = "E", descriptor = "[I")
    private int[] field1681;

    @OriginalMember(owner = "VCPXACGS", name = "H", descriptor = "[I")
    private int[] field1684;

    @OriginalMember(owner = "VCPXACGS", name = "M", descriptor = "[I")
    private int[] field1689;

    @OriginalMember(owner = "VCPXACGS", name = "N", descriptor = "[I")
    private int[] field1690;

    @OriginalMember(owner = "VCPXACGS", name = "U", descriptor = "[I")
    private int[] field1697;

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(I)V")
    public final void method389(int arg0) {
        this.method567(0, arg0);
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(ILLMSXRUPQ;)V")
    private final void method555(int arg0, class37 arg1) {
        if (arg0 != 0) {
            return;
        }
        try {
            if (this.field1683 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1660 < 4000L) {
                    return;
                }
                this.field1660 = var3;
                this.field1683 = this.field1698.method143(client.field424 + 43594);
                this.field1661 = this.field1683.getInputStream();
                this.field1662 = this.field1683.getOutputStream();
                this.field1662.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1661.read();
                }
                this.field1666 = 0;
            }
            this.field1670[0] = (byte) arg1.field974;
            this.field1670[1] = (byte) (arg1.field970 >> 8);
            this.field1670[2] = (byte) arg1.field970;
            if (arg1.field971) {
                this.field1670[3] = 2;
            } else if (this.field1698.field295) {
                this.field1670[3] = 0;
            } else {
                this.field1670[3] = 1;
            }
            this.field1662.write(this.field1670, 0, 4);
            this.field1673 = 0;
            this.field1680 = -10000;
        } catch (IOException var8) {
            try {
                this.field1683.close();
            } catch (Exception var7) {
            }
            this.field1683 = null;
            this.field1661 = null;
            this.field1662 = null;
            this.field1668 = 0;
            this.field1680++;
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "b", descriptor = "(I)V")
    private final void method556(int arg0) {
        int var2 = 90 / arg0;
        class48 var3 = this.field1671;
        class37 var4;
        synchronized (this.field1671) {
            var4 = (class37) this.field1671.method392();
        }
        while (var4 != null) {
            this.field1653 = true;
            byte[] var5 = null;
            if (this.field1698.field348[0] != null) {
                var5 = this.field1698.field348[var4.field974 + 1].method356(var4.field970, 0);
            }
            if (!this.method572(this.field1686[var4.field974][var4.field970], this.field1669[var4.field974][var4.field970], -20083, var5)) {
                var5 = null;
            }
            class48 var6 = this.field1671;
            synchronized (this.field1671) {
                if (var5 == null) {
                    this.field1688.method390(var4);
                } else {
                    var4.field972 = var5;
                    class48 var7 = this.field1652;
                    synchronized (this.field1652) {
                        this.field1652.method390(var4);
                    }
                }
                var4 = (class37) this.field1671.method392();
            }
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(ZI)I")
    public final int method557(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1686[arg1].length;
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(BI)I")
    public final int method558(byte arg0, int arg1) {
        if (this.field1695 != arg0) {
            this.field1674 = !this.field1674;
        }
        return this.field1654[arg1] & 0xFF;
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(B)V")
    private final void method559(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        while (this.field1692 == 0) {
            if (this.field1693 >= 10 || this.field1663 == 0) {
                return;
            }
            class48 var2 = this.field1687;
            class37 var3;
            synchronized (this.field1687) {
                var3 = (class37) this.field1687.method392();
            }
            while (var3 != null) {
                if (this.field1678[var3.field974][var3.field970] != 0) {
                    this.field1678[var3.field974][var3.field970] = 0;
                    this.field1696.method390(var3);
                    this.method555(0, var3);
                    this.field1653 = true;
                    if (this.field1682 < this.field1665) {
                        this.field1682++;
                    }
                    this.field1691 = "Loading extra files - " + this.field1682 * 100 / this.field1665 + "%";
                    this.field1693++;
                    if (this.field1693 == 10) {
                        return;
                    }
                }
                class48 var4 = this.field1687;
                synchronized (this.field1687) {
                    var3 = (class37) this.field1687.method392();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1678[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1663) {
                        var6[var8] = 0;
                        class37 var9 = new class37();
                        var9.field974 = var5;
                        var9.field970 = var8;
                        var9.field971 = false;
                        this.field1696.method390(var9);
                        this.method555(0, var9);
                        this.field1653 = true;
                        if (this.field1682 < this.field1665) {
                            this.field1682++;
                        }
                        this.field1691 = "Loading extra files - " + this.field1682 * 100 / this.field1665 + "%";
                        this.field1693++;
                        if (this.field1693 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1663--;
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(LHRXSNEYZ;Lclient;)V")
    public final void method560(class26 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method289(var3[var4], null);
            int var27 = var26.length / 2;
            class31 var28 = new class31(var26, 8);
            this.field1686[var4] = new int[var27];
            this.field1678[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1686[var4][var29] = var28.method308();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method289(var5[var6], null);
            int var23 = var22.length / 4;
            class31 var24 = new class31(var22, 8);
            this.field1669[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1669[var6][var25] = var24.method311();
            }
        }
        byte[] var7 = arg0.method289("model_index", null);
        int var8 = this.field1686[0].length;
        this.field1654 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1654[var9] = var7[var9];
            } else {
                this.field1654[var9] = 0;
            }
        }
        byte[] var10 = arg0.method289("map_index", null);
        class31 var11 = new class31(var10, 8);
        int var12 = var10.length / 7;
        this.field1689 = new int[var12];
        this.field1690 = new int[var12];
        this.field1684 = new int[var12];
        this.field1681 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1689[var13] = var11.method308();
            this.field1690[var13] = var11.method308();
            this.field1684[var13] = var11.method308();
            this.field1681[var13] = var11.method306();
        }
        byte[] var14 = arg0.method289("anim_index", null);
        class31 var15 = new class31(var14, 8);
        int var16 = var14.length / 2;
        this.field1656 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1656[var17] = var15.method308();
        }
        byte[] var18 = arg0.method289("midi_index", null);
        class31 var19 = new class31(var18, 8);
        int var20 = var18.length;
        this.field1697 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1697[var21] = var19.method306();
        }
        this.field1698 = arg1;
        this.field1655 = true;
        this.field1698.method58(this, 2);
    }

    @OriginalMember(owner = "VCPXACGS", name = "c", descriptor = "(I)I")
    public final int method561(int arg0) {
        int var2 = 46 / arg0;
        return this.field1656.length;
    }

    @OriginalMember(owner = "VCPXACGS", name = "d", descriptor = "(I)V")
    private final void method562(int arg0) {
        if (arg0 != -25950) {
            return;
        }
        try {
            int var2 = this.field1661.available();
            if (this.field1668 == 0 && var2 >= 6) {
                this.field1653 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1661.read(this.field1670, var3, 6 - var3)) {
                }
                int var4 = this.field1670[0] & 0xFF;
                int var5 = ((this.field1670[1] & 0xFF) << 8) + (this.field1670[2] & 0xFF);
                int var6 = ((this.field1670[3] & 0xFF) << 8) + (this.field1670[4] & 0xFF);
                int var7 = this.field1670[5] & 0xFF;
                this.field1677 = null;
                for (class37 var8 = (class37) this.field1696.method393(); var8 != null; var8 = (class37) this.field1696.method395(true)) {
                    if (var8.field974 == var4 && var8.field970 == var5) {
                        this.field1677 = var8;
                    }
                    if (this.field1677 != null) {
                        var8.field973 = 0;
                    }
                }
                if (this.field1677 != null) {
                    this.field1666 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1677.field972 = null;
                        if (this.field1677.field971) {
                            class48 var9 = this.field1652;
                            synchronized (this.field1652) {
                                this.field1652.method390(this.field1677);
                            }
                        } else {
                            this.field1677.method290();
                        }
                        this.field1677 = null;
                    } else {
                        if (this.field1677.field972 == null && var7 == 0) {
                            this.field1677.field972 = new byte[var6];
                        }
                        if (this.field1677.field972 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1667 = var7 * 500;
                this.field1668 = 500;
                if (this.field1668 > var6 - var7 * 500) {
                    this.field1668 = var6 - var7 * 500;
                }
            }
            if (this.field1668 > 0 && var2 >= this.field1668) {
                this.field1653 = true;
                byte[] var10 = this.field1670;
                int var11 = 0;
                if (this.field1677 != null) {
                    var10 = this.field1677.field972;
                    var11 = this.field1667;
                }
                for (int var12 = 0; var12 < this.field1668; var12 += this.field1661.read(var10, var11 + var12, this.field1668 - var12)) {
                }
                if (this.field1668 + this.field1667 >= var10.length && this.field1677 != null) {
                    if (this.field1698.field348[0] != null) {
                        this.field1698.field348[this.field1677.field974 + 1].method357(var10, this.field1677.field970, var10.length, 0);
                    }
                    if (!this.field1677.field971 && this.field1677.field974 == 3) {
                        this.field1677.field971 = true;
                        this.field1677.field974 = 93;
                    }
                    if (this.field1677.field971) {
                        class48 var13 = this.field1652;
                        synchronized (this.field1652) {
                            this.field1652.method390(this.field1677);
                        }
                    } else {
                        this.field1677.method290();
                    }
                }
                this.field1668 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1683.close();
            } catch (Exception var15) {
            }
            this.field1683 = null;
            this.field1661 = null;
            this.field1662 = null;
            this.field1668 = 0;
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(IIIZ)I")
    public final int method563(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = (arg1 << 8) + arg2;
        if (!arg3) {
            return this.field1664;
        }
        for (int var6 = 0; var6 < this.field1689.length; var6++) {
            if (this.field1689[var6] == var5) {
                if (arg0 == 0) {
                    return this.field1690[var6];
                }
                return this.field1684[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(BIII)V")
    public final void method564(byte arg0, int arg1, int arg2, int arg3) {
        if (this.field1698.field348[0] == null || this.field1686[arg3][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1698.field348[arg3 + 1].method356(arg2, 0);
        if (arg1 < this.field1685 || arg1 > this.field1685) {
            this.field1664 = -317;
        }
        if (this.method572(this.field1686[arg3][arg2], this.field1669[arg3][arg2], -20083, var5)) {
            return;
        }
        this.field1678[arg3][arg2] = arg0;
        if (arg0 > this.field1663) {
            this.field1663 = arg0;
        }
        this.field1665++;
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(III)V")
    public final void method565(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            this.field1685 = -181;
        }
        if (this.field1698.field348[0] == null || (this.field1686[arg2][arg1] == 0 || (this.field1678[arg2][arg1] == 0 || this.field1663 == 0))) {
            return;
        }
        class37 var4 = new class37();
        var4.field974 = arg2;
        var4.field970 = arg1;
        var4.field971 = false;
        class48 var5 = this.field1687;
        synchronized (this.field1687) {
            this.field1687.method390(var4);
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "b", descriptor = "(BI)Z")
    public final boolean method566(byte arg0, int arg1) {
        if (arg0 != -6) {
            throw new NullPointerException();
        }
        return this.field1697[arg1] == 1;
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(II)V")
    public final void method567(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1686.length || arg1 < 0 || arg1 > this.field1686[arg0].length || this.field1686[arg0][arg1] == 0) {
            return;
        }
        class6 var3 = this.field1676;
        synchronized (this.field1676) {
            for (class37 var4 = (class37) this.field1676.method44(); var4 != null; var4 = (class37) this.field1676.method45(true)) {
                if (var4.field974 == arg0 && var4.field970 == arg1) {
                    return;
                }
            }
            class37 var5 = new class37();
            var5.field974 = arg0;
            var5.field970 = arg1;
            var5.field971 = true;
            class48 var6 = this.field1671;
            synchronized (this.field1671) {
                this.field1671.method390(var5);
            }
            this.field1676.method42(var5);
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "()LLMSXRUPQ;")
    public final class37 method568() {
        class48 var1 = this.field1652;
        class37 var2;
        synchronized (this.field1652) {
            var2 = (class37) this.field1652.method392();
        }
        if (var2 == null) {
            return null;
        }
        class6 var3 = this.field1676;
        synchronized (this.field1676) {
            var2.method1();
        }
        if (var2.field972 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field972));
            while (true) {
                if (this.field1679.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1679, var4, this.field1679.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field972 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field972[var7] = this.field1679[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "VCPXACGS", name = "e", descriptor = "(I)V")
    private final void method569(int arg0) {
        this.field1692 = 0;
        this.field1693 = 0;
        class37 var2 = (class37) this.field1696.method393();
        if (arg0 <= 0) {
            this.field1659 = -63;
        }
        while (var2 != null) {
            if (var2.field971) {
                this.field1692++;
            } else {
                this.field1693++;
            }
            var2 = (class37) this.field1696.method395(true);
        }
        while (this.field1692 < 10) {
            class37 var3 = (class37) this.field1688.method392();
            if (var3 == null) {
                break;
            }
            if (this.field1678[var3.field974][var3.field970] != 0) {
                this.field1682++;
            }
            this.field1678[var3.field974][var3.field970] = 0;
            this.field1696.method390(var3);
            this.field1692++;
            this.method555(0, var3);
            this.field1653 = true;
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(IZ)V")
    public final void method570(int arg0, boolean arg1) {
        int var3 = this.field1689.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1681[var4] != 0) {
                this.method564((byte) 2, 9, this.field1684[var4], 3);
                this.method564((byte) 2, 9, this.field1690[var4], 3);
            }
        }
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "b", descriptor = "()I")
    public final int method571() {
        class6 var1 = this.field1676;
        synchronized (this.field1676) {
            return this.field1676.method46();
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "a", descriptor = "(III[B)Z")
    private final boolean method572(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field1675.reset();
        this.field1675.update(arg3, 0, var5);
        if (arg2 != -20083) {
            this.field1658 = !this.field1658;
        }
        int var7 = (int) this.field1675.getValue();
        if (arg0 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "f", descriptor = "(I)V")
    public final void method573(int arg0) {
        class48 var2 = this.field1687;
        synchronized (this.field1687) {
            this.field1687.method397();
        }
        if (arg0 != 0) {
            this.field1664 = -441;
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1655) {
                this.field1672++;
                byte var1 = 20;
                if (this.field1663 == 0 && this.field1698.field348[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1653 = true;
                for (int var2 = 0; var2 < 100 && this.field1653; var2++) {
                    this.field1653 = false;
                    this.method556(439);
                    this.method569(853);
                    if (this.field1692 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method559((byte) 1);
                    if (this.field1661 != null) {
                        this.method562(-25950);
                    }
                }
                boolean var3 = false;
                for (class37 var4 = (class37) this.field1696.method393(); var4 != null; var4 = (class37) this.field1696.method395(true)) {
                    if (var4.field971) {
                        var3 = true;
                        var4.field973++;
                        if (var4.field973 > 50) {
                            var4.field973 = 0;
                            this.method555(0, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class37 var5 = (class37) this.field1696.method393(); var5 != null; var5 = (class37) this.field1696.method395(true)) {
                        var3 = true;
                        var5.field973++;
                        if (var5.field973 > 50) {
                            var5.field973 = 0;
                            this.method555(0, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1666++;
                    if (this.field1666 > 750) {
                        try {
                            this.field1683.close();
                        } catch (Exception var8) {
                        }
                        this.field1683 = null;
                        this.field1661 = null;
                        this.field1662 = null;
                        this.field1668 = 0;
                    }
                } else {
                    this.field1666 = 0;
                    this.field1691 = "";
                }
                if (this.field1698.field295 && this.field1683 != null && this.field1662 != null && (this.field1663 > 0 || this.field1698.field348[0] == null)) {
                    this.field1673++;
                    if (this.field1673 > 500) {
                        this.field1673 = 0;
                        this.field1670[0] = 0;
                        this.field1670[1] = 0;
                        this.field1670[2] = 0;
                        this.field1670[3] = 10;
                        try {
                            this.field1662.write(this.field1670, 0, 4);
                        } catch (IOException var7) {
                            this.field1666 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "VCPXACGS", name = "c", descriptor = "()V")
    public final void method574() {
        this.field1655 = false;
    }

    @OriginalMember(owner = "VCPXACGS", name = "c", descriptor = "(BI)Z")
    public final boolean method575(byte arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1689.length; var3++) {
            if (this.field1684[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != -93) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return false;
    }
}
