import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class244 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[S")
    public static short[] field3853 = new short[256];

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 3)
    public static void method1661(byte arg0) {
        if (arg0 > -43) {
            field3853 = null;
        }
        field3853 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1662(int arg0) {
        field3851++;
        int var1 = class111.field1558;
        int[] var2 = class318.field4804;
        for (int var3 = 0; var3 < var1; var3++) {
            class177 var7 = class26.field319[var2[var3]];
            if (var7 != null && var7.field1894 > 0) {
                var7.field1894--;
                if (var7.field1894 == 0) {
                    var7.field1898 = null;
                }
            }
        }
        if (arg0 >= -72) {
            method1661((byte) 22);
        }
        for (int var4 = 0; var4 < class167.field2471; var4++) {
            int var5 = class470.field6797[var4];
            class116 var6 = class153.field2265[var5];
            if (var6 != null && var6.field1894 > 0) {
                var6.field1894--;
                if (var6.field1894 == 0) {
                    var6.field1898 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLya;)V", line = 69)
    public static final void method1663(byte arg0, class38 arg1) {
        field3852++;
        if (arg0 != 27) {
            field3853 = null;
        }
        if (class296.field4520 != class398.field5947.field5826 && client.field3311 != null && class521.method3105(arg0 - 19616, arg1, class398.field5947.field5826)) {
            class296.field4520 = class398.field5947.field5826;
        }
    }
}
