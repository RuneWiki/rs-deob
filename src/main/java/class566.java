import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class566 extends class513 {

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Lqr;")
    public class72 field8002;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lom;")
    public class395 field8011;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field8005 = 0;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field8001 = 4;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lvl;")
    public static class15 field8004 = new class15(6, 4);

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field8006;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public int field8007;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public int field8008;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public int field8009;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public int field8010;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method3269(int arg0) {
        if (arg0 != 4) {
            field8001 = 52;
        }
        field8004 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Luv;I)V")
    public static final void method3270(class385 arg0, int arg1) {
        if (arg0.field5249 != -1) {
            class200 var2 = class108.field1696.method1279((byte) 92, arg0.field5249);
            if (var2 == null || var2.field3040 == null) {
                arg0.field5262 = false;
                arg0.field5249 = -1;
            } else {
                label283: {
                    arg0.field5233++;
                    if (var2.field3040.length > arg0.field5293 && arg0.field5233 > var2.field3024[arg0.field5293]) {
                        arg0.field5285++;
                        arg0.field5293++;
                        arg0.field5233 = 1;
                        if (!arg0.field5229) {
                            class189.method1394(arg0, 256, var2, arg0.field5293);
                        }
                    }
                    if (arg0.field5293 >= var2.field3040.length) {
                        arg0.field5233 = 0;
                        arg0.field5293 = 0;
                        if (arg0.field5262) {
                            arg0.field5249 = arg0.method2347(16383).method3052(false);
                            if (arg0.field5249 == -1) {
                                arg0.field5262 = false;
                                break label283;
                            }
                            var2 = class108.field1696.method1279((byte) 92, arg0.field5249);
                        }
                        if (!arg0.field5229) {
                            class189.method1394(arg0, 256, var2, arg0.field5293);
                        }
                    }
                    arg0.field5285 = arg0.field5293 + 1;
                    if (var2.field3040 == null) {
                        arg0.field5262 = false;
                        arg0.field5249 = -1;
                    } else if (arg0.field5285 >= var2.field3040.length) {
                        arg0.field5285 = 0;
                    }
                }
            }
        }
        field8000++;
        for (int var3 = 0; var3 < arg0.field5234.length; var3++) {
            if (arg0.field5234[var3].field6324 != -1 && arg0.field5234[var3].field6323 <= class440.field5977) {
                class491 var9 = class707.field9727.method2143(-2, arg0.field5234[var3].field6324);
                int var10 = var9.field6695;
                if (var10 == -1) {
                    arg0.field5234[var3].field6324 = -1;
                } else {
                    class200 var11 = class108.field1696.method1279((byte) 92, var10);
                    if (var9.field6690) {
                        if (var11.field3047 == 3) {
                            if (arg0.field5305 > 0 && class440.field5977 >= arg0.field5254 && arg0.field5269 < class440.field5977) {
                                arg0.field5234[var3].field6324 = -1;
                                continue;
                            }
                        } else if (var11.field3047 == 1 && arg0.field5305 > 0 && class440.field5977 >= arg0.field5254 && class440.field5977 > arg0.field5269) {
                            arg0.field5234[var3].field6323 = class440.field5977 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field3040 == null) {
                        arg0.field5234[var3].field6324 = -1;
                    } else {
                        if (arg0.field5234[var3].field6327 < 0) {
                            arg0.field5234[var3].field6327 = 0;
                            if (!arg0.field5229) {
                                class189.method1394(arg0, 256, var11, 0);
                            }
                        }
                        arg0.field5234[var3].field6320++;
                        if (arg0.field5234[var3].field6327 < var11.field3040.length && var11.field3024[arg0.field5234[var3].field6327] < arg0.field5234[var3].field6320) {
                            arg0.field5234[var3].field6320 = 1;
                            arg0.field5234[var3].field6327++;
                            if (!arg0.field5229) {
                                class189.method1394(arg0, 256, var11, arg0.field5234[var3].field6327);
                            }
                        }
                        if (var11.field3040.length <= arg0.field5234[var3].field6327) {
                            if (var9.field6690) {
                                arg0.field5234[var3].field6327 -= var11.field3033;
                                arg0.field5234[var3].field6319++;
                                if (arg0.field5234[var3].field6319 >= var11.field3049) {
                                    arg0.field5234[var3].field6324 = -1;
                                } else if (arg0.field5234[var3].field6327 < 0 || arg0.field5234[var3].field6327 >= var11.field3040.length) {
                                    arg0.field5234[var3].field6324 = -1;
                                } else if (!arg0.field5229) {
                                    class189.method1394(arg0, arg1 + 256, var11, arg0.field5234[var3].field6327);
                                }
                            } else {
                                arg0.field5234[var3].field6324 = -1;
                            }
                        }
                        arg0.field5234[var3].field6325 = arg0.field5234[var3].field6327 + 1;
                        if (var11.field3040.length <= arg0.field5234[var3].field6325) {
                            if (var9.field6690) {
                                arg0.field5234[var3].field6325 -= var11.field3033;
                                if (arg0.field5234[var3].field6319 + 1 >= var11.field3049) {
                                    arg0.field5234[var3].field6325 = -1;
                                } else if (arg0.field5234[var3].field6325 < 0 || var11.field3040.length <= arg0.field5234[var3].field6325) {
                                    arg0.field5234[var3].field6325 = -1;
                                }
                            } else {
                                arg0.field5234[var3].field6325 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (~arg0.field5230 != arg1 && arg0.field5296 <= 1) {
            class200 var4 = class108.field1696.method1279((byte) 92, arg0.field5230);
            if (var4.field3047 == 3) {
                if (arg0.field5305 > 0 && arg0.field5254 <= class440.field5977 && arg0.field5269 < class440.field5977) {
                    arg0.field5230 = -1;
                    arg0.field5214 = null;
                }
            } else if (var4.field3047 == 1 && arg0.field5305 > 0 && class440.field5977 >= arg0.field5254 && class440.field5977 > arg0.field5269) {
                arg0.field5296 = 2;
            }
        }
        if (arg0.field5230 != -1 && arg0.field5296 == 0) {
            class200 var5 = class108.field1696.method1279((byte) 92, arg0.field5230);
            if (var5 == null || var5.field3040 == null) {
                arg0.field5214 = null;
                arg0.field5230 = -1;
            } else {
                arg0.field5238++;
                if (var5.field3040.length > arg0.field5270 && var5.field3024[arg0.field5270] < arg0.field5238) {
                    arg0.field5270++;
                    arg0.field5238 = 1;
                    if (!arg0.field5229) {
                        class189.method1394(arg0, 256, var5, arg0.field5270);
                    }
                }
                if (var5.field3040.length <= arg0.field5270) {
                    arg0.field5251++;
                    arg0.field5270 -= var5.field3033;
                    if (arg0.field5251 >= var5.field3049) {
                        arg0.field5230 = -1;
                        arg0.field5214 = null;
                    } else if (arg0.field5270 < 0 || arg0.field5270 >= var5.field3040.length) {
                        arg0.field5214 = null;
                        arg0.field5230 = -1;
                    } else if (!arg0.field5229) {
                        class189.method1394(arg0, 256, var5, arg0.field5270);
                    }
                }
                arg0.field5242 = arg0.field5270 + 1;
                if (var5.field3040.length <= arg0.field5242) {
                    arg0.field5242 -= var5.field3033;
                    if (var5.field3049 <= (arg0.field5251 + 1)) {
                        arg0.field5242 = -1;
                    } else if (arg0.field5242 < 0 || arg0.field5242 >= var5.field3040.length) {
                        arg0.field5242 = -1;
                    }
                }
            }
        }
        if (arg0.field5296 > 0) {
            arg0.field5296--;
        }
        for (int var6 = 0; var6 < arg0.field5221.length; var6++) {
            class82 var7 = arg0.field5221[var6];
            if (var7 != null) {
                if (var7.field1136 > 0) {
                    var7.field1136--;
                } else {
                    class200 var8 = class108.field1696.method1279((byte) 92, var7.field1133);
                    if (var8 == null || var8.field3040 == null) {
                        arg0.field5221[var6] = null;
                    } else {
                        var7.field1134++;
                        if (var8.field3040.length > var7.field1131 && var7.field1134 > var8.field3024[var7.field1131]) {
                            var7.field1131++;
                            var7.field1134 = 1;
                            if (!arg0.field5229) {
                                class189.method1394(arg0, 256, var8, var7.field1131);
                            }
                        }
                        if (var7.field1131 >= var8.field3040.length) {
                            var7.field1138++;
                            var7.field1131 -= var8.field3033;
                            if (var8.field3049 <= var7.field1138) {
                                arg0.field5221[var6] = null;
                            } else if (var7.field1131 < 0 || var8.field3040.length <= var7.field1131) {
                                arg0.field5221[var6] = null;
                            } else if (!arg0.field5229) {
                                class189.method1394(arg0, 256, var8, var7.field1131);
                            }
                        }
                        var7.field1139 = var7.field1131 + 1;
                        if (var7.field1139 >= var8.field3040.length) {
                            var7.field1139 -= var8.field3033;
                            if (var7.field1138 + 1 >= var8.field3049) {
                                var7.field1139 = -1;
                            } else if (var7.field1139 < 0 || var8.field3040.length <= var7.field1139) {
                                var7.field1139 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lqr;Lf;)V")
    public class566(class72 arg0, class788 arg1) {
        this.field8002 = arg0;
        this.field8011 = this.field8002.method636(true);
        this.method3271(false);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public final void method3271(boolean arg0) {
        this.field8007 = this.field8002.field1054;
        this.field8008 = this.field8002.field1061;
        this.field8010 = this.field8002.field1062;
        field8003++;
        if (this.field8002.field1052 != null) {
            this.field8002.field1052.method1876(this.field8011.field5464, this.field8011.field5449, this.field8011.field5453, class464.field6310);
        }
        if (arg0) {
            this.method3271(true);
        }
        this.field8009 = class464.field6310[2];
        this.field8006 = class464.field6310[0];
    }
}
