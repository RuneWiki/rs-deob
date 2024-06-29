import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class352 {

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Lsh;")
    public static class472 field5359 = new class472(18, 6);

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "[I")
    public static int[] field5363 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lat;")
    public static class412 field5362 = new class412();

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field5365 = 0;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Lsm;")
    public static class442 field5364;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(Ltq;I)Lcj;")
    public abstract class123 method252(class63 arg0, int arg1);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method2171(int arg0) {
        if (arg0 != 20135) {
            method2174(120, 19, 77, -20);
        }
        field5362 = null;
        field5364 = null;
        field5363 = null;
        field5359 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)I")
    public static final int method2172(int arg0, int arg1, int arg2, int arg3) {
        field5360++;
        if (arg3 != 0) {
            method2173(-66);
        }
        if (arg0 < arg2) {
            return arg2;
        } else if (arg1 < arg0) {
            return arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILtq;)V")
    public abstract void method260(int arg0, class63 arg1);

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public abstract void method249(int arg0);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ltq;III)Z")
    public abstract boolean method259(class63 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BZLtq;Lhm;III)V")
    public abstract void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)Z")
    public abstract boolean method253(int arg0);

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
    public static final void method2173(int arg0) {
        field5361++;
        if (arg0 <= 10) {
            field5365 = 17;
        }
        if (!class317.field4757) {
            return;
        }
        while (true) {
            while (class201.field3056.length > class84.field1193) {
                class187 var1 = class201.field3056[class84.field1193];
                if (var1 != null && var1.field2846 == -1) {
                    if (class78.field1097 == null) {
                        class78.field1097 = class279.field4229.method605(var1.field2837, 16236);
                    }
                    int var2 = class78.field1097.field5096;
                    if (var2 == -1) {
                        return;
                    }
                    class84.field1193++;
                    class78.field1097 = null;
                    var1.field2846 = var2;
                } else {
                    class84.field1193++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIII)V")
    public static final void method2174(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class337.field5038.field3946 * arg0 >> 8;
        field5358++;
        if (arg1 != -3235) {
            method2173(43);
        }
        if (arg2 == -1 && !class208.field3142) {
            class327.method2014((byte) -86);
        } else if (arg2 != -1 && (class487.field6840 != arg2 || !class332.method2034((byte) -115)) && var4 != 0 && !class208.field3142) {
            class378.method2317(var4, class43.field598, false, 0, arg2, 11204, arg3);
        }
        class487.field6840 = arg2;
    }
}
