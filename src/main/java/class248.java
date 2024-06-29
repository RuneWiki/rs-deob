import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class248 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field3984 = -1;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
    public static final int method1639(int arg0, int arg1, int arg2) {
        field3982++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            if (arg0 != -1) {
                field3983 = 85;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)I")
    public abstract int method1280(int arg0);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static final void method1640(byte arg0) {
        if (arg0 < 101) {
            method1642(-87, -92, -19, 25, 68, -42, -70);
        }
        class125.field2096.method1831(-124);
        field3985++;
        class25.field310.method1831(-128);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Lml;")
    public static final class120 method1641(int arg0, byte arg1) {
        field3979++;
        class120 var2 = (class120) class219.field3510.method1839((byte) 125, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class219.field3502.method940((byte) 60, arg0, 1);
        int var4 = -62 % ((arg1 - 46) / 52);
        class120 var5 = new class120();
        if (var3 != null) {
            var5.method844(new class264(var3), true, arg0);
        }
        class219.field3510.method1830((long) arg0, -123, var5);
        return var5;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3980++;
        class6.method40(arg1, -325);
        int var7 = arg1 - arg2;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg1;
        int var10 = arg1;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        if (arg6 <= 74) {
            method1641(83, (byte) -41);
        }
        int var14 = -1;
        int[] var15 = class85.field1162[arg0];
        int var16 = arg4 + var7;
        int var17 = arg4 - var7;
        class168.method1184(128, var17, arg4 - arg1, arg3, var15);
        class168.method1184(128, var16, var17, arg5, var15);
        class168.method1184(128, arg1 + arg4, var16, arg3, var15);
        while (var10 > var8) {
            var13 += 2;
            var9 += var13;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class44.field514[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var7 > var10) {
                    int[] var18 = class85.field1162[arg0 + var10];
                    int[] var19 = class85.field1162[arg0 - var10];
                    int var20 = class44.field514[var10];
                    int var21 = arg4 + var8;
                    int var22 = arg4 + var20;
                    int var23 = arg4 - var8;
                    int var24 = arg4 - var20;
                    class168.method1184(128, var24, var23, arg3, var18);
                    class168.method1184(128, var22, var24, arg5, var18);
                    class168.method1184(128, var21, var22, arg3, var18);
                    class168.method1184(128, var24, var23, arg3, var19);
                    class168.method1184(128, var22, var24, arg5, var19);
                    class168.method1184(128, var21, var22, arg3, var19);
                } else {
                    int[] var25 = class85.field1162[arg0 + var10];
                    int var26 = arg4 + var8;
                    int[] var27 = class85.field1162[arg0 - var10];
                    int var28 = arg4 - var8;
                    class168.method1184(128, var26, var28, arg3, var25);
                    class168.method1184(128, var26, var28, arg3, var27);
                }
            }
            int[] var29 = class85.field1162[arg0 + var8];
            int[] var30 = class85.field1162[arg0 - var8];
            int var31 = arg4 + var10;
            int var32 = arg4 - var10;
            if (var7 <= var8) {
                class168.method1184(128, var31, var32, arg3, var29);
                class168.method1184(128, var31, var32, arg3, var30);
            } else {
                int var33 = var8 > var11 ? class44.field514[var8] : var11;
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class168.method1184(128, var35, var32, arg3, var29);
                class168.method1184(128, var34, var35, arg5, var29);
                class168.method1184(128, var31, var34, arg3, var29);
                class168.method1184(128, var35, var32, arg3, var30);
                class168.method1184(128, var34, var35, arg5, var30);
                class168.method1184(128, var31, var34, arg3, var30);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1282(int arg0, Component arg1);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Lkg;")
    public static final class64 method1643(byte arg0, int arg1) {
        class64 var2 = (class64) class76.field1038.method1579((long) arg1, 0);
        field3981++;
        if (arg0 <= 48) {
            method1641(-72, (byte) 68);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class242.field3881.method940((byte) 101, arg1, 5);
        class64 var4 = new class64();
        if (var3 != null) {
            var4.method513(new class264(var3), false);
        }
        class76.field1038.method1578(var4, (long) arg1, 50);
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1281(Component arg0, boolean arg1);
}
