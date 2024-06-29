import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class115 {

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "[I")
    private int[] field1950;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lwa;")
    public static class75 field1945 = class66.method560("Abbrechen", false);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lwa;")
    public static class75 field1944 = class66.method560("titlebg", false);

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lwa;")
    public static class75 field1951 = class66.method560("Ablegen", false);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[Lnl;")
    public static class29[] field1946;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 4)
    public static final void method881(int arg0) {
        class153.field2631 = (int[][][]) null;
        class272.field4690 = (byte[][][]) null;
        field1943++;
        class297.field5081 = (byte[][][]) null;
        class175.field2935 = null;
        class281.field4851 = (int[][][]) null;
        class54.field887 = (short[][][]) null;
        class170.field2864 = arg0;
        class236.field3981 = null;
        class89.field1469 = (byte[][][]) null;
        class82.field1375 = null;
        class283.field4875 = (byte[][][]) null;
        class245.field4123 = (byte[][][]) null;
        class194.field3211.method1261(2);
        class252.field4235 = null;
        class195.field3289 = null;
        class168.field2834 = null;
        class149.field2569 = null;
        class59.field994 = null;
        class271.field4688 = null;
        class283.field4876 = null;
        class16.field200 = null;
        class176.field2955 = null;
        class269.field4652 = null;
        class91.field1504 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 51)
    public static final void method882(int arg0) {
        class91.field1501 = new class242[arg0][class150.field2573][class262.field4440];
        class259.field4342 = new int[class150.field2573][class262.field4440];
        class156.field2669 = new int[arg0][class150.field2573 + 1][class262.field4440 + 1];
        class267.field4612 = new class38[arg0][];
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([BI)V", line = 62)
    public static final void method883(byte[] arg0, int arg1) {
        field1949++;
        class60 var2 = new class60(arg0);
        var2.field1012 = arg0.length - 2;
        class149.field2563 = var2.method485((byte) -2);
        class156.field2673 = new boolean[class149.field2563];
        class287.field4936 = new int[class149.field2563];
        class42.field687 = new byte[class149.field2563][];
        class210.field3590 = new int[class149.field2563];
        class155.field2653 = new byte[class149.field2563][];
        class85.field1404 = new int[class149.field2563];
        class232.field3934 = new int[class149.field2563];
        var2.field1012 = arg0.length - class149.field2563 * 8 - 7;
        class263.field4571 = var2.method485((byte) -2);
        class76.field1321 = var2.method485((byte) -2);
        int var3 = (var2.method501(0) & 0xFF) + 1;
        for (int var4 = 0; var4 < class149.field2563; var4++) {
            class85.field1404[var4] = var2.method485((byte) -2);
        }
        for (int var5 = 0; var5 < class149.field2563; var5++) {
            class232.field3934[var5] = var2.method485((byte) -2);
        }
        for (int var6 = 0; var6 < class149.field2563; var6++) {
            class210.field3590[var6] = var2.method485((byte) -2);
        }
        for (int var7 = 0; var7 < class149.field2563; var7++) {
            class287.field4936[var7] = var2.method485((byte) -2);
        }
        var2.field1012 = arg0.length - (var3 - 1) * 3 - (class149.field2563 * 8) - 7;
        class191.field3184 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class191.field3184[var8] = var2.method489(-99);
            if (class191.field3184[var8] == 0) {
                class191.field3184[var8] = 1;
            }
        }
        var2.field1012 = 0;
        if (arg1 < 32) {
            method886(91, 67);
        }
        for (int var9 = 0; var9 < class149.field2563; var9++) {
            int var10 = class210.field3590[var9];
            int var11 = class287.field4936[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class42.field687[var9] = var13;
            class155.field2653[var9] = var14;
            int var16 = var2.method501(0);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method511(-115);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method511(-123);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label103: while (true) {
                    if (var10 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label103;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var14[var10 * var23 + var22] = var2.method511(-119);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var20 + (var10 * var21)] = var2.method511(-124);
                    }
                    var20++;
                }
            }
            class156.field2673[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)I", line = 230)
    public final int method884(byte arg0, int arg1) {
        int var3 = (this.field1950.length >> 1) - 1;
        field1948++;
        int var4 = var3 & arg1;
        if (arg0 <= 110) {
            return -119;
        }
        while (true) {
            int var5 = this.field1950[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1950[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 256)
    public static void method885(byte arg0) {
        field1951 = null;
        field1945 = null;
        field1946 = null;
        field1944 = null;
        if (arg0 > -43) {
            method886(66, 77);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Loi;", line = 279)
    public static final class302 method886(int arg0, int arg1) {
        field1947++;
        class302 var2 = (class302) class14.field187.method1514(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3511.method1911(class271.method1939((byte) 99, arg1), class106.method830(arg1, 200), arg0 ^ 0x5BA4);
        class302 var4 = new class302();
        if (var3 != null) {
            var4.method2084(0, new class60(var3));
        }
        class14.field187.method1509((long) arg1, var4, arg0 + 23453);
        return arg0 == -23454 ? var4 : (class302) null;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([I)V", line = 302)
    public class115(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field1950 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1950[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1950[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1950[var5 + var5] = arg0[var4];
            this.field1950[var5 + var5 + 1] = var4++;
        }
    }
}
