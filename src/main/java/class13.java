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

@OriginalClass("EEDCHWRL")
public class class13 extends class23 implements Runnable {

    @OriginalMember(owner = "EEDCHWRL", name = "c", descriptor = "Z")
    private boolean field713 = true;

    @OriginalMember(owner = "EEDCHWRL", name = "e", descriptor = "Z")
    private boolean field715 = true;

    @OriginalMember(owner = "EEDCHWRL", name = "h", descriptor = "Z")
    private boolean field718 = false;

    @OriginalMember(owner = "EEDCHWRL", name = "i", descriptor = "[[B")
    private byte[][] field719 = new byte[4][];

    @OriginalMember(owner = "EEDCHWRL", name = "j", descriptor = "LWUVIEXOA;")
    private class69 field720 = new class69((byte) 7);

    @OriginalMember(owner = "EEDCHWRL", name = "l", descriptor = "LHASAJOKP;")
    private class25 field722 = new class25(176);

    @OriginalMember(owner = "EEDCHWRL", name = "m", descriptor = "Z")
    private boolean field723 = false;

    @OriginalMember(owner = "EEDCHWRL", name = "n", descriptor = "LWUVIEXOA;")
    private class69 field724 = new class69((byte) 7);

    @OriginalMember(owner = "EEDCHWRL", name = "p", descriptor = "[[I")
    private int[][] field726 = new int[4][];

    @OriginalMember(owner = "EEDCHWRL", name = "q", descriptor = "LWUVIEXOA;")
    private class69 field727 = new class69((byte) 7);

    @OriginalMember(owner = "EEDCHWRL", name = "s", descriptor = "[[I")
    private int[][] field729 = new int[4][];

    @OriginalMember(owner = "EEDCHWRL", name = "v", descriptor = "LWUVIEXOA;")
    private class69 field732 = new class69((byte) 7);

    @OriginalMember(owner = "EEDCHWRL", name = "w", descriptor = "LWUVIEXOA;")
    private class69 field733 = new class69((byte) 7);

    @OriginalMember(owner = "EEDCHWRL", name = "y", descriptor = "I")
    private int field735 = -32232;

    @OriginalMember(owner = "EEDCHWRL", name = "z", descriptor = "[B")
    private byte[] field736 = new byte[65000];

    @OriginalMember(owner = "EEDCHWRL", name = "B", descriptor = "Z")
    private boolean field738 = false;

    @OriginalMember(owner = "EEDCHWRL", name = "D", descriptor = "Ljava/lang/String;")
    public String field740 = "";

    @OriginalMember(owner = "EEDCHWRL", name = "E", descriptor = "B")
    private byte field741 = -70;

    @OriginalMember(owner = "EEDCHWRL", name = "F", descriptor = "[B")
    private byte[] field742 = new byte[500];

