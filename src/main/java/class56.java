import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TRUVKLSN")
public class class56 extends class18 {

    @OriginalMember(owner = "TRUVKLSN", name = "m", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "TRUVKLSN", name = "n", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "TRUVKLSN", name = "a", descriptor = "(I)LGFYXEFQY;")
    public final class21 method294(int arg0) {
        int var2 = 75 / arg0;
        class52 var3 = class52.method489(this.field1400);
        return var3.method493(this.field1399);
    }
}
