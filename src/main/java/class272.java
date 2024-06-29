import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class272 extends class206 {

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "[I")
    public int[] field4625 = new int[] { 0 };

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "[I")
    public int[] field4627 = new int[] { -1 };

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "Lmh;")
    public static class62 field4628 = class201.method1405(true, "AUS");

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Lwg;")
    public static class24 field4630;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "Lhi;")
    public static class26 field4629;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lik;")
    public static class309 field4626;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method1863(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class176.field2819 <= arg1 && arg1 <= class52.field755) {
            int var5 = class4.method17(class99.field1630, -16168, class81.field1348, arg4);
            int var6 = class4.method17(class99.field1630, -16168, class81.field1348, arg2);
            class277.method1894(arg0, 1, var5, var6, arg1);
        }
        field4624++;
        int var7 = 44 % ((-arg3 - 46) / 53);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 23)
    public static final void method1864(int arg0) {
        field4632++;
        if (arg0 <= 11) {
            method1864(33);
        }
        class75.field1223.method1695((byte) 103);
        int var1 = class75.field1223.method1687(1, (byte) 26);
        if (var1 == 0) {
            return;
        }
        int var2 = class75.field1223.method1687(2, (byte) 26);
        if (var2 == 0) {
            class21.field224[class294.field5010++] = 2047;
        } else if (var2 == 1) {
            int var10 = class75.field1223.method1687(3, (byte) 26);
            class268.field4551.method1580(false, (byte) -92, var10);
            int var11 = class75.field1223.method1687(1, (byte) 26);
            if (var11 == 1) {
                class21.field224[class294.field5010++] = 2047;
            }
        } else if (var2 == 2) {
            int var7 = class75.field1223.method1687(3, (byte) 26);
            class268.field4551.method1580(true, (byte) -92, var7);
            int var8 = class75.field1223.method1687(3, (byte) 26);
            class268.field4551.method1580(true, (byte) -92, var8);
            int var9 = class75.field1223.method1687(1, (byte) 26);
            if (var9 == 1) {
                class21.field224[class294.field5010++] = 2047;
            }
        } else if (var2 == 3) {
            int var3 = class75.field1223.method1687(1, (byte) 26);
            if (var3 == 1) {
                class21.field224[class294.field5010++] = 2047;
            }
            int var4 = class75.field1223.method1687(7, (byte) 26);
            int var5 = class75.field1223.method1687(7, (byte) 26);
            class7.field85 = class75.field1223.method1687(2, (byte) 26);
            int var6 = class75.field1223.method1687(1, (byte) 26);
            class268.field4551.method1096(var4, var5, var6 == 1, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 104)
    public static void method1865(int arg0) {
        if (arg0 != 99999) {
            field4629 = (class26) null;
        }
        field4629 = null;
        field4626 = null;
        field4628 = null;
        field4630 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIILmh;IJI)V", line = 120)
    public static final void method1866(int arg0, int arg1, int arg2, class62 arg3, int arg4, long arg5, int arg6) {
        field4631++;
        class92 var8 = new class92(128);
        var8.method717(1, 10);
        if (arg2 <= 38) {
            field4628 = (class62) null;
        }
        var8.method738((byte) 66, (int) (Math.random() * 99999.0D));
        var8.method738((byte) -66, 513);
        var8.method694(arg5, (byte) -34);
        var8.method712((int) (Math.random() * 9.9999999E7D), 122);
        var8.method710(arg3, false);
        var8.method712((int) (Math.random() * 9.9999999E7D), -15);
        var8.method738((byte) 76, class291.field4950);
        var8.method717(1, arg6);
        var8.method717(1, arg4);
        var8.method712((int) (Math.random() * 9.9999999E7D), -83);
        var8.method738((byte) 84, arg0);
        var8.method738((byte) -64, arg1);
        var8.method712((int) (Math.random() * 9.9999999E7D), 120);
        var8.method697(class29.field402, (byte) 115, class218.field3768);
        class170.field2772.field1476 = 0;
        class170.field2772.method717(1, 140);
        class170.field2772.method717(1, var8.field1476);
        class170.field2772.method726(0, var8.field1476, (byte) -3, var8.field1495);
        class243.field4131 = -3;
        class265.field4466 = 1;
        class176.field2817 = 0;
        class80.field1340 = 0;
    }
}
