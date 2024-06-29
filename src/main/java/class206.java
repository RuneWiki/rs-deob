import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class206 extends class18 {

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lob;")
    private static class141 field3917 = class175.method1195(40, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3926 = 0;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "Lob;")
    public static class141 field3928 = field3917;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field3923 = -1;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field3918 = -1;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Lob;")
    private static class141 field3927 = class175.method1195(40, "Bad session id)3");

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Lob;")
    public static class141 field3921 = field3927;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Lpe;")
    public static class154 field3930;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "[Lkc;")
    public static class102[] field3925;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public static void method1359(byte arg0) {
        int var1 = 82 / ((51 - arg0) / 51);
        field3928 = null;
        field3930 = null;
        field3917 = null;
        field3921 = null;
        field3927 = null;
        field3925 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIBI)I")
    public static final int method1360(int arg0, int arg1, byte arg2, int arg3) {
        field3920++;
        if (arg2 != 40) {
            field3928 = null;
        }
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class164.field3177[1][var5][var4] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg3 & 0x7F;
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var8) * class31.field617[var6][var5][var4] + class31.field617[var6][var5 + 1][var4] * var8 >> 7;
        int var10 = (128 - var8) * class31.field617[var6][var5][var4 + 1] + class31.field617[var6][var5 + 1][var4 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JI)Lob;")
    public static final class141 method1361(long arg0, int arg1) {
        field3929++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = arg1;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class34.field691[(int) (var8 - arg0 * 37L)];
            }
            class141 var7 = new class141();
            var7.field2701 = var6;
            var7.field2705 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)Lkc;")
    public static final class102 method1362(byte arg0) {
        if (arg0 >= -35) {
            method1360(105, 58, (byte) 113, -11);
        }
        field3924++;
        class102 var1 = new class102();
        var1.field1984 = class30.field581[0];
        var1.field1987 = class103.field1989;
        var1.field1981 = class114.field2186[0];
        var1.field1985 = class201.field3801[0];
        var1.field1982 = class196.field3743;
        var1.field1986 = class30.field578[0];
        int var2 = var1.field1985 * var1.field1981;
        var1.field1983 = new int[var2];
        byte[] var3 = class224.field4225[0];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field1983[var4] = class16.field291[class15.method94(255, var3[var4])];
        }
        class88.method601(-83);
        return var1;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
    public static final void method1363(byte arg0) {
        if (arg0 != 106) {
            return;
        }
        field3919++;
        while (true) {
            class158 var1 = class109.field2097;
            class162 var2;
            synchronized (class109.field2097) {
                var2 = (class162) class141.field2702.method1097(-12462);
            }
            if (var2 == null) {
                return;
            }
            var2.field3142.method131((byte) -14, (int) var2.field4067, var2.field3136, false, var2.field3133);
        }
    }
}
