import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class640 extends class144 {

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    private int field9212 = 0;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
    private int field9216 = -32768;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "Z")
    private boolean field9211 = false;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    private int field9204 = 0;

    @OriginalMember(owner = "client!fl", name = "ib", descriptor = "I")
    private int field9228 = -1;

    @OriginalMember(owner = "client!fl", name = "db", descriptor = "I")
    public int field9223;

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "I")
    private int field9221;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
    public int field9220;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public int field9193;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    private int field9201;

    @OriginalMember(owner = "client!fl", name = "ob", descriptor = "I")
    private int field9234;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    private int field9206;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public int field9197;

    @OriginalMember(owner = "client!fl", name = "kb", descriptor = "Z")
    private boolean field9230;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "Lhi;")
    private class177 field9199;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "D")
    private double field9194;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "D")
    private double field9195;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "D")
    private double field9209;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "D")
    private double field9210;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "D")
    private double field9213;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "D")
    private double field9217;

    @OriginalMember(owner = "client!fl", name = "fb", descriptor = "D")
    private double field9225;

    @OriginalMember(owner = "client!fl", name = "mb", descriptor = "D")
    private double field9232;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    private int field9200;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!fl", name = "cb", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!fl", name = "eb", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!fl", name = "gb", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!fl", name = "hb", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!fl", name = "jb", descriptor = "I")
    private int field9229;

    @OriginalMember(owner = "client!fl", name = "nb", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!fl", name = "pb", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!fl", name = "qb", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!fl", name = "lb", descriptor = "Lcw;")
    public static class157 field9231;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "Lkw;")
    private class211 field9198;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)V")
    public final void method3646(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field9211) {
            double var6 = (double) (-super.field1764 + arg1);
            double var8 = (double) (-super.field1768 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field9232 = (double) this.field9206 * var6 / var10 + (double) super.field1764;
            this.field9195 = (double) this.field9206 * var8 / var10 + (double) super.field1768;
            if (this.field9230) {
                this.field9213 = (double) (class399.method2547((int) this.field9195, (int) this.field9232, (byte) 65, super.field1757) + -this.field9234);
            } else {
                this.field9213 = (double) super.field1769;
            }
        }
        ++field9215;
        double var12 = (double) (this.field9197 + 1 - arg3);
        this.field9225 = ((double) arg1 - this.field9232) / var12;
        this.field9209 = ((double) arg4 + -this.field9195) / var12;
        this.field9217 = Math.sqrt(this.field9225 * this.field9225 + this.field9209 * this.field9209);
        if (this.field9221 != arg0) {
            if (!this.field9211) {
                this.field9194 = -this.field9217 * Math.tan((double) this.field9221 * 0.02454369D);
            }
            this.field9210 = ((double) arg2 - this.field9213 - this.field9194 * var12) * 2.0D / (var12 * var12);
        } else {
            this.field9194 = ((double) arg2 + -this.field9213) / var12;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field9235;
        if (arg0 != -10503) {
            this.method3647((byte) -99, 41, (class605) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        ++field9214;
        if (arg0 != -76) {
            this.field9200 = -2;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
    public final void method862(byte arg0) {
        ++field9222;
        super.field1773 = super.field1762 = (short) ((int) (this.field9232 / 512.0D));
        super.field1758 = super.field1761 = (short) ((int) (this.field9195 / 512.0D));
        if (arg0 != 69) {
            method3650(true, -72);
        }
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)I")
    public final int method413(byte arg0) {
        ++field9208;
        if (arg0 != 58) {
            this.method91(-55, 28, (class605) null, 57);
        }
        return this.field9216;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILva;Loa;ZI)V")
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 != 7) {
            this.method3653(-41, -98);
        }
        ++field9205;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BILoa;)Lba;")
    private final class327 method3647(byte arg0, int arg1, class605 arg2) {
        if (arg0 >= -90) {
            return null;
        } else {
            ++field9227;
            class576 var4 = class141.field1735.method3667(false, this.field9201);
            return var4.method3350(this.field9204, arg1, class259.field3686, 74, arg2, this.field9228, this.field9212);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Loa;I)Lew;")
    public final class425 method100(class605 arg0, int arg1) {
        if (arg1 != 28286) {
            return null;
        } else {
            ++field9203;
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public final void method3648(int arg0) {
        if (arg0 == -1249465271) {
            ++field9224;
            if (this.field9198 != null) {
                this.field9198.method1344();
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field9196;
        if (this.field9198 != null) {
            this.field9198.method1344();
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Loa;I)V")
    public final void method90(class605 arg0, int arg1) {
        ++field9207;
        class327 var3 = this.method3647((byte) -115, 0, arg0);
        if (var3 != null) {
            class364 var4 = arg0.method342();
            var4.method2017(this.field9200);
            if (arg1 != -5) {
                this.method84(101);
            }
            var4.method2002(this.field9229);
            var4.method2006((int) this.field9232, (int) this.field9213, (int) this.field9195);
            this.field9216 = var3.method1379();
            this.method3649(var4, true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lq;ZLoa;Lba;)V")
    private final void method3649(class364 arg0, boolean arg1, class605 arg2, class327 arg3) {
        arg3.method1371(arg0);
        ++field9219;
        class75[] var5 = arg3.method1353();
        if (!arg1) {
            this.field9225 = 1.3165901242260518D;
        }
        class522[] var6 = arg3.method1348();
        if ((this.field9198 == null || this.field9198.field2798) && (var5 != null || var6 != null)) {
            this.field9198 = class211.method1337(class287.field3982, true);
        }
        if (this.field9198 != null) {
            this.field9198.method1343(arg2, (long) class287.field3982, var5, var6, false);
            this.field9198.method1332(super.field1757, super.field1773, super.field1762, super.field1758, super.field1761);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class399.method2547(arg3, arg2, (byte) -4, arg1) + -arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
        this.field9223 = arg10;
        this.field9221 = arg7;
        this.field9220 = arg9;
        this.field9193 = arg5;
        this.field9201 = arg0;
        this.field9234 = arg4;
        this.field9206 = arg8;
        this.field9197 = arg6;
        this.field9230 = arg11;
        this.field9211 = false;
        int var13 = class141.field1735.method3667(false, this.field9201).field8318;
        if (var13 != -1) {
            this.field9199 = class259.field3686.method2961(var13, 8);
        } else {
            this.field9199 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V")
    public static final void method3650(boolean arg0, int arg1) {
        ++field9236;
        class467 var2 = class541.method3144(arg1, (byte) -96, 7);
        if (!arg0) {
            method3651((class203) null, (class203) null, 111, (class203) null, (class386) null);
        }
        var2.method2852(0);
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)Z")
    public final boolean method84(int arg0) {
        ++field9218;
        if (arg0 != 1630) {
            this.field9194 = 0.5456542201526982D;
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Loa;B)Laca;")
    public final class630 method88(class605 arg0, byte arg1) {
        ++field9233;
        class327 var3 = this.method3647((byte) -125, 2048, arg0);
        if (var3 == null) {
            return null;
        } else {
            class364 var4 = arg0.method342();
            var4.method2017(this.field9200);
            var4.method2002(this.field9229);
            var4.method2006((int) this.field9232, (int) this.field9213, (int) this.field9195);
            this.method3649(var4, true, arg0, var3);
            if (arg1 > -127) {
                this.finalize();
            }
            if (this.field9198 == null) {
                var3.method1380(var4, (class219) null, 0);
            } else {
                class33 var5 = this.field9198.method1334();
                arg0.method307(var3, var5, var4, (class219) null, 0);
            }
            this.field9216 = var3.method1379();
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lkea;Lkea;ILkea;Lci;)Z")
    public static final boolean method3651(class203 arg0, class203 arg1, int arg2, class203 arg3, class386 arg4) {
        class224.field3145 = arg4;
        int var5 = 46 / ((arg2 - 58) / 49);
        ++field9226;
        class224.field3161 = arg1;
        class82.field919 = arg0;
        class44.field468 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(B)V")
    public static void method3652(byte arg0) {
        if (arg0 <= 27) {
            method3651((class203) null, (class203) null, 55, (class203) null, (class386) null);
        }
        field9231 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public final void method3653(int arg0, int arg1) {
        ++field9202;
        if (arg1 == -1) {
            this.field9195 += (double) arg0 * this.field9209;
            this.field9232 += (double) arg0 * this.field9225;
            this.field9211 = true;
            if (this.field9230) {
                this.field9213 = (double) (class399.method2547((int) this.field9195, (int) this.field9232, (byte) -128, super.field1757) - this.field9234);
            } else if (~this.field9221 != 0) {
                this.field9213 += this.field9210 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field9194;
                this.field9194 += (double) arg0 * this.field9210;
            } else {
                this.field9213 += (double) arg0 * this.field9194;
            }
            this.field9229 = (int) (Math.atan2(this.field9225, this.field9209) * 2607.5945876176133D) + 8192 & 16383;
            this.field9200 = (int) (Math.atan2(this.field9194, this.field9217) * 2607.5945876176133D) & 16383;
            if (this.field9199 != null) {
                this.field9212 += arg0;
                while (true) {
                    do {
                        do {
                            if (this.field9212 <= this.field9199.field2150[this.field9204]) {
                                return;
                            }
                            this.field9212 -= this.field9199.field2150[this.field9204];
                            ++this.field9204;
                            if (this.field9204 >= this.field9199.field2181.length) {
                                this.field9204 -= this.field9199.field2168;
                                if (this.field9204 < 0 || ~this.field9204 <= ~this.field9199.field2181.length) {
                                    this.field9204 = 0;
                                }
                            }
                            this.field9228 = this.field9204 - -1;
                        } while (this.field9228 < this.field9199.field2181.length);
                        this.field9228 -= this.field9199.field2168;
                    } while (this.field9228 >= 0 && ~this.field9228 > ~this.field9199.field2181.length);
                    this.field9228 = -1;
                }
            }
        }
    }
}
