import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class80 extends class406 {

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILvaa;)Lvaa;")
    public final class437 method830(int arg0, class437 arg1) {
        if (arg0 != 3553) {
            this.method830(-88, null);
        }
        return new class491(arg1.field6309, arg1.method2649(arg0 ^ 0xFFFFF264), arg1.field6307);
    }
}
