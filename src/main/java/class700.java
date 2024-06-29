import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class700 {

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public int field9827;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
    public boolean field9808;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Z")
    public boolean field9829;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[S")
    public short[] field9813;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    private int field9811;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field9824;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field9809 = 0;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field9826 = 0;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field9823 = 0;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Lml;")
    public static class410 field9819 = new class410("", 10);

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field9831 = 0;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    private int field9815;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    private int field9818;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    private int field9820;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    private int field9821;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Luca;")
    public class540 field9828;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Ldd;")
    public static class734 field9832;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "[I")
    public static int[] field9825;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BIIII)V", line = 8)
    public static final void method3896(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field9814++;
        if (arg2 == 8 || arg2 == 16) {
            for (int var6 = 0; var6 < class743.field10262; var6++) {
                class723 var7 = class537.field7312[var6];
                if (var7.field10059 == arg2 && var7.field10071 == arg1 && var7.field10072 == arg4 || var7.field10069 == arg1 && var7.field10072 == arg4) {
                    if (class743.field10262 != var6) {
                        class278.method1799(class537.field7312, var6 + 1, class537.field7312, var6, class537.field7312.length - var6 - 1);
                    }
                    class743.field10262--;
                    return;
                }
            }
        } else {
            class243 var5 = class626.field8501[arg3][arg1][arg4];
            if (var5 != null) {
                if (arg2 == 1) {
                    var5.field3271 = 0;
                } else if (arg2 == 2) {
                    var5.field3276 = 0;
                }
            }
            class610.method3376(1);
        }
        if (arg0 != 69) {
            method3898(7, false, null, null, null, true);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V", line = 64)
    public static void method3897(boolean arg0) {
        field9832 = null;
        field9819 = null;
        field9825 = null;
        if (!arg0) {
            field9819 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLqn;Ljava/lang/String;Ljava/lang/String;Z)V", line = 78)
    public static final void method3898(int arg0, boolean arg1, class70 arg2, String arg3, String arg4, boolean arg5) {
        if (arg0 != 0) {
            method3898(-105, true, null, null, null, true);
        }
        field9822++;
        if (!arg1) {
            class632.method3545(arg2, (byte) 124, arg4, 3);
            return;
        }
        if (class70.field976.startsWith("win") && arg2.field984) {
            String var6 = null;
            if (class735.field10183 != null) {
                var6 = class735.field10183.getParameter("haveie6");
            }
            if (var6 == null || !var6.equals("1")) {
                class615 var7 = class632.method3545(arg2, (byte) 126, arg4, 0);
                class239.field3224 = arg4;
                class83.field1173 = var7;
                class633.field8848 = arg2;
                return;
            }
        }
        if (class70.field976.startsWith("mac")) {
            String var8 = null;
            if (class735.field10183 != null) {
                var8 = class735.field10183.getParameter("havefirefox");
            }
            if (var8 != null && var8.equals("1") && arg5) {
                class155.method1130((byte) 7, arg4, arg2, arg3, 1);
                return;
            }
        }
        class632.method3545(arg2, (byte) 93, arg4, 2);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 144)
    private final void method3899(int arg0) {
        int var2 = this.field9824;
        if (var2 == 2) {
            this.field9815 = 1;
            this.field9820 = 0;
            this.field9821 = 2048;
            this.field9818 = 2048;
        } else if (var2 == 3) {
            this.field9815 = 1;
            this.field9818 = 4096;
            this.field9820 = 0;
            this.field9821 = 2048;
        } else if (var2 == 4) {
            this.field9820 = 0;
            this.field9818 = 2048;
            this.field9815 = 4;
            this.field9821 = 2048;
        } else if (var2 == 5) {
            this.field9815 = 4;
            this.field9818 = 8192;
            this.field9821 = 2048;
            this.field9820 = 0;
        } else if (var2 == 12) {
            this.field9815 = 2;
            this.field9821 = 2048;
            this.field9818 = 2048;
            this.field9820 = 0;
        } else if (var2 == 13) {
            this.field9821 = 2048;
            this.field9820 = 0;
            this.field9818 = 8192;
            this.field9815 = 2;
        } else if (var2 == 10) {
            this.field9821 = 512;
            this.field9820 = 1536;
            this.field9815 = 3;
            this.field9818 = 2048;
        } else if (var2 == 11) {
            this.field9821 = 512;
            this.field9820 = 1536;
            this.field9815 = 3;
            this.field9818 = 4096;
        } else if (var2 == 6) {
            this.field9815 = 3;
            this.field9820 = 1280;
            this.field9818 = 2048;
            this.field9821 = 768;
        } else if (var2 == 7) {
            this.field9820 = 1280;
            this.field9815 = 3;
            this.field9821 = 768;
            this.field9818 = 4096;
        } else if (var2 == 8) {
            this.field9821 = 1024;
            this.field9820 = 1024;
            this.field9818 = 2048;
            this.field9815 = 3;
        } else if (var2 == 9) {
            this.field9820 = 1024;
            this.field9815 = 3;
            this.field9821 = 1024;
            this.field9818 = 4096;
        } else if (var2 == 14) {
            this.field9820 = 1280;
            this.field9821 = 768;
            this.field9818 = 2048;
            this.field9815 = 1;
        } else if (var2 == 15) {
            this.field9815 = 1;
            this.field9820 = 1536;
            this.field9821 = 512;
            this.field9818 = 4096;
        } else if (var2 == 16) {
            this.field9815 = 1;
            this.field9818 = 8192;
            this.field9821 = 256;
            this.field9820 = 1792;
        } else {
            this.field9818 = 2048;
            this.field9821 = 2048;
            this.field9820 = 0;
            this.field9815 = 0;
        }
        if (arg0 != 26115) {
            this.field9827 = -56;
        }
        field9810++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIZI)V", line = 348)
    public final void method3900(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field9817++;
        this.field9820 = arg2;
        if (arg3) {
            this.field9829 = false;
        }
        this.field9818 = arg1;
        this.field9821 = arg0;
        this.field9815 = arg4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lha;IIZIII)V", line = 366)
    private final void method3901(class65 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            field9812++;
            this.field9828 = arg0.method530(arg5, arg6, arg2, arg1, arg4, 1.0F);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 396)
    protected class700() {
        if (class474.field6603 == null) {
            class73.method639((byte) -128);
        }
        this.method3899(26115);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lha;Ljp;I)V", line = 407)
    public class700(class65 arg0, class376 arg1, int arg2) {
        if (class474.field6603 == null) {
            class73.method639((byte) -128);
        }
        this.field9827 = arg1.method2398(-1372747256);
        this.field9808 = (this.field9827 & 0x8) != 0;
        this.field9829 = (this.field9827 & 0x10) != 0;
        this.field9827 &= 0x7;
        int var4 = arg1.method2359(-1) << arg2;
        int var5 = arg1.method2359(-1) << arg2;
        int var6 = arg1.method2359(-1) << arg2;
        int var7 = arg1.method2398(-1372747256);
        int var8 = var7 * 2 + 1;
        this.field9813 = new short[var8];
        for (int var9 = 0; var9 < this.field9813.length; var9++) {
            short var13 = (short) arg1.method2359(-1);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field9813[var9] = (short) class213.method1409(var15, var14 << 8);
        }
        int var10 = (var7 << class26.field388) + class30.field464;
        int var11 = class145.field2069 == null ? class182.field2413[class630.method3539(arg1.method2359(-1), 2011997347) & 0xFFFF] : class145.field2069[arg1.method2359(-1)];
        int var12 = arg1.method2398(-1372747256);
        this.field9811 = (var12 & 0xE0) << 3;
        this.field9824 = var12 & 0x1F;
        if (this.field9824 != 31) {
            this.method3899(26115);
        }
        this.method3901(arg0, var10, var5, true, var11, var4, var6);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ)V", line = 467)
    public final void method3902(int arg0, int arg1, boolean arg2) {
        field9816++;
        if (arg0 >= -10) {
            return;
        }
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field9811 + (this.field9818 * arg1 / 50) & 0x7FF;
            int var5 = this.field9815;
            if (var5 == 1) {
                var6 = (class749.field10324[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class474.field6603[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field9828.method1412((float) ((this.field9821 * var6 >> 11) + this.field9820) / 2048.0F, (byte) -50);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 542)
    public static final void method3903(int arg0) {
        for (class81 var1 = (class81) class57.field805.method697(0); var1 != null; var1 = (class81) class57.field805.method699(true)) {
            if (var1.field1151 > 1) {
                var1.field1151 = 0;
                class498.field6877.method1544(true, var1, ((class275) var1.field1155.field1176.field4146).field4087);
                var1.field1155.method700(arg0 ^ 0x457);
            }
        }
        field9830++;
        class746.field10297 = 0;
        if (arg0 != 1024) {
            method3898(127, false, null, null, null, false);
        }
        class491.field6811 = 0;
        class280.field4138.method2549(-96);
        class643.field8925.method3959(0);
        class57.field805.method700(arg0 - 911);
        class354.method2238(1, class455.field6322);
    }
}
