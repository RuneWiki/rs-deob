import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class260 extends class241 {

    @OriginalMember(owner = "client!h", name = "I", descriptor = "[Lh;")
    public class260[] field4517;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Z")
    public boolean field4505;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Z")
    public static boolean field4498 = false;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Loh;")
    public static class263 field4496 = class253.method1681(-122, "<br>");

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Loh;")
    public static class263 field4499 = class253.method1681(-126, "Hidden)2");

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Z")
    public static boolean field4515 = false;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Loh;")
    public static class263 field4518 = class253.method1681(-127, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Lwa;")
    public class248 field4509;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Lsj;")
    public class47 field4511;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZ)[I")
    public final int[] method1711(int arg0, int arg1, boolean arg2) {
        field4519++;
        if (arg2) {
            this.field4517 = null;
        }
        return this.field4517[arg1].field4505 ? this.field4517[arg1].method17(arg0, 255) : this.field4517[arg1].method174(arg0, 5)[0];
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BII)[[I")
    public final int[][] method1712(byte arg0, int arg1, int arg2) {
        int var4 = 82 / ((arg0 - 59) / 45);
        field4510++;
        if (this.field4517[arg1].field4505) {
            int[] var5 = this.field4517[arg1].method17(arg2, 255);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field4517[arg1].method174(arg2, 5);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I")
    public int method1544(int arg0) {
        field4503++;
        if (arg0 < 15) {
            this.field4517 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[[I")
    public int[][] method174(int arg0, int arg1) {
        field4501++;
        if (arg1 != 5) {
            this.method17(126, -21);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method1713(byte arg0) {
        for (class255 var1 = (class255) class49.field1061.method1878(true); var1 != null; var1 = (class255) class49.field1061.method1881(83)) {
            if (var1.field4429) {
                var1.method1693(124);
            }
        }
        if (arg0 >= -61) {
            field4499 = null;
        }
        for (class255 var2 = (class255) class234.field4083.method1878(true); var2 != null; var2 = (class255) class234.field4083.method1881(-101)) {
            if (var2.field4429) {
                var2.method1693(-116);
            }
        }
        field4502++;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public void method88(int arg0) {
        field4514++;
        if (arg0 <= 81) {
            method1713((byte) -87);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
    public final void method1714(int arg0, int arg1, int arg2) {
        field4504++;
        int var4 = this.field4507 == 255 ? arg0 : this.field4507;
        if (this.field4505) {
            this.field4511 = new class47(var4, arg0, arg1);
        } else {
            this.field4509 = new class248(var4, arg0, arg1);
        }
        if (arg2 >= -60) {
            this.method86(73, 106, (class194) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)[I")
    public int[] method17(int arg0, int arg1) {
        field4508++;
        if (arg1 != 255) {
            field4496 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)Lof;")
    public static final class256 method1715(int arg0, int arg1) {
        field4513++;
        class256 var2 = (class256) class177.field3196.method1464((byte) 41, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -22675) {
            field4496 = null;
        }
        byte[] var3 = class269.field4751.method596(-119, 5, arg0);
        class256 var4 = new class256();
        if (var3 != null) {
            var4.method1701(arg1 ^ 0x58E7, new class194(var3));
        }
        class177.field3196.method1472((byte) -29, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILsi;)V")
    public void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 != 5701) {
            this.field4511 = null;
        }
        field4500++;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public void method453(byte arg0) {
        if (arg0 > -115) {
            return;
        }
        if (this.field4505) {
            this.field4511.method299((byte) 85);
            this.field4511 = null;
        } else {
            this.field4509.method1666(-66);
            this.field4509 = null;
        }
        field4497++;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I")
    public int method454(int arg0) {
        field4506++;
        if (arg0 != 2) {
            field4498 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
    public static void method1716(byte arg0) {
        if (arg0 <= -6) {
            field4496 = null;
            field4518 = null;
            field4499 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IZ)V")
    public class260(int arg0, boolean arg1) {
        this.field4517 = new class260[arg0];
        this.field4505 = arg1;
    }
}
