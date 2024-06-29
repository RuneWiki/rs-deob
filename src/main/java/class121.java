import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class121 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lij;")
    public static class50 field2127 = class78.method578(126, "(Y<)4col>");

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field2131 = 0;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lij;")
    public static class50 field2130 = class78.method578(126, " (X");

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lij;")
    public static class50 field2132 = class78.method578(124, "Benutzen");

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lda;")
    public static class22 field2134;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public static final int method876(int arg0, int arg1, int arg2) {
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        field2125++;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (arg1 != -2029676493) {
            method883((String) null, (byte) 8, (Throwable) null);
        }
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method877(int arg0) {
        field2130 = null;
        int var1 = 53 / ((arg0 + 51) / 33);
        field2132 = null;
        field2134 = null;
        field2127 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method878(int arg0) {
        int var1 = 0;
        if (arg0 <= 10) {
            field2127 = null;
        }
        while (class6.field72 > var1) {
            int var10002 = class178.field2981[var1]--;
            if (class178.field2981[var1] >= -10) {
                label88: {
                    class218 var3 = class187.field3077[var1];
                    if (var3 == null) {
                        var3 = class218.method1496(class124.field2181, class53.field965[var1], 0);
                        if (var3 == null) {
                            break label88;
                        }
                        class178.field2981[var1] += var3.method1497();
                        class187.field3077[var1] = var3;
                    }
                    if (class178.field2981[var1] < 0) {
                        label91: {
                            int var4;
                            if (class96.field1806[var1] == 0) {
                                var4 = class196.field3249;
                            } else {
                                int var5 = (class96.field1806[var1] & 0xFF) * 128;
                                int var6 = class96.field1806[var1] >> 8 & 0xFF;
                                int var7 = var6 * 128 + 64 - class239.field4067.field4027;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = (class96.field1806[var1] & 0xFFBAB1) >> 16;
                                int var9 = var8 * 128 + 64 - class239.field4067.field3990;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    class178.field2981[var1] = -100;
                                    break label91;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class203.field3379 / var5;
                            }
                            if (var4 > 0) {
                                class107 var11 = var3.method1499().method800(class166.field2818);
                                class23 var12 = class23.method201(var11, 100, var4);
                                var12.method208(class10.field283[var1] - 1);
                                class174.field2907.method74(var12);
                            }
                            class178.field2981[var1] = -100;
                        }
                    }
                }
            } else {
                class6.field72--;
                for (int var2 = var1; var2 < class6.field72; var2++) {
                    class53.field965[var2] = class53.field965[var2 + 1];
                    class187.field3077[var2] = class187.field3077[var2 + 1];
                    class10.field283[var2] = class10.field283[var2 + 1];
                    class178.field2981[var2] = class178.field2981[var2 + 1];
                    class96.field1806[var2] = class96.field1806[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field2136++;
        if (class91.field1718 && !class193.method1308(false)) {
            if (class66.field1260 != 0 && class250.field4347 != -1) {
                class248.method1689(0, (byte) 58, class56.field1014, class250.field4347, false, class66.field1260);
            }
            class91.field1718 = false;
        } else if (class66.field1260 != 0 && class250.field4347 != -1 && !class193.method1308(false)) {
            class240.field4133++;
            class190.field3141.method1598((byte) -91, 244);
            class190.field3141.method1446(15, class250.field4347);
            class250.field4347 = -1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lcj;")
    public static final class28 method879(int arg0, int arg1) {
        field2126++;
        class28 var2 = (class28) class99.field1821.method764((byte) 70, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class60.field1101.method190((byte) -87, class21.method160((byte) -116, arg0), class258.method1738(arg0, -411383350));
        class28 var4 = new class28();
        if (var3 != null) {
            var4.method255(-121, new class217(var3));
        }
        if (arg1 == 18542) {
            class99.field1821.method765((byte) -128, var4, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)I")
    public static final int method880(int arg0, byte arg1) {
        field2138++;
        double var2 = (double) ((arg0 & 0xFFE3DB) >> 16) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = (double) ((arg0 & 0xFF3A) >> 8) / 256.0D;
        double var8 = var2;
        double var10 = 0.0D;
        double var12 = var2;
        if (var6 < var2) {
            var8 = var6;
        }
        if (var6 > var2) {
            var12 = var6;
        }
        double var14 = 0.0D;
        if (var4 < var8) {
            var8 = var4;
        }
        if (arg1 >= -125) {
            field2131 = 18;
        }
        if (var12 < var4) {
            var12 = var4;
        }
        double var16 = (var8 + var12) / 2.0D;
        if (var8 != var12) {
            if (var16 < 0.5D) {
                var14 = (var12 - var8) / (var8 + var12);
            }
            if (var2 == var12) {
                var10 = (var6 - var4) / (var12 - var8);
            } else if (var6 == var12) {
                var10 = (var4 - var2) / (var12 - var8) + 2.0D;
            } else if (var4 == var12) {
                var10 = (var2 - var6) / (var12 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var12 - var8) / (2.0D - var12 - var8);
            }
        }
        double var18 = var10 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + ((var20 >> 2 << 10) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ltf;ILgi;ZILsg;II)V")
    public static final void method881(class53 arg0, int arg1, class187 arg2, boolean arg3, int arg4, class243 arg5, int arg6, int arg7) {
        class60 var8 = new class60();
        var8.field1100 = arg7 * 128;
        var8.field1099 = arg4 * 128;
        field2129++;
        var8.field1098 = arg6;
        if (arg5 != null) {
            var8.field1108 = arg5.field4201;
            var8.field1106 = arg5.field4210 * 128;
            var8.field1104 = arg5.field4230;
            var8.field1091 = arg5.field4184;
            var8.field1112 = arg5.field4209;
            var8.field1117 = arg5;
            int var10 = arg5.field4223;
            int var11 = arg5.field4235;
            if (arg1 == 1 || arg1 == 3) {
                var10 = arg5.field4235;
                var11 = arg5.field4223;
            }
            var8.field1095 = (arg4 + var11) * 128;
            var8.field1093 = (arg7 + var10) * 128;
            if (arg5.field4197 != null) {
                var8.field1111 = true;
                var8.method466(arg3);
            }
            if (var8.field1091 != null) {
                var8.field1097 = var8.field1104 + (int) ((double) (var8.field1108 - var8.field1104) * Math.random());
            }
            class183.field3011.method684(var8, (byte) 109);
        } else if (arg0 != null) {
            var8.field1115 = arg0;
            class62 var9 = arg0.field959;
            if (var9.field1160 != null) {
                var8.field1111 = true;
                var9 = var9.method486((byte) -123);
            }
            if (var9 != null) {
                var8.field1093 = (arg7 + var9.field1138) * 128;
                var8.field1095 = (var9.field1138 + arg4) * 128;
                var8.field1112 = class40.method310(-1, arg0);
                var8.field1106 = var9.field1156 * 128;
            }
            class217.field3637.method684(var8, (byte) 109);
        } else if (arg2 != null) {
            var8.field1093 = (arg7 + arg2.field3976) * 128;
            var8.field1105 = arg2;
            var8.field1095 = (arg2.field3976 + arg4) * 128;
            var8.field1112 = class63.method495((byte) -4, arg2);
            var8.field1106 = arg2.field3062 * 128;
            class87.field1677.method445(95, arg2.field3097.method368((byte) -103), var8);
        }
        if (!arg3) {
            field2132 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static final void method882(int arg0) {
        if (arg0 != 1) {
            method882(-13);
        }
        class99.field1821.method762((byte) 117);
        field2128++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
    public static final void method883(String arg0, byte arg1, Throwable arg2) {
        field2137++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class233.method1585(arg2, -86);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class233.field3910.field2408 != null) {
                class9 var8 = class233.field3910.method957(new URL(class233.field3910.field2408.getCodeBase(), "clienterror.ws?c=" + class74.field1402 + "&u=" + class132.field2308 + "&v1=" + class138.field2397 + "&v2=" + class138.field2390 + "&e=" + var7), (byte) 110);
                while (var8.field133 == 0) {
                    class162.method1137(73, 1L);
                }
                if (arg1 > -70) {
                    field2127 = null;
                }
                if (var8.field133 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field132;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
