import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class272 {

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    private int field3436 = -1;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    private int field3441 = 0;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "Lqia;")
    private class547 field3448 = new class547();

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "Z")
    public boolean field3449 = false;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    private int field3440;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "[Lqf;")
    private class751[] field3443;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "[[I")
    private int[][] field3435;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "[I")
    public static int[] field3445 = new int[8];

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field3446 = 0;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BII)V", line = 3)
    public static final void method1628(byte arg0, int arg1, int arg2) {
        field3433++;
        class548 var3 = class696.method3872(arg1, 5, -1633381944);
        var3.method3130(96);
        var3.field7725 = arg2;
        if (arg0 != 24) {
            method1630(29, 24, 10, true);
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(III)V", line = 281)
    public class272(int arg0, int arg1, int arg2) {
        this.field3440 = arg0;
        this.field3439 = arg1;
        this.field3443 = new class751[this.field3439];
        this.field3435 = new int[this.field3440][arg2];
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)I", line = 26)
    public static int method1629(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIZ)V", line = 33)
    public static final void method1630(int arg0, int arg1, int arg2, boolean arg3) {
        if (class274.field3460.method3248((long) arg0, 0) == null) {
            if (class485.field6885) {
                class303 var4 = new class303(arg0, new class513(4096, class583.field8102, arg0), arg1, arg3);
                var4.field3898.method1817(class146.field1759[class416.field5920], (byte) 36);
                class274.field3460.method3249((long) arg0, var4, (byte) 59);
            } else {
                class205.method1270(arg0, 1, arg3);
            }
        }
        field3442++;
        if (arg2 != 24575) {
            method1636(-41, -9, -126, -5, 73, true, -58, 68, 123);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLtn;)Luu;", line = 59)
    public static final class529 method1631(boolean arg0, class179 arg1) {
        arg1.method1094(255);
        if (arg0) {
            field3446 = -58;
        }
        field3444++;
        int var2 = arg1.method1094(255);
        class529 var3 = class152.method944(11471, var2);
        var3.field7454 = arg1.method1094(255);
        int var4 = arg1.method1094(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1094(255);
            var3.method190(var6, (byte) 111, arg1);
        }
        var3.method303(-107);
        return var3;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V", line = 96)
    public final void method1632(boolean arg0) {
        for (int var2 = 0; var2 < this.field3440; var2++) {
            this.field3435[var2] = null;
        }
        if (arg0) {
            field3446 = 12;
        }
        field3447++;
        this.field3443 = null;
        this.field3435 = null;
        this.field3448.method3114(true);
        this.field3448 = null;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V", line = 117)
    public static void method1633(byte arg0) {
        int var1 = -114 / ((15 - arg0) / 39);
        field3445 = null;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)[[I", line = 127)
    public final int[][] method1634(byte arg0) {
        field3437++;
        if (this.field3440 != this.field3439) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3440; var2++) {
            this.field3443[var2] = class592.field8244;
        }
        if (arg0 != -39) {
            field3445 = null;
        }
        return this.field3435;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)[I", line = 152)
    public final int[] method1635(int arg0, int arg1) {
        field3438++;
        if (arg1 > -52) {
            this.method1634((byte) -58);
        }
        if (this.field3440 == this.field3439) {
            this.field3449 = this.field3443[arg0] == null;
            this.field3443[arg0] = class592.field8244;
            return this.field3435[arg0];
        } else if (this.field3440 == 1) {
            this.field3449 = this.field3436 != arg0;
            this.field3436 = arg0;
            return this.field3435[0];
        } else {
            class751 var3 = this.field3443[arg0];
            if (var3 == null) {
                this.field3449 = true;
                if (this.field3441 >= this.field3440) {
                    class751 var4 = (class751) this.field3448.method3119(true);
                    var3 = new class751(arg0, var4.field10504);
                    this.field3443[var4.field10508] = null;
                    var4.method3426((byte) -106);
                } else {
                    var3 = new class751(arg0, this.field3441);
                    this.field3441++;
                }
                this.field3443[arg0] = var3;
            } else {
                this.field3449 = false;
            }
            this.field3448.method3109(var3, 118);
            return this.field3435[var3.field10504];
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIIZIII)V", line = 229)
    public static final void method1636(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field3434++;
        if (arg5) {
            method1630(91, 97, 57, false);
        }
        if (arg3 < 1 || arg2 < 1 || class613.field8591 - 2 < arg3 || arg2 > (class1.field3 - 2)) {
            return;
        }
        int var9 = arg7;
        if (arg7 < 3 && class739.method4140((byte) 80, arg2, arg3)) {
            var9 = arg7 + 1;
        }
        if (class223.field2944.field619.method444((byte) -127) == 0 && !class613.method3363(-17342, arg3, class553.field7772, var9, arg2)) {
            return;
        }
        if (class495.field7002 == null) {
            return;
        }
        class143.field1692.method2837(arg6, arg2, class410.field5786[arg7], arg3, (byte) 95, class458.field6407, arg7);
        if (arg8 < 0) {
            return;
        }
        int var10 = class223.field2944.field610.method3087((byte) -123);
        class223.field2944.method346(class223.field2944.field610, 1, false);
        class143.field1692.method2841(class458.field6407, arg8, var9, arg2, arg0, arg4, arg1, arg3, -75, class410.field5786[arg7], arg7);
        class223.field2944.method346(class223.field2944.field610, var10, false);
        return;
    }
}
