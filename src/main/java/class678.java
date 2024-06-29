import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class678 {

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lfw;")
    public class215 field9626 = new class215();

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "Z")
    public boolean field9629 = false;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "[I")
    public static int[] field9624 = new int[25];

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I")
    public static final int method3854(int arg0) {
        field9621++;
        if (class346.field4952 == null) {
            return 0;
        } else {
            int var1 = -86 / ((arg0 + 6) / 34);
            return class346.field4952.length * 2;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
    public final void method3855(boolean arg0) {
        if (arg0) {
            this.method3855(true);
        }
        field9628++;
        while (true) {
            class603 var2 = (class603) this.field9626.method1518((byte) 103);
            if (var2 == null) {
                return;
            }
            var2.method814(111);
            class111.method809(var2, true);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lqs;I)V")
    public final void method3856(class603 arg0, int arg1) {
        field9627++;
        class280 var3 = arg0.field8541;
        boolean var4 = true;
        class373[] var5 = arg0.field8543;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field5409) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field9629) {
            for (class603 var7 = (class603) this.field9626.method1527(102); var7 != null; var7 = (class603) this.field9626.method1523(true)) {
                if (var7.field8541 == var3) {
                    var7.method814(44);
                    class111.method809(var7, true);
                }
            }
        }
        for (class603 var8 = (class603) this.field9626.method1527(85); var8 != null; var8 = (class603) this.field9626.method1523(true)) {
            if (var8.field8541.field3926 <= var3.field3926) {
                class733.method4079(var8, arg0, -1);
                return;
            }
        }
        this.field9626.method1521(arg0, -24256);
        int var9 = 96 / ((-arg1 - 6) / 51);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BII)Z")
    public static final boolean method3857(byte arg0, int arg1, int arg2) {
        field9623++;
        if (arg0 > -118) {
            field9624 = null;
        }
        return (arg1 & 0x60000) != 0 | class514.method3126(arg2, 0, arg1) || class478.method2859((byte) -79, arg2, arg1);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public static void method3858(byte arg0) {
        if (arg0 < 4) {
            field9622 = 63;
        }
        field9624 = null;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Z)V")
    public class678(boolean arg0) {
        this.field9629 = arg0;
    }
}
