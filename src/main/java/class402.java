import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class402 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljp;")
    private class236 field5385 = new class236(64);

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Ljp;")
    public class236 field5396 = new class236(2);

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lpc;")
    private class473 field5393;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lpc;")
    public class473 field5391;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field5392 = -1;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field5389 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field5383 = 0;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "F")
    public static float field5395;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Llm;")
    public static class344 field5388;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 3)
    public static void method2332(byte arg0) {
        if (arg0 == -34) {
            field5388 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)Lg;", line = 14)
    public final class106 method2333(boolean arg0, int arg1) {
        field5384++;
        if (!arg0) {
            this.method2333(false, -95);
        }
        class236 var3 = this.field5385;
        class106 var4;
        synchronized (this.field5385) {
            var4 = (class106) this.field5385.method1456((long) arg1, 109);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5393.method2708(33, arg1, (byte) 54);
        class106 var6 = new class106();
        var6.field1552 = this;
        if (var5 != null) {
            var6.method742((byte) 12, new class379(var5));
        }
        class236 var7 = this.field5385;
        synchronized (this.field5385) {
            this.field5385.method1462(var6, (long) arg1, -18);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V", line = 47)
    public static final void method2334(int arg0, int arg1) {
        class377 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class35 var4 = class209.field2868[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class318.field4170; var5++) {
                    for (int var6 = 0; var6 < class439.field6036; var6++) {
                        var2 = var4.method279(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class530.field7813;
                            int var8 = var5 << class530.field7813;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class35 var10 = class209.field2868[var9];
                                if (var10 != null) {
                                    int var11 = var4.method272(var6, var5) - var10.method272(var6, var5);
                                    int var12 = var4.method272(var6 + 1, var5) - var10.method272(var6 + 1, var5);
                                    int var13 = var4.method272(var6 + 1, var5 + 1) - var10.method272(var6 + 1, var5 + 1);
                                    int var14 = var4.method272(var6, var5 + 1) - var10.method272(var6, var5 + 1);
                                    var10.method266(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(ZI)Lwv;", line = 114)
    public static final class26 method2335(boolean arg0, int arg1) {
        field5390++;
        class26[] var2 = class460.method2615(94);
        if (arg0) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class26 var4 = var2[var3];
            if (var4.field452 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V", line = 143)
    public final void method2336(int arg0, int arg1) {
        class236 var3 = this.field5385;
        synchronized (this.field5385) {
            this.field5385.method1461(-5, arg1);
        }
        field5397++;
        class236 var4 = this.field5396;
        synchronized (this.field5396) {
            int var5 = -3 / ((-arg0 - 33) / 49);
            this.field5396.method1461(-5, arg1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 162)
    public final void method2337(int arg0) {
        field5386++;
        class236 var2 = this.field5385;
        synchronized (this.field5385) {
            this.field5385.method1458((byte) -87);
            if (arg0 != 0) {
                this.field5385 = null;
            }
        }
        class236 var3 = this.field5396;
        synchronized (this.field5396) {
            this.field5396.method1458((byte) -109);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lrb;ILpc;Lpc;)V", line = 215)
    public class402(class234 arg0, int arg1, class473 arg2, class473 arg3) {
        this.field5393 = arg2;
        this.field5391 = arg3;
        this.field5393.method2710(33, (byte) -124);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 191)
    public final void method2338(boolean arg0) {
        class236 var2 = this.field5385;
        synchronized (this.field5385) {
            this.field5385.method1459(19088);
        }
        field5387++;
        class236 var3 = this.field5396;
        synchronized (this.field5396) {
            this.field5396.method1459(19088);
            if (!arg0) {
                field5395 = -0.9724213F;
            }
        }
    }
}
