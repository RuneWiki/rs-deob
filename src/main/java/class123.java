import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class123 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field2162 = 0;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Len;")
    public static class49 field2165 = new class49();

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[[[I")
    public static int[][][] field2166;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method884(boolean arg0) {
        if (arg0) {
            method887(true);
        }
        field2163++;
        if (!class241.field4016 || class142.field2398) {
            return;
        }
        class312[][][] var1 = class353.field5644;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class312[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class312 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5092 != null && var6.field5092.field1653 instanceof class294) {
                            class294 var7 = (class294) var6.field5092.field1653;
                            if ((var6.field5092.field1652 & Long.MIN_VALUE) == 0L) {
                                var7.method2098(false, true, true, true, false, true, true);
                            } else {
                                var7.method2098(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field5082 != null) {
                            if (var6.field5082.field5307 instanceof class294) {
                                class294 var8 = (class294) var6.field5082.field5307;
                                if ((Long.MIN_VALUE & var6.field5082.field5299) == 0L) {
                                    var8.method2098(false, true, true, true, false, true, true);
                                } else {
                                    var8.method2098(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field5082.field5305 instanceof class294) {
                                class294 var9 = (class294) var6.field5082.field5305;
                                if ((var6.field5082.field5299 & Long.MIN_VALUE) == 0L) {
                                    var9.method2098(false, true, true, true, false, true, true);
                                } else {
                                    var9.method2098(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field5102 != null) {
                            if (var6.field5102.field473 instanceof class294) {
                                class294 var10 = (class294) var6.field5102.field473;
                                if ((var6.field5102.field469 & Long.MIN_VALUE) == 0L) {
                                    var10.method2098(false, true, true, true, false, true, true);
                                } else {
                                    var10.method2098(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field5102.field465 instanceof class294) {
                                class294 var11 = (class294) var6.field5102.field465;
                                if ((Long.MIN_VALUE & var6.field5102.field469) == 0L) {
                                    var11.method2098(false, true, true, true, false, true, true);
                                } else {
                                    var11.method2098(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field5078; var12++) {
                            if (var6.field5089[var12].field4529 instanceof class294) {
                                class294 var13 = (class294) var6.field5089[var12].field4529;
                                if ((Long.MIN_VALUE & var6.field5089[var12].field4527) == 0L) {
                                    var13.method2098(false, true, true, true, false, true, true);
                                } else {
                                    var13.method2098(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class142.field2398 = true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Loe;I)V", line = 155)
    public final void method885(class146 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                if (arg1 != 709) {
                    field2165 = (class49) null;
                }
                field2168++;
                return;
            }
            this.method886(arg0, var3, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Loe;IB)V", line = 175)
    private final void method886(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 5) {
            this.field2162 = arg0.method989(72);
        }
        int var4 = 13 % ((arg2 + 28) / 48);
        field2164++;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V", line = 192)
    public static void method887(boolean arg0) {
        field2166 = (int[][][]) null;
        if (arg0) {
            field2166 = (int[][][]) ((int[][][]) null);
        }
        field2165 = null;
    }
}
