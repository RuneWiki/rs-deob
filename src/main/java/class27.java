import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class27 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lsf;")
    public static class124 field679 = new class124(5);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Luo;B)V", line = 10)
    public static final void method217(class107 arg0, byte arg1) {
        field680++;
        long var2 = 0L;
        if (arg0.field1952 == 0) {
            var2 = class272.method1923(arg0.field1950, arg0.field1944, arg0.field1936);
        }
        if (arg0.field1952 == 1) {
            var2 = class23.method202(arg0.field1950, arg0.field1944, arg0.field1936);
        }
        int var4 = -115 % ((arg1 + 1) / 44);
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (arg0.field1952 == 2) {
            var2 = class177.method1256(arg0.field1950, arg0.field1944, arg0.field1936);
        }
        if (arg0.field1952 == 3) {
            var2 = class146.method1000(arg0.field1950, arg0.field1944, arg0.field1936);
        }
        if (var2 != 0L) {
            var5 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var2 & 0x7CD39) >> 14;
            var7 = ((int) var2 & 0x3C1041) >> 20;
        }
        arg0.field1941 = var6;
        arg0.field1947 = var5;
        arg0.field1949 = var7;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 52)
    public static void method218(int arg0) {
        if (arg0 == 18059) {
            field679 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V", line = 66)
    public static final void method219(int arg0, int arg1) {
        class105.field1924[1] = (float) (class83.method613(arg0, 65305) >> 8) / 255.0F;
        field681++;
        class105.field1924[0] = (float) class83.method613(arg0 >> 16, 255) / 255.0F;
        class105.field1924[2] = (float) class83.method613(arg0, 255) / 255.0F;
        if (arg1 > -124) {
            method219(17, 89);
        }
        class114.method846(26186, 3);
        class114.method846(26186, 4);
    }
}
