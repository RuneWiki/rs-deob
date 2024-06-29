import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class216 extends class102 {

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Lfc;")
    public class7 field3713;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "[B")
    public static byte[] field3712 = new byte[32896];

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Lr;")
    private static class66 field3719;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lr;")
    public static class66 field3718;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V")
    public static final void method1391(byte arg0) {
        field3716++;
        class11.field137++;
        class28.field412.method578(-96, 42);
        if (arg0 >= 81) {
            class28.field412.method1651(true, 0L);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V")
    public static final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3715++;
        if (client.field1644 == 1) {
            class72.field1421[class42.field694 / 100].method980(class15.field191 - 8, class176.field3089 - 8);
        }
        if (client.field1644 == 2) {
            class72.field1421[class42.field694 / 100 + 4].method980(class15.field191 - 8, class176.field3089 + -8);
        }
        if (arg4 != -17234) {
            method1392(44, -23, -41, 64, -106);
        }
        class17.method67(-127);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lfc;)V")
    public class216(class7 arg0) {
        this.field3713 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V")
    public static void method1393(byte arg0) {
        field3712 = null;
        field3719 = null;
        field3718 = null;
        if (arg0 < 17) {
            field3712 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Llj;")
    public static final class44 method1394(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field219; var4++) {
            class44 var5 = var3.field220[var4];
            if ((var5.field780 >> 29 & 0x3L) == 2L && var5.field791 == arg1 && var5.field790 == arg2) {
                class32.method186(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLlh;)Lpg;")
    public static final class92 method1395(byte arg0, class249 arg1) {
        if (arg0 == 116) {
            field3714++;
            return new class92(arg1.method1684(-22489), arg1.method1684(-22489), arg1.method1684(arg0 - 22605), arg1.method1684(arg0 - 22605), arg1.method1684(arg0 - 22605), arg1.method1684(-22489), arg1.method1684(-22489), arg1.method1684(-22489), arg1.method1648((byte) 113), arg1.method1677(-6677));
        } else {
            return null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3712[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3719 = class93.method641(43, " from your friend list first)3");
        field3718 = field3719;
    }
}
