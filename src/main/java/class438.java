import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class438 extends class349 {

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field6355 = 0;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field6360 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field6359;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field6363;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Lps;")
    public class162 field6354;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Font;")
    public static Font field6358;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I", line = 4)
    public static final int method2743(int arg0, int arg1) {
        field6361++;
        if (arg0 != 21235) {
            field6358 = null;
        }
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V", line = 76)
    public static final void method2744(int arg0, int arg1) {
        class159.method1061((byte) -72);
        field6357++;
        class118.method859(0);
        int var2 = class63.method559(arg1, (byte) -117).field2389;
        if (var2 == 0) {
            return;
        }
        if (arg0 != 32325) {
            method2745(-128);
        }
        int var3 = class100.field1325[arg1];
        if (var2 == 9) {
            class378.field5530 = var3;
        }
        if (var2 == 6) {
            class389.field5686 = var3;
        }
        if (var2 == 5) {
            class301.field4541 = var3;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 105)
    public static void method2745(int arg0) {
        field6358 = null;
        if (arg0 != 3) {
            method2744(-117, -123);
        }
    }
}
