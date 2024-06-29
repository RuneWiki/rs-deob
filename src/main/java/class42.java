import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class42 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Ljava/lang/String;")
    public static String field782 = "Close";

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "J")
    public long field786;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lik;")
    public class260 field789;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method356(int arg0) {
        if (arg0 == 3206) {
            field782 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public static final void method357(int arg0, int arg1) {
        field785++;
        if (arg1 <= 30) {
            field782 = null;
        }
        class259 var2 = class213.method1464((byte) -127, arg0, 7);
        var2.method1772((byte) 115);
    }
}
