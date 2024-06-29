import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class234 extends class82 {

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "[I")
    public static int[] field3536 = new int[14];

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Ldb;")
    public static class17 field3519 = new class17(64);

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field3521;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lrf;")
    public class289 field3524;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "Lrf;")
    public class289 field3528;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Ljava/lang/String;")
    public String field3520;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Z")
    public boolean field3525;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "[Ljava/lang/Object;")
    public Object[] field3533;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "[[Lrf;")
    public static class289[][] field3532;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([I[IBLvb;[I)V")
    public static final void method1487(int[] arg0, int[] arg1, byte arg2, class61 arg3, int[] arg4) {
        int var5 = -87 % ((arg2 - 44) / 60);
        field3529++;
        for (int var6 = 0; var6 < arg4.length; var6++) {
            int var7 = arg4[var6];
            int var8 = arg1[var6];
            int var9 = arg0[var6];
            int var10 = 0;
            while (var9 != 0 && var10 < arg3.field2290.length) {
                if ((var9 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field2290[var10] = null;
                    } else {
                        class215 var11 = class276.method1829(var7, 29223);
                        class44 var12 = arg3.field2290[var10];
                        int var13 = var11.field3220;
                        if (var12 != null) {
                            if (var12.field702 == var7) {
                                if (var13 == 0) {
                                    var12 = arg3.field2290[var10] = null;
                                } else if (var13 == 1) {
                                    var12.field699 = 0;
                                    var12.field698 = var8;
                                    var12.field703 = 0;
                                    var12.field701 = 1;
                                    var12.field700 = 0;
                                    client.method966((byte) 52, 0, false, arg3.field2234, var11, arg3.field2251);
                                } else if (var13 == 2) {
                                    var12.field703 = 0;
                                }
                            } else if (var11.field3227 >= class276.method1829(var12.field702, 29223).field3227) {
                                var12 = arg3.field2290[var10] = null;
                            }
                        }
                        if (var12 == null) {
                            class44 var14 = arg3.field2290[var10] = new class44();
                            var14.field701 = 1;
                            var14.field703 = 0;
                            var14.field700 = 0;
                            var14.field699 = 0;
                            var14.field698 = var8;
                            var14.field702 = var7;
                            client.method966((byte) 52, 0, false, arg3.field2234, var11, arg3.field2251);
                        }
                    }
                }
                var10++;
                var9 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)I")
    public static final int method1488(boolean arg0, int arg1) {
        field3527++;
        return arg0 ? 94 : arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field3532 = null;
        field3519 = null;
        field3536 = null;
        if (arg0 != 0) {
            method1487((int[]) null, (int[]) null, (byte) 21, (class61) null, (int[]) null);
        }
    }
}
