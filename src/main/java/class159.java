import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class159 {

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "B")
    private byte field2308;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field2309;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I")
    public final int method1066(int arg0) {
        field2311++;
        if (arg0 != 0) {
            this.field2302 = -28;
        }
        return (this.field2308 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)I")
    public final int method1067(int arg0) {
        if (arg0 == 768) {
            field2305++;
            return this.field2308 & 0x7;
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqe;)V")
    public static final void method1068(class162 arg0) {
        for (int var1 = arg0.field2353; var1 <= arg0.field2362; var1++) {
            for (int var2 = arg0.field2357; var2 <= arg0.field2340; var2++) {
                class131 var3 = class16.field233[arg0.field2358][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1926; var4++) {
                        if (var3.field1908[var4] == arg0) {
                            var3.field1926--;
                            for (int var5 = var4; var5 < var3.field1926; var5++) {
                                var3.field1908[var5] = var3.field1908[var5 + 1];
                                var3.field1927[var5] = var3.field1927[var5 + 1];
                            }
                            var3.field1908[var3.field1926] = null;
                            break;
                        }
                    }
                    var3.field1932 = 0;
                    for (int var6 = 0; var6 < var3.field1926; var6++) {
                        var3.field1932 |= var3.field1927[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILve;IZ)V")
    public static final void method1069(int arg0, int arg1, int arg2, class233 arg3, int arg4, boolean arg5) {
        class70.field1098 = arg0;
        class182.field2599 = arg4;
        class43.field619 = arg2;
        class184.field2620 = 1;
        class224.field3353 = arg5;
        if (arg1 == -14698) {
            field2303++;
            class154.field2255 = arg3;
            class113.field1614 = 10000;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public static final void method1070(int arg0) {
        while (true) {
            if (class68.field1071.method519(122, class7.field140) >= 27) {
                int var1 = class68.field1071.method531((byte) 28, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class82.field1268[var1] == null) {
                        var2 = true;
                        class82.field1268[var1] = new class72();
                    }
                    class72 var3 = class82.field1268[var1];
                    class67.field1049[class51.field756++] = var1;
                    var3.field85 = class82.field1267;
                    if (var3.field1119 != null && var3.field1119.method1816((byte) 100)) {
                        class140.method933(var3, (byte) -9);
                    }
                    int var4 = class203.field2944[class68.field1071.method531((byte) -128, 3)];
                    if (var2) {
                        var3.field127 = var3.field104 = var4;
                    }
                    int var5 = class68.field1071.method531((byte) 98, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class68.field1071.method531((byte) -126, 1);
                    var3.method487((byte) -3, class14.method115(class68.field1071.method531((byte) -33, 14), (byte) -113));
                    int var7 = class68.field1071.method531((byte) 92, 1);
                    if (var7 == 1) {
                        class60.field909[class282.field4501++] = var1;
                    }
                    int var8 = class68.field1071.method531((byte) 25, 5);
                    var3.method67(var3.field1119.field4283, 17505);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field66 = var3.field1119.field4272;
                    var3.field107 = var3.field1119.field4254;
                    if (var3.field66 == 0) {
                        var3.field104 = 0;
                    }
                    var3.method65(var6 == 1, class55.field847.field50[0] + var8, var3.method57(0), (byte) 1, class55.field847.field119[0] + var5);
                    if (var3.field1119.method1816((byte) 112)) {
                        class276.method1861((class250) null, -52, (class53) null, var3.field50[0], 0, class163.field2364, var3.field119[0], var3);
                    }
                    continue;
                }
            }
            class68.field1071.method532(1730730147);
            field2313++;
            if (arg0 > -112) {
                method1070(-57);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lpa;IIIIBI)Lpa;")
    public static final class2 method1071(class2 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2312++;
        long var7 = (long) arg2;
        class2 var9 = (class2) class178.field2541.method263((byte) 116, var7);
        if (var9 == null) {
            class127 var10 = class127.method866(class26.field378, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method863(64, 768, -50, -10, -50);
            class178.field2541.method255(var7, var9, (byte) -128);
        }
        if (arg5 != 46) {
            method1070(-102);
        }
        int var11 = arg0.method28();
        int var12 = arg0.method16();
        int var13 = arg0.method13();
        int var14 = arg0.method38();
        class2 var15 = var9.method15(true, true, true);
        if (arg1 != 0) {
            var15.method19(arg1);
        }
        class215 var16 = (class215) var15;
        if (class81.method542(arg6 + var11, -1, class163.field2364, arg3 + var13) != arg4 || arg4 != class81.method542(arg6 + var12, -1, class163.field2364, arg3 + var14)) {
            for (int var17 = 0; var17 < var16.field3111; var17++) {
                var16.field3128[var17] += class81.method542(var16.field3097[var17] + arg6, -1, class163.field2364, var16.field3093[var17] + arg3) - arg4;
            }
            var16.field3105 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Z")
    public static final boolean method1072(byte arg0, int arg1) {
        field2304++;
        if (class47.field671[arg1]) {
            return true;
        } else if (class87.field1342.method1536(false, arg1)) {
            int var2 = class87.field1342.method1525(11672, arg1);
            if (var2 == 0) {
                class47.field671[arg1] = true;
                return true;
            }
            if (class19.field268[arg1] == null) {
                class19.field268[arg1] = new class267[var2];
            }
            if (arg0 != -14) {
                return false;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class19.field268[arg1][var3] == null) {
                    byte[] var4 = class87.field1342.method1538(arg1, var3, (byte) 76);
                    if (var4 != null) {
                        class267 var5 = class19.field268[arg1][var3] = new class267();
                        var5.field4113 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1786(arg0 + 13, new class114(var4));
                        } else {
                            var5.method1788(new class114(var4), false);
                        }
                    }
                }
            }
            class47.field671[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class159() {
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lkl;)V")
    public class159(class114 arg0) {
        this.field2308 = arg0.method741(3083);
        this.field2306 = arg0.method756(-29901);
        this.field2302 = arg0.method759((byte) 97);
        this.field2309 = arg0.method759((byte) 123);
        this.field2314 = arg0.method759((byte) 109);
        this.field2310 = arg0.method759((byte) 123);
    }
}
