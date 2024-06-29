import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class196 extends class326 {

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    private int field3128 = 0;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    private int field3134 = 4096;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    private int field3133 = 8192;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    private int field3137 = 2048;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    private int field3138 = 0;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    private int field3126 = 12288;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    private int field3130 = 2048;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field3132 = -1;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)Z", line = 4)
    private final boolean method1454(byte arg0, int arg1, int arg2) {
        field3139++;
        int var4 = 58 % ((-arg0 - 50) / 56);
        int var5 = (arg1 + arg2) * this.field3126 >> 12;
        int var6 = class282.field4363[(var5 * 255 & 0xFFD53) >> 12];
        int var7 = (var6 << 12) / this.field3126;
        int var8 = (var7 << 12) / this.field3133;
        int var9 = this.field3134 * var8 >> 12;
        return var9 > (arg2 - arg1) && -var9 < arg2 - arg1;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 21)
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)Z", line = 40)
    private final boolean method1455(int arg0, int arg1, int arg2) {
        int var4 = (arg1 - arg0) * this.field3126 >> 12;
        int var5 = class282.field4363[var4 * 255 >> 12 & 0xFF];
        field3125++;
        int var6 = (var5 << 12) / this.field3126;
        if (arg2 == 30307) {
            int var7 = (var6 << 12) / this.field3133;
            int var8 = this.field3134 * var7 >> 12;
            return var8 > (arg0 + arg1) && arg0 + arg1 > -var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIBIII)V", line = 62)
    public static final void method1456(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= -29) {
            field3132 = -57;
        }
        class182[] var7 = class287.field4436;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class182 var9 = var7[var8];
            if (var9 != null && var9.field2954 == 2) {
                class326.method2289(var9.field2958 * 2, (var9.field2953 - class326.field5108 << 7) + var9.field2956, arg1, arg0 >> 1, arg6 >> 1, (var9.field2949 - class198.field3168 << 7) + var9.field2962, true, arg5);
                if (class315.field4923 > -1 && (class229.field3595 % 20) < 10) {
                    class163.field2644[var9.field2963].method1273(arg4 + class315.field4923 - 12, class113.field1585 + -28 + arg2);
                }
            }
        }
        field3140++;
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)V", line = 103)
    public final void method99(byte arg0) {
        field3131++;
        if (arg0 == 31) {
            class59.method480(true);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I", line = 123)
    public final int[] method103(int arg0, int arg1) {
        field3135++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (arg0 > -25) {
            this.field3137 = -94;
        }
        if (this.field5112.field3583) {
            int var4 = class34.field508[arg1] - 2048;
            for (int var5 = 0; var5 < class166.field2731; var5++) {
                int var6 = class110.field1527[var5] - 2048;
                int var7 = this.field3130 + var6;
                int var8 = var4 + this.field3128;
                int var9 = var7 < -2048 ? var7 + 4096 : var7;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = var8 < -2048 ? var8 + 4096 : var8;
                int var12 = var11 > 2048 ? var11 - 4096 : var11;
                int var13 = this.field3137 + var4;
                int var14 = this.field3138 + var6;
                int var15 = var14 >= -2048 ? var14 : var14 + 4096;
                int var16 = var15 <= 2048 ? var15 : var15 - 4096;
                int var17 = var13 < -2048 ? var13 + 4096 : var13;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method1455(var10, var12, 30307) || this.method1454((byte) 91, var16, var18) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V", line = 174)
    public static final void method1457(int arg0, int arg1) {
        if (arg1 == 20421) {
            field3129++;
            class4.field38.method1353(-1, arg0);
            class334.field5206.method1353(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZLvl;)V", line = 205)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field3130 = arg2.method39((byte) 77);
        } else if (arg0 == 1) {
            this.field3128 = arg2.method39((byte) 117);
        } else if (arg0 == 2) {
            this.field3138 = arg2.method39((byte) 67);
        } else if (arg0 == 3) {
            this.field3137 = arg2.method39((byte) 90);
        } else if (arg0 == 4) {
            this.field3126 = arg2.method39((byte) 117);
        } else if (arg0 == 5) {
            this.field3134 = arg2.method39((byte) 30);
        } else if (arg0 == 6) {
            this.field3133 = arg2.method39((byte) 98);
        }
        if (!arg1) {
            field3136++;
        }
    }
}
