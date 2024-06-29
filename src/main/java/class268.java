import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class268 extends class283 {

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    private int field4436;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "[Le;")
    public static class159[] field4427 = new class159[2048];

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "[J")
    public static long[] field4429 = new long[500];

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "[[[Lih;")
    public static class32[][][] field4433 = new class32[4][104][104];

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "Lna;")
    public static class26 field4426 = class69.method505(")1", (byte) -125);

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "Z")
    public static boolean field4435 = true;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "[Lok;")
    public static class150[] field4428;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "[Z")
    public static boolean[] field4431;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V", line = 5)
    private class268(int arg0) {
        super(0, true);
        this.field4436 = 4096;
        this.field4436 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILwa;Z)V", line = 22)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field4430++;
        if (!arg2) {
            this.method8(121, (byte) 52);
        }
        if (arg0 == 0) {
            this.field4436 = (arg1.method642((byte) -47) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 49)
    public class268() {
        this(4096);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([IBLkm;[I[I)V", line = 59)
    public static final void method1905(int[] arg0, byte arg1, class324 arg2, int[] arg3, int[] arg4) {
        int var5 = 0;
        if (arg1 <= 81) {
            return;
        }
        while (var5 < arg4.length) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg2.field3950.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field3950[var9] = null;
                    } else {
                        class249 var10 = client.method1731(var6, (byte) -20);
                        class21 var11 = arg2.field3950[var9];
                        int var12 = var10.field4045;
                        if (var11 != null) {
                            if (var11.field290 == var6) {
                                if (var12 == 0) {
                                    var11 = arg2.field3950[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field294 = 0;
                                    var11.field295 = 0;
                                    var11.field292 = 1;
                                    var11.field300 = 0;
                                    var11.field305 = var8;
                                    class285.method2020(arg2.field3972, var10, 183921384, arg2.field3962, false, 0);
                                } else if (var12 == 2) {
                                    var11.field295 = 0;
                                }
                            } else if (var10.field4060 >= client.method1731(var11.field290, (byte) -20).field4060) {
                                var11 = arg2.field3950[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class21 var13 = arg2.field3950[var9] = new class21();
                            var13.field292 = 1;
                            var13.field300 = 0;
                            var13.field305 = var8;
                            var13.field290 = var6;
                            var13.field295 = 0;
                            var13.field294 = 0;
                            class285.method2020(arg2.field3972, var10, 183921384, arg2.field3962, false, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
        field4424++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[I", line = 159)
    public final int[] method8(int arg0, byte arg1) {
        field4432++;
        int var3 = 14 / ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            class75.method538(var4, 0, class101.field1632, this.field4436);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)V", line = 187)
    public static void method1906(int arg0) {
        field4427 = null;
        if (arg0 != -2) {
            field4426 = (class26) null;
        }
        field4426 = null;
        field4431 = null;
        field4428 = null;
        field4429 = null;
        field4433 = (class32[][][]) null;
    }
}
