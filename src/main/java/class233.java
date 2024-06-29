import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class233 extends class99 {

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    public static int field3207 = 1;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3206 = "Unable to find ";

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3204 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
    public static int field3209 = 0;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "[Lkb;")
    public static class80[] field3208;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method1550(byte arg0) {
        field3206 = null;
        field3208 = null;
        if (arg0 < 60) {
            method1551(-113, -14);
        }
        field3204 = null;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(II)V")
    public static final void method1551(int arg0, int arg1) {
        if (arg1 != 14373) {
            return;
        }
        class26.field468 = arg0;
        field3202++;
        class410 var2 = class167.field2487;
        synchronized (class167.field2487) {
            class167.field2487.method2533(0);
        }
    }
}
