import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class267 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field4118 = 0;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Z")
    public static boolean field4117 = false;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "F")
    public static float field4120;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "[[[I")
    public static int[][][] field4121;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 5)
    public static void method1772(int arg0) {
        field4121 = (int[][][]) null;
        if (arg0 != 0) {
            field4118 = -122;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIZBZLag;)V", line = 18)
    public static final void method1773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, byte arg7, boolean arg8, class202 arg9) {
        field4116++;
        if (arg7 <= 98) {
            method1774(true, (byte[]) null);
        }
        byte var10 = 0;
        byte var11 = 0;
        if (arg4 == 1) {
            var11 = 1;
        } else if (arg4 == 2) {
            var10 = 1;
            var11 = 1;
        } else if (arg4 == 3) {
            var10 = 1;
        }
        if (arg3 < 0 || arg3 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var14 = arg9.method1317((byte) -99);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg9.method1317((byte) -98);
                    break;
                }
                if (var14 <= 49) {
                    arg9.method1317((byte) -107);
                }
            }
            return;
        }
        if (!arg8 && !arg6) {
            class99.field1749[arg0][arg3][arg5] = 0;
        }
        while (true) {
            int var12 = arg9.method1317((byte) -127);
            if (var12 == 0) {
                if (arg8) {
                    class45.field923[0][arg3 + var10][arg5 + var11] = class46.field954[0][arg3 + var10][arg5 + var11];
                } else if (arg0 == 0) {
                    class45.field923[0][arg3 + var10][arg5 + var11] = -class104.method679(19675, arg1 + 932731, arg2 + 556238) * 8;
                } else {
                    class45.field923[arg0][arg3 + var10][arg5 + var11] = class45.field923[arg0 - 1][arg3 + var10][arg5 + var11] - 240;
                }
                break;
            }
            if (var12 == 1) {
                int var13 = arg9.method1317((byte) -78);
                if (arg8) {
                    class45.field923[0][arg3 + var10][arg5 + var11] = var13 * 8 + class46.field954[0][arg3 + var10][arg5 + var11];
                } else {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg0 == 0) {
                        class45.field923[0][arg3 + var10][arg5 + var11] = -var13 * 8;
                    } else {
                        class45.field923[arg0][arg3 + var10][arg5 + var11] = class45.field923[arg0 - 1][arg3 + var10][arg5 + var11] - (var13 * 8);
                    }
                }
                break;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg9.method1317((byte) -80);
                } else {
                    class325.field4968[arg0][arg3][arg5] = arg9.method1333(-127);
                    class269.field4162[arg0][arg3][arg5] = (byte) ((var12 - 2) / 4);
                    class153.field2507[arg0][arg3][arg5] = (byte) class61.method475(arg4 + var12 - 2, 3);
                }
            } else if (var12 > 81) {
                if (!arg6) {
                    class160.field2607[arg0][arg3][arg5] = (byte) (var12 - 81);
                }
            } else if (!arg8 && !arg6) {
                class99.field1749[arg0][arg3][arg5] = (byte) (var12 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z[B)[B", line = 155)
    public static final byte[] method1774(boolean arg0, byte[] arg1) {
        if (arg0) {
            field4121 = (int[][][]) ((int[][][]) null);
        }
        field4115++;
        class202 var2 = new class202(arg1);
        int var3 = var2.method1317((byte) -100);
        int var4 = var2.method1346(-125);
        if (var4 < 0 || !(class67.field1276 == 0 || var4 <= class67.field1276)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1321(0, -9281, var4, var5);
            return var5;
        } else {
            int var6 = var2.method1346(-127);
            if (var6 < 0 || !(class67.field1276 == 0 || class67.field1276 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class287.method1942(var7, var6, arg1, var4, 9);
            } else {
                class157.field2570.method1454(var7, -1, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLsb;)Lsb;")
    public abstract class178 method558(byte arg0, class178 arg1);
}
