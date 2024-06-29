import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class142 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field2084 = -2;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[Lvl;")
    public static class6[] field2085 = new class6[50];

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2089 = 0;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[I")
    public static int[] field2091 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lhf;IZ)V", line = 11)
    public static final void method909(class154 arg0, int arg1, boolean arg2) {
        if (arg1 != -1) {
            method911(-72);
        }
        field2087++;
        if (arg2) {
            class66.field1037 = 3;
            class79.method542((byte) 83, false);
            class116.field1731 = false;
            class117.field1781 = false;
            class21.field346 = 0;
            class264.field4522 = false;
            class247.field4092 = 255;
            class77.field1208 = false;
            class190.field2973 = false;
            class73.field1151 = 0;
            class80.field1239 = false;
            class265.field4531 = false;
            class236.field3895 = 0;
            class130.field1955 = 127;
            class8.field114 = false;
            class264.field4492 = 127;
            class234.field3870 = false;
            class181.field2765 = false;
            class275.field4685 = false;
            class86.field1300 = 0;
            class112.field1663 = false;
            class130.method860(arg0, 0);
            return;
        }
        class291 var3 = null;
        class66.field1037 = 3;
        class79.method542((byte) 126, true);
        class112.field1663 = true;
        class265.field4531 = true;
        class190.field2973 = true;
        class86.field1300 = 0;
        class21.field346 = 0;
        class8.field114 = true;
        class236.field3895 = 2;
        class234.field3870 = true;
        class73.field1151 = 0;
        class77.field1208 = true;
        class116.field1731 = true;
        class247.field4092 = 255;
        class275.field4685 = true;
        class80.field1239 = true;
        class130.field1955 = 127;
        class264.field4492 = 127;
        class181.field2765 = true;
        class264.field4522 = true;
        class117.field1781 = true;
        try {
            class32 var4 = arg0.method990("runescape", true);
            while (var4.field497 == 0) {
                class116.method759(arg1, 1L);
            }
            if (var4.field497 == 1) {
                var3 = (class291) var4.field496;
                int var5 = 0;
                byte[] var6 = new byte[(int) var3.method1967(70)];
                while (var6.length > var5) {
                    int var7 = var3.method1962((byte) -103, var6.length - var5, var5, var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                    var5 += var7;
                }
                class13.method130((byte) -70, new class221(var6));
            }
        } catch (Exception var11) {
        }
        try {
            if (var3 != null) {
                var3.method1966(arg1 ^ 0xFFFFFFFE);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V", line = 112)
    public static void method910(boolean arg0) {
        field2091 = null;
        field2085 = null;
        if (!arg0) {
            field2085 = (class6[]) null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 134)
    public static final void method911(int arg0) {
        if (arg0 != 0) {
            method909((class154) null, 89, true);
        }
        field2086++;
        class194 var1 = class61.field954;
        synchronized (class61.field954) {
            class153.field2255++;
            client.field1760 = class155.field2304;
            if (class15.field280 >= 0) {
                while (class303.field5115 != class15.field280) {
                    int var2 = class303.field5114[class303.field5115];
                    class303.field5115 = class303.field5115 + 1 & 0x7F;
                    if (var2 < 0) {
                        class234.field3872[~var2] = false;
                    } else {
                        class234.field3872[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class234.field3872[var3] = false;
                }
                class15.field280 = class303.field5115;
            }
            class155.field2304 = class29.field475;
        }
    }
}
