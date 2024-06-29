import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class273 {

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lid;")
    public static class149 field4906 = class60.method382("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 45);

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4911 = 0;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "[I")
    public static int[] field4913 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field4905;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field4902;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[I")
    public int[] field4914;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "[[B")
    public static byte[][] field4907;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method1472(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILal;BI)[Lvc;")
    public static final class190[] method1892(int arg0, class230 arg1, byte arg2, int arg3) {
        field4904++;
        if (class59.method371((byte) 122, arg0, arg3, arg1)) {
            if (arg2 < 43) {
                method1894(74);
            }
            return class61.method385((byte) -62);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public abstract void method1469(int arg0, int arg1, Component arg2, byte arg3);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
    public static final void method1893(boolean arg0, int arg1) {
        for (class259 var2 = (class259) class85.field1550.method1140(0); var2 != null; var2 = (class259) class85.field1550.method1127(0)) {
            if (var2.field4531 != null) {
                class246.field4318.method814(var2.field4531);
                var2.field4531 = null;
            }
            if (var2.field4541 != null) {
                class246.field4318.method814(var2.field4541);
                var2.field4541 = null;
            }
            var2.method401((byte) -118);
        }
        if (arg0) {
            for (class259 var3 = (class259) class259.field4524.method1140(0); var3 != null; var3 = (class259) class259.field4524.method1127(0)) {
                if (var3.field4531 != null) {
                    class246.field4318.method814(var3.field4531);
                    var3.field4531 = null;
                }
                var3.method401((byte) -118);
            }
            for (class259 var4 = (class259) class252.field4419.method633((byte) 89); var4 != null; var4 = (class259) class252.field4419.method630(11)) {
                if (var4.field4531 != null) {
                    class246.field4318.method814(var4.field4531);
                    var4.field4531 = null;
                }
                var4.method401((byte) -118);
            }
        }
        if (arg1 == 24077) {
            field4908++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
    public abstract void method1467(byte arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1894(int arg0) {
        field4913 = null;
        field4907 = null;
        if (arg0 != 1000) {
            field4906 = null;
        }
        field4906 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    protected class273() {
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public final void method1895(int arg0) {
        field4912++;
        if (arg0 != 0) {
            field4907 = null;
        }
        class72.method460(this.field4914, this.field4909, this.field4905);
    }
}
