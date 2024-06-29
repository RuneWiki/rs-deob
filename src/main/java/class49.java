import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class49 {

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Leb;")
    public static class230 field865 = class68.method589(0, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field863 = 0;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Leb;")
    public static class230 field868 = class68.method589(0, "(U (X");

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "[I")
    public static int[] field870 = new int[25];

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field869 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lkk;")
    public static class223 field866;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
    public abstract void method405(int arg0, int arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method406(boolean arg0) {
        field870 = null;
        field868 = null;
        if (!arg0) {
            field866 = null;
            field865 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZ[Lka;I)V")
    public static final void method407(int arg0, int arg1, int arg2, boolean arg3, class245[] arg4, int arg5) {
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class245 var7 = arg4[var6];
            if (var7 != null && var7.field4245 == arg5) {
                class30.method281(arg0, -32681, arg1, var7, arg3);
                class46.method397(arg0, arg2 ^ 0x1A5B, var7, arg1);
                if (var7.field4332 > (var7.field4298 - var7.field4325)) {
                    var7.field4332 = var7.field4298 - var7.field4325;
                }
                if (var7.field4332 < 0) {
                    var7.field4332 = 0;
                }
                if (var7.field4339 - var7.field4307 < var7.field4351) {
                    var7.field4351 = var7.field4339 - var7.field4307;
                }
                if (var7.field4351 < 0) {
                    var7.field4351 = 0;
                }
                if (var7.field4306 == 0) {
                    class8.method84(var7, arg3, arg2 - 7179);
                }
            }
        }
        if (arg2 != 7087) {
            method406(true);
        }
        field860++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static final void method408(byte arg0) {
        int var1 = -125 % ((arg0 + 71) / 55);
        class103.field1874.method389((byte) -126);
        class54.field939.method1496((byte) -114);
        class13.field261.method1496((byte) 126);
        field859++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    public abstract void method409(int arg0, int arg1, int arg2);
}
