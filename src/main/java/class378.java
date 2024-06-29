import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class378 extends class595 {

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    public static int field5075 = -1;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "Lej;")
    public static class104 field5070 = new class104("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "Lvaa;")
    public static class399 field5080 = new class399();

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "F")
    public static float field5073;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        ++field5071;
        if (!arg1) {
            this.method301((class445) null, -113, -62);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        super.field8612.method2267(2, arg0);
        if (arg1 != -1) {
            method2233(true, false);
        }
        ++field5074;
        super.field8612.method2334(arg2, (byte) 93);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lwr;)V")
    public class378(class388 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        if (arg2 > -114) {
            field5070 = null;
        }
        ++field5077;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        if (arg0 == -1) {
            ++field5082;
        }
    }

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        if (arg0 == -60) {
            ++field5078;
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(ZZ)V")
    public static final void method2233(boolean arg0, boolean arg1) {
        ++field5072;
        if (arg1) {
            if (~class56.field1005 != 0) {
                class296.method1892(class56.field1005, (byte) -104);
            }
            for (class128 var2 = (class128) class211.field2971.method1248(-1); var2 != null; var2 = (class128) class211.field2971.method1245((byte) 95)) {
                if (!var2.method1120(0)) {
                    var2 = (class128) class211.field2971.method1248(-1);
                    if (var2 == null) {
                        break;
                    }
                }
                class299.method1902(true, var2, (byte) 78, false);
            }
            class56.field1005 = -1;
            class211.field2971 = new class205(8);
            class207.method1354((byte) -84);
            class56.field1005 = class178.field2551;
            class443.method2621(false, !arg0);
            class40.method413(-101);
            class123.method849(class56.field1005);
        }
        class150.field2283 = arg0;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        ++field5076;
        if (arg0 >= -119) {
            field5070 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "(B)V")
    public static void method2234(byte arg0) {
        if (arg0 != -112) {
            field5073 = -0.15952468F;
        }
        field5070 = null;
        field5080 = null;
    }
}
