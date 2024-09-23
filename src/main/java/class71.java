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

@OriginalClass("YSAVREBH")
public class class71 extends class18 implements Runnable {

    @OriginalMember(owner = "YSAVREBH", name = "b", descriptor = "Z")
    private boolean field1634 = true;

    @OriginalMember(owner = "YSAVREBH", name = "e", descriptor = "Z")
    private boolean field1637 = true;

    @OriginalMember(owner = "YSAVREBH", name = "g", descriptor = "[[B")
    private byte[][] field1639 = new byte[4][];

    @OriginalMember(owner = "YSAVREBH", name = "k", descriptor = "I")
    private int field1643 = -376;

    @OriginalMember(owner = "YSAVREBH", name = "l", descriptor = "LFLJWGVEY;")
    private class20 field1644 = new class20(807);

    @OriginalMember(owner = "YSAVREBH", name = "o", descriptor = "Z")
    private boolean field1647 = false;

    @OriginalMember(owner = "YSAVREBH", name = "s", descriptor = "LFLJWGVEY;")
    private class20 field1651 = new class20(807);

    @OriginalMember(owner = "YSAVREBH", name = "u", descriptor = "I")
    private int field1653 = -548;

    @OriginalMember(owner = "YSAVREBH", name = "z", descriptor = "Z")
    private boolean field1658 = false;

    @OriginalMember(owner = "YSAVREBH", name = "A", descriptor = "[B")
    private byte[] field1659 = new byte[500];

    @OriginalMember(owner = "YSAVREBH", name = "B", descriptor = "LFLJWGVEY;")
    private class20 field1660 = new class20(807);

    @OriginalMember(owner = "YSAVREBH", name = "F", descriptor = "Ljava/lang/String;")
    public String field1664 = "";

    @OriginalMember(owner = "YSAVREBH", name = "G", descriptor = "LFLJWGVEY;")
    private class20 field1665 = new class20(807);

    @OriginalMember(owner = "YSAVREBH", name = "H", descriptor = "[[I")
    private int[][] field1666 = new int[4][];

    @OriginalMember(owner = "YSAVREBH", name = "I", descriptor = "[[I")
    private int[][] field1667 = new int[4][];

    @OriginalMember(owner = "YSAVREBH", name = "J", descriptor = "Z")
    private boolean field1668 = true;

    @OriginalMember(owner = "YSAVREBH", name = "K", descriptor = "LUMTLOYSA;")
    private class60 field1669 = new class60((byte) 6);

    @OriginalMember(owner = "YSAVREBH", name = "L", descriptor = "[B")
    private byte[] field1670 = new byte[65000];

    @OriginalMember(owner = "YSAVREBH", name = "N", descriptor = "Z")
    private boolean field1672 = true;

    @OriginalMember(owner = "YSAVREBH", name = "O", descriptor = "I")
    private int field1673 = 6;

    @OriginalMember(owner = "YSAVREBH", name = "U", descriptor = "LFLJWGVEY;")
    private class20 field1679 = new class20(807);

