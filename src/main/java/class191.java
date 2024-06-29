import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class191 extends class119 {

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field3626 = 7759444;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3630 = 1;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "[S")
    public static short[] field3631 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Lai;")
    public class10 field3629;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[Lbf;")
    public static class17[] field3625;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method1215(int arg0) {
        field3631 = null;
        field3625 = null;
        if (arg0 < 82) {
            method1216(102, 111L);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IJ)V")
    public static final void method1216(int arg0, long arg1) {
        field3628++;
        if ((long) arg0 == arg1) {
            return;
        }
        if (class124.field2380 >= 100 && class109.field2020 != 1 || class124.field2380 >= 200) {
            class6.method20(0, class189.field3611, (byte) 117, class10.field119);
            return;
        }
        class10 var3 = class56.method381(arg1, (byte) 65).method39(-128);
        for (int var4 = 0; var4 < class124.field2380; var4++) {
            if (class115.field2205[var4] == arg1) {
                class6.method20(0, class67.method440(arg0, new class10[] { var3, class72.field1232 }), (byte) 117, class10.field119);
                return;
            }
        }
        for (int var5 = 0; var5 < class78.field1375; var5++) {
            if (class153.field2935[var5] == arg1) {
                class6.method20(0, class67.method440(0, new class10[] { class4.field40, var3, class130.field2470 }), (byte) 117, class10.field119);
                return;
            }
        }
        if (var3.method64(102, class145.field2767.field602)) {
            class6.method20(0, class168.field3238, (byte) 117, class10.field119);
            return;
        }
        class131.field2480[class124.field2380] = var3;
        class115.field2205[class124.field2380] = arg1;
        class47.field795[class124.field2380] = 0;
        class77.field1341[class124.field2380] = 0;
        class98.field1812 = class7.field78;
        class124.field2380++;
        class76.field1323.method635((byte) -57, 214);
        class76.field1323.method783(arg1, arg0 - 114);
        class55.field978++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([Ll;IIIII[B)V")
    public static final void method1217(class100[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg5 + var12 > 0 && arg5 + var12 < 103 && arg3 + var13 > 0 && arg3 + var13 < 103) {
                        arg0[var7].field1852[arg5 + var12][arg3 + var13] = class123.method861(arg0[var7].field1852[arg5 + var12][arg3 + var13], -16777217);
                    }
                }
            }
        }
        field3624++;
        class114 var8 = new class114(arg6);
        int var9 = 0;
        if (arg4 != 64) {
            method1217(null, 80, -95, 41, -51, 111, null);
        }
        while (var9 < 4) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class67.method437(false, arg1, var9, 0, arg2, arg5 + var10, var8, var11 + arg3);
                }
            }
            var9++;
        }
    }
}
