import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class197 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Leg;")
    public static class272 field3176 = new class272(64);

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[I")
    public static int[] field3181 = new int[50];

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[I")
    public static int[] field3180 = new int[32];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lfi;")
    public static class235 field3179;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "[S")
    public static short[] field3177;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[[[B")
    public static byte[][][] field3178;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lli;IIIZ)V")
    public void method1069(class197 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3173++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lli;")
    public class197 method1091(int arg0, int arg1, int arg2) {
        field3172++;
        return this;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I")
    public static final int method1328(int arg0, int arg1, int arg2, int arg3) {
        field3171++;
        int var4 = arg2 & 0x3;
        if (arg3 != 64) {
            method1328(69, 50, 59, 53);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
    public static final void method1329(int arg0, int arg1) {
        field3175++;
        class257.field4100.method1832(arg1, (byte) -119);
        if (arg0 < 31) {
            field3180 = null;
        }
        class198.field3191.method1832(arg1, (byte) 99);
        class193.field3100.method1832(arg1, (byte) -126);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
    public abstract void method74(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1330(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3174++;
        class103 var7 = class122.method859(arg2, (byte) 125, arg6);
        if (var7 != null && var7.field1614 != null) {
            class173 var8 = new class173();
            var8.field2798 = var7.field1614;
            var8.field2796 = var7;
            class223.method1480(8170, var8);
        }
        class238.field3797 = arg3;
        class274.field4429 = arg5;
        class221.field3526 = arg2;
        class17.field201 = arg1;
        class290.field4632 = true;
        class125.field2098 = arg0;
        int var9 = -99 % ((87 - arg4) / 35);
        class254.field4063 = arg6;
        class45.method346((byte) 25, var7);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()I")
    public abstract int method88();

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()Z")
    public boolean method1092() {
        field3170++;
        return false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIIJILqc;)V")
    public abstract void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class4 arg10);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method1331(byte arg0) {
        field3176 = null;
        field3180 = null;
        field3179 = null;
        if (arg0 <= -74) {
            field3178 = null;
            field3181 = null;
            field3177 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)Lwj;")
    public static final class195 method1332(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class195 var4 = var3.field1494;
            var3.field1494 = null;
            return var4;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3180[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
