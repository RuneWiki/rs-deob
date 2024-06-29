import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 extends class97 {

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Lp;")
    public static class280 field79 = class18.method140((byte) -118, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field82 = 0;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "[Z")
    public static boolean[] field84 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Lua;")
    public static class113 field83 = null;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Z")
    public static boolean field80 = true;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "D")
    public static double field91 = -1.0D;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Lp;")
    public static class280 field85 = class18.method140((byte) -128, "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "J")
    public static long field90 = 0L;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Lp;")
    public class280 field89;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lp;")
    public class280 field92;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "[Lde;")
    public static class108[] field81;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)V")
    public static final void method43(int arg0, int arg1) {
        ++field86;
        class105.field1750.method1478(arg1, 96);
        if (arg0 <= 94) {
            field82 = 90;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
    public static final void method44(boolean arg0, int arg1) {
        class271.method1815(0);
        ++field87;
        class155.method1109(arg0);
        int var2 = class175.method1202((byte) 28, arg1).field366;
        if (~var2 != -1) {
            int var3 = class17.field314[arg1];
            if (var2 == 5) {
                class13.field269 = var3;
            }
            if (var2 == 9) {
                class24.field441 = var3;
            }
            if (var2 == 6) {
                class163.field2862 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZII)V")
    public static final void method45(int arg0, boolean arg1, int arg2, int arg3) {
        ++field77;
        if (!arg1) {
            method47(-63);
        }
        if (class261.field4617 != 0 && arg3 != 0 && class79.field1304 < 50 && ~arg2 != 0) {
            class14.field274[class79.field1304] = arg2;
            class153.field2658[class79.field1304] = arg3;
            class208.field3591[class79.field1304] = arg0;
            class64.field1051[class79.field1304] = null;
            class237.field4115[class79.field1304] = 0;
            ++class79.field1304;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Lab;")
    public final class145 method46(int arg0) {
        if (arg0 != 0) {
            field85 = null;
        }
        ++field78;
        return class232.field4053[super.field1540];
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public static void method47(int arg0) {
        field84 = null;
        if (arg0 != -18633) {
            method43(-64, 103);
        }
        field83 = null;
        field81 = null;
        field85 = null;
        field79 = null;
    }
}
