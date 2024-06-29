import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class218 extends class196 {

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field3970;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field3969 = 0;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Lcf;")
    public static class93 field3974 = class147.method1066(")1", -48);

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Lcf;")
    public static class93 field3965 = class147.method1066(" )2> <col=ff9040>", -48);

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "Lnh;")
    public static class54 field3972 = new class54(64);

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "[Lak;")
    public static class138[] field3979 = new class138[14];

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "Lcf;")
    public static class93 field3978 = class147.method1066("cross", -48);

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "Lhg;")
    public static class177 field3977;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "Ltg;")
    public static class181 field3980;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
    public static final void method1528(byte arg0) {
        class216.field3930.method300(0);
        field3976++;
        if (arg0 > -115) {
            method1529(8);
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
    public static final void method1529(int arg0) {
        if (arg0 < 107) {
            method1528((byte) 103);
        }
        field3975++;
        for (class53 var1 = (class53) class284.field5093.method1151(100); var1 != null; var1 = (class53) class284.field5093.method1159(94)) {
            if (var1.field863 > 0) {
                var1.field863--;
            }
            if (var1.field863 != 0) {
                if (var1.field864 > 0) {
                    var1.field864--;
                }
                if (var1.field864 == 0 && var1.field883 >= 1 && var1.field879 >= 1 && var1.field883 <= 102 && var1.field879 <= 102 && (var1.field870 < 0 || class188.method1363(var1.field877, var1.field870, (byte) -98))) {
                    class73.method500(var1.field870, var1.field877, var1.field865, var1.field871, var1.field879, (byte) 86, var1.field883, var1.field872);
                    var1.field864 = -1;
                    if (var1.field870 == var1.field861 && var1.field861 == -1) {
                        var1.method1544((byte) -36);
                    } else if (var1.field870 == var1.field861 && var1.field876 == var1.field872 && var1.field878 == var1.field877) {
                        var1.method1544((byte) -127);
                    }
                }
            } else if (var1.field861 < 0 || class188.method1363(var1.field878, var1.field861, (byte) 16)) {
                class73.method500(var1.field861, var1.field878, var1.field865, var1.field871, var1.field879, (byte) 57, var1.field883, var1.field876);
                var1.method1544((byte) -76);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method79(int arg0) {
        if (arg0 == -2) {
            field3966++;
            return this.field3970;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V")
    public static void method1530(byte arg0) {
        field3977 = null;
        field3974 = null;
        if (arg0 < 81) {
            return;
        }
        field3972 = null;
        field3965 = null;
        field3980 = null;
        field3978 = null;
        field3979 = null;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)Z")
    public final boolean method80(byte arg0) {
        field3971++;
        if (arg0 != 47) {
            field3978 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZII)Lcf;")
    public static final class93 method1531(int arg0, boolean arg1, int arg2, int arg3) {
        field3967++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = arg2 / arg0;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg0;
            var5++;
        }
        int var6 = var5;
        if (arg2 < 0 || arg1) {
            var6 = var5 + 1;
        }
        if (arg3 != 12937) {
            field3980 = null;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg2 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg2 /= arg0;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class93 var9 = new class93();
        var9.field1683 = var7;
        var9.field1629 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class218(Object arg0) {
        this.field3970 = arg0;
    }
}
