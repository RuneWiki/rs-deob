import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class158 extends class130 {

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field2784 = 0;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[Lnl;")
    public static class29[] field2781 = new class29[27];

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "Lcd;")
    public static class64 field2778 = class44.method335((byte) 71, "<col=ffffff>)0");

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "Z")
    public static boolean field2785 = false;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "[Lnh;")
    public static class108[] field2788 = new class108[6];

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)Z", line = 15)
    public static final boolean method1133(boolean arg0, int arg1) {
        if (arg0) {
            field2787 = -75;
        }
        field2782++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V", line = 40)
    public static final void method1134(int arg0) {
        field2780++;
        if (arg0 != 8503) {
            field2788 = (class108[]) null;
        }
        for (class55 var1 = (class55) class313.field5312.method778(0); var1 != null; var1 = (class55) class313.field5312.method775(26517)) {
            if (var1.field923 > 0) {
                var1.field923--;
            }
            if (var1.field923 != 0) {
                if (var1.field916 > 0) {
                    var1.field916--;
                }
                if (var1.field916 == 0 && var1.field929 >= 1 && var1.field921 >= 1 && var1.field929 <= 102 && var1.field921 <= 102 && (var1.field922 < 0 || class14.method165(var1.field922, false, var1.field931))) {
                    class13.method158(var1.field930, var1.field931, 247251928, var1.field922, var1.field921, var1.field925, var1.field927, var1.field929);
                    var1.field916 = -1;
                    if (var1.field922 == var1.field914 && var1.field914 == -1) {
                        var1.method232(arg0 ^ 0x21B7);
                    } else if (var1.field922 == var1.field914 && var1.field927 == var1.field917 && var1.field931 == var1.field918) {
                        var1.method232(128);
                    }
                }
            } else if (var1.field914 < 0 || class14.method165(var1.field914, false, var1.field918)) {
                class13.method158(var1.field930, var1.field918, 247251928, var1.field914, var1.field921, var1.field925, var1.field917, var1.field929);
                var1.method232(128);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lbl;", line = 95)
    public static final class299 method1135(int arg0, int arg1, int arg2) {
        class299 var3 = (class299) class241.field4162.method1151((long) arg2 << 32 | (long) arg0, 0);
        int var4 = 5 / ((-arg1 - 36) / 56);
        field2779++;
        if (var3 == null) {
            var3 = new class299(arg2, arg0);
            class241.field4162.method1149(var3, var3.field417, -103);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V", line = 135)
    public static void method1136(byte arg0) {
        field2788 = null;
        field2778 = null;
        if (arg0 == -19) {
            field2781 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIJB)Lcd;", line = 147)
    public static final class64 method1137(boolean arg0, int arg1, long arg2, byte arg3) {
        field2786++;
        int var5 = 63 / ((-arg3 - 56) / 56);
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var6 = 1;
        for (long var7 = arg2 / (long) arg1; var7 != 0L; var7 /= (long) arg1) {
            var6++;
        }
        int var9 = var6;
        if (arg2 < 0L || arg0) {
            var9 = var6 + 1;
        }
        byte[] var10 = new byte[var9];
        if (arg2 < 0L) {
            var10[0] = 45;
        } else if (arg0) {
            var10[0] = 43;
        }
        for (int var11 = 0; var11 < var6; var11++) {
            int var12 = (int) (arg2 % (long) arg1);
            if (var12 < 0) {
                var12 = -var12;
            }
            arg2 /= (long) arg1;
            if (var12 > 9) {
                var12 += 39;
            }
            var10[var9 - var11 - 1] = (byte) (var12 + 48);
        }
        class64 var13 = new class64();
        var13.field1274 = var9;
        var13.field1252 = var10;
        return var13;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBLkh;)V", line = 211)
    private final void method1138(int arg0, byte arg1, class13 arg2) {
        if (arg0 == 2) {
            this.field2784 = arg2.method112((byte) 92);
        }
        if (arg1 != 59) {
            method1134(-43);
        }
        field2789++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLkh;)V", line = 230)
    public final void method1139(boolean arg0, class13 arg1) {
        if (arg0) {
            method1133(true, -12);
        }
        field2783++;
        while (true) {
            int var3 = arg1.method152((byte) -119);
            if (var3 == 0) {
                return;
            }
            this.method1138(var3, (byte) 59, arg1);
        }
    }
}
