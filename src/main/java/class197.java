import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class197 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[Z")
    public static boolean[] field3170 = new boolean[100];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lgi;")
    public static class164 field3172;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lpm;")
    public static class7 field3171;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[Lag;")
    public static class197[] field3174;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[[B")
    public static byte[][] field3176;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)I")
    public static final int method1364(int arg0) {
        field3180++;
        int var1 = -70 % ((-arg0 - 89) / 36);
        return class122.field1929 && class8.field170[81] && class291.field4776 > 2 ? class275.field4502[class291.field4776 - 2] : class275.field4502[class291.field4776 - 1];
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public abstract void method15(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public abstract void method13(int arg0, int arg1);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)Lih;")
    public static final class219 method1365(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class219 var4 = var3.field1780;
            var3.field1780 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lfj;II)V")
    public static final void method1366(class274 arg0, int arg1, int arg2) {
        if (class253.field4148 != null) {
            try {
                class253.field4148.method226((byte) -99, 0L);
                class253.field4148.method213(24, arg2, -6722, arg0.field4441);
            } catch (Exception var3) {
            }
        }
        field3173++;
        if (arg1 >= -108) {
            field3172 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1367(byte arg0) {
        field3174 = null;
        field3170 = null;
        if (arg0 > 117) {
            field3172 = null;
            field3171 = null;
            field3176 = null;
        }
    }
}
