import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class177 {

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1264(int arg0, int arg1) {
        class21 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class92 var4 = class126.field1734[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class407.field5751; var5++) {
                    for (int var6 = 0; var6 < class394.field5548; var6++) {
                        var2 = var4.method351(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class92 var10 = class126.field1734[var9];
                                if (var10 != null) {
                                    int var11 = var4.method359(var6, var5) - var10.method359(var6, var5);
                                    int var12 = var4.method359(var6 + 1, var5) - var10.method359(var6 + 1, var5);
                                    int var13 = var4.method359(var6 + 1, var5 + 1) - var10.method359(var6 + 1, var5 + 1);
                                    int var14 = var4.method359(var6, var5 + 1) - var10.method359(var6, var5 + 1);
                                    var10.method357(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 69)
    public static final void method1265(int arg0) {
        class425.field6069.method102((byte) -81);
        if (arg0 <= 59) {
            method1264(123, 64);
        }
        field2498++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLhl;)I", line = 87)
    public static final int method1266(byte arg0, class311 arg1) {
        field2497++;
        if (arg1.field4568 == 0) {
            return 0;
        } else if (arg0 == 14) {
            if (arg1.field4569 != -1 && arg1.field4569 < 32768) {
                class446 var2 = class442.field6317[arg1.field4569];
                if (var2 != null) {
                    int var3 = arg1.field4463 - var2.field4463;
                    int var4 = arg1.field4466 - var2.field4466;
                    if (var3 != 0 || var4 != 0) {
                        arg1.method2079((byte) -112, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            }
            if (arg1.field4569 >= 32768) {
                int var5 = arg1.field4569 - 32768;
                if (class302.field4417 == var5) {
                    var5 = 2047;
                }
                class128 var6 = class243.field3596[var5];
                if (var6 != null) {
                    int var7 = arg1.field4463 - var6.field4463;
                    int var8 = arg1.field4466 - var6.field4466;
                    if (var7 != 0 || var8 != 0) {
                        arg1.method2079((byte) -53, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            }
            if ((arg1.field4544 != 0 || arg1.field4512 != 0) && (arg1.field4599 == 0 || arg1.field4604 > 0)) {
                int var9 = arg1.field4463 - ((arg1.field4544 - class306.field4459 - class306.field4459) * 64);
                int var10 = arg1.field4466 - ((arg1.field4512 - class342.field4959 - class342.field4959) * 64);
                if (var9 != 0 || var10 != 0) {
                    arg1.method2079((byte) -118, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF);
                }
                arg1.field4512 = 0;
                arg1.field4544 = 0;
            }
            return arg1.method2083(18724);
        } else {
            return 71;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 162)
    public static final void method1267(byte arg0) {
        if (class170.field2407 < 0) {
            class170.field2407 = 0;
            class209.field2986 = -1;
            class139.field2125 = -1;
        }
        field2496++;
        if (class176.field2494 < class170.field2407) {
            class139.field2125 = -1;
            class209.field2986 = -1;
            class170.field2407 = class176.field2494;
        }
        if (class175.field2459 < 0) {
            class139.field2125 = -1;
            class209.field2986 = -1;
            class175.field2459 = 0;
        }
        if (class176.field2492 < class175.field2459) {
            class175.field2459 = class176.field2492;
            class209.field2986 = -1;
            class139.field2125 = -1;
        }
        if (arg0 <= 52) {
            method1265(9);
        }
    }
}
