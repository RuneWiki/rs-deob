import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class405 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public int field5644;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field5645 = 0;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[Lhu;")
    public static class133[] field5640;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public abstract void method1405(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method2377(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class184.field2781 = arg0;
        class361.field5091 = arg1;
        class260.field3627 = class361.field5091 > 1 && class184.field2781.method485();
        class140.field2224 = arg2;
        class384.field5377 = 0x1 << class140.field2224;
        class307.field4416 = class384.field5377 >> 1;
        Math.sqrt((double) (class307.field4416 * class307.field4416 + class307.field4416 * class307.field4416));
        class225.field3201 = arg3;
        class735.field10163 = arg4;
        class143.field2290 = arg5;
        class183.field2779 = arg6;
        class92.field1115 = class28.method254(false);
        class10.method97(-29670);
        class483.field6607 = new class701[arg3][class735.field10163][class143.field2290];
        class113.field1866 = new class282[arg3];
        if (arg7) {
            class363.field5106 = new int[class735.field10163][class143.field2290];
            class671.field9152 = new byte[class735.field10163][class143.field2290];
            class649.field8625 = new short[class735.field10163][class143.field2290];
            class681.field9516 = new class701[1][class735.field10163][class143.field2290];
            class588.field7675 = new class282[1];
        } else {
            class363.field5106 = null;
            class671.field9152 = null;
            class649.field8625 = null;
            class681.field9516 = null;
            class588.field7675 = null;
        }
        if (arg8) {
            class458.field6263 = new long[arg3][arg4][arg5];
            class573.field7526 = new class690[65535];
            class20.field342 = new boolean[65535];
            class295.field4220 = 0;
        } else {
            class458.field6263 = null;
            class573.field7526 = null;
            class20.field342 = null;
            class295.field4220 = 0;
        }
        class503.method2832(false);
        class496.field6694 = new class256[2];
        class8.field162 = new class256[2];
        class15.field214 = new class256[2];
        class195.field2932 = new class256[10000];
        class5.field125 = 0;
        class567.field7462 = new class256[5000];
        class503.field6749 = 0;
        class43.field572 = new class675[5000];
        class197.field2980 = 0;
        class672.field9269 = new boolean[class183.field2779 + class183.field2779 + 1][class183.field2779 + class183.field2779 + 1];
        class48.field604 = new boolean[class183.field2779 + class183.field2779 + 2][class183.field2779 + class183.field2779 + 2];
        class762.field10625 = new int[class183.field2779 + class183.field2779 + 2];
        class277.field3864 = class277.field3863;
        if (class260.field3627) {
            class204.field3053 = new boolean[arg3][class183.field2779 + class183.field2779 + 1][class183.field2779 + class183.field2779 + 1];
            class54.field657 = new boolean[arg3][][];
            if (class550.field7263 != null) {
                class589.method3216();
            }
            class550.field7263 = new class602[class361.field5091];
            class184.field2781.method437(class550.field7263.length + 1);
            class184.field2781.method497(0);
            for (int var9 = 0; var9 < class550.field7263.length; var9++) {
                class550.field7263[var9] = new class602(var9 + 1, class184.field2781);
                (new Thread(class550.field7263[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class361.field5091 == 2) {
                var10 = 4;
                class333.field4736 = 2;
            } else if (class361.field5091 == 3) {
                var10 = 6;
                class333.field4736 = 3;
            } else {
                var10 = 8;
                class333.field4736 = 4;
            }
            class289.field4110 = new class126[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class289.field4110[var11] = new class126(class119.field1914[class361.field5091 - 2][var11]);
            }
        } else {
            class333.field4736 = 1;
        }
        class568.field7468 = new int[class333.field4736 - 1];
        class190.field2865 = new int[class333.field4736 - 1];
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
    public abstract void method1403(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method2378(int arg0) {
        field5640 = null;
        if (arg0 >= -104) {
            method2377(null, -35, -107, 41, -104, 42, -13, true, true);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
    public abstract void method1404(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([ILfs;[II[I)V")
    public static final void method2379(int[] arg0, class556 arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg3 < 106) {
            return;
        }
        field5643++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg1.field10276.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field10276[var9] = null;
                    } else {
                        class456 var10 = class509.field6780.method663((byte) -90, var6);
                        int var11 = var10.field6214;
                        class458 var12 = arg1.field10276[var9];
                        if (var12 != null) {
                            if (var12.field6262 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field10276[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6259 = var8;
                                    var12.field6257 = 0;
                                    var12.field6261 = 1;
                                    var12.field6256 = 0;
                                    var12.field6260 = 0;
                                    if (!arg1.field10252) {
                                        class514.method2871(var10, 0, arg1, true);
                                    }
                                } else if (var11 == 2) {
                                    var12.field6260 = 0;
                                }
                            } else if (var10.field6213 >= class509.field6780.method663((byte) -90, var12.field6262).field6213) {
                                var12 = arg1.field10276[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class458 var13 = arg1.field10276[var9] = new class458();
                            var13.field6260 = 0;
                            var13.field6257 = 0;
                            var13.field6259 = var8;
                            var13.field6261 = 1;
                            var13.field6262 = var6;
                            var13.field6256 = 0;
                            if (!arg1.field10252) {
                                class514.method2871(var10, 0, arg1, true);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(III)V")
    public class405(int arg0, int arg1, int arg2) {
        this.field5641 = arg1;
        this.field5642 = arg0;
        this.field5644 = arg2;
    }
}
