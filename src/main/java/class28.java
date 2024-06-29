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

@OriginalClass("client!IBVXWOKK")
public class class28 extends class13 implements Runnable {

    @OriginalMember(owner = "client!IBVXWOKK", name = "d", descriptor = "LNYZQPNXB;")
    private class37 field1019 = new class37(2);

    @OriginalMember(owner = "client!IBVXWOKK", name = "e", descriptor = "[[B")
    private byte[][] field1020 = new byte[4][];

    @OriginalMember(owner = "client!IBVXWOKK", name = "f", descriptor = "Z")
    private boolean field1021 = true;

    @OriginalMember(owner = "client!IBVXWOKK", name = "g", descriptor = "LNYZQPNXB;")
    private class37 field1022 = new class37(2);

    @OriginalMember(owner = "client!IBVXWOKK", name = "j", descriptor = "Z")
    private boolean field1025 = true;

    @OriginalMember(owner = "client!IBVXWOKK", name = "k", descriptor = "[[I")
    private int[][] field1026 = new int[4][];

    @OriginalMember(owner = "client!IBVXWOKK", name = "n", descriptor = "[B")
    private byte[] field1029 = new byte[65000];

    @OriginalMember(owner = "client!IBVXWOKK", name = "o", descriptor = "LEZRJDJYN;")
    private class18 field1030 = new class18(5);

    @OriginalMember(owner = "client!IBVXWOKK", name = "p", descriptor = "Z")
    private boolean field1031 = false;

    @OriginalMember(owner = "client!IBVXWOKK", name = "s", descriptor = "I")
    private int field1034 = 34989;

    @OriginalMember(owner = "client!IBVXWOKK", name = "t", descriptor = "LNYZQPNXB;")
    private class37 field1035 = new class37(2);

    @OriginalMember(owner = "client!IBVXWOKK", name = "w", descriptor = "LNYZQPNXB;")
    private class37 field1038 = new class37(2);

    @OriginalMember(owner = "client!IBVXWOKK", name = "B", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1043 = new CRC32();

    @OriginalMember(owner = "client!IBVXWOKK", name = "F", descriptor = "[[I")
    private int[][] field1047 = new int[4][];

    @OriginalMember(owner = "client!IBVXWOKK", name = "I", descriptor = "Z")
    private boolean field1050 = false;

    @OriginalMember(owner = "client!IBVXWOKK", name = "J", descriptor = "Z")
    private boolean field1051 = true;

    @OriginalMember(owner = "client!IBVXWOKK", name = "K", descriptor = "Ljava/lang/String;")
    public String field1052 = "";

    @OriginalMember(owner = "client!IBVXWOKK", name = "L", descriptor = "I")
    private int field1053 = -424;

    @OriginalMember(owner = "client!IBVXWOKK", name = "M", descriptor = "[B")
    private byte[] field1054 = new byte[500];

    @OriginalMember(owner = "client!IBVXWOKK", name = "N", descriptor = "I")
    private int field1055 = -39;

    @OriginalMember(owner = "client!IBVXWOKK", name = "S", descriptor = "LNYZQPNXB;")
    private class37 field1060 = new class37(2);

    @OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!IBVXWOKK", name = "c", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!IBVXWOKK", name = "h", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!IBVXWOKK", name = "i", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!IBVXWOKK", name = "l", descriptor = "I")
    private int field1027;

