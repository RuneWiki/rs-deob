import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class283 extends class305 {

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field4378 = 0;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4372 = "Loaded fonts";

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    public static int field4386 = 0;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "[I")
    public static int[] field4384 = new int[2048];

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "Ljava/awt/Frame;")
    public static Frame field4376;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "[Ltf;")
    public static class112[] field4385;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lsc;III)V", line = 7)
    public static final void method1900(class19 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class306.field4629) {
            class47 var4 = class326.field4975[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field967 != null && var4.field967.field4443.method34()) {
                arg0.method38(var4.field967.field4443, 128, 0, 0, true);
            }
        }
        if (arg3 < class306.field4629) {
            class47 var5 = class326.field4975[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field967 != null && var5.field967.field4443.method34()) {
                arg0.method38(var5.field967.field4443, 0, 0, 128, true);
            }
        }
        if (arg2 < class306.field4629 && arg3 < class39.field762) {
            class47 var6 = class326.field4975[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field967 != null && var6.field967.field4443.method34()) {
                arg0.method38(var6.field967.field4443, 128, 0, 128, true);
            }
        }
        if (arg2 < class306.field4629 && arg3 > 0) {
            class47 var7 = class326.field4975[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field967 != null && var7.field967.field4443.method34()) {
                arg0.method38(var7.field967.field4443, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIIII)V", line = 57)
    public final void method1901(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field4375 << 3;
        field4374++;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field4373 << 3;
        int var9 = (arg0 << 4) + (var8 & arg1);
        this.method902(var6, var8, var7, var9, arg2, arg3);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIII)V", line = 92)
    public static final void method1902(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4371++;
        if (arg2 != -16708) {
            field4381 = 123;
        }
        int var9 = arg6 - arg8;
        int var10 = arg5 - arg4;
        int var11 = (arg7 - arg0 << 16) / var10;
        int var12 = (arg1 - arg3 << 16) / var9;
        class212.method1432(arg8, 0, 0, var11, arg0, arg5, arg4, arg6, var12, 108, arg3);
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V", line = 123)
    public static void method1903(int arg0) {
        field4385 = null;
        field4372 = null;
        if (arg0 > 49) {
            field4376 = null;
            field4384 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V")
    public abstract void method904(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method902(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public abstract void method903(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
    public abstract void method901(int arg0, int arg1);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
    public abstract void method905(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
    public abstract void method896(int arg0, int arg1);

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)V")
    public abstract void method892(int arg0, int arg1);
}
