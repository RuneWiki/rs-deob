import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class110 extends class442 implements Runnable {

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    public int field1544 = -1;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "Z")
    private boolean field1548 = true;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "Ltr;")
    private class84 field1543;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "[B")
    public static byte[] field1554 = new byte[520];

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "Lpg;")
    public static class492 field1552 = new class492(32, -1);

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "Lui;")
    public static class375 field1555 = new class375("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "Ltf;")
    public static class167 field1550;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
    public final void method725(boolean arg0) {
        if (!arg0) {
            this.field1544 = 68;
        }
        field1546++;
        this.field1548 = false;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static void method726(int arg0) {
        if (arg0 == -1) {
            field1554 = null;
            field1550 = null;
            field1552 = null;
            field1555 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
    public final void method727(int arg0) {
        (new Thread(this, "a")).start();
        field1551++;
        if (arg0 >= -86) {
            this.method725(true);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)I")
    public static final int method728(int arg0, boolean arg1) {
        field1553++;
        if (arg1) {
            method726(13);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)I")
    public static final int method729(boolean arg0) {
        field1545++;
        if (class362.field5615 == null) {
            if (!class455.field6680 && class12.field201 > 0) {
                if (class99.field1426 && class382.field5821.method705((byte) 43, 81) && class12.field201 > 2) {
                    return ((class32) class96.field1395.field4498.field6803.field6803).field497;
                }
                return ((class32) class96.field1395.field4498.field6803).field497;
            }
            int var1 = class346.field5419.method812(false);
            int var2 = class346.field5419.method811(false);
            int var3 = class107.field1519;
            int var4 = class439.field6536;
            int var5 = class455.field6686;
            if (var3 < var1 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class12.field201; var7++) {
                    if (class207.field2923) {
                        int var12 = var4 + ((class12.field201 + -1 + -var7) * 16) + 33;
                        if (var2 > (var12 - 13) && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class12.field201 - var7 - 1) * 16 + var4 + 31;
                        if (var11 - 13 < var2 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class8 var9 = new class8(class96.field1395);
                    for (class32 var10 = (class32) var9.method72((byte) -33); var10 != null; var10 = (class32) var9.method74(127)) {
                        if (var6 == var8++) {
                            return var10.field497;
                        }
                    }
                }
            }
        }
        return arg0 ? -93 : -1;
    }

    @OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1548) {
            this.field1543.method548(this, (byte) -101);
        }
        field1549++;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Ltr;)V")
    public class110(class84 arg0) {
        this.field1543 = arg0;
    }
}
