import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class544 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public int field7195;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public int field7197;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
    public int[] field7196;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
    public int[] field7194;

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class544() {
        class627.method3447(16);
        this.field7195 = class627.method3448() == 0 ? 1 : class627.method3447(4) + 1;
        if (class627.method3448() != 0) {
            class627.method3447(8);
        }
        class627.method3447(2);
        if (this.field7195 > 1) {
            this.field7197 = class627.method3447(4);
        }
        this.field7196 = new int[this.field7195];
        this.field7194 = new int[this.field7195];
        for (int var1 = 0; var1 < this.field7195; var1++) {
            class627.method3447(8);
            this.field7196[var1] = class627.method3447(8);
            this.field7194[var1] = class627.method3447(8);
        }
    }
}
