import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class314 extends class277 {

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lii;")
    public static class227 field4844 = new class227(64);

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field4848 = 0;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 16)
    public static void method2197(byte arg0) {
        field4844 = null;
        if (arg0 <= 77) {
            method2198(111, 48, -106, 36, -6);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V", line = 26)
    public static final void method2198(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4846++;
        int var5 = 0;
        class279.method1997(arg1 + arg3, arg2 + -824384950, arg1 - arg3, arg0, class206.field2886[arg4]);
        int var6 = arg3;
        int var7 = -arg3;
        if (arg2 != 2) {
            field4848 = 14;
        }
        int var8 = -1;
        while (var5 < var6) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class206.field2886[arg4 - var6];
                var7 -= var6 << 1;
                int var10 = arg1 - var5;
                int var11 = arg1 + var5;
                int[] var12 = class206.field2886[arg4 + var6];
                class279.method1997(var11, -824384948, var10, arg0, var12);
                class279.method1997(var11, -824384948, var10, arg0, var9);
            }
            int var13 = arg1 - var6;
            int var14 = arg1 + var6;
            int[] var15 = class206.field2886[arg4 + var5];
            int[] var16 = class206.field2886[arg4 - var5];
            class279.method1997(var14, arg2 - 824384950, var13, arg0, var15);
            class279.method1997(var14, arg2 ^ 0xCEDCE24E, var13, arg0, var16);
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 96)
    public static final void method2199(int arg0) {
        class287 var1 = class184.field2662;
        synchronized (class184.field2662) {
            class35.field413++;
            if (arg0 < 78) {
                return;
            }
            class261.field3953 = class94.field1229;
            class211.field2987 = class115.field1630;
            class161.field2216 = class9.field118;
            class196.field2814 = class196.field2811;
            class148.field2055 = class269.field4247;
            class224.field3184 = class157.field2168;
            class330.field5036 = class343.field5325;
            class196.field2811 = 0;
        }
        field4845++;
    }
}
