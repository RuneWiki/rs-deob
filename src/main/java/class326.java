import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class326 extends RuntimeException {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5222;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Ljava/lang/String;")
    public String field5221;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field5223 = 0;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "B")
    public static byte field5225;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method2262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5224++;
        if (class337.field5389 <= (arg6 - arg3) && arg3 + arg6 <= class344.field5460 && (arg1 - arg3) >= class244.field3844 && arg1 + arg3 <= class2.field22) {
            class313.method2212(arg2, arg3, arg1, arg6, arg0, (byte) -67, arg5);
        } else {
            class6.method40(arg6, arg2, arg1, arg0, arg3, arg5, arg4);
        }
        if (arg4 != -1) {
            method2264(false);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 39)
    public static final void method2263(boolean arg0) {
        field5219++;
        if (!arg0) {
            method2262(-106, 18, 32, -82, -25, -70, -27);
        }
        for (int var1 = -1; var1 < class302.field4704; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class80.field1067[var1];
            }
            class67 var3 = class105.field1443[var2];
            if (var3 != null && var3.field3751 > 0) {
                var3.field3751--;
                if (var3.field3751 == 0) {
                    var3.field3734 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class296.field4667; var4++) {
            int var5 = class225.field3392[var4];
            class231 var6 = class251.field3974[var5];
            if (var6 != null && var6.field3751 > 0) {
                var6.field3751--;
                if (var6.field3751 == 0) {
                    var6.field3734 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 93)
    public class326(Throwable arg0, String arg1) {
        this.field5222 = arg0;
        this.field5221 = arg1;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)Z", line = 105)
    public static final boolean method2264(boolean arg0) {
        if (arg0) {
            method2264(true);
        }
        field5220++;
        if (class324.field5210) {
            try {
                return !(Boolean) class198.method1380((byte) 86, "showingVideoAd", class156.field2451.field254);
            } catch (Throwable var2) {
            }
        }
        return true;
    }
}
