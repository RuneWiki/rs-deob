import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class678 {

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public int field9574;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public int field9572;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "[I")
    public int[] field9575;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[I")
    public int[] field9573;

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
    public class678() {
        class211.method1347(16);
        this.field9574 = class211.method1355() == 0 ? 1 : class211.method1347(4) + 1;
        if (class211.method1355() != 0) {
            class211.method1347(8);
        }
        class211.method1347(2);
        if (this.field9574 > 1) {
            this.field9572 = class211.method1347(4);
        }
        this.field9575 = new int[this.field9574];
        this.field9573 = new int[this.field9574];
        for (int var1 = 0; var1 < this.field9574; var1++) {
            class211.method1347(8);
            this.field9575[var1] = class211.method1347(8);
            this.field9573[var1] = class211.method1347(8);
        }
    }
}
