import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class415 extends class381 {

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field6142 = -1;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Z")
    public boolean field6140 = false;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field6139;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field6143;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field6144;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field6145;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I", line = 6)
    public static final int method2528(int arg0) {
        if (arg0 != -1) {
            method2528(88);
        }
        field6141++;
        return 46;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 18)
    public static final void method2529(int arg0, int arg1) {
        int var2 = -51 / ((arg0 - 3) / 56);
        field6147++;
        class489 var3 = class704.method3942(arg1, 4, 0);
        var3.method2799(-93);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/Object;Lew;)V", line = 31)
    public static final void method2530(int arg0, Object arg1, class226 arg2) {
        field6138++;
        if (arg2.field2990 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2990.peekEvent() != null; var3++) {
            class687.method3846(1L, -79);
        }
        try {
            if (arg1 != null) {
                arg2.field2990.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
        if (arg0 >= 79) {
            ;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V", line = 69)
    public class415(int arg0) {
        this.field6142 = arg0;
    }
}
