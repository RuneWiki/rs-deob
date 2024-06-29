import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class78 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Leg;")
    public static class37 field1208 = class174.method1167("Cabbage", 73);

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    public static int[] field1210 = new int[128];

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lid;")
    public static class226 field1212 = new class226();

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1214 = new CRC32();

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Leg;")
    public static class37 field1215 = class174.method1167("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -17);

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1216 = 0;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Z")
    public static boolean field1217 = true;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lnc;")
    public static class11 field1213;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[Lc;")
    public static class64[] field1209;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1209 = null;
        field1212 = null;
        if (arg0 != -1) {
            method530(-70);
        }
        field1215 = null;
        field1208 = null;
        field1210 = null;
        field1213 = null;
        field1214 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static final void method530(int arg0) {
        if (arg0 < ~class217.field3738) {
            class217.field3738 = 0;
            class82.field1291 = -1;
            class153.field2572 = -1;
        }
        if (class243.field4368 < class217.field3738) {
            class153.field2572 = -1;
            class217.field3738 = class243.field4368;
            class82.field1291 = -1;
        }
        if (class28.field414 < 0) {
            class153.field2572 = -1;
            class28.field414 = 0;
            class82.field1291 = -1;
        }
        field1211++;
        if (class28.field414 > class118.field2004) {
            class153.field2572 = -1;
            class28.field414 = class118.field2004;
            class82.field1291 = -1;
        }
    }
}
