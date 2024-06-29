import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class419 extends class623 {

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "[B")
    public byte[] field5957;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "Lgaa;")
    public static class460 field5958 = null;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "[C")
    private static char[] field5956 = new char[64];

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "Lmq;")
    public static class78 field5961;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "Lqia;")
    public static class547 field5962;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5956[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5956[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5956[var2] = (char) (var2 + 48 - 52);
        }
        field5956[63] = '-';
        field5956[62] = '*';
        field5961 = new class78(75, -1);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method2491(int arg0, int arg1, int arg2, int arg3) {
        field5955++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            int var5 = 78 % ((arg0 - 21) / 35);
            return 4095 - arg2;
        }
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(II)V", line = 27)
    public static final void method2492(int arg0, int arg1) {
        if (arg1 != -24936) {
            method2495(-80);
        }
        if (class223.field2944.field597.method1472((byte) -123) == 0) {
            arg0 = -1;
        }
        field5959++;
        if (class659.field9051 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class147 var2 = class525.field7423.method205(18592, arg0);
            class196 var3 = var2.method922(54);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class681.field9312.method1551(var3.method1229(), var3.method1234(), class68.field939, new Point(var2.field1777, var2.field1782), var3.method1232(), arg1 ^ 0x583A);
                class659.field9051 = arg0;
            }
        }
        if (arg0 == -1 && class659.field9051 != -1) {
            class681.field9312.method1551(null, -1, class68.field939, new Point(), -1, -14686);
            class659.field9051 = -1;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lmb;Z[[[BIB)Z", line = 70)
    public static final boolean method2493(class410 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class742.field10373) {
            return false;
        }
        int var5 = arg0.field5790 >> class455.field6383;
        int var6 = var5;
        int var7 = arg0.field5784 >> class455.field6383;
        int var8 = var7;
        if (arg0 instanceof class451) {
            var6 = ((class451) arg0).field6322;
            var8 = ((class451) arg0).field6324;
            var5 = ((class451) arg0).field6321;
            var7 = ((class451) arg0).field6328;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field5792 < class126.field1511 && var9 >= class487.field6934 && var9 < class33.field512 && var10 >= class689.field9801 && var10 < class211.field2700) {
                    if ((arg2 == null || arg0.field5779 < arg3 || arg2[arg0.field5779][var9][var10] != arg4) && arg0.method936(-104) && !arg0.method935(102, class618.field8660)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class337.field4349 - 16 && var9 <= class337.field4349 + 16 && var10 >= class561.field7852 - 16 && var10 <= class561.field7852 + 16) {
                        if (class6.field68) {
                            class317.field4078[class528.field7449++].method1906(arg0, false);
                            class528.field7449 %= class86.field1097;
                        } else {
                            arg0.method522(false, class618.field8660);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "([B)V", line = 136)
    public class419(byte[] arg0) {
        this.field5957 = arg0;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "([Ljava/lang/String;II[SI)V", line = 144)
    public static final void method2494(String[] arg0, int arg1, int arg2, short[] arg3, int arg4) {
        field5960++;
        if (arg1 > arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method2494(arg0, var6 - 1, 4095, arg3, arg4);
            method2494(arg0, arg1, 4095, arg3, var6 + 1);
        }
        if (arg2 != 4095) {
            field5961 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V", line = 197)
    public static void method2495(int arg0) {
        if (arg0 != 48) {
            field5961 = null;
        }
        field5958 = null;
        field5961 = null;
        field5956 = null;
        field5962 = null;
    }
}