    @OriginalMember(owner = "client!IBVXWOKK", name = "q", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!IBVXWOKK", name = "y", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "client!IBVXWOKK", name = "z", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "client!IBVXWOKK", name = "E", descriptor = "I")
    private int field1046;

    @OriginalMember(owner = "client!IBVXWOKK", name = "O", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!IBVXWOKK", name = "P", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "client!IBVXWOKK", name = "r", descriptor = "J")
    private long field1033;

    @OriginalMember(owner = "client!IBVXWOKK", name = "G", descriptor = "LBYVCZVKG;")
    private class9 field1048;

    @OriginalMember(owner = "client!IBVXWOKK", name = "R", descriptor = "Lclient;")
    private client field1059;

    @OriginalMember(owner = "client!IBVXWOKK", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field1037;

    @OriginalMember(owner = "client!IBVXWOKK", name = "D", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1045;

    @OriginalMember(owner = "client!IBVXWOKK", name = "C", descriptor = "Ljava/net/Socket;")
    private Socket field1044;

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "[B")
    private byte[] field1016;

    @OriginalMember(owner = "client!IBVXWOKK", name = "m", descriptor = "[I")
    private int[] field1028;

    @OriginalMember(owner = "client!IBVXWOKK", name = "u", descriptor = "[I")
    private int[] field1036;

    @OriginalMember(owner = "client!IBVXWOKK", name = "x", descriptor = "[I")
    private int[] field1039;

    @OriginalMember(owner = "client!IBVXWOKK", name = "A", descriptor = "[I")
    private int[] field1042;

    @OriginalMember(owner = "client!IBVXWOKK", name = "H", descriptor = "[I")
    private int[] field1049;

    @OriginalMember(owner = "client!IBVXWOKK", name = "Q", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(ZI)Z")
    public final boolean method276(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field1036.length; var4++) {
            if (this.field1039[var4] == arg1) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(IIII)I")
    public final int method277(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0 || arg0 > 0) {
            return this.field1055;
        }
        int var5 = (arg1 << 8) + arg2;
        for (int var6 = 0; var6 < this.field1036.length; var6++) {
            if (this.field1036[var6] == var5) {
                if (arg3 == 0) {
                    return this.field1042[var6];
                }
                return this.field1039[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(IZ)V")
    public final void method278(int arg0, boolean arg1) {
        int var3 = this.field1036.length;
        if (arg0 != -27395) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1028[var4] != 0) {
                this.method284(-424, 3, this.field1039[var4], (byte) 2);
                this.method284(-424, 3, this.field1042[var4], (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(BII[B)Z")
    private final boolean method279(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field1043.reset();
        if (arg0 != -23) {
            this.field1055 = -7;
        }
        this.field1043.update(arg3, 0, var5);
        int var7 = (int) this.field1043.getValue();
        if (arg1 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(III)V")
    public final void method280(int arg0, int arg1, int arg2) {
        if (this.field1059.field682[0] == null || (this.field1026[arg1][arg2] == 0 || (this.field1020[arg1][arg2] == 0 || this.field1046 == 0))) {
            return;
        }
        class9 var4 = new class9();
        var4.field157 = arg1;
        var4.field156 = arg2;
        var4.field155 = false;
        class37 var5 = this.field1019;
        synchronized (this.field1019) {
            this.field1019.method337(var4);
        }
        while (arg0 >= 0) {
            this.field1055 = 455;
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "(I)I")
    public final int method281(int arg0) {
        if (arg0 <= 0) {
            this.field1050 = !this.field1050;
        }
        return this.field1058.length;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "c", descriptor = "(I)V")
    private final void method282(int arg0) {
        this.field1056 = 0;
        this.field1057 = 0;
        class9 var2 = (class9) this.field1022.method340();
        if (arg0 < 8 || arg0 > 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (var2 != null) {
            if (var2.field155) {
                this.field1056++;
            } else {
                this.field1057++;
            }
            var2 = (class9) this.field1022.method342(954);
        }
        while (this.field1056 < 10) {
            class9 var4 = (class9) this.field1038.method339();
            if (var4 == null) {
                break;
            }
            if (this.field1020[var4.field157][var4.field156] != 0) {
                this.field1018++;
            }
            this.field1020[var4.field157][var4.field156] = 0;
            this.field1022.method337(var4);
            this.field1056++;
            this.method289(var4, true);
            this.field1031 = true;
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "()LBYVCZVKG;")
    public final class9 method283() {
        class37 var1 = this.field1035;
        class9 var2;
        synchronized (this.field1035) {
            var2 = (class9) this.field1035.method339();
        }
        if (var2 == null) {
            return null;
        }
        class18 var3 = this.field1030;
        synchronized (this.field1030) {
            var2.method371();
        }
        if (var2.field159 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field159));
            while (true) {
                if (this.field1029.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1029, var4, this.field1029.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field159 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field159[var7] = this.field1029[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(IIIB)V")
    public final void method284(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field1059.field682[0] == null || this.field1026[arg1][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1059.field682[arg1 + 1].method300(arg2, 767);
        if (arg0 >= 0 || this.method279((byte) -23, this.field1026[arg1][arg2], this.field1047[arg1][arg2], var5)) {
            return;
        }
        this.field1020[arg1][arg2] = arg3;
        if (arg3 > this.field1046) {
            this.field1046 = arg3;
        }
        this.field1027++;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "d", descriptor = "(I)V")
    public final void method285(int arg0) {
        class37 var2 = this.field1019;
        synchronized (this.field1019) {
            this.field1019.method344();
        }
        int var3 = 98 / arg0;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "()V")
    public final void method286() {
        this.field1051 = false;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "(ZI)I")
    public final int method287(boolean arg0, int arg1) {
        return arg0 ? this.field1016[arg1] & 0xFF : this.field1053;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "e", descriptor = "(I)V")
    private final void method288(int arg0) {
        if (arg0 != 34989) {
            this.field1053 = 146;
        }
        while (this.field1056 == 0) {
            if (this.field1057 >= 10 || this.field1046 == 0) {
                return;
            }
            class37 var2 = this.field1019;
            class9 var3;
            synchronized (this.field1019) {
                var3 = (class9) this.field1019.method339();
            }
            while (var3 != null) {
                if (this.field1020[var3.field157][var3.field156] != 0) {
                    this.field1020[var3.field157][var3.field156] = 0;
                    this.field1022.method337(var3);
                    this.method289(var3, true);
                    this.field1031 = true;
                    if (this.field1018 < this.field1027) {
                        this.field1018++;
                    }
                    this.field1052 = "Loading extra files - " + this.field1018 * 100 / this.field1027 + "%";
                    this.field1057++;
                    if (this.field1057 == 10) {
                        return;
                    }
                }
                class37 var4 = this.field1019;
                synchronized (this.field1019) {
                    var3 = (class9) this.field1019.method339();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1020[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1046) {
                        var6[var8] = 0;
                        class9 var9 = new class9();
                        var9.field157 = var5;
                        var9.field156 = var8;
                        var9.field155 = false;
                        this.field1022.method337(var9);
                        this.method289(var9, true);
                        this.field1031 = true;
                        if (this.field1018 < this.field1027) {
                            this.field1018++;
                        }
                        this.field1052 = "Loading extra files - " + this.field1018 * 100 / this.field1027 + "%";
                        this.field1057++;
                        if (this.field1057 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1046--;
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(LBYVCZVKG;Z)V")
    private final void method289(class9 arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            if (this.field1044 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field1033 < 4000L) {
                    return;
                }
                this.field1033 = var4;
                this.field1044 = this.field1059.method145(client.field411 + 43594);
                this.field1037 = this.field1044.getInputStream();
                this.field1045 = this.field1044.getOutputStream();
                this.field1045.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field1037.read();
                }
                this.field1017 = 0;
            }
            this.field1054[0] = (byte) arg0.field157;
            this.field1054[1] = (byte) (arg0.field156 >> 8);
            this.field1054[2] = (byte) arg0.field156;
            if (arg0.field155) {
                this.field1054[3] = 2;
            } else if (this.field1059.field680) {
                this.field1054[3] = 0;
            } else {
                this.field1054[3] = 1;
            }
            this.field1045.write(this.field1054, 0, 4);
            this.field1032 = 0;
            this.field1024 = -10000;
        } catch (IOException var9) {
            try {
                this.field1044.close();
            } catch (Exception var8) {
            }
            this.field1044 = null;
            this.field1037 = null;
            this.field1045 = null;
            this.field1041 = 0;
            this.field1024++;
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(Z)V")
    private final void method290(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class37 var3 = this.field1060;
        class9 var4;
        synchronized (this.field1060) {
            var4 = (class9) this.field1060.method339();
        }
        while (var4 != null) {
            this.field1031 = true;
            byte[] var5 = null;
            if (this.field1059.field682[0] != null) {
                var5 = this.field1059.field682[var4.field157 + 1].method300(var4.field156, 767);
            }
            if (!this.method279((byte) -23, this.field1026[var4.field157][var4.field156], this.field1047[var4.field157][var4.field156], var5)) {
                var5 = null;
            }
            class37 var6 = this.field1060;
            synchronized (this.field1060) {
                if (var5 == null) {
                    this.field1038.method337(var4);
                } else {
                    var4.field159 = var5;
                    class37 var7 = this.field1035;
                    synchronized (this.field1035) {
                        this.field1035.method337(var4);
                    }
                }
                var4 = (class9) this.field1060.method339();
            }
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "c", descriptor = "()I")
    public final int method291() {
        class18 var1 = this.field1030;
        synchronized (this.field1030) {
            return this.field1030.method194();
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(II)V")
    public final void method292(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1026.length || arg1 < 0 || arg1 > this.field1026[arg0].length || this.field1026[arg0][arg1] == 0) {
            return;
        }
        class18 var3 = this.field1030;
        synchronized (this.field1030) {
            for (class9 var4 = (class9) this.field1030.method192(); var4 != null; var4 = (class9) this.field1030.method193(954)) {
                if (var4.field157 == arg0 && var4.field156 == arg1) {
                    return;
                }
            }
            class9 var5 = new class9();
            var5.field157 = arg0;
            var5.field156 = arg1;
            var5.field155 = true;
            class37 var6 = this.field1060;
            synchronized (this.field1060) {
                this.field1060.method337(var5);
            }
            this.field1030.method190(var5);
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(BI)I")
    public final int method293(byte arg0, int arg1) {
        return arg0 == 4 ? this.field1026[arg1].length : 4;
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "(Z)V")
    private final void method294(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field1037.available();
            if (this.field1041 == 0 && var3 >= 6) {
                this.field1031 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1037.read(this.field1054, var4, 6 - var4)) {
                }
                int var5 = this.field1054[0] & 0xFF;
                int var6 = ((this.field1054[1] & 0xFF) << 8) + (this.field1054[2] & 0xFF);
                int var7 = ((this.field1054[3] & 0xFF) << 8) + (this.field1054[4] & 0xFF);
                int var8 = this.field1054[5] & 0xFF;
                this.field1048 = null;
                for (class9 var9 = (class9) this.field1022.method340(); var9 != null; var9 = (class9) this.field1022.method342(954)) {
                    if (var9.field157 == var5 && var9.field156 == var6) {
                        this.field1048 = var9;
                    }
                    if (this.field1048 != null) {
                        var9.field158 = 0;
                    }
                }
                if (this.field1048 != null) {
                    this.field1017 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1048.field159 = null;
                        if (this.field1048.field155) {
                            class37 var10 = this.field1035;
                            synchronized (this.field1035) {
                                this.field1035.method337(this.field1048);
                            }
                        } else {
                            this.field1048.method41();
                        }
                        this.field1048 = null;
                    } else {
                        if (this.field1048.field159 == null && var8 == 0) {
                            this.field1048.field159 = new byte[var7];
                        }
                        if (this.field1048.field159 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1040 = var8 * 500;
                this.field1041 = 500;
                if (this.field1041 > var7 - var8 * 500) {
                    this.field1041 = var7 - var8 * 500;
                }
            }
            if (this.field1041 > 0 && var3 >= this.field1041) {
                this.field1031 = true;
                byte[] var11 = this.field1054;
                int var12 = 0;
                if (this.field1048 != null) {
                    var11 = this.field1048.field159;
                    var12 = this.field1040;
                }
                for (int var13 = 0; var13 < this.field1041; var13 += this.field1037.read(var11, var12 + var13, this.field1041 - var13)) {
                }
                if (this.field1041 + this.field1040 >= var11.length && this.field1048 != null) {
                    if (this.field1059.field682[0] != null) {
                        this.field1059.field682[this.field1048.field157 + 1].method301(this.field1048.field156, 697, var11.length, var11);
                    }
                    if (!this.field1048.field155 && this.field1048.field157 == 3) {
                        this.field1048.field155 = true;
                        this.field1048.field157 = 93;
                    }
                    if (this.field1048.field155) {
                        class37 var14 = this.field1035;
                        synchronized (this.field1035) {
                            this.field1035.method337(this.field1048);
                        }
                    } else {
                        this.field1048.method41();
                    }
                }
                this.field1041 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1044.close();
            } catch (Exception var16) {
            }
            this.field1044 = null;
            this.field1037 = null;
            this.field1045 = null;
            this.field1041 = 0;
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(LLKPVZAQN;Lclient;)V")
    public final void method295(class33 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method323(var3[var4], null);
            int var27 = var26.length / 2;
            class58 var28 = new class58((byte) -115, var26);
            this.field1026[var4] = new int[var27];
            this.field1020[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1026[var4][var29] = var28.method517();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method323(var5[var6], null);
            int var23 = var22.length / 4;
            class58 var24 = new class58((byte) -115, var22);
            this.field1047[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1047[var6][var25] = var24.method520();
            }
        }
        byte[] var7 = arg0.method323("model_index", null);
        int var8 = this.field1026[0].length;
        this.field1016 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1016[var9] = var7[var9];
            } else {
                this.field1016[var9] = 0;
            }
        }
        byte[] var10 = arg0.method323("map_index", null);
        class58 var11 = new class58((byte) -115, var10);
        int var12 = var10.length / 7;
        this.field1036 = new int[var12];
        this.field1042 = new int[var12];
        this.field1039 = new int[var12];
        this.field1028 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1036[var13] = var11.method517();
            this.field1042[var13] = var11.method517();
            this.field1039[var13] = var11.method517();
            this.field1028[var13] = var11.method515();
        }
        byte[] var14 = arg0.method323("anim_index", null);
        class58 var15 = new class58((byte) -115, var14);
        int var16 = var14.length / 2;
        this.field1058 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1058[var17] = var15.method517();
        }
        byte[] var18 = arg0.method323("midi_index", null);
        class58 var19 = new class58((byte) -115, var18);
        int var20 = var18.length;
        this.field1049 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1049[var21] = var19.method515();
        }
        this.field1059 = arg1;
        this.field1051 = true;
        this.field1059.method25(this, 2);
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1051) {
                this.field1023++;
                byte var1 = 20;
                if (this.field1046 == 0 && this.field1059.field682[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1031 = true;
                for (int var2 = 0; var2 < 100 && this.field1031; var2++) {
                    this.field1031 = false;
                    this.method290(this.field1021);
                    this.method282(8);
                    if (this.field1056 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method288(this.field1034);
                    if (this.field1037 != null) {
                        this.method294(false);
                    }
                }
                boolean var3 = false;
                for (class9 var4 = (class9) this.field1022.method340(); var4 != null; var4 = (class9) this.field1022.method342(954)) {
                    if (var4.field155) {
                        var3 = true;
                        var4.field158++;
                        if (var4.field158 > 50) {
                            var4.field158 = 0;
                            this.method289(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (class9 var5 = (class9) this.field1022.method340(); var5 != null; var5 = (class9) this.field1022.method342(954)) {
                        var3 = true;
                        var5.field158++;
                        if (var5.field158 > 50) {
                            var5.field158 = 0;
                            this.method289(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field1017++;
                    if (this.field1017 > 750) {
                        try {
                            this.field1044.close();
                        } catch (Exception var8) {
                        }
                        this.field1044 = null;
                        this.field1037 = null;
                        this.field1045 = null;
                        this.field1041 = 0;
                    }
                } else {
                    this.field1017 = 0;
                    this.field1052 = "";
                }
                if (this.field1059.field680 && this.field1044 != null && this.field1045 != null && (this.field1046 > 0 || this.field1059.field682[0] == null)) {
                    this.field1032++;
                    if (this.field1032 > 500) {
                        this.field1032 = 0;
                        this.field1054[0] = 0;
                        this.field1054[1] = 0;
                        this.field1054[2] = 0;
                        this.field1054[3] = 10;
                        try {
                            this.field1045.write(this.field1054, 0, 4);
                        } catch (IOException var7) {
                            this.field1017 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "a", descriptor = "(I)V")
    public final void method188(int arg0) {
        this.method292(0, arg0);
    }

    @OriginalMember(owner = "client!IBVXWOKK", name = "b", descriptor = "(II)Z")
    public final boolean method296(int arg0, int arg1) {
        if (arg1 != 3) {
            throw new NullPointerException();
        }
        return this.field1049[arg0] == 1;
    }
}
