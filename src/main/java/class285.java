import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class285 {

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public int field4024 = -1;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lbj;")
    public static class131 field4015 = new class131(64);

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "[[I")
    public static int[][] field4029 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field4030 = 0;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "[[B")
    public static byte[][] field4028;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        field4014++;
        if (arg2 != 11) {
            field4028 = null;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 7 + 1 - arg5 - arg3;
        } else if (var8 == 2) {
            return 8 - arg1 - arg4;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)I")
    public static final int method1858(int arg0, int arg1, int arg2, int arg3) {
        field4016++;
        if (class375.field5354 == null) {
            return 0;
        }
        if (arg3 > -29) {
            field4015 = null;
        }
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class211.field2954 - 1 || class290.field4061 - 1 < var5) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class368.field5193[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        return class375.field5354[var6].method725(arg0, arg2);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public static void method1859(byte arg0) {
        field4015 = null;
        field4028 = null;
        field4029 = null;
        if (arg0 >= -110) {
            field4030 = 82;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public static final void method1860(int arg0) {
        if (class119.field1682 != null) {
            class119.field1682.method266((byte) -47);
        }
        field4013++;
        if (class417.field5927 != null) {
            class417.field5927.method266((byte) -47);
        }
        if (arg0 != 12) {
            method1858(99, 123, 24, 113);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V")
    public static final void method1861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 28659) {
            return;
        }
        for (int var5 = 0; var5 < class154.field2170; var5++) {
            Rectangle var6 = class192.field2642[var5];
            if (arg3 < (var6.x + var6.width) && (arg3 + arg4) > var6.x && (var6.y + var6.height) > arg2 && arg0 + arg2 > var6.y) {
                class377.field5395[var5] = true;
            }
        }
        field4018++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILkm;)V")
    public static final void method1862(int arg0, class198 arg1) {
        field4023++;
        for (class194 var2 = (class194) class447.field6276.method646(arg0 ^ 0x31); var2 != null; var2 = (class194) class447.field6276.method641(false)) {
            if (var2.field2660 == arg1) {
                if (var2.field2659 != null) {
                    class164.field2266.method2788(var2.field2659);
                    var2.field2659 = null;
                }
                var2.method2467((byte) 73);
                return;
            }
        }
        if (arg0 != 1) {
            method1863((byte) -97);
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V")
    public static final void method1863(byte arg0) {
        field4021++;
        if (arg0 != -110) {
            field4015 = null;
        }
        class46.field648.method1178(63, 210);
        class148.field2103++;
        class46.field648.method191(class254.field3573, -96);
    }
}
