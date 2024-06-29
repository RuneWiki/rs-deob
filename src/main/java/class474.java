import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class474 extends class233 implements class502 {

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    private int field6921;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "[I")
    public static int[] field6919 = new int[14];

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6924;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)I")
    public final int method1910(int arg0) {
        if (arg0 >= -76) {
            this.method1910(103);
        }
        ++field6917;
        return super.field3223;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)I")
    public final int method1912(int arg0) {
        if (arg0 != -21436) {
            field6919 = null;
        }
        ++field6922;
        return this.field6921;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public static void method2785(int arg0) {
        if (arg0 != 34963) {
            method2785(102);
        }
        field6919 = null;
        field6924 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BIII)V")
    public final void method1911(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field6918;
        if (arg2 < 105) {
            field6923 = 62;
        }
        this.method1358(-4, arg0, arg3);
        this.field6921 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public final void method1360(int arg0) {
        ++field6916;
        super.field3227.method2438(3584, this);
        if (arg0 != -4335) {
            this.method1360(-104);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lht;I[BIZ)V")
    public class474(class410 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6921 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)J")
    public final long method1909(int arg0) {
        ++field6920;
        if (arg0 > -90) {
            field6925 = 47;
        }
        return 0L;
    }

    static {
        new class83("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
