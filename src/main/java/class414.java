import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class414 extends class187 {

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Loa;")
    public class149 field5963;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lae;")
    public class275 field5969;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field5959 = new String[100];

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "Lph;")
    public static class114 field5971 = new class114(32);

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "[[I")
    public static int[][] field5972 = new int[128][128];

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field5960;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public int field5961;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public int field5964;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public int field5965;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public int field5968;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Lck;")
    public static class351 field5973;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 4)
    public final void method2568(boolean arg0) {
        this.field5965 = this.field5963.field1900;
        this.field5961 = this.field5963.field1892;
        this.field5960 = this.field5963.field1888;
        field5967++;
        if (this.field5963.field1891 != null) {
            this.field5963.field1891.method745(this.field5969.field3717, this.field5969.field3723, this.field5969.field3722, class99.field1170);
        }
        this.field5968 = class99.field1170[0];
        this.field5964 = class99.field1170[2];
        if (!arg0) {
            field5973 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 28)
    public static void method2569(byte arg0) {
        field5959 = null;
        field5973 = null;
        field5971 = null;
        field5972 = null;
        if (arg0 != -46) {
            method2571((byte) -94);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V", line = 42)
    public static final void method2570(boolean arg0) {
        field5962++;
        class405 var1 = (class405) class342.field4577.method814((byte) 90);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            if (class435.method2691((byte) -122, var1.field5892)) {
                class221.method1196(var1, 125);
            }
            var1 = (class405) class342.field4577.method827(88);
        }
        if (class244.field3323 == 1) {
            class452.field6586 = false;
            class136.method735(false, class229.field3159, class344.field4620, class344.field4618, class18.field179);
            return;
        }
        class136.method735(arg0, class229.field3159, class344.field4620, class344.field4618, class18.field179);
        int var2 = class111.field1385.method2526(class320.field4286, 160);
        for (class405 var3 = (class405) class342.field4577.method814((byte) 90); var3 != null; var3 = (class405) class342.field4577.method827(45)) {
            int var4 = class432.method2678(var3, 1);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class229.field3159 = (class338.field4511 ? 26 : 22) + class244.field3323 * 16;
        class344.field4620 = var2 + 8;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 109)
    public static final void method2571(byte arg0) {
        field5970++;
        class114 var1 = class200.field2684;
        synchronized (class200.field2684) {
            class200.field2684.method613(true);
        }
        class114 var2 = class77.field869;
        synchronized (class77.field869) {
            class77.field869.method613(true);
        }
        class114 var3 = class12.field111;
        synchronized (class12.field111) {
            class12.field111.method613(true);
        }
        class114 var4 = class291.field3956;
        synchronized (class291.field3956) {
            class291.field3956.method613(true);
        }
        if (arg0 != -36) {
            field5972 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Llp;", line = 135)
    public static final class61 method2572(int arg0, int arg1) {
        field5958++;
        class61 var2 = (class61) class344.field4615.method616(-75, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class383.field5460.method1687(arg1, arg0, arg0 + 226);
        class61 var4 = new class61();
        if (var3 != null) {
            var4.method330(new class250(var3), arg0 ^ 0x2C86, arg1);
        }
        class344.field4615.method615((byte) -111, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Loa;Ldp;)V", line = 161)
    public class414(class149 arg0, class174 arg1) {
        this.field5963 = arg0;
        this.field5969 = class314.method1823(arg0.field1884, 115);
        this.method2568(true);
    }
}
