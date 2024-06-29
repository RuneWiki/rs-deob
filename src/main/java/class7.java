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

@OriginalClass("client!BPHGILGU")
public class class7 extends class23 implements Runnable {

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "LZXKMWHPZ;")
    private class72 field102 = new class72((byte) 8);

    @OriginalMember(owner = "client!BPHGILGU", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field106 = new CRC32();

    @OriginalMember(owner = "client!BPHGILGU", name = "f", descriptor = "[[I")
    private int[][] field107 = new int[4][];

    @OriginalMember(owner = "client!BPHGILGU", name = "h", descriptor = "LZXKMWHPZ;")
    private class72 field109 = new class72((byte) 8);

    @OriginalMember(owner = "client!BPHGILGU", name = "j", descriptor = "I")
    private int field111 = 310;

    @OriginalMember(owner = "client!BPHGILGU", name = "l", descriptor = "[[I")
    private int[][] field113 = new int[4][];

    @OriginalMember(owner = "client!BPHGILGU", name = "m", descriptor = "Ljava/lang/String;")
    public String field114 = "";

    @OriginalMember(owner = "client!BPHGILGU", name = "q", descriptor = "I")
    private int field118 = 45070;

    @OriginalMember(owner = "client!BPHGILGU", name = "s", descriptor = "[B")
    private byte[] field120 = new byte[65000];

    @OriginalMember(owner = "client!BPHGILGU", name = "t", descriptor = "[B")
    private byte[] field121 = new byte[500];

    @OriginalMember(owner = "client!BPHGILGU", name = "u", descriptor = "Z")
    private boolean field122 = true;

    @OriginalMember(owner = "client!BPHGILGU", name = "w", descriptor = "[[B")
    private byte[][] field124 = new byte[4][];

    @OriginalMember(owner = "client!BPHGILGU", name = "x", descriptor = "LZXKMWHPZ;")
    private class72 field125 = new class72((byte) 8);

    @OriginalMember(owner = "client!BPHGILGU", name = "z", descriptor = "LZXKMWHPZ;")
    private class72 field127 = new class72((byte) 8);

    @OriginalMember(owner = "client!BPHGILGU", name = "B", descriptor = "LKHIOJPOB;")
    private class32 field129 = new class32(field105);

    @OriginalMember(owner = "client!BPHGILGU", name = "I", descriptor = "LZXKMWHPZ;")
    private class72 field136 = new class72((byte) 8);

    @OriginalMember(owner = "client!BPHGILGU", name = "L", descriptor = "Z")
    private boolean field139 = false;

    @OriginalMember(owner = "client!BPHGILGU", name = "P", descriptor = "I")
    private int field143 = 8;

    @OriginalMember(owner = "client!BPHGILGU", name = "Q", descriptor = "Z")
    private boolean field144 = true;

    @OriginalMember(owner = "client!BPHGILGU", name = "R", descriptor = "Z")
    private boolean field145 = false;

    @OriginalMember(owner = "client!BPHGILGU", name = "d", descriptor = "B")
    private static byte field105 = 8;

    @OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!BPHGILGU", name = "n", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client!BPHGILGU", name = "o", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client!BPHGILGU", name = "p", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!BPHGILGU", name = "y", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!BPHGILGU", name = "D", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!BPHGILGU", name = "F", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!BPHGILGU", name = "H", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client!BPHGILGU", name = "J", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!BPHGILGU", name = "M", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!BPHGILGU", name = "N", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!BPHGILGU", name = "O", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!BPHGILGU", name = "E", descriptor = "J")
    private long field132;

    @OriginalMember(owner = "client!BPHGILGU", name = "c", descriptor = "LQWHFLOAQ;")
    private class43 field104;

    @OriginalMember(owner = "client!BPHGILGU", name = "S", descriptor = "Lclient;")
    private client field146;

    @OriginalMember(owner = "client!BPHGILGU", name = "A", descriptor = "Ljava/io/InputStream;")
    private InputStream field128;

    @OriginalMember(owner = "client!BPHGILGU", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field119;

    @OriginalMember(owner = "client!BPHGILGU", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field112;

    @OriginalMember(owner = "client!BPHGILGU", name = "g", descriptor = "[B")
    private byte[] field108;

    @OriginalMember(owner = "client!BPHGILGU", name = "i", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "client!BPHGILGU", name = "v", descriptor = "[I")
    private int[] field123;

    @OriginalMember(owner = "client!BPHGILGU", name = "C", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "client!BPHGILGU", name = "G", descriptor = "[I")
    private int[] field134;

    @OriginalMember(owner = "client!BPHGILGU", name = "K", descriptor = "[I")
    private int[] field138;

    @OriginalMember(owner = "client!BPHGILGU", name = "T", descriptor = "[I")
    private int[] field147;

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "()I")
    public final int method116() {
        class32 var1 = this.field129;
        synchronized (this.field129) {
            return this.field129.method335();
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(II)Z")
    public final boolean method117(int arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            throw new NullPointerException();
        }
        return this.field147[arg0] == 1;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "(II)V")
    public final void method118(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field107.length || arg1 < 0 || arg1 > this.field107[arg0].length || this.field107[arg0][arg1] == 0) {
            return;
        }
        class32 var3 = this.field129;
        synchronized (this.field129) {
            for (class43 var4 = (class43) this.field129.method333(); var4 != null; var4 = (class43) this.field129.method334(4)) {
                if (var4.field1224 == arg0 && var4.field1226 == arg1) {
                    return;
                }
            }
            class43 var5 = new class43();
            var5.field1224 = arg0;
            var5.field1226 = arg1;
            var5.field1225 = true;
            class72 var6 = this.field125;
            synchronized (this.field125) {
                this.field125.method595(var5);
            }
            this.field129.method331(var5);
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(I)V")
    public final void method119(int arg0) {
        this.method118(0, arg0);
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(B)V")
    private final void method120(byte arg0) {
        class72 var2 = this.field125;
        class43 var3;
        synchronized (this.field125) {
            var3 = (class43) this.field125.method597();
        }
        if (arg0 != 7) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (var3 != null) {
            this.field145 = true;
            byte[] var5 = null;
            if (this.field146.field636[0] != null) {
                var5 = this.field146.field636[var3.field1224 + 1].method529((byte) -11, var3.field1226);
            }
            if (!this.method125((byte) 1, this.field107[var3.field1224][var3.field1226], this.field113[var3.field1224][var3.field1226], var5)) {
                var5 = null;
            }
            class72 var6 = this.field125;
            synchronized (this.field125) {
                if (var5 == null) {
                    this.field102.method595(var3);
                } else {
                    var3.field1227 = var5;
                    class72 var7 = this.field136;
                    synchronized (this.field136) {
                        this.field136.method595(var3);
                    }
                }
                var3 = (class43) this.field125.method597();
            }
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "c", descriptor = "(II)I")
    public final int method121(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field144 = !this.field144;
        }
        return this.field108[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "d", descriptor = "(II)I")
    public final int method122(int arg0, int arg1) {
        return arg1 == 0 ? this.field107[arg0].length : 1;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(BZ)V")
    public final void method123(byte arg0, boolean arg1) {
        int var3 = this.field123.length;
        if (arg0 != 53) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field134[var4] != 0) {
                this.method136(3, -6015, this.field110[var4], (byte) 2);
                this.method136(3, -6015, this.field138[var4], (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "()V")
    public final void method124() {
        this.field122 = false;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(BII[B)Z")
    private final boolean method125(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var7 = false;
        this.field106.reset();
        this.field106.update(arg3, 0, var5);
        int var8 = (int) this.field106.getValue();
        if (arg1 == var6) {
            return arg2 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(Z)V")
    private final void method126(boolean arg0) {
        if (!arg0) {
            this.field126 = -257;
        }
        try {
            int var2 = this.field128.available();
            if (this.field142 == 0 && var2 >= 6) {
                this.field145 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field128.read(this.field121, var3, 6 - var3)) {
                }
                int var4 = this.field121[0] & 0xFF;
                int var5 = ((this.field121[1] & 0xFF) << 8) + (this.field121[2] & 0xFF);
                int var6 = ((this.field121[3] & 0xFF) << 8) + (this.field121[4] & 0xFF);
                int var7 = this.field121[5] & 0xFF;
                this.field104 = null;
                for (class43 var8 = (class43) this.field127.method598(); var8 != null; var8 = (class43) this.field127.method600(4)) {
                    if (var8.field1224 == var4 && var8.field1226 == var5) {
                        this.field104 = var8;
                    }
                    if (this.field104 != null) {
                        var8.field1228 = 0;
                    }
                }
                if (this.field104 != null) {
                    this.field140 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field104.field1227 = null;
                        if (this.field104.field1225) {
                            class72 var9 = this.field136;
                            synchronized (this.field136) {
                                this.field136.method595(this.field104);
                            }
                        } else {
                            this.field104.method329();
                        }
                        this.field104 = null;
                    } else {
                        if (this.field104.field1227 == null && var7 == 0) {
                            this.field104.field1227 = new byte[var6];
                        }
                        if (this.field104.field1227 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field141 = var7 * 500;
                this.field142 = 500;
                if (this.field142 > var6 - var7 * 500) {
                    this.field142 = var6 - var7 * 500;
                }
            }
            if (this.field142 > 0 && var2 >= this.field142) {
                this.field145 = true;
                byte[] var10 = this.field121;
                int var11 = 0;
                if (this.field104 != null) {
                    var10 = this.field104.field1227;
                    var11 = this.field141;
                }
                for (int var12 = 0; var12 < this.field142; var12 += this.field128.read(var10, var11 + var12, this.field142 - var12)) {
                }
                if (this.field142 + this.field141 >= var10.length && this.field104 != null) {
                    if (this.field146.field636[0] != null) {
                        this.field146.field636[this.field104.field1224 + 1].method530(this.field104.field1226, var10.length, var10, 0);
                    }
                    if (!this.field104.field1225 && this.field104.field1224 == 3) {
                        this.field104.field1225 = true;
                        this.field104.field1224 = 93;
                    }
                    if (this.field104.field1225) {
                        class72 var13 = this.field136;
                        synchronized (this.field136) {
                            this.field136.method595(this.field104);
                        }
                    } else {
                        this.field104.method329();
                    }
                }
                this.field142 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field112.close();
            } catch (Exception var15) {
            }
            this.field112 = null;
            this.field128 = null;
            this.field119 = null;
            this.field142 = 0;
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field122) {
                this.field133++;
                byte var1 = 20;
                if (this.field115 == 0 && this.field146.field636[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field145 = true;
                for (int var2 = 0; var2 < 100 && this.field145; var2++) {
                    this.field145 = false;
                    this.method120((byte) 7);
                    this.method131(45070);
                    if (this.field116 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method134(this.field111);
                    if (this.field128 != null) {
                        this.method126(true);
                    }
                }
                boolean var3 = false;
                for (class43 var4 = (class43) this.field127.method598(); var4 != null; var4 = (class43) this.field127.method600(4)) {
                    if (var4.field1225) {
                        var3 = true;
                        var4.field1228++;
                        if (var4.field1228 > 50) {
                            var4.field1228 = 0;
                            this.method137(false, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class43 var5 = (class43) this.field127.method598(); var5 != null; var5 = (class43) this.field127.method600(4)) {
                        var3 = true;
                        var5.field1228++;
                        if (var5.field1228 > 50) {
                            var5.field1228 = 0;
                            this.method137(false, var5);
                        }
                    }
                }
                if (var3) {
                    this.field140++;
                    if (this.field140 > 750) {
                        try {
                            this.field112.close();
                        } catch (Exception var8) {
                        }
                        this.field112 = null;
                        this.field128 = null;
                        this.field119 = null;
                        this.field142 = 0;
                    }
                } else {
                    this.field140 = 0;
                    this.field114 = "";
                }
                if (this.field146.field250 && this.field112 != null && this.field119 != null && (this.field115 > 0 || this.field146.field636[0] == null)) {
                    this.field103++;
                    if (this.field103 > 500) {
                        this.field103 = 0;
                        this.field121[0] = 0;
                        this.field121[1] = 0;
                        this.field121[2] = 0;
                        this.field121[3] = 10;
                        try {
                            this.field119.write(this.field121, 0, 4);
                        } catch (IOException var7) {
                            this.field140 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "c", descriptor = "()LQWHFLOAQ;")
    public final class43 method127() {
        class72 var1 = this.field136;
        class43 var2;
        synchronized (this.field136) {
            var2 = (class43) this.field136.method597();
        }
        if (var2 == null) {
            return null;
        }
        class32 var3 = this.field129;
        synchronized (this.field129) {
            var2.method300();
        }
        if (var2.field1227 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1227));
            while (true) {
                if (this.field120.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field120, var4, this.field120.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1227 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1227[var7] = this.field120[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(IB)Z")
    public final boolean method128(int arg0, byte arg1) {
        if (arg1 != -88) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field123.length; var4++) {
            if (this.field110[var4] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(IIZI)I")
    public final int method129(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field143 = 282;
        }
        int var5 = (arg0 << 8) + arg3;
        for (int var6 = 0; var6 < this.field123.length; var6++) {
            if (this.field123[var6] == var5) {
                if (arg1 == 0) {
                    return this.field138[var6];
                }
                return this.field110[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(LVSQMPWOM;Lclient;)V")
    public final void method130(class59 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method526(var3[var4], null);
            int var27 = var26.length / 2;
            class3 var28 = new class3(var26, -990);
            this.field107[var4] = new int[var27];
            this.field124[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field107[var4][var29] = var28.method56();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method526(var5[var6], null);
            int var23 = var22.length / 4;
            class3 var24 = new class3(var22, -990);
            this.field113[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field113[var6][var25] = var24.method59();
            }
        }
        byte[] var7 = arg0.method526("model_index", null);
        int var8 = this.field107[0].length;
        this.field108 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field108[var9] = var7[var9];
            } else {
                this.field108[var9] = 0;
            }
        }
        byte[] var10 = arg0.method526("map_index", null);
        class3 var11 = new class3(var10, -990);
        int var12 = var10.length / 7;
        this.field123 = new int[var12];
        this.field138 = new int[var12];
        this.field110 = new int[var12];
        this.field134 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field123[var13] = var11.method56();
            this.field138[var13] = var11.method56();
            this.field110[var13] = var11.method56();
            this.field134[var13] = var11.method54();
        }
        byte[] var14 = arg0.method526("anim_index", null);
        class3 var15 = new class3(var14, -990);
        int var16 = var14.length / 2;
        this.field130 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field130[var17] = var15.method56();
        }
        byte[] var18 = arg0.method526("midi_index", null);
        class3 var19 = new class3(var18, -990);
        int var20 = var18.length;
        this.field147 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field147[var21] = var19.method54();
        }
        this.field146 = arg1;
        this.field122 = true;
        this.field146.method180(this, 2);
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "(I)V")
    private final void method131(int arg0) {
        this.field116 = 0;
        this.field117 = 0;
        class43 var2 = (class43) this.field127.method598();
        if (this.field118 != arg0) {
            return;
        }
        while (var2 != null) {
            if (var2.field1225) {
                this.field116++;
            } else {
                this.field117++;
            }
            var2 = (class43) this.field127.method600(4);
        }
        while (this.field116 < 10) {
            class43 var3 = (class43) this.field102.method597();
            if (var3 == null) {
                break;
            }
            if (this.field124[var3.field1224][var3.field1226] != 0) {
                this.field131++;
            }
            this.field124[var3.field1224][var3.field1226] = 0;
            this.field127.method595(var3);
            this.field116++;
            this.method137(false, var3);
            this.field145 = true;
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "(B)V")
    public final void method132(byte arg0) {
        class72 var2 = this.field109;
        synchronized (this.field109) {
            this.field109.method602();
        }
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            this.field139 = !this.field139;
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(IZI)V")
    public final void method133(int arg0, boolean arg1, int arg2) {
        if (this.field146.field636[0] == null || (this.field107[arg0][arg2] == 0 || (this.field124[arg0][arg2] == 0 || this.field115 == 0))) {
            return;
        }
        class43 var4 = new class43();
        var4.field1224 = arg0;
        var4.field1226 = arg2;
        var4.field1225 = false;
        class72 var5 = this.field109;
        synchronized (this.field109) {
            this.field109.method595(var4);
        }
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "c", descriptor = "(I)V")
    private final void method134(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        while (this.field116 == 0) {
            if (this.field117 >= 10 || this.field115 == 0) {
                return;
            }
            class72 var2 = this.field109;
            class43 var3;
            synchronized (this.field109) {
                var3 = (class43) this.field109.method597();
            }
            while (var3 != null) {
                if (this.field124[var3.field1224][var3.field1226] != 0) {
                    this.field124[var3.field1224][var3.field1226] = 0;
                    this.field127.method595(var3);
                    this.method137(false, var3);
                    this.field145 = true;
                    if (this.field131 < this.field135) {
                        this.field131++;
                    }
                    this.field114 = "Loading extra files - " + this.field131 * 100 / this.field135 + "%";
                    this.field117++;
                    if (this.field117 == 10) {
                        return;
                    }
                }
                class72 var4 = this.field109;
                synchronized (this.field109) {
                    var3 = (class43) this.field109.method597();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field124[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field115) {
                        var6[var8] = 0;
                        class43 var9 = new class43();
                        var9.field1224 = var5;
                        var9.field1226 = var8;
                        var9.field1225 = false;
                        this.field127.method595(var9);
                        this.method137(false, var9);
                        this.field145 = true;
                        if (this.field131 < this.field135) {
                            this.field131++;
                        }
                        this.field114 = "Loading extra files - " + this.field131 * 100 / this.field135 + "%";
                        this.field117++;
                        if (this.field117 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field115--;
        }
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "d", descriptor = "(I)I")
    public final int method135(int arg0) {
        return arg0 >= 0 ? 3 : this.field130.length;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(IIIB)V")
    public final void method136(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field146.field636[0] == null || this.field107[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field146.field636[arg0 + 1].method529((byte) -11, arg2);
        if (this.method125((byte) 1, this.field107[arg0][arg2], this.field113[arg0][arg2], var5)) {
            return;
        }
        this.field124[arg0][arg2] = arg3;
        if (arg1 != -6015) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg3 > this.field115) {
            this.field115 = arg3;
        }
        this.field135++;
    }

    @OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(ZLQWHFLOAQ;)V")
    private final void method137(boolean arg0, class43 arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            if (this.field112 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field132 < 4000L) {
                    return;
                }
                this.field132 = var4;
                this.field112 = this.field146.method283(client.field372 + 43594);
                this.field128 = this.field112.getInputStream();
                this.field119 = this.field112.getOutputStream();
                this.field119.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field128.read();
                }
                this.field140 = 0;
            }
            this.field121[0] = (byte) arg1.field1224;
            this.field121[1] = (byte) (arg1.field1226 >> 8);
            this.field121[2] = (byte) arg1.field1226;
            if (arg1.field1225) {
                this.field121[3] = 2;
            } else if (this.field146.field250) {
                this.field121[3] = 0;
            } else {
                this.field121[3] = 1;
            }
            this.field119.write(this.field121, 0, 4);
            this.field103 = 0;
            this.field137 = -10000;
        } catch (IOException var9) {
            try {
                this.field112.close();
            } catch (Exception var8) {
            }
            this.field112 = null;
            this.field128 = null;
            this.field119 = null;
            this.field142 = 0;
            this.field137++;
        }
    }
}
