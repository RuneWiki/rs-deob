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

@OriginalClass("client!BISZONYZ")
public class class4 extends class33 implements Runnable {

    @OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "[B")
    private byte[] field25 = new byte[500];

    @OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "Z")
    private boolean field26 = true;

    @OriginalMember(owner = "client!BISZONYZ", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field32 = new CRC32();

    @OriginalMember(owner = "client!BISZONYZ", name = "j", descriptor = "LZEEWTYXI;")
    private class69 field33 = new class69(223);

    @OriginalMember(owner = "client!BISZONYZ", name = "m", descriptor = "Z")
    private boolean field36 = true;

    @OriginalMember(owner = "client!BISZONYZ", name = "n", descriptor = "LZEEWTYXI;")
    private class69 field37 = new class69(223);

    @OriginalMember(owner = "client!BISZONYZ", name = "o", descriptor = "LQHOLWOGP;")
    private class48 field38 = new class48((byte) -67);

    @OriginalMember(owner = "client!BISZONYZ", name = "p", descriptor = "I")
    private int field39 = -81;

    @OriginalMember(owner = "client!BISZONYZ", name = "t", descriptor = "Z")
    private boolean field43 = false;

    @OriginalMember(owner = "client!BISZONYZ", name = "u", descriptor = "[[B")
    private byte[][] field44 = new byte[4][];

    @OriginalMember(owner = "client!BISZONYZ", name = "w", descriptor = "Ljava/lang/String;")
    public String field46 = "";

    @OriginalMember(owner = "client!BISZONYZ", name = "A", descriptor = "LZEEWTYXI;")
    private class69 field50 = new class69(223);

    @OriginalMember(owner = "client!BISZONYZ", name = "B", descriptor = "[[I")
    private int[][] field51 = new int[4][];

    @OriginalMember(owner = "client!BISZONYZ", name = "I", descriptor = "B")
    private byte field58 = 60;

    @OriginalMember(owner = "client!BISZONYZ", name = "K", descriptor = "[B")
    private byte[] field60 = new byte[65000];

    @OriginalMember(owner = "client!BISZONYZ", name = "L", descriptor = "[[I")
    private int[][] field61 = new int[4][];

    @OriginalMember(owner = "client!BISZONYZ", name = "M", descriptor = "LZEEWTYXI;")
    private class69 field62 = new class69(223);

    @OriginalMember(owner = "client!BISZONYZ", name = "P", descriptor = "LZEEWTYXI;")
    private class69 field65 = new class69(223);

    @OriginalMember(owner = "client!BISZONYZ", name = "d", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!BISZONYZ", name = "e", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!BISZONYZ", name = "f", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!BISZONYZ", name = "r", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!BISZONYZ", name = "x", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!BISZONYZ", name = "y", descriptor = "I")
    private int field48;

    @OriginalMember(owner = "client!BISZONYZ", name = "C", descriptor = "I")
    private int field52;

    @OriginalMember(owner = "client!BISZONYZ", name = "G", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!BISZONYZ", name = "J", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!BISZONYZ", name = "O", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!BISZONYZ", name = "Q", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client!BISZONYZ", name = "g", descriptor = "J")
    private long field30;

    @OriginalMember(owner = "client!BISZONYZ", name = "E", descriptor = "LOVHZHUGL;")
    private class43 field54;

    @OriginalMember(owner = "client!BISZONYZ", name = "N", descriptor = "Lclient;")
    private client field63;

    @OriginalMember(owner = "client!BISZONYZ", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field34;

    @OriginalMember(owner = "client!BISZONYZ", name = "D", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field53;

    @OriginalMember(owner = "client!BISZONYZ", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field31;

    @OriginalMember(owner = "client!BISZONYZ", name = "l", descriptor = "[B")
    private byte[] field35;

    @OriginalMember(owner = "client!BISZONYZ", name = "q", descriptor = "[I")
    private int[] field40;

    @OriginalMember(owner = "client!BISZONYZ", name = "s", descriptor = "[I")
    private int[] field42;

    @OriginalMember(owner = "client!BISZONYZ", name = "v", descriptor = "[I")
    private int[] field45;

    @OriginalMember(owner = "client!BISZONYZ", name = "z", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "client!BISZONYZ", name = "F", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "client!BISZONYZ", name = "H", descriptor = "[I")
    private int[] field57;

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(I)V")
    public final void method19(int arg0) {
        this.method40(0, arg0);
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(II)Z")
    public final boolean method20(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field39 = 175;
        }
        return this.field42[arg0] == 1;
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(Z)V")
    private final void method21(boolean arg0) {
        if (!arg0) {
            return;
        }
        while (this.field28 == 0) {
            if (this.field29 >= 10 || this.field52 == 0) {
                return;
            }
            class69 var2 = this.field62;
            class43 var3;
            synchronized (this.field62) {
                var3 = (class43) this.field62.method579();
            }
            while (var3 != null) {
                if (this.field44[var3.field1312][var3.field1315] != 0) {
                    this.field44[var3.field1312][var3.field1315] = 0;
                    this.field65.method577(var3);
                    this.method33(-44712, var3);
                    this.field43 = true;
                    if (this.field66 < this.field59) {
                        this.field66++;
                    }
                    this.field46 = "Loading extra files - " + this.field66 * 100 / this.field59 + "%";
                    this.field29++;
                    if (this.field29 == 10) {
                        return;
                    }
                }
                class69 var4 = this.field62;
                synchronized (this.field62) {
                    var3 = (class43) this.field62.method579();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field44[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field52) {
                        var6[var8] = 0;
                        class43 var9 = new class43();
                        var9.field1312 = var5;
                        var9.field1315 = var8;
                        var9.field1314 = false;
                        this.field65.method577(var9);
                        this.method33(-44712, var9);
                        this.field43 = true;
                        if (this.field66 < this.field59) {
                            this.field66++;
                        }
                        this.field46 = "Loading extra files - " + this.field66 * 100 / this.field59 + "%";
                        this.field29++;
                        if (this.field29 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field52--;
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "()LOVHZHUGL;")
    public final class43 method22() {
        class69 var1 = this.field37;
        class43 var2;
        synchronized (this.field37) {
            var2 = (class43) this.field37.method579();
        }
        if (var2 == null) {
            return null;
        }
        class48 var3 = this.field38;
        synchronized (this.field38) {
            var2.method282();
        }
        if (var2.field1311 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1311));
            while (true) {
                if (this.field60.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field60, var4, this.field60.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1311 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1311[var7] = this.field60[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(IBII)V")
    public final void method23(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field63.field235[0] == null || this.field61[arg3][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field63.field235[arg3 + 1].method15(arg0, (byte) 1);
        if (this.method32(this.field61[arg3][arg0], 8, this.field51[arg3][arg0], var5)) {
            return;
        }
        this.field44[arg3][arg0] = arg1;
        if (arg2 == 46267) {
            if (arg1 > this.field52) {
                this.field52 = arg1;
            }
            this.field59++;
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "(Z)V")
    private final void method24(boolean arg0) {
        class69 var2 = this.field33;
        class43 var3;
        synchronized (this.field33) {
            var3 = (class43) this.field33.method579();
        }
        if (!arg0) {
            return;
        }
        while (var3 != null) {
            this.field43 = true;
            byte[] var4 = null;
            if (this.field63.field235[0] != null) {
                var4 = this.field63.field235[var3.field1312 + 1].method15(var3.field1315, (byte) 1);
            }
            if (!this.method32(this.field61[var3.field1312][var3.field1315], 8, this.field51[var3.field1312][var3.field1315], var4)) {
                var4 = null;
            }
            class69 var5 = this.field33;
            synchronized (this.field33) {
                if (var4 == null) {
                    this.field50.method577(var3);
                } else {
                    var3.field1311 = var4;
                    class69 var6 = this.field37;
                    synchronized (this.field37) {
                        this.field37.method577(var3);
                    }
                }
                var3 = (class43) this.field33.method579();
            }
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "()V")
    public final void method25() {
        this.field36 = false;
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(IBI)V")
    public final void method26(int arg0, byte arg1, int arg2) {
        if (this.field63.field235[0] == null || (this.field61[arg2][arg0] == 0 || (this.field44[arg2][arg0] == 0 || this.field52 == 0))) {
            return;
        }
        class43 var4 = new class43();
        if (this.field58 != arg1) {
            this.field26 = !this.field26;
        }
        var4.field1312 = arg2;
        var4.field1315 = arg0;
        var4.field1314 = false;
        class69 var5 = this.field62;
        synchronized (this.field62) {
            this.field62.method577(var4);
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "(II)I")
    public final int method27(int arg0, int arg1) {
        return arg0 < 0 ? this.field61[arg1].length : 4;
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(IIII)I")
    public final int method28(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 1 || arg3 > 1) {
            return 0;
        }
        int var5 = (arg1 << 8) + arg2;
        for (int var6 = 0; var6 < this.field40.length; var6++) {
            if (this.field40[var6] == var5) {
                if (arg0 == 0) {
                    return this.field45[var6];
                }
                return this.field57[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "()I")
    public final int method29() {
        class48 var1 = this.field38;
        synchronized (this.field38) {
            return this.field38.method445();
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "b", descriptor = "(I)V")
    private final void method30(int arg0) {
        if (arg0 != 4) {
            return;
        }
        try {
            int var2 = this.field34.available();
            if (this.field48 == 0 && var2 >= 6) {
                this.field43 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field34.read(this.field25, var3, 6 - var3)) {
                }
                int var4 = this.field25[0] & 0xFF;
                int var5 = ((this.field25[1] & 0xFF) << 8) + (this.field25[2] & 0xFF);
                int var6 = ((this.field25[3] & 0xFF) << 8) + (this.field25[4] & 0xFF);
                int var7 = this.field25[5] & 0xFF;
                this.field54 = null;
                for (class43 var8 = (class43) this.field65.method580(); var8 != null; var8 = (class43) this.field65.method582((byte) 6)) {
                    if (var8.field1312 == var4 && var8.field1315 == var5) {
                        this.field54 = var8;
                    }
                    if (this.field54 != null) {
                        var8.field1313 = 0;
                    }
                }
                if (this.field54 != null) {
                    this.field27 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field54.field1311 = null;
                        if (this.field54.field1314) {
                            class69 var9 = this.field37;
                            synchronized (this.field37) {
                                this.field37.method577(this.field54);
                            }
                        } else {
                            this.field54.method602();
                        }
                        this.field54 = null;
                    } else {
                        if (this.field54.field1311 == null && var7 == 0) {
                            this.field54.field1311 = new byte[var6];
                        }
                        if (this.field54.field1311 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field47 = var7 * 500;
                this.field48 = 500;
                if (this.field48 > var6 - var7 * 500) {
                    this.field48 = var6 - var7 * 500;
                }
            }
            if (this.field48 > 0 && var2 >= this.field48) {
                this.field43 = true;
                byte[] var10 = this.field25;
                int var11 = 0;
                if (this.field54 != null) {
                    var10 = this.field54.field1311;
                    var11 = this.field47;
                }
                for (int var12 = 0; var12 < this.field48; var12 += this.field34.read(var10, var11 + var12, this.field48 - var12)) {
                }
                if (this.field48 + this.field47 >= var10.length && this.field54 != null) {
                    if (this.field63.field235[0] != null) {
                        this.field63.field235[this.field54.field1312 + 1].method16(var10, this.field54.field1315, 6, var10.length);
                    }
                    if (!this.field54.field1314 && this.field54.field1312 == 3) {
                        this.field54.field1314 = true;
                        this.field54.field1312 = 93;
                    }
                    if (this.field54.field1314) {
                        class69 var13 = this.field37;
                        synchronized (this.field37) {
                            this.field37.method577(this.field54);
                        }
                    } else {
                        this.field54.method602();
                    }
                }
                this.field48 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field31.close();
            } catch (Exception var15) {
            }
            this.field31 = null;
            this.field34 = null;
            this.field53 = null;
            this.field48 = 0;
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "(Z)I")
    public final int method31(boolean arg0) {
        if (!arg0) {
            this.field26 = !this.field26;
        }
        return this.field55.length;
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(III[B)Z")
    private final boolean method32(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field32.reset();
        this.field32.update(arg3, 0, var5);
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        int var7 = (int) this.field32.getValue();
        if (arg0 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(ILOVHZHUGL;)V")
    private final void method33(int arg0, class43 arg1) {
        if (arg0 != -44712) {
            return;
        }
        try {
            if (this.field31 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field30 < 4000L) {
                    return;
                }
                this.field30 = var3;
                this.field31 = this.field63.method158(client.field551 + 43594);
                this.field34 = this.field31.getInputStream();
                this.field53 = this.field31.getOutputStream();
                this.field53.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field34.read();
                }
                this.field27 = 0;
            }
            this.field25[0] = (byte) arg1.field1312;
            this.field25[1] = (byte) (arg1.field1315 >> 8);
            this.field25[2] = (byte) arg1.field1315;
            if (arg1.field1314) {
                this.field25[3] = 2;
            } else if (this.field63.field335) {
                this.field25[3] = 0;
            } else {
                this.field25[3] = 1;
            }
            this.field53.write(this.field25, 0, 4);
            this.field64 = 0;
            this.field56 = -10000;
        } catch (IOException var8) {
            try {
                this.field31.close();
            } catch (Exception var7) {
            }
            this.field31 = null;
            this.field34 = null;
            this.field53 = null;
            this.field48 = 0;
            this.field56++;
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(ZZ)V")
    public final void method34(boolean arg0, boolean arg1) {
        if (arg0) {
            return;
        }
        int var3 = this.field40.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field49[var4] != 0) {
                this.method23(this.field57[var4], (byte) 2, 46267, 3);
                this.method23(this.field45[var4], (byte) 2, 46267, 3);
            }
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field36) {
                this.field41++;
                byte var1 = 20;
                if (this.field52 == 0 && this.field63.field235[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field43 = true;
                for (int var2 = 0; var2 < 100 && this.field43; var2++) {
                    this.field43 = false;
                    this.method24(true);
                    this.method38(34189);
                    if (this.field28 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method21(true);
                    if (this.field34 != null) {
                        this.method30(4);
                    }
                }
                boolean var3 = false;
                for (class43 var4 = (class43) this.field65.method580(); var4 != null; var4 = (class43) this.field65.method582((byte) 6)) {
                    if (var4.field1314) {
                        var3 = true;
                        var4.field1313++;
                        if (var4.field1313 > 50) {
                            var4.field1313 = 0;
                            this.method33(-44712, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class43 var5 = (class43) this.field65.method580(); var5 != null; var5 = (class43) this.field65.method582((byte) 6)) {
                        var3 = true;
                        var5.field1313++;
                        if (var5.field1313 > 50) {
                            var5.field1313 = 0;
                            this.method33(-44712, var5);
                        }
                    }
                }
                if (var3) {
                    this.field27++;
                    if (this.field27 > 750) {
                        try {
                            this.field31.close();
                        } catch (Exception var8) {
                        }
                        this.field31 = null;
                        this.field34 = null;
                        this.field53 = null;
                        this.field48 = 0;
                    }
                } else {
                    this.field27 = 0;
                    this.field46 = "";
                }
                if (this.field63.field335 && this.field31 != null && this.field53 != null && (this.field52 > 0 || this.field63.field235[0] == null)) {
                    this.field64++;
                    if (this.field64 > 500) {
                        this.field64 = 0;
                        this.field25[0] = 0;
                        this.field25[1] = 0;
                        this.field25[2] = 0;
                        this.field25[3] = 10;
                        try {
                            this.field53.write(this.field25, 0, 4);
                        } catch (IOException var7) {
                            this.field27 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(IB)I")
    public final int method35(int arg0, byte arg1) {
        if (arg1 != -6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field35[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "a", descriptor = "(LAWEEREDT;Lclient;)V")
    public final void method36(class2 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method14(var3[var4], null);
            int var27 = var26.length / 2;
            class25 var28 = new class25(var26, 713);
            this.field61[var4] = new int[var27];
            this.field44[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field61[var4][var29] = var28.method247();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method14(var5[var6], null);
            int var23 = var22.length / 4;
            class25 var24 = new class25(var22, 713);
            this.field51[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field51[var6][var25] = var24.method250();
            }
        }
        byte[] var7 = arg0.method14("model_index", null);
        int var8 = this.field61[0].length;
        this.field35 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field35[var9] = var7[var9];
            } else {
                this.field35[var9] = 0;
            }
        }
        byte[] var10 = arg0.method14("map_index", null);
        class25 var11 = new class25(var10, 713);
        int var12 = var10.length / 7;
        this.field40 = new int[var12];
        this.field45 = new int[var12];
        this.field57 = new int[var12];
        this.field49 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field40[var13] = var11.method247();
            this.field45[var13] = var11.method247();
            this.field57[var13] = var11.method247();
            this.field49[var13] = var11.method245();
        }
        byte[] var14 = arg0.method14("anim_index", null);
        class25 var15 = new class25(var14, 713);
        int var16 = var14.length / 2;
        this.field55 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field55[var17] = var15.method247();
        }
        byte[] var18 = arg0.method14("midi_index", null);
        class25 var19 = new class25(var18, 713);
        int var20 = var18.length;
        this.field42 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field42[var21] = var19.method245();
        }
        this.field63 = arg1;
        this.field36 = true;
        this.field63.method90(this, 2);
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "(II)Z")
    public final boolean method37(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field40.length; var3++) {
            if (this.field57[var3] == arg0) {
                return true;
            }
        }
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "c", descriptor = "(I)V")
    private final void method38(int arg0) {
        this.field28 = 0;
        this.field29 = 0;
        if (arg0 != 34189) {
            this.field39 = 86;
        }
        for (class43 var2 = (class43) this.field65.method580(); var2 != null; var2 = (class43) this.field65.method582((byte) 6)) {
            if (var2.field1314) {
                this.field28++;
            } else {
                this.field29++;
            }
        }
        while (this.field28 < 10) {
            class43 var3 = (class43) this.field50.method579();
            if (var3 == null) {
                break;
            }
            if (this.field44[var3.field1312][var3.field1315] != 0) {
                this.field66++;
            }
            this.field44[var3.field1312][var3.field1315] = 0;
            this.field65.method577(var3);
            this.field28++;
            this.method33(-44712, var3);
            this.field43 = true;
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "d", descriptor = "(I)V")
    public final void method39(int arg0) {
        class69 var2 = this.field62;
        synchronized (this.field62) {
            this.field62.method584();
        }
        if (arg0 < 3 || arg0 > 3) {
            ;
        }
    }

    @OriginalMember(owner = "client!BISZONYZ", name = "d", descriptor = "(II)V")
    public final void method40(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field61.length || arg1 < 0 || arg1 > this.field61[arg0].length || this.field61[arg0][arg1] == 0) {
            return;
        }
        class48 var3 = this.field38;
        synchronized (this.field38) {
            for (class43 var4 = (class43) this.field38.method443(); var4 != null; var4 = (class43) this.field38.method444((byte) 6)) {
                if (var4.field1312 == arg0 && var4.field1315 == arg1) {
                    return;
                }
            }
            class43 var5 = new class43();
            var5.field1312 = arg0;
            var5.field1315 = arg1;
            var5.field1314 = true;
            class69 var6 = this.field33;
            synchronized (this.field33) {
                this.field33.method577(var5);
            }
            this.field38.method441(var5);
        }
    }
}
