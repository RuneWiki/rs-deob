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

@OriginalClass("MWSOISVX")
public class class35 extends class44 implements Runnable {

    @OriginalMember(owner = "MWSOISVX", name = "c", descriptor = "LZCVCEQHJ;")
    private class70 field1086 = new class70(-489);

    @OriginalMember(owner = "MWSOISVX", name = "d", descriptor = "LZCVCEQHJ;")
    private class70 field1087 = new class70(-489);

    @OriginalMember(owner = "MWSOISVX", name = "e", descriptor = "[[I")
    private int[][] field1088 = new int[4][];

    @OriginalMember(owner = "MWSOISVX", name = "k", descriptor = "Z")
    private boolean field1094 = true;

    @OriginalMember(owner = "MWSOISVX", name = "l", descriptor = "I")
    private int field1095 = -596;

    @OriginalMember(owner = "MWSOISVX", name = "n", descriptor = "LZCVCEQHJ;")
    private class70 field1097 = new class70(-489);

    @OriginalMember(owner = "MWSOISVX", name = "o", descriptor = "LQUHNUHWS;")
    private class49 field1098 = new class49(-160);

    @OriginalMember(owner = "MWSOISVX", name = "q", descriptor = "I")
    private int field1100 = 4;

    @OriginalMember(owner = "MWSOISVX", name = "r", descriptor = "I")
    private int field1101 = 44965;

    @OriginalMember(owner = "MWSOISVX", name = "u", descriptor = "B")
    private byte field1104 = 7;

    @OriginalMember(owner = "MWSOISVX", name = "w", descriptor = "[B")
    private byte[] field1106 = new byte[65000];

    @OriginalMember(owner = "MWSOISVX", name = "B", descriptor = "Ljava/lang/String;")
    public String field1111 = "";

    @OriginalMember(owner = "MWSOISVX", name = "C", descriptor = "[[I")
    private int[][] field1112 = new int[4][];

    @OriginalMember(owner = "MWSOISVX", name = "D", descriptor = "[[B")
    private byte[][] field1113 = new byte[4][];

    @OriginalMember(owner = "MWSOISVX", name = "E", descriptor = "LZCVCEQHJ;")
    private class70 field1114 = new class70(-489);

    @OriginalMember(owner = "MWSOISVX", name = "F", descriptor = "LZCVCEQHJ;")
    private class70 field1115 = new class70(-489);

    @OriginalMember(owner = "MWSOISVX", name = "H", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1117 = new CRC32();

    @OriginalMember(owner = "MWSOISVX", name = "M", descriptor = "Z")
    private boolean field1122 = false;

    @OriginalMember(owner = "MWSOISVX", name = "P", descriptor = "Z")
    private boolean field1125 = true;

    @OriginalMember(owner = "MWSOISVX", name = "Q", descriptor = "B")
    private byte field1126 = 7;

    @OriginalMember(owner = "MWSOISVX", name = "T", descriptor = "[B")
    private byte[] field1129 = new byte[500];

    @OriginalMember(owner = "MWSOISVX", name = "U", descriptor = "I")
    private int field1130 = -242;

    @OriginalMember(owner = "MWSOISVX", name = "f", descriptor = "Z")
    private static boolean field1089 = true;

    @OriginalMember(owner = "MWSOISVX", name = "g", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "MWSOISVX", name = "h", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "MWSOISVX", name = "i", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "MWSOISVX", name = "s", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "MWSOISVX", name = "v", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "MWSOISVX", name = "z", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "MWSOISVX", name = "J", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "MWSOISVX", name = "N", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "MWSOISVX", name = "O", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "MWSOISVX", name = "R", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "MWSOISVX", name = "S", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "MWSOISVX", name = "m", descriptor = "J")
    private long field1096;

    @OriginalMember(owner = "MWSOISVX", name = "G", descriptor = "LCOEBDAGX;")
    private class8 field1116;

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "Lclient;")
    private client field1084;

    @OriginalMember(owner = "MWSOISVX", name = "t", descriptor = "Ljava/io/InputStream;")
    private InputStream field1103;

