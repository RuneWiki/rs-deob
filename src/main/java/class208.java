import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class208 extends class88 {

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lc;")
    public static class103 field3780 = new class103(16);

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "[S")
    public static short[] field3782 = new short[500];

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "[I")
    public static int[] field3791 = new int[25];

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Lhj;")
    public static class69 field3785 = class181.method1318("logo", (byte) -113);

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Lhj;")
    public static class69 field3787 = class181.method1318("Spieler", (byte) -127);

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field3795 = 0;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "[Lkc;")
    public static class264[] field3792;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIB)Z")
    public final boolean method1505(int arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            method1507((byte) -59);
        }
        field3788++;
        return this.field3790 <= arg1 && this.field3797 >= arg1 && arg0 >= this.field3781 && arg0 <= this.field3793;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public static void method1506(byte arg0) {
        field3787 = null;
        field3792 = null;
        if (arg0 == 123) {
            field3785 = null;
            field3791 = null;
            field3782 = null;
            field3780 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)Z")
    public static final boolean method1507(byte arg0) {
        field3794++;
        try {
            return arg0 == -69 ? class217.method1553((byte) -118) : false;
        } catch (IOException var4) {
            class118.method862(false);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class13.field190 + "," + class170.field3118 + "," + class163.field3016 + " - " + class33.field451 + "," + (class242.field4441 + class156.field2904.field3998[0]) + "," + (class220.field3962 + class156.field2904.field4046[0]) + " - ";
            for (int var3 = 0; class33.field451 > var3 && var3 < 50; var3++) {
                var2 = var2 + class199.field3595.field2385[var3] + ",";
            }
            class222.method1575(var2, var5, -24);
            class20.method115(-5);
            return true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public static final void method1508(int arg0) {
        field3786++;
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIII)V")
    public class208(int arg0, int arg1, int arg2, int arg3) {
        this.field3793 = arg3;
        this.field3797 = arg2;
        this.field3781 = arg1;
        this.field3790 = arg0;
    }
}
