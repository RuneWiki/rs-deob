import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class150 {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lgm;")
    private class226 field2337 = new class226();

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2332 = 0;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Z")
    public static boolean field2334 = false;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[I")
    public static int[] field2341 = new int[100];

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[I")
    public static int[] field2338 = new int[1000];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Lgm;")
    private class226 field2345;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lea;")
    public static class38 field2339;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lfa;I)V")
    public static final void method990(class273 arg0, int arg1) {
        if (arg1 != 37) {
            method990((class273) null, 123);
        }
        class264.field4354 = arg0;
        field2330++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2333++;
        class196.field3120 = arg3;
        class114.field1716 = arg5;
        if (arg1 != -8599) {
            return;
        }
        class286.field4767 = arg2;
        class163.field2566 = arg0;
        class139.field2146 = arg4;
        if (class286.field4767 >= 100) {
            int var6 = class139.field2146 * 128 + 64;
            int var7 = class114.field1716 * 128 + 64;
            int var8 = class12.method66(var6, class165.field2600, var7, 0) - class196.field3120;
            int var9 = var6 - class53.field715;
            int var10 = var7 - class174.field2724;
            int var11 = var8 - class262.field4326;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class132.field2037 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class100.field1514 = (int) (Math.atan2((double) var9, (double) var10) * -325.949D) & 0x7FF;
            if (class132.field2037 < 128) {
                class132.field2037 = 128;
            }
            if (class132.field2037 > 383) {
                class132.field2037 = 383;
            }
        }
        class92.field1402 = 2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
    public final int method992(int arg0) {
        field2343++;
        if (arg0 != -32208) {
            field2332 = -5;
        }
        class226 var2 = this.field2337.field3588;
        int var3 = 0;
        while (this.field2337 != var2) {
            var3++;
            var2 = var2.field3588;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
    public static final int method993(byte arg0) {
        field2336++;
        if (arg0 < 92) {
            return 14;
        } else if ((double) class13.field174 == 3.0D) {
            return 37;
        } else if ((double) class13.field174 == 4.0D) {
            return 50;
        } else if ((double) class13.field174 == 6.0D) {
            return 75;
        } else if ((double) class13.field174 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Lgm;")
    public final class226 method994(int arg0) {
        field2344++;
        class226 var2 = this.field2337.field3588;
        if (this.field2337 == var2) {
            this.field2345 = null;
            return null;
        }
        if (arg0 < 7) {
            this.method992(108);
        }
        this.field2345 = var2.field3588;
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public static final void method995(int arg0, int arg1) {
        class125.field1920 = 1000 / arg0;
        field2340++;
        if (arg1 != -25454) {
            field2339 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public static void method996(byte arg0) {
        field2341 = null;
        field2338 = null;
        if (arg0 > -123) {
            method993((byte) 40);
        }
        field2339 = null;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Lgm;")
    public final class226 method997(int arg0) {
        class226 var2 = this.field2345;
        if (arg0 != 1863) {
            return null;
        }
        field2331++;
        if (this.field2337 == var2) {
            this.field2345 = null;
            return null;
        } else {
            this.field2345 = var2.field3588;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lgm;B)V")
    public final void method998(class226 arg0, byte arg1) {
        field2335++;
        if (arg0.field3587 != null) {
            arg0.method1574((byte) 114);
        }
        arg0.field3587 = this.field2337.field3587;
        arg0.field3588 = this.field2337;
        if (arg1 != -61) {
            this.method994(-4);
        }
        arg0.field3587.field3588 = arg0;
        arg0.field3588.field3587 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class150() {
        this.field2337.field3588 = this.field2337;
        this.field2337.field3587 = this.field2337;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZZZ)Lfa;")
    public static final class273 method999(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        if (arg1 != 14708) {
            method995(55, 98);
        }
        field2342++;
        class55 var5 = null;
        if (class42.field530 != null) {
            var5 = new class55(arg0, class42.field530, class143.field2250[arg0], 1000000);
        }
        class163.field2559[arg0] = class18.field248.method15(var5, class231.field3700, arg0, (byte) 124);
        if (arg2) {
            class163.field2559[arg0].method1545((byte) -125);
        }
        return new class273(class163.field2559[arg0], arg4, arg3);
    }
}
