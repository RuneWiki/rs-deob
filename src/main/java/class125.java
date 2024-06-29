import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class125 extends class65 {

    @OriginalMember(owner = "client!ng", name = "gc", descriptor = "I")
    public static int field2388 = 1;

    @OriginalMember(owner = "client!ng", name = "dc", descriptor = "Lai;")
    public static class10 field2385 = class44.method278("Nehmen", -66);

    @OriginalMember(owner = "client!ng", name = "lc", descriptor = "I")
    public static int field2393 = 0;

    @OriginalMember(owner = "client!ng", name = "jc", descriptor = "I")
    public static int field2391 = 0;

    @OriginalMember(owner = "client!ng", name = "kc", descriptor = "Lvb;")
    public static class192 field2392 = new class192();

    @OriginalMember(owner = "client!ng", name = "cc", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ng", name = "fc", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ng", name = "hc", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ng", name = "ic", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ng", name = "mc", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ng", name = "ec", descriptor = "Lug;")
    public class188 field2386;

    @OriginalMember(owner = "client!ng", name = "nc", descriptor = "Ljc;")
    public static class85 field2395;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lwa;I)V")
    public static final void method866(class200 arg0, int arg1) {
        int var2 = arg0.field3865;
        ++field2394;
        if (var2 == 324) {
            if (~class70.field1208 == 0) {
                class120.field2312 = arg0.field3928;
                class70.field1208 = arg0.field3915;
            }
            if (class160.field3077.field2223) {
                arg0.field3915 = class70.field1208;
            } else {
                arg0.field3915 = class120.field2312;
            }
        } else {
            if (arg1 != 256) {
                field2395 = null;
            }
            if (var2 == 325) {
                if (class70.field1208 == -1) {
                    class120.field2312 = arg0.field3928;
                    class70.field1208 = arg0.field3915;
                }
                if (!class160.field3077.field2223) {
                    arg0.field3915 = class70.field1208;
                } else {
                    arg0.field3915 = class120.field2312;
                }
            } else if (~var2 == -328) {
                arg0.field3827 = 150;
                arg0.field3909 = (int) (Math.sin((double) class120.field2304 / 40.0D) * 256.0D) & 2047;
                arg0.field3788 = -1;
                arg0.field3841 = 5;
            } else if (~var2 == -329) {
                if (class145.field2767.field602 == null) {
                    arg0.field3788 = 0;
                } else {
                    arg0.field3827 = 150;
                    arg0.field3909 = 2047 & (int) (Math.sin((double) class120.field2304 / 40.0D) * 256.0D);
                    arg0.field3841 = 5;
                    arg0.field3788 = ((int) class145.field2767.field602.method62((byte) -79) << 11) - -2047;
                    arg0.field3893 = class145.field2767.field1089;
                    arg0.field3920 = class145.field2767.field1080;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILdh;II)V")
    public static final void method867(int arg0, class38 arg1, int arg2, int arg3) {
        ++field2389;
        if (~(256 & arg0) != -1) {
            arg1.field1096 = class74.field1273.method774(255);
            arg1.field1090 = class74.field1273.method801(arg3 ^ -133);
            arg1.field1105 = class74.field1273.method767(true);
            arg1.field1104 = class74.field1273.method806(0);
            arg1.field1121 = class74.field1273.method795(-1) + class120.field2304;
            arg1.field1127 = class74.field1273.method780(10664) + class120.field2304;
            arg1.field1122 = class74.field1273.method774(255);
            arg1.field1116 = 1;
            arg1.field1125 = 0;
        }
        if (~(128 & arg0) != -1) {
            int var4 = class74.field1273.method780(10664);
            int var5 = class74.field1273.method767(true);
            if (~var4 == -65536) {
                var4 = -1;
            }
            class65.method426(0, var5, var4, arg1);
        }
        if ((arg0 & 1) != 0) {
            arg1.field1134 = class74.field1273.method762((byte) 101);
            arg1.field1143 = class74.field1273.method780(10664);
        }
        if ((arg0 & 1024) != 0) {
            arg1.field1141 = class74.field1273.method795(-1);
            int var6 = class74.field1273.method797(arg3 ^ 72);
            if (arg1.field1141 == 65535) {
                arg1.field1141 = -1;
            }
            arg1.field1098 = var6 >> 16;
            arg1.field1084 = 0;
            arg1.field1145 = class120.field2304 - -(65535 & var6);
            arg1.field1086 = 0;
            if (arg1.field1145 > class120.field2304) {
                arg1.field1086 = -1;
            }
        }
        if ((arg0 & 32) != 0) {
            int var7 = class74.field1273.method762((byte) 101);
            int var8 = class74.field1273.method806(0);
            int var9 = class74.field1273.method801(-129);
            int var10 = class74.field1273.field2170;
            if (arg1.field602 != null && arg1.field609 != null) {
                long var11 = arg1.field602.method62((byte) -72);
                boolean var13 = false;
                if (var8 <= 1) {
                    for (int var14 = 0; ~var14 > ~class78.field1375; ++var14) {
                        if (~class153.field2935[var14] == ~var11) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && ~field2391 == -1) {
                    class78.field1362.field2170 = 0;
                    class74.field1273.method813(0, var9, (byte) -67, class78.field1362.field2160);
                    class78.field1362.field2170 = 0;
                    class10 var15 = class198.method1264(class147.method1017(class78.field1362, -89).method43(false));
                    arg1.field1087 = var15.method68(-49);
                    arg1.field1101 = var7 & 255;
                    arg1.field1132 = 150;
                    arg1.field1138 = var7 >> 8;
                    if (~var8 != -3 && var8 != 3) {
                        if (~var8 != -2) {
                            class6.method20(2, var15, (byte) 117, arg1.field602);
                        } else {
                            class6.method20(1, var15, (byte) 117, class67.method440(0, new class10[] { class87.field1538, arg1.field602 }));
                        }
                    } else {
                        class6.method20(1, var15, (byte) 117, class67.method440(arg3 + -4, new class10[] { class169.field3259, arg1.field602 }));
                    }
                }
            }
            class74.field1273.field2170 = var9 + var10;
        }
        if (~(64 & arg0) != -1) {
            arg1.field1130 = class74.field1273.method795(arg3 + -5);
            if (arg1.field1130 == 65535) {
                arg1.field1130 = -1;
            }
        }
        if ((2 & arg0) != 0) {
            int var16 = class74.field1273.method767(true);
            int var17 = class74.field1273.method806(0);
            arg1.method428(var17, arg3 + -9, class120.field2304, var16);
            arg1.field1115 = class120.field2304 - -300;
            arg1.field1137 = class74.field1273.method801(-129);
            arg1.field1095 = class74.field1273.method774(255);
        }
        if (~(arg0 & 512) != -1) {
            int var18 = class74.field1273.method806(0);
            int var19 = class74.field1273.method774(255);
            arg1.method428(var19, -5, class120.field2304, var18);
            arg1.field1115 = class120.field2304 - -300;
            arg1.field1137 = class74.field1273.method806(0);
            arg1.field1095 = class74.field1273.method801(-129);
        }
        if (~(8 & arg0) != -1) {
            int var20 = class74.field1273.method801(-129);
            byte[] var21 = new byte[var20];
            class114 var22 = new class114(var21);
            class74.field1273.method813(0, var20, (byte) -66, var21);
            class53.field944[arg2] = var22;
            arg1.method251(arg3 + 9360, var22);
        }
        if (~(arg0 & arg3) != -1) {
            arg1.field1087 = class74.field1273.method764((byte) -106);
            if (~arg1.field1087.method61(0, -1) == -127) {
                arg1.field1087 = arg1.field1087.method52((byte) -118, 1);
                class6.method20(2, arg1.field1087, (byte) 117, arg1.field602);
            } else if (class145.field2767 == arg1) {
                class6.method20(2, arg1.field1087, (byte) 117, arg1.field602);
            }
            arg1.field1138 = 0;
            arg1.field1132 = 150;
            arg1.field1101 = 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)Z")
    public final boolean method250(byte arg0) {
        ++field2384;
        if (this.field2386 == null) {
            return false;
        } else {
            if (arg0 < 21) {
                field2385 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2387;
        if (this.field2386 != null) {
            class77 var10 = super.field1081 != -1 && super.field1110 == 0 ? class142.method958((byte) -117, super.field1081) : null;
            class77 var11 = ~super.field1080 == 0 || super.field1092 == super.field1080 && var10 != null ? null : class142.method958((byte) -106, super.field1080);
            class164 var12 = this.field2386.method1207(var11, super.field1117, 114, var10, super.field1089);
            if (var12 != null) {
                var12.method1093();
                super.field2341 = var12.field2341;
                class164 var13 = null;
                if (super.field1141 != -1 && super.field1086 != -1) {
                    var13 = class135.method919(false, super.field1141).method1048(super.field1086, -113);
                    if (var13 != null) {
                        var13.method1086(0, -super.field1098, 0);
                    }
                }
                if (var13 != null) {
                    var12 = ((class167) var12).method1105(var13);
                }
                if (this.field2386.field3575 == 1) {
                    var12.field3132 = true;
                }
                var12.method253(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
    public static void method868(int arg0) {
        field2395 = null;
        field2385 = null;
        if (arg0 == -24553) {
            field2392 = null;
        }
    }
}
