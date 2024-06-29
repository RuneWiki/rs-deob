import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class34 {

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "[I")
    public int[] field492;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[I")
    public int[] field489;

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class34() {
        class121.method763(16);
        this.field491 = class121.method772() == 0 ? 1 : class121.method763(4) + 1;
        if (class121.method772() != 0) {
            class121.method763(8);
        }
        class121.method763(2);
        if (this.field491 > 1) {
            this.field490 = class121.method763(4);
        }
        this.field492 = new int[this.field491];
        this.field489 = new int[this.field491];
        for (int var1 = 0; var1 < this.field491; var1++) {
            class121.method763(8);
            this.field492[var1] = class121.method763(8);
            this.field489[var1] = class121.method763(8);
        }
    }
}
