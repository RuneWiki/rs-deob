import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class232 {

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
    public static int[] field3932 = new int[5];

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field3937 = 0;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field3936 = -1;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lek;")
    public static class172 field3931;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    public static int[] field3933;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I", line = 5)
    public static final int method1564(int arg0) {
        field3934++;
        if (class38.field547 == 0) {
            return 0;
        } else if (arg0 == 4) {
            return class207.field3560[class38.field547].method244();
        } else {
            return 8;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 33)
    public static void method1565(byte arg0) {
        field3931 = null;
        field3932 = null;
        field3933 = null;
        if (arg0 > -43) {
            field3933 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZII)V", line = 55)
    public static final void method1566(int arg0, boolean arg1, int arg2, int arg3) {
        field3929++;
        if (!arg1) {
            method1567(-75L, 68);
        }
        class72 var4 = class25.method174(arg2, (byte) -99, 4);
        var4.method477(-110);
        var4.field1268 = arg0;
        var4.field1265 = arg3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JI)Lbe;", line = 74)
    public static final class283 method1567(long arg0, int arg1) {
        field3935++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            int var6 = -90 / ((arg1 - 88) / 32);
            byte[] var7 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var7[var3] = class66.field928[(int) (var8 - (arg0 * 37L))];
            }
            class283 var10 = new class283();
            var10.field4843 = var7;
            var10.field4812 = var7.length;
            return var10;
        }
    }
}
