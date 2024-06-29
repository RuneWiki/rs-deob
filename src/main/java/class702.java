import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class702 extends class435 {

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "J")
    public static long field9930 = 0L;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public int field9929;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    public int field9931;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "[I")
    public int[] field9932;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "[I")
    public int[] field9934;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "[I")
    public int[] field9935;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "[Ltj;")
    public class614[] field9927;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "[Ltj;")
    public class614[] field9936;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "[[[B")
    public byte[][][] field9928;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZZ)Z")
    public static boolean method3944(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
    public static final void method3945(byte arg0) {
        class272.method1713((byte) 13);
        if (arg0 != 85) {
            method3945((byte) -70);
        }
        field9933++;
        class332.method1977(true, 2, 22050, class525.field7713.field5963);
        class313.field4341 = class8.method36(22050, class653.field9220, 3, class126.field2061, 0);
        class23.method219(true, class236.method1544(-26634, null), (byte) 10);
        class183.field2894 = class8.method36(2048, class653.field9220, 3, class126.field2061, 1);
        class183.field2894.method1052(25185, class387.field5675);
    }
}
