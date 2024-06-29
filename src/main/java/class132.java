import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class132 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Z")
    public static boolean field2303 = false;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lvh;")
    public static class108 field2304;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method919(int arg0) {
        if (arg0 > -44) {
            field2302 = -5;
        }
        field2304 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)[Lfc;")
    public static final class148[] method920(byte arg0) {
        field2306++;
        class148[] var1 = new class148[class110.field1990];
        if (arg0 < 78) {
            method921(true);
        }
        for (int var2 = 0; var2 < class110.field1990; var2++) {
            var1[var2] = new class148(class79.field1365, class9.field116, class112.field2028[var2], class213.field3588[var2], class110.field1983[var2], class12.field168[var2], class199.field3226[var2], class54.field941);
        }
        class253.method1679((byte) -87);
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static final void method921(boolean arg0) {
        int var1 = -1;
        if (arg0) {
            method920((byte) 37);
        }
        while (var1 < class157.field2624) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class280.field4458[var1];
            }
            class288 var6 = class105.field1874[var5];
            if (var6 != null && var6.field1425 > 0) {
                var6.field1425--;
                if (var6.field1425 == 0) {
                    var6.field1462 = null;
                }
            }
            var1++;
        }
        for (int var2 = 0; var2 < class187.field3037; var2++) {
            int var3 = class292.field4668[var2];
            class141 var4 = class42.field625[var3];
            if (var4 != null && var4.field1425 > 0) {
                var4.field1425--;
                if (var4.field1425 == 0) {
                    var4.field1462 = null;
                }
            }
        }
        field2305++;
    }
}
