import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class336 extends class64 {

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4379;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lqa;Z)V", line = 4)
    public static final void method1892(class206 arg0, boolean arg1) {
        field4381++;
        if (class260.field3355 == class103.field1265.field8660 || class383.field5070 == null) {
            return;
        }
        if (class330.method1856(class103.field1265.field8660, arg0, (byte) 75)) {
            class260.field3355 = class103.field1265.field8660;
        }
        if (!arg1) {
            method1894();
        }
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(I)V", line = 28)
    public class336(int arg0) {
        this.field4379 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 36)
    public final void method1893(int arg0) {
        this.field4379.method3334();
        field4378++;
        if (arg0 > -50) {
            this.method1893(-90);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "()V", line = 47)
    public static final void method1894() {
        class237.field2962 = 0;
        label212: for (int var0 = 0; var0 < class107.field1339; var0++) {
            class249 var1 = class194.field2349[var0];
            if (class595.field8634 != null) {
                for (int var2 = 0; var2 < class595.field8634.length; var2++) {
                    if (class595.field8634[var2] != -1000000 && (var1.field3173 <= class595.field8634[var2] || var1.field3186 <= class595.field8634[var2]) && (var1.field3180 <= class556.field8166[var2] || var1.field3193 <= class556.field8166[var2]) && (var1.field3180 >= class473.field6635[var2] || var1.field3193 >= class473.field6635[var2]) && (var1.field3188 <= class459.field6332[var2] || var1.field3191 <= class459.field6332[var2]) && (var1.field3188 >= class32.field251[var2] || var1.field3191 >= class32.field251[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field3178 == 1) {
                int var3 = var1.field3190 + class244.field3140 - class144.field1735;
                if (var3 >= 0 && var3 <= class244.field3140 + class244.field3140) {
                    int var4 = var1.field3185 + class244.field3140 - class222.field2728;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class244.field3140 + class244.field3140) {
                        continue;
                    }
                    int var5 = var1.field3179 + class244.field3140 - class222.field2728;
                    if (var5 > class244.field3140 + class244.field3140) {
                        var5 = class244.field3140 + class244.field3140;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class201.field2419[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class103.field1263 - var1.field3180;
                        if (var7 > class596.field8635) {
                            var1.field3187 = 1;
                        } else {
                            if (var7 >= -class596.field8635) {
                                continue;
                            }
                            var1.field3187 = 2;
                            var7 = -var7;
                        }
                        var1.field3192 = (var1.field3188 - class76.field894 << 8) / var7;
                        var1.field3189 = (var1.field3191 - class76.field894 << 8) / var7;
                        var1.field3181 = (var1.field3173 - class170.field2071 << 8) / var7;
                        var1.field3176 = (var1.field3186 - class170.field2071 << 8) / var7;
                        class601.field8672[class237.field2962++] = var1;
                    }
                }
            } else if (var1.field3178 == 2) {
                int var8 = var1.field3185 + class244.field3140 - class222.field2728;
                if (var8 >= 0 && var8 <= class244.field3140 + class244.field3140) {
                    int var9 = var1.field3190 + class244.field3140 - class144.field1735;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class244.field3140 + class244.field3140) {
                        continue;
                    }
                    int var10 = var1.field3182 + class244.field3140 - class144.field1735;
                    if (var10 > class244.field3140 + class244.field3140) {
                        var10 = class244.field3140 + class244.field3140;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class201.field2419[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class76.field894 - var1.field3188;
                        if (var12 > class596.field8635) {
                            var1.field3187 = 3;
                        } else {
                            if (var12 >= -class596.field8635) {
                                continue;
                            }
                            var1.field3187 = 4;
                            var12 = -var12;
                        }
                        var1.field3174 = (var1.field3180 - class103.field1263 << 8) / var12;
                        var1.field3175 = (var1.field3193 - class103.field1263 << 8) / var12;
                        var1.field3181 = (var1.field3173 - class170.field2071 << 8) / var12;
                        var1.field3176 = (var1.field3186 - class170.field2071 << 8) / var12;
                        class601.field8672[class237.field2962++] = var1;
                    }
                }
            } else if (var1.field3178 == 4) {
                int var13 = var1.field3173 - class170.field2071;
                if (var13 > class219.field2706) {
                    int var14 = var1.field3185 + class244.field3140 - class222.field2728;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class244.field3140 + class244.field3140) {
                        continue;
                    }
                    int var15 = var1.field3179 + class244.field3140 - class222.field2728;
                    if (var15 > class244.field3140 + class244.field3140) {
                        var15 = class244.field3140 + class244.field3140;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field3190 + class244.field3140 - class144.field1735;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class244.field3140 + class244.field3140) {
                        continue;
                    }
                    int var17 = var1.field3182 + class244.field3140 - class144.field1735;
                    if (var17 > class244.field3140 + class244.field3140) {
                        var17 = class244.field3140 + class244.field3140;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class201.field2419[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field3187 = 5;
                        var1.field3174 = (var1.field3180 - class103.field1263 << 8) / var13;
                        var1.field3175 = (var1.field3193 - class103.field1263 << 8) / var13;
                        var1.field3192 = (var1.field3188 - class76.field894 << 8) / var13;
                        var1.field3189 = (var1.field3191 - class76.field894 << 8) / var13;
                        class601.field8672[class237.field2962++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lhe;II)V", line = 300)
    public static final void method1895(class310 arg0, int arg1, int arg2) {
        int var3 = -20 % ((-arg1 - 13) / 55);
        if (class474.field6653) {
            class474.field6653 = false;
            arg2 = 0;
        }
        field4380++;
        if (class538.field7884 != null && class538.field7884.method1720(arg0, (byte) -120)) {
            return;
        }
        class538.field7884 = arg0;
        class489.field6827 = class190.method1030(false);
        class16.field124 = arg2;
        class588.field8537 = arg2;
        if (class588.field8537 != 0) {
            class117.field1474 = class196.field2377;
            class280.field3680 = class229.field2840;
            class261.field3369 = class34.field272;
            class62.field622 = class202.field2428;
            class268.field3499 = class639.field9197;
            class427.field5497 = class98.field1199;
            class314.field4012 = class357.field4693;
            class307.field3912 = class78.field914;
            class437.field6021 = class433.field5866;
            class386.field5084 = class314.field4010;
            return;
        }
        class253.method1437(114);
    }
}
