import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class193 extends class256 {

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "[Lrf;")
    public class269[] field3455;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Ljd;")
    public static class86 field3449 = class122.method868("Titelbild ge-Offnet)3", true);

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "Ljd;")
    public static class86 field3448 = class122.method868("Lade)3)3)3", true);

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field3457 = 0;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field3459 = 0;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3458 = Calendar.getInstance();

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "Ljd;")
    public static class86 field3460 = class122.method868(" steht bereits auf Ihrer Ignorieren)2Liste(Q", true);

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public static final void method1343(int arg0) {
        if (arg0 > -68) {
            field3458 = null;
        }
        field3453++;
        int var1 = class168.field3102.method1352(8, -105);
        if (class209.field3786 > var1) {
            for (int var2 = var1; var2 < class209.field3786; var2++) {
                class1.field11[class102.field1971++] = class142.field2689[var2];
            }
        }
        if (class209.field3786 < var1) {
            throw new RuntimeException("gppov1");
        }
        class209.field3786 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class142.field2689[var3];
            class224 var5 = class186.field3294[var4];
            int var6 = class168.field3102.method1352(1, 69);
            if (var6 == 0) {
                class142.field2689[class209.field3786++] = var4;
                var5.field702 = class236.field4265;
            } else {
                int var7 = class168.field3102.method1352(2, -51);
                if (var7 == 0) {
                    class142.field2689[class209.field3786++] = var4;
                    var5.field702 = class236.field4265;
                    class271.field4762[class164.field3083++] = var4;
                } else if (var7 == 1) {
                    class142.field2689[class209.field3786++] = var4;
                    var5.field702 = class236.field4265;
                    int var8 = class168.field3102.method1352(3, 61);
                    var5.method235(var8, false, 125);
                    int var9 = class168.field3102.method1352(1, 48);
                    if (var9 == 1) {
                        class271.field4762[class164.field3083++] = var4;
                    }
                } else if (var7 == 2) {
                    class142.field2689[class209.field3786++] = var4;
                    var5.field702 = class236.field4265;
                    int var10 = class168.field3102.method1352(3, -73);
                    var5.method235(var10, true, 125);
                    int var11 = class168.field3102.method1352(3, 118);
                    var5.method235(var11, true, 127);
                    int var12 = class168.field3102.method1352(1, 90);
                    if (var12 == 1) {
                        class271.field4762[class164.field3083++] = var4;
                    }
                } else if (var7 == 3) {
                    class1.field11[class102.field1971++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Z")
    public final boolean method1344(int arg0, int arg1) {
        field3452++;
        int var3 = -110 / ((arg0 + 41) / 53);
        return this.field3455[arg1].field4742;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method1345(boolean arg0) {
        if (arg0) {
            field3449 = null;
        }
        field3458 = null;
        field3448 = null;
        field3460 = null;
        field3449 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)Lhc;")
    public static final class219 method1346(int arg0, byte arg1) {
        if (arg1 < 29) {
            field3457 = -68;
        }
        class219 var2 = (class219) class195.field3497.method395((long) arg0, (byte) 99);
        field3456++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class161.field3013.method1084((byte) -119, class198.method1368(arg0, -58453112), class206.method1467(arg0, 127));
        class219 var4 = new class219();
        if (var3 != null) {
            var4.method1543(-82, new class200(var3));
        }
        class195.field3497.method398((long) arg0, (byte) 116, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public static final void method1347(int arg0) {
        field3450++;
        for (int var1 = 0; var1 < class124.field2407; var1++) {
            class209 var2 = class92.method684(var1, 8609);
            if (var2 != null && var2.field3784 == 0) {
                class72.field1460[var1] = 0;
                class273.field4805[var1] = 0;
            }
        }
        if (arg0 <= 30) {
            method1345(false);
        }
        class136.field2600 = new class252(16);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lbj;Lbj;IZ)V")
    public class193(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        class257 var5 = new class257();
        int var6 = arg0.method1075(arg2, -105);
        this.field3455 = new class269[var6];
        int[] var7 = arg0.method1093(arg2, (byte) -117);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1084((byte) -128, arg2, var7[var8]);
            class121 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class121 var12 = (class121) var5.method1737((byte) 74); var12 != null; var12 = (class121) var5.method1740(-8843)) {
                if (var12.field2345 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1090(39, var11, 0);
                } else {
                    var13 = arg1.method1090(125, 0, var11);
                }
                var10 = new class121(var11, var13);
                var5.method1731(85, var10);
            }
            this.field3455[var7[var8]] = new class269(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)Lfj;")
    public static final class239 method1348(boolean arg0) {
        field3454++;
        if (arg0) {
            method1348(true);
        }
        return class260.field4650 < class209.field3783.length ? class209.field3783[class260.field4650++] : null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lbl;I)V")
    public static final void method1349(class33 arg0, int arg1) {
        field3451++;
        arg0.field701 = arg0.field739;
        if (arg0.field704 == 0) {
            arg0.field721 = 0;
            return;
        }
        if (arg0.field683 != -1 && arg0.field724 == 0) {
            class122 var2 = class133.method952(arg0.field683, 127);
            if (arg0.field742 > 0 && var2.field2354 == 0) {
                arg0.field721++;
                return;
            }
            if (arg0.field742 <= 0 && var2.field2371 == 0) {
                arg0.field721++;
                return;
            }
        }
        int var3 = arg0.field676;
        if (arg1 <= 72) {
            method1349((class33) null, -20);
        }
        int var4 = arg0.field685;
        int var5 = arg0.field707[arg0.field704 - 1] * 128 + (arg0.method240((byte) -122) * 64);
        int var6 = arg0.field705[arg0.field704 - 1] * 128 + (arg0.method240((byte) 60) * 64);
        if (var5 - var3 > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg0.field676 = var5;
            arg0.field685 = var6;
            return;
        }
        if (var5 <= var3) {
            if (var3 > var5) {
                if (var4 < var6) {
                    arg0.field716 = 768;
                } else if (var4 > var6) {
                    arg0.field716 = 256;
                } else {
                    arg0.field716 = 512;
                }
            } else if (var6 > var4) {
                arg0.field716 = 1024;
            } else if (var6 < var4) {
                arg0.field716 = 0;
            }
        } else if (var4 < var6) {
            arg0.field716 = 1280;
        } else if (var6 >= var4) {
            arg0.field716 = 1536;
        } else {
            arg0.field716 = 1792;
        }
        int var7 = 4;
        int var8 = arg0.field716 - arg0.field700 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var9 = arg0.field688;
        if (var8 >= -256 && var8 <= 256) {
            var9 = arg0.field718;
        } else if (var8 >= 256 && var8 < 768) {
            var9 = arg0.field729;
        } else if (var8 >= -768 && var8 <= -256) {
            var9 = arg0.field730;
        }
        boolean var10 = true;
        if (var9 == -1) {
            var9 = arg0.field718;
        }
        arg0.field701 = var9;
        if (arg0 instanceof class170) {
            var10 = ((class170) arg0).field3130.field371;
        }
        if (var10) {
            if (arg0.field716 != arg0.field700 && arg0.field743 == -1 && arg0.field675 != 0) {
                var7 = 2;
            }
            if (arg0.field704 > 2) {
                var7 = 6;
            }
            if (arg0.field704 > 3) {
                var7 = 8;
            }
            if (arg0.field721 > 0 && arg0.field704 > 1) {
                var7 = 8;
                arg0.field721--;
            }
        } else {
            if (arg0.field704 > 1) {
                var7 = 6;
            }
            if (arg0.field704 > 2) {
                var7 = 8;
            }
            if (arg0.field721 > 0 && arg0.field704 > 1) {
                var7 = 8;
                arg0.field721--;
            }
        }
        if (arg0.field709[arg0.field704 - 1]) {
            var7 <<= 0x1;
        }
        if (var5 > var3) {
            arg0.field676 += var7;
            if (arg0.field676 > var5) {
                arg0.field676 = var5;
            }
        } else if (var3 > var5) {
            arg0.field676 -= var7;
            if (var5 > arg0.field676) {
                arg0.field676 = var5;
            }
        }
        if (var6 > var4) {
            arg0.field685 += var7;
            if (arg0.field685 > var6) {
                arg0.field685 = var6;
            }
        } else if (var6 < var4) {
            arg0.field685 -= var7;
            if (arg0.field685 < var6) {
                arg0.field685 = var6;
            }
        }
        if (var7 >= 8 && arg0.field718 == arg0.field701 && arg0.field736 != -1) {
            arg0.field701 = arg0.field736;
        }
        if (arg0.field676 == var5 && arg0.field685 == var6) {
            if (arg0.field742 > 0) {
                arg0.field742--;
            }
            arg0.field704--;
        }
    }
}
