import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class259 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[Lpb;")
    public static class154[] field4492 = new class154[100];

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lia;")
    private static class257 field4498 = class28.method234(-31, "glow1:");

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lia;")
    public static class257 field4494 = field4498;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lia;")
    public static class257 field4493 = field4498;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lia;")
    public static class257 field4503 = class28.method234(116, "; Expires=");

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lmj;")
    public class206 field4505;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Lvb;")
    public static class226 field4502;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
    public static int[] field4490;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[I")
    public int[] field4499;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[Lfe;")
    public static class155[] field4495;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[[I")
    public static int[][] field4497;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBIIIII)I")
    public static final int method1725(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg6;
            arg6 = var7;
        }
        int var8 = arg3 & 0x3;
        field4501++;
        if (var8 == 0) {
            return arg4;
        }
        if (arg1 != -107) {
            field4492 = null;
        }
        if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 - (arg5 - 1) - arg4;
        } else {
            return 1 - (arg6 + arg0 - 7);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIIIII)I")
    public static final int method1726(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        field4504++;
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg4;
        }
        if (!arg0) {
            method1726(true, -10, -24, -91, 118, -102, -126);
        }
        if (var8 == 1) {
            return (7 - arg6) + 1 - arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg4;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lfk;")
    public static final class125 method1727(int arg0, int arg1) {
        field4491++;
        class125 var2 = (class125) class26.field505.method615(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class160.field2806.method1197(arg0, arg1, -2);
        class125 var4 = new class125();
        if (var3 != null) {
            var4.method873(true, new class152(var3));
        }
        class26.field505.method619((byte) 86, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1728(byte arg0) {
        field4502 = null;
        field4493 = null;
        field4492 = null;
        field4497 = null;
        field4503 = null;
        field4495 = null;
        if (arg0 >= 92) {
            field4490 = null;
            field4498 = null;
            field4494 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(JB)V")
    public static final void method1729(long arg0, byte arg1) {
        field4500++;
        if (arg1 <= 12) {
            field4498 = null;
        }
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class185.field3215; var3++) {
            if (class175.field2981[var3] == arg0) {
                class185.field3215--;
                for (int var4 = var3; var4 < class185.field3215; var4++) {
                    class175.field2981[var4] = class175.field2981[var4 + 1];
                    class221.field3743[var4] = class221.field3743[var4 + 1];
                }
                class243.field4205++;
                class188.field3252 = class111.field2038;
                class205.field3524.method908(false, 120);
                class205.field3524.method1044(false, arg0);
                return;
            }
        }
    }
}
