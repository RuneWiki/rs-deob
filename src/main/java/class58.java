import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class17 {

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "[B")
    public byte[] field1446;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Lmb;")
    public static class84 field1449 = class79.method672(true, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Ls;")
    public static class118 field1448 = new class118(32);

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field1453 = 0;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1449 = null;
        field1448 = null;
        if (arg0 < 82) {
            method515((byte) 90);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public static final void method515(byte arg0) {
        field1451++;
        Object var1 = class76.field1916;
        synchronized (class76.field1916) {
            if (class27.field657 != 0) {
                class27.field657 = 1;
                try {
                    class76.field1916.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 > -117) {
            field1452 = 77;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
    public class58(byte[] arg0) {
        this.field1446 = arg0;
    }
}
