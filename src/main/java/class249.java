import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class249 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[I")
    public static int[] field4291 = new int[100];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Loa;")
    public static class99 field4290 = class221.method1463(2844, ")4l=");

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[J")
    public static long[] field4293 = new long[500];

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lwk;")
    public static class273 field4294 = new class273(260);

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
    public static final void method1611(int arg0, int arg1, int arg2) {
        int var3 = 24 % ((arg2 - 59) / 59);
        field4297++;
        class65 var4 = class152.method1010(arg1, 6, (byte) -79);
        var4.method433(32);
        var4.field1094 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field4294 = null;
        if (arg0 == -101) {
            field4293 = null;
            field4290 = null;
            field4291 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZII)V")
    public static final void method1613(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class178.field3099 = 0L;
        int var5 = class143.method972(-3);
        boolean var6 = false;
        int var7 = 26 / ((-arg0 - 59) / 59);
        if (arg4 > 0 != var5 > 0) {
            var6 = true;
        }
        if (arg4 == 3 || var5 == 3) {
            arg2 = true;
        }
        field4295++;
        if (class87.field1510.startsWith("mac") && arg4 > 0) {
            arg2 = true;
        }
        if (arg2 && arg4 > 0) {
            var6 = true;
        }
        class186.method1275(arg3, arg2, arg1, var5, arg4, var6, (byte) -116);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static final void method1614(int arg0) {
        class180.field3146 = 0;
        class131.field2277.field4587 = 0;
        field4296++;
        class240.field4133 = 0;
        class77.field1364 = 0;
        if (arg0 >= -104) {
            method1614(-63);
        }
        class258.field4497 = 0;
        class129.field2252.field4587 = 0;
        class105.field1761 = 0;
        class238.field4112 = -1;
        class212.field3669 = -1;
        class128.field2230 = -1;
        class18.field195 = 0;
        class107.field1823 = -1;
        class244.field4209 = false;
        for (int var1 = 0; var1 < class259.field4515.length; var1++) {
            if (class259.field4515[var1] != null) {
                class259.field4515[var1].field1265 = -1;
            }
        }
        for (int var2 = 0; var2 < class248.field4287.length; var2++) {
            if (class248.field4287[var2] != null) {
                class248.field4287[var2].field1265 = -1;
            }
        }
        class25.method192((byte) 77);
        class141.field2481 = 1;
        class138.method943(0, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class173.field3057[var3] = true;
        }
        class115.method775(32435);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lwh;I)Lwh;")
    public abstract class194 method722(class194 arg0, int arg1);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)I")
    public static final int method1615(int arg0, int arg1, int arg2) {
        field4292++;
        int var3 = -28 / ((-arg1 - 85) / 39);
        class9 var4 = (class9) class277.field4868.method1550(true, (long) arg2);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && var4.field66.length > arg0) {
            return var4.field66[arg0];
        } else {
            return -1;
        }
    }
}
