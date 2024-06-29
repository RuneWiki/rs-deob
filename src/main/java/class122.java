import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class122 extends class35 {

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
    public int[] field1934;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[[I")
    public int[][] field1921;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[Z")
    public boolean[] field1919;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "[I")
    public int[] field1915;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1922 = "wave:";

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[S")
    public static short[] field1924 = new short[] { 35, 12, 36, 57, 21, 25, 60, 3 };

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
    public static int[] field1925 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!b", name = "D", descriptor = "[C")
    public static char[] field1936 = new char[128];

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lja;")
    public static class90 field1928;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Lclient;")
    public static client field1926;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Z")
    public static boolean field1929;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static void method1026(boolean arg0) {
        field1926 = null;
        field1922 = null;
        field1924 = null;
        field1936 = null;
        field1928 = null;
        if (arg0) {
            field1925 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
    public static final void method1027(boolean arg0) {
        class369.method2351(class33.field475, -1);
        if (arg0) {
            field1929 = false;
        }
        field1917++;
        class338.method2193(class33.field475, 0);
        if (class328.field4731 != null) {
            class328.field4731.method1282(class33.field475, 255);
        }
        field1926.method35(112);
        class33.field475.setBackground(Color.black);
        class107.field1772 = -1;
        class219.method1658(class33.field475, false);
        class40.method339(class33.field475, 79);
        if (class328.field4731 != null) {
            class328.field4731.method1281(!arg0, class33.field475);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILja;)V")
    public static final void method1028(int arg0, int arg1, int arg2, class90 arg3) {
        if (arg0 != -2) {
            field1936 = null;
        }
        field1935++;
        class221.field3296 = new class283[arg2][arg1];
        field1928 = arg3;
        if (class317.field4596 != null) {
            class281.field4217 = class92.method781((byte) -98, class317.field4596[0], class317.field4596[3], class317.field4596[2], class317.field4596[1], class317.field4596[5], class317.field4596[4]);
        }
        class211.field3146 = new class283();
        class76.method596((byte) 65);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)Z")
    public static final boolean method1029(byte arg0) {
        field1931++;
        if (arg0 <= 62) {
            field1926 = null;
        }
        if (class373.field5302) {
            try {
                class412.method2587(class188.field2783.field2639, -101, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
    public static final void method1030(int arg0, int arg1) {
        field1916++;
        class18 var2 = class439.field6386;
        synchronized (class439.field6386) {
            class439.field6386.method104(arg0, (byte) -34);
        }
        if (arg1 != 2) {
            field1936 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)I")
    public static final int method1031(int arg0, int arg1) {
        if (arg0 == -8187) {
            field1918++;
            return arg1 & 0x7F;
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
    public static final void method1032(byte arg0) {
        if (arg0 >= -101) {
            field1922 = null;
        }
        while (class268.field4020.method2783(0, class51.field824) >= 11) {
            int var1 = class268.field4020.method2778(11, (byte) -95);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class367.field5225[var1] == null) {
                class367.field5225[var1] = new class127();
                class367.field5225[var1].field5657 = var1;
                if (class329.field4742[var1] != null) {
                    class367.field5225[var1].method1072(class329.field4742[var1], 0);
                }
                var2 = true;
            }
            class75.field1290[class21.field317++] = var1;
            class127 var3 = class367.field5225[var1];
            var3.field5627 = class267.field4002;
            int var4 = class268.field4020.method2778(1, (byte) -95);
            if (var4 == 1) {
                class218.field3229[class176.field2619++] = var1;
            }
            int var5 = class268.field4020.method2778(1, (byte) -95);
            int var6 = class268.field4020.method2778(5, (byte) -95);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class268.field4020.method2778(5, (byte) -95);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class139.field2206[class268.field4020.method2778(3, (byte) -95)];
            if (var2) {
                var3.method2475(false, var8);
            }
            var3.method1071(6289, class86.field1394.field5694[0] + var7, var5 == 1, class367.field5213, class86.field1394.field5696[0] + var6);
        }
        field1927++;
        class268.field4020.method2779(-115);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZIII)V")
    public static final void method1033(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= class185.field2727 && class278.field4184 >= arg1 && arg0 >= class308.field4507 && arg3 <= class383.field5497) {
            class393.method2505(arg1, (byte) 91, arg4, arg5, arg3, arg0);
        } else {
            class333.method2179(arg1, arg5, arg3, arg0, (byte) 115, arg4);
        }
        field1930++;
        if (arg2) {
            method1027(false);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Z")
    public static final boolean method1034(int arg0) {
        field1923++;
        if (arg0 != 24037) {
            field1929 = false;
        }
        return class288.field4303 == 0 ? client.field3638 : true;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I[B)V")
    public class122(int arg0, byte[] arg1) {
        this.field1932 = arg0;
        class37 var3 = new class37(arg1);
        this.field1933 = var3.method271((byte) 103);
        this.field1934 = new int[this.field1933];
        this.field1921 = new int[this.field1933][];
        this.field1919 = new boolean[this.field1933];
        this.field1915 = new int[this.field1933];
        for (int var4 = 0; var4 < this.field1933; var4++) {
            this.field1934[var4] = var3.method271((byte) 112);
        }
        for (int var5 = 0; var5 < this.field1933; var5++) {
            this.field1919[var5] = var3.method271((byte) 113) == 1;
        }
        for (int var6 = 0; var6 < this.field1933; var6++) {
            this.field1915[var6] = var3.method320((byte) -87);
        }
        for (int var7 = 0; var7 < this.field1933; var7++) {
            this.field1921[var7] = new int[var3.method271((byte) 100)];
        }
        for (int var8 = 0; var8 < this.field1933; var8++) {
            for (int var9 = 0; var9 < this.field1921[var8].length; var9++) {
                this.field1921[var8][var9] = var3.method271((byte) 126);
            }
        }
    }
}
