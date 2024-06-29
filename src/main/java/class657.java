import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class657 {

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Luf;")
    private class380 field9359 = new class380(64);

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "Lga;")
    private class332 field9362;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public int field9363;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "[I")
    public static int[] field9358 = new int[14];

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field9361 = 0;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field9360;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field9364;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field9356;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3756(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Lqo;", line = 5)
    public final class548 method3752(int arg0, int arg1) {
        field9360++;
        class380 var3 = this.field9359;
        class548 var4;
        synchronized (this.field9359) {
            var4 = (class548) this.field9359.method2176(-126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field9362;
        byte[] var6;
        synchronized (this.field9362) {
            var6 = this.field9362.method1938(arg1, arg0, -17);
        }
        class548 var7 = new class548();
        if (var6 != null) {
            var7.method3070(new class157(var6), -1);
        }
        class380 var8 = this.field9359;
        synchronized (this.field9359) {
            this.field9359.method2174(var7, (long) arg1, (byte) -101);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBII)I", line = 40)
    public static final int method3753(int arg0, byte arg1, int arg2, int arg3) {
        field9355++;
        if (class630.field8726 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class672.field9567;
        if (arg1 != 60) {
            return -84;
        }
        int var7 = arg3 - class672.field9587;
        for (class694 var8 = (class694) class672.field9563.method2506(arg1 + 8); var8 != null; var8 = (class694) class672.field9563.method2505(-126)) {
            if (var8.field9786 == arg2) {
                int var9 = var8.field9789;
                int var10 = var8.field9784;
                int var11 = class672.field9587 + var10 | class672.field9567 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII)Z", line = 94)
    public static final boolean method3754(int arg0, int arg1, int arg2, int arg3) {
        field9354++;
        boolean var4 = true;
        class599 var5 = (class599) class41.method225(arg1, arg3, arg0);
        if (var5 != null) {
            var4 &= class221.method1388(var5, false);
        }
        class599 var6 = (class599) class303.method1782(arg1, arg3, arg0, field9364 == null ? (field9364 = method3756("ge")) : field9364);
        if (var6 != null) {
            var4 &= class221.method1388(var6, false);
        }
        class599 var7 = (class599) class50.method266(arg1, arg3, arg0);
        if (arg2 != 14) {
            method3753(70, (byte) 59, -78, 19);
        }
        if (var7 != null) {
            var4 &= class221.method1388(var7, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 129)
    public static void method3755(byte arg0) {
        if (arg0 != -79) {
            field9356 = null;
        }
        field9356 = null;
        field9358 = null;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 144)
    public class657(class650 arg0, int arg1, class332 arg2) {
        this.field9362 = arg2;
        this.field9363 = this.field9362.method1939(0, 19);
    }
}
