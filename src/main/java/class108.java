import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class108 {

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Z")
    public static boolean field1626 = true;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1622 = 3353893;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1625 = " has logged in.";

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZ)V", line = 4)
    public static final void method942(boolean arg0, boolean arg1) {
        if (!arg0) {
            method945(-124, (byte) -118, -48);
        }
        class140.method1173(arg1, class362.field5740, 15504954, class164.field2604, class126.field2113);
        field1621++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Ldb;", line = 32)
    public static final class109 method943(int arg0, int arg1) {
        class109 var2 = (class109) class244.field3791.method654(99, (long) arg1);
        field1628++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class175.field2766.method187(32, arg1, -1);
        class109 var4 = new class109();
        int var5 = -60 % ((25 - arg0) / 55);
        if (var3 != null) {
            var4.method950(-30065, new class25(var3));
        }
        var4.method952(0);
        class244.field3791.method652(-110, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 70)
    public static final void method944(int arg0) {
        field1624++;
        if (arg0 != 0) {
            return;
        }
        for (class285 var1 = (class285) class363.field5747.method2244((byte) -126); var1 != null; var1 = (class285) class363.field5747.method2241(-1)) {
            if (var1.field4417 > 0) {
                var1.field4417--;
            }
            if (var1.field4417 != 0) {
                if (var1.field4431 > 0) {
                    var1.field4431--;
                }
                if (var1.field4431 == 0 && var1.field4416 >= 1 && var1.field4427 >= 1 && var1.field4416 <= 102 && var1.field4427 <= 102 && (var1.field4424 < 0 || class85.method767(var1.field4424, 0, var1.field4429))) {
                    class31.method337(var1.field4423, false, var1.field4427, var1.field4429, var1.field4430, var1.field4420, var1.field4416, var1.field4424);
                    var1.field4431 = -1;
                    if (var1.field4425 == var1.field4424 && var1.field4425 == -1) {
                        var1.method1357(947647010);
                    } else if (var1.field4425 == var1.field4424 && var1.field4433 == var1.field4420 && var1.field4429 == var1.field4422) {
                        var1.method1357(947647010);
                    }
                }
            } else if (var1.field4425 < 0 || class85.method767(var1.field4425, arg0, var1.field4422)) {
                class31.method337(var1.field4423, false, var1.field4427, var1.field4422, var1.field4430, var1.field4433, var1.field4416, var1.field4425);
                var1.method1357(947647010);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBI)V", line = 127)
    public static final void method945(int arg0, byte arg1, int arg2) {
        class222 var3 = class153.method1262(arg0, 76);
        field1623++;
        if (arg1 != -13) {
            method945(53, (byte) -56, -127);
        }
        int var4 = var3.field3458;
        int var5 = var3.field3454;
        int var6 = var3.field3449;
        int var7 = class49.field773[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class278.method2034(arg1 + 19513, var4, var8 & arg2 << var5 | ~var8 & class160.field2538[var4]);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 160)
    public static void method946(boolean arg0) {
        field1625 = null;
        if (arg0) {
            method943(109, 56);
        }
    }
}
