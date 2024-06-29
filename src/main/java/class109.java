import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class109 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "[I")
    public static int[] field1566 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1570 = "glow3:";

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1572 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1568 = "flash2:";

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[I")
    public static int[] field1579 = new int[100];

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "J")
    public long field1578;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Ltk;")
    public class219 field1569;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Lve;")
    public static class233 field1575;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method712(byte arg0, String arg1) {
        field1580++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        int var7 = -38 % ((arg0 + 67) / 59);
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static final void method713(byte arg0) {
        class13.field203.method260(0);
        field1577++;
        class232.field3468.method260(0);
        int var1 = 66 % ((arg0 + 2) / 52);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method714(int arg0) {
        field1566 = null;
        field1579 = null;
        field1572 = null;
        field1575 = null;
        if (arg0 != 18519) {
            field1570 = null;
        }
        field1570 = null;
        field1568 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lcl;")
    public static final class115 method715(int arg0, int arg1) {
        if (arg1 != 22046) {
            method717((String) null, 51, (String) null, -119);
        }
        field1574++;
        if (arg0 == 0) {
            return new class180();
        } else if (arg0 == 1) {
            return new class232();
        } else if (arg0 == 2) {
            return new class82();
        } else if (arg0 == 3) {
            return new class60();
        } else if (arg0 == 4) {
            return new class178();
        } else if (arg0 == 5) {
            return new class155();
        } else if (arg0 == 6) {
            return new class63();
        } else if (arg0 == 7) {
            return new class138();
        } else if (arg0 == 8) {
            return new class256();
        } else if (arg0 == 9) {
            return new class160();
        } else if (arg0 == 10) {
            return new class166();
        } else if (arg0 == 11) {
            return new class243();
        } else if (arg0 == 12) {
            return new class177();
        } else if (arg0 == 13) {
            return new class206();
        } else if (arg0 == 14) {
            return new class66();
        } else if (arg0 == 15) {
            return new class77();
        } else if (arg0 == 16) {
            return new class75();
        } else if (arg0 == 17) {
            return new class93();
        } else if (arg0 == 18) {
            return new class40();
        } else if (arg0 == 19) {
            return new class207();
        } else if (arg0 == 20) {
            return new class111();
        } else if (arg0 == 21) {
            return new class187();
        } else if (arg0 == 22) {
            return new class132();
        } else if (arg0 == 23) {
            return new class276();
        } else if (arg0 == 24) {
            return new class15();
        } else if (arg0 == 25) {
            return new class38();
        } else if (arg0 == 26) {
            return new class135();
        } else if (arg0 == 27) {
            return new class74();
        } else if (arg0 == 28) {
            return new class240();
        } else if (arg0 == 29) {
            return new class168();
        } else if (arg0 == 30) {
            return new class84();
        } else if (arg0 == 31) {
            return new class128();
        } else if (arg0 == 32) {
            return new class275();
        } else if (arg0 == 33) {
            return new class277();
        } else if (arg0 == 34) {
            return new class23();
        } else if (arg0 == 35) {
            return new class268();
        } else if (arg0 == 36) {
            return new class95();
        } else if (arg0 == 37) {
            return new class179();
        } else if (arg0 == 38) {
            return new class124();
        } else if (arg0 == 39) {
            return new class34();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)Z")
    public static final boolean method716(boolean arg0, int arg1) {
        if (!arg0) {
            method712((byte) -22, (String) null);
        }
        field1571++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method717(String arg0, int arg1, String arg2, int arg3) {
        field1581++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        if (arg1 != -26476) {
            return -95;
        }
        while ((var7 - var9) < var4 || var5 > (var6 - var8)) {
            if (var4 <= (var7 - var9)) {
                return -1;
            }
            if ((var6 - var8) >= var5) {
                return 1;
            }
            char var22;
            if (var9 == '\u0000') {
                var22 = arg2.charAt(var7++);
            } else {
                var22 = var9;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg0.charAt(var6++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var9 = class56.method382(-95, var22);
            var8 = class56.method382(-117, var24);
            char var26 = class272.method1826(arg3, var22, (byte) -84);
            char var27 = class272.method1826(arg3, var24, (byte) -88);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class161.method1081(arg3, var28, -1) - class161.method1081(arg3, var29, arg1 + 26475);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class161.method1081(arg3, var20, -1) - class161.method1081(arg3, var21, -1);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class161.method1081(arg3, var14, -1) - class161.method1081(arg3, var15, -1);
            }
        }
        return 0;
    }
}
