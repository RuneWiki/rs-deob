import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Z")
    public boolean field147 = false;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Ldl;")
    public class64 field148;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lhia;")
    public static class67 field150;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lar;")
    public static class684 field143;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method72(int arg0) {
        if (arg0 != 12287) {
            this.method76(true, null, -18);
        }
        field142++;
        return this.field148.field889.method3154(this.field146, (byte) 98);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BZILha;)Liea;", line = 18)
    public final class481 method73(byte arg0, boolean arg1, int arg2, class60 arg3) {
        field149++;
        long var5 = (long) (arg3.field831 << 19 | (arg1 ? 262144 : 0) | this.field146 | arg2 << 16);
        class481 var7 = (class481) this.field148.field898.method3079(var5, 0);
        if (var7 != null) {
            return var7;
        } else if (this.field148.field889.method3154(this.field146, (byte) 98)) {
            class728 var8 = class728.method4059(this.field148.field889, this.field146, 0);
            if (var8 != null) {
                var8.field10130 = var8.field10129 = var8.field10136 = var8.field10128 = 0;
                if (arg1) {
                    var8.method4053();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method4057();
                }
            }
            class481 var10 = arg3.method508(var8, true);
            if (var10 != null) {
                this.field148.field898.method3077((byte) -108, var5, var10);
            }
            int var11 = 38 / ((arg0 - 64) / 56);
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 72)
    public static void method74(byte arg0) {
        field150 = null;
        if (arg0 <= -54) {
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 86)
    public static final void method75() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class433.field5776.length; var1++) {
                if (class433.field5776[var1].method4177()) {
                    class87.field1215[var1] = class433.field5776[var1].method4174();
                } else {
                    synchronized (class433.field5776[var1]) {
                        class433.field5776[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class433.field5776[class433.field5776.length - 1].method4178();
                class295.method1774(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class433.field5776.length - 1; var4++) {
                        if (!class433.field5776[var4].method4177()) {
                            synchronized (class433.field5776[var4]) {
                                class433.field5776[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class433.field5776.length - 2; var6++) {
                            class433.field5776[var6].method4178();
                        }
                        class295.method1774(2);
                        while (!class433.field5776[0].method4177()) {
                            synchronized (class433.field5776[0]) {
                                class433.field5776[0].notify();
                            }
                            try {
                                class149.method1052(1L, true);
                            } catch (Exception var9) {
                            }
                        }
                        class433.field5776[0].method4178();
                        return;
                    }
                    try {
                        class149.method1052(1L, true);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class149.method1052(1L, true);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLsl;I)V", line = 183)
    private final void method76(boolean arg0, class461 arg1, int arg2) {
        if (arg2 == 1) {
            this.field146 = arg1.method2566(-2);
        } else if (arg2 == 2) {
            this.field145 = arg1.method2576((byte) 122);
        } else if (arg2 == 3) {
            this.field147 = true;
        } else if (arg2 == 4) {
            this.field146 = -1;
        }
        if (arg0) {
            field141++;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lsl;I)V", line = 211)
    public final void method77(class461 arg0, int arg1) {
        if (arg1 != -1) {
            this.field147 = true;
        }
        field144++;
        while (true) {
            int var3 = arg0.method2600((byte) -124);
            if (var3 == 0) {
                return;
            }
            this.method76(true, arg0, var3);
        }
    }
}
