import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class177 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static volatile int field3042 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lda;")
    public static class275 field3043 = class255.method1672(107, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public static final void method1190(int arg0, int arg1) {
        field3044++;
        class248 var2 = (class248) class118.field2125.method1871(arg0 ^ arg0, (long) arg1);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4372.length; var3++) {
                var2.field4372[var3] = -1;
                var2.field4365[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1191(int arg0) {
        field3043 = null;
        if (arg0 <= 69) {
            field3042 = 46;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lqd;I)V")
    public static final void method1192(class99 arg0, int arg1) {
        class139.method1002(-11704, 200000, arg0);
        if (arg1 != 200000) {
            method1193((Component) null, -39, (byte) 40, -19);
        }
        field3046++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lck;")
    public static final class141 method1193(Component arg0, int arg1, byte arg2, int arg3) {
        field3047++;
        try {
            if (arg2 != -15) {
                method1192((class99) null, -126);
            }
            Class var4 = Class.forName("cd");
            class141 var5 = (class141) var4.getDeclaredConstructor().newInstance();
            var5.method1015(arg1, arg0, arg3, 100);
            return var5;
        } catch (Throwable var7) {
            class167 var6 = new class167();
            var6.method1015(arg1, arg0, arg3, arg2 + 115);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
    public static final void method1194(int arg0, int arg1) {
        field3045++;
        class184 var2 = class147.method1044(1, (byte) 84, arg1);
        var2.method1230(1000);
        if (arg0 != 29614) {
            method1192((class99) null, 46);
        }
    }
}
