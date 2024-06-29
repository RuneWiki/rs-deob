import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class240 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lng;")
    public static class190 field3335 = new class190(128);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Llf;")
    public static class130 field3337;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method1521(int arg0) {
        class403.field5872 = true;
        field3336++;
        if (arg0 != -5001) {
            method1521(-101);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method1522(byte arg0) {
        field3335 = null;
        if (arg0 > -9) {
            method1523(true, 26);
        }
        field3337 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method1523(boolean arg0, int arg1) {
        field3334++;
        if (arg1 == 100 && class407.field5916 > 0) {
            byte[] var2 = class45.field683[--class407.field5916];
            class45.field683[class407.field5916] = null;
            return var2;
        }
        if (arg0) {
            field3335 = null;
        }
        if (arg1 == 5000 && class44.field673 > 0) {
            byte[] var3 = class157.field2218[--class44.field673];
            class157.field2218[class44.field673] = null;
            return var3;
        } else if (arg1 == 30000 && class103.field1560 > 0) {
            byte[] var4 = class344.field4812[--class103.field1560];
            class344.field4812[class103.field1560] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
