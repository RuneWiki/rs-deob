import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class491 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[C")
    public static char[] field6484 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[Z")
    public static boolean[] field6487 = new boolean[8];

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6490;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Z")
    public static boolean field6488;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[Li;")
    public static class272[] field6485;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method2644(int arg0, int arg1, int arg2) {
        field6489++;
        if (arg1 != 116) {
            method2645(-62);
        }
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 24)
    public static void method2645(int arg0) {
        if (arg0 >= -120) {
            method2644(-83, -20, 112);
        }
        field6487 = null;
        field6484 = null;
        field6485 = null;
        field6490 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)Lvb;", line = 39)
    public static final class316 method2646(int arg0) {
        field6491++;
        if (class656.field9247 == null || class351.field4488 == null) {
            return null;
        }
        for (class316 var1 = (class316) class351.field4488.method2634(-15840); var1 != null; var1 = (class316) class351.field4488.method2634(-15840)) {
            class647 var2 = class656.field9234.method3771(var1.field4057, -127);
            if (var2 != null && var2.field9097 && var2.method3617(class656.field9241, false)) {
                return var1;
            }
        }
        if (arg0 > -90) {
            method2647(null, (byte) -45, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lrj;BLjava/lang/Object;)V", line = 70)
    public static final void method2647(class648 arg0, byte arg1, Object arg2) {
        field6486++;
        if (arg0.field9152 == null) {
            return;
        }
        if (arg1 >= -48) {
            field6487 = null;
        }
        for (int var3 = 0; var3 < 50 && arg0.field9152.peekEvent() != null; var3++) {
            class419.method2233(-28448, 1L);
        }
        try {
            if (arg2 != null) {
                arg0.field9152.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class491 method907();

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method911(int arg0);

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method901(int[] arg0);

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method902(int arg0);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method914(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method919(class491 arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method918();

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method922(int arg0);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method903(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method924(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method906(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method905(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method910(int arg0);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method908(int arg0);
}
