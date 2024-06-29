import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class254 extends class430 {

    @OriginalMember(owner = "client!za", name = "h", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "[I")
    public static int[] field3670 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!za", name = "j", descriptor = "F")
    public static float field3669;

    @OriginalMember(owner = "client!za", name = "g", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V", line = 3)
    public static void method1700(byte arg0) {
        int var1 = -106 / ((arg0 + 65) / 37);
        field3670 = null;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(BZ)V", line = 13)
    public static final void method1701(byte arg0, boolean arg1) {
        class569.method3387(0);
        field3668++;
        if (!class25.method106(class369.field5392, 78)) {
            return;
        }
        class512.field7418++;
        if (class512.field7418 < 50 && !arg1) {
            return;
        }
        class512.field7418 = 0;
        if (arg0 > -126) {
            field3669 = -0.8262268F;
        }
        if (!class298.field4067 && class325.field4415 != null) {
            class342.field4691++;
            class88 var2 = class448.method2741((byte) 87, class148.field2161, class583.field8319);
            class523.method3183(var2, (byte) 31);
            try {
                class521.method3165((byte) 102);
            } catch (IOException var3) {
                class298.field4067 = true;
            }
        }
        class569.method3387(0);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(BLha;)V", line = 59)
    public static final void method1702(byte arg0, class543 arg1) {
        field3666++;
        int var2 = 0;
        int var3 = 0;
        if (class416.field5919) {
            var2 = class352.method2243(arg0 ^ 0x41);
            var3 = class695.method3915((byte) 86);
        }
        arg1.method297(var2, var3, class68.field1042 + var2, 350 - -var3);
        arg1.method397(var2, var3, class68.field1042, 350, class348.field5140 << 24 | 0x332277, 1);
        class545.method3277(var2, var3, class68.field1042 + var2, -69, var3 + 350);
        int var4 = 350 / class408.field5803;
        if (class379.field5507 > 0) {
            int var5 = 346 - class408.field5803 - 4;
            int var6 = var4 * var5 / (class379.field5507 + var4 - 1);
            int var7 = 4;
            if (class379.field5507 > 1) {
                var7 += (var5 - var6) * (class379.field5507 - class319.field4347 - 1) / (class379.field5507 - 1);
            }
            arg1.method397(class68.field1042 + var2 - 16, var3 + var7, 12, var6, class348.field5140 << 24 | 0x332277, 2);
            for (int var8 = class319.field4347; var8 < class319.field4347 + var4 && class379.field5507 > var8; var8++) {
                String[] var9 = class330.method2035('\b', class445.field6360[var8], (byte) 9);
                int var10 = (class68.field1042 - 24) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = (var10 * var11) + 8;
                    arg1.method297(var2 + var12, var3, var2 + var12 + var10 - 8, var3 + 350);
                    class208.field3141.method2433(-16777216, -1, var2 + var12, arg0 ^ 0x71, class194.method1373(var9[var11], (byte) -119), var3 + 350 - class79.field1140.field7295 - class249.field3619 - ((-class319.field4347 + var8) * class408.field5803) - 2);
                }
            }
        }
        class564.field8163.method2427(-16777216, var2 + class68.field1042 - 25, "Build: 630", var3 + 350 - 20, -1, (byte) 51);
        if (arg0 != 113) {
            return;
        }
        arg1.method297(var2, var3, var2 + class68.field1042, var3 + 350);
        arg1.method3260(var3 + 350 - class249.field3619, class68.field1042, -102, var2, -1);
        class193.field2838.method2433(-16777216, -1, var2 + 10, 0, "--> " + class194.method1373(class683.field9700, (byte) -98), var3 + 350 - class119.field1635.field7295 - 1);
        if (!class240.field3557) {
            return;
        }
        int var13 = -1;
        if (class703.field9918 % 30 > 15) {
            var13 = 16777215;
        }
        arg1.method3258(var13, var3 + 350 - class119.field1635.field7295 - 11, 12, 122, var2 - (-class119.field1635.method3063(0, "--> " + class194.method1373(class683.field9700, (byte) -109).substring(0, class308.field4179)) - 10));
    }
}
