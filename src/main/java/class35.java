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

@OriginalClass("LNOSHUMO")
public class class35 extends class29 implements Runnable {

    @OriginalMember(owner = "LNOSHUMO", name = "b", descriptor = "[[I")
    private int[][] field969 = new int[4][];

    @OriginalMember(owner = "LNOSHUMO", name = "c", descriptor = "[[B")
    private byte[][] field970 = new byte[4][];

    @OriginalMember(owner = "LNOSHUMO", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field971 = new CRC32();

    @OriginalMember(owner = "LNOSHUMO", name = "e", descriptor = "Z")
    private boolean field972 = true;

    @OriginalMember(owner = "LNOSHUMO", name = "f", descriptor = "Ljava/lang/String;")
    public String field973 = "";

    @OriginalMember(owner = "LNOSHUMO", name = "g", descriptor = "LVLLJSJTJ;")
    private class54 field974 = new class54((byte) 3);

    @OriginalMember(owner = "LNOSHUMO", name = "k", descriptor = "[[I")
    private int[][] field978 = new int[4][];

    @OriginalMember(owner = "LNOSHUMO", name = "n", descriptor = "LVLLJSJTJ;")
    private class54 field981 = new class54((byte) 3);

    @OriginalMember(owner = "LNOSHUMO", name = "o", descriptor = "I")
    private int field982 = -371;

    @OriginalMember(owner = "LNOSHUMO", name = "s", descriptor = "[B")
    private byte[] field986 = new byte[65000];

    @OriginalMember(owner = "LNOSHUMO", name = "u", descriptor = "I")
    private int field988 = -786;

    @OriginalMember(owner = "LNOSHUMO", name = "v", descriptor = "[B")
    private byte[] field989 = new byte[500];

    @OriginalMember(owner = "LNOSHUMO", name = "C", descriptor = "Z")
    private boolean field996 = true;

    @OriginalMember(owner = "LNOSHUMO", name = "G", descriptor = "LLAPJVQGB;")
    private class33 field1000 = new class33(-20780);

    @OriginalMember(owner = "LNOSHUMO", name = "H", descriptor = "Z")
    private boolean field1001 = false;

    @OriginalMember(owner = "LNOSHUMO", name = "L", descriptor = "I")
    private int field1005 = 6;

    @OriginalMember(owner = "LNOSHUMO", name = "M", descriptor = "LVLLJSJTJ;")
    private class54 field1006 = new class54((byte) 3);

    @OriginalMember(owner = "LNOSHUMO", name = "N", descriptor = "LVLLJSJTJ;")
    private class54 field1007 = new class54((byte) 3);

    @OriginalMember(owner = "LNOSHUMO", name = "P", descriptor = "LVLLJSJTJ;")
    private class54 field1009 = new class54((byte) 3);

    @OriginalMember(owner = "LNOSHUMO", name = "J", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "LNOSHUMO", name = "K", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "LNOSHUMO", name = "O", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "LNOSHUMO", name = "i", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "LNOSHUMO", name = "j", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "LNOSHUMO", name = "q", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "LNOSHUMO", name = "t", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "LNOSHUMO", name = "x", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "LNOSHUMO", name = "A", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "LNOSHUMO", name = "B", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "LNOSHUMO", name = "F", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "LNOSHUMO", name = "E", descriptor = "J")
    private long field998;

    @OriginalMember(owner = "LNOSHUMO", name = "p", descriptor = "LMFGDOVSO;")
    private class38 field983;

    @OriginalMember(owner = "LNOSHUMO", name = "I", descriptor = "Lclient;")
    private client field1002;

    @OriginalMember(owner = "LNOSHUMO", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field980;

    @OriginalMember(owner = "LNOSHUMO", name = "w", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field990;

    @OriginalMember(owner = "LNOSHUMO", name = "D", descriptor = "Ljava/net/Socket;")
    private Socket field997;

    @OriginalMember(owner = "LNOSHUMO", name = "r", descriptor = "[B")
    private byte[] field985;

    @OriginalMember(owner = "LNOSHUMO", name = "Q", descriptor = "[I")
    private int[] field1010;

    @OriginalMember(owner = "LNOSHUMO", name = "R", descriptor = "[I")
    private int[] field1011;

    @OriginalMember(owner = "LNOSHUMO", name = "h", descriptor = "[I")
    private int[] field975;

    @OriginalMember(owner = "LNOSHUMO", name = "l", descriptor = "[I")
    private int[] field979;

    @OriginalMember(owner = "LNOSHUMO", name = "y", descriptor = "[I")
    private int[] field992;

    @OriginalMember(owner = "LNOSHUMO", name = "z", descriptor = "[I")
    private int[] field993;

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(ZB)V")
    public final void method357(boolean arg0, byte arg1) {
        if (arg1 != 54) {
            return;
        }
        int var3 = this.field1010.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field979[var4] != 0) {
                this.method373(3, 0, (byte) 2, this.field993[var4]);
                this.method373(3, 0, (byte) 2, this.field975[var4]);
            }
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(II)I")
    public final int method358(int arg0, int arg1) {
        return arg1 == 16501 ? this.field985[arg0] & 0xFF : 1;
    }

    @OriginalMember(owner = "LNOSHUMO", name = "b", descriptor = "(I)V")
    private final void method359(int arg0) {
        if (arg0 != 6) {
            this.field972 = !this.field972;
        }
        try {
            int var2 = this.field980.available();
            if (this.field977 == 0 && var2 >= 6) {
                this.field1001 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field980.read(this.field989, var3, 6 - var3)) {
                }
                int var4 = this.field989[0] & 0xFF;
                int var5 = ((this.field989[1] & 0xFF) << 8) + (this.field989[2] & 0xFF);
                int var6 = ((this.field989[3] & 0xFF) << 8) + (this.field989[4] & 0xFF);
                int var7 = this.field989[5] & 0xFF;
                this.field983 = null;
                for (class38 var8 = (class38) this.field1009.method528(); var8 != null; var8 = (class38) this.field1009.method530(true)) {
                    if (var8.field1064 == var4 && var8.field1066 == var5) {
                        this.field983 = var8;
                    }
                    if (this.field983 != null) {
                        var8.field1065 = 0;
                    }
                }
                if (this.field983 != null) {
                    this.field1004 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field983.field1068 = null;
                        if (this.field983.field1067) {
                            class54 var9 = this.field974;
                            synchronized (this.field974) {
                                this.field974.method525(this.field983);
                            }
                        } else {
                            this.field983.method555();
                        }
                        this.field983 = null;
                    } else {
                        if (this.field983.field1068 == null && var7 == 0) {
                            this.field983.field1068 = new byte[var6];
                        }
                        if (this.field983.field1068 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field976 = var7 * 500;
                this.field977 = 500;
                if (this.field977 > var6 - var7 * 500) {
                    this.field977 = var6 - var7 * 500;
                }
            }
            if (this.field977 > 0 && var2 >= this.field977) {
                this.field1001 = true;
                byte[] var10 = this.field989;
                int var11 = 0;
                if (this.field983 != null) {
                    var10 = this.field983.field1068;
                    var11 = this.field976;
                }
                for (int var12 = 0; var12 < this.field977; var12 += this.field980.read(var10, var11 + var12, this.field977 - var12)) {
                }
                if (this.field977 + this.field976 >= var10.length && this.field983 != null) {
                    if (this.field1002.field594[0] != null) {
                        this.field1002.field594[this.field983.field1064 + 1].method534(var10.length, (byte) -124, var10, this.field983.field1066);
                    }
                    if (!this.field983.field1067 && this.field983.field1064 == 3) {
                        this.field983.field1067 = true;
                        this.field983.field1064 = 93;
                    }
                    if (this.field983.field1067) {
                        class54 var13 = this.field974;
                        synchronized (this.field974) {
                            this.field974.method525(this.field983);
                        }
                    } else {
                        this.field983.method555();
                    }
                }
                this.field977 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field997.close();
            } catch (Exception var15) {
            }
            this.field997 = null;
            this.field980 = null;
            this.field990 = null;
            this.field977 = 0;
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(III)V")
    public final void method360(int arg0, int arg1, int arg2) {
        if (this.field1002.field594[0] == null || (this.field978[arg1][arg0] == 0 || (this.field970[arg1][arg0] == 0 || this.field991 == 0))) {
            return;
        }
        class38 var4 = new class38();
        var4.field1064 = arg1;
        if (arg2 != 5) {
            return;
        }
        var4.field1066 = arg0;
        var4.field1067 = false;
        class54 var5 = this.field1007;
        synchronized (this.field1007) {
            this.field1007.method525(var4);
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(Z)V")
    public final void method361(boolean arg0) {
        class54 var2 = this.field1007;
        synchronized (this.field1007) {
            this.field1007.method532();
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(IZ)Z")
    public final boolean method362(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return this.field1011[arg0] == 1;
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(B)V")
    private final void method363(byte arg0) {
        if (arg0 != 5) {
            this.field1005 = 188;
        }
        while (this.field994 == 0) {
            if (this.field995 >= 10 || this.field991 == 0) {
                return;
            }
            class54 var2 = this.field1007;
            class38 var3;
            synchronized (this.field1007) {
                var3 = (class38) this.field1007.method527();
            }
            while (var3 != null) {
                if (this.field970[var3.field1064][var3.field1066] != 0) {
                    this.field970[var3.field1064][var3.field1066] = 0;
                    this.field1009.method525(var3);
                    this.method375(-921, var3);
                    this.field1001 = true;
                    if (this.field1008 < this.field984) {
                        this.field1008++;
                    }
                    this.field973 = "Loading extra files - " + this.field1008 * 100 / this.field984 + "%";
                    this.field995++;
                    if (this.field995 == 10) {
                        return;
                    }
                }
                class54 var4 = this.field1007;
                synchronized (this.field1007) {
                    var3 = (class38) this.field1007.method527();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field970[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field991) {
                        var6[var8] = 0;
                        class38 var9 = new class38();
                        var9.field1064 = var5;
                        var9.field1066 = var8;
                        var9.field1067 = false;
                        this.field1009.method525(var9);
                        this.method375(-921, var9);
                        this.field1001 = true;
                        if (this.field1008 < this.field984) {
                            this.field1008++;
                        }
                        this.field973 = "Loading extra files - " + this.field1008 * 100 / this.field984 + "%";
                        this.field995++;
                        if (this.field995 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field991--;
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "([BIII)Z")
    private final boolean method364(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        if (arg3 < 4 || arg3 > 4) {
            throw new NullPointerException();
        }
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field971.reset();
        this.field971.update(arg0, 0, var5);
        int var7 = (int) this.field971.getValue();
        if (arg2 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "b", descriptor = "(II)V")
    public final void method365(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field978.length || arg1 < 0 || arg1 > this.field978[arg0].length || this.field978[arg0][arg1] == 0) {
            return;
        }
        class33 var3 = this.field1000;
        synchronized (this.field1000) {
            for (class38 var4 = (class38) this.field1000.method348(); var4 != null; var4 = (class38) this.field1000.method349(true)) {
                if (var4.field1064 == arg0 && var4.field1066 == arg1) {
                    return;
                }
            }
            class38 var5 = new class38();
            var5.field1064 = arg0;
            var5.field1066 = arg1;
            var5.field1067 = true;
            class54 var6 = this.field981;
            synchronized (this.field981) {
                this.field981.method525(var5);
            }
            this.field1000.method346(var5);
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(I)V")
    public final void method341(int arg0) {
        this.method365(0, arg0);
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "()I")
    public final int method366() {
        class33 var1 = this.field1000;
        synchronized (this.field1000) {
            return this.field1000.method350();
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(LXRWUKRPO;Lclient;)V")
    public final void method367(class65 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method581(var3[var4], null);
            int var27 = var26.length / 2;
            class21 var28 = new class21(var26, -49015);
            this.field978[var4] = new int[var27];
            this.field970[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field978[var4][var29] = var28.method246();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method581(var5[var6], null);
            int var23 = var22.length / 4;
            class21 var24 = new class21(var22, -49015);
            this.field969[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field969[var6][var25] = var24.method249();
            }
        }
        byte[] var7 = arg0.method581("model_index", null);
        int var8 = this.field978[0].length;
        this.field985 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field985[var9] = var7[var9];
            } else {
                this.field985[var9] = 0;
            }
        }
        byte[] var10 = arg0.method581("map_index", null);
        class21 var11 = new class21(var10, -49015);
        int var12 = var10.length / 7;
        this.field1010 = new int[var12];
        this.field975 = new int[var12];
        this.field993 = new int[var12];
        this.field979 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1010[var13] = var11.method246();
            this.field975[var13] = var11.method246();
            this.field993[var13] = var11.method246();
            this.field979[var13] = var11.method244();
        }
        byte[] var14 = arg0.method581("anim_index", null);
        class21 var15 = new class21(var14, -49015);
        int var16 = var14.length / 2;
        this.field992 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field992[var17] = var15.method246();
        }
        byte[] var18 = arg0.method581("midi_index", null);
        class21 var19 = new class21(var18, -49015);
        int var20 = var18.length;
        this.field1011 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1011[var21] = var19.method244();
        }
        this.field1002 = arg1;
        this.field996 = true;
        this.field1002.method25(this, 2);
    }

    @OriginalMember(owner = "LNOSHUMO", name = "b", descriptor = "()V")
    public final void method368() {
        this.field996 = false;
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(BI)Z")
    public final boolean method369(byte arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1010.length; var3++) {
            if (this.field993[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != -7) {
            this.field982 = 130;
        }
        return false;
    }

    @OriginalMember(owner = "LNOSHUMO", name = "c", descriptor = "(I)V")
    private final void method370(int arg0) {
        class54 var2 = this.field981;
        class38 var3;
        synchronized (this.field981) {
            var3 = (class38) this.field981.method527();
        }
        if (arg0 >= 0) {
            return;
        }
        while (var3 != null) {
            this.field1001 = true;
            byte[] var4 = null;
            if (this.field1002.field594[0] != null) {
                var4 = this.field1002.field594[var3.field1064 + 1].method533((byte) 8, var3.field1066);
            }
            if (!this.method364(var4, this.field969[var3.field1064][var3.field1066], this.field978[var3.field1064][var3.field1066], 4)) {
                var4 = null;
            }
            class54 var5 = this.field981;
            synchronized (this.field981) {
                if (var4 == null) {
                    this.field1006.method525(var3);
                } else {
                    var3.field1068 = var4;
                    class54 var6 = this.field974;
                    synchronized (this.field974) {
                        this.field974.method525(var3);
                    }
                }
                var3 = (class38) this.field981.method527();
            }
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field996) {
                this.field999++;
                byte var1 = 20;
                if (this.field991 == 0 && this.field1002.field594[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1001 = true;
                for (int var2 = 0; var2 < 100 && this.field1001; var2++) {
                    this.field1001 = false;
                    this.method370(this.field988);
                    this.method372(true);
                    if (this.field994 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method363((byte) 5);
                    if (this.field980 != null) {
                        this.method359(6);
                    }
                }
                boolean var3 = false;
                for (class38 var4 = (class38) this.field1009.method528(); var4 != null; var4 = (class38) this.field1009.method530(true)) {
                    if (var4.field1067) {
                        var3 = true;
                        var4.field1065++;
                        if (var4.field1065 > 50) {
                            var4.field1065 = 0;
                            this.method375(-921, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class38 var5 = (class38) this.field1009.method528(); var5 != null; var5 = (class38) this.field1009.method530(true)) {
                        var3 = true;
                        var5.field1065++;
                        if (var5.field1065 > 50) {
                            var5.field1065 = 0;
                            this.method375(-921, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1004++;
                    if (this.field1004 > 750) {
                        try {
                            this.field997.close();
                        } catch (Exception var8) {
                        }
                        this.field997 = null;
                        this.field980 = null;
                        this.field990 = null;
                        this.field977 = 0;
                    }
                } else {
                    this.field1004 = 0;
                    this.field973 = "";
                }
                if (this.field1002.field454 && this.field997 != null && this.field990 != null && (this.field991 > 0 || this.field1002.field594[0] == null)) {
                    this.field1003++;
                    if (this.field1003 > 500) {
                        this.field1003 = 0;
                        this.field989[0] = 0;
                        this.field989[1] = 0;
                        this.field989[2] = 0;
                        this.field989[3] = 10;
                        try {
                            this.field990.write(this.field989, 0, 4);
                        } catch (IOException var7) {
                            this.field1004 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "c", descriptor = "()LMFGDOVSO;")
    public final class38 method371() {
        class54 var1 = this.field974;
        class38 var2;
        synchronized (this.field974) {
            var2 = (class38) this.field974.method527();
        }
        if (var2 == null) {
            return null;
        }
        class33 var3 = this.field1000;
        synchronized (this.field1000) {
            var2.method342();
        }
        if (var2.field1068 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1068));
            while (true) {
                if (this.field986.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field986, var4, this.field986.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1068 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1068[var7] = this.field986[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "LNOSHUMO", name = "b", descriptor = "(Z)V")
    private final void method372(boolean arg0) {
        this.field994 = 0;
        this.field995 = 0;
        class38 var2 = (class38) this.field1009.method528();
        if (!arg0) {
            return;
        }
        while (var2 != null) {
            if (var2.field1067) {
                this.field994++;
            } else {
                this.field995++;
            }
            var2 = (class38) this.field1009.method530(true);
        }
        while (this.field994 < 10) {
            class38 var3 = (class38) this.field1006.method527();
            if (var3 == null) {
                break;
            }
            if (this.field970[var3.field1064][var3.field1066] != 0) {
                this.field1008++;
            }
            this.field970[var3.field1064][var3.field1066] = 0;
            this.field1009.method525(var3);
            this.field994++;
            this.method375(-921, var3);
            this.field1001 = true;
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(IIBI)V")
    public final void method373(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field1002.field594[0] == null || this.field978[arg0][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field1002.field594[arg0 + 1].method533((byte) 8, arg3);
        if (arg1 != 0) {
            this.field972 = !this.field972;
        }
        if (this.method364(var5, this.field969[arg0][arg3], this.field978[arg0][arg3], 4)) {
            return;
        }
        this.field970[arg0][arg3] = arg2;
        if (arg2 > this.field991) {
            this.field991 = arg2;
        }
        this.field984++;
    }

    @OriginalMember(owner = "LNOSHUMO", name = "b", descriptor = "(IZ)I")
    public final int method374(int arg0, boolean arg1) {
        if (arg1) {
            this.field982 = -39;
        }
        return this.field978[arg0].length;
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(ILMFGDOVSO;)V")
    private final void method375(int arg0, class38 arg1) {
        if (arg0 >= 0) {
            this.field972 = !this.field972;
        }
        try {
            if (this.field997 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field998 < 4000L) {
                    return;
                }
                this.field998 = var3;
                this.field997 = this.field1002.method128(client.field231 + 43594);
                this.field980 = this.field997.getInputStream();
                this.field990 = this.field997.getOutputStream();
                this.field990.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field980.read();
                }
                this.field1004 = 0;
            }
            this.field989[0] = (byte) arg1.field1064;
            this.field989[1] = (byte) (arg1.field1066 >> 8);
            this.field989[2] = (byte) arg1.field1066;
            if (arg1.field1067) {
                this.field989[3] = 2;
            } else if (this.field1002.field454) {
                this.field989[3] = 0;
            } else {
                this.field989[3] = 1;
            }
            this.field990.write(this.field989, 0, 4);
            this.field1003 = 0;
            this.field987 = -10000;
        } catch (IOException var8) {
            try {
                this.field997.close();
            } catch (Exception var7) {
            }
            this.field997 = null;
            this.field980 = null;
            this.field990 = null;
            this.field977 = 0;
            this.field987++;
        }
    }

    @OriginalMember(owner = "LNOSHUMO", name = "a", descriptor = "(IIII)I")
    public final int method376(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -33346) {
            return 4;
        }
        int var5 = (arg3 << 8) + arg1;
        for (int var6 = 0; var6 < this.field1010.length; var6++) {
            if (this.field1010[var6] == var5) {
                if (arg2 == 0) {
                    return this.field975[var6];
                }
                return this.field993[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "LNOSHUMO", name = "b", descriptor = "(B)I")
    public final int method377(byte arg0) {
        return arg0 == 8 ? this.field992.length : 3;
    }
}
