import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class259 extends class212 {

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    private final int field4483;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    private final int field4490;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    private final int field4492;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    private final int field4487;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "Loh;")
    public static class263 field4491 = class253.method1681(-117, "Weiter");

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4493 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "[[[I")
    public static int[][][] field4495 = new int[4][13][13];

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Lpc;")
    public static class21 field4485;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZ)V")
    public final void method531(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1708((byte) 25);
        }
        ++field4482;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method1708(byte arg0) {
        ++field4486;
        int var1 = 0;
        int var2 = -9 / (-arg0 / 34);
        while (~var1 > -101) {
            class21.field629[var1] = true;
            ++var1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILue;)V")
    public static final void method1709(int arg0, class86 arg1) {
        ++field4489;
        class24.field693 = arg1;
        if (arg0 != 1532515660) {
            method1708((byte) -52);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public final void method522(int arg0, int arg1, int arg2) {
        ++field4484;
        int var4 = this.field4492 * arg2 >> 12;
        int var5 = this.field4490 * arg2 >> 12;
        int var6 = this.field4483 * arg0 >> 12;
        if (arg1 > -18) {
            field4493 = null;
        }
        int var7 = this.field4487 * arg0 >> 12;
        class103.method695(var5, var6, super.field3788, var4, 124, var7);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method1710(int arg0) {
        field4495 = null;
        field4493 = null;
        field4491 = null;
        field4485 = null;
        if (arg0 > -94) {
            field4491 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V")
    public final void method528(byte arg0, int arg1, int arg2) {
        ++field4488;
        int var4 = -105 % ((arg0 - -6) / 53);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIII)V")
    public class259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4483 = arg1;
        this.field4490 = arg2;
        this.field4492 = arg0;
        this.field4487 = arg3;
    }
}
