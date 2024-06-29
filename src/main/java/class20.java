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

@OriginalClass("client!FOFQGQZJ")
public class class20 extends class21 implements Runnable {

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "[[I")
    private int[][] field783 = new int[4][];

    @OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "[B")
    private byte[] field784 = new byte[65000];

    @OriginalMember(owner = "client!FOFQGQZJ", name = "c", descriptor = "[[B")
    private byte[][] field785 = new byte[4][];

    @OriginalMember(owner = "client!FOFQGQZJ", name = "e", descriptor = "Ljava/lang/String;")
    public String field787 = "";

    @OriginalMember(owner = "client!FOFQGQZJ", name = "f", descriptor = "I")
    private int field788 = 5;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "i", descriptor = "Z")
    private boolean field791 = false;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "j", descriptor = "LSXQMCHPP;")
    private class56 field792 = new class56(5);

    @OriginalMember(owner = "client!FOFQGQZJ", name = "k", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field793 = new CRC32();

    @OriginalMember(owner = "client!FOFQGQZJ", name = "n", descriptor = "LSXQMCHPP;")
    private class56 field796 = new class56(5);

    @OriginalMember(owner = "client!FOFQGQZJ", name = "r", descriptor = "[B")
    private byte[] field800 = new byte[500];

    @OriginalMember(owner = "client!FOFQGQZJ", name = "u", descriptor = "I")
    private int field803 = 1;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "w", descriptor = "LLXCATFEF;")
    private class40 field805 = new class40(512);

    @OriginalMember(owner = "client!FOFQGQZJ", name = "A", descriptor = "Z")
    private boolean field809 = true;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "B", descriptor = "[[I")
    private int[][] field810 = new int[4][];

    @OriginalMember(owner = "client!FOFQGQZJ", name = "D", descriptor = "Z")
    private boolean field812 = false;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "F", descriptor = "LSXQMCHPP;")
    private class56 field814 = new class56(5);

    @OriginalMember(owner = "client!FOFQGQZJ", name = "H", descriptor = "LSXQMCHPP;")
    private class56 field816 = new class56(5);

    @OriginalMember(owner = "client!FOFQGQZJ", name = "L", descriptor = "LSXQMCHPP;")
    private class56 field820 = new class56(5);

    @OriginalMember(owner = "client!FOFQGQZJ", name = "P", descriptor = "Z")
    private boolean field824 = true;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "Q", descriptor = "B")
    private byte field825 = 114;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "d", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "s", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "t", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "v", descriptor = "I")
    private int field804;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "C", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "E", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "G", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "I", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "J", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "K", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "N", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "h", descriptor = "J")
    private long field790;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "M", descriptor = "LBJSSVIRC;")
    private class5 field821;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "m", descriptor = "Lclient;")
    private client field795;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "y", descriptor = "Ljava/io/InputStream;")
    private InputStream field807;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field808;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field794;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "g", descriptor = "[B")
    private byte[] field789;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "o", descriptor = "[I")
    private int[] field797;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "p", descriptor = "[I")
    private int[] field798;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "q", descriptor = "[I")
    private int[] field799;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "x", descriptor = "[I")
    private int[] field806;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "O", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "R", descriptor = "[I")
    private int[] field826;

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "()LBJSSVIRC;")
    public final class5 method204() {
        class56 var1 = this.field796;
        class5 var2;
        synchronized (this.field796) {
            var2 = (class5) this.field796.method508();
        }
        if (var2 == null) {
            return null;
        }
        class40 var3 = this.field805;
        synchronized (this.field805) {
            var2.method373();
        }
        if (var2.field92 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field92));
            while (true) {
                if (this.field784.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field784, var4, this.field784.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field92 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field92[var7] = this.field784[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "(I)V")
    private final void method205(int arg0) {
        if (arg0 < this.field788 || arg0 > this.field788) {
            return;
        }
        while (this.field818 == 0) {
            if (this.field819 >= 10 || this.field815 == 0) {
                return;
            }
            class56 var2 = this.field792;
            class5 var3;
            synchronized (this.field792) {
                var3 = (class5) this.field792.method508();
            }
            while (var3 != null) {
                if (this.field785[var3.field88][var3.field91] != 0) {
                    this.field785[var3.field88][var3.field91] = 0;
                    this.field820.method506(var3);
                    this.method218((byte) 114, var3);
                    this.field791 = true;
                    if (this.field804 < this.field811) {
                        this.field804++;
                    }
                    this.field787 = "Loading extra files - " + this.field804 * 100 / this.field811 + "%";
                    this.field819++;
                    if (this.field819 == 10) {
                        return;
                    }
                }
                class56 var4 = this.field792;
                synchronized (this.field792) {
                    var3 = (class5) this.field792.method508();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field785[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field815) {
                        var6[var8] = 0;
                        class5 var9 = new class5();
                        var9.field88 = var5;
                        var9.field91 = var8;
                        var9.field90 = false;
                        this.field820.method506(var9);
                        this.method218((byte) 114, var9);
                        this.field791 = true;
                        if (this.field804 < this.field811) {
                            this.field804++;
                        }
                        this.field787 = "Loading extra files - " + this.field804 * 100 / this.field811 + "%";
                        this.field819++;
                        if (this.field819 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field815--;
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(LJUPFHAZZ;Lclient;)V")
    public final void method206(class32 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method372(var3[var4], null);
            int var27 = var26.length / 2;
            class59 var28 = new class59(859, var26);
            this.field810[var4] = new int[var27];
            this.field785[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field810[var4][var29] = var28.method531();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method372(var5[var6], null);
            int var23 = var22.length / 4;
            class59 var24 = new class59(859, var22);
            this.field783[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field783[var6][var25] = var24.method534();
            }
        }
        byte[] var7 = arg0.method372("model_index", null);
        int var8 = this.field810[0].length;
        this.field789 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field789[var9] = var7[var9];
            } else {
                this.field789[var9] = 0;
            }
        }
        byte[] var10 = arg0.method372("map_index", null);
        class59 var11 = new class59(859, var10);
        int var12 = var10.length / 7;
        this.field806 = new int[var12];
        this.field826 = new int[var12];
        this.field798 = new int[var12];
        this.field823 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field806[var13] = var11.method531();
            this.field826[var13] = var11.method531();
            this.field798[var13] = var11.method531();
            this.field823[var13] = var11.method529();
        }
        byte[] var14 = arg0.method372("anim_index", null);
        class59 var15 = new class59(859, var14);
        int var16 = var14.length / 2;
        this.field799 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field799[var17] = var15.method531();
        }
        byte[] var18 = arg0.method372("midi_index", null);
        class59 var19 = new class59(859, var18);
        int var20 = var18.length;
        this.field797 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field797[var21] = var19.method529();
        }
        this.field795 = arg1;
        this.field809 = true;
        this.field795.method154(this, 2);
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "()I")
    public final int method207() {
        class40 var1 = this.field805;
        synchronized (this.field805) {
            return this.field805.method412();
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(II)V")
    public final void method208(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field810.length || arg1 < 0 || arg1 > this.field810[arg0].length || this.field810[arg0][arg1] == 0) {
            return;
        }
        class40 var3 = this.field805;
        synchronized (this.field805) {
            for (class5 var4 = (class5) this.field805.method410(); var4 != null; var4 = (class5) this.field805.method411(0)) {
                if (var4.field88 == arg0 && var4.field91 == arg1) {
                    return;
                }
            }
            class5 var5 = new class5();
            var5.field88 = arg0;
            var5.field91 = arg1;
            var5.field90 = true;
            class56 var6 = this.field816;
            synchronized (this.field816) {
                this.field816.method506(var5);
            }
            this.field805.method408(var5);
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "c", descriptor = "(I)I")
    public final int method209(int arg0) {
        return arg0 == 5 ? this.field799.length : 1;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "c", descriptor = "()V")
    public final void method210() {
        this.field809 = false;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(Z)V")
    private final void method211(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class56 var3 = this.field816;
        class5 var4;
        synchronized (this.field816) {
            var4 = (class5) this.field816.method508();
        }
        while (var4 != null) {
            this.field791 = true;
            byte[] var5 = null;
            if (this.field795.field218[0] != null) {
                var5 = this.field795.field218[var4.field88 + 1].method601(var4.field91, (byte) 4);
            }
            if (!this.method223(966, var5, this.field783[var4.field88][var4.field91], this.field810[var4.field88][var4.field91])) {
                var5 = null;
            }
            class56 var6 = this.field816;
            synchronized (this.field816) {
                if (var5 == null) {
                    this.field814.method506(var4);
                } else {
                    var4.field92 = var5;
                    class56 var7 = this.field796;
                    synchronized (this.field796) {
                        this.field796.method506(var4);
                    }
                }
                var4 = (class5) this.field816.method508();
            }
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "(II)I")
    public final int method212(int arg0, int arg1) {
        if (arg1 != 30468) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field789[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(BIZI)V")
    public final void method213(byte arg0, int arg1, boolean arg2, int arg3) {
        if (this.field795.field218[0] == null || this.field810[arg3][arg1] == 0) {
            return;
        }
        byte[] var5 = this.field795.field218[arg3 + 1].method601(arg1, (byte) 4);
        if (this.method223(966, var5, this.field783[arg3][arg1], this.field810[arg3][arg1])) {
            return;
        }
        this.field785[arg3][arg1] = arg0;
        if (!arg2) {
            this.field803 = -35;
        }
        if (arg0 > this.field815) {
            this.field815 = arg0;
        }
        this.field811++;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field809) {
                this.field822++;
                byte var1 = 20;
                if (this.field815 == 0 && this.field795.field218[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field791 = true;
                for (int var2 = 0; var2 < 100 && this.field791; var2++) {
                    this.field791 = false;
                    this.method211(true);
                    this.method214(40800);
                    if (this.field818 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method205(5);
                    if (this.field807 != null) {
                        this.method224(0);
                    }
                }
                boolean var3 = false;
                for (class5 var4 = (class5) this.field820.method509(); var4 != null; var4 = (class5) this.field820.method511(0)) {
                    if (var4.field90) {
                        var3 = true;
                        var4.field89++;
                        if (var4.field89 > 50) {
                            var4.field89 = 0;
                            this.method218((byte) 114, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class5 var5 = (class5) this.field820.method509(); var5 != null; var5 = (class5) this.field820.method511(0)) {
                        var3 = true;
                        var5.field89++;
                        if (var5.field89 > 50) {
                            var5.field89 = 0;
                            this.method218((byte) 114, var5);
                        }
                    }
                }
                if (var3) {
                    this.field817++;
                    if (this.field817 > 750) {
                        try {
                            this.field794.close();
                        } catch (Exception var8) {
                        }
                        this.field794 = null;
                        this.field807 = null;
                        this.field808 = null;
                        this.field802 = 0;
                    }
                } else {
                    this.field817 = 0;
                    this.field787 = "";
                }
                if (this.field795.field428 && this.field794 != null && this.field808 != null && (this.field815 > 0 || this.field795.field218[0] == null)) {
                    this.field786++;
                    if (this.field786 > 500) {
                        this.field786 = 0;
                        this.field800[0] = 0;
                        this.field800[1] = 0;
                        this.field800[2] = 0;
                        this.field800[3] = 10;
                        try {
                            this.field808.write(this.field800, 0, 4);
                        } catch (IOException var7) {
                            this.field817 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "d", descriptor = "(I)V")
    private final void method214(int arg0) {
        if (arg0 != 40800) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field818 = 0;
        this.field819 = 0;
        for (class5 var3 = (class5) this.field820.method509(); var3 != null; var3 = (class5) this.field820.method511(0)) {
            if (var3.field90) {
                this.field818++;
            } else {
                this.field819++;
            }
        }
        while (this.field818 < 10) {
            class5 var4 = (class5) this.field814.method508();
            if (var4 == null) {
                break;
            }
            if (this.field785[var4.field88][var4.field91] != 0) {
                this.field804++;
            }
            this.field785[var4.field88][var4.field91] = 0;
            this.field820.method506(var4);
            this.field818++;
            this.method218((byte) 114, var4);
            this.field791 = true;
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(III)V")
    public final void method215(int arg0, int arg1, int arg2) {
        if (this.field795.field218[0] == null || (this.field810[arg0][arg1] == 0 || (this.field785[arg0][arg1] == 0 || this.field815 == 0))) {
            return;
        }
        class5 var4 = new class5();
        var4.field88 = arg0;
        var4.field91 = arg1;
        var4.field90 = false;
        class56 var5 = this.field792;
        synchronized (this.field792) {
            this.field792.method506(var4);
        }
        int var6 = 26 / arg2;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(IZ)V")
    public final void method216(int arg0, boolean arg1) {
        int var3 = this.field806.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field823[var4] != 0) {
                this.method213((byte) 2, this.field798[var4], true, 3);
                this.method213((byte) 2, this.field826[var4], true, 3);
            }
        }
        if (arg0 != 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(IZII)I")
    public final int method217(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = (arg3 << 8) + arg2;
        for (int var6 = 0; var6 < this.field806.length; var6++) {
            if (this.field806[var6] == var5) {
                if (arg0 == 0) {
                    return this.field826[var6];
                }
                return this.field798[var6];
            }
        }
        return arg1 ? 3 : -1;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(BLBJSSVIRC;)V")
    private final void method218(byte arg0, class5 arg1) {
        if (this.field825 != arg0) {
            return;
        }
        try {
            if (this.field794 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field790 < 4000L) {
                    return;
                }
                this.field790 = var3;
                this.field794 = this.field795.method120(client.field542 + 43594);
                this.field807 = this.field794.getInputStream();
                this.field808 = this.field794.getOutputStream();
                this.field808.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field807.read();
                }
                this.field817 = 0;
            }
            this.field800[0] = (byte) arg1.field88;
            this.field800[1] = (byte) (arg1.field91 >> 8);
            this.field800[2] = (byte) arg1.field91;
            if (arg1.field90) {
                this.field800[3] = 2;
            } else if (this.field795.field428) {
                this.field800[3] = 0;
            } else {
                this.field800[3] = 1;
            }
            this.field808.write(this.field800, 0, 4);
            this.field786 = 0;
            this.field813 = -10000;
        } catch (IOException var8) {
            try {
                this.field794.close();
            } catch (Exception var7) {
            }
            this.field794 = null;
            this.field807 = null;
            this.field808 = null;
            this.field802 = 0;
            this.field813++;
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "c", descriptor = "(II)Z")
    public final boolean method219(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field806.length; var3++) {
            if (this.field798[var3] == arg0) {
                return true;
            }
        }
        if (arg1 <= 0) {
            this.field812 = !this.field812;
        }
        return false;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(B)V")
    public final void method220(byte arg0) {
        class56 var2 = this.field792;
        synchronized (this.field792) {
            this.field792.method513();
        }
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "d", descriptor = "(II)I")
    public final int method221(int arg0, int arg1) {
        return arg0 == 14917 ? this.field810[arg1].length : 0;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "(IZ)Z")
    public final boolean method222(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field797[arg0] == 1;
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(I[BII)Z")
    private final boolean method223(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        int var7 = 85 / arg0;
        this.field793.reset();
        this.field793.update(arg1, 0, var5);
        int var8 = (int) this.field793.getValue();
        if (arg3 == var6) {
            return arg2 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "e", descriptor = "(I)V")
    private final void method224(int arg0) {
        if (arg0 != 0) {
            this.field824 = !this.field824;
        }
        try {
            int var2 = this.field807.available();
            if (this.field802 == 0 && var2 >= 6) {
                this.field791 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field807.read(this.field800, var3, 6 - var3)) {
                }
                int var4 = this.field800[0] & 0xFF;
                int var5 = ((this.field800[1] & 0xFF) << 8) + (this.field800[2] & 0xFF);
                int var6 = ((this.field800[3] & 0xFF) << 8) + (this.field800[4] & 0xFF);
                int var7 = this.field800[5] & 0xFF;
                this.field821 = null;
                for (class5 var8 = (class5) this.field820.method509(); var8 != null; var8 = (class5) this.field820.method511(0)) {
                    if (var8.field88 == var4 && var8.field91 == var5) {
                        this.field821 = var8;
                    }
                    if (this.field821 != null) {
                        var8.field89 = 0;
                    }
                }
                if (this.field821 != null) {
                    this.field817 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field821.field92 = null;
                        if (this.field821.field90) {
                            class56 var9 = this.field796;
                            synchronized (this.field796) {
                                this.field796.method506(this.field821);
                            }
                        } else {
                            this.field821.method588();
                        }
                        this.field821 = null;
                    } else {
                        if (this.field821.field92 == null && var7 == 0) {
                            this.field821.field92 = new byte[var6];
                        }
                        if (this.field821.field92 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field801 = var7 * 500;
                this.field802 = 500;
                if (this.field802 > var6 - var7 * 500) {
                    this.field802 = var6 - var7 * 500;
                }
            }
            if (this.field802 > 0 && var2 >= this.field802) {
                this.field791 = true;
                byte[] var10 = this.field800;
                int var11 = 0;
                if (this.field821 != null) {
                    var10 = this.field821.field92;
                    var11 = this.field801;
                }
                for (int var12 = 0; var12 < this.field802; var12 += this.field807.read(var10, var11 + var12, this.field802 - var12)) {
                }
                if (this.field802 + this.field801 >= var10.length && this.field821 != null) {
                    if (this.field795.field218[0] != null) {
                        this.field795.field218[this.field821.field88 + 1].method602(var10, var10.length, this.field821.field91, true);
                    }
                    if (!this.field821.field90 && this.field821.field88 == 3) {
                        this.field821.field90 = true;
                        this.field821.field88 = 93;
                    }
                    if (this.field821.field90) {
                        class56 var13 = this.field796;
                        synchronized (this.field796) {
                            this.field796.method506(this.field821);
                        }
                    } else {
                        this.field821.method588();
                    }
                }
                this.field802 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field794.close();
            } catch (Exception var15) {
            }
            this.field794 = null;
            this.field807 = null;
            this.field808 = null;
            this.field802 = 0;
        }
    }

    @OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(I)V")
    public final void method225(int arg0) {
        this.method208(0, arg0);
    }
}
