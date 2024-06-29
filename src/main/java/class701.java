import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class701 {

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "Ljda;")
    private class239 field9838 = new class239(64);

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "Laj;")
    private class333 field9840;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "[I")
    public static int[] field9837 = new int[8];

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "Z")
    public static boolean field9834 = true;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 6)
    public static void method3904(int arg0) {
        if (arg0 != 11) {
            method3907(35);
        }
        field9837 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZI)Lsl;", line = 16)
    public final class486 method3905(boolean arg0, int arg1) {
        field9835++;
        class239 var3 = this.field9838;
        class486 var4;
        synchronized (this.field9838) {
            var4 = (class486) this.field9838.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field9840;
        byte[] var6;
        synchronized (this.field9840) {
            var6 = this.field9840.method2095(arg1, 11, 1);
        }
        class486 var7 = new class486();
        if (var6 != null) {
            var7.method2823(new class376(var6), -23621);
        }
        class239 var8 = this.field9838;
        synchronized (this.field9838) {
            this.field9838.method1544(arg0, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V", line = 49)
    public final void method3906(byte arg0) {
        field9841++;
        class239 var2 = this.field9838;
        synchronized (this.field9838) {
            if (arg0 == -6) {
                this.field9838.method1555((byte) -3);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)Lfca;", line = 63)
    public static final class92 method3907(int arg0) {
        field9842++;
        class455 var1 = null;
        class92 var2 = new class92(class21.field332, arg0);
        try {
            class615 var3 = class730.field10124.method617((byte) 126, "", true);
            while (var3.field8321 == 0) {
                class438.method2636(true, 1L);
            }
            if (var3.field8321 == 1) {
                var1 = (class455) var3.field8318;
                byte[] var4 = new byte[(int) var1.method2698(arg0 ^ 0xFFFFFF8C)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method2703(var5, var4, var4.length - var5, (byte) -82);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class92(new class376(var4), class21.field332, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method2702(-1);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V", line = 120)
    public final void method3908(int arg0) {
        field9836++;
        class239 var2 = this.field9838;
        synchronized (this.field9838) {
            this.field9838.method1552(-127);
        }
        if (arg0 > -24) {
            this.field9838 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(I)V", line = 137)
    public static final void method3909(int arg0) {
        field9833++;
        if (!class497.field6870) {
            return;
        }
        if (arg0 != 0) {
            method3909(-82);
        }
        class668 var1 = class452.method2690(arg0 ^ 0xFFFFEEFF, class372.field5384, class121.field1770);
        if (var1 != null && var1.field9236 != null) {
            class12 var2 = new class12();
            var2.field186 = var1.field9236;
            var2.field190 = var1;
            class173.method1235(var2);
        }
        class660.field9129 = -1;
        class167.field2258 = -1;
        class497.field6870 = false;
        if (var1 != null) {
            class763.method4242(var1, true);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 185)
    public class701(class285 arg0, int arg1, class333 arg2) {
        this.field9840 = arg2;
        if (this.field9840 != null) {
            this.field9840.method2090(11, false);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V", line = 172)
    public final void method3910(int arg0, int arg1) {
        field9839++;
        class239 var3 = this.field9838;
        synchronized (this.field9838) {
            this.field9838.method1546(arg0, (byte) -8);
            if (arg1 != -10301) {
                this.method3906((byte) 70);
            }
        }
    }
}
