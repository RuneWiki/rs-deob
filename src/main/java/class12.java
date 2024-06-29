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

@OriginalClass("client!EBLTOQBO")
public class class12 extends class41 implements Runnable {

    @OriginalMember(owner = "client!EBLTOQBO", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field737 = new CRC32();

    @OriginalMember(owner = "client!EBLTOQBO", name = "d", descriptor = "[[I")
    private int[][] field739 = new int[4][];

    @OriginalMember(owner = "client!EBLTOQBO", name = "e", descriptor = "[B")
    private byte[] field740 = new byte[65000];

    @OriginalMember(owner = "client!EBLTOQBO", name = "h", descriptor = "I")
    private int field743 = -32392;

    @OriginalMember(owner = "client!EBLTOQBO", name = "j", descriptor = "B")
    private byte field745 = 3;

    @OriginalMember(owner = "client!EBLTOQBO", name = "l", descriptor = "LPACANLMY;")
    private class42 field747 = new class42(0);

    @OriginalMember(owner = "client!EBLTOQBO", name = "m", descriptor = "[B")
    private byte[] field748 = new byte[500];

    @OriginalMember(owner = "client!EBLTOQBO", name = "q", descriptor = "I")
    private int field752 = 7;

    @OriginalMember(owner = "client!EBLTOQBO", name = "t", descriptor = "LPACANLMY;")
    private class42 field755 = new class42(0);

    @OriginalMember(owner = "client!EBLTOQBO", name = "v", descriptor = "I")
    private int field757 = 3148;

    @OriginalMember(owner = "client!EBLTOQBO", name = "w", descriptor = "Z")
    private boolean field758 = false;

    @OriginalMember(owner = "client!EBLTOQBO", name = "x", descriptor = "[[I")
    private int[][] field759 = new int[4][];

    @OriginalMember(owner = "client!EBLTOQBO", name = "C", descriptor = "LYAKFHRTY;")
    private class62 field764 = new class62(field761);

    @OriginalMember(owner = "client!EBLTOQBO", name = "D", descriptor = "[[B")
    private byte[][] field765 = new byte[4][];

    @OriginalMember(owner = "client!EBLTOQBO", name = "E", descriptor = "LPACANLMY;")
    private class42 field766 = new class42(0);

    @OriginalMember(owner = "client!EBLTOQBO", name = "G", descriptor = "Z")
    private boolean field768 = true;

    @OriginalMember(owner = "client!EBLTOQBO", name = "K", descriptor = "LPACANLMY;")
    private class42 field772 = new class42(0);

    @OriginalMember(owner = "client!EBLTOQBO", name = "P", descriptor = "Z")
    private boolean field777 = true;

    @OriginalMember(owner = "client!EBLTOQBO", name = "Q", descriptor = "Ljava/lang/String;")
    public String field778 = "";

    @OriginalMember(owner = "client!EBLTOQBO", name = "R", descriptor = "LPACANLMY;")
    private class42 field779 = new class42(0);

    @OriginalMember(owner = "client!EBLTOQBO", name = "c", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!EBLTOQBO", name = "k", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!EBLTOQBO", name = "n", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!EBLTOQBO", name = "o", descriptor = "I")
    private int field750;

    @OriginalMember(owner = "client!EBLTOQBO", name = "p", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!EBLTOQBO", name = "u", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "client!EBLTOQBO", name = "z", descriptor = "I")
    private static int field761;

    @OriginalMember(owner = "client!EBLTOQBO", name = "A", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "client!EBLTOQBO", name = "B", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "client!EBLTOQBO", name = "I", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!EBLTOQBO", name = "N", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!EBLTOQBO", name = "O", descriptor = "I")
    private int field776;

    @OriginalMember(owner = "client!EBLTOQBO", name = "s", descriptor = "J")
    private long field754;

    @OriginalMember(owner = "client!EBLTOQBO", name = "M", descriptor = "LZUBZCVQN;")
    private class72 field774;

    @OriginalMember(owner = "client!EBLTOQBO", name = "r", descriptor = "Lclient;")
    private client field753;

    @OriginalMember(owner = "client!EBLTOQBO", name = "S", descriptor = "Ljava/io/InputStream;")
    private InputStream field780;

    @OriginalMember(owner = "client!EBLTOQBO", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field744;

    @OriginalMember(owner = "client!EBLTOQBO", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field742;

    @OriginalMember(owner = "client!EBLTOQBO", name = "f", descriptor = "[B")
    private byte[] field741;

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "[I")
    private int[] field736;

    @OriginalMember(owner = "client!EBLTOQBO", name = "y", descriptor = "[I")
    private int[] field760;

    @OriginalMember(owner = "client!EBLTOQBO", name = "F", descriptor = "[I")
    private int[] field767;

    @OriginalMember(owner = "client!EBLTOQBO", name = "H", descriptor = "[I")
    private int[] field769;

    @OriginalMember(owner = "client!EBLTOQBO", name = "J", descriptor = "[I")
    private int[] field771;

    @OriginalMember(owner = "client!EBLTOQBO", name = "L", descriptor = "[I")
    private int[] field773;

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(LFUZJMGZB;Lclient;)V")
    public final void method224(class19 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method277(var3[var4], null);
            int var27 = var26.length / 2;
            class32 var28 = new class32((byte) 114, var26);
            this.field759[var4] = new int[var27];
            this.field765[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field759[var4][var29] = var28.method371();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method277(var5[var6], null);
            int var23 = var22.length / 4;
            class32 var24 = new class32((byte) 114, var22);
            this.field739[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field739[var6][var25] = var24.method374();
            }
        }
        byte[] var7 = arg0.method277("model_index", null);
        int var8 = this.field759[0].length;
        this.field741 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field741[var9] = var7[var9];
            } else {
                this.field741[var9] = 0;
            }
        }
        byte[] var10 = arg0.method277("map_index", null);
        class32 var11 = new class32((byte) 114, var10);
        int var12 = var10.length / 7;
        this.field771 = new int[var12];
        this.field760 = new int[var12];
        this.field769 = new int[var12];
        this.field767 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field771[var13] = var11.method371();
            this.field760[var13] = var11.method371();
            this.field769[var13] = var11.method371();
            this.field767[var13] = var11.method369();
        }
        byte[] var14 = arg0.method277("anim_index", null);
        class32 var15 = new class32((byte) 114, var14);
        int var16 = var14.length / 2;
        this.field736 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field736[var17] = var15.method371();
        }
        byte[] var18 = arg0.method277("midi_index", null);
        class32 var19 = new class32((byte) 114, var18);
        int var20 = var18.length;
        this.field773 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field773[var21] = var19.method369();
        }
        this.field753 = arg1;
        this.field768 = true;
        this.field753.method58(this, 2);
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(BZ)V")
    public final void method225(byte arg0, boolean arg1) {
        int var3 = this.field771.length;
        if (arg0 != 3) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field767[var4] != 0) {
                this.method238((byte) 2, this.field769[var4], 3, false);
                this.method238((byte) 2, this.field760[var4], 3, false);
            }
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "b", descriptor = "(I)V")
    private final void method226(int arg0) {
        if (arg0 != 1) {
            return;
        }
        while (this.field762 == 0) {
            if (this.field763 >= 10 || this.field750 == 0) {
                return;
            }
            class42 var2 = this.field747;
            class72 var3;
            synchronized (this.field747) {
                var3 = (class72) this.field747.method448();
            }
            while (var3 != null) {
                if (this.field765[var3.field1734][var3.field1735] != 0) {
                    this.field765[var3.field1734][var3.field1735] = 0;
                    this.field779.method446(var3);
                    this.method231(var3, false);
                    this.field758 = true;
                    if (this.field756 < this.field738) {
                        this.field756++;
                    }
                    this.field778 = "Loading extra files - " + this.field756 * 100 / this.field738 + "%";
                    this.field763++;
                    if (this.field763 == 10) {
                        return;
                    }
                }
                class42 var4 = this.field747;
                synchronized (this.field747) {
                    var3 = (class72) this.field747.method448();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field765[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field750) {
                        var6[var8] = 0;
                        class72 var9 = new class72();
                        var9.field1734 = var5;
                        var9.field1735 = var8;
                        var9.field1736 = false;
                        this.field779.method446(var9);
                        this.method231(var9, false);
                        this.field758 = true;
                        if (this.field756 < this.field738) {
                            this.field756++;
                        }
                        this.field778 = "Loading extra files - " + this.field756 * 100 / this.field738 + "%";
                        this.field763++;
                        if (this.field763 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field750--;
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "()V")
    public final void method227() {
        this.field768 = false;
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(III)V")
    public final void method228(int arg0, int arg1, int arg2) {
        if (this.field753.field337[0] == null || (this.field759[arg2][arg1] == 0 || (this.field765[arg2][arg1] == 0 || this.field750 == 0))) {
            return;
        }
        class72 var4 = new class72();
        var4.field1734 = arg2;
        var4.field1735 = arg1;
        var4.field1736 = false;
        class42 var5 = this.field747;
        synchronized (this.field747) {
            this.field747.method446(var4);
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(BI)I")
    public final int method229(byte arg0, int arg1) {
        return this.field745 == arg0 ? this.field741[arg1] & 0xFF : this.field752;
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(Z)V")
    private final void method230(boolean arg0) {
        if (!arg0) {
            return;
        }
        try {
            int var2 = this.field780.available();
            if (this.field776 == 0 && var2 >= 6) {
                this.field758 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field780.read(this.field748, var3, 6 - var3)) {
                }
                int var4 = this.field748[0] & 0xFF;
                int var5 = ((this.field748[1] & 0xFF) << 8) + (this.field748[2] & 0xFF);
                int var6 = ((this.field748[3] & 0xFF) << 8) + (this.field748[4] & 0xFF);
                int var7 = this.field748[5] & 0xFF;
                this.field774 = null;
                for (class72 var8 = (class72) this.field779.method449(); var8 != null; var8 = (class72) this.field779.method451(-582)) {
                    if (var8.field1734 == var4 && var8.field1735 == var5) {
                        this.field774 = var8;
                    }
                    if (this.field774 != null) {
                        var8.field1738 = 0;
                    }
                }
                if (this.field774 != null) {
                    this.field746 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field774.field1737 = null;
                        if (this.field774.field1736) {
                            class42 var9 = this.field772;
                            synchronized (this.field772) {
                                this.field772.method446(this.field774);
                            }
                        } else {
                            this.field774.method464();
                        }
                        this.field774 = null;
                    } else {
                        if (this.field774.field1737 == null && var7 == 0) {
                            this.field774.field1737 = new byte[var6];
                        }
                        if (this.field774.field1737 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field775 = var7 * 500;
                this.field776 = 500;
                if (this.field776 > var6 - var7 * 500) {
                    this.field776 = var6 - var7 * 500;
                }
            }
            if (this.field776 > 0 && var2 >= this.field776) {
                this.field758 = true;
                byte[] var10 = this.field748;
                int var11 = 0;
                if (this.field774 != null) {
                    var10 = this.field774.field1737;
                    var11 = this.field775;
                }
                for (int var12 = 0; var12 < this.field776; var12 += this.field780.read(var10, var11 + var12, this.field776 - var12)) {
                }
                if (this.field776 + this.field775 >= var10.length && this.field774 != null) {
                    if (this.field753.field337[0] != null) {
                        this.field753.field337[this.field774.field1734 + 1].method421(var10, this.field774.field1735, true, var10.length);
                    }
                    if (!this.field774.field1736 && this.field774.field1734 == 3) {
                        this.field774.field1736 = true;
                        this.field774.field1734 = 93;
                    }
                    if (this.field774.field1736) {
                        class42 var13 = this.field772;
                        synchronized (this.field772) {
                            this.field772.method446(this.field774);
                        }
                    } else {
                        this.field774.method464();
                    }
                }
                this.field776 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field742.close();
            } catch (Exception var15) {
            }
            this.field742 = null;
            this.field780 = null;
            this.field744 = null;
            this.field776 = 0;
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(LZUBZCVQN;Z)V")
    private final void method231(class72 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        try {
            if (this.field742 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field754 < 4000L) {
                    return;
                }
                this.field754 = var3;
                this.field742 = this.field753.method131(client.field216 + 43594);
                this.field780 = this.field742.getInputStream();
                this.field744 = this.field742.getOutputStream();
                this.field744.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field780.read();
                }
                this.field746 = 0;
            }
            this.field748[0] = (byte) arg0.field1734;
            this.field748[1] = (byte) (arg0.field1735 >> 8);
            this.field748[2] = (byte) arg0.field1735;
            if (arg0.field1736) {
                this.field748[3] = 2;
            } else if (this.field753.field318) {
                this.field748[3] = 0;
            } else {
                this.field748[3] = 1;
            }
            this.field744.write(this.field748, 0, 4);
            this.field770 = 0;
            this.field751 = -10000;
        } catch (IOException var8) {
            try {
                this.field742.close();
            } catch (Exception var7) {
            }
            this.field742 = null;
            this.field780 = null;
            this.field744 = null;
            this.field776 = 0;
            this.field751++;
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "c", descriptor = "(I)V")
    private final void method232(int arg0) {
        this.field762 = 0;
        this.field763 = 0;
        class72 var2 = (class72) this.field779.method449();
        if (arg0 != 23925) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (var2 != null) {
            if (var2.field1736) {
                this.field762++;
            } else {
                this.field763++;
            }
            var2 = (class72) this.field779.method451(-582);
        }
        while (this.field762 < 10) {
            class72 var4 = (class72) this.field755.method448();
            if (var4 == null) {
                break;
            }
            if (this.field765[var4.field1734][var4.field1735] != 0) {
                this.field756++;
            }
            this.field765[var4.field1734][var4.field1735] = 0;
            this.field779.method446(var4);
            this.field762++;
            this.method231(var4, false);
            this.field758 = true;
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(IB)Z")
    public final boolean method233(int arg0, byte arg1) {
        if (arg1 != 113) {
            throw new NullPointerException();
        }
        return this.field773[arg0] == 1;
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "d", descriptor = "(I)V")
    public final void method234(int arg0) {
        class42 var2 = this.field747;
        synchronized (this.field747) {
            this.field747.method453();
        }
        if (arg0 != 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(IZ)I")
    public final int method235(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field759[arg0].length;
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(IIII)I")
    public final int method236(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg3 << 8) + arg0;
        if (arg2 != 0) {
            field761 = 194;
        }
        for (int var6 = 0; var6 < this.field771.length; var6++) {
            if (this.field771[var6] == var5) {
                if (arg1 == 0) {
                    return this.field760[var6];
                }
                return this.field769[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "b", descriptor = "()LZUBZCVQN;")
    public final class72 method237() {
        class42 var1 = this.field772;
        class72 var2;
        synchronized (this.field772) {
            var2 = (class72) this.field772.method448();
        }
        if (var2 == null) {
            return null;
        }
        class62 var3 = this.field764;
        synchronized (this.field764) {
            var2.method352();
        }
        if (var2.field1737 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1737));
            while (true) {
                if (this.field740.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field740, var4, this.field740.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1737 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1737[var7] = this.field740[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(BIIZ)V")
    public final void method238(byte arg0, int arg1, int arg2, boolean arg3) {
        if (this.field753.field337[0] == null || this.field759[arg2][arg1] == 0) {
            return;
        }
        byte[] var5 = this.field753.field337[arg2 + 1].method420(arg1, (byte) 59);
        if (this.method242(var5, 0, this.field739[arg2][arg1], this.field759[arg2][arg1])) {
            return;
        }
        this.field765[arg2][arg1] = arg0;
        if (arg3) {
            this.field752 = -38;
        }
        if (arg0 > this.field750) {
            this.field750 = arg0;
        }
        this.field738++;
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "c", descriptor = "()I")
    public final int method239() {
        class62 var1 = this.field764;
        synchronized (this.field764) {
            return this.field764.method566();
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(II)V")
    public final void method240(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field759.length || arg1 < 0 || arg1 > this.field759[arg0].length || this.field759[arg0][arg1] == 0) {
            return;
        }
        class62 var3 = this.field764;
        synchronized (this.field764) {
            for (class72 var4 = (class72) this.field764.method564(); var4 != null; var4 = (class72) this.field764.method565(-582)) {
                if (var4.field1734 == arg0 && var4.field1735 == arg1) {
                    return;
                }
            }
            class72 var5 = new class72();
            var5.field1734 = arg0;
            var5.field1735 = arg1;
            var5.field1736 = true;
            class42 var6 = this.field766;
            synchronized (this.field766) {
                this.field766.method446(var5);
            }
            this.field764.method562(var5);
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "b", descriptor = "(IB)Z")
    public final boolean method241(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field771.length; var3++) {
            if (this.field769[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 70) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "([BIII)Z")
    private final boolean method242(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field737.reset();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field737.update(arg0, 0, var5);
        int var7 = (int) this.field737.getValue();
        if (arg3 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(I)V")
    public final void method243(int arg0) {
        this.method240(0, arg0);
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field768) {
                this.field749++;
                byte var1 = 20;
                if (this.field750 == 0 && this.field753.field337[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field758 = true;
                for (int var2 = 0; var2 < 100 && this.field758; var2++) {
                    this.field758 = false;
                    this.method244(this.field757);
                    this.method232(23925);
                    if (this.field762 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method226(1);
                    if (this.field780 != null) {
                        this.method230(true);
                    }
                }
                boolean var3 = false;
                for (class72 var4 = (class72) this.field779.method449(); var4 != null; var4 = (class72) this.field779.method451(-582)) {
                    if (var4.field1736) {
                        var3 = true;
                        var4.field1738++;
                        if (var4.field1738 > 50) {
                            var4.field1738 = 0;
                            this.method231(var4, false);
                        }
                    }
                }
                if (!var3) {
                    for (class72 var5 = (class72) this.field779.method449(); var5 != null; var5 = (class72) this.field779.method451(-582)) {
                        var3 = true;
                        var5.field1738++;
                        if (var5.field1738 > 50) {
                            var5.field1738 = 0;
                            this.method231(var5, false);
                        }
                    }
                }
                if (var3) {
                    this.field746++;
                    if (this.field746 > 750) {
                        try {
                            this.field742.close();
                        } catch (Exception var8) {
                        }
                        this.field742 = null;
                        this.field780 = null;
                        this.field744 = null;
                        this.field776 = 0;
                    }
                } else {
                    this.field746 = 0;
                    this.field778 = "";
                }
                if (this.field753.field318 && this.field742 != null && this.field744 != null && (this.field750 > 0 || this.field753.field337[0] == null)) {
                    this.field770++;
                    if (this.field770 > 500) {
                        this.field770 = 0;
                        this.field748[0] = 0;
                        this.field748[1] = 0;
                        this.field748[2] = 0;
                        this.field748[3] = 10;
                        try {
                            this.field744.write(this.field748, 0, 4);
                        } catch (IOException var7) {
                            this.field746 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "e", descriptor = "(I)V")
    private final void method244(int arg0) {
        class42 var2 = this.field766;
        class72 var3;
        synchronized (this.field766) {
            var3 = (class72) this.field766.method448();
        }
        if (arg0 != 3148) {
            this.field777 = !this.field777;
        }
        while (var3 != null) {
            this.field758 = true;
            byte[] var4 = null;
            if (this.field753.field337[0] != null) {
                var4 = this.field753.field337[var3.field1734 + 1].method420(var3.field1735, (byte) 59);
            }
            if (!this.method242(var4, 0, this.field739[var3.field1734][var3.field1735], this.field759[var3.field1734][var3.field1735])) {
                var4 = null;
            }
            class42 var5 = this.field766;
            synchronized (this.field766) {
                if (var4 == null) {
                    this.field755.method446(var3);
                } else {
                    var3.field1737 = var4;
                    class42 var6 = this.field772;
                    synchronized (this.field772) {
                        this.field772.method446(var3);
                    }
                }
                var3 = (class72) this.field766.method448();
            }
        }
    }

    @OriginalMember(owner = "client!EBLTOQBO", name = "a", descriptor = "(B)I")
    public final int method245(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field777 = !this.field777;
        }
        return this.field736.length;
    }
}
