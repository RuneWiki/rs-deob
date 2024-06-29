import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
    public int[] field842;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
    public int[] field840;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class40() {
        class103.method830(16);
        this.field843 = class103.method832() == 0 ? 1 : class103.method830(4) + 1;
        if (class103.method832() != 0) {
            class103.method830(8);
        }
        class103.method830(2);
        if (this.field843 > 1) {
            this.field841 = class103.method830(4);
        }
        this.field842 = new int[this.field843];
        this.field840 = new int[this.field843];
        for (int var1 = 0; var1 < this.field843; var1++) {
            class103.method830(8);
            this.field842[var1] = class103.method830(8);
            this.field840[var1] = class103.method830(8);
        }
    }
}
