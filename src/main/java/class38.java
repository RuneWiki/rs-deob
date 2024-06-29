import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class38 {

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[I")
    public static int[] field679 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lp;")
    public static class280 field682 = class18.method140((byte) -118, "::shiftclick");

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lp;")
    public static class280 field674 = class18.method140((byte) -124, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lbb;")
    public static class90 field678 = new class90();

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field677;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
    public int[] field671;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method299(int arg0) {
        class151.method1052(this.field671, this.field672, this.field681);
        field670++;
        if (arg0 != 30) {
            this.field681 = 120;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method300(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    public abstract void method301(Component arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method302(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static final void method303(byte arg0) {
        class209.field3599 = 0;
        class31.field582 = false;
        class4.field117 = -1;
        class276.field4785 = 0;
        class23.field422 = 0;
        class34.field627.field481 = 0;
        class157.field2745 = 0;
        class125.field2193 = -1;
        class205.field3563 = 0;
        class20.field367.field481 = 0;
        field676++;
        class230.field3974 = 0;
        class85.field1394 = -1;
        class258.field4578 = -1;
        for (int var1 = 0; var1 < class280.field4940.length; var1++) {
            if (class280.field4940[var1] != null) {
                class280.field4940[var1].field4829 = -1;
            }
        }
        for (int var2 = 0; var2 < class46.field756.length; var2++) {
            if (class46.field756[var2] != null) {
                class46.field756[var2].field4829 = -1;
            }
        }
        class125.method867(true);
        if (arg0 != -95) {
            return;
        }
        class4.field113 = 1;
        class90.method641((byte) 66, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class207.field3583[var3] = true;
        }
        class232.method1565(51);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static void method304(byte arg0) {
        field678 = null;
        field682 = null;
        field674 = null;
        field679 = null;
        if (arg0 != 19) {
            field679 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIZII)V")
    public static final void method305(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 >= class89.field1440 && class12.field249 >= arg1 && class36.field654 <= arg0 && class249.field4360 >= arg2) {
            if (arg3 == 1) {
                class21.method171(arg1, arg2, arg5, arg6, arg0, false);
            } else {
                class130.method892(-1, arg5, arg1, arg3, arg2, arg6, arg0);
            }
        } else if (arg3 == 1) {
            class1.method13(arg0, 126, arg1, arg2, arg6, arg5);
        } else {
            class280.method1890(arg6, arg5, (byte) 119, arg1, arg0, arg3, arg2);
        }
        if (arg4) {
            method305(54, -103, -43, -116, false, -73, 18);
        }
        field673++;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    protected class38() {
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lvg;")
    public static final class73 method306(int arg0, int arg1) {
        field675++;
        class73 var2 = (class73) class81.field1322.method1480((byte) 50, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class233.field4056.method1258(4, arg0, (byte) 102);
        class73 var4 = new class73();
        if (arg1 != -2) {
            return null;
        }
        if (var3 != null) {
            var4.method539((byte) -105, arg0, new class25(var3));
        }
        class81.field1322.method1483((byte) -107, (long) arg0, var4);
        return var4;
    }
}
