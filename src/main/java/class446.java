import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class446 {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public int field6931;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field6933;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    public int[] field6934;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "[I")
    public int[] field6932;

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class446() {
        class306.method2635(16);
        this.field6931 = class306.method2634() == 0 ? 1 : class306.method2635(4) + 1;
        if (class306.method2634() != 0) {
            class306.method2635(8);
        }
        class306.method2635(2);
        if (this.field6931 > 1) {
            this.field6933 = class306.method2635(4);
        }
        this.field6934 = new int[this.field6931];
        this.field6932 = new int[this.field6931];
        for (int var1 = 0; var1 < this.field6931; var1++) {
            class306.method2635(8);
            this.field6934[var1] = class306.method2635(8);
            this.field6932[var1] = class306.method2635(8);
        }
    }
}
