import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class225 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lvd;")
    public static class222 field4205 = class212.method1357("Hidden)2", 10731);

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Lvd;")
    private static class222 field4206 = class212.method1357("Select a world", 10731);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lvd;")
    public static class222 field4203 = class212.method1357("Sie haben gerade eine andere Welt verlassen)3", 10731);

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field4209 = 0;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lvd;")
    public static class222 field4204 = field4206;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIII)Lvd;")
    public static final class222 method1470(boolean arg0, int arg1, int arg2, int arg3) {
        field4212++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        for (int var5 = arg3 / arg2; var5 != 0; var5 /= arg2) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        int var8 = 89 % ((arg1 + 26) / 55);
        for (int var9 = 0; var9 < var4; var9++) {
            int var11 = arg3 % arg2;
            arg3 /= arg2;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var7[var6 - var9 - 1] = (byte) (var11 + 48);
        }
        class222 var10 = new class222();
        var10.field4163 = var7;
        var10.field4121 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(JI)V")
    public static final void method1471(long arg0, int arg1) {
        field4207++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 != -23364) {
            field4204 = null;
        }
        if (arg0 % 10L == 0L) {
            class213.method1360(arg0 - 1L, -123);
            class213.method1360(1L, -124);
        } else {
            class213.method1360(arg0, arg1 ^ 0x5B39);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BJ)Lvd;")
    public static final class222 method1472(byte arg0, long arg1) {
        int var3 = -39 % ((arg0 + 24) / 51);
        class63.field1162.setTime(new Date(arg1));
        int var4 = class63.field1162.get(7);
        field4208++;
        int var5 = class63.field1162.get(5);
        int var6 = class63.field1162.get(2);
        int var7 = class63.field1162.get(1);
        int var8 = class63.field1162.get(11);
        int var9 = class63.field1162.get(12);
        int var10 = class63.field1162.get(13);
        return class234.method1531(new class222[] { class149.field2851[var4 - 1], class94.field1770, class56.method414(-118, var5 / 10), class56.method414(-94, var5 % 10), class111.field2079, class72.field1408[var6], class111.field2079, class56.method414(-94, var7), class55.field1040, class56.method414(-125, var8 / 10), class56.method414(-125, var8 % 10), class201.field3683, class56.method414(-102, var9 / 10), class56.method414(-102, var9 % 10), class201.field3683, class56.method414(-128, var10 / 10), class56.method414(-95, var10 % 10), class104.field1925 }, -10949);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method1473(int arg0) {
        field4205 = null;
        field4204 = null;
        field4206 = null;
        field4203 = null;
        if (arg0 != 18545) {
            method1471(-17L, 86);
        }
    }
}
