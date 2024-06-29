import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class109 implements class607 {

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lfm;")
    public static class456 field1550 = new class456();

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "Lkm;")
    public static class455 field1551;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIBI)V")
    public static final void method732(int arg0, int arg1, byte arg2, int arg3) {
        field1552++;
        if (arg2 > -15) {
            method733((byte) 81);
        }
        if (arg3 == 1007) {
            class318.method1838(class710.field9913, arg1, arg0);
        } else if (arg3 == 1012) {
            class318.method1838(class631.field8999, arg1, arg0);
        } else if (arg3 == 1006) {
            class318.method1838(class435.field5965, arg1, arg0);
            return;
        } else if (arg3 == 1003) {
            class318.method1838(class13.field177, arg1, arg0);
            return;
        } else if (arg3 == 1010) {
            class318.method1838(class639.field9082, arg1, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
    public static void method733(byte arg0) {
        int var1 = -83 % ((arg0 - 67) / 38);
        field1550 = null;
        field1551 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLmha;[IJ)Ljava/lang/String;")
    public final String method734(byte arg0, class701 arg1, int[] arg2, long arg3) {
        field1549++;
        if (class136.field1821 == arg1) {
            class507 var6 = class751.field10442.method991(arg2[0], false);
            return var6.method3023((byte) 47, (int) arg3);
        } else if (class417.field5803 == arg1 || class224.field3147 == arg1) {
            class544 var7 = class487.field6572.method3054((int) arg3, (byte) -99);
            return var7.field7672;
        } else {
            if (arg0 != 54) {
                this.method734((byte) 22, null, null, -31L);
            }
            return class81.field1103 == arg1 || class337.field4337 == arg1 || class638.field9073 == arg1 ? class751.field10442.method991(arg2[0], false).method3023((byte) 69, (int) arg3) : null;
        }
    }
}
