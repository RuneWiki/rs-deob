import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class300 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field4760 = 0;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field4764 = 0;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lrm;")
    public static class234 field4763 = new class234(128);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lmo;")
    public static class447 field4759;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Lmo;")
    public static class447 field4765;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static void method2019(byte arg0) {
        field4763 = null;
        field4765 = null;
        field4759 = null;
        int var1 = -69 / ((arg0 + 84) / 39);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I")
    public static final int method2020(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        field4761++;
        int var3 = (arg1 & var2 >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
    public static final void method2021(boolean arg0) {
        field4762++;
        class19.field254 = -1;
        class132.field2062 = -1;
        class193.field3143 = 0;
        if (!arg0) {
            method2019((byte) -93);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)V")
    public static final void method2022(int arg0, int arg1, byte arg2) {
        field4758++;
        if (arg2 < 11) {
            method2020(126, 55);
        }
        class211 var3 = class281.method1921(12, arg1, (byte) -98);
        var3.method1490((byte) 117);
        var3.field3379 = arg0;
    }
}
