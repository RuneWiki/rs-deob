import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class44 extends class30 {

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field627 = -1;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field623 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field630 = 0;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public static int field633 = 0;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Z")
    public static boolean field629 = false;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[I")
    public static int[] field631 = new int[50];

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "Lpk;")
    public static class172 field632 = new class172();

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Z")
    public static boolean field622;

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIII)V", line = 5)
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field620 = arg3;
        this.field626 = arg1;
        this.field625 = arg0;
        this.field618 = arg2;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V", line = 19)
    public static final void method311(int arg0, int arg1) {
        class91.field1386.method1287(arg1, -91);
        field617++;
        if (arg0 != -19394) {
            field631 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V", line = 33)
    public final void method225(int arg0, int arg1, int arg2) {
        int var4 = this.field625 * arg0 >> 12;
        int var5 = this.field626 * arg1 >> 12;
        int var6 = this.field618 * arg0 >> 12;
        field619++;
        int var7 = this.field620 * arg1 >> 12;
        if (arg2 != 2) {
            this.method228(22, 104, (byte) 37);
        }
        class3.method18(var6, this.field370, var7, arg2 - 121, this.field376, var5, var4);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 54)
    public static final void method312(int arg0) {
        field628++;
        if (arg0 == 513113996) {
            class78.field1162.method1296(255);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 70)
    public static void method313(int arg0) {
        field623 = null;
        if (arg0 > -77) {
            field631 = (int[]) null;
        }
        field632 = null;
        field631 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V", line = 84)
    public final void method227(int arg0, int arg1, int arg2) {
        field621++;
        int var4 = this.field625 * arg1 >> 12;
        int var5 = this.field618 * arg1 >> 12;
        if (arg0 == 1325998625) {
            int var6 = this.field620 * arg2 >> 12;
            int var7 = this.field626 * arg2 >> 12;
            class63.method431(this.field376, var5, var6, var4, this.field370, this.field369, var7, 127);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)V", line = 104)
    public final void method228(int arg0, int arg1, byte arg2) {
        field616++;
        int var4 = this.field625 * arg0 >> 12;
        int var5 = this.field626 * arg1 >> 12;
        int var6 = this.field618 * arg0 >> 12;
        int var7 = this.field620 * arg1 >> 12;
        if (arg2 == -94) {
            class248.method1689(var7, this.field369, var6, var4, var5, (byte) 22);
        }
    }
}
