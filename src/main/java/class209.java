import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class209 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[I")
    public static int[] field3424 = new int[100];

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZ)V")
    public static final void method1445(int arg0, int arg1, boolean arg2) {
        field3425++;
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class238.field3866[arg0];
        int var5 = class148.field2387[arg0];
        if (arg1 == 0) {
            class68.field1113.method534((byte) 46, 198);
            class131.field2094++;
            class68.field1113.method1548(-494964184, var3 + var3 + 3);
        }
        if (arg1 == 1) {
            class200.field3189++;
            class68.field1113.method534((byte) -99, 97);
            class68.field1113.method1548(-494964184, var3 + var3 + 3 + 14);
        }
        if (arg1 == 2) {
            class122.field1980++;
            class68.field1113.method534((byte) -97, 152);
            class68.field1113.method1548(-494964184, var3 + var3 + 3);
        }
        if (!arg2) {
            return;
        }
        class68.field1113.method1514(var4 + class50.field884, (byte) -124);
        class68.field1113.method1520(7398, class73.field1193[82] ? 1 : 0);
        class76.field1228 = class238.field3866[0];
        class235.field3837 = class148.field2387[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class68.field1113.method1508(class238.field3866[arg0] - var4, true);
            class68.field1113.method1520(7398, class148.field2387[arg0] - var5);
        }
        class68.field1113.method1559((byte) 118, class214.field3501 + var5);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3424 = null;
        int var1 = -19 / ((arg0 + 3) / 63);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lac;")
    public static final class135 method1447(int arg0, int arg1) {
        field3421++;
        class135 var2 = (class135) class136.field2246.method480((long) arg0, 123);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class145.field2328.method1357(class64.method456((byte) -127, arg0), class273.method1841(arg0, -117), arg1 ^ 0x19FC);
        class135 var4 = new class135();
        var4.field2173 = arg0;
        if (var3 != null) {
            var4.method951(-28643, new class221(var3));
        }
        var4.method943(10);
        if (arg1 != -6653) {
            method1447(-126, -59);
        }
        if (var4.field2202) {
            var4.field2169 = 0;
            var4.field2212 = false;
        }
        if (!class201.field3208 && var4.field2155) {
            var4.field2166 = null;
        }
        class136.field2246.method474((long) arg0, (byte) 23, var4);
        return var4;
    }
}
