import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class432 extends class362 {

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "Lmu;")
    public static class303 field6183 = new class303(86, 6);

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
    public int field6181;

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
    public int field6184;

    @OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
    public static int field6186;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uba", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field6187;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "Ljava/lang/String;")
    public static String field6179;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2630(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIII[BB)Z", line = 4)
    public static final boolean method2624(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field6178++;
        if (arg5 != 39) {
            field6183 = null;
        }
        boolean var6 = true;
        class215 var7 = new class215(arg4);
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method1482(107);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1530(arg5 ^ 0xFFFFFFA7);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method1535(255) >> 2;
                    int var17 = var15 + arg1;
                    int var18 = arg3 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg0 - 1 && var18 < (arg2 - 1)) {
                        class99 var19 = class76.field1366.method1680(0, var8);
                        if (var16 != 22 || class693.field9368.field4417.method966(-32350) != 0 || var19.field1709 != 0 || var19.field1755 == 1 || var19.field1782) {
                            var11 = true;
                            if (!var19.method930(9773)) {
                                class627.field8634++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var12 = var7.method1530(-118);
                if (var12 == 0) {
                    break;
                }
                var7.method1535(255);
            }
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V", line = 89)
    public static void method2625(int arg0) {
        field6179 = null;
        field6183 = null;
        if (arg0 != -5) {
            field6185 = 110;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 101)
    public static final int method2626(boolean arg0, String arg1) {
        field6186++;
        if (!arg0) {
            field6183 = null;
        }
        return class85.method818(-123, 10, true, arg1);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBIIZ)V", line = 114)
    public static final void method2627(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field6180++;
        if (!arg4 && class59.field1172 == arg2 && class531.field7322 == arg0 && class534.field7352 == class382.field5551 || class693.field9368.field4458.method3022(-32350) == 1) {
            return;
        }
        class59.field1172 = arg2;
        class531.field7322 = arg0;
        class534.field7352 = class382.field5551;
        if (class693.field9368.field4458.method3022(-32350) == 1) {
            class534.field7352 = 0;
        }
        class215.method1527(2, arg3);
        class130.method1074(true, class355.field5007, class308.field4276, class497.field6903.method2936(class607.field8336, 544), 2, class272.field3822);
        int var5 = class221.field3177;
        int var6 = class367.field5236;
        class221.field3177 = (class59.field1172 - (class376.field5325 >> 4)) * 8;
        class367.field5236 = (class531.field7322 - (class175.field2711 >> 4)) * 8;
        class655.field8991 = class489.method2894(class59.field1172 * 8, class531.field7322 * 8);
        class28.field753 = null;
        int var7 = class221.field3177 - var5;
        int var8 = class367.field5236 - var6;
        if (arg3 == 11) {
            for (int var9 = 0; var9 < class77.field1375; var9++) {
                class751 var10 = class728.field9860[var9];
                if (var10 != null) {
                    class9 var11 = var10.field10510;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field5746[var12] -= var7;
                        var11.field5743[var12] -= var8;
                    }
                    var11.field5933 -= var8 * 512;
                    var11.field5922 -= var7 * 512;
                }
            }
        } else {
            class738.field9939 = 0;
            boolean var13 = false;
            int var14 = class376.field5325 * 512 - 512;
            int var15 = (class175.field2711 - 1) * 512;
            for (int var16 = 0; var16 < class77.field1375; var16++) {
                class751 var29 = class728.field9860[var16];
                if (var29 != null) {
                    class9 var30 = var29.field10510;
                    var30.field5933 -= var8 * 512;
                    var30.field5922 -= var7 * 512;
                    if (var30.field5922 >= 0 && var30.field5922 <= var14 && var30.field5933 >= 0 && var15 >= var30.field5933) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field5746[var32] -= var7;
                            var30.field5743[var32] -= var8;
                            if (var30.field5746[var32] < 0 || class376.field5325 <= var30.field5746[var32] || var30.field5743[var32] < 0 || var30.field5743[var32] >= class175.field2711) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class737.field9925[class738.field9939++] = var30.field5716;
                        } else {
                            var30.method61(null, -2);
                            var13 = true;
                            var29.method2314((byte) 113);
                        }
                    } else {
                        var30.method61(null, -2);
                        var29.method2314((byte) 80);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class77.field1375 = class86.field1546.method1459(1);
                class86.field1546.method1462(3, class728.field9860);
            }
        }
        if (arg1 <= 122) {
            return;
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class598 var27 = class49.field1040[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field5746[var28] -= var7;
                    var27.field5743[var28] -= var8;
                }
                var27.field5922 -= var7 * 512;
                var27.field5933 -= var8 * 512;
            }
        }
        class741[] var18 = class55.field1118;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class741 var26 = var18[var19];
            if (var26 != null) {
                var26.field9974 -= var8 * 512;
                var26.field9977 -= var7 * 512;
            }
        }
        for (class55 var20 = (class55) class336.field4743.method1269(4); var20 != null; var20 = (class55) class336.field4743.method1264((byte) 68)) {
            var20.field1117 -= var8;
            var20.field1126 -= var7;
            if (class482.field6727 != 4 && (var20.field1126 < 0 || var20.field1117 < 0 || class376.field5325 <= var20.field1126 || class175.field2711 <= var20.field1117)) {
                var20.method2314((byte) 101);
            }
        }
        if (class482.field6727 != 4) {
            for (class206 var21 = (class206) class491.field6801.method1469(0); var21 != null; var21 = (class206) class491.field6801.method1467(0)) {
                int var22 = (int) (var21.field5204 & 0x3FFFL);
                int var23 = var22 - class221.field3177;
                int var24 = (int) (var21.field5204 >> 14 & 0x3FFFL);
                int var25 = var24 - class367.field5236;
                if (var23 < 0 || var25 < 0 || class376.field5325 <= var23 || var25 >= class175.field2711) {
                    var21.method2314((byte) 37);
                }
            }
        }
        if (class295.field4138 != 0) {
            class295.field4138 -= var7;
            class136.field2279 -= var8;
        }
        class217.method1550(true);
        if (arg3 != 11) {
            class197.field2897 -= var8;
            class108.field1896 -= var7 * 512;
            class547.field7541 -= var7;
            class276.field3874 -= var8;
            class113.field1950 -= var7;
            class275.field3870 -= var8 * 512;
            if (Math.abs(var7) > class376.field5325 || Math.abs(var8) > class175.field2711) {
                class440.method2652(true);
            }
        } else if (class438.field6252 == 4) {
            class54.field1111 -= var8 * 512;
            class162.field2584 -= var7 * 512;
            class476.field6650 -= var8 * 512;
            class667.field9105 -= var7 * 512;
        } else {
            class438.field6252 = 1;
            class705.field9558 = -1;
            class44.field978 = -1;
        }
        class4.method16(0);
        class748.method4175(-1);
        class28.field757.method1270(107);
        class148.field2472.method1270(103);
        class399.field5901.method1305((byte) -45);
        class391.method2464((byte) 99);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "([BI)[B", line = 387)
    public static final byte[] method2628(byte[] arg0, int arg1) {
        field6177++;
        class215 var2 = new class215(arg0);
        int var3 = var2.method1535(255);
        if (arg1 > -74) {
            method2626(true, null);
        }
        int var4 = var2.method1533((byte) -126);
        if (var4 < 0 || class519.field7213 != 0 && class519.field7213 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method1537(Integer.MAX_VALUE, 0, var4, var8);
            return var8;
        } else {
            int var5 = var2.method1533((byte) -126);
            if (var5 < 0 || !(class519.field7213 == 0 || class519.field7213 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class687.method3838(var6, var5, arg0, var4, 9);
            } else {
                class286 var7 = class607.field8324;
                synchronized (class607.field8324) {
                    class607.field8324.method1874(var6, 29123, var2);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZIIILha;II)V", line = 445)
    public static final void method2629(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class59 arg6, int arg7, int arg8) {
        field6182++;
        class258 var9 = (class258) class28.method398(arg3, arg5, arg4);
        if (var9 != null) {
            class99 var10 = class76.field1366.method1680(0, var9.method589(-124));
            int var11 = var9.method588(-32228) & 0x3;
            int var12 = var9.method594(35);
            if (var10.field1710 == -1) {
                int var13 = arg8;
                if (var10.field1709 > 0) {
                    var13 = arg0;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg6.method620(arg7, var13, 4, arg1, !arg2);
                    } else if (var11 == 1) {
                        arg6.method617((byte) -79, 4, arg1, var13, arg7);
                    } else if (var11 == 2) {
                        arg6.method620(arg7 + 3, var13, 4, arg1, true);
                    } else if (var11 == 3) {
                        arg6.method617((byte) -121, 4, arg1 + 3, var13, arg7);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg6.method624(1, (byte) -125, arg7, arg1, 1, var13);
                    } else if (var11 == 1) {
                        arg6.method624(1, (byte) -125, arg7 + 3, arg1, 1, var13);
                    } else if (var11 == 2) {
                        arg6.method624(1, (byte) -125, arg7 + 3, arg1 + 3, 1, var13);
                    } else if (var11 == 3) {
                        arg6.method624(1, (byte) -125, arg7, arg1 + 3, 1, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg6.method617((byte) -96, 4, arg1, var13, arg7);
                    } else if (var11 == 1) {
                        arg6.method620(arg7 + 3, var13, 4, arg1, true);
                    } else if (var11 == 2) {
                        arg6.method617((byte) -106, 4, arg1 + 3, var13, arg7);
                    } else if (var11 == 3) {
                        arg6.method620(arg7, var13, 4, arg1, true);
                    }
                }
            } else {
                class277.method1824(arg7, var10, arg1, arg6, var11, 126);
            }
        }
        if (arg2) {
            field6185 = 122;
        }
        class258 var14 = (class258) class562.method3228(arg3, arg5, arg4, field6187 == null ? (field6187 = method2630("se")) : field6187);
        if (var14 != null) {
            class99 var15 = class76.field1366.method1680(0, var14.method589(-88));
            int var16 = var14.method588(-32228) & 0x3;
            int var17 = var14.method594(-126);
            if (var15.field1710 != -1) {
                class277.method1824(arg7, var15, arg1, arg6, var16, -86);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1709 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg6.method616(arg1 + 3, arg7, arg7 + 3, -8003, var18, arg1);
                } else {
                    arg6.method616(arg1, arg7, arg7 + 3, -8003, var18, arg1 + 3);
                }
            }
        }
        class258 var19 = (class258) class12.method112(arg3, arg5, arg4);
        if (var19 == null) {
            return;
        }
        class99 var20 = class76.field1366.method1680(0, var19.method589(-118));
        int var21 = var19.method588(-32228) & 0x3;
        if (var20.field1710 != -1) {
            class277.method1824(arg7, var20, arg1, arg6, var21, -5);
            return;
        }
    }
}
