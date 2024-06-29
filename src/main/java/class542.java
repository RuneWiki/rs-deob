import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class542 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Llja;")
    public static class744 field7607 = new class744(8, 7);

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[Lwaa;")
    public static class732[] field7608 = new class732[128];

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lhj;")
    public static class596 field7610 = new class596(36, 2);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static final void method3207(byte arg0) {
        if (arg0 > -113) {
            field7610 = null;
        }
        field7606++;
        class597.field8098++;
        class336 var1 = class512.method3076(class309.field3844, class591.field8030, (byte) 111);
        var1.field4150.method2369(-18090, class756.field10477);
        class578.method3334(4, var1);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILiaa;Z)V")
    public static final void method3208(int arg0, class521 arg1, boolean arg2) {
        field7609++;
        if (class245.field2894 >= 400) {
            return;
        }
        if (class300.field3596 != arg1) {
            if (arg0 != 0) {
                field7607 = null;
            }
            String var7;
            if (arg1.field7377 == 0) {
                boolean var3 = true;
                if (class300.field3596.field7380 != -1 && arg1.field7380 != -1) {
                    int var4 = class300.field3596.field7380 < arg1.field7380 ? class300.field3596.field7380 : arg1.field7380;
                    int var5 = class300.field3596.field7347 - arg1.field7347;
                    if (var5 < 0) {
                        var5 = -var5;
                    }
                    if (var5 > var4) {
                        var3 = false;
                    }
                }
                String var6 = class672.field9229 == class421.field5604 ? class637.field8705.method3584(class770.field10592, true) : class637.field8703.method3584(class770.field10592, true);
                if (arg1.field7381 <= arg1.field7347) {
                    var7 = arg1.method3123(true, true) + (var3 ? class665.method3734(arg1.field7347, (byte) 45, class300.field3596.field7347) : "<col=ffffff>") + " (" + var6 + arg1.field7347 + ")";
                } else {
                    var7 = arg1.method3123(true, true) + (var3 ? class665.method3734(arg1.field7347, (byte) 45, class300.field3596.field7347) : "<col=ffffff>") + " (" + var6 + arg1.field7347 + "+" + (arg1.field7381 - arg1.field7347) + ")";
                }
            } else if (arg1.field7377 == -1) {
                var7 = arg1.method3123(true, true);
            } else {
                var7 = arg1.method3123(true, true) + " (" + class637.field8704.method3584(class770.field10592, true) + arg1.field7377 + ")";
            }
            if (class104.field1336 && !arg2 && (class667.field9161 & 0x8) != 0) {
                class620.method3534((long) arg1.field3393, -1, false, class481.field6718 + " -> <col=ffffff>" + var7, class748.field10390, (long) arg1.field3393, false, 121, 0, 44, 0, class535.field7539, true);
                class366.field4544++;
            }
            if (arg2) {
                class620.method3534((long) arg1.field3393, 0, false, "", -1, 0L, true, 119, 0, -1, 0, "<col=cccccc>" + var7, false);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class473.field6598[var8] != null) {
                        short var9 = 0;
                        if (class672.field9229 == class359.field4463 && class473.field6598[var8].equalsIgnoreCase(class637.field8698.method3584(class770.field10592, true))) {
                            if (class267.field3158 && class300.field3596.field7347 < arg1.field7347) {
                                var9 = 2000;
                            }
                            if (class300.field3596.field7393 == 0 || arg1.field7393 == 0) {
                                if (arg1.field7353) {
                                    var9 = 2000;
                                }
                            } else if (class300.field3596.field7393 == arg1.field7393) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        } else if (class678.field9296[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class36.field546[var8] + var9);
                        int var11 = class676.field9277[var8] == -1 ? class170.field2043 : class676.field9277[var8];
                        class400.field5222++;
                        class620.method3534((long) arg1.field3393, -1, false, "<col=ffffff>" + var7, var11, (long) arg1.field3393, false, 118, 0, var10, 0, class473.field6598[var8], true);
                    }
                }
            }
            if (!arg2) {
                for (class75 var12 = (class75) class5.field52.method2725(37); var12 != null; var12 = (class75) class5.field52.method2726(-123)) {
                    if (var12.field1029 == 60) {
                        var12.field1035 = "<col=ffffff>" + var7;
                        return;
                    }
                }
            }
        } else if (class104.field1336 && (class667.field9161 & 0x10) != 0) {
            class507.field7213++;
            class620.method3534((long) arg1.field3393, -1, false, class481.field6718 + " -> <col=ffffff>" + class637.field8712.method3584(class770.field10592, true), class748.field10390, 0L, false, 116, 0, 58, 0, class535.field7539, true);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
    public static void method3209(boolean arg0) {
        if (arg0) {
            field7608 = null;
        }
        field7608 = null;
        field7607 = null;
        field7610 = null;
    }
}