    @OriginalMember(owner = "MWSOISVX", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1108;

    @OriginalMember(owner = "MWSOISVX", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field1093;

    @OriginalMember(owner = "MWSOISVX", name = "A", descriptor = "[B")
    private byte[] field1110;

    @OriginalMember(owner = "MWSOISVX", name = "b", descriptor = "[I")
    private int[] field1085;

    @OriginalMember(owner = "MWSOISVX", name = "p", descriptor = "[I")
    private int[] field1099;

    @OriginalMember(owner = "MWSOISVX", name = "x", descriptor = "[I")
    private int[] field1107;

    @OriginalMember(owner = "MWSOISVX", name = "I", descriptor = "[I")
    private int[] field1118;

    @OriginalMember(owner = "MWSOISVX", name = "K", descriptor = "[I")
    private int[] field1120;

    @OriginalMember(owner = "MWSOISVX", name = "L", descriptor = "[I")
    private int[] field1121;

    @OriginalMember(owner = "MWSOISVX", name = "b", descriptor = "(I)V")
    private final void method326(int arg0) {
        if (arg0 != 5) {
            return;
        }
        while (this.field1123 == 0) {
            if (this.field1124 >= 10 || this.field1105 == 0) {
                return;
            }
            class70 var2 = this.field1114;
            class8 var3;
            synchronized (this.field1114) {
                var3 = (class8) this.field1114.method591();
            }
            while (var3 != null) {
                if (this.field1113[var3.field613][var3.field610] != 0) {
                    this.field1113[var3.field613][var3.field610] = 0;
                    this.field1087.method589(var3);
                    this.method346((byte) 1, var3);
                    this.field1122 = true;
                    if (this.field1128 < this.field1090) {
                        this.field1128++;
                    }
                    this.field1111 = "Loading extra files - " + this.field1128 * 100 / this.field1090 + "%";
                    this.field1124++;
                    if (this.field1124 == 10) {
                        return;
                    }
                }
                class70 var4 = this.field1114;
                synchronized (this.field1114) {
                    var3 = (class8) this.field1114.method591();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1113[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1105) {
                        var6[var8] = 0;
                        class8 var9 = new class8();
                        var9.field613 = var5;
                        var9.field610 = var8;
                        var9.field612 = false;
                        this.field1087.method589(var9);
                        this.method346((byte) 1, var9);
                        this.field1122 = true;
                        if (this.field1128 < this.field1090) {
                            this.field1128++;
                        }
                        this.field1111 = "Loading extra files - " + this.field1128 * 100 / this.field1090 + "%";
                        this.field1124++;
                        if (this.field1124 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1105--;
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(II)Z")
    public final boolean method327(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1099.length; var3++) {
            if (this.field1120[var3] == arg0) {
                return true;
            }
        }
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "MWSOISVX", name = "b", descriptor = "(II)V")
    public final void method328(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1112.length || arg1 < 0 || arg1 > this.field1112[arg0].length || this.field1112[arg0][arg1] == 0) {
            return;
        }
        class49 var3 = this.field1098;
        synchronized (this.field1098) {
            for (class8 var4 = (class8) this.field1098.method395(); var4 != null; var4 = (class8) this.field1098.method396(-314)) {
                if (var4.field613 == arg0 && var4.field610 == arg1) {
                    return;
                }
            }
            class8 var5 = new class8();
            var5.field613 = arg0;
            var5.field610 = arg1;
            var5.field612 = true;
            class70 var6 = this.field1097;
            synchronized (this.field1097) {
                this.field1097.method589(var5);
            }
            this.field1098.method393(var5);
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "()V")
    public final void method329() {
        this.field1094 = false;
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(ZII)V")
    public final void method330(boolean arg0, int arg1, int arg2) {
        if (this.field1084.field309[0] == null || (this.field1112[arg2][arg1] == 0 || (this.field1113[arg2][arg1] == 0 || this.field1105 == 0))) {
            return;
        }
        class8 var4 = new class8();
        var4.field613 = arg2;
        var4.field610 = arg1;
        var4.field612 = false;
        class70 var5 = this.field1114;
        synchronized (this.field1114) {
            this.field1114.method589(var4);
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "c", descriptor = "(I)V")
    public final void method331(int arg0) {
        if (arg0 == 39268) {
            class70 var2 = this.field1114;
            synchronized (this.field1114) {
                this.field1114.method596();
            }
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(IBII)V")
    public final void method332(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field1084.field309[0] == null || this.field1112[arg0][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field1084.field309[arg0 + 1].method259(arg3, -25);
        int var6 = 85 / arg2;
        if (this.method344(var5, this.field1112[arg0][arg3], this.field1088[arg0][arg3], this.field1104)) {
            return;
        }
        this.field1113[arg0][arg3] = arg1;
        if (arg1 > this.field1105) {
            this.field1105 = arg1;
        }
        this.field1090++;
    }

    @OriginalMember(owner = "MWSOISVX", name = "b", descriptor = "()LCOEBDAGX;")
    public final class8 method333() {
        class70 var1 = this.field1086;
        class8 var2;
        synchronized (this.field1086) {
            var2 = (class8) this.field1086.method591();
        }
        if (var2 == null) {
            return null;
        }
        class49 var3 = this.field1098;
        synchronized (this.field1098) {
            var2.method348();
        }
        if (var2.field611 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field611));
            while (true) {
                if (this.field1106.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1106, var4, this.field1106.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field611 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field611[var7] = this.field1106[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(ZZ)V")
    public final void method334(boolean arg0, boolean arg1) {
        if (!arg0) {
            return;
        }
        int var3 = this.field1099.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1118[var4] != 0) {
                this.method332(3, (byte) 2, 212, this.field1120[var4]);
                this.method332(3, (byte) 2, 212, this.field1121[var4]);
            }
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "d", descriptor = "(I)I")
    public final int method335(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1107.length;
    }

    @OriginalMember(owner = "MWSOISVX", name = "e", descriptor = "(I)V")
    private final void method336(int arg0) {
        if (this.field1101 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field1103.available();
            if (this.field1092 == 0 && var3 >= 6) {
                this.field1122 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1103.read(this.field1129, var4, 6 - var4)) {
                }
                int var5 = this.field1129[0] & 0xFF;
                int var6 = ((this.field1129[1] & 0xFF) << 8) + (this.field1129[2] & 0xFF);
                int var7 = ((this.field1129[3] & 0xFF) << 8) + (this.field1129[4] & 0xFF);
                int var8 = this.field1129[5] & 0xFF;
                this.field1116 = null;
                for (class8 var9 = (class8) this.field1087.method592(); var9 != null; var9 = (class8) this.field1087.method594(-314)) {
                    if (var9.field613 == var5 && var9.field610 == var6) {
                        this.field1116 = var9;
                    }
                    if (this.field1116 != null) {
                        var9.field609 = 0;
                    }
                }
                if (this.field1116 != null) {
                    this.field1102 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1116.field611 = null;
                        if (this.field1116.field612) {
                            class70 var10 = this.field1086;
                            synchronized (this.field1086) {
                                this.field1086.method589(this.field1116);
                            }
                        } else {
                            this.field1116.method1();
                        }
                        this.field1116 = null;
                    } else {
                        if (this.field1116.field611 == null && var8 == 0) {
                            this.field1116.field611 = new byte[var7];
                        }
                        if (this.field1116.field611 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1091 = var8 * 500;
                this.field1092 = 500;
                if (this.field1092 > var7 - var8 * 500) {
                    this.field1092 = var7 - var8 * 500;
                }
            }
            if (this.field1092 > 0 && var3 >= this.field1092) {
                this.field1122 = true;
                byte[] var11 = this.field1129;
                int var12 = 0;
                if (this.field1116 != null) {
                    var11 = this.field1116.field611;
                    var12 = this.field1091;
                }
                for (int var13 = 0; var13 < this.field1092; var13 += this.field1103.read(var11, var12 + var13, this.field1092 - var13)) {
                }
                if (this.field1092 + this.field1091 >= var11.length && this.field1116 != null) {
                    if (this.field1084.field309[0] != null) {
                        this.field1084.field309[this.field1116.field613 + 1].method260(var11.length, var11, this.field1116.field610, 0);
                    }
                    if (!this.field1116.field612 && this.field1116.field613 == 3) {
                        this.field1116.field612 = true;
                        this.field1116.field613 = 93;
                    }
                    if (this.field1116.field612) {
                        class70 var14 = this.field1086;
                        synchronized (this.field1086) {
                            this.field1086.method589(this.field1116);
                        }
                    } else {
                        this.field1116.method1();
                    }
                }
                this.field1092 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1093.close();
            } catch (Exception var16) {
            }
            this.field1093 = null;
            this.field1103 = null;
            this.field1108 = null;
            this.field1092 = 0;
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "c", descriptor = "()I")
    public final int method337() {
        class49 var1 = this.field1098;
        synchronized (this.field1098) {
            return this.field1098.method397();
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1094) {
                this.field1119++;
                byte var1 = 20;
                if (this.field1105 == 0 && this.field1084.field309[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1122 = true;
                for (int var2 = 0; var2 < 100 && this.field1122; var2++) {
                    this.field1122 = false;
                    this.method343(0);
                    this.method345(this.field1126);
                    if (this.field1123 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method326(5);
                    if (this.field1103 != null) {
                        this.method336(44965);
                    }
                }
                boolean var3 = false;
                for (class8 var4 = (class8) this.field1087.method592(); var4 != null; var4 = (class8) this.field1087.method594(-314)) {
                    if (var4.field612) {
                        var3 = true;
                        var4.field609++;
                        if (var4.field609 > 50) {
                            var4.field609 = 0;
                            this.method346((byte) 1, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class8 var5 = (class8) this.field1087.method592(); var5 != null; var5 = (class8) this.field1087.method594(-314)) {
                        var3 = true;
                        var5.field609++;
                        if (var5.field609 > 50) {
                            var5.field609 = 0;
                            this.method346((byte) 1, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1102++;
                    if (this.field1102 > 750) {
                        try {
                            this.field1093.close();
                        } catch (Exception var8) {
                        }
                        this.field1093 = null;
                        this.field1103 = null;
                        this.field1108 = null;
                        this.field1092 = 0;
                    }
                } else {
                    this.field1102 = 0;
                    this.field1111 = "";
                }
                if (this.field1084.field528 && this.field1093 != null && this.field1108 != null && (this.field1105 > 0 || this.field1084.field309[0] == null)) {
                    this.field1127++;
                    if (this.field1127 > 500) {
                        this.field1127 = 0;
                        this.field1129[0] = 0;
                        this.field1129[1] = 0;
                        this.field1129[2] = 0;
                        this.field1129[3] = 10;
                        try {
                            this.field1108.write(this.field1129, 0, 4);
                        } catch (IOException var7) {
                            this.field1102 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "c", descriptor = "(II)I")
    public final int method338(int arg0, int arg1) {
        if (arg0 != -30035) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1110[arg1] & 0xFF;
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(IB)Z")
    public final boolean method339(int arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var3 = false;
        } else {
            this.field1130 = 206;
        }
        return this.field1085[arg0] == 1;
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(ZIII)I")
    public final int method340(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg2 << 8) + arg1;
        for (int var6 = 0; var6 < this.field1099.length; var6++) {
            if (this.field1099[var6] == var5) {
                if (arg3 == 0) {
                    return this.field1121[var6];
                }
                return this.field1120[var6];
            }
        }
        return arg0 ? -1 : this.field1130;
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(I)V")
    public final void method341(int arg0) {
        this.method328(0, arg0);
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(IZ)I")
    public final int method342(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1125 = !this.field1125;
        }
        return this.field1112[arg0].length;
    }

    @OriginalMember(owner = "MWSOISVX", name = "f", descriptor = "(I)V")
    private final void method343(int arg0) {
        class70 var2 = this.field1097;
        class8 var3;
        synchronized (this.field1097) {
            var3 = (class8) this.field1097.method591();
        }
        if (arg0 != 0) {
            this.field1100 = 389;
        }
        while (var3 != null) {
            this.field1122 = true;
            byte[] var4 = null;
            if (this.field1084.field309[0] != null) {
                var4 = this.field1084.field309[var3.field613 + 1].method259(var3.field610, -25);
            }
            if (!this.method344(var4, this.field1112[var3.field613][var3.field610], this.field1088[var3.field613][var3.field610], this.field1104)) {
                var4 = null;
            }
            class70 var5 = this.field1097;
            synchronized (this.field1097) {
                if (var4 == null) {
                    this.field1115.method589(var3);
                } else {
                    var3.field611 = var4;
                    class70 var6 = this.field1086;
                    synchronized (this.field1086) {
                        this.field1086.method589(var3);
                    }
                }
                var3 = (class8) this.field1097.method591();
            }
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "([BIIB)Z")
    private final boolean method344(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field1117.reset();
        if (this.field1104 != arg3) {
            throw new NullPointerException();
        }
        boolean var7 = false;
        this.field1117.update(arg0, 0, var5);
        int var8 = (int) this.field1117.getValue();
        if (arg1 == var6) {
            return arg2 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(B)V")
    private final void method345(byte arg0) {
        this.field1123 = 0;
        if (arg0 != 7) {
            return;
        }
        this.field1124 = 0;
        for (class8 var2 = (class8) this.field1087.method592(); var2 != null; var2 = (class8) this.field1087.method594(-314)) {
            if (var2.field612) {
                this.field1123++;
            } else {
                this.field1124++;
            }
        }
        while (this.field1123 < 10) {
            class8 var3 = (class8) this.field1115.method591();
            if (var3 == null) {
                break;
            }
            if (this.field1113[var3.field613][var3.field610] != 0) {
                this.field1128++;
            }
            this.field1113[var3.field613][var3.field610] = 0;
            this.field1087.method589(var3);
            this.field1123++;
            this.method346((byte) 1, var3);
            this.field1122 = true;
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(BLCOEBDAGX;)V")
    private final void method346(byte arg0, class8 arg1) {
        if (arg0 == 1) {
            boolean var3 = false;
        } else {
            this.field1125 = !this.field1125;
        }
        try {
            if (this.field1093 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field1096 < 4000L) {
                    return;
                }
                this.field1096 = var4;
                this.field1093 = this.field1084.method29(client.field284 + 43594);
                this.field1103 = this.field1093.getInputStream();
                this.field1108 = this.field1093.getOutputStream();
                this.field1108.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field1103.read();
                }
                this.field1102 = 0;
            }
            this.field1129[0] = (byte) arg1.field613;
            this.field1129[1] = (byte) (arg1.field610 >> 8);
            this.field1129[2] = (byte) arg1.field610;
            if (arg1.field612) {
                this.field1129[3] = 2;
            } else if (this.field1084.field528) {
                this.field1129[3] = 0;
            } else {
                this.field1129[3] = 1;
            }
            this.field1108.write(this.field1129, 0, 4);
            this.field1127 = 0;
            this.field1109 = -10000;
        } catch (IOException var9) {
            try {
                this.field1093.close();
            } catch (Exception var8) {
            }
            this.field1093 = null;
            this.field1103 = null;
            this.field1108 = null;
            this.field1092 = 0;
            this.field1109++;
        }
    }

    @OriginalMember(owner = "MWSOISVX", name = "a", descriptor = "(LFNOQZAYQ;Lclient;)V")
    public final void method347(class14 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method246(var3[var4], null);
            int var27 = var26.length / 2;
            class11 var28 = new class11(var26, field1089);
            this.field1112[var4] = new int[var27];
            this.field1113[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1112[var4][var29] = var28.method191();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method246(var5[var6], null);
            int var23 = var22.length / 4;
            class11 var24 = new class11(var22, field1089);
            this.field1088[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1088[var6][var25] = var24.method194();
            }
        }
        byte[] var7 = arg0.method246("model_index", null);
        int var8 = this.field1112[0].length;
        this.field1110 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1110[var9] = var7[var9];
            } else {
                this.field1110[var9] = 0;
            }
        }
        byte[] var10 = arg0.method246("map_index", null);
        class11 var11 = new class11(var10, field1089);
        int var12 = var10.length / 7;
        this.field1099 = new int[var12];
        this.field1121 = new int[var12];
        this.field1120 = new int[var12];
        this.field1118 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1099[var13] = var11.method191();
            this.field1121[var13] = var11.method191();
            this.field1120[var13] = var11.method191();
            this.field1118[var13] = var11.method189();
        }
        byte[] var14 = arg0.method246("anim_index", null);
        class11 var15 = new class11(var14, field1089);
        int var16 = var14.length / 2;
        this.field1107 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1107[var17] = var15.method191();
        }
        byte[] var18 = arg0.method246("midi_index", null);
        class11 var19 = new class11(var18, field1089);
        int var20 = var18.length;
        this.field1085 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1085[var21] = var19.method189();
        }
        this.field1084 = arg1;
        this.field1094 = true;
        this.field1084.method86(this, 2);
    }
}
