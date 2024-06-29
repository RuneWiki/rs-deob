import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class146 {

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
    public static int[] field2640 = new int[2];

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "[I")
    public static int[] field2641 = new int[2048];

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field2642 = -1;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Lei;")
    public static class215 field2637;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 7)
    public static void method1166(int arg0) {
        field2641 = null;
        field2640 = null;
        if (arg0 != -19) {
            method1170(-122);
        }
        field2637 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)Llg;", line = 21)
    public static final class137 method1167(int arg0, int arg1) {
        field2638++;
        if (arg0 != 1169843632) {
            field2636 = 56;
        }
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class109.field1852[var3] == null || class109.field1852[var3][var2] == null) {
            boolean var4 = class272.method1863(-671591600, var3);
            if (!var4) {
                return null;
            }
        }
        return class109.field1852[var3][var2];
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)I", line = 48)
    public static final int method1168(int arg0, int arg1) {
        field2635++;
        int var2 = 104 % ((-arg0 - 63) / 36);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 61)
    public static final void method1169(byte arg0) {
        int var1 = class42.field621;
        int var2 = class213.field3590;
        field2643++;
        int var3 = class68.field1114;
        int var4 = class292.field4678;
        if (arg0 > -30) {
            method1170(70);
        }
        int var5 = 6116423;
        if (class43.field680) {
            class169.method1337(var2, var1, var3, var4, var5);
            class169.method1337(var2 + 1, var1 - -1, var3 - 2, 16, 0);
            class169.method1325(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        } else {
            class47.method422(var2, var1, var3, var4, var5);
            class47.method422(var2 + 1, var1 + 1, var3 - 2, 16, 0);
            class47.method416(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        }
        class177.field3014.method2240(class5.field74, var2 + 3, var1 + 14, var5, -1);
        int var6 = class284.field4508;
        int var7 = class258.field4182;
        for (int var8 = 0; var8 < class293.field4708; var8++) {
            int var9 = (class293.field4708 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var2 < var6 && var6 < var2 + var3 && (var9 - 13) < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class177.field3014.method2240(class352.method2453(var8, 27884), var2 + 3, var9, var10, 0);
        }
        class89.method781(class213.field3590, class68.field1114, class292.field4678, 0, class42.field621);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 122)
    public static final void method1170(int arg0) {
        field2639++;
        if (class199.field3403) {
            return;
        }
        class247.field4003 = true;
        class199.field3403 = true;
        if (arg0 != -17) {
            method1167(-71, -44);
        }
        if (class38.field572) {
            class288.field4590 = (float) ((int) class288.field4590 - 17 & 0xFFFFFFF0);
        } else {
            class349.field5549 += (-12.0F - class349.field5549) / 2.0F;
        }
    }
}
