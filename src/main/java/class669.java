import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class669 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lfba;")
    private class348 field9539 = new class348(64);

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lla;")
    private class423 field9543;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field9538;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public static int[] field9537 = new int[2048];

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[I")
    public static int[] field9542 = new int[5];

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/lang/String;")
    public static String field9541 = "";

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)Lvl;", line = 4)
    public final class172 method3816(byte arg0, int arg1) {
        field9540++;
        class348 var3 = this.field9539;
        class172 var4;
        synchronized (this.field9539) {
            var4 = (class172) this.field9539.method2216(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field9543;
        byte[] var6;
        synchronized (this.field9543) {
            var6 = this.field9543.method2600(0, 19, arg1);
        }
        class172 var7 = new class172();
        if (var6 != null) {
            var7.method1220(new class479(var6), true);
        }
        class348 var8 = this.field9539;
        synchronized (this.field9539) {
            this.field9539.method2213((byte) -16, (long) arg1, var7);
        }
        int var9 = -106 / ((arg0 + 5) / 40);
        return var7;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljw;ZZ)V", line = 45)
    public static final void method3817(class280 arg0, boolean arg1, boolean arg2) {
        arg0.field3915 = arg2;
        if (!class564.field8170) {
            class264.method1746(arg0, class14.field145);
        } else if (arg1) {
            class618.field8804[class618.field8804.length - 1].method1787(true, arg0);
        } else {
            int var3 = class131.method923(arg0.field3919);
            int var4 = class434.field6218[2] * arg0.method599((byte) -62) / arg0.field3926;
            int var5 = class131.method923(arg0.field3919 - var4);
            int var6 = class131.method923(arg0.field3919 + var4);
            if (var5 == var6) {
                class618.field8804[var3].method1787(true, arg0);
            } else if (var6 - var5 == 1) {
                class618.field8804[class143.field1943 + var5].method1787(true, arg0);
            } else {
                class618.field8804[class618.field8804.length - 1].method1787(true, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 79)
    public static final void method3818(int arg0) {
        int var1 = 0;
        if (arg0 > -110) {
            method3819((byte) -53);
        }
        while (class279.field3914 > var1) {
            label161: {
                class105 var3 = class585.field8346[var1];
                boolean var4 = false;
                if (var3.field1485 == null) {
                    var3.field1475--;
                    if (var3.field1475 < (var3.method774(21) ? -1500 : -10)) {
                        var4 = true;
                    } else {
                        if (var3.field1477 == 1 && var3.field1483 == null) {
                            var3.field1483 = class29.method147(class551.field8040, var3.field1486, 0);
                            if (var3.field1483 == null) {
                                break label161;
                            }
                            var3.field1475 += var3.field1483.method145();
                        } else if (var3.method774(21) && (var3.field1481 == null || var3.field1472 == null)) {
                            if (var3.field1481 == null) {
                                var3.field1481 = class531.method3227(class633.field8934, var3.field1486);
                            }
                            if (var3.field1481 == null) {
                                break label161;
                            }
                            if (var3.field1472 == null) {
                                var3.field1472 = var3.field1481.method3229(new int[] { 22050 });
                                if (var3.field1472 == null) {
                                    break label161;
                                }
                            }
                        }
                        if (var3.field1475 < 0) {
                            int var5 = 8192;
                            int var7;
                            if (var3.field1476 == 0) {
                                var7 = var3.field1482 * (var3.field1477 == 3 ? class243.field3580.field7969.method3577(false) : class243.field3580.field7989.method3577(false)) >> 2;
                            } else {
                                int var6 = var3.field1476 >> 24 & 0x3;
                                if (class108.field1536.field3920 == var6) {
                                    int var8 = var3.field1476 & 0xFF << 9;
                                    int var9 = class108.field1536.method2053(true) << 8;
                                    int var10 = (var3.field1476 & 0xFF86C7) >> 16;
                                    int var11 = (var10 << 9) + var9 + 256 - class108.field1536.field3923;
                                    int var12 = var3.field1476 >> 8 & 0xFF;
                                    int var13 = (var12 << 9) + var9 + 256 - class108.field1536.field3916;
                                    int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                    if (var14 > var8) {
                                        var3.field1475 = -99999;
                                        break label161;
                                    }
                                    if (var14 < 0) {
                                        var14 = 0;
                                    }
                                    var7 = (var8 - var14) * class243.field3580.field8000.method3577(false) * var3.field1482 / var8 >> 2;
                                    if (var3.field1487 != null && var3.field1487 instanceof class638) {
                                        class638 var15 = (class638) var3.field1487;
                                        short var16 = var15.field9035;
                                        short var17 = var15.field9038;
                                    }
                                    if (var11 != 0 || var13 != 0) {
                                        int var18 = -class179.field2487 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                        if (var18 > 8192) {
                                            var18 = 16384 - var18;
                                        }
                                        int var19;
                                        if (var14 <= 0) {
                                            var19 = 8192;
                                        } else if (var14 >= 4096) {
                                            var19 = 16384;
                                        } else {
                                            var19 = (8192 - var14) / 4096 + 8192;
                                        }
                                        var5 = var18 * var19 / 8192 + (16384 - var19 >> 1);
                                    }
                                } else {
                                    var7 = 0;
                                }
                            }
                            if (var7 > 0) {
                                class673 var20 = null;
                                if (var3.field1477 == 1) {
                                    var20 = var3.field1483.method146().method3829(class695.field9833);
                                } else if (var3.method774(21)) {
                                    var20 = var3.field1472;
                                }
                                class149 var21 = var3.field1485 = class149.method1064(var20, var3.field1479, var7, var5);
                                var21.method1075(var3.field1488 - 1);
                                class593.field8429.method3657(var21);
                            }
                        }
                    }
                } else if (!var3.field1485.method2657(false)) {
                    var4 = true;
                }
                if (var4) {
                    class279.field3914--;
                    for (int var22 = var1; var22 < class279.field3914; var22++) {
                        class585.field8346[var22] = class585.field8346[var22 + 1];
                    }
                    var1--;
                }
            }
            var1++;
        }
        field9544++;
        if (class509.field7381 && !class236.method1649(3029)) {
            if (class243.field3580.field7980.method3577(false) != 0 && class428.field6173 != -1) {
                if (class4.field32 == null) {
                    class219.method1545(false, 0, class428.field6173, class505.field7338, class243.field3580.field7980.method3577(false), 0);
                } else {
                    class171.method1215(false, 0, class428.field6173, class505.field7338, (byte) -67, class4.field32, class243.field3580.field7980.method3577(false));
                }
            }
            class4.field32 = null;
            class509.field7381 = false;
        } else if (class243.field3580.field7980.method3577(false) != 0 && class428.field6173 != -1 && !class236.method1649(3029)) {
            class431.field6191++;
            class88 var2 = class448.method2741((byte) 123, class609.field8689, class583.field8319);
            var2.field1260.method2926((byte) -119, class428.field6173);
            class523.method3183(var2, (byte) 31);
            class428.field6173 = -1;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 300)
    public static void method3819(byte arg0) {
        field9542 = null;
        field9537 = null;
        int var1 = 106 / ((arg0 + 31) / 53);
        field9541 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 323)
    public class669(class315 arg0, int arg1, class423 arg2) {
        this.field9543 = arg2;
        this.field9538 = this.field9543.method2616(19, 0);
    }
}
