import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sb")
public class class168 {

    @OriginalMember(owner = "sb", name = "a", descriptor = "Llf;")
    public static class109 field3112 = class35.method275("Bitte versuchen Sie)1", 2);

    @OriginalMember(owner = "sb", name = "f", descriptor = "Llf;")
    public static class109 field3117 = class35.method275("Fehler bei der Verbindung zum Server)3", 2);

    @OriginalMember(owner = "sb", name = "e", descriptor = "[Llb;")
    public static class105[] field3116 = new class105[4];

    @OriginalMember(owner = "sb", name = "i", descriptor = "I")
    public static int field3120 = 0;

    @OriginalMember(owner = "sb", name = "k", descriptor = "Llf;")
    public static class109 field3122 = class35.method275("Die Verbindung konnte", 2);

    @OriginalMember(owner = "sb", name = "c", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "sb", name = "d", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "sb", name = "g", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "sb", name = "h", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "sb", name = "b", descriptor = "Lbg;")
    public static class18 field3113;

    @OriginalMember(owner = "sb", name = "j", descriptor = "[Lfd;")
    public static class55[] field3121;

    @OriginalMember(owner = "sb", name = "a", descriptor = "(B)V")
    public static void method1126(byte arg0) {
        field3117 = null;
        field3121 = null;
        field3113 = null;
        field3112 = null;
        field3122 = null;
        if (arg0 <= -126) {
            field3116 = null;
        }
    }

    @OriginalMember(owner = "sb", name = "a", descriptor = "(ILic;)V")
    public static final void method1127(int arg0, class81 arg1) {
        long var2 = 0L;
        if (arg1.field1606 == 0) {
            var2 = class18.method155(arg1.field1591, arg1.field1595, arg1.field1590);
        }
        if (arg1.field1606 == 1) {
            var2 = class73.method458(arg1.field1591, arg1.field1595, arg1.field1590);
        }
        int var4 = arg0;
        int var5 = -1;
        int var6 = 0;
        field3118++;
        if (arg1.field1606 == 2) {
            var2 = class178.method1210(arg1.field1591, arg1.field1595, arg1.field1590);
        }
        if (arg1.field1606 == 3) {
            var2 = class77.method483(arg1.field1591, arg1.field1595, arg1.field1590);
        }
        if (var2 != 0L) {
            var6 = (int) var2 >> 20 & 0x3;
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var4 = (int) var2 >> 14 & 0x1F;
        }
        arg1.field1597 = var4;
        arg1.field1599 = var6;
        arg1.field1593 = var5;
    }
}
