import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class276 {

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "F")
    public static float field3918;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    private int field3923;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)I", line = 4)
    public final int method1720(int arg0) {
        if (arg0 != 16383) {
            this.method1722(110, (byte) -86, 7, 88);
        }
        field3919++;
        return this.field3921 & 0x3FFF;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)V", line = 15)
    public final void method1721(int arg0, int arg1) {
        this.field3923 = arg1;
        this.field3921 = arg0;
        field3915++;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBII)Z", line = 25)
    public final boolean method1722(int arg0, byte arg1, int arg2, int arg3) {
        field3922++;
        int var5 = this.field3923;
        if (this.field3921 == arg0 && this.field3923 == 0) {
            return false;
        }
        boolean var6;
        if (this.field3923 == 0) {
            if (arg0 > this.field3921 && arg0 <= this.field3921 + arg3 || this.field3921 > arg0 && arg0 >= this.field3921 - arg3) {
                this.field3921 = arg0;
                return false;
            }
            var6 = true;
        } else if (this.field3923 > 0 && this.field3921 < arg0) {
            int var7 = this.field3923 * this.field3923 / (arg3 * 2);
            int var8 = this.field3921 + var7;
            if (var8 < arg0 && this.field3921 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field3923 < 0 && arg0 < this.field3921) {
            int var9 = this.field3923 * this.field3923 / (arg3 * 2);
            int var10 = this.field3921 - var9;
            if (arg0 < var10 && var10 <= this.field3921) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        int var11 = 96 % ((-arg1 - 23) / 56);
        if (var6) {
            if (arg0 <= this.field3921) {
                this.field3923 -= arg3;
                if (arg2 != 0 && this.field3923 < (-arg2)) {
                    this.field3923 = -arg2;
                }
            } else {
                this.field3923 += arg3;
                if (arg2 != 0 && arg2 < this.field3923) {
                    this.field3923 = arg2;
                }
            }
            if (this.field3923 != var5) {
                int var12 = this.field3923 * this.field3923 / (arg3 * 2);
                if (arg0 > this.field3921) {
                    if ((this.field3921 + var12) > arg0) {
                        this.field3923 = var5;
                    }
                } else if (arg0 < this.field3921 && this.field3921 - var12 < arg0) {
                    this.field3923 = var5;
                }
            }
        } else if (this.field3923 <= 0) {
            this.field3923 += arg3;
            if (this.field3923 > 0) {
                this.field3923 = 0;
            }
        } else {
            this.field3923 -= arg3;
            if (this.field3923 < 0) {
                this.field3923 = 0;
            }
        }
        this.field3921 += this.field3923 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V", line = 160)
    public final void method1723(int arg0) {
        this.field3921 &= 0x3FFF;
        field3916++;
        if (arg0 != 1214712834) {
            field3918 = 0.87457806F;
        }
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)V", line = 177)
    public static final void method1724(int arg0) {
        field3917++;
        if (arg0 != 256) {
            method1724(-4);
        }
        class506.field7522.method763(class296.field4188, class525.field7713.field5972 ? class202.field3120 + 256 << 2 : -1, 0);
    }
}
