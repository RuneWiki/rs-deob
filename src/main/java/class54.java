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

@OriginalClass("UUFZOKXH")
public class class54 extends class43 implements Runnable {

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "Z")
    private boolean field1320 = true;

    @OriginalMember(owner = "UUFZOKXH", name = "b", descriptor = "[[B")
    private byte[][] field1321 = new byte[4][];

    @OriginalMember(owner = "UUFZOKXH", name = "d", descriptor = "Z")
    private boolean field1323 = false;

    @OriginalMember(owner = "UUFZOKXH", name = "g", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "UUFZOKXH", name = "j", descriptor = "I")
    private int field1329 = 357;

    @OriginalMember(owner = "UUFZOKXH", name = "k", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1330 = new CRC32();

    @OriginalMember(owner = "UUFZOKXH", name = "l", descriptor = "LYLURZVWU;")
    private class65 field1331 = new class65((byte) 52);

    @OriginalMember(owner = "UUFZOKXH", name = "n", descriptor = "Ljava/lang/String;")
    public String field1333 = "";

    @OriginalMember(owner = "UUFZOKXH", name = "q", descriptor = "LYLURZVWU;")
    private class65 field1336 = new class65((byte) 52);

    @OriginalMember(owner = "UUFZOKXH", name = "v", descriptor = "[B")
    private byte[] field1341 = new byte[500];

    @OriginalMember(owner = "UUFZOKXH", name = "z", descriptor = "I")
    private int field1345 = 7;

    @OriginalMember(owner = "UUFZOKXH", name = "C", descriptor = "LXWKFKQRL;")
    private class63 field1348 = new class63(false);

    @OriginalMember(owner = "UUFZOKXH", name = "F", descriptor = "[[I")
    private int[][] field1351 = new int[4][];

    @OriginalMember(owner = "UUFZOKXH", name = "H", descriptor = "I")
    private int field1353 = 884;

    @OriginalMember(owner = "UUFZOKXH", name = "I", descriptor = "LYLURZVWU;")
    private class65 field1354 = new class65((byte) 52);

    @OriginalMember(owner = "UUFZOKXH", name = "J", descriptor = "[B")
    private byte[] field1355 = new byte[65000];

    @OriginalMember(owner = "UUFZOKXH", name = "L", descriptor = "LYLURZVWU;")
    private class65 field1357 = new class65((byte) 52);

    @OriginalMember(owner = "UUFZOKXH", name = "M", descriptor = "[[I")
    private int[][] field1358 = new int[4][];

    @OriginalMember(owner = "UUFZOKXH", name = "P", descriptor = "LYLURZVWU;")
    private class65 field1361 = new class65((byte) 52);

    @OriginalMember(owner = "UUFZOKXH", name = "e", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "UUFZOKXH", name = "f", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "UUFZOKXH", name = "h", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "UUFZOKXH", name = "i", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "UUFZOKXH", name = "m", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "UUFZOKXH", name = "o", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "UUFZOKXH", name = "p", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "UUFZOKXH", name = "t", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "UUFZOKXH", name = "u", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "UUFZOKXH", name = "A", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "UUFZOKXH", name = "E", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "UUFZOKXH", name = "K", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "UUFZOKXH", name = "B", descriptor = "J")
    private long field1347;

    @OriginalMember(owner = "UUFZOKXH", name = "c", descriptor = "LNCZPZCRJ;")
    private class36 field1322;

    @OriginalMember(owner = "UUFZOKXH", name = "x", descriptor = "Lclient;")
    private client field1343;

    @OriginalMember(owner = "UUFZOKXH", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field1338;

    @OriginalMember(owner = "UUFZOKXH", name = "G", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1352;

    @OriginalMember(owner = "UUFZOKXH", name = "N", descriptor = "Ljava/net/Socket;")
    private Socket field1359;

    @OriginalMember(owner = "UUFZOKXH", name = "r", descriptor = "[B")
    private byte[] field1337;

    @OriginalMember(owner = "UUFZOKXH", name = "w", descriptor = "[I")
    private int[] field1342;

    @OriginalMember(owner = "UUFZOKXH", name = "y", descriptor = "[I")
    private int[] field1344;

    @OriginalMember(owner = "UUFZOKXH", name = "D", descriptor = "[I")
    private int[] field1349;

    @OriginalMember(owner = "UUFZOKXH", name = "O", descriptor = "[I")
    private int[] field1360;

    @OriginalMember(owner = "UUFZOKXH", name = "Q", descriptor = "[I")
    private int[] field1362;

    @OriginalMember(owner = "UUFZOKXH", name = "R", descriptor = "[I")
    private int[] field1363;

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(Z)V")
    private final void method430(boolean arg0) {
        if (!arg0) {
            return;
        }
        class65 var2 = this.field1336;
        class36 var3;
        synchronized (this.field1336) {
            var3 = (class36) this.field1336.method527();
        }
        while (var3 != null) {
            this.field1326 = true;
            byte[] var4 = null;
            if (this.field1343.field227[0] != null) {
                var4 = this.field1343.field227[var3.field1065 + 1].method291((byte) 44, var3.field1062);
            }
            if (!this.method448(this.field1351[var3.field1065][var3.field1062], var4, this.field1328, this.field1358[var3.field1065][var3.field1062])) {
                var4 = null;
            }
            class65 var5 = this.field1336;
            synchronized (this.field1336) {
                if (var4 == null) {
                    this.field1354.method525(var3);
                } else {
                    var3.field1063 = var4;
                    class65 var6 = this.field1331;
                    synchronized (this.field1331) {
                        this.field1331.method525(var3);
                    }
                }
                var3 = (class36) this.field1336.method527();
            }
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "()I")
    public final int method431() {
        class63 var1 = this.field1348;
        synchronized (this.field1348) {
            return this.field1348.method524();
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "b", descriptor = "(Z)V")
    private final void method432(boolean arg0) {
        this.field1324 = 0;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1325 = 0;
        for (class36 var3 = (class36) this.field1361.method528(); var3 != null; var3 = (class36) this.field1361.method530(false)) {
            if (var3.field1061) {
                this.field1324++;
            } else {
                this.field1325++;
            }
        }
        while (this.field1324 < 10) {
            class36 var4 = (class36) this.field1354.method527();
            if (var4 == null) {
                break;
            }
            if (this.field1321[var4.field1065][var4.field1062] != 0) {
                this.field1335++;
            }
            this.field1321[var4.field1065][var4.field1062] = 0;
            this.field1361.method525(var4);
            this.field1324++;
            this.method447(-634, var4);
            this.field1326 = true;
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(IIII)I")
    public final int method433(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            return 3;
        }
        int var5 = (arg1 << 8) + arg3;
        for (int var6 = 0; var6 < this.field1360.length; var6++) {
            if (this.field1360[var6] == var5) {
                if (arg2 == 0) {
                    return this.field1363[var6];
                }
                return this.field1342[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1320) {
                this.field1334++;
                byte var1 = 20;
                if (this.field1346 == 0 && this.field1343.field227[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1326 = true;
                for (int var2 = 0; var2 < 100 && this.field1326; var2++) {
                    this.field1326 = false;
                    this.method430(true);
                    this.method432(false);
                    if (this.field1324 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method442(0);
                    if (this.field1338 != null) {
                        this.method437(this.field1353);
                    }
                }
                boolean var3 = false;
                for (class36 var4 = (class36) this.field1361.method528(); var4 != null; var4 = (class36) this.field1361.method530(false)) {
                    if (var4.field1061) {
                        var3 = true;
                        var4.field1064++;
                        if (var4.field1064 > 50) {
                            var4.field1064 = 0;
                            this.method447(-634, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class36 var5 = (class36) this.field1361.method528(); var5 != null; var5 = (class36) this.field1361.method530(false)) {
                        var3 = true;
                        var5.field1064++;
                        if (var5.field1064 > 50) {
                            var5.field1064 = 0;
                            this.method447(-634, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1350++;
                    if (this.field1350 > 750) {
                        try {
                            this.field1359.close();
                        } catch (Exception var8) {
                        }
                        this.field1359 = null;
                        this.field1338 = null;
                        this.field1352 = null;
                        this.field1340 = 0;
                    }
                } else {
                    this.field1350 = 0;
                    this.field1333 = "";
                }
                if (this.field1343.field619 && this.field1359 != null && this.field1352 != null && (this.field1346 > 0 || this.field1343.field227[0] == null)) {
                    this.field1332++;
                    if (this.field1332 > 500) {
                        this.field1332 = 0;
                        this.field1341[0] = 0;
                        this.field1341[1] = 0;
                        this.field1341[2] = 0;
                        this.field1341[3] = 10;
                        try {
                            this.field1352.write(this.field1341, 0, 4);
                        } catch (IOException var7) {
                            this.field1350 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(II)Z")
    public final boolean method434(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1360.length; var3++) {
            if (this.field1342[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != 0) {
            this.field1329 = -335;
        }
        return false;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(I)V")
    public final void method380(int arg0) {
        this.method450(0, arg0);
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(IZ)I")
    public final int method435(int arg0, boolean arg1) {
        return arg1 ? this.field1358[arg0].length : this.field1345;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "b", descriptor = "(II)I")
    public final int method436(int arg0, int arg1) {
        return arg1 == 8 ? this.field1337[arg0] & 0xFF : 2;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "b", descriptor = "(I)V")
    private final void method437(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        try {
            int var2 = this.field1338.available();
            if (this.field1340 == 0 && var2 >= 6) {
                this.field1326 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1338.read(this.field1341, var3, 6 - var3)) {
                }
                int var4 = this.field1341[0] & 0xFF;
                int var5 = ((this.field1341[1] & 0xFF) << 8) + (this.field1341[2] & 0xFF);
                int var6 = ((this.field1341[3] & 0xFF) << 8) + (this.field1341[4] & 0xFF);
                int var7 = this.field1341[5] & 0xFF;
                this.field1322 = null;
                for (class36 var8 = (class36) this.field1361.method528(); var8 != null; var8 = (class36) this.field1361.method530(false)) {
                    if (var8.field1065 == var4 && var8.field1062 == var5) {
                        this.field1322 = var8;
                    }
                    if (this.field1322 != null) {
                        var8.field1064 = 0;
                    }
                }
                if (this.field1322 != null) {
                    this.field1350 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1322.field1063 = null;
                        if (this.field1322.field1061) {
                            class65 var9 = this.field1331;
                            synchronized (this.field1331) {
                                this.field1331.method525(this.field1322);
                            }
                        } else {
                            this.field1322.method589();
                        }
                        this.field1322 = null;
                    } else {
                        if (this.field1322.field1063 == null && var7 == 0) {
                            this.field1322.field1063 = new byte[var6];
                        }
                        if (this.field1322.field1063 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1339 = var7 * 500;
                this.field1340 = 500;
                if (this.field1340 > var6 - var7 * 500) {
                    this.field1340 = var6 - var7 * 500;
                }
            }
            if (this.field1340 > 0 && var2 >= this.field1340) {
                this.field1326 = true;
                byte[] var10 = this.field1341;
                int var11 = 0;
                if (this.field1322 != null) {
                    var10 = this.field1322.field1063;
                    var11 = this.field1339;
                }
                for (int var12 = 0; var12 < this.field1340; var12 += this.field1338.read(var10, var11 + var12, this.field1340 - var12)) {
                }
                if (this.field1340 + this.field1339 >= var10.length && this.field1322 != null) {
                    if (this.field1343.field227[0] != null) {
                        this.field1343.field227[this.field1322.field1065 + 1].method292(var10.length, var10, 3, this.field1322.field1062);
                    }
                    if (!this.field1322.field1061 && this.field1322.field1065 == 3) {
                        this.field1322.field1061 = true;
                        this.field1322.field1065 = 93;
                    }
                    if (this.field1322.field1061) {
                        class65 var13 = this.field1331;
                        synchronized (this.field1331) {
                            this.field1331.method525(this.field1322);
                        }
                    } else {
                        this.field1322.method589();
                    }
                }
                this.field1340 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1359.close();
            } catch (Exception var15) {
            }
            this.field1359 = null;
            this.field1338 = null;
            this.field1352 = null;
            this.field1340 = 0;
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "c", descriptor = "(I)I")
    public final int method438(int arg0) {
        if (arg0 != 0) {
            this.field1345 = 307;
        }
        return this.field1349.length;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(ZI)V")
    public final void method439(boolean arg0, int arg1) {
        int var3 = this.field1360.length;
        if (arg1 >= 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1362[var4] != 0) {
                this.method443(3, (byte) 2, this.field1342[var4], 3);
                this.method443(3, (byte) 2, this.field1363[var4], 3);
            }
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "b", descriptor = "()V")
    public final void method440() {
        this.field1320 = false;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(IIZ)V")
    public final void method441(int arg0, int arg1, boolean arg2) {
        if (this.field1343.field227[0] == null || (this.field1358[arg1][arg0] == 0 || (this.field1321[arg1][arg0] == 0 || this.field1346 == 0))) {
            return;
        }
        class36 var4 = new class36();
        var4.field1065 = arg1;
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        var4.field1062 = arg0;
        var4.field1061 = false;
        class65 var6 = this.field1357;
        synchronized (this.field1357) {
            this.field1357.method525(var4);
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "d", descriptor = "(I)V")
    private final void method442(int arg0) {
        if (arg0 != 0) {
            this.field1345 = 174;
        }
        while (this.field1324 == 0) {
            if (this.field1325 >= 10 || this.field1346 == 0) {
                return;
            }
            class65 var2 = this.field1357;
            class36 var3;
            synchronized (this.field1357) {
                var3 = (class36) this.field1357.method527();
            }
            while (var3 != null) {
                if (this.field1321[var3.field1065][var3.field1062] != 0) {
                    this.field1321[var3.field1065][var3.field1062] = 0;
                    this.field1361.method525(var3);
                    this.method447(-634, var3);
                    this.field1326 = true;
                    if (this.field1335 < this.field1356) {
                        this.field1335++;
                    }
                    this.field1333 = "Loading extra files - " + this.field1335 * 100 / this.field1356 + "%";
                    this.field1325++;
                    if (this.field1325 == 10) {
                        return;
                    }
                }
                class65 var4 = this.field1357;
                synchronized (this.field1357) {
                    var3 = (class36) this.field1357.method527();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1321[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1346) {
                        var6[var8] = 0;
                        class36 var9 = new class36();
                        var9.field1065 = var5;
                        var9.field1062 = var8;
                        var9.field1061 = false;
                        this.field1361.method525(var9);
                        this.method447(-634, var9);
                        this.field1326 = true;
                        if (this.field1335 < this.field1356) {
                            this.field1335++;
                        }
                        this.field1333 = "Loading extra files - " + this.field1335 * 100 / this.field1356 + "%";
                        this.field1325++;
                        if (this.field1325 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1346--;
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(IBII)V")
    public final void method443(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field1343.field227[0] == null || this.field1358[arg3][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1343.field227[arg3 + 1].method291((byte) 44, arg2);
        if (this.method448(this.field1351[arg3][arg2], var5, this.field1328, this.field1358[arg3][arg2])) {
            return;
        }
        this.field1321[arg3][arg2] = arg1;
        if (arg0 < 3 || arg0 > 3) {
            this.field1323 = !this.field1323;
        }
        if (arg1 > this.field1346) {
            this.field1346 = arg1;
        }
        this.field1356++;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "c", descriptor = "(Z)V")
    public final void method444(boolean arg0) {
        class65 var2 = this.field1357;
        synchronized (this.field1357) {
            this.field1357.method532();
        }
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(IB)Z")
    public final boolean method445(int arg0, byte arg1) {
        if (arg1 != -1) {
            throw new NullPointerException();
        }
        return this.field1344[arg0] == 1;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "c", descriptor = "()LNCZPZCRJ;")
    public final class36 method446() {
        class65 var1 = this.field1331;
        class36 var2;
        synchronized (this.field1331) {
            var2 = (class36) this.field1331.method527();
        }
        if (var2 == null) {
            return null;
        }
        class63 var3 = this.field1348;
        synchronized (this.field1348) {
            var2.method278();
        }
        if (var2.field1063 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1063));
            while (true) {
                if (this.field1355.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1355, var4, this.field1355.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1063 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1063[var7] = this.field1355[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(ILNCZPZCRJ;)V")
    private final void method447(int arg0, class36 arg1) {
        if (arg0 >= 0) {
            return;
        }
        try {
            if (this.field1359 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1347 < 4000L) {
                    return;
                }
                this.field1347 = var3;
                this.field1359 = this.field1343.method121(client.field236 + 43594);
                this.field1338 = this.field1359.getInputStream();
                this.field1352 = this.field1359.getOutputStream();
                this.field1352.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1338.read();
                }
                this.field1350 = 0;
            }
            this.field1341[0] = (byte) arg1.field1065;
            this.field1341[1] = (byte) (arg1.field1062 >> 8);
            this.field1341[2] = (byte) arg1.field1062;
            if (arg1.field1061) {
                this.field1341[3] = 2;
            } else if (this.field1343.field619) {
                this.field1341[3] = 0;
            } else {
                this.field1341[3] = 1;
            }
            this.field1352.write(this.field1341, 0, 4);
            this.field1332 = 0;
            this.field1327 = -10000;
        } catch (IOException var8) {
            try {
                this.field1359.close();
            } catch (Exception var7) {
            }
            this.field1359 = null;
            this.field1338 = null;
            this.field1352 = null;
            this.field1340 = 0;
            this.field1327++;
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(I[BII)Z")
    private final boolean method448(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var6 = arg1.length - 2;
        int var7 = ((arg1[var6] & 0xFF) << 8) + (arg1[var6 + 1] & 0xFF);
        this.field1330.reset();
        this.field1330.update(arg1, 0, var6);
        int var8 = (int) this.field1330.getValue();
        if (arg3 == var7) {
            return arg0 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "UUFZOKXH", name = "a", descriptor = "(LOTSGNSQM;Lclient;)V")
    public final void method449(class41 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method376(var3[var4], null);
            int var27 = var26.length / 2;
            class68 var28 = new class68(var26, -103);
            this.field1358[var4] = new int[var27];
            this.field1321[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1358[var4][var29] = var28.method551();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method376(var5[var6], null);
            int var23 = var22.length / 4;
            class68 var24 = new class68(var22, -103);
            this.field1351[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1351[var6][var25] = var24.method554();
            }
        }
        byte[] var7 = arg0.method376("model_index", null);
        int var8 = this.field1358[0].length;
        this.field1337 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1337[var9] = var7[var9];
            } else {
                this.field1337[var9] = 0;
            }
        }
        byte[] var10 = arg0.method376("map_index", null);
        class68 var11 = new class68(var10, -103);
        int var12 = var10.length / 7;
        this.field1360 = new int[var12];
        this.field1363 = new int[var12];
        this.field1342 = new int[var12];
        this.field1362 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1360[var13] = var11.method551();
            this.field1363[var13] = var11.method551();
            this.field1342[var13] = var11.method551();
            this.field1362[var13] = var11.method549();
        }
        byte[] var14 = arg0.method376("anim_index", null);
        class68 var15 = new class68(var14, -103);
        int var16 = var14.length / 2;
        this.field1349 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1349[var17] = var15.method551();
        }
        byte[] var18 = arg0.method376("midi_index", null);
        class68 var19 = new class68(var18, -103);
        int var20 = var18.length;
        this.field1344 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1344[var21] = var19.method549();
        }
        this.field1343 = arg1;
        this.field1320 = true;
        this.field1343.method141(this, 2);
    }

    @OriginalMember(owner = "UUFZOKXH", name = "c", descriptor = "(II)V")
    public final void method450(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1358.length || arg1 < 0 || arg1 > this.field1358[arg0].length || this.field1358[arg0][arg1] == 0) {
            return;
        }
        class63 var3 = this.field1348;
        synchronized (this.field1348) {
            for (class36 var4 = (class36) this.field1348.method522(); var4 != null; var4 = (class36) this.field1348.method523(false)) {
                if (var4.field1065 == arg0 && var4.field1062 == arg1) {
                    return;
                }
            }
            class36 var5 = new class36();
            var5.field1065 = arg0;
            var5.field1062 = arg1;
            var5.field1061 = true;
            class65 var6 = this.field1336;
            synchronized (this.field1336) {
                this.field1336.method525(var5);
            }
            this.field1348.method520(var5);
        }
    }
}
