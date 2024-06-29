import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class340 extends class290 {

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    private int field4942;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    private int field4936;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    private int field4938;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    private int field4930;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "[F")
    public static float[] field4940 = new float[4];

    @OriginalMember(owner = "client!om", name = "D", descriptor = "Lfc;")
    public static class235 field4943 = new class235(59, 12);

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field4947 = 0;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    private int field4931;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    private int field4935;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    private int field4937;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "Lop;")
    public static class172 field4946;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "[B")
    private byte[] field4932;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V", line = 8)
    public static final void method2036(int arg0, int arg1, int arg2) {
        field4933++;
        int var3 = class432.field6119.method3314(class9.field158.method42(class666.field9377, 19572), 12);
        for (class345 var4 = (class345) class487.field6761.method1270((byte) -25); var4 != null; var4 = (class345) class487.field6761.method1282(0)) {
            int var8 = class428.method2423(var4, (byte) 87);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class315.field4697 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (var3 + var6 > class547.field7412) {
            var6 = class547.field7412 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if ((var5 + arg1) > class124.field1711) {
            var7 = class124.field1711 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (arg2 != 22) {
            return;
        }
        class113.field1532 = var6;
        class229.field3278 = true;
        class371.field5287 = class315.field4697 * 16 + (class36.field450 ? 26 : 22);
        class364.field5200 = var3;
        class174.field2605 = var7;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 59)
    public final void method897(byte arg0) {
        this.field4945 = 0;
        this.field4931 = 0;
        int var2 = 123 / ((arg0 + 14) / 59);
        field4941++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 71)
    public static void method2037(int arg0) {
        field4946 = null;
        if (arg0 == 4096) {
            field4940 = null;
            field4943 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V", line = 88)
    public final void method894(int arg0, int arg1, int arg2) {
        field4944++;
        if (arg1 != 630249516) {
            return;
        }
        if (arg2 == 0) {
            this.field4937 = this.field4942 - (arg0 < 0 ? -arg0 : arg0);
            this.field4935 = 4096;
            this.field4937 = this.field4937 * this.field4937 >> 12;
            this.field4931 = this.field4937;
            return;
        }
        this.field4935 = this.field4937 * this.field4936 >> 12;
        this.field4937 = this.field4942 - (arg0 < 0 ? -arg0 : arg0);
        if (this.field4935 < 0) {
            this.field4935 = 0;
        } else if (this.field4935 > 4096) {
            this.field4935 = 4096;
        }
        this.field4937 = this.field4937 * this.field4937 >> 12;
        this.field4937 = this.field4937 * this.field4935 >> 12;
        this.field4931 += this.field4937 * this.field4930 >> 12;
        this.field4930 = this.field4938 * this.field4930 >> 12;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BII)V", line = 123)
    public void method1541(byte arg0, int arg1, int arg2) {
        this.field4932[arg1] = arg0;
        if (arg2 == 0) {
            field4934++;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIFFF)V", line = 140)
    public class340(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4942 = (int) (arg6 * 4096.0F);
        this.field4936 = (int) (arg7 * 4096.0F);
        this.field4930 = this.field4938 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V", line = 151)
    public final void method896(byte arg0) {
        this.field4931 >>= 0x4;
        field4939++;
        this.field4930 = this.field4938;
        if (this.field4931 < 0) {
            this.field4931 = 0;
        } else if (this.field4931 > 255) {
            this.field4931 = 255;
        }
        this.method1541((byte) this.field4931, this.field4945++, arg0 + 29);
        this.field4931 = 0;
        if (arg0 != -29) {
            this.method1541((byte) 21, -53, 109);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;)V", line = 182)
    public static final void method2038(int arg0, String arg1) {
        if (arg0 != 27663) {
            field4947 = -25;
        }
        field4929++;
        class250.method1549("", "", -1, "", 0, arg1, 0);
    }
}
