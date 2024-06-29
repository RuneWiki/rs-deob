import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class525 {

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
    public int field7336;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public int field7334;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "[I")
    public int[] field7333;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "[I")
    public int[] field7335;

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V", line = 7)
    public class525() {
        class543.method3142(16);
        this.field7336 = class543.method3134() == 0 ? 1 : class543.method3142(4) + 1;
        if (class543.method3134() != 0) {
            class543.method3142(8);
        }
        class543.method3142(2);
        if (this.field7336 > 1) {
            this.field7334 = class543.method3142(4);
        }
        this.field7333 = new int[this.field7336];
        this.field7335 = new int[this.field7336];
        for (int var1 = 0; var1 < this.field7336; var1++) {
            class543.method3142(8);
            this.field7333[var1] = class543.method3142(8);
            this.field7335[var1] = class543.method3142(8);
        }
    }
}
