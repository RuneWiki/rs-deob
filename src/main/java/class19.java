import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class19 extends class64 {

    @OriginalMember(owner = "client!bh", name = "lb", descriptor = "I")
    private int field425 = 4096;

    @OriginalMember(owner = "client!bh", name = "jb", descriptor = "I")
    private int field423 = 3216;

    @OriginalMember(owner = "client!bh", name = "rb", descriptor = "I")
    private int field431 = 3216;

    @OriginalMember(owner = "client!bh", name = "hb", descriptor = "[I")
    private int[] field421 = new int[3];

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "Lsg;")
    public static class169 field416 = class165.method1060("<)4col> x", 1536);

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "Lsg;")
    public static class169 field415 = class165.method1060("rect_debug=", 1536);

    @OriginalMember(owner = "client!bh", name = "nb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field427 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!bh", name = "pb", descriptor = "Lsg;")
    public static class169 field429 = class165.method1060("mapedge", 1536);

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!bh", name = "ib", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bh", name = "kb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!bh", name = "mb", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!bh", name = "ob", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!bh", name = "qb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "Lke;")
    public static class95 field417;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        ++field418;
        this.method136((byte) 113);
        if (arg0) {
            this.method136((byte) -18);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(III)V")
    public static final void method135(int arg0, int arg1, int arg2) {
        if (class147.field2715 != arg2) {
            class185.field3607 = new int[arg2];
            for (int var3 = 0; ~arg2 < ~var3; ++var3) {
                class185.field3607[var3] = (var3 << 12) / arg2;
            }
            class147.field2715 = arg2;
            class8.field217 = arg2 + -1;
        }
        if (class103.field1895 != arg1) {
            class189.field3699 = new int[arg1];
            for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                class189.field3699[var4] = (var4 << 12) / arg1;
            }
            class103.field1895 = arg1;
            class89.field1616 = arg1 + -1;
        }
        if (arg0 == -1) {
            ++field419;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        if (arg1 != 19) {
            method138(false);
        }
        ++field430;
        int[] var3 = super.field1192.method19((byte) 126, arg0);
        if (super.field1192.field75) {
            int[] var4 = this.method394(20331, 0, class89.field1616 & arg0 + -1);
            int[] var5 = this.method394(arg1 + 20312, 0, arg0);
            int[] var6 = this.method394(20331, 0, arg0 + 1 & class89.field1616);
            for (int var7 = 0; var7 < class147.field2715; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field425;
                int var9 = (var5[var7 + 1 & class8.field217] + -var5[class8.field217 & var7 + -1]) * this.field425;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var13 + 4096 + var12) / 4096)));
                int var15;
                int var16;
                int var17;
                if (~var14 != -1) {
                    var15 = var9 / var14;
                    var16 = var8 / var14;
                    var17 = 16777216 / var14;
                } else {
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                }
                int var18 = this.field421[2] * var17 >> 12;
                int var19 = this.field421[0] * var15 >> 12;
                int var20 = this.field421[1] * var16 >> 12;
                var3[var7] = var18 + var20 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field431 = arg1.method785(true);
                }
            } else {
                this.field423 = arg1.method785(true);
            }
        } else {
            this.field425 = arg1.method785(true);
        }
        int var5 = -57 % ((-60 - arg0) / 36);
        ++field426;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    private final void method136(byte arg0) {
        ++field424;
        double var2 = Math.cos((double) (this.field431 / 4096));
        int var4 = 3 % ((64 - arg0) / 47);
        this.field421[0] = (int) (var2 * Math.sin((double) (this.field423 / 4096)) * 4096.0D);
        this.field421[1] = (int) (4096.0D * Math.cos((double) (this.field423 / 4096)) * var2);
        this.field421[2] = (int) (4096.0D * Math.sin((double) (this.field431 / 4096)));
        int var5 = this.field421[2] * this.field421[2] >> 12;
        int var6 = this.field421[1] * this.field421[1] >> 12;
        int var7 = this.field421[0] * this.field421[0] >> 12;
        int var8 = (int) (Math.sqrt((double) (var7 - (-var6 - var5) >> 12)) * 4096.0D);
        if (~var8 != -1) {
            this.field421[2] = (this.field421[2] << 12) / var8;
            this.field421[1] = (this.field421[1] << 12) / var8;
            this.field421[0] = (this.field421[0] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(ILqf;)Z")
    public static final boolean method137(int arg0, class150 arg1) {
        ++field428;
        if (arg1.field2835 == null) {
            return false;
        } else {
            for (int var2 = arg0; var2 < arg1.field2835.length; ++var2) {
                int var3 = class193.method1277(arg1, var2, arg0 ^ -2701);
                int var4 = arg1.field2769[var2];
                if (arg1.field2835[var2] != 2) {
                    if (arg1.field2835[var2] != 3) {
                        if (~arg1.field2835[var2] != -5) {
                            if (~var3 != ~var4) {
                                return false;
                            }
                        } else if (var3 == var4) {
                            return false;
                        }
                    } else if (~var3 >= ~var4) {
                        return false;
                    }
                } else if (var4 <= var3) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class19() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(Z)V")
    public static void method138(boolean arg0) {
        field417 = null;
        field427 = null;
        field416 = null;
        if (!arg0) {
            field415 = null;
            field429 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lva;")
    public static final class190 method139(int arg0, int arg1) {
        ++field420;
        class190 var2 = (class190) class90.field1643.method1206((long) arg1, arg0 ^ -24750);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class57.field1062.method552(arg1, arg0, arg0 + -8);
            class190 var4 = new class190();
            if (var3 != null) {
                var4.method1252(new class127(var3), arg0 + -9);
            }
            class90.field1643.method1208((long) arg1, 72, var4);
            return var4;
        }
    }
}
