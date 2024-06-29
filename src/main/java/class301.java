import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class301 {

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lli;B)V", line = 3)
    public static final void method2001(class449 arg0, byte arg1) {
        if (arg0.field6383 != -1) {
            class129 var2 = class203.field2975.method1931((byte) -81, arg0.field6383);
            if (var2 == null || var2.field1684 == null) {
                arg0.field6383 = -1;
                arg0.field6358 = false;
            } else {
                label286: {
                    arg0.field6417++;
                    if (var2.field1684.length > arg0.field6418 && var2.field1668[arg0.field6418] < arg0.field6417) {
                        arg0.field6418++;
                        arg0.field6378++;
                        arg0.field6417 = 1;
                        if (!arg0.field6430) {
                            class524.method3048((byte) 17, arg0.field6418, arg0, var2);
                        }
                    }
                    if (arg0.field6418 >= var2.field1684.length) {
                        arg0.field6418 = 0;
                        arg0.field6417 = 0;
                        if (arg0.field6358) {
                            arg0.field6383 = arg0.method2708(123).method3501(-89);
                            if (arg0.field6383 == -1) {
                                arg0.field6358 = false;
                                break label286;
                            }
                            var2 = class203.field2975.method1931((byte) -81, arg0.field6383);
                        }
                        if (!arg0.field6430) {
                            class524.method3048((byte) 17, arg0.field6418, arg0, var2);
                        }
                    }
                    arg0.field6378 = arg0.field6418 + 1;
                    if (var2.field1684 == null) {
                        arg0.field6358 = false;
                        arg0.field6383 = -1;
                    } else if (arg0.field6378 >= var2.field1684.length) {
                        arg0.field6378 = 0;
                    }
                }
            }
        }
        field4520++;
        if (arg1 >= -113) {
            method2001(null, (byte) -10);
        }
        for (int var3 = 0; var3 < arg0.field6434.length; var3++) {
            if (arg0.field6434[var3].field5987 != -1 && arg0.field6434[var3].field5991 <= class673.field9441) {
                class55 var9 = class87.field1131.method1548(64, arg0.field6434[var3].field5987);
                int var10 = var9.field753;
                if (var10 == -1) {
                    arg0.field6434[var3].field5987 = -1;
                } else {
                    class129 var11 = class203.field2975.method1931((byte) -81, var10);
                    if (var9.field761) {
                        if (var11.field1685 == 3) {
                            if (arg0.field6442 > 0 && class673.field9441 >= arg0.field6391 && arg0.field6346 < class673.field9441) {
                                arg0.field6434[var3].field5987 = -1;
                                continue;
                            }
                        } else if (var11.field1685 == 1 && arg0.field6442 > 0 && class673.field9441 >= arg0.field6391 && arg0.field6346 < class673.field9441) {
                            arg0.field6434[var3].field5991 = class673.field9441 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field1684 == null) {
                        arg0.field6434[var3].field5987 = -1;
                    } else {
                        if (arg0.field6434[var3].field5998 < 0) {
                            arg0.field6434[var3].field5998 = 0;
                            if (!arg0.field6430) {
                                class524.method3048((byte) 17, 0, arg0, var11);
                            }
                        }
                        arg0.field6434[var3].field5992++;
                        if (var11.field1684.length > arg0.field6434[var3].field5998 && arg0.field6434[var3].field5992 > var11.field1668[arg0.field6434[var3].field5998]) {
                            arg0.field6434[var3].field5992 = 1;
                            arg0.field6434[var3].field5998++;
                            if (!arg0.field6430) {
                                class524.method3048((byte) 17, arg0.field6434[var3].field5998, arg0, var11);
                            }
                        }
                        if (var11.field1684.length <= arg0.field6434[var3].field5998) {
                            if (var9.field761) {
                                arg0.field6434[var3].field5998 -= var11.field1692;
                                arg0.field6434[var3].field5993++;
                                if (arg0.field6434[var3].field5993 >= var11.field1688) {
                                    arg0.field6434[var3].field5987 = -1;
                                } else if (arg0.field6434[var3].field5998 < 0 || arg0.field6434[var3].field5998 >= var11.field1684.length) {
                                    arg0.field6434[var3].field5987 = -1;
                                } else if (!arg0.field6430) {
                                    class524.method3048((byte) 17, arg0.field6434[var3].field5998, arg0, var11);
                                }
                            } else {
                                arg0.field6434[var3].field5987 = -1;
                            }
                        }
                        arg0.field6434[var3].field5994 = arg0.field6434[var3].field5998 + 1;
                        if (arg0.field6434[var3].field5994 >= var11.field1684.length) {
                            if (var9.field761) {
                                arg0.field6434[var3].field5994 -= var11.field1692;
                                if (var11.field1688 <= arg0.field6434[var3].field5993 + 1) {
                                    arg0.field6434[var3].field5994 = -1;
                                } else if (arg0.field6434[var3].field5994 < 0 || var11.field1684.length <= arg0.field6434[var3].field5994) {
                                    arg0.field6434[var3].field5994 = -1;
                                }
                            } else {
                                arg0.field6434[var3].field5994 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field6404 != -1 && arg0.field6354 <= 1) {
            class129 var4 = class203.field2975.method1931((byte) -81, arg0.field6404);
            if (var4.field1685 == 3) {
                if (arg0.field6442 > 0 && class673.field9441 >= arg0.field6391 && arg0.field6346 < class673.field9441) {
                    arg0.field6404 = -1;
                    arg0.field6393 = null;
                }
            } else if (var4.field1685 == 1 && arg0.field6442 > 0 && arg0.field6391 <= class673.field9441 && class673.field9441 > arg0.field6346) {
                arg0.field6354 = 2;
            }
        }
        if (arg0.field6404 != -1 && arg0.field6354 == 0) {
            class129 var5 = class203.field2975.method1931((byte) -81, arg0.field6404);
            if (var5 == null || var5.field1684 == null) {
                arg0.field6393 = null;
                arg0.field6404 = -1;
            } else {
                arg0.field6350++;
                if (var5.field1684.length > arg0.field6409 && arg0.field6350 > var5.field1668[arg0.field6409]) {
                    arg0.field6350 = 1;
                    arg0.field6409++;
                    if (!arg0.field6430) {
                        class524.method3048((byte) 17, arg0.field6409, arg0, var5);
                    }
                }
                if (arg0.field6409 >= var5.field1684.length) {
                    arg0.field6409 -= var5.field1692;
                    arg0.field6371++;
                    if (arg0.field6371 >= var5.field1688) {
                        arg0.field6393 = null;
                        arg0.field6404 = -1;
                    } else if (arg0.field6409 < 0 || var5.field1684.length <= arg0.field6409) {
                        arg0.field6393 = null;
                        arg0.field6404 = -1;
                    } else if (!arg0.field6430) {
                        class524.method3048((byte) 17, arg0.field6409, arg0, var5);
                    }
                }
                arg0.field6352 = arg0.field6409 + 1;
                if (var5.field1684.length <= arg0.field6352) {
                    arg0.field6352 -= var5.field1692;
                    if (var5.field1688 <= arg0.field6371 + 1) {
                        arg0.field6352 = -1;
                    } else if (arg0.field6352 < 0 || arg0.field6352 >= var5.field1684.length) {
                        arg0.field6352 = -1;
                    }
                }
            }
        }
        if (arg0.field6354 > 0) {
            arg0.field6354--;
        }
        for (int var6 = 0; var6 < arg0.field6432.length; var6++) {
            class61 var7 = arg0.field6432[var6];
            if (var7 != null) {
                if (var7.field834 > 0) {
                    var7.field834--;
                } else {
                    class129 var8 = class203.field2975.method1931((byte) -81, var7.field837);
                    if (var8 == null || var8.field1684 == null) {
                        arg0.field6432[var6] = null;
                    } else {
                        var7.field833++;
                        if (var8.field1684.length > var7.field835 && var7.field833 > var8.field1668[var7.field835]) {
                            var7.field833 = 1;
                            var7.field835++;
                            if (!arg0.field6430) {
                                class524.method3048((byte) 17, var7.field835, arg0, var8);
                            }
                        }
                        if (var7.field835 >= var8.field1684.length) {
                            var7.field832++;
                            var7.field835 -= var8.field1692;
                            if (var8.field1688 <= var7.field832) {
                                arg0.field6432[var6] = null;
                            } else if (var7.field835 < 0 || var7.field835 >= var8.field1684.length) {
                                arg0.field6432[var6] = null;
                            } else if (!arg0.field6430) {
                                class524.method3048((byte) 17, var7.field835, arg0, var8);
                            }
                        }
                        var7.field836 = var7.field835 + 1;
                        if (var7.field836 >= var8.field1684.length) {
                            var7.field836 -= var8.field1692;
                            if (var8.field1688 <= (var7.field832 + 1)) {
                                var7.field836 = -1;
                            } else if (var7.field836 < 0 || var7.field836 >= var8.field1684.length) {
                                var7.field836 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
