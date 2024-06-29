import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class2 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field20 = -1;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Ljava/lang/String;")
    public static String field32 = "Loading title screen - ";

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Z")
    public static boolean field33 = false;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lak;")
    public static class172 field26;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lkh;")
    public static class251 field30;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 6)
    public static void method9(int arg0) {
        if (arg0 == 0) {
            field32 = null;
            field26 = null;
            field30 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V", line = 34)
    public static final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field19++;
        int var6 = arg5;
        int var7 = arg4 * arg4;
        int var8 = arg3 * arg3;
        int var9 = var8 << 1;
        int var10 = arg3;
        int var11 = var7 << 1;
        int var12 = arg3 << 1;
        int var13 = var8 - (var12 - 1) * var11;
        int var14 = (1 - var12) * var7 + var9;
        int var15 = var7 << 2;
        int var16 = var8 << 2;
        int var17 = ((arg3 << 1) - 3) * var11;
        int var18 = ((arg5 << 1) + 3) * var9;
        if (arg2 >= class98.field1410 && class279.field4497 >= arg2) {
            int var19 = class33.method178(class191.field3131, class336.field5249, arg1 + arg4, 89);
            int var20 = class33.method178(class191.field3131, class336.field5249, arg1 - arg4, arg5 ^ 0x25);
            class80.method545(arg0, -66, var19, var20, class281.field4523[arg2]);
        }
        int var21 = (arg5 + 1) * var16;
        int var22 = (arg3 - 1) * var15;
        while (var10 > 0) {
            var10--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var6++;
                    var13 += var21;
                    var21 += var16;
                    var14 += var18;
                    var18 += var16;
                }
            }
            int var23 = arg2 - var10;
            if (var13 < 0) {
                var6++;
                var14 += var18;
                var13 += var21;
                var18 += var16;
                var21 += var16;
            }
            int var24 = arg2 + var10;
            var14 += -var22;
            var13 += -var17;
            if (class98.field1410 <= var24 && class279.field4497 >= var23) {
                int var25 = class33.method178(class191.field3131, class336.field5249, arg1 + var6, arg5 + 111);
                int var26 = class33.method178(class191.field3131, class336.field5249, arg1 - var6, 60);
                if (class98.field1410 <= var23) {
                    class80.method545(arg0, -85, var25, var26, class281.field4523[var23]);
                }
                if (class279.field4497 >= var24) {
                    class80.method545(arg0, arg5 ^ 0xFFFFFFB2, var25, var26, class281.field4523[var24]);
                }
            }
            var17 -= var15;
            var22 -= var15;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 153)
    public static final void method11(int arg0) {
        class136.method1011();
        class174.field2890 = new class40[9];
        field27++;
        class174.field2890[1] = new class257();
        class174.field2890[2] = new class188();
        class174.field2890[3] = new class12();
        class174.field2890[4] = new class337();
        if (arg0 >= 61) {
            class174.field2890[5] = new class151();
            class174.field2890[6] = new class290();
            class174.field2890[7] = new class158();
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I", line = 172)
    public static final int method12(int arg0, int arg1) {
        if (arg1 != 4380) {
            field30 = (class251) null;
        }
        field31++;
        return arg0 & 0xFF;
    }
}
