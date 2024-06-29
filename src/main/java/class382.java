import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class382 {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    private int field5213 = 0;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    private int field5212 = -1;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lwl;")
    private class280 field5210 = new class280();

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Z")
    public boolean field5222 = false;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    private int field5216;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    private int field5215;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[Lmu;")
    private class195[] field5219;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[[I")
    private int[][] field5220;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5209 = 0;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I")
    public final int[] method2263(int arg0, int arg1) {
        if (arg0 != -29596) {
            this.method2264(-106);
        }
        field5211++;
        if (this.field5216 == this.field5215) {
            this.field5222 = this.field5219[arg1] == null;
            this.field5219[arg1] = class431.field5896;
            return this.field5220[arg1];
        } else if (this.field5216 == 1) {
            this.field5222 = this.field5212 != arg1;
            this.field5212 = arg1;
            return this.field5220[0];
        } else {
            class195 var3 = this.field5219[arg1];
            if (var3 == null) {
                this.field5222 = true;
                if (this.field5213 < this.field5216) {
                    var3 = new class195(arg1, this.field5213);
                    this.field5213++;
                } else {
                    class195 var4 = (class195) this.field5210.method1673(arg0 + 29721);
                    var3 = new class195(arg1, var4.field2718);
                    this.field5219[var4.field2717] = null;
                    var4.method300(false);
                }
                this.field5219[arg1] = var3;
            } else {
                this.field5222 = false;
            }
            this.field5210.method1659((byte) 112, var3);
            return this.field5220[var3.field2718];
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)[[I")
    public final int[][] method2264(int arg0) {
        field5214++;
        if (this.field5216 != this.field5215) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field5216; var2++) {
            this.field5219[var2] = class431.field5896;
        }
        return this.field5220;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static final void method2265(int arg0) {
        if (arg0 != -26505) {
            return;
        }
        field5218++;
        class236 var1 = class496.field6882;
        synchronized (class496.field6882) {
            class496.field6882.method1458((byte) -116);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILit;)V")
    public static final void method2266(int arg0, class455 arg1) {
        arg1.field6212 = false;
        field5221++;
        if (arg1.field6172 != -1) {
            class5 var2 = class423.field5791.method1601(arg1.field6172, (byte) -119);
            if (var2 == null || var2.field129 == null) {
                arg1.field6217 = false;
                arg1.field6172 = -1;
            } else {
                label398: {
                    arg1.field6219++;
                    if (var2.field129.length > arg1.field6166 && var2.field127[arg1.field6166] < arg1.field6219) {
                        arg1.field6219 = 1;
                        arg1.field6166++;
                        arg1.field6251++;
                        class291.method1711(var2, arg1.field6166, arg1.field574, -92, arg1.field573, arg1.field584, class385.field5232 == arg1);
                    }
                    if (var2.field129.length <= arg1.field6166) {
                        arg1.field6219 = 0;
                        arg1.field6166 = 0;
                        if (arg1.field6217) {
                            arg1.field6172 = arg1.method2600(arg0 ^ 0xFFFFFFA8).method190(false);
                            if (arg1.field6172 == -1) {
                                arg1.field6217 = false;
                                break label398;
                            }
                            var2 = class423.field5791.method1601(arg1.field6172, (byte) -124);
                        }
                        class291.method1711(var2, arg1.field6166, arg1.field574, -37, arg1.field573, arg1.field584, class385.field5232 == arg1);
                    }
                    arg1.field6251 = arg1.field6166 + 1;
                    if (var2.field129.length <= arg1.field6251) {
                        arg1.field6251 = 0;
                    }
                }
            }
        }
        if (arg1.field6163 != -1 && class31.field516 >= arg1.field6209) {
            class155 var3 = class441.field6049.method725(14896, arg1.field6163);
            int var4 = var3.field2271;
            if (var4 == -1) {
                arg1.field6163 = -1;
            } else {
                label400: {
                    class5 var5 = class423.field5791.method1601(var4, (byte) -113);
                    if (var3.field2264) {
                        if (var5.field128 == 3) {
                            if (arg1.field6259 > 0 && class31.field516 >= arg1.field6179 && class31.field516 > arg1.field6171) {
                                arg1.field6163 = -1;
                                break label400;
                            }
                        } else if (var5.field128 == 1 && arg1.field6259 > 0 && arg1.field6179 <= class31.field516 && class31.field516 > arg1.field6171) {
                            arg1.field6209 = class31.field516 + 1;
                            break label400;
                        }
                    }
                    if (var5 == null || var5.field129 == null) {
                        arg1.field6163 = -1;
                    } else {
                        if (arg1.field6246 < 0) {
                            arg1.field6246 = 0;
                            class291.method1711(var5, 0, arg1.field574, -101, arg1.field573, arg1.field584, class385.field5232 == arg1);
                        }
                        arg1.field6201++;
                        if (var5.field129.length > arg1.field6246 && var5.field127[arg1.field6246] < arg1.field6201) {
                            arg1.field6246++;
                            arg1.field6201 = 1;
                            class291.method1711(var5, arg1.field6246, arg1.field574, -73, arg1.field573, arg1.field584, class385.field5232 == arg1);
                        }
                        if (arg1.field6246 >= var5.field129.length) {
                            if (var3.field2264) {
                                arg1.field6246 -= var5.field125;
                                arg1.field6164++;
                                if (arg1.field6164 >= var5.field122) {
                                    arg1.field6163 = -1;
                                } else if (arg1.field6246 >= 0 && arg1.field6246 < var5.field129.length) {
                                    class291.method1711(var5, arg1.field6246, arg1.field574, -106, arg1.field573, arg1.field584, class385.field5232 == arg1);
                                } else {
                                    arg1.field6163 = -1;
                                }
                            } else {
                                arg1.field6163 = -1;
                            }
                        }
                        arg1.field6252 = arg1.field6246 + 1;
                        if (arg1.field6252 >= var5.field129.length) {
                            if (var3.field2264) {
                                arg1.field6252 -= var5.field125;
                                if (var5.field122 <= (arg1.field6164 + 1)) {
                                    arg1.field6252 = -1;
                                } else if (arg1.field6252 < 0 || var5.field129.length <= arg1.field6252) {
                                    arg1.field6252 = -1;
                                }
                            } else {
                                arg1.field6252 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field6238 != -1 && arg1.field6213 <= class31.field516) {
            class155 var6 = class441.field6049.method725(14896, arg1.field6238);
            int var7 = var6.field2271;
            if (var7 == -1) {
                arg1.field6238 = -1;
            } else {
                label404: {
                    class5 var8 = class423.field5791.method1601(var7, (byte) -122);
                    if (var6.field2264) {
                        if (var8.field128 == 3) {
                            if (arg1.field6259 > 0 && class31.field516 >= arg1.field6179 && class31.field516 > arg1.field6171) {
                                arg1.field6238 = -1;
                                break label404;
                            }
                        } else if (var8.field128 == 1 && arg1.field6259 > 0 && arg1.field6179 <= class31.field516 && arg1.field6171 < class31.field516) {
                            arg1.field6213 = class31.field516 + 1;
                            break label404;
                        }
                    }
                    if (var8 == null || var8.field129 == null) {
                        arg1.field6238 = -1;
                    } else {
                        if (arg1.field6173 < 0) {
                            arg1.field6173 = 0;
                            class291.method1711(var8, 0, arg1.field574, -61, arg1.field573, arg1.field584, class385.field5232 == arg1);
                        }
                        arg1.field6194++;
                        if (arg1.field6173 < var8.field129.length && arg1.field6194 > var8.field127[arg1.field6173]) {
                            arg1.field6194 = 1;
                            arg1.field6173++;
                            class291.method1711(var8, arg1.field6173, arg1.field574, -36, arg1.field573, arg1.field584, class385.field5232 == arg1);
                        }
                        if (var8.field129.length <= arg1.field6173) {
                            if (var6.field2264) {
                                arg1.field6173 -= var8.field125;
                                arg1.field6230++;
                                if (arg1.field6230 >= var8.field122) {
                                    arg1.field6238 = -1;
                                } else if (arg1.field6173 >= 0 && var8.field129.length > arg1.field6173) {
                                    class291.method1711(var8, arg1.field6173, arg1.field574, arg0 ^ 0x26, arg1.field573, arg1.field584, class385.field5232 == arg1);
                                } else {
                                    arg1.field6238 = -1;
                                }
                            } else {
                                arg1.field6238 = -1;
                            }
                        }
                        arg1.field6224 = arg1.field6173 + 1;
                        if (arg1.field6224 >= var8.field129.length) {
                            if (var6.field2264) {
                                arg1.field6224 -= var8.field125;
                                if ((arg1.field6230 + 1) >= var8.field122) {
                                    arg1.field6224 = -1;
                                } else if (arg1.field6224 < 0 || var8.field129.length <= arg1.field6224) {
                                    arg1.field6224 = -1;
                                }
                            } else {
                                arg1.field6224 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field6185 != -1 && arg1.field6248 <= 1) {
            class5 var9 = class423.field5791.method1601(arg1.field6185, (byte) -120);
            if (var9.field128 == 3) {
                if (arg1.field6259 > 0 && arg1.field6179 <= class31.field516 && arg1.field6171 < class31.field516) {
                    arg1.field6185 = -1;
                }
            } else if (var9.field128 == 1 && arg1.field6259 > 0 && arg1.field6179 <= class31.field516 && class31.field516 > arg1.field6171) {
                arg1.field6248 = 2;
            }
        }
        if (arg1.field6185 != arg0 && arg1.field6248 == 0) {
            class5 var10 = class423.field5791.method1601(arg1.field6185, (byte) -118);
            if (var10 == null || var10.field129 == null) {
                arg1.field6185 = -1;
            } else {
                arg1.field6175++;
                if (arg1.field6204 < var10.field129.length && arg1.field6175 > var10.field127[arg1.field6204]) {
                    arg1.field6175 = 1;
                    arg1.field6204++;
                    class291.method1711(var10, arg1.field6204, arg1.field574, -84, arg1.field573, arg1.field584, class385.field5232 == arg1);
                }
                if (var10.field129.length <= arg1.field6204) {
                    arg1.field6204 -= var10.field125;
                    arg1.field6244++;
                    if (var10.field122 <= arg1.field6244) {
                        arg1.field6185 = -1;
                    } else if (arg1.field6204 >= 0 && arg1.field6204 < var10.field129.length) {
                        class291.method1711(var10, arg1.field6204, arg1.field574, arg0 ^ 0x51, arg1.field573, arg1.field584, class385.field5232 == arg1);
                    } else {
                        arg1.field6185 = -1;
                    }
                }
                arg1.field6226 = arg1.field6204 + 1;
                if (var10.field129.length <= arg1.field6226) {
                    arg1.field6226 -= var10.field125;
                    if (var10.field122 <= arg1.field6244 + 1) {
                        arg1.field6226 = -1;
                    } else if (arg1.field6226 < 0 || var10.field129.length <= arg1.field6226) {
                        arg1.field6226 = -1;
                    }
                }
                arg1.field6212 = var10.field147;
            }
        }
        if (arg1.field6248 > 0) {
            arg1.field6248--;
        }
        for (int var11 = 0; var11 < arg1.field6237.length; var11++) {
            class250 var12 = arg1.field6237[var11];
            if (var12 != null) {
                if (var12.field3318 > 0) {
                    var12.field3318--;
                } else {
                    class5 var13 = class423.field5791.method1601(var12.field3326, (byte) -120);
                    if (var13 == null || var13.field129 == null) {
                        arg1.field6237[var11] = null;
                    } else {
                        var12.field3320++;
                        if (var13.field129.length > var12.field3315 && var13.field127[var12.field3315] < var12.field3320) {
                            var12.field3315++;
                            var12.field3320 = 1;
                            class291.method1711(var13, var12.field3315, arg1.field574, arg0 ^ 0x6E, arg1.field573, arg1.field584, class385.field5232 == arg1);
                        }
                        if (var13.field129.length <= var12.field3315) {
                            var12.field3316++;
                            var12.field3315 -= var13.field125;
                            if (var12.field3316 >= var13.field122) {
                                arg1.field6237[var11] = null;
                            } else if (var12.field3315 >= 0 && var13.field129.length > var12.field3315) {
                                class291.method1711(var13, var12.field3315, arg1.field574, arg0 - 110, arg1.field573, arg1.field584, class385.field5232 == arg1);
                            } else {
                                arg1.field6237[var11] = null;
                            }
                        }
                        var12.field3319 = var12.field3315 + 1;
                        if (var13.field129.length <= var12.field3319) {
                            var12.field3319 -= var13.field125;
                            if (var13.field122 <= var12.field3316 + 1) {
                                var12.field3319 = -1;
                            } else if (var12.field3319 < 0 || var13.field129.length <= var12.field3319) {
                                var12.field3319 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public final void method2267(int arg0) {
        field5217++;
        for (int var2 = 0; var2 < this.field5216; var2++) {
            this.field5220[var2] = null;
        }
        if (arg0 <= 112) {
            this.method2263(93, -30);
        }
        this.field5220 = null;
        this.field5219 = null;
        this.field5210.method1670((byte) -104);
        this.field5210 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2268(int arg0, int arg1, int arg2, int arg3) {
        if (class92.method667(arg0, arg1, arg2)) {
            int var4 = arg1 << class530.field7813;
            int var5 = arg2 << class530.field7813;
            return class421.method2426(var4 + 1, class141.field2049[arg0].method272(arg1, arg2) + arg3, var5 + 1) && class421.method2426(class220.field2979 + var4 - 1, class141.field2049[arg0].method272(arg1 + 1, arg2) + arg3, var5 + 1) && class421.method2426(class220.field2979 + var4 - 1, class141.field2049[arg0].method272(arg1 + 1, arg2 + 1) + arg3, class220.field2979 + var5 - 1) && class421.method2426(var4 + 1, class141.field2049[arg0].method272(arg1, arg2 + 1) + arg3, class220.field2979 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lj;III[Z)Z")
    public static final boolean method2269(class377 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class37.field582 != class141.field2049) {
            int var6 = class209.field2868[arg1].method276(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class35 var8 = class209.field2868[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method276(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method269(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method266(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(III)V")
    public class382(int arg0, int arg1, int arg2) {
        this.field5216 = arg0;
        this.field5215 = arg1;
        this.field5219 = new class195[this.field5215];
        this.field5220 = new int[this.field5216][arg2];
    }
}
