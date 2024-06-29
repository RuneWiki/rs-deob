import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class393 {

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Len;")
    public class282 field5963 = new class282();

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Lss;")
    public static class213 field5962 = new class213("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "Len;")
    private class282 field5969;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "[I")
    public static int[] field5961;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Len;")
    public final class282 method2503(int arg0) {
        field5966++;
        if (arg0 != 0) {
            return null;
        }
        class282 var2 = this.field5963.field4453;
        if (this.field5963 == var2) {
            this.field5969 = null;
            return null;
        } else {
            this.field5969 = var2.field4453;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILen;)V")
    public final void method2504(int arg0, class282 arg1) {
        if (arg1.field4454 != null) {
            arg1.method1898(0);
        }
        field5967++;
        arg1.field4453 = this.field5963;
        arg1.field4454 = this.field5963.field4454;
        arg1.field4454.field4453 = arg1;
        if (arg0 != 17299) {
            this.method2503(21);
        }
        arg1.field4453.field4454 = arg1;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public final void method2505(int arg0) {
        if (arg0 != -1928) {
            method2509(false);
        }
        field5964++;
        while (true) {
            class282 var2 = this.field5963.field4453;
            if (this.field5963 == var2) {
                this.field5969 = null;
                return;
            }
            var2.method1898(0);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)I")
    public final int method2506(byte arg0) {
        field5960++;
        if (arg0 > -29) {
            return 45;
        }
        int var2 = 0;
        class282 var3 = this.field5963.field4453;
        while (this.field5963 != var3) {
            var3 = var3.field4453;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
    public static final void method2507(int arg0) {
        field5959++;
        class170.field2488.method1477(65280, class184.field2680.method1017((byte) 124));
        class170.field2488.method1477(65280, class89.field1314.method1017((byte) -45));
        class170.field2488.method1477(65280, class483.field7346.method1017((byte) -51));
        class170.field2488.method1477(65280, class315.field4926.method1017((byte) 126));
        class170.field2488.method1477(arg0 ^ 0xFFFF377A, class300.field4717.method1017((byte) 114));
        class170.field2488.method1477(65280, class128.field1730.method1017((byte) -51));
        class170.field2488.method1477(65280, class305.field4799.method1017((byte) -8));
        class170.field2488.method1477(arg0 ^ 0xFFFF377A, class236.field3876.method1017((byte) -42));
        class170.field2488.method1477(65280, class120.field1646.method1017((byte) 104));
        class170.field2488.method1477(65280, class186.field2714.method1017((byte) 120));
        class170.field2488.method1477(65280, class337.field5259.method1017((byte) 115));
        class170.field2488.method1477(65280, class198.field3045.method1017((byte) -74));
        class170.field2488.method1477(65280, class467.field7157.method1017((byte) -33));
        class170.field2488.method1477(65280, class130.field1767.method1017((byte) 113));
        class170.field2488.method1477(65280, class116.field1621.method1017((byte) 110));
        class170.field2488.method1477(65280, class71.field1074.method1017((byte) 120));
        if (arg0 != -14214) {
            method2507(60);
        }
        class170.field2488.method1477(65280, class263.field4264.method1017((byte) -6));
        class170.field2488.method1477(65280, class415.field6290.method1017((byte) -84));
        class170.field2488.method1477(65280, class79.field1178.method1017((byte) 124));
        class170.field2488.method1477(65280, class181.field2636.method1017((byte) 106));
        class170.field2488.method1477(arg0 + 79494, class290.field4581.method1017((byte) 103));
        class170.field2488.method1477(arg0 ^ 0xFFFF377A, class463.field7119.method1017((byte) 110));
        class170.field2488.method1477(65280, class41.field448.method1017((byte) -42));
        class170.field2488.method1477(65280, class52.field706.method1017((byte) -36));
        class170.field2488.method1477(65280, class122.field1664.method1017((byte) 108));
        class170.field2488.method1477(65280, class285.field4501.method1017((byte) -70));
        class170.field2488.method1477(65280, class502.field7525.method1017((byte) 118));
        class170.field2488.method1477(65280, class214.field3646.method1017((byte) 107));
        class170.field2488.method1477(65280, class10.field106.method1017((byte) 104));
        class170.field2488.method1477(65280, class463.field7117.method1017((byte) 105));
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
    public static final void method2508(byte arg0) {
        class427.field6456 = null;
        class442.field6880 = null;
        field5968++;
        if (arg0 != 108) {
            field5961 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
    public static void method2509(boolean arg0) {
        field5962 = null;
        if (!arg0) {
            method2508((byte) -56);
        }
        field5961 = null;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)Len;")
    public final class282 method2510(int arg0) {
        field5965++;
        if (arg0 != 0) {
            this.method2505(-20);
        }
        class282 var2 = this.field5969;
        if (this.field5963 == var2) {
            this.field5969 = null;
            return null;
        } else {
            this.field5969 = var2.field4453;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
    public class393() {
        this.field5963.field4454 = this.field5963;
        this.field5963.field4453 = this.field5963;
    }
}
