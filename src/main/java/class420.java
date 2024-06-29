import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class420 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lmq;")
    private class472 field5950 = new class472(64);

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Ljn;")
    private class668 field5958;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Loe;")
    public static class183 field5949 = new class183();

    @OriginalMember(owner = "client!td", name = "k", descriptor = "[[[I")
    public static int[][][] field5959 = new int[2][][];

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Ljn;")
    public static class668 field5953;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[Lf;")
    public static class701[] field5955;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIB)V", line = 5)
    public static final void method2533(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field5952++;
        int var6 = class396.method2393(class598.field8632, class288.field3883, 5890, arg1);
        int var7 = class396.method2393(class598.field8632, class288.field3883, 5890, arg4);
        int var8 = class396.method2393(class587.field8513, class221.field2866, 5890, arg3);
        int var9 = class396.method2393(class587.field8513, class221.field2866, 5890, arg2);
        int var10 = 112 / ((42 - arg5) / 32);
        for (int var11 = var6; var11 <= var7; var11++) {
            class359.method2018(class678.field9722[var11], var9, 96, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 37)
    public final void method2534(byte arg0) {
        class472 var2 = this.field5950;
        synchronized (this.field5950) {
            this.field5950.method2776(false);
        }
        if (arg0 == 13) {
            field5954++;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 52)
    public static void method2535(int arg0) {
        field5953 = null;
        field5959 = null;
        field5949 = null;
        field5955 = null;
        if (arg0 <= 112) {
            method2533(38, 37, -94, 113, 108, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Lfq;", line = 68)
    public final class184 method2536(byte arg0, int arg1) {
        field5956++;
        class472 var3 = this.field5950;
        class184 var4;
        synchronized (this.field5950) {
            var4 = (class184) this.field5950.method2766(-123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field5958;
        byte[] var6;
        synchronized (this.field5958) {
            var6 = this.field5958.method3800(arg1, 11, (byte) -92);
        }
        class184 var7 = new class184();
        if (var6 != null) {
            var7.method1149((byte) -51, new class389(var6));
        }
        class472 var8 = this.field5950;
        synchronized (this.field5950) {
            this.field5950.method2772(var7, true, (long) arg1);
        }
        if (arg0 >= -110) {
            method2533(4, 22, -61, -87, 39, (byte) 10);
        }
        return var7;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 99)
    public final void method2537(byte arg0) {
        class472 var2 = this.field5950;
        synchronized (this.field5950) {
            this.field5950.method2778((byte) 113);
        }
        field5957++;
        if (arg0 > -84) {
            this.method2536((byte) -110, 40);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V", line = 114)
    public final void method2538(int arg0, byte arg1) {
        class472 var3 = this.field5950;
        synchronized (this.field5950) {
            this.field5950.method2777(arg0, 87);
            if (arg1 != -49) {
                field5959 = null;
            }
        }
        field5951++;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 129)
    public class420(class90 arg0, int arg1, class668 arg2) {
        this.field5958 = arg2;
        if (this.field5958 != null) {
            this.field5958.method3805(11, false);
        }
    }
}
