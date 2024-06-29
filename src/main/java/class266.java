import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class266 extends class263 {

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    private int field3963 = 3216;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    private int field3962 = 3216;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    private int field3961 = 4096;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "[I")
    private int[] field3960 = new int[3];

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Luv;")
    public static class2 field3964;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "Z")
    public static boolean field3968;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "Ltv;")
    public static class294 field3967;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "[[S")
    public static short[][] field3970;

    static {
        new class347("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field3964 = new class2(1, -1);
        field3968 = false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method33(int arg0, byte arg1) {
        ++field3966;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (arg1 < 40) {
            field3964 = null;
        }
        if (super.field3917.field91) {
            int var4 = class145.field2170 * this.field3961 >> 12;
            int[] var5 = this.method1644(0, 0, class142.field2133 & arg0 + -1);
            int[] var6 = this.method1644(0, 0, arg0);
            int[] var7 = this.method1644(0, 0, arg0 + 1 & class142.field2133);
            for (int var8 = 0; var8 < class367.field5597; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class83.field1326] - var6[class83.field1326 & var8 - -1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class489.field7292[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field3960[1] * var16 >> 12;
                int var18 = this.field3960[2] * var14 >> 12;
                int var19 = this.field3960[0] * var15 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 76)
    public final void method748(byte arg0) {
        this.method1662(arg0 + 3986);
        if (arg0 == 110) {
            ++field3965;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 88)
    public class266() {
        super(1, true);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZLok;)Lag;", line = 93)
    public static final class352 method1660(int arg0, boolean arg1, class74 arg2) {
        ++field3959;
        byte[] var3 = arg2.method526(arg0, 1);
        if (var3 == null) {
            return null;
        } else {
            if (!arg1) {
                field3967 = null;
            }
            return new class352(var3);
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 123)
    public static void method1661(int arg0) {
        field3970 = null;
        int var1 = 107 / ((38 - arg0) / 34);
        field3967 = null;
        field3964 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZLgk;)V", line = 134)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field3969;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3962 = arg2.method2727((byte) 43);
                }
            } else {
                this.field3963 = arg2.method2727((byte) 43);
            }
        } else {
            this.field3961 = arg2.method2727((byte) 43);
        }
        if (!arg1) {
            this.method748((byte) 15);
        }
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V", line = 187)
    private final void method1662(int arg0) {
        ++field3971;
        double var2 = Math.cos((double) ((float) this.field3962 / 4096.0F));
        this.field3960[0] = (int) (4096.0D * Math.sin((double) ((float) this.field3963 / 4096.0F)) * var2);
        this.field3960[1] = (int) (4096.0D * Math.cos((double) ((float) this.field3963 / 4096.0F)) * var2);
        this.field3960[2] = (int) ((double) arg0 * Math.sin((double) ((float) this.field3962 / 4096.0F)));
        int var4 = this.field3960[0] * this.field3960[0] >> 12;
        int var5 = this.field3960[1] * this.field3960[1] >> 12;
        int var6 = this.field3960[2] * this.field3960[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field3960[0] = (this.field3960[0] << 12) / var7;
            this.field3960[1] = (this.field3960[1] << 12) / var7;
            this.field3960[2] = (this.field3960[2] << 12) / var7;
        }
    }
}
