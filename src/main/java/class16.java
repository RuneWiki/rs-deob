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

@OriginalClass("client!HJOZCGZH")
public class class16 extends class1 implements Runnable {

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "LCRZPTUPR;")
    private class7 field710 = new class7((byte) 1);

    @OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "Z")
    private boolean field711 = false;

    @OriginalMember(owner = "client!HJOZCGZH", name = "d", descriptor = "LJLOKOMHZ;")
    private class23 field713 = new class23(-46779);

    @OriginalMember(owner = "client!HJOZCGZH", name = "f", descriptor = "LCRZPTUPR;")
    private class7 field715 = new class7((byte) 1);

    @OriginalMember(owner = "client!HJOZCGZH", name = "g", descriptor = "[[I")
    private int[][] field716 = new int[4][];

    @OriginalMember(owner = "client!HJOZCGZH", name = "l", descriptor = "Z")
    private boolean field721 = true;

    @OriginalMember(owner = "client!HJOZCGZH", name = "m", descriptor = "Z")
    private boolean field722 = false;

    @OriginalMember(owner = "client!HJOZCGZH", name = "o", descriptor = "B")
    private byte field724 = 4;

    @OriginalMember(owner = "client!HJOZCGZH", name = "p", descriptor = "LCRZPTUPR;")
    private class7 field725 = new class7((byte) 1);

    @OriginalMember(owner = "client!HJOZCGZH", name = "r", descriptor = "Z")
    private boolean field727 = true;

    @OriginalMember(owner = "client!HJOZCGZH", name = "w", descriptor = "Ljava/lang/String;")
    public String field732 = "";

    @OriginalMember(owner = "client!HJOZCGZH", name = "z", descriptor = "[[B")
    private byte[][] field735 = new byte[4][];

    @OriginalMember(owner = "client!HJOZCGZH", name = "A", descriptor = "I")
    private int field736 = 203;

    @OriginalMember(owner = "client!HJOZCGZH", name = "B", descriptor = "LCRZPTUPR;")
    private class7 field737 = new class7((byte) 1);

    @OriginalMember(owner = "client!HJOZCGZH", name = "D", descriptor = "[B")
    private byte[] field739 = new byte[500];

    @OriginalMember(owner = "client!HJOZCGZH", name = "E", descriptor = "I")
    private int field740 = -535;

    @OriginalMember(owner = "client!HJOZCGZH", name = "H", descriptor = "Z")
    private boolean field743 = false;

    @OriginalMember(owner = "client!HJOZCGZH", name = "I", descriptor = "[B")
    private byte[] field744 = new byte[65000];

    @OriginalMember(owner = "client!HJOZCGZH", name = "K", descriptor = "I")
    private int field746 = 373;

    @OriginalMember(owner = "client!HJOZCGZH", name = "L", descriptor = "I")
    private int field747 = 222;

    @OriginalMember(owner = "client!HJOZCGZH", name = "M", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field748 = new CRC32();

    @OriginalMember(owner = "client!HJOZCGZH", name = "R", descriptor = "LCRZPTUPR;")
    private class7 field753 = new class7((byte) 1);

    @OriginalMember(owner = "client!HJOZCGZH", name = "S", descriptor = "[[I")
    private int[][] field754 = new int[4][];

    @OriginalMember(owner = "client!HJOZCGZH", name = "e", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!HJOZCGZH", name = "h", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!HJOZCGZH", name = "i", descriptor = "I")
    private int field718;

    @OriginalMember(owner = "client!HJOZCGZH", name = "k", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "client!HJOZCGZH", name = "s", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!HJOZCGZH", name = "t", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!HJOZCGZH", name = "u", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!HJOZCGZH", name = "v", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!HJOZCGZH", name = "x", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!HJOZCGZH", name = "C", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!HJOZCGZH", name = "N", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!HJOZCGZH", name = "j", descriptor = "J")
    private long field719;

    @OriginalMember(owner = "client!HJOZCGZH", name = "y", descriptor = "LVOTBAEIQ;")
    private class61 field734;

    @OriginalMember(owner = "client!HJOZCGZH", name = "Q", descriptor = "Lclient;")
    private client field752;

    @OriginalMember(owner = "client!HJOZCGZH", name = "P", descriptor = "Ljava/io/InputStream;")
    private InputStream field751;

    @OriginalMember(owner = "client!HJOZCGZH", name = "G", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field742;

    @OriginalMember(owner = "client!HJOZCGZH", name = "J", descriptor = "Ljava/net/Socket;")
    private Socket field745;

    @OriginalMember(owner = "client!HJOZCGZH", name = "U", descriptor = "[B")
    private byte[] field756;

    @OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "[I")
    private int[] field712;

    @OriginalMember(owner = "client!HJOZCGZH", name = "n", descriptor = "[I")
    private int[] field723;

    @OriginalMember(owner = "client!HJOZCGZH", name = "q", descriptor = "[I")
    private int[] field726;

    @OriginalMember(owner = "client!HJOZCGZH", name = "F", descriptor = "[I")
    private int[] field741;

    @OriginalMember(owner = "client!HJOZCGZH", name = "O", descriptor = "[I")
    private int[] field750;

    @OriginalMember(owner = "client!HJOZCGZH", name = "T", descriptor = "[I")
    private int[] field755;

    @OriginalMember(owner = "client!HJOZCGZH", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field727) {
                this.field749++;
                byte var1 = 20;
                if (this.field738 == 0 && this.field752.field467[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field711 = true;
                for (int var2 = 0; var2 < 100 && this.field711; var2++) {
                    this.field711 = false;
                    this.method219(false);
                    this.method217(true);
                    if (this.field728 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method216(true);
                    if (this.field751 != null) {
                        this.method204(0);
                    }
                }
                boolean var3 = false;
                for (class61 var4 = (class61) this.field715.method179(); var4 != null; var4 = (class61) this.field715.method181((byte) 2)) {
                    if (var4.field1541) {
                        var3 = true;
                        var4.field1539++;
                        if (var4.field1539 > 50) {
                            var4.field1539 = 0;
                            this.method215(var4, -535);
                        }
                    }
                }
                if (!var3) {
                    for (class61 var5 = (class61) this.field715.method179(); var5 != null; var5 = (class61) this.field715.method181((byte) 2)) {
                        var3 = true;
                        var5.field1539++;
                        if (var5.field1539 > 50) {
                            var5.field1539 = 0;
                            this.method215(var5, -535);
                        }
                    }
                }
                if (var3) {
                    this.field731++;
                    if (this.field731 > 750) {
                        try {
                            this.field745.close();
                        } catch (Exception var8) {
                        }
                        this.field745 = null;
                        this.field751 = null;
                        this.field742 = null;
                        this.field718 = 0;
                    }
                } else {
                    this.field731 = 0;
                    this.field732 = "";
                }
                if (this.field752.field344 && this.field745 != null && this.field742 != null && (this.field738 > 0 || this.field752.field467[0] == null)) {
                    this.field720++;
                    if (this.field720 > 500) {
                        this.field720 = 0;
                        this.field739[0] = 0;
                        this.field739[1] = 0;
                        this.field739[2] = 0;
                        this.field739[3] = 10;
                        try {
                            this.field742.write(this.field739, 0, 4);
                        } catch (IOException var7) {
                            this.field731 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(Z)V")
    public final void method200(boolean arg0) {
        class7 var2 = this.field725;
        synchronized (this.field725) {
            this.field725.method183();
        }
        if (!arg0) {
            this.field746 = 123;
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(IB)Z")
    public final boolean method201(int arg0, byte arg1) {
        if (arg1 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field723[arg0] == 1;
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "()V")
    public final void method202() {
        this.field727 = false;
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(III)V")
    public final void method203(int arg0, int arg1, int arg2) {
        if (this.field752.field467[0] == null || (this.field716[arg2][arg0] == 0 || (this.field735[arg2][arg0] == 0 || this.field738 == 0))) {
            return;
        }
        class61 var4 = new class61();
        var4.field1540 = arg2;
        var4.field1543 = arg0;
        var4.field1541 = false;
        class7 var5 = this.field725;
        synchronized (this.field725) {
            this.field725.method176(var4);
        }
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(I)V")
    public final void method1(int arg0) {
        this.method213(0, arg0);
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "(I)V")
    private final void method204(int arg0) {
        if (arg0 != 0) {
            this.field721 = !this.field721;
        }
        try {
            int var2 = this.field751.available();
            if (this.field718 == 0 && var2 >= 6) {
                this.field711 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field751.read(this.field739, var3, 6 - var3)) {
                }
                int var4 = this.field739[0] & 0xFF;
                int var5 = ((this.field739[1] & 0xFF) << 8) + (this.field739[2] & 0xFF);
                int var6 = ((this.field739[3] & 0xFF) << 8) + (this.field739[4] & 0xFF);
                int var7 = this.field739[5] & 0xFF;
                this.field734 = null;
                for (class61 var8 = (class61) this.field715.method179(); var8 != null; var8 = (class61) this.field715.method181((byte) 2)) {
                    if (var8.field1540 == var4 && var8.field1543 == var5) {
                        this.field734 = var8;
                    }
                    if (this.field734 != null) {
                        var8.field1539 = 0;
                    }
                }
                if (this.field734 != null) {
                    this.field731 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field734.field1542 = null;
                        if (this.field734.field1541) {
                            class7 var9 = this.field710;
                            synchronized (this.field710) {
                                this.field710.method176(this.field734);
                            }
                        } else {
                            this.field734.method272();
                        }
                        this.field734 = null;
                    } else {
                        if (this.field734.field1542 == null && var7 == 0) {
                            this.field734.field1542 = new byte[var6];
                        }
                        if (this.field734.field1542 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field717 = var7 * 500;
                this.field718 = 500;
                if (this.field718 > var6 - var7 * 500) {
                    this.field718 = var6 - var7 * 500;
                }
            }
            if (this.field718 > 0 && var2 >= this.field718) {
                this.field711 = true;
                byte[] var10 = this.field739;
                int var11 = 0;
                if (this.field734 != null) {
                    var10 = this.field734.field1542;
                    var11 = this.field717;
                }
                for (int var12 = 0; var12 < this.field718; var12 += this.field751.read(var10, var11 + var12, this.field718 - var12)) {
                }
                if (this.field718 + this.field717 >= var10.length && this.field734 != null) {
                    if (this.field752.field467[0] != null) {
                        this.field752.field467[this.field734.field1540 + 1].method528(var10.length, (byte) 74, var10, this.field734.field1543);
                    }
                    if (!this.field734.field1541 && this.field734.field1540 == 3) {
                        this.field734.field1541 = true;
                        this.field734.field1540 = 93;
                    }
                    if (this.field734.field1541) {
                        class7 var13 = this.field710;
                        synchronized (this.field710) {
                            this.field710.method176(this.field734);
                        }
                    } else {
                        this.field734.method272();
                    }
                }
                this.field718 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field745.close();
            } catch (Exception var15) {
            }
            this.field745 = null;
            this.field751 = null;
            this.field742 = null;
            this.field718 = 0;
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(II)Z")
    public final boolean method205(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field712.length; var3++) {
            if (this.field726[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "(II)I")
    public final int method206(int arg0, int arg1) {
        int var3 = 79 / arg1;
        return this.field716[arg0].length;
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(IIII)I")
    public final int method207(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 43127) {
            return this.field736;
        }
        int var5 = (arg1 << 8) + arg0;
        for (int var6 = 0; var6 < this.field712.length; var6++) {
            if (this.field712[var6] == var5) {
                if (arg2 == 0) {
                    return this.field755[var6];
                }
                return this.field726[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "(I)I")
    public final int method208(int arg0) {
        int var2 = 47 / arg0;
        return this.field741.length;
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(LSXKKBWPU;Lclient;)V")
    public final void method209(class50 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method442(var3[var4], null);
            int var27 = var26.length / 2;
            class53 var28 = new class53(var26, -631);
            this.field716[var4] = new int[var27];
            this.field735[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field716[var4][var29] = var28.method470();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method442(var5[var6], null);
            int var23 = var22.length / 4;
            class53 var24 = new class53(var22, -631);
            this.field754[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field754[var6][var25] = var24.method473();
            }
        }
        byte[] var7 = arg0.method442("model_index", null);
        int var8 = this.field716[0].length;
        this.field756 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field756[var9] = var7[var9];
            } else {
                this.field756[var9] = 0;
            }
        }
        byte[] var10 = arg0.method442("map_index", null);
        class53 var11 = new class53(var10, -631);
        int var12 = var10.length / 7;
        this.field712 = new int[var12];
        this.field755 = new int[var12];
        this.field726 = new int[var12];
        this.field750 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field712[var13] = var11.method470();
            this.field755[var13] = var11.method470();
            this.field726[var13] = var11.method470();
            this.field750[var13] = var11.method468();
        }
        byte[] var14 = arg0.method442("anim_index", null);
        class53 var15 = new class53(var14, -631);
        int var16 = var14.length / 2;
        this.field741 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field741[var17] = var15.method470();
        }
        byte[] var18 = arg0.method442("midi_index", null);
        class53 var19 = new class53(var18, -631);
        int var20 = var18.length;
        this.field723 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field723[var21] = var19.method468();
        }
        this.field752 = arg1;
        this.field727 = true;
        this.field752.method108(this, 2);
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "()I")
    public final int method210() {
        class23 var1 = this.field713;
        synchronized (this.field713) {
            return this.field713.method237();
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(BIII)V")
    public final void method211(byte arg0, int arg1, int arg2, int arg3) {
        if (this.field752.field467[0] == null || this.field716[arg3][arg1] == 0) {
            return;
        }
        byte[] var5 = this.field752.field467[arg3 + 1].method527(3, arg1);
        if (this.method212(var5, 3, this.field716[arg3][arg1], this.field754[arg3][arg1])) {
            return;
        }
        this.field735[arg3][arg1] = arg0;
        if (arg2 != 0) {
            this.field743 = !this.field743;
        }
        if (arg0 > this.field738) {
            this.field738 = arg0;
        }
        this.field733++;
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "([BIII)Z")
    private final boolean method212(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field748.reset();
        if (arg1 != 3) {
            this.field736 = 265;
        }
        this.field748.update(arg0, 0, var5);
        int var7 = (int) this.field748.getValue();
        if (arg2 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "(II)V")
    public final void method213(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field716.length || arg1 < 0 || arg1 > this.field716[arg0].length || this.field716[arg0][arg1] == 0) {
            return;
        }
        class23 var3 = this.field713;
        synchronized (this.field713) {
            for (class61 var4 = (class61) this.field713.method235(); var4 != null; var4 = (class61) this.field713.method236((byte) 2)) {
                if (var4.field1540 == arg0 && var4.field1543 == arg1) {
                    return;
                }
            }
            class61 var5 = new class61();
            var5.field1540 = arg0;
            var5.field1543 = arg1;
            var5.field1541 = true;
            class7 var6 = this.field737;
            synchronized (this.field737) {
                this.field737.method176(var5);
            }
            this.field713.method233(var5);
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "()LVOTBAEIQ;")
    public final class61 method214() {
        class7 var1 = this.field710;
        class61 var2;
        synchronized (this.field710) {
            var2 = (class61) this.field710.method178();
        }
        if (var2 == null) {
            return null;
        }
        class23 var3 = this.field713;
        synchronized (this.field713) {
            var2.method531();
        }
        if (var2.field1542 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1542));
            while (true) {
                if (this.field744.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field744, var4, this.field744.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1542 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1542[var7] = this.field744[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(LVOTBAEIQ;I)V")
    private final void method215(class61 arg0, int arg1) {
        while (arg1 >= 0) {
            this.field736 = -93;
        }
        try {
            if (this.field745 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field719 < 4000L) {
                    return;
                }
                this.field719 = var3;
                this.field745 = this.field752.method161(client.field492 + 43594);
                this.field751 = this.field745.getInputStream();
                this.field742 = this.field745.getOutputStream();
                this.field742.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field751.read();
                }
                this.field731 = 0;
            }
            this.field739[0] = (byte) arg0.field1540;
            this.field739[1] = (byte) (arg0.field1543 >> 8);
            this.field739[2] = (byte) arg0.field1543;
            if (arg0.field1541) {
                this.field739[3] = 2;
            } else if (this.field752.field344) {
                this.field739[3] = 0;
            } else {
                this.field739[3] = 1;
            }
            this.field742.write(this.field739, 0, 4);
            this.field720 = 0;
            this.field714 = -10000;
        } catch (IOException var8) {
            try {
                this.field745.close();
            } catch (Exception var7) {
            }
            this.field745 = null;
            this.field751 = null;
            this.field742 = null;
            this.field718 = 0;
            this.field714++;
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "b", descriptor = "(Z)V")
    private final void method216(boolean arg0) {
        if (!arg0) {
            this.field722 = !this.field722;
        }
        while (this.field728 == 0) {
            if (this.field729 >= 10 || this.field738 == 0) {
                return;
            }
            class7 var2 = this.field725;
            class61 var3;
            synchronized (this.field725) {
                var3 = (class61) this.field725.method178();
            }
            while (var3 != null) {
                if (this.field735[var3.field1540][var3.field1543] != 0) {
                    this.field735[var3.field1540][var3.field1543] = 0;
                    this.field715.method176(var3);
                    this.method215(var3, -535);
                    this.field711 = true;
                    if (this.field730 < this.field733) {
                        this.field730++;
                    }
                    this.field732 = "Loading extra files - " + this.field730 * 100 / this.field733 + "%";
                    this.field729++;
                    if (this.field729 == 10) {
                        return;
                    }
                }
                class7 var4 = this.field725;
                synchronized (this.field725) {
                    var3 = (class61) this.field725.method178();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field735[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field738) {
                        var6[var8] = 0;
                        class61 var9 = new class61();
                        var9.field1540 = var5;
                        var9.field1543 = var8;
                        var9.field1541 = false;
                        this.field715.method176(var9);
                        this.method215(var9, -535);
                        this.field711 = true;
                        if (this.field730 < this.field733) {
                            this.field730++;
                        }
                        this.field732 = "Loading extra files - " + this.field730 * 100 / this.field733 + "%";
                        this.field729++;
                        if (this.field729 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field738--;
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "c", descriptor = "(Z)V")
    private final void method217(boolean arg0) {
        this.field728 = 0;
        this.field729 = 0;
        class61 var2 = (class61) this.field715.method179();
        if (!arg0) {
            return;
        }
        while (var2 != null) {
            if (var2.field1541) {
                this.field728++;
            } else {
                this.field729++;
            }
            var2 = (class61) this.field715.method181((byte) 2);
        }
        while (this.field728 < 10) {
            class61 var3 = (class61) this.field753.method178();
            if (var3 == null) {
                break;
            }
            if (this.field735[var3.field1540][var3.field1543] != 0) {
                this.field730++;
            }
            this.field735[var3.field1540][var3.field1543] = 0;
            this.field715.method176(var3);
            this.field728++;
            this.method215(var3, -535);
            this.field711 = true;
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(BZ)V")
    public final void method218(byte arg0, boolean arg1) {
        if (arg0 != 4) {
            return;
        }
        boolean var3 = false;
        int var4 = this.field712.length;
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1 || this.field750[var5] != 0) {
                this.method211((byte) 2, this.field726[var5], 0, 3);
                this.method211((byte) 2, this.field755[var5], 0, 3);
            }
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "d", descriptor = "(Z)V")
    private final void method219(boolean arg0) {
        class7 var2 = this.field737;
        class61 var3;
        synchronized (this.field737) {
            var3 = (class61) this.field737.method178();
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (var3 != null) {
            this.field711 = true;
            byte[] var5 = null;
            if (this.field752.field467[0] != null) {
                var5 = this.field752.field467[var3.field1540 + 1].method527(3, var3.field1543);
            }
            if (!this.method212(var5, 3, this.field716[var3.field1540][var3.field1543], this.field754[var3.field1540][var3.field1543])) {
                var5 = null;
            }
            class7 var6 = this.field737;
            synchronized (this.field737) {
                if (var5 == null) {
                    this.field753.method176(var3);
                } else {
                    var3.field1542 = var5;
                    class7 var7 = this.field710;
                    synchronized (this.field710) {
                        this.field710.method176(var3);
                    }
                }
                var3 = (class61) this.field737.method178();
            }
        }
    }

    @OriginalMember(owner = "client!HJOZCGZH", name = "a", descriptor = "(BI)I")
    public final int method220(byte arg0, int arg1) {
        return this.field724 == arg0 ? this.field756[arg1] & 0xFF : 4;
    }
}
