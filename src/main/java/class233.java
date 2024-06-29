import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class233 {

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Llm;")
    public static class150 field3646 = new class150(64);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field3650 = 7759444;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3648 = new String[8];

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "[Z")
    public static boolean[] field3651 = new boolean[112];

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3649 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field3653 = -1;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "[I")
    public static int[] field3652 = new int[4096];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
    public static final void method1529(int arg0, int arg1, int arg2) {
        field3643++;
        class189.field2864[arg1] = arg2;
        class194 var3 = (class194) class107.field1530.method1453(true, (long) arg1);
        if (arg0 != 0) {
            method1529(-45, -97, -117);
        }
        if (var3 == null) {
            class194 var4 = new class194(class299.method2006(arg0 + 9594) + 500L);
            class107.field1530.method1452((long) arg1, var4, 0);
        } else {
            var3.field2957 = class299.method2006(9594) + 500L;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IBILjava/lang/String;)V")
    public static final void method1530(String arg0, String arg1, int arg2, String arg3, int arg4, byte arg5, int arg6, String arg7) {
        int var8 = 99;
        if (arg5 != -51) {
            method1529(-39, 96, 84);
        }
        while (var8 > 0) {
            class35.field537[var8] = class35.field537[var8 - 1];
            class2.field13[var8] = class2.field13[var8 - 1];
            class126.field1778[var8] = class126.field1778[var8 - 1];
            class84.field1189[var8] = class84.field1189[var8 - 1];
            class113.field1615[var8] = class113.field1615[var8 - 1];
            class245.field3850[var8] = class245.field3850[var8 - 1];
            class124.field1745[var8] = class124.field1745[var8 - 1];
            var8--;
        }
        class54.field771 = class142.field1953;
        field3641++;
        class148.field2025++;
        class126.field1778[0] = arg3;
        class84.field1189[0] = arg7;
        class35.field537[0] = arg6;
        class2.field13[0] = arg4;
        class113.field1615[0] = arg1;
        class245.field3850[0] = arg0;
        class124.field1745[0] = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ[B)I")
    public static final int method1531(int arg0, boolean arg1, byte[] arg2) {
        if (arg1) {
            method1533(-90, (byte) -21);
        }
        field3644++;
        return class275.method1787((byte) 112, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method1532(byte arg0) {
        field3652 = null;
        field3646 = null;
        if (arg0 > 96) {
            field3649 = null;
            field3651 = null;
            field3648 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)V")
    public static final void method1533(int arg0, byte arg1) {
        field3642++;
        int var2 = -96 / ((arg1 + 39) / 50);
        class2.field1.method943(arg0, true);
        class145.field1998.method943(arg0, true);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static final void method1534(int arg0) {
        field3647++;
        class167.field2392.method944(92);
        if (arg0 == 5414) {
            class106.field1520.method944(-61);
            class260.field4192.method944(118);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3652[var0] = class166.method1060(var0, true);
        }
    }
}
