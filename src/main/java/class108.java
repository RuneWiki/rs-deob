import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class108 {

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Lad;")
    private class11 field1475 = new class11(64);

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "Ldn;")
    private class201 field1478;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field1479 = 0;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "Z")
    public static volatile boolean field1481 = false;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field1480 = -1;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Lf;")
    public static class404 field1474;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public final void method707(byte arg0) {
        if (arg0 != -51) {
            field1479 = 79;
        }
        class11 var2 = this.field1475;
        synchronized (this.field1475) {
            this.field1475.method84(107);
        }
        field1476++;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILbt;)Ljava/lang/String;")
    public static final String method708(int arg0, int arg1, class88 arg2) {
        field1482++;
        try {
            int var3 = arg2.method604(arg1 - 9338);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field1176 += class188.field2463.method2058(var4, arg2.field1223, arg1, var3, 116, arg2.field1176);
            return class389.method2318(var3, 116, 0, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method709(int arg0) {
        field1474 = null;
        if (arg0 != 30905) {
            method708(71, -109, null);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lwt;B)V")
    public static final void method710(class16 arg0, byte arg1) {
        for (int var2 = 0; var2 < class415.field5519; var2++) {
            int var3 = class290.field3718[var2];
            class518 var4 = class76.field952[var3];
            int var5 = arg0.method617(2);
            if ((var5 & 0x8) != 0) {
                var5 += arg0.method617(2) << 8;
            }
            if ((var5 & 0x100) != 0) {
                var5 += arg0.method617(arg1 ^ 0x20) << 16;
            }
            class214.method1363(-57, var3, var5, arg0, var4);
        }
        field1473++;
        if (arg1 != 34) {
            field1474 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)V")
    public final void method711(int arg0, byte arg1) {
        class11 var3 = this.field1475;
        synchronized (this.field1475) {
            this.field1475.method80(arg1 ^ 0xFFFFFFD7, arg0);
        }
        if (arg1 == 14) {
            field1484++;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Leo;ILqa;)V")
    public static final void method712(class423 arg0, int arg1, class129 arg2) {
        if (arg1 != -14712) {
            field1479 = 106;
        }
        field1483++;
        boolean var3 = class89.field1238.method113(false, arg0.field5690 ? class37.field573.field7655 : null, arg0.field5673, arg0.field5683, arg0.field5753, arg0.field5736 | 0xFF000000, arg0.field5763, arg2) == null;
        if (var3) {
            class293.field3802.method42(new class474(arg0.field5763, arg0.field5753, arg0.field5673, arg0.field5736 | 0xFF000000, arg0.field5683, arg0.field5690), arg1 + 14712);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Lqp;")
    public final class481 method713(int arg0, int arg1) {
        field1477++;
        class11 var3 = this.field1475;
        class481 var4;
        synchronized (this.field1475) {
            var4 = (class481) this.field1475.method78((long) arg0, (byte) -98);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1478.method1313((byte) -126, arg1, arg0);
        class481 var6 = new class481();
        if (var5 != null) {
            var6.method2881((byte) 54, new class88(var5));
        }
        class11 var7 = this.field1475;
        synchronized (this.field1475) {
            this.field1475.method88((long) arg0, 43, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    public final void method714(int arg0) {
        if (arg0 != -5959) {
            return;
        }
        field1472++;
        class11 var2 = this.field1475;
        synchronized (this.field1475) {
            this.field1475.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lgt;ILdn;)V")
    public class108(class65 arg0, int arg1, class201 arg2) {
        this.field1478 = arg2;
        if (this.field1478 == null) {
            this.field1471 = 0;
        } else {
            this.field1471 = this.field1478.method1302(-94, 16);
        }
    }
}
