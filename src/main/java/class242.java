import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class242 {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "S")
    public static short field4192 = 1;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public int field4189;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public int field4190;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public int field4198;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[B")
    public byte[] field4194;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[B")
    public byte[] field4197;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1768(int arg0) {
        field4191++;
        int var1 = -1;
        if (arg0 != 10586) {
            method1768(66);
        }
        while (var1 < class163.field2862) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class194.field3307[var1];
            }
            class41 var3 = class284.field4888[var2];
            if (var3 != null && var3.field1878 > 0) {
                var3.field1878--;
                if (var3.field1878 == 0) {
                    var3.field1875 = null;
                }
            }
            var1++;
        }
        for (int var4 = 0; var4 < class218.field3707; var4++) {
            int var5 = class254.field4422[var4];
            class232 var6 = class2.field12[var5];
            if (var6 != null && var6.field1878 > 0) {
                var6.field1878--;
                if (var6.field1878 == 0) {
                    var6.field1875 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 88)
    public static final void method1769(int arg0) {
        class112.field2072.method1187(arg0 ^ arg0);
        field4185++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 97)
    public static final void method1770(byte arg0) {
        field4184++;
        if (arg0 <= 104) {
            method1769(54);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class249.field4328[var1] = true;
        }
    }
}
