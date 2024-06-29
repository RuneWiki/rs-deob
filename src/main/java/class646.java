import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class646 extends class585 {

    @OriginalMember(owner = "client!kia", name = "F", descriptor = "[[B")
    public static byte[][] field9022 = new byte[250][];

    @OriginalMember(owner = "client!kia", name = "I", descriptor = "[F")
    public static float[] field9025 = new float[16];

    @OriginalMember(owner = "client!kia", name = "N", descriptor = "I")
    public static int field9030 = 0;

    @OriginalMember(owner = "client!kia", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field9032 = new String[100];

    @OriginalMember(owner = "client!kia", name = "E", descriptor = "I")
    private int field9021;

    @OriginalMember(owner = "client!kia", name = "G", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!kia", name = "H", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!kia", name = "J", descriptor = "I")
    private int field9026;

    @OriginalMember(owner = "client!kia", name = "K", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!kia", name = "L", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!kia", name = "M", descriptor = "I")
    private int field9029;

    @OriginalMember(owner = "client!kia", name = "O", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "(B)Z", line = 3)
    public static final boolean method3704(byte arg0) {
        ++field9027;
        boolean var1 = true;
        if (class229.field3499 == null) {
            if (class152.field2163.method4349((byte) -102, class516.field7301)) {
                class229.field3499 = class1.method8(class152.field2163, class516.field7301);
            } else {
                var1 = false;
            }
        }
        if (class228.field3496 == null) {
            if (!class152.field2163.method4349((byte) -102, class625.field8758)) {
                var1 = false;
            } else {
                class228.field3496 = class1.method8(class152.field2163, class625.field8758);
            }
        }
        if (arg0 != -81) {
            method3706(-33, 1);
        }
        if (class409.field5557 == null) {
            if (class152.field2163.method4349((byte) -102, class458.field6416)) {
                class409.field5557 = class1.method8(class152.field2163, class458.field6416);
            } else {
                var1 = false;
            }
        }
        if (class739.field10188 == null) {
            if (class124.field1928.method4349((byte) -102, class166.field2618)) {
                class739.field10188 = class119.method899(-30298, class124.field1928, class166.field2618);
            } else {
                var1 = false;
            }
        }
        if (class728.field10055 == null) {
            if (!class152.field2163.method4349((byte) -102, class166.field2618)) {
                var1 = false;
            } else {
                class728.field10055 = class1.method2(class152.field2163, class166.field2618);
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(II)V", line = 80)
    private final void method3705(int arg0, int arg1) {
        this.field9029 = (255 & arg0) << 4;
        this.field9026 = (65280 & arg0) >> 4;
        ++field9028;
        int var3 = -11 % ((2 - arg1) / 40);
        this.field9021 = arg0 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "()V", line = 92)
    public class646() {
        this(0);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZI)[[I", line = 95)
    public final int[][] method58(boolean arg0, int arg1) {
        if (arg0) {
            method3704((byte) -66);
        }
        ++field9024;
        int[][] var3 = super.field8265.method1576((byte) -121, arg1);
        if (super.field8265.field3546) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class293.field4278; ++var7) {
                var4[var7] = this.field9021;
                var5[var7] = this.field9026;
                var6[var7] = this.field9029;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "(II)V", line = 133)
    public static final void method3706(int arg0, int arg1) {
        ++field9031;
        class751.field10391 = arg1;
        if (arg0 == 0) {
            class652 var2 = class663.field9221;
            synchronized (class663.field9221) {
                class663.field9221.method3735(2);
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lso;II)V", line = 157)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.method3705(arg0.method2960((byte) 94), 52);
        }
        ++field9023;
        if (arg1 != 1) {
            this.method3705(-38, 97);
        }
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)V", line = 187)
    public static void method3707(int arg0) {
        if (arg0 != 1) {
            method3706(102, -67);
        }
        field9032 = null;
        field9022 = null;
        field9025 = null;
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(I)V", line = 201)
    private class646(int arg0) {
        super(0, false);
        this.method3705(arg0, -69);
    }
}
