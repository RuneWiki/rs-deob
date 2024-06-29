import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class19 {

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    public static int[] field328 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[S")
    public static short[] field327 = new short[500];

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lub;")
    public static class227 field324 = class257.method1749("Abbrechen", 17263);

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field331 = 100;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field325 = 0;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[I")
    public static int[] field330 = new int[1000];

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Z")
    public static boolean field332 = false;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field333 = 2;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "J")
    public static long field326;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Log;")
    public static class140 field323;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method89(boolean arg0) {
        field327 = null;
        field324 = null;
        field330 = null;
        field323 = null;
        if (arg0) {
            field326 = 126L;
        }
        field328 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILfa;III)V")
    public static final void method90(int arg0, class45 arg1, int arg2, int arg3, int arg4) {
        field322++;
        for (class238 var5 = (class238) class97.field1701.method1277(99); var5 != null; var5 = (class238) class97.field1701.method1271(250)) {
            if (var5.field4144 == arg3 && (arg0 * 128) == var5.field4128 && arg2 * 128 == var5.field4127 && var5.field4132.field743 == arg1.field743) {
                if (var5.field4129 != null) {
                    class94.field1627.method479(var5.field4129);
                    var5.field4129 = null;
                }
                if (var5.field4145 != null) {
                    class94.field1627.method479(var5.field4145);
                    var5.field4145 = null;
                }
                var5.method369(-43);
                return;
            }
        }
        if (arg4 != 1000) {
            method89(false);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method91(int arg0) {
        class254.field4472.method1723(-4173);
        if (arg0 != 128) {
            field331 = 120;
        }
        field329++;
    }
}
