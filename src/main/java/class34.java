import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class34 extends class85 {

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field504 = -1;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field511 = 0;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field510 = 3353893;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Lhc;")
    public static class235 field514;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "[S")
    public static short[] field508;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method266(int arg0) {
        field508 = null;
        field514 = null;
        if (arg0 != 0) {
            method267(-85, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)I")
    public static final int method267(int arg0, byte arg1) {
        int var2 = -108 % ((2 - arg1) / 59);
        field506++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method268(int arg0, String arg1, boolean arg2) {
        if (arg0 != 0) {
            return;
        }
        if (arg2) {
            try {
                class157.field2441.getAppletContext().showDocument(new URL(class157.field2441.getCodeBase(), arg1), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class215.method1453(class179.field2788.field479, arg0 ^ 0x7E, "loggedout");
            } catch (Throwable var5) {
            }
            try {
                class157.field2441.getAppletContext().showDocument(new URL(class157.field2441.getCodeBase(), arg1), "_top");
            } catch (Exception var4) {
            }
        }
        field505++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)I")
    public static final int method269(int arg0, int arg1, int arg2, int arg3) {
        field512++;
        if (class66.field1107 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class181.field2827[1][var5][var4] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg2 & 0x7F;
        if (arg3 == 103) {
            int var8 = arg1 & 0x7F;
            int var9 = (128 - var7) * class66.field1107[var6][var5][var4 + 1] + class66.field1107[var6][var5 + 1][var4 + 1] * var7 >> 7;
            int var10 = (128 - var7) * class66.field1107[var6][var5][var4] + class66.field1107[var6][var5 + 1][var4] * var7 >> 7;
            return (128 - var8) * var10 + var8 * var9 >> 7;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lhc;ILhc;)V")
    public static final void method270(class235 arg0, int arg1, class235 arg2) {
        class28.field392 = class158.method1070(0, arg2, 16383, class267.field4264, arg0);
        field507++;
        class49.field719 = (class252) class28.field392;
        if (arg1 < -20) {
            class179.field2784 = class158.method1070(0, arg2, 16383, class171.field2663, arg0);
            class228.field3517 = class158.method1070(0, arg2, 16383, class182.field2833, arg0);
        }
    }
}
