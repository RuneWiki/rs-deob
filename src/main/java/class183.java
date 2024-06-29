import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class183 extends class177 {

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "[Lqd;")
    public static class50[] field2633 = new class50[29];

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Ldh;")
    public static class179 field2640 = new class179(4);

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Lod;")
    public static class28 field2642;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "Ljg;")
    public class315 field2645;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "[B")
    public byte[] field2641;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V", line = 4)
    public static void method1270(int arg0) {
        field2642 = null;
        field2640 = null;
        if (arg0 != 18276) {
            method1271(-125, -124L);
        }
        field2633 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IJ)V", line = 17)
    public static final void method1271(int arg0, long arg1) {
        field2634++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != 1) {
            field2642 = (class28) null;
        }
        for (int var3 = 0; var3 < class96.field1248; var3++) {
            if (class113.field1615[var3] == arg1) {
                class72.field910++;
                class96.field1248--;
                for (int var4 = var3; var4 < class96.field1248; var4++) {
                    class113.field1615[var4] = class113.field1615[var4 + 1];
                    class37.field439[var4] = class37.field439[var4 + 1];
                    class100.field1317[var4] = class100.field1317[var4 + 1];
                }
                class186.field2686 = class331.field5060;
                class140.field1954.method573(122, 247);
                class140.field1954.method678(arg1, (byte) 116);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)[B", line = 61)
    public final byte[] method45(int arg0) {
        field2636++;
        if (arg0 < 109) {
            method1274((byte) 7);
        }
        if (this.field2578) {
            throw new RuntimeException();
        }
        return this.field2641;
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V", line = 80)
    public static final void method1272(int arg0) {
        field2638++;
        class62.field770.method1241(127);
        if (arg0 > -117) {
            method1274((byte) -121);
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)I", line = 99)
    public final int method41(int arg0) {
        field2646++;
        if (arg0 <= 86) {
            field2633 = (class50[]) null;
        }
        return this.field2578 ? 0 : 100;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I", line = 113)
    public static final int method1273(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -106) {
            method1270(-5);
        }
        field2644++;
        if ((class264.field4163[arg2][arg0][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (class264.field4163[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 131)
    public static final void method1274(byte arg0) {
        field2635++;
        if (class60.field739 == 5) {
            class60.field739 = 6;
            if (arg0 != -79) {
                method1271(83, -117L);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILlc;)[Lbi;", line = 155)
    public static final class91[] method1275(int arg0, int arg1, int arg2, class175 arg3) {
        field2643++;
        if (class304.method2132((byte) -46, arg0, arg1, arg3)) {
            int var4 = -25 % ((-arg2 - 61) / 42);
            return class88.method517(255);
        } else {
            return null;
        }
    }
}
