import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class76 extends class236 {

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Lsg;")
    public static class30 field1678 = class167.method1221((byte) 33, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[Z")
    public static boolean[] field1677 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
    public static boolean field1676;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)[Lbj;")
    public static final class44[] method681(boolean arg0) {
        field1671++;
        if (!arg0) {
            field1676 = true;
        }
        class44[] var1 = new class44[class23.field435];
        for (int var2 = 0; var2 < class23.field435; var2++) {
            int var3 = class62.field1329[var2] * class2.field33[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class222.field3992[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class191.field3475[class68.method612(var5[var6], 255)];
            }
            var1[var2] = new class152(class190.field3464, class273.field4774, class142.field2752[var2], class37.field895[var2], class62.field1329[var2], class2.field33[var2], var4);
        }
        class175.method1285((byte) 53);
        return var1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBZI)V")
    public static final void method682(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        if (arg2 != -7) {
            method682(6, -52, (byte) 47, true, 15);
        }
        field1675++;
        if (class1.method9(arg4, (byte) -13)) {
            class44.method447(-1, arg1, arg0, arg3, false, class259.field4572[arg4]);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
    public class76(int arg0, int arg1) {
        this.field1673 = arg0;
        this.field1672 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static void method683(int arg0) {
        if (arg0 != 0) {
            field1674 = -89;
        }
        field1677 = null;
        field1678 = null;
    }
}
