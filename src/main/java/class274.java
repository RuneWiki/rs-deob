import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class274 extends class266 {

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Ljg;")
    public class303 field4693 = new class303();

    @OriginalMember(owner = "client!w", name = "L", descriptor = "Lth;")
    public class86 field4699 = new class86();

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Lkm;")
    private class328 field4684;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Ljf;")
    public static class229 field4687 = class212.method1457((byte) 109, "Untersuchen");

    @OriginalMember(owner = "client!w", name = "K", descriptor = "[I")
    public static int[] field4698 = new int[1000];

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Ljf;")
    public static class229 field4697 = class212.method1457((byte) 101, "showVideoAd");

    @OriginalMember(owner = "client!w", name = "G", descriptor = "Ljf;")
    public static class229 field4694 = class212.method1457((byte) 97, "blinken1:");

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Lek;")
    public static class185 field4691;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljf;ILjf;Ljf;II)V", line = 4)
    public static final void method1917(class229 arg0, int arg1, class229 arg2, class229 arg3, int arg4, int arg5) {
        field4682++;
        for (int var6 = 99; var6 > 0; var6--) {
            class319.field5396[var6] = class319.field5396[var6 - 1];
            class27.field490[var6] = class27.field490[var6 - 1];
            class243.field4291[var6] = class243.field4291[var6 - 1];
            class287.field4917[var6] = class287.field4917[var6 - 1];
            class150.field2579[var6] = class150.field2579[var6 - 1];
        }
        if (arg5 >= -103) {
            method1923((byte) -114);
        }
        class27.field490[0] = arg2;
        class243.field4291[0] = arg3;
        class34.field652++;
        class174.field3041 = class6.field70;
        class319.field5396[0] = arg4;
        class287.field4917[0] = arg0;
        class150.field2579[0] = arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILnf;IIIIII)V", line = 35)
    public static final void method1918(int arg0, class67 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class29.field512) {
            class270.field4632 = 32;
        } else {
            class270.field4632 = 0;
        }
        class29.field512 = false;
        if (class235.field4062 != 0) {
            if (arg6 >= arg4 && arg4 + 16 > arg6 && arg3 <= arg7 && arg7 < arg3 + 16) {
                arg1.field1167 -= 4;
                class194.method1328((byte) -106, arg1);
            } else if (arg4 <= arg6 && arg4 + 16 > arg6 && arg3 + arg5 - 16 <= arg7 && arg7 < (arg3 + arg5)) {
                arg1.field1167 += 4;
                class194.method1328((byte) -73, arg1);
            } else if (arg4 - class270.field4632 <= arg6 && arg6 < (arg4 + class270.field4632 + 16) && arg7 >= arg3 + 16 && (arg3 + arg5 - 16) > arg7) {
                int var8 = (arg5 - 32) * arg5 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - var8 - 32;
                int var10 = arg7 - arg3 - (var8 / 2) - 16;
                arg1.field1167 = (arg2 - arg5) * var10 / var9;
                class194.method1328((byte) -96, arg1);
                class29.field512 = true;
            }
        }
        if (class34.field654 != 0) {
            int var11 = arg1.field1258;
            if (arg6 >= arg4 - var11 && arg7 >= arg3 && arg4 + 16 > arg6 && (arg3 + arg5) >= arg7) {
                arg1.field1167 += class34.field654 * 45;
                class194.method1328((byte) -101, arg1);
            }
        }
        if (arg0 < 22) {
            field4697 = (class229) null;
        }
        field4680++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()I", line = 107)
    public final int method612() {
        field4685++;
        return 0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIILvk;[I)V", line = 116)
    private final void method1919(int arg0, int arg1, int arg2, int arg3, class172 arg4, int[] arg5) {
        field4689++;
        if ((this.field4684.field5509[arg4.field3002] & 0x4) != arg0 && arg4.field3007 < 0) {
            int var7 = this.field4684.field5548[arg4.field3002] / class22.field363;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field3003) / var7;
                if (arg3 < var8) {
                    arg4.field3003 += arg3 * var7;
                    break;
                }
                arg4.field2994.method622(arg5, arg2, var8);
                arg3 -= var8;
                arg2 += var8;
                int var9 = 262144 / var7;
                int var10 = class22.field363 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                class178 var11 = arg4.field2994;
                arg4.field3003 += var7 * var8 - 1048576;
                if (this.field4684.field5520[arg4.field3002] == 0) {
                    arg4.field2994 = class178.method1203(arg4.field2998, var11.method1218(), var11.method1212(), var11.method1206());
                } else {
                    arg4.field2994 = class178.method1203(arg4.field2998, var11.method1218(), 0, var11.method1206());
                    this.field4684.method2208(arg4, arg4.field2982.field3516[arg4.field2995] < 0, (byte) -50);
                    arg4.field2994.method1223(var10, var11.method1212());
                }
                if (arg4.field2982.field3516[arg4.field2995] < 0) {
                    arg4.field2994.method1224(-1);
                }
                var11.method1225(var10);
                var11.method622(arg5, arg2, arg1 - arg2);
                if (var11.method1234()) {
                    this.field4699.method617(var11);
                }
            }
        }
        arg4.field2994.method622(arg5, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 175)
    public final void method618(int arg0) {
        field4683++;
        this.field4699.method618(arg0);
        for (class172 var2 = (class172) this.field4693.method2078(-123); var2 != null; var2 = (class172) this.field4693.method2080(5)) {
            if (!this.field4684.method2200(var2, (byte) -101)) {
                int var3 = arg0;
                do {
                    if (var2.field3004 >= var3) {
                        this.method1924(true, var2, var3);
                        var2.field3004 -= var3;
                        break;
                    }
                    this.method1924(true, var2, var2.field3004);
                    var3 -= var2.field3004;
                } while (!this.field4684.method2233(0, var3, (int[]) null, var2, (byte) -76));
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V", line = 210)
    public static void method1920(boolean arg0) {
        field4694 = null;
        field4697 = null;
        field4687 = null;
        field4698 = null;
        if (arg0) {
            method1920(true);
        }
        field4691 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V", line = 226)
    public static final void method1921(int arg0, int arg1) {
        field4690++;
        if (!class192.method1314(arg1, 12) || arg0 != 17208) {
            return;
        }
        class67[] var2 = class23.field423[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class67 var4 = var2[var3];
            if (var4 != null) {
                var4.field1293 = 0;
                var4.field1252 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lnf;I)V", line = 265)
    public static final void method1922(class67 arg0, int arg1) {
        field4681++;
        class67 var2 = class215.method1479(arg0, (byte) 93);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class175.field3046;
            var3 = class78.field1429;
        } else {
            var3 = var2.field1295;
            var4 = var2.field1258;
        }
        class206.method1439(false, var3, arg0, -1, var4);
        class301.method2061(var4, arg1 + 18895, var3, arg0);
        if (arg1 != -18984) {
            field4697 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 294)
    public static final void method1923(byte arg0) {
        class267.field4575 = 0;
        class100.field1762 = 0;
        class230.method1656(882213409);
        class257.method1835(-27251);
        field4688++;
        class237.method1698(true);
        for (int var1 = 0; var1 < class267.field4575; var1++) {
            int var2 = field4698[var1];
            if (class199.field3475 != class331.field5637[var2].field1962) {
                if (class331.field5637[var2].field5631.method1157(true)) {
                    class155.method1039((byte) 42, class331.field5637[var2]);
                }
                class331.field5637[var2].method2256((byte) -115, (class169) null);
                class331.field5637[var2] = null;
            }
        }
        if (class51.field902 != class171.field2972.field195) {
            throw new RuntimeException("gnp1 pos:" + class171.field2972.field195 + " psize:" + class51.field902);
        }
        if (arg0 != -79) {
            field4698 = (int[]) null;
        }
        for (int var3 = 0; var3 < class126.field2238; var3++) {
            if (class331.field5637[class283.field4858[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class126.field2238);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()Lvg;", line = 345)
    public final class266 method620() {
        field4695++;
        class172 var1;
        do {
            var1 = (class172) this.field4693.method2080(5);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2994 == null);
        return var1.field2994;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([III)V", line = 368)
    public final void method622(int[] arg0, int arg1, int arg2) {
        field4686++;
        this.field4699.method622(arg0, arg1, arg2);
        for (class172 var4 = (class172) this.field4693.method2078(-113); var4 != null; var4 = (class172) this.field4693.method2080(5)) {
            if (!this.field4684.method2200(var4, (byte) -69)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3004) {
                        this.method1919(0, var5 + var6, var5, var6, var4, arg0);
                        var4.field3004 -= var6;
                        break;
                    }
                    this.method1919(0, var5 + var6, var5, var4.field3004, var4, arg0);
                    var5 += var4.field3004;
                    var6 -= var4.field3004;
                } while (!this.field4684.method2233(var5, var6, arg0, var4, (byte) -76));
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLvk;I)V", line = 411)
    private final void method1924(boolean arg0, class172 arg1, int arg2) {
        if (!arg0) {
            this.method1919(-66, -112, -45, 76, (class172) null, (int[]) null);
        }
        if ((this.field4684.field5509[arg1.field3002] & 0x4) != 0 && arg1.field3007 < 0) {
            int var4 = this.field4684.field5548[arg1.field3002] / class22.field363;
            int var5 = (var4 + 1048575 - arg1.field3003) / var4;
            arg1.field3003 = arg2 * var4 + arg1.field3003 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field4684.field5520[arg1.field3002] == 0) {
                    arg1.field2994 = class178.method1203(arg1.field2998, arg1.field2994.method1218(), arg1.field2994.method1212(), arg1.field2994.method1206());
                } else {
                    arg1.field2994 = class178.method1203(arg1.field2998, arg1.field2994.method1218(), 0, arg1.field2994.method1206());
                    this.field4684.method2208(arg1, arg1.field2982.field3516[arg1.field2995] < 0, (byte) -124);
                }
                if (arg1.field2982.field3516[arg1.field2995] < 0) {
                    arg1.field2994.method1224(-1);
                }
                arg2 = arg1.field3003 / var4;
            }
        }
        field4692++;
        arg1.field2994.method618(arg2);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Lvg;", line = 463)
    public final class266 method611() {
        field4696++;
        class172 var1 = (class172) this.field4693.method2078(-117);
        if (var1 == null) {
            return null;
        } else if (var1.field2994 == null) {
            return this.method620();
        } else {
            return var1.field2994;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lkm;)V", line = 492)
    public class274(class328 arg0) {
        this.field4684 = arg0;
    }
}
