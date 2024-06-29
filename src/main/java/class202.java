import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class202 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lli;")
    public static class185 field3698 = class245.method1649("Starte 3D)2Softwarebibliothek)3", 122);

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[[I")
    public static int[][] field3703 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3699 = 0;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lli;")
    public static class185 field3702 = class88.method584(true, 160);

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lli;")
    public static class185 field3706 = class245.method1649("Okay", -8);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V")
    public static final void method1436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 9963) {
            field3703 = null;
        }
        field3697++;
        if ((arg1 - arg2) >= class207.field3810 && class66.field1163 >= (arg1 + arg2) && class216.field3964 <= (arg4 - arg2) && (arg2 + arg4) <= class113.field2040) {
            class229.method1584(arg0 ^ 0x26EB, arg2, arg4, arg1, arg3);
        } else {
            class240.method1626(arg3, true, arg2, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method1437(byte arg0) {
        field3698 = null;
        field3706 = null;
        field3703 = null;
        int var1 = -32 % ((arg0 - 1) / 55);
        field3702 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZII)V")
    public static final void method1438(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1442(97L, 125);
        }
        class174 var3 = class249.method1671(5, arg2, (byte) -86);
        field3701++;
        var3.method1233(0);
        var3.field3186 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)[Ldd;")
    public static final class211[] method1439(byte arg0) {
        int var1 = 101 % ((81 - arg0) / 38);
        field3704++;
        class211[] var2 = new class211[class27.field457];
        for (int var3 = 0; var3 < class27.field457; var3++) {
            byte[] var4 = class174.field3182[var3];
            int var5 = class55.field940[var3] * class258.field4591[var3];
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var6[var7] = class211.field3842[class220.method1526(255, var4[var7])];
            }
            var2[var3] = new class101(class87.field1716, class210.field3839, class145.field2766[var3], class249.field4418[var3], class55.field940[var3], class258.field4591[var3], var6);
        }
        class269.method1827((byte) -114);
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)Lch;")
    public static final class117 method1440(int arg0, boolean arg1) {
        field3700++;
        if (!arg1) {
            return null;
        }
        class117 var2 = (class117) class5.field128.method82(43, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field132.method1688(0, arg0, 4);
        class117 var4 = new class117();
        if (var3 != null) {
            var4.method818((byte) 125, arg0, new class118(var3));
        }
        class5.field128.method84(86, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method1441(int arg0, byte arg1) {
        field3696++;
        if (arg0 == 100 && class15.field247 > 0) {
            byte[] var2 = class13.field228[--class15.field247];
            class13.field228[class15.field247] = null;
            return var2;
        } else if (arg0 == 5000 && class63.field1107 > 0) {
            byte[] var3 = class140.field2618[--class63.field1107];
            class140.field2618[class63.field1107] = null;
            return var3;
        } else if (arg0 == 30000 && class50.field818 > 0) {
            byte[] var4 = class90.field1756[--class50.field818];
            class90.field1756[class50.field818] = null;
            return var4;
        } else {
            if (arg1 > -73) {
                method1437((byte) -62);
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(JI)V")
    public static final void method1442(long arg0, int arg1) {
        field3705++;
        if (arg0 == 0L || arg1 < 67) {
            return;
        }
        for (int var3 = 0; var3 < class126.field2253; var3++) {
            if (class259.field4602[var3] == arg0) {
                class253.field4494++;
                class126.field2253--;
                for (int var4 = var3; var4 < class126.field2253; var4++) {
                    class128.field2290[var4] = class128.field2290[var4 + 1];
                    class138.field2590[var4] = class138.field2590[var4 + 1];
                    class82.field1535[var4] = class82.field1535[var4 + 1];
                    class259.field4602[var4] = class259.field4602[var4 + 1];
                    class194.field3580[var4] = class194.field3580[var4 + 1];
                    class127.field2267[var4] = class127.field2267[var4 + 1];
                }
                class130.field2323 = class38.field593;
                class182.field3349.method577(21, 0);
                class182.field3349.method870(arg0, (byte) 122);
                return;
            }
        }
    }
}
