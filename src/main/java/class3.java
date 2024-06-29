import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class3 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Ljh;")
    public static class2 field28 = new class2(5);

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Z")
    public static boolean field34 = true;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lqe;")
    public static class168 field38 = class66.method448(")4l=", 58);

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "[J")
    public static long[] field40 = new long[500];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field31;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "[I")
    public int[] field37;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[[Z")
    public static boolean[][] field33;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method17(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method18(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static void method19(boolean arg0) {
        field33 = null;
        field40 = null;
        field28 = null;
        if (!arg0) {
            field33 = null;
        }
        field38 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([BI)Lnc;")
    public static final class136 method20(byte[] arg0, int arg1) {
        field39++;
        if (arg0 == null) {
            return null;
        } else {
            class11 var2 = new class11(arg0, class33.field415, class54.field746, class85.field1332, class69.field978, class7.field84);
            int var3 = -117 % ((arg1 - 77) / 45);
            class246.method1613(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public abstract void method21(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public final void method22(int arg0) {
        class216.method1409(this.field37, this.field27, this.field29);
        field36++;
        if (arg0 > -23) {
            field28 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    protected class3() {
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIII)V")
    public static final void method23(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -62) {
            field28 = null;
        }
        if (arg0 >= class174.field3055 && class249.field4314 >= arg0) {
            int var5 = class97.method639(arg3, (byte) 12, class222.field3811, class196.field3402);
            int var6 = class97.method639(arg4, (byte) 12, class222.field3811, class196.field3402);
            class190.method1231(var5, true, arg2, var6, arg0);
        }
        field35++;
    }
}
