import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class415 {

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "Ljda;")
    private class239 field5956 = new class239(256);

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Laj;")
    private class333 field5958;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field5957 = -2;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "[I")
    public static int[] field5960 = new int[14];

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "[I")
    public static int[] field5955 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "Laj;")
    public static class333 field5964;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 8)
    public final void method2561(byte arg0) {
        class239 var2 = this.field5956;
        synchronized (this.field5956) {
            this.field5956.method1552(64);
        }
        if (arg0 >= -2) {
            this.method2564(-17);
        }
        field5963++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)V", line = 21)
    public final void method2562(byte arg0, int arg1) {
        class239 var3 = this.field5956;
        synchronized (this.field5956) {
            this.field5956.method1546(arg1, (byte) -8);
        }
        if (arg0 != 93) {
            method2563((byte) 56);
        }
        field5962++;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V", line = 34)
    public static void method2563(byte arg0) {
        field5960 = null;
        if (arg0 != -68) {
            method2563((byte) -55);
        }
        field5955 = null;
        field5964 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 46)
    public final void method2564(int arg0) {
        class239 var2 = this.field5956;
        synchronized (this.field5956) {
            this.field5956.method1555((byte) -3);
        }
        if (arg0 != 5) {
            this.method2564(99);
        }
        field5961++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Lkka;", line = 68)
    public final class329 method2565(int arg0, int arg1) {
        int var3 = 117 / ((arg1 + 78) / 45);
        field5959++;
        class239 var4 = this.field5956;
        class329 var5;
        synchronized (this.field5956) {
            var5 = (class329) this.field5956.method1541(-10, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class333 var6 = this.field5958;
        byte[] var7;
        synchronized (this.field5958) {
            var7 = this.field5958.method2095(arg0, 26, 1);
        }
        class329 var8 = new class329();
        if (var7 != null) {
            var8.method2075(new class376(var7), 114);
        }
        class239 var9 = this.field5956;
        synchronized (this.field5956) {
            this.field5956.method1544(true, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 109)
    public class415(class285 arg0, int arg1, class333 arg2) {
        this.field5958 = arg2;
        this.field5958.method2090(26, false);
    }
}
