import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 {

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field952 = -1;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lr;")
    public static class118 field943 = class153.method1136(117, " (X");

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field944 = 99;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[Z")
    public static boolean[] field946 = new boolean[100];

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field950 = 0;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lr;")
    public static class118 field955 = class153.method1136(108, "Freie Welt");

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    private static int field945 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lue;")
    public class144 field942;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Ln;")
    public static class90 field951;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
    public int[] field948;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[Lr;")
    public class118[] field949;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
    public static final boolean method325(int arg0, int arg1) {
        field947++;
        if (arg0 != 0) {
            method326(59, 9);
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
    public static final void method326(int arg0, int arg1) {
        field953++;
        if (class26.field631 == arg1) {
            return;
        }
        if (arg0 != 22077) {
            field945 = -86;
        }
        if (class26.field631 == 0) {
            class70.method595(117);
        }
        if (arg1 == 20 || arg1 == 40) {
            class153.field3470 = 0;
            class94.field2238 = 0;
            class120.field2788 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class120.field2789 != null) {
            class120.field2789.method408((byte) 122);
            class120.field2789 = null;
        }
        if (class26.field631 == 25) {
            class157.field3616 = 1;
            class113.field2649 = 0;
            class47.field1144 = 0;
            class148.field3303 = 0;
            class136.field3079 = 1;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class72.method609(class55.field1305, class53.field1263, arg0 - 7425, class4.field70);
        } else {
            class132.method1020(65535);
        }
        class26.field631 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method327(int arg0) {
        if (arg0 < -22) {
            field946 = null;
            field955 = null;
            field951 = null;
            field943 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)[Ln;")
    public static final class90[] method328(byte arg0) {
        class90[] var1 = new class90[class95.field2246];
        field954++;
        int var2 = 0;
        int var3 = -116 % ((-arg0 - 2) / 50);
        while (var2 < class95.field2246) {
            class90 var4 = new class90();
            var4.field2156 = class105.field2458;
            var4.field2153 = class106.field2476;
            var4.field2157 = class153.field3467[var2];
            var4.field2154 = class54.field1293[var2];
            var4.field2159 = class65.field1488[var2];
            var4.field2158 = class56.field1313[var2];
            var4.field2160 = class127.field2904;
            var4.field2155 = class74.field1830[var2];
            var1[var2] = var4;
            var2++;
        }
        class97.method755((byte) 107);
        return var1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BI)[B")
    public static final byte[] method329(byte[] arg0, int arg1) {
        class105 var2 = new class105(arg0);
        field940++;
        int var3 = var2.method831((byte) 76);
        int var4 = var2.method821((byte) 114);
        if (var4 < 0 || field945 != 0 && field945 < var4) {
            throw new RuntimeException();
        } else if (arg1 != 2283) {
            return null;
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method809(-25066, var7, 0, var4);
            return var7;
        } else {
            int var5 = var2.method821((byte) 127);
            if (var5 < 0 || field945 != 0 && field945 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class76.method641(var6, var5, arg0, var4, 9);
            } else {
                class36.field909.method1093(var2, -7810, var6);
            }
            return var6;
        }
    }
}
