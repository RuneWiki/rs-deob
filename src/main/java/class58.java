import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class58 {

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public int field803 = 0;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lbe;")
    public static class283 field799 = class153.method941(125, ")1");

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lbe;")
    private static class283 field804 = class153.method941(126, "Take");

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lbe;")
    public static class283 field793 = field804;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lj;")
    public static class269 field797 = new class269();

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lt;")
    public static class239 field805 = new class239(8);

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lbe;")
    public static class283 field806 = class153.method941(-70, "(R");

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lng;")
    public static class150 field796;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Lsd;", line = 5)
    public static final class26 method373(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2627; var4++) {
            class26 var5 = var3.field2623[var4];
            if ((var5.field379 >> 29 & 0x3L) == 2L && var5.field398 == arg1 && var5.field394 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILfe;)V", line = 30)
    private final void method374(int arg0, int arg1, class229 arg2) {
        if (arg1 == 0) {
            if (arg0 == 5) {
                this.field803 = arg2.method1496(true);
            }
            field800++;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 69)
    public static final void method375(int arg0) {
        field791++;
        int var1 = 20 % ((-arg0 - 38) / 46);
        class303.field5120.method1631(-27875);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lek;Lek;Lek;I)V", line = 79)
    public static final void method376(class172 arg0, class172 arg1, class172 arg2, int arg3) {
        if (arg3 >= -46) {
            method381(99);
        }
        class197.field3371 = arg2;
        class142.field2363 = arg0;
        class298.field5050 = arg1;
        field792++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lbe;", line = 92)
    public static final class283 method377(int arg0, int arg1) {
        if (arg1 != 8) {
            field805 = (class239) null;
        }
        field798++;
        return class299.method2022(new class283[] { class296.method2012(arg0 >> 24 & 0xFF, (byte) -119), class195.field3331, class296.method2012((arg0 & 0xFFC4E3) >> 16, (byte) -77), class195.field3331, class296.method2012(arg0 >> 8 & 0xFF, (byte) 114), class195.field3331, class296.method2012(arg0 & 0xFF, (byte) -122) }, (byte) 87);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([SI)[S", line = 105)
    public static final short[] method378(short[] arg0, int arg1) {
        field801++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < 126) {
            method378((short[]) null, 46);
        }
        short[] var2 = new short[arg0.length];
        class136.method848(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 136)
    public static void method379(int arg0) {
        if (arg0 >= -116) {
            method379(-105);
        }
        field805 = null;
        field796 = null;
        field806 = null;
        field799 = null;
        field793 = null;
        field804 = null;
        field797 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lfe;Z)V", line = 155)
    public final void method380(class229 arg0, boolean arg1) {
        field794++;
        while (true) {
            int var3 = arg0.method1535((byte) 114);
            if (var3 == 0) {
                if (!arg1) {
                    field797 = (class269) null;
                }
                return;
            }
            this.method374(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 177)
    public static final void method381(int arg0) {
        int var1 = (class214.field3637 >> 3) + (class116.field1976 >> 10);
        field802++;
        byte var2 = 0;
        int var3 = (class135.field2273 >> 10) + (class107.field1833 >> 3);
        byte var4 = 8;
        byte var5 = 18;
        class1.field10 = new int[var5][4];
        class113.field1903 = new byte[var5][];
        if (arg0 != 29744) {
            return;
        }
        class63.field872 = new byte[var5][];
        class62.field865 = new int[var5];
        class222.field3737 = new int[var5];
        class14.field147 = new byte[var5][];
        class254.field4296 = new byte[var5][];
        class177.field3039 = new int[var5];
        class85.field1443 = new byte[var5][];
        class103.field1761 = new int[var5];
        byte var6 = 8;
        class259.field4396 = new int[var5];
        class221.field3715 = new int[var5];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class177.field3039[var7] = var10;
                class259.field4396[var7] = class61.field849.method1097(class299.method2022(new class283[] { class259.field4414, class296.method2012(var8, (byte) 126), class299.field5061, class296.method2012(var9, (byte) 106) }, (byte) 63), class281.method1877(arg0, 29744));
                class103.field1761[var7] = class61.field849.method1097(class299.method2022(new class283[] { class66.field922, class296.method2012(var8, (byte) 116), class299.field5061, class296.method2012(var9, (byte) 124) }, (byte) 46), arg0 - 29744);
                class221.field3715[var7] = class61.field849.method1097(class299.method2022(new class283[] { class270.field4556, class296.method2012(var8, (byte) 120), class299.field5061, class296.method2012(var9, (byte) 109) }, (byte) 33), arg0 - 29744);
                class62.field865[var7] = class61.field849.method1097(class299.method2022(new class283[] { class115.field1940, class296.method2012(var8, (byte) 122), class299.field5061, class296.method2012(var9, (byte) 106) }, (byte) 89), 0);
                class222.field3737[var7] = class61.field849.method1097(class299.method2022(new class283[] { class24.field364, class296.method2012(var8, (byte) 114), class299.field5061, class296.method2012(var9, (byte) -26) }, (byte) 36), class281.method1877(arg0, 29744));
                if (class221.field3715[var7] == -1) {
                    class259.field4396[var7] = -1;
                    class103.field1761[var7] = -1;
                    class62.field865[var7] = -1;
                    class222.field3737[var7] = -1;
                }
                var7++;
            }
        }
        class54.method342(true, var6, -15993, var1, var3, var4, var2);
    }
}
