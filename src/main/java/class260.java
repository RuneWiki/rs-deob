import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class260 extends class113 {

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Le;")
    public class86 field4522 = new class86();

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "Lqb;")
    public class11 field4539 = new class11();

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Lp;")
    private class84 field4535;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "[[B")
    public static byte[][] field4519 = new byte[50][];

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "[Lba;")
    public static class255[] field4530 = new class255[500];

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "[Lnd;")
    public static class202[] field4538 = new class202[4];

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Ljk;")
    public static class192 field4521;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Lwd;")
    public static class217 field4525;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "Ljava/awt/Font;")
    public static Font field4527;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public static final void method1747(int arg0) {
        field4528++;
        if (!class79.field1451) {
            return;
        }
        class43.field787 = null;
        class79.field1451 = false;
        class21.field438 = null;
        if (arg0 != 29489) {
            field4527 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBLak;[II)V")
    private final void method1748(int arg0, int arg1, byte arg2, class27 arg3, int[] arg4, int arg5) {
        field4529++;
        if ((this.field4535.field1566[arg3.field578] & 0x4) != 0 && arg3.field568 < 0) {
            int var7 = this.field4535.field1569[arg3.field578] / class160.field2755;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field575) / var7;
                if (arg0 < var8) {
                    arg3.field575 += arg0 * var7;
                    break;
                }
                int var9 = 262144 / var7;
                arg3.field566.method72(arg4, arg5, var8);
                arg3.field575 += var7 * var8 - 1048576;
                arg0 -= var8;
                arg5 += var8;
                class23 var10 = arg3.field566;
                int var11 = class160.field2755 / 100;
                if (var11 > var9) {
                    var11 = var9;
                }
                if (this.field4535.field1560[arg3.field578] == 0) {
                    arg3.field566 = class23.method221(arg3.field587, var10.method197(), var10.method227(), var10.method212());
                } else {
                    arg3.field566 = class23.method221(arg3.field587, var10.method197(), 0, var10.method212());
                    this.field4535.method650(arg3, arg3.field580.field3529[arg3.field567] < 0, 2);
                    arg3.field566.method196(var11, var10.method227());
                }
                if (arg3.field580.field3529[arg3.field567] < 0) {
                    arg3.field566.method208(-1);
                }
                var10.method229(var11);
                var10.method72(arg4, arg5, arg1 - arg5);
                if (var10.method226()) {
                    this.field4539.method74(var10);
                }
            }
        }
        arg3.field566.method72(arg4, arg5, arg0);
        if (arg2 < 46) {
            field4525 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Lgh;")
    public static final class106 method1749(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1244; var4++) {
            class106 var5 = var3.field1236[var4];
            if ((var5.field1905 >> 29 & 0x3L) == 2L && var5.field1913 == arg1 && var5.field1906 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static final void method1750(int arg0) {
        field4533++;
        class45.field822.method763(0);
        class209.field3473.method763(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public final void method81(int arg0) {
        field4526++;
        this.field4539.method81(arg0);
        for (class27 var2 = (class27) this.field4522.method689(1001); var2 != null; var2 = (class27) this.field4522.method688(-122)) {
            if (!this.field4535.method636(var2, -16657)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field565) {
                        this.method1754(var2, var3, (byte) -57);
                        var2.field565 -= var3;
                        break;
                    }
                    this.method1754(var2, var2.field565, (byte) -57);
                    var3 -= var2.field565;
                } while (!this.field4535.method646(var2, (int[]) null, var3, 0, 123));
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "([III)V")
    public final void method72(int[] arg0, int arg1, int arg2) {
        field4537++;
        this.field4539.method72(arg0, arg1, arg2);
        for (class27 var4 = (class27) this.field4522.method689(1001); var4 != null; var4 = (class27) this.field4522.method688(-91)) {
            if (!this.field4535.method636(var4, -16657)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field565) {
                        this.method1748(var6, var5 + var6, (byte) 101, var4, arg0, var5);
                        var4.field565 -= var6;
                        break;
                    }
                    this.method1748(var4.field565, var5 + var6, (byte) 73, var4, arg0, var5);
                    var5 += var4.field565;
                    var6 -= var4.field565;
                } while (!this.field4535.method646(var4, arg0, var6, var5, 30));
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lab;")
    public static final class191 method1751(int arg0, int arg1) {
        if (arg0 > -45) {
            return null;
        }
        field4534++;
        class191 var2 = (class191) class261.field4547.method912((long) arg1, (byte) 103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class21.field430.method190((byte) -24, arg1 & 0x7FFF, 1);
        } else {
            var3 = class231.field3866.method190((byte) -27, arg1, 1);
        }
        class191 var4 = new class191();
        if (var3 != null) {
            var4.method1291(new class217(var3), -126);
        }
        if (arg1 >= 32768) {
            var4.method1288(0);
        }
        class261.field4547.method913(var4, 114, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILij;B)V")
    public static final void method1752(int arg0, class50 arg1, byte arg2) {
        field4532++;
        class50 var3 = arg1.method370(true).method375(true);
        boolean var4 = false;
        for (int var5 = 0; var5 < class78.field1450; var5++) {
            class187 var6 = class71.field1370[class60.field1116[var5]];
            if (var6 != null && var6.field3097 != null && var6.field3097.method387(var3, true)) {
                class26.method243(class239.field4067.field3980[0], false, 0, false, 1, var6.field3978[0], var6.field3980[0], class239.field4067.field3978[0], 0, 1, 2, 0);
                if (arg0 == 1) {
                    class190.field3141.method1598((byte) -117, 36);
                    class65.field1230++;
                    class190.field3141.method1494(class60.field1116[var5], (byte) -41);
                } else if (arg0 == 4) {
                    class190.field3141.method1598((byte) -111, 113);
                    class142.field2486++;
                    class190.field3141.method1495(2, class60.field1116[var5]);
                } else if (arg0 == 6) {
                    class190.field3141.method1598((byte) -94, 41);
                    class190.field3141.method1463((byte) -119, class60.field1116[var5]);
                    class70.field1349++;
                } else if (arg0 == 7) {
                    class240.field4135++;
                    class190.field3141.method1598((byte) -90, 8);
                    class190.field3141.method1495(2, class60.field1116[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (arg2 != -33) {
            method1749(21, -79, -5);
        }
        if (!var4) {
            class54.method431(class80.method589(new class50[] { class197.field3263, var3 }, arg2 + 28776), 0, 0, class245.field4271);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()Lui;")
    public final class113 method75() {
        field4524++;
        class27 var1 = (class27) this.field4522.method689(1001);
        if (var1 == null) {
            return null;
        } else if (var1.field566 == null) {
            return this.method82();
        } else {
            return var1.field566;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()Lui;")
    public final class113 method82() {
        field4517++;
        class27 var1;
        do {
            var1 = (class27) this.field4522.method688(-95);
            if (var1 == null) {
                return null;
            }
        } while (var1.field566 == null);
        return var1.field566;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
    public static void method1753(boolean arg0) {
        field4538 = null;
        if (arg0) {
            field4519 = null;
        }
        field4527 = null;
        field4521 = null;
        field4525 = null;
        field4519 = null;
        field4530 = null;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "()I")
    public final int method71() {
        field4523++;
        return 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lak;IB)V")
    private final void method1754(class27 arg0, int arg1, byte arg2) {
        field4520++;
        if ((this.field4535.field1566[arg0.field578] & 0x4) != 0 && arg0.field568 < 0) {
            int var4 = this.field4535.field1569[arg0.field578] / class160.field2755;
            int var5 = (var4 + 1048575 - arg0.field575) / var4;
            arg0.field575 = arg1 * var4 + arg0.field575 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field4535.field1560[arg0.field578] == 0) {
                    arg0.field566 = class23.method221(arg0.field587, arg0.field566.method197(), arg0.field566.method227(), arg0.field566.method212());
                } else {
                    arg0.field566 = class23.method221(arg0.field587, arg0.field566.method197(), 0, arg0.field566.method212());
                    this.field4535.method650(arg0, arg0.field580.field3529[arg0.field567] < 0, 2);
                }
                if (arg0.field580.field3529[arg0.field567] < 0) {
                    arg0.field566.method208(-1);
                }
                arg1 = arg0.field575 / var4;
            }
        }
        arg0.field566.method81(arg1);
        if (arg2 != -57) {
            this.method82();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lda;II)[Lea;")
    public static final class67[] method1755(class22 arg0, int arg1, int arg2) {
        field4518++;
        if (class182.method1237((byte) 43, arg2, arg0)) {
            int var3 = 11 / ((-arg1 - 12) / 50);
            return class239.method1625(20479);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lp;)V")
    public class260(class84 arg0) {
        this.field4535 = arg0;
    }
}
