import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class186 {

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    private int field2998 = 0;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lnj;")
    private class144 field3002;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "[I")
    public static int[] field3005 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[Ldf;")
    public static class56[] field2999 = new class56[50];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Ltj;")
    private class280 field3001;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lbe;")
    public static class29 field2993;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Llc;")
    public static class86 field2996;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "[Z")
    public static boolean[] field3003;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field2993 = null;
        field3003 = null;
        field2999 = null;
        int var1 = -126 % ((arg0 + 88) / 38);
        field2996 = null;
        field3005 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBII)V")
    public static final void method1377(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 73) {
            method1376(21);
        }
        if (arg1 <= arg3) {
            class177.method1330(class240.field3831[arg4], arg1, arg0, 32232, arg3);
        } else {
            class177.method1330(class240.field3831[arg4], arg3, arg0, 32232, arg1);
        }
        field2997++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZII)V")
    public static final void method1378(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3000++;
        if (class101.field1498 < 100) {
            class77.method558(91);
        }
        class70.method500(arg3, arg0, arg1 + arg3, arg0 - -arg4);
        if (class101.field1498 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg0 - var5 - 18;
            int var7 = arg1 / 2 + arg3;
            class70.method508(arg3, arg0, arg1, arg4, 0);
            class70.method505(var7 - 152, var6, 304, 34, 9179409);
            class70.method505(var7 - 151, var6 + 1, 302, 32, 0);
            class70.method508(var7 - 150, var6 + 2, class101.field1498 * 3, 30, 9179409);
            class70.method508(class101.field1498 * 3 + var7 - 150, var6 + 2, 300 - (class101.field1498 * 3), 30, 0);
            class285.field4511.method1260(class183.field2948, var7, var5 + var6, 16777215, -1);
            return;
        }
        class77.field1116 = (int) ((float) (arg1 * 2) / class6.field52);
        class206.field3316 = class172.field2765 - ((int) ((float) arg1 / class6.field52));
        int var8 = (int) ((float) arg1 / class6.field52) + class172.field2765;
        class84.field1214 = class296.field4682 - ((int) ((float) arg4 / class6.field52));
        int var9 = class172.field2765 - ((int) ((float) arg1 / class6.field52));
        int var10 = class296.field4682 + ((int) ((float) arg4 / class6.field52));
        int var11 = class296.field4682 - ((int) ((float) arg4 / class6.field52));
        class286.field4546 = (int) ((float) (arg4 * 2) / class6.field52);
        if (!arg2) {
            field2993 = null;
        }
        class182.method1353(var11, var10, var9, arg0, arg1 + arg3, arg3, var8, (byte) -30, arg0 + arg4);
        class210.method1534((byte) -114, arg0 + arg4, var10, class222.field3567, var8, arg1 + arg3, var11, arg0, var9, arg3);
        class253.method1794(var10, var9, arg0, var8, arg3, arg1 + arg3, var11, -1, arg0 + arg4);
        if (class180.field2905 > 0) {
            class62.field905--;
            if (class62.field905 == 0) {
                class62.field905 = 20;
                class180.field2905--;
            }
        }
        if (!class159.field2605) {
            return;
        }
        int var12 = arg4 + arg0 - 8;
        int var13 = arg1 + arg3 - 5;
        class12.field139.method1247("Fps:" + class275.field4417, var13, var12, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var17 = var12 - 15;
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class12.field139.method1247("Mem:" + var16 + "k", var13, var17, var15, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Llc;Z)V")
    public static final void method1379(class86 arg0, boolean arg1) {
        class120.field1755 = arg0;
        field2995++;
        if (arg1) {
            method1376(1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lnj;)V")
    public class186(class144 arg0) {
        this.field3002 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Ltj;")
    public final class280 method1380(int arg0) {
        field2994++;
        if (this.field2998 > 0 && this.field3002.field2343[this.field2998 - 1] != this.field3001) {
            class280 var2 = this.field3001;
            this.field3001 = var2.field4470;
            return var2;
        }
        if (arg0 != 1) {
            method1379((class86) null, false);
        }
        while (this.field2998 < this.field3002.field2344) {
            class280 var3 = this.field3002.field2343[this.field2998++].field4470;
            if (this.field3002.field2343[this.field2998 - 1] != var3) {
                this.field3001 = var3.field4470;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Ltj;")
    public final class280 method1381(byte arg0) {
        this.field2998 = 0;
        if (arg0 < 2) {
            return null;
        } else {
            field3004++;
            return this.method1380(1);
        }
    }
}
