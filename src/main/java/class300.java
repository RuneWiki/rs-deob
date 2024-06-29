import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class300 extends class270 {

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "[I")
    private int[] field5153 = new int[3];

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
    private int field5154 = 4096;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    private int field5151 = 4096;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    private int field5149 = 409;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    private int field5150 = 4096;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "Lmh;")
    public static class62 field5147 = class201.method1405(true, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "Lmh;")
    public static class62 field5142 = class201.method1405(true, "0");

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "Lhi;")
    public static class26 field5148;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "Lhi;")
    public static class26 field5155;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V", line = 5)
    public static void method2043(int arg0) {
        int var1 = 79 % ((arg0 + 12) / 50);
        field5155 = null;
        field5142 = null;
        field5147 = null;
        field5148 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmh;ZI)V", line = 29)
    public static final void method2044(class62 arg0, boolean arg1, int arg2) {
        field5145++;
        if (arg1) {
            if (class2.field26) {
                try {
                    class128.method953(115, class193.field3246.field4878, "openjs", new Object[] { arg0.method454(-1, class119.field1999.getCodeBase()).toString() });
                    return;
                } catch (Throwable var8) {
                }
            }
            try {
                class119.field1999.getAppletContext().showDocument(arg0.method454(-1, class119.field1999.getCodeBase()), "_blank");
            } catch (Exception var6) {
            }
        } else {
            try {
                class119.field1999.getAppletContext().showDocument(arg0.method454(-1, class119.field1999.getCodeBase()), "_top");
            } catch (Exception var7) {
            }
        }
        if (arg2 <= 6) {
            method2043(123);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)[[I", line = 70)
    public final int[][] method11(boolean arg0, int arg1) {
        field5146++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (arg0) {
            this.field5150 = -118;
        }
        if (this.field4589.field1320) {
            int[][] var4 = this.method1855(false, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class109.field1770; var11++) {
                int var12 = var6[var11];
                int var13 = var12 - this.field5153[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field5149) {
                    var7[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var8[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field5153[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field5149) {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field5153[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field5149 < var17) {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field5154 * var12 >> 12;
                            var9[var11] = this.field5150 * var14 >> 12;
                            var10[var11] = this.field5151 * var16 >> 12;
                        }
                    } else {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var8[var11];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V", line = 168)
    public static final void method2045(int arg0) {
        class70.field1070.method315(arg0 + 30484);
        class127.field2102.method1735(-3739);
        field5141++;
        class163.field2639.method1735(-3739);
        if (arg0 != -30484) {
            field5148 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 180)
    public class300() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmi;II)V", line = 184)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field5144++;
        int var4 = -70 % ((arg2 + 8) / 53);
        if (arg1 == 0) {
            this.field5149 = arg0.method721(100);
        } else if (arg1 == 1) {
            this.field5151 = arg0.method721(118);
        } else if (arg1 == 2) {
            this.field5150 = arg0.method721(65);
        } else if (arg1 == 3) {
            this.field5154 = arg0.method721(45);
        } else if (arg1 == 4) {
            int var6 = arg0.method737(-1);
            this.field5153[1] = class234.method1648(4080, var6 >> 4);
            this.field5153[2] = class234.method1648(0, var6 >> 12);
            this.field5153[0] = class234.method1648(267386880, var6 << 4);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI[Lsg;)V", line = 280)
    public static final void method2046(byte arg0, int arg1, class191[] arg2) {
        if (arg0 < 61) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class191 var4 = arg2[var3];
            if (var4 != null && var4.field3074 == arg1 && (!var4.field3209 || !client.method2051(var4))) {
                if (var4.field3068 == 0) {
                    if (!var4.field3209 && client.method2051(var4) && class166.field2716 != var4) {
                        continue;
                    }
                    method2046((byte) 72, var4.field3142, arg2);
                    if (var4.field3180 != null) {
                        method2046((byte) 104, var4.field3142, var4.field3180);
                    }
                    class146 var5 = (class146) class214.field3632.method311((byte) 114, (long) var4.field3142);
                    if (var5 != null) {
                        class37.method249(76, var5.field2312);
                    }
                }
                if (var4.field3068 == 6) {
                    if (var4.field3177 != -1 || var4.field3193 != -1) {
                        boolean var6 = class122.method936(19515, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3193;
                        } else {
                            var7 = var4.field3177;
                        }
                        if (var7 != -1) {
                            class96 var8 = class151.method1085(var7, (byte) 110);
                            if (var8 != null) {
                                var4.field3086 += class277.field4757;
                                while (var4.field3086 > var8.field1555[var4.field3160]) {
                                    var4.field3086 -= var8.field1555[var4.field3160];
                                    var4.field3160++;
                                    if (var4.field3160 >= var8.field1586.length) {
                                        var4.field3160 -= var8.field1568;
                                        if (var4.field3160 < 0 || var8.field1586.length <= var4.field3160) {
                                            var4.field3160 = 0;
                                        }
                                    }
                                    class250.method1744(var4, (byte) -93);
                                }
                            }
                        }
                    }
                    if (var4.field3150 != 0 && !var4.field3209) {
                        int var9 = var4.field3150 >> 16;
                        int var10 = class277.field4757 * var9;
                        var4.field3182 = var4.field3182 + var10 & 0x7FF;
                        int var11 = var4.field3150 << 16 >> 16;
                        int var12 = class277.field4757 * var11;
                        var4.field3192 = var4.field3192 + var12 & 0x7FF;
                        class250.method1744(var4, (byte) -82);
                    }
                }
            }
        }
        field5143++;
    }
}
