import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class211 {

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field2875 = -1;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Ljava/lang/String;")
    public String field2878;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V", line = 7)
    public static final void method1335(int arg0, int arg1, int arg2) {
        class409 var3 = class497.field6886[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field5625 != null) {
            var3.field5625 = null;
        }
        if (var3.field5628 != null) {
            var3.field5628 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1336(int arg0) {
        field2873++;
        for (int var1 = 0; var1 < class104.field1527; var1++) {
            class231 var2 = class520.field7703[var1];
            if (var2.field3111 == 2) {
                if (var2.field3101 == null) {
                    var2.field3104 = Integer.MIN_VALUE;
                } else {
                    class318.field4175.method3070(var2.field3101);
                }
            }
        }
        if (arg0 != Integer.MIN_VALUE) {
            method1337(false);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)[Lsn;", line = 54)
    public static final class443[] method1337(boolean arg0) {
        if (!arg0) {
            field2877 = -38;
        }
        field2879++;
        return new class443[] { class288.field3773, class31.field518, class365.field4944 };
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V", line = 72)
    public static final void method1338(int arg0) {
        field2874++;
        if (class370.field4984 != null) {
            class232.field3129.method1775((byte) 127);
            class99.method708();
            class54.method398((byte) 21);
            class233.method1447((byte) -94);
            class176.method1178(true);
            class488.method2800(true);
            if (class121.field1775 != null) {
                class121.field1775.method770((byte) -108);
            }
            class182.method1195((byte) -117);
            class129.method924(-10808);
            class347.method2011((byte) 41);
            class148.method1023(true, false);
            class102.method716(3);
            for (int var1 = 0; var1 < 2048; var1++) {
                class515 var5 = class499.field6901[var1];
                if (var5 != null) {
                    var5.field6258 = null;
                    for (int var6 = 0; var6 < var5.field6260.length; var6++) {
                        var5.field6260[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class291.field3822.length; var2++) {
                class117 var3 = class291.field3822[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field6260.length; var4++) {
                        var3.field6260[var4] = null;
                    }
                }
            }
            class370.field4984.method1095(15512);
            class370.field4984 = null;
        }
        if (arg0 < 123) {
            field2877 = -10;
        }
    }
}
