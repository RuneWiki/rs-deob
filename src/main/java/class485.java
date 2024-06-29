import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class485 {

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field6627 = 0;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V")
    public static final void method2737(boolean arg0) {
        for (int var1 = 0; var1 < class691.field9633; var1++) {
            class550.field7257[var1] = null;
        }
        field6624++;
        class691.field9633 = 0;
        for (int var2 = 0; var2 < class225.field3201; var2++) {
            for (int var42 = 0; var42 < class735.field10163; var42++) {
                for (int var43 = 0; var43 < class143.field2290; var43++) {
                    class701 var44 = class660.field8718[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field9731 > 0) {
                            var44.field9731 = (short) (var44.field9731 * -1);
                        }
                        if (var44.field9732 > 0) {
                            var44.field9732 = (short) (var44.field9732 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class225.field3201; var3++) {
            for (int var4 = 0; var4 < class735.field10163; var4++) {
                for (int var5 = 0; var5 < class143.field2290; var5++) {
                    class701 var6 = class660.field8718[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class660.field8718[0][var5][var4] != null && class660.field8718[0][var5][var4].field9744 != null;
                        if (var6.field9731 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class701 var12 = class660.field8718[var3][var5][var4 - 1];
                            int var13 = class113.field1866[var3].method1742(var5, 72, var4);
                            while (var8 > 0 && var12 != null && var12.field9731 < 0 && var6.field9731 == var12.field9731 && var6.field9743 == var12.field9743 && var13 == class113.field1866[var3].method1742(var5, 86, var8 - 1) && (var8 - 1 <= 0 || var13 == class113.field1866[var3].method1742(var5, 108, var8 - 2))) {
                                var8--;
                                var12 = class660.field8718[var3][var5][var8 - 1];
                            }
                            for (class701 var14 = class660.field8718[var3][var5][var4 + 1]; var9 < class143.field2290 && var14 != null && var14.field9731 < 0 && var6.field9731 == var14.field9731 && var6.field9743 == var14.field9743 && var13 == class113.field1866[var3].method1742(var5, 124, var9 + 1) && (class143.field2290 <= var9 + 1 || var13 == class113.field1866[var3].method1742(var5, 123, var9 + 2)); var14 = class660.field8718[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class113.field1866[var7 ? var3 + 1 : var3].method1742(var5, 73, var8);
                            int var17 = var6.field9731 * var15 + var16;
                            int var18 = class113.field1866[var7 ? var3 + 1 : var3].method1742(var5, 81, var9 + 1);
                            int var19 = var6.field9731 * var15 + var18;
                            int var20 = var5 << class140.field2224;
                            int var21 = var8 << class140.field2224;
                            int var22 = (var9 << class140.field2224) + class384.field5377;
                            class550.field7257[class691.field9633++] = new class177(1, var3, var6.field9743 + var20, var6.field9743 + var20, var6.field9743 + var20, var6.field9743 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class660.field8718[var23][var5][var24].field9731 = (short) (class660.field8718[var23][var5][var24].field9731 * -1);
                                }
                            }
                        }
                        if (var6.field9732 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class701 var29 = class660.field8718[var3][var5 - 1][var4];
                            int var30 = class113.field1866[var3].method1742(var5, 98, var4);
                            while (var25 > 0 && var29 != null && var29.field9732 < 0 && var6.field9732 == var29.field9732 && var6.field9733 == var29.field9733 && var30 == class113.field1866[var3].method1742(var25 - 1, 122, var4) && ((var25 - 1) <= 0 || class113.field1866[var3].method1742(var25 - 2, 88, var4) == var30)) {
                                var25--;
                                var29 = class660.field8718[var3][var25 - 1][var4];
                            }
                            for (class701 var31 = class660.field8718[var3][var5 + 1][var4]; var26 < class735.field10163 && var31 != null && var31.field9732 < 0 && var6.field9732 == var31.field9732 && var6.field9733 == var31.field9733 && var30 == class113.field1866[var3].method1742(var26 + 1, 67, var4) && ((var26 + 1) >= class735.field10163 || class113.field1866[var3].method1742(var26 + 2, 117, var4) == var30); var31 = class660.field8718[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class113.field1866[var7 ? var3 + 1 : var3].method1742(var25, 103, var4);
                            int var34 = var6.field9732 * var32 + var33;
                            int var35 = class113.field1866[var7 ? var3 + 1 : var3].method1742(var26 + 1, 82, var4);
                            int var36 = var6.field9732 * var32 + var35;
                            int var37 = var25 << class140.field2224;
                            int var38 = (var26 << class140.field2224) + class384.field5377;
                            int var39 = var4 << class140.field2224;
                            class550.field7257[class691.field9633++] = new class177(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field9733 + var39, var39 - -var6.field9733, var6.field9733 + var39, var6.field9733 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class660.field8718[var40][var41][var4].field9732 = (short) (class660.field8718[var40][var41][var4].field9732 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class37.field525 = arg0;
    }

    @OriginalMember(owner = "client!cga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6623++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public static final void method2738(int arg0) {
        if (arg0 != -18426) {
            return;
        }
        field6628++;
        class574 var1 = null;
        try {
            class198 var2 = class66.field828.method1309(true, 0, "2");
            while (var2.field2987 == 0) {
                class226.method1447((byte) -124, 1L);
            }
            if (var2.field2987 == 1) {
                var1 = (class574) var2.field2986;
                byte[] var3 = new byte[(int) var1.method3155(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3156(var4, var3.length - var4, (byte) 120, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class447.method2560(new class677(var3), arg0 ^ 0xB65);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3157(123);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZI[B)[B")
    public static final byte[] method2739(boolean arg0, int arg1, byte[] arg2) {
        field6625++;
        if (arg0) {
            return null;
        } else {
            byte[] var3 = new byte[arg1];
            class335.method2020(arg2, 0, var3, 0, arg1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(ZI[B)V")
    public static final void method2740(boolean arg0, int arg1, byte[] arg2) {
        field6622++;
        if (class9.field166 == null) {
            class9.field166 = new class677(20000);
        }
        class9.field166.method3827(0, (byte) -32, arg2, arg2.length);
        if (arg1 != -1) {
            method2741((byte) -47, -71L);
        }
        if (!arg0) {
            return;
        }
        class64.method548(-128, class9.field166.field9399);
        class721.field10045 = new class653[class517.field6907];
        int var3 = 0;
        for (int var4 = class309.field4442; var4 <= class568.field7465; var4++) {
            class653 var5 = class629.method3466(arg1 - 3651, var4);
            if (var5 != null) {
                class721.field10045[var3++] = var5;
            }
        }
        class63.field769 = false;
        class553.field7283 = class375.method2193(116);
        class9.field166 = null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method2741(byte arg0, long arg1) {
        field6626++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            if (arg0 != -104) {
                method2737(true);
            }
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class284.field4005[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
