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

@OriginalClass("client!QJAHKUCY")
public class class47 extends class12 implements Runnable {

    @OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "Z")
    private boolean field1127 = true;

    @OriginalMember(owner = "client!QJAHKUCY", name = "e", descriptor = "Ljava/lang/String;")
    public String field1130 = "";

    @OriginalMember(owner = "client!QJAHKUCY", name = "f", descriptor = "LEZXKBAZY;")
    private class17 field1131 = new class17(false);

    @OriginalMember(owner = "client!QJAHKUCY", name = "h", descriptor = "[[I")
    private int[][] field1133 = new int[4][];

    @OriginalMember(owner = "client!QJAHKUCY", name = "k", descriptor = "[[I")
    private int[][] field1136 = new int[4][];

    @OriginalMember(owner = "client!QJAHKUCY", name = "m", descriptor = "LEZXKBAZY;")
    private class17 field1138 = new class17(false);

    @OriginalMember(owner = "client!QJAHKUCY", name = "o", descriptor = "[B")
    private byte[] field1140 = new byte[65000];

    @OriginalMember(owner = "client!QJAHKUCY", name = "p", descriptor = "I")
    private int field1141 = -289;

    @OriginalMember(owner = "client!QJAHKUCY", name = "q", descriptor = "LJTFJPMGL;")
    private class28 field1142 = new class28(-120);

    @OriginalMember(owner = "client!QJAHKUCY", name = "u", descriptor = "LEZXKBAZY;")
    private class17 field1146 = new class17(false);

    @OriginalMember(owner = "client!QJAHKUCY", name = "w", descriptor = "Z")
    private boolean field1148 = false;

    @OriginalMember(owner = "client!QJAHKUCY", name = "z", descriptor = "LEZXKBAZY;")
    private class17 field1151 = new class17(false);

    @OriginalMember(owner = "client!QJAHKUCY", name = "A", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1152 = new CRC32();

    @OriginalMember(owner = "client!QJAHKUCY", name = "H", descriptor = "[B")
    private byte[] field1159 = new byte[500];

    @OriginalMember(owner = "client!QJAHKUCY", name = "I", descriptor = "Z")
    private boolean field1160 = false;

    @OriginalMember(owner = "client!QJAHKUCY", name = "K", descriptor = "[[B")
    private byte[][] field1162 = new byte[4][];

    @OriginalMember(owner = "client!QJAHKUCY", name = "L", descriptor = "Z")
    private boolean field1163 = true;

    @OriginalMember(owner = "client!QJAHKUCY", name = "M", descriptor = "I")
    private int field1164 = 707;

    @OriginalMember(owner = "client!QJAHKUCY", name = "O", descriptor = "I")
    private int field1166 = 165;

    @OriginalMember(owner = "client!QJAHKUCY", name = "R", descriptor = "LEZXKBAZY;")
    private class17 field1169 = new class17(false);

    @OriginalMember(owner = "client!QJAHKUCY", name = "c", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client!QJAHKUCY", name = "g", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client!QJAHKUCY", name = "r", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client!QJAHKUCY", name = "s", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!QJAHKUCY", name = "t", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!QJAHKUCY", name = "D", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!QJAHKUCY", name = "E", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!QJAHKUCY", name = "F", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!QJAHKUCY", name = "G", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!QJAHKUCY", name = "J", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!QJAHKUCY", name = "Q", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client!QJAHKUCY", name = "P", descriptor = "J")
    private long field1167;

    @OriginalMember(owner = "client!QJAHKUCY", name = "d", descriptor = "LACXEOGCN;")
    private class2 field1129;

    @OriginalMember(owner = "client!QJAHKUCY", name = "B", descriptor = "Lclient;")
    private client field1153;

    @OriginalMember(owner = "client!QJAHKUCY", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field1147;

    @OriginalMember(owner = "client!QJAHKUCY", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1150;

    @OriginalMember(owner = "client!QJAHKUCY", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field1134;

    @OriginalMember(owner = "client!QJAHKUCY", name = "l", descriptor = "[B")
    private byte[] field1137;

    @OriginalMember(owner = "client!QJAHKUCY", name = "j", descriptor = "[I")
    private int[] field1135;

    @OriginalMember(owner = "client!QJAHKUCY", name = "n", descriptor = "[I")
    private int[] field1139;

    @OriginalMember(owner = "client!QJAHKUCY", name = "x", descriptor = "[I")
    private int[] field1149;

    @OriginalMember(owner = "client!QJAHKUCY", name = "C", descriptor = "[I")
    private int[] field1154;

    @OriginalMember(owner = "client!QJAHKUCY", name = "N", descriptor = "[I")
    private int[] field1165;

    @OriginalMember(owner = "client!QJAHKUCY", name = "S", descriptor = "[I")
    private int[] field1170;

    @OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "(I)I")
    public final int method354(int arg0) {
        if (arg0 != 16517) {
            this.field1148 = !this.field1148;
        }
        return this.field1149.length;
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(ZI)V")
    public final void method355(boolean arg0, int arg1) {
        int var3 = this.field1139.length;
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg0 || this.field1165[var5] != 0) {
                this.method361(this.field1170[var5], -155, (byte) 2, 3);
                this.method361(this.field1154[var5], -155, (byte) 2, 3);
            }
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(ILACXEOGCN;)V")
    private final void method356(int arg0, class2 arg1) {
        if (arg0 >= 0) {
            return;
        }
        try {
            if (this.field1134 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1167 < 4000L) {
                    return;
                }
                this.field1167 = var3;
                this.field1134 = this.field1153.method111(client.field515 + 43594);
                this.field1147 = this.field1134.getInputStream();
                this.field1150 = this.field1134.getOutputStream();
                this.field1150.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1147.read();
                }
                this.field1132 = 0;
            }
            this.field1159[0] = (byte) arg1.field11;
            this.field1159[1] = (byte) (arg1.field10 >> 8);
            this.field1159[2] = (byte) arg1.field10;
            if (arg1.field12) {
                this.field1159[3] = 2;
            } else if (this.field1153.field269) {
                this.field1159[3] = 0;
            } else {
                this.field1159[3] = 1;
            }
            this.field1150.write(this.field1159, 0, 4);
            this.field1128 = 0;
            this.field1161 = -10000;
        } catch (IOException var8) {
            try {
                this.field1134.close();
            } catch (Exception var7) {
            }
            this.field1134 = null;
            this.field1147 = null;
            this.field1150 = null;
            this.field1156 = 0;
            this.field1161++;
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(LFXNTEMPE;Lclient;)V")
    public final void method357(class18 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method212(var3[var4], null);
            int var27 = var26.length / 2;
            class50 var28 = new class50(var26, -46859);
            this.field1136[var4] = new int[var27];
            this.field1162[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1136[var4][var29] = var28.method390();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method212(var5[var6], null);
            int var23 = var22.length / 4;
            class50 var24 = new class50(var22, -46859);
            this.field1133[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1133[var6][var25] = var24.method393();
            }
        }
        byte[] var7 = arg0.method212("model_index", null);
        int var8 = this.field1136[0].length;
        this.field1137 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1137[var9] = var7[var9];
            } else {
                this.field1137[var9] = 0;
            }
        }
        byte[] var10 = arg0.method212("map_index", null);
        class50 var11 = new class50(var10, -46859);
        int var12 = var10.length / 7;
        this.field1139 = new int[var12];
        this.field1154 = new int[var12];
        this.field1170 = new int[var12];
        this.field1165 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1139[var13] = var11.method390();
            this.field1154[var13] = var11.method390();
            this.field1170[var13] = var11.method390();
            this.field1165[var13] = var11.method388();
        }
        byte[] var14 = arg0.method212("anim_index", null);
        class50 var15 = new class50(var14, -46859);
        int var16 = var14.length / 2;
        this.field1149 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1149[var17] = var15.method390();
        }
        byte[] var18 = arg0.method212("midi_index", null);
        class50 var19 = new class50(var18, -46859);
        int var20 = var18.length;
        this.field1135 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1135[var21] = var19.method388();
        }
        this.field1153 = arg1;
        this.field1163 = true;
        this.field1153.method54(this, 2);
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1163) {
                this.field1145++;
                byte var1 = 20;
                if (this.field1158 == 0 && this.field1153.field379[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1160 = true;
                for (int var2 = 0; var2 < 100 && this.field1160; var2++) {
                    this.field1160 = false;
                    this.method362(0);
                    this.method369(this.field1164);
                    if (this.field1143 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method363((byte) 6);
                    if (this.field1147 != null) {
                        this.method371(2412);
                    }
                }
                boolean var3 = false;
                for (class2 var4 = (class2) this.field1151.method206(); var4 != null; var4 = (class2) this.field1151.method208(262)) {
                    if (var4.field12) {
                        var3 = true;
                        var4.field13++;
                        if (var4.field13 > 50) {
                            var4.field13 = 0;
                            this.method356(-513, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class2 var5 = (class2) this.field1151.method206(); var5 != null; var5 = (class2) this.field1151.method208(262)) {
                        var3 = true;
                        var5.field13++;
                        if (var5.field13 > 50) {
                            var5.field13 = 0;
                            this.method356(-513, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1132++;
                    if (this.field1132 > 750) {
                        try {
                            this.field1134.close();
                        } catch (Exception var8) {
                        }
                        this.field1134 = null;
                        this.field1147 = null;
                        this.field1150 = null;
                        this.field1156 = 0;
                    }
                } else {
                    this.field1132 = 0;
                    this.field1130 = "";
                }
                if (this.field1153.field269 && this.field1134 != null && this.field1150 != null && (this.field1158 > 0 || this.field1153.field379[0] == null)) {
                    this.field1128++;
                    if (this.field1128 > 500) {
                        this.field1128 = 0;
                        this.field1159[0] = 0;
                        this.field1159[1] = 0;
                        this.field1159[2] = 0;
                        this.field1159[3] = 10;
                        try {
                            this.field1150.write(this.field1159, 0, 4);
                        } catch (IOException var7) {
                            this.field1132 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(I)V")
    public final void method177(int arg0) {
        this.method370(0, arg0);
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(IB)Z")
    public final boolean method358(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field1139.length; var3++) {
            if (this.field1170[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 123) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "c", descriptor = "(I)V")
    public final void method359(int arg0) {
        class17 var2 = this.field1131;
        synchronized (this.field1131) {
            this.field1131.method210();
        }
        if (arg0 != -41110) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(II)I")
    public final int method360(int arg0, int arg1) {
        return arg1 >= 1 && arg1 <= 1 ? this.field1136[arg0].length : 2;
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(IIBI)V")
    public final void method361(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field1153.field379[0] == null || this.field1136[arg3][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field1153.field379[arg3 + 1].method593(arg0, (byte) 46);
        if (this.method374(var5, 9, this.field1133[arg3][arg0], this.field1136[arg3][arg0])) {
            return;
        }
        this.field1162[arg3][arg0] = arg2;
        if (arg1 < 0) {
            if (arg2 > this.field1158) {
                this.field1158 = arg2;
            }
            this.field1168++;
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "d", descriptor = "(I)V")
    private final void method362(int arg0) {
        class17 var2 = this.field1169;
        class2 var3;
        synchronized (this.field1169) {
            var3 = (class2) this.field1169.method205();
        }
        if (arg0 != 0) {
            this.field1166 = -131;
        }
        while (var3 != null) {
            this.field1160 = true;
            byte[] var4 = null;
            if (this.field1153.field379[0] != null) {
                var4 = this.field1153.field379[var3.field11 + 1].method593(var3.field10, (byte) 46);
            }
            if (!this.method374(var4, 9, this.field1133[var3.field11][var3.field10], this.field1136[var3.field11][var3.field10])) {
                var4 = null;
            }
            class17 var5 = this.field1169;
            synchronized (this.field1169) {
                if (var4 == null) {
                    this.field1146.method203(var3);
                } else {
                    var3.field14 = var4;
                    class17 var6 = this.field1138;
                    synchronized (this.field1138) {
                        this.field1138.method203(var3);
                    }
                }
                var3 = (class2) this.field1169.method205();
            }
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(B)V")
    private final void method363(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field1141 = -109;
        }
        while (this.field1143 == 0) {
            if (this.field1144 >= 10 || this.field1158 == 0) {
                return;
            }
            class17 var3 = this.field1131;
            class2 var4;
            synchronized (this.field1131) {
                var4 = (class2) this.field1131.method205();
            }
            while (var4 != null) {
                if (this.field1162[var4.field11][var4.field10] != 0) {
                    this.field1162[var4.field11][var4.field10] = 0;
                    this.field1151.method203(var4);
                    this.method356(-513, var4);
                    this.field1160 = true;
                    if (this.field1157 < this.field1168) {
                        this.field1157++;
                    }
                    this.field1130 = "Loading extra files - " + this.field1157 * 100 / this.field1168 + "%";
                    this.field1144++;
                    if (this.field1144 == 10) {
                        return;
                    }
                }
                class17 var5 = this.field1131;
                synchronized (this.field1131) {
                    var4 = (class2) this.field1131.method205();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field1162[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field1158) {
                        var7[var9] = 0;
                        class2 var10 = new class2();
                        var10.field11 = var6;
                        var10.field10 = var9;
                        var10.field12 = false;
                        this.field1151.method203(var10);
                        this.method356(-513, var10);
                        this.field1160 = true;
                        if (this.field1157 < this.field1168) {
                            this.field1157++;
                        }
                        this.field1130 = "Loading extra files - " + this.field1157 * 100 / this.field1168 + "%";
                        this.field1144++;
                        if (this.field1144 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1158--;
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(BI)I")
    public final int method364(byte arg0, int arg1) {
        if (arg0 != 4) {
            this.field1148 = !this.field1148;
        }
        return this.field1137[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "(IIBI)I")
    public final int method365(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = (arg0 << 8) + arg3;
        for (int var6 = 0; var6 < this.field1139.length; var6++) {
            if (this.field1139[var6] == var5) {
                if (arg1 == 0) {
                    return this.field1154[var6];
                }
                return this.field1170[var6];
            }
        }
        if (arg2 != 14) {
            this.field1148 = !this.field1148;
        }
        return -1;
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "()V")
    public final void method366() {
        this.field1163 = false;
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "()I")
    public final int method367() {
        class28 var1 = this.field1142;
        synchronized (this.field1142) {
            return this.field1142.method274();
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "c", descriptor = "()LACXEOGCN;")
    public final class2 method368() {
        class17 var1 = this.field1138;
        class2 var2;
        synchronized (this.field1138) {
            var2 = (class2) this.field1138.method205();
        }
        if (var2 == null) {
            return null;
        }
        class28 var3 = this.field1142;
        synchronized (this.field1142) {
            var2.method213();
        }
        if (var2.field14 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field14));
            while (true) {
                if (this.field1140.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1140, var4, this.field1140.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field14 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field14[var7] = this.field1140[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "e", descriptor = "(I)V")
    private final void method369(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        this.field1143 = 0;
        this.field1144 = 0;
        for (class2 var2 = (class2) this.field1151.method206(); var2 != null; var2 = (class2) this.field1151.method208(262)) {
            if (var2.field12) {
                this.field1143++;
            } else {
                this.field1144++;
            }
        }
        while (this.field1143 < 10) {
            class2 var3 = (class2) this.field1146.method205();
            if (var3 == null) {
                break;
            }
            if (this.field1162[var3.field11][var3.field10] != 0) {
                this.field1157++;
            }
            this.field1162[var3.field11][var3.field10] = 0;
            this.field1151.method203(var3);
            this.field1143++;
            this.method356(-513, var3);
            this.field1160 = true;
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "(II)V")
    public final void method370(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1136.length || arg1 < 0 || arg1 > this.field1136[arg0].length || this.field1136[arg0][arg1] == 0) {
            return;
        }
        class28 var3 = this.field1142;
        synchronized (this.field1142) {
            for (class2 var4 = (class2) this.field1142.method272(); var4 != null; var4 = (class2) this.field1142.method273(262)) {
                if (var4.field11 == arg0 && var4.field10 == arg1) {
                    return;
                }
            }
            class2 var5 = new class2();
            var5.field11 = arg0;
            var5.field10 = arg1;
            var5.field12 = true;
            class17 var6 = this.field1169;
            synchronized (this.field1169) {
                this.field1169.method203(var5);
            }
            this.field1142.method270(var5);
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "f", descriptor = "(I)V")
    private final void method371(int arg0) {
        if (arg0 != 2412) {
            this.field1127 = !this.field1127;
        }
        try {
            int var2 = this.field1147.available();
            if (this.field1156 == 0 && var2 >= 6) {
                this.field1160 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1147.read(this.field1159, var3, 6 - var3)) {
                }
                int var4 = this.field1159[0] & 0xFF;
                int var5 = ((this.field1159[1] & 0xFF) << 8) + (this.field1159[2] & 0xFF);
                int var6 = ((this.field1159[3] & 0xFF) << 8) + (this.field1159[4] & 0xFF);
                int var7 = this.field1159[5] & 0xFF;
                this.field1129 = null;
                for (class2 var8 = (class2) this.field1151.method206(); var8 != null; var8 = (class2) this.field1151.method208(262)) {
                    if (var8.field11 == var4 && var8.field10 == var5) {
                        this.field1129 = var8;
                    }
                    if (this.field1129 != null) {
                        var8.field13 = 0;
                    }
                }
                if (this.field1129 != null) {
                    this.field1132 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1129.field14 = null;
                        if (this.field1129.field12) {
                            class17 var9 = this.field1138;
                            synchronized (this.field1138) {
                                this.field1138.method203(this.field1129);
                            }
                        } else {
                            this.field1129.method20();
                        }
                        this.field1129 = null;
                    } else {
                        if (this.field1129.field14 == null && var7 == 0) {
                            this.field1129.field14 = new byte[var6];
                        }
                        if (this.field1129.field14 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1155 = var7 * 500;
                this.field1156 = 500;
                if (this.field1156 > var6 - var7 * 500) {
                    this.field1156 = var6 - var7 * 500;
                }
            }
            if (this.field1156 > 0 && var2 >= this.field1156) {
                this.field1160 = true;
                byte[] var10 = this.field1159;
                int var11 = 0;
                if (this.field1129 != null) {
                    var10 = this.field1129.field14;
                    var11 = this.field1155;
                }
                for (int var12 = 0; var12 < this.field1156; var12 += this.field1147.read(var10, var11 + var12, this.field1156 - var12)) {
                }
                if (this.field1156 + this.field1155 >= var10.length && this.field1129 != null) {
                    if (this.field1153.field379[0] != null) {
                        this.field1153.field379[this.field1129.field11 + 1].method594((byte) 56, var10, var10.length, this.field1129.field10);
                    }
                    if (!this.field1129.field12 && this.field1129.field11 == 3) {
                        this.field1129.field12 = true;
                        this.field1129.field11 = 93;
                    }
                    if (this.field1129.field12) {
                        class17 var13 = this.field1138;
                        synchronized (this.field1138) {
                            this.field1138.method203(this.field1129);
                        }
                    } else {
                        this.field1129.method20();
                    }
                }
                this.field1156 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1134.close();
            } catch (Exception var15) {
            }
            this.field1134 = null;
            this.field1147 = null;
            this.field1150 = null;
            this.field1156 = 0;
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "b", descriptor = "(BI)Z")
    public final boolean method372(byte arg0, int arg1) {
        if (arg0 != 8) {
            this.field1127 = !this.field1127;
        }
        return this.field1135[arg1] == 1;
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "(III)V")
    public final void method373(int arg0, int arg1, int arg2) {
        if (this.field1153.field379[0] == null || (this.field1136[arg1][arg0] == 0 || (this.field1162[arg1][arg0] == 0 || this.field1158 == 0))) {
            return;
        }
        class2 var4 = new class2();
        var4.field11 = arg1;
        var4.field10 = arg0;
        var4.field12 = false;
        int var5 = 87 / arg2;
        class17 var6 = this.field1131;
        synchronized (this.field1131) {
            this.field1131.method203(var4);
        }
    }

    @OriginalMember(owner = "client!QJAHKUCY", name = "a", descriptor = "([BIII)Z")
    private final boolean method374(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        if (arg1 < 9 || arg1 > 9) {
            throw new NullPointerException();
        }
        this.field1152.reset();
        this.field1152.update(arg0, 0, var5);
        int var7 = (int) this.field1152.getValue();
        if (arg3 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }
}
