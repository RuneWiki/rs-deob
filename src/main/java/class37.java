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

@OriginalClass("LAQKYZGL")
public class class37 extends class41 implements Runnable {

    @OriginalMember(owner = "LAQKYZGL", name = "e", descriptor = "[B")
    private byte[] field1060 = new byte[65000];

    @OriginalMember(owner = "LAQKYZGL", name = "f", descriptor = "[[I")
    private int[][] field1061 = new int[4][];

    @OriginalMember(owner = "LAQKYZGL", name = "j", descriptor = "Z")
    private boolean field1065 = false;

    @OriginalMember(owner = "LAQKYZGL", name = "m", descriptor = "I")
    private int field1068 = 161;

    @OriginalMember(owner = "LAQKYZGL", name = "p", descriptor = "LVLUKUYNM;")
    private class60 field1071 = new class60((byte) 0);

    @OriginalMember(owner = "LAQKYZGL", name = "q", descriptor = "LTOAGRHDF;")
    private class59 field1072 = new class59(field1067);

    @OriginalMember(owner = "LAQKYZGL", name = "r", descriptor = "Z")
    private boolean field1073 = true;

    @OriginalMember(owner = "LAQKYZGL", name = "s", descriptor = "[[I")
    private int[][] field1074 = new int[4][];

    @OriginalMember(owner = "LAQKYZGL", name = "t", descriptor = "LVLUKUYNM;")
    private class60 field1075 = new class60((byte) 0);

    @OriginalMember(owner = "LAQKYZGL", name = "u", descriptor = "LVLUKUYNM;")
    private class60 field1076 = new class60((byte) 0);

    @OriginalMember(owner = "LAQKYZGL", name = "x", descriptor = "I")
    private int field1079 = 1;

    @OriginalMember(owner = "LAQKYZGL", name = "B", descriptor = "Ljava/lang/String;")
    public String field1083 = "";

    @OriginalMember(owner = "LAQKYZGL", name = "G", descriptor = "I")
    private int field1088 = 831;

    @OriginalMember(owner = "LAQKYZGL", name = "I", descriptor = "I")
    private int field1090 = -12;

    @OriginalMember(owner = "LAQKYZGL", name = "M", descriptor = "LVLUKUYNM;")
    private class60 field1094 = new class60((byte) 0);

    @OriginalMember(owner = "LAQKYZGL", name = "Q", descriptor = "[[B")
    private byte[][] field1098 = new byte[4][];

    @OriginalMember(owner = "LAQKYZGL", name = "R", descriptor = "LVLUKUYNM;")
    private class60 field1099 = new class60((byte) 0);

    @OriginalMember(owner = "LAQKYZGL", name = "S", descriptor = "[B")
    private byte[] field1100 = new byte[500];

