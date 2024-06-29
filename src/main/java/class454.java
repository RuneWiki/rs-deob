import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class454 extends class637 {

    @OriginalMember(owner = "client!rha", name = "H", descriptor = "[I")
    public static int[] field6321 = new int[14];

    @OriginalMember(owner = "client!rha", name = "B", descriptor = "B")
    public byte field6319;

    @OriginalMember(owner = "client!rha", name = "E", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!rha", name = "I", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!rha", name = "J", descriptor = "I")
    public int field6323;

    @OriginalMember(owner = "client!rha", name = "M", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!rha", name = "K", descriptor = "Lgga;")
    public class511 field6324;

    @OriginalMember(owner = "client!rha", name = "L", descriptor = "[I")
    public static int[] field6325;

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "(I)V")
    public static void method2734(int arg0) {
        if (arg0 != 14) {
            method2737(false, true);
        }
        field6321 = null;
        field6325 = null;
    }

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "(I)[B")
    public final byte[] method2735(int arg0) {
        ++field6320;
        if (!super.field8952 && this.field6324.field6979.length + -this.field6319 <= this.field6324.field6962) {
            if (arg0 != 100) {
                this.field6324 = null;
            }
            return this.field6324.field6979;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)I")
    public final int method2736(byte arg0) {
        ++field6326;
        if (arg0 != 123) {
            this.field6323 = 83;
        }
        return this.field6324 == null ? 0 : this.field6324.field6962 * 100 / (this.field6324.field6979.length - this.field6319);
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZZ)V")
    public static final void method2737(boolean arg0, boolean arg1) {
        class482.method2865(23105);
        ++field6322;
        if (class203.method1303(class664.field9331, true)) {
            ++class471.field6528;
            if (class471.field6528 >= 50 || arg0) {
                class471.field6528 = 0;
                if (!class669.field9377 && class679.field9490 != null) {
                    ++class136.field1755;
                    class116 var2 = class248.method1672(class84.field1023, class727.field10053, -20647);
                    class443.method2655(0, var2);
                    try {
                        class581.method3420(0);
                    } catch (IOException var3) {
                        class669.field9377 = true;
                    }
                }
                class482.method2865(23105);
                if (!arg1) {
                    method2737(false, true);
                }
            }
        }
    }
}
