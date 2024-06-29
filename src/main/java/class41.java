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

@OriginalClass("client!NTGEPOMK")
public class class41 extends class29 implements Runnable {

    @OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "I")
    private int field1161 = 523;

    @OriginalMember(owner = "client!NTGEPOMK", name = "h", descriptor = "[[I")
    private int[][] field1167 = new int[4][];

    @OriginalMember(owner = "client!NTGEPOMK", name = "j", descriptor = "[[B")
    private byte[][] field1169 = new byte[4][];

    @OriginalMember(owner = "client!NTGEPOMK", name = "l", descriptor = "Ljava/lang/String;")
    public String field1171 = "";

    @OriginalMember(owner = "client!NTGEPOMK", name = "m", descriptor = "LCEEJCAVA;")
    private class5 field1172 = new class5(-7255);

    @OriginalMember(owner = "client!NTGEPOMK", name = "n", descriptor = "I")
    private int field1173 = 3;

    @OriginalMember(owner = "client!NTGEPOMK", name = "o", descriptor = "Z")
    private boolean field1174 = true;

    @OriginalMember(owner = "client!NTGEPOMK", name = "p", descriptor = "[B")
    private byte[] field1175 = new byte[500];

    @OriginalMember(owner = "client!NTGEPOMK", name = "s", descriptor = "LCEEJCAVA;")
    private class5 field1178 = new class5(-7255);

    @OriginalMember(owner = "client!NTGEPOMK", name = "w", descriptor = "Z")
    private boolean field1182 = true;

    @OriginalMember(owner = "client!NTGEPOMK", name = "x", descriptor = "LCEEJCAVA;")
    private class5 field1183 = new class5(-7255);

    @OriginalMember(owner = "client!NTGEPOMK", name = "y", descriptor = "LCEEJCAVA;")
    private class5 field1184 = new class5(-7255);

    @OriginalMember(owner = "client!NTGEPOMK", name = "F", descriptor = "LCEEJCAVA;")
    private class5 field1191 = new class5(-7255);

    @OriginalMember(owner = "client!NTGEPOMK", name = "J", descriptor = "LLIHZBJAU;")
    private class31 field1195 = new class31(0);

    @OriginalMember(owner = "client!NTGEPOMK", name = "K", descriptor = "[[I")
    private int[][] field1196 = new int[4][];

    @OriginalMember(owner = "client!NTGEPOMK", name = "L", descriptor = "Z")
    private boolean field1197 = false;

    @OriginalMember(owner = "client!NTGEPOMK", name = "M", descriptor = "I")
    private int field1198 = 208;

    @OriginalMember(owner = "client!NTGEPOMK", name = "O", descriptor = "[B")
    private byte[] field1200 = new byte[65000];

    @OriginalMember(owner = "client!NTGEPOMK", name = "P", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1201 = new CRC32();

    @OriginalMember(owner = "client!NTGEPOMK", name = "d", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!NTGEPOMK", name = "e", descriptor = "I")
    private int field1164;

    @OriginalMember(owner = "client!NTGEPOMK", name = "t", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!NTGEPOMK", name = "u", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client!NTGEPOMK", name = "v", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!NTGEPOMK", name = "A", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client!NTGEPOMK", name = "B", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client!NTGEPOMK", name = "D", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "client!NTGEPOMK", name = "E", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client!NTGEPOMK", name = "G", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!NTGEPOMK", name = "Q", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!NTGEPOMK", name = "c", descriptor = "J")
    private long field1162;

    @OriginalMember(owner = "client!NTGEPOMK", name = "C", descriptor = "LHEWLXUXO;")
    private class16 field1188;

    @OriginalMember(owner = "client!NTGEPOMK", name = "i", descriptor = "Lclient;")
    private client field1168;

    @OriginalMember(owner = "client!NTGEPOMK", name = "I", descriptor = "Ljava/io/InputStream;")
    private InputStream field1194;

    @OriginalMember(owner = "client!NTGEPOMK", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1176;

    @OriginalMember(owner = "client!NTGEPOMK", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field1170;

    @OriginalMember(owner = "client!NTGEPOMK", name = "H", descriptor = "[B")
    private byte[] field1193;

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "[I")
    private int[] field1160;

    @OriginalMember(owner = "client!NTGEPOMK", name = "f", descriptor = "[I")
    private int[] field1165;

    @OriginalMember(owner = "client!NTGEPOMK", name = "g", descriptor = "[I")
    private int[] field1166;

    @OriginalMember(owner = "client!NTGEPOMK", name = "r", descriptor = "[I")
    private int[] field1177;

    @OriginalMember(owner = "client!NTGEPOMK", name = "z", descriptor = "[I")
    private int[] field1185;

    @OriginalMember(owner = "client!NTGEPOMK", name = "N", descriptor = "[I")
    private int[] field1199;

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "()V")
    public final void method333() {
        this.field1174 = false;
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(Z)V")
    private final void method334(boolean arg0) {
        this.field1189 = 0;
        this.field1190 = 0;
        class16 var2 = (class16) this.field1183.method33();
        if (arg0) {
            return;
        }
        while (var2 != null) {
            if (var2.field739) {
                this.field1189++;
            } else {
                this.field1190++;
            }
            var2 = (class16) this.field1183.method35((byte) 8);
        }
        while (this.field1189 < 10) {
            class16 var3 = (class16) this.field1172.method32();
            if (var3 == null) {
                break;
            }
            if (this.field1169[var3.field736][var3.field737] != 0) {
                this.field1187++;
            }
            this.field1169[var3.field736][var3.field737] = 0;
            this.field1183.method30(var3);
            this.field1189++;
            this.method350(var3, 7904);
            this.field1197 = true;
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(I)V")
    public final void method242(int arg0) {
        this.method337(0, arg0);
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(I)V")
    private final void method335(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        class5 var2 = this.field1191;
        class16 var3;
        synchronized (this.field1191) {
            var3 = (class16) this.field1191.method32();
        }
        while (var3 != null) {
            this.field1197 = true;
            byte[] var4 = null;
            if (this.field1168.field306[0] != null) {
                var4 = this.field1168.field306[var3.field736 + 1].method219(5, var3.field737);
            }
            if (!this.method351(-532, this.field1196[var3.field736][var3.field737], var4, this.field1167[var3.field736][var3.field737])) {
                var4 = null;
            }
            class5 var5 = this.field1191;
            synchronized (this.field1191) {
                if (var4 == null) {
                    this.field1172.method30(var3);
                } else {
                    var3.field740 = var4;
                    class5 var6 = this.field1184;
                    synchronized (this.field1184) {
                        this.field1184.method30(var3);
                    }
                }
                var3 = (class16) this.field1191.method32();
            }
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(ZI)V")
    public final void method336(boolean arg0, int arg1) {
        int var3 = this.field1177.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1199[var4] != 0) {
                this.method345(3, (byte) 2, this.field1165[var4], 462);
                this.method345(3, (byte) 2, this.field1160[var4], 462);
            }
        }
        if (arg1 < 9 || arg1 > 9) {
            ;
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(II)V")
    public final void method337(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1196.length || arg1 < 0 || arg1 > this.field1196[arg0].length || this.field1196[arg0][arg1] == 0) {
            return;
        }
        class31 var3 = this.field1195;
        synchronized (this.field1195) {
            for (class16 var4 = (class16) this.field1195.method267(); var4 != null; var4 = (class16) this.field1195.method268((byte) 8)) {
                if (var4.field736 == arg0 && var4.field737 == arg1) {
                    return;
                }
            }
            class16 var5 = new class16();
            var5.field736 = arg0;
            var5.field737 = arg1;
            var5.field739 = true;
            class5 var6 = this.field1191;
            synchronized (this.field1191) {
                this.field1191.method30(var5);
            }
            this.field1195.method265(var5);
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(ZII)V")
    public final void method338(boolean arg0, int arg1, int arg2) {
        if (this.field1168.field306[0] == null || (this.field1196[arg2][arg1] == 0 || (this.field1169[arg2][arg1] == 0 || this.field1164 == 0))) {
            return;
        }
        class16 var4 = new class16();
        var4.field736 = arg2;
        var4.field737 = arg1;
        var4.field739 = false;
        class5 var5 = this.field1178;
        synchronized (this.field1178) {
            this.field1178.method30(var4);
        }
        if (arg0) {
            this.field1182 = !this.field1182;
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "()I")
    public final int method339() {
        class31 var1 = this.field1195;
        synchronized (this.field1195) {
            return this.field1195.method269();
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(IZ)Z")
    public final boolean method340(int arg0, boolean arg1) {
        if (arg1) {
            this.field1161 = -404;
        }
        return this.field1166[arg0] == 1;
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(B)I")
    public final int method341(byte arg0) {
        if (arg0 != 3) {
            this.field1161 = 380;
        }
        return this.field1185.length;
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(LESUFCMYV;Lclient;)V")
    public final void method342(class11 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method205(var3[var4], null);
            int var27 = var26.length / 2;
            class53 var28 = new class53(var26, (byte) -17);
            this.field1196[var4] = new int[var27];
            this.field1169[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1196[var4][var29] = var28.method457();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method205(var5[var6], null);
            int var23 = var22.length / 4;
            class53 var24 = new class53(var22, (byte) -17);
            this.field1167[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1167[var6][var25] = var24.method460();
            }
        }
        byte[] var7 = arg0.method205("model_index", null);
        int var8 = this.field1196[0].length;
        this.field1193 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1193[var9] = var7[var9];
            } else {
                this.field1193[var9] = 0;
            }
        }
        byte[] var10 = arg0.method205("map_index", null);
        class53 var11 = new class53(var10, (byte) -17);
        int var12 = var10.length / 7;
        this.field1177 = new int[var12];
        this.field1160 = new int[var12];
        this.field1165 = new int[var12];
        this.field1199 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1177[var13] = var11.method457();
            this.field1160[var13] = var11.method457();
            this.field1165[var13] = var11.method457();
            this.field1199[var13] = var11.method455();
        }
        byte[] var14 = arg0.method205("anim_index", null);
        class53 var15 = new class53(var14, (byte) -17);
        int var16 = var14.length / 2;
        this.field1185 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1185[var17] = var15.method457();
        }
        byte[] var18 = arg0.method205("midi_index", null);
        class53 var19 = new class53(var18, (byte) -17);
        int var20 = var18.length;
        this.field1166 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1166[var21] = var19.method455();
        }
        this.field1168 = arg1;
        this.field1174 = true;
        this.field1168.method123(this, 2);
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(B)V")
    public final void method343(byte arg0) {
        class5 var2 = this.field1178;
        synchronized (this.field1178) {
            this.field1178.method37();
        }
        if (arg0 == -72) {
            ;
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(Z)V")
    private final void method344(boolean arg0) {
        if (arg0) {
            return;
        }
        while (this.field1189 == 0) {
            if (this.field1190 >= 10 || this.field1164 == 0) {
                return;
            }
            class5 var2 = this.field1178;
            class16 var3;
            synchronized (this.field1178) {
                var3 = (class16) this.field1178.method32();
            }
            while (var3 != null) {
                if (this.field1169[var3.field736][var3.field737] != 0) {
                    this.field1169[var3.field736][var3.field737] = 0;
                    this.field1183.method30(var3);
                    this.method350(var3, 7904);
                    this.field1197 = true;
                    if (this.field1187 < this.field1181) {
                        this.field1187++;
                    }
                    this.field1171 = "Loading extra files - " + this.field1187 * 100 / this.field1181 + "%";
                    this.field1190++;
                    if (this.field1190 == 10) {
                        return;
                    }
                }
                class5 var4 = this.field1178;
                synchronized (this.field1178) {
                    var3 = (class16) this.field1178.method32();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1169[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1164) {
                        var6[var8] = 0;
                        class16 var9 = new class16();
                        var9.field736 = var5;
                        var9.field737 = var8;
                        var9.field739 = false;
                        this.field1183.method30(var9);
                        this.method350(var9, 7904);
                        this.field1197 = true;
                        if (this.field1187 < this.field1181) {
                            this.field1187++;
                        }
                        this.field1171 = "Loading extra files - " + this.field1187 * 100 / this.field1181 + "%";
                        this.field1190++;
                        if (this.field1190 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1164--;
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(IBII)V")
    public final void method345(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field1168.field306[0] == null || this.field1196[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1168.field306[arg0 + 1].method219(5, arg2);
        if (this.method351(-532, this.field1196[arg0][arg2], var5, this.field1167[arg0][arg2])) {
            return;
        }
        this.field1169[arg0][arg2] = arg1;
        if (arg3 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg1 > this.field1164) {
            this.field1164 = arg1;
        }
        this.field1181++;
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "c", descriptor = "(I)V")
    private final void method346(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        try {
            int var2 = this.field1194.available();
            if (this.field1180 == 0 && var2 >= 6) {
                this.field1197 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1194.read(this.field1175, var3, 6 - var3)) {
                }
                int var4 = this.field1175[0] & 0xFF;
                int var5 = ((this.field1175[1] & 0xFF) << 8) + (this.field1175[2] & 0xFF);
                int var6 = ((this.field1175[3] & 0xFF) << 8) + (this.field1175[4] & 0xFF);
                int var7 = this.field1175[5] & 0xFF;
                this.field1188 = null;
                for (class16 var8 = (class16) this.field1183.method33(); var8 != null; var8 = (class16) this.field1183.method35((byte) 8)) {
                    if (var8.field736 == var4 && var8.field737 == var5) {
                        this.field1188 = var8;
                    }
                    if (this.field1188 != null) {
                        var8.field738 = 0;
                    }
                }
                if (this.field1188 != null) {
                    this.field1186 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1188.field740 = null;
                        if (this.field1188.field739) {
                            class5 var9 = this.field1184;
                            synchronized (this.field1184) {
                                this.field1184.method30(this.field1188);
                            }
                        } else {
                            this.field1188.method505();
                        }
                        this.field1188 = null;
                    } else {
                        if (this.field1188.field740 == null && var7 == 0) {
                            this.field1188.field740 = new byte[var6];
                        }
                        if (this.field1188.field740 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1179 = var7 * 500;
                this.field1180 = 500;
                if (this.field1180 > var6 - var7 * 500) {
                    this.field1180 = var6 - var7 * 500;
                }
            }
            if (this.field1180 > 0 && var2 >= this.field1180) {
                this.field1197 = true;
                byte[] var10 = this.field1175;
                int var11 = 0;
                if (this.field1188 != null) {
                    var10 = this.field1188.field740;
                    var11 = this.field1179;
                }
                for (int var12 = 0; var12 < this.field1180; var12 += this.field1194.read(var10, var11 + var12, this.field1180 - var12)) {
                }
                if (this.field1180 + this.field1179 >= var10.length && this.field1188 != null) {
                    if (this.field1168.field306[0] != null) {
                        this.field1168.field306[this.field1188.field736 + 1].method220(false, var10.length, this.field1188.field737, var10);
                    }
                    if (!this.field1188.field739 && this.field1188.field736 == 3) {
                        this.field1188.field739 = true;
                        this.field1188.field736 = 93;
                    }
                    if (this.field1188.field739) {
                        class5 var13 = this.field1184;
                        synchronized (this.field1184) {
                            this.field1184.method30(this.field1188);
                        }
                    } else {
                        this.field1188.method505();
                    }
                }
                this.field1180 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1170.close();
            } catch (Exception var15) {
            }
            this.field1170 = null;
            this.field1194 = null;
            this.field1176 = null;
            this.field1180 = 0;
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "c", descriptor = "()LHEWLXUXO;")
    public final class16 method347() {
        class5 var1 = this.field1184;
        class16 var2;
        synchronized (this.field1184) {
            var2 = (class16) this.field1184.method32();
        }
        if (var2 == null) {
            return null;
        }
        class31 var3 = this.field1195;
        synchronized (this.field1195) {
            var2.method423();
        }
        if (var2.field740 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field740));
            while (true) {
                if (this.field1200.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1200, var4, this.field1200.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field740 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field740[var7] = this.field1200[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(IZ)I")
    public final int method348(int arg0, boolean arg1) {
        if (arg1) {
            this.field1161 = -496;
        }
        return this.field1196[arg0].length;
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1174) {
                this.field1192++;
                byte var1 = 20;
                if (this.field1164 == 0 && this.field1168.field306[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1197 = true;
                for (int var2 = 0; var2 < 100 && this.field1197; var2++) {
                    this.field1197 = false;
                    this.method335(-613);
                    this.method334(false);
                    if (this.field1189 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method344(false);
                    if (this.field1194 != null) {
                        this.method346(-607);
                    }
                }
                boolean var3 = false;
                for (class16 var4 = (class16) this.field1183.method33(); var4 != null; var4 = (class16) this.field1183.method35((byte) 8)) {
                    if (var4.field739) {
                        var3 = true;
                        var4.field738++;
                        if (var4.field738 > 50) {
                            var4.field738 = 0;
                            this.method350(var4, 7904);
                        }
                    }
                }
                if (!var3) {
                    for (class16 var5 = (class16) this.field1183.method33(); var5 != null; var5 = (class16) this.field1183.method35((byte) 8)) {
                        var3 = true;
                        var5.field738++;
                        if (var5.field738 > 50) {
                            var5.field738 = 0;
                            this.method350(var5, 7904);
                        }
                    }
                }
                if (var3) {
                    this.field1186++;
                    if (this.field1186 > 750) {
                        try {
                            this.field1170.close();
                        } catch (Exception var8) {
                        }
                        this.field1170 = null;
                        this.field1194 = null;
                        this.field1176 = null;
                        this.field1180 = 0;
                    }
                } else {
                    this.field1186 = 0;
                    this.field1171 = "";
                }
                if (this.field1168.field196 && this.field1170 != null && this.field1176 != null && (this.field1164 > 0 || this.field1168.field306[0] == null)) {
                    this.field1202++;
                    if (this.field1202 > 500) {
                        this.field1202 = 0;
                        this.field1175[0] = 0;
                        this.field1175[1] = 0;
                        this.field1175[2] = 0;
                        this.field1175[3] = 10;
                        try {
                            this.field1176.write(this.field1175, 0, 4);
                        } catch (IOException var7) {
                            this.field1186 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(IB)Z")
    public final boolean method349(int arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < this.field1177.length; var5++) {
            if (this.field1165[var5] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(LHEWLXUXO;I)V")
    private final void method350(class16 arg0, int arg1) {
        if (arg1 != 7904) {
            this.field1161 = 68;
        }
        try {
            if (this.field1170 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1162 < 4000L) {
                    return;
                }
                this.field1162 = var3;
                this.field1170 = this.field1168.method38(client.field289 + 43594);
                this.field1194 = this.field1170.getInputStream();
                this.field1176 = this.field1170.getOutputStream();
                this.field1176.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1194.read();
                }
                this.field1186 = 0;
            }
            this.field1175[0] = (byte) arg0.field736;
            this.field1175[1] = (byte) (arg0.field737 >> 8);
            this.field1175[2] = (byte) arg0.field737;
            if (arg0.field739) {
                this.field1175[3] = 2;
            } else if (this.field1168.field196) {
                this.field1175[3] = 0;
            } else {
                this.field1175[3] = 1;
            }
            this.field1176.write(this.field1175, 0, 4);
            this.field1202 = 0;
            this.field1163 = -10000;
        } catch (IOException var8) {
            try {
                this.field1170.close();
            } catch (Exception var7) {
            }
            this.field1170 = null;
            this.field1194 = null;
            this.field1176 = null;
            this.field1180 = 0;
            this.field1163++;
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(II[BI)Z")
    private final boolean method351(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg2 == null || arg2.length < 2) {
            return false;
        }
        int var5 = arg2.length - 2;
        int var6 = ((arg2[var5] & 0xFF) << 8) + (arg2[var5 + 1] & 0xFF);
        while (arg0 >= 0) {
            this.field1173 = -127;
        }
        this.field1201.reset();
        this.field1201.update(arg2, 0, var5);
        int var7 = (int) this.field1201.getValue();
        if (arg1 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "a", descriptor = "(IIII)I")
    public final int method352(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg2 << 8) + arg0;
        for (int var6 = 0; var6 < this.field1177.length; var6++) {
            if (this.field1177[var6] == var5) {
                if (arg3 == 0) {
                    return this.field1160[var6];
                }
                return this.field1165[var6];
            }
        }
        return arg1 <= 0 ? this.field1173 : -1;
    }

    @OriginalMember(owner = "client!NTGEPOMK", name = "b", descriptor = "(ZI)I")
    public final int method353(boolean arg0, int arg1) {
        return arg0 ? this.field1193[arg1] & 0xFF : this.field1173;
    }
}
