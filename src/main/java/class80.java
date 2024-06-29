import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class80 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[Ltl;")
    public static class59[] field1274 = new class59[100];

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1277 = 0;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lpg;", line = 4)
    public static final class292 method612(int arg0) {
        if (arg0 != 100) {
            field1276 = -60;
        }
        field1275++;
        try {
            return (class292) Class.forName("fm").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 27)
    public static void method613(byte arg0) {
        if (arg0 <= 69) {
            method615(-73, 103, -4);
        }
        field1274 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 45)
    public static final void method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class198.field3285 = arg1;
        class194.field3218 = arg3;
        if (arg2 != 0) {
            field1276 = -53;
        }
        class216.field3527 = arg4;
        field1278++;
        class190.field3183 = arg0;
        class84.field1320 = arg5;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Lnh;", line = 72)
    public static final class222 method615(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class222 var4 = var3.field4104;
            var3.field4104 = null;
            return var4;
        }
    }
}
