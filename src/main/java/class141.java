import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class141 {

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "Lmf;")
    private class382 field2085 = new class382(64);

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "Lpu;")
    private class522 field2088;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field2083 = 500;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "S")
    public static short field2081 = 320;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "[Lde;")
    public static class491[] field2087 = new class491[2048];

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "Lpu;")
    public static class522 field2086;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)Lts;", line = 7)
    public final class495 method1018(int arg0, int arg1) {
        field2089++;
        class382 var3 = this.field2085;
        class495 var4;
        synchronized (this.field2085) {
            var4 = (class495) this.field2085.method2287(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field2088;
        byte[] var6;
        synchronized (this.field2088) {
            var6 = this.field2088.method3007(5, arg0, 5);
            if (arg1 <= 12) {
                field2087 = null;
            }
        }
        class495 var7 = new class495();
        if (var6 != null) {
            var7.method2865(23677, new class695(var6));
        }
        class382 var8 = this.field2085;
        synchronized (this.field2085) {
            this.field2085.method2291(var7, (long) arg0, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method1019(int arg0, int arg1, int arg2) {
        field2082++;
        if (arg2 != 2048) {
            field2080 = 71;
        }
        return class161.method1109(-125, arg1, arg0) | (arg0 & 0x70000) != 0 || class182.method1225(arg1, 117, arg0);
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 66)
    public class141(class693 arg0, int arg1, class522 arg2) {
        this.field2088 = arg2;
        this.field2088.method2988(-112, 5);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V", line = 85)
    public static void method1020(int arg0) {
        int var1 = 121 % ((arg0 - 50) / 43);
        field2087 = null;
        field2086 = null;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)I", line = 102)
    public static final int method1021(int arg0) {
        int var1 = 88 / ((arg0 - 31) / 53);
        field2084++;
        return class148.field2163;
    }
}
