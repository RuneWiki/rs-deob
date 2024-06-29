import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class280 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[I")
    private int[] field4874;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lke;")
    public static class256 field4869 = class316.method2202("Konfig geladen)3", 27626);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field4871 = 0;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lee;")
    public static class293 field4875;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V", line = 10)
    public static final void method1961(int arg0, int arg1) {
        field4872++;
        class288.field4986 = arg1;
        class73.field1331 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V", line = 25)
    public static final void method1962() {
        for (int var0 = 0; var0 < class243.field4127; var0++) {
            class269 var1 = class174.field3091[var0];
            class316.method2199(var1);
            class174.field3091[var0] = null;
        }
        class243.field4127 = 0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 48)
    public static void method1963(int arg0) {
        field4875 = null;
        if (arg0 != 1) {
            field4875 = (class293) null;
        }
        field4869 = null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)I", line = 62)
    public final int method1964(int arg0, int arg1) {
        field4873++;
        if (arg1 > -68) {
            this.method1964(115, -90);
        }
        int var3 = (this.field4874.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field4874[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4874[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "([I)V", line = 95)
    public class280(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4874 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4874[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4874[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4874[var5 + var5] = arg0[var4];
            this.field4874[var5 + var5 + 1] = var4++;
        }
    }
}
