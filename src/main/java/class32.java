import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class32 {

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lcs;")
    private class189 field289 = new class189(256);

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lcs;")
    private class189 field300 = new class189(256);

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Lra;")
    private class57 field293;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lra;")
    private class57 field290;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Lvn;")
    public static class169 field298 = new class169();

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Lvn;")
    public static class169 field301 = new class169();

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Lkh;")
    public static class11 field302;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z[III)Lfp;", line = 5)
    private final class177 method182(boolean arg0, int[] arg1, int arg2, int arg3) {
        field291++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF4) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class177 var9 = (class177) this.field300.method1204((byte) -124, var7);
        if (var9 != null) {
            return var9;
        }
        if (!arg0) {
            field302 = null;
        }
        if (arg1 != null && arg1[0] <= 0) {
            return null;
        }
        class125 var10 = (class125) this.field289.method1204((byte) -65, var7);
        if (var10 == null) {
            var10 = class125.method708(this.field293, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            this.field289.method1202(-1, var7, var10);
        }
        class177 var11 = var10.method713(arg1);
        if (var11 == null) {
            return null;
        } else {
            var10.method2290((byte) 98);
            this.field300.method1202(-1, var7, var11);
            return var11;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 52)
    public static void method183(byte arg0) {
        if (arg0 < -112) {
            field302 = null;
            field298 = null;
            field301 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([III)Lfp;", line = 64)
    public final class177 method184(int[] arg0, int arg1, int arg2) {
        field295++;
        if (this.field290.method358((byte) -111) == 1) {
            return this.method188(0, arg1, arg0, -3051);
        } else if (this.field290.method352(arg1, (byte) -75) == 1) {
            return this.method188(arg1, 0, arg0, -3051);
        } else {
            if (arg2 != 0) {
                this.field293 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z", line = 93)
    public static final boolean method185(int arg0) {
        field292++;
        if (arg0 != -1) {
            field302 = null;
        }
        try {
            if (class30.field272 == 2) {
                if (class7.field79 == null) {
                    class7.field79 = class36.method203(class397.field5794, class433.field6248, class419.field6026);
                    if (class7.field79 == null) {
                        return false;
                    }
                }
                if (class176.field2450 == null) {
                    class176.field2450 = new class32(class444.field6492, class134.field1859);
                }
                if (class443.field6477.method1659(22050, class7.field79, class331.field4739, -375, class176.field2450)) {
                    class443.field6477.method1682((byte) -49);
                    class443.field6477.method1670(481, class246.field3349);
                    class443.field6477.method1683((byte) -3, class379.field5570, class7.field79);
                    class397.field5794 = null;
                    class176.field2450 = null;
                    class7.field79 = null;
                    class30.field272 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class443.field6477.method1646(1);
            class30.field272 = 0;
            class7.field79 = null;
            class176.field2450 = null;
            class397.field5794 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I", line = 149)
    public static final int method186(int arg0, int arg1) {
        field297++;
        if (arg0 != -1) {
            return 19;
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xFD) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V", line = 202)
    public static final void method187(int arg0, int arg1, int arg2, int arg3) {
        field288++;
        if (class19.field202 == null) {
            return;
        }
        long var4 = (long) (arg3 | arg2 << 14 | arg0 << 28);
        class111 var6 = (class111) class319.field4527.method1204((byte) -85, var4);
        if (var6 == null) {
            class314.method1966(arg0, arg3, arg2);
            return;
        }
        class437 var7 = (class437) var6.field1280.method1124(-1);
        if (var7 == null) {
            class314.method1966(arg0, arg3, arg2);
            return;
        }
        class407 var8 = (class407) class314.method1966(arg0, arg3, arg2);
        if (var8 == null) {
            var8 = new class407();
        } else {
            var8.field5923 = var8.field5919 = -1;
        }
        if (arg1 <= 94) {
            method187(44, -55, -123, -19);
        }
        var8.field5908 = var7.field6402;
        var8.field5915 = var7.field6401;
        label48: while (true) {
            class437 var9 = (class437) var6.field1280.method1119(false);
            if (var9 == null) {
                break;
            }
            if (var8.field5908 != var9.field6402) {
                var8.field5913 = var9.field6401;
                var8.field5923 = var9.field6402;
                while (true) {
                    class437 var10 = (class437) var6.field1280.method1119(false);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field5908 != var10.field6402 && var8.field5923 != var10.field6402) {
                        var8.field5918 = var10.field6401;
                        var8.field5919 = var10.field6402;
                    }
                }
            }
        }
        int var11 = class372.method2335((arg2 << 7) + 64, arg0, (byte) 120, (arg3 << 7) + 64);
        class349.method2221(arg0, arg3, arg2, var11, var8);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lra;Lra;)V", line = 427)
    private class32(class57 arg0, class57 arg1) {
        this.field293 = arg1;
        this.field290 = arg0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[II)Lfp;", line = 282)
    private final class177 method188(int arg0, int arg1, int[] arg2, int arg3) {
        field294++;
        int var5 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x40000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        if (arg3 != -3051) {
            return null;
        }
        class177 var9 = (class177) this.field300.method1204((byte) -61, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class46 var10 = class46.method291(this.field290, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class177 var11 = var10.method289();
            this.field300.method1202(arg3 + 3050, var7, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field2456.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 317)
    public static final void method189(int arg0) {
        if (arg0 != -1) {
            method186(-3, -55);
        }
        if (class218.field2991 != null) {
            class148.field2068.method1610(true);
            class56.method322();
            class418.method2599((byte) 118);
            class116.method643(16384);
            class264.method1686(false);
            class366.method2312(53);
            if (class434.field6366 != null) {
                class434.field6366.method200((byte) 42);
            }
            class168.method1109((byte) 47);
            class308.method1926((byte) -91);
            class375.method2352((byte) 94);
            class193.method1236(arg0 ^ 0xFFFFF010, false);
            class402.method2550(false);
            for (int var1 = 0; var1 < 2048; var1++) {
                class133 var5 = class375.field5473[var1];
                if (var5 != null) {
                    var5.field6343 = null;
                    for (int var6 = 0; var6 < var5.field6340.length; var6++) {
                        var5.field6340[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class81.field917.length; var2++) {
                class358 var3 = class81.field917[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field6340.length; var4++) {
                        var3.field6340[var4] = null;
                    }
                }
            }
            class218.field2991.method1153(arg0 ^ 0x26FB);
            class218.field2991 = null;
        }
        field299++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB[I)Lfp;", line = 393)
    public final class177 method190(int arg0, byte arg1, int[] arg2) {
        field296++;
        if (arg1 > -85) {
            method183((byte) 65);
        }
        if (this.field293.method358((byte) -111) == 1) {
            return this.method182(true, arg2, arg0, 0);
        } else if (this.field293.method352(arg0, (byte) -75) == 1) {
            return this.method182(true, arg2, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }
}
