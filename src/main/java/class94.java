import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class94 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[Lmb;")
    public static class132[] field1651 = new class132[100];

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lmb;")
    public static class132 field1650 = class166.method1092("Bitte laden Sie die Seite neu)3", 115);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Loc;")
    public static class155 field1654;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1655;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
    public int[] field1649;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
    public static int[] field1657;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public final void method578(int arg0) {
        if (arg0 != 0) {
            this.method583(33, 45, null, (byte) 30);
        }
        class239.method1533(this.field1649, this.field1658, this.field1652);
        field1653++;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static void method579(int arg0) {
        field1651 = null;
        field1657 = null;
        field1650 = null;
        if (arg0 != 100) {
            method579(2);
        }
        field1654 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(J[III)Lmb;")
    public static final class132 method580(long arg0, int[] arg1, int arg2, int arg3) {
        field1656++;
        if (arg2 == 0) {
            class55 var5 = class210.method1309(true, arg1[0]);
            return var5.method374((byte) 122, (int) arg0);
        } else if (arg2 == 1) {
            class243 var6 = class58.method389(0, (int) arg0);
            return var6.field4399;
        } else if (arg2 == 5) {
            return class164.method1057((byte) 11, arg0).method900(0);
        } else {
            if (arg3 != 100) {
                method579(47);
            }
            return arg2 == 6 ? class210.method1309(true, arg1[0]).method374((byte) 123, (int) arg0) : class43.method294((byte) 88, arg0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method581(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public abstract void method582(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public abstract void method583(int arg0, int arg1, Component arg2, byte arg3);

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    protected class94() {
    }
}
