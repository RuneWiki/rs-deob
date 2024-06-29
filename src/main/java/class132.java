import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class132 extends class154 {

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    private int field2216 = 0;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "I")
    private int field2223 = 16;

    @OriginalMember(owner = "client!ak", name = "gb", descriptor = "I")
    private int field2224 = 0;

    @OriginalMember(owner = "client!ak", name = "lb", descriptor = "I")
    private int field2229 = 2000;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
    private int field2218 = 4096;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "I")
    public static int field2222 = 7759444;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ak", name = "hb", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ak", name = "ib", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ak", name = "jb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ak", name = "kb", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ak", name = "mb", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class132() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lpe;B)Z")
    public static final boolean method942(class237 arg0, byte arg1) {
        ++field2225;
        if (~arg0.field4175 == -206) {
            class9.field156 = 250;
            return true;
        } else {
            return arg1 >= -68;
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)[Lja;")
    public static final class105[] method943(int arg0) {
        ++field2219;
        class105[] var1 = new class105[class5.field91];
        for (int var2 = 0; class5.field91 > var2; ++var2) {
            int var3 = class224.field3852[var2] * class125.field2101[var2];
            byte[] var4 = class170.field2848[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; ++var6) {
                var5[var6] = class262.field4617[class96.method626(var4[var6], 255)];
            }
            var1[var2] = new class195(class257.field4567, class126.field2118, class249.field4476[var2], class158.field2636[var2], class224.field3852[var2], class125.field2101[var2], var5);
        }
        if (arg0 <= 1) {
            field2221 = 122;
        }
        class5.method33(24094);
        return var1;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            field2221 = 77;
        }
        ++field2230;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int var4 = this.field2218 >> 1;
            int[][] var5 = super.field2574.method208(0);
            Random var6 = new Random((long) this.field2224);
            for (int var7 = 0; var7 < this.field2229; ++var7) {
                int var8 = this.field2218 <= 0 ? this.field2216 : this.field2216 - (var4 + -class46.method304(var6, this.field2218, -7486));
                int var9 = var8 >> 4 & 255;
                int var10 = class46.method304(var6, class227.field3898, arg1 ^ -1075969618);
                int var11 = class46.method304(var6, class110.field1847, arg1 + -1075970218);
                int var12 = (class111.field1854[var9] * this.field2223 >> 12) + var11;
                int var13 = (class43.field676[var9] * this.field2223 >> 12) + var10;
                int var14 = -var11 + var12;
                int var15 = -var10 + var13;
                if (var15 != 0 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var13;
                        var13 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var18;
                    }
                    if (var10 > var13) {
                        int var19 = var10;
                        var10 = var13;
                        int var20 = var11;
                        var11 = var12;
                        var13 = var19;
                        var12 = var20;
                    }
                    int var21 = -var10 + var13;
                    int var22 = -var11 + var12;
                    int var23 = var11;
                    if (~var22 > -1) {
                        var22 = -var22;
                    }
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    int var26 = ~var12 < ~var11 ? 1 : -1;
                    int var27 = 1024 - (class46.method304(var6, 4096, arg1 + -1075970218) >> 2);
                    for (int var28 = var10; ~var28 > ~var13; ++var28) {
                        var24 += var22;
                        int var29 = (-var10 + var28) * var25 + var27 + 1024;
                        int var30 = var28 & class109.field1786;
                        int var31 = class239.field4260 & var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var23 += var26;
                            var24 -= var21;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 != -9) {
            this.field2223 = 104;
        }
        ++field2226;
        class77.method527((byte) -77);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method944(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++class214.field3693;
        class274.field4825 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class137.field2350; var12 < class274.field4815; ++var12) {
            class111[][] var38 = class286.field5048[var12];
            for (int var39 = class39.field633; var39 < class77.field1202; ++var39) {
                for (int var40 = class86.field1353; var40 < class125.field2093; ++var40) {
                    class111 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class181.field3036[var39 - class111.field1853 + class257.field4562][var40 - class254.field4514 + class257.field4562] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1866 = true;
                            var41.field1879 = true;
                            if (var41.field1880 > 0) {
                                var41.field1873 = true;
                            } else {
                                var41.field1873 = false;
                            }
                            ++class274.field4825;
                        } else {
                            var41.field1866 = false;
                            var41.field1879 = false;
                            var41.field1872 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1868 != null) {
                                    class79 var42 = var41.field1868;
                                    var42.field1221.method312(0, var12, var42.field1230, var42.field1234, var42.field1224);
                                    if (var42.field1235 != null) {
                                        var42.field1235.method312(0, var12, var42.field1230, var42.field1234, var42.field1224);
                                    }
                                }
                                if (var41.field1875 != null) {
                                    class273 var43 = var41.field1875;
                                    var43.field4780.method312(var43.field4777, var12, var43.field4785, var43.field4783, var43.field4775);
                                    if (var43.field4791 != null) {
                                        var43.field4791.method312(var43.field4777, var12, var43.field4785, var43.field4783, var43.field4775);
                                    }
                                }
                                if (var41.field1876 != null) {
                                    class239 var44 = var41.field1876;
                                    var44.field4251.method312(0, var12, var44.field4240, var44.field4245, var44.field4241);
                                }
                                if (var41.field1858 != null) {
                                    for (int var45 = 0; var45 < var41.field1880; ++var45) {
                                        class27 var46 = var41.field1858[var45];
                                        var46.field400.method312(var46.field394, var12, var46.field392, var46.field386, var46.field395);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class39.field635 == class218.field3754;
        for (int var14 = class137.field2350; var14 < class274.field4815; ++var14) {
            class111[][] var27 = class286.field5048[var14];
            for (int var28 = -class257.field4562; var28 <= 0; ++var28) {
                int var29 = class111.field1853 + var28;
                int var30 = class111.field1853 - var28;
                if (var29 >= class39.field633 || var30 < class77.field1202) {
                    for (int var31 = -class257.field4562; var31 <= 0; ++var31) {
                        int var32 = class254.field4514 + var31;
                        int var33 = class254.field4514 - var31;
                        if (var29 >= class39.field633) {
                            if (var32 >= class86.field1353) {
                                class111 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1866) {
                                    class40.method274(var34, true);
                                }
                            }
                            if (var33 < class125.field2093) {
                                class111 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1866) {
                                    class40.method274(var35, true);
                                }
                            }
                        }
                        if (var30 < class77.field1202) {
                            if (var32 >= class86.field1353) {
                                class111 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1866) {
                                    class40.method274(var36, true);
                                }
                            }
                            if (var33 < class125.field2093) {
                                class111 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1866) {
                                    class40.method274(var37, true);
                                }
                            }
                        }
                        if (class274.field4825 == 0) {
                            if (!var13) {
                                class160.field2672 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class137.field2350; var15 < class274.field4815; ++var15) {
            class111[][] var16 = class286.field5048[var15];
            for (int var17 = -class257.field4562; var17 <= 0; ++var17) {
                int var18 = class111.field1853 + var17;
                int var19 = class111.field1853 - var17;
                if (var18 >= class39.field633 || var19 < class77.field1202) {
                    for (int var20 = -class257.field4562; var20 <= 0; ++var20) {
                        int var21 = class254.field4514 + var20;
                        int var22 = class254.field4514 - var20;
                        if (var18 >= class39.field633) {
                            if (var21 >= class86.field1353) {
                                class111 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1866) {
                                    class40.method274(var23, false);
                                }
                            }
                            if (var22 < class125.field2093) {
                                class111 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1866) {
                                    class40.method274(var24, false);
                                }
                            }
                        }
                        if (var19 < class77.field1202) {
                            if (var21 >= class86.field1353) {
                                class111 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1866) {
                                    class40.method274(var25, false);
                                }
                            }
                            if (var22 < class125.field2093) {
                                class111 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1866) {
                                    class40.method274(var26, false);
                                }
                            }
                        }
                        if (class274.field4825 == 0) {
                            if (!var13) {
                                class160.field2672 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class160.field2672 = false;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Leg;")
    public static final class37 method945(int arg0, int arg1) {
        if (arg1 < 73) {
            method942((class237) null, (byte) -57);
        }
        ++field2228;
        return class160.field2663[arg0].method222((byte) 110) > 0 ? class156.method1061((byte) -119, new class37[] { class40.field645[arg0], class55.field835, class160.field2663[arg0] }) : class40.field645[arg0];
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Leg;II)V")
    public static final void method946(class37 arg0, int arg1, int arg2) {
        ++field2220;
        class274 var3 = class166.method1116(arg1, arg2, true);
        var3.method1835(-126);
        var3.field4812 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            this.method143(-81, -121);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field2218 = arg0.method1244(false);
                        }
                    } else {
                        this.field2216 = arg0.method1244(false);
                    }
                } else {
                    this.field2223 = arg0.method1268(255);
                }
            } else {
                this.field2229 = arg0.method1244(false);
            }
        } else {
            this.field2224 = arg0.method1268(arg1 + 14270);
        }
        ++field2215;
    }
}
