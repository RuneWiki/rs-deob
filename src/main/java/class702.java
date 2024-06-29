import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class702 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lnt;")
    public static class220 field9854 = new class220();

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field9856 = 0;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field9857 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public int field9852;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public int field9855;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field9858;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
    public boolean field9851;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Z")
    public static final boolean method3944(int arg0) {
        field9853++;
        if (arg0 != 0) {
            field9857 = -70;
        }
        try {
            if (class731.field10231 == 2) {
                if (class148.field2267 == null) {
                    class148.field2267 = class639.method3656(class577.field8167, class463.field6664, class382.field5353);
                    if (class148.field2267 == null) {
                        return false;
                    }
                }
                if (class250.field3518 == null) {
                    class250.field3518 = new class24(class752.field10484, class409.field5685);
                }
                class250 var1 = class284.field4029;
                if (class432.field6038 != null) {
                    var1 = class432.field6038;
                }
                if (var1.method1682(class250.field3518, class148.field2267, class623.field8965, (byte) 105, 22050)) {
                    class284.field4029 = var1;
                    class284.field4029.method1704(-109);
                    if (class736.field10362 > 0) {
                        class731.field10231 = 3;
                        class284.field4029.method1694(class736.field10362 <= class107.field1766 ? class736.field10362 : class107.field1766, (byte) -97);
                        for (int var2 = 0; var2 < class454.field6579.length; var2++) {
                            class284.field4029.method1671((byte) 126, class454.field6579[var2], var2);
                            class454.field6579[var2] = 255;
                        }
                    } else {
                        class731.field10231 = 0;
                        class284.field4029.method1694(class107.field1766, (byte) -86);
                        for (int var3 = 0; var3 < class454.field6579.length; var3++) {
                            class284.field4029.method1671((byte) 114, class454.field6579[var3], var3);
                            class454.field6579[var3] = 255;
                        }
                    }
                    if (class432.field6038 == null) {
                        if (class484.field6849 <= 0L) {
                            class284.field4029.method1702(class148.field2267, arg0 + 105, class407.field5673);
                        } else {
                            class284.field4029.method1672(class407.field5673, true, class148.field2267, class484.field6849, 127);
                        }
                    }
                    if (class708.field9903 != null) {
                        class708.field9903.method375(false, class284.field4029);
                    }
                    class577.field8167 = null;
                    class250.field3518 = null;
                    class148.field2267 = null;
                    class484.field6849 = 0L;
                    class432.field6038 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class284.field4029.method1697(false);
            class577.field8167 = null;
            class731.field10231 = 0;
            class148.field2267 = null;
            class250.field3518 = null;
            class432.field6038 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method3945(int arg0) {
        field9854 = null;
        if (arg0 != 0) {
            field9854 = null;
        }
    }
}
