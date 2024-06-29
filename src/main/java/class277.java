import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class277 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
    public static int[] field4289 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
    public static boolean field4288 = false;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4287 = 0;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field4293 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Lme;", line = 4)
    public static final class189 method1982(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4236;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 12)
    public static void method1983(int arg0) {
        field4289 = null;
        if (arg0 != -1585) {
            method1984((byte) 18, false);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZ)V", line = 29)
    public static final void method1984(byte arg0, boolean arg1) {
        field4290++;
        byte[][] var2;
        if (class265.field4126 && arg1) {
            var2 = class104.field1756;
        } else {
            var2 = class151.field2425;
        }
        int var3 = class2.field2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class102.field1728[var4] >> 8) * 64 - class177.field2780;
                int var7 = (class102.field1728[var4] & 0xFF) * 64 - class91.field1485;
                class84.method605((byte) 52);
                class65.method500(var7, var6, arg1, -26597, class244.field3772, var5);
            }
        }
        if (arg0 >= -49) {
            field4288 = true;
        }
    }
}
