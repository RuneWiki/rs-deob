import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class9 {

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[Ltl;")
    public class59[] field114;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[S")
    public short[] field121;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "[S")
    public short[] field122;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[B")
    public byte[] field124;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[I")
    public int[] field110;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Ltl;")
    public static class59 field120 = class85.method639("Clientscript error )2 check log for details", 9588);

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lgb;")
    public static class212 field115 = new class212(50);

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Z")
    public static boolean field125 = false;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field126 = -1;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lgb;")
    public static class212 field123 = new class212(64);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Z", line = 20)
    public final boolean method67(int arg0, int arg1) {
        field119++;
        if (arg0 == 8369) {
            return (this.field124[arg1] & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Lsc;", line = 33)
    public static final class18 method68(int arg0, byte arg1) {
        field113++;
        class18 var2 = (class18) class276.field4752.method1006((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class179.field2928.method2042(1, arg0 & 0x7FFF, (byte) -125);
        } else {
            var3 = class187.field3128.method2042(1, arg0, (byte) -122);
        }
        class18 var4 = new class18();
        if (var3 != null) {
            var4.method111((byte) 82, new class170(var3));
        }
        int var5 = 14 / ((arg1 - 14) / 45);
        if (arg0 >= 32768) {
            var4.method117(29);
        }
        class276.field4752.method1008(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lca;IIIIII)Lca;", line = 69)
    public static final class57 method69(class57 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) arg4;
        field118++;
        if (arg3 != 30040) {
            return (class57) null;
        }
        class57 var9 = (class57) class84.field1310.method1483((byte) -74, var7);
        if (var9 == null) {
            class242 var10 = class242.method1716(class72.field1135, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1702(64, 768, -50, -10, -50);
            class84.field1310.method1488(var7, var9, 25838);
        }
        int var11 = arg0.method440();
        int var12 = arg0.method436();
        int var13 = arg0.method435();
        int var14 = arg0.method426();
        class57 var15 = var9.method429(true, true);
        if (arg5 != 0) {
            var15.method439(arg5);
        }
        if (class55.field815) {
            class267 var16 = (class267) var15;
            if (class73.method589(class247.field4119, true, arg1 + var11, arg6 - -var13) != arg2 || arg2 != class73.method589(class247.field4119, true, arg1 + var12, arg6 + var14)) {
                for (int var17 = 0; var17 < var16.field4637; var17++) {
                    var16.field4623[var17] += class73.method589(class247.field4119, true, var16.field4607[var17] + arg1, var16.field4602[var17] + arg6) - arg2;
                }
                var16.field4616.field2219 = false;
                var16.field4632.field3192 = false;
            }
        } else {
            class258 var18 = (class258) var15;
            if (class73.method589(class247.field4119, true, arg1 + var11, arg6 + var13) != arg2 || arg2 != class73.method589(class247.field4119, true, arg1 + var12, arg6 + var14)) {
                for (int var19 = 0; var19 < var18.field4275; var19++) {
                    var18.field4296[var19] += class73.method589(class247.field4119, true, var18.field4279[var19] + arg1, var18.field4276[var19] + arg6) - arg2;
                }
                var18.field4260 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZII)Ltl;", line = 149)
    public static final class59 method70(boolean arg0, int arg1, int arg2) {
        if (arg1 != -26248) {
            method69((class57) null, -28, -30, -35, 27, 125, -59);
        }
        field112++;
        return class237.method1660(arg2, arg1 + 26371, arg0, 10);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ltl;ZB)V", line = 163)
    public static final void method71(class59 arg0, boolean arg1, byte arg2) {
        if (arg2 != -57) {
            field125 = true;
        }
        field111++;
        if (!arg1) {
            try {
                class17.field222.getAppletContext().showDocument(arg0.method464(2, class17.field222.getCodeBase()), "_top");
            } catch (Exception var6) {
            }
            return;
        }
        if (class55.field815 && class123.field2040) {
            try {
                class89.method661(new Object[] { arg0.method464(2, class17.field222.getCodeBase()).toString() }, "openjs", -1827, class308.field5222.field2870);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class17.field222.getAppletContext().showDocument(arg0.method464(2, class17.field222.getCodeBase()), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 208)
    public static void method72(int arg0) {
        field123 = null;
        field120 = null;
        field115 = null;
        if (arg0 != 4) {
            method70(true, 72, 113);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I", line = 221)
    public final int method73(int arg0, int arg1) {
        if (arg0 >= -108) {
            method68(-103, (byte) 74);
        }
        field117++;
        return this.field124[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V", line = 255)
    public class9(int arg0) {
        this.field116 = arg0;
        this.field114 = new class59[this.field116];
        this.field121 = new short[this.field116];
        this.field122 = new short[this.field116];
        this.field124 = new byte[this.field116];
        this.field110 = new int[this.field116];
    }
}
