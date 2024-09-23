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

@OriginalClass("DGAWSPEW")
public class class9 extends class55 implements Runnable {

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "Z")
    private boolean field618 = true;

    @OriginalMember(owner = "DGAWSPEW", name = "c", descriptor = "Z")
    private boolean field620 = true;

    @OriginalMember(owner = "DGAWSPEW", name = "e", descriptor = "[[B")
    private byte[][] field622 = new byte[4][];

    @OriginalMember(owner = "DGAWSPEW", name = "f", descriptor = "Ljava/lang/String;")
    public String field623 = "";

    @OriginalMember(owner = "DGAWSPEW", name = "h", descriptor = "Z")
    private boolean field625 = true;

    @OriginalMember(owner = "DGAWSPEW", name = "k", descriptor = "I")
    private int field628 = 5;

    @OriginalMember(owner = "DGAWSPEW", name = "m", descriptor = "LFEPBPONH;")
    private class15 field630 = new class15(145);

    @OriginalMember(owner = "DGAWSPEW", name = "n", descriptor = "LFEPBPONH;")
    private class15 field631 = new class15(145);

    @OriginalMember(owner = "DGAWSPEW", name = "q", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field634 = new CRC32();

    @OriginalMember(owner = "DGAWSPEW", name = "s", descriptor = "B")
    private byte field636 = -90;

    @OriginalMember(owner = "DGAWSPEW", name = "u", descriptor = "LNAZXUZWI;")
    private class36 field638 = new class36(0);

    @OriginalMember(owner = "DGAWSPEW", name = "w", descriptor = "[[I")
    private int[][] field640 = new int[4][];

    @OriginalMember(owner = "DGAWSPEW", name = "y", descriptor = "I")
    private int field642 = -208;

    @OriginalMember(owner = "DGAWSPEW", name = "z", descriptor = "Z")
    private boolean field643 = true;

    @OriginalMember(owner = "DGAWSPEW", name = "A", descriptor = "I")
    private int field644 = -69;

    @OriginalMember(owner = "DGAWSPEW", name = "C", descriptor = "I")
    private int field646 = 974;

    @OriginalMember(owner = "DGAWSPEW", name = "F", descriptor = "[B")
    private byte[] field649 = new byte[65000];

    @OriginalMember(owner = "DGAWSPEW", name = "G", descriptor = "LFEPBPONH;")
    private class15 field650 = new class15(145);

    @OriginalMember(owner = "DGAWSPEW", name = "H", descriptor = "[B")
    private byte[] field651 = new byte[500];

    @OriginalMember(owner = "DGAWSPEW", name = "M", descriptor = "[[I")
    private int[][] field656 = new int[4][];

    @OriginalMember(owner = "DGAWSPEW", name = "P", descriptor = "LFEPBPONH;")
    private class15 field659 = new class15(145);

    @OriginalMember(owner = "DGAWSPEW", name = "Q", descriptor = "LFEPBPONH;")
    private class15 field660 = new class15(145);

    @OriginalMember(owner = "DGAWSPEW", name = "U", descriptor = "Z")
    private boolean field664 = false;

    @OriginalMember(owner = "DGAWSPEW", name = "V", descriptor = "B")
    private byte field665 = -105;

    @OriginalMember(owner = "DGAWSPEW", name = "g", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "DGAWSPEW", name = "i", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "DGAWSPEW", name = "j", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "DGAWSPEW", name = "l", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "DGAWSPEW", name = "o", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "DGAWSPEW", name = "v", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "DGAWSPEW", name = "D", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "DGAWSPEW", name = "I", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "DGAWSPEW", name = "J", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "DGAWSPEW", name = "K", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "DGAWSPEW", name = "O", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "DGAWSPEW", name = "p", descriptor = "J")
    private long field633;

    @OriginalMember(owner = "DGAWSPEW", name = "t", descriptor = "LDYWHHFEE;")
    private class11 field637;

    @OriginalMember(owner = "DGAWSPEW", name = "T", descriptor = "Lclient;")
    private client field663;

    @OriginalMember(owner = "DGAWSPEW", name = "N", descriptor = "Ljava/io/InputStream;")
    private InputStream field657;

    @OriginalMember(owner = "DGAWSPEW", name = "B", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field645;

    @OriginalMember(owner = "DGAWSPEW", name = "E", descriptor = "Ljava/net/Socket;")
    private Socket field648;

    @OriginalMember(owner = "DGAWSPEW", name = "d", descriptor = "[B")
    private byte[] field621;

    @OriginalMember(owner = "DGAWSPEW", name = "b", descriptor = "[I")
    private int[] field619;

    @OriginalMember(owner = "DGAWSPEW", name = "r", descriptor = "[I")
    private int[] field635;

    @OriginalMember(owner = "DGAWSPEW", name = "x", descriptor = "[I")
    private int[] field641;

    @OriginalMember(owner = "DGAWSPEW", name = "L", descriptor = "[I")
    private int[] field655;

    @OriginalMember(owner = "DGAWSPEW", name = "R", descriptor = "[I")
    private int[] field661;

    @OriginalMember(owner = "DGAWSPEW", name = "S", descriptor = "[I")
    private int[] field662;

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(I)V")
    public final void method222(int arg0) {
        this.method230(0, arg0);
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(ZI)V")
    public final void method223(boolean arg0, int arg1) {
        if (arg1 != 27764) {
            return;
        }
        int var3 = this.field635.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field641[var4] != 0) {
                this.method224(-93, this.field655[var4], 3, (byte) 2);
                this.method224(-93, this.field661[var4], 3, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(IIIB)V")
    public final void method224(int arg0, int arg1, int arg2, byte arg3) {
        if (arg0 >= 0 || (this.field663.field446[0] == null || this.field656[arg2][arg1] == 0)) {
            return;
        }
        byte[] var5 = this.field663.field446[arg2 + 1].method491(arg1, this.field646);
        if (this.method229(this.field640[arg2][arg1], var5, this.field656[arg2][arg1], this.field636)) {
            return;
        }
        this.field622[arg2][arg1] = arg3;
        if (arg3 > this.field652) {
            this.field652 = arg3;
        }
        this.field629++;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(IZI)V")
    public final void method225(int arg0, boolean arg1, int arg2) {
        if (this.field663.field446[0] == null || (this.field656[arg2][arg0] == 0 || (this.field622[arg2][arg0] == 0 || this.field652 == 0))) {
            return;
        }
        class11 var4 = new class11();
        var4.field692 = arg2;
        var4.field693 = arg0;
        if (!arg1) {
            this.field625 = !this.field625;
        }
        var4.field696 = false;
        class15 var5 = this.field660;
        synchronized (this.field660) {
            this.field660.method266(var4);
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(LDYWHHFEE;B)V")
    private final void method226(class11 arg0, byte arg1) {
        if (this.field665 != arg1) {
            return;
        }
        try {
            if (this.field648 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field633 < 4000L) {
                    return;
                }
                this.field633 = var3;
                this.field648 = this.field663.method201(client.field126 + 43594);
                this.field657 = this.field648.getInputStream();
                this.field645 = this.field648.getOutputStream();
                this.field645.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field657.read();
                }
                this.field639 = 0;
            }
            this.field651[0] = (byte) arg0.field692;
            this.field651[1] = (byte) (arg0.field693 >> 8);
            this.field651[2] = (byte) arg0.field693;
            if (arg0.field696) {
                this.field651[3] = 2;
            } else if (this.field663.field392) {
                this.field651[3] = 0;
            } else {
                this.field651[3] = 1;
            }
            this.field645.write(this.field651, 0, 4);
            this.field647 = 0;
            this.field632 = -10000;
        } catch (IOException var8) {
            try {
                this.field648.close();
            } catch (Exception var7) {
            }
            this.field648 = null;
            this.field657 = null;
            this.field645 = null;
            this.field627 = 0;
            this.field632++;
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "()LDYWHHFEE;")
    public final class11 method227() {
        class15 var1 = this.field630;
        class11 var2;
        synchronized (this.field630) {
            var2 = (class11) this.field630.method268();
        }
        if (var2 == null) {
            return null;
        }
        class36 var3 = this.field638;
        synchronized (this.field638) {
            var2.method495();
        }
        if (var2.field695 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field695));
            while (true) {
                if (this.field649.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field649, var4, this.field649.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field695 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field695[var7] = this.field649[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(IBII)I")
    public final int method228(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = (arg0 << 8) + arg2;
        if (arg1 != -121) {
            return this.field644;
        }
        for (int var6 = 0; var6 < this.field635.length; var6++) {
            if (this.field635[var6] == var5) {
                if (arg3 == 0) {
                    return this.field661[var6];
                }
                return this.field655[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(I[BIB)Z")
    private final boolean method229(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        if (this.field636 != arg3) {
            this.field646 = 105;
        }
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field634.reset();
        this.field634.update(arg1, 0, var5);
        int var7 = (int) this.field634.getValue();
        if (arg2 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(II)V")
    public final void method230(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field656.length || arg1 < 0 || arg1 > this.field656[arg0].length || this.field656[arg0][arg1] == 0) {
            return;
        }
        class36 var3 = this.field638;
        synchronized (this.field638) {
            for (class11 var4 = (class11) this.field638.method390(); var4 != null; var4 = (class11) this.field638.method391(15175)) {
                if (var4.field692 == arg0 && var4.field693 == arg1) {
                    return;
                }
            }
            class11 var5 = new class11();
            var5.field692 = arg0;
            var5.field693 = arg1;
            var5.field696 = true;
            class15 var6 = this.field631;
            synchronized (this.field631) {
                this.field631.method266(var5);
            }
            this.field638.method388(var5);
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "b", descriptor = "(I)V")
    private final void method231(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        try {
            int var2 = this.field657.available();
            if (this.field627 == 0 && var2 >= 6) {
                this.field664 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field657.read(this.field651, var3, 6 - var3)) {
                }
                int var4 = this.field651[0] & 0xFF;
                int var5 = ((this.field651[1] & 0xFF) << 8) + (this.field651[2] & 0xFF);
                int var6 = ((this.field651[3] & 0xFF) << 8) + (this.field651[4] & 0xFF);
                int var7 = this.field651[5] & 0xFF;
                this.field637 = null;
                for (class11 var8 = (class11) this.field650.method269(); var8 != null; var8 = (class11) this.field650.method271(15175)) {
                    if (var8.field692 == var4 && var8.field693 == var5) {
                        this.field637 = var8;
                    }
                    if (this.field637 != null) {
                        var8.field694 = 0;
                    }
                }
                if (this.field637 != null) {
                    this.field639 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field637.field695 = null;
                        if (this.field637.field696) {
                            class15 var9 = this.field630;
                            synchronized (this.field630) {
                                this.field630.method266(this.field637);
                            }
                        } else {
                            this.field637.method221();
                        }
                        this.field637 = null;
                    } else {
                        if (this.field637.field695 == null && var7 == 0) {
                            this.field637.field695 = new byte[var6];
                        }
                        if (this.field637.field695 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field626 = var7 * 500;
                this.field627 = 500;
                if (this.field627 > var6 - var7 * 500) {
                    this.field627 = var6 - var7 * 500;
                }
            }
            if (this.field627 > 0 && var2 >= this.field627) {
                this.field664 = true;
                byte[] var10 = this.field651;
                int var11 = 0;
                if (this.field637 != null) {
                    var10 = this.field637.field695;
                    var11 = this.field626;
                }
                for (int var12 = 0; var12 < this.field627; var12 += this.field657.read(var10, var11 + var12, this.field627 - var12)) {
                }
                if (this.field627 + this.field626 >= var10.length && this.field637 != null) {
                    if (this.field663.field446[0] != null) {
                        this.field663.field446[this.field637.field692 + 1].method492(true, var10.length, var10, this.field637.field693);
                    }
                    if (!this.field637.field696 && this.field637.field692 == 3) {
                        this.field637.field696 = true;
                        this.field637.field692 = 93;
                    }
                    if (this.field637.field696) {
                        class15 var13 = this.field630;
                        synchronized (this.field630) {
                            this.field630.method266(this.field637);
                        }
                    } else {
                        this.field637.method221();
                    }
                }
                this.field627 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field648.close();
            } catch (Exception var15) {
            }
            this.field648 = null;
            this.field657 = null;
            this.field645 = null;
            this.field627 = 0;
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(LQDHHNYHL;Lclient;)V")
    public final void method232(class44 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method488(var3[var4], null);
            int var27 = var26.length / 2;
            class42 var28 = new class42(5, var26);
            this.field656[var4] = new int[var27];
            this.field622[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field656[var4][var29] = var28.method422();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method488(var5[var6], null);
            int var23 = var22.length / 4;
            class42 var24 = new class42(5, var22);
            this.field640[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field640[var6][var25] = var24.method425();
            }
        }
        byte[] var7 = arg0.method488("model_index", null);
        int var8 = this.field656[0].length;
        this.field621 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field621[var9] = var7[var9];
            } else {
                this.field621[var9] = 0;
            }
        }
        byte[] var10 = arg0.method488("map_index", null);
        class42 var11 = new class42(5, var10);
        int var12 = var10.length / 7;
        this.field635 = new int[var12];
        this.field661 = new int[var12];
        this.field655 = new int[var12];
        this.field641 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field635[var13] = var11.method422();
            this.field661[var13] = var11.method422();
            this.field655[var13] = var11.method422();
            this.field641[var13] = var11.method420();
        }
        byte[] var14 = arg0.method488("anim_index", null);
        class42 var15 = new class42(5, var14);
        int var16 = var14.length / 2;
        this.field662 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field662[var17] = var15.method422();
        }
        byte[] var18 = arg0.method488("midi_index", null);
        class42 var19 = new class42(5, var18);
        int var20 = var18.length;
        this.field619 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field619[var21] = var19.method420();
        }
        this.field663 = arg1;
        this.field643 = true;
        this.field663.method164(this, 2);
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(B)V")
    public final void method233(byte arg0) {
        class15 var2 = this.field660;
        synchronized (this.field660) {
            this.field660.method273();
        }
        if (arg0 != -98) {
            this.field618 = !this.field618;
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field643) {
                this.field658++;
                byte var1 = 20;
                if (this.field652 == 0 && this.field663.field446[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field664 = true;
                for (int var2 = 0; var2 < 100 && this.field664; var2++) {
                    this.field664 = false;
                    this.method243(4);
                    this.method237((byte) 1);
                    if (this.field653 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method238(this.field620);
                    if (this.field657 != null) {
                        this.method231(-395);
                    }
                }
                boolean var3 = false;
                for (class11 var4 = (class11) this.field650.method269(); var4 != null; var4 = (class11) this.field650.method271(15175)) {
                    if (var4.field696) {
                        var3 = true;
                        var4.field694++;
                        if (var4.field694 > 50) {
                            var4.field694 = 0;
                            this.method226(var4, (byte) -105);
                        }
                    }
                }
                if (!var3) {
                    for (class11 var5 = (class11) this.field650.method269(); var5 != null; var5 = (class11) this.field650.method271(15175)) {
                        var3 = true;
                        var5.field694++;
                        if (var5.field694 > 50) {
                            var5.field694 = 0;
                            this.method226(var5, (byte) -105);
                        }
                    }
                }
                if (var3) {
                    this.field639++;
                    if (this.field639 > 750) {
                        try {
                            this.field648.close();
                        } catch (Exception var8) {
                        }
                        this.field648 = null;
                        this.field657 = null;
                        this.field645 = null;
                        this.field627 = 0;
                    }
                } else {
                    this.field639 = 0;
                    this.field623 = "";
                }
                if (this.field663.field392 && this.field648 != null && this.field645 != null && (this.field652 > 0 || this.field663.field446[0] == null)) {
                    this.field647++;
                    if (this.field647 > 500) {
                        this.field647 = 0;
                        this.field651[0] = 0;
                        this.field651[1] = 0;
                        this.field651[2] = 0;
                        this.field651[3] = 10;
                        try {
                            this.field645.write(this.field651, 0, 4);
                        } catch (IOException var7) {
                            this.field639 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "b", descriptor = "(II)Z")
    public final boolean method234(int arg0, int arg1) {
        if (this.field628 != arg1) {
            throw new NullPointerException();
        }
        return this.field619[arg0] == 1;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "b", descriptor = "(ZI)Z")
    public final boolean method235(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field635.length; var3++) {
            if (this.field655[var3] == arg1) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(IZ)I")
    public final int method236(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field621[arg0] & 0xFF;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "b", descriptor = "(B)V")
    private final void method237(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        this.field653 = 0;
        this.field654 = 0;
        for (class11 var2 = (class11) this.field650.method269(); var2 != null; var2 = (class11) this.field650.method271(15175)) {
            if (var2.field696) {
                this.field653++;
            } else {
                this.field654++;
            }
        }
        while (this.field653 < 10) {
            class11 var3 = (class11) this.field659.method268();
            if (var3 == null) {
                break;
            }
            if (this.field622[var3.field692][var3.field693] != 0) {
                this.field624++;
            }
            this.field622[var3.field692][var3.field693] = 0;
            this.field650.method266(var3);
            this.field653++;
            this.method226(var3, (byte) -105);
            this.field664 = true;
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "a", descriptor = "(Z)V")
    private final void method238(boolean arg0) {
        if (!arg0) {
            return;
        }
        while (this.field653 == 0) {
            if (this.field654 >= 10 || this.field652 == 0) {
                return;
            }
            class15 var2 = this.field660;
            class11 var3;
            synchronized (this.field660) {
                var3 = (class11) this.field660.method268();
            }
            while (var3 != null) {
                if (this.field622[var3.field692][var3.field693] != 0) {
                    this.field622[var3.field692][var3.field693] = 0;
                    this.field650.method266(var3);
                    this.method226(var3, (byte) -105);
                    this.field664 = true;
                    if (this.field624 < this.field629) {
                        this.field624++;
                    }
                    this.field623 = "Loading extra files - " + this.field624 * 100 / this.field629 + "%";
                    this.field654++;
                    if (this.field654 == 10) {
                        return;
                    }
                }
                class15 var4 = this.field660;
                synchronized (this.field660) {
                    var3 = (class11) this.field660.method268();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field622[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field652) {
                        var6[var8] = 0;
                        class11 var9 = new class11();
                        var9.field692 = var5;
                        var9.field693 = var8;
                        var9.field696 = false;
                        this.field650.method266(var9);
                        this.method226(var9, (byte) -105);
                        this.field664 = true;
                        if (this.field624 < this.field629) {
                            this.field624++;
                        }
                        this.field623 = "Loading extra files - " + this.field624 * 100 / this.field629 + "%";
                        this.field654++;
                        if (this.field654 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field652--;
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "c", descriptor = "(I)I")
    public final int method239(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field662.length;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "b", descriptor = "()I")
    public final int method240() {
        class36 var1 = this.field638;
        synchronized (this.field638) {
            return this.field638.method392();
        }
    }

    @OriginalMember(owner = "DGAWSPEW", name = "c", descriptor = "(II)I")
    public final int method241(int arg0, int arg1) {
        return arg1 == 0 ? this.field656[arg0].length : this.field642;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "c", descriptor = "()V")
    public final void method242() {
        this.field643 = false;
    }

    @OriginalMember(owner = "DGAWSPEW", name = "d", descriptor = "(I)V")
    private final void method243(int arg0) {
        if (arg0 != 4) {
            return;
        }
        class15 var2 = this.field631;
        class11 var3;
        synchronized (this.field631) {
            var3 = (class11) this.field631.method268();
        }
        while (var3 != null) {
            this.field664 = true;
            byte[] var4 = null;
            if (this.field663.field446[0] != null) {
                var4 = this.field663.field446[var3.field692 + 1].method491(var3.field693, this.field646);
            }
            if (!this.method229(this.field640[var3.field692][var3.field693], var4, this.field656[var3.field692][var3.field693], this.field636)) {
                var4 = null;
            }
            class15 var5 = this.field631;
            synchronized (this.field631) {
                if (var4 == null) {
                    this.field659.method266(var3);
                } else {
                    var3.field695 = var4;
                    class15 var6 = this.field630;
                    synchronized (this.field630) {
                        this.field630.method266(var3);
                    }
                }
                var3 = (class11) this.field631.method268();
            }
        }
    }
}