    @OriginalMember(owner = "EEDCHWRL", name = "L", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field748 = new CRC32();

    @OriginalMember(owner = "EEDCHWRL", name = "R", descriptor = "I")
    private int field754 = -45573;

    @OriginalMember(owner = "EEDCHWRL", name = "S", descriptor = "Z")
    private boolean field755 = true;

    @OriginalMember(owner = "EEDCHWRL", name = "d", descriptor = "I")
    private int field714;

    @OriginalMember(owner = "EEDCHWRL", name = "u", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "EEDCHWRL", name = "x", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "EEDCHWRL", name = "A", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "EEDCHWRL", name = "C", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "EEDCHWRL", name = "G", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "EEDCHWRL", name = "H", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "EEDCHWRL", name = "I", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "EEDCHWRL", name = "P", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "EEDCHWRL", name = "Q", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "EEDCHWRL", name = "T", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "EEDCHWRL", name = "t", descriptor = "J")
    private long field730;

    @OriginalMember(owner = "EEDCHWRL", name = "o", descriptor = "LGVYJCWHX;")
    private class24 field725;

    @OriginalMember(owner = "EEDCHWRL", name = "f", descriptor = "Lclient;")
    private client field716;

    @OriginalMember(owner = "EEDCHWRL", name = "N", descriptor = "Ljava/io/InputStream;")
    private InputStream field750;

    @OriginalMember(owner = "EEDCHWRL", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field712;

    @OriginalMember(owner = "EEDCHWRL", name = "J", descriptor = "Ljava/net/Socket;")
    private Socket field746;

    @OriginalMember(owner = "EEDCHWRL", name = "r", descriptor = "[B")
    private byte[] field728;

    @OriginalMember(owner = "EEDCHWRL", name = "g", descriptor = "[I")
    private int[] field717;

    @OriginalMember(owner = "EEDCHWRL", name = "k", descriptor = "[I")
    private int[] field721;

    @OriginalMember(owner = "EEDCHWRL", name = "K", descriptor = "[I")
    private int[] field747;

    @OriginalMember(owner = "EEDCHWRL", name = "M", descriptor = "[I")
    private int[] field749;

    @OriginalMember(owner = "EEDCHWRL", name = "O", descriptor = "[I")
    private int[] field751;

    @OriginalMember(owner = "EEDCHWRL", name = "U", descriptor = "[I")
    private int[] field757;

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(B)V")
    public final void method256(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field738 = !this.field738;
        }
        class69 var3 = this.field727;
        synchronized (this.field727) {
            this.field727.method589();
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field713) {
                this.field734++;
                byte var1 = 20;
                if (this.field739 == 0 && this.field716.field348[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field718 = true;
                for (int var2 = 0; var2 < 100 && this.field718; var2++) {
                    this.field718 = false;
                    this.method263(0);
                    this.method264((byte) -70);
                    if (this.field752 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method266(this.field735);
                    if (this.field750 != null) {
                        this.method269(true);
                    }
                }
                boolean var3 = false;
                for (class24 var4 = (class24) this.field720.method585(); var4 != null; var4 = (class24) this.field720.method587(0)) {
                    if (var4.field984) {
                        var3 = true;
                        var4.field980++;
                        if (var4.field980 > 50) {
                            var4.field980 = 0;
                            this.method265(var4, 4);
                        }
                    }
                }
                if (!var3) {
                    for (class24 var5 = (class24) this.field720.method585(); var5 != null; var5 = (class24) this.field720.method587(0)) {
                        var3 = true;
                        var5.field980++;
                        if (var5.field980 > 50) {
                            var5.field980 = 0;
                            this.method265(var5, 4);
                        }
                    }
                }
                if (var3) {
                    this.field737++;
                    if (this.field737 > 750) {
                        try {
                            this.field746.close();
                        } catch (Exception var8) {
                        }
                        this.field746 = null;
                        this.field750 = null;
                        this.field712 = null;
                        this.field745 = 0;
                    }
                } else {
                    this.field737 = 0;
                    this.field740 = "";
                }
                if (this.field716.field512 && this.field746 != null && this.field712 != null && (this.field739 > 0 || this.field716.field348[0] == null)) {
                    this.field756++;
                    if (this.field756 > 500) {
                        this.field756 = 0;
                        this.field742[0] = 0;
                        this.field742[1] = 0;
                        this.field742[2] = 0;
                        this.field742[3] = 10;
                        try {
                            this.field712.write(this.field742, 0, 4);
                        } catch (IOException var7) {
                            this.field737 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "()LGVYJCWHX;")
    public final class24 method257() {
        class69 var1 = this.field732;
        class24 var2;
        synchronized (this.field732) {
            var2 = (class24) this.field732.method584();
        }
        if (var2 == null) {
            return null;
        }
        class25 var3 = this.field722;
        synchronized (this.field722) {
            var2.method292();
        }
        if (var2.field983 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field983));
            while (true) {
                if (this.field736.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field736, var4, this.field736.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field983 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field983[var7] = this.field736[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(ZI)I")
    public final int method258(boolean arg0, int arg1) {
        if (arg0) {
            this.field754 = 493;
        }
        return this.field728[arg1] & 0xFF;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(II)V")
    public final void method259(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field726.length || arg1 < 0 || arg1 > this.field726[arg0].length || this.field726[arg0][arg1] == 0) {
            return;
        }
        class25 var3 = this.field722;
        synchronized (this.field722) {
            for (class24 var4 = (class24) this.field722.method372(); var4 != null; var4 = (class24) this.field722.method373(0)) {
                if (var4.field982 == arg0 && var4.field981 == arg1) {
                    return;
                }
            }
            class24 var5 = new class24();
            var5.field982 = arg0;
            var5.field981 = arg1;
            var5.field984 = true;
            class69 var6 = this.field724;
            synchronized (this.field724) {
                this.field724.method582(var5);
            }
            this.field722.method370(var5);
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(IZII)I")
    public final int method260(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = (arg3 << 8) + arg2;
        if (arg1) {
            return this.field754;
        }
        for (int var6 = 0; var6 < this.field747.length; var6++) {
            if (this.field747[var6] == var5) {
                if (arg0 == 0) {
                    return this.field721[var6];
                }
                return this.field717[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "b", descriptor = "(II)Z")
    public final boolean method261(int arg0, int arg1) {
        if (arg0 != -45573) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field751[arg1] == 1;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(ZZ)V")
    public final void method262(boolean arg0, boolean arg1) {
        int var3 = this.field747.length;
        if (arg1) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field757[var4] != 0) {
                this.method271(3, 931, this.field717[var4], (byte) 2);
                this.method271(3, 931, this.field721[var4], (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "b", descriptor = "(I)V")
    private final void method263(int arg0) {
        if (arg0 != 0) {
            this.field754 = 67;
        }
        class69 var2 = this.field724;
        class24 var3;
        synchronized (this.field724) {
            var3 = (class24) this.field724.method584();
        }
        while (var3 != null) {
            this.field718 = true;
            byte[] var4 = null;
            if (this.field716.field348[0] != null) {
                var4 = this.field716.field348[var3.field982 + 1].method375((byte) -18, var3.field981);
            }
            if (!this.method274(true, var4, this.field726[var3.field982][var3.field981], this.field729[var3.field982][var3.field981])) {
                var4 = null;
            }
            class69 var5 = this.field724;
            synchronized (this.field724) {
                if (var4 == null) {
                    this.field733.method582(var3);
                } else {
                    var3.field983 = var4;
                    class69 var6 = this.field732;
                    synchronized (this.field732) {
                        this.field732.method582(var3);
                    }
                }
                var3 = (class24) this.field724.method584();
            }
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "b", descriptor = "(B)V")
    private final void method264(byte arg0) {
        this.field752 = 0;
        this.field753 = 0;
        if (this.field741 != arg0) {
            this.field723 = !this.field723;
        }
        for (class24 var2 = (class24) this.field720.method585(); var2 != null; var2 = (class24) this.field720.method587(0)) {
            if (var2.field984) {
                this.field752++;
            } else {
                this.field753++;
            }
        }
        while (this.field752 < 10) {
            class24 var3 = (class24) this.field733.method584();
            if (var3 == null) {
                break;
            }
            if (this.field719[var3.field982][var3.field981] != 0) {
                this.field714++;
            }
            this.field719[var3.field982][var3.field981] = 0;
            this.field720.method582(var3);
            this.field752++;
            this.method265(var3, 4);
            this.field718 = true;
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(LGVYJCWHX;I)V")
    private final void method265(class24 arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            return;
        }
        try {
            if (this.field746 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field730 < 4000L) {
                    return;
                }
                this.field730 = var3;
                this.field746 = this.field716.method168(client.field273 + 43594);
                this.field750 = this.field746.getInputStream();
                this.field712 = this.field746.getOutputStream();
                this.field712.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field750.read();
                }
                this.field737 = 0;
            }
            this.field742[0] = (byte) arg0.field982;
            this.field742[1] = (byte) (arg0.field981 >> 8);
            this.field742[2] = (byte) arg0.field981;
            if (arg0.field984) {
                this.field742[3] = 2;
            } else if (this.field716.field512) {
                this.field742[3] = 0;
            } else {
                this.field742[3] = 1;
            }
            this.field712.write(this.field742, 0, 4);
            this.field756 = 0;
            this.field731 = -10000;
        } catch (IOException var8) {
            try {
                this.field746.close();
            } catch (Exception var7) {
            }
            this.field746 = null;
            this.field750 = null;
            this.field712 = null;
            this.field745 = 0;
            this.field731++;
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "c", descriptor = "(I)V")
    private final void method266(int arg0) {
        if (arg0 != -32232) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field752 == 0) {
            if (this.field753 >= 10 || this.field739 == 0) {
                return;
            }
            class69 var3 = this.field727;
            class24 var4;
            synchronized (this.field727) {
                var4 = (class24) this.field727.method584();
            }
            while (var4 != null) {
                if (this.field719[var4.field982][var4.field981] != 0) {
                    this.field719[var4.field982][var4.field981] = 0;
                    this.field720.method582(var4);
                    this.method265(var4, 4);
                    this.field718 = true;
                    if (this.field714 < this.field743) {
                        this.field714++;
                    }
                    this.field740 = "Loading extra files - " + this.field714 * 100 / this.field743 + "%";
                    this.field753++;
                    if (this.field753 == 10) {
                        return;
                    }
                }
                class69 var5 = this.field727;
                synchronized (this.field727) {
                    var4 = (class24) this.field727.method584();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field719[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field739) {
                        var7[var9] = 0;
                        class24 var10 = new class24();
                        var10.field982 = var6;
                        var10.field981 = var9;
                        var10.field984 = false;
                        this.field720.method582(var10);
                        this.method265(var10, 4);
                        this.field718 = true;
                        if (this.field714 < this.field743) {
                            this.field714++;
                        }
                        this.field740 = "Loading extra files - " + this.field714 * 100 / this.field743 + "%";
                        this.field753++;
                        if (this.field753 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field739--;
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(LEAXVDNXA;Lclient;)V")
    public final void method267(class12 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method255(var3[var4], null);
            int var27 = var26.length / 2;
            class5 var28 = new class5(2, var26);
            this.field726[var4] = new int[var27];
            this.field719[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field726[var4][var29] = var28.method46();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method255(var5[var6], null);
            int var23 = var22.length / 4;
            class5 var24 = new class5(2, var22);
            this.field729[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field729[var6][var25] = var24.method49();
            }
        }
        byte[] var7 = arg0.method255("model_index", null);
        int var8 = this.field726[0].length;
        this.field728 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field728[var9] = var7[var9];
            } else {
                this.field728[var9] = 0;
            }
        }
        byte[] var10 = arg0.method255("map_index", null);
        class5 var11 = new class5(2, var10);
        int var12 = var10.length / 7;
        this.field747 = new int[var12];
        this.field721 = new int[var12];
        this.field717 = new int[var12];
        this.field757 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field747[var13] = var11.method46();
            this.field721[var13] = var11.method46();
            this.field717[var13] = var11.method46();
            this.field757[var13] = var11.method44();
        }
        byte[] var14 = arg0.method255("anim_index", null);
        class5 var15 = new class5(2, var14);
        int var16 = var14.length / 2;
        this.field749 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field749[var17] = var15.method46();
        }
        byte[] var18 = arg0.method255("midi_index", null);
        class5 var19 = new class5(2, var18);
        int var20 = var18.length;
        this.field751 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field751[var21] = var19.method44();
        }
        this.field716 = arg1;
        this.field713 = true;
        this.field716.method117(this, 2);
    }

    @OriginalMember(owner = "EEDCHWRL", name = "b", descriptor = "()I")
    public final int method268() {
        class25 var1 = this.field722;
        synchronized (this.field722) {
            return this.field722.method374();
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(Z)V")
    private final void method269(boolean arg0) {
        if (!arg0) {
            this.field723 = !this.field723;
        }
        try {
            int var2 = this.field750.available();
            if (this.field745 == 0 && var2 >= 6) {
                this.field718 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field750.read(this.field742, var3, 6 - var3)) {
                }
                int var4 = this.field742[0] & 0xFF;
                int var5 = ((this.field742[1] & 0xFF) << 8) + (this.field742[2] & 0xFF);
                int var6 = ((this.field742[3] & 0xFF) << 8) + (this.field742[4] & 0xFF);
                int var7 = this.field742[5] & 0xFF;
                this.field725 = null;
                for (class24 var8 = (class24) this.field720.method585(); var8 != null; var8 = (class24) this.field720.method587(0)) {
                    if (var8.field982 == var4 && var8.field981 == var5) {
                        this.field725 = var8;
                    }
                    if (this.field725 != null) {
                        var8.field980 = 0;
                    }
                }
                if (this.field725 != null) {
                    this.field737 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field725.field983 = null;
                        if (this.field725.field984) {
                            class69 var9 = this.field732;
                            synchronized (this.field732) {
                                this.field732.method582(this.field725);
                            }
                        } else {
                            this.field725.method450();
                        }
                        this.field725 = null;
                    } else {
                        if (this.field725.field983 == null && var7 == 0) {
                            this.field725.field983 = new byte[var6];
                        }
                        if (this.field725.field983 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field744 = var7 * 500;
                this.field745 = 500;
                if (this.field745 > var6 - var7 * 500) {
                    this.field745 = var6 - var7 * 500;
                }
            }
            if (this.field745 > 0 && var2 >= this.field745) {
                this.field718 = true;
                byte[] var10 = this.field742;
                int var11 = 0;
                if (this.field725 != null) {
                    var10 = this.field725.field983;
                    var11 = this.field744;
                }
                for (int var12 = 0; var12 < this.field745; var12 += this.field750.read(var10, var11 + var12, this.field745 - var12)) {
                }
                if (this.field745 + this.field744 >= var10.length && this.field725 != null) {
                    if (this.field716.field348[0] != null) {
                        this.field716.field348[this.field725.field982 + 1].method376(var10.length, this.field725.field981, var10, 387);
                    }
                    if (!this.field725.field984 && this.field725.field982 == 3) {
                        this.field725.field984 = true;
                        this.field725.field982 = 93;
                    }
                    if (this.field725.field984) {
                        class69 var13 = this.field732;
                        synchronized (this.field732) {
                            this.field732.method582(this.field725);
                        }
                    } else {
                        this.field725.method450();
                    }
                }
                this.field745 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field746.close();
            } catch (Exception var15) {
            }
            this.field746 = null;
            this.field750 = null;
            this.field712 = null;
            this.field745 = 0;
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "c", descriptor = "()V")
    public final void method270() {
        this.field713 = false;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(IIIB)V")
    public final void method271(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field716.field348[0] == null || this.field726[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field716.field348[arg0 + 1].method375((byte) -18, arg2);
        if (this.method274(true, var5, this.field726[arg0][arg2], this.field729[arg0][arg2])) {
            return;
        }
        this.field719[arg0][arg2] = arg3;
        if (arg3 > this.field739) {
            this.field739 = arg3;
        }
        this.field743++;
        int var6 = 10 / arg1;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "d", descriptor = "(I)I")
    public final int method272(int arg0) {
        return arg0 >= 6 && arg0 <= 6 ? this.field749.length : this.field754;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(I)V")
    public final void method273(int arg0) {
        this.method259(0, arg0);
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(Z[BII)Z")
    private final boolean method274(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        if (!arg0) {
            throw new NullPointerException();
        }
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field748.reset();
        this.field748.update(arg1, 0, var5);
        int var7 = (int) this.field748.getValue();
        if (arg2 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(BI)Z")
    public final boolean method275(byte arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field747.length; var3++) {
            if (this.field717[var3] == arg1) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(IB)I")
    public final int method276(int arg0, byte arg1) {
        if (arg1 == 5) {
            boolean var3 = false;
        } else {
            this.field754 = 373;
        }
        return this.field726[arg0].length;
    }

    @OriginalMember(owner = "EEDCHWRL", name = "a", descriptor = "(BII)V")
    public final void method277(byte arg0, int arg1, int arg2) {
        if (arg0 != 125) {
            this.field715 = !this.field715;
        }
        if (this.field716.field348[0] == null || (this.field726[arg1][arg2] == 0 || (this.field719[arg1][arg2] == 0 || this.field739 == 0))) {
            return;
        }
        class24 var4 = new class24();
        var4.field982 = arg1;
        var4.field981 = arg2;
        var4.field984 = false;
        class69 var5 = this.field727;
        synchronized (this.field727) {
            this.field727.method582(var4);
        }
    }
}
