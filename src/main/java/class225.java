import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class225 {

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "Lut;")
    private class80 field3163 = new class80();

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "Lwo;")
    public static class522 field3171 = new class522();

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "Lmi;")
    public static class341 field3173;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "Lut;")
    private class80 field3175;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "[[I")
    public static int[][] field3174;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Lut;", line = 5)
    public final class80 method1328(byte arg0) {
        if (arg0 >= -38) {
            field3174 = null;
        }
        field3168++;
        class80 var2 = this.field3163.field1135;
        if (this.field3163 == var2) {
            this.field3175 = null;
            return null;
        } else {
            this.field3175 = var2.field1135;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V", line = 30)
    public static void method1329(byte arg0) {
        field3174 = null;
        field3173 = null;
        field3171 = null;
        if (arg0 >= -1) {
            method1332(-72, 122, 59, 79, -96);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Lut;", line = 42)
    public final class80 method1330(int arg0) {
        field3172++;
        if (arg0 != 192) {
            return null;
        }
        class80 var2 = this.field3175;
        if (this.field3163 == var2) {
            this.field3175 = null;
            return null;
        } else {
            this.field3175 = var2.field1135;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V", line = 220)
    public class225() {
        this.field3163.field1135 = this.field3163;
        this.field3163.field1142 = this.field3163;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I", line = 72)
    public final int method1331(int arg0) {
        field3165++;
        int var2 = 0;
        if (arg0 != -244) {
            return 95;
        }
        class80 var3 = this.field3163.field1135;
        while (this.field3163 != var3) {
            var3 = var3.field1135;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V", line = 93)
    public static final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3162++;
        float var5 = (float) class481.field7056 / (float) class481.field7051;
        int var6 = arg1;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg2 - var7) / 2;
        int var9 = arg3 - (arg1 - var6) / arg0;
        class201.field2872 = class481.field7051 * var9 / var6;
        class517.field7596 = -1;
        class356.field4865 = -1;
        class137.field1956 = class481.field7056 - class481.field7056 * var8 / var7;
        class510.method2997((byte) 87);
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V", line = 121)
    public final void method1333(int arg0) {
        field3166++;
        if (arg0 >= -42) {
            return;
        }
        while (true) {
            class80 var2 = this.field3163.field1135;
            if (this.field3163 == var2) {
                this.field3175 = null;
                return;
            }
            var2.method581(4);
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Lut;", line = 143)
    public final class80 method1334(int arg0) {
        field3167++;
        int var2 = 91 / ((arg0 + 61) / 62);
        class80 var3 = this.field3163.field1135;
        if (this.field3163 == var3) {
            return null;
        } else {
            var3.method581(4);
            return var3;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILut;)V", line = 160)
    public final void method1335(int arg0, class80 arg1) {
        field3169++;
        if (arg0 != -571093627) {
            this.field3163 = null;
        }
        if (arg1.field1142 != null) {
            arg1.method581(4);
        }
        arg1.field1135 = this.field3163;
        arg1.field1142 = this.field3163.field1142;
        arg1.field1142.field1135 = arg1;
        arg1.field1135.field1142 = arg1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBI)I", line = 178)
    public static final int method1336(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        field3161++;
        if (arg2 != 26) {
            method1329((byte) -93);
        }
        return ((arg0 & 0xFF) >> 2 << 10) + (arg1 >> 5 << 7) + (arg3 >> 1);
    }
}
