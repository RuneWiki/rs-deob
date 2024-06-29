import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class212 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ljf;")
    public static class229 field3642 = method1457((byte) 65, "Module texte charg-B");

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Ljf;")
    public static class229 field3644 = method1457((byte) 74, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[J")
    public static long[] field3643 = new long[100];

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lek;")
    public static class185 field3641;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)I", line = 10)
    public static final int method1453(int arg0, int arg1, int arg2, int arg3) {
        field3640++;
        if ((class142.field2464[arg3][arg2][arg0] & 0x8) == 0) {
            int var4 = -75 / ((61 - arg1) / 52);
            return arg3 <= 0 || (class142.field2464[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 28)
    public static void method1454(boolean arg0) {
        field3644 = null;
        if (!arg0) {
            field3643 = null;
            field3641 = null;
            field3642 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)[Lkb;", line = 50)
    public static final class35[] method1455(int arg0) {
        field3639++;
        class35[] var1 = new class35[class315.field5348];
        for (int var2 = arg0; var2 < class315.field5348; var2++) {
            int var3 = class6.field71[var2] * class232.field4025[var2];
            byte[] var4 = class21.field357[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class64.field1115[class305.method2086(var4[var6], 255)];
            }
            if (class108.field1900) {
                var1[var2] = new class326(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], var5);
            } else {
                var1[var2] = new class159(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], var5);
            }
        }
        class62.method466((byte) 74);
        return var1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Llc;", line = 92)
    public static final class167 method1456(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class167 var4 = var3.field2198;
            var3.field2198 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/lang/String;)Ljf;", line = 111)
    public static final class229 method1457(byte arg0, String arg1) {
        field3638++;
        byte[] var2 = arg1.getBytes();
        if (arg0 <= 56) {
            method1455(-47);
        }
        int var3 = var2.length;
        class229 var4 = new class229();
        var4.field3944 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3944[var4.field3973++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field3944[var4.field3973++] = (byte) var6;
            }
        }
        var4.method1616(false);
        return var4.method1646((byte) -22);
    }
}
