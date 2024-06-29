import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class88 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1098 = 0;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1102 = -1;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lwh;")
    public static class11 field1097;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)[Lbi;", line = 7)
    public static final class91[] method517(int arg0) {
        class91[] var1 = new class91[class21.field266];
        field1100++;
        int var2 = 0;
        if (arg0 != 255) {
            return (class91[]) null;
        }
        while (class21.field266 > var2) {
            int var3 = class54.field664[var2] * class264.field4159[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class153.field2105[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class134.field1854[class229.method1613(255, var5[var6])];
            }
            if (class250.field3787) {
                var1[var2] = new class202(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], var4);
            } else {
                var1[var2] = new class189(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], var4);
            }
            var2++;
        }
        class321.method2238(-12);
        return var1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 49)
    public static void method518(byte arg0) {
        if (arg0 < -69) {
            field1097 = null;
        }
    }
}
