import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class466 {

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public int field6784;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Z")
    public boolean field6781;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "Z")
    public boolean field6791;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "[S")
    public short[] field6787;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    private int field6790;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "Laa;")
    public static class76 field6786 = new class76(54, 3);

    @OriginalMember(owner = "client!et", name = "q", descriptor = "[I")
    public static int[] field6792 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    private int field6778;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    private int field6782;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    private int field6788;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    private int field6793;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "Lwr;")
    public class531 field6794;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "[I")
    public static int[] field6795;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2704(int arg0) {
        field6776++;
        class526.method3137(arg0, arg0 + 2260);
        class300.method1869((byte) 118);
        System.gc();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/lang/String;)I", line = 22)
    public static final int method2705(byte arg0, String arg1) {
        if (arg0 > -34) {
            field6795 = null;
        }
        field6780++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - class509.method3008((byte) -123, arg1.charAt(var4)));
        }
        return var3;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lya;IIIBII)V", line = 45)
    private final void method2706(class11 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        this.field6794 = arg0.method136(arg6, arg3, arg5, arg1, arg2, 1.0F);
        field6783++;
        if (arg4 < 98) {
            this.method2706(null, -8, -93, 62, (byte) 52, 103, -76);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IZB)V", line = 62)
    public final void method2707(int arg0, boolean arg1, byte arg2) {
        field6785++;
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field6793 * arg0 / 50 + this.field6790 & 0x7FF;
            int var6 = this.field6778;
            if (var6 == 1) {
                var4 = (class445.field6545[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class320.field4934[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        if (arg2 <= -37) {
            this.field6794.method1493((float) ((this.field6782 * var4 >> 11) + this.field6788) / 2048.0F, 97);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V", line = 143)
    private final void method2708(boolean arg0) {
        if (arg0) {
            return;
        }
        int var2 = this.field6779;
        if (var2 == 2) {
            this.field6793 = 2048;
            this.field6778 = 1;
            this.field6788 = 0;
            this.field6782 = 2048;
        } else if (var2 == 3) {
            this.field6788 = 0;
            this.field6778 = 1;
            this.field6782 = 2048;
            this.field6793 = 4096;
        } else if (var2 == 4) {
            this.field6782 = 2048;
            this.field6793 = 2048;
            this.field6778 = 4;
            this.field6788 = 0;
        } else if (var2 == 5) {
            this.field6778 = 4;
            this.field6788 = 0;
            this.field6793 = 8192;
            this.field6782 = 2048;
        } else if (var2 == 12) {
            this.field6778 = 2;
            this.field6793 = 2048;
            this.field6788 = 0;
            this.field6782 = 2048;
        } else if (var2 == 13) {
            this.field6782 = 2048;
            this.field6778 = 2;
            this.field6793 = 8192;
            this.field6788 = 0;
        } else if (var2 == 10) {
            this.field6782 = 512;
            this.field6778 = 3;
            this.field6793 = 2048;
            this.field6788 = 1536;
        } else if (var2 == 11) {
            this.field6793 = 4096;
            this.field6788 = 1536;
            this.field6778 = 3;
            this.field6782 = 512;
        } else if (var2 == 6) {
            this.field6778 = 3;
            this.field6793 = 2048;
            this.field6782 = 768;
            this.field6788 = 1280;
        } else if (var2 == 7) {
            this.field6778 = 3;
            this.field6782 = 768;
            this.field6788 = 1280;
            this.field6793 = 4096;
        } else if (var2 == 8) {
            this.field6778 = 3;
            this.field6793 = 2048;
            this.field6782 = 1024;
            this.field6788 = 1024;
        } else if (var2 == 9) {
            this.field6793 = 4096;
            this.field6782 = 1024;
            this.field6778 = 3;
            this.field6788 = 1024;
        } else if (var2 == 14) {
            this.field6793 = 2048;
            this.field6788 = 1280;
            this.field6778 = 1;
            this.field6782 = 768;
        } else if (var2 == 15) {
            this.field6793 = 4096;
            this.field6778 = 1;
            this.field6788 = 1536;
            this.field6782 = 512;
        } else if (var2 == 16) {
            this.field6778 = 1;
            this.field6782 = 256;
            this.field6788 = 1792;
            this.field6793 = 8192;
        } else {
            this.field6788 = 0;
            this.field6793 = 2048;
            this.field6778 = 0;
            this.field6782 = 2048;
        }
        field6777++;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIII)V", line = 345)
    public final void method2709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 5) {
            return;
        }
        field6789++;
        this.field6778 = arg1;
        this.field6793 = arg4;
        this.field6782 = arg3;
        this.field6788 = arg0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V", line = 365)
    public static void method2710(byte arg0) {
        field6792 = null;
        if (arg0 >= 108) {
            field6786 = null;
            field6795 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V", line = 379)
    protected class466() {
        if (class320.field4934 == null) {
            class130.method951(35);
        }
        this.method2708(false);
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lya;Lgk;I)V", line = 389)
    public class466(class11 arg0, class468 arg1, int arg2) {
        if (class320.field4934 == null) {
            class130.method951(35);
        }
        this.field6784 = arg1.method2765(108);
        this.field6781 = (this.field6784 & 0x8) != 0;
        this.field6791 = (this.field6784 & 0x10) != 0;
        this.field6784 &= 0x7;
        int var4 = arg1.method2727((byte) 43) << arg2;
        int var5 = arg1.method2727((byte) 43) << arg2;
        int var6 = arg1.method2727((byte) 43) << arg2;
        int var7 = arg1.method2765(118);
        int var8 = var7 * 2 + 1;
        this.field6787 = new short[var8];
        for (int var9 = 0; var9 < this.field6787.length; var9++) {
            short var13 = (short) arg1.method2727((byte) 43);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field6787[var9] = (short) class390.method2340(var14 << 8, var15);
        }
        int var10 = (var7 << class9.field75) + class280.field4230;
        int var11 = class461.field6721 == null ? class85.field1347[class90.method696(1278910602, arg1.method2727((byte) 43)) & 0xFFFF] : class461.field6721[arg1.method2727((byte) 43)];
        int var12 = arg1.method2765(55);
        this.field6790 = var12 & 0xE0 << 3;
        this.field6779 = var12 & 0x1F;
        if (this.field6779 != 31) {
            this.method2708(false);
        }
        this.method2706(arg0, var10, var11, var6, (byte) 124, var5, var4);
    }
}
