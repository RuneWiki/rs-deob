import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class227 extends Canvas {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field4030;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "J")
    public static long field4031 = 0L;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4033 = -1;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lvf;")
    public static class265 field4032 = class87.method582(-46, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lvf;")
    public static class265 field4034 = class87.method582(-46, "underlay");

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lvf;")
    public static class265 field4039 = class87.method582(-46, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lfl;")
    public static class192 field4037;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    public static int[] field4029;

    @OriginalMember(owner = "client!jh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4030.update(arg0);
        field4038++;
    }

    @OriginalMember(owner = "client!jh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4036++;
        this.field4030.paint(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static final void method1540(int arg0) {
        if (arg0 != -32514) {
            method1543((byte) 76, -58);
        }
        field4028++;
        for (int var1 = 0; var1 < 100; var1++) {
            class135.field2481[var1] = true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class227(Component arg0) {
        this.field4030 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
    public static final boolean method1541(int arg0, int arg1) {
        if (arg0 < 115) {
            return true;
        } else {
            field4027++;
            return arg1 >= 0 && class246.field4282.length > arg1 ? class246.field4282[arg1] : false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method1542(boolean arg0) {
        field4039 = null;
        field4034 = null;
        field4029 = null;
        field4037 = null;
        if (arg0) {
            field4032 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)Lp;")
    public static final class82 method1543(byte arg0, int arg1) {
        field4035++;
        class82 var2 = (class82) class163.field2958.method1887(126, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -51) {
            field4039 = null;
        }
        byte[] var3 = class56.field1138.method1332(true, arg1, 33);
        class82 var4 = new class82();
        if (var3 != null) {
            var4.method567(arg1, (byte) -124, new class135(var3));
        }
        class163.field2958.method1892(var4, (long) arg1, (byte) 10);
        return var4;
    }
}
