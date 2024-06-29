import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class51 {

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lsc;")
    public static class181 field806 = class149.method967(255, "Sprites geladen)3");

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lsc;")
    public static class181 field802 = class149.method967(255, "hint_headicons");

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Ljb;")
    public static class11 field810;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field803;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[I")
    public int[] field808;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method378(int arg0) {
        field810 = null;
        field806 = null;
        if (arg0 == -3) {
            field802 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public abstract void method379(byte arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public static final void method380(int arg0, int arg1, int arg2) {
        field801++;
        if (class77.method537(-1, arg2)) {
            class229.method1503(class208.field3563[arg2], arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
    public abstract void method381(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)Ltj;")
    public static final class136 method382(boolean arg0, int arg1) {
        field807++;
        class136 var2 = (class136) class263.field4580.method990((byte) 80, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class2.field59.method89(class70.method487(arg1, 21563), class256.method1741(arg1, (byte) 103), 103);
        class136 var4 = new class136();
        if (var3 != null) {
            var4.method875(new class230(var3), 1001);
        }
        class263.field4580.method982(var4, (byte) 60, (long) arg1);
        if (!arg0) {
            method384(2L, -35);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
    public static final int method383(byte arg0) {
        field798++;
        if (arg0 != 112) {
            method387(-54);
        }
        return class78.field1260;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(JI)V")
    public static final void method384(long arg0, int arg1) {
        field811++;
        class141.field2275.field3933 = arg1;
        class141.field2275.method1538(190, (byte) 127);
        class141.field2275.method1511(false, arg0);
        class47.field743 = 1;
        class234.field4075 = -3;
        class8.field157 = 0;
        class123.field2011 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public final void method385(int arg0) {
        field805++;
        class17.method148(this.field808, this.field804, this.field800);
        if (arg0 != 0) {
            method387(-96);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    protected class51() {
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method386(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Lka;")
    public static final class134 method387(int arg0) {
        field809++;
        class134 var1 = new class134(class219.field3777, class78.field1273, class220.field3782[0], class23.field410[0], class196.field3425[0], class121.field1978[0], class143.field2319[0], class254.field4443);
        class143.method919(16);
        return arg0 > -122 ? null : var1;
    }
}
