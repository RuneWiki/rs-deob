import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class219 {

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field3842;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Le;")
    public static class191 field3845 = class54.method368("Ausw-=hlen", 2047);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static final void method1485(boolean arg0) {
        class235.field4191.method992(-31);
        field3841++;
        class157.field2679.method992(-31);
        if (arg0) {
            class8.field76.method992(-31);
            class82.field1381.method992(-31);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method1486(int arg0) {
        if (arg0 >= -102) {
            field3845 = null;
        }
        field3845 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZLe;)V")
    public static final void method1487(int arg0, boolean arg1, class191 arg2) {
        if (arg0 != -27286) {
            return;
        }
        if (arg1) {
            try {
                class162.field2751.getAppletContext().showDocument(arg2.method1355(false, class162.field2751.getCodeBase()), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class162.field2751.getAppletContext().showDocument(arg2.method1355(false, class162.field2751.getCodeBase()), "_top");
            } catch (Exception var3) {
            }
        }
        field3847++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static final void method1488(int arg0) {
        field3843++;
        if (class197.field3517 > arg0) {
            class81.method517(arg0 + 10);
        } else {
            class95.field1547 = class263.field4670;
            class263.field4670 = null;
            class188.method1293(40, -30211);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class219() {
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lke;)V")
    public class219(class219 arg0) {
        this.field3848 = arg0.field3848;
        this.field3842 = arg0.field3842;
        this.field3846 = arg0.field3846;
        this.field3844 = arg0.field3844;
    }
}
