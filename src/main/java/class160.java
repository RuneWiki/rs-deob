import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class160 implements class36 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Z")
    public static boolean field2574 = false;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[J")
    public static long[] field2579 = new long[32];

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lnb;")
    public static class95 field2573;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method1004(int arg0) {
        if (arg0 > -61) {
            method1004(-76);
        }
        field2573 = null;
        field2579 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ[IZ)Lqj;")
    public final class196 method184(int arg0, long arg1, int[] arg2, boolean arg3) {
        field2575++;
        if (arg0 == 0) {
            class199 var6 = class33.method176(arg2[0], (byte) 75);
            return var6.method1348((int) arg1, 1);
        } else if (arg0 == 1 || arg0 == 10) {
            class202 var7 = class178.method1154(false, (int) arg1);
            return var7.field3613;
        } else if (arg0 == 6 || arg0 == 7) {
            return class33.method176(arg2[0], (byte) 71).method1348((int) arg1, 1);
        } else {
            if (!arg3) {
                field2574 = false;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILqj;)V")
    public static final void method1005(int arg0, class196 arg1) {
        if (arg0 != 61) {
            field2573 = null;
        }
        field2576++;
        if (class231.field4103 == null) {
            return;
        }
        long var2 = arg1.method1330(0);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (var4 < class231.field4103.length && class231.field4103[var4].field1850 != var2) {
            var4++;
        }
        if (class231.field4103.length > var4 && class231.field4103[var4] != null) {
            class44.field520.method1173(182, 14592);
            class44.field520.method346(class231.field4103[var4].field1850, (byte) 56);
            class203.field3650++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
    public static final void method1006(int arg0, boolean arg1) {
        class181.method1187((byte) 113);
        field2578++;
        if (class56.field741 == 28) {
            return;
        }
        class76.field1094++;
        if (class76.field1094 < 50 && !arg1) {
            return;
        }
        if (arg0 >= -56) {
            method1006(-112, false);
        }
        class76.field1094 = 0;
        if (class175.field2944 || class194.field3408 == null) {
            return;
        }
        class44.field520.method1173(0, 14592);
        try {
            class194.field3408.method484(class44.field520.field693, class44.field520.field699, 0, 3);
            class44.field520.field699 = 0;
        } catch (IOException var2) {
            class175.field2944 = true;
        }
        class90.field1317++;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static final void method1007(int arg0) {
        if (class205.field3683.toLowerCase().indexOf("microsoft") == -1) {
            class10.field109[44] = 71;
            class10.field109[46] = 72;
            if (class205.field3684 == null) {
                class10.field109[192] = 58;
                class10.field109[222] = 59;
            } else {
                class10.field109[192] = 28;
                class10.field109[222] = 58;
                class10.field109[520] = 59;
            }
            class10.field109[61] = 27;
            class10.field109[59] = 57;
            class10.field109[91] = 42;
            class10.field109[47] = 73;
            class10.field109[45] = 26;
            class10.field109[92] = 74;
            class10.field109[93] = 43;
        } else {
            class10.field109[186] = 57;
            class10.field109[222] = 59;
            class10.field109[223] = 28;
            class10.field109[220] = 74;
            class10.field109[187] = 27;
            class10.field109[219] = 42;
            class10.field109[188] = 71;
            class10.field109[191] = 73;
            class10.field109[221] = 43;
            class10.field109[189] = 26;
            class10.field109[190] = 72;
            class10.field109[192] = 58;
        }
        field2577++;
        if (arg0 != 71) {
            field2573 = null;
        }
    }
}
