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

@OriginalClass("FHVZVKRA")
public class class9 extends class63 implements Runnable {

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "Z")
    private boolean field615 = false;

    @OriginalMember(owner = "FHVZVKRA", name = "d", descriptor = "I")
    private int field618 = -844;

    @OriginalMember(owner = "FHVZVKRA", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field622 = new CRC32();

    @OriginalMember(owner = "FHVZVKRA", name = "l", descriptor = "LXBBVJJRK;")
    private class64 field626 = new class64((byte) -100);

    @OriginalMember(owner = "FHVZVKRA", name = "m", descriptor = "[[B")
    private byte[][] field627 = new byte[4][];

    @OriginalMember(owner = "FHVZVKRA", name = "o", descriptor = "Ljava/lang/String;")
    public String field629 = "";

    @OriginalMember(owner = "FHVZVKRA", name = "q", descriptor = "LRGZIHLRP;")
    private class50 field631 = new class50(field630);

    @OriginalMember(owner = "FHVZVKRA", name = "r", descriptor = "[B")
    private byte[] field632 = new byte[65000];

    @OriginalMember(owner = "FHVZVKRA", name = "v", descriptor = "[B")
    private byte[] field636 = new byte[500];

    @OriginalMember(owner = "FHVZVKRA", name = "x", descriptor = "Z")
    private boolean field638 = false;

    @OriginalMember(owner = "FHVZVKRA", name = "y", descriptor = "LRGZIHLRP;")
    private class50 field639 = new class50(field630);

    @OriginalMember(owner = "FHVZVKRA", name = "C", descriptor = "LRGZIHLRP;")
    private class50 field643 = new class50(field630);

    @OriginalMember(owner = "FHVZVKRA", name = "E", descriptor = "LRGZIHLRP;")
    private class50 field645 = new class50(field630);

    @OriginalMember(owner = "FHVZVKRA", name = "G", descriptor = "[[I")
    private int[][] field647 = new int[4][];

    @OriginalMember(owner = "FHVZVKRA", name = "J", descriptor = "LRGZIHLRP;")
    private class50 field650 = new class50(field630);

    @OriginalMember(owner = "FHVZVKRA", name = "N", descriptor = "[[I")
    private int[][] field654 = new int[4][];

    @OriginalMember(owner = "FHVZVKRA", name = "Q", descriptor = "Z")
    private boolean field657 = true;

    @OriginalMember(owner = "FHVZVKRA", name = "p", descriptor = "I")
    private static int field630 = 3;

    @OriginalMember(owner = "FHVZVKRA", name = "e", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "FHVZVKRA", name = "f", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "FHVZVKRA", name = "g", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "FHVZVKRA", name = "i", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "FHVZVKRA", name = "j", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "FHVZVKRA", name = "k", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "FHVZVKRA", name = "n", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "FHVZVKRA", name = "t", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "FHVZVKRA", name = "u", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "FHVZVKRA", name = "D", descriptor = "I")
    private int field644;

    @OriginalMember(owner = "FHVZVKRA", name = "K", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "FHVZVKRA", name = "P", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "FHVZVKRA", name = "s", descriptor = "J")
    private long field633;

    @OriginalMember(owner = "FHVZVKRA", name = "H", descriptor = "LUUFPGSJG;")
    private class61 field648;

    @OriginalMember(owner = "FHVZVKRA", name = "z", descriptor = "Lclient;")
    private client field640;

    @OriginalMember(owner = "FHVZVKRA", name = "I", descriptor = "Ljava/io/InputStream;")
    private InputStream field649;

    @OriginalMember(owner = "FHVZVKRA", name = "M", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field653;

    @OriginalMember(owner = "FHVZVKRA", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field617;

    @OriginalMember(owner = "FHVZVKRA", name = "b", descriptor = "[B")
    private byte[] field616;

    @OriginalMember(owner = "FHVZVKRA", name = "w", descriptor = "[I")
    private int[] field637;

    @OriginalMember(owner = "FHVZVKRA", name = "A", descriptor = "[I")
    private int[] field641;

    @OriginalMember(owner = "FHVZVKRA", name = "B", descriptor = "[I")
    private int[] field642;

    @OriginalMember(owner = "FHVZVKRA", name = "F", descriptor = "[I")
    private int[] field646;

    @OriginalMember(owner = "FHVZVKRA", name = "L", descriptor = "[I")
    private int[] field652;

    @OriginalMember(owner = "FHVZVKRA", name = "O", descriptor = "[I")
    private int[] field655;

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(II[BI)Z")
    private final boolean method181(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg2 == null || arg2.length < 2) {
            return false;
        }
        int var5 = arg2.length - 2;
        int var6 = ((arg2[var5] & 0xFF) << 8) + (arg2[var5 + 1] & 0xFF);
        this.field622.reset();
        this.field622.update(arg2, 0, var5);
        int var7 = (int) this.field622.getValue();
        int var8 = 37 / arg1;
        if (arg3 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "b", descriptor = "(I)I")
    public final int method182(int arg0) {
        int var2 = 97 / arg0;
        return this.field637.length;
    }

    @OriginalMember(owner = "FHVZVKRA", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field657) {
                this.field656++;
                byte var1 = 20;
                if (this.field651 == 0 && this.field640.field51[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field615 = true;
                for (int var2 = 0; var2 < 100 && this.field615; var2++) {
                    this.field615 = false;
                    this.method192(-296);
                    this.method193((byte) 0);
                    if (this.field624 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method199(false);
                    if (this.field649 != null) {
                        this.method184(5);
                    }
                }
                boolean var3 = false;
                for (class61 var4 = (class61) this.field645.method471(); var4 != null; var4 = (class61) this.field645.method473((byte) 2)) {
                    if (var4.field1614) {
                        var3 = true;
                        var4.field1611++;
                        if (var4.field1611 > 50) {
                            var4.field1611 = 0;
                            this.method201(var4, 0);
                        }
                    }
                }
                if (!var3) {
                    for (class61 var5 = (class61) this.field645.method471(); var5 != null; var5 = (class61) this.field645.method473((byte) 2)) {
                        var3 = true;
                        var5.field1611++;
                        if (var5.field1611 > 50) {
                            var5.field1611 = 0;
                            this.method201(var5, 0);
                        }
                    }
                }
                if (var3) {
                    this.field620++;
                    if (this.field620 > 750) {
                        try {
                            this.field617.close();
                        } catch (Exception var8) {
                        }
                        this.field617 = null;
                        this.field649 = null;
                        this.field653 = null;
                        this.field635 = 0;
                    }
                } else {
                    this.field620 = 0;
                    this.field629 = "";
                }
                if (this.field640.field473 && this.field617 != null && this.field653 != null && (this.field651 > 0 || this.field640.field51[0] == null)) {
                    this.field621++;
                    if (this.field621 > 500) {
                        this.field621 = 0;
                        this.field636[0] = 0;
                        this.field636[1] = 0;
                        this.field636[2] = 0;
                        this.field636[3] = 10;
                        try {
                            this.field653.write(this.field636, 0, 4);
                        } catch (IOException var7) {
                            this.field620 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(IZI)V")
    public final void method183(int arg0, boolean arg1, int arg2) {
        if (this.field640.field51[0] == null || (this.field654[arg2][arg0] == 0 || (this.field627[arg2][arg0] == 0 || this.field651 == 0))) {
            return;
        }
        class61 var4 = new class61();
        var4.field1610 = arg2;
        var4.field1612 = arg0;
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        var4.field1614 = false;
        class50 var6 = this.field639;
        synchronized (this.field639) {
            this.field639.method468(var4);
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "c", descriptor = "(I)V")
    private final void method184(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            this.field619 = -430;
        }
        try {
            int var2 = this.field649.available();
            if (this.field635 == 0 && var2 >= 6) {
                this.field615 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field649.read(this.field636, var3, 6 - var3)) {
                }
                int var4 = this.field636[0] & 0xFF;
                int var5 = ((this.field636[1] & 0xFF) << 8) + (this.field636[2] & 0xFF);
                int var6 = ((this.field636[3] & 0xFF) << 8) + (this.field636[4] & 0xFF);
                int var7 = this.field636[5] & 0xFF;
                this.field648 = null;
                for (class61 var8 = (class61) this.field645.method471(); var8 != null; var8 = (class61) this.field645.method473((byte) 2)) {
                    if (var8.field1610 == var4 && var8.field1612 == var5) {
                        this.field648 = var8;
                    }
                    if (this.field648 != null) {
                        var8.field1611 = 0;
                    }
                }
                if (this.field648 != null) {
                    this.field620 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field648.field1613 = null;
                        if (this.field648.field1614) {
                            class50 var9 = this.field643;
                            synchronized (this.field643) {
                                this.field643.method468(this.field648);
                            }
                        } else {
                            this.field648.method430();
                        }
                        this.field648 = null;
                    } else {
                        if (this.field648.field1613 == null && var7 == 0) {
                            this.field648.field1613 = new byte[var6];
                        }
                        if (this.field648.field1613 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field634 = var7 * 500;
                this.field635 = 500;
                if (this.field635 > var6 - var7 * 500) {
                    this.field635 = var6 - var7 * 500;
                }
            }
            if (this.field635 > 0 && var2 >= this.field635) {
                this.field615 = true;
                byte[] var10 = this.field636;
                int var11 = 0;
                if (this.field648 != null) {
                    var10 = this.field648.field1613;
                    var11 = this.field634;
                }
                for (int var12 = 0; var12 < this.field635; var12 += this.field649.read(var10, var11 + var12, this.field635 - var12)) {
                }
                if (this.field635 + this.field634 >= var10.length && this.field648 != null) {
                    if (this.field640.field51[0] != null) {
                        this.field640.field51[this.field648.field1610 + 1].method425(this.field648.field1612, (byte) -41, var10.length, var10);
                    }
                    if (!this.field648.field1614 && this.field648.field1610 == 3) {
                        this.field648.field1614 = true;
                        this.field648.field1610 = 93;
                    }
                    if (this.field648.field1614) {
                        class50 var13 = this.field643;
                        synchronized (this.field643) {
                            this.field643.method468(this.field648);
                        }
                    } else {
                        this.field648.method430();
                    }
                }
                this.field635 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field617.close();
            } catch (Exception var15) {
            }
            this.field617 = null;
            this.field649 = null;
            this.field653 = null;
            this.field635 = 0;
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(II)I")
    public final int method185(int arg0, int arg1) {
        return arg0 == 6 ? this.field616[arg1] & 0xFF : 4;
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(IB)I")
    public final int method186(int arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var3 = false;
            return this.field654[arg0].length;
        } else {
            return this.field619;
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "b", descriptor = "(II)Z")
    public final boolean method187(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field642[arg1] == 1;
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(IZ)V")
    public final void method188(int arg0, boolean arg1) {
        int var3 = this.field641.length;
        if (arg0 >= 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field646[var4] != 0) {
                this.method200(3, false, (byte) 2, this.field652[var4]);
                this.method200(3, false, (byte) 2, this.field655[var4]);
            }
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(I)V")
    public final void method189(int arg0) {
        this.method190(0, arg0);
    }

    @OriginalMember(owner = "FHVZVKRA", name = "c", descriptor = "(II)V")
    public final void method190(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field654.length || arg1 < 0 || arg1 > this.field654[arg0].length || this.field654[arg0][arg1] == 0) {
            return;
        }
        class64 var3 = this.field626;
        synchronized (this.field626) {
            for (class61 var4 = (class61) this.field626.method535(); var4 != null; var4 = (class61) this.field626.method536((byte) 2)) {
                if (var4.field1610 == arg0 && var4.field1612 == arg1) {
                    return;
                }
            }
            class61 var5 = new class61();
            var5.field1610 = arg0;
            var5.field1612 = arg1;
            var5.field1614 = true;
            class50 var6 = this.field650;
            synchronized (this.field650) {
                this.field650.method468(var5);
            }
            this.field626.method533(var5);
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(LMNPBQFWE;Lclient;)V")
    public final void method191(class37 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method429(var3[var4], null);
            int var27 = var26.length / 2;
            class3 var28 = new class3(false, var26);
            this.field654[var4] = new int[var27];
            this.field627[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field654[var4][var29] = var28.method17();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method429(var5[var6], null);
            int var23 = var22.length / 4;
            class3 var24 = new class3(false, var22);
            this.field647[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field647[var6][var25] = var24.method20();
            }
        }
        byte[] var7 = arg0.method429("model_index", null);
        int var8 = this.field654[0].length;
        this.field616 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field616[var9] = var7[var9];
            } else {
                this.field616[var9] = 0;
            }
        }
        byte[] var10 = arg0.method429("map_index", null);
        class3 var11 = new class3(false, var10);
        int var12 = var10.length / 7;
        this.field641 = new int[var12];
        this.field655 = new int[var12];
        this.field652 = new int[var12];
        this.field646 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field641[var13] = var11.method17();
            this.field655[var13] = var11.method17();
            this.field652[var13] = var11.method17();
            this.field646[var13] = var11.method15();
        }
        byte[] var14 = arg0.method429("anim_index", null);
        class3 var15 = new class3(false, var14);
        int var16 = var14.length / 2;
        this.field637 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field637[var17] = var15.method17();
        }
        byte[] var18 = arg0.method429("midi_index", null);
        class3 var19 = new class3(false, var18);
        int var20 = var18.length;
        this.field642 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field642[var21] = var19.method15();
        }
        this.field640 = arg1;
        this.field657 = true;
        this.field640.method115(this, 2);
    }

    @OriginalMember(owner = "FHVZVKRA", name = "d", descriptor = "(I)V")
    private final void method192(int arg0) {
        if (arg0 >= 0) {
            this.field619 = 366;
        }
        class50 var2 = this.field650;
        class61 var3;
        synchronized (this.field650) {
            var3 = (class61) this.field650.method470();
        }
        while (var3 != null) {
            this.field615 = true;
            byte[] var4 = null;
            if (this.field640.field51[0] != null) {
                var4 = this.field640.field51[var3.field1610 + 1].method424(674, var3.field1612);
            }
            if (!this.method181(this.field647[var3.field1610][var3.field1612], 763, var4, this.field654[var3.field1610][var3.field1612])) {
                var4 = null;
            }
            class50 var5 = this.field650;
            synchronized (this.field650) {
                if (var4 == null) {
                    this.field631.method468(var3);
                } else {
                    var3.field1613 = var4;
                    class50 var6 = this.field643;
                    synchronized (this.field643) {
                        this.field643.method468(var3);
                    }
                }
                var3 = (class61) this.field650.method470();
            }
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(B)V")
    private final void method193(byte arg0) {
        this.field624 = 0;
        this.field625 = 0;
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field619 = 282;
        }
        for (class61 var3 = (class61) this.field645.method471(); var3 != null; var3 = (class61) this.field645.method473((byte) 2)) {
            if (var3.field1614) {
                this.field624++;
            } else {
                this.field625++;
            }
        }
        while (this.field624 < 10) {
            class61 var4 = (class61) this.field631.method470();
            if (var4 == null) {
                break;
            }
            if (this.field627[var4.field1610][var4.field1612] != 0) {
                this.field628++;
            }
            this.field627[var4.field1610][var4.field1612] = 0;
            this.field645.method468(var4);
            this.field624++;
            this.method201(var4, 0);
            this.field615 = true;
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "()I")
    public final int method194() {
        class64 var1 = this.field626;
        synchronized (this.field626) {
            return this.field626.method537();
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "e", descriptor = "(I)V")
    public final void method195(int arg0) {
        class50 var2 = this.field639;
        synchronized (this.field639) {
            this.field639.method475();
        }
        if (arg0 == -31725) {
            ;
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "b", descriptor = "()V")
    public final void method196() {
        this.field657 = false;
    }

    @OriginalMember(owner = "FHVZVKRA", name = "c", descriptor = "()LUUFPGSJG;")
    public final class61 method197() {
        class50 var1 = this.field643;
        class61 var2;
        synchronized (this.field643) {
            var2 = (class61) this.field643.method470();
        }
        if (var2 == null) {
            return null;
        }
        class64 var3 = this.field626;
        synchronized (this.field626) {
            var2.method298();
        }
        if (var2.field1613 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1613));
            while (true) {
                if (this.field632.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field632, var4, this.field632.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1613 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1613[var7] = this.field632[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "FHVZVKRA", name = "d", descriptor = "(II)Z")
    public final boolean method198(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field641.length; var3++) {
            if (this.field652[var3] == arg1) {
                return true;
            }
        }
        int var4 = 85 / arg0;
        return false;
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(Z)V")
    private final void method199(boolean arg0) {
        if (arg0) {
            return;
        }
        while (this.field624 == 0) {
            if (this.field625 >= 10 || this.field651 == 0) {
                return;
            }
            class50 var2 = this.field639;
            class61 var3;
            synchronized (this.field639) {
                var3 = (class61) this.field639.method470();
            }
            while (var3 != null) {
                if (this.field627[var3.field1610][var3.field1612] != 0) {
                    this.field627[var3.field1610][var3.field1612] = 0;
                    this.field645.method468(var3);
                    this.method201(var3, 0);
                    this.field615 = true;
                    if (this.field628 < this.field644) {
                        this.field628++;
                    }
                    this.field629 = "Loading extra files - " + this.field628 * 100 / this.field644 + "%";
                    this.field625++;
                    if (this.field625 == 10) {
                        return;
                    }
                }
                class50 var4 = this.field639;
                synchronized (this.field639) {
                    var3 = (class61) this.field639.method470();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field627[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field651) {
                        var6[var8] = 0;
                        class61 var9 = new class61();
                        var9.field1610 = var5;
                        var9.field1612 = var8;
                        var9.field1614 = false;
                        this.field645.method468(var9);
                        this.method201(var9, 0);
                        this.field615 = true;
                        if (this.field628 < this.field644) {
                            this.field628++;
                        }
                        this.field629 = "Loading extra files - " + this.field628 * 100 / this.field644 + "%";
                        this.field625++;
                        if (this.field625 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field651--;
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(IZBI)V")
    public final void method200(int arg0, boolean arg1, byte arg2, int arg3) {
        if (this.field640.field51[0] == null || this.field654[arg0][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field640.field51[arg0 + 1].method424(674, arg3);
        if (this.method181(this.field647[arg0][arg3], 763, var5, this.field654[arg0][arg3])) {
            return;
        }
        this.field627[arg0][arg3] = arg2;
        if (arg2 > this.field651) {
            this.field651 = arg2;
        }
        this.field644++;
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(LUUFPGSJG;I)V")
    private final void method201(class61 arg0, int arg1) {
        if (arg1 != 0) {
            this.field619 = -219;
        }
        try {
            if (this.field617 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field633 < 4000L) {
                    return;
                }
                this.field633 = var3;
                this.field617 = this.field640.method129(client.field394 + 43594);
                this.field649 = this.field617.getInputStream();
                this.field653 = this.field617.getOutputStream();
                this.field653.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field649.read();
                }
                this.field620 = 0;
            }
            this.field636[0] = (byte) arg0.field1610;
            this.field636[1] = (byte) (arg0.field1612 >> 8);
            this.field636[2] = (byte) arg0.field1612;
            if (arg0.field1614) {
                this.field636[3] = 2;
            } else if (this.field640.field473) {
                this.field636[3] = 0;
            } else {
                this.field636[3] = 1;
            }
            this.field653.write(this.field636, 0, 4);
            this.field621 = 0;
            this.field623 = -10000;
        } catch (IOException var8) {
            try {
                this.field617.close();
            } catch (Exception var7) {
            }
            this.field617 = null;
            this.field649 = null;
            this.field653 = null;
            this.field635 = 0;
            this.field623++;
        }
    }

    @OriginalMember(owner = "FHVZVKRA", name = "a", descriptor = "(IIII)I")
    public final int method202(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            return 3;
        }
        int var5 = (arg0 << 8) + arg2;
        for (int var6 = 0; var6 < this.field641.length; var6++) {
            if (this.field641[var6] == var5) {
                if (arg3 == 0) {
                    return this.field655[var6];
                }
                return this.field652[var6];
            }
        }
        return -1;
    }
}
