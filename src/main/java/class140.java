import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class140 extends class182 {

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "Lkh;")
    private class117 field2545 = class61.field1225;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "Lkh;")
    public static class117 field2559 = class224.method1450((byte) -102, "::");

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    private int field2547;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "Lai;")
    public static class10 field2558;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "Lr;")
    public static class186 field2551;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "Lvb;")
    public static class232 field2552;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "Lff;")
    private class62 field2557;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "[I")
    public static int[] field2556;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lkh;")
    public final class117 method951(int arg0, int arg1) {
        field2554++;
        if (this.field2557 == null) {
            return this.field2545;
        }
        class33 var3 = (class33) this.field2557.method460((long) arg0, 1);
        if (arg1 != 0) {
            field2558 = null;
        }
        return var3 == null ? this.field2545 : var3.field768;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(B)V")
    public static void method952(byte arg0) {
        field2551 = null;
        field2556 = null;
        field2559 = null;
        field2558 = null;
        if (arg0 == -128) {
            field2552 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLve;)V")
    public static final void method953(byte arg0, class234 arg1) {
        field2550++;
        arg1.field4223 = false;
        if (arg0 != -54) {
            field2551 = null;
        }
        if (arg1.field4224 != -1) {
            class174 var2 = class81.method555(arg1.field4224, (byte) 102);
            if (var2 == null || var2.field3144 == null) {
                arg1.field4224 = -1;
            } else {
                arg1.field4241++;
                if (var2.field3144.length > arg1.field4214 && var2.field3148[arg1.field4214] < arg1.field4241) {
                    arg1.field4241 = 1;
                    arg1.field4214++;
                    class99.method673(arg1.field4244, arg1.field4214, 32521, class93.field1712 == arg1, var2, arg1.field4221);
                }
                if (var2.field3144.length <= arg1.field4214) {
                    arg1.field4214 = 0;
                    arg1.field4241 = 0;
                    class99.method673(arg1.field4244, arg1.field4214, arg0 + 32575, class93.field1712 == arg1, var2, arg1.field4221);
                }
            }
        }
        if (arg1.field4233 != -1 && class44.field966 >= arg1.field4222) {
            if (arg1.field4209 < 0) {
                arg1.field4209 = 0;
            }
            int var3 = class214.method1406(1, arg1.field4233).field544;
            if (var3 == -1) {
                arg1.field4233 = -1;
            } else {
                class174 var4 = class81.method555(var3, (byte) 26);
                if (var4 == null || var4.field3144 == null) {
                    arg1.field4233 = -1;
                } else {
                    arg1.field4248++;
                    if (arg1.field4209 < var4.field3144.length && var4.field3148[arg1.field4209] < arg1.field4248) {
                        arg1.field4209++;
                        arg1.field4248 = 1;
                        class99.method673(arg1.field4244, arg1.field4209, 32521, class93.field1712 == arg1, var4, arg1.field4221);
                    }
                    if (arg1.field4209 >= var4.field3144.length) {
                        arg1.field4233 = -1;
                    }
                }
            }
        }
        if (arg1.field4213 != -1 && arg1.field4225 <= 1) {
            class174 var5 = class81.method555(arg1.field4213, (byte) 108);
            if (var5.field3150 == 1 && arg1.field4267 > 0 && class44.field966 >= arg1.field4278 && arg1.field4252 < class44.field966) {
                arg1.field4225 = 1;
                return;
            }
        }
        if (arg1.field4213 != -1 && arg1.field4225 == 0) {
            class174 var6 = class81.method555(arg1.field4213, (byte) 105);
            if (var6 == null || var6.field3144 == null) {
                arg1.field4213 = -1;
            } else {
                arg1.field4216++;
                if (arg1.field4274 < var6.field3144.length && var6.field3148[arg1.field4274] < arg1.field4216) {
                    arg1.field4216 = 1;
                    arg1.field4274++;
                    class99.method673(arg1.field4244, arg1.field4274, arg0 ^ 0xFFFF80C3, class93.field1712 == arg1, var6, arg1.field4221);
                }
                if (var6.field3144.length <= arg1.field4274) {
                    arg1.field4243++;
                    arg1.field4274 -= var6.field3137;
                    if (var6.field3147 <= arg1.field4243) {
                        arg1.field4213 = -1;
                    } else if (arg1.field4274 >= 0 && arg1.field4274 < var6.field3144.length) {
                        class99.method673(arg1.field4244, arg1.field4274, arg0 + 32575, class93.field1712 == arg1, var6, arg1.field4221);
                    } else {
                        arg1.field4213 = -1;
                    }
                }
                arg1.field4223 = var6.field3152;
            }
        }
        if (arg1.field4225 > 0) {
            arg1.field4225--;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
    public final int method954(int arg0, int arg1) {
        if (arg0 >= -7) {
            field2552 = null;
        }
        field2548++;
        if (this.field2557 == null) {
            return this.field2547;
        } else {
            class123 var3 = (class123) this.field2557.method460((long) arg1, 1);
            return var3 == null ? this.field2547 : var3.field2304;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
    public static final boolean method955(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class27.field674; var3++) {
            class200 var4 = class38.field863[var3];
            if (var4.field3615 == 1) {
                int var5 = var4.field3623 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3634 * var5 >> 8) + var4.field3621;
                    int var7 = (var4.field3628 * var5 >> 8) + var4.field3612;
                    int var8 = (var4.field3631 * var5 >> 8) + var4.field3633;
                    int var9 = (var4.field3624 * var5 >> 8) + var4.field3640;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3615 == 2) {
                int var10 = arg0 - var4.field3623;
                if (var10 > 0) {
                    int var11 = (var4.field3634 * var10 >> 8) + var4.field3621;
                    int var12 = (var4.field3628 * var10 >> 8) + var4.field3612;
                    int var13 = (var4.field3631 * var10 >> 8) + var4.field3633;
                    int var14 = (var4.field3624 * var10 >> 8) + var4.field3640;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3615 == 3) {
                int var15 = var4.field3621 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3635 * var15 >> 8) + var4.field3623;
                    int var17 = (var4.field3613 * var15 >> 8) + var4.field3625;
                    int var18 = (var4.field3631 * var15 >> 8) + var4.field3633;
                    int var19 = (var4.field3624 * var15 >> 8) + var4.field3640;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3615 == 4) {
                int var20 = arg2 - var4.field3621;
                if (var20 > 0) {
                    int var21 = (var4.field3635 * var20 >> 8) + var4.field3623;
                    int var22 = (var4.field3613 * var20 >> 8) + var4.field3625;
                    int var23 = (var4.field3631 * var20 >> 8) + var4.field3633;
                    int var24 = (var4.field3624 * var20 >> 8) + var4.field3640;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3615 == 5) {
                int var25 = arg1 - var4.field3633;
                if (var25 > 0) {
                    int var26 = (var4.field3635 * var25 >> 8) + var4.field3623;
                    int var27 = (var4.field3613 * var25 >> 8) + var4.field3625;
                    int var28 = (var4.field3634 * var25 >> 8) + var4.field3621;
                    int var29 = (var4.field3628 * var25 >> 8) + var4.field3612;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lnc;II)V")
    private final void method956(class145 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2549 = arg0.method998(98);
        } else if (arg1 == 2) {
            this.field2544 = arg0.method998(58);
        } else if (arg1 == 3) {
            this.field2545 = arg0.method1038(41);
        } else if (arg1 == 4) {
            this.field2547 = arg0.method1018(-1068451600);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1049((byte) 101);
            this.field2557 = new class62(class68.method479(var4, 92));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1018(-1068451600);
                class12 var7;
                if (arg1 == 5) {
                    var7 = new class33(arg0.method1038(36));
                } else {
                    var7 = new class123(arg0.method1018(-1068451600));
                }
                this.field2557.method461((long) var6, (byte) -27, var7);
            }
        }
        if (arg2 > 63) {
            field2546++;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLnc;)V")
    public final void method957(boolean arg0, class145 arg1) {
        if (!arg0) {
            field2552 = null;
        }
        field2555++;
        while (true) {
            int var3 = arg1.method998(84);
            if (var3 == 0) {
                return;
            }
            this.method956(arg1, var3, 116);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)I")
    public static final int method958(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field2559 = null;
        }
        class248 var3 = (class248) class136.field2457.method460((long) arg1, 1);
        field2553++;
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field4552.length > arg2) {
            return var3.field4552[arg2];
        } else {
            return -1;
        }
    }
}
