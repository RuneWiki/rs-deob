import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class174 {

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lmq;")
    private class358 field2523 = new class358();

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    private int field2525;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lqi;")
    private class406 field2504;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "[[I")
    public static int[][] field2514 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "J")
    public static long field2521 = 0L;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lmg;")
    public static class103 field2519;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lie;")
    public static class6 field2506;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JB)V", line = 4)
    private final void method1085(long arg0, byte arg1) {
        if (arg1 <= 65) {
            this.method1089(-126);
        }
        field2520++;
        class513 var4 = (class513) this.field2504.method2405(arg0, -53);
        this.method1092((byte) -49, var4);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 20)
    public final Object method1086(int arg0) {
        if (arg0 != 11463) {
            this.field2525 = -43;
        }
        field2518++;
        class513 var2 = (class513) this.field2504.method2410((byte) 97);
        while (var2 != null) {
            Object var3 = var2.method2510((byte) 105);
            if (var3 != null) {
                return var3;
            }
            class513 var4 = var2;
            var2 = (class513) this.field2504.method2410((byte) 92);
            var4.method2891(49);
            var4.method2132(12);
            this.field2511 += var2.field7574;
        }
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 52)
    public final void method1087(int arg0, int arg1) {
        field2505++;
        if (class324.field4736 != null) {
            for (class513 var3 = (class513) this.field2523.method2119(0); var3 != null; var3 = (class513) this.field2523.method2116((byte) 44)) {
                if (var3.method2508(23800)) {
                    if (var3.method2510((byte) 84) == null) {
                        var3.method2891(34);
                        var3.method2132(12);
                        this.field2511++;
                    }
                } else if ((long) arg1 < ++var3.field5164) {
                    class513 var4 = class324.field4736.method1758(var3, arg0 - 1);
                    this.field2504.method2413(var3.field7060, var4, -1);
                    class280.method1747(var4, -125, var3);
                    var3.method2891(30);
                    var3.method2132(arg0 ^ 0xD);
                }
            }
        }
        if (arg0 != 1) {
            this.method1096((byte) -119);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(JB)Ljava/lang/Object;", line = 101)
    public final Object method1088(long arg0, byte arg1) {
        field2510++;
        class513 var4 = (class513) this.field2504.method2405(arg0, -41);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2510((byte) 49);
        if (var5 == null) {
            var4.method2891(35);
            var4.method2132(12);
            this.field2511 += var4.field7574;
            return null;
        }
        if (var4.method2508(23800)) {
            class423 var6 = new class423(var5, var4.field7574);
            this.field2504.method2413(var4.field7060, var6, -1);
            this.field2523.method2118(var6, true);
            var6.field5164 = 0L;
            var4.method2891(-124);
            var4.method2132(12);
        } else {
            this.field2523.method2118(var4, true);
            var4.field5164 = 0L;
        }
        int var7 = -125 % ((arg1 + 71) / 38);
        return var5;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I", line = 145)
    public final int method1089(int arg0) {
        field2524++;
        if (arg0 < 48) {
            return 40;
        }
        int var2 = 0;
        for (class513 var3 = (class513) this.field2523.method2119(0); var3 != null; var3 = (class513) this.field2523.method2116((byte) 44)) {
            if (!var3.method2508(23800)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I", line = 171)
    public final int method1090(boolean arg0) {
        field2508++;
        if (!arg0) {
            this.method1085(110L, (byte) 64);
        }
        return this.field2511;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 185)
    public static void method1091(byte arg0) {
        field2514 = null;
        field2506 = null;
        if (arg0 != -96) {
            field2519 = null;
        }
        field2519 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLdw;)V", line = 197)
    private final void method1092(byte arg0, class513 arg1) {
        if (arg1 != null) {
            arg1.method2891(-122);
            arg1.method2132(arg0 + 61);
            this.field2511 += arg1.field7574;
        }
        if (arg0 != -49) {
            this.field2525 = -59;
        }
        field2515++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)I", line = 215)
    public final int method1093(byte arg0) {
        field2522++;
        if (arg0 != -50) {
            this.field2525 = -98;
        }
        return this.field2525;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 230)
    public final Object method1094(byte arg0) {
        field2507++;
        class513 var2 = (class513) this.field2504.method2414((byte) -127);
        while (var2 != null) {
            Object var3 = var2.method2510((byte) -26);
            if (var3 != null) {
                return var3;
            }
            class513 var4 = var2;
            var2 = (class513) this.field2504.method2410((byte) 124);
            var4.method2891(-127);
            var4.method2132(12);
            this.field2511 += var2.field7574;
        }
        if (arg0 != 44) {
            this.method1098(null, 63, (byte) 110, -6L);
        }
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 262)
    public final void method1095(int arg0) {
        for (class513 var2 = (class513) this.field2523.method2119(arg0); var2 != null; var2 = (class513) this.field2523.method2116((byte) 44)) {
            if (var2.method2508(arg0 ^ 0x5CF8)) {
                var2.method2891(30);
                var2.method2132(12);
                this.field2511 += var2.field7574;
            }
        }
        field2512++;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V", line = 285)
    public final void method1096(byte arg0) {
        field2517++;
        int var2 = 1 / ((arg0 - 45) / 59);
        this.field2523.method2120((byte) 59);
        this.field2504.method2408(103);
        this.field2511 = this.field2525;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/Object;J)V", line = 297)
    public final void method1097(int arg0, Object arg1, long arg2) {
        field2516++;
        this.method1098(arg1, 1, (byte) 33, arg2);
        if (arg0 != 19627) {
            this.method1090(true);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Object;IBJ)V", line = 321)
    private final void method1098(Object arg0, int arg1, byte arg2, long arg3) {
        field2513++;
        if (this.field2525 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method1085(arg3, (byte) 79);
        this.field2511 -= arg1;
        if (arg2 < 30) {
            return;
        }
        while (this.field2511 < 0) {
            class513 var7 = (class513) this.field2523.method2115((byte) -103);
            this.method1092((byte) -49, var7);
        }
        class423 var6 = new class423(arg0, arg1);
        this.field2504.method2413(arg3, var6, -1);
        this.field2523.method2118(var6, true);
        var6.field5164 = 0L;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V", line = 352)
    public class174(int arg0) {
        this.field2511 = arg0;
        this.field2525 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2504 = new class406(var2);
    }
}
