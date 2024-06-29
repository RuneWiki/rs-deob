import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class524 {

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field7616 = -1;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field7617 = 0;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field7623 = -2;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    private int field7624;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public int field7625;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field7619;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BIII)Z")
    public final boolean method3096(byte arg0, int arg1, int arg2, int arg3) {
        field7618++;
        int var5 = this.field7624;
        int var6 = 122 % ((arg0 - 28) / 40);
        if (this.field7625 == arg3 && this.field7624 == 0) {
            return false;
        }
        boolean var9;
        if (this.field7624 == 0) {
            if (this.field7625 < arg3 && arg3 <= (this.field7625 + arg2) || this.field7625 > arg3 && arg3 >= this.field7625 - arg2) {
                this.field7625 = arg3;
                return false;
            }
            var9 = true;
        } else if (this.field7624 > 0 && arg3 > this.field7625) {
            int var7 = this.field7624 * this.field7624 / (arg2 * 2);
            int var8 = this.field7625 + var7;
            if (var8 < arg3 && this.field7625 <= var8) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else if (this.field7624 < 0 && arg3 < this.field7625) {
            int var10 = this.field7624 * this.field7624 / (arg2 * 2);
            int var11 = this.field7625 - var10;
            if (arg3 < var11 && var11 <= this.field7625) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else {
            var9 = false;
        }
        if (var9) {
            if (arg3 <= this.field7625) {
                this.field7624 -= arg2;
                if (arg1 != 0 && this.field7624 < -arg1) {
                    this.field7624 = -arg1;
                }
            } else {
                this.field7624 += arg2;
                if (arg1 != 0 && this.field7624 > arg1) {
                    this.field7624 = arg1;
                }
            }
            if (this.field7624 != var5) {
                int var12 = this.field7624 * this.field7624 / (arg2 * 2);
                if (arg3 <= this.field7625) {
                    if (this.field7625 > arg3 && arg3 > this.field7625 - var12) {
                        this.field7624 = var5;
                    }
                } else if (arg3 < this.field7625 + var12) {
                    this.field7624 = var5;
                }
            }
        } else if (this.field7624 <= 0) {
            this.field7624 += arg2;
            if (this.field7624 > 0) {
                this.field7624 = 0;
            }
        } else {
            this.field7624 -= arg2;
            if (this.field7624 < 0) {
                this.field7624 = 0;
            }
        }
        this.field7625 += this.field7624 + var5 >> 1;
        return var9;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static final void method3097(byte arg0) {
        field7622++;
        if (arg0 >= -36) {
            method3101(-42);
        }
        if (class507.field7394 <= 0) {
            class496.field7294 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class509.field7425.length; var2++) {
            if (class509.field7425[var2].startsWith("--> ")) {
                int var10000 = ~class507.field7394;
                var1++;
                if (var10000 == ~var1) {
                    class496.field7294 = class509.field7425[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static final void method3098(int arg0) {
        if (arg0 < 75) {
            field7621 = 95;
        }
        field7620++;
        if (!class341.field5122) {
            return;
        }
        while (true) {
            while (class35.field533.length > class114.field2063) {
                class255 var1 = class35.field533[class114.field2063];
                if (var1 != null && var1.field3907 == -1) {
                    if (class364.field5327 == null) {
                        class364.field5327 = class502.field7343.method113(var1.field3912, 21146);
                    }
                    int var2 = class364.field5327.field1948;
                    if (var2 == -1) {
                        return;
                    }
                    class364.field5327 = null;
                    var1.field3907 = var2;
                    class114.field2063++;
                } else {
                    class114.field2063++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
    public final void method3099(int arg0) {
        if (arg0 != 30173) {
            field7616 = -18;
        }
        this.field7625 &= 0x3FFF;
        field7612++;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
    public final int method3100(byte arg0) {
        if (arg0 >= -97) {
            field7621 = -111;
        }
        field7615++;
        return this.field7625 & 0x3FFF;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
    public static void method3101(int arg0) {
        if (arg0 < 8) {
            method3098(84);
        }
        field7619 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
    public final void method3102(int arg0, int arg1) {
        this.field7624 = 0;
        this.field7625 = arg1;
        field7613++;
        if (arg0 > -99) {
            method3097((byte) -5);
        }
    }
}
