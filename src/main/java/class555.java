import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class555 {

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public int field7696;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Z")
    public boolean field7684;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "Z")
    public boolean field7688;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "[S")
    public short[] field7695;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public int field7692;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    private int field7698;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "[I")
    public static int[] field7690 = new int[1];

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "[I")
    public static int[] field7697 = new int[4];

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    private int field7681;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    private int field7685;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    private int field7691;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    private int field7693;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "J")
    public static long field7686;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "Lsca;")
    public class251 field7687;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBIII)V", line = 7)
    public final void method3264(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field7681 = arg2;
        if (arg1 > -48) {
            this.method3267(-72, true, (byte) 121);
        }
        this.field7691 = arg0;
        field7694++;
        this.field7685 = arg3;
        this.field7693 = arg4;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 25)
    private final void method3265(int arg0) {
        field7683++;
        if (arg0 != 4) {
            this.method3264(70, (byte) -51, 42, -72, -77);
        }
        int var2 = this.field7692;
        if (var2 == 2) {
            this.field7691 = 0;
            this.field7681 = 2048;
            this.field7693 = 1;
            this.field7685 = 2048;
        } else if (var2 == 3) {
            this.field7685 = 4096;
            this.field7691 = 0;
            this.field7681 = 2048;
            this.field7693 = 1;
        } else if (var2 == 4) {
            this.field7691 = 0;
            this.field7693 = 4;
            this.field7685 = 2048;
            this.field7681 = 2048;
        } else if (var2 == 5) {
            this.field7685 = 8192;
            this.field7681 = 2048;
            this.field7693 = 4;
            this.field7691 = 0;
        } else if (var2 == 12) {
            this.field7693 = 2;
            this.field7685 = 2048;
            this.field7681 = 2048;
            this.field7691 = 0;
        } else if (var2 == 13) {
            this.field7693 = 2;
            this.field7685 = 8192;
            this.field7681 = 2048;
            this.field7691 = 0;
        } else if (var2 == 10) {
            this.field7691 = 1536;
            this.field7685 = 2048;
            this.field7693 = 3;
            this.field7681 = 512;
        } else if (var2 == 11) {
            this.field7693 = 3;
            this.field7691 = 1536;
            this.field7685 = 4096;
            this.field7681 = 512;
        } else if (var2 == 6) {
            this.field7693 = 3;
            this.field7681 = 768;
            this.field7691 = 1280;
            this.field7685 = 2048;
        } else if (var2 == 7) {
            this.field7685 = 4096;
            this.field7681 = 768;
            this.field7693 = 3;
            this.field7691 = 1280;
        } else if (var2 == 8) {
            this.field7693 = 3;
            this.field7685 = 2048;
            this.field7681 = 1024;
            this.field7691 = 1024;
        } else if (var2 == 9) {
            this.field7691 = 1024;
            this.field7693 = 3;
            this.field7681 = 1024;
            this.field7685 = 4096;
        } else if (var2 == 14) {
            this.field7693 = 1;
            this.field7691 = 1280;
            this.field7681 = 768;
            this.field7685 = 2048;
        } else if (var2 == 15) {
            this.field7693 = 1;
            this.field7691 = 1536;
            this.field7681 = 512;
            this.field7685 = 4096;
        } else if (var2 == 16) {
            this.field7685 = 8192;
            this.field7693 = 1;
            this.field7681 = 256;
            this.field7691 = 1792;
        } else {
            this.field7691 = 0;
            this.field7685 = 2048;
            this.field7693 = 0;
            this.field7681 = 2048;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIILha;II)V", line = 227)
    private final void method3266(int arg0, int arg1, int arg2, int arg3, class473 arg4, int arg5, int arg6) {
        this.field7687 = arg4.method138(arg2, arg6, arg0, arg5, arg3, 1.0F);
        field7689++;
        if (arg1 != 2048) {
            this.field7681 = -34;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZB)V", line = 247)
    public final void method3267(int arg0, boolean arg1, byte arg2) {
        field7699++;
        if (arg2 != 61) {
            this.method3264(91, (byte) -116, -64, -90, -100);
        }
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field7698 + (this.field7685 * arg0 / 50) & 0x7FF;
            int var6 = this.field7693;
            if (var6 == 1) {
                var4 = (class448.field6265[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class641.field9014[var5] >> 1;
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
        this.field7687.method54(arg2 ^ 0x49, (float) (this.field7691 + (this.field7681 * var4 >> 11)) / 2048.0F);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZLgga;Llv;)Lsd;", line = 324)
    public static final class294 method3268(boolean arg0, class511 arg1, class581 arg2) {
        field7682++;
        class294 var3 = new class294(arg2);
        int var4 = arg1.method3013(-119);
        boolean var5 = (var4 & 0x1) != 0;
        if (arg0) {
            method3269(false);
        }
        boolean var6 = (var4 & 0x2) != 0;
        boolean var7 = (var4 & 0x4) != 0;
        if (var5) {
            var3.field4312[0] = arg1.method3002(-1);
            var3.field4317[0] = arg1.method3002(-1);
            if (arg2.field8237 != -1 || arg2.field8163 != -1) {
                var3.field4312[1] = arg1.method3002(-1);
                var3.field4317[1] = arg1.method3002(-1);
            }
            if (arg2.field8184 != -1 || arg2.field8223 != -1) {
                var3.field4312[2] = arg1.method3002(-1);
                var3.field4317[2] = arg1.method3002(-1);
            }
        }
        boolean var8 = (var4 & 0x8) != 0;
        if (var6) {
            var3.field4319[0] = arg1.method3002(-1);
            var3.field4318[0] = arg1.method3002(-1);
            if (arg2.field8176 != -1 || arg2.field8225 != -1) {
                var3.field4319[1] = arg1.method3002(-1);
                var3.field4318[1] = arg1.method3002(-1);
            }
        }
        if (var7) {
            int var9 = arg1.method3002(-1);
            int[] var10 = new int[] { class407.method2490(var9, 15), class407.method2490(248, var9) >> 4, class407.method2490(var9, 3945) >> 8, class407.method2490(var9, 65507) >> 12 };
            for (int var11 = 0; var11 < 4; var11++) {
                if (var10[var11] != 15) {
                    var3.field4311[var10[var11]] = (short) arg1.method3002(-1);
                }
            }
        }
        if (var8) {
            int var12 = arg1.method3013(-4);
            int[] var13 = new int[] { class407.method2490(15, var12), class407.method2490(var12, 250) >> 4 };
            for (int var14 = 0; var14 < 2; var14++) {
                if (var13[var14] != 15) {
                    var3.field4314[var13[var14]] = (short) arg1.method3002(-1);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 421)
    public static void method3269(boolean arg0) {
        if (arg0) {
            field7686 = 98L;
        }
        field7690 = null;
        field7697 = null;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V", line = 440)
    protected class555() {
        if (class641.field9014 == null) {
            class407.method2489(35);
        }
        this.method3265(4);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lha;Lgga;I)V", line = 451)
    public class555(class473 arg0, class511 arg1, int arg2) {
        if (class641.field9014 == null) {
            class407.method2489(35);
        }
        this.field7696 = arg1.method3013(-112);
        this.field7684 = (this.field7696 & 0x8) != 0;
        this.field7688 = (this.field7696 & 0x10) != 0;
        this.field7696 &= 0x7;
        int var4 = arg1.method3002(-1) << arg2;
        int var5 = arg1.method3002(-1) << arg2;
        int var6 = arg1.method3002(-1) << arg2;
        int var7 = arg1.method3013(79);
        int var8 = var7 * 2 + 1;
        this.field7695 = new short[var8];
        for (int var9 = 0; var9 < this.field7695.length; var9++) {
            short var13 = (short) arg1.method3002(-1);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field7695[var9] = (short) class613.method3544(var15, var14 << 8);
        }
        int var10 = (var7 << class732.field10110) + class760.field10442;
        int var11 = class109.field1323 == null ? class372.field5346[class357.method2236(arg1.method3002(-1), (byte) -128) & 0xFFFF] : class109.field1323[arg1.method3002(-1)];
        int var12 = arg1.method3013(65);
        this.field7692 = var12 & 0x1F;
        this.field7698 = var12 & 0xE0 << 3;
        if (this.field7692 != 31) {
            this.method3265(4);
        }
        this.method3266(var5, 2048, var4, var11, arg0, var10, var6);
    }
}
