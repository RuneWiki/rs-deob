import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class292 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field4352 = 0;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Z")
    public static boolean field4355 = true;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lfm;")
    public static class53 field4354 = new class53(128);

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "[F")
    public static float[] field4357 = new float[4];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lkn;")
    public static class178 field4356;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V", line = 5)
    public static final void method1996(boolean arg0, int arg1) {
        class210.field3044 = -1;
        if (!arg0) {
            field4356 = (class178) null;
        }
        field4349++;
        class210.field3044 = -1;
        if (arg1 == 37) {
            class343.field5137 = 3.0F;
        } else if (arg1 == 50) {
            class343.field5137 = 4.0F;
        } else if (arg1 == 75) {
            class343.field5137 = 6.0F;
        } else if (arg1 == 100) {
            class343.field5137 = 8.0F;
        } else if (arg1 == 200) {
            class343.field5137 = 16.0F;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(CI)C", line = 38)
    public static final char method1997(char arg0, int arg1) {
        field4353++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else {
            if (arg1 != 23014) {
                field4357 = (float[]) null;
            }
            if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lkn;", line = 79)
    public static final class178 method1998(byte arg0) {
        field4351++;
        int var1 = class323.field4903[0] * class288.field4281[0];
        byte[] var2 = class209.field3012[0];
        class178 var6;
        if (class163.field2250[0]) {
            byte[] var3 = class185.field2553[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class190.method1334(class47.method303(var3[var5] << 24, -16777216), class235.field3331[class47.method303(var2[var5], 255)]);
            }
            var6 = new class114(class154.field2136, class194.field2674, class209.field3002[0], class274.field4115[0], class323.field4903[0], class288.field4281[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class235.field3331[class47.method303(255, var2[var8])];
            }
            var6 = new class178(class154.field2136, class194.field2674, class209.field3002[0], class274.field4115[0], class323.field4903[0], class288.field4281[0], var7);
        }
        class236.method1624(120);
        int var9 = -99 % ((-arg0 - 62) / 44);
        return var6;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 126)
    public static void method1999(int arg0) {
        field4354 = null;
        field4356 = null;
        field4357 = null;
        if (arg0 != -201) {
            method1997((char) 65477, 2);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V", line = 138)
    public static final void method2000(int arg0, int arg1) {
        class96 var2 = class186.field2565;
        synchronized (class186.field2565) {
            class106.field1427 = arg1;
            int var3 = -79 % ((14 - arg0) / 51);
        }
        field4350++;
    }
}
