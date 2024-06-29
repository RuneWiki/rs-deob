import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class255 extends class7 {

    @OriginalMember(owner = "client!os", name = "x", descriptor = "Z")
    public volatile boolean field4129 = true;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4131 = "Unable to find ";

    @OriginalMember(owner = "client!os", name = "E", descriptor = "Z")
    public static boolean field4136 = false;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static volatile int field4128 = 0;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "Z")
    public boolean field4127;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "Z")
    public boolean field4132;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)V")
    public static final void method1758(int arg0, byte arg1, int arg2) {
        field4135++;
        class211 var3 = class281.method1921(6, arg0, (byte) -95);
        var3.method1490((byte) 117);
        var3.field3379 = arg2;
        if (arg1 <= 68) {
            field4137 = -122;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V")
    public static void method1759(byte arg0) {
        if (arg0 > 32) {
            field4131 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I")
    public abstract int method812(int arg0);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Lfd;")
    public static final class309 method1760(int arg0, int arg1) {
        if (arg1 != 63) {
            method1759((byte) 106);
        }
        field4133++;
        class309 var2 = (class309) class235.field3943.method1660(2, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field760.method2771(11, arg0, arg1 ^ 0x3C);
        class309 var4 = new class309();
        if (var3 != null) {
            var4.method2069(new class186(var3), -18650);
        }
        class235.field3943.method1655(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[Lfn;ILe;IZIZII[BI)V")
    public static final void method1761(int arg0, class72[] arg1, int arg2, class312 arg3, int arg4, boolean arg5, int arg6, boolean arg7, int arg8, int arg9, byte[] arg10, int arg11) {
        field4130++;
        class186 var12 = new class186(arg10);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1281((byte) -68);
            if (var14 == 0) {
                if (!arg7) {
                    method1761(-17, (class72[]) null, -49, (class312) null, 68, false, 63, true, -75, 38, (byte[]) null, -80);
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1299(-118);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method1322(false);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg11 == var19 && arg9 <= var18 && (arg9 + 8) > var18 && var17 >= arg8 && var17 < arg8 + 8) {
                    class127 var23 = class137.method1003(var13, -30796);
                    int var24 = class424.method2632(1, arg4, var17 & 0x7, var18 & 0x7, var22, var23.field1944, var23.field2014) + arg6;
                    int var25 = arg2 + class104.method789(3, var23.field2014, var17 & 0x7, arg4, var18 & 0x7, var22, var23.field1944);
                    if (var24 > 0 && var25 > 0 && var24 < (class80.field1003 - 1) && class380.field5751 - 1 > var25) {
                        class72 var26 = null;
                        if (!arg5) {
                            int var27 = arg0;
                            if ((class31.field382[1][var24][var25] & 0x2) == 2) {
                                var27 = arg0 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg1[var27];
                            }
                        }
                        class250.method1732(arg5, var26, var24, arg3, var25, true, -1, var21, var22 + arg4 & 0x3, var13, arg0, 1, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)[B")
    public abstract byte[] method814(int arg0);

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V")
    public static final void method1762(int arg0) {
        field4134++;
        if (class138.field2149) {
            return;
        }
        if (class301.field4772) {
            class316.field4958 = (float) ((int) class316.field4958 - 17 & 0xFFFFFFF0);
        } else {
            class137.field2144 += (-12.0F - class137.field2144) / 2.0F;
        }
        class138.field2149 = true;
        if (arg0 != 17) {
            method1760(-38, 63);
        }
        class324.field5089 = true;
    }
}
