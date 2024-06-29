import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class485 {

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "Ljk;")
    public static class585 field6797 = new class585(38, 7);

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "[I")
    public static int[] field6798 = new int[8];

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    private int field6791;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public int field6793;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public int field6796;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "Lod;")
    public class470 field6794;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public static void method2832(int arg0) {
        field6798 = null;
        field6797 = null;
        if (arg0 != -13704) {
            method2836(54);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2833(int arg0, String arg1) {
        field6789++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = arg0; var5 < var2; var5++) {
            var3 = ((var3 << 5) + ((long) arg1.charAt(var5))) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILun;)V")
    public final void method2834(int arg0, class389 arg1) {
        field6795++;
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                if (arg0 == 13443) {
                    return;
                } else {
                    field6797 = null;
                    return;
                }
            }
            this.method2837(7, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Lpga;")
    public final synchronized class495 method2835(boolean arg0) {
        field6792++;
        class495 var2 = (class495) this.field6794.field6573.method2766(-128, (long) this.field6791);
        if (var2 != null) {
            return var2;
        }
        class495 var3 = class495.method2874(this.field6794.field6561, this.field6791, 0);
        if (var3 != null) {
            this.field6794.field6573.method2772(var3, true, (long) this.field6791);
        }
        if (!arg0) {
            this.field6793 = -5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
    public static final void method2836(int arg0) {
        field6788++;
        if (class37.field708 == class215.field2737) {
            return;
        }
        try {
            class140.method923(class683.field9762, (byte) 97, "tbrefresh");
        } catch (Throwable var1) {
        }
        if (arg0 != -28247) {
            field6798 = null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILun;I)V")
    private final void method2837(int arg0, class389 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6791 = arg1.method2260(-86);
        } else if (arg2 == 2) {
            this.field6796 = arg1.method2229(255);
            this.field6793 = arg1.method2229(arg0 + 248);
        }
        field6790++;
        if (arg0 != 7) {
            field6798 = null;
        }
    }
}
