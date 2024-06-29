import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class32 {

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field403 = 0;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Z")
    public static boolean field404 = false;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Z")
    public static boolean field398 = true;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[I")
    public static int[] field399;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method207(int arg0) {
        field399 = null;
        if (arg0 != 550) {
            field399 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZZILoe;)V")
    public static final void method208(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, class76 arg5) {
        field400++;
        if (class43.field571 >= 50 || arg5 == null || arg5.field1189 == null || arg5.field1189.length <= arg1 || arg5.field1189[arg1] == null) {
            return;
        }
        int var6 = arg5.field1189[arg1][0];
        int var7 = var6 >> 8;
        if (arg5.field1189[arg1].length > 1) {
            int var8 = (int) (Math.random() * (double) arg5.field1189[arg1].length);
            if (var8 > 0) {
                var7 = arg5.field1189[arg1][var8];
            }
        }
        int var9 = var6 & 0x1F;
        int var10 = (var6 & 0xFD) >> 5;
        if (var9 == 0) {
            if (arg3) {
                class245.method1688(0, var7, var10, 255, 0);
            }
        } else if (class171.field2582 != 0) {
            class158.field2463[class43.field571] = var7;
            class55.field810[class43.field571] = var10;
            int var11 = (arg4 - 64) / 128;
            class252.field3798[class43.field571] = 0;
            int var12 = (arg0 - 64) / 128;
            class261.field4035[class43.field571] = null;
            if (!arg2) {
                method208(0, -30, false, false, 104, (class76) null);
            }
            class125.field2117[class43.field571] = 255;
            class101.field1714[class43.field571] = (var11 << 8) + (var12 << 16) + var9;
            class43.field571++;
        }
    }
}
