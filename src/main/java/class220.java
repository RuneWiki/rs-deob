import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class220 {

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public int field3489 = 2048;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public int field3493 = 0;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public int field3498 = 0;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public int field3500 = 2048;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "[I")
    public static int[] field3491 = new int[256];

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "[Z")
    public static boolean[] field3490 = new boolean[100];

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field3492 = 0;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3494 = null;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field3497 = -1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[S")
    public static short[] field3487;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 7)
    public static final int method1462(Random arg0, int arg1, int arg2) {
        field3485++;
        if (arg1 != -861395680) {
            field3483 = 49;
        }
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class134.method879(arg2, arg1 + 861368212)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class146.method952(arg2, 32, var4);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILag;I)V", line = 43)
    public final void method1463(int arg0, class202 arg1, int arg2) {
        if (arg0 != -4) {
            method1469(41, (String) null);
        }
        field3484++;
        while (true) {
            int var4 = arg1.method1317((byte) -104);
            if (var4 == 0) {
                return;
            }
            this.method1465(arg1, var4, arg2, -97);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLmg;)V", line = 66)
    public static final void method1464(byte arg0, class113 arg1) {
        int var2 = 84 / ((7 - arg0) / 54);
        field3496++;
        for (int var3 = 0; var3 < class255.field3994.length; var3++) {
            class255.field3994[var3] = 0;
        }
        short var4 = 256;
        for (int var5 = 0; var5 < 5000; var5++) {
            int var6 = (int) ((double) var4 * Math.random() * 128.0D);
            class255.field3994[var6] = (int) (Math.random() * 284.0D);
        }
        for (int var7 = 0; var7 < 20; var7++) {
            for (int var8 = 1; var8 < (var4 - 1); var8++) {
                for (int var9 = 1; var9 < 127; var9++) {
                    int var10 = var9 + (var8 << 7);
                    class271.field4177[var10] = (class255.field3994[var10 - 128] + class255.field3994[var10 - 1] - (-class255.field3994[var10 + 1] - class255.field3994[var10 + 128])) / 4;
                }
            }
            int[] var11 = class255.field3994;
            class255.field3994 = class271.field4177;
            class271.field4177 = var11;
        }
        if (arg1 == null) {
            return;
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg1.field1970; var13++) {
            for (int var14 = 0; var14 < arg1.field1968; var14++) {
                if (arg1.field1984[var12++] != 0) {
                    int var15 = var14 + arg1.field1982 + 16;
                    int var16 = var13 + arg1.field1969 + 16;
                    int var17 = (var16 << 7) + var15;
                    class255.field3994[var17] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lag;III)V", line = 161)
    private final void method1465(class202 arg0, int arg1, int arg2, int arg3) {
        field3499++;
        if (arg3 > -42) {
            method1469(-25, (String) null);
        }
        if (arg1 == 1) {
            this.field3498 = arg0.method1317((byte) -125);
        } else if (arg1 == 2) {
            this.field3500 = arg0.method1315(14289);
        } else if (arg1 == 3) {
            this.field3489 = arg0.method1315(14289);
        } else if (arg1 == 4) {
            this.field3493 = arg0.method1356(false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 192)
    public static void method1466(int arg0) {
        field3491 = null;
        field3487 = null;
        field3494 = null;
        field3490 = null;
        int var1 = 118 % ((-arg0 - 63) / 57);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 208)
    public static final void method1467(int arg0) {
        field3486++;
        if (arg0 != 0) {
            method1462((Random) null, -4, -98);
        }
        if (class255.field3993) {
            class31.field582 = null;
            class255.field3993 = false;
            class285.field4416 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 238)
    public static final void method1468(byte arg0) {
        field3488++;
        if (class288.field4434 != null || class289.field4445 != null) {
            return;
        }
        int var1 = class187.field3036;
        if (class290.field4459) {
            if (var1 != 1) {
                int var7 = class120.field2083;
                int var8 = class9.field196;
                if (var7 < (class112.field1966 - 10) || var7 > (class42.field813 + class112.field1966 + 10) || var8 < class343.field5328 - 10 || class343.field5328 + class187.field3033 + 10 < var8) {
                    class290.field4459 = false;
                    class25.method204((byte) -127, class343.field5328, class112.field1966, class42.field813, class187.field3033);
                }
            }
            if (var1 == 1) {
                int var9 = class112.field1966;
                int var10 = class72.field1510;
                int var11 = class343.field5328;
                int var12 = class42.field813;
                int var13 = -1;
                int var14 = class215.field3441;
                for (int var15 = 0; var15 < class48.field999; var15++) {
                    if (class267.field4117) {
                        int var16 = (class48.field999 - var15 - 1) * 15 + var11 + 33;
                        if (var14 > var9 && var14 < (var9 + var12) && var10 > (var16 - 13) && var10 < var16 + 3) {
                            var13 = var15;
                        }
                    } else {
                        int var17 = (class48.field999 - var15 - 1) * 15 + var11 + 31;
                        if (var9 < var14 && var9 + var12 > var14 && var10 > (var17 - 13) && var17 + 3 > var10) {
                            var13 = var15;
                        }
                    }
                }
                if (var13 != -1) {
                    class330.method2284(var13, 0);
                }
                class290.field4459 = false;
                class25.method204((byte) 86, class343.field5328, class112.field1966, class42.field813, class187.field3033);
            }
        } else {
            if (var1 == 1 && class48.field999 > 0) {
                short var2 = class120.field2088[class48.field999 - 1];
                if (var2 == 46 || var2 == 34 || var2 == 37 || var2 == 13 || var2 == 19 || var2 == 47 || var2 == 36 || var2 == 26 || var2 == 2 || var2 == 38 || var2 == 28 || var2 == 1007) {
                    int var3 = class153.field2502[class48.field999 - 1];
                    int var4 = class255.field3988[class48.field999 - 1];
                    class68 var5 = class319.method2196(-1351736944, var4);
                    class268 var6 = client.method359(var5);
                    if (var6.method1786((byte) 116) || var6.method1789(true)) {
                        class278.field4286 = 0;
                        class48.field1000 = false;
                        if (class288.field4434 != null) {
                            class317.method2183((byte) -7, class288.field4434);
                        }
                        class288.field4434 = class319.method2196(-1351736944, var4);
                        class289.field4448 = class72.field1510;
                        class228.field3603 = class215.field3441;
                        class86.field1616 = var3;
                        class317.method2183((byte) -7, class288.field4434);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class227.field3592 == 1 && class48.field999 > 2 || class133.method870(false, class48.field999 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class48.field999 > 0 || class15.field273 == 1) {
                class324.method2245(0);
            }
            if (var1 == 1 && class48.field999 > 0 || class15.field273 == 2) {
                class66.method511(2);
            }
        }
        if (arg0 > -21) {
            field3497 = -58;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;)V", line = 391)
    public static final void method1469(int arg0, String arg1) {
        field3495++;
        if (class327.field5009 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class116.method767(-127, arg1);
        if ((long) arg0 == var3) {
            return;
        }
        while (class327.field5009.length > var2 && class327.field5009[var2].field702 != var3) {
            var2++;
        }
        if (class327.field5009.length > var2 && class327.field5009[var2] != null) {
            class100.field1756++;
            class14.field263.method80(43, (byte) 104);
            class14.field263.method1353((byte) -105, class327.field5009[var2].field702);
        }
    }
}
