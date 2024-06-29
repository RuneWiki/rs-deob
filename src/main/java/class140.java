import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class140 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "Lrb;")
    public static class352 field2018 = new class352("", 10);

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public static int field2022 = 0;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "Lqfa;")
    public static class98 field2021 = new class98(14, -1);

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "Lqfa;")
    public static class98 field2024 = new class98(52, 6);

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "[[[B")
    public static byte[][][] field2023;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V", line = 4)
    public static final void method985(byte arg0) {
        class592.field8338 = 0;
        field2020++;
        if (arg0 != -73) {
            method986(true);
        }
        int var1 = (class660.field9039.field1264 >> 9) + class228.field3063;
        int var2 = (class660.field9039.field1250 >> 9) + class3.field30;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class592.field8338 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class592.field8338 = 1;
        }
        if (class592.field8338 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class592.field8338 = 0;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V", line = 36)
    public static void method986(boolean arg0) {
        if (arg0) {
            field2018 = null;
        }
        field2018 = null;
        field2024 = null;
        field2023 = null;
        field2021 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lvc;IIIII)Ljava/awt/Frame;", line = 57)
    public static final Frame method987(class316 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2019++;
        if (!arg0.method2043(18)) {
            return null;
        }
        if (arg3 == 0) {
            class611[] var6 = class605.method3400(arg0, (byte) 1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field8576 == arg1 && var6[var8].field8579 == arg4 && (arg2 == 0 || var6[var8].field8580 == arg2) && (!var7 || var6[var8].field8578 > arg3)) {
                    arg3 = var6[var8].field8578;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class249 var9 = arg0.method2051(arg2, 82, arg4, arg3, arg1);
        while (var9.field3310 == 0) {
            class756.method4205(10L, 0);
        }
        int var10 = 6 / ((45 - arg5) / 48);
        Frame var11 = (Frame) var9.field3311;
        if (var11 == null) {
            return null;
        } else if (var9.field3310 == 2) {
            class3.method13(arg0, (byte) -104, var11);
            return null;
        } else {
            return var11;
        }
    }
}
