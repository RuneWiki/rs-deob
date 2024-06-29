import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 {

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "J")
    public long field497 = 0L;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[S")
    public static short[] field503 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Ljk;")
    public static class76 field500 = new class76();

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Luf;")
    public static class168 field511 = class148.method1019(-1720, "::errortest");

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field513 = 0;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lf;")
    public class231 field494;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lf;")
    public class231 field499;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Lfj;")
    public static class283 field510;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "[Lwa;")
    public static class284[] field512;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)[Lhe;", line = 9)
    public static final class99[] method220(boolean arg0) {
        if (class178.field2878 == null) {
            int var1 = 0;
            class99[] var2 = class70.method393(-3362, class51.field622);
            class99[] var3 = new class99[var2.length];
            label55: for (int var4 = 0; var4 < var2.length; var4++) {
                class99 var5 = var2[var4];
                if ((var5.field1558 <= 0 || var5.field1558 >= 24) && var5.field1554 >= 800 && var5.field1561 >= 600) {
                    for (int var6 = 0; var6 < var1; var6++) {
                        class99 var7 = var3[var6];
                        if (var5.field1554 == var7.field1554 && var5.field1561 == var7.field1561) {
                            if (var7.field1558 < var5.field1558) {
                                var3[var6] = var5;
                            }
                            continue label55;
                        }
                    }
                    var3[var1] = var5;
                    var1++;
                }
            }
            class178.field2878 = new class99[var1];
            class185.method1311(var3, 0, class178.field2878, 0, var1);
            int[] var8 = new int[class178.field2878.length];
            for (int var9 = 0; var9 < class178.field2878.length; var9++) {
                class99 var10 = class178.field2878[var9];
                var8[var9] = var10.field1561 * var10.field1554;
            }
            class169.method1231(false, var8, class178.field2878);
        }
        if (!arg0) {
            field500 = (class76) null;
        }
        field493++;
        return class178.field2878;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 90)
    public static void method221(int arg0) {
        field500 = null;
        field510 = null;
        field511 = null;
        field512 = null;
        field503 = null;
        if (arg0 != -601) {
            method222(121, 121, -36);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V", line = 134)
    public static final void method222(int arg0, int arg1, int arg2) {
        field504++;
        class73 var3 = class198.method1394(108, arg1);
        int var4 = var3.field982;
        int var5 = var3.field981;
        if (arg2 < 40) {
            return;
        }
        int var6 = var3.field983;
        int var7 = class240.field3894[var5 - var4];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class256.method1752((byte) -66, var6, class261.field4423[var6] & ~var8 | arg0 << var4 & var8);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Luf;ILuf;IBLuf;)V", line = 177)
    public static final void method223(class168 arg0, int arg1, class168 arg2, int arg3, byte arg4, class168 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class57.field755[var6] = class57.field755[var6 - 1];
            class224.field3606[var6] = class224.field3606[var6 - 1];
            class289.field4879[var6] = class289.field4879[var6 - 1];
            class165.field2657[var6] = class165.field2657[var6 - 1];
            class94.field1495[var6] = class94.field1495[var6 - 1];
        }
        class57.field755[0] = arg3;
        class224.field3606[0] = arg5;
        class94.field1495[0] = arg1;
        field495++;
        if (arg4 == -118) {
            class245.field4169++;
            class68.field905 = class9.field116;
            class289.field4879[0] = arg2;
            class165.field2657[0] = arg0;
        }
    }
}
