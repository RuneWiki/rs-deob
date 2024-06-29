import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class100 extends class278 {

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "[I")
    private int[] field1169 = new int[this.field4002];

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "[I")
    public static int[] field1161 = new int[1000];

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field1167 = 0;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "[Lg;")
    public static class146[] field1174 = new class146[14];

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "Lqk;")
    public static class1 field1173 = new class1(86, 7);

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "[Lnf;")
    public static class136[] field1178 = new class136[37];

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field1176 = 0;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "Lae;")
    public static class283 field1175;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "[B")
    private byte[] field1168;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public static void method712(byte arg0) {
        field1161 = null;
        field1173 = null;
        field1178 = null;
        if (arg0 == 38) {
            field1175 = null;
            field1174 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V")
    public void method713(int arg0, int arg1, byte arg2) {
        ++field1165;
        this.field1168[this.field1162++] = (byte) (arg1 + (class407.method2490(arg2, 255) >> 1));
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIF)V")
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field4002; ++var7) {
            this.field1169[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
    public static final void method714(int arg0, byte arg1, int arg2) {
        ++field1172;
        if (class377.field5424 != null) {
            int var3 = class410.field5753;
            int var4 = class737.field10141;
            class746.method4134(arg2, true, arg0);
            if (arg1 == 83) {
                if (class166.field2118 == 0) {
                    class96.field1127 = null;
                    class96.field1127 = class377.field5424.method247(class377.field5424.method236(class327.field4604, class544.field7574), class377.field5424.method246(class327.field4604, class544.field7574));
                } else if (~class166.field2118 == -2 && (class376.field5395 == null || class410.field5753 != var3 || ~class737.field10141 != ~var4)) {
                    class376.field5395 = new class684[class737.field10141 * class410.field5753];
                    for (int var5 = 0; ~var5 > ~class376.field5395.length; ++var5) {
                        class376.field5395[var5] = class377.field5424.method247(class377.field5424.method236(class618.field8685, class750.field10361), class377.field5424.method246(class618.field8685, class750.field10361));
                    }
                    class85.field1027 = new int[class737.field10141 * class410.field5753];
                    class729.field10073 = 1;
                }
                class282.field4043 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public final void method715(int arg0) {
        this.field1166 = Math.abs(this.field1166);
        if (arg0 != -16749) {
            field1178 = null;
        }
        ++field1171;
        if (this.field1166 >= 4096) {
            this.field1166 = 4095;
        }
        this.method713(this.field1162++, arg0 ^ -16660, (byte) (this.field1166 >> 4));
        this.field1166 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public final void method716(byte arg0) {
        ++field1164;
        int var2 = -27 % ((-70 - arg0) / 51);
        this.field1166 = 0;
        this.field1162 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
    public final void method717(int arg0, int arg1, int arg2) {
        ++field1163;
        this.field1166 += this.field1169[arg1] * arg2 >> 12;
        if (arg0 != 23964) {
            field1161 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)I")
    public static final int method718(byte arg0) {
        ++field1170;
        if (class75.field842 == null) {
            return 0;
        } else {
            int var1 = 109 / ((-21 - arg0) / 34);
            return class75.field842.length * 2;
        }
    }
}
