import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class575 {

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field8159 = new String[0];

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "Z")
    private boolean field8163 = false;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    private int field8167 = -1;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    private int field8166;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "Lcq;")
    public static class110 field8160 = new class110(54, 11);

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 3)
    public final String[] method3249(int arg0) {
        field8173++;
        if (arg0 < 17) {
            this.method3250(-64, (byte) -9);
        }
        String[] var2 = new String[this.field8167 + 1];
        class567.method3216(this.field8159, 0, var2, 0, this.field8167 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IB)V", line = 18)
    private final void method3250(int arg0, byte arg1) {
        if (arg1 < 114) {
            method3256(-107, -8, -87, 93);
        }
        field8172++;
        String[] var3 = new String[this.method3255(-1367, arg0)];
        class567.method3216(this.field8159, 0, var3, 0, this.field8159.length);
        this.field8159 = var3;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILjava/lang/String;)V", line = 34)
    public final void method3251(int arg0, String arg1) {
        if (arg0 != -31977) {
            method3253(-37, -32, (byte) -36);
        }
        this.method3252(arg1, this.field8167 + 1, (byte) 75);
        field8162++;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 45)
    private final void method3252(String arg0, int arg1, byte arg2) {
        if (arg2 < 48) {
            this.field8167 = -30;
        }
        if (arg1 > this.field8167) {
            this.field8167 = arg1;
        }
        field8168++;
        if (arg1 >= this.field8159.length) {
            this.method3250(arg1, (byte) 116);
        }
        this.field8159[arg1] = arg0;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIB)Z", line = 63)
    public static final boolean method3253(int arg0, int arg1, byte arg2) {
        field8170++;
        int var3 = 13 / ((29 - arg2) / 47);
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IZ)V", line = 184)
    public class575(int arg0, boolean arg1) {
        this.field8166 = arg0;
        this.field8163 = arg1;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V", line = 79)
    public static void method3254(int arg0) {
        field8160 = null;
        if (arg0 != -20070) {
            method3254(-106);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)I", line = 93)
    private final int method3255(int arg0, int arg1) {
        field8165++;
        if (arg0 != -1367) {
            this.field8163 = false;
        }
        int var3 = this.field8159.length;
        while (arg1 >= var3) {
            if (!this.field8163) {
                var3 += this.field8166;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field8166 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kba", name = "toString", descriptor = "()Ljava/lang/String;", line = 125)
    public final String toString() {
        field8169++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8167; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8159[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIII)I", line = 166)
    public static final int method3256(int arg0, int arg1, int arg2, int arg3) {
        field8171++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 4095 - arg2;
        } else if (arg0 == var4) {
            return 4095 - arg1;
        } else {
            return arg2;
        }
    }
}
