import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class426 extends class383 {

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field6059 = 0;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "[I")
    public static int[] field6044 = new int[1000];

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public int field6043;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public int field6045;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public int field6046;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public int field6048;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field6051;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public int field6052;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public int field6053;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public int field6054;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public int field6055;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public int field6056;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public int field6057;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public int field6058;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public int field6060;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public int field6063;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Lqn;")
    public static class47 field6049;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ai", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field6064;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLtf;)V")
    public static final void method2496(byte arg0, class194 arg1) {
        field6062++;
        arg1.method1204(true);
        int var2 = class66.field858;
        class223 var3 = class23.field336 = class387.field5107[var2] = new class223();
        var3.field4890 = var2;
        int var4 = arg1.method1199(30304, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field4944[0] = var6 - class441.field6317;
        int var7 = var4 & 0x3FFF;
        var3.field2666 = (var3.field4944[0] << 7) + (var3.method1366((byte) -104) << 6);
        var3.field4936[0] = var7 - class320.field4064;
        var3.field2677 = (var3.field4936[0] << 7) + (var3.method1366((byte) -92) << 6);
        class276.field3488 = var3.field2676 = var5;
        if (class424.field5991[var2] != null) {
            var3.method1358(-1, class424.field5991[var2]);
        }
        class436.field6234 = 0;
        class12.field218[class436.field6234++] = var2;
        class477.field6926[var2] = 0;
        class240.field3088 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1199(arg0 + 30308, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class26 var13 = class434.field6167[var8] = new class26();
                var13.field377 = (var10 << 28) + (var11 << 14) + var12;
                var13.field372 = 0;
                var13.field378 = false;
                var13.field375 = -1;
                class62.field811[class240.field3088++] = var8;
                class477.field6926[var8] = 0;
            }
        }
        if (arg0 != -4) {
            method2496((byte) -58, null);
        }
        arg1.method1202(-7);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILya;I)Lt;")
    public final class474 method2497(int arg0, class38 arg1, int arg2) {
        field6050++;
        if (arg0 != 3) {
            this.field6043 = 94;
        }
        int var4 = class461.field6590[this.field6045];
        if (var4 == 0) {
            class314 var11 = class20.method173(this.field6054, this.field6047, this.field6048);
            if (var11 instanceof class329) {
                class329 var12 = (class329) var11;
                if (var12.field4146 != null) {
                    return ((class41) var12.field4146).method179(arg2, arg0 ^ 0x56, arg1);
                }
            }
        } else if (var4 == 1) {
            class372 var9 = class140.method952(this.field6054, this.field6047, this.field6048);
            if (var9 instanceof class85) {
                class85 var10 = (class85) var9;
                if (var10.field1060 != null) {
                    return ((class41) var10.field1060).method179(arg2, 84, arg1);
                }
            }
        } else if (var4 == 2) {
            class205 var5 = class212.method1314(this.field6054, this.field6047, this.field6048, field6064 == null ? (field6064 = method2500("fw")) : field6064);
            if (var5 instanceof class381) {
                class381 var6 = (class381) var5;
                if (var6.field5012 != null) {
                    return ((class41) var6.field5012).method179(arg2, 76, arg1);
                }
            }
        } else if (var4 == 3) {
            class522 var7 = class238.method1430(this.field6054, this.field6047, this.field6048);
            if (var7 instanceof class156) {
                class156 var8 = (class156) var7;
                if (var8.field1985 != null) {
                    return ((class41) var8.field1985).method179(arg2, 99, arg1);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lya;IIIIIIIB)V")
    public static final void method2498(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 > -59) {
            return;
        }
        field6061++;
        class41 var9 = (class41) class20.method173(arg2, arg4, arg7);
        if (var9 != null) {
            class102 var10 = class315.field4017.method1958(-10091, var9.method187(21067));
            int var11 = var9.method178(true) & 0x3;
            int var12 = var9.method189(32725);
            if (var10.field1295 == -1) {
                int var13 = arg5;
                if (var10.field1305 > 0) {
                    var13 = arg6;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method323(4, 1, arg1, arg3, var13);
                    } else if (var11 == 1) {
                        arg0.method373(4, arg1, 1, var13, arg3);
                    } else if (var11 == 2) {
                        arg0.method323(4, 1, arg1 + 3, arg3, var13);
                    } else if (var11 == 3) {
                        arg0.method373(4, arg1, 1, var13, arg3 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method364(1, arg1, 1, arg3, (byte) -48, var13);
                    } else if (var11 == 1) {
                        arg0.method364(1, arg1 + 3, 1, arg3, (byte) -48, var13);
                    } else if (var11 == 2) {
                        arg0.method364(1, arg1 + 3, 1, arg3 + 3, (byte) -48, var13);
                    } else if (var11 == 3) {
                        arg0.method364(1, arg1, 1, arg3 + 3, (byte) -48, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method373(4, arg1, 1, var13, arg3);
                    } else if (var11 == 1) {
                        arg0.method323(4, 1, arg1 + 3, arg3, var13);
                    } else if (var11 == 2) {
                        arg0.method373(4, arg1, 1, var13, arg3 + 3);
                    } else if (var11 == 3) {
                        arg0.method323(4, 1, arg1, arg3, var13);
                    }
                }
            } else {
                class516.method3082(arg0, var11, 4, arg3, arg1, var10);
            }
        }
        class41 var14 = (class41) class212.method1314(arg2, arg4, arg7, field6064 == null ? (field6064 = method2500("fw")) : field6064);
        if (var14 != null) {
            class102 var15 = class315.field4017.method1958(-10091, var14.method187(21067));
            int var16 = var14.method178(true) & 0x3;
            int var17 = var14.method189(32725);
            if (var15.field1295 != -1) {
                class516.method3082(arg0, var16, 4, arg3, arg1, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1305 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method358(var18, arg3, arg1, arg3 + 3, true, arg1 + 3);
                } else {
                    arg0.method358(var18, arg3 + 3, arg1, arg3, true, arg1 + 3);
                }
            }
        }
        class41 var19 = (class41) class238.method1430(arg2, arg4, arg7);
        if (var19 == null) {
            return;
        }
        class102 var20 = class315.field4017.method1958(-10091, var19.method187(21067));
        int var21 = var19.method178(true) & 0x3;
        if (var20.field1295 != -1) {
            class516.method3082(arg0, var21, 4, arg3, arg1, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method2499(byte arg0) {
        field6044 = null;
        field6049 = null;
        if (arg0 != 43) {
            method2499((byte) -100);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2500(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
