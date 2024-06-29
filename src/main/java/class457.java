import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class457 {

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Lge;")
    private class511 field6641 = new class511(64);

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lge;")
    private class511 field6642 = new class511(100);

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lci;")
    private class320 field6635;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field6634 = -60;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public static int[] field6631 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[I")
    public static int[] field6638 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[I")
    public static int[] field6639;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Lrw;", line = 3)
    public final class543 method2714(int arg0, byte arg1) {
        field6633++;
        class511 var3 = this.field6642;
        class543 var4;
        synchronized (this.field6642) {
            if (arg1 <= 63) {
                field6639 = null;
            }
            var4 = (class543) this.field6642.method2982(0, (long) arg0);
            if (var4 == null) {
                var4 = new class543(arg0);
                this.field6642.method2981(var4, 74, (long) arg0);
            }
        }
        synchronized (var4) {
            return var4.method3187((byte) -109) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 31)
    public final void method2715(byte arg0) {
        class511 var2 = this.field6641;
        synchronized (this.field6641) {
            this.field6641.method2990((byte) -71);
        }
        field6640++;
        if (arg0 != 25) {
            this.method2714(88, (byte) 33);
        }
        class511 var3 = this.field6642;
        synchronized (this.field6642) {
            this.field6642.method2990((byte) -68);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V", line = 48)
    public static void method2716(boolean arg0) {
        field6639 = null;
        field6631 = null;
        if (arg0) {
            method2718((byte) 107, 93);
        }
        field6638 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lkg;", line = 62)
    public final class183 method2717(int arg0, int arg1) {
        field6643++;
        class511 var3 = this.field6641;
        class183 var4;
        synchronized (this.field6641) {
            var4 = (class183) this.field6641.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field6635;
        byte[] var6;
        synchronized (this.field6635) {
            var6 = this.field6635.method2037(class126.method935(arg1, (byte) 86), (byte) -81, class239.method1581((byte) 127, arg1));
        }
        class183 var7 = new class183();
        var7.field2705 = arg1;
        var7.field2710 = this;
        if (var6 != null) {
            var7.method1267(false, new class519(var6));
        }
        var7.method1272((byte) -100);
        if (arg0 > -90) {
            this.field6635 = null;
        }
        class511 var8 = this.field6641;
        synchronized (this.field6641) {
            this.field6641.method2981(var7, 48, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V", line = 103)
    public static final void method2718(byte arg0, int arg1) {
        field6636++;
        class316.field4697.method2989(false, arg1);
        class425.field6026.method2989(false, arg1);
        class248.field3697.method2989(false, arg1);
        class260.field3847.method2989(false, arg1);
        class316.field4701.method2989(false, arg1);
        if (arg0 >= -119) {
            field6638 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V", line = 125)
    public final void method2719(int arg0, boolean arg1) {
        field6632++;
        class511 var3 = this.field6641;
        synchronized (this.field6641) {
            this.field6641.method2989(false, arg0);
        }
        if (!arg1) {
            this.field6635 = null;
        }
        class511 var4 = this.field6642;
        synchronized (this.field6642) {
            this.field6642.method2989(!arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 142)
    public final void method2720(int arg0) {
        if (arg0 >= -40) {
            return;
        }
        field6637++;
        class511 var2 = this.field6641;
        synchronized (this.field6641) {
            this.field6641.method2980(-182819096);
        }
        class511 var3 = this.field6642;
        synchronized (this.field6642) {
            this.field6642.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lsn;ILci;Lci;Lci;)V", line = 172)
    public class457(class453 arg0, int arg1, class320 arg2, class320 arg3, class320 arg4) {
        this.field6635 = arg2;
        if (this.field6635 != null) {
            int var6 = this.field6635.method2033((byte) 60) - 1;
            this.field6635.method2030(-10914, var6);
        }
        class47.method439(arg3, arg4, 0);
    }
}
