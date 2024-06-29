import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class104 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field1267 = -1;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Z")
    public static boolean field1268 = false;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "[Ltp;")
    public static class117[] field1269;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 3)
    public static void method560(int arg0) {
        if (arg0 <= 65) {
            field1267 = 91;
        }
        field1269 = null;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V", line = 20)
    public static final void method561(int arg0) {
        for (int var1 = 0; var1 < class353.field5161; var1++) {
            int var2 = class169.field2109[var1];
            class676 var3 = ((class637) class77.field955.method2506(104, (long) var2)).field8702;
            int var4 = class164.field2068.method957((byte) -116);
            if ((var4 & 0x1) != 0) {
                var4 += class164.field2068.method957((byte) -107) << 8;
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field9594.method1251((byte) -127)) {
                    class509.method2879(-123, var3);
                }
                var3.method3740(class318.field4640.method3384((byte) 97, class164.field2068.method898((byte) 96)), -30929);
                var3.method238((byte) -119, var3.field9594.field2591);
                var3.field474 = var3.field9594.field2590 << 3;
                if (var3.field9594.method1251((byte) -127)) {
                    class9.method62(null, var3.field3925, var3, var3.field526[0], null, 0, true, var3.field516[0]);
                }
            }
            if ((var4 & 0x200) != 0) {
                int var5 = class164.field2068.method912(0);
                var3.field511 = class164.field2068.method928(-125);
                var3.field480 = class164.field2068.method957((byte) -80);
                var3.field489 = (var5 & 0x8000) != 0;
                var3.field441 = var5 & 0x7FFF;
                var3.field505 = class430.field5984 + var3.field441 + var3.field511;
            }
            if ((var4 & 0x100) != 0) {
                int var6 = class164.field2068.method936((byte) -31);
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                for (int var10 = 0; var10 < var6; var10++) {
                    int var11 = class164.field2068.method898((byte) 96);
                    if (var11 == 65535) {
                        var11 = -1;
                    }
                    var7[var10] = var11;
                    var8[var10] = class164.field2068.method957((byte) -105);
                    var9[var10] = class164.field2068.method948(false);
                }
                class481.method2682(var8, var7, var9, 0, var3);
            }
            if ((var4 & 0x4) != 0) {
                int var12 = class164.field2068.method912(0);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class164.field2068.method928(-126);
                class87.method485(var12, var3, var13, (byte) -126);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field423 = class164.field2068.method941((byte) -55);
                var3.field472 = class164.field2068.method903(29600);
                var3.field499 = class164.field2068.method950(false);
                var3.field486 = class164.field2068.method941((byte) -55);
                var3.field424 = class164.field2068.method922((byte) -128) + class430.field5984;
                var3.field496 = class164.field2068.method948(false) + class430.field5984;
                var3.field478 = class164.field2068.method942(-112);
                var3.field472 += var3.field516[0];
                var3.field521 = 0;
                var3.field486 += var3.field516[0];
                var3.field499 += var3.field526[0];
                var3.field423 += var3.field526[0];
                var3.field520 = 1;
            }
            if ((var4 & 0x8) != 0) {
                int var14 = class164.field2068.method914(-70);
                int var15 = class164.field2068.method928(-119);
                var3.method231(var14, var15, false, class430.field5984);
                var3.field431 = class430.field5984 + 300;
                var3.field493 = class164.field2068.method928(-126);
            }
            if ((var4 & 0x800) != 0) {
                var3.field509 = class164.field2068.method941((byte) -55);
                var3.field465 = class164.field2068.method903(29600);
                var3.field438 = class164.field2068.method899(11923);
                var3.field460 = (byte) class164.field2068.method928(-126);
                var3.field494 = class430.field5984 + class164.field2068.method922((byte) -115);
                var3.field508 = class430.field5984 + class164.field2068.method922((byte) -114);
            }
            if ((var4 & 0x20) != 0) {
                var3.field430 = class164.field2068.method948(false);
                if (var3.field430 == 65535) {
                    var3.field430 = -1;
                }
            }
            if ((var4 & 0x400) != 0) {
                int var16 = class164.field2068.method914(97);
                int var17 = class164.field2068.method957((byte) -120);
                var3.method231(var16, var17, false, class430.field5984);
            }
            if ((var4 & 0x10) != 0) {
                int var18 = class164.field2068.method948(false);
                int var19 = class164.field2068.method929(57);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var20 = class164.field2068.method928(-127);
                var3.method232(false, false, var18, var20, var19);
            }
            if ((var4 & 0x2000) != 0) {
                int var21 = class164.field2068.method922((byte) -120);
                int var22 = class164.field2068.method929(-123);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var23 = class164.field2068.method942(-28);
                var3.method232(false, true, var21, var23, var22);
            }
            if ((var4 & 0x80) != 0) {
                var3.field503 = class164.field2068.method907(false);
                var3.field443 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field9593 = class164.field2068.method898((byte) 96);
                var3.field9586 = class164.field2068.method898((byte) 96);
            }
        }
        if (arg0 < 88) {
            field1269 = null;
        }
        field1266++;
    }
}
