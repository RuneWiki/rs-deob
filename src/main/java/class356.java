import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class356 extends class429 {

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public int field5071;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public int field5065;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public int field5066;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public int field5074;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public int field5073;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public int field5064;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "[I")
    public static int[] field5075 = new int[200];

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lea;")
    public static class474 field5059 = new class474("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field5061;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)I")
    public abstract int method548(int arg0);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILva;Loa;ZI)V")
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 != 7) {
            this.field5073 = -80;
        }
        field5070++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(I)V")
    public static void method2239(int arg0) {
        field5061 = null;
        field5075 = null;
        field5059 = null;
        if (arg0 != 262144) {
            field5061 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)Z")
    public final boolean method84(int arg0) {
        if (arg0 != 1630) {
            method2239(-2);
        }
        field5072++;
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        if (arg0 != -76) {
            field5063 = -42;
        }
        field5068++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZI)V")
    public static final void method2240(boolean arg0, boolean arg1, int arg2) {
        if (!arg0) {
            method2239(95);
        }
        class414.field6279 = arg2;
        class253.field3576 = 3;
        field5060++;
        class371.method2391(false, class475.field7013.field1598, class475.field7013.field1603);
        if (arg1) {
            class237.method1589(false, 8, "", "");
        } else {
            class80.method525(1);
            class237.method1589(false, 8, class240.field3409, class506.field7343);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)Z")
    public static final boolean method2241(int arg0, int arg1, int arg2) {
        field5062++;
        if (arg1 == 30312) {
            return class147.method875(arg0, (byte) 96, arg2) | (arg2 & 0x40000) != 0 || class251.method1654(arg0, arg2, (byte) -105);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIIII)V")
    public class356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5071 = arg2;
        this.field5065 = arg0;
        this.field5066 = arg1;
        this.field5074 = arg6;
        this.field5073 = arg3;
        this.field5069 = arg4;
        this.field5064 = arg5;
    }
}
