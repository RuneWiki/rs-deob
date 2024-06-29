import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class11 extends class25 {

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[F")
    public static float[] field218 = new float[4];

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "J")
    public static long field230;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lja;")
    public class60 field212;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lja;")
    public class60 field214;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Lcd;")
    public class64 field222;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Z")
    public boolean field213;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[Lqd;")
    public static class40[] field217;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "[Ljava/lang/Object;")
    public Object[] field229;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V", line = 10)
    public static void method90(int arg0) {
        if (arg0 != 28184) {
            field227 = 71;
        }
        field217 = null;
        field218 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I", line = 27)
    public static int method91(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLja;I)Lcd;", line = 42)
    public static final class64 method92(byte arg0, class60 arg1, int arg2) {
        if (arg0 != -49) {
            return (class64) null;
        }
        field224++;
        if (!class92.method694(arg2, arg0 ^ 0xFFFFFF85, client.method1762(arg1)) && arg1.field1122 == null) {
            return null;
        } else if (arg1.field1149 == null || arg2 >= arg1.field1149.length || arg1.field1149[arg2] == null || arg1.field1149[arg2].method501((byte) 64).method540(arg0 + 29030) == 0) {
            return class17.field346 ? class104.method768(new class64[] { class234.field3958, class310.method2149(arg2, (byte) -55) }, false) : null;
        } else {
            return arg1.field1149[arg2];
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIILa;IJZ)Z", line = 72)
    public static final boolean method93(int arg0, int arg1, int arg2, int arg3, int arg4, class262 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class88.method672(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)[Lvd;", line = 108)
    public static final class127[] method94(byte arg0) {
        field228++;
        class127[] var1 = new class127[class265.field4554];
        for (int var2 = 0; var2 < class265.field4554; var2++) {
            int var3 = class310.field5263[var2] * class223.field3811[var2];
            byte[] var4 = class58.field969[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class236.field3985[class224.method1614(255, var4[var6])];
            }
            var1[var2] = new class127(class24.field400, class46.field755, class234.field3959[var2], class251.field4365[var2], class223.field3811[var2], class310.field5263[var2], var5);
        }
        if (arg0 < 110) {
            return (class127[]) null;
        } else {
            class251.method1803(-1);
            return var1;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Z", line = 144)
    public static final boolean method95(int arg0, int arg1) {
        field216++;
        if (arg0 == 0) {
            return (arg1 & 0x3C722A6C) >> 29 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V", line = 157)
    public static final void method96(int arg0, boolean arg1) {
        class141.field2485 = arg1;
        int var2 = 38 % ((-arg0 - 19) / 55);
        field215++;
        class301.field5180 = !class141.method1001((byte) -31);
    }
}
