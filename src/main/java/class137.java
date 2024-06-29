import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Z")
    private boolean field3343 = false;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    private int field3350 = 0;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Z")
    private boolean field3339 = false;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    private int field3365 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lra;")
    private class102 field3336;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/net/Socket;")
    private Socket field3335;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "Ljava/io/InputStream;")
    private InputStream field3360;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3342;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3337 = 0;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lgd;")
    public static class40 field3341 = class14.method90(false, "::noclip");

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lgd;")
    public static class40 field3345 = class14.method90(false, "hitmarks");

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lgd;")
    public static class40 field3348 = class14.method90(false, "backtop1");

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lgd;")
    public static class40 field3353 = class14.method90(false, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3344 = 0;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field3362 = -1;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Lgd;")
    private static class40 field3363 = class14.method90(false, "Connection timed out)3");

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Lgd;")
    public static class40 field3357 = class14.method90(false, "Hier klicken)1 um fortzufahren)3)3)3");

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lgd;")
    public static class40 field3355 = class14.method90(false, "Titelbild geladen)3");

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lgd;")
    public static class40 field3340 = class14.method90(false, "overlay_multiway");

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Lgd;")
    public static class40 field3364 = field3363;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lu;")
    private class123 field3338;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "[B")
    private byte[] field3358;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1079(boolean arg0) {
        field3361++;
        if (this.field3339) {
            return;
        }
        synchronized (this) {
            this.field3339 = arg0;
            this.notifyAll();
        }
        if (this.field3338 != null) {
            while (this.field3338.field2885 == 0) {
                class51.method400((byte) 125, 1L);
            }
            if (this.field3338.field2885 == 1) {
                try {
                    ((Thread) this.field3338.field2887).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3338 = null;
    }

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V", line = 37)
    public final void run() {
        field3349++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3365 == this.field3350) {
                        if (this.field3339) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3365 >= this.field3350) {
                        var2 = this.field3365 - this.field3350;
                    } else {
                        var2 = 5000 - this.field3350;
                    }
                    var3 = this.field3350;
                }
                if (var2 > 0) {
                    try {
                        this.field3342.write(this.field3358, var3, var2);
                    } catch (IOException var9) {
                        this.field3343 = true;
                    }
                    this.field3350 = (this.field3350 + var2) % 5000;
                    try {
                        if (this.field3365 == this.field3350) {
                            this.field3342.flush();
                        }
                    } catch (IOException var8) {
                        this.field3343 = true;
                    }
                }
            }
            try {
                if (this.field3360 != null) {
                    this.field3360.close();
                }
                if (this.field3342 != null) {
                    this.field3342.close();
                }
                if (this.field3335 != null) {
                    this.field3335.close();
                }
            } catch (IOException var7) {
            }
            this.field3358 = null;
        } catch (Exception var12) {
            class50.method392(94, null, var12);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lrb;Ljava/awt/Component;ILrb;)V", line = 107)
    public static final void method1080(class103 arg0, Component arg1, int arg2, class103 arg3) {
        field3352++;
        if (class96.field2244) {
            return;
        }
        class115.field2774 = class136.method1072(120, 128, arg1, 265);
        class27.method162();
        class1.field25 = class136.method1072(120, 128, arg1, 265);
        class27.method162();
        class22.field499 = class136.method1072(120, 509, arg1, 171);
        class27.method162();
        class118.field2802 = class136.method1072(120, 360, arg1, 132);
        class27.method162();
        client.field468 = class136.method1072(arg2 + 120, 360, arg1, 200);
        class27.method162();
        class54.field1383 = class136.method1072(120, 202, arg1, 238);
        class27.method162();
        class131.field3187 = class136.method1072(120, 203, arg1, 238);
        class27.method162();
        class92.field2111 = class136.method1072(arg2 ^ 0x78, 74, arg1, 94);
        class27.method162();
        class112.field2695 = class136.method1072(120, 75, arg1, 94);
        class27.method162();
        byte[] var4 = arg0.method743(arg2 + 105, class92.field2101, class131.field3167);
        class46 var5 = new class46(var4, arg1);
        class115.field2774.method561((byte) -74);
        var5.method337(0, 0);
        class1.field25.method561((byte) -74);
        var5.method337(-637, 0);
        class22.field499.method561((byte) -74);
        var5.method337(-128, 0);
        class118.field2802.method561((byte) -74);
        var5.method337(-202, -371);
        client.field468.method561((byte) -74);
        var5.method337(-202, -171);
        class54.field1383.method561((byte) -74);
        var5.method337(0, -265);
        class131.field3187.method561((byte) -74);
        var5.method337(-562, -265);
        class92.field2111.method561((byte) -74);
        var5.method337(-128, -171);
        class112.field2695.method561((byte) -74);
        var5.method337(-562, -171);
        int[] var6 = new int[var5.field1169];
        for (int var7 = arg2; var7 < var5.field1164; var7++) {
            for (int var23 = 0; var23 < var5.field1169; var23++) {
                var6[var23] = var5.field1167[var5.field1169 + var5.field1169 * var7 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field1169; var24++) {
                var5.field1167[var5.field1169 * var7 + var24] = var6[var24];
            }
        }
        class115.field2774.method561((byte) -74);
        var5.method337(382, 0);
        class1.field25.method561((byte) -74);
        var5.method337(-255, 0);
        class22.field499.method561((byte) -74);
        var5.method337(254, 0);
        class118.field2802.method561((byte) -74);
        var5.method337(180, -371);
        client.field468.method561((byte) -74);
        var5.method337(180, -171);
        class54.field1383.method561((byte) -74);
        var5.method337(382, -265);
        class131.field3187.method561((byte) -74);
        var5.method337(-180, -265);
        class92.field2111.method561((byte) -74);
        var5.method337(254, -171);
        class112.field2695.method561((byte) -74);
        var5.method337(-180, -171);
        class46 var8 = class128.method1008(19398914, class92.field2101, class77.field1776, arg3);
        class22.field499.method561((byte) -74);
        var8.method342(382 - var8.field1169 / 2 - 128, 18);
        class135.field3312 = class86.method565(arg3, 0, class92.field2101, class29.field628);
        class22.field492 = class86.method565(arg3, 0, class92.field2101, class34.field873);
        class12.field309 = class59.method442(class92.field2101, arg2, arg3, class38.field935);
        class63.field1548 = new class46(128, 265);
        class8.field210 = new class46(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class63.field1548.field1167[var9] = class115.field2774.field1925[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class8.field210.field1167[var10] = class1.field25.field1925[var10];
        }
        class55.field1407 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class55.field1407[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class55.field1407[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class55.field1407[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class55.field1407[var14 + 192] = 16777215;
        }
        class8.field219 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class8.field219[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class8.field219[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class8.field219[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class8.field219[var18 + 192] = 16777215;
        }
        class114.field2756 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class114.field2756[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class114.field2756[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class114.field2756[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class114.field2756[var22 + 192] = 16777215;
        }
        class63.field1550 = new int[256];
        class31.field778 = new int[32768];
        class4.field120 = new int[32768];
        class29.method184(null, 32069);
        class92.field2097 = class92.field2101;
        class53.field1356 = new int[32768];
        class92.field2117 = class92.field2101;
        class79.field1808 = 0;
        class79.field1809 = new int[32768];
        if (class16.field418 == 0 || class8.field209) {
            class94.method634((byte) 125, 10);
        } else {
            class94.method641(0, 1, class16.field418, false, 10, class92.field2101, class50.field1282, class125.field2972);
        }
        class110.method858(1, false);
        class64.field1571 = true;
        class96.field2244 = true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BIII)V", line = 342)
    public final void method1081(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3356++;
        if (arg1 < 97) {
            method1083(-107);
        }
        if (this.field3339) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3360.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/net/Socket;Lra;)V", line = 514)
    public class137(Socket arg0, class102 arg1) throws IOException {
        this.field3336 = arg1;
        this.field3335 = arg0;
        this.field3335.setSoTimeout(30000);
        this.field3335.setTcpNoDelay(true);
        this.field3360 = this.field3335.getInputStream();
        this.field3342 = this.field3335.getOutputStream();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lvd;", line = 374)
    public static final class130 method1082(int arg0, int arg1) {
        field3351++;
        class130 var2 = (class130) class38.field934.method39(-113, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class52.field1326.method731(arg1, 3, (byte) -106);
        class130 var4 = new class130();
        if (var3 != null) {
            var4.method1024(arg0 - 348, new class104(var3));
        }
        class38.field934.method38(var4, (long) arg1, true);
        return arg0 == 254 ? var4 : null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 412)
    public static void method1083(int arg0) {
        field3357 = null;
        field3363 = null;
        field3340 = null;
        field3348 = null;
        field3364 = null;
        field3345 = null;
        if (arg0 == 382) {
            field3355 = null;
            field3353 = null;
            field3341 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V", line = 444)
    protected final void finalize() {
        this.method1079(true);
        field3354++;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I", line = 458)
    public final int method1084(int arg0) throws IOException {
        int var2 = 101 % ((48 - arg0) / 42);
        field3346++;
        return this.field3339 ? 0 : this.field3360.read();
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)I", line = 487)
    public final int method1085(int arg0) throws IOException {
        field3347++;
        if (this.field3339) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method1079(true);
            }
            return this.field3360.available();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BIB)V", line = 527)
    public final void method1086(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field3359++;
        if (this.field3339) {
            return;
        }
        if (this.field3343) {
            this.field3343 = false;
            throw new IOException();
        }
        if (this.field3358 == null) {
            this.field3358 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3358[this.field3365] = arg1[arg0 + var6];
                this.field3365 = (this.field3365 + 1) % 5000;
                if ((this.field3350 + 4900) % 5000 == this.field3365) {
                    throw new IOException();
                }
            }
            int var7 = -55 / ((arg3 - 43) / 58);
            if (this.field3338 == null) {
                this.field3338 = this.field3336.method725((byte) -125, 3, this);
            }
            this.notifyAll();
        }
    }
}
