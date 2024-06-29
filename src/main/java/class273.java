import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class273 {

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "Lpp;")
    public static class464 field3992 = new class464(77, 7);

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "Lra;")
    public static class259 field3996;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "[[S")
    public static short[][] field3991;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method1766(byte arg0) {
        if (arg0 <= 46) {
            field3992 = null;
        }
        field3994++;
        return class313.field4564 == this | class214.field3244 == this;
    }

    @OriginalMember(owner = "client!faa", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field3993++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 30)
    public static void method1767(int arg0) {
        field3996 = null;
        field3992 = null;
        if (arg0 >= -14) {
            field3992 = null;
        }
        field3991 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZILjk;)V", line = 43)
    public static final void method1768(boolean arg0, int arg1, class170 arg2) {
        field3995++;
        if (class480.field6825 >= 400) {
            return;
        }
        class432 var3 = arg2.field2492;
        if (var3.field6304 != null) {
            var3 = var3.method2582(0, class401.field6001);
            if (var3 == null) {
                return;
            }
        }
        if (arg1 != 20902 || !var3.field6357) {
            return;
        }
        String var4 = var3.field6362;
        if (var3.field6312 != 0) {
            String var5 = class78.field1412 == class640.field9282 ? class635.field9230.method3220(false, class538.field7500) : class130.field2118.method3220(false, class538.field7500);
            var4 = var4 + class602.method3420(class644.field9367.field5981, var3.field6312, (byte) 71) + " (" + var5 + var3.field6312 + ")";
        }
        if (!class90.field1620) {
            if (!arg0) {
                String[] var6 = var3.field6340;
                if (class577.field8238) {
                    var6 = class79.method745(var6, (byte) -90);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (var3.field6369 == 0 || !var6[var7].equalsIgnoreCase(class617.field8729.method3220(false, class538.field7500)))) {
                            byte var8 = 0;
                            if (var7 == 0) {
                                var8 = 47;
                            }
                            int var9 = class340.field4894;
                            if (var7 == 1) {
                                var8 = 49;
                            }
                            if (var7 == 2) {
                                var8 = 4;
                            }
                            if (var7 == 3) {
                                var8 = 17;
                            }
                            if (var7 == 4) {
                                var8 = 60;
                            }
                            if (var3.field6347 == var7) {
                                var9 = var3.field6341;
                            }
                            if (var3.field6345 == var7) {
                                var9 = var3.field6315;
                            }
                            class301.field4352++;
                            class366.method2209(var6[var7].equalsIgnoreCase(class617.field8729.method3220(false, class538.field7500)) ? var3.field6299 : var9, 0, var8, -1, true, (long) arg2.field1555, -1, 0, var6[var7], false, "<col=ffff00>" + var4);
                        }
                    }
                }
                if (var3.field6369 == 1 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class617.field8729.method3220(false, class538.field7500))) {
                            short var11 = 0;
                            if (var3.field6312 > class644.field9367.field5981) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 47;
                            }
                            if (var10 == 1) {
                                var12 = 49;
                            }
                            if (var10 == 2) {
                                var12 = 4;
                            }
                            if (var10 == 3) {
                                var12 = 17;
                            }
                            if (var10 == 4) {
                                var12 = 60;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class366.method2209(var3.field6299, 0, var12, -1, true, (long) arg2.field1555, -1, 0, var6[var10], false, "<col=ffff00>" + var4);
                            class64.field890++;
                        }
                    }
                }
            }
            class366.method2209(class187.field2701, 0, 1012, -1, true, (long) arg2.field1555, -1, 0, class137.field2178.method3220(false, class538.field7500), arg0, "<col=ffff00>" + var4);
            class190.field2723++;
        } else if (!arg0) {
            class188 var13 = class510.field7076 == -1 ? null : class190.field2724.method1831(-107, class510.field7076);
            if ((class549.field7789 & 0x2) != 0) {
                if (var13 == null || var3.method2578(class510.field7076, var13.field2710, -125) != var13.field2710) {
                    class366.method2209(class335.field4799, 0, 8, -1, true, (long) arg2.field1555, -1, 0, class511.field7082, false, class413.field6111 + " -> <col=ffff00>" + var4);
                    class627.field8840++;
                }
                return;
            }
        }
    }
}
