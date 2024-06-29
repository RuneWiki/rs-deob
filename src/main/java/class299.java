import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class299 {

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field4456 = 2048;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field4458 = 2048;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field4464 = 0;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field4465 = 0;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field4462 = -1;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[I")
    public static int[] field4461;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4455++;
        if (arg4 >= -104) {
            field4461 = null;
        }
        class229.method1530(arg2, 128, arg0, 0, arg6, arg7, arg1, arg5, arg8, arg3);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZLwn;)V")
    private final void method1920(int arg0, boolean arg1, class519 arg2) {
        if (!arg1) {
            return;
        }
        if (arg0 == 1) {
            this.field4465 = arg2.method3072((byte) -123);
        } else if (arg0 == 2) {
            this.field4458 = arg2.method3018(566990904);
        } else if (arg0 == 3) {
            this.field4456 = arg2.method3018(566990904);
        } else if (arg0 == 4) {
            this.field4464 = arg2.method3044((byte) -108);
        }
        field4460++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method1921(int arg0) {
        class222.method1512(22050, (byte) -123, 2, class220.field3371.field2587);
        field4457++;
        class217.field3302 = new class217();
        class217.field3302.method1473((byte) 109, 9, 128);
        if (arg0 != 27052) {
            field4462 = -61;
        }
        class66.field1118 = class520.method3086(0, class280.field4173, -152, class481.field6991, 22050);
        class66.field1118.method2957(class217.field3302, arg0 ^ 0x69AB);
        class492.method2891(-1, class217.field3302, class386.field5505, class392.field5575, class76.field1248);
        class445.field6350 = class520.method3086(1, class280.field4173, -152, class481.field6991, 2048);
        class504.field7295 = new class240();
        class445.field6350.method2957(class504.field7295, 7);
        class434.field6212 = new class266(22050, class120.field1877);
        class376.field5417 = class425.field6000.method2043((byte) -56, "scape main");
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method1922(byte arg0) {
        if (arg0 == -106) {
            field4461 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILwn;)V")
    public final void method1923(int arg0, class519 arg1) {
        while (true) {
            int var3 = arg1.method3072((byte) -121);
            if (var3 == 0) {
                field4459++;
                if (arg0 != -5) {
                    method1922((byte) 101);
                    return;
                }
                return;
            }
            this.method1920(var3, true, arg1);
        }
    }
}
