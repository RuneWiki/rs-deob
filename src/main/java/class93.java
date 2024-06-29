import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class93 extends class89 {

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "Lfs;")
    public class390 field1129;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "Lrh;")
    public class174 field1133;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
    public static final int method719(int arg0) {
        field1136++;
        if (arg0 != 7801) {
            field1130 = -66;
        }
        class449 var1 = class512.field7423;
        synchronized (class512.field7423) {
            return class512.field7423.method2639(false);
        }
    }

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)V")
    public final void method720(int arg0) {
        this.field1138 = this.field1129.field5235;
        this.field1134 = this.field1129.field5232;
        this.field1135 = this.field1129.field5227;
        if (arg0 != -12698) {
            method719(85);
        }
        field1132++;
        if (this.field1129.field5228 != null) {
            this.field1129.field5228.method228(this.field1133.field2253, this.field1133.field2263, this.field1133.field2254, class482.field7057);
        }
        this.field1131 = class482.field7057[0];
        this.field1139 = class482.field7057[2];
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lfs;Lhk;)V")
    public class93(class390 arg0, class67 arg1) {
        this.field1129 = arg0;
        this.field1133 = this.field1129.method2214(true);
        this.method720(-12698);
    }

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "(I)V")
    public static final void method721(int arg0) {
        if (class397.field5691 == null || class108.field1360 == null) {
            class108.field1360 = new int[256];
            class397.field5691 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class397.field5691[var1] = (int) (Math.sin(var2) * 4096.0D);
                class108.field1360[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 4096) {
            method721(67);
        }
        field1137++;
    }
}
