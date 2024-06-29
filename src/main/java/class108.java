import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class108 extends class34 {

    @OriginalMember(owner = "client!gw", name = "F", descriptor = "I")
    private int field1748 = 4096;

    @OriginalMember(owner = "client!gw", name = "J", descriptor = "I")
    private int field1752 = 0;

    @OriginalMember(owner = "client!gw", name = "M", descriptor = "I")
    public static int field1755 = 0;

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "Lkc;")
    public static class157 field1750 = new class157("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!gw", name = "D", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!gw", name = "E", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!gw", name = "K", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!gw", name = "L", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!gw", name = "N", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!gw", name = "I", descriptor = "Lla;")
    public static class306 field1751;

    @OriginalMember(owner = "client!gw", name = "G", descriptor = "Lo;")
    public static class359 field1749;

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V", line = 4)
    public class108() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V", line = 7)
    public static final void method824(int arg0, int arg1) {
        if (arg0 != 0) {
            method826((byte) -43);
        }
        class246.field3358 = arg1;
        ++field1746;
        class2.field33.method2764(-769);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)[I", line = 19)
    public final int[] method64(int arg0, byte arg1) {
        int var3 = -3 % (-arg1 / 50);
        ++field1753;
        int[] var4 = super.field537.method1780(arg0, (byte) 78);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, arg0, 0);
            for (int var6 = 0; ~class383.field5502 < ~var6; ++var6) {
                int var7 = var5[var6];
                var4[var6] = ~this.field1752 >= ~var7 && ~this.field1748 <= ~var7 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lsv;II)V", line = 53)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field1745;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field1748 = arg0.method1844(-102);
            }
        } else {
            this.field1752 = arg0.method1844(-108);
        }
        if (arg1 <= 16) {
            this.method64(-121, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILor;Ljava/awt/Canvas;Ll;I)Lza;", line = 94)
    public static final class295 method825(int arg0, class173 arg1, Canvas arg2, class127 arg3, int arg4) {
        ++field1754;
        int var5 = 0 % ((-32 - arg4) / 36);
        return new class69(arg0, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(B)V", line = 110)
    public static void method826(byte arg0) {
        field1751 = null;
        field1749 = null;
        int var1 = -63 / ((37 - arg0) / 38);
        field1750 = null;
    }
}
