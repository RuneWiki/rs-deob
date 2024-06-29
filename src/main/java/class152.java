import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class152 extends class3 {

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)[I", line = 6)
    public final int[] method25(byte arg0, int arg1) {
        field2460++;
        if (arg0 <= 57) {
            this.method25((byte) 115, -117);
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = class159.field2546[arg1];
            for (int var5 = 0; var5 < class326.field5342; var5++) {
                var3[var5] = this.method1101(var4, class163.field2591[var5], 19115) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 37)
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)Lfo;", line = 43)
    public static final class239 method1100(int arg0) {
        field2459++;
        class239 var1 = new class239(class300.field4961, class96.field1400, class18.field228[arg0], class28.field419[0], class322.field5289[0], class94.field1379[0], class105.field1522[0], class201.field3085);
        class167.method1164(false);
        return var1;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(III)I", line = 56)
    private final int method1101(int arg0, int arg1, int arg2) {
        if (arg2 == 19115) {
            field2458++;
            int var4 = arg1 + (arg0 * 57);
            int var5 = var4 << 1 ^ var4;
            return 4096 - (((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
        } else {
            return -66;
        }
    }
}
