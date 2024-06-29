import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class470 {

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public int field6966 = 443;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "Z")
    private boolean field6969 = false;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public int field6960 = 43594;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Z")
    private boolean field6965 = false;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "Lrl;")
    public static class672 field6968 = new class672(56, 0);

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Lhga;")
    public static class158 field6972 = new class158(94, 10);

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public int field6971;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Ljava/lang/String;")
    public String field6959;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I")
    public static final int method2915(int arg0, int arg1) {
        field6964++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            int var2 = -26 / ((arg1 - 67) / 34);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
    public static final boolean method2916(int arg0, int arg1, int arg2) {
        if (arg2 == 2048) {
            field6961++;
            return (arg1 & 0x800) != 0 | class408.method2613(arg0, arg1, 32768) || class136.method1170(arg2 ^ 0x872, arg0, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLk;)Lsw;")
    public final class701 method2917(byte arg0, class525 arg1) {
        field6967++;
        return arg0 == 88 ? arg1.method3173(this.field6969, arg0 ^ 0xFFFF8CBB, this.field6959, this.field6965 ? this.field6966 : this.field6960) : null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILpca;Ljava/lang/String;BILla;IILufa;ILua;I)V")
    public static final void method2918(int arg0, class665 arg1, String arg2, byte arg3, int arg4, class418 arg5, int arg6, int arg7, class632 arg8, int arg9, class617 arg10, int arg11) {
        field6963++;
        if (arg3 != -108) {
            return;
        }
        int var12;
        if (class126.field2062 == 4) {
            var12 = (int) class37.field514 & 0x3FFF;
        } else {
            var12 = (int) class37.field514 + class44.field616 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field9411 / 2, arg1.field9282 / 2) + 10;
        int var14 = arg11 * arg11 + (arg4 * arg4);
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class567.field8139[var12];
        int var16 = class567.field8138[var12];
        if (class126.field2062 != 4) {
            var15 = var15 * 256 / (class64.field820 + 256);
            var16 = var16 * 256 / (class64.field820 + 256);
        }
        int var17 = arg4 * var15 + (arg11 * var16) >> 14;
        int var18 = arg4 * var16 - (arg11 * var15) >> 14;
        int var19 = arg8.method3669(0, null, arg2, 100);
        int var20 = arg8.method3670(arg2, null, 0, -1, 100);
        int var21 = var17 - var19 / 2;
        if (var21 >= -arg1.field9411 && arg1.field9411 >= var21 && -arg1.field9282 <= var18 && arg1.field9282 >= var18) {
            arg5.method2658(var19, arg7, 0, arg0, null, arg1.field9282 / 2 + arg0 - var18 - (arg9 - -var20), arg2, 1, arg1.field9411 / 2 + arg6 + var21, arg3 ^ 0xFFFFFFF6, 0, arg6, 0, arg10, null, 50);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public final void method2919(byte arg0) {
        field6962++;
        if (!this.field6965) {
            this.field6969 = true;
            this.field6965 = true;
        } else if (this.field6969) {
            this.field6969 = false;
        } else {
            this.field6965 = false;
        }
        if (arg0 != -100) {
            method2918(4, null, null, (byte) -117, -35, null, -61, -18, null, -70, null, -111);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lmq;B)Z")
    public final boolean method2920(class470 arg0, byte arg1) {
        if (arg1 <= 111) {
            return true;
        }
        field6970++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field6971 == arg0.field6971 && this.field6959.equals(arg0.field6959);
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
    public static void method2921(byte arg0) {
        if (arg0 <= 93) {
            method2916(-72, -112, -45);
        }
        field6968 = null;
        field6972 = null;
    }
}
