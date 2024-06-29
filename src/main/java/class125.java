import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class125 extends class192 {

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Z")
    public boolean field2232 = true;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public int field2221 = 0;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public int field2237 = 12800;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public int field2240 = -1;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public int field2242 = 12800;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public int field2245 = 0;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Loh;")
    public class258 field2228;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Loh;")
    public class258 field2241;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lmi;")
    public class12 field2244;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Loh;")
    private static class258 field2220 = class153.method1046("Close", 121);

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Loh;")
    public static class258 field2222 = field2220;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field2218 = 0;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "Loh;")
    public static class258 field2219 = class153.method1046("Benutzen", 101);

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "[I")
    public static int[] field2234 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "Loh;")
    public static class258 field2236 = class153.method1046("; version=1; path=)4; domain=", 117);

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Lvi;")
    public static class129 field2239 = null;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "Lgb;")
    public static class213 field2229;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Lgb;")
    public static class213 field2243;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Z")
    public static boolean field2227;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lva;Z)V", line = 6)
    public static final void method910(class235 arg0, boolean arg1) {
        byte[] var2 = new byte[24];
        field2233++;
        if (arg1) {
            method914(104, (int[]) null, (Object[]) null);
        }
        if (class253.field4356 != null) {
            try {
                int var3 = 0;
                class253.field4356.method290(arg1, 0L);
                class253.field4356.method289(var2, (byte) -84);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1565(24, var2, 0, 119);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z", line = 52)
    public final boolean method911(int arg0, int arg1, int arg2) {
        field2235++;
        if (this.field2242 > arg2 || arg2 > this.field2221 || arg0 < this.field2237 || this.field2245 < arg0) {
            return false;
        } else if (arg1 == -1536) {
            for (class76 var4 = (class76) this.field2244.method83(-57); var4 != null; var4 = (class76) this.field2244.method87((byte) -80)) {
                if (var4.method554(arg0, (byte) -99, arg2)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Loh;", line = 89)
    public static final class258 method912(int arg0, int arg1) {
        field2226++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class258 var2 = new class258();
        var2.field4478 = 1;
        var2.field4490 = new byte[1];
        var2.field4490[arg0] = (byte) arg1;
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 112)
    public final void method913(int arg0) {
        this.field2237 = 12800;
        this.field2242 = 12800;
        field2230++;
        this.field2221 = 0;
        this.field2245 = 0;
        class76 var2 = (class76) this.field2244.method83(-56);
        if (arg0 >= -76) {
            method914(27, (int[]) null, (Object[]) null);
        }
        while (var2 != null) {
            if (this.field2221 < var2.field1329) {
                this.field2221 = var2.field1329;
            }
            if (this.field2245 < var2.field1325) {
                this.field2245 = var2.field1325;
            }
            if (var2.field1330 < this.field2242) {
                this.field2242 = var2.field1330;
            }
            if (var2.field1321 < this.field2237) {
                this.field2237 = var2.field1321;
            }
            var2 = (class76) this.field2244.method87((byte) -80);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V", line = 171)
    public static final void method914(int arg0, int[] arg1, Object[] arg2) {
        if (arg0 <= 119) {
            field2229 = (class213) null;
        }
        field2223++;
        class60.method460(arg2, false, arg1.length - 1, 0, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Loh;Loh;IIIZ)V", line = 555)
    public class125(class258 arg0, class258 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2232 = arg5;
        this.field2228 = arg0;
        this.field2241 = arg1;
        this.field2225 = arg3;
        this.field2240 = arg4;
        this.field2224 = arg2;
        this.field2244 = new class12();
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)V", line = 187)
    public static void method915(boolean arg0) {
        field2229 = null;
        field2222 = null;
        field2239 = null;
        if (arg0) {
            method915(true);
        }
        field2219 = null;
        field2236 = null;
        field2220 = null;
        field2243 = null;
        field2234 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V", line = 211)
    public static final void method916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2231++;
        long var6 = class261.method1834(arg2, arg4, arg3);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = arg0;
            if (var6 > 0L) {
                var10 = arg1;
            }
            int[] var11 = class211.field3640;
            int var12 = (103 - arg3) * 4 * 512 + ((arg4 * 4) + 24624);
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class101 var14 = class123.method898(-935, var13);
            if (var14.field1846 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 512 + 3] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class129 var15 = null;
                if (!var14.field1817) {
                    var15 = class184.field3281[var14.field1846];
                } else if (var8 == 0) {
                    var15 = class184.field3281[var14.field1846];
                } else if (var8 == 1) {
                    var15 = class251.field4322[var14.field1846];
                } else if (var8 == 2) {
                    var15 = class168.field2844[var14.field1846];
                } else if (var8 == 3) {
                    var15 = class32.field385[var14.field1846];
                }
                if (var15 != null) {
                    int var16 = (var14.field1790 * 4 - var15.field1950) / 2;
                    int var17 = (var14.field1839 * 4 - var15.field1948) / 2;
                    var15.method378((arg4 * 4) + var16 + 48, (104 - arg3 + -var14.field1839) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class172.method1158(arg2, arg4, arg3);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = ((int) var18 & 0x7CD66) >> 14;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class101 var23 = class123.method898(-935, var22);
            if (var23.field1846 != -1) {
                class129 var27 = null;
                if (!var23.field1817) {
                    var27 = class184.field3281[var23.field1846];
                } else if (var20 == 0) {
                    var27 = class184.field3281[var23.field1846];
                } else if (var20 == 1) {
                    var27 = class251.field4322[var23.field1846];
                } else if (var20 == 2) {
                    var27 = class168.field2844[var23.field1846];
                } else if (var20 == 3) {
                    var27 = class32.field385[var23.field1846];
                }
                if (var27 != null) {
                    int var28 = (var23.field1790 * 4 - var27.field1950) / 2;
                    int var29 = (var23.field1839 * 4 - var27.field1948) / 2;
                    var27.method378(arg4 * 4 + var28 + 48, (-arg3 + 104 + -var23.field1839) * 4 + var29 + 48);
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int[] var25 = class211.field3640;
                int var26 = arg4 * 4 + ((103 - arg3) * 4 * 512) + 24624;
                if (var20 == 0 || var20 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1025] = var24;
                    var25[var26 + 512 + 2] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 513] = var24;
                    var25[var26 + 1026] = var24;
                    var25[var26 + 3 + 1536] = var24;
                }
            }
        }
        if (arg5 != 24) {
            return;
        }
        long var30 = class293.method2055(arg2, arg4, arg3);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) var30 >> 20 & 0x3;
        int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class101 var34 = class123.method898(arg5 ^ 0xFFFFFC41, var33);
        if (var34.field1846 == -1) {
            return;
        }
        class129 var35 = null;
        if (!var34.field1817) {
            var35 = class184.field3281[var34.field1846];
        } else if (var32 == 0) {
            var35 = class184.field3281[var34.field1846];
        } else if (var32 == 1) {
            var35 = class251.field4322[var34.field1846];
        } else if (var32 == 2) {
            var35 = class168.field2844[var34.field1846];
        } else if (var32 == 3) {
            var35 = class32.field385[var34.field1846];
        }
        if (var35 != null) {
            int var36 = (var34.field1790 * 4 - var35.field1950) / 2;
            int var37 = (var34.field1839 * 4 - var35.field1948) / 2;
            var35.method378(arg4 * 4 + var36 + 48, 48 - -((-arg3 + 104 + -var34.field1839) * 4) + var37);
        }
    }
}
