import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class119 extends class404 {

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    private int field1972 = 0;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    private int field1969 = 0;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    private int field1967 = 1365;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    private int field1968 = 20;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "Lsk;")
    public static class423 field1970 = new class423("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "Lll;")
    public static class235 field1976;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Llt;")
    public static class458 field1975;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "[J")
    public static long[] field1966;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V", line = 5)
    public static final void method831(int arg0) {
        ++field1974;
        for (int var1 = arg0; var1 < 100; ++var1) {
            class77.field1376[var1] = true;
        }
    }

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "(I)V", line = 19)
    public static void method832(int arg0) {
        field1970 = null;
        field1976 = null;
        field1966 = null;
        field1975 = null;
        if (arg0 != 100) {
            field1966 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 33)
    public class119() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILha;I)V", line = 36)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 == 0) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 == 3) {
                            this.field1972 = arg1.method254((byte) -102);
                        }
                    } else {
                        this.field1969 = arg1.method254((byte) -66);
                    }
                } else {
                    this.field1968 = arg1.method254((byte) -115);
                }
            } else {
                this.field1967 = arg1.method254((byte) -128);
            }
            ++field1973;
        }
    }

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "(I)V", line = 91)
    public static final void method833(int arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class169.field2628[var1] = false;
        }
        ++field1977;
        class475.field7252 = 0;
        class461.field7099 = 0;
        class408.field5928 = 1;
        class369.field5413 = arg0;
        class463.field7114 = -1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I", line = 122)
    public final int[] method90(int arg0, int arg1) {
        ++field1978;
        int[] var3 = super.field5870.method372(arg1, (byte) -119);
        if (arg0 >= -47) {
            field1970 = null;
        }
        if (super.field5870.field810) {
            for (int var4 = 0; var4 < class431.field6348; ++var4) {
                int var5 = (class167.field2594[var4] << 12) / this.field1967 - -this.field1969;
                int var6 = (class289.field4381[arg1] << 12) / this.field1967 + this.field1972;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field1968 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = var7 + var11 - var12;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field1968 + -1 > var13 ? (var13 << 12) / this.field1968 : 0;
            }
        }
        return var3;
    }
}
