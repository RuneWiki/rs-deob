import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class226 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[I")
    public int[] field3772;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
    public int[] field3770;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 7)
    public class226() {
        class52.method315(16);
        this.field3771 = class52.method318() == 0 ? 1 : class52.method315(4) + 1;
        if (class52.method318() != 0) {
            class52.method315(8);
        }
        class52.method315(2);
        if (this.field3771 > 1) {
            this.field3773 = class52.method315(4);
        }
        this.field3772 = new int[this.field3771];
        this.field3770 = new int[this.field3771];
        for (int var1 = 0; var1 < this.field3771; var1++) {
            class52.method315(8);
            this.field3772[var1] = class52.method315(8);
            this.field3770[var1] = class52.method315(8);
        }
    }
}
