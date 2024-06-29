import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class525 {

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public int field7772;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Z")
    public boolean field7758;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Z")
    public boolean field7760;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "[S")
    public short[] field7767;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    private int field7769;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public int field7768;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljv;")
    public static class56 field7757 = null;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lkl;")
    public static class55 field7764 = new class55(11, 0, 1, 2);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    private int field7759;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    private int field7765;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    private int field7774;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    private int field7777;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Ljd;")
    public class153 field7770;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I", line = 5)
    public static final int method3118(int arg0, int arg1) {
        field7773++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 < 110) {
            method3118(-41, -14);
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 24)
    private final void method3119(byte arg0) {
        if (arg0 >= -110) {
            return;
        }
        int var2 = this.field7768;
        if (var2 == 2) {
            this.field7774 = 2048;
            this.field7777 = 2048;
            this.field7765 = 0;
            this.field7759 = 1;
        } else if (var2 == 3) {
            this.field7759 = 1;
            this.field7774 = 2048;
            this.field7765 = 0;
            this.field7777 = 4096;
        } else if (var2 == 4) {
            this.field7759 = 4;
            this.field7765 = 0;
            this.field7777 = 2048;
            this.field7774 = 2048;
        } else if (var2 == 5) {
            this.field7759 = 4;
            this.field7765 = 0;
            this.field7774 = 2048;
            this.field7777 = 8192;
        } else if (var2 == 12) {
            this.field7765 = 0;
            this.field7774 = 2048;
            this.field7759 = 2;
            this.field7777 = 2048;
        } else if (var2 == 13) {
            this.field7759 = 2;
            this.field7765 = 0;
            this.field7774 = 2048;
            this.field7777 = 8192;
        } else if (var2 == 10) {
            this.field7777 = 2048;
            this.field7759 = 3;
            this.field7765 = 1536;
            this.field7774 = 512;
        } else if (var2 == 11) {
            this.field7774 = 512;
            this.field7765 = 1536;
            this.field7759 = 3;
            this.field7777 = 4096;
        } else if (var2 == 6) {
            this.field7759 = 3;
            this.field7774 = 768;
            this.field7765 = 1280;
            this.field7777 = 2048;
        } else if (var2 == 7) {
            this.field7759 = 3;
            this.field7774 = 768;
            this.field7765 = 1280;
            this.field7777 = 4096;
        } else if (var2 == 8) {
            this.field7759 = 3;
            this.field7777 = 2048;
            this.field7765 = 1024;
            this.field7774 = 1024;
        } else if (var2 == 9) {
            this.field7774 = 1024;
            this.field7777 = 4096;
            this.field7765 = 1024;
            this.field7759 = 3;
        } else if (var2 == 14) {
            this.field7777 = 2048;
            this.field7759 = 1;
            this.field7774 = 768;
            this.field7765 = 1280;
        } else if (var2 == 15) {
            this.field7765 = 1536;
            this.field7774 = 512;
            this.field7759 = 1;
            this.field7777 = 4096;
        } else if (var2 == 16) {
            this.field7774 = 256;
            this.field7777 = 8192;
            this.field7765 = 1792;
            this.field7759 = 1;
        } else {
            this.field7774 = 2048;
            this.field7765 = 0;
            this.field7777 = 2048;
            this.field7759 = 0;
        }
        field7775++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 225)
    public static void method3120(int arg0) {
        field7757 = null;
        field7764 = null;
        if (arg0 <= 33) {
            method3118(87, -4);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lem;", line = 237)
    public static final class150 method3121(int arg0, int arg1, int arg2) {
        field7762++;
        class150 var3 = class60.method497(arg1, (byte) -122);
        if (arg0 == -1) {
            return var3;
        } else if (arg2 == -9140) {
            return var3 == null || var3.field2299 == null || var3.field2299.length <= arg0 ? null : var3.field2299[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V", line = 263)
    public final void method3122(int arg0, int arg1, boolean arg2) {
        int var4 = 1 % ((-arg1 - 53) / 54);
        field7771++;
        int var7;
        if (arg2) {
            var7 = 2048;
        } else {
            int var5 = this.field7769 + (this.field7777 * arg0 / 50) & 0x7FF;
            int var6 = this.field7759;
            if (var6 == 1) {
                var7 = (class183.field2684[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var7 = class239.field3363[var5] >> 1;
            } else if (var6 == 4) {
                var7 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var7 = var5;
            } else if (var6 == 5) {
                var7 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var7 = 2048;
            }
        }
        this.field7770.method1024(-2, (float) ((this.field7774 * var7 >> 11) + this.field7765) / 2048.0F);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lya;IIIIBI)V", line = 347)
    private final void method3123(class38 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        this.field7770 = arg0.method323(arg4, arg2, arg6, arg3, arg1, 1.0F);
        if (arg5 >= 50) {
            field7766++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 361)
    public static final String method3124(boolean arg0, String arg1) {
        field7761++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class497.method2900(true, arg1.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class497.method2900(true, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        if (arg0) {
            method3121(-122, 26, -26);
        }
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class20.method125(var7, 0)) {
                char var8 = class409.method2447(var7, (byte) -51);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V", line = 421)
    public final void method3125(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 11) {
            this.field7777 = -90;
        }
        this.field7777 = arg0;
        this.field7774 = arg3;
        this.field7759 = arg4;
        this.field7765 = arg2;
        field7776++;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 439)
    protected class525() {
        if (class239.field3363 == null) {
            class331.method1912(-20438);
        }
        this.method3119((byte) -119);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lya;Lsi;I)V", line = 449)
    public class525(class38 arg0, class391 arg1, int arg2) {
        if (class239.field3363 == null) {
            class331.method1912(-20438);
        }
        this.field7772 = arg1.method2348(-2);
        this.field7758 = (this.field7772 & 0x10) != 0;
        this.field7760 = (this.field7772 & 0x8) != 0;
        this.field7772 &= 0x7;
        int var4 = arg1.method2353((byte) 81) << arg2;
        int var5 = arg1.method2353((byte) 71) << arg2;
        int var6 = arg1.method2353((byte) 77) << arg2;
        int var7 = arg1.method2348(-2);
        int var8 = var7 * 2 + 1;
        this.field7767 = new short[var8];
        for (int var9 = 0; var9 < this.field7767.length; var9++) {
            short var13 = (short) arg1.method2353((byte) 118);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field7767[var9] = (short) class255.method1532(var14 << 8, var15);
        }
        int var10 = (var7 << class523.field7736) + class131.field1925;
        int var11 = class166.field2487 == null ? class40.field506[class357.method2141(arg1.method2353((byte) 121), -65) & 0xFFFF] : class166.field2487[arg1.method2353((byte) 116)];
        int var12 = arg1.method2348(-2);
        this.field7769 = (var12 & 0xE0) << 3;
        this.field7768 = var12 & 0x1F;
        if (this.field7768 != 31) {
            this.method3119((byte) -124);
        }
        this.method3123(arg0, var11, var6, var10, var4, (byte) 73, var5);
    }
}
