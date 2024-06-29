import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class79 implements class632 {

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "I")
    private int field1236 = 0;

    @OriginalMember(owner = "client!vga", name = "l", descriptor = "[Lfea;")
    private class130[] field1239 = new class130[9];

    @OriginalMember(owner = "client!vga", name = "B", descriptor = "I")
    private int field1255 = -1;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "Lno;")
    private class658 field1230;

    @OriginalMember(owner = "client!vga", name = "n", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "[I")
    public static int[] field1235 = new int[13];

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!vga", name = "k", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!vga", name = "m", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!vga", name = "o", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client!vga", name = "p", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!vga", name = "q", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!vga", name = "r", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!vga", name = "s", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!vga", name = "t", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!vga", name = "u", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!vga", name = "v", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!vga", name = "w", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!vga", name = "x", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!vga", name = "y", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!vga", name = "A", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "Z")
    public static boolean field1234;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILbm;I)V", line = 3)
    public final void method612(int arg0, class101 arg1, int arg2) {
        field1240++;
        if (this.field1255 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if (arg0 <= 101) {
            this.method624(-40, -28, null, -82, false);
        }
        if ((this.field1254 & ~var4) == 0) {
            this.field1231 = arg1.field1505;
            this.field1242 = arg1.field1510;
        } else if (this.field1231 != arg1.field1505 || this.field1242 != arg1.field1510) {
            throw new RuntimeException();
        }
        arg1.method775(this.field1255, 88, class497.field6676[arg2]);
        this.field1239[arg2] = arg1;
        this.field1254 |= var4;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V", line = 34)
    public static void method613(boolean arg0) {
        field1235 = null;
        if (!arg0) {
            method613(true);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)I", line = 44)
    public static final int method614(int arg0, int arg1, int arg2) {
        field1232++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < arg0) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IZ)V", line = 65)
    public final void method615(int arg0, boolean arg1) {
        field1243++;
        if (this.field1255 == -1) {
            throw new RuntimeException();
        } else if (arg1) {
            OpenGL.glReadBuffer(class497.field6676[arg0]);
        }
    }

    @OriginalMember(owner = "client!vga", name = "finalize", descriptor = "()V", line = 80)
    protected final void finalize() throws Throwable {
        field1253++;
        this.field1230.method3626(-1, this.field1241);
        super.finalize();
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 93)
    public final void method616(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field1241);
        field1238++;
        this.field1236 |= 0x4;
        this.field1255 = this.method618((byte) 56);
        if (arg0 != -27858) {
            this.field1241 = -36;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V", line = 107)
    public final void method617(byte arg0) {
        if (arg0 > -66) {
            this.field1231 = 35;
        }
        field1248++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field1236 &= 0xFFFFFFFB;
        this.field1255 = this.method618((byte) 56);
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)I", line = 120)
    private final int method618(byte arg0) {
        field1250++;
        if ((this.field1236 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1236 & 0x2) != 0) {
            return 36009;
        } else if ((this.field1236 & 0x1) == 0) {
            if (arg0 != 56) {
                this.method623(83);
            }
            return -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLjk;II)V", line = 147)
    public final void method619(byte arg0, class592 arg1, int arg2, int arg3) {
        field1228++;
        int var5 = -35 / ((33 - arg0) / 51);
        this.method624(0, arg3, arg1, arg2, true);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V", line = 157)
    public final void method620(int arg0, int arg1) {
        if (this.field1239[arg1] != null) {
            this.field1239[arg1].method773(-1);
        }
        field1251++;
        this.field1254 &= ~(arg0 << arg1);
        this.field1239[arg1] = null;
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lno;)V", line = 362)
    public class79(class658 arg0) {
        if (!arg0.field9284) {
            throw new IllegalStateException("");
        }
        this.field1230 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class92.field1388, 0);
        this.field1241 = class92.field1388[0];
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lgaa;II)V", line = 176)
    public final void method621(class275 arg0, int arg1, int arg2) {
        int var4 = -83 / ((arg1 - 17) / 33);
        field1249++;
        this.method622(0, arg0, -82, arg2);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILgaa;II)V", line = 189)
    private final void method622(int arg0, class275 arg1, int arg2, int arg3) {
        field1244++;
        if (this.field1255 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg3;
        if ((this.field1254 & ~var5) == 0) {
            this.field1231 = arg1.field3859;
            this.field1242 = arg1.field3856;
        } else if (this.field1231 != arg1.field3859 || this.field1242 != arg1.field3856) {
            throw new RuntimeException();
        }
        arg1.method1663(-5427, class497.field6676[arg3], arg0, this.field1255);
        int var6 = 65 % ((arg2 - 53) / 51);
        this.field1239[arg3] = arg1;
        this.field1254 |= var5;
    }

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "(I)Z", line = 220)
    public final boolean method623(int arg0) {
        field1252++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1255);
        if (var2 == 36053) {
            if (arg0 != -32672) {
                this.method621(null, 101, -56);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IILjk;IZ)V", line = 244)
    private final void method624(int arg0, int arg1, class592 arg2, int arg3, boolean arg4) {
        field1246++;
        if (this.field1255 == -1) {
            throw new RuntimeException();
        }
        if (!arg4) {
            this.field1236 = 105;
        }
        int var6 = 0x1 << arg1;
        if ((this.field1254 & ~var6) == 0) {
            this.field1231 = arg2.field7825;
            this.field1242 = arg2.field7825;
        } else if (this.field1231 != arg2.field7825 || this.field1242 != arg2.field7825) {
            throw new RuntimeException();
        }
        arg2.method3251(this.field1255, class497.field6676[arg1], arg0, arg3, (byte) 118);
        this.field1239[arg1] = arg2;
        this.field1254 |= var6;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BI)V", line = 274)
    public final void method625(byte arg0, int arg1) {
        int var3 = -2 / ((54 - arg0) / 42);
        field1233++;
        if (this.field1255 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class497.field6676[arg1]);
    }

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "(I)V", line = 297)
    public final void method626(int arg0) {
        if (arg0 != 527) {
            this.method612(126, null, -106);
        }
        OpenGL.glBindFramebufferEXT(36008, this.field1241);
        field1229++;
        this.field1236 |= 0x1;
        this.field1255 = this.method618((byte) 56);
    }

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "(I)V", line = 310)
    public final void method627(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field1241);
        if (arg0 > 71) {
            field1247++;
            this.field1236 |= 0x2;
            this.field1255 = this.method618((byte) 56);
        }
    }

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V", line = 332)
    public final void method628(int arg0) {
        field1237++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field1236 &= 0xFFFFFFFD;
        this.field1255 = this.method618((byte) 56);
        if (arg0 != -24836) {
            this.method620(-115, 101);
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V", line = 345)
    public final void method629(int arg0) {
        field1245++;
        if (arg0 != 24676) {
            this.method625((byte) 34, -72);
        }
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field1236 &= 0xFFFFFFFE;
        this.field1255 = this.method618((byte) 56);
    }
}
