import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class168 extends class304 {

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Lpk;")
    public class133 field2380 = new class133();

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Ljl;")
    public class177 field2382 = new class177();

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Ldv;")
    private class467 field2376;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2378 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()Lti;", line = 4)
    public final class304 method173() {
        field2385++;
        class344 var1;
        do {
            var1 = (class344) this.field2380.method1022((byte) -112);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4757 == null);
        return var1.field4757;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V", line = 25)
    public final void method147(int[] arg0, int arg1, int arg2) {
        field2384++;
        this.field2382.method147(arg0, arg1, arg2);
        for (class344 var4 = (class344) this.field2380.method1018(56); var4 != null; var4 = (class344) this.field2380.method1022((byte) -112)) {
            if (!this.field2376.method2800((byte) -73, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field4749 >= var6) {
                        this.method1183(arg0, var5, var6, var4, var5 + var6, 0);
                        var4.field4749 -= var6;
                        break;
                    }
                    this.method1183(arg0, var5, var4.field4749, var4, var5 + var6, 0);
                    var5 += var4.field4749;
                    var6 -= var4.field4749;
                } while (!this.field2376.method2819(var4, arg0, var6, true, var5));
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILlm;I)V", line = 67)
    private final void method1182(int arg0, class344 arg1, int arg2) {
        field2375++;
        if ((this.field2376.field6908[arg1.field4755] & 0x4) != 0 && arg1.field4767 < 0) {
            int var4 = this.field2376.field6887[arg1.field4755] / class405.field6017;
            int var5 = (var4 + 1048575 - arg1.field4762) / var4;
            arg1.field4762 = arg2 * var4 + arg1.field4762 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2376.field6864[arg1.field4755] == 0) {
                    arg1.field4757 = class19.method175(arg1.field4765, arg1.field4757.method172(), arg1.field4757.method157(), arg1.field4757.method162());
                } else {
                    arg1.field4757 = class19.method175(arg1.field4765, arg1.field4757.method172(), 0, arg1.field4757.method162());
                    this.field2376.method2806(arg1.field4766.field539[arg1.field4753] < 0, -1, arg1);
                }
                if (arg1.field4766.field539[arg1.field4753] < 0) {
                    arg1.field4757.method146(-1);
                }
                arg2 = arg1.field4762 / var4;
            }
        }
        if (arg0 <= -12) {
            arg1.field4757.method136(arg2);
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()Lti;", line = 107)
    public final class304 method151() {
        field2379++;
        class344 var1 = (class344) this.field2380.method1018(60);
        if (var1 == null) {
            return null;
        } else if (var1.field4757 == null) {
            return this.method173();
        } else {
            return var1.field4757;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([IIILlm;II)V", line = 127)
    private final void method1183(int[] arg0, int arg1, int arg2, class344 arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            return;
        }
        if ((this.field2376.field6908[arg3.field4755] & 0x4) != 0 && arg3.field4767 < 0) {
            int var7 = this.field2376.field6887[arg3.field4755] / class405.field6017;
            while (true) {
                int var8 = (1048575 - (arg3.field4762 - var7)) / var7;
                if (var8 > arg2) {
                    arg3.field4762 += arg2 * var7;
                    break;
                }
                arg3.field4757.method147(arg0, arg1, var8);
                arg2 -= var8;
                arg3.field4762 += var7 * var8 - 1048576;
                arg1 += var8;
                int var9 = class405.field6017 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class19 var11 = arg3.field4757;
                if (this.field2376.field6864[arg3.field4755] == 0) {
                    arg3.field4757 = class19.method175(arg3.field4765, var11.method172(), var11.method157(), var11.method162());
                } else {
                    arg3.field4757 = class19.method175(arg3.field4765, var11.method172(), 0, var11.method162());
                    this.field2376.method2806(arg3.field4766.field539[arg3.field4753] < 0, -1, arg3);
                    arg3.field4757.method169(var9, var11.method157());
                }
                if (arg3.field4766.field539[arg3.field4753] < 0) {
                    arg3.field4757.method146(-1);
                }
                var11.method179(var9);
                var11.method147(arg0, arg1, arg4 - arg1);
                if (var11.method176()) {
                    this.field2382.method1241(var11);
                }
            }
        }
        field2377++;
        arg3.field4757.method147(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 191)
    public final void method136(int arg0) {
        field2383++;
        this.field2382.method136(arg0);
        for (class344 var2 = (class344) this.field2380.method1018(85); var2 != null; var2 = (class344) this.field2380.method1022((byte) -112)) {
            if (!this.field2376.method2800((byte) -59, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4749) {
                        this.method1182(-120, var2, var3);
                        var2.field4749 -= var3;
                        break;
                    }
                    this.method1182(-83, var2, var2.field4749);
                    var3 -= var2.field4749;
                } while (!this.field2376.method2819(var2, null, var3, true, 0));
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ldv;)V", line = 245)
    public class168(class467 arg0) {
        this.field2376 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()I", line = 228)
    public final int method143() {
        field2381++;
        return 0;
    }
}
