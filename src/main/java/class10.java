import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class10 {

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "Luf;")
    private class380 field108 = new class380(256);

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "Lqq;")
    private class651 field104;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "Lfa;")
    private class522 field100;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "[I")
    public static int[] field99 = new int[50];

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field102 = -1;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field101 = 0;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "()V")
    public static final void method53() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class595.field8212.length; var1++) {
                if (class595.field8212[var1].method3535()) {
                    class221.field2887[var1] = class595.field8212[var1].method3532();
                } else {
                    synchronized (class595.field8212[var1]) {
                        class595.field8212[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class595.field8212[class595.field8212.length - 1].method3534();
                class448.method2526(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class595.field8212.length - 1; var4++) {
                        if (!class595.field8212[var4].method3535()) {
                            synchronized (class595.field8212[var4]) {
                                class595.field8212[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class595.field8212.length - 2; var6++) {
                            class595.field8212[var6].method3534();
                        }
                        class448.method2526(2);
                        while (!class595.field8212[0].method3535()) {
                            synchronized (class595.field8212[0]) {
                                class595.field8212[0].notify();
                            }
                            try {
                                class588.method3253(0, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class595.field8212[0].method3534();
                        return;
                    }
                    try {
                        class588.method3253(0, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class588.method3253(0, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Lgn;")
    public final class691 method54(int arg0, int arg1) {
        field103++;
        Object var3 = this.field108.method2176(-126, (long) arg0);
        if (var3 != null) {
            return (class691) var3;
        } else if (this.field100.method2961(true, arg0)) {
            class105 var4 = this.field100.method2959(120, arg0);
            int var5 = var4.field1260 ? 64 : this.field104.field9192;
            class691 var7;
            if (var4.field1251 && this.field104.method1098()) {
                float[] var6 = this.field100.method2960(var5, false, 25853, 0.7F, arg0, var5);
                var7 = this.field104.method3626(var5, true, var5, var4.field1261 != 0, class480.field6686, var6);
            } else {
                int[] var8 = !var4.field1253 && class113.method668((byte) 93, var4.field1255) ? this.field100.method2964(arg0, (byte) 67, var5, true, 0.7F, var5) : this.field100.method2963(false, var5, true, var5, 0.7F, arg0);
                var7 = this.field104.method3662(var5, var4.field1261 != 0, var5, -111, var8);
            }
            var7.method846(var4.field1264, (byte) 78, var4.field1254);
            this.field108.method2174(var7, (long) arg0, (byte) 124);
            int var9 = 115 / ((arg1 - 66) / 46);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZLio;)V")
    public static final void method55(int arg0, boolean arg1, class157 arg2) {
        if (class527.field7301 != null) {
            try {
                class527.field7301.method771(0, 0L);
                class527.field7301.method769(arg0, 24, -125, arg2.field2199);
            } catch (Exception var3) {
            }
        }
        if (!arg1) {
            field107++;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 == 76) {
            field109++;
            this.field108.method2168((byte) -112);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static void method57(int arg0) {
        field99 = null;
        if (arg0 != -23957) {
            method55(0, true, null);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
    public final void method58(int arg0) {
        this.field108.method2179(false, 5);
        int var2 = 46 / ((-arg0 - 15) / 61);
        field106++;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lqq;Lfa;)V")
    public class10(class651 arg0, class522 arg1) {
        this.field104 = arg0;
        this.field100 = arg1;
    }
}
