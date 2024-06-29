import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lwa;")
    public static class75 field86 = class66.method560("headicons_prayer", false);

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[I")
    public static int[] field97 = new int[1000];

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lic;")
    public static class109 field96 = new class109();

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Lwa;")
    public static class75 field101 = class66.method560("Ladevorgang )2 bitte warten Sie)3", false);

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "F")
    public static float field102;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "Lqj;")
    public static class238 field104;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[B")
    public byte[] field95;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[B")
    public byte[] field99;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[Lbh;")
    public static class258[] field92;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[[Z")
    public static boolean[][] field84;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILre;IIII)V", line = 8)
    public static final void method37(int arg0, int arg1, int arg2, class262 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class270.field4674) {
            class70.field1201 = 32;
        } else {
            class70.field1201 = 0;
        }
        class270.field4674 = false;
        field89++;
        if (class61.field1066 != 0) {
            if (arg1 <= arg2 && arg1 + 16 > arg2 && arg7 <= arg6 && arg7 + 16 > arg6) {
                arg3.field4501 -= 4;
                class291.method2027(arg3, 14580);
            } else if (arg1 <= arg2 && arg1 + 16 > arg2 && arg5 + arg7 - 16 <= arg6 && arg5 + arg7 > arg6) {
                arg3.field4501 += 4;
                class291.method2027(arg3, 14580);
            } else if (arg2 >= (arg1 - class70.field1201) && arg2 < arg1 + class70.field1201 + 16 && (arg7 + 16) <= arg6 && (arg5 + arg7 - 16) > arg6) {
                int var8 = (arg5 - 32) * arg5 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - (arg7 + 16) - (var8 / 2);
                int var10 = arg5 - var8 - 32;
                arg3.field4501 = (arg4 - arg5) * var9 / var10;
                class291.method2027(arg3, arg0 + 14564);
                class270.field4674 = true;
            }
        }
        if (arg0 != 16) {
            method39(-60, -86);
        }
        if (class127.field2200 == 0) {
            return;
        }
        int var11 = arg3.field4531;
        if ((arg1 - var11) <= arg2 && arg7 <= arg6 && arg2 < (arg1 + 16) && arg6 <= arg5 + arg7) {
            arg3.field4501 += class127.field2200 * 45;
            class291.method2027(arg3, arg0 ^ 0x38E4);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 73)
    public static void method38(byte arg0) {
        field97 = null;
        field101 = null;
        field104 = null;
        field84 = (boolean[][]) null;
        field96 = null;
        if (arg0 != -58) {
            method38((byte) 98);
        }
        field86 = null;
        field92 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 96)
    public static final void method39(int arg0, int arg1) {
        class156 var2 = class206.method1525(arg1, arg1 - 32705, arg0);
        field103++;
        var2.method1184((byte) 87);
    }
}
