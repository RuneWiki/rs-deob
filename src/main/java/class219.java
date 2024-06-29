import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class219 extends class90 {

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "[I")
    public static int[] field3235 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "[I")
    public static int[] field3242 = new int[25];

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Ldp;")
    public static class319 field3233;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Ljava/lang/String;")
    public String field3232;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "[C")
    public char[] field3237;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "[C")
    public char[] field3240;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "[I")
    public int[] field3238;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "[I")
    public int[] field3241;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IC)I", line = 4)
    public final int method1442(int arg0, char arg1) {
        field3239++;
        if (this.field3241 == null) {
            return -1;
        } else if (arg0 > -41) {
            return 78;
        } else {
            for (int var3 = 0; var3 < this.field3241.length; var3++) {
                if (this.field3240[var3] == arg1) {
                    return this.field3241[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLre;)V", line = 30)
    public final void method1443(boolean arg0, class446 arg1) {
        while (true) {
            int var3 = arg1.method2628(49152);
            if (var3 == 0) {
                field3236++;
                if (!arg0) {
                    this.field3232 = null;
                    return;
                }
                return;
            }
            this.method1445(var3, arg1, 99);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZBI)I", line = 55)
    public static final int method1444(boolean arg0, byte arg1, int arg2) {
        field3229++;
        if (arg0) {
            return 0;
        }
        int var3 = -104 % ((-arg1 - 29) / 45);
        class341 var4 = class271.method1763(arg0, arg2, false);
        if (var4 == null) {
            return class200.field3021.method2346(arg2, 5).field4558;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field5108.length; var6++) {
            if (var4.field5108[var6] == -1) {
                var5++;
            }
        }
        return var5 + class200.field3021.method2346(arg2, 5).field4558 - var4.field5108.length;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILre;I)V", line = 95)
    private final void method1445(int arg0, class446 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3232 = arg1.method2582((byte) -80);
        } else if (arg0 == 2) {
            int var4 = arg1.method2628(49152);
            this.field3238 = new int[var4];
            this.field3237 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3238[var5] = arg1.method2631(2530);
                byte var6 = arg1.method2642(true);
                this.field3237[var5] = var6 == 0 ? 0 : class372.method2308(var6, (byte) -70);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method2628(arg2 ^ 0xC063);
            this.field3241 = new int[var7];
            this.field3240 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3241[var8] = arg1.method2631(2530);
                byte var9 = arg1.method2642(true);
                this.field3240[var8] = var9 == 0 ? 0 : class372.method2308(var9, (byte) -70);
            }
        }
        if (arg2 != 99) {
            this.method1442(122, (char) 65466);
        }
        field3243++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V", line = 160)
    public final void method1446(boolean arg0) {
        if (!arg0) {
            this.method1448('-', -118);
        }
        if (this.field3241 != null) {
            for (int var2 = 0; var2 < this.field3241.length; var2++) {
                this.field3241[var2] = class347.method2139(this.field3241[var2], 32768);
            }
        }
        field3230++;
        if (this.field3238 != null) {
            for (int var3 = 0; var3 < this.field3238.length; var3++) {
                this.field3238[var3] = class347.method2139(this.field3238[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lbu;", line = 192)
    public static final class99 method1447(int arg0, int arg1) {
        field3234++;
        class99 var2 = (class99) class427.field6095.method1896((long) arg1, (byte) -58);
        if (var2 != null) {
            return var2;
        }
        int var3 = 18 / ((-arg0 - 49) / 60);
        byte[] var4 = class119.field1664.method2691(0, arg1, 0);
        if (var4 == null || var4.length <= 1) {
            return null;
        } else {
            class99 var5 = class485.method2838(var4, -2);
            class427.field6095.method1898((long) arg1, var5, (byte) 6);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(CI)I", line = 225)
    public final int method1448(char arg0, int arg1) {
        field3231++;
        if (this.field3238 == null) {
            return -1;
        }
        int var3 = 74 % ((26 - arg1) / 63);
        for (int var4 = 0; var4 < this.field3238.length; var4++) {
            if (this.field3237[var4] == arg0) {
                return this.field3238[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 251)
    public static void method1449(byte arg0) {
        field3235 = null;
        if (arg0 != -55) {
            method1449((byte) 32);
        }
        field3242 = null;
        field3233 = null;
    }
}
