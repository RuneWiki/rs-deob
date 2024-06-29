import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class456 {

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "Llga;")
    private class663 field6338 = new class663(64);

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public int field6339 = 0;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "Lsea;")
    private class648 field6327;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public int field6332;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "[I")
    public static int[] field6328 = new int[13];

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
    public static int field6336 = 0;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field6334 = -50;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)V")
    public final void method2598(int arg0, int arg1) {
        class663 var3 = this.field6338;
        synchronized (this.field6338) {
            this.field6338.method3754(arg0, true);
            if (arg1 != 13) {
                this.field6339 = 113;
            }
        }
        field6329++;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
    public static void method2599(byte arg0) {
        int var1 = -54 / ((arg0 + 5) / 50);
        field6328 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public final void method2600(int arg0) {
        field6330++;
        class663 var2 = this.field6338;
        synchronized (this.field6338) {
            this.field6338.method3755(19713);
        }
        if (arg0 != 1) {
            field6334 = -97;
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)Lko;")
    public final class466 method2601(int arg0, int arg1) {
        field6337++;
        class663 var3 = this.field6338;
        class466 var4;
        synchronized (this.field6338) {
            var4 = (class466) this.field6338.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field6327;
        byte[] var6;
        synchronized (this.field6327) {
            var6 = this.field6327.method3654(-15615, arg1, arg0);
        }
        class466 var7 = new class466();
        var7.field6407 = arg0;
        var7.field6415 = this;
        if (var6 != null) {
            var7.method2636(new class501(var6), 0);
        }
        var7.method2631((byte) 108);
        class663 var8 = this.field6338;
        synchronized (this.field6338) {
            this.field6338.method3748((long) arg0, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Z")
    public static final boolean method2602(int arg0) {
        field6331++;
        if (arg0 != 768) {
            method2604(-36, 89, (byte) 88, -48, null, -85, -122);
        }
        return class28.method266(true, "jaclib") ? class28.method266(true, "hw3d") : false;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IZIZIBI)V")
    public static final void method2603(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        int var7 = 8 / ((-arg5 - 23) / 57);
        field6335++;
        if (arg2 <= arg4) {
            return;
        }
        int var8 = (arg2 + arg4) / 2;
        int var9 = arg4;
        class228 var10 = class362.field4777[var8];
        class362.field4777[var8] = class362.field4777[arg2];
        class362.field4777[arg2] = var10;
        for (int var11 = arg4; var11 < arg2; var11++) {
            if (class108.method782(class362.field4777[var11], arg1, arg6, arg3, arg0, 0, var10) <= 0) {
                class228 var12 = class362.field4777[var11];
                class362.field4777[var11] = class362.field4777[var9];
                class362.field4777[var9++] = var12;
            }
        }
        class362.field4777[arg2] = class362.field4777[var9];
        class362.field4777[var9] = var10;
        method2603(arg0, arg1, var9 - 1, arg3, arg4, (byte) -95, arg6);
        method2603(arg0, arg1, arg2, arg3, var9 + 1, (byte) -98, arg6);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIBILr;II)Lda;")
    public static final class55 method2604(int arg0, int arg1, byte arg2, int arg3, class166 arg4, int arg5, int arg6) {
        field6333++;
        long var7 = (long) arg6;
        class55 var9 = (class55) class48.field566.method3747((byte) -66, var7);
        short var10 = 2055;
        if (var9 == null) {
            class270 var11 = class29.method282(0, (byte) -19, arg6, class125.field1812);
            if (var11 == null) {
                return null;
            }
            if (var11.field3661 < 13) {
                var11.method1639((byte) -127, 2);
            }
            var9 = arg4.method106(var11, var10, class371.field4990, 64, 768);
            class48.field566.method3748(var7, var9, arg2 ^ 0x30FB);
        }
        class55 var12 = var9.method462(arg2, var10, true);
        if (arg5 != 0) {
            var12.method444(arg5);
        }
        if (arg1 != 0) {
            var12.method416(arg1);
        }
        if (arg3 != 0) {
            var12.method445(arg3);
        }
        if (arg0 != 0) {
            var12.method446(0, arg0, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V")
    public final void method2605(int arg0) {
        field6326++;
        class663 var2 = this.field6338;
        synchronized (this.field6338) {
            this.field6338.method3749(7648);
            if (arg0 != -30067) {
                field6334 = -105;
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;IB)Loj;")
    public static final class346 method2606(String arg0, int arg1, byte arg2) {
        field6325++;
        class346 var3;
        try {
            if (arg2 != -33) {
                return null;
            }
            var3 = (class346) Class.forName("eb").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class135();
        }
        var3.field4631 = arg1;
        var3.field4637 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lci;ILsea;)V")
    public class456(class414 arg0, int arg1, class648 arg2) {
        this.field6327 = arg2;
        this.field6332 = this.field6327.method3653(4, true);
    }
}
