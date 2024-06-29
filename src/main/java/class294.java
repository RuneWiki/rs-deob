import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class294 extends class162 {

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4836 = " has logged out.";

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Ljava/util/Random;")
    public static Random field4829 = new Random();

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Lkf;")
    public static class193 field4843 = new class193(128);

    @OriginalMember(owner = "client!h", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4844 = "white:";

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public int field4827;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public int field4830;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public int field4831;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public int field4835;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public int field4841;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Lfa;")
    public static class273 field4834;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Lbe;")
    public static class30 field4826;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field4837;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
    public abstract void method241(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
    public abstract void method253(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public final void method2050(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -15) {
            return;
        }
        field4842++;
        int var6 = this.field4827 << 3;
        int var7 = this.field4831 << 3;
        int var8 = (arg0 << 4) + (var7 & 0xF);
        int var9 = (arg4 << 4) + (var6 & 0xF);
        this.method239(var6, var7, var9, var8, arg3, arg2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
    public abstract void method252(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2051(int arg0, String arg1) {
        field4832++;
        long var2 = 0L;
        int var4 = arg1.length();
        int var5 = 61 / (arg0 / 40);
        for (int var6 = 0; var6 < var4; var6++) {
            var2 *= 37L;
            char var7 = arg1.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var2 += (long) (var7 + 1 - 65);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var2 += (long) (var7 - 96);
            } else if (var7 >= '0' && var7 <= '9') {
                var2 += (long) (var7 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4840++;
        class3[] var7 = class263.field4340;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class3 var9 = var7[var8];
            if (var9 != null && var9.field16 == 2) {
                class84.method562((var9.field25 - class101.field1517 << 7) + var9.field28, arg2, var9.field27 * 2, (byte) 67, arg0 >> 1, (var9.field20 - class254.field4063 << 7) + var9.field19, arg4, arg3 >> 1);
                if (class19.field256 > -1 && (class4.field32 % 20) < 10) {
                    class127.field1961[var9.field14].method252(class19.field256 + arg5 - 12, class227.field3597 + -28 + arg1);
                }
            }
        }
        if (arg6 != -96) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
    public abstract void method251(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIII)V")
    public abstract void method257(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public static void method2053(int arg0) {
        field4834 = null;
        field4829 = null;
        field4826 = null;
        if (arg0 != -1) {
            method2053(-104);
        }
        field4836 = null;
        field4843 = null;
        field4844 = null;
        field4837 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
    public abstract void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V")
    public abstract void method235(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILvh;I)V")
    public static final void method2054(int arg0, class298 arg1, int arg2) {
        Object[] var3 = arg1.field4905;
        field4839++;
        int var4 = (Integer) var3[0];
        class80 var5 = class115.method724((byte) -96, var4);
        if (var5 == null) {
            return;
        }
        if (arg2 >= -86) {
            field4836 = null;
        }
        int var6 = 0;
        class111.field1695 = new String[var5.field1264];
        class246.field3925 = new int[var5.field1262];
        int var7 = 0;
        for (int var8 = 1; var8 < var3.length; var8++) {
            if (var3[var8] instanceof Integer) {
                int var9 = (Integer) var3[var8];
                if (var9 == -2147483647) {
                    var9 = arg1.field4897;
                }
                if (var9 == -2147483646) {
                    var9 = arg1.field4909;
                }
                if (var9 == -2147483645) {
                    var9 = arg1.field4906 == null ? -1 : arg1.field4906.field4077;
                }
                if (var9 == -2147483644) {
                    var9 = arg1.field4903;
                }
                if (var9 == -2147483643) {
                    var9 = arg1.field4906 == null ? -1 : arg1.field4906.field4040;
                }
                if (var9 == -2147483642) {
                    var9 = arg1.field4907 == null ? -1 : arg1.field4907.field4077;
                }
                if (var9 == -2147483641) {
                    var9 = arg1.field4907 == null ? -1 : arg1.field4907.field4040;
                }
                if (var9 == -2147483640) {
                    var9 = arg1.field4899;
                }
                if (var9 == -2147483639) {
                    var9 = arg1.field4900;
                }
                class246.field3925[var6++] = var9;
            } else if (var3[var8] instanceof String) {
                String var10 = (String) var3[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg1.field4902;
                }
                class111.field1695[var7++] = var10;
            }
        }
        class68.method428(var5, arg0, 0);
    }
}
