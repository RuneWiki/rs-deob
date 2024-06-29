import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class24 implements Runnable {

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[Lgh;")
    public volatile class168[] field304 = new class168[2];

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Z")
    public volatile boolean field311 = false;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Z")
    public volatile boolean field305 = false;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lqj;")
    public static class196 field301 = class80.method502(":clanreq:", -48);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lqj;")
    public static class196 field302 = class80.method502(" (X", -48);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lqj;")
    public static class196 field303 = class80.method502("<col=ff0000>", -48);

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Llj;")
    public class205 field307;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Lg;")
    public static final class221 method137(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        return var3 == null ? null : var3.field829;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method138(int arg0) {
        if (arg0 >= -85) {
            field302 = null;
        }
        field302 = null;
        field303 = null;
        field301 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)I")
    public static final int method139(int arg0, int arg1, byte arg2) {
        field310++;
        if (arg2 <= 101) {
            method141(4, 102);
        }
        int var3 = arg0 >> 31 & arg1 - 1;
        return (arg0 + (arg0 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILbk;)V")
    public static final void method140(int arg0, class136 arg1) {
        class189.field3310 = arg1.method833((byte) -119, client.field1468);
        field306++;
        class108.field1547 = arg1.method833((byte) -33, class73.field1055);
        class214.field3829 = arg1.method833((byte) -70, class192.field3373);
        class94.field1369 = arg1.method833((byte) -82, class40.field447);
        class102.field1481 = arg1.method833((byte) -119, class218.field3916);
        if (arg0 > -80) {
            field301 = null;
        }
        class246.field4386 = arg1.method833((byte) -73, class96.field1416);
        class102.field1478 = arg1.method833((byte) -44, class232.field4150);
        class118.field1690 = arg1.method833((byte) -42, class108.field1545);
        class230.field4086 = arg1.method833((byte) -99, class203.field3669);
        class7.field60 = arg1.method833((byte) -107, class142.field2181);
        class158.field2544 = arg1.method833((byte) -56, class178.field3068);
        class81.field1179 = arg1.method833((byte) -45, class57.field767);
        class147.field2325 = arg1.method833((byte) -123, class29.field357);
        class70.field996 = arg1.method833((byte) -97, class44.field519);
        class16.field182 = arg1.method833((byte) -44, class9.field99);
        class143.field2202 = arg1.method833((byte) -92, class85.field1249);
        arg1.method833((byte) -107, class181.field3188);
        class245.field4368 = arg1.method833((byte) -78, class185.field3258);
        class181.field3195 = arg1.method833((byte) -62, class195.field3429);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Z")
    public static final boolean method141(int arg0, int arg1) {
        field312++;
        int var2 = -91 / ((61 - arg0) / 55);
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!ij", name = "run", descriptor = "()V")
    public final void run() {
        field309++;
        this.field305 = true;
        try {
            while (!this.field311) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class168 var2 = this.field304[var1];
                    if (var2 != null) {
                        var2.method1098(false);
                    }
                }
                class73.method464((byte) -123, 10L);
                class45.method243(-31656, null, this.field307);
            }
        } catch (Exception var9) {
            class165.method1054(35, null, var9);
        } finally {
            Object var6 = null;
            this.field305 = false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static final void method142(int arg0) {
        field308++;
        int var1 = class157.field2537 - (int) ((double) class12.field135.field3085 / class199.field3530);
        int var2 = (int) ((double) class12.field135.field3085 / class199.field3530) + class157.field2537;
        if (arg0 != -5522) {
            method142(51);
        }
        int var3 = (int) ((double) class12.field135.field2997 / class199.field3530) + class126.field1784;
        if (var1 < 0) {
            class120.field1737 = -1;
            class45.field537 = -1;
            class157.field2537 = (int) ((double) class12.field135.field3085 / class199.field3530);
        }
        int var4 = class126.field1784 - (int) ((double) class12.field135.field2997 / class199.field3530);
        if (class144.field2221 < var2) {
            class120.field1737 = -1;
            class157.field2537 = class144.field2221 - (int) ((double) class12.field135.field3085 / class199.field3530);
            class45.field537 = -1;
        }
        if (var4 < 0) {
            class126.field1784 = (int) ((double) class12.field135.field2997 / class199.field3530);
            class120.field1737 = -1;
            class45.field537 = -1;
        }
        if (class83.field1213 < var3) {
            class45.field537 = -1;
            class126.field1784 = class83.field1213 - (int) ((double) class12.field135.field2997 / class199.field3530);
            class120.field1737 = -1;
        }
    }
}
