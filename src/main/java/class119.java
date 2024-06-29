import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class119 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Ljj;")
    private class66 field1914;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "J")
    public long field1912;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field1915;

    static {
        new class567("Select", "Auswählen", "Sélectionner", "Selecionar");
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.field1914.method527(209171688, this.field1912);
        field1911++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljj;JI)V", line = 21)
    public class119(class66 arg0, long arg1, int arg2) {
        this.field1914 = arg0;
        this.field1912 = arg1;
    }
}
