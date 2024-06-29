import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class131 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
    public int[] field3206;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
    public int[] field3205;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class131() {
        class13.method132(16);
        this.field3204 = class13.method139() == 0 ? 1 : class13.method132(4) + 1;
        if (class13.method139() != 0) {
            class13.method132(8);
        }
        class13.method132(2);
        if (this.field3204 > 1) {
            this.field3207 = class13.method132(4);
        }
        this.field3206 = new int[this.field3204];
        this.field3205 = new int[this.field3204];
        for (int var1 = 0; var1 < this.field3204; var1++) {
            class13.method132(8);
            this.field3206[var1] = class13.method132(8);
            this.field3205[var1] = class13.method132(8);
        }
    }
}
