import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class139 {

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lob;")
    private class256 field2425 = new class256();

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Ltg;")
    private class277 field2411;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[I")
    public static int[] field2417 = new int[5];

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Z")
    public static boolean field2415 = false;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Llc;")
    private static class143 field2419 = class66.method374("Loaded update list", -1);

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Llc;")
    public static class143 field2421 = class66.method374(")1o", -1);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Llc;")
    public static class143 field2409 = field2419;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public final void method823(boolean arg0) {
        field2413++;
        this.field2425.method1695(arg0);
        this.field2411.method1826((byte) 61);
        this.field2420 = this.field2410;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public final void method824(int arg0) {
        field2416++;
        if (arg0 > -117) {
            return;
        }
        for (class254 var2 = (class254) this.field2425.method1698(98); var2 != null; var2 = (class254) this.field2425.method1699(-119)) {
            if (var2.method789(true)) {
                var2.method349(0);
                var2.method1490(-28126);
                this.field2420++;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZIII)V")
    public static final void method825(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2408++;
        if (arg1) {
            field2422 = -128;
        }
        if (arg3 < arg0) {
            class289.method1927(class15.field268[arg2], arg4, arg3, -96, arg0);
        } else {
            class289.method1927(class15.field268[arg2], arg4, arg0, -123, arg3);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
    public final Object method826(long arg0, boolean arg1) {
        field2418++;
        class254 var4 = (class254) this.field2411.method1824(arg0, 0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method790(383);
        if (arg1) {
            this.method835(125, 38);
        }
        if (var5 == null) {
            var4.method349(0);
            var4.method1490(-28126);
            this.field2420++;
            return null;
        }
        if (var4.method789(true)) {
            class185 var6 = new class185(var5);
            this.field2411.method1825(var6, (byte) 64, var4.field1162);
            this.field2425.method1694(85, var6);
            var6.field3967 = 0L;
            var4.method349(0);
            var4.method1490(-28126);
        } else {
            this.field2425.method1694(74, var4);
            var4.field3967 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/Object;J)V")
    public final void method827(int arg0, Object arg1, long arg2) {
        field2429++;
        this.method829(arg2, arg0 ^ arg0);
        if (this.field2420 == 0) {
            class254 var5 = (class254) this.field2425.method1700(-1);
            var5.method349(0);
            var5.method1490(-28126);
        } else {
            this.field2420--;
        }
        class185 var6 = new class185(arg1);
        this.field2411.method1825(var6, (byte) 64, arg2);
        this.field2425.method1694(104, var6);
        var6.field3967 = 0L;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method828(int arg0) {
        field2409 = null;
        if (arg0 != 0) {
            field2419 = null;
        }
        field2421 = null;
        field2417 = null;
        field2419 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JI)V")
    public final void method829(long arg0, int arg1) {
        field2427++;
        class254 var4 = (class254) this.field2411.method1824(arg0, arg1 + arg1);
        if (var4 != null) {
            var4.method349(arg1);
            var4.method1490(arg1 ^ 0xFFFF9222);
            this.field2420++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public static final void method830(int arg0) {
        class8.field158 = 0;
        if (arg0 < 5) {
            method831((class143) null, (byte) -48);
        }
        field2428++;
        class268.field4809 = 0;
        class114.method691((byte) -43);
        class167.method1101(true);
        class244.method1623(23049);
        for (int var1 = 0; var1 < class8.field158; var1++) {
            int var3 = class155.field2800[var1];
            if (class146.field2635 != class259.field4648[var3].field4146) {
                if (class259.field4648[var3].field3384.method487(90)) {
                    class5.method22(124, class259.field4648[var3]);
                }
                class259.field4648[var3].method1219((byte) -77, (class85) null);
                class259.field4648[var3] = null;
            }
        }
        if (class42.field708 != class161.field2902.field3487) {
            throw new RuntimeException("gnp1 pos:" + class161.field2902.field3487 + " psize:" + class42.field708);
        }
        for (int var2 = 0; var2 < class212.field3945; var2++) {
            if (class259.field4648[class56.field1093[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class212.field3945);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Llc;B)I")
    public static final int method831(class143 arg0, byte arg1) {
        field2431++;
        if (arg1 != 71) {
            return 64;
        } else if (class90.field1628 == null || arg0.method913((byte) 45) == 0) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class90.field1628.field2376; var2++) {
                if (class90.field1628.field2375[var2].method877(-106, class41.field696, class175.field3141).method912(32741, arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V")
    public static final void method832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2424++;
        class285.field5010.field3487 = 0;
        class285.field5010.method1276(844519173, 205);
        class285.field5010.method1276(844519173, arg2);
        class285.field5010.method1276(844519173, arg0);
        class285.field5010.method1278(arg3, (byte) 82);
        class285.field5010.method1278(arg1, (byte) 96);
        class83.field1504 = 1;
        int var5 = -74 % ((53 - arg4) / 39);
        class4.field63 = 0;
        class262.field4678 = -3;
        class249.field4488 = 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZ)Llc;")
    public static final class143 method833(int arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            field2422 = 81;
        }
        field2412++;
        return class37.method246((byte) 43, 10, arg2, arg0);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BILjava/util/Random;)I")
    public static final int method834(byte arg0, int arg1, Random arg2) {
        field2423++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class195.method1344((byte) -37, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg0 != -54) {
                field2430 = 35;
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class113.method677(var4, arg1, false);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public final void method835(int arg0, int arg1) {
        field2426++;
        if (class99.field1783 != null) {
            for (class254 var3 = (class254) this.field2425.method1698(arg0 ^ 0x6D); var3 != null; var3 = (class254) this.field2425.method1699(-62)) {
                if (var3.method789(true)) {
                    if (var3.method790(383) == null) {
                        var3.method349(0);
                        var3.method1490(-28126);
                        this.field2420++;
                    }
                } else if ((++var3.field3967) > ((long) arg1)) {
                    class254 var4 = class99.field1783.method1371((byte) 122, var3);
                    this.field2411.method1825(var4, (byte) 64, var3.field1162);
                    class101.method603(var3, 127, var4);
                    var3.method349(0);
                    var3.method1490(-28126);
                }
            }
        }
        if (arg0 != 1) {
            field2422 = -5;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        this.field2410 = arg0;
        this.field2420 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2411 = new class277(var2);
    }
}
