import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class326 {

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4578 = new String[200];

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Luu;")
    public static class188 field4577 = null;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Lya;")
    public static class38 field4576;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method2014(int arg0) {
        field4578 = null;
        field4576 = null;
        if (arg0 != 2) {
            method2014(-92);
        }
        field4577 = null;
    }
}
