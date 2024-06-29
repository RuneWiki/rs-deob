import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class133 {

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Ltg;")
    private class215 field2477 = new class215(256);

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Ltg;")
    private class215 field2489 = new class215(256);

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lcj;")
    private class28 field2474;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Lcj;")
    private class28 field2478;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lr;")
    public static class66 field2471 = class93.method641(43, "Art");

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lr;")
    public static class66 field2490 = class93.method641(43, "Benutzen");

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Loa;")
    public static class238 field2488;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lsg;")
    public static class247 field2476;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[I")
    public static int[] field2483;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z")
    public static final boolean method920(int arg0) {
        field2481++;
        try {
            if (arg0 >= -98) {
                field2472 = 39;
            }
            return class257.method1726(-26354);
        } catch (IOException var4) {
            class27.method119((byte) -21);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class129.field2400 + "," + class77.field1527 + "," + class184.field3212 + " - " + class61.field1033 + "," + (class207.field3595.field2039[0] + class3.field39) + "," + (class207.field3595.field2086[0] + class34.field512) + " - ";
            for (int var3 = 0; class61.field1033 > var3 && var3 < 50; var3++) {
                var2 = var2 + class84.field1627.field4350[var3] + ",";
            }
            class181.method1205(var2, var5, 38);
            class75.method535((byte) -109);
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[II)Lk;")
    public final class177 method921(int arg0, int[] arg1, int arg2) {
        field2484++;
        if (this.field2478.method134(0) == 1) {
            return this.method927(0, arg1, arg2, (byte) 91);
        } else if (this.field2478.method152(arg2, arg0 + arg0) == 1) {
            return this.method927(arg2, arg1, 0, (byte) 112);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)Lkj;")
    public static final class57 method922(boolean arg0, int arg1) {
        if (!arg0) {
            field2483 = null;
        }
        class57 var2 = (class57) class45.field819.method1505((long) arg1, (byte) -76);
        field2487++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class41.field689.method135(arg1, 0, 0);
        } else {
            var3 = class171.field3031.method135(arg1 & 0x7FFF, 0, 0);
        }
        class57 var4 = new class57();
        if (var3 != null) {
            var4.method380(new class249(var3), arg0);
        }
        if (arg1 >= 32768) {
            var4.method382((byte) -67);
        }
        class45.field819.method1497((long) arg1, (byte) -126, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII[I)Lk;")
    private final class177 method923(byte arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != -113) {
            field2471 = null;
        }
        field2486++;
        int var5 = arg2 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFC);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class177 var9 = (class177) this.field2489.method1381(var7, -80);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class74 var10 = (class74) this.field2477.method1381(var7, 82);
            if (var10 == null) {
                var10 = class74.method526(this.field2474, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2477.method1380((byte) 123, var10, var7);
            }
            class177 var11 = var10.method527(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method560(-17554);
                this.field2489.method1380((byte) 122, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static void method924(boolean arg0) {
        field2483 = null;
        field2471 = null;
        field2476 = null;
        if (!arg0) {
            field2490 = null;
            field2488 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB[I)Lk;")
    public final class177 method925(int arg0, byte arg1, int[] arg2) {
        field2485++;
        if (this.field2474.method134(0) == 1) {
            return this.method923((byte) -113, 0, arg0, arg2);
        } else if (this.field2474.method152(arg0, 0) == 1) {
            return this.method923((byte) -113, arg0, 0, arg2);
        } else {
            if (arg1 <= 5) {
                field2480 = -21;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLcj;Lcj;BLqf;)V")
    public static final void method926(boolean arg0, class28 arg1, class28 arg2, byte arg3, class236 arg4) {
        class254.field4457 = arg1;
        class131.field2433 = arg2;
        field2473++;
        class125.field2364 = arg0;
        if (arg3 <= 26) {
            field2488 = null;
        }
        int var5 = class131.field2433.method134(0) - 1;
        field2480 = var5 * 256 + class131.field2433.method152(var5, 0);
        class226.field3865 = arg4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[IIB)Lk;")
    private final class177 method927(int arg0, int[] arg1, int arg2, byte arg3) {
        field2482++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFFD) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class177 var9 = (class177) this.field2489.method1381(var7, -40);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class71 var10 = class71.method512(this.field2478, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            int var11 = 46 / (-arg3 / 36);
            class177 var12 = var10.method511();
            this.field2489.method1380((byte) -126, var12, var7);
            if (arg1 != null) {
                arg1[0] -= var12.field3109.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lcj;Lcj;)V")
    public class133(class28 arg0, class28 arg1) {
        this.field2474 = arg1;
        this.field2478 = arg0;
    }
}
