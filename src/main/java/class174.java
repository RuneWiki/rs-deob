import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class174 {

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field2578;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "F")
    public float field2570;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "F")
    public float field2573;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "F")
    public float field2579;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "J")
    public static long field2572 = 0L;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V", line = 25)
    public static final void method1268(int arg0, int arg1) {
        field2580++;
        if (arg0 != 8) {
            field2572 = -110L;
        }
        if (class81.field1131 == null || class81.field1131.length < arg1) {
            class81.field1131 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 40)
    public class174() {
        this.field2582 = -60;
        this.field2578 = 0;
        this.field2570 = 1.2F;
        this.field2577 = -50;
        this.field2575 = class264.field3950;
        this.field2581 = class264.field3949;
        this.field2573 = 1.1523438F;
        this.field2579 = 0.69921875F;
        this.field2571 = -50;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lhb;)V", line = 55)
    public class174(class35 arg0) {
        int var2 = arg0.method273(65280);
        if ((var2 & 0x1) == 0) {
            this.field2575 = class264.field3950;
        } else {
            this.field2575 = arg0.method299(-99);
        }
        if ((var2 & 0x2) == 0) {
            this.field2573 = 1.1523438F;
        } else {
            this.field2573 = (float) arg0.method300(-1394191632) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2579 = 0.69921875F;
        } else {
            this.field2579 = (float) arg0.method300(-1394191632) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2570 = 1.2F;
        } else {
            this.field2570 = (float) arg0.method300(-1394191632) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2577 = -50;
            this.field2571 = -50;
            this.field2582 = -60;
        } else {
            this.field2577 = arg0.method260((byte) 106);
            this.field2582 = arg0.method260((byte) -20);
            this.field2571 = arg0.method260((byte) 124);
        }
        if ((var2 & 0x20) == 0) {
            this.field2581 = class264.field3949;
        } else {
            this.field2581 = arg0.method299(-121);
        }
        if ((var2 & 0x40) == 0) {
            this.field2578 = 0;
        } else {
            this.field2578 = arg0.method300(-1394191632);
        }
    }
}
