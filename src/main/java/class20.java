import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class20 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lqj;")
    public static class246 field382;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lri;")
    public static class64 field387;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field391;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    public int[] field385;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[[[B")
    public static byte[][][] field389;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Loh;III)Lje;", line = 8)
    public static final class70 method143(class15 arg0, int arg1, int arg2, int arg3) {
        field384++;
        if (arg2 != 29944) {
            field389 = (byte[][][]) ((byte[][][]) null);
        }
        return class230.method1688(arg1, arg3, 1221, arg0) ? class321.method2233(0) : null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 33)
    public static void method144(int arg0) {
        field389 = (byte[][][]) null;
        if (arg0 != 3555) {
            method144(-44);
        }
        field387 = null;
        field382 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 49)
    public final void method146(int arg0) {
        if (arg0 != 20200) {
            this.method148(-105, (Graphics) null, -80, -30, -4, -124);
        }
        field386++;
        class181.method1430(this.field385, this.field388, this.field381);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 72)
    protected class20() {
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public abstract void method145(int arg0, Component arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method147(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method148(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);
}
