import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class32 extends class207 implements class248 {

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Z")
    private boolean field392 = false;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    private int field398 = 50;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Llc;")
    private class86 field395;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Llc;")
    private class86 field384;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Lhl;")
    private class40 field383;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Lhl;")
    private class40 field402;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    public static int[] field385 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field397 = 2;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "[I")
    public static int[] field403 = new int[50];

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(II)Z")
    public final boolean method227(int arg0, int arg1) {
        if (arg1 >= -29) {
            return true;
        } else {
            field381++;
            return !this.method1514(arg0, 0).field553;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Llc;Llc;Llc;IZ)V")
    public class32(class86 arg0, class86 arg1, class86 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field392 = arg4;
        this.field395 = arg0;
        this.field398 = arg3;
        this.field384 = arg2;
        this.field383 = new class40(this.field398);
        this.field402 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Z")
    public final boolean method228(int arg0, int arg1) {
        if (arg1 < 103) {
            this.field398 = 92;
        }
        field390++;
        return this.method1514(arg0, 0).field548;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IZ)Lpj;")
    private final class255 method229(int arg0, boolean arg1) {
        class255 var3 = (class255) this.field383.method310(-24190, (long) arg0);
        field394++;
        if (var3 != null) {
            return var3;
        } else if (arg1) {
            byte[] var4 = this.field395.method643(0, arg0, false);
            if (var4 == null) {
                return null;
            } else {
                class255 var5 = new class255(new class152(var4));
                this.field383.method312((long) arg0, var5, (byte) 109);
                return var5;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public final void method230(int arg0) {
        field389++;
        this.field383.method308((byte) -113);
        if (arg0 != 26075) {
            field403 = null;
        }
        if (this.field402 != null) {
            this.field402.method308((byte) -92);
        }
        class255.field4203 = null;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(BI)Ljava/lang/String;")
    public static final String method231(byte arg0, int arg1) {
        String var2 = Integer.toString(arg1);
        if (arg0 != -42) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        field407++;
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class191.field3085 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class238.field3804 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method232(byte arg0) {
        field403 = null;
        if (arg0 == -17) {
            field385 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(BI)Lam;")
    public final class181 method233(byte arg0, int arg1) {
        field386++;
        if (arg0 > -92) {
            this.field392 = true;
        }
        class255 var3 = this.method229(arg1, true);
        return var3 == null ? null : var3.field4206;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIFZI)Lak;")
    public final class140 method234(int arg0, int arg1, float arg2, boolean arg3, int arg4) {
        class255 var6 = this.method229(arg4, true);
        field388++;
        if (var6 == null || !var6.method1807(this, this.field384)) {
            return null;
        } else if (arg0 == 255) {
            return arg3 ? var6.field4206.method1347((double) arg2, arg1, this.field384, 10, this, arg1, false) : var6.field4206.method1346(this.field384, arg1, (double) arg2, 0, this, false, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(II)V")
    public final void method235(int arg0, int arg1) {
        if (arg1 != 50) {
            method236((byte) -93);
        }
        for (class255 var3 = (class255) this.field383.method314(arg1 ^ 0xFFFFFFE5); var3 != null; var3 = (class255) this.field383.method311(-89)) {
            if (var3.field4209) {
                var3.method1805(arg0);
                var3.field4209 = false;
            }
        }
        field387++;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static final void method236(byte arg0) {
        class224.method1608();
        int var1 = 0;
        if (arg0 > -51) {
            field397 = 46;
        }
        while (var1 < 4) {
            class138.field2237[var1].method827((byte) -60);
            var1++;
        }
        field391++;
        System.gc();
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)I")
    public final int method237(int arg0, int arg1) {
        if (arg1 != 65535) {
            this.method230(-30);
        }
        field400++;
        return this.method1514(arg0, arg1 ^ 0xFFFF).field547 & 0xFFFF;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(II)Z")
    public final boolean method238(int arg0, int arg1) {
        field405++;
        if (this.field392 || this.method1514(arg0, 0).field545) {
            return true;
        } else {
            return arg1 != -1;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
    public final void method239(boolean arg0, int arg1) {
        field406++;
        if (arg1 == -3) {
            this.field392 = arg0;
            this.method230(26075);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(IZ)I")
    public static final int method240(int arg0, boolean arg1) {
        field393++;
        if (!arg1) {
            field397 = -22;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(FIB)[I")
    public final int[] method241(float arg0, int arg1, byte arg2) {
        field382++;
        class255 var4 = this.method229(arg1, true);
        if (var4 == null) {
            return null;
        } else if (arg2 == 77) {
            var4.field4209 = true;
            return var4.method1806(this, this.field384, arg0, this.field392 || this.method1514(arg1, 0).field545);
        } else {
            return null;
        }
    }
}
