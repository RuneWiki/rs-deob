import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class57 {

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field1306 = 0;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field1308 = -1;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1311 = -1;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lec;")
    public static class28 field1313 = class28.method210(-46, "Private chat");

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1307 = -1;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lec;")
    public static class28 field1309 = class28.method210(-46, "*6n*6nRecovery Questions Last Set:*6n@gre@");

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lwc;")
    public static class128 field1302;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lwc;")
    public static class128 field1312;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[I")
    public static int[] field1301;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[Lea;")
    public static class26[] field1304;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method458(int arg0) {
        if (arg0 != 255) {
            field1301 = null;
        }
        field1302 = null;
        field1313 = null;
        field1309 = null;
        field1312 = null;
        field1301 = null;
        field1304 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static final void method459(int arg0) {
        field1305++;
        if (class16.field302 != null) {
            class5 var1 = class16.field302;
            synchronized (class16.field302) {
                class16.field302 = null;
            }
        }
        if (arg0 > -26) {
            method458(-63);
        }
    }
}
