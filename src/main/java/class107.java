import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class107 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1473 = 0;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1475 = "Loading wordpack - ";

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lnk;")
    public static class16 field1476;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lkf;")
    public static class249 field1477;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I", line = 5)
    public static final int method691(int arg0) {
        field1474++;
        if (arg0 != 6) {
            method691(-68);
        }
        return 6;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 17)
    public static void method692(int arg0) {
        field1477 = null;
        int var1 = -44 / ((36 - arg0) / 49);
        field1475 = null;
        field1476 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lhi;I)V", line = 35)
    public static final void method693(class323 arg0, int arg1) {
        if (arg1 != 6) {
            field1476 = (class16) null;
        }
        field1472++;
        if (class242.field3759 == arg0.field5190) {
            class302.field4702[arg0.field5078] = true;
        }
    }
}
