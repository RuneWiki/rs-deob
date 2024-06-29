import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class296 implements Runnable {

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
    public boolean field3989 = true;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field3994 = new Object();

    @OriginalMember(owner = "client!or", name = "m", descriptor = "[I")
    public int[] field3999 = new int[500];

    @OriginalMember(owner = "client!or", name = "o", descriptor = "[I")
    public int[] field4001 = new int[500];

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public int field4000 = 0;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3987 = "Please remove ";

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field3997 = 0;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Lrk;")
    public static class427 field3993;

    @OriginalMember(owner = "client!or", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field3995++;
        while (this.field3989) {
            Object var1 = this.field3994;
            synchronized (this.field3994) {
                if (this.field4000 < 500) {
                    this.field4001[this.field4000] = class391.field5490;
                    this.field3999[this.field4000] = class312.field4220;
                    this.field4000++;
                }
            }
            class229.method1541(69, 50L);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lbd;Z)[Luo;", line = 25)
    public static final class385[] method1904(class304 arg0, boolean arg1) {
        field3998++;
        if (!arg0.method1948((byte) -53)) {
            return new class385[0];
        }
        class242 var2 = arg0.method1940(-122);
        while (var2.field3345 == 0) {
            class229.method1541(56, 10L);
        }
        if (var2.field3345 == 2) {
            return new class385[0];
        }
        int[] var3 = (int[]) var2.field3341;
        class385[] var4 = new class385[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class385 var6 = new class385();
            var4[var5] = var6;
            var6.field5424 = var3[var5 << 2];
            var6.field5426 = var3[(var5 << 2) + 1];
            var6.field5430 = var3[(var5 << 2) + 2];
            var6.field5427 = var3[(var5 << 2) + 3];
        }
        return arg1 ? var4 : null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 68)
    public static void method1905(byte arg0) {
        if (arg0 != 58) {
            field3993 = null;
        }
        field3987 = null;
        field3993 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIBI[Lbi;Z)V", line = 80)
    public static final void method1906(int arg0, int arg1, byte arg2, int arg3, class139[] arg4, boolean arg5) {
        if (arg2 < 99) {
            return;
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class139 var7 = arg4[var6];
            if (var7 != null && var7.field2042 == arg3) {
                class401.method2458(var7, arg5, (byte) -25, arg0, arg1);
                class450.method2799(-5, arg1, var7, arg0);
                if (var7.field2055 > (var7.field1998 - var7.field2027)) {
                    var7.field2055 = var7.field1998 - var7.field2027;
                }
                if (var7.field2055 < 0) {
                    var7.field2055 = 0;
                }
                if (var7.field1983 > var7.field2086 - var7.field2011) {
                    var7.field1983 = var7.field2086 - var7.field2011;
                }
                if (var7.field1983 < 0) {
                    var7.field1983 = 0;
                }
                if (var7.field2023 == 0) {
                    class441.method2738((byte) 101, var7, arg5);
                }
            }
        }
        field3996++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 128)
    public static final void method1907(boolean arg0) {
        field3992++;
        class410 var1 = class385.field5421;
        synchronized (class385.field5421) {
            if (arg0) {
                field3987 = null;
            }
            class385.field5421.method2539(95);
        }
        class410 var2 = class244.field3366;
        synchronized (class244.field3366) {
            class244.field3366.method2539(34);
        }
        class344 var3 = class234.field3227;
        synchronized (class234.field3227) {
            class234.field3227.method2182((byte) 107);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 159)
    public static final void method1908(int arg0) {
        field3991++;
        class410 var1 = class244.field3375;
        synchronized (class244.field3375) {
            class244.field3375.method2533(arg0);
        }
    }
}
