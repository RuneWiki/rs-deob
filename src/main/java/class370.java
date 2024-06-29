import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class370 extends class322 {

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    private int field5544;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    private int field5559;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    private int field5545;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "[I")
    public static int[] field5554 = new int[256];

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "Lgn;")
    public static class475 field5546 = new class475(20, -1);

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    private int field5551;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    private int field5552;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    private int field5557;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    private int field5558;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "Lqg;")
    public static class307 field5560;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "[B")
    private byte[] field5548;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "[Z")
    public static boolean[] field5561;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public final void method1683(int arg0) {
        this.field5552 >>= 0x4;
        this.field5545 = this.field5559;
        field5549++;
        if (this.field5552 < 0) {
            this.field5552 = 0;
        } else if (this.field5552 > 255) {
            this.field5552 = 255;
        }
        this.method887((byte) this.field5552, this.field5557++, false);
        this.field5552 = 0;
        int var2 = -83 % ((63 - arg0) / 58);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLeq;)V")
    public static final void method2253(byte arg0, class134 arg1) {
        field5555++;
        if (class51.field763.method2085(-18021) == 0) {
            return;
        }
        if (class293.field4174 == 0) {
            for (class68 var4 = (class68) class51.field763.method2096(-21400); var4 != null; var4 = (class68) class51.field763.method2084((byte) 19)) {
                class405.field5947.method1155(var4.field1011, arg1, var4.field1014, false, var4.field1013 ? class415.field6145.field4599 : null, arg0 ^ 0xFFFFFF9B, false, var4.field1016, class95.field1282, var4.field1010, var4.field1015, arg1);
                var4.method536(false);
            }
            class176.method1103(0);
        } else {
            if (class485.field7020 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class485.field7020 = class134.method777(var2, 0, class86.field1182, 71, class147.field1916, 0);
                class194.field2741 = class485.field7020.method802(class442.method2588((byte) 44, 0, class501.field7660, class1.field1), class328.method1976(class445.field6482, class501.field7660, 0), true);
            }
            for (class68 var3 = (class68) class51.field763.method2096(-21400); var3 != null; var3 = (class68) class51.field763.method2084((byte) 19)) {
                class405.field5947.method1155(var3.field1011, arg1, var3.field1014, false, var3.field1013 ? class415.field6145.field4599 : null, arg0 + 134, false, var3.field1016, class194.field2741, var3.field1010, var3.field1015, class485.field7020);
                var3.method536(false);
            }
        }
        if (arg0 != -19) {
            field5546 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V")
    public static void method2254(int arg0) {
        field5554 = null;
        field5560 = null;
        field5561 = null;
        field5546 = null;
        if (arg0 != 0) {
            method2253((byte) -11, null);
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class370(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5544 = (int) (arg7 * 4096.0F);
        this.field5556 = (int) (arg6 * 4096.0F);
        this.field5545 = this.field5559 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V")
    public final void method1687(int arg0) {
        if (arg0 != 9944) {
            this.field5556 = -126;
        }
        this.field5557 = 0;
        this.field5552 = 0;
        field5553++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(III)V")
    public final void method1686(int arg0, int arg1, int arg2) {
        if (arg2 != -4096) {
            return;
        }
        field5547++;
        if (arg0 == 0) {
            this.field5558 = this.field5556 - (arg1 >= 0 ? arg1 : -arg1);
            this.field5558 = this.field5558 * this.field5558 >> 12;
            this.field5551 = 4096;
            this.field5552 = this.field5558;
            return;
        }
        this.field5551 = this.field5558 * this.field5544 >> 12;
        this.field5558 = this.field5556 - (arg1 < 0 ? -arg1 : arg1);
        if (this.field5551 < 0) {
            this.field5551 = 0;
        } else if (this.field5551 > 4096) {
            this.field5551 = 4096;
        }
        this.field5558 = this.field5558 * this.field5558 >> 12;
        this.field5558 = this.field5558 * this.field5551 >> 12;
        this.field5552 += this.field5558 * this.field5545 >> 12;
        this.field5545 = this.field5559 * this.field5545 >> 12;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BIZ)V")
    public void method887(byte arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method1686(34, -58, 70);
        }
        this.field5548[arg1] = arg0;
        field5550++;
    }
}
