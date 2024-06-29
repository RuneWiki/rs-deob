import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class41 extends class320 {

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field606 = "Hidden";

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Z")
    public static volatile boolean field608 = true;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lul;")
    public static class51 field612 = new class51(32);

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Ljava/lang/String;")
    public static String field614 = "level: ";

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "F")
    public static float field611;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[[[B")
    public static byte[][][] field615;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 6)
    public static void method342(int arg0) {
        field614 = null;
        if (arg0 != 2047) {
            field614 = (String) null;
        }
        field612 = null;
        field606 = null;
        field615 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZIIII)V", line = 33)
    public static final void method343(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field610++;
        if (arg3) {
            field612 = (class51) null;
        }
        int var8 = arg1 - 334;
        int var9 = 2048 - arg0 & 0x7FF;
        int var10 = 0;
        int var11 = 2048 - arg5 & 0x7FF;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var12 = (class113.field1892 - class295.field4712) * var8 / 100 + class295.field4712;
        int var13 = 0;
        int var14 = arg4 * var12 >> 8;
        int var15 = var14;
        if (var9 != 0) {
            int var16 = class62.field962[var9];
            var13 = -var14 * var16 >> 16;
            int var17 = class62.field961[var9];
            var15 = var14 * var17 >> 16;
        }
        if (var11 != 0) {
            int var18 = class62.field962[var11];
            var10 = var15 * var18 >> 16;
            int var19 = class62.field961[var11];
            var15 = var15 * var19 >> 16;
        }
        class269.field4309 = arg2 - var10;
        class32.field454 = arg7 - var15;
        class141.field2592 = arg0;
        class311.field4924 = arg5;
        class139.field2563 = arg6 - var13;
    }
}
