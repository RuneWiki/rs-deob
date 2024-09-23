import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EOJHVRZF")
public class class12 {

    @OriginalMember(owner = "EOJHVRZF", name = "a", descriptor = "I")
    private int field698 = 10369;

    @OriginalMember(owner = "EOJHVRZF", name = "b", descriptor = "B")
    private byte field699 = -94;

    @OriginalMember(owner = "EOJHVRZF", name = "c", descriptor = "Z")
    private boolean field700 = false;

    @OriginalMember(owner = "EOJHVRZF", name = "f", descriptor = "LEWMBJETC;")
    private class13 field703 = new class13();

    @OriginalMember(owner = "EOJHVRZF", name = "j", descriptor = "LODYOEFFK;")
    private class39 field707 = new class39(889);

    @OriginalMember(owner = "EOJHVRZF", name = "g", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "EOJHVRZF", name = "h", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "EOJHVRZF", name = "i", descriptor = "LOAXQGLDV;")
    private class37 field706;

    @OriginalMember(owner = "EOJHVRZF", name = "d", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "EOJHVRZF", name = "e", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "EOJHVRZF", name = "<init>", descriptor = "(II)V")
    public class12(int arg0, int arg1) {
        if (this.field698 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field704 = arg1;
        this.field705 = arg1;
        this.field706 = new class37(1024, false);
    }

    @OriginalMember(owner = "EOJHVRZF", name = "a", descriptor = "(J)LEWMBJETC;")
    public class13 method206(long arg0) {
        class13 var3 = (class13) this.field706.method339(arg0);
        if (var3 == null) {
            this.field701++;
        } else {
            this.field707.method393(var3);
            this.field702++;
        }
        return var3;
    }

    @OriginalMember(owner = "EOJHVRZF", name = "a", descriptor = "(JILEWMBJETC;)V")
    public void method207(long arg0, int arg1, class13 arg2) {
        if (this.field705 == 0) {
            class13 var5 = this.field707.method394();
            var5.method398();
            var5.method209();
            if (this.field703 == var5) {
                class13 var6 = this.field707.method394();
                var6.method398();
                var6.method209();
            }
        } else {
            this.field705--;
        }
        this.field706.method340(arg0, arg2, 0);
        this.field707.method393(arg2);
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "EOJHVRZF", name = "a", descriptor = "()V")
    public void method208() {
        while (true) {
            class13 var1 = this.field707.method394();
            if (var1 == null) {
                this.field705 = this.field704;
                return;
            }
            var1.method398();
            var1.method209();
        }
    }
}
