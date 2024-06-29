import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class52 {

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)I", line = 20)
    public static final int method288(int arg0, int arg1, int arg2) {
        int var3 = 30 % ((arg1 + 5) / 62);
        field546++;
        int var4 = 0;
        while (arg2 > 0) {
            var4 = var4 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Z")
    public abstract boolean method284(int arg0, int arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public abstract void method285(int arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)Lcba;")
    public abstract class478 method286(byte arg0);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
    public abstract void method287(byte arg0);
}
