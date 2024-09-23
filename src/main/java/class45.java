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

@OriginalClass("OBRIXRSB")
public class class45 extends class31 implements Runnable {

    @OriginalMember(owner = "OBRIXRSB", name = "c", descriptor = "LBGEXEDZG;")
    private class3 field1109 = new class3((byte) 3);

    @OriginalMember(owner = "OBRIXRSB", name = "e", descriptor = "[[I")
    private int[][] field1111 = new int[4][];

    @OriginalMember(owner = "OBRIXRSB", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1112 = new CRC32();

    @OriginalMember(owner = "OBRIXRSB", name = "g", descriptor = "[[I")
    private int[][] field1113 = new int[4][];

    @OriginalMember(owner = "OBRIXRSB", name = "h", descriptor = "[B")
    private byte[] field1114 = new byte[500];

    @OriginalMember(owner = "OBRIXRSB", name = "i", descriptor = "Ljava/lang/String;")
    public String field1115 = "";

    @OriginalMember(owner = "OBRIXRSB", name = "j", descriptor = "Z")
    private boolean field1116 = true;

    @OriginalMember(owner = "OBRIXRSB", name = "l", descriptor = "B")
    private byte field1118 = 9;

    @OriginalMember(owner = "OBRIXRSB", name = "n", descriptor = "Z")
    private boolean field1120 = true;

    @OriginalMember(owner = "OBRIXRSB", name = "t", descriptor = "[B")
    private byte[] field1126 = new byte[65000];

    @OriginalMember(owner = "OBRIXRSB", name = "u", descriptor = "LCLCMCMIN;")
    private class9 field1127 = new class9(field1153);

    @OriginalMember(owner = "OBRIXRSB", name = "v", descriptor = "Z")
    private boolean field1128 = true;

    @OriginalMember(owner = "OBRIXRSB", name = "B", descriptor = "I")
    private int field1134 = -212;

    @OriginalMember(owner = "OBRIXRSB", name = "C", descriptor = "LCLCMCMIN;")
    private class9 field1135 = new class9(field1153);

    @OriginalMember(owner = "OBRIXRSB", name = "D", descriptor = "LCLCMCMIN;")
    private class9 field1136 = new class9(field1153);

    @OriginalMember(owner = "OBRIXRSB", name = "E", descriptor = "LCLCMCMIN;")
    private class9 field1137 = new class9(field1153);

    @OriginalMember(owner = "OBRIXRSB", name = "G", descriptor = "Z")
    private boolean field1139 = true;

    @OriginalMember(owner = "OBRIXRSB", name = "I", descriptor = "Z")
    private boolean field1141 = false;

    @OriginalMember(owner = "OBRIXRSB", name = "J", descriptor = "I")
    private int field1142 = -514;

    @OriginalMember(owner = "OBRIXRSB", name = "N", descriptor = "[[B")
    private byte[][] field1146 = new byte[4][];

    @OriginalMember(owner = "OBRIXRSB", name = "S", descriptor = "Z")
    private boolean field1151 = false;

    @OriginalMember(owner = "OBRIXRSB", name = "T", descriptor = "Z")
    private boolean field1152 = true;

    @OriginalMember(owner = "OBRIXRSB", name = "W", descriptor = "LCLCMCMIN;")
    private class9 field1155 = new class9(field1153);

    @OriginalMember(owner = "OBRIXRSB", name = "X", descriptor = "Z")
    private boolean field1156 = false;

    @OriginalMember(owner = "OBRIXRSB", name = "U", descriptor = "I")
    private static int field1153 = -524;

    @OriginalMember(owner = "OBRIXRSB", name = "b", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "OBRIXRSB", name = "k", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "OBRIXRSB", name = "r", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "OBRIXRSB", name = "s", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "OBRIXRSB", name = "w", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "OBRIXRSB", name = "z", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "OBRIXRSB", name = "A", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "OBRIXRSB", name = "H", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "OBRIXRSB", name = "K", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "OBRIXRSB", name = "Q", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "OBRIXRSB", name = "R", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "OBRIXRSB", name = "O", descriptor = "J")
    private long field1147;

    @OriginalMember(owner = "OBRIXRSB", name = "q", descriptor = "LNDLPOBEC;")
    private class44 field1123;

    @OriginalMember(owner = "OBRIXRSB", name = "L", descriptor = "Lclient;")
    private client field1144;

    @OriginalMember(owner = "OBRIXRSB", name = "V", descriptor = "Ljava/io/InputStream;")
    private InputStream field1154;

    @OriginalMember(owner = "OBRIXRSB", name = "P", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1148;

    @OriginalMember(owner = "OBRIXRSB", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field1119;

    @OriginalMember(owner = "OBRIXRSB", name = "p", descriptor = "[B")
    private byte[] field1122;

    @OriginalMember(owner = "OBRIXRSB", name = "d", descriptor = "[I")
    private int[] field1110;

    @OriginalMember(owner = "OBRIXRSB", name = "o", descriptor = "[I")
    private int[] field1121;

    @OriginalMember(owner = "OBRIXRSB", name = "x", descriptor = "[I")
    private int[] field1130;

    @OriginalMember(owner = "OBRIXRSB", name = "y", descriptor = "[I")
    private int[] field1131;

    @OriginalMember(owner = "OBRIXRSB", name = "F", descriptor = "[I")
    private int[] field1138;

    @OriginalMember(owner = "OBRIXRSB", name = "M", descriptor = "[I")
    private int[] field1145;

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "()I")
    public final int method410() {
        class3 var1 = this.field1109;
        synchronized (this.field1109) {
            return this.field1109.method8();
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(I)V")
    public final void method320(int arg0) {
        this.method426(0, arg0);
    }

    @OriginalMember(owner = "OBRIXRSB", name = "b", descriptor = "(I)V")
    private final void method411(int arg0) {
        if (arg0 != 2) {
            this.field1120 = !this.field1120;
        }
        while (this.field1149 == 0) {
            if (this.field1150 >= 10 || this.field1143 == 0) {
                return;
            }
            class9 var2 = this.field1155;
            class44 var3;
            synchronized (this.field1155) {
                var3 = (class44) this.field1155.method70();
            }
            while (var3 != null) {
                if (this.field1146[var3.field1106][var3.field1107] != 0) {
                    this.field1146[var3.field1106][var3.field1107] = 0;
                    this.field1136.method68(var3);
                    this.method430(var3, this.field1128);
                    this.field1156 = true;
                    if (this.field1108 < this.field1117) {
                        this.field1108++;
                    }
                    this.field1115 = "Loading extra files - " + this.field1108 * 100 / this.field1117 + "%";
                    this.field1150++;
                    if (this.field1150 == 10) {
                        return;
                    }
                }
                class9 var4 = this.field1155;
                synchronized (this.field1155) {
                    var3 = (class44) this.field1155.method70();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1146[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1143) {
                        var6[var8] = 0;
                        class44 var9 = new class44();
                        var9.field1106 = var5;
                        var9.field1107 = var8;
                        var9.field1105 = false;
                        this.field1136.method68(var9);
                        this.method430(var9, this.field1128);
                        this.field1156 = true;
                        if (this.field1108 < this.field1117) {
                            this.field1108++;
                        }
                        this.field1115 = "Loading extra files - " + this.field1108 * 100 / this.field1117 + "%";
                        this.field1150++;
                        if (this.field1150 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1143--;
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "c", descriptor = "(I)V")
    private final void method412(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1149 = 0;
        this.field1150 = 0;
        for (class44 var3 = (class44) this.field1136.method71(); var3 != null; var3 = (class44) this.field1136.method73(67)) {
            if (var3.field1105) {
                this.field1149++;
            } else {
                this.field1150++;
            }
        }
        while (this.field1149 < 10) {
            class44 var4 = (class44) this.field1135.method70();
            if (var4 == null) {
                break;
            }
            if (this.field1146[var4.field1106][var4.field1107] != 0) {
                this.field1108++;
            }
            this.field1146[var4.field1106][var4.field1107] = 0;
            this.field1136.method68(var4);
            this.field1149++;
            this.method430(var4, this.field1128);
            this.field1156 = true;
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(ZBII)V")
    public final void method413(boolean arg0, byte arg1, int arg2, int arg3) {
        if (this.field1144.field324[0] == null || this.field1111[arg2][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field1144.field324[arg2 + 1].method459(arg3, 22486);
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (this.method416(this.field1113[arg2][arg3], var5, this.field1111[arg2][arg3], false)) {
            return;
        }
        this.field1146[arg2][arg3] = arg1;
        if (arg1 > this.field1143) {
            this.field1143 = arg1;
        }
        this.field1117++;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(BI)Z")
    public final boolean method414(byte arg0, int arg1) {
        if (this.field1118 != arg0) {
            this.field1141 = !this.field1141;
        }
        for (int var3 = 0; var3 < this.field1121.length; var3++) {
            if (this.field1145[var3] == arg1) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "d", descriptor = "(I)I")
    public final int method415(int arg0) {
        if (arg0 <= 0) {
            field1153 = -46;
        }
        return this.field1131.length;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(I[BIZ)Z")
    private final boolean method416(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field1142 = 303;
        }
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field1112.reset();
        this.field1112.update(arg1, 0, var5);
        int var7 = (int) this.field1112.getValue();
        if (arg2 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "b", descriptor = "()LNDLPOBEC;")
    public final class44 method417() {
        class9 var1 = this.field1137;
        class44 var2;
        synchronized (this.field1137) {
            var2 = (class44) this.field1137.method70();
        }
        if (var2 == null) {
            return null;
        }
        class3 var3 = this.field1109;
        synchronized (this.field1109) {
            var2.method564();
        }
        if (var2.field1104 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1104));
            while (true) {
                if (this.field1126.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1126, var4, this.field1126.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1104 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1104[var7] = this.field1126[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "c", descriptor = "()V")
    public final void method418() {
        this.field1152 = false;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(IZ)I")
    public final int method419(int arg0, boolean arg1) {
        if (arg1) {
            field1153 = 226;
        }
        return this.field1111[arg0].length;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "e", descriptor = "(I)V")
    private final void method420(int arg0) {
        int var2 = 77 / arg0;
        class9 var3 = this.field1127;
        class44 var4;
        synchronized (this.field1127) {
            var4 = (class44) this.field1127.method70();
        }
        while (var4 != null) {
            this.field1156 = true;
            byte[] var5 = null;
            if (this.field1144.field324[0] != null) {
                var5 = this.field1144.field324[var4.field1106 + 1].method459(var4.field1107, 22486);
            }
            if (!this.method416(this.field1113[var4.field1106][var4.field1107], var5, this.field1111[var4.field1106][var4.field1107], false)) {
                var5 = null;
            }
            class9 var6 = this.field1127;
            synchronized (this.field1127) {
                if (var5 == null) {
                    this.field1135.method68(var4);
                } else {
                    var4.field1104 = var5;
                    class9 var7 = this.field1137;
                    synchronized (this.field1137) {
                        this.field1137.method68(var4);
                    }
                }
                var4 = (class44) this.field1127.method70();
            }
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(III)V")
    public final void method421(int arg0, int arg1, int arg2) {
        if (this.field1144.field324[0] == null || (this.field1111[arg2][arg0] == 0 || (this.field1146[arg2][arg0] == 0 || this.field1143 == 0))) {
            return;
        }
        class44 var4 = new class44();
        var4.field1106 = arg2;
        var4.field1107 = arg0;
        var4.field1105 = false;
        class9 var5 = this.field1155;
        synchronized (this.field1155) {
            this.field1155.method68(var4);
        }
        if (arg1 >= 0) {
            this.field1134 = -322;
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(II)I")
    public final int method422(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1139 = !this.field1139;
        }
        return this.field1122[arg1] & 0xFF;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "b", descriptor = "(II)Z")
    public final boolean method423(int arg0, int arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return this.field1138[arg1] == 1;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(IIIB)I")
    public final int method424(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = (arg2 << 8) + arg1;
        if (arg3 == 5) {
            boolean var6 = false;
        } else {
            field1153 = -115;
        }
        for (int var7 = 0; var7 < this.field1121.length; var7++) {
            if (this.field1121[var7] == var5) {
                if (arg0 == 0) {
                    return this.field1130[var7];
                }
                return this.field1145[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(B)V")
    public final void method425(byte arg0) {
        if (arg0 != 50) {
            this.field1151 = !this.field1151;
        }
        class9 var2 = this.field1155;
        synchronized (this.field1155) {
            this.field1155.method75();
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "c", descriptor = "(II)V")
    public final void method426(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1111.length || arg1 < 0 || arg1 > this.field1111[arg0].length || this.field1111[arg0][arg1] == 0) {
            return;
        }
        class3 var3 = this.field1109;
        synchronized (this.field1109) {
            for (class44 var4 = (class44) this.field1109.method6(); var4 != null; var4 = (class44) this.field1109.method7(67)) {
                if (var4.field1106 == arg0 && var4.field1107 == arg1) {
                    return;
                }
            }
            class44 var5 = new class44();
            var5.field1106 = arg0;
            var5.field1107 = arg1;
            var5.field1105 = true;
            class9 var6 = this.field1127;
            synchronized (this.field1127) {
                this.field1127.method68(var5);
            }
            this.field1109.method4(var5);
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(Z)V")
    private final void method427(boolean arg0) {
        if (arg0) {
            return;
        }
        try {
            int var2 = this.field1154.available();
            if (this.field1133 == 0 && var2 >= 6) {
                this.field1156 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1154.read(this.field1114, var3, 6 - var3)) {
                }
                int var4 = this.field1114[0] & 0xFF;
                int var5 = ((this.field1114[1] & 0xFF) << 8) + (this.field1114[2] & 0xFF);
                int var6 = ((this.field1114[3] & 0xFF) << 8) + (this.field1114[4] & 0xFF);
                int var7 = this.field1114[5] & 0xFF;
                this.field1123 = null;
                for (class44 var8 = (class44) this.field1136.method71(); var8 != null; var8 = (class44) this.field1136.method73(67)) {
                    if (var8.field1106 == var4 && var8.field1107 == var5) {
                        this.field1123 = var8;
                    }
                    if (this.field1123 != null) {
                        var8.field1103 = 0;
                    }
                }
                if (this.field1123 != null) {
                    this.field1124 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1123.field1104 = null;
                        if (this.field1123.field1105) {
                            class9 var9 = this.field1137;
                            synchronized (this.field1137) {
                                this.field1137.method68(this.field1123);
                            }
                        } else {
                            this.field1123.method582();
                        }
                        this.field1123 = null;
                    } else {
                        if (this.field1123.field1104 == null && var7 == 0) {
                            this.field1123.field1104 = new byte[var6];
                        }
                        if (this.field1123.field1104 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1132 = var7 * 500;
                this.field1133 = 500;
                if (this.field1133 > var6 - var7 * 500) {
                    this.field1133 = var6 - var7 * 500;
                }
            }
            if (this.field1133 > 0 && var2 >= this.field1133) {
                this.field1156 = true;
                byte[] var10 = this.field1114;
                int var11 = 0;
                if (this.field1123 != null) {
                    var10 = this.field1123.field1104;
                    var11 = this.field1132;
                }
                for (int var12 = 0; var12 < this.field1133; var12 += this.field1154.read(var10, var11 + var12, this.field1133 - var12)) {
                }
                if (this.field1133 + this.field1132 >= var10.length && this.field1123 != null) {
                    if (this.field1144.field324[0] != null) {
                        this.field1144.field324[this.field1123.field1106 + 1].method460(this.field1123.field1107, var10.length, var10, this.field1116);
                    }
                    if (!this.field1123.field1105 && this.field1123.field1106 == 3) {
                        this.field1123.field1105 = true;
                        this.field1123.field1106 = 93;
                    }
                    if (this.field1123.field1105) {
                        class9 var13 = this.field1137;
                        synchronized (this.field1137) {
                            this.field1137.method68(this.field1123);
                        }
                    } else {
                        this.field1123.method582();
                    }
                }
                this.field1133 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1119.close();
            } catch (Exception var15) {
            }
            this.field1119 = null;
            this.field1154 = null;
            this.field1148 = null;
            this.field1133 = 0;
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(ZZ)V")
    public final void method428(boolean arg0, boolean arg1) {
        int var3 = this.field1121.length;
        if (!arg1) {
            this.field1151 = !this.field1151;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1110[var4] != 0) {
                this.method413(true, (byte) 2, 3, this.field1145[var4]);
                this.method413(true, (byte) 2, 3, this.field1130[var4]);
            }
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(LVSUYIIVA;Lclient;)V")
    public final void method429(class62 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method570(var3[var4], null);
            int var27 = var26.length / 2;
            class8 var28 = new class8(var26, 792);
            this.field1111[var4] = new int[var27];
            this.field1146[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1111[var4][var29] = var28.method32();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method570(var5[var6], null);
            int var23 = var22.length / 4;
            class8 var24 = new class8(var22, 792);
            this.field1113[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1113[var6][var25] = var24.method35();
            }
        }
        byte[] var7 = arg0.method570("model_index", null);
        int var8 = this.field1111[0].length;
        this.field1122 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1122[var9] = var7[var9];
            } else {
                this.field1122[var9] = 0;
            }
        }
        byte[] var10 = arg0.method570("map_index", null);
        class8 var11 = new class8(var10, 792);
        int var12 = var10.length / 7;
        this.field1121 = new int[var12];
        this.field1130 = new int[var12];
        this.field1145 = new int[var12];
        this.field1110 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1121[var13] = var11.method32();
            this.field1130[var13] = var11.method32();
            this.field1145[var13] = var11.method32();
            this.field1110[var13] = var11.method30();
        }
        byte[] var14 = arg0.method570("anim_index", null);
        class8 var15 = new class8(var14, 792);
        int var16 = var14.length / 2;
        this.field1131 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1131[var17] = var15.method32();
        }
        byte[] var18 = arg0.method570("midi_index", null);
        class8 var19 = new class8(var18, 792);
        int var20 = var18.length;
        this.field1138 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1138[var21] = var19.method30();
        }
        this.field1144 = arg1;
        this.field1152 = true;
        this.field1144.method129(this, 2);
    }

    @OriginalMember(owner = "OBRIXRSB", name = "a", descriptor = "(LNDLPOBEC;Z)V")
    private final void method430(class44 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        try {
            if (this.field1119 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1147 < 4000L) {
                    return;
                }
                this.field1147 = var3;
                this.field1119 = this.field1144.method87(client.field326 + 43594);
                this.field1154 = this.field1119.getInputStream();
                this.field1148 = this.field1119.getOutputStream();
                this.field1148.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1154.read();
                }
                this.field1124 = 0;
            }
            this.field1114[0] = (byte) arg0.field1106;
            this.field1114[1] = (byte) (arg0.field1107 >> 8);
            this.field1114[2] = (byte) arg0.field1107;
            if (arg0.field1105) {
                this.field1114[3] = 2;
            } else if (this.field1144.field501) {
                this.field1114[3] = 0;
            } else {
                this.field1114[3] = 1;
            }
            this.field1148.write(this.field1114, 0, 4);
            this.field1125 = 0;
            this.field1129 = -10000;
        } catch (IOException var8) {
            try {
                this.field1119.close();
            } catch (Exception var7) {
            }
            this.field1119 = null;
            this.field1154 = null;
            this.field1148 = null;
            this.field1133 = 0;
            this.field1129++;
        }
    }

    @OriginalMember(owner = "OBRIXRSB", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1152) {
                this.field1140++;
                byte var1 = 20;
                if (this.field1143 == 0 && this.field1144.field324[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1156 = true;
                for (int var2 = 0; var2 < 100 && this.field1156; var2++) {
                    this.field1156 = false;
                    this.method420(130);
                    this.method412(0);
                    if (this.field1149 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method411(2);
                    if (this.field1154 != null) {
                        this.method427(false);
                    }
                }
                boolean var3 = false;
                for (class44 var4 = (class44) this.field1136.method71(); var4 != null; var4 = (class44) this.field1136.method73(67)) {
                    if (var4.field1105) {
                        var3 = true;
                        var4.field1103++;
                        if (var4.field1103 > 50) {
                            var4.field1103 = 0;
                            this.method430(var4, this.field1128);
                        }
                    }
                }
                if (!var3) {
                    for (class44 var5 = (class44) this.field1136.method71(); var5 != null; var5 = (class44) this.field1136.method73(67)) {
                        var3 = true;
                        var5.field1103++;
                        if (var5.field1103 > 50) {
                            var5.field1103 = 0;
                            this.method430(var5, this.field1128);
                        }
                    }
                }
                if (var3) {
                    this.field1124++;
                    if (this.field1124 > 750) {
                        try {
                            this.field1119.close();
                        } catch (Exception var8) {
                        }
                        this.field1119 = null;
                        this.field1154 = null;
                        this.field1148 = null;
                        this.field1133 = 0;
                    }
                } else {
                    this.field1124 = 0;
                    this.field1115 = "";
                }
                if (this.field1144.field501 && this.field1119 != null && this.field1148 != null && (this.field1143 > 0 || this.field1144.field324[0] == null)) {
                    this.field1125++;
                    if (this.field1125 > 500) {
                        this.field1125 = 0;
                        this.field1114[0] = 0;
                        this.field1114[1] = 0;
                        this.field1114[2] = 0;
                        this.field1114[3] = 10;
                        try {
                            this.field1148.write(this.field1114, 0, 4);
                        } catch (IOException var7) {
                            this.field1124 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }
}
