import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class262 {

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Le;")
    public static class191 field4638 = class54.method368("gleiten:", 2047);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lwe;")
    public static class147 field4634 = new class147(64);

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field4648 = -1;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lwe;")
    public static class147 field4647 = new class147(5);

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Le;")
    public class191 field4633;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Leg;")
    public static class33 field4649;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Z")
    public boolean field4642;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)I")
    public static final int method1798(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 108 / ((arg3 - 31) / 40);
        field4643++;
        int var6 = 65536 - class15.field206[arg4 * 1024 / arg0] >> 1;
        return ((65536 - var6) * arg1 >> 16) + (arg2 * var6 >> 16);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method1799(byte arg0) {
        if (arg0 != -74) {
            field4647 = null;
        }
        if (class115.field1905 < class216.field3808) {
            class115.field1905 = (float) ((double) class115.field1905 / 30.0D + (double) class115.field1905);
            if (class115.field1905 > class216.field3808) {
                class115.field1905 = class216.field3808;
            }
            class185.method1256(0);
        } else if (class115.field1905 > class216.field3808) {
            class115.field1905 = (float) ((double) class115.field1905 - (double) class115.field1905 / 30.0D);
            if (class216.field3808 > class115.field1905) {
                class115.field1905 = class216.field3808;
            }
            class185.method1256(arg0 ^ 0xFFFFFFB6);
        }
        field4646++;
        if (class225.field4008 == -1 || class270.field4767 == -1) {
            return;
        }
        int var1 = class225.field4008 - class30.field420;
        int var2 = class270.field4767 - class67.field1160;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class225.field4008 = -1;
            class270.field4767 = -1;
        }
        class67.field1160 += var2;
        class30.field420 += var1;
        class185.method1256(0);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)[Lwa;")
    public static final class226[] method1800(byte arg0) {
        field4636++;
        class226[] var1 = new class226[class232.field4145];
        if (arg0 <= 63) {
            field4647 = null;
        }
        for (int var2 = 0; var2 < class232.field4145; var2++) {
            int var3 = class68.field1183[var2] * class47.field842[var2];
            byte[] var4 = class161.field2731[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class19.field261[class167.method1128(255, var4[var6])];
            }
            var1[var2] = new class155(class36.field661, class3.field22, class253.field4489[var2], class245.field4360[var2], class68.field1183[var2], class47.field842[var2], var5);
        }
        class228.method1628((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
    public static final void method1801(byte arg0) {
        field4639++;
        int var1 = 9 / ((-arg0 - 59) / 47);
        class62.field1110.method992(-31);
        class18.field241.method992(-31);
        class163.field2756.method992(-31);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1802(int arg0) {
        field4638 = null;
        field4647 = null;
        field4634 = null;
        if (arg0 != 0) {
            field4647 = null;
        }
        field4649 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
    public static final void method1803(int arg0, int arg1, int arg2, int arg3) {
        field4637++;
        class33 var4 = class10.method74(arg0, arg1, (byte) -4);
        if (arg2 != 14854) {
            field4638 = null;
        }
        if (var4 != null && var4.field536 != null) {
            class61 var5 = new class61();
            var5.field1089 = var4;
            var5.field1101 = var4.field536;
            class12.method87(var5, arg2 - 27788);
        }
        class197.field3523 = true;
        class3.field21 = arg0;
        class147.field2482 = arg3;
        class36.field659 = arg1;
        class184.method1238(var4, (byte) -117);
    }
}
