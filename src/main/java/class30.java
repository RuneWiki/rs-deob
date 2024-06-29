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

@OriginalClass("client!LVBGZMMP")
public class class30 extends class52 implements Runnable {

    @OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field894 = new CRC32();

    @OriginalMember(owner = "client!LVBGZMMP", name = "d", descriptor = "Z")
    private boolean field896 = false;

    @OriginalMember(owner = "client!LVBGZMMP", name = "f", descriptor = "[B")
    private byte[] field898 = new byte[65000];

    @OriginalMember(owner = "client!LVBGZMMP", name = "g", descriptor = "Z")
    private boolean field899 = true;

    @OriginalMember(owner = "client!LVBGZMMP", name = "h", descriptor = "Z")
    private boolean field900 = true;

    @OriginalMember(owner = "client!LVBGZMMP", name = "l", descriptor = "LQGWIBVPG;")
    private class42 field904 = new class42(9203);

    @OriginalMember(owner = "client!LVBGZMMP", name = "u", descriptor = "Z")
    private boolean field913 = true;

    @OriginalMember(owner = "client!LVBGZMMP", name = "v", descriptor = "[[I")
    private int[][] field914 = new int[4][];

    @OriginalMember(owner = "client!LVBGZMMP", name = "x", descriptor = "LQGWIBVPG;")
    private class42 field916 = new class42(9203);

    @OriginalMember(owner = "client!LVBGZMMP", name = "z", descriptor = "LQGWIBVPG;")
    private class42 field918 = new class42(9203);

    @OriginalMember(owner = "client!LVBGZMMP", name = "D", descriptor = "[B")
    private byte[] field922 = new byte[500];

    @OriginalMember(owner = "client!LVBGZMMP", name = "G", descriptor = "Ljava/lang/String;")
    public String field925 = "";

    @OriginalMember(owner = "client!LVBGZMMP", name = "H", descriptor = "LAAITTAMV;")
    private class1 field926 = new class1((byte) -113);

    @OriginalMember(owner = "client!LVBGZMMP", name = "I", descriptor = "LQGWIBVPG;")
    private class42 field927 = new class42(9203);

    @OriginalMember(owner = "client!LVBGZMMP", name = "J", descriptor = "[[B")
    private byte[][] field928 = new byte[4][];

    @OriginalMember(owner = "client!LVBGZMMP", name = "L", descriptor = "Z")
    private boolean field930 = false;

    @OriginalMember(owner = "client!LVBGZMMP", name = "M", descriptor = "LQGWIBVPG;")
    private class42 field931 = new class42(9203);

    @OriginalMember(owner = "client!LVBGZMMP", name = "N", descriptor = "[[I")
    private int[][] field932 = new int[4][];

    @OriginalMember(owner = "client!LVBGZMMP", name = "i", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!LVBGZMMP", name = "j", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "client!LVBGZMMP", name = "k", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "client!LVBGZMMP", name = "m", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!LVBGZMMP", name = "p", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!LVBGZMMP", name = "y", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!LVBGZMMP", name = "A", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "client!LVBGZMMP", name = "B", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "client!LVBGZMMP", name = "C", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!LVBGZMMP", name = "E", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!LVBGZMMP", name = "K", descriptor = "I")
    private int field929;

    @OriginalMember(owner = "client!LVBGZMMP", name = "r", descriptor = "J")
    private long field910;

    @OriginalMember(owner = "client!LVBGZMMP", name = "P", descriptor = "LWNUCRRKP;")
    private class61 field934;

    @OriginalMember(owner = "client!LVBGZMMP", name = "w", descriptor = "Lclient;")
    private client field915;

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field893;

