import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class107 extends class577 {

    @OriginalMember(owner = "client!al", name = "m", descriptor = "[B")
    public static byte[] field1591 = new byte[520];

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Lbu;")
    public static class21 field1590 = new class21(109, 4);

    @OriginalMember(owner = "client!al", name = "w", descriptor = "Lgq;")
    public static class539 field1601 = new class539();

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "J")
    public long field1597;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Lal;")
    public class107 field1598;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Lal;")
    public class107 field1600;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "Lwha;")
    public static class297 field1602;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)Lrh;")
    public static final class277 method824(byte arg0) {
        field1596++;
        if (arg0 != 3) {
            field1602 = null;
        }
        try {
            return (class277) Class.forName("fea").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(B)V")
    public static final void method825(byte arg0) {
        field1592++;
        if (arg0 >= -54) {
            field1602 = null;
        }
        if (class266.field3873 == 9) {
            class225.method1539(false, 5);
        } else if (class266.field3873 == 5 || class266.field3873 == 6) {
            class225.method1539(false, 3);
        } else if (class266.field3873 == 12) {
            class225.method1539(false, 3);
            return;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIIII[B)V")
    public static final void method826(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field1595++;
        if (arg4 > 0 && !class262.method1704(arg4, 3)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class262.method1704(arg3, 3)) {
            int var7 = class397.method2449(4, arg2);
            int var8 = 0;
            int var9 = arg4 >= arg3 ? arg3 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg3 >> 1;
            byte[] var12 = arg6;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg1, arg4, arg3, 0, arg2, 5121, var12, 0);
                if (var9 <= 1) {
                    if (!arg0) {
                        method825((byte) 57);
                        return;
                    }
                    return;
                }
                int var14 = arg4 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg4 = var10;
                arg3 = var11;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public final void method827(int arg0) {
        if (arg0 != 3) {
            method826(true, -73, -29, 26, 115, 30, null);
        }
        field1593++;
        if (this.field1598 != null) {
            this.field1598.field1600 = this.field1600;
            this.field1600.field1598 = this.field1598;
            this.field1600 = null;
            this.field1598 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JB)V")
    public static final void method828(long arg0, byte arg1) {
        field1599++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class723.method4060(271323724, arg0 - 1L);
            class723.method4060(271323724, 1L);
        } else {
            class723.method4060(271323724, arg0);
        }
        int var3 = 125 / ((arg1 + 19) / 41);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method829(boolean arg0) {
        field1601 = null;
        field1602 = null;
        field1591 = null;
        field1590 = null;
        if (!arg0) {
            field1591 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)Z")
    public final boolean method830(int arg0) {
        field1594++;
        if (this.field1598 == null) {
            return false;
        } else if (arg0 == 1) {
            return true;
        } else {
            return true;
        }
    }
}
