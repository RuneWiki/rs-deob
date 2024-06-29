import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class597 {

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public int field8631 = 128;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public int field8628 = 128;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public int field8635;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public int field8636;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public int field8624;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public int field8626;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field8622 = 0;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Z")
    public static boolean field8623 = false;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "Z")
    public static boolean field8629 = false;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "Lsv;")
    public static class567 field8632;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Ldq;")
    public final class597 method3525(byte arg0) {
        if (arg0 <= 48) {
            return null;
        } else {
            field8633++;
            return new class597(this.field8635, this.field8631, this.field8628, this.field8636, this.field8626, this.field8624);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method3526(int arg0) {
        field8632 = null;
        if (arg0 != 20885) {
            method3528(42);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)V")
    public static final void method3527(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8630++;
        class479.field6754.field165 = 0;
        class479.field6754.method108((byte) -128, class21.field306.field6351);
        class479.field6754.method108((byte) -128, arg1);
        if (arg4 >= -40) {
            method3529((byte) 75);
        }
        class479.field6754.method108((byte) -128, arg3);
        class479.field6754.method84(arg2, (byte) -114);
        class479.field6754.method84(arg0, (byte) -90);
        class440.field6262 = 0;
        class111.field1721 = -3;
        class208.field2931 = 0;
        class10.field109 = 1;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public static final void method3528(int arg0) {
        field8625++;
        class562.method3206(class491.field6875.field3378, true);
        int var1 = (class563.field7794 >> 10) + (class519.field7304 >> 3);
        class206.field2901 = class645.field9372.field6035 = 0;
        int var2 = (class6.field80 >> 3) + (class462.field6488 >> 10);
        class645.field9372.method1174(8, 8, 62);
        if (arg0 >= -89) {
            field8634 = -117;
        }
        byte var3 = 18;
        class270.field3765 = new int[var3];
        class94.field1452 = new byte[var3][];
        class619.field8864 = new int[var3][4];
        class261.field3629 = new int[var3];
        class525.field7381 = new byte[var3][];
        class633.field9252 = new int[var3];
        class183.field2585 = new int[var3];
        class356.field4799 = new int[var3];
        class324.field4371 = new byte[var3][];
        class14.field198 = new int[var3];
        class219.field3132 = new byte[var3][];
        class493.field6909 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class32.field513 >> 4)) / 8; var5 <= (((class32.field513 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class611.field8786 >> 4)) / 8; var8 <= (((class611.field8786 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class183.field2585[var4] = var9;
                class356.field4799[var4] = class23.field346.method252((byte) 124, "m" + var5 + "_" + var8);
                class14.field198[var4] = class23.field346.method252((byte) 35, "l" + var5 + "_" + var8);
                class261.field3629[var4] = class23.field346.method252((byte) 47, "n" + var5 + "_" + var8);
                class633.field9252[var4] = class23.field346.method252((byte) -84, "um" + var5 + "_" + var8);
                class270.field3765[var4] = class23.field346.method252((byte) -128, "ul" + var5 + "_" + var8);
                if (class261.field3629[var4] == -1) {
                    class356.field4799[var4] = -1;
                    class14.field198[var4] = -1;
                    class633.field9252[var4] = -1;
                    class270.field3765[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class261.field3629.length; var6++) {
            class261.field3629[var6] = -1;
            class356.field4799[var6] = -1;
            class14.field198[var6] = -1;
            class633.field9252[var6] = -1;
            class270.field3765[var6] = -1;
        }
        byte var7;
        if (class440.field6254 == 1 || class440.field6254 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        class228.method1451(var2, var7, var1, 28221, false);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
    public static final void method3529(byte arg0) {
        field8627++;
        int var1 = 0;
        int var2 = 45 % ((arg0 + 79) / 43);
        for (int var3 = 0; var3 < class32.field513; var3++) {
            for (int var4 = 0; var4 < class611.field8786; var4++) {
                if (class47.method469(class356.field4807, var1, var3, true, var4, 119)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ldq;B)V")
    public final void method3530(class597 arg0, byte arg1) {
        this.field8628 = arg0.field8628;
        this.field8635 = arg0.field8635;
        this.field8631 = arg0.field8631;
        field8637++;
        int var3 = 53 % ((-arg1 - 29) / 42);
        this.field8624 = arg0.field8624;
        this.field8626 = arg0.field8626;
        this.field8636 = arg0.field8636;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
    public class597(int arg0) {
        this.field8635 = arg0;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIII)V")
    private class597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8631 = arg1;
        this.field8636 = arg3;
        this.field8624 = arg5;
        this.field8628 = arg2;
        this.field8635 = arg0;
        this.field8626 = arg4;
    }
}
