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

@OriginalClass("client!HKGQPBYJ")
public class class21 extends class20 implements Runnable {

    @OriginalMember(owner = "client!HKGQPBYJ", name = "f", descriptor = "[B")
    private byte[] field836 = new byte[500];

    @OriginalMember(owner = "client!HKGQPBYJ", name = "g", descriptor = "Z")
    private boolean field837 = false;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "h", descriptor = "[B")
    private byte[] field838 = new byte[65000];

    @OriginalMember(owner = "client!HKGQPBYJ", name = "i", descriptor = "LWAPMJSJO;")
    private class61 field839 = new class61(field865);

    @OriginalMember(owner = "client!HKGQPBYJ", name = "m", descriptor = "Z")
    private boolean field843 = true;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "p", descriptor = "Z")
    private boolean field846 = false;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "r", descriptor = "I")
    private int field848 = 891;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "s", descriptor = "LWAPMJSJO;")
    private class61 field849 = new class61(field865);

    @OriginalMember(owner = "client!HKGQPBYJ", name = "w", descriptor = "[[I")
    private int[][] field853 = new int[4][];

    @OriginalMember(owner = "client!HKGQPBYJ", name = "A", descriptor = "I")
    private int field857 = -529;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "D", descriptor = "LWAPMJSJO;")
    private class61 field860 = new class61(field865);

    @OriginalMember(owner = "client!HKGQPBYJ", name = "E", descriptor = "LWAPMJSJO;")
    private class61 field861 = new class61(field865);

    @OriginalMember(owner = "client!HKGQPBYJ", name = "K", descriptor = "[[B")
    private byte[][] field867 = new byte[4][];

    @OriginalMember(owner = "client!HKGQPBYJ", name = "L", descriptor = "I")
    private int field868 = 965;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "N", descriptor = "Ljava/lang/String;")
    public String field870 = "";

    @OriginalMember(owner = "client!HKGQPBYJ", name = "O", descriptor = "Z")
    private boolean field871 = true;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "P", descriptor = "[[I")
    private int[][] field872 = new int[4][];

    @OriginalMember(owner = "client!HKGQPBYJ", name = "Q", descriptor = "Z")
    private boolean field873 = true;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "R", descriptor = "LEDMDOBNM;")
    private class10 field874 = new class10(0);

    @OriginalMember(owner = "client!HKGQPBYJ", name = "T", descriptor = "LWAPMJSJO;")
    private class61 field876 = new class61(field865);

    @OriginalMember(owner = "client!HKGQPBYJ", name = "U", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field877 = new CRC32();

    @OriginalMember(owner = "client!HKGQPBYJ", name = "W", descriptor = "Z")
    private boolean field879 = true;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "I", descriptor = "B")
    private static byte field865 = -126;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "c", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "d", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "e", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "l", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "t", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "u", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "v", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "y", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "z", descriptor = "I")
    private int field856;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "C", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "H", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "S", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "B", descriptor = "J")
    private long field858;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "b", descriptor = "LLVCMGOBA;")
    private class34 field832;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "J", descriptor = "Lclient;")
    private client field866;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field845;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field841;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field844;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "V", descriptor = "[B")
    private byte[] field878;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "j", descriptor = "[I")
    private int[] field840;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "q", descriptor = "[I")
    private int[] field847;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "x", descriptor = "[I")
    private int[] field854;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "F", descriptor = "[I")
    private int[] field862;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "G", descriptor = "[I")
    private int[] field863;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "M", descriptor = "[I")
    private int[] field869;

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(II)I")
    public final int method293(int arg0, int arg1) {
        return arg0 == 0 ? this.field872[arg1].length : 4;
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(ZI)V")
    public final void method294(boolean arg0, int arg1) {
        if (arg1 != 27878) {
            this.field879 = !this.field879;
        }
        int var3 = this.field847.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field854[var4] != 0) {
                this.method306(this.field862[var4], 3, (byte) 2, false);
                this.method306(this.field869[var4], 3, (byte) 2, false);
            }
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "b", descriptor = "(II)I")
    public final int method295(int arg0, int arg1) {
        if (arg1 != -32251) {
            this.field879 = !this.field879;
        }
        return this.field878[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(III)V")
    public final void method296(int arg0, int arg1, int arg2) {
        if (this.field866.field306[0] == null || (this.field872[arg0][arg1] == 0 || (this.field867[arg0][arg1] == 0 || this.field875 == 0))) {
            return;
        }
        class34 var4 = new class34();
        if (arg2 <= 0) {
            this.field871 = !this.field871;
        }
        var4.field962 = arg0;
        var4.field965 = arg1;
        var4.field961 = false;
        class61 var5 = this.field860;
        synchronized (this.field860) {
            this.field860.method482(var4);
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "()I")
    public final int method297() {
        class10 var1 = this.field874;
        synchronized (this.field874) {
            return this.field874.method197();
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(IIII)I")
    public final int method298(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -45861) {
            return 3;
        }
        int var5 = (arg1 << 8) + arg3;
        for (int var6 = 0; var6 < this.field847.length; var6++) {
            if (this.field847[var6] == var5) {
                if (arg2 == 0) {
                    return this.field869[var6];
                }
                return this.field862[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "c", descriptor = "(II)Z")
    public final boolean method299(int arg0, int arg1) {
        if (arg1 != 9) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field840[arg0] == 1;
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(Z)V")
    private final void method300(boolean arg0) {
        if (!arg0) {
            return;
        }
        try {
            int var2 = this.field845.available();
            if (this.field852 == 0 && var2 >= 6) {
                this.field837 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field845.read(this.field836, var3, 6 - var3)) {
                }
                int var4 = this.field836[0] & 0xFF;
                int var5 = ((this.field836[1] & 0xFF) << 8) + (this.field836[2] & 0xFF);
                int var6 = ((this.field836[3] & 0xFF) << 8) + (this.field836[4] & 0xFF);
                int var7 = this.field836[5] & 0xFF;
                this.field832 = null;
                for (class34 var8 = (class34) this.field849.method485(); var8 != null; var8 = (class34) this.field849.method487(6)) {
                    if (var8.field962 == var4 && var8.field965 == var5) {
                        this.field832 = var8;
                    }
                    if (this.field832 != null) {
                        var8.field964 = 0;
                    }
                }
                if (this.field832 != null) {
                    this.field859 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field832.field963 = null;
                        if (this.field832.field961) {
                            class61 var9 = this.field876;
                            synchronized (this.field876) {
                                this.field876.method482(this.field832);
                            }
                        } else {
                            this.field832.method327();
                        }
                        this.field832 = null;
                    } else {
                        if (this.field832.field963 == null && var7 == 0) {
                            this.field832.field963 = new byte[var6];
                        }
                        if (this.field832.field963 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field851 = var7 * 500;
                this.field852 = 500;
                if (this.field852 > var6 - var7 * 500) {
                    this.field852 = var6 - var7 * 500;
                }
            }
            if (this.field852 > 0 && var2 >= this.field852) {
                this.field837 = true;
                byte[] var10 = this.field836;
                int var11 = 0;
                if (this.field832 != null) {
                    var10 = this.field832.field963;
                    var11 = this.field851;
                }
                for (int var12 = 0; var12 < this.field852; var12 += this.field845.read(var10, var11 + var12, this.field852 - var12)) {
                }
                if (this.field852 + this.field851 >= var10.length && this.field832 != null) {
                    if (this.field866.field306[0] != null) {
                        this.field866.field306[this.field832.field962 + 1].method431(var10, (byte) 5, var10.length, this.field832.field965);
                    }
                    if (!this.field832.field961 && this.field832.field962 == 3) {
                        this.field832.field961 = true;
                        this.field832.field962 = 93;
                    }
                    if (this.field832.field961) {
                        class61 var13 = this.field876;
                        synchronized (this.field876) {
                            this.field876.method482(this.field832);
                        }
                    } else {
                        this.field832.method327();
                    }
                }
                this.field852 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field844.close();
            } catch (Exception var15) {
            }
            this.field844 = null;
            this.field845 = null;
            this.field841 = null;
            this.field852 = 0;
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(LRPFMUSNN;Lclient;)V")
    public final void method301(class49 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method414(var3[var4], null);
            int var27 = var26.length / 2;
            class63 var28 = new class63((byte) -58, var26);
            this.field872[var4] = new int[var27];
            this.field867[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field872[var4][var29] = var28.method504();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method414(var5[var6], null);
            int var23 = var22.length / 4;
            class63 var24 = new class63((byte) -58, var22);
            this.field853[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field853[var6][var25] = var24.method507();
            }
        }
        byte[] var7 = arg0.method414("model_index", null);
        int var8 = this.field872[0].length;
        this.field878 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field878[var9] = var7[var9];
            } else {
                this.field878[var9] = 0;
            }
        }
        byte[] var10 = arg0.method414("map_index", null);
        class63 var11 = new class63((byte) -58, var10);
        int var12 = var10.length / 7;
        this.field847 = new int[var12];
        this.field869 = new int[var12];
        this.field862 = new int[var12];
        this.field854 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field847[var13] = var11.method504();
            this.field869[var13] = var11.method504();
            this.field862[var13] = var11.method504();
            this.field854[var13] = var11.method502();
        }
        byte[] var14 = arg0.method414("anim_index", null);
        class63 var15 = new class63((byte) -58, var14);
        int var16 = var14.length / 2;
        this.field863 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field863[var17] = var15.method504();
        }
        byte[] var18 = arg0.method414("midi_index", null);
        class63 var19 = new class63((byte) -58, var18);
        int var20 = var18.length;
        this.field840 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field840[var21] = var19.method502();
        }
        this.field866 = arg1;
        this.field843 = true;
        this.field866.method31(this, 2);
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field843) {
                this.field842++;
                byte var1 = 20;
                if (this.field875 == 0 && this.field866.field306[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field837 = true;
                for (int var2 = 0; var2 < 100 && this.field837; var2++) {
                    this.field837 = false;
                    this.method303(this.field864);
                    this.method307(-756);
                    if (this.field855 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method304(0);
                    if (this.field845 != null) {
                        this.method300(this.field873);
                    }
                }
                boolean var3 = false;
                for (class34 var4 = (class34) this.field849.method485(); var4 != null; var4 = (class34) this.field849.method487(6)) {
                    if (var4.field961) {
                        var3 = true;
                        var4.field964++;
                        if (var4.field964 > 50) {
                            var4.field964 = 0;
                            this.method305(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (class34 var5 = (class34) this.field849.method485(); var5 != null; var5 = (class34) this.field849.method487(6)) {
                        var3 = true;
                        var5.field964++;
                        if (var5.field964 > 50) {
                            var5.field964 = 0;
                            this.method305(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field859++;
                    if (this.field859 > 750) {
                        try {
                            this.field844.close();
                        } catch (Exception var8) {
                        }
                        this.field844 = null;
                        this.field845 = null;
                        this.field841 = null;
                        this.field852 = 0;
                    }
                } else {
                    this.field859 = 0;
                    this.field870 = "";
                }
                if (this.field866.field175 && this.field844 != null && this.field841 != null && (this.field875 > 0 || this.field866.field306[0] == null)) {
                    this.field833++;
                    if (this.field833 > 500) {
                        this.field833 = 0;
                        this.field836[0] = 0;
                        this.field836[1] = 0;
                        this.field836[2] = 0;
                        this.field836[3] = 10;
                        try {
                            this.field841.write(this.field836, 0, 4);
                        } catch (IOException var7) {
                            this.field859 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(IB)Z")
    public final boolean method302(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field847.length; var3++) {
            if (this.field862[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        return false;
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "b", descriptor = "(I)V")
    private final void method303(int arg0) {
        if (arg0 != 0) {
            this.field857 = 56;
        }
        class61 var2 = this.field861;
        class34 var3;
        synchronized (this.field861) {
            var3 = (class34) this.field861.method484();
        }
        while (var3 != null) {
            this.field837 = true;
            byte[] var4 = null;
            if (this.field866.field306[0] != null) {
                var4 = this.field866.field306[var3.field962 + 1].method430(-934, var3.field965);
            }
            if (!this.method313(this.field853[var3.field962][var3.field965], var4, this.field872[var3.field962][var3.field965], this.field848)) {
                var4 = null;
            }
            class61 var5 = this.field861;
            synchronized (this.field861) {
                if (var4 == null) {
                    this.field839.method482(var3);
                } else {
                    var3.field963 = var4;
                    class61 var6 = this.field876;
                    synchronized (this.field876) {
                        this.field876.method482(var3);
                    }
                }
                var3 = (class34) this.field861.method484();
            }
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "c", descriptor = "(I)V")
    private final void method304(int arg0) {
        if (arg0 != 0) {
            this.field848 = -97;
        }
        while (this.field855 == 0) {
            if (this.field856 >= 10 || this.field875 == 0) {
                return;
            }
            class61 var2 = this.field860;
            class34 var3;
            synchronized (this.field860) {
                var3 = (class34) this.field860.method484();
            }
            while (var3 != null) {
                if (this.field867[var3.field962][var3.field965] != 0) {
                    this.field867[var3.field962][var3.field965] = 0;
                    this.field849.method482(var3);
                    this.method305(var3, true);
                    this.field837 = true;
                    if (this.field834 < this.field835) {
                        this.field834++;
                    }
                    this.field870 = "Loading extra files - " + this.field834 * 100 / this.field835 + "%";
                    this.field856++;
                    if (this.field856 == 10) {
                        return;
                    }
                }
                class61 var4 = this.field860;
                synchronized (this.field860) {
                    var3 = (class34) this.field860.method484();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field867[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field875) {
                        var6[var8] = 0;
                        class34 var9 = new class34();
                        var9.field962 = var5;
                        var9.field965 = var8;
                        var9.field961 = false;
                        this.field849.method482(var9);
                        this.method305(var9, true);
                        this.field837 = true;
                        if (this.field834 < this.field835) {
                            this.field834++;
                        }
                        this.field870 = "Loading extra files - " + this.field834 * 100 / this.field835 + "%";
                        this.field856++;
                        if (this.field856 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field875--;
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(LLVCMGOBA;Z)V")
    private final void method305(class34 arg0, boolean arg1) {
        if (!arg1) {
            this.field857 = -2;
        }
        try {
            if (this.field844 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field858 < 4000L) {
                    return;
                }
                this.field858 = var3;
                this.field844 = this.field866.method63(client.field147 + 43594);
                this.field845 = this.field844.getInputStream();
                this.field841 = this.field844.getOutputStream();
                this.field841.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field845.read();
                }
                this.field859 = 0;
            }
            this.field836[0] = (byte) arg0.field962;
            this.field836[1] = (byte) (arg0.field965 >> 8);
            this.field836[2] = (byte) arg0.field965;
            if (arg0.field961) {
                this.field836[3] = 2;
            } else if (this.field866.field175) {
                this.field836[3] = 0;
            } else {
                this.field836[3] = 1;
            }
            this.field841.write(this.field836, 0, 4);
            this.field833 = 0;
            this.field850 = -10000;
        } catch (IOException var8) {
            try {
                this.field844.close();
            } catch (Exception var7) {
            }
            this.field844 = null;
            this.field845 = null;
            this.field841 = null;
            this.field852 = 0;
            this.field850++;
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(IIBZ)V")
    public final void method306(int arg0, int arg1, byte arg2, boolean arg3) {
        if (this.field866.field306[0] == null || this.field872[arg1][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field866.field306[arg1 + 1].method430(-934, arg0);
        if (this.method313(this.field853[arg1][arg0], var5, this.field872[arg1][arg0], this.field848)) {
            return;
        }
        this.field867[arg1][arg0] = arg2;
        if (!arg3) {
            if (arg2 > this.field875) {
                this.field875 = arg2;
            }
            this.field835++;
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "d", descriptor = "(I)V")
    private final void method307(int arg0) {
        while (arg0 >= 0) {
            this.field846 = !this.field846;
        }
        this.field855 = 0;
        this.field856 = 0;
        for (class34 var2 = (class34) this.field849.method485(); var2 != null; var2 = (class34) this.field849.method487(6)) {
            if (var2.field961) {
                this.field855++;
            } else {
                this.field856++;
            }
        }
        while (this.field855 < 10) {
            class34 var3 = (class34) this.field839.method484();
            if (var3 == null) {
                break;
            }
            if (this.field867[var3.field962][var3.field965] != 0) {
                this.field834++;
            }
            this.field867[var3.field962][var3.field965] = 0;
            this.field849.method482(var3);
            this.field855++;
            this.method305(var3, true);
            this.field837 = true;
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "b", descriptor = "()V")
    public final void method308() {
        this.field843 = false;
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "d", descriptor = "(II)V")
    public final void method309(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field872.length || arg1 < 0 || arg1 > this.field872[arg0].length || this.field872[arg0][arg1] == 0) {
            return;
        }
        class10 var3 = this.field874;
        synchronized (this.field874) {
            for (class34 var4 = (class34) this.field874.method195(); var4 != null; var4 = (class34) this.field874.method196(6)) {
                if (var4.field962 == arg0 && var4.field965 == arg1) {
                    return;
                }
            }
            class34 var5 = new class34();
            var5.field962 = arg0;
            var5.field965 = arg1;
            var5.field961 = true;
            class61 var6 = this.field861;
            synchronized (this.field861) {
                this.field861.method482(var5);
            }
            this.field874.method193(var5);
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(B)V")
    public final void method310(byte arg0) {
        if (arg0 == 34) {
            class61 var2 = this.field860;
            synchronized (this.field860) {
                this.field860.method489();
            }
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "e", descriptor = "(I)I")
    public final int method311(int arg0) {
        if (arg0 != -48454) {
            this.field857 = -424;
        }
        return this.field863.length;
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "c", descriptor = "()LLVCMGOBA;")
    public final class34 method312() {
        class61 var1 = this.field876;
        class34 var2;
        synchronized (this.field876) {
            var2 = (class34) this.field876.method484();
        }
        if (var2 == null) {
            return null;
        }
        class10 var3 = this.field874;
        synchronized (this.field874) {
            var2.method380();
        }
        if (var2.field963 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field963));
            while (true) {
                if (this.field838.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field838, var4, this.field838.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field963 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field963[var7] = this.field838[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(I[BII)Z")
    private final boolean method313(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        if (arg3 <= 0) {
            this.field868 = 218;
        }
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field877.reset();
        this.field877.update(arg1, 0, var5);
        int var7 = (int) this.field877.getValue();
        if (arg2 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!HKGQPBYJ", name = "a", descriptor = "(I)V")
    public final void method292(int arg0) {
        this.method309(0, arg0);
    }
}
