import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class156 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Z")
    public boolean field2344 = true;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field2341 = -1;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field2350 = 128;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    private int field2355 = 0;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Z")
    public static boolean field2351 = false;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lco;II)V")
    private final void method1098(class268 arg0, int arg1, int arg2) {
        if (arg1 > -42) {
            return;
        }
        if (arg2 == 1) {
            this.field2355 = arg0.method1700((byte) 44);
            this.method1103(this.field2355, 0);
        } else if (arg2 == 2) {
            this.field2341 = arg0.method1745(32132);
            if (this.field2341 == 65535) {
                this.field2341 = -1;
            }
        } else if (arg2 == 3) {
            this.field2350 = arg0.method1745(32132) << 0;
        } else if (arg2 == 4) {
            this.field2344 = false;
        }
        field2352++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lco;I)Lck;")
    public static final class8 method1099(class268 arg0, int arg1) {
        field2348++;
        if (arg1 != 1) {
            field2351 = true;
        }
        return new class8(arg0.method1730(13436), arg0.method1730(13436), arg0.method1730(13436), arg0.method1730(13436), arg0.method1700((byte) 44), arg0.method1700((byte) 44), arg0.method1738(arg1 + 254));
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III[FBIIIFI)V")
    public static final void method1100(int arg0, int arg1, int arg2, float[] arg3, byte arg4, int arg5, int arg6, int arg7, float arg8, int arg9) {
        field2345++;
        int var10 = arg5 - arg7;
        if (arg4 != 8) {
            return;
        }
        int var11 = arg6 - arg0;
        int var12 = arg2 - arg1;
        float var13 = arg3[2] * (float) var12 + arg3[0] * (float) var10 + arg3[1] * (float) var11;
        float var14 = arg3[5] * (float) var12 + arg3[4] * (float) var11 + arg3[3] * (float) var10;
        float var15 = arg3[8] * (float) var12 + arg3[6] * (float) var10 + arg3[7] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg8 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg9 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg9 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg9 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class275.field4021 = var17;
        class414.field6122 = var18;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILco;)V")
    public final void method1101(int arg0, class268 arg1) {
        field2342++;
        while (true) {
            int var3 = arg1.method1738(255);
            if (var3 == 0) {
                if (arg0 == 255) {
                    return;
                } else {
                    method1099(null, 91);
                    return;
                }
            }
            this.method1098(arg1, -74, var3);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
    public static final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 47) {
            field2351 = false;
        }
        if (arg2 <= class409.field6071 && class222.field3350 <= arg1) {
            boolean var6;
            if (arg3 < class183.field2638) {
                var6 = false;
                arg3 = class183.field2638;
            } else if (arg3 <= class268.field3911) {
                var6 = true;
            } else {
                arg3 = class268.field3911;
                var6 = false;
            }
            boolean var7;
            if (arg5 < class183.field2638) {
                arg5 = class183.field2638;
                var7 = false;
            } else if (arg5 <= class268.field3911) {
                var7 = true;
            } else {
                var7 = false;
                arg5 = class268.field3911;
            }
            if (arg2 >= class222.field3350) {
                class614.method3490(arg4, arg3, -85, class495.field6944[arg2++], arg5);
            } else {
                arg2 = class222.field3350;
            }
            if (class409.field6071 >= arg1) {
                class614.method3490(arg4, arg3, -88, class495.field6944[arg1--], arg5);
            } else {
                arg1 = class409.field6071;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg1; var8++) {
                    int[] var9 = class495.field6944[var8];
                    var9[arg3] = var9[arg5] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg1; var11++) {
                    class495.field6944[var11][arg3] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg1; var10++) {
                    class495.field6944[var10][arg5] = arg4;
                }
            }
        }
        field2353++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    private final void method1103(int arg0, int arg1) {
        field2343++;
        double var3 = (double) ((arg0 & 0xFF71E9) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF3F) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field2349 = (int) (var17 * 256.0D);
        this.field2347 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field2347 < 0) {
            this.field2347 = 0;
        } else if (this.field2347 > 255) {
            this.field2347 = 255;
        }
        if (arg1 > this.field2349) {
            this.field2349 = 0;
        } else if (this.field2349 > 255) {
            this.field2349 = 255;
        }
        if (var17 > 0.5D) {
            this.field2346 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2346 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2346 < 1) {
            this.field2346 = 1;
        }
        this.field2354 = (int) ((double) this.field2346 * var19);
    }

    static {
        new class567("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }
}
