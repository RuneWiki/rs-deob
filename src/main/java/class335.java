import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class335 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[Lhg;")
    public static class691[] field4726 = new class691[14];

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ltr;")
    public static class296 field4729 = new class296();

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public int field4732;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lpe;")
    public static class609 field4728;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lsh;")
    public static class70 field4733;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method2122(int arg0, boolean arg1) {
        field4731++;
        if (!arg1) {
            method2123(-105);
        }
        class594 var2 = class692.method3869(arg0, (byte) 105, 2);
        var2.method3383(-16058);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 21)
    public static void method2123(int arg0) {
        field4726 = null;
        field4733 = null;
        field4728 = null;
        field4729 = null;
        if (arg0 != 14) {
            field4729 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLkf;)I", line = 35)
    public static final int method2124(byte arg0, class255 arg1) {
        int var2 = -45 / ((arg0 - 54) / 43);
        field4727++;
        if (class755.field10544 == arg1) {
            return 5890;
        } else if (class492.field6814 == arg1) {
            return 34167;
        } else if (class380.field5528 == arg1) {
            return 34168;
        } else if (class4.field31 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
