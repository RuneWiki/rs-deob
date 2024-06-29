import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class346 {

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "Lds;")
    private class225 field4982 = new class225();

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4972 = "level: ";

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field4980 = -1;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field4983 = 0;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field4976 = 0;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Lcr;")
    public static class189 field4984 = new class189(64);

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "[[I")
    public static int[][] field4986 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lds;")
    private class225 field4987;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILje;Lje;)V")
    public static final void method2243(int arg0, int arg1, int arg2, class299 arg3, class299 arg4) {
        if (class213.field2852[arg0][arg1][arg2] == null) {
            class365.method2386(arg0, arg1, arg2);
        }
        class213.field2852[arg0][arg1][arg2].field3519 = arg3;
        class213.field2852[arg0][arg1][arg2].field3502 = arg4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Lds;")
    public final class225 method2244(int arg0) {
        field4970++;
        if (arg0 != 0) {
            field4979 = 64;
        }
        class225 var2 = this.field4987;
        if (this.field4982 == var2) {
            this.field4987 = null;
            return null;
        } else {
            this.field4987 = var2.field2961;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lds;B)V")
    public final void method2245(class225 arg0, byte arg1) {
        field4978++;
        if (arg1 > -33) {
            return;
        }
        if (arg0.field2958 != null) {
            arg0.method1302(true);
        }
        arg0.field2958 = this.field4982.field2958;
        arg0.field2961 = this.field4982;
        arg0.field2958.field2961 = arg0;
        arg0.field2961.field2958 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Lds;")
    public final class225 method2246(byte arg0) {
        field4973++;
        class225 var2 = this.field4982.field2961;
        if (this.field4982 == var2) {
            return null;
        } else {
            var2.method1302(true);
            return arg0 > -99 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    public static final void method2247(int arg0, int arg1) {
        if (arg0 != 25048) {
            field4976 = -6;
        }
        class189 var2 = class304.field4463;
        synchronized (class304.field4463) {
            class304.field4463.method1142((byte) -66, arg1);
        }
        field4977++;
        class189 var3 = class242.field3238;
        synchronized (class242.field3238) {
            class242.field3238.method1142((byte) -50, arg1);
        }
        class178 var4 = class212.field2835;
        synchronized (class212.field2835) {
            class212.field2835.method1089((byte) 59, arg1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public static void method2248(boolean arg0) {
        field4984 = null;
        if (arg0) {
            method2243(97, 67, -36, (class299) null, (class299) null);
        }
        field4972 = null;
        field4986 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZIII)V")
    public static final void method2249(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class124.field1723++;
        class185.field2507.method5(-6445, 189);
        field4971++;
        class185.field2507.method1330(arg2, 9);
        if (!arg1) {
            method2248(true);
        }
        class185.field2507.method1330(arg3, -117);
        class185.field2507.method1339(arg0, -16777216);
        class185.field2507.method1324(arg4, (byte) 118);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Lds;")
    public final class225 method2250(int arg0) {
        field4985++;
        class225 var2 = this.field4982.field2961;
        if (this.field4982 == var2) {
            this.field4987 = null;
            return null;
        }
        this.field4987 = var2.field2961;
        if (arg0 != 1580) {
            this.method2252((byte) 27);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public final void method2251(int arg0) {
        if (arg0 != 6) {
            return;
        }
        field4981++;
        while (true) {
            class225 var2 = this.field4982.field2961;
            if (this.field4982 == var2) {
                this.field4987 = null;
                return;
            }
            var2.method1302(true);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I")
    public final int method2252(byte arg0) {
        field4975++;
        if (arg0 <= 110) {
            method2248(true);
        }
        int var2 = 0;
        class225 var3 = this.field4982.field2961;
        while (this.field4982 != var3) {
            var3 = var3.field2961;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class346() {
        this.field4982.field2961 = this.field4982;
        this.field4982.field2958 = this.field4982;
    }
}
