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

@OriginalClass("DHNAQSHE")
public class class13 extends class18 implements Runnable {

    @OriginalMember(owner = "DHNAQSHE", name = "d", descriptor = "[B")
    private byte[] field635 = new byte[65000];

    @OriginalMember(owner = "DHNAQSHE", name = "f", descriptor = "Z")
    private boolean field637 = true;

    @OriginalMember(owner = "DHNAQSHE", name = "k", descriptor = "[[I")
    private int[][] field642 = new int[4][];

    @OriginalMember(owner = "DHNAQSHE", name = "l", descriptor = "I")
    private int field643 = 691;

    @OriginalMember(owner = "DHNAQSHE", name = "s", descriptor = "Ljava/lang/String;")
    public String field650 = "";

    @OriginalMember(owner = "DHNAQSHE", name = "t", descriptor = "I")
    private int field651 = 64;

    @OriginalMember(owner = "DHNAQSHE", name = "v", descriptor = "LJQSVNFRT;")
    private class36 field653 = new class36(0);

    @OriginalMember(owner = "DHNAQSHE", name = "w", descriptor = "LJQSVNFRT;")
    private class36 field654 = new class36(0);

    @OriginalMember(owner = "DHNAQSHE", name = "y", descriptor = "LJQSVNFRT;")
    private class36 field656 = new class36(0);

    @OriginalMember(owner = "DHNAQSHE", name = "z", descriptor = "Z")
    private boolean field657 = false;

    @OriginalMember(owner = "DHNAQSHE", name = "B", descriptor = "LJQSVNFRT;")
    private class36 field659 = new class36(0);

    @OriginalMember(owner = "DHNAQSHE", name = "E", descriptor = "Z")
    private boolean field662 = true;

    @OriginalMember(owner = "DHNAQSHE", name = "F", descriptor = "I")
    private int field663 = 16247;

    @OriginalMember(owner = "DHNAQSHE", name = "G", descriptor = "[B")
    private byte[] field664 = new byte[500];

    @OriginalMember(owner = "DHNAQSHE", name = "H", descriptor = "I")
    private int field665 = 258;

    @OriginalMember(owner = "DHNAQSHE", name = "K", descriptor = "I")
    private int field668 = 1;

    @OriginalMember(owner = "DHNAQSHE", name = "N", descriptor = "B")
    private byte field671 = 9;

