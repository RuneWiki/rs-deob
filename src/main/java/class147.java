import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class147 extends class137 {

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public int field2790;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Lhh;")
    public static class163 field2792 = class137.method1065("document)3cookie=(R", 17);

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Lhh;")
    public static class163 field2789 = class137.method1065("Cabbage", 17);

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Lhh;")
    public static class163 field2788 = class137.method1065("", 17);

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Lhh;")
    public static class163 field2795 = class137.method1065("null", 17);

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public static void method1105(int arg0) {
        field2795 = null;
        field2792 = null;
        field2788 = null;
        if (arg0 != 1837977384) {
            field2789 = null;
        }
        field2789 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLjj;)V")
    public static final void method1106(boolean arg0, class64 arg1) {
        if (!arg0) {
            field2795 = null;
        }
        class174.field3171 = arg1;
        field2796++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLpa;ZILpa;)Lph;")
    public static final class63 method1107(byte arg0, class123 arg1, boolean arg2, int arg3, class123 arg4) {
        field2791++;
        boolean var5 = true;
        if (arg0 > -77) {
            field2787 = 37;
        }
        int[] var6 = arg1.method958((byte) 15, arg3);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method975(var6[var7], arg3, 106);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg4.method975(var9, 0, -105);
                } else {
                    var10 = arg4.method975(0, var9, -103);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class63(arg1, arg4, arg3, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(II)V")
    public class147(int arg0, int arg1) {
        this.field2790 = arg0;
        this.field2793 = arg1;
    }
}
