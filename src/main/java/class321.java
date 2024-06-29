import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class321 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "[Lph;")
    public static class229[] field5439 = new class229[8];

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "[S")
    public static short[] field5443 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lph;")
    public static class229 field5441 = class266.method1858("", 0);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[I")
    public static int[] field5434;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
    public static int[] field5442;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[[[I")
    public static int[][][] field5438;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 15)
    public static final void method2174(int arg0) {
        field5433++;
        if (arg0 > -66) {
            return;
        }
        for (class201 var1 = (class201) class226.field3712.method1580((byte) -39); var1 != null; var1 = (class201) class226.field3712.method1579((byte) 28)) {
            class251 var2 = var1.field3326;
            if (class298.field4849 != var2.field4206 || class319.field5393 > var2.field4197) {
                var1.method598(61);
            } else if (class319.field5393 >= var2.field4167) {
                if (var2.field4187 > 0) {
                    class217 var3 = class187.field3035[var2.field4187 - 1];
                    if (var3 != null && var3.field5147 >= 0 && var3.field5147 < 13312 && var3.field5168 >= 0 && var3.field5168 < 13312) {
                        var2.method1761((byte) -126, class319.field5393, class259.method1801(var3.field5168, -20428, var2.field4206, var3.field5147) - var2.field4192, var3.field5147, var3.field5168);
                    }
                }
                if (var2.field4187 < 0) {
                    int var4 = -var2.field4187 - 1;
                    class209 var5;
                    if (class145.field2354 == var4) {
                        var5 = class230.field3820;
                    } else {
                        var5 = class114.field1931[var4];
                    }
                    if (var5 != null && var5.field5147 >= 0 && var5.field5147 < 13312 && var5.field5168 >= 0 && var5.field5168 < 13312) {
                        var2.method1761((byte) -115, class319.field5393, class259.method1801(var5.field5168, -20428, var2.field4206, var5.field5147) - var2.field4192, var5.field5147, var5.field5168);
                    }
                }
                var2.method1760(-18161, class69.field1106);
                class237.method1670(class298.field4849, (int) var2.field4186, (int) var2.field4202, (int) var2.field4171, 60, var2, var2.field4179, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I", line = 79)
    public static final int method2175(boolean arg0, KeyEvent arg1) {
        field5437++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (!arg0) {
            method2179(-42);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)V", line = 101)
    public static final void method2176(int arg0, byte arg1) {
        int var2 = -111 / ((arg1 - 78) / 43);
        field5435++;
        class166.field2704.method1418((byte) -17, arg0);
        class195.field3251.method1418((byte) -17, arg0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V", line = 113)
    public static final void method2177() {
        if (class277.field4604 != null) {
            for (int var0 = 0; var0 < class277.field4604.length; var0++) {
                for (int var1 = 0; var1 < class88.field1504; var1++) {
                    for (int var2 = 0; var2 < class129.field2114; var2++) {
                        class277.field4604[var0][var1][var2] = null;
                    }
                }
            }
        }
        class37.field600 = (class264[][]) null;
        if (class324.field5533 != null) {
            for (int var3 = 0; var3 < class324.field5533.length; var3++) {
                for (int var4 = 0; var4 < class88.field1504; var4++) {
                    for (int var5 = 0; var5 < class129.field2114; var5++) {
                        class324.field5533[var3][var4][var5] = null;
                    }
                }
            }
        }
        class132.field2142 = (class264[][]) null;
        class103.field1755 = 0;
        if (class75.field1268 != null) {
            for (int var6 = 0; var6 < class103.field1755; var6++) {
                class75.field1268[var6] = null;
            }
        }
        if (class24.field312 != null) {
            for (int var7 = 0; var7 < class45.field688; var7++) {
                class24.field312[var7] = null;
            }
            class45.field688 = 0;
        }
        if (class167.field2720 != null) {
            for (int var8 = 0; var8 < class167.field2720.length; var8++) {
                class167.field2720[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)J", line = 236)
    public static final long method2178(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        return var3 == null || var3.field1224 == null ? 0L : var3.field1224.field3414;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 244)
    public static void method2179(int arg0) {
        field5441 = null;
        field5438 = (int[][][]) null;
        field5439 = null;
        if (arg0 == 0) {
            field5434 = null;
            field5442 = null;
            field5443 = null;
        }
    }
}
