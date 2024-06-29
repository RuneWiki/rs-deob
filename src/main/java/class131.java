import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class131 extends class4 {

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    private int field2477;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
    private int field2489;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    private int field2487;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    private int field2482;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "Ldg;")
    private class37 field2475;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    private int field2478;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    private int field2483;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "Lkb;")
    private static class93 field2476 = class76.method390(" more options", 0);

    @OriginalMember(owner = "client!od", name = "V", descriptor = "Z")
    public static boolean field2471 = false;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field2466 = 0;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "Lkb;")
    private static class93 field2480 = class76.method390("wishes to trade with you)3", 0);

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "[Lrd;")
    public static class158[] field2485 = new class158[2048];

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Lkb;")
    public static class93 field2474 = field2480;

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "Lkb;")
    public static class93 field2488 = field2476;

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "Lkb;")
    private static class93 field2490 = class76.method390("Hidden", 0);

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Lkb;")
    public static class93 field2469 = field2490;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "Z")
    public static boolean field2467;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB)I")
    public static final int method764(int arg0, int arg1, byte arg2) {
        if (arg2 > -29) {
            return -76;
        }
        field2484++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)Lfd;")
    public final class52 method21(boolean arg0) {
        field2486++;
        if (this.field2475 != null) {
            int var2 = class21.field338 - this.field2478;
            if (var2 > 100 && this.field2475.field609 > 0) {
                var2 = 100;
            }
            label56: {
                do {
                    do {
                        if (var2 <= this.field2475.field615[this.field2483]) {
                            break label56;
                        }
                        var2 -= this.field2475.field615[this.field2483];
                        this.field2483++;
                    } while (this.field2483 < this.field2475.field616.length);
                    this.field2483 -= this.field2475.field609;
                } while (this.field2483 >= 0 && this.field2475.field616.length > this.field2483);
                this.field2475 = null;
            }
            this.field2478 = class21.field338 - var2;
        }
        class81 var3 = class154.method990(this.field2465, !arg0);
        if (var3.field1482 != null) {
            var3 = var3.method403(arg0);
        }
        if (arg0) {
            this.field2482 = 41;
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field2487 == 1 || this.field2487 == 3) {
            var5 = var3.field1439;
            var4 = var3.field1487;
        } else {
            var4 = var3.field1439;
            var5 = var3.field1487;
        }
        int var6 = this.field2481 + (var4 >> 1);
        int var7 = (var4 + 1 >> 1) + this.field2481;
        int var8 = (var5 >> 1) + this.field2477;
        int var9 = this.field2477 + (var5 + 1 >> 1);
        int[][] var10 = class151.field2935[this.field2489];
        int var11 = var10[var6][var8] + var10[var6][var9] + var10[var7][var8] + var10[var7][var9] >> 2;
        int var12 = (this.field2477 << 7) + (var5 << 6);
        int var13 = (this.field2481 << 7) + (var4 << 6);
        return var3.method411(this.field2483, var11, var13, this.field2475, 64, var10, var12, this.field2482, this.field2487);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method765(int arg0) {
        field2473++;
        for (int var1 = 0; var1 < class195.field3788; var1++) {
            int var2 = class49.field794[var1];
            class76 var3 = class143.field2791[var2];
            if (var3 != null) {
                class193.method1242(var3, var3.field1364.field3806, 102);
            }
        }
        if (arg0 < 8) {
            method768((byte) 87);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lh;I)Z")
    public static final boolean method766(class65 arg0, int arg1) {
        field2472++;
        if (class135.field2620) {
            if (class178.method1173(arg0, 127) != 0) {
                return false;
            }
            if (arg0.field1076 == 0) {
                return false;
            }
        }
        if (arg1 != -30568) {
            field2467 = false;
        }
        return arg0.field1073;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Lwe;")
    public static final class204 method767(int arg0, byte arg1) {
        field2468++;
        class204 var2 = (class204) class51.field826.method680((long) arg0, (byte) 87);
        if (var2 != null) {
            return var2;
        }
        if (arg1 < 52) {
            method767(55, (byte) 41);
        }
        byte[] var3 = class92.field1680.method461(16, (byte) 121, arg0);
        class204 var4 = new class204();
        if (var3 != null) {
            var4.method1324(new class158(var3), (byte) -128);
        }
        class51.field826.method678(true, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
    public static void method768(byte arg0) {
        if (arg0 != 17) {
            return;
        }
        field2480 = null;
        field2476 = null;
        field2490 = null;
        field2485 = null;
        field2488 = null;
        field2474 = null;
        field2469 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIIIZLac;)V")
    public class131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class4 arg8) {
        this.field2477 = arg5;
        this.field2489 = arg3;
        this.field2465 = arg0;
        this.field2481 = arg4;
        this.field2487 = arg2;
        this.field2482 = arg1;
        if (arg6 != -1) {
            this.field2475 = class39.method213(-10639, arg6);
            this.field2478 = class21.field338 - 1;
            this.field2483 = 0;
            if (this.field2475.field604 == 0 && arg8 != null && arg8 instanceof class131) {
                class131 var10 = (class131) arg8;
                if (this.field2475 == var10.field2475) {
                    this.field2478 = var10.field2478;
                    this.field2483 = var10.field2483;
                    return;
                }
            }
            if (arg7 && this.field2475.field609 != -1) {
                this.field2483 = (int) ((double) this.field2475.field616.length * Math.random());
                this.field2478 -= (int) ((double) this.field2475.field615[this.field2483] * Math.random());
                return;
            }
        }
    }
}
