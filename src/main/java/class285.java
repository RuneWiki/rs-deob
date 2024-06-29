import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class285 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lbd;")
    public static class44 field4229 = new class44("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[B")
    public byte[] field4238;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[B")
    public byte[] field4240;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I")
    public static final int method1834(int arg0, int arg1) {
        if (arg0 >= -70) {
            method1837(57, (byte) -30, 3, -96, null, null, 127, 102, -88);
        }
        field4231++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLvv;IZILvv;I)I")
    public static final int method1835(boolean arg0, class219 arg1, int arg2, boolean arg3, int arg4, class219 arg5, int arg6) {
        field4239++;
        if (arg2 > -121) {
            method1835(false, null, -34, false, 118, null, -98);
        }
        int var7 = class515.method3005(arg1, arg5, 20338, arg4, arg3);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class515.method3005(arg1, arg5, 20338, arg6, arg0);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method1836(byte arg0) {
        if (arg0 == -46) {
            field4229 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBII[B[BIII)V")
    public static final void method1837(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field4233++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg4[var10001] += arg5[arg8++];
                int var14 = arg7++;
                arg4[var14] += arg5[arg8++];
                int var15 = arg7++;
                arg4[var15] += arg5[arg8++];
                int var16 = arg7++;
                arg4[var16] += arg5[arg8++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg4[var10001] += arg5[arg8++];
            }
            arg7 += arg6;
            arg8 += arg0;
        }
        if (arg1 < 20) {
            field4229 = null;
        }
    }
}
