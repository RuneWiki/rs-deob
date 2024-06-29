import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class177 extends class189 {

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "[B")
    public byte[] field2377;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1123(int arg0) {
        for (int var1 = 0; var1 < class504.field7232; var1++) {
            int var2 = class133.field1949[var1];
            class468 var3 = ((class740) class373.field5230.method1180((byte) 26, (long) var2)).field10289;
            int var4 = class89.field1072.method3750((byte) 35);
            if ((var4 & 0x2) != 0) {
                var4 += class89.field1072.method3750((byte) 35) << 8;
            }
            if ((var4 & 0x400) != 0) {
                int var5 = class89.field1072.method3688(7925);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                for (int var8 = 0; var8 < var5; var8++) {
                    int var9 = class89.field1072.method3734(127);
                    if ((var9 & 0xC000) == 49152) {
                        int var10 = class89.field1072.method3757((byte) -65);
                        var6[var8] = class325.method2116(var10, var9 << 16);
                    } else {
                        var6[var8] = var9;
                    }
                    var7[var8] = class89.field1072.method3717(25651);
                }
                var3.method3250(0, var6, var7);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field7962 = class89.field1072.method3719(1854307120);
                var3.field7914 = class89.field1072.method3719(1854307120);
                var3.field7997 = class89.field1072.method3713((byte) -14);
                var3.field7971 = (byte) class89.field1072.method3750((byte) 35);
                var3.field7999 = class740.field10285 + class89.field1072.method3734(126);
                var3.field7983 = class740.field10285 + class89.field1072.method3717(25651);
            }
            if ((var4 & 0x1) != 0) {
                var3.field7937 = class89.field1072.method3697(-1);
                var3.field7924 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var11 = class89.field1072.method3693(106);
                int var12 = class89.field1072.method3688(7925);
                var3.method3251(0, class740.field10285, var11, var12);
                var3.field7994 = class740.field10285 + 300;
                var3.field7987 = class89.field1072.method3688(7925);
            }
            if ((var4 & 0x20) != 0) {
                var3.field6638 = class89.field1072.method3717(25651);
                var3.field6636 = class89.field1072.method3744(true);
            }
            if ((var4 & 0x10) != 0) {
                var3.field8001 = class89.field1072.method3744(true);
                if (var3.field8001 == 65535) {
                    var3.field8001 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field7972 = class89.field1072.method3713((byte) -14);
                var3.field7980 = class89.field1072.method3712(15);
                var3.field7947 = class89.field1072.method3719(1854307120);
                var3.field7967 = class89.field1072.method3698(0);
                var3.field7954 = class89.field1072.method3744(true) + class740.field10285;
                var3.field7969 = class89.field1072.method3744(true) + class740.field10285;
                var3.field7933 = class89.field1072.method3750((byte) 35);
                var3.field7967 += var3.field8015[0];
                var3.field7947 += var3.field8009[0];
                var3.field7980 += var3.field8015[0];
                var3.field7972 += var3.field8009[0];
                var3.field8007 = 0;
                var3.field8014 = 1;
            }
            if ((var4 & 0x4) != 0) {
                int var13 = class89.field1072.method3744(true);
                int var14 = class89.field1072.method3691((byte) 93);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var15 = class89.field1072.method3710(-6067);
                int var16 = var15 & 0x7;
                int var17 = (var15 & 0x7C) >> 3;
                if (var17 == 15) {
                    var17 = -1;
                }
                var3.method3245(var13, var17, false, (byte) 114, var14, var16);
            }
            if ((var4 & 0x2000) != 0) {
                int var18 = class89.field1072.method3757((byte) -65);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class89.field1072.method3700(27326);
                int var20 = class89.field1072.method3750((byte) 35);
                int var21 = var20 & 0x7;
                int var22 = var20 >> 3 & 0xF;
                if (var22 == 15) {
                    var22 = -1;
                }
                var3.method3245(var18, var22, true, (byte) 114, var19, var21);
            }
            if ((var4 & 0x4000) != 0) {
                int var23 = class89.field1072.method3717(25651);
                var3.field7975 = class89.field1072.method3710(-6067);
                var3.field8004 = class89.field1072.method3710(-6067);
                var3.field7978 = var23 & 0x7FFF;
                var3.field7926 = (var23 & 0x8000) != 0;
                var3.field7998 = class740.field10285 + var3.field7978 + var3.field7975;
            }
            if ((var4 & 0x80) != 0) {
                int[] var24 = new int[4];
                for (int var25 = 0; var25 < 4; var25++) {
                    var24[var25] = class89.field1072.method3744(true);
                    if (var24[var25] == 65535) {
                        var24[var25] = -1;
                    }
                }
                int var26 = class89.field1072.method3710(-6067);
                class87.method652(var3, var26, var24, (byte) 99);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field6632.method2274(106)) {
                    class365.method2323(-119, var3);
                }
                var3.method2789(-1, class231.field3110.method2797(class89.field1072.method3744(true), false));
                var3.method3243(-21, var3.field6632.field5051);
                var3.field7959 = var3.field6632.field5035 << 3;
                if (var3.field6632.method2274(116)) {
                    class209.method1283(null, var3.field8015[0], 0, null, var3.field1266, var3.field8009[0], 82, var3);
                }
            }
            if ((var4 & 0x100) != 0) {
                int var27 = class89.field1072.method3693(103);
                int var28 = class89.field1072.method3688(7925);
                var3.method3251(0, class740.field10285, var27, var28);
            }
            if ((var4 & 0x800) != 0) {
                int var29 = class89.field1072.method3688(7925);
                int[] var30 = new int[var29];
                int[] var31 = new int[var29];
                int[] var32 = new int[var29];
                for (int var33 = 0; var33 < var29; var33++) {
                    int var34 = class89.field1072.method3717(25651);
                    if (var34 == 65535) {
                        var34 = -1;
                    }
                    var30[var33] = var34;
                    var31[var33] = class89.field1072.method3710(-6067);
                    var32[var33] = class89.field1072.method3734(127);
                }
                class377.method2366(var31, var32, -1, var3, var30);
            }
        }
        field2378++;
        if (arg0 <= 65) {
            method1124((byte) -35);
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)V", line = 260)
    public static final void method1124(byte arg0) {
        field2376++;
        class593.field8352 = null;
        if (class589.field8295 && class605.method3408((byte) 54) != 1) {
            class662.method3631(class222.field2897 == 3 || class222.field2897 == 7, class115.method805((byte) 53), class231.method1495(-2), (byte) -128, 0, 0);
        }
        int var1 = 0;
        if (arg0 >= -64) {
            return;
        }
        int var2 = 0;
        if (class589.field8295) {
            var1 = class171.method1102(5467);
            var2 = class575.method3288((byte) -121);
        }
        class253.method1677(50, var2, var2, class446.field6323 + var1, var1, class457.field6447, var1, -1, class172.field2348 + var2);
        if (class593.field8352 != null) {
            class526.method3069(true, -1412584499, -13123, class446.field6323 + var1, class172.field2348 + var2, var1, class76.field991.field7010, class498.field7153, var2, class193.field2583, class593.field8352);
            class593.field8352 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "([B)V", line = 294)
    public class177(byte[] arg0) {
        this.field2377 = arg0;
    }
}
