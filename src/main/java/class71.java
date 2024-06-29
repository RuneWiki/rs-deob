import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class71 extends class254 {

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "J")
    public long field1103;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Z")
    public static final boolean method483(int arg0) {
        field1106++;
        class210 var1 = class107.field1553;
        synchronized (class107.field1553) {
            if (arg0 != 1) {
                return false;
            } else if (class288.field4566 == class206.field2980) {
                return false;
            } else {
                class7.field152 = class66.field1035[class206.field2980];
                class247.field3692 = class37.field547[class206.field2980];
                class206.field2980 = class206.field2980 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class71() {
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lng;IIIIIIZ)V")
    public static final void method484(class139 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2011.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2011[var9] - class96.field1456;
            int var23 = arg0.field2010[var9] - class224.field3357;
            int var24 = arg0.field2021[var9] - class162.field2363;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2009 != null) {
                class139.field2025[var9] = var25;
                class139.field2014[var9] = var28;
                class139.field2005[var9] = var29;
            }
            class139.field2026[var9] = (var25 << 9) / var29 + class18.field249;
            class139.field2012[var9] = (var28 << 9) / var29 + class18.field248;
        }
        class18.field254 = 0;
        int var10 = arg0.field2022.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2022[var11];
            int var13 = arg0.field2024[var11];
            int var14 = arg0.field2006[var11];
            int var15 = class139.field2026[var12];
            int var16 = class139.field2026[var13];
            int var17 = class139.field2026[var14];
            int var18 = class139.field2012[var12];
            int var19 = class139.field2012[var13];
            int var20 = class139.field2012[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class237.field3573 && class23.method173(class57.field885 + class18.field249, class18.field248 + class124.field1806, var18, var19, var20, var15, var16, var17)) {
                    class17.field245 = arg5;
                    class183.field2618 = arg6;
                }
                if (!arg7) {
                    class18.field247 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class18.field258 || var16 > class18.field258 || var17 > class18.field258) {
                        class18.field247 = true;
                    }
                    if (arg0.field2009 == null || arg0.field2009[var11] == -1) {
                        if (arg0.field2016[var11] != 12345678) {
                            class18.method134(var18, var19, var20, var15, var16, var17, arg0.field2016[var11], arg0.field2007[var11], arg0.field2019[var11]);
                        }
                    } else if (!class234.field3516) {
                        int var21 = class18.field252.method700(arg0.field2009[var11], (byte) 87);
                        class18.method134(var18, var19, var20, var15, var16, var17, class135.method914(var21, arg0.field2016[var11]), class135.method914(var21, arg0.field2007[var11]), class135.method914(var21, arg0.field2019[var11]));
                    } else if (arg0.field2008) {
                        class18.method151(var18, var19, var20, var15, var16, var17, arg0.field2016[var11], arg0.field2007[var11], arg0.field2019[var11], class139.field2025[0], class139.field2025[1], class139.field2025[3], class139.field2014[0], class139.field2014[1], class139.field2014[3], class139.field2005[0], class139.field2005[1], class139.field2005[3], arg0.field2009[var11]);
                    } else {
                        class18.method151(var18, var19, var20, var15, var16, var17, arg0.field2016[var11], arg0.field2007[var11], arg0.field2019[var11], class139.field2025[var12], class139.field2025[var13], class139.field2025[var14], class139.field2014[var12], class139.field2014[var13], class139.field2014[var14], class139.field2005[var12], class139.field2005[var13], class139.field2005[var14], arg0.field2009[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
    public static final void method485(int arg0, boolean arg1) {
        field1101++;
        if (class58.field894 == arg1) {
            return;
        }
        class58.field894 = arg1;
        if (arg0 != -14492) {
            method484((class139) null, -91, -64, 102, -74, 96, -108, false);
        }
        class37.method261(-1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)V")
    public static final void method486(int arg0, byte arg1) {
        field1102++;
        if (arg0 == -1 || !class47.field671[arg0]) {
            return;
        }
        class87.field1342.method1539((byte) 3, arg0);
        if (class19.field268[arg0] == null) {
            return;
        }
        boolean var2 = true;
        int var3 = 46 % ((arg1 - 10) / 45);
        for (int var4 = 0; var4 < class19.field268[arg0].length; var4++) {
            if (class19.field268[arg0][var4] != null) {
                if (class19.field268[arg0][var4].field4149 == 2) {
                    var2 = false;
                } else {
                    class19.field268[arg0][var4] = null;
                }
            }
        }
        if (var2) {
            class19.field268[arg0] = null;
        }
        class47.field671[arg0] = false;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(J)V")
    public class71(long arg0) {
        this.field1103 = arg0;
    }
}
