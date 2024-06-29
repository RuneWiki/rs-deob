import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class58 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1507 = 0;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1511 = 0;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Lv;")
    public static class122 field1517 = class55.method425(-115, "Mio");

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
    public static int[] field1516 = new int[4000];

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lab;")
    public static class3 field1510;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lkb;")
    public static class62 field1515;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    public static int[] field1509;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILrd;ILne;)V", line = 23)
    public static final void method452(int arg0, class106 arg1, int arg2, class83 arg3) {
        class95 var4 = new class95();
        var4.field2431 = 1;
        var4.field2440 = arg1;
        field1512++;
        var4.field644 = arg2;
        var4.field2445 = arg3;
        class34 var5 = class54.field1409;
        synchronized (class54.field1409) {
            class54.field1409.method312(false, var4);
        }
        class74.method618(arg0 - 4124);
        if (arg0 != 4000) {
            method452(-88, null, -44, null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 43)
    public static void method453(int arg0) {
        field1515 = null;
        field1510 = null;
        if (arg0 != 0) {
            field1517 = null;
        }
        field1517 = null;
        field1509 = null;
        field1516 = null;
    }
}
