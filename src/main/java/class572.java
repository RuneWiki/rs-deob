import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class572 {

    @OriginalMember(owner = "client!im", name = "d", descriptor = "B")
    public byte field7508;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lcs;")
    public class345 field7506;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "S")
    public short field7510;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "B")
    public byte field7512;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
    public static int[] field7507 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Lkk;")
    public static class192 field7505;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 6)
    public static void method3149(byte arg0) {
        field7505 = null;
        if (arg0 != 85) {
            method3149((byte) -56);
        }
        field7507 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLkn;)V", line = 27)
    public static final void method3150(byte arg0, class742 arg1) {
        field7511++;
        if (arg1.field10247 != -1) {
            class456 var2 = class509.field6780.method663((byte) -90, arg1.field10247);
            if (var2 == null || var2.field6229 == null) {
                arg1.field10247 = -1;
                arg1.field10304 = false;
            } else {
                label286: {
                    arg1.field10291++;
                    if (var2.field6229.length > arg1.field10261 && arg1.field10291 > var2.field6225[arg1.field10261]) {
                        arg1.field10261++;
                        arg1.field10301++;
                        arg1.field10291 = 1;
                        if (!arg1.field10252) {
                            class514.method2871(var2, arg1.field10261, arg1, true);
                        }
                    }
                    if (arg1.field10261 >= var2.field6229.length) {
                        arg1.field10291 = 0;
                        arg1.field10261 = 0;
                        if (arg1.field10304) {
                            arg1.field10247 = arg1.method4141(0).method725(false);
                            if (arg1.field10247 == -1) {
                                arg1.field10304 = false;
                                break label286;
                            }
                            var2 = class509.field6780.method663((byte) -90, arg1.field10247);
                        }
                        if (!arg1.field10252) {
                            class514.method2871(var2, arg1.field10261, arg1, true);
                        }
                    }
                    arg1.field10301 = arg1.field10261 + 1;
                    if (var2.field6229 == null) {
                        arg1.field10304 = false;
                        arg1.field10247 = -1;
                    } else if (arg1.field10301 >= var2.field6229.length) {
                        arg1.field10301 = 0;
                    }
                }
            }
        }
        for (int var3 = 0; var3 < arg1.field10254.length; var3++) {
            if (arg1.field10254[var3].field6361 != -1 && class29.field474 >= arg1.field10254[var3].field6362) {
                class94 var9 = class226.field3216.method3929(arg1.field10254[var3].field6361, -1);
                int var10 = var9.field1140;
                if (var10 == -1) {
                    arg1.field10254[var3].field6361 = -1;
                } else {
                    class456 var11 = class509.field6780.method663((byte) -90, var10);
                    if (var9.field1132) {
                        if (var11.field6219 == 3) {
                            if (arg1.field10318 > 0 && class29.field474 >= arg1.field10231 && class29.field474 > arg1.field10273) {
                                arg1.field10254[var3].field6361 = -1;
                                continue;
                            }
                        } else if (var11.field6219 == 1 && arg1.field10318 > 0 && arg1.field10231 <= class29.field474 && class29.field474 > arg1.field10273) {
                            arg1.field10254[var3].field6362 = class29.field474 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field6229 == null) {
                        arg1.field10254[var3].field6361 = -1;
                    } else {
                        if (arg1.field10254[var3].field6366 < 0) {
                            arg1.field10254[var3].field6366 = 0;
                            if (!arg1.field10252) {
                                class514.method2871(var11, 0, arg1, true);
                            }
                        }
                        arg1.field10254[var3].field6365++;
                        if (arg1.field10254[var3].field6366 < var11.field6229.length && var11.field6225[arg1.field10254[var3].field6366] < arg1.field10254[var3].field6365) {
                            arg1.field10254[var3].field6365 = 1;
                            arg1.field10254[var3].field6366++;
                            if (!arg1.field10252) {
                                class514.method2871(var11, arg1.field10254[var3].field6366, arg1, true);
                            }
                        }
                        if (var11.field6229.length <= arg1.field10254[var3].field6366) {
                            if (var9.field1132) {
                                arg1.field10254[var3].field6366 -= var11.field6242;
                                arg1.field10254[var3].field6369++;
                                if (var11.field6234 <= arg1.field10254[var3].field6369) {
                                    arg1.field10254[var3].field6361 = -1;
                                } else if (arg1.field10254[var3].field6366 < 0 || arg1.field10254[var3].field6366 >= var11.field6229.length) {
                                    arg1.field10254[var3].field6361 = -1;
                                } else if (!arg1.field10252) {
                                    class514.method2871(var11, arg1.field10254[var3].field6366, arg1, true);
                                }
                            } else {
                                arg1.field10254[var3].field6361 = -1;
                            }
                        }
                        arg1.field10254[var3].field6360 = arg1.field10254[var3].field6366 + 1;
                        if (var11.field6229.length <= arg1.field10254[var3].field6360) {
                            if (var9.field1132) {
                                arg1.field10254[var3].field6360 -= var11.field6242;
                                if (var11.field6234 <= (arg1.field10254[var3].field6369 + 1)) {
                                    arg1.field10254[var3].field6360 = -1;
                                } else if (arg1.field10254[var3].field6360 < 0 || var11.field6229.length <= arg1.field10254[var3].field6360) {
                                    arg1.field10254[var3].field6360 = -1;
                                }
                            } else {
                                arg1.field10254[var3].field6360 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 > -86) {
            field7507 = null;
        }
        if (arg1.field10257 != -1 && arg1.field10237 <= 1) {
            class456 var4 = class509.field6780.method663((byte) -90, arg1.field10257);
            if (var4.field6219 == 3) {
                if (arg1.field10318 > 0 && arg1.field10231 <= class29.field474 && class29.field474 > arg1.field10273) {
                    arg1.field10227 = null;
                    arg1.field10257 = -1;
                }
            } else if (var4.field6219 == 1 && arg1.field10318 > 0 && class29.field474 >= arg1.field10231 && arg1.field10273 < class29.field474) {
                arg1.field10237 = 2;
            }
        }
        if (arg1.field10257 != -1 && arg1.field10237 == 0) {
            class456 var5 = class509.field6780.method663((byte) -90, arg1.field10257);
            if (var5 == null || var5.field6229 == null) {
                arg1.field10227 = null;
                arg1.field10257 = -1;
            } else {
                arg1.field10279++;
                if (arg1.field10233 < var5.field6229.length && var5.field6225[arg1.field10233] < arg1.field10279) {
                    arg1.field10279 = 1;
                    arg1.field10233++;
                    if (!arg1.field10252) {
                        class514.method2871(var5, arg1.field10233, arg1, true);
                    }
                }
                if (arg1.field10233 >= var5.field6229.length) {
                    arg1.field10232++;
                    arg1.field10233 -= var5.field6242;
                    if (arg1.field10232 >= var5.field6234) {
                        arg1.field10227 = null;
                        arg1.field10257 = -1;
                    } else if (arg1.field10233 < 0 || var5.field6229.length <= arg1.field10233) {
                        arg1.field10257 = -1;
                        arg1.field10227 = null;
                    } else if (!arg1.field10252) {
                        class514.method2871(var5, arg1.field10233, arg1, true);
                    }
                }
                arg1.field10220 = arg1.field10233 + 1;
                if (var5.field6229.length <= arg1.field10220) {
                    arg1.field10220 -= var5.field6242;
                    if (var5.field6234 <= arg1.field10232 + 1) {
                        arg1.field10220 = -1;
                    } else if (arg1.field10220 < 0 || arg1.field10220 >= var5.field6229.length) {
                        arg1.field10220 = -1;
                    }
                }
            }
        }
        if (arg1.field10237 > 0) {
            arg1.field10237--;
        }
        for (int var6 = 0; var6 < arg1.field10276.length; var6++) {
            class458 var7 = arg1.field10276[var6];
            if (var7 != null) {
                if (var7.field6259 > 0) {
                    var7.field6259--;
                } else {
                    class456 var8 = class509.field6780.method663((byte) -90, var7.field6262);
                    if (var8 == null || var8.field6229 == null) {
                        arg1.field10276[var6] = null;
                    } else {
                        var7.field6256++;
                        if (var8.field6229.length > var7.field6257 && var7.field6256 > var8.field6225[var7.field6257]) {
                            var7.field6256 = 1;
                            var7.field6257++;
                            if (!arg1.field10252) {
                                class514.method2871(var8, var7.field6257, arg1, true);
                            }
                        }
                        if (var8.field6229.length <= var7.field6257) {
                            var7.field6257 -= var8.field6242;
                            var7.field6260++;
                            if (var7.field6260 >= var8.field6234) {
                                arg1.field10276[var6] = null;
                            } else if (var7.field6257 < 0 || var8.field6229.length <= var7.field6257) {
                                arg1.field10276[var6] = null;
                            } else if (!arg1.field10252) {
                                class514.method2871(var8, var7.field6257, arg1, true);
                            }
                        }
                        var7.field6261 = var7.field6257 + 1;
                        if (var8.field6229.length <= var7.field6261) {
                            var7.field6261 -= var8.field6242;
                            if (var8.field6234 <= (var7.field6260 + 1)) {
                                var7.field6261 = -1;
                            } else if (var7.field6261 < 0 || var8.field6229.length <= var7.field6261) {
                                var7.field6261 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lcs;III)V", line = 393)
    public class572(class345 arg0, int arg1, int arg2, int arg3) {
        this.field7508 = (byte) arg3;
        this.field7506 = arg0;
        this.field7510 = (short) arg1;
        this.field7512 = (byte) arg2;
    }
}
