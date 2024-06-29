import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class77 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lok;")
    public static class41 field1139 = class137.method956("; Expires=", 45);

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "F")
    public static float field1144;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lcd;")
    public static class36 field1145;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lok;")
    public static class41 field1146;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "[I")
    public static int[] field1143;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 8)
    public static void method558(int arg0) {
        if (arg0 == -1) {
            field1146 = null;
            field1139 = null;
            field1143 = null;
            field1145 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lok;I)V", line = 42)
    public static final void method559(class41 arg0, int arg1) {
        field1140++;
        int var2 = class131.method923(arg0, (byte) -87);
        if (var2 == -1) {
            return;
        }
        class245.field3909 = class268.field4273.field4762[var2] - class120.field1773;
        int var3 = class245.field3909 - (int) ((float) class67.field1009.field4936 / class178.field2886);
        class296.field4788 = class212.field3414 + class177.field2876 - class268.field4273.field4759[var2] - 1;
        int var4 = (int) ((float) class67.field1009.field4936 / class178.field2886) + class245.field3909;
        if (var3 < 0) {
            class245.field3909 = (int) ((float) class67.field1009.field4936 / class178.field2886);
        }
        int var5 = class296.field4788 - ((int) ((float) class67.field1009.field4949 / class178.field2886));
        if (arg1 != -26557) {
            return;
        }
        int var6 = (int) ((float) class67.field1009.field4949 / class178.field2886) + class296.field4788;
        if (var4 > class66.field1004) {
            class245.field3909 = class66.field1004 - (int) ((float) class67.field1009.field4936 / class178.field2886);
        }
        if (var5 < 0) {
            class296.field4788 = (int) ((float) class67.field1009.field4949 / class178.field2886);
        }
        if (class212.field3414 < var6) {
            class296.field4788 = class212.field3414 - ((int) ((float) class67.field1009.field4949 / class178.field2886));
        }
    }
}
