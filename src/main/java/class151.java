import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class151 {

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lrg;")
    private class236 field2596;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Lea;")
    private class200 field2601;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Luc;")
    private class11 field2597;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field2589 = 20;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Le;")
    public static class191 field2598 = class54.method368("settings", 2047);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lji;")
    private class225 field2602;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[Lnh;")
    private class272[] field2590;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Z")
    public final boolean method1021(byte arg0) {
        field2592++;
        if (this.field2602 != null) {
            return true;
        }
        if (arg0 < 33) {
            field2598 = null;
        }
        if (this.field2597 == null) {
            if (this.field2601.method1405(-62)) {
                return false;
            }
            this.field2597 = this.field2601.method1396(true, 255, 255, (byte) 0, false);
        }
        if (this.field2597.field4183) {
            return false;
        } else {
            this.field2602 = new class225(this.field2597.method77(-15219));
            this.field2590 = new class272[(this.field2602.field3995.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1022(int arg0) {
        if (arg0 != 20799) {
            field2589 = -121;
        }
        field2598 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLr;Lr;II)Lnh;")
    private final class272 method1023(boolean arg0, class59 arg1, class59 arg2, int arg3, int arg4) {
        field2594++;
        if (this.field2602 == null) {
            throw new RuntimeException();
        }
        this.field2602.field3996 = arg3 * 8 + 5;
        if (this.field2602.field3996 >= this.field2602.field3995.length) {
            throw new RuntimeException();
        } else if (this.field2590[arg3] == null) {
            if (arg4 != 255) {
                this.method1028((class59) null, (class59) null, 23, -128);
            }
            int var6 = this.field2602.method1562(arg4 + 21450);
            int var7 = this.field2602.method1562(arg4 + 21450);
            class272 var8 = new class272(arg3, arg1, arg2, this.field2601, this.field2596, var6, var7, arg0);
            this.field2590[arg3] = var8;
            return var8;
        } else {
            return this.field2590[arg3];
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public final void method1024(int arg0) {
        field2599++;
        if (this.field2590 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field2590.length; var2++) {
            if (this.field2590[var2] != null) {
                this.field2590[var2].method1858((byte) 1);
            }
        }
        for (int var3 = 0; var3 < this.field2590.length; var3++) {
            if (this.field2590[var3] != null) {
                this.field2590[var3].method1860(arg0 - 666090616);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
    public static final int method1025(int arg0, int arg1) {
        field2593++;
        if (arg0 != 127) {
            field2598 = null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(JI)Le;")
    public static final class191 method1026(long arg0, int arg1) {
        class134.field2248.setTime(new Date(arg0));
        field2600++;
        if (arg1 != 10) {
            return null;
        }
        int var3 = class134.field2248.get(7);
        int var4 = class134.field2248.get(5);
        int var5 = class134.field2248.get(2);
        int var6 = class134.field2248.get(1);
        int var7 = class134.field2248.get(11);
        int var8 = class134.field2248.get(12);
        int var9 = class134.field2248.get(13);
        return class228.method1629(new class191[] { class132.field2220[var3 - 1], class254.field4507, class92.method563(-120, var4 / 10), class92.method563(-81, var4 % 10), class173.field2912, class132.field2210[var5], class173.field2912, class92.method563(-67, var6), class162.field2752, class92.method563(-64, var7 / 10), class92.method563(arg1 ^ 0xFFFFFFB2, var7 % 10), class59.field1070, class92.method563(-72, var8 / 10), class92.method563(-106, var8 % 10), class59.field1070, class92.method563(-88, var9 / 10), class92.method563(-103, var9 % 10), class115.field1906 }, (byte) -118);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BJI[I)Le;")
    public static final class191 method1027(byte arg0, long arg1, int arg2, int[] arg3) {
        field2595++;
        if (class9.field99 != null) {
            class191 var5 = class9.field99.method1415(arg1, arg3, arg2, (byte) 102);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 != -29) {
            field2589 = 74;
        }
        return arg2 == 5 ? class33.method225(arg1, false).method1345((byte) -18) : class95.method587(arg1, -117);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lr;Lr;II)Lnh;")
    public final class272 method1028(class59 arg0, class59 arg1, int arg2, int arg3) {
        if (arg3 != 10) {
            this.method1023(true, (class59) null, (class59) null, -88, -99);
        }
        field2591++;
        return this.method1023(true, arg0, arg1, arg2, 255);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lea;Lrg;)V")
    public class151(class200 arg0, class236 arg1) {
        this.field2596 = arg1;
        this.field2601 = arg0;
        if (!this.field2601.method1405(-112)) {
            this.field2597 = this.field2601.method1396(true, 255, 255, (byte) 0, false);
        }
    }
}
