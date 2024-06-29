import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public abstract class class8 extends class2 {

    @OriginalMember(owner = "mapview!d", name = "lb", descriptor = "[[B")
    public byte[][] field85 = new byte[256][];

    @OriginalMember(owner = "mapview!d", name = "mb", descriptor = "Lua;")
    public static class41 field86 = class16.method86("Enter place name to find", true);

    @OriginalMember(owner = "mapview!d", name = "ob", descriptor = "Lua;")
    public static class41 field88 = class16.method86("Amulet Shop", true);

    @OriginalMember(owner = "mapview!d", name = "kb", descriptor = "Lua;")
    public static class41 field84 = class16.method86("Potters Wheel", true);

    @OriginalMember(owner = "mapview!d", name = "pb", descriptor = "Lua;")
    public static class41 field89 = class16.method86("Prev page", true);

    @OriginalMember(owner = "mapview!d", name = "qb", descriptor = "I")
    public static volatile int field90 = -1;

    @OriginalMember(owner = "mapview!d", name = "rb", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "mapview!d", name = "nb", descriptor = "I")
    public static int sizeX;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(IIIIII)V", line = 11)
    public final void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class12.field118 * arg2 + arg1;
        int var8 = 0;
        int var9 = 0;
        if (class12.field117 > arg2) {
            int var10 = class12.field117 - arg2;
            arg2 = class12.field117;
            arg4 -= var10;
            var7 += class12.field118 * var10;
            var9 += arg3 * var10;
        }
        int var11 = class12.field118 - arg3;
        if (arg1 < class12.field114) {
            int var12 = class12.field114 - arg1;
            var7 += var12;
            arg1 = class12.field114;
            var9 += var12;
            var8 += var12;
            arg3 -= var12;
            var11 += var12;
        }
        if (class12.field120 < arg1 + arg3) {
            int var13 = arg1 + arg3 - class12.field120;
            arg3 -= var13;
            var8 += var13;
            var11 += var13;
        }
        if (arg2 + arg4 > class12.field119) {
            arg4 -= arg2 + arg4 - class12.field119;
        }
        if (arg3 > 0 && arg4 > 0) {
            class13.method76(0, arg4, var8, arg5, arg3, var11, class12.field115, var7, var9, this.field85[arg0]);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IILjava/awt/Component;I)Lo;", line = 74)
    public static final class28 method47(int arg0, int arg1, Component arg2, int arg3) {
        try {
            if (arg3 != 47) {
                field89 = null;
            }
            Class var4 = Class.forName("v");
            class28 var5 = (class28) var4.getDeclaredConstructor().newInstance();
            var5.method177(32, arg2, arg0, arg1);
            return var5;
        } catch (Throwable var8) {
            class38 var7 = new class38();
            var7.method177(32, arg2, arg0, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "(I)V", line = 97)
    public static final void method48(int arg0) {
        if (class19.field156 != null) {
            class9 var1 = class19.field156;
            synchronized (class19.field156) {
                class19.field156 = null;
            }
        }
        if (arg0 != 15666) {
            method48(-43);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 228)
    public class8(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field85 = arg5;
    }

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "(I)V", line = 143)
    public static final void method49(int arg0) {
        if (arg0 <= 95) {
            method49(-113);
        }
        if (class30.field391.toLowerCase().indexOf("microsoft") != -1) {
            class1.field8[221] = 43;
            class1.field8[191] = 73;
            class1.field8[192] = 58;
            class1.field8[190] = 72;
            class1.field8[186] = 57;
            class1.field8[189] = 26;
            class1.field8[219] = 42;
            class1.field8[222] = 59;
            class1.field8[223] = 28;
            class1.field8[220] = 74;
            class1.field8[187] = 27;
            class1.field8[188] = 71;
            return;
        }
        class1.field8[44] = 71;
        class1.field8[61] = 27;
        if (class30.field399 == null) {
            class1.field8[192] = 58;
            class1.field8[222] = 59;
        } else {
            class1.field8[192] = 28;
            class1.field8[520] = 59;
            class1.field8[222] = 58;
        }
        class1.field8[92] = 74;
        class1.field8[59] = 57;
        class1.field8[45] = 26;
        class1.field8[47] = 73;
        class1.field8[91] = 42;
        class1.field8[46] = 72;
        class1.field8[93] = 43;
    }

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "(I)V", line = 192)
    public static void method50(int arg0) {
        field84 = null;
        field86 = null;
        if (arg0 != -20055) {
            method49(20);
        }
        field88 = null;
        field89 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BII)B", line = 209)
    public static final byte method51(byte arg0, int arg1, int arg2) {
        int var3 = 14 / ((10 - arg0) / 61);
        int var4 = arg2 >> 6;
        int var5 = arg1 >> 6;
        if (class36.field452[var5][var4] == null) {
            return 0;
        } else if (class36.field452[var5][var4].field419 == null) {
            return class36.field452[var5][var4].field423;
        } else {
            return class36.field452[var5][var4].field419[(arg1 & 0xFC0) + arg2 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIIIIII)V", line = 248)
    public final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg1 + class12.field118 * arg2;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class12.field117) {
            int var11 = class12.field117 - arg2;
            arg4 -= var11;
            var9 += arg3 * var11;
            arg2 = class12.field117;
            var8 += class12.field118 * var11;
        }
        if (arg2 + arg4 > class12.field119) {
            arg4 -= arg4 + arg2 - class12.field119;
        }
        int var12 = class12.field118 - arg3;
        if (class12.field114 > arg1) {
            int var13 = class12.field114 - arg1;
            arg3 -= var13;
            arg1 = class12.field114;
            var10 += var13;
            var12 += var13;
            var8 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class12.field120) {
            int var14 = arg1 + arg3 - class12.field120;
            arg3 -= var14;
            var10 += var14;
            var12 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class14.method79(-82, arg3, var10, var8, class12.field115, arg6, this.field85[arg0], var12, arg4, var9, arg5);
        }
    }
}
