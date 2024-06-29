import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class20 extends class213 {

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "Ljava/lang/String;")
    public String field227;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "[I")
    public int[] field220;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "[I")
    public int[] field222;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "[Lic;")
    public class329[] field224;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field223;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "[[[Lll;")
    public static class54[][][] field221;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 10)
    public static final void method130(int arg0, int arg1) {
        class323.field4744 = -1;
        if (arg1 != -21438) {
            method130(66, 10);
        }
        if (arg0 == 37) {
            class38.field465 = 3.0F;
        } else if (arg0 == 50) {
            class38.field465 = 4.0F;
        } else if (arg0 == 75) {
            class38.field465 = 6.0F;
        } else if (arg0 == 100) {
            class38.field465 = 8.0F;
        } else if (arg0 == 200) {
            class38.field465 = 16.0F;
        }
        field226++;
        class323.field4744 = -1;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 59)
    public static void method131(int arg0) {
        if (arg0 != 37) {
            field229 = -109;
        }
        field221 = (class54[][][]) null;
    }
}
