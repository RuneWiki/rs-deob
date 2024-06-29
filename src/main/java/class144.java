import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class144 {

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2030 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2035;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILnd;Lnd;I)V", line = 4)
    public static final void method1037(int arg0, class547 arg1, class547 arg2, int arg3) {
        field2038++;
        class273.field3428 = arg1;
        class119.field1743 = arg2;
        if (arg3 != 17598) {
            field2035 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)V", line = 23)
    public final void method1038(int arg0, int arg1) {
        this.field2036 = arg1;
        this.field2032 = arg0;
        field2031++;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V", line = 32)
    public static final void method1039(byte arg0) {
        if (class709.field9851 == null || class195.field2670 == null) {
            class709.field9851 = new int[256];
            class195.field2670 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class709.field9851[var1] = (int) (Math.sin(var2) * 4096.0D);
                class195.field2670[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != -24) {
            field2035 = null;
        }
        field2028++;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)V", line = 63)
    public final void method1040(byte arg0) {
        this.field2032 &= 0x3FFF;
        field2033++;
        if (arg0 != 90) {
            field2035 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIII)Z", line = 75)
    public final boolean method1041(int arg0, int arg1, int arg2, int arg3) {
        field2029++;
        if (arg0 <= 30) {
            this.method1040((byte) 85);
        }
        int var5 = this.field2036;
        if (this.field2032 == arg3 && this.field2036 == 0) {
            return false;
        }
        boolean var6;
        if (this.field2036 == 0) {
            if (arg3 > this.field2032 && this.field2032 + arg1 >= arg3 || arg3 < this.field2032 && (this.field2032 - arg1) <= arg3) {
                this.field2032 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field2036 > 0 && this.field2032 < arg3) {
            int var7 = this.field2036 * this.field2036 / (arg1 * 2);
            int var8 = this.field2032 + var7;
            if (var8 < arg3 && var8 >= this.field2032) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field2036 < 0 && this.field2032 > arg3) {
            int var9 = this.field2036 * this.field2036 / (arg1 * 2);
            int var10 = this.field2032 - var9;
            if (var10 > arg3 && this.field2032 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg3 <= this.field2032) {
                this.field2036 -= arg1;
                if (arg2 != 0 && -arg2 > this.field2036) {
                    this.field2036 = -arg2;
                }
            } else {
                this.field2036 += arg1;
                if (arg2 != 0 && this.field2036 > arg2) {
                    this.field2036 = arg2;
                }
            }
            if (this.field2036 != var5) {
                int var11 = this.field2036 * this.field2036 / (arg1 * 2);
                if (this.field2032 >= arg3) {
                    if (arg3 < this.field2032 && arg3 > this.field2032 - var11) {
                        this.field2036 = var5;
                    }
                } else if (arg3 < this.field2032 + var11) {
                    this.field2036 = var5;
                }
            }
        } else if (this.field2036 > 0) {
            this.field2036 -= arg1;
            if (this.field2036 < 0) {
                this.field2036 = 0;
            }
        } else {
            this.field2036 += arg1;
            if (this.field2036 > 0) {
                this.field2036 = 0;
            }
        }
        this.field2032 += this.field2036 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 211)
    public static void method1042(int arg0) {
        if (arg0 < -127) {
            field2035 = null;
            field2030 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(III)V", line = 222)
    public static final void method1043(int arg0, int arg1, int arg2) {
        field2037++;
        if (arg0 == -1) {
            class300.method1794(arg2, arg0 + 1, arg1);
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(B)I", line = 237)
    public final int method1044(byte arg0) {
        field2034++;
        if (arg0 != 19) {
            method1037(-69, null, null, 10);
        }
        return this.field2032 & 0x3FFF;
    }
}
