import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class28 extends class2 {

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "Ljava/lang/Object;")
    private Object field387;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field383 = 0;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "[I")
    public static int[] field382 = new int[25];

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Luk;")
    public static class100 field379 = new class100(128);

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Loh;")
    public static class281 field389 = new class281(64);

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "[Leh;")
    public static class83[] field393 = new class83[8];

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field395 = -1;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "Lvl;")
    public static class242 field392;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "[I")
    public static int[] field390;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "[Led;")
    public static class186[] field391;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IC)Z")
    public static final boolean method218(int arg0, char arg1) {
        field385++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != 1181) {
            field391 = null;
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)Ljb;")
    public static final class276 method219(int arg0) {
        field384++;
        byte[] var1 = class198.field3123[0];
        int var2 = field390[0] * class171.field2679[0];
        class276 var6;
        if (class33.field501[0]) {
            int[] var3 = new int[var2];
            byte[] var4 = class95.field1609[0];
            for (int var5 = 0; var5 < var2; var5++) {
                var3[var5] = class45.method330(class55.method420(255, var4[var5]) << 24, class94.field1601[class55.method420(255, var1[var5])]);
            }
            var6 = new class123(class213.field3317, class130.field2056, class193.field3066[0], class108.field1779[0], field390[0], class171.field2679[0], var3);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class94.field1601[class55.method420(var1[var8], 255)];
            }
            var6 = new class276(class213.field3317, class130.field2056, class193.field3066[0], class108.field1779[0], field390[0], class171.field2679[0], var7);
        }
        class19.method179(8);
        return arg0 == 64 ? var6 : null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIIII)V")
    public static final void method220(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= class223.field3423 && class148.field2338 >= arg6 && class90.field1568 <= arg2 && class266.field4247 >= arg0) {
            if (arg3 == 1) {
                class283.method1900(arg5, arg2, arg6, arg0, arg4, arg1 ^ 0x1288);
            } else {
                class33.method265(arg4, arg6, arg2, arg5, arg0, arg3, (byte) 92);
            }
        } else if (arg3 == 1) {
            class167.method1127(arg0, arg5, arg6, (byte) 93, arg2, arg4);
        } else {
            class82.method586(arg6, true, arg0, arg2, arg5, arg4, arg3);
        }
        field378++;
        if (arg1 != 5) {
            field394 = -18;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method7(byte arg0) {
        field386++;
        if (arg0 != -118) {
            field379 = null;
        }
        return this.field387;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        field380++;
        if (arg0 != 1) {
            this.field387 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)V")
    public static void method221(byte arg0) {
        field392 = null;
        field393 = null;
        field389 = null;
        field390 = null;
        field382 = null;
        field391 = null;
        if (arg0 >= -88) {
            method223((byte) 118);
        }
        field379 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method222(int arg0, long arg1) {
        field381++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
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
                char var9 = class221.field3398[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            if (arg0 == -256) {
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class28(Object arg0) {
        this.field387 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(B)V")
    public static final void method223(byte arg0) {
        field388++;
        class275 var1 = class62.field1062;
        synchronized (class62.field1062) {
            class189.field2925++;
            class160.field2485 = class22.field309;
            if (arg0 < 40) {
                method218(-128, (char) 65425);
            }
            class79.field1323 = class145.field2312;
            class115.field1883 = class250.field4032;
            class164.field2581 = class181.field2828;
            class291.field4584 = class18.field269;
            class112.field1838 = class292.field4604;
            class56.field933 = class7.field161;
            class181.field2828 = 0;
        }
    }
}
