import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class307 extends class293 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4790 = "Created gameworld";

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "[I")
    public static int[] field4793 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLug;Lug;)V", line = 15)
    public static final void method2122(byte arg0, class253 arg1, class253 arg2) {
        class277.field4277 = arg1;
        class277.field4287 = arg2;
        if (arg0 != -9) {
            field4793 = (int[]) null;
        }
        field4791++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BB)[B", line = 34)
    public static final byte[] method2123(byte[] arg0, byte arg1) {
        class6 var2 = new class6(arg0);
        int var3 = var2.method58(-288140008);
        field4788++;
        if (arg1 != -47) {
            field4793 = (int[]) null;
        }
        int var4 = var2.method73((byte) 19);
        if (var4 < 0 || class120.field1672 != 0 && class120.field1672 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method60((byte) -106, 0, var4, var7);
            return var7;
        } else {
            int var5 = var2.method73((byte) 19);
            if (var5 < 0 || class120.field1672 != 0 && class120.field1672 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class338.method2346(var6, var5, arg0, var4, 9);
            } else {
                class267.field4163.method1128(var2, -1, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z", line = 92)
    public static final boolean method2124(int arg0, int arg1, int arg2) {
        int var3 = class183.field2973[arg0][arg1][arg2];
        if (-class234.field3643 == var3) {
            return false;
        } else if (class234.field3643 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class117.method830(var4 + 1, class172.field2843[arg0][arg1][arg2], var5 + 1) && class117.method830(var4 + 128 - 1, class172.field2843[arg0][arg1 + 1][arg2], var5 + 1) && class117.method830(var4 + 128 - 1, class172.field2843[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class117.method830(var4 + 1, class172.field2843[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class183.field2973[arg0][arg1][arg2] = class234.field3643;
                return true;
            } else {
                class183.field2973[arg0][arg1][arg2] = -class234.field3643;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V", line = 123)
    public static final void method2125(int arg0, int arg1) {
        field4789++;
        class198.field3165.method1353(-1, arg0);
        if (arg1 != 0) {
            method2127(6);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V", line = 135)
    public static final void method2126(int arg0, int arg1) {
        field4792++;
        if (class202.field3228 == 0) {
            class92.field1228.method1169(-1606523955, arg1);
        } else {
            class237.field3711 = arg1;
        }
        if (arg0 != 1) {
            method2124(-100, 88, 62);
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V", line = 157)
    public static void method2127(int arg0) {
        if (arg0 <= 46) {
            method2127(116);
        }
        field4793 = null;
        field4790 = null;
    }
}
