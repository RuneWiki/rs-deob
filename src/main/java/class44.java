import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class44 {

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Lkr;")
    public static class486 field636 = new class486();

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "[Lvo;")
    public static class31[] field640 = new class31[14];

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
    public int[] field635;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method291(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
    public static void method292(byte arg0) {
        field636 = null;
        if (arg0 <= 38) {
            method296((class145) null, 126, -20, (byte) 111);
        }
        field640 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    public static final void method293(int arg0, int arg1) {
        class232 var2 = class143.field1895;
        synchronized (class143.field1895) {
            class143.field1895.method1486(438127120, arg1);
        }
        field633++;
        if (arg0 != 14) {
            field641 = -42;
        }
        class232 var3 = class368.field5316;
        synchronized (class368.field5316) {
            class368.field5316.method1486(438127120, arg1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method294(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public abstract void method295(int arg0, byte arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ldt;IIB)V")
    public static final void method296(class145 arg0, int arg1, int arg2, byte arg3) {
        field637++;
        if (class250.field3695 != null || class19.field260 || arg0 == null || class126.method796(arg0, (byte) 123) == null) {
            return;
        }
        class250.field3695 = arg0;
        class29.field396 = class126.method796(arg0, (byte) 117);
        client.field2620 = arg1;
        if (arg3 != 91) {
            field636 = null;
        }
        class48.field670 = false;
        class302.field4304 = arg2;
        class157.field2338 = 0;
    }
}
