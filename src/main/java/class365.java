import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class365 {

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field5180 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lbi;")
    public static class281 field5179 = new class281(0, -1);

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
    public static int[] field5185 = new int[5];

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lgb;")
    public static class117 field5184;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILtq;II)Lth;")
    public static final class355 method2335(int arg0, class376 arg1, int arg2, int arg3) {
        field5183++;
        byte[] var4 = arg1.method2431((byte) 95, arg0, arg2);
        if (var4 == null) {
            return null;
        } else {
            if (arg3 != 0) {
                field5180 = 51;
            }
            return new class355(var4);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public abstract void method2204(int arg0);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Lfp;")
    public abstract class176 method2199(int arg0);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method2208(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method2336(byte arg0) {
        field5182++;
        int var1 = 30 / ((arg0 - 1) / 55);
        class324.field4614.method1887(-101);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public abstract void method2209(byte arg0);

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static void method2337(int arg0) {
        field5185 = null;
        field5179 = null;
        field5184 = null;
        if (arg0 != 5) {
            method2338(53);
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public static final void method2338(int arg0) {
        field5181++;
        class176.field2399 = 0;
        class141.field1738 = arg0;
        class125.method786(-125);
        class384.method2465(arg0 - 19620);
        class69.method390(0);
        class39.method233(false);
        for (int var1 = 0; var1 < class141.field1738; var1++) {
            int var3 = class183.field2507[var1];
            if (class189.field2726 != class26.field314[var3].field5625) {
                if (class26.field314[var3].field471 > 0) {
                    class405.method2590(class26.field314[var3], arg0 - 3);
                }
                class26.field314[var3] = null;
            }
        }
        if (class55.field658 != class359.field5120.field3320) {
            throw new RuntimeException("gpp1 pos:" + class359.field5120.field3320 + " psize:" + class55.field658);
        }
        for (int var2 = 0; var2 < class305.field4287; var2++) {
            if (class26.field314[class94.field1135[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class305.field4287);
            }
        }
    }
}