    @OriginalMember(owner = "client!LVBGZMMP", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field897;

    @OriginalMember(owner = "client!LVBGZMMP", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field907;

    @OriginalMember(owner = "client!LVBGZMMP", name = "t", descriptor = "[B")
    private byte[] field912;

    @OriginalMember(owner = "client!LVBGZMMP", name = "c", descriptor = "[I")
    private int[] field895;

    @OriginalMember(owner = "client!LVBGZMMP", name = "n", descriptor = "[I")
    private int[] field906;

    @OriginalMember(owner = "client!LVBGZMMP", name = "q", descriptor = "[I")
    private int[] field909;

    @OriginalMember(owner = "client!LVBGZMMP", name = "s", descriptor = "[I")
    private int[] field911;

    @OriginalMember(owner = "client!LVBGZMMP", name = "F", descriptor = "[I")
    private int[] field924;

    @OriginalMember(owner = "client!LVBGZMMP", name = "O", descriptor = "[I")
    private int[] field933;

    @OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class42 var3 = this.field916;
        synchronized (this.field916) {
            this.field916.method426();
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(LWNUCRRKP;Z)V")
    private final void method358(class61 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        try {
            if (this.field907 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field910 < 4000L) {
                    return;
                }
                this.field910 = var3;
                this.field907 = this.field915.method73(client.field119 + 43594);
                this.field893 = this.field907.getInputStream();
                this.field897 = this.field907.getOutputStream();
                this.field897.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field893.read();
                }
                this.field923 = 0;
            }
            this.field922[0] = (byte) arg0.field1511;
            this.field922[1] = (byte) (arg0.field1509 >> 8);
            this.field922[2] = (byte) arg0.field1509;
            if (arg0.field1510) {
                this.field922[3] = 2;
            } else if (this.field915.field281) {
                this.field922[3] = 0;
            } else {
                this.field922[3] = 1;
            }
            this.field897.write(this.field922, 0, 4);
            this.field917 = 0;
            this.field908 = -10000;
        } catch (IOException var8) {
            try {
                this.field907.close();
            } catch (Exception var7) {
            }
            this.field907 = null;
            this.field893 = null;
            this.field897 = null;
            this.field903 = 0;
            this.field908++;
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(BI)I")
    public final int method359(byte arg0, int arg1) {
        if (arg0 != -58) {
            this.field900 = !this.field900;
        }
        return this.field932[arg1].length;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(BZ)V")
    public final void method360(byte arg0, boolean arg1) {
        int var3 = this.field895.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field909[var4] != 0) {
                this.method365(3, (byte) 2, this.field911[var4], 55);
                this.method365(3, (byte) 2, this.field924[var4], 55);
            }
        }
        if (arg0 == -122) {
            ;
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "c", descriptor = "(I)V")
    private final void method361(int arg0) {
        this.field920 = 0;
        this.field921 = 0;
        class61 var2 = (class61) this.field918.method422();
        if (arg0 != 6) {
            this.field913 = !this.field913;
        }
        while (var2 != null) {
            if (var2.field1510) {
                this.field920++;
            } else {
                this.field921++;
            }
            var2 = (class61) this.field918.method424(false);
        }
        while (this.field920 < 10) {
            class61 var3 = (class61) this.field927.method421();
            if (var3 == null) {
                break;
            }
            if (this.field928[var3.field1511][var3.field1509] != 0) {
                this.field929++;
            }
            this.field928[var3.field1511][var3.field1509] = 0;
            this.field918.method419(var3);
            this.field920++;
            this.method358(var3, false);
            this.field896 = true;
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "([BIIB)Z")
    private final boolean method362(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        if (arg3 != 5) {
            this.field900 = !this.field900;
        }
        this.field894.reset();
        this.field894.update(arg0, 0, var5);
        int var7 = (int) this.field894.getValue();
        if (arg1 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "()V")
    public final void method363() {
        this.field899 = false;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(IB)Z")
    public final boolean method364(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field895.length; var3++) {
            if (this.field911[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field899) {
                this.field901++;
                byte var1 = 20;
                if (this.field919 == 0 && this.field915.field294[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field896 = true;
                for (int var2 = 0; var2 < 100 && this.field896; var2++) {
                    this.field896 = false;
                    this.method378(-41529);
                    this.method361(6);
                    if (this.field920 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method370(false);
                    if (this.field893 != null) {
                        this.method375(false);
                    }
                }
                boolean var3 = false;
                for (class61 var4 = (class61) this.field918.method422(); var4 != null; var4 = (class61) this.field918.method424(false)) {
                    if (var4.field1510) {
                        var3 = true;
                        var4.field1513++;
                        if (var4.field1513 > 50) {
                            var4.field1513 = 0;
                            this.method358(var4, false);
                        }
                    }
                }
                if (!var3) {
                    for (class61 var5 = (class61) this.field918.method422(); var5 != null; var5 = (class61) this.field918.method424(false)) {
                        var3 = true;
                        var5.field1513++;
                        if (var5.field1513 > 50) {
                            var5.field1513 = 0;
                            this.method358(var5, false);
                        }
                    }
                }
                if (var3) {
                    this.field923++;
                    if (this.field923 > 750) {
                        try {
                            this.field907.close();
                        } catch (Exception var8) {
                        }
                        this.field907 = null;
                        this.field893 = null;
                        this.field897 = null;
                        this.field903 = 0;
                    }
                } else {
                    this.field923 = 0;
                    this.field925 = "";
                }
                if (this.field915.field281 && this.field907 != null && this.field897 != null && (this.field919 > 0 || this.field915.field294[0] == null)) {
                    this.field917++;
                    if (this.field917 > 500) {
                        this.field917 = 0;
                        this.field922[0] = 0;
                        this.field922[1] = 0;
                        this.field922[2] = 0;
                        this.field922[3] = 10;
                        try {
                            this.field897.write(this.field922, 0, 4);
                        } catch (IOException var7) {
                            this.field923 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(IBII)V")
    public final void method365(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field915.field294[0] == null || this.field932[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field915.field294[arg0 + 1].method8(arg2, 799);
        if (arg3 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (this.method362(var5, this.field932[arg0][arg2], this.field914[arg0][arg2], (byte) 5)) {
            return;
        }
        this.field928[arg0][arg2] = arg1;
        if (arg1 > this.field919) {
            this.field919 = arg1;
        }
        this.field905++;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(II)V")
    public final void method366(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field932.length || arg1 < 0 || arg1 > this.field932[arg0].length || this.field932[arg0][arg1] == 0) {
            return;
        }
        class1 var3 = this.field926;
        synchronized (this.field926) {
            for (class61 var4 = (class61) this.field926.method3(); var4 != null; var4 = (class61) this.field926.method4(false)) {
                if (var4.field1511 == arg0 && var4.field1509 == arg1) {
                    return;
                }
            }
            class61 var5 = new class61();
            var5.field1511 = arg0;
            var5.field1509 = arg1;
            var5.field1510 = true;
            class42 var6 = this.field904;
            synchronized (this.field904) {
                this.field904.method419(var5);
            }
            this.field926.method1(var5);
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "(II)Z")
    public final boolean method367(int arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return this.field906[arg1] == 1;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(III)V")
    public final void method368(int arg0, int arg1, int arg2) {
        if (this.field915.field294[0] == null || (this.field932[arg2][arg0] == 0 || (this.field928[arg2][arg0] == 0 || this.field919 == 0))) {
            return;
        }
        class61 var4 = new class61();
        var4.field1511 = arg2;
        var4.field1509 = arg0;
        var4.field1510 = false;
        class42 var5 = this.field916;
        synchronized (this.field916) {
            this.field916.method419(var4);
        }
        if (arg1 != 11573) {
            this.field930 = !this.field930;
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(B)I")
    public final int method369(byte arg0) {
        if (arg0 != -117) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field933.length;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(Z)V")
    private final void method370(boolean arg0) {
        if (arg0) {
            return;
        }
        while (this.field920 == 0) {
            if (this.field921 >= 10 || this.field919 == 0) {
                return;
            }
            class42 var2 = this.field916;
            class61 var3;
            synchronized (this.field916) {
                var3 = (class61) this.field916.method421();
            }
            while (var3 != null) {
                if (this.field928[var3.field1511][var3.field1509] != 0) {
                    this.field928[var3.field1511][var3.field1509] = 0;
                    this.field918.method419(var3);
                    this.method358(var3, false);
                    this.field896 = true;
                    if (this.field929 < this.field905) {
                        this.field929++;
                    }
                    this.field925 = "Loading extra files - " + this.field929 * 100 / this.field905 + "%";
                    this.field921++;
                    if (this.field921 == 10) {
                        return;
                    }
                }
                class42 var4 = this.field916;
                synchronized (this.field916) {
                    var3 = (class61) this.field916.method421();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field928[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field919) {
                        var6[var8] = 0;
                        class61 var9 = new class61();
                        var9.field1511 = var5;
                        var9.field1509 = var8;
                        var9.field1510 = false;
                        this.field918.method419(var9);
                        this.method358(var9, false);
                        this.field896 = true;
                        if (this.field929 < this.field905) {
                            this.field929++;
                        }
                        this.field925 = "Loading extra files - " + this.field929 * 100 / this.field905 + "%";
                        this.field921++;
                        if (this.field921 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field919--;
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(IIII)I")
    public final int method371(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.field900 = !this.field900;
        }
        int var5 = (arg3 << 8) + arg1;
        for (int var6 = 0; var6 < this.field895.length; var6++) {
            if (this.field895[var6] == var5) {
                if (arg2 == 0) {
                    return this.field924[var6];
                }
                return this.field911[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "()LWNUCRRKP;")
    public final class61 method372() {
        class42 var1 = this.field931;
        class61 var2;
        synchronized (this.field931) {
            var2 = (class61) this.field931.method421();
        }
        if (var2 == null) {
            return null;
        }
        class1 var3 = this.field926;
        synchronized (this.field926) {
            var2.method188();
        }
        if (var2.field1512 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1512));
            while (true) {
                if (this.field898.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field898, var4, this.field898.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1512 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1512[var7] = this.field898[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(LAKPFVPPG;Lclient;)V")
    public final void method373(class2 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method7(var3[var4], null);
            int var27 = var26.length / 2;
            class13 var28 = new class13(var26, (byte) 3);
            this.field932[var4] = new int[var27];
            this.field928[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field932[var4][var29] = var28.method215();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method7(var5[var6], null);
            int var23 = var22.length / 4;
            class13 var24 = new class13(var22, (byte) 3);
            this.field914[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field914[var6][var25] = var24.method218();
            }
        }
        byte[] var7 = arg0.method7("model_index", null);
        int var8 = this.field932[0].length;
        this.field912 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field912[var9] = var7[var9];
            } else {
                this.field912[var9] = 0;
            }
        }
        byte[] var10 = arg0.method7("map_index", null);
        class13 var11 = new class13(var10, (byte) 3);
        int var12 = var10.length / 7;
        this.field895 = new int[var12];
        this.field924 = new int[var12];
        this.field911 = new int[var12];
        this.field909 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field895[var13] = var11.method215();
            this.field924[var13] = var11.method215();
            this.field911[var13] = var11.method215();
            this.field909[var13] = var11.method213();
        }
        byte[] var14 = arg0.method7("anim_index", null);
        class13 var15 = new class13(var14, (byte) 3);
        int var16 = var14.length / 2;
        this.field933 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field933[var17] = var15.method215();
        }
        byte[] var18 = arg0.method7("midi_index", null);
        class13 var19 = new class13(var18, (byte) 3);
        int var20 = var18.length;
        this.field906 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field906[var21] = var19.method213();
        }
        this.field915 = arg1;
        this.field899 = true;
        this.field915.method107(this, 2);
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(ZI)I")
    public final int method374(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field912[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "b", descriptor = "(Z)V")
    private final void method375(boolean arg0) {
        if (arg0) {
            return;
        }
        try {
            int var2 = this.field893.available();
            if (this.field903 == 0 && var2 >= 6) {
                this.field896 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field893.read(this.field922, var3, 6 - var3)) {
                }
                int var4 = this.field922[0] & 0xFF;
                int var5 = ((this.field922[1] & 0xFF) << 8) + (this.field922[2] & 0xFF);
                int var6 = ((this.field922[3] & 0xFF) << 8) + (this.field922[4] & 0xFF);
                int var7 = this.field922[5] & 0xFF;
                this.field934 = null;
                for (class61 var8 = (class61) this.field918.method422(); var8 != null; var8 = (class61) this.field918.method424(false)) {
                    if (var8.field1511 == var4 && var8.field1509 == var5) {
                        this.field934 = var8;
                    }
                    if (this.field934 != null) {
                        var8.field1513 = 0;
                    }
                }
                if (this.field934 != null) {
                    this.field923 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field934.field1512 = null;
                        if (this.field934.field1510) {
                            class42 var9 = this.field931;
                            synchronized (this.field931) {
                                this.field931.method419(this.field934);
                            }
                        } else {
                            this.field934.method418();
                        }
                        this.field934 = null;
                    } else {
                        if (this.field934.field1512 == null && var7 == 0) {
                            this.field934.field1512 = new byte[var6];
                        }
                        if (this.field934.field1512 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field902 = var7 * 500;
                this.field903 = 500;
                if (this.field903 > var6 - var7 * 500) {
                    this.field903 = var6 - var7 * 500;
                }
            }
            if (this.field903 > 0 && var2 >= this.field903) {
                this.field896 = true;
                byte[] var10 = this.field922;
                int var11 = 0;
                if (this.field934 != null) {
                    var10 = this.field934.field1512;
                    var11 = this.field902;
                }
                for (int var12 = 0; var12 < this.field903; var12 += this.field893.read(var10, var11 + var12, this.field903 - var12)) {
                }
                if (this.field903 + this.field902 >= var10.length && this.field934 != null) {
                    if (this.field915.field294[0] != null) {
                        this.field915.field294[this.field934.field1511 + 1].method9((byte) -9, var10, var10.length, this.field934.field1509);
                    }
                    if (!this.field934.field1510 && this.field934.field1511 == 3) {
                        this.field934.field1510 = true;
                        this.field934.field1511 = 93;
                    }
                    if (this.field934.field1510) {
                        class42 var13 = this.field931;
                        synchronized (this.field931) {
                            this.field931.method419(this.field934);
                        }
                    } else {
                        this.field934.method418();
                    }
                }
                this.field903 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field907.close();
            } catch (Exception var15) {
            }
            this.field907 = null;
            this.field893 = null;
            this.field897 = null;
            this.field903 = 0;
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "a", descriptor = "(I)V")
    public final void method376(int arg0) {
        this.method366(0, arg0);
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "c", descriptor = "()I")
    public final int method377() {
        class1 var1 = this.field926;
        synchronized (this.field926) {
            return this.field926.method5();
        }
    }

    @OriginalMember(owner = "client!LVBGZMMP", name = "d", descriptor = "(I)V")
    private final void method378(int arg0) {
        if (arg0 != -41529) {
            return;
        }
        class42 var2 = this.field904;
        class61 var3;
        synchronized (this.field904) {
            var3 = (class61) this.field904.method421();
        }
        while (var3 != null) {
            this.field896 = true;
            byte[] var4 = null;
            if (this.field915.field294[0] != null) {
                var4 = this.field915.field294[var3.field1511 + 1].method8(var3.field1509, 799);
            }
            if (!this.method362(var4, this.field932[var3.field1511][var3.field1509], this.field914[var3.field1511][var3.field1509], (byte) 5)) {
                var4 = null;
            }
            class42 var5 = this.field904;
            synchronized (this.field904) {
                if (var4 == null) {
                    this.field927.method419(var3);
                } else {
                    var3.field1512 = var4;
                    class42 var6 = this.field931;
                    synchronized (this.field931) {
                        this.field931.method419(var3);
                    }
                }
                var3 = (class61) this.field904.method421();
            }
        }
    }
}
