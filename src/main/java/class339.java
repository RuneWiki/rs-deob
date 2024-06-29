import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class339 extends class447 {

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field4743 = 0;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4739 = "flash3:";

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "Lbr;")
    public static class223 field4744 = new class223(8);

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lbr;")
    private class223 field4737;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Leb;I)V", line = 4)
    public final void method2174(class371 arg0, int arg1) {
        field4747++;
        if (arg1 != -1) {
            field4739 = null;
        }
        while (true) {
            int var3 = arg0.method2429(0);
            if (var3 == 0) {
                return;
            }
            this.method2179((byte) 76, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)I", line = 25)
    public final int method2175(int arg0, int arg1, byte arg2) {
        field4748++;
        if (this.field4737 == null) {
            return arg1;
        } else if (arg2 == -86) {
            class23 var4 = (class23) this.field4737.method1412((byte) -54, (long) arg0);
            return var4 == null ? arg1 : var4.field316;
        } else {
            return 67;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V", line = 45)
    public static void method2176(int arg0) {
        int var1 = 119 % ((-arg0 - 51) / 51);
        field4744 = null;
        field4739 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;", line = 67)
    public final String method2177(String arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4739 = null;
        }
        field4741++;
        if (this.field4737 == null) {
            return arg0;
        } else {
            class424 var4 = (class424) this.field4737.method1412((byte) -54, (long) arg1);
            return var4 == null ? arg0 : var4.field6098;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I", line = 96)
    public static final int method2178(int arg0, int arg1, int arg2, int arg3) {
        field4738++;
        int var4 = arg2 & 0x3;
        if (arg3 != 15) {
            field4743 = -41;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BILeb;)V", line = 125)
    private final void method2179(byte arg0, int arg1, class371 arg2) {
        int var4 = -62 / ((arg0 + 22) / 34);
        field4746++;
        if (arg1 != 249) {
            return;
        }
        int var5 = arg2.method2429(0);
        if (this.field4737 == null) {
            int var6 = class164.method1089(var5, (byte) -86);
            this.field4737 = new class223(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg2.method2429(0) == 1;
            int var9 = arg2.method2425(19);
            class376 var10;
            if (var8) {
                var10 = new class424(arg2.method2422(-1));
            } else {
                var10 = new class23(arg2.method2413((byte) -30));
            }
            this.field4737.method1419((long) var9, 76, var10);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLqj;)V", line = 172)
    public static final void method2180(byte arg0, class296 arg1) {
        field4740++;
        class78.field1217 = arg1;
        class229.field3064 = class78.field1217.method1911(0, 15);
        if (arg0 != -19) {
            field4743 = 58;
        }
    }
}
