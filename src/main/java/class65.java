import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class65 {

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Ljava/lang/String;")
    public static String field862 = "white:";

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Ltd;")
    public static class225 field860 = new class225(64);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lnh;")
    public static class305 field861;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method398(int arg0) {
        if (arg0 != 15983) {
            field861 = null;
        }
        field861 = null;
        field862 = null;
        field860 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILcm;)V")
    public static final void method399(int arg0, class256 arg1) {
        field858++;
        arg1.field4105 = false;
        if (arg1.field4102 != -1) {
            class195 var2 = class280.method1815(arg1.field4102, 81);
            if (var2 == null || var2.field2989 == null) {
                arg1.field4102 = -1;
            } else {
                arg1.field4087++;
                if (var2.field2989.length > arg1.field4128 && arg1.field4087 > var2.field2966[arg1.field4128]) {
                    arg1.field4080++;
                    arg1.field4128++;
                    arg1.field4087 = 1;
                    class181.method1152(class250.field3905 == arg1, arg1.field4081, arg1.field4128, arg1.field4140, false, var2);
                }
                if (arg1.field4128 >= var2.field2989.length) {
                    arg1.field4128 = 0;
                    arg1.field4087 = 0;
                    class181.method1152(class250.field3905 == arg1, arg1.field4081, arg1.field4128, arg1.field4140, false, var2);
                }
                arg1.field4080 = arg1.field4128 + 1;
                if (var2.field2989.length <= arg1.field4080) {
                    arg1.field4080 = 0;
                }
            }
        }
        if (arg0 <= 22) {
            method398(105);
        }
        if (arg1.field4073 != -1 && class35.field533 >= arg1.field4100) {
            class167 var3 = class291.method1952(0, arg1.field4073);
            int var4 = var3.field2375;
            if (var4 == -1) {
                arg1.field4073 = -1;
            } else {
                label296: {
                    class195 var5 = class280.method1815(var4, -49);
                    if (var3.field2384) {
                        if (var5.field2980 == 3) {
                            if (arg1.field4046 > 0 && class35.field533 >= arg1.field4037 && arg1.field4082 < class35.field533) {
                                arg1.field4073 = -1;
                                break label296;
                            }
                        } else if (var5.field2980 == 1 && arg1.field4046 > 0 && arg1.field4037 <= class35.field533 && arg1.field4082 < class35.field533) {
                            arg1.field4100 = class35.field533 + 1;
                            break label296;
                        }
                    }
                    if (var5 == null || var5.field2989 == null) {
                        arg1.field4073 = -1;
                    } else {
                        if (arg1.field4086 < 0) {
                            arg1.field4086 = 0;
                            class181.method1152(class250.field3905 == arg1, arg1.field4081, 0, arg1.field4140, false, var5);
                        }
                        arg1.field4123++;
                        if (arg1.field4086 < var5.field2989.length && arg1.field4123 > var5.field2966[arg1.field4086]) {
                            arg1.field4123 = 1;
                            arg1.field4086++;
                            class181.method1152(class250.field3905 == arg1, arg1.field4081, arg1.field4086, arg1.field4140, false, var5);
                        }
                        if (arg1.field4086 >= var5.field2989.length) {
                            if (var3.field2384) {
                                arg1.field4086 -= var5.field2984;
                                arg1.field4051++;
                                if (var5.field2982 <= arg1.field4051) {
                                    arg1.field4073 = -1;
                                } else if (arg1.field4086 >= 0 && var5.field2989.length > arg1.field4086) {
                                    class181.method1152(class250.field3905 == arg1, arg1.field4081, arg1.field4086, arg1.field4140, false, var5);
                                } else {
                                    arg1.field4073 = -1;
                                }
                            } else {
                                arg1.field4073 = -1;
                            }
                        }
                        arg1.field4116 = arg1.field4086 + 1;
                        if (arg1.field4116 >= var5.field2989.length) {
                            if (var3.field2384) {
                                arg1.field4116 -= var5.field2984;
                                if ((arg1.field4051 + 1) >= var5.field2982) {
                                    arg1.field4116 = -1;
                                } else if (arg1.field4116 < 0 || var5.field2989.length <= arg1.field4116) {
                                    arg1.field4116 = -1;
                                }
                            } else {
                                arg1.field4116 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4133 != -1 && arg1.field4107 <= 1) {
            class195 var6 = class280.method1815(arg1.field4133, 119);
            if (var6.field2980 == 3) {
                if (arg1.field4046 > 0 && class35.field533 >= arg1.field4037 && class35.field533 > arg1.field4082) {
                    arg1.field4133 = -1;
                }
            } else if (var6.field2980 == 1 && arg1.field4046 > 0 && class35.field533 >= arg1.field4037 && arg1.field4082 < class35.field533) {
                arg1.field4107 = 2;
            }
        }
        if (arg1.field4133 != -1 && arg1.field4107 == 0) {
            class195 var7 = class280.method1815(arg1.field4133, -31);
            if (var7 == null || var7.field2989 == null) {
                arg1.field4133 = -1;
            } else {
                arg1.field4112++;
                if (arg1.field4099 < var7.field2989.length && arg1.field4112 > var7.field2966[arg1.field4099]) {
                    arg1.field4112 = 1;
                    arg1.field4099++;
                    class181.method1152(class250.field3905 == arg1, arg1.field4081, arg1.field4099, arg1.field4140, false, var7);
                }
                if (arg1.field4099 >= var7.field2989.length) {
                    arg1.field4099 -= var7.field2984;
                    arg1.field4146++;
                    if (arg1.field4146 >= var7.field2982) {
                        arg1.field4133 = -1;
                    } else if (arg1.field4099 >= 0 && arg1.field4099 < var7.field2989.length) {
                        class181.method1152(class250.field3905 == arg1, arg1.field4081, arg1.field4099, arg1.field4140, false, var7);
                    } else {
                        arg1.field4133 = -1;
                    }
                }
                arg1.field4072 = arg1.field4099 + 1;
                if (arg1.field4072 >= var7.field2989.length) {
                    arg1.field4072 -= var7.field2984;
                    if (var7.field2982 <= (arg1.field4146 + 1)) {
                        arg1.field4072 = -1;
                    } else if (arg1.field4072 < 0 || var7.field2989.length <= arg1.field4072) {
                        arg1.field4072 = -1;
                    }
                }
                arg1.field4105 = var7.field2969;
            }
        }
        if (arg1.field4107 > 0) {
            arg1.field4107--;
        }
        for (int var8 = 0; var8 < arg1.field4110.length; var8++) {
            class113 var9 = arg1.field4110[var8];
            if (var9 != null) {
                if (var9.field1624 > 0) {
                    var9.field1624--;
                } else {
                    class195 var10 = class280.method1815(var9.field1619, -90);
                    if (var10 == null || var10.field2989 == null) {
                        arg1.field4110[var8] = null;
                    } else {
                        var9.field1623++;
                        if (var10.field2989.length > var9.field1626 && var10.field2966[var9.field1626] < var9.field1623) {
                            var9.field1623 = 1;
                            var9.field1626++;
                            class181.method1152(class250.field3905 == arg1, arg1.field4081, var9.field1626, arg1.field4140, false, var10);
                        }
                        if (var9.field1626 >= var10.field2989.length) {
                            var9.field1622++;
                            var9.field1626 -= var10.field2984;
                            if (var9.field1622 >= var10.field2982) {
                                arg1.field4110[var8] = null;
                            } else if (var9.field1626 >= 0 && var10.field2989.length > var9.field1626) {
                                class181.method1152(class250.field3905 == arg1, arg1.field4081, var9.field1626, arg1.field4140, false, var10);
                            } else {
                                arg1.field4110[var8] = null;
                            }
                        }
                        var9.field1620 = var9.field1626 + 1;
                        if (var10.field2989.length <= var9.field1620) {
                            var9.field1620 -= var10.field2984;
                            if (var10.field2982 <= var9.field1622 + 1) {
                                var9.field1620 = -1;
                            } else if (var9.field1620 < 0 || var10.field2989.length <= var9.field1620) {
                                var9.field1620 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Lqj;")
    public static final class248 method400(int arg0) {
        field859++;
        int var1 = 105 % ((arg0 + 8) / 55);
        return class261.field4208 < class306.field4924.length ? class306.field4924[class261.field4208++] : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V")
    public static final void method401() {
        for (int var0 = 0; var0 < class57.field787; var0++) {
            class160 var1 = class126.field1764[var0];
            class137.method862(var1);
            class126.field1764[var0] = null;
        }
        class57.field787 = 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lnh;B)Z")
    public static final boolean method402(class305 arg0, byte arg1) {
        field863++;
        int var2 = 81 % ((-arg1 - 22) / 43);
        return arg0.method2056(true, class195.field2993);
    }
}
