import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class233 extends class84 {

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field3730 = 0;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    private int field3734 = 4096;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "Llc;")
    public static class86 field3728;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3729;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method1645(int arg0, int arg1) {
        if (arg1 >= -48) {
            field3728 = null;
        }
        class201 var2 = class94.method738(-77, arg0, 12);
        ++field3733;
        var2.method1475(-743577184);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field3736;
        if (arg0 > -125) {
            method1650((String) null, (byte) -60);
        }
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, arg1, false);
            for (int var5 = 0; ~class20.field221 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3730 && ~this.field3734 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1646(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class106.field1537 = arg1;
        class232.field3724 = arg2;
        class263.field4276 = arg3;
        class205.field3288 = new class286[arg0][class106.field1537][class232.field3724];
        class169.field2724 = new int[arg0][class106.field1537 + 1][class232.field3724 + 1];
        if (arg4) {
            class215.field3420 = new class286[1][class106.field1537][class232.field3724];
            class253.field4176 = new int[class106.field1537][class232.field3724];
            class241.field3841 = new int[1][class106.field1537 + 1][class232.field3724 + 1];
        } else {
            class215.field3420 = null;
            class253.field4176 = null;
            class241.field3841 = null;
        }
        class222.method1587(false);
        class250.field4153 = new class174[500];
        class191.field3083 = 0;
        class85.field1238 = new class174[500];
        class274.field4408 = 0;
        class260.field4255 = new int[arg0][class106.field1537 + 1][class232.field3724 + 1];
        class94.field1399 = new class166[5000];
        class29.field342 = 0;
        class297.field4705 = new class166[100];
        class290.field4603 = new boolean[class263.field4276 + class263.field4276 + 1][class263.field4276 + class263.field4276 + 1];
        class104.field1516 = new boolean[class263.field4276 + class263.field4276 + 2][class263.field4276 + class263.field4276 + 2];
        class117.field1676 = new byte[arg0][class106.field1537][class232.field3724];
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method1647(byte arg0) {
        field3728 = null;
        if (arg0 < 44) {
            field3729 = null;
        }
        field3729 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class233() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "(I)V")
    public static final void method1648(int arg0) {
        ++field3737;
        if (arg0 > 115) {
            if (~class43.field620 == -6) {
                class43.field620 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1649(int arg0, String arg1) {
        ++field3735;
        int var2 = class93.method734(false, arg1);
        if (~var2 != 0) {
            int[] var3 = class222.field3551.method1595(16383 & class63.field940.field1165[var2] >> 14, class63.field940.field1165[var2] & 16383, (893400183 & class63.field940.field1165[var2]) >> 28, arg0 ^ 12802);
            class262.method1838(var3[1], var3[arg0], (byte) 5);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field3732;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field3734 = arg0.method1126(false);
            }
        } else {
            this.field3730 = arg0.method1126(false);
        }
        if (arg1 <= 87) {
            field3729 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1650(String arg0, byte arg1) {
        int var2 = class130.method937(arg0, (byte) 15);
        ++field3731;
        if (~var2 != 0) {
            if (arg1 != 69) {
                field3729 = null;
            }
            int[] var3 = class222.field3551.method1595(class63.field940.field1165[var2] >> 14 & 16383, class63.field940.field1165[var2] & 16383, (994964458 & class63.field940.field1165[var2]) >> 28, 12800);
            class262.method1838(var3[1], var3[2], (byte) 5);
        }
    }
}
