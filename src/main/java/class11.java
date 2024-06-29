import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class11 extends class26 {

    @OriginalMember(owner = "mapview!fa", name = "m", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "mapview!fa", name = "n", descriptor = "La;")
    public static class1 field113 = class3.method36("Fur Trader", -111);

    @OriginalMember(owner = "mapview!fa", name = "o", descriptor = "La;")
    public static class1 field114 = class3.method36("floorcol)3dat", -122);

    @OriginalMember(owner = "mapview!fa", name = "p", descriptor = "I")
    public static int field115 = 50;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)V", line = 5)
    public static final void method62(byte arg0) {
        if (arg0 != -111) {
            field115 = -69;
        }
        if (++class39.field498 >= 64) {
            class39.field498 = 0;
            class28.field395++;
            if (class28.field395 < class9.field88 >> 6) {
                class40.method259(18508);
            }
        }
        class5.field47 = (class39.field498 << 6) + class40.field518;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 49)
    public static final void method63(Component arg0, boolean arg1) {
        Method var2 = class17.field149;
        if (arg1) {
            return;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class2.field13);
        arg0.addFocusListener(class2.field13);
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(I)V", line = 85)
    public static void method64(int arg0) {
        field113 = null;
        if (arg0 != 0) {
            method64(122);
        }
        field114 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Z)V", line = 128)
    public static final void method65(boolean arg0) {
        if (arg0) {
            method66(-70, 72, -116, null);
        }
        if (class13.field116 != null) {
            class7 var1 = class13.field116;
            synchronized (class13.field116) {
                class13.field116 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(III[B)La;", line = 148)
    public static final class1 method66(int arg0, int arg1, int arg2, byte[] arg3) {
        class1 var4 = new class1();
        var4.field6 = 0;
        var4.field5 = new byte[arg0];
        if (arg2 > -79) {
            field113 = null;
        }
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field5[var4.field6++] = arg3[var5];
            }
        }
        return var4;
    }
}
