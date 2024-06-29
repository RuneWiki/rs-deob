import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class128 implements class457 {

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Z")
    private boolean field1708 = false;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    private int field1705;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "Z")
    private boolean field1718;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lck;")
    public class733 field1709;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "Luw;")
    public static class208 field1715 = new class208(13, 1);

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "[I")
    public static int[] field1716 = new int[3];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)I", line = 7)
    private final int method749(byte arg0) {
        field1719++;
        if (arg0 > -104) {
            this.field1705 = -78;
        }
        int var2 = this.field1709.method3946(this.field1702, (byte) -50) * this.field1705;
        return this.field1718 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)I", line = 24)
    public final int method750(byte arg0) {
        int var2 = 56 % ((arg0 + 13) / 47);
        field1701++;
        return this.field1707;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V", line = 35)
    private final void method751(int arg0, boolean arg1) {
        this.field1709.field9820 -= arg0;
        field1700++;
        if (arg1) {
            this.field1710 = 121;
        }
        this.field1709.field9820 += this.method749((byte) -119);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z", line = 49)
    public final boolean method752(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            return false;
        }
        field1717++;
        if (!this.field1709.field9880) {
            return false;
        }
        int var2 = this.method749((byte) -123);
        this.field1709.method3975((byte) 119, this);
        OpenGL.glGenerateMipmapEXT(this.field1710);
        this.field1718 = true;
        this.method757(arg0 ^ 0x7FFFFFA9);
        this.method751(var2, false);
        return true;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 75)
    public final void method753(int arg0) {
        if (arg0 > ~this.field1707) {
            this.field1709.method3973(this.method749((byte) -118), (byte) -122, this.field1707);
            this.field1707 = 0;
        }
        field1713++;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)V", line = 90)
    public static void method754(byte arg0) {
        field1716 = null;
        if (arg0 < -79) {
            field1715 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V", line = 101)
    public static final void method755(byte arg0) {
        field1714++;
        for (int var1 = 0; var1 < 5; var1++) {
            class420.field5545[var1] = false;
        }
        class525.field6679 = -1;
        class524.field6672 = -1;
        if (arg0 <= 122) {
            return;
        }
        class209.field2883 = -1;
        class721.field9472 = -1;
        class507.field6476 = 1;
        class552.field6974 = 0;
        class29.field255 = 0;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lck;IIIZ)V", line = 404)
    public class128(class733 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1705 = arg3;
        this.field1710 = arg1;
        this.field1718 = arg4;
        this.field1709 = arg0;
        this.field1702 = arg2;
        OpenGL.glGenTextures(1, class395.field5205, 0);
        this.field1707 = class395.field5205[0];
        this.method751(0, false);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BZ)V", line = 130)
    public final void method756(byte arg0, boolean arg1) {
        if (arg0 <= 21) {
            this.field1707 = 30;
        }
        if (this.field1718 != arg1) {
            int var3 = this.method749((byte) -106);
            this.field1718 = true;
            this.method757(63);
            this.method751(var3, false);
        }
        field1706++;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 149)
    private final void method757(int arg0) {
        this.field1709.method3975((byte) 125, this);
        if (arg0 <= 10) {
            return;
        }
        field1704++;
        if (this.field1708) {
            OpenGL.glTexParameteri(this.field1710, 10241, this.field1718 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1710, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1710, 10241, this.field1718 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1710, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILkj;Lek;IZLha;)Z", line = 175)
    public static final boolean method758(int arg0, class307 arg1, class624 arg2, int arg3, boolean arg4, class570 arg5) {
        field1712++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field7953 != null) {
            var7 = (arg2.field7919 + arg1.field3857 - class402.field5350) * (class402.field5345 - class402.field5358) / (class402.field5340 - class402.field5350) + class402.field5358;
            var9 = class402.field5353 - ((arg1.field3859 + arg2.field7928 - class402.field5348) * (class402.field5353 - class402.field5344) / (class402.field5341 - class402.field5348));
            var6 = (arg1.field3857 + arg2.field7922 - class402.field5350) * (class402.field5345 - class402.field5358) / (class402.field5340 - class402.field5350) + class402.field5358;
            var8 = class402.field5353 - (arg2.field7923 + arg1.field3859 - class402.field5348) * (class402.field5353 - class402.field5344) / (class402.field5341 - class402.field5348);
        }
        class772 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field7941 != -1) {
            if (arg1.field3854 && arg2.field7957 != -1) {
                var10 = arg2.method3343(true, 2, arg5);
            } else {
                var10 = arg2.method3343(false, 2, arg5);
            }
            if (var10 != null) {
                var11 = arg1.field3855 - (var10.method623() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg1.field3855 + (var10.method623() + 1 >> 1);
                var13 = arg1.field3861 - (var10.method628() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg1.field3861 + (var10.method628() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class619 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        if (arg4) {
            field1715 = null;
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg2.field7946 != null) {
            var15 = class232.method1487(arg2.field7939, (byte) -21);
            if (var15 != null) {
                var16 = class364.field4453.method1058(arg2.field7946, null, class414.field5483, (byte) 125, null);
                int var24 = arg1.field3861 - ((class402.field5353 - class402.field5344) * arg2.field7932 / (class402.field5341 - class402.field5348));
                var17 = (class402.field5345 - class402.field5358) * arg2.field7951 / (class402.field5340 - class402.field5350) + arg1.field3855;
                if (var10 == null) {
                    var18 = var24 - var15.method3313() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method628() >> 1) + (var15.method3309() * var16));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class414.field5483[var25];
                    if ((var16 - 1) > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method3310(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg0 - (var19 / 2);
                var21 = var19 / 2 + (var17 + arg0);
                if (var6 > var20) {
                    var6 = var20;
                }
                if (var7 < var21) {
                    var7 = var21;
                }
                var22 = arg3 + var18;
                if (var8 > var22) {
                    var8 = var22;
                }
                var23 = var15.method3309() * var16 + var18 + arg3;
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (var7 < class402.field5358 || class402.field5345 < var6 || class402.field5344 > var9 || var8 > class402.field5353) {
            return true;
        }
        class402.method2347(arg5, arg1, arg2);
        if (var10 != null) {
            if (class568.field7179 > 0 && (class207.field2846 != -1 && class207.field2846 == arg1.field3860 || class670.field8696 != -1 && class670.field8696 == arg2.field7931)) {
                int var28;
                if (class317.field3954 > 50) {
                    var28 = (100 - class317.field3954) * 2;
                } else {
                    var28 = class317.field3954 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg5.method3074(arg1.field3855, 126, var10.method620() / 2 + 7, arg1.field3861, var29);
                arg5.method3074(arg1.field3855, 124, var10.method620() / 2 + 5, arg1.field3861, var29);
                arg5.method3074(arg1.field3855, 120, var10.method620() / 2 + 3, arg1.field3861, var29);
                arg5.method3074(arg1.field3855, 127, var10.method620() / 2 + 1, arg1.field3861, var29);
                arg5.method3074(arg1.field3855, 122, var10.method620() / 2, arg1.field3861, var29);
            }
            var10.method4203(arg1.field3855 - (var10.method623() >> 1), arg1.field3861 + -(var10.method628() >> 1));
        }
        if (arg2.field7946 != null && var15 != null) {
            class166.method1050(var18, arg5, var15, var19, arg1, arg2, var17, false, var16);
        }
        if (arg2.field7941 != -1 || arg2.field7946 != null) {
            class212 var30 = new class212(arg1);
            var30.field2915 = var22;
            var30.field2916 = var12;
            var30.field2920 = var13;
            var30.field2914 = var21;
            var30.field2905 = var20;
            var30.field2912 = var11;
            var30.field2919 = var23;
            var30.field2907 = var14;
            class565.field7168.method3593(var30, 15);
        }
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IZ)V", line = 369)
    public final void method759(int arg0, boolean arg1) {
        field1703++;
        if (arg0 == 0 && this.field1708 != arg1) {
            this.field1708 = arg1;
            this.method757(arg0 ^ 0x11);
        }
    }

    @OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V", line = 395)
    protected final void finalize() throws Throwable {
        this.method753(-1);
        field1711++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public abstract void method760(byte arg0);
}
