import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class485 extends class281 {

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public int field6702 = -1;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public int field6697 = 12800;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "Z")
    public boolean field6704 = true;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
    public int field6714 = 0;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public int field6717 = 0;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
    public int field6720 = 12800;

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
    public int field6721 = -1;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public int field6711;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "Ljava/lang/String;")
    public String field6718;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "Ljava/lang/String;")
    public String field6699;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "Ltm;")
    public class412 field6705;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field6709 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "[I")
    public static int[] field6701 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ld;ZILjava/awt/Canvas;)Lha;")
    public static final class65 method2811(class161 arg0, boolean arg1, int arg2, Canvas arg3) {
        if (arg1) {
            return null;
        } else {
            field6710++;
            return new class246(arg3, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
    public static final int method2812(int arg0, int arg1) {
        field6698++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        if (arg0 != 9761) {
            method2811(null, false, 114, null);
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[I)Z")
    public final boolean method2813(int arg0, int arg1, int arg2, int[] arg3) {
        field6722++;
        class414 var5 = (class414) this.field6705.method2551((byte) -108);
        if (arg1 != 1) {
            method2819(13, (byte) -104, -19);
        }
        while (var5 != null) {
            if (var5.method2559(arg2, (byte) 102, arg0)) {
                var5.method2555(arg2, arg3, arg0, 125);
                return true;
            }
            var5 = (class414) this.field6705.method2542(-112);
        }
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[II)Z")
    public final boolean method2814(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field6715++;
        if (arg0 > -3) {
            method2820(false);
        }
        for (class414 var6 = (class414) this.field6705.method2551((byte) -108); var6 != null; var6 = (class414) this.field6705.method2542(-127)) {
            if (var6.method2557(arg1, arg2, -127, arg4)) {
                var6.method2555(arg2, arg3, arg1, 120);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I")
    public static final int method2815(int arg0) {
        if (arg0 == 16) {
            field6700++;
            return 16;
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)I")
    public static final int method2816(int arg0) {
        field6719++;
        if (class632.field8832 == null) {
            int var1 = -126 % ((arg0 + 11) / 44);
            return class701.field9834 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
    public final void method2817(int arg0) {
        this.field6714 = 0;
        if (arg0 != 31208) {
            return;
        }
        field6707++;
        this.field6720 = 12800;
        this.field6717 = 0;
        this.field6697 = 12800;
        for (class414 var2 = (class414) this.field6705.method2551((byte) -108); var2 != null; var2 = (class414) this.field6705.method2542(-100)) {
            if (var2.field5941 < this.field6720) {
                this.field6720 = var2.field5941;
            }
            if (var2.field5948 < this.field6697) {
                this.field6697 = var2.field5948;
            }
            if (this.field6717 < var2.field5950) {
                this.field6717 = var2.field5950;
            }
            if (this.field6714 < var2.field5943) {
                this.field6714 = var2.field5943;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lwea;II)V")
    public static final void method2818(class167[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class167 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field2253;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field2253 > (var7 & 0x1) + var6) {
                class167 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2818(arg0, arg1, var4 - 1);
        method2818(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2819(int arg0, byte arg1, int arg2) {
        field6703++;
        if (arg1 == 22) {
            return (arg2 & 0x100100) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
    public static void method2820(boolean arg0) {
        if (!arg0) {
            field6701 = null;
            field6709 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)Z")
    public final boolean method2821(int arg0, int arg1, int arg2) {
        field6708++;
        if (arg1 > -5) {
            return true;
        }
        for (class414 var4 = (class414) this.field6705.method2551((byte) -108); var4 != null; var4 = (class414) this.field6705.method2542(-118)) {
            if (var4.method2559(arg0, (byte) 69, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method2822(int arg0, int[] arg1, int arg2, byte arg3) {
        field6716++;
        int var5 = 124 / ((2 - arg3) / 47);
        for (class414 var6 = (class414) this.field6705.method2551((byte) -108); var6 != null; var6 = (class414) this.field6705.method2542(-119)) {
            if (var6.method2558(arg0, arg2, 26642)) {
                var6.method2553(arg0, arg1, (byte) 92, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class485(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field6712 = arg0;
        this.field6704 = arg5;
        this.field6711 = arg3;
        this.field6721 = arg6;
        this.field6718 = arg2;
        this.field6699 = arg1;
        this.field6702 = arg4;
        if (this.field6721 == 255) {
            this.field6721 = 0;
        }
        this.field6705 = new class412();
    }
}
