import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class368 extends class382 {

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
    public int[] field5171;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "[I")
    public int[] field5170;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "[I")
    public static int[] field5166 = new int[1];

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "[[I")
    public static int[][] field5173 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIJI)V", line = 6)
    public static final void method2129(int arg0, int arg1, long arg2, int arg3) {
        field5167++;
        if (arg0 <= 101) {
            return;
        }
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = ((int) arg2 & 0x3AE41E) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class173.method1072(arg1, 0, 0, true, 0, var6, (byte) 126, var5, arg3);
            return;
        }
        class132 var8 = class82.field1154.method2121(var7, true);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field1881;
            var10 = var8.field1880;
        } else {
            var9 = var8.field1880;
            var10 = var8.field1881;
        }
        int var11 = var8.field1875;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class173.method1072(arg1, var10, var9, true, var11, 0, (byte) 126, 0, arg3);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BB)V", line = 49)
    public static final void method2130(byte arg0, byte arg1) {
        field5164++;
        if (class99.field1369 == null) {
            class99.field1369 = new byte[4][class442.field6435][class232.field3217];
        }
        if (arg1 != -36) {
            method2130((byte) -7, (byte) -22);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class442.field6435; var3++) {
                for (int var4 = 0; var4 < class232.field3217; var4++) {
                    class99.field1369[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIZ)V", line = 85)
    public static final void method2131(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field5166 = null;
        }
        field5165++;
        if (class478.method2809(arg1, arg2)) {
            class142.method917(class522.field7701[arg1], arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILa;)Z", line = 100)
    public static final boolean method2132(int arg0, int arg1, class436 arg2) {
        field5172++;
        int var3 = arg2.method2599((byte) 98, 2);
        if (var3 == 0) {
            if (arg2.method2599((byte) 98, 1) != 0) {
                method2132(arg0, 43, arg2);
            }
            int var4 = arg2.method2599((byte) 98, 6);
            int var5 = arg2.method2599((byte) 98, 6);
            boolean var6 = arg2.method2599((byte) 98, 1) == 1;
            if (var6) {
                class364.field5055[class282.field3806++] = arg0;
            }
            if (class309.field4234[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class135 var7 = class26.field405[arg0];
            class192 var8 = class309.field4234[arg0] = new class192();
            var8.field297 = arg0;
            if (class367.field5152[arg0] != null) {
                var8.method1167(-10459, class367.field5152[arg0]);
            }
            var8.method169(true, var7.field1948);
            var8.field289 = var7.field1951;
            int var9 = var7.field1944;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FCFD8) >> 14;
            var8.field2702 = var7.field1947;
            int var12 = var9 & 0xFF;
            var8.field367[0] = class324.field4454[arg0];
            var8.field464 = (byte) var10;
            var8.method1161((var11 << 6) + var4 - class215.field3059, (var12 << 6) + -class79.field1134 + var5, 16383);
            var8.field2727 = false;
            class26.field405[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method2599((byte) 98, 2);
            int var14 = class26.field405[arg0].field1944;
            class26.field405[arg0].field1944 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method2599((byte) 98, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class26.field405[arg0].field1944;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FD115) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class26.field405[arg0].field1944 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg2.method2599((byte) 98, 18);
            int var23 = var22 >> 16;
            int var24 = 113 / ((-arg1 - 29) / 37);
            int var25 = (var22 & 0xFF5B) >> 8;
            int var26 = var22 & 0xFF;
            int var27 = class26.field405[arg0].field1944;
            int var28 = (var27 >> 28) + var23 & 0x3;
            int var29 = (var27 >> 14) + var25 & 0xFF;
            int var30 = var26 + var27 & 0xFF;
            class26.field405[arg0].field1944 = (var28 << 28) + (var29 << 14) + var30;
            return false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)Lmt;", line = 260)
    public static final class271 method2133(byte arg0) {
        field5169++;
        int var1 = 21 / ((arg0 + 28) / 36);
        try {
            return new class440();
        } catch (Throwable var3) {
            try {
                return (class271) Class.forName("uq").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class524();
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V", line = 282)
    public static final void method2134(byte arg0) {
        field5163++;
        class417.method2492();
        if (arg0 != -78) {
            field5173 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V", line = 300)
    public static final void method2135(boolean arg0, int arg1) {
        if (class510.field7488 == 0) {
            class45.field638.method2025(arg1, (byte) -126);
        } else {
            class284.field3821 = arg1;
        }
        if (arg0) {
            field5166 = null;
        }
        field5168++;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V", line = 317)
    public static void method2136(int arg0) {
        if (arg0 != 12) {
            field5173 = null;
        }
        field5166 = null;
        field5173 = null;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(II[I[I)V", line = 334)
    public class368(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5171 = arg2;
        this.field5170 = arg3;
    }
}
