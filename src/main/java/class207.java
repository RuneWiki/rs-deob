import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class207 extends class101 {

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lok;")
    public class266 field3197 = new class266();

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "Lnr;")
    public class64 field3209 = new class64();

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Ljc;")
    private class462 field3196;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lcfa;")
    public static class179 field3204 = new class179();

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
    public static int[] field3210 = new int[200];

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "Z")
    public static boolean field3214 = true;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field3208 = 100;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "Lbu;")
    public static class21 field3212 = new class21(95, 10);

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "D")
    public static double field3215;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Lgba;")
    public static class695 field3200;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 3)
    public final void method182(int arg0) {
        this.field3209.method182(arg0);
        field3198++;
        for (class504 var2 = (class504) this.field3197.method1731((byte) -113); var2 != null; var2 = (class504) this.field3197.method1724(0)) {
            if (!this.field3196.method2762(117, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field7143 >= var3) {
                        this.method1436(-1048576, var3, var2);
                        var2.field7143 -= var3;
                        break;
                    }
                    this.method1436(-1048576, var2.field7143, var2);
                    var3 -= var2.field7143;
                } while (!this.field3196.method2746(0, var3, (byte) -116, var2, null));
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILeu;I[I)V", line = 38)
    private final void method1433(int arg0, int arg1, int arg2, class504 arg3, int arg4, int[] arg5) {
        if (~(this.field3196.field6468[arg3.field7141] & 0x4) != arg4 && arg3.field7148 < 0) {
            int var7 = this.field3196.field6517[arg3.field7141] / class114.field1746;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field7163) / var7;
                if (var8 > arg0) {
                    arg3.field7163 += arg0 * var7;
                    break;
                }
                arg3.field7160.method203(arg5, arg2, var8);
                arg0 -= var8;
                arg3.field7163 += var7 * var8 - 1048576;
                arg2 += var8;
                int var9 = class114.field1746 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class18 var11 = arg3.field7160;
                if (this.field3196.field6454[arg3.field7141] == 0) {
                    arg3.field7160 = class18.method194(arg3.field7161, var11.method197(), var11.method208(), var11.method172());
                } else {
                    arg3.field7160 = class18.method194(arg3.field7161, var11.method197(), 0, var11.method172());
                    this.field3196.method2760(16, arg3.field7144.field9893[arg3.field7139] < 0, arg3);
                    arg3.field7160.method178(var9, var11.method208());
                }
                if (arg3.field7144.field9893[arg3.field7139] < 0) {
                    arg3.field7160.method179(-1);
                }
                var11.method174(var9);
                var11.method203(arg5, arg2, arg1 - arg2);
                if (var11.method196()) {
                    this.field3209.method424(var11);
                }
            }
        }
        field3205++;
        arg3.field7160.method203(arg5, arg2, arg0);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 97)
    public static final void method1434(byte arg0) {
        class715.field9911 = 0;
        class111.field1700 = new class478[500];
        class481.field6754 = new class478[2000];
        class661.field9213 = class109.field1611;
        class479.field6739 = false;
        field3203++;
        class296.field4300 = 0;
        class169.field2647 = 0;
        class335.field4721 = new class478[500];
        class138.field2052 = 0;
        class77.field878 = class109.field1611;
        if (arg0 <= 86) {
            return;
        }
        class626.field8776 = new class478[1000];
        class440.field5978 = new int[class562.field7990][class81.field902 + 1][class48.field615 + 1];
        if (class228.field3494 instanceof class722) {
            class694.field9700 = false;
        } else {
            class694.field9700 = true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I", line = 132)
    public static final int method1435(int arg0, int arg1, int arg2) {
        field3206++;
        int var3 = arg2;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()I", line = 150)
    public final int method210() {
        field3207++;
        return 0;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "()Lsd;", line = 161)
    public final class101 method176() {
        field3195++;
        class504 var1;
        do {
            var1 = (class504) this.field3197.method1724(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field7160 == null);
        return var1.field7160;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "([III)V", line = 187)
    public final void method203(int[] arg0, int arg1, int arg2) {
        field3201++;
        this.field3209.method203(arg0, arg1, arg2);
        for (class504 var4 = (class504) this.field3197.method1731((byte) -120); var4 != null; var4 = (class504) this.field3197.method1724(0)) {
            if (!this.field3196.method2762(84, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field7143 >= var5) {
                        this.method1433(var5, var5 + var6, var6, var4, -1, arg0);
                        var4.field7143 -= var5;
                        break;
                    }
                    this.method1433(var4.field7143, var5 + var6, var6, var4, -1, arg0);
                    var6 += var4.field7143;
                    var5 -= var4.field7143;
                } while (!this.field3196.method2746(var6, var5, (byte) -115, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lsd;", line = 225)
    public final class101 method191() {
        field3202++;
        class504 var1 = (class504) this.field3197.method1731((byte) -122);
        if (var1 == null) {
            return null;
        } else if (var1.field7160 == null) {
            return this.method176();
        } else {
            return var1.field7160;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljc;)V", line = 313)
    public class207(class462 arg0) {
        this.field3196 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILeu;)V", line = 265)
    private final void method1436(int arg0, int arg1, class504 arg2) {
        if (arg0 != -1048576) {
            return;
        }
        field3199++;
        if ((this.field3196.field6468[arg2.field7141] & 0x4) != 0 && arg2.field7148 < 0) {
            int var4 = this.field3196.field6517[arg2.field7141] / class114.field1746;
            int var5 = (var4 + 1048575 - arg2.field7163) / var4;
            arg2.field7163 = arg2.field7163 + (arg1 * var4) & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field3196.field6454[arg2.field7141] == 0) {
                    arg2.field7160 = class18.method194(arg2.field7161, arg2.field7160.method197(), arg2.field7160.method208(), arg2.field7160.method172());
                } else {
                    arg2.field7160 = class18.method194(arg2.field7161, arg2.field7160.method197(), 0, arg2.field7160.method172());
                    this.field3196.method2760(arg0 ^ 0xFFF00010, arg2.field7144.field9893[arg2.field7139] < 0, arg2);
                }
                if (arg2.field7144.field9893[arg2.field7139] < 0) {
                    arg2.field7160.method179(-1);
                }
                arg1 = arg2.field7163 / var4;
            }
        }
        arg2.field7160.method182(arg1);
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V", line = 324)
    public static void method1437(byte arg0) {
        field3200 = null;
        field3212 = null;
        if (arg0 < 49) {
            field3208 = 25;
        }
        field3210 = null;
        field3204 = null;
    }
}