    @OriginalMember(owner = "DHNAQSHE", name = "P", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field673 = new CRC32();

    @OriginalMember(owner = "DHNAQSHE", name = "Q", descriptor = "[[B")
    private byte[][] field674 = new byte[4][];

    @OriginalMember(owner = "DHNAQSHE", name = "R", descriptor = "Z")
    private boolean field675 = false;

    @OriginalMember(owner = "DHNAQSHE", name = "W", descriptor = "[[I")
    private int[][] field680 = new int[4][];

    @OriginalMember(owner = "DHNAQSHE", name = "X", descriptor = "LFEBLELGD;")
    private class19 field681 = new class19((byte) 3);

    @OriginalMember(owner = "DHNAQSHE", name = "Y", descriptor = "LJQSVNFRT;")
    private class36 field682 = new class36(0);

    @OriginalMember(owner = "DHNAQSHE", name = "b", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "DHNAQSHE", name = "i", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "DHNAQSHE", name = "j", descriptor = "I")
    private int field641;

    @OriginalMember(owner = "DHNAQSHE", name = "n", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "DHNAQSHE", name = "p", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "DHNAQSHE", name = "q", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "DHNAQSHE", name = "u", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "DHNAQSHE", name = "A", descriptor = "I")
    private int field658;

    @OriginalMember(owner = "DHNAQSHE", name = "C", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "DHNAQSHE", name = "D", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "DHNAQSHE", name = "I", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "DHNAQSHE", name = "J", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "DHNAQSHE", name = "S", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "DHNAQSHE", name = "T", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "DHNAQSHE", name = "O", descriptor = "J")
    private long field672;

    @OriginalMember(owner = "DHNAQSHE", name = "e", descriptor = "LSGKWAMJX;")
    private class56 field636;

    @OriginalMember(owner = "DHNAQSHE", name = "g", descriptor = "Lclient;")
    private client field638;

    @OriginalMember(owner = "DHNAQSHE", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field634;

    @OriginalMember(owner = "DHNAQSHE", name = "V", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field679;

    @OriginalMember(owner = "DHNAQSHE", name = "U", descriptor = "Ljava/net/Socket;")
    private Socket field678;

    @OriginalMember(owner = "DHNAQSHE", name = "o", descriptor = "[B")
    private byte[] field646;

    @OriginalMember(owner = "DHNAQSHE", name = "h", descriptor = "[I")
    private int[] field639;

    @OriginalMember(owner = "DHNAQSHE", name = "m", descriptor = "[I")
    private int[] field644;

    @OriginalMember(owner = "DHNAQSHE", name = "r", descriptor = "[I")
    private int[] field649;

    @OriginalMember(owner = "DHNAQSHE", name = "x", descriptor = "[I")
    private int[] field655;

    @OriginalMember(owner = "DHNAQSHE", name = "L", descriptor = "[I")
    private int[] field669;

    @OriginalMember(owner = "DHNAQSHE", name = "M", descriptor = "[I")
    private int[] field670;

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "()LSGKWAMJX;")
    public final class56 method223() {
        class36 var1 = this.field653;
        class56 var2;
        synchronized (this.field653) {
            var2 = (class56) this.field653.method394();
        }
        if (var2 == null) {
            return null;
        }
        class19 var3 = this.field681;
        synchronized (this.field681) {
            var2.method177();
        }
        if (var2.field1491 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1491));
            while (true) {
                if (this.field635.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field635, var4, this.field635.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1491 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1491[var7] = this.field635[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "b", descriptor = "(I)I")
    public final int method224(int arg0) {
        if (this.field668 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field670.length;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(II)Z")
    public final boolean method225(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field675 = !this.field675;
        }
        return this.field639[arg1] == 1;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(I[BIZ)Z")
    private final boolean method226(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field673.reset();
        this.field673.update(arg1, 0, var5);
        int var7 = (int) this.field673.getValue();
        if (arg3) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg0 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(BIII)I")
    public final int method227(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg3 << 8) + arg2;
        for (int var6 = 0; var6 < this.field644.length; var6++) {
            if (this.field644[var6] == var5) {
                if (arg1 == 0) {
                    return this.field669[var6];
                }
                return this.field649[var6];
            }
        }
        if (arg0 == 9) {
            boolean var7 = false;
        } else {
            this.field643 = 334;
        }
        return -1;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "b", descriptor = "(II)V")
    public final void method228(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field680.length || arg1 < 0 || arg1 > this.field680[arg0].length || this.field680[arg0][arg1] == 0) {
            return;
        }
        class19 var3 = this.field681;
        synchronized (this.field681) {
            for (class56 var4 = (class56) this.field681.method304(); var4 != null; var4 = (class56) this.field681.method305(-125)) {
                if (var4.field1489 == arg0 && var4.field1490 == arg1) {
                    return;
                }
            }
            class56 var5 = new class56();
            var5.field1489 = arg0;
            var5.field1490 = arg1;
            var5.field1487 = true;
            class36 var6 = this.field659;
            synchronized (this.field659) {
                this.field659.method392(var5);
            }
            this.field681.method302(var5);
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(I)V")
    public final void method229(int arg0) {
        this.method228(0, arg0);
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(LTKEGJSFV;Lclient;)V")
    public final void method230(class58 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method542(var3[var4], null);
            int var27 = var26.length / 2;
            class15 var28 = new class15(var26, false);
            this.field680[var4] = new int[var27];
            this.field674[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field680[var4][var29] = var28.method263();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method542(var5[var6], null);
            int var23 = var22.length / 4;
            class15 var24 = new class15(var22, false);
            this.field642[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field642[var6][var25] = var24.method266();
            }
        }
        byte[] var7 = arg0.method542("model_index", null);
        int var8 = this.field680[0].length;
        this.field646 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field646[var9] = var7[var9];
            } else {
                this.field646[var9] = 0;
            }
        }
        byte[] var10 = arg0.method542("map_index", null);
        class15 var11 = new class15(var10, false);
        int var12 = var10.length / 7;
        this.field644 = new int[var12];
        this.field669 = new int[var12];
        this.field649 = new int[var12];
        this.field655 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field644[var13] = var11.method263();
            this.field669[var13] = var11.method263();
            this.field649[var13] = var11.method263();
            this.field655[var13] = var11.method261();
        }
        byte[] var14 = arg0.method542("anim_index", null);
        class15 var15 = new class15(var14, false);
        int var16 = var14.length / 2;
        this.field670 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field670[var17] = var15.method263();
        }
        byte[] var18 = arg0.method542("midi_index", null);
        class15 var19 = new class15(var18, false);
        int var20 = var18.length;
        this.field639 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field639[var21] = var19.method261();
        }
        this.field638 = arg1;
        this.field662 = true;
        this.field638.method51(this, 2);
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(IIIB)V")
    public final void method231(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 15 / arg2;
        if (this.field638.field549[0] == null || this.field680[arg0][arg1] == 0) {
            return;
        }
        byte[] var6 = this.field638.field549[arg0 + 1].method245(arg1, true);
        if (this.method226(this.field680[arg0][arg1], var6, this.field642[arg0][arg1], false)) {
            return;
        }
        this.field674[arg0][arg1] = arg3;
        if (arg3 > this.field677) {
            this.field677 = arg3;
        }
        this.field652++;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "c", descriptor = "(II)I")
    public final int method232(int arg0, int arg1) {
        return arg0 >= 3 && arg0 <= 3 ? this.field646[arg1] & 0xFF : this.field660;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "b", descriptor = "()I")
    public final int method233() {
        class19 var1 = this.field681;
        synchronized (this.field681) {
            return this.field681.method306();
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(IIZ)V")
    public final void method234(int arg0, int arg1, boolean arg2) {
        if (this.field638.field549[0] == null || (this.field680[arg0][arg1] == 0 || (this.field674[arg0][arg1] == 0 || this.field677 == 0))) {
            return;
        }
        class56 var4 = new class56();
        var4.field1489 = arg0;
        var4.field1490 = arg1;
        var4.field1487 = false;
        class36 var5 = this.field682;
        synchronized (this.field682) {
            this.field682.method392(var4);
        }
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(LSGKWAMJX;I)V")
    private final void method235(class56 arg0, int arg1) {
        if (arg1 != 16247) {
            this.field660 = 41;
        }
        try {
            if (this.field678 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field672 < 4000L) {
                    return;
                }
                this.field672 = var3;
                this.field678 = this.field638.method47(client.field128 + 43594);
                this.field634 = this.field678.getInputStream();
                this.field679 = this.field678.getOutputStream();
                this.field679.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field634.read();
                }
                this.field645 = 0;
            }
            this.field664[0] = (byte) arg0.field1489;
            this.field664[1] = (byte) (arg0.field1490 >> 8);
            this.field664[2] = (byte) arg0.field1490;
            if (arg0.field1487) {
                this.field664[3] = 2;
            } else if (this.field638.field529) {
                this.field664[3] = 0;
            } else {
                this.field664[3] = 1;
            }
            this.field679.write(this.field664, 0, 4);
            this.field661 = 0;
            this.field667 = -10000;
        } catch (IOException var8) {
            try {
                this.field678.close();
            } catch (Exception var7) {
            }
            this.field678 = null;
            this.field634 = null;
            this.field679 = null;
            this.field648 = 0;
            this.field667++;
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "d", descriptor = "(II)Z")
    public final boolean method236(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field644.length; var3++) {
            if (this.field649[var3] == arg1) {
                return true;
            }
        }
        int var4 = 4 / arg0;
        return false;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(Z)V")
    public final void method237(boolean arg0) {
        if (arg0) {
            class36 var2 = this.field682;
            synchronized (this.field682) {
                this.field682.method399();
            }
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "c", descriptor = "(I)V")
    private final void method238(int arg0) {
        if (arg0 != 0) {
            this.field637 = !this.field637;
        }
        class36 var2 = this.field659;
        class56 var3;
        synchronized (this.field659) {
            var3 = (class56) this.field659.method394();
        }
        while (var3 != null) {
            this.field657 = true;
            byte[] var4 = null;
            if (this.field638.field549[0] != null) {
                var4 = this.field638.field549[var3.field1489 + 1].method245(var3.field1490, true);
            }
            if (!this.method226(this.field680[var3.field1489][var3.field1490], var4, this.field642[var3.field1489][var3.field1490], false)) {
                var4 = null;
            }
            class36 var5 = this.field659;
            synchronized (this.field659) {
                if (var4 == null) {
                    this.field654.method392(var3);
                } else {
                    var3.field1491 = var4;
                    class36 var6 = this.field653;
                    synchronized (this.field653) {
                        this.field653.method392(var3);
                    }
                }
                var3 = (class56) this.field659.method394();
            }
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "e", descriptor = "(II)I")
    public final int method239(int arg0, int arg1) {
        return arg0 <= 0 ? this.field660 : this.field680[arg1].length;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field662) {
                this.field676++;
                byte var1 = 20;
                if (this.field677 == 0 && this.field638.field549[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field657 = true;
                for (int var2 = 0; var2 < 100 && this.field657; var2++) {
                    this.field657 = false;
                    this.method238(this.field666);
                    this.method242(0);
                    if (this.field640 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method240(false);
                    if (this.field634 != null) {
                        this.method244(true);
                    }
                }
                boolean var3 = false;
                for (class56 var4 = (class56) this.field656.method395(); var4 != null; var4 = (class56) this.field656.method397(-125)) {
                    if (var4.field1487) {
                        var3 = true;
                        var4.field1488++;
                        if (var4.field1488 > 50) {
                            var4.field1488 = 0;
                            this.method235(var4, this.field663);
                        }
                    }
                }
                if (!var3) {
                    for (class56 var5 = (class56) this.field656.method395(); var5 != null; var5 = (class56) this.field656.method397(-125)) {
                        var3 = true;
                        var5.field1488++;
                        if (var5.field1488 > 50) {
                            var5.field1488 = 0;
                            this.method235(var5, this.field663);
                        }
                    }
                }
                if (var3) {
                    this.field645++;
                    if (this.field645 > 750) {
                        try {
                            this.field678.close();
                        } catch (Exception var8) {
                        }
                        this.field678 = null;
                        this.field634 = null;
                        this.field679 = null;
                        this.field648 = 0;
                    }
                } else {
                    this.field645 = 0;
                    this.field650 = "";
                }
                if (this.field638.field529 && this.field678 != null && this.field679 != null && (this.field677 > 0 || this.field638.field549[0] == null)) {
                    this.field661++;
                    if (this.field661 > 500) {
                        this.field661 = 0;
                        this.field664[0] = 0;
                        this.field664[1] = 0;
                        this.field664[2] = 0;
                        this.field664[3] = 10;
                        try {
                            this.field679.write(this.field664, 0, 4);
                        } catch (IOException var7) {
                            this.field645 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "b", descriptor = "(Z)V")
    private final void method240(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field640 == 0) {
            if (this.field641 >= 10 || this.field677 == 0) {
                return;
            }
            class36 var3 = this.field682;
            class56 var4;
            synchronized (this.field682) {
                var4 = (class56) this.field682.method394();
            }
            while (var4 != null) {
                if (this.field674[var4.field1489][var4.field1490] != 0) {
                    this.field674[var4.field1489][var4.field1490] = 0;
                    this.field656.method392(var4);
                    this.method235(var4, this.field663);
                    this.field657 = true;
                    if (this.field658 < this.field652) {
                        this.field658++;
                    }
                    this.field650 = "Loading extra files - " + this.field658 * 100 / this.field652 + "%";
                    this.field641++;
                    if (this.field641 == 10) {
                        return;
                    }
                }
                class36 var5 = this.field682;
                synchronized (this.field682) {
                    var4 = (class56) this.field682.method394();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field674[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field677) {
                        var7[var9] = 0;
                        class56 var10 = new class56();
                        var10.field1489 = var6;
                        var10.field1490 = var9;
                        var10.field1487 = false;
                        this.field656.method392(var10);
                        this.method235(var10, this.field663);
                        this.field657 = true;
                        if (this.field658 < this.field652) {
                            this.field658++;
                        }
                        this.field650 = "Loading extra files - " + this.field658 * 100 / this.field652 + "%";
                        this.field641++;
                        if (this.field641 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field677--;
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "a", descriptor = "(IZ)V")
    public final void method241(int arg0, boolean arg1) {
        int var3 = this.field644.length;
        if (arg0 >= 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field655[var4] != 0) {
                this.method231(3, this.field649[var4], this.field665, (byte) 2);
                this.method231(3, this.field669[var4], this.field665, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "d", descriptor = "(I)V")
    private final void method242(int arg0) {
        if (arg0 < this.field633 || arg0 > this.field633) {
            this.field675 = !this.field675;
        }
        this.field640 = 0;
        this.field641 = 0;
        for (class56 var2 = (class56) this.field656.method395(); var2 != null; var2 = (class56) this.field656.method397(-125)) {
            if (var2.field1487) {
                this.field640++;
            } else {
                this.field641++;
            }
        }
        while (this.field640 < 10) {
            class56 var3 = (class56) this.field654.method394();
            if (var3 == null) {
                break;
            }
            if (this.field674[var3.field1489][var3.field1490] != 0) {
                this.field658++;
            }
            this.field674[var3.field1489][var3.field1490] = 0;
            this.field656.method392(var3);
            this.field640++;
            this.method235(var3, this.field663);
            this.field657 = true;
        }
    }

    @OriginalMember(owner = "DHNAQSHE", name = "c", descriptor = "()V")
    public final void method243() {
        this.field662 = false;
    }

    @OriginalMember(owner = "DHNAQSHE", name = "c", descriptor = "(Z)V")
    private final void method244(boolean arg0) {
        if (!arg0) {
            return;
        }
        try {
            int var2 = this.field634.available();
            if (this.field648 == 0 && var2 >= 6) {
                this.field657 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field634.read(this.field664, var3, 6 - var3)) {
                }
                int var4 = this.field664[0] & 0xFF;
                int var5 = ((this.field664[1] & 0xFF) << 8) + (this.field664[2] & 0xFF);
                int var6 = ((this.field664[3] & 0xFF) << 8) + (this.field664[4] & 0xFF);
                int var7 = this.field664[5] & 0xFF;
                this.field636 = null;
                for (class56 var8 = (class56) this.field656.method395(); var8 != null; var8 = (class56) this.field656.method397(-125)) {
                    if (var8.field1489 == var4 && var8.field1490 == var5) {
                        this.field636 = var8;
                    }
                    if (this.field636 != null) {
                        var8.field1488 = 0;
                    }
                }
                if (this.field636 != null) {
                    this.field645 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field636.field1491 = null;
                        if (this.field636.field1487) {
                            class36 var9 = this.field653;
                            synchronized (this.field653) {
                                this.field653.method392(this.field636);
                            }
                        } else {
                            this.field636.method379();
                        }
                        this.field636 = null;
                    } else {
                        if (this.field636.field1491 == null && var7 == 0) {
                            this.field636.field1491 = new byte[var6];
                        }
                        if (this.field636.field1491 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field647 = var7 * 500;
                this.field648 = 500;
                if (this.field648 > var6 - var7 * 500) {
                    this.field648 = var6 - var7 * 500;
                }
            }
            if (this.field648 > 0 && var2 >= this.field648) {
                this.field657 = true;
                byte[] var10 = this.field664;
                int var11 = 0;
                if (this.field636 != null) {
                    var10 = this.field636.field1491;
                    var11 = this.field647;
                }
                for (int var12 = 0; var12 < this.field648; var12 += this.field634.read(var10, var11 + var12, this.field648 - var12)) {
                }
                if (this.field648 + this.field647 >= var10.length && this.field636 != null) {
                    if (this.field638.field549[0] != null) {
                        this.field638.field549[this.field636.field1489 + 1].method246(3, var10, var10.length, this.field636.field1490);
                    }
                    if (!this.field636.field1487 && this.field636.field1489 == 3) {
                        this.field636.field1487 = true;
                        this.field636.field1489 = 93;
                    }
                    if (this.field636.field1487) {
                        class36 var13 = this.field653;
                        synchronized (this.field653) {
                            this.field653.method392(this.field636);
                        }
                    } else {
                        this.field636.method379();
                    }
                }
                this.field648 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field678.close();
            } catch (Exception var15) {
            }
            this.field678 = null;
            this.field634 = null;
            this.field679 = null;
            this.field648 = 0;
        }
    }
}
