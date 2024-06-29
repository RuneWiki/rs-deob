import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class263 extends class281 {

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Z")
    public static boolean field4253 = true;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
    public static boolean field4251;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public static final void method1780(byte arg0) {
        field4254++;
        class124.field1929.method1699(0);
        class206.field3290.method1699(0);
        class189.field3067.method1699(0);
        if (arg0 >= -12) {
            method1780((byte) -116);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method1781(int arg0, boolean arg1, Object arg2) {
        field4255++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class19.method103(false, var3) : var3;
        } else if (arg0 != -2) {
            return null;
        } else if (arg2 instanceof class16) {
            class16 var4 = (class16) arg2;
            return var4.method83(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BI)Z")
    public static final boolean method1782(byte[] arg0, int arg1) {
        field4256++;
        if (arg1 <= 26) {
            method1783(-84, (byte) -7);
        }
        class96 var2 = new class96(arg0);
        int var3 = var2.method584(255);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method584(255) == 1;
        if (var4) {
            class78.method436(var2, (byte) 124);
        }
        class164.method1135(var2, 127);
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)I")
    public static final int method1783(int arg0, byte arg1) {
        field4252++;
        if (arg0 < 0) {
            return 0;
        }
        class54 var2 = (class54) class39.field483.method708((long) arg0, 44);
        if (var2 == null) {
            return class118.method762(false, arg0).field459;
        }
        if (arg1 != 101) {
            method1782((byte[]) null, -43);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field689.length; var4++) {
            if (var2.field689[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class118.method762(false, arg0).field459 - var2.field689.length);
    }
}
