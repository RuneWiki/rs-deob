import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class209 extends class29 {

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "Luf;")
    public class24 field3414;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field3412 = -1;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "[I")
    public static int[] field3419 = new int[100];

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field3413 = 0;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field3420 = 0;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "[I")
    public static int[] field3423;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZBLkb;Lkb;)V", line = 5)
    public static final void method1524(boolean arg0, byte arg1, class39 arg2, class39 arg3) {
        class37.field496 = arg2;
        class158.field2434 = arg0;
        class293.field4609 = arg3;
        if (arg1 < -60) {
            field3424++;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luf;)V", line = 19)
    public class209(class24 arg0) {
        this.field3414 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 33)
    public static void method1525(int arg0) {
        if (arg0 != -3090) {
            field3412 = 28;
        }
        field3423 = null;
        field3419 = null;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 45)
    public static final void method1526(int arg0) {
        if (arg0 != 31338) {
            method1525(100);
        }
        if ((class71.field918 > class42.field584)) {
            class42.field584 = (float) ((double) class42.field584 / 30.0D + (double) class42.field584);
            if (class42.field584 > class71.field918) {
                class42.field584 = class71.field918;
            }
            class319.method2235((byte) -107);
        } else if (class42.field584 > class71.field918) {
            class42.field584 = (float) ((double) class42.field584 - (double) class42.field584 / 30.0D);
            if (class42.field584 < class71.field918) {
                class42.field584 = class71.field918;
            }
            class319.method2235((byte) -107);
        }
        if (class138.field2069 != -1 && class206.field3363 != -1) {
            int var1 = class138.field2069 - class242.field3841;
            int var2 = class206.field3363 - class231.field3698;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class242.field3841 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class206.field3363 = -1;
                class138.field2069 = -1;
            }
            class231.field3698 -= -var2;
            class319.method2235((byte) -107);
        }
        field3418++;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)J", line = 100)
    public static final long method1527(int arg0) {
        field3415++;
        if (arg0 != 1) {
            field3413 = 56;
        }
        return class90.field1373.method881((byte) 117);
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V", line = 113)
    public static final void method1528(int arg0) {
        int var1 = 65 % ((14 - arg0) / 47);
        class336.field5213.method1536(-123);
        int var2 = class336.field5213.method1535((byte) 7, 8);
        if (var2 < class176.field2875) {
            for (int var3 = var2; var3 < class176.field2875; var3++) {
                class292.field4597[class225.field3584++] = class128.field1906[var3];
            }
        }
        field3426++;
        if (var2 > class176.field2875) {
            throw new RuntimeException("gnpov1");
        }
        class176.field2875 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = class128.field1906[var4];
            class196 var6 = class297.field4657[var5];
            int var7 = class336.field5213.method1535((byte) 39, 1);
            if (var7 == 0) {
                class128.field1906[class176.field2875++] = var5;
                var6.field2008 = class48.field648;
            } else {
                int var8 = class336.field5213.method1535((byte) 117, 2);
                if (var8 == 0) {
                    class128.field1906[class176.field2875++] = var5;
                    var6.field2008 = class48.field648;
                    class318.field4946[class126.field1877++] = var5;
                } else if (var8 == 1) {
                    class128.field1906[class176.field2875++] = var5;
                    var6.field2008 = class48.field648;
                    int var13 = class336.field5213.method1535((byte) 10, 3);
                    var6.method907(var13, 1, (byte) 127);
                    int var14 = class336.field5213.method1535((byte) 93, 1);
                    if (var14 == 1) {
                        class318.field4946[class126.field1877++] = var5;
                    }
                } else if (var8 == 2) {
                    class128.field1906[class176.field2875++] = var5;
                    var6.field2008 = class48.field648;
                    if (class336.field5213.method1535((byte) 48, 1) == 1) {
                        int var9 = class336.field5213.method1535((byte) 15, 3);
                        var6.method907(var9, 2, (byte) 127);
                        int var10 = class336.field5213.method1535((byte) 29, 3);
                        var6.method907(var10, 2, (byte) 126);
                    } else {
                        int var11 = class336.field5213.method1535((byte) 45, 3);
                        var6.method907(var11, 0, (byte) 127);
                    }
                    int var12 = class336.field5213.method1535((byte) 30, 1);
                    if (var12 == 1) {
                        class318.field4946[class126.field1877++] = var5;
                    }
                } else if (var8 == 3) {
                    class292.field4597[class225.field3584++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 228)
    public static final void method1529(String arg0, int arg1, int arg2) {
        class21.field313.method1541(-122, 36);
        class21.field313.method1347((byte) -69, class232.method1669(37, arg0));
        class21.field313.method1406(arg2, (byte) 124);
        class185.field2968++;
        field3421++;
        if (arg1 >= -95) {
            field3412 = -69;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IC)C", line = 254)
    public static final char method1530(int arg0, char arg1) {
        field3422++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg0 > -115) {
            return (char) 65448;
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }
}
