import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class32 extends class329 {

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Z")
    private boolean field454;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Z")
    private boolean field457;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lrga;")
    public static class280 field445 = new class280(80, 5);

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "F")
    public static float field461;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lr;")
    public static class566 field452;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 9)
    public static void method212(int arg0) {
        if (arg0 != -20968) {
            method214(8);
        }
        field452 = null;
        field445 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Les;I)V", line = 20)
    public final void method213(class630 arg0, int arg1) {
        field453++;
        arg0.method3509(3, (byte) -109);
        arg0.method3509(this.field447, (byte) -119);
        arg0.method3509(this.field454 ? 1 : 0, (byte) -113);
        arg0.method3509(this.field451, (byte) -110);
        arg0.method3509(this.field460, (byte) -128);
        arg0.method3509(this.field446, (byte) -126);
        arg0.method3509(this.field450, (byte) -122);
        arg0.method3509(this.field458, (byte) -128);
        arg0.method3509(this.field457 ? 1 : 0, (byte) -113);
        arg0.method3526(this.field455, arg1 ^ 0xFFFFCB62);
        if (arg1 != -1) {
            method214(116);
        }
        arg0.method3509(this.field459, (byte) -126);
        arg0.method3515(this.field449, (byte) -22);
        arg0.method3464(this.field448, arg1 ^ 0x78);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 48)
    public static final void method214(int arg0) {
        field462++;
        if (arg0 != -4 || field452 == null) {
            return;
        }
        class632.field8878.method799(arg0 + 132);
        class510.method2757();
        class687.method3870((byte) -79);
        class27.method184(17381);
        class145.method840((byte) -103);
        class440.method2345(true);
        if (class419.field5274 != null) {
            class419.field5274.method3237((byte) 112);
        }
        class155.method885(-37);
        class111.method623(arg0 ^ 0xFFFFFFFC);
        class540.method2921(-67);
        class9.method76((byte) 23);
        class253.method1483(98, false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class514 var5 = class351.field4490[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field9751.length; var6++) {
                    var5.field9751[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class441.field5585; var2++) {
            class307 var3 = class518.field7076[var2].field2618;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field9751.length; var4++) {
                    var3.field9751[var4] = null;
                }
            }
        }
        class195.field2455 = null;
        class678.field9511 = null;
        field452.method3119(1);
        field452 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I", line = 132)
    public static final int method215(int arg0, int arg1) {
        field456++;
        double var2 = (double) ((arg1 & 0xFF960C) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFC7) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        if (arg0 <= 47) {
            field452 = null;
        }
        return (var21 >> 5 << 7) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(ZLrj;)V", line = 238)
    public class32(boolean arg0, class648 arg1) {
        if (arg0) {
            if (class648.field9143.startsWith("win")) {
                this.field447 = 1;
            } else if (class648.field9143.startsWith("mac")) {
                this.field447 = 2;
            } else if (class648.field9143.startsWith("linux")) {
                this.field447 = 3;
            } else {
                this.field447 = 4;
            }
            if (class648.field9135.startsWith("amd64") || class648.field9135.startsWith("x86_64")) {
                this.field454 = true;
            } else {
                this.field454 = false;
            }
            if (this.field447 == 1) {
                if (class648.field9136.indexOf("4.0") != -1) {
                    this.field451 = 1;
                } else if (class648.field9136.indexOf("4.1") != -1) {
                    this.field451 = 2;
                } else if (class648.field9136.indexOf("4.9") != -1) {
                    this.field451 = 3;
                } else if (class648.field9136.indexOf("5.0") != -1) {
                    this.field451 = 4;
                } else if (class648.field9136.indexOf("5.1") != -1) {
                    this.field451 = 5;
                } else if (class648.field9136.indexOf("6.0") != -1) {
                    this.field451 = 6;
                } else if (class648.field9136.indexOf("6.1") != -1) {
                    this.field451 = 7;
                }
            } else if (this.field447 == 2) {
                if (class648.field9136.indexOf("10.4") != -1) {
                    this.field451 = 20;
                } else if (class648.field9136.indexOf("10.5") != -1) {
                    this.field451 = 21;
                } else if (class648.field9136.indexOf("10.6") != -1) {
                    this.field451 = 22;
                }
            }
            if (class648.field9137.toLowerCase().indexOf("sun") != -1) {
                this.field460 = 1;
            } else if (class648.field9137.toLowerCase().indexOf("microsoft") != -1) {
                this.field460 = 2;
            } else if (class648.field9137.toLowerCase().indexOf("apple") == -1) {
                this.field460 = 4;
            } else {
                this.field460 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class648.field9157.length()) {
                    char var5 = class648.field9157.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field446 = var4;
            int var6 = class648.field9157.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class648.field9157.length()) {
                    char var8 = class648.field9157.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field450 = var7;
            int var9 = class648.field9157.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class648.field9157.length() > var9) {
                    char var11 = class648.field9157.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var14) {
            }
            if (this.field446 > 3) {
                this.field459 = class384.field4844;
            } else {
                this.field459 = 0;
            }
            this.field455 = class380.field4801;
            this.field458 = var10;
            if (arg1.field9151) {
                this.field457 = false;
            } else {
                this.field457 = true;
            }
            try {
                this.field449 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field449 = 0;
            }
            try {
                this.field448 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }
}
