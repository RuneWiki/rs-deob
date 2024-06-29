import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class305 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lni;")
    public static class24 field5161 = new class24(32);

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[I")
    public static int[] field5167 = new int[100];

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field5166 = 0;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "F")
    public static float field5168;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "[Lad;")
    public static class129[] field5169;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lcm;IZIII)V", line = 13)
    public static final void method2083(class194 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field5163++;
        if (class131.field2313 >= 50 || arg0.field3357 == null || arg4 >= arg0.field3357.length || arg0.field3357[arg4] == null) {
            return;
        }
        int var6 = arg0.field3357[arg4][0];
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 >> 8;
        int var9 = var6 & 0xF;
        if (arg0.field3357[arg4].length > 1) {
            int var10 = (int) ((double) arg0.field3357[arg4].length * Math.random());
            if (var10 > 0) {
                var8 = arg0.field3357[arg4][var10];
            }
        }
        if (var9 == 0) {
            if (arg2) {
                class193.method1321(0, var7, -94, var8);
            }
        } else if (class31.field531 != 0) {
            int var11 = (arg3 - 64) / 128;
            class232.field4039[class131.field2313] = var8;
            class47.field857[class131.field2313] = var7;
            class234.field4047[class131.field2313] = 0;
            class245.field4359[class131.field2313] = null;
            int var12 = (arg1 + arg5) / 128;
            class226.field3866[class131.field2313] = (var12 << 8) + (var11 << 16) + var9;
            class131.field2313++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 74)
    public static void method2084(int arg0) {
        field5169 = null;
        field5161 = null;
        if (arg0 == 16193) {
            field5167 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lrd;", line = 89)
    public static final class173 method2085(int arg0, int arg1) {
        field5162++;
        class173 var2 = (class173) class107.field1868.method229((long) arg1, -14);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class320.field5413.method1275(arg1, arg0, -5211);
        class173 var4 = new class173();
        if (var3 != null) {
            var4.method1174(arg1, -105, new class14(var3));
        }
        class107.field1868.method227(-25077, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I", line = 110)
    public static int method2086(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
