import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class97 {

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Lug;")
    public static class335 field1239;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)I", line = 8)
    public static final int method574(int arg0, byte arg1) {
        int var2 = 22 / ((arg1 - 60) / 55);
        field1241++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)V", line = 21)
    public static final void method575(int arg0, int arg1, int arg2, int arg3) {
        field1237++;
        String var4 = "tele " + arg3 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg0 != -13945) {
            field1239 = null;
        }
        System.out.println(var4);
        class258.method1789(true, var4, true);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 43)
    public static void method576(int arg0) {
        if (arg0 != 27778) {
            field1235 = -37;
        }
        field1239 = null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V", line = 55)
    public static final void method577(int arg0) {
        field1240++;
        class320.field4687.method1382((byte) 47);
        class196.field2816.method1056(11281);
        class233.field3444.method1056(11281);
        if (arg0 != -1248208250) {
            field1238 = -125;
        }
    }
}
