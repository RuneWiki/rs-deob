import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class94 {

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "S")
    public short field1318;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "S")
    public short field1311;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "B")
    public byte field1322;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Z")
    public boolean field1315;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "S")
    public short field1320;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "Lmg;")
    public static class151 field1317 = new class151();

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "F")
    public static float field1325;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Lnd;")
    public static class547 field1324;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Lcv;")
    public static class570 field1319;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field1326;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)[Leha;")
    public static final class91[] method762(int arg0) {
        field1309++;
        if (arg0 != 1) {
            field1325 = 1.8649042F;
        }
        return new class91[] { class309.field4066, class123.field1782, class264.field3332 };
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
    public static void method763(byte arg0) {
        field1317 = null;
        field1319 = null;
        if (arg0 <= -120) {
            field1324 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)[Lcha;")
    public static final class220[] method764(int arg0) {
        field1316++;
        if (arg0 != 10912) {
            field1319 = null;
        }
        return new class220[] { class391.field4977, class106.field1529, class182.field2546, class602.field8366, class104.field1426, class428.field5734, class543.field7503, class379.field4837, class349.field4498, class643.field8919, class299.field3932, class262.field3313, class732.field10184, class232.field3049, class83.field1135 };
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
    public static final void method765(boolean arg0, int arg1) {
        field1321++;
        for (class357 var2 = (class357) class482.field6546.method3672(-1); var2 != null; var2 = (class357) class482.field6546.method3662(-1)) {
            if (var2.field4617 != null) {
                class307.field4055.method1319(var2.field4617);
                var2.field4617 = null;
            }
            if (var2.field4609 != null) {
                class307.field4055.method1319(var2.field4609);
                var2.field4609 = null;
            }
            var2.method1175(-2);
        }
        int var3 = 125 / ((arg1 + 27) / 55);
        if (!arg0) {
            return;
        }
        for (class357 var4 = (class357) class757.field10561.method3672(-1); var4 != null; var4 = (class357) class757.field10561.method3662(-1)) {
            if (var4.field4617 != null) {
                class307.field4055.method1319(var4.field4617);
                var4.field4617 = null;
            }
            var4.method1175(-2);
        }
        for (class357 var5 = (class357) class600.field8352.method1156(0); var5 != null; var5 = (class357) class600.field8352.method1158(22706)) {
            if (var5.field4617 != null) {
                class307.field4055.method1319(var5.field4617);
                var5.field4617 = null;
            }
            var5.method1175(-2);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lrg;ZLrg;)V")
    public static final void method766(class644 arg0, boolean arg1, class644 arg2) {
        if (arg2.field8926 != null) {
            arg2.method3615(81);
        }
        if (arg1) {
            field1319 = null;
        }
        field1312++;
        arg2.field8926 = arg0;
        arg2.field8921 = arg0.field8921;
        arg2.field8926.field8921 = arg2;
        arg2.field8921.field8926 = arg2;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1308 = arg0;
        this.field1318 = (short) arg4;
        this.field1310 = arg1;
        this.field1313 = arg3;
        this.field1311 = (short) arg6;
        this.field1314 = arg2;
        this.field1322 = (byte) arg8;
        this.field1307 = arg11;
        this.field1315 = arg10;
        this.field1320 = (short) arg5;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIBIILha;II)V")
    public static final void method767(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class60 arg6, int arg7, int arg8) {
        field1323++;
        class457 var9 = (class457) class527.method3046(arg0, arg5, arg4);
        if (var9 != null) {
            class543 var10 = client.field3995.method3384(var9.method745((byte) 26), false);
            int var11 = var9.method743(-30968) & 0x3;
            int var12 = var9.method758(true);
            if (var10.field7512 == -1) {
                int var13 = arg1;
                if (var10.field7550 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg6.method441(4, arg8, var13, arg7, -22315);
                    } else if (var11 == 1) {
                        arg6.method439(arg7, arg8, 4, true, var13);
                    } else if (var11 == 2) {
                        arg6.method441(4, arg8 + 3, var13, arg7, -22315);
                    } else if (var11 == 3) {
                        arg6.method439(arg7 + 3, arg8, 4, true, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg6.method544(var13, 1, arg8, 18553, 1, arg7);
                    } else if (var11 == 1) {
                        arg6.method544(var13, 1, arg8 + 3, 18553, 1, arg7);
                    } else if (var11 == 2) {
                        arg6.method544(var13, 1, arg8 + 3, 18553, 1, arg7 + 3);
                    } else if (var11 == 3) {
                        arg6.method544(var13, 1, arg8, 18553, 1, arg7 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg6.method439(arg7, arg8, 4, true, var13);
                    } else if (var11 == 1) {
                        arg6.method441(4, arg8 + 3, var13, arg7, -22315);
                    } else if (var11 == 2) {
                        arg6.method439(arg7 + 3, arg8, 4, true, var13);
                    } else if (var11 == 3) {
                        arg6.method441(4, arg8, var13, arg7, -22315);
                    }
                }
            } else {
                class61.method573(arg6, arg7, var11, var10, -2704, arg8);
            }
        }
        int var14 = 54 / ((-arg3 - 30) / 37);
        class457 var15 = (class457) class290.method1735(arg0, arg5, arg4, field1326 == null ? (field1326 = method768("rca")) : field1326);
        if (var15 != null) {
            class543 var16 = client.field3995.method3384(var15.method745((byte) -104), false);
            int var17 = var15.method743(-30968) & 0x3;
            int var18 = var15.method758(true);
            if (var16.field7512 != -1) {
                class61.method573(arg6, arg7, var17, var16, -2704, arg8);
            } else if (var18 == 9) {
                int var19 = -1118482;
                if (var16.field7550 > 0) {
                    var19 = -1179648;
                }
                if (var17 == 0 || var17 == 2) {
                    arg6.method494(arg7 + 3, (byte) -111, arg8 + 3, arg7, var19, arg8);
                } else {
                    arg6.method494(arg7, (byte) -77, arg8 + 3, arg7 + 3, var19, arg8);
                }
            }
        }
        class457 var20 = (class457) class146.method1046(arg0, arg5, arg4);
        if (var20 == null) {
            return;
        }
        class543 var21 = client.field3995.method3384(var20.method745((byte) -95), false);
        int var22 = var20.method743(-30968) & 0x3;
        if (var21.field7512 != -1) {
            class61.method573(arg6, arg7, var22, var21, -2704, arg8);
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method768(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
