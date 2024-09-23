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

@OriginalClass("JHGVYYQH")
public class class28 extends class10 implements Runnable {

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "Z")
    private boolean field923 = false;

    @OriginalMember(owner = "JHGVYYQH", name = "b", descriptor = "LUEUHLQTT;")
    private class61 field924 = new class61(0);

    @OriginalMember(owner = "JHGVYYQH", name = "e", descriptor = "[[I")
    private int[][] field927 = new int[4][];

    @OriginalMember(owner = "JHGVYYQH", name = "f", descriptor = "LUEUHLQTT;")
    private class61 field928 = new class61(0);

    @OriginalMember(owner = "JHGVYYQH", name = "h", descriptor = "Z")
    private boolean field930 = true;

    @OriginalMember(owner = "JHGVYYQH", name = "i", descriptor = "I")
    private int field931 = 986;

    @OriginalMember(owner = "JHGVYYQH", name = "j", descriptor = "I")
    private int field932 = 1;

    @OriginalMember(owner = "JHGVYYQH", name = "k", descriptor = "LUEUHLQTT;")
    private class61 field933 = new class61(0);

    @OriginalMember(owner = "JHGVYYQH", name = "u", descriptor = "Z")
    private boolean field943 = true;

    @OriginalMember(owner = "JHGVYYQH", name = "y", descriptor = "[B")
    private byte[] field947 = new byte[500];

    @OriginalMember(owner = "JHGVYYQH", name = "z", descriptor = "LHIGYXWXY;")
    private class22 field948 = new class22(field939);

    @OriginalMember(owner = "JHGVYYQH", name = "C", descriptor = "[[B")
    private byte[][] field951 = new byte[4][];

    @OriginalMember(owner = "JHGVYYQH", name = "D", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field952 = new CRC32();

    @OriginalMember(owner = "JHGVYYQH", name = "E", descriptor = "Ljava/lang/String;")
    public String field953 = "";

    @OriginalMember(owner = "JHGVYYQH", name = "G", descriptor = "LUEUHLQTT;")
    private class61 field955 = new class61(0);

    @OriginalMember(owner = "JHGVYYQH", name = "J", descriptor = "Z")
    private boolean field958 = true;

    @OriginalMember(owner = "JHGVYYQH", name = "L", descriptor = "[[I")
    private int[][] field960 = new int[4][];

    @OriginalMember(owner = "JHGVYYQH", name = "N", descriptor = "LUEUHLQTT;")
    private class61 field962 = new class61(0);

    @OriginalMember(owner = "JHGVYYQH", name = "R", descriptor = "[B")
    private byte[] field966 = new byte[65000];

    @OriginalMember(owner = "JHGVYYQH", name = "m", descriptor = "I")
    private int field935;

    @OriginalMember(owner = "JHGVYYQH", name = "n", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "JHGVYYQH", name = "o", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "JHGVYYQH", name = "w", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "JHGVYYQH", name = "x", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "JHGVYYQH", name = "A", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "JHGVYYQH", name = "B", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "JHGVYYQH", name = "I", descriptor = "I")
    private int field957;

    @OriginalMember(owner = "JHGVYYQH", name = "K", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "JHGVYYQH", name = "O", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "JHGVYYQH", name = "P", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "JHGVYYQH", name = "v", descriptor = "J")
    private long field944;

    @OriginalMember(owner = "JHGVYYQH", name = "H", descriptor = "LMNWUSGDU;")
    private class35 field956;

    @OriginalMember(owner = "JHGVYYQH", name = "s", descriptor = "Lclient;")
    private client field941;

    @OriginalMember(owner = "JHGVYYQH", name = "p", descriptor = "Ljava/io/InputStream;")
    private InputStream field938;

    @OriginalMember(owner = "JHGVYYQH", name = "M", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field961;

    @OriginalMember(owner = "JHGVYYQH", name = "F", descriptor = "Ljava/net/Socket;")
    private Socket field954;

    @OriginalMember(owner = "JHGVYYQH", name = "q", descriptor = "Z")
    private static boolean field939;

    @OriginalMember(owner = "JHGVYYQH", name = "g", descriptor = "[B")
    private byte[] field929;

    @OriginalMember(owner = "JHGVYYQH", name = "c", descriptor = "[I")
    private int[] field925;

    @OriginalMember(owner = "JHGVYYQH", name = "d", descriptor = "[I")
    private int[] field926;

    @OriginalMember(owner = "JHGVYYQH", name = "l", descriptor = "[I")
    private int[] field934;

    @OriginalMember(owner = "JHGVYYQH", name = "r", descriptor = "[I")
    private int[] field940;

    @OriginalMember(owner = "JHGVYYQH", name = "t", descriptor = "[I")
    private int[] field942;

    @OriginalMember(owner = "JHGVYYQH", name = "Q", descriptor = "[I")
    private int[] field965;

    @OriginalMember(owner = "JHGVYYQH", name = "b", descriptor = "(I)I")
    public final int method255(int arg0) {
        if (arg0 >= 0) {
            this.field943 = !this.field943;
        }
        return this.field925.length;
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(III[B)Z")
    private final boolean method256(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field952.reset();
        if (arg1 < 6 || arg1 > 6) {
            this.field943 = !this.field943;
        }
        this.field952.update(arg3, 0, var5);
        int var7 = (int) this.field952.getValue();
        if (arg0 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(IIII)I")
    public final int method257(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 << 8) + arg3;
        int var6 = 40 / arg0;
        for (int var7 = 0; var7 < this.field942.length; var7++) {
            if (this.field942[var7] == var5) {
                if (arg2 == 0) {
                    return this.field965[var7];
                }
                return this.field940[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(B)V")
    private final void method258(byte arg0) {
        if (arg0 != 52) {
            return;
        }
        this.field936 = 0;
        this.field937 = 0;
        for (class35 var2 = (class35) this.field962.method510(); var2 != null; var2 = (class35) this.field962.method512(false)) {
            if (var2.field1042) {
                this.field936++;
            } else {
                this.field937++;
            }
        }
        while (this.field936 < 10) {
            class35 var3 = (class35) this.field924.method509();
            if (var3 == null) {
                break;
            }
            if (this.field951[var3.field1038][var3.field1040] != 0) {
                this.field935++;
            }
            this.field951[var3.field1038][var3.field1040] = 0;
            this.field962.method507(var3);
            this.field936++;
            this.method269(var3, true);
            this.field923 = true;
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(Z)V")
    private final void method259(boolean arg0) {
        if (!arg0) {
            this.field958 = !this.field958;
        }
        while (this.field936 == 0) {
            if (this.field937 >= 10 || this.field957 == 0) {
                return;
            }
            class61 var2 = this.field955;
            class35 var3;
            synchronized (this.field955) {
                var3 = (class35) this.field955.method509();
            }
            while (var3 != null) {
                if (this.field951[var3.field1038][var3.field1040] != 0) {
                    this.field951[var3.field1038][var3.field1040] = 0;
                    this.field962.method507(var3);
                    this.method269(var3, true);
                    this.field923 = true;
                    if (this.field935 < this.field950) {
                        this.field935++;
                    }
                    this.field953 = "Loading extra files - " + this.field935 * 100 / this.field950 + "%";
                    this.field937++;
                    if (this.field937 == 10) {
                        return;
                    }
                }
                class61 var4 = this.field955;
                synchronized (this.field955) {
                    var3 = (class35) this.field955.method509();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field951[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field957) {
                        var6[var8] = 0;
                        class35 var9 = new class35();
                        var9.field1038 = var5;
                        var9.field1040 = var8;
                        var9.field1042 = false;
                        this.field962.method507(var9);
                        this.method269(var9, true);
                        this.field923 = true;
                        if (this.field935 < this.field950) {
                            this.field935++;
                        }
                        this.field953 = "Loading extra files - " + this.field935 * 100 / this.field950 + "%";
                        this.field937++;
                        if (this.field937 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field957--;
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "b", descriptor = "(Z)V")
    public final void method260(boolean arg0) {
        if (arg0) {
            class61 var2 = this.field955;
            synchronized (this.field955) {
                this.field955.method514();
            }
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "c", descriptor = "(I)V")
    private final void method261(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            field939 = !field939;
        }
        class61 var2 = this.field933;
        class35 var3;
        synchronized (this.field933) {
            var3 = (class35) this.field933.method509();
        }
        while (var3 != null) {
            this.field923 = true;
            byte[] var4 = null;
            if (this.field941.field535[0] != null) {
                var4 = this.field941.field535[var3.field1038 + 1].method515(var3.field1040, this.field958);
            }
            if (!this.method256(this.field960[var3.field1038][var3.field1040], 6, this.field927[var3.field1038][var3.field1040], var4)) {
                var4 = null;
            }
            class61 var5 = this.field933;
            synchronized (this.field933) {
                if (var4 == null) {
                    this.field924.method507(var3);
                } else {
                    var3.field1041 = var4;
                    class61 var6 = this.field928;
                    synchronized (this.field928) {
                        this.field928.method507(var3);
                    }
                }
                var3 = (class35) this.field933.method509();
            }
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(II)I")
    public final int method262(int arg0, int arg1) {
        int var3 = 23 / arg1;
        return this.field960[arg0].length;
    }

    @OriginalMember(owner = "JHGVYYQH", name = "d", descriptor = "(I)V")
    private final void method263(int arg0) {
        if (arg0 != 0) {
            this.field931 = -189;
        }
        try {
            int var2 = this.field938.available();
            if (this.field964 == 0 && var2 >= 6) {
                this.field923 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field938.read(this.field947, var3, 6 - var3)) {
                }
                int var4 = this.field947[0] & 0xFF;
                int var5 = ((this.field947[1] & 0xFF) << 8) + (this.field947[2] & 0xFF);
                int var6 = ((this.field947[3] & 0xFF) << 8) + (this.field947[4] & 0xFF);
                int var7 = this.field947[5] & 0xFF;
                this.field956 = null;
                for (class35 var8 = (class35) this.field962.method510(); var8 != null; var8 = (class35) this.field962.method512(false)) {
                    if (var8.field1038 == var4 && var8.field1040 == var5) {
                        this.field956 = var8;
                    }
                    if (this.field956 != null) {
                        var8.field1039 = 0;
                    }
                }
                if (this.field956 != null) {
                    this.field949 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field956.field1041 = null;
                        if (this.field956.field1042) {
                            class61 var9 = this.field928;
                            synchronized (this.field928) {
                                this.field928.method507(this.field956);
                            }
                        } else {
                            this.field956.method254();
                        }
                        this.field956 = null;
                    } else {
                        if (this.field956.field1041 == null && var7 == 0) {
                            this.field956.field1041 = new byte[var6];
                        }
                        if (this.field956.field1041 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field963 = var7 * 500;
                this.field964 = 500;
                if (this.field964 > var6 - var7 * 500) {
                    this.field964 = var6 - var7 * 500;
                }
            }
            if (this.field964 > 0 && var2 >= this.field964) {
                this.field923 = true;
                byte[] var10 = this.field947;
                int var11 = 0;
                if (this.field956 != null) {
                    var10 = this.field956.field1041;
                    var11 = this.field963;
                }
                for (int var12 = 0; var12 < this.field964; var12 += this.field938.read(var10, var11 + var12, this.field964 - var12)) {
                }
                if (this.field964 + this.field963 >= var10.length && this.field956 != null) {
                    if (this.field941.field535[0] != null) {
                        this.field941.field535[this.field956.field1038 + 1].method516(var10, this.field956.field1040, -737, var10.length);
                    }
                    if (!this.field956.field1042 && this.field956.field1038 == 3) {
                        this.field956.field1042 = true;
                        this.field956.field1038 = 93;
                    }
                    if (this.field956.field1042) {
                        class61 var13 = this.field928;
                        synchronized (this.field928) {
                            this.field928.method507(this.field956);
                        }
                    } else {
                        this.field956.method254();
                    }
                }
                this.field964 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field954.close();
            } catch (Exception var15) {
            }
            this.field954 = null;
            this.field938 = null;
            this.field961 = null;
            this.field964 = 0;
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(BI)Z")
    public final boolean method264(byte arg0, int arg1) {
        for (int var3 = 0; var3 < this.field942.length; var3++) {
            if (this.field940[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != 15) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        this.method265(0, arg0);
    }

    @OriginalMember(owner = "JHGVYYQH", name = "b", descriptor = "(II)V")
    public final void method265(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field960.length || arg1 < 0 || arg1 > this.field960[arg0].length || this.field960[arg0][arg1] == 0) {
            return;
        }
        class22 var3 = this.field948;
        synchronized (this.field948) {
            for (class35 var4 = (class35) this.field948.method246(); var4 != null; var4 = (class35) this.field948.method247(false)) {
                if (var4.field1038 == arg0 && var4.field1040 == arg1) {
                    return;
                }
            }
            class35 var5 = new class35();
            var5.field1038 = arg0;
            var5.field1040 = arg1;
            var5.field1042 = true;
            class61 var6 = this.field933;
            synchronized (this.field933) {
                this.field933.method507(var5);
            }
            this.field948.method244(var5);
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(III)V")
    public final void method266(int arg0, int arg1, int arg2) {
        if (this.field941.field535[0] == null || (this.field960[arg2][arg1] == 0 || (this.field951[arg2][arg1] == 0 || this.field957 == 0))) {
            return;
        }
        class35 var4 = new class35();
        var4.field1038 = arg2;
        var4.field1040 = arg1;
        if (arg0 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        var4.field1042 = false;
        class61 var6 = this.field955;
        synchronized (this.field955) {
            this.field955.method507(var4);
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "()LMNWUSGDU;")
    public final class35 method267() {
        class61 var1 = this.field928;
        class35 var2;
        synchronized (this.field928) {
            var2 = (class35) this.field928.method509();
        }
        if (var2 == null) {
            return null;
        }
        class22 var3 = this.field948;
        synchronized (this.field948) {
            var2.method312();
        }
        if (var2.field1041 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1041));
            while (true) {
                if (this.field966.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field966, var4, this.field966.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1041 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1041[var7] = this.field966[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "JHGVYYQH", name = "b", descriptor = "()I")
    public final int method268() {
        class22 var1 = this.field948;
        synchronized (this.field948) {
            return this.field948.method248();
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(LMNWUSGDU;Z)V")
    private final void method269(class35 arg0, boolean arg1) {
        if (!arg1) {
            this.field932 = 398;
        }
        try {
            if (this.field954 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field944 < 4000L) {
                    return;
                }
                this.field944 = var3;
                this.field954 = this.field941.method133(client.field615 + 43594);
                this.field938 = this.field954.getInputStream();
                this.field961 = this.field954.getOutputStream();
                this.field961.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field938.read();
                }
                this.field949 = 0;
            }
            this.field947[0] = (byte) arg0.field1038;
            this.field947[1] = (byte) (arg0.field1040 >> 8);
            this.field947[2] = (byte) arg0.field1040;
            if (arg0.field1042) {
                this.field947[3] = 2;
            } else if (this.field941.field185) {
                this.field947[3] = 0;
            } else {
                this.field947[3] = 1;
            }
            this.field961.write(this.field947, 0, 4);
            this.field959 = 0;
            this.field946 = -10000;
        } catch (IOException var8) {
            try {
                this.field954.close();
            } catch (Exception var7) {
            }
            this.field954 = null;
            this.field938 = null;
            this.field961 = null;
            this.field964 = 0;
            this.field946++;
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(ZB)V")
    public final void method270(boolean arg0, byte arg1) {
        int var3 = this.field942.length;
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg0 || this.field934[var5] != 0) {
                this.method275(-13858, (byte) 2, this.field940[var5], 3);
                this.method275(-13858, (byte) 2, this.field965[var5], 3);
            }
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(ZI)Z")
    public final boolean method271(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return this.field926[arg1] == 1;
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(LTXPLZUUI;Lclient;)V")
    public final void method272(class60 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method506(var3[var4], null);
            int var27 = var26.length / 2;
            class43 var28 = new class43(var26, 0);
            this.field960[var4] = new int[var27];
            this.field951[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field960[var4][var29] = var28.method332();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method506(var5[var6], null);
            int var23 = var22.length / 4;
            class43 var24 = new class43(var22, 0);
            this.field927[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field927[var6][var25] = var24.method335();
            }
        }
        byte[] var7 = arg0.method506("model_index", null);
        int var8 = this.field960[0].length;
        this.field929 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field929[var9] = var7[var9];
            } else {
                this.field929[var9] = 0;
            }
        }
        byte[] var10 = arg0.method506("map_index", null);
        class43 var11 = new class43(var10, 0);
        int var12 = var10.length / 7;
        this.field942 = new int[var12];
        this.field965 = new int[var12];
        this.field940 = new int[var12];
        this.field934 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field942[var13] = var11.method332();
            this.field965[var13] = var11.method332();
            this.field940[var13] = var11.method332();
            this.field934[var13] = var11.method330();
        }
        byte[] var14 = arg0.method506("anim_index", null);
        class43 var15 = new class43(var14, 0);
        int var16 = var14.length / 2;
        this.field925 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field925[var17] = var15.method332();
        }
        byte[] var18 = arg0.method506("midi_index", null);
        class43 var19 = new class43(var18, 0);
        int var20 = var18.length;
        this.field926 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field926[var21] = var19.method330();
        }
        this.field941 = arg1;
        this.field930 = true;
        this.field941.method135(this, 2);
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(IB)I")
    public final int method273(int arg0, byte arg1) {
        if (arg1 != -88) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field929[arg0] & 0xFF;
    }

    @OriginalMember(owner = "JHGVYYQH", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field930) {
                this.field945++;
                byte var1 = 20;
                if (this.field957 == 0 && this.field941.field535[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field923 = true;
                for (int var2 = 0; var2 < 100 && this.field923; var2++) {
                    this.field923 = false;
                    this.method261(9);
                    this.method258((byte) 52);
                    if (this.field936 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method259(true);
                    if (this.field938 != null) {
                        this.method263(0);
                    }
                }
                boolean var3 = false;
                for (class35 var4 = (class35) this.field962.method510(); var4 != null; var4 = (class35) this.field962.method512(false)) {
                    if (var4.field1042) {
                        var3 = true;
                        var4.field1039++;
                        if (var4.field1039 > 50) {
                            var4.field1039 = 0;
                            this.method269(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (class35 var5 = (class35) this.field962.method510(); var5 != null; var5 = (class35) this.field962.method512(false)) {
                        var3 = true;
                        var5.field1039++;
                        if (var5.field1039 > 50) {
                            var5.field1039 = 0;
                            this.method269(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field949++;
                    if (this.field949 > 750) {
                        try {
                            this.field954.close();
                        } catch (Exception var8) {
                        }
                        this.field954 = null;
                        this.field938 = null;
                        this.field961 = null;
                        this.field964 = 0;
                    }
                } else {
                    this.field949 = 0;
                    this.field953 = "";
                }
                if (this.field941.field185 && this.field954 != null && this.field961 != null && (this.field957 > 0 || this.field941.field535[0] == null)) {
                    this.field959++;
                    if (this.field959 > 500) {
                        this.field959 = 0;
                        this.field947[0] = 0;
                        this.field947[1] = 0;
                        this.field947[2] = 0;
                        this.field947[3] = 10;
                        try {
                            this.field961.write(this.field947, 0, 4);
                        } catch (IOException var7) {
                            this.field949 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "JHGVYYQH", name = "c", descriptor = "()V")
    public final void method274() {
        this.field930 = false;
    }

    @OriginalMember(owner = "JHGVYYQH", name = "a", descriptor = "(IBII)V")
    public final void method275(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field941.field535[0] == null || this.field960[arg3][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field941.field535[arg3 + 1].method515(arg2, this.field958);
        if (this.method256(this.field960[arg3][arg2], 6, this.field927[arg3][arg2], var5)) {
            return;
        }
        this.field951[arg3][arg2] = arg1;
        if (arg0 != -13858) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg1 > this.field957) {
            this.field957 = arg1;
        }
        this.field950++;
    }
}
