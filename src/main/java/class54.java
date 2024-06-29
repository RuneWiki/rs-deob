import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class54 {

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
    private int[] field924;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field923++;
        if (arg4 >= class246.field4355 && class96.field1632 >= arg4 && class246.field4355 <= arg6 && class96.field1632 >= arg6 && arg5 >= class246.field4355 && arg5 <= class96.field1632 && class246.field4355 <= arg9 && arg9 <= class96.field1632 && class149.field2603 <= arg1 && class141.field2493 >= arg1 && arg8 >= class149.field2603 && arg8 <= class141.field2493 && arg2 >= class149.field2603 && arg2 <= class141.field2493 && class149.field2603 <= arg0 && class141.field2493 >= arg0) {
            class41.method237(arg0, arg2, arg3, arg6, 128, arg1, arg5, arg4, arg9, arg8);
        } else {
            class230.method1493(arg3, arg2, arg0, arg8, arg9, arg6, arg4, 128, arg5, arg1);
        }
        int var10 = 65 / ((arg7 - 21) / 32);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method347(int arg0, Object arg1, boolean arg2) {
        field919++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 1) {
            method348(-59, 97);
        }
        if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class144.method1030(var3, false) : var3;
        } else if (arg1 instanceof class123) {
            class123 var4 = (class123) arg1;
            return var4.method894((byte) -78);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public static final void method348(int arg0, int arg1) {
        class160.field2804.method988(arg1, -118);
        field925++;
        if (arg0 != 1) {
            method346(-21, 9, 13, 111, 125, 22, -124, -119, 2, 105);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([I)V")
    public class54(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field924 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field924[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field924[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field924[var5 + var5] = arg0[var4];
            this.field924[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)I")
    public final int method349(byte arg0, int arg1) {
        if (arg0 != -1) {
            this.field924 = null;
        }
        int var3 = (this.field924.length >> 1) - 1;
        int var4 = arg1 & var3;
        field922++;
        while (true) {
            int var5 = this.field924[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field924[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
