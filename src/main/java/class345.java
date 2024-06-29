import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class345 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field5344 = -1;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field5347 = -1;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ldh;")
    public static class179 field5346 = new class179(32);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[Lqm;")
    public static class247[] field5351 = new class247[14];

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field5352 = 2;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field5355 = 0;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    public int[] field5353;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 12)
    public static final void method2380(int arg0, Component arg1) {
        arg1.removeKeyListener(class138.field1928);
        arg1.removeFocusListener(class138.field1928);
        field5345++;
        class233.field3395 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILp;B)V", line = 23)
    public final void method2381(int arg0, class107 arg1, byte arg2) {
        int var4 = 90 / ((arg2 + 55) / 48);
        field5349++;
        while (true) {
            int var5 = arg1.method661(-1);
            if (var5 == 0) {
                return;
            }
            this.method2384(var5, arg0, (byte) 80, arg1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 41)
    public static void method2382(int arg0) {
        field5351 = null;
        if (arg0 != 1) {
            method2382(57);
        }
        field5346 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V", line = 53)
    public static final void method2383(int arg0, int arg1) {
        class225 var2 = class158.field2184[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class225 var4 = class158.field2184[var3][arg0][arg1] = class158.field2184[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3200--;
                for (int var5 = 0; var5 < var4.field3214; var5++) {
                    class80 var6 = var4.field3199[var5];
                    if ((var6.field1026 >> 29 & 0x3L) == 2L && var6.field1015 == arg0 && var6.field1027 == arg1) {
                        var6.field1025--;
                    }
                }
            }
        }
        if (class158.field2184[0][arg0][arg1] == null) {
            class158.field2184[0][arg0][arg1] = new class225(0, arg0, arg1);
        }
        class158.field2184[0][arg0][arg1].field3205 = var2;
        class158.field2184[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBLp;)V", line = 97)
    private final void method2384(int arg0, int arg1, byte arg2, class107 arg3) {
        if (arg2 < 15) {
            method2385(91);
        }
        if (arg0 == 1) {
            this.field5344 = arg3.method624(14612);
        } else if (arg0 == 2) {
            this.field5353 = new int[arg3.method661(-1)];
            for (int var5 = 0; var5 < this.field5353.length; var5++) {
                this.field5353[var5] = arg3.method624(14612);
            }
        } else if (arg0 == 3) {
            this.field5347 = arg3.method661(-1);
        }
        field5348++;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 136)
    public static final void method2385(int arg0) {
        class74.field951.method1241(113);
        if (arg0 == 9538) {
            field5350++;
            class167.field2325.method1241(123);
        }
    }
}
