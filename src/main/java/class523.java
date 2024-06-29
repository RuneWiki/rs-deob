import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class523 {

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public int field7697 = -1;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "[B")
    public static byte[] field7690 = new byte[520];

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "Lho;")
    public static class103 field7700 = new class103(23, 7);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public int field7687;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public int field7689;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public int field7691;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public int field7692;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public int field7695;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public int field7696;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public int field7698;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public int field7699;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lie;IB)V")
    public static final void method3112(class6 arg0, int arg1, byte arg2) {
        if (class280.field3716) {
            class280.field3716 = false;
            arg1 = 0;
        }
        if (arg2 > -42) {
            method3113(true);
        }
        field7686++;
        if (class4.field18 != null && class4.field18.method34(-75, arg0)) {
            return;
        }
        class4.field18 = arg0;
        class62.field712 = class45.method252((byte) -8);
        class99.field1354 = arg1;
        class260.field3495 = arg1;
        if (class260.field3495 != 0) {
            class338.field4481 = class189.field2447;
            class169.field2195 = class287.field3770;
            class532.field7835 = class181.field2358;
            class130.field1687 = class148.field1944;
            class422.field6151 = class114.field1493;
            class511.field7434 = class303.field4033;
            class457.field6823 = class514.field7476;
            class408.field5854 = class490.field7190;
            class60.field699 = class253.field3372;
            class116.field1520 = class53.field619;
            return;
        }
        class183.method1061(21573);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public static void method3113(boolean arg0) {
        if (arg0) {
            field7700 = null;
        }
        field7700 = null;
        field7690 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II[BIIII[BI)V")
    public static final void method3114(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field7694++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg2[var10001] += arg7[arg1++];
                int var14 = arg6++;
                arg2[var14] += arg7[arg1++];
                int var15 = arg6++;
                arg2[var15] += arg7[arg1++];
                int var16 = arg6++;
                arg2[var16] += arg7[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg2[var10001] += arg7[arg1++];
            }
            arg1 += arg3;
            arg6 += arg4;
        }
        if (arg0 > -91) {
            field7693 = -127;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZZ)V")
    public static final void method3115(boolean arg0, boolean arg1) {
        if (arg1) {
            if (class168.field2174 != -1) {
                class319.method1896(class168.field2174, 40);
            }
            for (class360 var2 = (class360) class152.field1989.method300((byte) -121); var2 != null; var2 = (class360) class152.field1989.method301(-120)) {
                if (!var2.method2673(-112)) {
                    var2 = (class360) class152.field1989.method300((byte) -122);
                    if (var2 == null) {
                        break;
                    }
                }
                class115.method696(false, 96, true, var2);
            }
            class168.field2174 = -1;
            class152.field1989 = new class50(8);
            class324.method1913(8);
            class168.field2174 = class286.field3761;
            class334.method1949(false, -28025);
            class104.method628(-127);
            class432.method2654(class168.field2174);
        }
        field7688++;
        class95.field1148 = false;
        class516.field7509 = "";
        class392.field5663 = "";
        class75.method438(119);
        class256.field3403 = -1;
        class363.method2167(class176.field2274, -29608);
        class96.field1170 = new class531();
        class96.field1170.field3694 = class426.field6200 * 128 / 2;
        class96.field1170.field3704 = class308.field4128 * 128 / 2;
        class96.field1170.field1249[0] = class308.field4128 / 2;
        class96.field1170.field1251[0] = class426.field6200 / 2;
        class139.field1857 = 0;
        class238.field3171 = 0;
        if (class47.field491 == 2) {
            class238.field3171 = class527.field7740 << 7;
            class139.field1857 = class168.field2177 << 7;
        } else {
            class154.method914(8);
        }
        if (!arg0) {
            method3113(true);
        }
        class451.method2797((byte) 47);
    }
}
