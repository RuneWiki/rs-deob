import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class318 extends class104 {

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "[I")
    public static int[] field4887 = new int[1000];

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "J")
    public static long field4882 = 0L;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field4894 = 0;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field4893 = 0;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field4891 = -1;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Llc;")
    public static class175 field4892;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Llb;")
    private class224 field4884;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "[I")
    public static int[] field4878;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "[I")
    public static int[] field4889;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Laf;", line = 5)
    public static final class189 method2214(int arg0) {
        field4890++;
        int var1 = class54.field664[0] * class264.field4159[0];
        byte[] var2 = class153.field2105[arg0];
        class189 var6;
        if (class185.field2668[0]) {
            byte[] var3 = class118.field1667[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class48.method283(class229.method1613(-16777216, var3[var5] << 24), class134.field1854[class229.method1613(var2[var5], 255)]);
            }
            var6 = new class317(class99.field1288, class78.field988, class120.field1681[0], class223.field3150[0], class54.field664[0], class264.field4159[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class134.field1854[class229.method1613(255, var2[var8])];
            }
            var6 = new class189(class99.field1288, class78.field988, class120.field1681[0], class223.field3150[0], class54.field664[0], class264.field4159[0], var7);
        }
        class321.method2238(-27);
        return var6;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lp;I)V", line = 50)
    public final void method2215(class107 arg0, int arg1) {
        field4883++;
        if (arg1 != 23745) {
            this.method2217(-50, 35, -72);
        }
        while (true) {
            int var3 = arg0.method661(-1);
            if (var3 == 0) {
                return;
            }
            this.method2219(arg1 - 23745, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;", line = 74)
    public final String method2216(byte arg0, String arg1, int arg2) {
        field4886++;
        int var4 = -50 / ((59 - arg0) / 44);
        if (this.field4884 == null) {
            return arg1;
        } else {
            class31 var5 = (class31) this.field4884.method1537((long) arg2, -22708);
            return var5 == null ? arg1 : var5.field388;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I", line = 94)
    public final int method2217(int arg0, int arg1, int arg2) {
        field4881++;
        if (this.field4884 == null) {
            return arg2;
        } else if (arg0 == -11421) {
            class172 var4 = (class172) this.field4884.method1537((long) arg1, arg0 ^ 0x742F);
            return var4 == null ? arg2 : var4.field2483;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 119)
    public static void method2218(byte arg0) {
        field4887 = null;
        field4878 = null;
        field4892 = null;
        field4889 = null;
        if (arg0 > -43) {
            method2222(-30, (String) null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILp;I)V", line = 134)
    private final void method2219(int arg0, class107 arg1, int arg2) {
        if (arg0 != 0) {
            method2222(-8, (String) null);
        }
        field4880++;
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method661(-1);
        if (this.field4884 == null) {
            int var5 = class258.method1873(var4, 832520144);
            this.field4884 = new class224(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method661(-1) == 1;
            int var8 = arg1.method622((byte) 5);
            class332 var9;
            if (var7) {
                var9 = new class31(arg1.method628(false));
            } else {
                var9 = new class172(arg1.method676(true));
            }
            this.field4884.method1541(false, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZII)V", line = 190)
    public static final void method2220(int arg0, boolean arg1, int arg2, int arg3) {
        field4885++;
        if (arg2 == 0) {
            class140.field1954.method573(123, 157);
            class54.field660++;
            class140.field1954.method648(5, (byte) 38);
        }
        if (arg2 == 1) {
            class140.field1954.method573(125, 202);
            class140.field1954.method648(19, (byte) 38);
            class340.field5281++;
        }
        class140.field1954.method663(class118.field1668 + arg3, 128);
        class140.field1954.method684(class142.field1992 + arg0, arg1);
        class140.field1954.method648(class184.field2650[82] ? 1 : 0, (byte) 38);
        class110.field1538 = arg0;
        class185.field2669 = arg3;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V", line = 224)
    public static final void method2221(byte arg0) {
        field4888++;
        if (arg0 != -48) {
            method2218((byte) -126);
        }
        if (!class175.field2511 && class5.field83 != 2) {
            try {
                class122.method824(class90.field1132, 25315, "tbrefresh");
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/String;)I", line = 251)
    public static final int method2222(int arg0, String arg1) {
        field4879++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class74.field954; var2++) {
            if (arg1.equalsIgnoreCase(class76.field965[var2])) {
                return var2;
            }
        }
        if (arg0 != 654623064) {
            method2220(-108, true, -75, -81);
        }
        return -1;
    }
}
