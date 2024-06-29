import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class119 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Led;")
    public class297 field1857 = new class297();

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field1867 = -1;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field1866 = 0;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field1863 = 0;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Ldp;")
    public static class174 field1862;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Led;")
    private class297 field1861;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lof;")
    public static class421 field1865;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
    public static int[] field1856;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 4)
    public static void method999(int arg0) {
        field1865 = null;
        field1862 = null;
        if (arg0 == -1785) {
            field1856 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Led;", line = 16)
    public final class297 method1000(int arg0) {
        field1871++;
        class297 var2 = this.field1857.field4393;
        if (this.field1857 == var2) {
            this.field1861 = null;
            return null;
        }
        if (arg0 != -28142) {
            method999(30);
        }
        this.field1861 = var2.field4393;
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 39)
    public final void method1001(byte arg0) {
        field1870++;
        int var2 = -59 / ((arg0 - 47) / 34);
        while (true) {
            class297 var3 = this.field1857.field4393;
            if (this.field1857 == var3) {
                this.field1861 = null;
                return;
            }
            var3.method2064(11);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILvj;)V", line = 60)
    public static final void method1002(int arg0, class177 arg1) {
        if (arg0 != 0) {
            return;
        }
        field1864++;
        class184 var2 = null;
        try {
            class131 var3 = arg1.method1375((byte) 127);
            while (var3.field2121 == 0) {
                class134.method1106(1L, 10);
            }
            if (var3.field2121 == 1) {
                var2 = (class184) var3.field2125;
                class37 var4 = class390.method2479(-127);
                var2.method1436(var4.field565, 0, var4.field578, arg0 + 1);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1431(arg0 - 1);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILqo;)V", line = 101)
    public static final void method1003(int arg0, class127 arg1) {
        field1859++;
        if (class389.field5591 >= 400 || class86.field1394 == arg1) {
            return;
        }
        String var8;
        if (arg1.field2082 == 0) {
            boolean var2 = true;
            if (class86.field1394.field2055 != -1 && arg1.field2055 != -1) {
                int var3 = class86.field1394.field2065 <= arg1.field2065 ? arg1.field2065 : class86.field1394.field2065;
                int var4 = arg1.field2055 > class86.field1394.field2055 ? class86.field1394.field2055 : arg1.field2055;
                int var5 = var3 * 10 / 100 + var4 + 5;
                int var6 = class86.field1394.field2065 - arg1.field2065;
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (var5 < var6) {
                    var2 = false;
                }
            }
            String var7 = class336.field4809 == 1 ? class18.field258 : class161.field2446;
            if (arg1.field2077 <= arg1.field2065) {
                var8 = arg1.method1074(true, (byte) 45) + (var2 ? class99.method823(arg1.field2065, arg0 ^ 0x2, class86.field1394.field2065) : "<col=ffffff>") + " (" + var7 + arg1.field2065 + ")";
            } else {
                var8 = arg1.method1074(true, (byte) 20) + (var2 ? class99.method823(arg1.field2065, arg0 ^ 0x2, class86.field1394.field2065) : "<col=ffffff>") + " (" + var7 + arg1.field2065 + "+" + (arg1.field2077 - arg1.field2065) + ")";
            }
        } else {
            var8 = arg1.method1074(true, (byte) 32) + " (" + class447.field6521 + arg1.field2082 + ")";
        }
        if (class47.field765 == 1) {
            class406.field5914++;
            class26.method217(0, class19.field267, 19, 0, field1867, 12154, class85.field1377 + " -> <col=ffffff>" + var8, (long) arg1.field5657);
        } else if (!class291.field4332) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class55.field892[var9] != null) {
                    short var10 = 0;
                    if (class336.field4809 == 0 && class55.field892[var9].equalsIgnoreCase(class418.field6068)) {
                        if (arg1.field2065 > class86.field1394.field2065) {
                            var10 = 2000;
                        }
                        if (class86.field1394.field2080 != 0 && arg1.field2080 != 0) {
                            if (class86.field1394.field2080 == arg1.field2080) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class383.field5475[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class122.field1924[var9] + var10);
                    int var12 = class134.field2158[var9] == -1 ? class361.field5151 : class134.field2158[var9];
                    class26.method217(0, class55.field892[var9], var11, 0, var12, 12154, "<col=ffffff>" + var8, (long) arg1.field5657);
                    class278.field4185++;
                }
            }
        } else if ((class320.field4637 & 0x8) != 0) {
            class345.field4872++;
            class26.method217(0, class171.field2549, 51, 0, class72.field1207, 12154, class79.field1339 + " -> <col=ffffff>" + var8, (long) arg1.field5657);
        }
        for (class278 var13 = (class278) class276.field4153.method157((byte) -125); var13 != null; var13 = (class278) class276.field4153.method145(-109)) {
            if (var13.field4182 == 15) {
                var13.field4179 = "<col=ffffff>" + var8;
                break;
            }
        }
        if (arg0 != 0) {
            method1005(-29, -121, 112, (class90) null, -66, true, (class153) null, -52);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 237)
    public class119() {
        this.field1857.field4400 = this.field1857;
        this.field1857.field4393 = this.field1857;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Led;", line = 250)
    public final class297 method1004(byte arg0) {
        if (arg0 != -127) {
            this.method1006(-16, (class297) null);
        }
        field1869++;
        class297 var2 = this.field1861;
        if (this.field1857 == var2) {
            this.field1861 = null;
            return null;
        } else {
            this.field1861 = var2.field4393;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILja;IZLbn;I)Lof;", line = 272)
    public static final class421 method1005(int arg0, int arg1, int arg2, class90 arg3, int arg4, boolean arg5, class153 arg6, int arg7) {
        class46.field753.field4593 = arg2;
        if (!arg5) {
            method1003(29, (class127) null);
        }
        field1858++;
        class46.field753.field4603 = arg0;
        class46.field753.field4592 = arg1;
        class46.field753.field4599 = arg4;
        class46.field753.field4598 = arg7;
        class46.field753.field4600 = arg6 != null;
        class46.field753.field4601 = arg3.field1431;
        return (class421) class417.field6046.method622(class46.field753, -107);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILed;)V", line = 297)
    public final void method1006(int arg0, class297 arg1) {
        if (arg1.field4400 != null) {
            arg1.method2064(11);
        }
        if (arg0 < 45) {
            return;
        }
        field1868++;
        arg1.field4400 = this.field1857.field4400;
        arg1.field4393 = this.field1857;
        arg1.field4400.field4393 = arg1;
        arg1.field4393.field4400 = arg1;
    }
}
