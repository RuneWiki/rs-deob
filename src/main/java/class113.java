import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class113 {

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Z")
    public boolean field2044 = true;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ltg;")
    public static class184 field2032 = class135.method812("Ein kostenloses Spielkonto erstellen)3", 3);

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Ltg;")
    private static class184 field2040 = class135.method812("Could not complete login)3", 3);

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Ltg;")
    public static class184 field2033 = field2040;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Z")
    public static boolean field2038;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method695(int arg0) {
        if (arg0 < 28) {
            field2045 = 109;
        }
        field2032 = null;
        field2033 = null;
        field2040 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BLpb;II)V")
    public static final void method696(byte[] arg0, class143 arg1, int arg2, int arg3) {
        class15 var4 = new class15();
        var4.field292 = arg2;
        field2029++;
        var4.field289 = arg0;
        var4.field281 = arg1;
        var4.field2393 = arg3;
        class69 var5 = class157.field2806;
        synchronized (class157.field2806) {
            class157.field2806.method402(16777215, var4);
        }
        class44.method260(~arg2);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static final void method697(int arg0) {
        field2030++;
        if (!class170.field3244) {
            class38.field719[0] = class16.field305;
            class54.field960[0] = 1007;
            class174.field3298[0] = class170.field3242;
            class133.field2404 = 1;
        }
        if (arg0 != -14790) {
            return;
        }
        if (class110.field1986 != -1) {
            class168.method1047(class110.field1986, true);
        }
        for (int var1 = 0; var1 < class11.field199; var1++) {
            if (class99.field1849[var1]) {
                class134.field2427[var1] = true;
            }
            class175.field3329[var1] = class99.field1849[var1];
            class99.field1849[var1] = false;
        }
        class25.field453 = -1;
        class209.field4009 = class161.field2903;
        class44.field845 = null;
        class73.field1371 = -1;
        if (class110.field1986 != -1) {
            class11.field199 = 0;
            class62.method350(0, 0, -1, 0, class110.field1986, 0, 503, 765, 0);
        }
        class4.method32();
        class188.method1189(92);
        if (class170.field3244) {
            class68.method396((byte) 98);
        } else if (class73.field1371 != -1) {
            class66.method387(class25.field453, class73.field1371, -21040);
        }
        if (class184.field3524 == 3) {
            for (int var2 = 0; var2 < class11.field199; var2++) {
                if (class175.field3329[var2]) {
                    class4.method19(class198.field3859[var2], class194.field3767[var2], class55.field984[var2], class133.field2411[var2], 16711935, 128);
                } else if (class134.field2427[var2]) {
                    class4.method19(class198.field3859[var2], class194.field3767[var2], class55.field984[var2], class133.field2411[var2], 16711680, 128);
                }
            }
        }
        client.method189(class46.field872.field614, -124, class46.field872.field635, class170.field3231, class47.field892);
        class170.field3231 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public static final void method698(int arg0) {
        field2037++;
        int var1 = class125.field2261.method1353(class150.field2699);
        for (int var2 = 0; var2 < class133.field2404; var2++) {
            int var6 = class125.field2261.method1353(class210.method1333(false, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        class170.field3244 = true;
        class67.field1302 = class133.field2404 * 15 + 22;
        class125.field2256 = var1;
        int var3 = class158.field2823 - var1 / arg0;
        int var4 = class133.field2404 * 15 + 21;
        if (var1 + var3 > 765) {
            var3 = 765 - var1;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        class52.field955 = var3;
        int var5 = class134.field2429;
        if (var4 + var5 > 503) {
            var5 = 503 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field2043 = var5;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2028 = arg3;
        this.field2044 = arg6;
        this.field2042 = arg1;
        this.field2039 = arg0;
        this.field2034 = arg2;
        this.field2041 = arg5;
        this.field2035 = arg4;
    }
}
