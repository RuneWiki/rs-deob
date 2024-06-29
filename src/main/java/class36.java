import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class36 extends class11 {

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Lcf;")
    public class92 field385 = new class92();

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Lab;")
    public class400 field394 = new class400();

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "Lvg;")
    private class431 field383;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field388 = 104;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "Lnl;")
    public static class435 field389;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "Lnl;")
    public static class435 field391;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "[[[Lwr;")
    public static class52[][][] field393;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()I")
    public final int method54() {
        field382++;
        return 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([III)V")
    public final void method56(int[] arg0, int arg1, int arg2) {
        field392++;
        this.field394.method56(arg0, arg1, arg2);
        for (class477 var4 = (class477) this.field385.method775(1); var4 != null; var4 = (class477) this.field385.method763(0)) {
            if (!this.field383.method2602(-71, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field6783 >= var5) {
                        this.method219(var4, var6 + var5, false, arg0, var6, var5);
                        var4.field6783 -= var5;
                        break;
                    }
                    this.method219(var4, var6 + var5, false, arg0, var6, var4.field6783);
                    var6 += var4.field6783;
                    var5 -= var4.field6783;
                } while (!this.field383.method2608(arg0, (byte) 94, var5, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method216(byte arg0) {
        field391 = null;
        if (arg0 < 62) {
            method216((byte) -52);
        }
        field393 = null;
        field389 = null;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)I")
    public static final int method217(int arg0) {
        field380++;
        if (arg0 < 26) {
            method218(-49, (byte[][][]) null, 9, (byte) -82, 99, -46);
        }
        return ((class339.field4687 == 0 ? 0 : 1) << 22) + (class443.field6300 << 17) + ((class273.field3964 ? 1 : 0) << 15) + ((class62.field913 ? 1 : 0) << 13) + ((class130.field1777 ? 1 : 0) << 9) + (((class169.field2453 ? 1 : 0) << 6) + ((class362.field4981 ? 1 : 0) << 4) + ((class102.field1431 ? 1 : 0) << 3) + (class172.field2621 & 0x7) - (-((class181.field2743 ? 1 : 0) << 5) + -((class199.field2951 ? 1 : 0) << 8) + -((class228.field3281 ? 1 : 0) << 10)) - -(class99.field1396 & 0x3 << 11)) + (((class300.field4246 ? 1 : 0) << 16) - -((class55.field817 ? 1 : 0) << 19) + (((class193.field2870 == 0 ? 0 : 1) << 20) - -((class409.field5605 == 0 ? 0 : 1) << 21) - -(class267.method1803(93) << 23)) - (-(class491.field6931 << 25) + -((class89.field1269 ? 1 : 0) << 27) + -(class211.field3082 << 28)));
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method218(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class196.field2912++;
        class466.field6563 = 0;
        for (int var6 = class350.field4832; var6 < class310.field4398; var6++) {
            class52[][] var17 = class385.field5285[var6];
            for (int var18 = class316.field4461; var18 < class106.field1497; var18++) {
                for (int var19 = client.field877; var19 < class380.field5224; var19++) {
                    class52 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class154.field2129[var18 + class4.field30 - class409.field5607][var19 + class4.field30 - class54.field811] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field769 = true;
                            var20.field750 = true;
                            if (var20.field763 == null) {
                                var20.field764 = false;
                            } else {
                                var20.field764 = true;
                            }
                            class466.field6563++;
                        } else {
                            var20.field769 = false;
                            var20.field750 = false;
                            var20.field751 = 0;
                            if (var18 >= class409.field5607 - 16 && var18 <= class409.field5607 + 16 && var19 >= class54.field811 - 16 && var19 <= class54.field811 + 16 && (var20.field772 != null || var20.field752 != null || var20.field755 != null || var20.field756 != null || var20.field758 != null || var20.field763 != null)) {
                                class291.field4124.method131(var20, (byte) 90);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class427.field5960 == class340.field4692;
        for (int var8 = class350.field4832; var8 < class310.field4398; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class340.field4702.method452() && var8 >= arg2 && arg1 != null) {
                int var10 = class154.field2129.length;
                if (class154.field2129.length + class316.field4461 > class310.field4401) {
                    var10 -= class154.field2129.length + class316.field4461 - class310.field4401;
                }
                int var11 = class154.field2129[0].length;
                if (class154.field2129[0].length + client.field877 > class97.field1374) {
                    var11 -= class154.field2129[0].length + client.field877 - class97.field1374;
                }
                int var12 = class68.field995;
                while (true) {
                    if (var12 >= var10) {
                        class291.field4124.method141(var9, var8, true, class340.field4692[var8], (byte) 63);
                        break;
                    }
                    int var13 = class316.field4461 + var12 - class68.field995;
                    for (int var14 = class208.field3051; var14 < var11; var14++) {
                        class399.field5480[var12][var14] = false;
                        if (class154.field2129[var12][var14]) {
                            int var15 = client.field877 + var14 - class208.field3051;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class385.field5285[var16][var13][var15] != null && class385.field5285[var16][var13][var15].field749 == var8) {
                                    class399.field5480[var12][var14] = class385.field5285[var16][var13][var15].field769;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class291.field4124.method141(var9, var8, false, class340.field4692[var8], (byte) 63);
            }
            class291.field4124.method136(-23413);
        }
        if (!class198.method1372(true)) {
            class198.method1372(false);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lio;IZ[III)V")
    private final void method219(class477 arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        field390++;
        if ((this.field383.field6086[arg0.field6782] & 0x4) != 0 && arg0.field6765 < 0) {
            int var7 = this.field383.field6037[arg0.field6782] / class192.field2868;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field6773) / var7;
                if (arg5 < var8) {
                    arg0.field6773 += arg5 * var7;
                    break;
                }
                arg0.field6759.method56(arg3, arg4, var8);
                arg4 += var8;
                arg5 -= var8;
                arg0.field6773 += var7 * var8 - 1048576;
                int var9 = class192.field2868 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class215 var11 = arg0.field6759;
                if (this.field383.field6048[arg0.field6782] == 0) {
                    arg0.field6759 = class215.method1458(arg0.field6767, var11.method1469(), var11.method1478(), var11.method1460());
                } else {
                    arg0.field6759 = class215.method1458(arg0.field6767, var11.method1469(), 0, var11.method1460());
                    this.field383.method2605(arg0, arg0.field6770.field5055[arg0.field6763] < 0, 98);
                    arg0.field6759.method1491(var9, var11.method1478());
                }
                if (arg0.field6770.field5055[arg0.field6763] < 0) {
                    arg0.field6759.method1483(-1);
                }
                var11.method1462(var9);
                var11.method56(arg3, arg4, arg1 - arg4);
                if (var11.method1482()) {
                    this.field394.method2407(var11);
                }
            }
        }
        if (arg2) {
            method218(77, (byte[][][]) null, 15, (byte) 117, 113, 48);
        }
        arg0.field6759.method56(arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()Loe;")
    public final class11 method53() {
        field381++;
        class477 var1 = (class477) this.field385.method775(1);
        if (var1 == null) {
            return null;
        } else if (var1.field6759 == null) {
            return this.method55();
        } else {
            return var1.field6759;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lio;BI)V")
    private final void method220(class477 arg0, byte arg1, int arg2) {
        if ((this.field383.field6086[arg0.field6782] & 0x4) != 0 && arg0.field6765 < 0) {
            int var4 = this.field383.field6037[arg0.field6782] / class192.field2868;
            int var5 = (var4 + 1048575 - arg0.field6773) / var4;
            arg0.field6773 = arg2 * var4 + arg0.field6773 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field383.field6048[arg0.field6782] == 0) {
                    arg0.field6759 = class215.method1458(arg0.field6767, arg0.field6759.method1469(), arg0.field6759.method1478(), arg0.field6759.method1460());
                } else {
                    arg0.field6759 = class215.method1458(arg0.field6767, arg0.field6759.method1469(), 0, arg0.field6759.method1460());
                    this.field383.method2605(arg0, arg0.field6770.field5055[arg0.field6763] < 0, arg1 + 185);
                }
                if (arg0.field6770.field5055[arg0.field6763] < 0) {
                    arg0.field6759.method1483(-1);
                }
                arg2 = arg0.field6773 / var4;
            }
        }
        field384++;
        if (arg1 != -87) {
            this.field383 = null;
        }
        arg0.field6759.method58(arg2);
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "()Loe;")
    public final class11 method55() {
        field386++;
        class477 var1;
        do {
            var1 = (class477) this.field385.method763(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6759 == null);
        return var1.field6759;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lvg;)V")
    public class36(class431 arg0) {
        this.field383 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public final void method58(int arg0) {
        field387++;
        this.field394.method58(arg0);
        for (class477 var2 = (class477) this.field385.method775(1); var2 != null; var2 = (class477) this.field385.method763(0)) {
            if (!this.field383.method2602(-36, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field6783 >= var3) {
                        this.method220(var2, (byte) -87, var3);
                        var2.field6783 -= var3;
                        break;
                    }
                    this.method220(var2, (byte) -87, var2.field6783);
                    var3 -= var2.field6783;
                } while (!this.field383.method2608((int[]) null, (byte) 94, var3, var2, 0));
            }
        }
    }
}
