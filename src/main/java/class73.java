import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class73 extends class386 {

    @OriginalMember(owner = "client!kca", name = "G", descriptor = "[I")
    public static int[] field1098 = new int[13];

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "Lqf;")
    public static class632 field1094 = new class632();

    @OriginalMember(owner = "client!kca", name = "L", descriptor = "Lwo;")
    public static class690 field1103 = new class690(27, 12);

    @OriginalMember(owner = "client!kca", name = "D", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!kca", name = "E", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!kca", name = "F", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!kca", name = "H", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client!kca", name = "I", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client!kca", name = "J", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!kca", name = "K", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!kca", name = "N", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!kca", name = "M", descriptor = "[[[B")
    public static byte[][][] field1104;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IBLun;)V", line = 4)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field1101;
        if (arg1 < 111) {
            field1094 = null;
        }
        if (arg0 == 0) {
            this.method642(arg2.method2258(-3), 49);
        }
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(II)V", line = 34)
    private final void method642(int arg0, int arg1) {
        if (arg1 <= 25) {
            method643(-68, 67, -116, -61);
        }
        ++field1097;
        this.field1099 = 4080 & arg0 >> 4;
        this.field1096 = (16711680 & arg0) >> 12;
        this.field1100 = 4080 & arg0 << 4;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIII)V", line = 50)
    public static final void method643(int arg0, int arg1, int arg2, int arg3) {
        ++field1095;
        if (arg3 != 17705) {
            method643(100, 122, -112, 72);
        }
        class233 var4 = class7.method44(arg1, 11, arg3 + -17706);
        var4.method1422(0);
        var4.field3116 = arg2;
        var4.field3114 = arg0;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V", line = 66)
    private class73(int arg0) {
        super(0, false);
        this.method642(arg0, 63);
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V", line = 74)
    public class73() {
        this(0);
    }

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "(I)V", line = 77)
    public static void method644(int arg0) {
        field1104 = null;
        field1094 = null;
        field1103 = null;
        if (arg0 == 0) {
            field1098 = null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(II)[[I", line = 99)
    public final int[][] method645(int arg0, int arg1) {
        ++field1102;
        if (arg1 != 3) {
            return null;
        } else {
            int[][] var3 = super.field5148.method1054(arg0, arg1 ^ 16258);
            if (super.field5148.field2041) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class599.field8643 < ~var7; ++var7) {
                    var4[var7] = this.field1096;
                    var5[var7] = this.field1099;
                    var6[var7] = this.field1100;
                }
            }
            return var3;
        }
    }
}