    @OriginalMember(owner = "YSAVREBH", name = "V", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1680 = new CRC32();

    @OriginalMember(owner = "YSAVREBH", name = "c", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "YSAVREBH", name = "d", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "YSAVREBH", name = "f", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "YSAVREBH", name = "i", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "YSAVREBH", name = "q", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "YSAVREBH", name = "r", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "YSAVREBH", name = "w", descriptor = "I")
    private int field1655;

    @OriginalMember(owner = "YSAVREBH", name = "C", descriptor = "I")
    private int field1661;

    @OriginalMember(owner = "YSAVREBH", name = "M", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "YSAVREBH", name = "P", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "YSAVREBH", name = "R", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "YSAVREBH", name = "S", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "YSAVREBH", name = "m", descriptor = "J")
    private long field1645;

    @OriginalMember(owner = "YSAVREBH", name = "n", descriptor = "LCZKZHBFI;")
    private class12 field1646;

    @OriginalMember(owner = "YSAVREBH", name = "x", descriptor = "Lclient;")
    private client field1656;

    @OriginalMember(owner = "YSAVREBH", name = "y", descriptor = "Ljava/io/InputStream;")
    private InputStream field1657;

    @OriginalMember(owner = "YSAVREBH", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1654;

    @OriginalMember(owner = "YSAVREBH", name = "E", descriptor = "Ljava/net/Socket;")
    private Socket field1663;

    @OriginalMember(owner = "YSAVREBH", name = "j", descriptor = "[B")
    private byte[] field1642;

    @OriginalMember(owner = "YSAVREBH", name = "h", descriptor = "[I")
    private int[] field1640;

    @OriginalMember(owner = "YSAVREBH", name = "p", descriptor = "[I")
    private int[] field1648;

    @OriginalMember(owner = "YSAVREBH", name = "t", descriptor = "[I")
    private int[] field1652;

    @OriginalMember(owner = "YSAVREBH", name = "D", descriptor = "[I")
    private int[] field1662;

    @OriginalMember(owner = "YSAVREBH", name = "Q", descriptor = "[I")
    private int[] field1675;

    @OriginalMember(owner = "YSAVREBH", name = "T", descriptor = "[I")
    private int[] field1678;

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(Z)V")
    private final void method583(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field1649 = 0;
        this.field1650 = 0;
        for (class12 var2 = (class12) this.field1665.method275(); var2 != null; var2 = (class12) this.field1665.method277(4)) {
            if (var2.field677) {
                this.field1649++;
            } else {
                this.field1650++;
            }
        }
        while (this.field1649 < 10) {
            class12 var3 = (class12) this.field1644.method274();
            if (var3 == null) {
                break;
            }
            if (this.field1639[var3.field679][var3.field680] != 0) {
                this.field1655++;
            }
            this.field1639[var3.field679][var3.field680] = 0;
            this.field1665.method272(var3);
            this.field1649++;
            this.method589(false, var3);
            this.field1658 = true;
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1634) {
                this.field1638++;
                byte var1 = 20;
                if (this.field1661 == 0 && this.field1656.field554[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1658 = true;
                for (int var2 = 0; var2 < 100 && this.field1658; var2++) {
                    this.field1658 = false;
                    this.method602(6);
                    this.method583(false);
                    if (this.field1649 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method587(418);
                    if (this.field1657 != null) {
                        this.method596(false);
                    }
                }
                boolean var3 = false;
                for (class12 var4 = (class12) this.field1665.method275(); var4 != null; var4 = (class12) this.field1665.method277(4)) {
                    if (var4.field677) {
                        var3 = true;
                        var4.field681++;
                        if (var4.field681 > 50) {
                            var4.field681 = 0;
                            this.method589(false, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class12 var5 = (class12) this.field1665.method275(); var5 != null; var5 = (class12) this.field1665.method277(4)) {
                        var3 = true;
                        var5.field681++;
                        if (var5.field681 > 50) {
                            var5.field681 = 0;
                            this.method589(false, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1636++;
                    if (this.field1636 > 750) {
                        try {
                            this.field1663.close();
                        } catch (Exception var8) {
                        }
                        this.field1663 = null;
                        this.field1657 = null;
                        this.field1654 = null;
                        this.field1677 = 0;
                    }
                } else {
                    this.field1636 = 0;
                    this.field1664 = "";
                }
                if (this.field1656.field578 && this.field1663 != null && this.field1654 != null && (this.field1661 > 0 || this.field1656.field554[0] == null)) {
                    this.field1641++;
                    if (this.field1641 > 500) {
                        this.field1641 = 0;
                        this.field1659[0] = 0;
                        this.field1659[1] = 0;
                        this.field1659[2] = 0;
                        this.field1659[3] = 10;
                        try {
                            this.field1654.write(this.field1659, 0, 4);
                        } catch (IOException var7) {
                            this.field1636 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(IIIB)V")
    public final void method584(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field1656.field554[0] == null || this.field1667[arg2][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field1656.field554[arg2 + 1].method31(arg0, (byte) -50);
        while (arg1 >= 0) {
            this.field1637 = !this.field1637;
        }
        if (this.method591(this.field1667[arg2][arg0], 6, var5, this.field1666[arg2][arg0])) {
            return;
        }
        this.field1639[arg2][arg0] = arg3;
        if (arg3 > this.field1661) {
            this.field1661 = arg3;
        }
        this.field1635++;
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(II)V")
    public final void method585(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1667.length || arg1 < 0 || arg1 > this.field1667[arg0].length || this.field1667[arg0][arg1] == 0) {
            return;
        }
        class60 var3 = this.field1669;
        synchronized (this.field1669) {
            for (class12 var4 = (class12) this.field1669.method468(); var4 != null; var4 = (class12) this.field1669.method469(4)) {
                if (var4.field679 == arg0 && var4.field680 == arg1) {
                    return;
                }
            }
            class12 var5 = new class12();
            var5.field679 = arg0;
            var5.field680 = arg1;
            var5.field677 = true;
            class20 var6 = this.field1679;
            synchronized (this.field1679) {
                this.field1679.method272(var5);
            }
            this.field1669.method466(var5);
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(I)V")
    public final void method264(int arg0) {
        this.method585(0, arg0);
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(IZ)Z")
    public final boolean method586(int arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return this.field1652[arg0] == 1;
    }

    @OriginalMember(owner = "YSAVREBH", name = "b", descriptor = "(I)V")
    private final void method587(int arg0) {
        int var2 = 43 / arg0;
        while (this.field1649 == 0) {
            if (this.field1650 >= 10 || this.field1661 == 0) {
                return;
            }
            class20 var3 = this.field1651;
            class12 var4;
            synchronized (this.field1651) {
                var4 = (class12) this.field1651.method274();
            }
            while (var4 != null) {
                if (this.field1639[var4.field679][var4.field680] != 0) {
                    this.field1639[var4.field679][var4.field680] = 0;
                    this.field1665.method272(var4);
                    this.method589(false, var4);
                    this.field1658 = true;
                    if (this.field1655 < this.field1635) {
                        this.field1655++;
                    }
                    this.field1664 = "Loading extra files - " + this.field1655 * 100 / this.field1635 + "%";
                    this.field1650++;
                    if (this.field1650 == 10) {
                        return;
                    }
                }
                class20 var5 = this.field1651;
                synchronized (this.field1651) {
                    var4 = (class12) this.field1651.method274();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field1639[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field1661) {
                        var7[var9] = 0;
                        class12 var10 = new class12();
                        var10.field679 = var6;
                        var10.field680 = var9;
                        var10.field677 = false;
                        this.field1665.method272(var10);
                        this.method589(false, var10);
                        this.field1658 = true;
                        if (this.field1655 < this.field1635) {
                            this.field1655++;
                        }
                        this.field1664 = "Loading extra files - " + this.field1655 * 100 / this.field1635 + "%";
                        this.field1650++;
                        if (this.field1650 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1661--;
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "b", descriptor = "(II)I")
    public final int method588(int arg0, int arg1) {
        if (arg0 != 2) {
            this.field1672 = !this.field1672;
        }
        return this.field1667[arg1].length;
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(ZLCZKZHBFI;)V")
    private final void method589(boolean arg0, class12 arg1) {
        if (arg0) {
            this.field1647 = !this.field1647;
        }
        try {
            if (this.field1663 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1645 < 4000L) {
                    return;
                }
                this.field1645 = var3;
                this.field1663 = this.field1656.method85(client.field235 + 43594);
                this.field1657 = this.field1663.getInputStream();
                this.field1654 = this.field1663.getOutputStream();
                this.field1654.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1657.read();
                }
                this.field1636 = 0;
            }
            this.field1659[0] = (byte) arg1.field679;
            this.field1659[1] = (byte) (arg1.field680 >> 8);
            this.field1659[2] = (byte) arg1.field680;
            if (arg1.field677) {
                this.field1659[3] = 2;
            } else if (this.field1656.field578) {
                this.field1659[3] = 0;
            } else {
                this.field1659[3] = 1;
            }
            this.field1654.write(this.field1659, 0, 4);
            this.field1641 = 0;
            this.field1671 = -10000;
        } catch (IOException var8) {
            try {
                this.field1663.close();
            } catch (Exception var7) {
            }
            this.field1663 = null;
            this.field1657 = null;
            this.field1654 = null;
            this.field1677 = 0;
            this.field1671++;
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(BI)Z")
    public final boolean method590(byte arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1648.length; var3++) {
            if (this.field1640[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != -75) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(II[BI)Z")
    private final boolean method591(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg2 == null || arg2.length < 2) {
            return false;
        }
        int var5 = arg2.length - 2;
        if (arg1 != 6) {
            this.field1653 = 0;
        }
        int var6 = ((arg2[var5] & 0xFF) << 8) + (arg2[var5 + 1] & 0xFF);
        this.field1680.reset();
        this.field1680.update(arg2, 0, var5);
        int var7 = (int) this.field1680.getValue();
        if (arg0 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "c", descriptor = "(II)I")
    public final int method592(int arg0, int arg1) {
        return arg0 == 0 ? this.field1642[arg1] & 0xFF : this.field1674;
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(LBBMKAXRK;Lclient;)V")
    public final void method593(class6 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method30(var3[var4], null);
            int var27 = var26.length / 2;
            class17 var28 = new class17(var26, -26583);
            this.field1667[var4] = new int[var27];
            this.field1639[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1667[var4][var29] = var28.method226();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method30(var5[var6], null);
            int var23 = var22.length / 4;
            class17 var24 = new class17(var22, -26583);
            this.field1666[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1666[var6][var25] = var24.method229();
            }
        }
        byte[] var7 = arg0.method30("model_index", null);
        int var8 = this.field1667[0].length;
        this.field1642 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1642[var9] = var7[var9];
            } else {
                this.field1642[var9] = 0;
            }
        }
        byte[] var10 = arg0.method30("map_index", null);
        class17 var11 = new class17(var10, -26583);
        int var12 = var10.length / 7;
        this.field1648 = new int[var12];
        this.field1675 = new int[var12];
        this.field1640 = new int[var12];
        this.field1662 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1648[var13] = var11.method226();
            this.field1675[var13] = var11.method226();
            this.field1640[var13] = var11.method226();
            this.field1662[var13] = var11.method224();
        }
        byte[] var14 = arg0.method30("anim_index", null);
        class17 var15 = new class17(var14, -26583);
        int var16 = var14.length / 2;
        this.field1678 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1678[var17] = var15.method226();
        }
        byte[] var18 = arg0.method30("midi_index", null);
        class17 var19 = new class17(var18, -26583);
        int var20 = var18.length;
        this.field1652 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1652[var21] = var19.method224();
        }
        this.field1656 = arg1;
        this.field1634 = true;
        this.field1656.method23(this, 2);
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "()I")
    public final int method594() {
        class60 var1 = this.field1669;
        synchronized (this.field1669) {
            return this.field1669.method470();
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(BZ)V")
    public final void method595(byte arg0, boolean arg1) {
        int var3 = this.field1648.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1662[var4] != 0) {
                this.method584(this.field1640[var4], -235, 3, (byte) 2);
                this.method584(this.field1675[var4], -235, 3, (byte) 2);
            }
        }
        if (arg0 != 14) {
            this.field1672 = !this.field1672;
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "b", descriptor = "(Z)V")
    private final void method596(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field1657.available();
            if (this.field1677 == 0 && var3 >= 6) {
                this.field1658 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1657.read(this.field1659, var4, 6 - var4)) {
                }
                int var5 = this.field1659[0] & 0xFF;
                int var6 = ((this.field1659[1] & 0xFF) << 8) + (this.field1659[2] & 0xFF);
                int var7 = ((this.field1659[3] & 0xFF) << 8) + (this.field1659[4] & 0xFF);
                int var8 = this.field1659[5] & 0xFF;
                this.field1646 = null;
                for (class12 var9 = (class12) this.field1665.method275(); var9 != null; var9 = (class12) this.field1665.method277(4)) {
                    if (var9.field679 == var5 && var9.field680 == var6) {
                        this.field1646 = var9;
                    }
                    if (this.field1646 != null) {
                        var9.field681 = 0;
                    }
                }
                if (this.field1646 != null) {
                    this.field1636 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1646.field678 = null;
                        if (this.field1646.field677) {
                            class20 var10 = this.field1660;
                            synchronized (this.field1660) {
                                this.field1660.method272(this.field1646);
                            }
                        } else {
                            this.field1646.method334();
                        }
                        this.field1646 = null;
                    } else {
                        if (this.field1646.field678 == null && var8 == 0) {
                            this.field1646.field678 = new byte[var7];
                        }
                        if (this.field1646.field678 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1676 = var8 * 500;
                this.field1677 = 500;
                if (this.field1677 > var7 - var8 * 500) {
                    this.field1677 = var7 - var8 * 500;
                }
            }
            if (this.field1677 > 0 && var3 >= this.field1677) {
                this.field1658 = true;
                byte[] var11 = this.field1659;
                int var12 = 0;
                if (this.field1646 != null) {
                    var11 = this.field1646.field678;
                    var12 = this.field1676;
                }
                for (int var13 = 0; var13 < this.field1677; var13 += this.field1657.read(var11, var12 + var13, this.field1677 - var13)) {
                }
                if (this.field1677 + this.field1676 >= var11.length && this.field1646 != null) {
                    if (this.field1656.field554[0] != null) {
                        this.field1656.field554[this.field1646.field679 + 1].method32(var11.length, var11, (byte) -5, this.field1646.field680);
                    }
                    if (!this.field1646.field677 && this.field1646.field679 == 3) {
                        this.field1646.field677 = true;
                        this.field1646.field679 = 93;
                    }
                    if (this.field1646.field677) {
                        class20 var14 = this.field1660;
                        synchronized (this.field1660) {
                            this.field1660.method272(this.field1646);
                        }
                    } else {
                        this.field1646.method334();
                    }
                }
                this.field1677 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1663.close();
            } catch (Exception var16) {
            }
            this.field1663 = null;
            this.field1657 = null;
            this.field1654 = null;
            this.field1677 = 0;
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "c", descriptor = "(I)I")
    public final int method597(int arg0) {
        return arg0 == 0 ? this.field1678.length : this.field1674;
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(BII)V")
    public final void method598(byte arg0, int arg1, int arg2) {
        if (this.field1656.field554[0] == null || (this.field1667[arg2][arg1] == 0 || (this.field1639[arg2][arg1] == 0 || this.field1661 == 0))) {
            return;
        }
        class12 var4 = new class12();
        var4.field679 = arg2;
        var4.field680 = arg1;
        if (arg0 != 40) {
            this.field1668 = !this.field1668;
        }
        var4.field677 = false;
        class20 var5 = this.field1651;
        synchronized (this.field1651) {
            this.field1651.method272(var4);
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "b", descriptor = "()LCZKZHBFI;")
    public final class12 method599() {
        class20 var1 = this.field1660;
        class12 var2;
        synchronized (this.field1660) {
            var2 = (class12) this.field1660.method274();
        }
        if (var2 == null) {
            return null;
        }
        class60 var3 = this.field1669;
        synchronized (this.field1669) {
            var2.method35();
        }
        if (var2.field678 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field678));
            while (true) {
                if (this.field1670.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1670, var4, this.field1670.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field678 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field678[var7] = this.field1670[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "YSAVREBH", name = "d", descriptor = "(I)V")
    public final void method600(int arg0) {
        if (arg0 < 0) {
            class20 var2 = this.field1651;
            synchronized (this.field1651) {
                this.field1651.method279();
            }
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "a", descriptor = "(IIIZ)I")
    public final int method601(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = (arg1 << 8) + arg0;
        if (arg3) {
            this.field1672 = !this.field1672;
        }
        for (int var6 = 0; var6 < this.field1648.length; var6++) {
            if (this.field1648[var6] == var5) {
                if (arg2 == 0) {
                    return this.field1675[var6];
                }
                return this.field1640[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "YSAVREBH", name = "e", descriptor = "(I)V")
    private final void method602(int arg0) {
        class20 var2 = this.field1679;
        class12 var3;
        synchronized (this.field1679) {
            var3 = (class12) this.field1679.method274();
        }
        if (arg0 < this.field1673 || arg0 > this.field1673) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (var3 != null) {
            this.field1658 = true;
            byte[] var5 = null;
            if (this.field1656.field554[0] != null) {
                var5 = this.field1656.field554[var3.field679 + 1].method31(var3.field680, (byte) -50);
            }
            if (!this.method591(this.field1667[var3.field679][var3.field680], 6, var5, this.field1666[var3.field679][var3.field680])) {
                var5 = null;
            }
            class20 var6 = this.field1679;
            synchronized (this.field1679) {
                if (var5 == null) {
                    this.field1644.method272(var3);
                } else {
                    var3.field678 = var5;
                    class20 var7 = this.field1660;
                    synchronized (this.field1660) {
                        this.field1660.method272(var3);
                    }
                }
                var3 = (class12) this.field1679.method274();
            }
        }
    }

    @OriginalMember(owner = "YSAVREBH", name = "c", descriptor = "()V")
    public final void method603() {
        this.field1634 = false;
    }
}
