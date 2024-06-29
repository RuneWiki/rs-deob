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

@OriginalClass("client!NJYVZTLI")
public class class34 extends class32 implements Runnable {

    @OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "Z")
    private boolean field997 = false;

    @OriginalMember(owner = "client!NJYVZTLI", name = "c", descriptor = "LFYVRCFGT;")
    private class16 field998 = new class16(true);

    @OriginalMember(owner = "client!NJYVZTLI", name = "h", descriptor = "[[I")
    private int[][] field1003 = new int[4][];

    @OriginalMember(owner = "client!NJYVZTLI", name = "i", descriptor = "Ljava/lang/String;")
    public String field1004 = "";

    @OriginalMember(owner = "client!NJYVZTLI", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1005 = new CRC32();

    @OriginalMember(owner = "client!NJYVZTLI", name = "n", descriptor = "[B")
    private byte[] field1009 = new byte[500];

    @OriginalMember(owner = "client!NJYVZTLI", name = "o", descriptor = "[[B")
    private byte[][] field1010 = new byte[4][];

    @OriginalMember(owner = "client!NJYVZTLI", name = "p", descriptor = "Z")
    private boolean field1011 = false;

    @OriginalMember(owner = "client!NJYVZTLI", name = "r", descriptor = "Z")
    private boolean field1013 = false;

    @OriginalMember(owner = "client!NJYVZTLI", name = "s", descriptor = "LFYVRCFGT;")
    private class16 field1014 = new class16(true);

    @OriginalMember(owner = "client!NJYVZTLI", name = "v", descriptor = "I")
    private int field1017 = 57;

    @OriginalMember(owner = "client!NJYVZTLI", name = "w", descriptor = "[[I")
    private int[][] field1018 = new int[4][];

    @OriginalMember(owner = "client!NJYVZTLI", name = "x", descriptor = "B")
    private byte field1019 = -32;

    @OriginalMember(owner = "client!NJYVZTLI", name = "A", descriptor = "LFYVRCFGT;")
    private class16 field1022 = new class16(true);

    @OriginalMember(owner = "client!NJYVZTLI", name = "B", descriptor = "B")
    private byte field1023 = -32;

    @OriginalMember(owner = "client!NJYVZTLI", name = "D", descriptor = "Z")
    private boolean field1025 = true;

    @OriginalMember(owner = "client!NJYVZTLI", name = "I", descriptor = "[B")
    private byte[] field1030 = new byte[65000];

    @OriginalMember(owner = "client!NJYVZTLI", name = "J", descriptor = "LFYVRCFGT;")
    private class16 field1031 = new class16(true);

    @OriginalMember(owner = "client!NJYVZTLI", name = "K", descriptor = "Z")
    private boolean field1032 = true;

    @OriginalMember(owner = "client!NJYVZTLI", name = "M", descriptor = "LBGTUCWCI;")
    private class3 field1034 = new class3(41416);

    @OriginalMember(owner = "client!NJYVZTLI", name = "O", descriptor = "LFYVRCFGT;")
    private class16 field1036 = new class16(true);

    @OriginalMember(owner = "client!NJYVZTLI", name = "e", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!NJYVZTLI", name = "f", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!NJYVZTLI", name = "k", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!NJYVZTLI", name = "m", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!NJYVZTLI", name = "E", descriptor = "I")
    private int field1026;

    @OriginalMember(owner = "client!NJYVZTLI", name = "F", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!NJYVZTLI", name = "H", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!NJYVZTLI", name = "N", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!NJYVZTLI", name = "Q", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "client!NJYVZTLI", name = "R", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "client!NJYVZTLI", name = "S", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "client!NJYVZTLI", name = "T", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!NJYVZTLI", name = "G", descriptor = "J")
    private long field1028;

    @OriginalMember(owner = "client!NJYVZTLI", name = "l", descriptor = "LWIICVWRM;")
    private class63 field1007;

    @OriginalMember(owner = "client!NJYVZTLI", name = "C", descriptor = "Lclient;")
    private client field1024;

    @OriginalMember(owner = "client!NJYVZTLI", name = "P", descriptor = "Ljava/io/InputStream;")
    private InputStream field1037;

    @OriginalMember(owner = "client!NJYVZTLI", name = "U", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1042;

    @OriginalMember(owner = "client!NJYVZTLI", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field1016;

    @OriginalMember(owner = "client!NJYVZTLI", name = "g", descriptor = "[B")
    private byte[] field1002;

    @OriginalMember(owner = "client!NJYVZTLI", name = "q", descriptor = "[I")
    private int[] field1012;

    @OriginalMember(owner = "client!NJYVZTLI", name = "t", descriptor = "[I")
    private int[] field1015;

    @OriginalMember(owner = "client!NJYVZTLI", name = "y", descriptor = "[I")
    private int[] field1020;

    @OriginalMember(owner = "client!NJYVZTLI", name = "z", descriptor = "[I")
    private int[] field1021;

    @OriginalMember(owner = "client!NJYVZTLI", name = "L", descriptor = "[I")
    private int[] field1033;

    @OriginalMember(owner = "client!NJYVZTLI", name = "d", descriptor = "[I")
    private int[] field999;

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "()I")
    public final int method305() {
        class3 var1 = this.field1034;
        synchronized (this.field1034) {
            return this.field1034.method17();
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(II)V")
    public final void method306(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1003.length || arg1 < 0 || arg1 > this.field1003[arg0].length || this.field1003[arg0][arg1] == 0) {
            return;
        }
        class3 var3 = this.field1034;
        synchronized (this.field1034) {
            for (class63 var4 = (class63) this.field1034.method15(); var4 != null; var4 = (class63) this.field1034.method16(8)) {
                if (var4.field1529 == arg0 && var4.field1528 == arg1) {
                    return;
                }
            }
            class63 var5 = new class63();
            var5.field1529 = arg0;
            var5.field1528 = arg1;
            var5.field1531 = true;
            class16 var6 = this.field1022;
            synchronized (this.field1022) {
                this.field1022.method197(var5);
            }
            this.field1034.method13(var5);
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "(II)I")
    public final int method307(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1002[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(B)V")
    private final void method308(byte arg0) {
        if (arg0 != 8) {
            return;
        }
        try {
            int var2 = this.field1037.available();
            if (this.field1039 == 0 && var2 >= 6) {
                this.field1013 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1037.read(this.field1009, var3, 6 - var3)) {
                }
                int var4 = this.field1009[0] & 0xFF;
                int var5 = ((this.field1009[1] & 0xFF) << 8) + (this.field1009[2] & 0xFF);
                int var6 = ((this.field1009[3] & 0xFF) << 8) + (this.field1009[4] & 0xFF);
                int var7 = this.field1009[5] & 0xFF;
                this.field1007 = null;
                for (class63 var8 = (class63) this.field998.method200(); var8 != null; var8 = (class63) this.field998.method202(8)) {
                    if (var8.field1529 == var4 && var8.field1528 == var5) {
                        this.field1007 = var8;
                    }
                    if (this.field1007 != null) {
                        var8.field1530 = 0;
                    }
                }
                if (this.field1007 != null) {
                    this.field1000 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1007.field1527 = null;
                        if (this.field1007.field1531) {
                            class16 var9 = this.field1036;
                            synchronized (this.field1036) {
                                this.field1036.method197(this.field1007);
                            }
                        } else {
                            this.field1007.method326();
                        }
                        this.field1007 = null;
                    } else {
                        if (this.field1007.field1527 == null && var7 == 0) {
                            this.field1007.field1527 = new byte[var6];
                        }
                        if (this.field1007.field1527 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1038 = var7 * 500;
                this.field1039 = 500;
                if (this.field1039 > var6 - var7 * 500) {
                    this.field1039 = var6 - var7 * 500;
                }
            }
            if (this.field1039 > 0 && var2 >= this.field1039) {
                this.field1013 = true;
                byte[] var10 = this.field1009;
                int var11 = 0;
                if (this.field1007 != null) {
                    var10 = this.field1007.field1527;
                    var11 = this.field1038;
                }
                for (int var12 = 0; var12 < this.field1039; var12 += this.field1037.read(var10, var11 + var12, this.field1039 - var12)) {
                }
                if (this.field1039 + this.field1038 >= var10.length && this.field1007 != null) {
                    if (this.field1024.field172[0] != null) {
                        this.field1024.field172[this.field1007.field1529 + 1].method2(var10, true, this.field1007.field1528, var10.length);
                    }
                    if (!this.field1007.field1531 && this.field1007.field1529 == 3) {
                        this.field1007.field1531 = true;
                        this.field1007.field1529 = 93;
                    }
                    if (this.field1007.field1531) {
                        class16 var13 = this.field1036;
                        synchronized (this.field1036) {
                            this.field1036.method197(this.field1007);
                        }
                    } else {
                        this.field1007.method326();
                    }
                }
                this.field1039 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1016.close();
            } catch (Exception var15) {
            }
            this.field1016 = null;
            this.field1037 = null;
            this.field1042 = null;
            this.field1039 = 0;
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(LWIICVWRM;B)V")
    private final void method309(class63 arg0, byte arg1) {
        if (this.field1023 != arg1) {
            return;
        }
        try {
            if (this.field1016 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1028 < 4000L) {
                    return;
                }
                this.field1028 = var3;
                this.field1016 = this.field1024.method22(client.field181 + 43594);
                this.field1037 = this.field1016.getInputStream();
                this.field1042 = this.field1016.getOutputStream();
                this.field1042.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1037.read();
                }
                this.field1000 = 0;
            }
            this.field1009[0] = (byte) arg0.field1529;
            this.field1009[1] = (byte) (arg0.field1528 >> 8);
            this.field1009[2] = (byte) arg0.field1528;
            if (arg0.field1531) {
                this.field1009[3] = 2;
            } else if (this.field1024.field342) {
                this.field1009[3] = 0;
            } else {
                this.field1009[3] = 1;
            }
            this.field1042.write(this.field1009, 0, 4);
            this.field1026 = 0;
            this.field1006 = -10000;
        } catch (IOException var8) {
            try {
                this.field1016.close();
            } catch (Exception var7) {
            }
            this.field1016 = null;
            this.field1037 = null;
            this.field1042 = null;
            this.field1039 = 0;
            this.field1006++;
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(IIII)I")
    public final int method310(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 1 || arg3 > 1) {
            this.field997 = !this.field997;
        }
        int var5 = (arg2 << 8) + arg1;
        for (int var6 = 0; var6 < this.field1020.length; var6++) {
            if (this.field1020[var6] == var5) {
                if (arg0 == 0) {
                    return this.field1012[var6];
                }
                return this.field999[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "c", descriptor = "(II)Z")
    public final boolean method311(int arg0, int arg1) {
        if (arg1 != 19296) {
            throw new NullPointerException();
        }
        return this.field1021[arg0] == 1;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "d", descriptor = "(II)Z")
    public final boolean method312(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1020.length; var3++) {
            if (this.field999[var3] == arg0) {
                return true;
            }
        }
        if (arg1 >= 0) {
            this.field1001 = -154;
        }
        return false;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "(B)V")
    private final void method313(byte arg0) {
        if (arg0 != 67) {
            this.field1011 = !this.field1011;
        }
        while (this.field1040 == 0) {
            if (this.field1041 >= 10 || this.field1029 == 0) {
                return;
            }
            class16 var2 = this.field1031;
            class63 var3;
            synchronized (this.field1031) {
                var3 = (class63) this.field1031.method199();
            }
            while (var3 != null) {
                if (this.field1010[var3.field1529][var3.field1528] != 0) {
                    this.field1010[var3.field1529][var3.field1528] = 0;
                    this.field998.method197(var3);
                    this.method309(var3, this.field1019);
                    this.field1013 = true;
                    if (this.field1035 < this.field1008) {
                        this.field1035++;
                    }
                    this.field1004 = "Loading extra files - " + this.field1035 * 100 / this.field1008 + "%";
                    this.field1041++;
                    if (this.field1041 == 10) {
                        return;
                    }
                }
                class16 var4 = this.field1031;
                synchronized (this.field1031) {
                    var3 = (class63) this.field1031.method199();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1010[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1029) {
                        var6[var8] = 0;
                        class63 var9 = new class63();
                        var9.field1529 = var5;
                        var9.field1528 = var8;
                        var9.field1531 = false;
                        this.field998.method197(var9);
                        this.method309(var9, this.field1019);
                        this.field1013 = true;
                        if (this.field1035 < this.field1008) {
                            this.field1035++;
                        }
                        this.field1004 = "Loading extra files - " + this.field1035 * 100 / this.field1008 + "%";
                        this.field1041++;
                        if (this.field1041 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1029--;
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "()V")
    public final void method314() {
        this.field1032 = false;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "c", descriptor = "(B)I")
    public final int method315(byte arg0) {
        return arg0 == 113 ? this.field1015.length : 4;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(LRSPRYUFS;Lclient;)V")
    public final void method316(class49 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method427(var3[var4], null);
            int var27 = var26.length / 2;
            class36 var28 = new class36(-587, var26);
            this.field1003[var4] = new int[var27];
            this.field1010[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1003[var4][var29] = var28.method341();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method427(var5[var6], null);
            int var23 = var22.length / 4;
            class36 var24 = new class36(-587, var22);
            this.field1018[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1018[var6][var25] = var24.method344();
            }
        }
        byte[] var7 = arg0.method427("model_index", null);
        int var8 = this.field1003[0].length;
        this.field1002 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1002[var9] = var7[var9];
            } else {
                this.field1002[var9] = 0;
            }
        }
        byte[] var10 = arg0.method427("map_index", null);
        class36 var11 = new class36(-587, var10);
        int var12 = var10.length / 7;
        this.field1020 = new int[var12];
        this.field1012 = new int[var12];
        this.field999 = new int[var12];
        this.field1033 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1020[var13] = var11.method341();
            this.field1012[var13] = var11.method341();
            this.field999[var13] = var11.method341();
            this.field1033[var13] = var11.method339();
        }
        byte[] var14 = arg0.method427("anim_index", null);
        class36 var15 = new class36(-587, var14);
        int var16 = var14.length / 2;
        this.field1015 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1015[var17] = var15.method341();
        }
        byte[] var18 = arg0.method427("midi_index", null);
        class36 var19 = new class36(-587, var18);
        int var20 = var18.length;
        this.field1021 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1021[var21] = var19.method339();
        }
        this.field1024 = arg1;
        this.field1032 = true;
        this.field1024.method142(this, 2);
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(I[BIB)Z")
    private final boolean method317(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        if (arg3 != -27) {
            this.field996 = 75;
        }
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field1005.reset();
        this.field1005.update(arg1, 0, var5);
        int var7 = (int) this.field1005.getValue();
        if (arg2 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(Z)V")
    private final void method318(boolean arg0) {
        if (!arg0) {
            this.field1025 = !this.field1025;
        }
        this.field1040 = 0;
        this.field1041 = 0;
        for (class63 var2 = (class63) this.field998.method200(); var2 != null; var2 = (class63) this.field998.method202(8)) {
            if (var2.field1531) {
                this.field1040++;
            } else {
                this.field1041++;
            }
        }
        while (this.field1040 < 10) {
            class63 var3 = (class63) this.field1014.method199();
            if (var3 == null) {
                break;
            }
            if (this.field1010[var3.field1529][var3.field1528] != 0) {
                this.field1035++;
            }
            this.field1010[var3.field1529][var3.field1528] = 0;
            this.field998.method197(var3);
            this.field1040++;
            this.method309(var3, this.field1019);
            this.field1013 = true;
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "(I)V")
    public final void method319(int arg0) {
        class16 var2 = this.field1031;
        synchronized (this.field1031) {
            this.field1031.method204();
        }
        if (arg0 != 0) {
            this.field1001 = -61;
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(ZZ)V")
    public final void method320(boolean arg0, boolean arg1) {
        int var3 = this.field1020.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1033[var4] != 0) {
                this.method322(3, (byte) 2, (byte) 2, this.field999[var4]);
                this.method322(3, (byte) 2, (byte) 2, this.field1012[var4]);
            }
        }
        if (arg1) {
            this.field996 = -304;
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "c", descriptor = "()LWIICVWRM;")
    public final class63 method321() {
        class16 var1 = this.field1036;
        class63 var2;
        synchronized (this.field1036) {
            var2 = (class63) this.field1036.method199();
        }
        if (var2 == null) {
            return null;
        }
        class3 var3 = this.field1034;
        synchronized (this.field1034) {
            var2.method456();
        }
        if (var2.field1527 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1527));
            while (true) {
                if (this.field1030.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1030, var4, this.field1030.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1527 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1527[var7] = this.field1030[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(I)V")
    public final void method266(int arg0) {
        this.method306(0, arg0);
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(IBBI)V")
    public final void method322(int arg0, byte arg1, byte arg2, int arg3) {
        if (this.field1024.field172[0] == null || this.field1003[arg0][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field1024.field172[arg0 + 1].method1((byte) 6, arg3);
        if (this.method317(this.field1018[arg0][arg3], var5, this.field1003[arg0][arg3], (byte) -27)) {
            return;
        }
        this.field1010[arg0][arg3] = arg1;
        if (arg2 != 2) {
            this.field1025 = !this.field1025;
        }
        if (arg1 > this.field1029) {
            this.field1029 = arg1;
        }
        this.field1008++;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "b", descriptor = "(Z)V")
    private final void method323(boolean arg0) {
        if (!arg0) {
            return;
        }
        class16 var2 = this.field1022;
        class63 var3;
        synchronized (this.field1022) {
            var3 = (class63) this.field1022.method199();
        }
        while (var3 != null) {
            this.field1013 = true;
            byte[] var4 = null;
            if (this.field1024.field172[0] != null) {
                var4 = this.field1024.field172[var3.field1529 + 1].method1((byte) 6, var3.field1528);
            }
            if (!this.method317(this.field1018[var3.field1529][var3.field1528], var4, this.field1003[var3.field1529][var3.field1528], (byte) -27)) {
                var4 = null;
            }
            class16 var5 = this.field1022;
            synchronized (this.field1022) {
                if (var4 == null) {
                    this.field1014.method197(var3);
                } else {
                    var3.field1527 = var4;
                    class16 var6 = this.field1036;
                    synchronized (this.field1036) {
                        this.field1036.method197(var3);
                    }
                }
                var3 = (class63) this.field1022.method199();
            }
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "a", descriptor = "(III)V")
    public final void method324(int arg0, int arg1, int arg2) {
        if (this.field1024.field172[0] == null || (this.field1003[arg2][arg0] == 0 || (this.field1010[arg2][arg0] == 0 || this.field1029 == 0))) {
            return;
        }
        class63 var4 = new class63();
        if (arg1 <= 0) {
            return;
        }
        var4.field1529 = arg2;
        var4.field1528 = arg0;
        var4.field1531 = false;
        class16 var5 = this.field1031;
        synchronized (this.field1031) {
            this.field1031.method197(var4);
        }
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "e", descriptor = "(II)I")
    public final int method325(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field996 = 393;
        }
        return this.field1003[arg1].length;
    }

    @OriginalMember(owner = "client!NJYVZTLI", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1032) {
                this.field1027++;
                byte var1 = 20;
                if (this.field1029 == 0 && this.field1024.field172[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1013 = true;
                for (int var2 = 0; var2 < 100 && this.field1013; var2++) {
                    this.field1013 = false;
                    this.method323(true);
                    this.method318(true);
                    if (this.field1040 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method313((byte) 67);
                    if (this.field1037 != null) {
                        this.method308((byte) 8);
                    }
                }
                boolean var3 = false;
                for (class63 var4 = (class63) this.field998.method200(); var4 != null; var4 = (class63) this.field998.method202(8)) {
                    if (var4.field1531) {
                        var3 = true;
                        var4.field1530++;
                        if (var4.field1530 > 50) {
                            var4.field1530 = 0;
                            this.method309(var4, this.field1019);
                        }
                    }
                }
                if (!var3) {
                    for (class63 var5 = (class63) this.field998.method200(); var5 != null; var5 = (class63) this.field998.method202(8)) {
                        var3 = true;
                        var5.field1530++;
                        if (var5.field1530 > 50) {
                            var5.field1530 = 0;
                            this.method309(var5, this.field1019);
                        }
                    }
                }
                if (var3) {
                    this.field1000++;
                    if (this.field1000 > 750) {
                        try {
                            this.field1016.close();
                        } catch (Exception var8) {
                        }
                        this.field1016 = null;
                        this.field1037 = null;
                        this.field1042 = null;
                        this.field1039 = 0;
                    }
                } else {
                    this.field1000 = 0;
                    this.field1004 = "";
                }
                if (this.field1024.field342 && this.field1016 != null && this.field1042 != null && (this.field1029 > 0 || this.field1024.field172[0] == null)) {
                    this.field1026++;
                    if (this.field1026 > 500) {
                        this.field1026 = 0;
                        this.field1009[0] = 0;
                        this.field1009[1] = 0;
                        this.field1009[2] = 0;
                        this.field1009[3] = 10;
                        try {
                            this.field1042.write(this.field1009, 0, 4);
                        } catch (IOException var7) {
                            this.field1000 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }
}
