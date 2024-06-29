import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class141 {

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lbe;")
    private class235 field2507 = new class235(256);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lbe;")
    private class235 field2513 = new class235(256);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lda;")
    private class143 field2509;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lda;")
    private class143 field2503;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lbd;")
    public static class162 field2499 = class17.method142(0, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lbd;")
    public static class162 field2496 = class17.method142(0, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lbd;")
    public static class162 field2502 = class17.method142(0, "showingVideoAd");

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lbd;")
    public static class162 field2510 = class17.method142(0, "Lade)3)3)3");

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lbd;")
    public static class162 field2508 = class17.method142(0, "scrollen:");

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Z")
    public static boolean field2498;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[IB)Ls;", line = 8)
    public final class310 method1096(int arg0, int[] arg1, byte arg2) {
        field2497++;
        if (arg2 != 19) {
            this.method1101((int[]) null, 16, 38, -91);
        }
        if (this.field2509.method1140(-1) == 1) {
            return this.method1101(arg1, arg2 - 1769148175, 0, arg0);
        } else if (this.field2509.method1121(arg0, (byte) -119) == 1) {
            return this.method1101(arg1, -1769148156, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 43)
    public static final void method1097(int arg0) {
        class108.method879();
        if (arg0 != 23610) {
            field2498 = false;
        }
        field2504++;
        class108.method880();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 55)
    public static final void method1098(byte arg0) {
        field2514++;
        if (arg0 == -81) {
            class96.field1753.method1529(false);
            class23.field386.method1529(false);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 68)
    public static final void method1099(int arg0) {
        field2501++;
        if (class82.field1433 > 0) {
            class297.method2034(0);
        } else {
            class1.field1 = class116.field2054;
            class116.field2054 = null;
            class122.method984(arg0, 2047);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 87)
    public static void method1100(int arg0) {
        field2499 = null;
        field2508 = null;
        if (arg0 != 1) {
            field2496 = (class162) null;
        }
        field2496 = null;
        field2502 = null;
        field2510 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIII)Ls;", line = 126)
    private final class310 method1101(int[] arg0, int arg1, int arg2, int arg3) {
        field2505++;
        int var5 = arg3 ^ ((arg2 & 0x30000FFF) << 4 | arg2 >>> 12);
        if (arg1 != -1769148156) {
            return (class310) null;
        }
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class310 var9 = (class310) this.field2513.method1672(var7, 19760);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class124 var10 = (class124) this.field2507.method1672(var7, 19760);
            if (var10 == null) {
                var10 = class124.method1002(this.field2509, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2507.method1674(var10, false, var7);
            }
            class310 var11 = var10.method999(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1183(false);
                this.field2513.method1674(var11, false, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[II)Ls;", line = 174)
    private final class310 method1102(int arg0, int arg1, int[] arg2, int arg3) {
        field2500++;
        int var5 = (arg0 << 4 & 0xFFF8 | arg0 >>> 12) ^ arg3;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class310 var9 = (class310) this.field2513.method1672(var7, 19760);
        int var10 = -105 % ((-arg1 - 4) / 38);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class241 var11 = class241.method1712(this.field2503, arg0, arg3);
            if (var11 == null) {
                return null;
            }
            class310 var12 = var11.method1711();
            this.field2513.method1674(var12, false, var7);
            if (arg2 != null) {
                arg2[0] -= var12.field5182.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lda;Lda;)V", line = 249)
    public class141(class143 arg0, class143 arg1) {
        this.field2509 = arg1;
        this.field2503 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I)Ls;", line = 218)
    public final class310 method1103(int arg0, int arg1, int[] arg2) {
        field2512++;
        if (arg0 == this.field2503.method1140(-1)) {
            return this.method1102(0, -48, arg2, arg1);
        } else if (this.field2503.method1121(arg1, (byte) -118) == 1) {
            return this.method1102(arg1, arg0 + 117, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 259)
    public static final void method1104(int arg0, int arg1) {
        field2506++;
        if (arg0 != 84374508 || arg1 == -1 || !class12.method104(arg1, 571329488)) {
            return;
        }
        class78[] var2 = class95.field1739[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class78 var4 = var2[var3];
            if (var4.field1341 != null) {
                class180 var5 = new class180();
                var5.field3099 = var4;
                var5.field3102 = var4.field1341;
                class242.method1717(2000000, (byte) -17, var5);
            }
        }
    }
}
