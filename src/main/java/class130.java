import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class130 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lgq;")
    public static class418 field1793 = new class418(64);

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1796 = new String[100];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1799 = -1;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Llm;")
    public static class347 field1798;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lf;")
    public static class57 field1795;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I")
    public abstract int method818(byte arg0, int arg1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method819(int arg0) {
        field1798 = null;
        if (arg0 != 0) {
            field1795 = null;
        }
        field1796 = null;
        field1795 = null;
        field1793 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Log;")
    public abstract class356 method820(byte arg0);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIBLjava/lang/String;)I")
    public static final int method821(boolean arg0, int arg1, byte arg2, String arg3) {
        field1791++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 11 / ((arg2 + 48) / 48);
        boolean var5 = false;
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg3.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg3.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var5 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var12) {
                throw new NumberFormatException();
            }
            if (var5) {
                var12 = -var12;
            }
            int var11 = arg1 * var7 + var12;
            if ((var11 / arg1) != var7) {
                throw new NumberFormatException();
            }
            var6 = true;
            var7 = var11;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
    public abstract void method822(boolean arg0, int arg1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Ljs;")
    public static final class147 method823(int arg0, int arg1, int arg2) {
        class254 var3 = class213.field2852[arg0][arg1][arg2];
        return var3 == null || var3.field3527 == null ? null : var3.field3527;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method824(int arg0, boolean arg1, String arg2) {
        field1792++;
        class181.field2390.field5018 = 1;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class16.field220; var6++) {
            class83 var9 = class9.method74(var6, (byte) -118);
            if ((!arg1 || var9.field1160) && var9.field1144 == -1 && var9.field1188 == -1 && var9.field1178 == 0 && var9.field1193.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class149.field2041 = -1;
                    class410.field6054 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class410.field6054 = var4;
        class299.field4373 = 0;
        class149.field2041 = var5;
        String[] var7 = new String[class149.field2041];
        if (arg0 >= -96) {
            field1798 = null;
        }
        for (int var8 = 0; var8 < class149.field2041; var8++) {
            var7[var8] = class9.method74(var4[var8], (byte) 99).field1193;
        }
        class135.method846(8851, var7, class410.field6054);
        class181.field2390.method2274((byte) -100);
        class181.field2390.field5018 = 2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[B")
    public abstract byte[] method825(int arg0, int arg1);
}
