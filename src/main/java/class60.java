import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class60 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method406(int arg0, byte arg1) {
        field844++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        if (arg1 >= -105) {
            return 85;
        }
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x73333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 28)
    public static final void method407(int arg0, int arg1) {
        field847++;
        int var2 = class298.field4598;
        int var3 = class169.field2579;
        int var4 = class305.field4781;
        int var5 = (int) class309.field4866;
        int var6 = class225.field3592;
        int var7 = class199.field2989;
        if ((class43.field613 / 256) > var5) {
            var5 = class43.field613 / 256;
        }
        int var8 = (int) class123.field1922 + class265.field4098 & 0x7FF;
        if (class86.field1304[4] && class236.field3793[4] + 128 > var5) {
            var5 = class236.field3793[4] + 128;
        }
        class235.method1600(class330.field5100, class332.field5139, arg1, var8, var5 * 3 + 600, var5, (byte) 117, class39.method286(class77.field1154, (byte) 82, class79.field1173.field537, class79.field1173.field519) - 50);
        if (class298.field4598 == var2 && class169.field2579 == var3 && class225.field3592 == var6 && class199.field2989 == var7 && class305.field4781 == var4) {
            class219.field3489 = 1;
            return;
        }
        class284.field4357 = 10;
        class84.field1270 = 10;
        if (var2 < class298.field4598) {
            var2 += (class298.field4598 - var2) * class84.field1270 / 1000 + class284.field4357;
            if (var2 < class298.field4598) {
                class298.field4598 = var2;
            }
        }
        if (class225.field3592 > var6) {
            var6 += (class225.field3592 - var6) * class84.field1270 / 1000 + class284.field4357;
            if (var6 < class225.field3592) {
                class225.field3592 = var6;
            }
        }
        if (class169.field2579 > var3) {
            var3 += (class169.field2579 - var3) * class84.field1270 / 1000 + class284.field4357;
            if (var3 < class169.field2579) {
                class169.field2579 = var3;
            }
        }
        if (var6 > class225.field3592) {
            int var9 = var6 - ((var6 - class225.field3592) * class84.field1270 / 1000 + class284.field4357);
            if (var9 > class225.field3592) {
                class225.field3592 = var9;
            }
        }
        int var10 = class305.field4781 - var4;
        if (var3 > class169.field2579) {
            int var11 = var3 - ((var3 - class169.field2579) * class84.field1270 / 1000 + class284.field4357);
            if (class169.field2579 < var11) {
                class169.field2579 = var11;
            }
        }
        class27.field348 = 10;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (class298.field4598 < var2) {
            int var12 = var2 - ((var2 - class298.field4598) * class84.field1270 / 1000 + class284.field4357);
            if (var12 > class298.field4598) {
                class298.field4598 = var12;
            }
        }
        class90.field1364 = 10;
        if (var10 < -1024) {
            var10 += 2048;
        }
        if (class199.field2989 > var7) {
            var7 += (class199.field2989 - var7) * class90.field1364 / 1000 + class27.field348;
            if (var7 < class199.field2989) {
                class199.field2989 = var7;
            }
        }
        if (var10 > 0) {
            int var13 = class90.field1364 * var10 / 1000 + class27.field348 + var4;
            var4 = var13 & 0x7FF;
        }
        if (var7 > class199.field2989) {
            int var14 = var7 - ((var7 - class199.field2989) * class90.field1364 / 1000 + class27.field348);
            if (var14 > class199.field2989) {
                class199.field2989 = var14;
            }
        }
        if (var10 < 0) {
            int var15 = var4 - (-var10 * class90.field1364 / 1000 + class27.field348);
            var4 = var15 & 0x7FF;
        }
        int var16 = class305.field4781 - var4;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (arg0 <= var16 || var10 <= 0 || var16 > 0 && var10 < 0) {
            class305.field4781 = var4;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 177)
    public static final void method408(int arg0) {
        field843++;
        if (class253.field3936 != -1) {
            class264.method1748(class253.field3936, 80);
        }
        for (int var1 = 0; var1 < class64.field963; var1++) {
            if (class2.field12[var1]) {
                class19.field267[var1] = true;
            }
            class71.field1057[var1] = class2.field12[var1];
            class2.field12[var1] = false;
        }
        if (class333.field5166) {
            class270.field4159 = true;
        }
        class283.field4343 = class343.field5341;
        class80.field1190 = -1;
        class249.field3915 = null;
        class303.field4726 = -1;
        if (class253.field3936 != arg0) {
            class64.field963 = 0;
            class197.method1335(64);
        }
        if (class333.field5166) {
            class238.method1629();
        } else {
            class57.method386();
        }
        class81.field1208 = 0;
    }
}
