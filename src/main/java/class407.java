import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public abstract class class407 extends class402 {

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public int field5930;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "B")
    public byte field5922;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "Z")
    public boolean field5933;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "S")
    public short field5924;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public int field5932;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public int field5921;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "S")
    public short field5918;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "S")
    public short field5917;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "B")
    public byte field5919;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "S")
    public short field5920;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "Z")
    public static boolean field5929 = false;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    public static int field5935 = -1;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "[I")
    public static int[] field5934 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "Z")
    public static boolean field5937 = true;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public int field5927;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Luh;")
    public static class414 field5928;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "[Ll;")
    public static class315[] field5923;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method2576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class78.field1091 = arg0;
        class266.field3956 = arg4;
        field5925++;
        class20.field351 = arg1;
        if (arg2 != 0) {
            field5937 = true;
        }
        class212.field2969 = arg5;
        class166.field2252 = arg6;
        class77.field1072 = arg3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([BI)[B", line = 21)
    public static final byte[] method2577(byte[] arg0, int arg1) {
        field5936++;
        if (arg1 != 1) {
            field5929 = false;
        }
        class341 var2 = new class341(arg0);
        int var3 = var2.method2233((byte) 104);
        int var4 = var2.method2232(114);
        if (var4 < 0 || !(class361.field5347 == 0 || class361.field5347 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method2210(false, var4, var7, 0);
            return var7;
        } else {
            int var5 = var2.method2232(100);
            if (var5 < 0 || !(class361.field5347 == 0 || class361.field5347 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class327.method2147(var6, var5, arg0, var4, 9);
            } else {
                class399.field5846.method1813(arg1 ^ 0x75, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)V", line = 84)
    public static void method2578(int arg0) {
        field5928 = null;
        field5934 = null;
        if (arg0 == 0) {
            field5923 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)V", line = 109)
    public void method636(byte arg0) {
        int var2 = 107 / ((arg0 + 37) / 35);
        field5926++;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ltm;Lir;Lir;BLir;)Z", line = 118)
    public static final boolean method2579(class20 arg0, class185 arg1, class185 arg2, byte arg3, class185 arg4) {
        class78.field1095 = arg0;
        if (arg3 != 106) {
            return true;
        }
        class93.field1269 = arg2;
        class45.field691 = arg4;
        class391.field5716 = arg1;
        field5931++;
        return true;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 145)
    public class407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field5930 = (short) arg3;
        this.field5922 = (byte) arg0;
        this.field5933 = arg8;
        this.field5924 = (short) arg5;
        this.field5932 = (short) arg2;
        this.field5921 = (short) arg1;
        this.field5918 = (short) arg6;
        this.field5917 = (short) arg4;
        this.field5919 = arg9;
        this.field5920 = (short) arg7;
    }

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)I")
    public abstract int method345(int arg0);
}
