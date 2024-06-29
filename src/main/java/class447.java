import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class447 {

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Z")
    public static boolean field6170 = false;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V", line = 7)
    public static final void method2601(int arg0, int arg1) {
        field6171++;
        if (arg0 != arg1 && class460.field6482[arg1]) {
            class255.field3576.method2046(true, arg1);
            class39.field666[arg1] = null;
            class460.field6482[arg1] = false;
        }
    }
}
