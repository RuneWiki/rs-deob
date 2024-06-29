import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class156 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3115 = 1;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lcd;")
    private static class23 field3124 = class54.method414("white:", -1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lcd;")
    public static class23 field3114 = field3124;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lcd;")
    public static class23 field3116 = field3124;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
    public static int[] field3120 = new int[25];

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
    public static int[] field3125;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIIZ)Lcd;")
    public static final class23 method956(boolean arg0, int arg1, int arg2, boolean arg3) {
        field3119++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        int var5 = arg2 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            arg2 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class23 var9 = new class23();
        var9.field480 = var7;
        if (arg0) {
            field3120 = null;
        }
        var9.field473 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method957(byte arg0) {
        field3116 = null;
        field3125 = null;
        field3114 = null;
        if (arg0 != -78) {
            method956(false, -24, 101, false);
        }
        field3120 = null;
        field3124 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Laa;")
    public static final class2 method958(int arg0, int arg1) {
        field3118++;
        class2 var2 = (class2) class19.field402.method995(107, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 1) {
            method957((byte) 120);
        }
        class2 var3 = class175.method1102(0, class85.field1835, false, class30.field655, arg1);
        if (var3 != null) {
            class19.field402.method990(var3, (long) arg1, -120);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method959(int arg0) {
        class203.field4001.method1319(-6648);
        class124.field2540 = null;
        field3117++;
        class190.field3775 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
    public static final int method960(int arg0, int arg1, int arg2) {
        field3123++;
        if (arg0 != 12018) {
            field3125 = null;
        }
        class191 var3 = (class191) class204.field4021.method260((long) arg1, (byte) 28);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3786.length; var5++) {
                if (var3.field3790[var5] == arg2) {
                    var4 += var3.field3786[var5];
                }
            }
            return var4;
        }
    }
}
