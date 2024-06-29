import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class47 {

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "Lum;")
    public class108 field659 = new class108();

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "J")
    public static long field650 = 0L;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    public static int field653 = 0;

    @OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
    public static int field663 = -1;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "Lid;")
    public static class224 field652 = new class224("", 10);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!fea", name = "r", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!fea", name = "t", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!fea", name = "u", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!fea", name = "w", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!fea", name = "v", descriptor = "Lum;")
    private class108 field666;

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "Lml;")
    public static class36 field657;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lum;B)V", line = 5)
    public final void method414(class108 arg0, byte arg1) {
        field655++;
        if (arg0.field1800 != null) {
            arg0.method911(-52);
        }
        arg0.field1802 = this.field659;
        arg0.field1800 = this.field659.field1800;
        arg0.field1800.field1802 = arg0;
        if (arg1 > 11) {
            arg0.field1802.field1800 = arg0;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLum;)V", line = 23)
    public final void method415(byte arg0, class108 arg1) {
        if (arg1.field1800 != null) {
            arg1.method911(-52);
        }
        field645++;
        arg1.field1800 = this.field659;
        arg1.field1802 = this.field659.field1802;
        arg1.field1800.field1802 = arg1;
        if (arg0 >= 14) {
            arg1.field1802.field1800 = arg1;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Lum;", line = 41)
    public final class108 method416(int arg0) {
        field664++;
        if (arg0 != 0) {
            method421(-67, true, null);
        }
        class108 var2 = this.field666;
        if (this.field659 == var2) {
            this.field666 = null;
            return null;
        } else {
            this.field666 = var2.field1800;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)Lum;", line = 64)
    public final class108 method417(byte arg0) {
        field649++;
        class108 var2 = this.field659.field1802;
        if (this.field659 == var2) {
            return null;
        }
        if (arg0 != 51) {
            this.method427(true);
        }
        var2.method911(-52);
        return var2;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lum;Lfea;B)V", line = 89)
    private final void method418(class108 arg0, class47 arg1, byte arg2) {
        if (arg2 >= -16) {
            method422(31);
        }
        field660++;
        class108 var4 = this.field659.field1800;
        this.field659.field1800 = arg0.field1800;
        arg0.field1800.field1802 = this.field659;
        if (this.field659 != arg0) {
            arg0.field1800 = arg1.field659.field1800;
            arg0.field1800.field1802 = arg0;
            var4.field1802 = arg1.field659;
            arg1.field659.field1800 = var4;
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)I", line = 126)
    public final int method419(int arg0) {
        field651++;
        if (arg0 < 42) {
            return 79;
        }
        int var2 = 0;
        for (class108 var3 = this.field659.field1802; var3 != this.field659; var3 = var3.field1802) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)Lum;", line = 149)
    public final class108 method420(boolean arg0) {
        if (arg0) {
            return null;
        }
        field656++;
        class108 var2 = this.field666;
        if (this.field659 == var2) {
            this.field666 = null;
            return null;
        } else {
            this.field666 = var2.field1802;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZLbda;)V", line = 169)
    public static final void method421(int arg0, boolean arg1, class400 arg2) {
        field647++;
        if (class480.field6825 >= 400) {
            return;
        }
        if (class644.field9367 != arg2) {
            String var3;
            if (~arg2.field5960 == arg0) {
                boolean var4 = true;
                if (class644.field9367.field5986 != -1 && arg2.field5986 != -1) {
                    int var5 = arg2.field5981 < class644.field9367.field5981 ? class644.field9367.field5981 : arg2.field5981;
                    int var6 = arg2.field5986 <= class644.field9367.field5986 ? arg2.field5986 : class644.field9367.field5986;
                    int var7 = var6 + (var5 * 10 / 100) + 5;
                    int var8 = class644.field9367.field5981 - arg2.field5981;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class78.field1412 == class640.field9282 ? class635.field9230.method3220(false, class538.field7500) : class130.field2118.method3220(false, class538.field7500);
                if (arg2.field5980 > arg2.field5981) {
                    var3 = arg2.method2451(true, -13212) + (var4 ? class602.method3420(class644.field9367.field5981, arg2.field5981, (byte) -114) : "<col=ffffff>") + " (" + var9 + arg2.field5981 + "+" + (arg2.field5980 - arg2.field5981) + ")";
                } else {
                    var3 = arg2.method2451(true, -13212) + (var4 ? class602.method3420(class644.field9367.field5981, arg2.field5981, (byte) -108) : "<col=ffffff>") + " (" + var9 + arg2.field5981 + ")";
                }
            } else {
                var3 = arg2.method2451(true, -13212) + " (" + class92.field1637.method3220(false, class538.field7500) + arg2.field5960 + ")";
            }
            if (class90.field1620) {
                if (!arg1 && (class549.field7789 & 0x8) != 0) {
                    class366.method2209(class335.field4799, 0, 10, -1, true, (long) arg2.field1555, arg0, 0, class511.field7082, false, class413.field6111 + " -> <col=ffffff>" + var3);
                    class277.field4040++;
                }
            } else if (arg1) {
                class366.method2209(-1, 0, -1, 0, false, 0L, -1, 0, "<col=cccccc>" + var3, true, "");
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class69.field1303[var10] != null) {
                        short var11 = 0;
                        if (class640.field9282 == class202.field2846 && class69.field1303[var10].equalsIgnoreCase(class617.field8729.method3220(false, class538.field7500))) {
                            if (class644.field9367.field5981 < arg2.field5981) {
                                var11 = 2000;
                            }
                            if (class644.field9367.field5951 != 0 && arg2.field5951 != 0) {
                                if (class644.field9367.field5951 == arg2.field5951) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class480.field6824[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class192.field2733[var10] + var11);
                        int var13 = class170.field2486[var10] == -1 ? class340.field4894 : class170.field2486[var10];
                        class209.field2953++;
                        class366.method2209(var13, 0, var12, -1, true, (long) arg2.field1555, arg0, 0, class69.field1303[var10], false, "<col=ffffff>" + var3);
                    }
                }
            }
            if (!arg1) {
                for (class587 var14 = (class587) class432.field6356.method427(true); var14 != null; var14 = (class587) class432.field6356.method420(false)) {
                    if (var14.field8359 == 46) {
                        var14.field8370 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class90.field1620 && (class549.field7789 & 0x10) != 0) {
            class366.method2209(class335.field4799, 0, 2, -1, true, 0L, -1, 0, class511.field7082, false, class413.field6111 + " -> <col=ffffff>" + class88.field1589.method3220(false, class538.field7500));
            class170.field2482++;
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)V", line = 316)
    public static void method422(int arg0) {
        field657 = null;
        field652 = null;
        if (arg0 != 0) {
            field652 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lqa;I)V", line = 332)
    public static final void method423(class167 arg0, int arg1) {
        if (arg1 != 11042) {
            method423(null, 42);
        }
        for (class585 var2 = (class585) class501.field7030.method944(127); var2 != null; var2 = (class585) class501.field7030.method947((byte) 118)) {
            var2.method3348(arg0);
        }
        field665++;
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "(I)Z", line = 358)
    public final boolean method424(int arg0) {
        if (arg0 == 2000) {
            field648++;
            return this.field659.field1802 == this.field659;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)V", line = 370)
    public final void method425(int arg0) {
        while (true) {
            class108 var2 = this.field659.field1802;
            if (this.field659 == var2) {
                field658++;
                if (arg0 > -9) {
                    field657 = null;
                }
                this.field666 = null;
                return;
            }
            var2.method911(-52);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLfea;)V", line = 391)
    public final void method426(byte arg0, class47 arg1) {
        field654++;
        this.method418(this.field659.field1802, arg1, (byte) -51);
        if (arg0 <= 89) {
            this.method427(false);
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "()V", line = 456)
    public class47() {
        this.field659.field1802 = this.field659;
        this.field659.field1800 = this.field659;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)Lum;", line = 413)
    public final class108 method427(boolean arg0) {
        field646++;
        class108 var2 = this.field659.field1802;
        if (this.field659 == var2) {
            this.field666 = null;
            return null;
        } else if (arg0) {
            this.field666 = var2.field1802;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)Lum;", line = 434)
    public final class108 method428(int arg0) {
        field661++;
        class108 var2 = this.field659.field1800;
        if (this.field659 == var2) {
            this.field666 = null;
            return null;
        }
        this.field666 = var2.field1800;
        if (arg0 != 2000) {
            this.method416(-30);
        }
        return var2;
    }
}
