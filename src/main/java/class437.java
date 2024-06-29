import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class437 extends class498 {

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field6101 = 0;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field6096;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field6097;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field6098;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public int field6100;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public int field6103;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Ljava/lang/String;")
    public String field6102;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[[I")
    public static int[][] field6095;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lha;B)V", line = 9)
    public static final void method2691(class548 arg0, byte arg1) {
        field6099++;
        class689 var2 = (class689) client.field6236.method1638(false);
        if (arg1 != 25) {
            field6101 = 99;
        }
        while (var2 != null) {
            if (var2.field9592) {
                var2.method3894(arg0);
            }
            var2 = (class689) client.field6236.method1645(0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 33)
    public static void method2692(int arg0) {
        field6095 = null;
        if (arg0 != 0) {
            field6101 = -20;
        }
    }
}
