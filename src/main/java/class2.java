import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public interface class2 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V")
    void method1();

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
    int method2();

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    void method3(int arg0);

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()V")
    void method4();
}
