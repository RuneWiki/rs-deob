import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class146 {

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "Lad;")
    private class19 field1616 = new class19(64);

    @OriginalMember(owner = "client!bfa", name = "i", descriptor = "Ltf;")
    private class701 field1620;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "Lcq;")
    public static class110 field1612 = new class110(84, 8);

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "Z")
    public static boolean field1617 = false;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)La;", line = 3)
    public final class358 method802(int arg0, int arg1) {
        int var3 = -114 % ((arg1 + 64) / 57);
        field1613++;
        class19 var4 = this.field1616;
        class358 var5;
        synchronized (this.field1616) {
            var5 = (class358) this.field1616.method78(0, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class701 var6 = this.field1620;
        byte[] var7;
        synchronized (this.field1620) {
            var7 = this.field1620.method3854((byte) 69, 19, arg0);
        }
        class358 var8 = new class358();
        if (var7 != null) {
            var8.method2105(new class115(var7), 42);
        }
        class19 var9 = this.field1616;
        synchronized (this.field1616) {
            this.field1616.method92(1, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BLpi;Ljava/awt/Frame;)V", line = 56)
    public static final void method803(byte arg0, class464 arg1, Frame arg2) {
        while (true) {
            class88 var3 = arg1.method2674(true, arg2);
            while (var3.field884 == 0) {
                class452.method2602(10L, (byte) -97);
            }
            if (var3.field884 == 1) {
                field1615++;
                if (arg0 != -94) {
                    return;
                }
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class452.method2602(100L, (byte) -97);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V", line = 81)
    public static void method804(int arg0) {
        field1612 = null;
        if (arg0 <= 58) {
            field1617 = true;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)I", line = 91)
    public static final int method805(int arg0) {
        field1619++;
        if (arg0 != -4569) {
            field1612 = null;
        }
        if ((double) class482.field6941 == 3.0D) {
            return 37;
        } else if ((double) class482.field6941 == 4.0D) {
            return 50;
        } else if ((double) class482.field6941 == 6.0D) {
            return 75;
        } else if ((double) class482.field6941 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lqh;ILtf;)V", line = 120)
    public class146(class320 arg0, int arg1, class701 arg2) {
        this.field1620 = arg2;
        this.field1614 = this.field1620.method3883(19, 0);
    }
}
