import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class90 extends class223 {

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Lpf;")
    public static class425 field1272 = new class425(62, 8);

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Lpf;")
    public static class425 field1274 = new class425(80, 3);

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "[I")
    public static int[] field1278 = new int[13];

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "Ljava/awt/Frame;")
    public static Frame field1277;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static final void method589(int arg0) {
        class241 var1 = class386.field5705;
        synchronized (class386.field5705) {
            class386.field5705.method1482((byte) 126);
        }
        field1270++;
        class241 var2 = class306.field4633;
        synchronized (class306.field4633) {
            class306.field4633.method1482((byte) -107);
        }
        if (arg0 != 1) {
            field1274 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)Lkm;")
    public static final class87 method590(int arg0, int arg1) {
        field1273++;
        class87 var2 = (class87) class265.field4045.method1491((long) arg0, arg1 ^ arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class333.field4971.method823(1, -20334, arg0);
        class87 var4 = new class87();
        if (var3 != null) {
            var4.method570(new class385(var3), arg0, 0);
        }
        class265.field4045.method1488(128, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method591(boolean arg0) {
        if (!arg0) {
            method590(-48, 8);
        }
        field1278 = null;
        field1274 = null;
        field1277 = null;
        field1272 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)[Lfj;")
    public static final class437[] method592(boolean arg0) {
        if (!arg0) {
            field1272 = null;
        }
        field1271++;
        return new class437[] { class386.field5688, class386.field5691, class386.field5692, class386.field5693, class386.field5694, class386.field5695, class386.field5696, class386.field5697, class386.field5698, class386.field5699 };
    }
}
