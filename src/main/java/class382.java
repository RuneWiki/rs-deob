import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class382 {

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public int field5683 = -1;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "Lvg;")
    public class37 field5684;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "[I")
    public int[] field5685;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field5686;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILcb;)V", line = 7)
    public static final void method2302(int arg0, class344 arg1) {
        arg1.field4988 = false;
        field5682++;
        if (arg1.field4987 != null) {
            arg1.field4987.field1125 = 0;
        }
        if (arg0 == 0) {
            for (class344 var2 = arg1.method642(); var2 != null; var2 = arg1.method645()) {
                method2302(0, var2);
            }
        }
    }
}