    @OriginalMember(owner = "LAQKYZGL", name = "T", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1101 = new CRC32();

    @OriginalMember(owner = "LAQKYZGL", name = "U", descriptor = "Z")
    private boolean field1102 = true;

    @OriginalMember(owner = "LAQKYZGL", name = "l", descriptor = "I")
    private static int field1067 = -34;

    @OriginalMember(owner = "LAQKYZGL", name = "b", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "LAQKYZGL", name = "h", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "LAQKYZGL", name = "i", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "LAQKYZGL", name = "o", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "LAQKYZGL", name = "v", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "LAQKYZGL", name = "y", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "LAQKYZGL", name = "z", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "LAQKYZGL", name = "A", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "LAQKYZGL", name = "C", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "LAQKYZGL", name = "D", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "LAQKYZGL", name = "E", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "LAQKYZGL", name = "K", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "LAQKYZGL", name = "L", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "LAQKYZGL", name = "H", descriptor = "J")
    private long field1089;

    @OriginalMember(owner = "LAQKYZGL", name = "N", descriptor = "LSFALJUFQ;")
    private class57 field1095;

    @OriginalMember(owner = "LAQKYZGL", name = "O", descriptor = "Lclient;")
    private client field1096;

    @OriginalMember(owner = "LAQKYZGL", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field1069;

    @OriginalMember(owner = "LAQKYZGL", name = "P", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1097;

    @OriginalMember(owner = "LAQKYZGL", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field1062;

    @OriginalMember(owner = "LAQKYZGL", name = "k", descriptor = "[B")
    private byte[] field1066;

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "[I")
    private int[] field1056;

    @OriginalMember(owner = "LAQKYZGL", name = "c", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "LAQKYZGL", name = "d", descriptor = "[I")
    private int[] field1059;

    @OriginalMember(owner = "LAQKYZGL", name = "w", descriptor = "[I")
    private int[] field1078;

    @OriginalMember(owner = "LAQKYZGL", name = "F", descriptor = "[I")
    private int[] field1087;

    @OriginalMember(owner = "LAQKYZGL", name = "J", descriptor = "[I")
    private int[] field1091;

    @OriginalMember(owner = "LAQKYZGL", name = "b", descriptor = "(I)V")
    private final void method288(int arg0) {
        if (arg0 != 0) {
            return;
        }
        while (this.field1080 == 0) {
            if (this.field1081 >= 10 || this.field1057 == 0) {
                return;
            }
            class60 var2 = this.field1099;
            class57 var3;
            synchronized (this.field1099) {
                var3 = (class57) this.field1099.method360();
            }
            while (var3 != null) {
                if (this.field1098[var3.field1324][var3.field1327] != 0) {
                    this.field1098[var3.field1324][var3.field1327] = 0;
                    this.field1076.method358(var3);
                    this.method289(var3, true);
                    this.field1065 = true;
                    if (this.field1070 < this.field1085) {
                        this.field1070++;
                    }
                    this.field1083 = "Loading extra files - " + this.field1070 * 100 / this.field1085 + "%";
                    this.field1081++;
                    if (this.field1081 == 10) {
                        return;
                    }
                }
                class60 var4 = this.field1099;
                synchronized (this.field1099) {
                    var3 = (class57) this.field1099.method360();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1098[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1057) {
                        var6[var8] = 0;
                        class57 var9 = new class57();
                        var9.field1324 = var5;
                        var9.field1327 = var8;
                        var9.field1326 = false;
                        this.field1076.method358(var9);
                        this.method289(var9, true);
                        this.field1065 = true;
                        if (this.field1070 < this.field1085) {
                            this.field1070++;
                        }
                        this.field1083 = "Loading extra files - " + this.field1070 * 100 / this.field1085 + "%";
                        this.field1081++;
                        if (this.field1081 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1057--;
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(LSFALJUFQ;Z)V")
    private final void method289(class57 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        try {
            if (this.field1062 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1089 < 4000L) {
                    return;
                }
                this.field1089 = var3;
                this.field1062 = this.field1096.method144(client.field469 + 43594);
                this.field1069 = this.field1062.getInputStream();
                this.field1097 = this.field1062.getOutputStream();
                this.field1097.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1069.read();
                }
                this.field1084 = 0;
            }
            this.field1100[0] = (byte) arg0.field1324;
            this.field1100[1] = (byte) (arg0.field1327 >> 8);
            this.field1100[2] = (byte) arg0.field1327;
            if (arg0.field1326) {
                this.field1100[3] = 2;
            } else if (this.field1096.field334) {
                this.field1100[3] = 0;
            } else {
                this.field1100[3] = 1;
            }
            this.field1097.write(this.field1100, 0, 4);
            this.field1086 = 0;
            this.field1077 = -10000;
        } catch (IOException var8) {
            try {
                this.field1062.close();
            } catch (Exception var7) {
            }
            this.field1062 = null;
            this.field1069 = null;
            this.field1097 = null;
            this.field1064 = 0;
            this.field1077++;
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(Z)V")
    private final void method290(boolean arg0) {
        this.field1080 = 0;
        if (!arg0) {
            return;
        }
        this.field1081 = 0;
        for (class57 var2 = (class57) this.field1076.method361(); var2 != null; var2 = (class57) this.field1076.method363(this.field1088)) {
            if (var2.field1326) {
                this.field1080++;
            } else {
                this.field1081++;
            }
        }
        while (this.field1080 < 10) {
            class57 var3 = (class57) this.field1075.method360();
            if (var3 == null) {
                break;
            }
            if (this.field1098[var3.field1324][var3.field1327] != 0) {
                this.field1070++;
            }
            this.field1098[var3.field1324][var3.field1327] = 0;
            this.field1076.method358(var3);
            this.field1080++;
            this.method289(var3, true);
            this.field1065 = true;
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(IB)Z")
    public final boolean method291(int arg0, byte arg1) {
        if (arg1 != -72) {
            this.field1079 = 305;
        }
        return this.field1058[arg0] == 1;
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "()LSFALJUFQ;")
    public final class57 method292() {
        class60 var1 = this.field1094;
        class57 var2;
        synchronized (this.field1094) {
            var2 = (class57) this.field1094.method360();
        }
        if (var2 == null) {
            return null;
        }
        class59 var3 = this.field1072;
        synchronized (this.field1072) {
            var2.method256();
        }
        if (var2.field1323 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1323));
            while (true) {
                if (this.field1060.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1060, var4, this.field1060.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1323 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1323[var7] = this.field1060[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "LAQKYZGL", name = "c", descriptor = "(I)V")
    private final void method293(int arg0) {
        if (arg0 != 0) {
            return;
        }
        class60 var2 = this.field1071;
        class57 var3;
        synchronized (this.field1071) {
            var3 = (class57) this.field1071.method360();
        }
        while (var3 != null) {
            this.field1065 = true;
            byte[] var4 = null;
            if (this.field1096.field631[0] != null) {
                var4 = this.field1096.field631[var3.field1324 + 1].method252(this.field1102, var3.field1327);
            }
            if (!this.method298(this.field1074[var3.field1324][var3.field1327], var4, true, this.field1061[var3.field1324][var3.field1327])) {
                var4 = null;
            }
            class60 var5 = this.field1071;
            synchronized (this.field1071) {
                if (var4 == null) {
                    this.field1075.method358(var3);
                } else {
                    var3.field1323 = var4;
                    class60 var6 = this.field1094;
                    synchronized (this.field1094) {
                        this.field1094.method358(var3);
                    }
                }
                var3 = (class57) this.field1071.method360();
            }
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(II)I")
    public final int method294(int arg0, int arg1) {
        return arg1 < 0 ? this.field1066[arg0] & 0xFF : field1067;
    }

    @OriginalMember(owner = "LAQKYZGL", name = "b", descriptor = "()V")
    public final void method295() {
        this.field1073 = false;
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(I)V")
    public final void method296(int arg0) {
        this.method297(0, arg0);
    }

    @OriginalMember(owner = "LAQKYZGL", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1073) {
                this.field1093++;
                byte var1 = 20;
                if (this.field1057 == 0 && this.field1096.field631[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1065 = true;
                for (int var2 = 0; var2 < 100 && this.field1065; var2++) {
                    this.field1065 = false;
                    this.method293(0);
                    this.method290(true);
                    if (this.field1080 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method288(0);
                    if (this.field1069 != null) {
                        this.method309(this.field1082);
                    }
                }
                boolean var3 = false;
                for (class57 var4 = (class57) this.field1076.method361(); var4 != null; var4 = (class57) this.field1076.method363(this.field1088)) {
                    if (var4.field1326) {
                        var3 = true;
                        var4.field1325++;
                        if (var4.field1325 > 50) {
                            var4.field1325 = 0;
                            this.method289(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (class57 var5 = (class57) this.field1076.method361(); var5 != null; var5 = (class57) this.field1076.method363(this.field1088)) {
                        var3 = true;
                        var5.field1325++;
                        if (var5.field1325 > 50) {
                            var5.field1325 = 0;
                            this.method289(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field1084++;
                    if (this.field1084 > 750) {
                        try {
                            this.field1062.close();
                        } catch (Exception var8) {
                        }
                        this.field1062 = null;
                        this.field1069 = null;
                        this.field1097 = null;
                        this.field1064 = 0;
                    }
                } else {
                    this.field1084 = 0;
                    this.field1083 = "";
                }
                if (this.field1096.field334 && this.field1062 != null && this.field1097 != null && (this.field1057 > 0 || this.field1096.field631[0] == null)) {
                    this.field1086++;
                    if (this.field1086 > 500) {
                        this.field1086 = 0;
                        this.field1100[0] = 0;
                        this.field1100[1] = 0;
                        this.field1100[2] = 0;
                        this.field1100[3] = 10;
                        try {
                            this.field1097.write(this.field1100, 0, 4);
                        } catch (IOException var7) {
                            this.field1084 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "b", descriptor = "(II)V")
    public final void method297(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1061.length || arg1 < 0 || arg1 > this.field1061[arg0].length || this.field1061[arg0][arg1] == 0) {
            return;
        }
        class59 var3 = this.field1072;
        synchronized (this.field1072) {
            for (class57 var4 = (class57) this.field1072.method355(); var4 != null; var4 = (class57) this.field1072.method356(this.field1088)) {
                if (var4.field1324 == arg0 && var4.field1327 == arg1) {
                    return;
                }
            }
            class57 var5 = new class57();
            var5.field1324 = arg0;
            var5.field1327 = arg1;
            var5.field1326 = true;
            class60 var6 = this.field1071;
            synchronized (this.field1071) {
                this.field1071.method358(var5);
            }
            this.field1072.method353(var5);
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(I[BZI)Z")
    private final boolean method298(int arg0, byte[] arg1, boolean arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field1101.reset();
        this.field1101.update(arg1, 0, var5);
        int var7 = (int) this.field1101.getValue();
        if (!arg2) {
            this.field1092 = 366;
        }
        if (arg3 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(IIII)I")
    public final int method299(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg0 << 8) + arg1;
        if (arg2 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < this.field1056.length; var7++) {
            if (this.field1056[var7] == var5) {
                if (arg3 == 0) {
                    return this.field1059[var7];
                }
                return this.field1078[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(IBII)V")
    public final void method300(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field1096.field631[0] == null || this.field1061[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1096.field631[arg0 + 1].method252(this.field1102, arg2);
        if (this.method298(this.field1074[arg0][arg2], var5, true, this.field1061[arg0][arg2])) {
            return;
        }
        this.field1098[arg0][arg2] = arg1;
        int var6 = 45 / arg3;
        if (arg1 > this.field1057) {
            this.field1057 = arg1;
        }
        this.field1085++;
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(III)V")
    public final void method301(int arg0, int arg1, int arg2) {
        if (this.field1096.field631[0] == null || (this.field1061[arg2][arg0] == 0 || (this.field1098[arg2][arg0] == 0 || this.field1057 == 0))) {
            return;
        }
        class57 var4 = new class57();
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        var4.field1324 = arg2;
        var4.field1327 = arg0;
        var4.field1326 = false;
        class60 var6 = this.field1099;
        synchronized (this.field1099) {
            this.field1099.method358(var4);
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "c", descriptor = "()I")
    public final int method302() {
        class59 var1 = this.field1072;
        synchronized (this.field1072) {
            return this.field1072.method357();
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(IZ)I")
    public final int method303(int arg0, boolean arg1) {
        return arg1 ? this.field1092 : this.field1061[arg0].length;
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(ZB)V")
    public final void method304(boolean arg0, byte arg1) {
        int var3 = this.field1056.length;
        if (arg1 != 84) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg0 || this.field1091[var5] != 0) {
                this.method300(3, (byte) 2, this.field1078[var5], 161);
                this.method300(3, (byte) 2, this.field1059[var5], 161);
            }
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "c", descriptor = "(II)Z")
    public final boolean method305(int arg0, int arg1) {
        label29: while (true) {
            if (arg1 >= 0) {
                int var4 = 1;
                while (true) {
                    if (var4 <= 0) {
                        continue label29;
                    }
                    var4++;
                }
            }
            for (int var3 = 0; var3 < this.field1056.length; var3++) {
                if (this.field1078[var3] == arg0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "a", descriptor = "(LMJLXHQTQ;Lclient;)V")
    public final void method306(class44 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method317(var3[var4], null);
            int var27 = var26.length / 2;
            class69 var28 = new class69(var26, -82);
            this.field1061[var4] = new int[var27];
            this.field1098[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1061[var4][var29] = var28.method467();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method317(var5[var6], null);
            int var23 = var22.length / 4;
            class69 var24 = new class69(var22, -82);
            this.field1074[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1074[var6][var25] = var24.method470();
            }
        }
        byte[] var7 = arg0.method317("model_index", null);
        int var8 = this.field1061[0].length;
        this.field1066 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1066[var9] = var7[var9];
            } else {
                this.field1066[var9] = 0;
            }
        }
        byte[] var10 = arg0.method317("map_index", null);
        class69 var11 = new class69(var10, -82);
        int var12 = var10.length / 7;
        this.field1056 = new int[var12];
        this.field1059 = new int[var12];
        this.field1078 = new int[var12];
        this.field1091 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1056[var13] = var11.method467();
            this.field1059[var13] = var11.method467();
            this.field1078[var13] = var11.method467();
            this.field1091[var13] = var11.method465();
        }
        byte[] var14 = arg0.method317("anim_index", null);
        class69 var15 = new class69(var14, -82);
        int var16 = var14.length / 2;
        this.field1087 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1087[var17] = var15.method467();
        }
        byte[] var18 = arg0.method317("midi_index", null);
        class69 var19 = new class69(var18, -82);
        int var20 = var18.length;
        this.field1058 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1058[var21] = var19.method465();
        }
        this.field1096 = arg1;
        this.field1073 = true;
        this.field1096.method47(this, 2);
    }

    @OriginalMember(owner = "LAQKYZGL", name = "d", descriptor = "(I)V")
    public final void method307(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class60 var3 = this.field1099;
        synchronized (this.field1099) {
            this.field1099.method365();
        }
    }

    @OriginalMember(owner = "LAQKYZGL", name = "b", descriptor = "(Z)I")
    public final int method308(boolean arg0) {
        return arg0 ? 1 : this.field1087.length;
    }

    @OriginalMember(owner = "LAQKYZGL", name = "e", descriptor = "(I)V")
    private final void method309(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field1069.available();
            if (this.field1064 == 0 && var3 >= 6) {
                this.field1065 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1069.read(this.field1100, var4, 6 - var4)) {
                }
                int var5 = this.field1100[0] & 0xFF;
                int var6 = ((this.field1100[1] & 0xFF) << 8) + (this.field1100[2] & 0xFF);
                int var7 = ((this.field1100[3] & 0xFF) << 8) + (this.field1100[4] & 0xFF);
                int var8 = this.field1100[5] & 0xFF;
                this.field1095 = null;
                for (class57 var9 = (class57) this.field1076.method361(); var9 != null; var9 = (class57) this.field1076.method363(this.field1088)) {
                    if (var9.field1324 == var5 && var9.field1327 == var6) {
                        this.field1095 = var9;
                    }
                    if (this.field1095 != null) {
                        var9.field1325 = 0;
                    }
                }
                if (this.field1095 != null) {
                    this.field1084 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1095.field1323 = null;
                        if (this.field1095.field1326) {
                            class60 var10 = this.field1094;
                            synchronized (this.field1094) {
                                this.field1094.method358(this.field1095);
                            }
                        } else {
                            this.field1095.method334();
                        }
                        this.field1095 = null;
                    } else {
                        if (this.field1095.field1323 == null && var8 == 0) {
                            this.field1095.field1323 = new byte[var7];
                        }
                        if (this.field1095.field1323 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1063 = var8 * 500;
                this.field1064 = 500;
                if (this.field1064 > var7 - var8 * 500) {
                    this.field1064 = var7 - var8 * 500;
                }
            }
            if (this.field1064 > 0 && var3 >= this.field1064) {
                this.field1065 = true;
                byte[] var11 = this.field1100;
                int var12 = 0;
                if (this.field1095 != null) {
                    var11 = this.field1095.field1323;
                    var12 = this.field1063;
                }
                for (int var13 = 0; var13 < this.field1064; var13 += this.field1069.read(var11, var12 + var13, this.field1064 - var13)) {
                }
                if (this.field1064 + this.field1063 >= var11.length && this.field1095 != null) {
                    if (this.field1096.field631[0] != null) {
                        this.field1096.field631[this.field1095.field1324 + 1].method253(var11.length, (byte) 9, var11, this.field1095.field1327);
                    }
                    if (!this.field1095.field1326 && this.field1095.field1324 == 3) {
                        this.field1095.field1326 = true;
                        this.field1095.field1324 = 93;
                    }
                    if (this.field1095.field1326) {
                        class60 var14 = this.field1094;
                        synchronized (this.field1094) {
                            this.field1094.method358(this.field1095);
                        }
                    } else {
                        this.field1095.method334();
                    }
                }
                this.field1064 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1062.close();
            } catch (Exception var16) {
            }
            this.field1062 = null;
            this.field1069 = null;
            this.field1097 = null;
            this.field1064 = 0;
        }
    }
}
