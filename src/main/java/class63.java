import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class63 extends class218 {

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    private final int field1159;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    private final int field1152;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    private final int field1161;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    private final int field1153;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lvd;")
    public static class222 field1154 = class212.method1357("http:)4)4www)3runescape)3com)4l=", 10731);

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field1163 = 0;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1162 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Lab;")
    public static class3 field1164;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "[Lva;")
    public static class219[] field1157;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        ++field1156;
        if (arg2 == 59) {
            int var4 = this.field1153 * arg0 >> 12;
            int var5 = this.field1161 * arg0 >> 12;
            int var6 = this.field1159 * arg1 >> 12;
            int var7 = this.field1152 * arg1 >> 12;
            class196.method1204(var5, super.field4046, var4, var7, 6854, super.field4042, var6);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public final void method433(int arg0, int arg1, int arg2) {
        int var4 = this.field1161 * arg2 >> 12;
        ++field1158;
        int var5 = this.field1159 * arg1 >> 12;
        int var6 = this.field1152 * arg1 >> 12;
        int var7 = this.field1153 * arg2 >> 12;
        class113.method732(var4, super.field4043, 1, var6, super.field4042, var5, var7, super.field4046);
        if (arg0 != 71) {
            method436(100, -98, 3, -80, -115, -13);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BII)V")
    public final void method434(byte arg0, int arg1, int arg2) {
        ++field1160;
        if (arg0 <= 55) {
            field1154 = null;
        }
        int var4 = this.field1153 * arg1 >> 12;
        int var5 = this.field1161 * arg1 >> 12;
        int var6 = this.field1159 * arg2 >> 12;
        int var7 = this.field1152 * arg2 >> 12;
        class82.method538(super.field4043, var7, var4, var5, (byte) -9, var6);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method435(int arg0) {
        field1154 = null;
        field1157 = null;
        if (arg0 != 16777215) {
            method436(-58, 10, 1, 15, -35, -96);
        }
        field1162 = null;
        field1164 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
    public static final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1155;
        if (class230.field4322 >= arg4 && class129.field2514 <= arg0) {
            boolean var6;
            if (class112.field2107 > arg3) {
                arg3 = class112.field2107;
                var6 = false;
            } else if (~class127.field2448 <= ~arg3) {
                var6 = true;
            } else {
                var6 = false;
                arg3 = class127.field2448;
            }
            boolean var7;
            if (arg2 < class112.field2107) {
                var7 = false;
                arg2 = class112.field2107;
            } else if (~class127.field2448 > ~arg2) {
                var7 = false;
                arg2 = class127.field2448;
            } else {
                var7 = true;
            }
            if (arg4 >= class129.field2514) {
                class81.method532(arg2, arg5, class156.field2981[arg4++], arg3, arg1 ^ -30345);
            } else {
                arg4 = class129.field2514;
            }
            if (arg0 > class230.field4322) {
                arg0 = class230.field4322;
            } else {
                class81.method532(arg2, arg5, class156.field2981[arg0--], arg3, -7);
            }
            if (var7 && var6) {
                for (int var8 = arg4; arg0 >= var8; ++var8) {
                    int[] var9 = class156.field2981[var8];
                    var9[arg2] = var9[arg3] = arg5;
                }
            } else if (!var7) {
                if (var6) {
                    for (int var10 = arg4; arg0 >= var10; ++var10) {
                        class156.field2981[var10][arg3] = arg5;
                    }
                }
            } else {
                for (int var11 = arg4; var11 <= arg0; ++var11) {
                    class156.field2981[var11][arg2] = arg5;
                }
            }
        }
        if (arg1 != 30350) {
            method436(-20, 110, 108, -11, -114, 106);
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIII)V")
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1159 = arg1;
        this.field1152 = arg3;
        this.field1161 = arg2;
        this.field1153 = arg0;
    }
}
