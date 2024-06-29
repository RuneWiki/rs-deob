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

@OriginalClass("client!KMIIMWED")
public class class26 extends class23 implements Runnable {

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "LWTGHTNMN;")
    private class57 field922 = new class57(36113);

    @OriginalMember(owner = "client!KMIIMWED", name = "b", descriptor = "I")
    private int field923 = -24958;

    @OriginalMember(owner = "client!KMIIMWED", name = "d", descriptor = "LOZVXYFRH;")
    private class38 field925 = new class38(field954);

    @OriginalMember(owner = "client!KMIIMWED", name = "g", descriptor = "[[I")
    private int[][] field928 = new int[4][];

    @OriginalMember(owner = "client!KMIIMWED", name = "j", descriptor = "LWTGHTNMN;")
    private class57 field931 = new class57(36113);

    @OriginalMember(owner = "client!KMIIMWED", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field937 = new CRC32();

    @OriginalMember(owner = "client!KMIIMWED", name = "r", descriptor = "Z")
    private boolean field939 = false;

    @OriginalMember(owner = "client!KMIIMWED", name = "t", descriptor = "[B")
    private byte[] field941 = new byte[500];

    @OriginalMember(owner = "client!KMIIMWED", name = "u", descriptor = "LWTGHTNMN;")
    private class57 field942 = new class57(36113);

    @OriginalMember(owner = "client!KMIIMWED", name = "v", descriptor = "I")
    private int field943 = 43360;

    @OriginalMember(owner = "client!KMIIMWED", name = "w", descriptor = "[[I")
    private int[][] field944 = new int[4][];

    @OriginalMember(owner = "client!KMIIMWED", name = "x", descriptor = "LWTGHTNMN;")
    private class57 field945 = new class57(36113);

    @OriginalMember(owner = "client!KMIIMWED", name = "z", descriptor = "Ljava/lang/String;")
    public String field947 = "";

    @OriginalMember(owner = "client!KMIIMWED", name = "D", descriptor = "[B")
    private byte[] field951 = new byte[65000];

    @OriginalMember(owner = "client!KMIIMWED", name = "E", descriptor = "[[B")
    private byte[][] field952 = new byte[4][];

    @OriginalMember(owner = "client!KMIIMWED", name = "F", descriptor = "I")
    private int field953 = 192;

    @OriginalMember(owner = "client!KMIIMWED", name = "I", descriptor = "Z")
    private boolean field956 = false;

    @OriginalMember(owner = "client!KMIIMWED", name = "J", descriptor = "Z")
    private boolean field957 = true;

    @OriginalMember(owner = "client!KMIIMWED", name = "R", descriptor = "LWTGHTNMN;")
    private class57 field965 = new class57(36113);

    @OriginalMember(owner = "client!KMIIMWED", name = "G", descriptor = "B")
    private static byte field954 = -98;

    @OriginalMember(owner = "client!KMIIMWED", name = "e", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!KMIIMWED", name = "m", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "client!KMIIMWED", name = "y", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!KMIIMWED", name = "B", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!KMIIMWED", name = "C", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!KMIIMWED", name = "K", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!KMIIMWED", name = "L", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!KMIIMWED", name = "M", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!KMIIMWED", name = "N", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!KMIIMWED", name = "O", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!KMIIMWED", name = "P", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "client!KMIIMWED", name = "k", descriptor = "J")
    private long field932;

    @OriginalMember(owner = "client!KMIIMWED", name = "H", descriptor = "LOKKEIIWQ;")
    private class35 field955;

    @OriginalMember(owner = "client!KMIIMWED", name = "q", descriptor = "Lclient;")
    private client field938;

    @OriginalMember(owner = "client!KMIIMWED", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field924;

    @OriginalMember(owner = "client!KMIIMWED", name = "A", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field948;

    @OriginalMember(owner = "client!KMIIMWED", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field927;

    @OriginalMember(owner = "client!KMIIMWED", name = "l", descriptor = "[B")
    private byte[] field933;

    @OriginalMember(owner = "client!KMIIMWED", name = "h", descriptor = "[I")
    private int[] field929;

    @OriginalMember(owner = "client!KMIIMWED", name = "i", descriptor = "[I")
    private int[] field930;

    @OriginalMember(owner = "client!KMIIMWED", name = "n", descriptor = "[I")
    private int[] field935;

    @OriginalMember(owner = "client!KMIIMWED", name = "o", descriptor = "[I")
    private int[] field936;

    @OriginalMember(owner = "client!KMIIMWED", name = "s", descriptor = "[I")
    private int[] field940;

    @OriginalMember(owner = "client!KMIIMWED", name = "Q", descriptor = "[I")
    private int[] field964;

    @OriginalMember(owner = "client!KMIIMWED", name = "b", descriptor = "(I)V")
    private final void method304(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            this.field956 = !this.field956;
        }
        this.field959 = 0;
        this.field960 = 0;
        for (class35 var2 = (class35) this.field931.method470(); var2 != null; var2 = (class35) this.field931.method472(false)) {
            if (var2.field1029) {
                this.field959++;
            } else {
                this.field960++;
            }
        }
        while (this.field959 < 10) {
            class35 var3 = (class35) this.field945.method469();
            if (var3 == null) {
                break;
            }
            if (this.field952[var3.field1030][var3.field1028] != 0) {
                this.field946++;
            }
            this.field952[var3.field1030][var3.field1028] = 0;
            this.field931.method467(var3);
            this.field959++;
            this.method309(false, var3);
            this.field939 = true;
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "c", descriptor = "(I)V")
    private final void method305(int arg0) {
        if (arg0 != 48458) {
            return;
        }
        class57 var2 = this.field922;
        class35 var3;
        synchronized (this.field922) {
            var3 = (class35) this.field922.method469();
        }
        while (var3 != null) {
            this.field939 = true;
            byte[] var4 = null;
            if (this.field938.field246[0] != null) {
                var4 = this.field938.field246[var3.field1030 + 1].method500(1016, var3.field1028);
            }
            if (!this.method324(38378, var4, this.field944[var3.field1030][var3.field1028], this.field928[var3.field1030][var3.field1028])) {
                var4 = null;
            }
            class57 var5 = this.field922;
            synchronized (this.field922) {
                if (var4 == null) {
                    this.field945.method467(var3);
                } else {
                    var3.field1031 = var4;
                    class57 var6 = this.field942;
                    synchronized (this.field942) {
                        this.field942.method467(var3);
                    }
                }
                var3 = (class35) this.field922.method469();
            }
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "()I")
    public final int method306() {
        class38 var1 = this.field925;
        synchronized (this.field925) {
            return this.field925.method348();
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(IZ)Z")
    public final boolean method307(int arg0, boolean arg1) {
        if (!arg1) {
            this.field923 = 363;
        }
        return this.field929[arg0] == 1;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(ZIII)I")
    public final int method308(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 << 8) + arg3;
        if (arg0) {
            return this.field923;
        }
        for (int var6 = 0; var6 < this.field940.length; var6++) {
            if (this.field940[var6] == var5) {
                if (arg2 == 0) {
                    return this.field936[var6];
                }
                return this.field964[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(ZLOKKEIIWQ;)V")
    private final void method309(boolean arg0, class35 arg1) {
        if (arg0) {
            this.field953 = 442;
        }
        try {
            if (this.field927 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field932 < 4000L) {
                    return;
                }
                this.field932 = var3;
                this.field927 = this.field938.method100(client.field269 + 43594);
                this.field924 = this.field927.getInputStream();
                this.field948 = this.field927.getOutputStream();
                this.field948.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field924.read();
                }
                this.field958 = 0;
            }
            this.field941[0] = (byte) arg1.field1030;
            this.field941[1] = (byte) (arg1.field1028 >> 8);
            this.field941[2] = (byte) arg1.field1028;
            if (arg1.field1029) {
                this.field941[3] = 2;
            } else if (this.field938.field466) {
                this.field941[3] = 0;
            } else {
                this.field941[3] = 1;
            }
            this.field948.write(this.field941, 0, 4);
            this.field934 = 0;
            this.field962 = -10000;
        } catch (IOException var8) {
            try {
                this.field927.close();
            } catch (Exception var7) {
            }
            this.field927 = null;
            this.field924 = null;
            this.field948 = null;
            this.field950 = 0;
            this.field962++;
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(ZZ)V")
    public final void method310(boolean arg0, boolean arg1) {
        int var3 = this.field940.length;
        if (!arg1) {
            this.field923 = -268;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field930[var4] != 0) {
                this.method314(3, this.field964[var4], (byte) 8, (byte) 2);
                this.method314(3, this.field936[var4], (byte) 8, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(B)V")
    private final void method311(byte arg0) {
        if (arg0 != 1) {
            this.field953 = 415;
        }
        while (this.field959 == 0) {
            if (this.field960 >= 10 || this.field926 == 0) {
                return;
            }
            class57 var2 = this.field965;
            class35 var3;
            synchronized (this.field965) {
                var3 = (class35) this.field965.method469();
            }
            while (var3 != null) {
                if (this.field952[var3.field1030][var3.field1028] != 0) {
                    this.field952[var3.field1030][var3.field1028] = 0;
                    this.field931.method467(var3);
                    this.method309(false, var3);
                    this.field939 = true;
                    if (this.field946 < this.field963) {
                        this.field946++;
                    }
                    this.field947 = "Loading extra files - " + this.field946 * 100 / this.field963 + "%";
                    this.field960++;
                    if (this.field960 == 10) {
                        return;
                    }
                }
                class57 var4 = this.field965;
                synchronized (this.field965) {
                    var3 = (class35) this.field965.method469();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field952[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field926) {
                        var6[var8] = 0;
                        class35 var9 = new class35();
                        var9.field1030 = var5;
                        var9.field1028 = var8;
                        var9.field1029 = false;
                        this.field931.method467(var9);
                        this.method309(false, var9);
                        this.field939 = true;
                        if (this.field946 < this.field963) {
                            this.field946++;
                        }
                        this.field947 = "Loading extra files - " + this.field946 * 100 / this.field963 + "%";
                        this.field960++;
                        if (this.field960 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field926--;
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "b", descriptor = "()LOKKEIIWQ;")
    public final class35 method312() {
        class57 var1 = this.field942;
        class35 var2;
        synchronized (this.field942) {
            var2 = (class35) this.field942.method469();
        }
        if (var2 == null) {
            return null;
        }
        class38 var3 = this.field925;
        synchronized (this.field925) {
            var2.method499();
        }
        if (var2.field1031 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1031));
            while (true) {
                if (this.field951.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field951, var4, this.field951.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1031 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1031[var7] = this.field951[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(I)V")
    public final void method299(int arg0) {
        this.method321(0, arg0);
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "d", descriptor = "(I)I")
    public final int method313(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            this.field923 = 360;
        }
        return this.field935.length;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(IIBB)V")
    public final void method314(int arg0, int arg1, byte arg2, byte arg3) {
        if (arg2 != 8) {
            return;
        }
        boolean var5 = false;
        if (this.field938.field246[0] == null || this.field944[arg0][arg1] == 0) {
            return;
        }
        byte[] var6 = this.field938.field246[arg0 + 1].method500(1016, arg1);
        if (this.method324(38378, var6, this.field944[arg0][arg1], this.field928[arg0][arg1])) {
            return;
        }
        this.field952[arg0][arg1] = arg3;
        if (arg3 > this.field926) {
            this.field926 = arg3;
        }
        this.field963++;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(II)I")
    public final int method315(int arg0, int arg1) {
        return arg1 < 0 ? this.field944[arg0].length : 4;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "e", descriptor = "(I)V")
    public final void method316(int arg0) {
        class57 var2 = this.field965;
        synchronized (this.field965) {
            this.field965.method474();
        }
        if (arg0 < 2 || arg0 > 2) {
            this.field923 = -489;
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(LMAARFNGV;Lclient;)V")
    public final void method317(class29 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method332(var3[var4], null);
            int var27 = var26.length / 2;
            class14 var28 = new class14(var26, true);
            this.field944[var4] = new int[var27];
            this.field952[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field944[var4][var29] = var28.method219();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method332(var5[var6], null);
            int var23 = var22.length / 4;
            class14 var24 = new class14(var22, true);
            this.field928[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field928[var6][var25] = var24.method222();
            }
        }
        byte[] var7 = arg0.method332("model_index", null);
        int var8 = this.field944[0].length;
        this.field933 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field933[var9] = var7[var9];
            } else {
                this.field933[var9] = 0;
            }
        }
        byte[] var10 = arg0.method332("map_index", null);
        class14 var11 = new class14(var10, true);
        int var12 = var10.length / 7;
        this.field940 = new int[var12];
        this.field936 = new int[var12];
        this.field964 = new int[var12];
        this.field930 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field940[var13] = var11.method219();
            this.field936[var13] = var11.method219();
            this.field964[var13] = var11.method219();
            this.field930[var13] = var11.method217();
        }
        byte[] var14 = arg0.method332("anim_index", null);
        class14 var15 = new class14(var14, true);
        int var16 = var14.length / 2;
        this.field935 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field935[var17] = var15.method219();
        }
        byte[] var18 = arg0.method332("midi_index", null);
        class14 var19 = new class14(var18, true);
        int var20 = var18.length;
        this.field929 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field929[var21] = var19.method217();
        }
        this.field938 = arg1;
        this.field957 = true;
        this.field938.method185(this, 2);
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field957) {
                this.field961++;
                byte var1 = 20;
                if (this.field926 == 0 && this.field938.field246[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field939 = true;
                for (int var2 = 0; var2 < 100 && this.field939; var2++) {
                    this.field939 = false;
                    this.method305(48458);
                    this.method304(6);
                    if (this.field959 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method311((byte) 1);
                    if (this.field924 != null) {
                        this.method323(true);
                    }
                }
                boolean var3 = false;
                for (class35 var4 = (class35) this.field931.method470(); var4 != null; var4 = (class35) this.field931.method472(false)) {
                    if (var4.field1029) {
                        var3 = true;
                        var4.field1032++;
                        if (var4.field1032 > 50) {
                            var4.field1032 = 0;
                            this.method309(false, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class35 var5 = (class35) this.field931.method470(); var5 != null; var5 = (class35) this.field931.method472(false)) {
                        var3 = true;
                        var5.field1032++;
                        if (var5.field1032 > 50) {
                            var5.field1032 = 0;
                            this.method309(false, var5);
                        }
                    }
                }
                if (var3) {
                    this.field958++;
                    if (this.field958 > 750) {
                        try {
                            this.field927.close();
                        } catch (Exception var8) {
                        }
                        this.field927 = null;
                        this.field924 = null;
                        this.field948 = null;
                        this.field950 = 0;
                    }
                } else {
                    this.field958 = 0;
                    this.field947 = "";
                }
                if (this.field938.field466 && this.field927 != null && this.field948 != null && (this.field926 > 0 || this.field938.field246[0] == null)) {
                    this.field934++;
                    if (this.field934 > 500) {
                        this.field934 = 0;
                        this.field941[0] = 0;
                        this.field941[1] = 0;
                        this.field941[2] = 0;
                        this.field941[3] = 10;
                        try {
                            this.field948.write(this.field941, 0, 4);
                        } catch (IOException var7) {
                            this.field958 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(IB)Z")
    public final boolean method318(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field940.length; var3++) {
            if (this.field964[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 106) {
            this.field923 = -19;
        }
        return false;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(IZI)V")
    public final void method319(int arg0, boolean arg1, int arg2) {
        if (this.field938.field246[0] == null || (this.field944[arg0][arg2] == 0 || (this.field952[arg0][arg2] == 0 || this.field926 == 0))) {
            return;
        }
        class35 var4 = new class35();
        var4.field1030 = arg0;
        var4.field1028 = arg2;
        if (!arg1) {
            this.field943 = 385;
        }
        var4.field1029 = false;
        class57 var5 = this.field965;
        synchronized (this.field965) {
            this.field965.method467(var4);
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "c", descriptor = "()V")
    public final void method320() {
        this.field957 = false;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "b", descriptor = "(II)V")
    public final void method321(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field944.length || arg1 < 0 || arg1 > this.field944[arg0].length || this.field944[arg0][arg1] == 0) {
            return;
        }
        class38 var3 = this.field925;
        synchronized (this.field925) {
            for (class35 var4 = (class35) this.field925.method346(); var4 != null; var4 = (class35) this.field925.method347(false)) {
                if (var4.field1030 == arg0 && var4.field1028 == arg1) {
                    return;
                }
            }
            class35 var5 = new class35();
            var5.field1030 = arg0;
            var5.field1028 = arg1;
            var5.field1029 = true;
            class57 var6 = this.field922;
            synchronized (this.field922) {
                this.field922.method467(var5);
            }
            this.field925.method344(var5);
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "c", descriptor = "(II)I")
    public final int method322(int arg0, int arg1) {
        if (arg1 != -24958) {
            this.field956 = !this.field956;
        }
        return this.field933[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(Z)V")
    private final void method323(boolean arg0) {
        if (!arg0) {
            this.field943 = 75;
        }
        try {
            int var2 = this.field924.available();
            if (this.field950 == 0 && var2 >= 6) {
                this.field939 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field924.read(this.field941, var3, 6 - var3)) {
                }
                int var4 = this.field941[0] & 0xFF;
                int var5 = ((this.field941[1] & 0xFF) << 8) + (this.field941[2] & 0xFF);
                int var6 = ((this.field941[3] & 0xFF) << 8) + (this.field941[4] & 0xFF);
                int var7 = this.field941[5] & 0xFF;
                this.field955 = null;
                for (class35 var8 = (class35) this.field931.method470(); var8 != null; var8 = (class35) this.field931.method472(false)) {
                    if (var8.field1030 == var4 && var8.field1028 == var5) {
                        this.field955 = var8;
                    }
                    if (this.field955 != null) {
                        var8.field1032 = 0;
                    }
                }
                if (this.field955 != null) {
                    this.field958 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field955.field1031 = null;
                        if (this.field955.field1029) {
                            class57 var9 = this.field942;
                            synchronized (this.field942) {
                                this.field942.method467(this.field955);
                            }
                        } else {
                            this.field955.method338();
                        }
                        this.field955 = null;
                    } else {
                        if (this.field955.field1031 == null && var7 == 0) {
                            this.field955.field1031 = new byte[var6];
                        }
                        if (this.field955.field1031 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field949 = var7 * 500;
                this.field950 = 500;
                if (this.field950 > var6 - var7 * 500) {
                    this.field950 = var6 - var7 * 500;
                }
            }
            if (this.field950 > 0 && var2 >= this.field950) {
                this.field939 = true;
                byte[] var10 = this.field941;
                int var11 = 0;
                if (this.field955 != null) {
                    var10 = this.field955.field1031;
                    var11 = this.field949;
                }
                for (int var12 = 0; var12 < this.field950; var12 += this.field924.read(var10, var11 + var12, this.field950 - var12)) {
                }
                if (this.field950 + this.field949 >= var10.length && this.field955 != null) {
                    if (this.field938.field246[0] != null) {
                        this.field938.field246[this.field955.field1030 + 1].method501(var10, var10.length, this.field955.field1028, -225);
                    }
                    if (!this.field955.field1029 && this.field955.field1030 == 3) {
                        this.field955.field1029 = true;
                        this.field955.field1030 = 93;
                    }
                    if (this.field955.field1029) {
                        class57 var13 = this.field942;
                        synchronized (this.field942) {
                            this.field942.method467(this.field955);
                        }
                    } else {
                        this.field955.method338();
                    }
                }
                this.field950 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field927.close();
            } catch (Exception var15) {
            }
            this.field927 = null;
            this.field924 = null;
            this.field948 = null;
            this.field950 = 0;
        }
    }

    @OriginalMember(owner = "client!KMIIMWED", name = "a", descriptor = "(I[BII)Z")
    private final boolean method324(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field937.reset();
        this.field937.update(arg1, 0, var5);
        if (arg0 != 38378) {
            throw new NullPointerException();
        }
        int var7 = (int) this.field937.getValue();
        if (arg2 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }
}
