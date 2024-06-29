import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class284 {

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "[I")
    public static int[] field4032 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "[[Z")
    public static boolean[][] field4033 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "Lqe;")
    public static class465 field4040 = new class465(11, -2);

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "Lae;")
    public static class250 field4029;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "Lun;")
    public static class420 field4039;

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "[Lkr;")
    public static class743[] field4038;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V", line = 3)
    public static void method1852(int arg0) {
        field4040 = null;
        field4039 = null;
        field4032 = null;
        if (arg0 != 0) {
            field4040 = null;
        }
        field4033 = null;
        field4029 = null;
        field4038 = null;
    }

    @OriginalMember(owner = "client!ria", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field4034++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1853(byte arg0) {
        field4036++;
        if (class592.field8314) {
            return;
        }
        class592.field8314 = true;
        if (arg0 != -27) {
            method1857(104, -68, false, null, 2);
        }
        class674.field9471 = true;
        class390.field5450 += (-24.0F - class390.field5450) / 2.0F;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lej;)V", line = 53)
    public static final void method1854(class122 arg0) {
        if (class153.field2298 >= 65535) {
            return;
        }
        class36 var1 = arg0.field1891;
        class502.field7171[class153.field2298] = arg0;
        class43.field650[class153.field2298] = false;
        class153.field2298++;
        int var2 = arg0.field1882;
        if (arg0.field1889) {
            var2 = 0;
        }
        int var3 = arg0.field1882;
        if (arg0.field1886) {
            var3 = class749.field10470 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method291(0) + class252.field3600 - var1.method294(56) >> class440.field6142;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method291(0) + var1.method294(125) - class252.field3600 >> class440.field6142;
            if (var7 >= class453.field6328) {
                var7 = class453.field6328 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field1892[var5++];
                int var10 = (var1.method290((byte) -111) + class252.field3600 - var1.method294(45) >> class440.field6142) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class613.field8871) {
                    var11 = class613.field8871 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class577.field8165[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class577.field8165[var4][var12][var8] = var13 | (long) class153.field2298;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class577.field8165[var4][var12][var8] = var13 | (long) class153.field2298 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class577.field8165[var4][var12][var8] = var13 | (long) class153.field2298 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class577.field8165[var4][var12][var8] = var13 | (long) class153.field2298 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILeq;ILeq;)V", line = 145)
    public static final void method1855(int arg0, class209 arg1, int arg2, class209 arg3) {
        field4031++;
        if (arg2 > 23) {
            class361.field5061 = arg3;
            class407.field5678 = arg1;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IBZII)V", line = 160)
    public static final void method1856(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field4037++;
        if (class4.method19(-128, arg0) && arg1 > 110) {
            class182.method1303(-1, class117.field1849[arg0], arg2, arg3, false, arg4);
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(II)V", line = 178)
    public class284(int arg0, int arg1) {
        this.field4035 = arg0;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIZLdm;I)V", line = 195)
    public static final void method1857(int arg0, int arg1, boolean arg2, class50 arg3, int arg4) {
        field4030++;
        int var5 = arg3.field783;
        if (arg3.field868 == 0) {
            arg3.field783 = arg3.field721;
        } else if (arg3.field868 == 1) {
            arg3.field783 = arg0 - arg3.field721;
        } else if (arg3.field868 == 2) {
            arg3.field783 = arg3.field721 * arg0 >> 14;
        }
        int var6 = arg3.field830;
        if (arg3.field815 == 0) {
            arg3.field830 = arg3.field769;
        } else if (arg3.field815 == 1) {
            arg3.field830 = arg1 - arg3.field769;
        } else if (arg3.field815 == 2) {
            arg3.field830 = arg3.field769 * arg1 >> 14;
        }
        if (arg3.field868 == 4) {
            arg3.field783 = arg3.field830 * arg3.field822 / arg3.field711;
        }
        if (arg4 != -1031130194) {
            field4038 = null;
        }
        if (arg3.field815 == 4) {
            arg3.field830 = arg3.field783 * arg3.field711 / arg3.field822;
        }
        if (class588.field8274 && (client.method1943(arg3).field4679 != 0 || arg3.field765 == 0)) {
            if (arg3.field830 < 5 && arg3.field783 < 5) {
                arg3.field783 = 5;
                arg3.field830 = 5;
            } else {
                if (arg3.field783 <= 0) {
                    arg3.field783 = 5;
                }
                if (arg3.field830 <= 0) {
                    arg3.field830 = 5;
                }
            }
        }
        if (class492.field7007 == arg3.field740) {
            class532.field7535 = arg3;
        }
        if (arg2 && arg3.field802 != null && arg3.field783 != var5 || arg3.field830 != var6) {
            class604 var7 = new class604();
            var7.field8773 = arg3.field802;
            var7.field8782 = arg3;
            class35.field474.method1526(var7, arg4 + 1031130297);
        }
    }
}
