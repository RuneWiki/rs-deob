import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class612 extends class637 {

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "Led;")
    public static class645 field8650;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 9)
    public static void method3421(byte arg0) {
        field8650 = null;
        int var1 = 53 / ((49 - arg0) / 53);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 21)
    public static final void method3422(int arg0) {
        if (class314.field4055 == null) {
            class314.field4055 = class44.method220(-17770);
            class534.field7635 = class314.field4055[0];
        }
        field8649++;
        if (arg0 != -23587) {
            return;
        }
        class44 var1 = class534.field7635;
        int var2 = class456.method2600(18);
        if (class534.field7635 == var1) {
            class412.field5471 = class534.field7635.field455.method1296(class226.field2899, (byte) 114);
            if (class534.field7635.field461) {
                class412.field5471 = class412.field5471 + var2 + "%";
            }
            class112.field1300 = class534.field7635.field462;
        } else if (class534.field7635 == class44.field494) {
            class508.method2921(3, (byte) -115);
        } else {
            class412.field5471 = var1.field463.method1296(class226.field2899, (byte) -106);
            class112.field1300 = var1.field458;
        }
        if (class465.field6456 == null) {
            return;
        }
        for (int var3 = class591.field8397 + 1; var3 < class465.field6456.length; var3++) {
            if (class465.field6456[var3].method1753(26630) >= 100 && (var3 - 1) == class591.field8397 && class351.field4601 >= 1 && class465.field6456[var3].method1751((byte) -29)) {
                class465.field6456[var3].method1750((byte) 39);
                class136.method763(class465.field6456[var3], true);
                class591.field8397++;
            }
        }
    }
}
