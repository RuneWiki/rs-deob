import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[Lqk;")
    public static class207[] field613 = new class207[100];

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lqk;")
    public static class207 field615 = class24.method212(255, ")4a=");

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method235(Component arg0, int arg1) {
        arg0.addMouseListener(class149.field2610);
        field616++;
        arg0.addMouseMotionListener(class149.field2610);
        if (arg1 == -218) {
            arg0.addFocusListener(class149.field2610);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(JI)V")
    public static final void method236(long arg0, int arg1) {
        field614++;
        if ((long) arg1 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < class25.field534; var3++) {
            if (class150.field2640[var3] == arg0) {
                class99.field1763++;
                class25.field534--;
                for (int var4 = var3; var4 < class25.field534; var4++) {
                    class129.field2240[var4] = class129.field2240[var4 + 1];
                    class34.field679[var4] = class34.field679[var4 + 1];
                    class118.field2042[var4] = class118.field2042[var4 + 1];
                    class150.field2640[var4] = class150.field2640[var4 + 1];
                    class275.field4811[var4] = class275.field4811[var4 + 1];
                    class31.field630[var4] = class31.field630[var4 + 1];
                }
                class177.field3201 = class193.field3395;
                class261.field4645.method767(25, (byte) 54);
                class261.field4645.method1048((byte) 94, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method237(int arg0) {
        if (arg0 >= -97) {
            field615 = null;
        }
        field615 = null;
        field613 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILwc;Ljava/awt/Component;)Loc;")
    public static final class60 method238(int arg0, int arg1, int arg2, class229 arg3, Component arg4) {
        field619++;
        if (class275.field4822 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class60 var5 = (class60) Class.forName("mg").getDeclaredConstructor().newInstance();
                var5.field1124 = arg1;
                var5.field1100 = new int[(class286.field5020 ? 2 : 1) * 256];
                var5.method439(arg4);
                var5.field1120 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1120 > 16384) {
                    var5.field1120 = 16384;
                }
                var5.method438(var5.field1120);
                if (arg0 < 94) {
                    return null;
                }
                if (class273.field4799 > 0 && client.field2695 == null) {
                    client.field2695 = new class126();
                    client.field2695.field2188 = arg3;
                    arg3.method1636(false, class273.field4799, client.field2695);
                }
                if (client.field2695 != null) {
                    if (client.field2695.field2187[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    client.field2695.field2187[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class61 var6 = new class61(arg3, arg2);
                    var6.field1100 = new int[(class286.field5020 ? 2 : 1) * 256];
                    var6.field1124 = arg1;
                    var6.method439(arg4);
                    var6.field1120 = 16384;
                    var6.method438(var6.field1120);
                    if (class273.field4799 > 0 && client.field2695 == null) {
                        client.field2695 = new class126();
                        client.field2695.field2188 = arg3;
                        arg3.method1636(false, class273.field4799, client.field2695);
                    }
                    if (client.field2695 != null) {
                        if (client.field2695.field2187[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        client.field2695.field2187[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class60();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
