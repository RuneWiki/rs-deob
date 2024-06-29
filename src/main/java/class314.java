import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class314 extends class276 {

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public int field4949;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field4944 = 2;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field4946 = -1;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 4)
    public final int method1988(int arg0) {
        if (arg0 != -20539) {
            field4944 = 57;
        }
        field4948++;
        return class532.method3149(this.field4938, (byte) 121);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I", line = 17)
    public final int method1989(byte arg0) {
        int var2 = -97 % ((arg0 - 38) / 49);
        field4947++;
        return (this.field4938 & 0x1F3187) >> 18;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BI)[B", line = 30)
    public static final byte[] method1990(byte[] arg0, int arg1) {
        field4940++;
        class23 var2 = new class23(arg0);
        int var3 = var2.method126((byte) -123);
        int var4 = var2.method143(-3230);
        if (arg1 > var4 || !(class463.field6880 == 0 || class463.field6880 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method128(var5, 0, arg1 ^ 0xFFFFFF88, var4);
            return var5;
        } else {
            int var6 = var2.method143(-3230);
            if (var6 < 0 || class463.field6880 != 0 && class463.field6880 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class174.method1179(var7, var6, arg0, var4, 9);
            } else {
                class344.field5382.method1955(var7, 120, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Z", line = 81)
    public final boolean method1991(byte arg0, int arg1) {
        if (arg0 != -120) {
            this.method1992(56);
        }
        field4943++;
        return (this.field4938 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Z", line = 92)
    public final boolean method1992(int arg0) {
        field4941++;
        if (arg0 != 1) {
            this.method1994(35);
        }
        return (this.field4938 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BIIIII)V", line = 104)
    public static final void method1993(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4939++;
        int var6 = class52.method367(arg4, class472.field6996, (byte) -20, class29.field460);
        int var7 = class52.method367(arg5, class472.field6996, (byte) 17, class29.field460);
        int var8 = class52.method367(arg1, class235.field4076, (byte) 102, class182.field2877);
        int var9 = class52.method367(arg3, class235.field4076, (byte) 101, class182.field2877);
        int var10 = -92 % ((arg0 + 49) / 37);
        for (int var11 = var6; var11 <= var7; var11++) {
            class357.method2291(var8, arg2, class209.field3294[var11], var9, -1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Z", line = 140)
    public final boolean method1994(int arg0) {
        field4945++;
        if (arg0 == 1) {
            return (this.field4938 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)Z", line = 151)
    public final boolean method1995(byte arg0) {
        if (arg0 == -56) {
            field4937++;
            return (this.field4938 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V", line = 162)
    public static final void method1996(byte arg0, Object[] arg1, int[] arg2) {
        if (arg0 == -60) {
            field4942++;
            class110.method790(0, arg2.length - 1, arg2, 2, arg1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(II)V", line = 174)
    public class314(int arg0, int arg1) {
        this.field4949 = arg1;
        this.field4938 = arg0;
    }
}
