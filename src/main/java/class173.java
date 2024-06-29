import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class173 {

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "Llo;")
    private class443 field2359 = new class443();

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "Llo;")
    private class443 field2364;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "[[[B")
    public static byte[][][] field2355;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 4)
    public static void method1148(int arg0) {
        if (arg0 != 0) {
            field2353 = -22;
        }
        field2355 = null;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)Llo;", line = 24)
    public final class443 method1149(int arg0) {
        if (arg0 != 0) {
            this.field2364 = null;
        }
        field2350++;
        class443 var2 = this.field2359.field6406;
        if (this.field2359 == var2) {
            return null;
        } else {
            var2.method2764((byte) 119);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)I", line = 45)
    public final int method1150(byte arg0) {
        field2360++;
        int var2 = -5 / ((arg0 + 68) / 40);
        int var3 = 0;
        class443 var4 = this.field2359.field6406;
        while (this.field2359 != var4) {
            var4 = var4.field6406;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)Llo;", line = 70)
    public final class443 method1151(byte arg0) {
        field2357++;
        class443 var2 = this.field2364;
        if (this.field2359 == var2) {
            this.field2364 = null;
            return null;
        } else {
            this.field2364 = var2.field6406;
            return arg0 == 72 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V", line = 92)
    public static final void method1152(int arg0, int arg1) {
        field2356++;
        class160.field2093 = arg1;
        class51 var2 = class295.field4442;
        synchronized (class295.field4442) {
            int var3 = -9 / ((arg0 + 39) / 63);
            class295.field4442.method372(126);
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)V", line = 106)
    public static final void method1153(int arg0, int arg1) {
        class305.field4566 = -1;
        class444.field6414 = 0;
        field2354++;
        class195.field2697 = false;
        class217.field3024 = 1;
        class144.field1824 = -1;
        class264.field3890 = null;
        class223.field3074 = arg0;
        if (arg1 != 13422) {
            method1155((short[]) null, true);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Llo;I)V", line = 128)
    public final void method1154(class443 arg0, int arg1) {
        if (arg0.field6402 != null) {
            arg0.method2764((byte) 119);
        }
        field2351++;
        arg0.field6402 = this.field2359.field6402;
        arg0.field6406 = this.field2359;
        arg0.field6402.field6406 = arg0;
        if (arg1 != 0) {
            this.field2359 = null;
        }
        arg0.field6406.field6402 = arg0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([SZ)[S", line = 153)
    public static final short[] method1155(short[] arg0, boolean arg1) {
        field2361++;
        if (arg1) {
            method1158((class248[]) null, true, -126);
        }
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class206.method1358(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V", line = 173)
    public final void method1156(int arg0) {
        if (arg0 != -7585) {
            this.field2359 = null;
        }
        while (true) {
            class443 var2 = this.field2359.field6406;
            if (this.field2359 == var2) {
                field2358++;
                this.field2364 = null;
                return;
            }
            var2.method2764((byte) 119);
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V", line = 298)
    public class173() {
        this.field2359.field6406 = this.field2359;
        this.field2359.field6402 = this.field2359;
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)Llo;", line = 201)
    public final class443 method1157(int arg0) {
        if (arg0 < 0) {
            field2355 = null;
        }
        field2362++;
        class443 var2 = this.field2359.field6406;
        if (this.field2359 == var2) {
            this.field2364 = null;
            return null;
        } else {
            this.field2364 = var2.field6406;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([Lsj;ZI)V", line = 230)
    public static final void method1158(class248[] arg0, boolean arg1, int arg2) {
        field2363++;
        if (arg1) {
            field2353 = -81;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class248 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3555 == 0) {
                    if (var4.field3528 != null) {
                        method1158(var4.field3528, arg1, arg2);
                    }
                    class28 var5 = (class28) class242.field3402.method2826(arg1, (long) var4.field3636);
                    if (var5 != null) {
                        class276.method1817((byte) 35, var5.field482, arg2);
                    }
                }
                if (arg2 == 0 && var4.field3663 != null) {
                    class452 var6 = new class452();
                    var6.field6570 = var4.field3663;
                    var6.field6571 = var4;
                    class293.method1989(var6);
                }
                if (arg2 == 1 && var4.field3497 != null) {
                    if (var4.field3505 >= 0) {
                        class248 var7 = class27.method224(65535, var4.field3636);
                        if (var7 == null || var7.field3528 == null || var4.field3505 >= var7.field3528.length || var7.field3528[var4.field3505] != var4) {
                            continue;
                        }
                    }
                    class452 var8 = new class452();
                    var8.field6570 = var4.field3497;
                    var8.field6571 = var4;
                    class293.method1989(var8);
                }
            }
        }
    }
}
