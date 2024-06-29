import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class202 extends class242 {

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field2801;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field2803 = new String[100];

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lg;")
    public static class619 field2805;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "[Z")
    public static boolean[] field2800;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V")
    public static void method1376(boolean arg0) {
        if (arg0) {
            field2803 = null;
            field2805 = null;
            field2800 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
    public final boolean method1377(byte arg0) {
        if (arg0 != -106) {
            this.method1377((byte) 38);
        }
        field2804++;
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(Z)V")
    public static final void method1378(boolean arg0) {
        field2808++;
        class702.field9291.method946(((float) class485.field6252.field6929.method1802(arg0) * 0.1F + 0.7F) * 1.1523438F);
        class702.field9291.method997(class661.field8617, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class702.field9291.method884(class14.field148, -1, 0);
        class702.field9291.method910(class629.field7987);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method1379(int arg0) {
        class496.field6339 = false;
        if (arg0 != -11637) {
            field2800 = null;
        }
        field2806++;
        class135.method783(arg0 + 11637);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class202(Object arg0, int arg1) {
        super(arg1);
        this.field2801 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1380(boolean arg0) {
        field2802++;
        if (arg0) {
            method1379(-119);
        }
        return this.field2801;
    }
}
