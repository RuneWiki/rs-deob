import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class222 extends class125 {

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "Ljava/lang/Object;")
    private Object field3850;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field3847 = 0;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "J")
    public static long field3855 = 0L;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class222(Object arg0) {
        this.field3850 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIIIII)V")
    public static final void method1491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class76.method564(class36.field654, -113, arg2, class249.field4360);
        int var7 = class76.method564(class36.field654, arg5 - 123, arg4, class249.field4360);
        int var8 = class76.method564(class89.field1440, arg5 ^ 0x7E, arg1, class12.field249);
        field3852++;
        if (arg5 != -1) {
            field3847 = -122;
        }
        int var9 = class76.method564(class89.field1440, -123, arg0, class12.field249);
        for (int var10 = var6; var10 <= var7; var10++) {
            class162.method1151(var9, arg3, -37, var8, class91.field1484[var10]);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method777(int arg0) {
        field3848++;
        return arg0 == 4 ? this.field3850 : null;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)Z")
    public final boolean method776(int arg0) {
        field3853++;
        if (arg0 >= -95) {
            method1492(39, 56);
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
    public static final int method1492(int arg0, int arg1) {
        if (class44.field727 != null) {
            class44.field727.method1532(64);
            class44.field727 = null;
        }
        field3856++;
        if (arg1 != -1) {
            return -55;
        }
        class254.field4450++;
        if (class254.field4450 > 4) {
            class94.field1525 = 0;
            class254.field4450 = 0;
            return arg0;
        }
        class94.field1525 = 0;
        if (class86.field1426 == class106.field1764) {
            class86.field1426 = class132.field2345;
        } else {
            class86.field1426 = class106.field1764;
        }
        return -1;
    }
}
