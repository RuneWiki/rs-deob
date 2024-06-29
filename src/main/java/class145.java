import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class145 {

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field1888 = -1;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Luda;")
    public static class509 field1885 = new class509(1);

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "S")
    public static short field1892 = 205;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lfk;")
    public class117 field1883;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method792(int arg0) {
        field1885 = null;
        int var1 = -124 % ((arg0 + 2) / 60);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILdc;)V")
    public static final void method793(int arg0, class23 arg1) {
        field1880++;
        arg1.field379 = 0;
        if (arg1.field350 != -1) {
            class320 var2 = class609.field8754.method535(arg1.field350, true);
            if (var2 == null || var2.field4431 == null) {
                arg1.field350 = -1;
                arg1.field398 = false;
            } else {
                label401: {
                    arg1.field359++;
                    if (arg1.field354 < var2.field4431.length && var2.field4432[arg1.field354] < arg1.field359) {
                        arg1.field378++;
                        arg1.field354++;
                        arg1.field359 = 1;
                        class627.method3629(arg1.field6368, class147.field1899 == arg1, var2, arg1.field354, arg1.field6358, (byte) -121, arg1.field6362);
                    }
                    if (var2.field4431.length <= arg1.field354) {
                        arg1.field354 = 0;
                        arg1.field359 = 0;
                        if (arg1.field398) {
                            arg1.field350 = arg1.method144((byte) 59).method2238((byte) 42);
                            if (arg1.field350 == -1) {
                                arg1.field398 = false;
                                break label401;
                            }
                            var2 = class609.field8754.method535(arg1.field350, true);
                        }
                        class627.method3629(arg1.field6368, class147.field1899 == arg1, var2, arg1.field354, arg1.field6358, (byte) -120, arg1.field6362);
                    }
                    arg1.field378 = arg1.field354 + 1;
                    if (arg1.field378 >= var2.field4431.length) {
                        arg1.field378 = 0;
                    }
                }
            }
        }
        if (arg1.field380 != -1 && arg1.field369 <= class7.field61) {
            class628 var3 = class410.field5636.method348(6410, arg1.field380);
            int var4 = var3.field9152;
            if (var4 == -1) {
                arg1.field380 = -1;
            } else {
                label403: {
                    class320 var5 = class609.field8754.method535(var4, true);
                    if (var3.field9162) {
                        if (var5.field4415 == 3) {
                            if (arg1.field424 > 0 && arg1.field397 <= class7.field61 && class7.field61 > arg1.field345) {
                                arg1.field380 = -1;
                                break label403;
                            }
                        } else if (var5.field4415 == 1 && arg1.field424 > 0 && class7.field61 >= arg1.field397 && class7.field61 > arg1.field345) {
                            arg1.field369 = class7.field61 + 1;
                            break label403;
                        }
                    }
                    if (var5 == null || var5.field4431 == null) {
                        arg1.field380 = -1;
                    } else {
                        if (arg1.field411 < 0) {
                            arg1.field411 = 0;
                            class627.method3629(arg1.field6368, class147.field1899 == arg1, var5, 0, arg1.field6358, (byte) -123, arg1.field6362);
                        }
                        arg1.field324++;
                        if (arg1.field411 < var5.field4431.length && arg1.field324 > var5.field4432[arg1.field411]) {
                            arg1.field324 = 1;
                            arg1.field411++;
                            class627.method3629(arg1.field6368, class147.field1899 == arg1, var5, arg1.field411, arg1.field6358, (byte) -119, arg1.field6362);
                        }
                        if (arg1.field411 >= var5.field4431.length) {
                            if (var3.field9162) {
                                arg1.field411 -= var5.field4421;
                                arg1.field392++;
                                if (var5.field4407 <= arg1.field392) {
                                    arg1.field380 = -1;
                                } else if (arg1.field411 >= 0 && arg1.field411 < var5.field4431.length) {
                                    class627.method3629(arg1.field6368, class147.field1899 == arg1, var5, arg1.field411, arg1.field6358, (byte) -127, arg1.field6362);
                                } else {
                                    arg1.field380 = -1;
                                }
                            } else {
                                arg1.field380 = -1;
                            }
                        }
                        arg1.field387 = arg1.field411 + 1;
                        if (arg1.field387 >= var5.field4431.length) {
                            if (var3.field9162) {
                                arg1.field387 -= var5.field4421;
                                if (arg1.field392 + 1 >= var5.field4407) {
                                    arg1.field387 = -1;
                                } else if (arg1.field387 < 0 || arg1.field387 >= var5.field4431.length) {
                                    arg1.field387 = -1;
                                }
                            } else {
                                arg1.field387 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field357 != -1 && arg1.field377 <= class7.field61) {
            class628 var6 = class410.field5636.method348(6410, arg1.field357);
            int var7 = var6.field9152;
            if (var7 == -1) {
                arg1.field357 = -1;
            } else {
                label406: {
                    class320 var8 = class609.field8754.method535(var7, true);
                    if (var6.field9162) {
                        if (var8.field4415 == 3) {
                            if (arg1.field424 > 0 && class7.field61 >= arg1.field397 && class7.field61 > arg1.field345) {
                                arg1.field357 = -1;
                                break label406;
                            }
                        } else if (var8.field4415 == 1 && arg1.field424 > 0 && class7.field61 >= arg1.field397 && arg1.field345 < class7.field61) {
                            arg1.field377 = class7.field61 + 1;
                            break label406;
                        }
                    }
                    if (var8 == null || var8.field4431 == null) {
                        arg1.field357 = -1;
                    } else {
                        if (arg1.field352 < 0) {
                            arg1.field352 = 0;
                            class627.method3629(arg1.field6368, class147.field1899 == arg1, var8, 0, arg1.field6358, (byte) -109, arg1.field6362);
                        }
                        arg1.field358++;
                        if (var8.field4431.length > arg1.field352 && var8.field4432[arg1.field352] < arg1.field358) {
                            arg1.field352++;
                            arg1.field358 = 1;
                            class627.method3629(arg1.field6368, class147.field1899 == arg1, var8, arg1.field352, arg1.field6358, (byte) -117, arg1.field6362);
                        }
                        if (var8.field4431.length <= arg1.field352) {
                            if (var6.field9162) {
                                arg1.field352 -= var8.field4421;
                                arg1.field388++;
                                if (var8.field4407 <= arg1.field388) {
                                    arg1.field357 = -1;
                                } else if (arg1.field352 >= 0 && arg1.field352 < var8.field4431.length) {
                                    class627.method3629(arg1.field6368, class147.field1899 == arg1, var8, arg1.field352, arg1.field6358, (byte) -110, arg1.field6362);
                                } else {
                                    arg1.field357 = -1;
                                }
                            } else {
                                arg1.field357 = -1;
                            }
                        }
                        arg1.field403 = arg1.field352 + 1;
                        if (var8.field4431.length <= arg1.field403) {
                            if (var6.field9162) {
                                arg1.field403 -= var8.field4421;
                                if (var8.field4407 <= arg1.field388 + 1) {
                                    arg1.field403 = -1;
                                } else if (arg1.field403 < 0 || arg1.field403 >= var8.field4431.length) {
                                    arg1.field403 = -1;
                                }
                            } else {
                                arg1.field403 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -82) {
            return;
        }
        if (arg1.field368 != -1 && arg1.field391 <= 1) {
            class320 var9 = class609.field8754.method535(arg1.field368, true);
            if (var9.field4415 == 3) {
                if (arg1.field424 > 0 && arg1.field397 <= class7.field61 && class7.field61 > arg1.field345) {
                    arg1.field368 = -1;
                }
            } else if (var9.field4415 == 1 && arg1.field424 > 0 && arg1.field397 <= class7.field61 && arg1.field345 < class7.field61) {
                arg1.field391 = 2;
            }
        }
        if (arg1.field368 != -1 && arg1.field391 == 0) {
            class320 var10 = class609.field8754.method535(arg1.field368, true);
            if (var10 == null || var10.field4431 == null) {
                arg1.field368 = -1;
            } else {
                arg1.field328++;
                if (var10.field4431.length > arg1.field376 && arg1.field328 > var10.field4432[arg1.field376]) {
                    arg1.field328 = 1;
                    arg1.field376++;
                    class627.method3629(arg1.field6368, class147.field1899 == arg1, var10, arg1.field376, arg1.field6358, (byte) -127, arg1.field6362);
                }
                if (var10.field4431.length <= arg1.field376) {
                    arg1.field363++;
                    arg1.field376 -= var10.field4421;
                    if (var10.field4407 <= arg1.field363) {
                        arg1.field368 = -1;
                    } else if (arg1.field376 >= 0 && arg1.field376 < var10.field4431.length) {
                        class627.method3629(arg1.field6368, class147.field1899 == arg1, var10, arg1.field376, arg1.field6358, (byte) -107, arg1.field6362);
                    } else {
                        arg1.field368 = -1;
                    }
                }
                arg1.field356 = arg1.field376 + 1;
                if (arg1.field356 >= var10.field4431.length) {
                    arg1.field356 -= var10.field4421;
                    if (var10.field4407 <= arg1.field363 + 1) {
                        arg1.field356 = -1;
                    } else if (arg1.field356 < 0 || arg1.field356 >= var10.field4431.length) {
                        arg1.field356 = -1;
                    }
                }
                arg1.field379 = var10.field4414;
            }
        }
        if (arg1.field391 > 0) {
            arg1.field391--;
        }
        for (int var11 = 0; var11 < arg1.field325.length; var11++) {
            class257 var12 = arg1.field325[var11];
            if (var12 != null) {
                if (var12.field3196 > 0) {
                    var12.field3196--;
                } else {
                    class320 var13 = class609.field8754.method535(var12.field3194, true);
                    if (var13 == null || var13.field4431 == null) {
                        arg1.field325[var11] = null;
                    } else {
                        var12.field3186++;
                        if (var12.field3187 < var13.field4431.length && var13.field4432[var12.field3187] < var12.field3186) {
                            var12.field3186 = 1;
                            var12.field3187++;
                            class627.method3629(arg1.field6368, class147.field1899 == arg1, var13, var12.field3187, arg1.field6358, (byte) -104, arg1.field6362);
                        }
                        if (var13.field4431.length <= var12.field3187) {
                            var12.field3192++;
                            var12.field3187 -= var13.field4421;
                            if (var12.field3192 >= var13.field4407) {
                                arg1.field325[var11] = null;
                            } else if (var12.field3187 >= 0 && var13.field4431.length > var12.field3187) {
                                class627.method3629(arg1.field6368, class147.field1899 == arg1, var13, var12.field3187, arg1.field6358, (byte) -109, arg1.field6362);
                            } else {
                                arg1.field325[var11] = null;
                            }
                        }
                        var12.field3188 = var12.field3187 + 1;
                        if (var13.field4431.length <= var12.field3188) {
                            var12.field3188 -= var13.field4421;
                            if ((var12.field3192 + 1) >= var13.field4407) {
                                var12.field3188 = -1;
                            } else if (var12.field3188 < 0 || var12.field3188 >= var13.field4431.length) {
                                var12.field3188 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static final void method794(byte arg0) {
        field1891++;
        for (int var1 = 0; var1 < 100; var1++) {
            class99.field1326[var1] = true;
        }
        if (arg0 < 119) {
            field1885 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Lig;")
    public final synchronized class295 method795(int arg0) {
        field1887++;
        class295 var2 = (class295) this.field1883.field1483.method323((long) this.field1890, -19814);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -1) {
            this.field1883 = null;
        }
        class295 var3 = class295.method1806(this.field1883.field1479, this.field1890, 0);
        if (var3 != null) {
            this.field1883.field1483.method316((long) this.field1890, (byte) -114, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lge;Z)V")
    public final void method796(class551 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field1886++;
        while (true) {
            int var3 = arg0.method3045(-125);
            if (var3 == 0) {
                return;
            }
            this.method797(3, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILge;I)V")
    private final void method797(int arg0, class551 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1890 = arg1.method3090(arg0 ^ 0xFFFFFFBB);
        } else if (arg2 == 2) {
            this.field1881 = arg1.method3045(-126);
            this.field1882 = arg1.method3045(-125);
        }
        if (arg0 != 3) {
            method793(18, null);
        }
        field1884++;
    }
}
