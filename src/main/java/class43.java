import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class43 extends class210 {

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    private int field580 = 0;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Ljn;")
    public static class117 field583 = new class117(4);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lvca;")
    public static class675 field584 = new class675(128);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Lpn;")
    public static class295 field585;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
    public static int[] field587;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V", line = 4)
    public static final void method349(int arg0) {
        ++field582;
        class80.field1210 = 0;
        int var1 = (class103.field1708.field3155 >> 9) - -class143.field2474;
        int var2 = (class103.field1708.field3154 >> 9) - -class63.field917;
        if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && ~var2 >= -3137) {
            class80.field1210 = 1;
        }
        if (~var1 <= arg0 && ~var1 >= -3119 && var2 >= 9492 && ~var2 >= -9536) {
            class80.field1210 = 1;
        }
        if (class80.field1210 == 1 && var1 >= 3139 && ~var1 >= -3200 && var2 >= 3008 && ~var2 >= -3063) {
            class80.field1210 = 0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZ)V", line = 31)
    public final void method344(boolean arg0, boolean arg1) {
        ++field579;
        if (arg0) {
            field587 = null;
        }
        int var3 = super.field3213.field8760.method1329(class570.field8333, super.field3220.method11(), arg0) + super.field3213.field8755;
        int var4 = super.field3213.field8757.method2447(-1464849236, class140.field2349, super.field3220.method9()) - -super.field3213.field8748;
        super.field3220.method1637((float) (var3 + super.field3220.method11() / 2), (float) (var4 - -(super.field3220.method9() / 2)), 4096, this.field580);
        this.field580 += ((class695) super.field3213).field9866;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lvo;Ljf;)V", line = 47)
    public class43(class345 arg0, class695 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 50)
    public static void method350(int arg0) {
        field583 = null;
        field587 = null;
        field585 = null;
        if (arg0 == -3054) {
            field584 = null;
        }
    }
}
