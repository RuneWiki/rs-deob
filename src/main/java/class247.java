import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class247 {

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4303 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lub;")
    public static class88 field4299 = new class88();

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Z")
    public static boolean field4306 = false;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4307 = 0;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Z")
    public static boolean field4304 = false;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Le;")
    public static class64 field4308;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Ljd;")
    public static class86 field4305;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1692(int arg0) {
        field4305 = null;
        field4308 = null;
        field4299 = null;
        if (arg0 != 0) {
            method1693(true);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public static final void method1693(boolean arg0) {
        class175 var1 = class210.field3585;
        synchronized (class210.field3585) {
            class170.field2986 = class135.field2356;
            class28.field515 = class208.field3544;
            class24.field441++;
            if (arg0) {
                return;
            }
            class174.field3059 = class106.field1880;
            class123.field2173 = class271.field4661;
            class227.field3891 = class260.field4456;
            class58.field1196 = class114.field2009;
            class22.field410 = class105.field1853;
            class271.field4661 = 0;
        }
        field4302++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILfa;)V")
    public static final void method1694(int arg0, class239 arg1) {
        field4300++;
        class76.field1438 = arg1;
        class215.field3718 = class76.field1438.method1638(4, (byte) -73);
        int var2 = 11 / ((-arg0 - 43) / 46);
    }
}
