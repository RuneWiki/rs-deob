import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class155 extends class64 {

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "Lcd;")
    public static class23 field3103 = class54.method414(" )2> <col=ffffff>", -1);

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Lcd;")
    private static class23 field3100 = class54.method414("flash2:", -1);

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Lcd;")
    public static class23 field3101 = field3100;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "Lcd;")
    public static class23 field3112 = class54.method414("Verbindung mit Update)2Server)3)3)3", -1);

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "J")
    public static long field3110 = 0L;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "Lcd;")
    public static class23 field3105 = field3100;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "Lcd;")
    public static class23 field3109 = class54.method414("T", -1);

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "Lkh;")
    public static class97 field3113;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "[Loe;")
    public static class130[] field3108;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method952(Random arg0, int arg1, int arg2) {
        ++field3106;
        if (~arg1 >= -1) {
            throw new IllegalArgumentException();
        } else if (class17.method100(arg1, (byte) -73)) {
            return (int) ((4294967295L & (long) arg0.nextInt()) * (long) arg1 >> 32);
        } else {
            int var3 = 14 % ((arg2 - 68) / 42);
            int var4 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var5;
            do {
                var5 = arg0.nextInt();
            } while (~var4 >= ~var5);
            return class7.method42(var5, arg1, -118);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3102;
        int[] var3 = super.field1513.method1033(arg1 ^ 9358, arg0);
        if (arg1 != -9421) {
            return null;
        } else {
            if (super.field1513.field3368) {
                int var4 = class95.field1995[arg0];
                for (int var5 = 0; ~var5 > ~class168.field3367; ++var5) {
                    var3[var5] = this.method953(var4, (byte) 92, class174.field3475[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)I")
    private final int method953(int arg0, byte arg1, int arg2) {
        ++field3111;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        if (arg1 != 92) {
            this.method953(-38, (byte) 15, -118);
        }
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method954(byte arg0) {
        if (arg0 != 77) {
            field3105 = null;
        }
        field3101 = null;
        field3109 = null;
        field3108 = null;
        field3105 = null;
        field3103 = null;
        field3113 = null;
        field3100 = null;
        field3112 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)[Lea;")
    public static final class38[] method955(int arg0) {
        ++field3107;
        class38[] var1 = new class38[class79.field1730];
        for (int var2 = arg0; class79.field1730 > var2; ++var2) {
            class38 var3 = new class38();
            var3.field784 = class194.field3836;
            var3.field786 = class167.field3328;
            var3.field785 = class107.field2287[var2];
            var3.field783 = class15.field329[var2];
            var3.field788 = class72.field1652[var2];
            var3.field787 = class109.field2311[var2];
            byte[] var4 = class129.field2698[var2];
            int var5 = var3.field788 * var3.field787;
            var3.field782 = new int[var5];
            for (int var6 = 0; var6 < var5; ++var6) {
                var3.field782[var6] = class133.field2756[class27.method198(255, var4[var6])];
            }
            var1[var2] = var3;
        }
        class175.method1101(-116);
        return var1;
    }
}
