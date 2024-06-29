import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class87 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Z")
    public static boolean field1347 = false;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static final void method494(byte arg0) {
        field1349++;
        int var1 = 81 % ((arg0 + 34) / 40);
        for (int var2 = 0; var2 < class12.field297; var2++) {
            int var3 = class604.field8727[var2];
            class53 var4 = ((class177) class271.field3550.method2002((byte) -120, (long) var3)).field2476;
            int var5 = class389.field5816.method3115(29871);
            if ((var5 & 0x80) != 0) {
                var5 += class389.field5816.method3115(29871) << 8;
            }
            if ((var5 & 0x2) != 0) {
                if (var4.field805.method446(false)) {
                    class565.method3260(0, var4);
                }
                var4.method316(class563.field8235.method1089(class389.field5816.method3168(65536), false), (byte) 81);
                var4.method2953((byte) 61, var4.field805.field1239);
                var4.field7390 = var4.field805.field1184 << 3;
                if (var4.field805.method446(false)) {
                    class61.method381(var4.field7430[0], null, 0, var4.field7429[0], var4.field7905, null, 0, var4);
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field7362 = class389.field5816.method3145((byte) -121);
                var4.field7386 = 100;
            }
            if ((var5 & 0x100) != 0) {
                int var6 = class389.field5816.method3117(-76104736);
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = class389.field5816.method3169(26488);
                    if ((var10 & 0xC000) == 49152) {
                        int var11 = class389.field5816.method3168(65536);
                        var7[var9] = class151.method1076(var10 << 16, var11);
                    } else {
                        var7[var9] = var10;
                    }
                    var8[var9] = class389.field5816.method3116(82);
                }
                var4.method2964(0, var8, var7);
            }
            if ((var5 & 0x1000) != 0) {
                var4.field7382 = class389.field5816.method3156(6707);
                var4.field7395 = class389.field5816.method3128(32767);
                var4.field7336 = class389.field5816.method3156(6707);
                var4.field7332 = (byte) class389.field5816.method3117(-76104736);
                var4.field7337 = class45.field685 + class389.field5816.method3168(65536);
                var4.field7421 = class45.field685 + class389.field5816.method3168(65536);
            }
            if ((var5 & 0x1) != 0) {
                var4.field813 = class389.field5816.method3168(65536);
                var4.field807 = class389.field5816.method3116(78);
            }
            if ((var5 & 0x400) != 0) {
                var4.field7343 = class389.field5816.method3128(32767);
                var4.field7345 = class389.field5816.method3128(32767);
                var4.field7397 = class389.field5816.method3173(124);
                var4.field7350 = class389.field5816.method3173(79);
                var4.field7359 = class389.field5816.method3169(26488) + class45.field685;
                var4.field7411 = class389.field5816.method3116(-107) + class45.field685;
                var4.field7425 = class389.field5816.method3166((byte) -103);
                var4.field7397 += var4.field7430[0];
                var4.field7350 += var4.field7429[0];
                var4.field7343 += var4.field7430[0];
                var4.field7436 = 1;
                var4.field7345 += var4.field7429[0];
                var4.field7434 = 0;
            }
            if ((var5 & 0x8) != 0) {
                int[] var12 = new int[4];
                for (int var13 = 0; var13 < 4; var13++) {
                    var12[var13] = class389.field5816.method3169(26488);
                    if (var12[var13] == 65535) {
                        var12[var13] = -1;
                    }
                }
                int var14 = class389.field5816.method3139(109);
                class652.method3690((byte) 106, var12, var4, var14);
            }
            if ((var5 & 0x4000) != 0) {
                int var15 = class389.field5816.method3139(114);
                int[] var16 = new int[var15];
                int[] var17 = new int[var15];
                int[] var18 = new int[var15];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = class389.field5816.method3172(32122);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    var16[var19] = var20;
                    var17[var19] = class389.field5816.method3115(29871);
                    var18[var19] = class389.field5816.method3116(-113);
                }
                class174.method1196(var16, var18, (byte) -98, var17, var4);
            }
            if ((var5 & 0x800) != 0) {
                int var21 = class389.field5816.method3109(-2);
                int var22 = class389.field5816.method3139(124);
                var4.method2959(var21, -66, var22, class45.field685);
            }
            if ((var5 & 0x2000) != 0) {
                int var23 = class389.field5816.method3172(32122);
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = class389.field5816.method3141(4);
                int var25 = class389.field5816.method3139(122);
                var4.method2966(-117, var25, var24, var23, true);
            }
            if ((var5 & 0x40) != 0) {
                int var26 = class389.field5816.method3109(-2);
                int var27 = class389.field5816.method3166((byte) -106);
                var4.method2959(var26, -97, var27, class45.field685);
                var4.field7339 = class45.field685 + 300;
                var4.field7330 = class389.field5816.method3166((byte) -57);
            }
            if ((var5 & 0x4) != 0) {
                var4.field7423 = class389.field5816.method3168(65536);
                if (var4.field7423 == 65535) {
                    var4.field7423 = -1;
                }
            }
            if ((var5 & 0x20) != 0) {
                int var28 = class389.field5816.method3116(-107);
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = class389.field5816.method3141(4);
                int var30 = class389.field5816.method3139(121);
                var4.method2966(-98, var30, var29, var28, false);
            }
            if ((var5 & 0x200) != 0) {
                int var31 = class389.field5816.method3116(-107);
                var4.field7366 = class389.field5816.method3166((byte) -93);
                var4.field7364 = class389.field5816.method3139(117);
                var4.field7400 = var31 & 0x7FFF;
                var4.field7335 = (var31 & 0x8000) != 0;
                var4.field7341 = class45.field685 + var4.field7400 + var4.field7366;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLmm;Lmm;)V")
    public static final void method495(boolean arg0, class50 arg1, class50 arg2) {
        if (arg0) {
            return;
        }
        if (arg2.field781 != null) {
            arg2.method300((byte) 61);
        }
        field1350++;
        arg2.field781 = arg1.field781;
        arg2.field780 = arg1;
        arg2.field781.field780 = arg2;
        arg2.field780.field781 = arg2;
    }

    @OriginalMember(owner = "client!vf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1351++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method496(String arg0, byte arg1) {
        if (arg1 >= -81) {
            return -92;
        } else {
            field1352++;
            return class40.method233(-92, arg0, 10, true);
        }
    }
}
