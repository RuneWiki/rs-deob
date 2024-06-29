import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class79 extends class153 {

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field1480 = 0;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "Lpj;")
    public static class237 field1481 = class33.method353("null", 78);

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "Loj;")
    public static class156 field1485;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "Lge;")
    private class69 field1484;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "[[[B")
    public static byte[][][] field1479;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public static void method606(byte arg0) {
        if (arg0 <= 35) {
            field1481 = null;
        }
        field1479 = null;
        field1481 = null;
        field1485 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
    public final int method607(int arg0, int arg1, int arg2) {
        field1482++;
        if (this.field1484 == null) {
            return arg1;
        }
        class166 var4 = (class166) this.field1484.method568((long) arg2, -1);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 < 73) {
                field1481 = null;
            }
            return var4.field2932;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILpj;)Lkk;")
    public static final class224 method608(int arg0, class237 arg1) {
        field1483++;
        int var2 = -30 / ((arg0 - 59) / 45);
        for (class224 var3 = (class224) class210.field3587.method673(false); var3 != null; var3 = (class224) class210.field3587.method680(28)) {
            if (var3.field3857.method1585((byte) 99, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lie;I)V")
    public final void method609(class32 arg0, int arg1) {
        if (arg1 != 19111) {
            this.field1484 = null;
        }
        field1488++;
        while (true) {
            int var3 = arg0.method316((byte) 126);
            if (var3 == 0) {
                return;
            }
            this.method612(var3, -94, arg0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IB)V")
    public static final void method610(int arg0, byte arg1) {
        if (arg1 <= 102) {
            return;
        }
        field1478++;
        if (class264.field4507 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class264.field4507 == 0) {
            class41.method411(0);
        }
        if (arg0 == 40) {
            class260.method1752(-68);
        }
        if (arg0 != 40 && class153.field2729 != null) {
            class153.field2729.method1431((byte) 49);
            class153.field2729 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class23.field425 = 1;
            class240.field4230 = 0;
            class81.field1524 = 0;
            class144.field2597 = 0;
            class92.field1669 = 1;
            class142.method982(0);
        }
        if (arg0 == 5) {
            class172.method1189(-93, class76.field1440);
        } else {
            class273.method1823(0);
        }
        boolean var3 = class264.field4507 == 5 || class264.field4507 == 10 || class264.field4507 == 28;
        if (var3 != var2) {
            if (var2) {
                class190.field3311 = class110.field1940;
                if (class113.field1983 == 0) {
                    class211.method1411(2, -25906);
                } else {
                    class92.method693(class110.field1940, 7525, 255, false, 2, 0, class151.field2685);
                }
                class202.field3475.method394(false, 0);
            } else {
                class211.method1411(2, -25906);
                class202.field3475.method394(true, 0);
            }
        }
        class264.field4507 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILpj;I)Lpj;")
    public final class237 method611(int arg0, class237 arg1, int arg2) {
        field1487++;
        if (this.field1484 == null) {
            return arg1;
        } else if (arg0 > -69) {
            return null;
        } else {
            class190 var4 = (class190) this.field1484.method568((long) arg2, -1);
            return var4 == null ? arg1 : var4.field3303;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILie;)V")
    private final void method612(int arg0, int arg1, class32 arg2) {
        int var4 = 42 / ((-arg1 - 18) / 60);
        if (arg0 == 249) {
            int var5 = arg2.method316((byte) 123);
            if (this.field1484 == null) {
                int var6 = class10.method114(var5, (byte) -117);
                this.field1484 = new class69(var6);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                boolean var8 = arg2.method316((byte) -73) == 1;
                int var9 = arg2.method313((byte) -80);
                class81 var10;
                if (var8) {
                    var10 = new class190(arg2.method324(1));
                } else {
                    var10 = new class166(arg2.method319((byte) -18));
                }
                this.field1484.method562(var10, (long) var9, (byte) 56);
            }
        }
        field1486++;
    }
}
