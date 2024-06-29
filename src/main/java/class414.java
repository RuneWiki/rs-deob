import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class414 extends class423 {

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    private int field6263 = 0;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "Z")
    public boolean field6257 = false;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    private int field6269 = 0;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    private int field6261 = -32768;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
    private int field6265 = -1;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
    private int field6272 = 0;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
    public int field6250;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    private int field6262;

    @OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
    private int field6276;

    @OriginalMember(owner = "client!fp", name = "U", descriptor = "Lhg;")
    private class363 field6277;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "Lbi;")
    public static class104 field6271 = new class104(98, -1);

    @OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
    public static int field6278 = 0;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!fp", name = "R", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!fp", name = "S", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!fp", name = "W", descriptor = "Lbi;")
    public static class104 field6279;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "Lbn;")
    private class356 field6266;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static final void method2637(byte arg0) {
        int var1 = 94 % ((arg0 - 52) / 48);
        ++field6268;
        class321.field4988 = 0;
        class358.field5563 = 0;
        class418.field6343 = 0;
        class456.field7043 = 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZII)V")
    public static final void method2638(boolean arg0, int arg1, int arg2) {
        class300.field4718 = arg1;
        ++field6270;
        class334.field5227 = arg2;
        class497.method3035(class540.field7899.field7722, false, class540.field7899.field7721);
        if (arg0) {
            class426.method2695("", false, "");
        } else {
            class415.method2652(true);
            class426.method2695(class345.field5379, false, class296.field4668);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLza;II)Le;")
    private final class536 method2639(byte arg0, class497 arg1, int arg2, int arg3) {
        ++field6273;
        class279 var5 = class85.field1242.method1972((byte) -58, arg3);
        class223 var6 = class244.field3956[super.field6419];
        class223 var7 = ~this.field6276 <= -4 ? null : class244.field3956[this.field6276 + 1];
        if (arg0 >= -81) {
            this.field6272 = 82;
        }
        return this.field6257 ? var5.method1872(super.field6412, arg1, arg2, var6, class388.field5915, -1, super.field6417, -1, super.field6410, 0, var7, 27968, true) : var5.method1872(super.field6412, arg1, arg2, var6, class388.field5915, this.field6265, super.field6417, this.field6269, super.field6410, this.field6272, var7, 27968, true);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        if (arg1 != 32689) {
            this.field6272 = -58;
        }
        ++field6252;
        return false;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        ++field6264;
        if (arg0 != -1) {
            method2644(63);
        }
        class536 var3 = this.method2639((byte) -114, arg1, 0, this.field6262);
        if (var3 != null) {
            this.method2640(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!fp", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field6256;
        if (this.field6266 != null) {
            this.field6266.method2356();
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Le;Lza;I)V")
    private final void method2640(class536 arg0, class497 arg1, int arg2) {
        if (arg2 != 0) {
            field6267 = -58;
        }
        ++field6275;
        class293[] var4 = arg0.method292();
        class100[] var5 = arg0.method326();
        if ((this.field6266 == null || this.field6266.field5518) && (var4 != null || var5 != null)) {
            this.field6266 = new class356(class88.field1278);
        }
        if (this.field6266 != null) {
            this.field6266.method2352(arg1, (long) class88.field1278, var4, var5, false);
            this.field6266.method2349(super.field6419, super.field6423, super.field6420, super.field6424, super.field6418);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method2641(int arg0) {
        if (this.field6266 != null) {
            this.field6266.method2356();
        }
        if (arg0 != 0) {
            method2638(false, -46, -92);
        }
        ++field6255;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        if (arg0 != 287) {
            this.field6257 = true;
        }
        ++field6274;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(Z)I")
    public final int method1596(boolean arg0) {
        if (!arg0) {
            this.field6261 = 92;
        }
        ++field6259;
        return this.field6261;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)V")
    public final void method2642(int arg0, boolean arg1) {
        ++field6258;
        if (!this.field6257) {
            this.field6272 += arg0;
            while (this.field6277.field5599[this.field6269] < this.field6272) {
                this.field6272 -= this.field6277.field5599[this.field6269];
                ++this.field6269;
                if (~this.field6269 <= ~this.field6277.field5623.length) {
                    this.field6257 = true;
                    break;
                }
            }
            if (!this.field6257) {
                class35.method217((byte) -44, false, this.field6269, this.field6277, super.field6417, super.field6410, super.field6419);
            }
            if (!arg1) {
                field6267 = 112;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)Lab;")
    public static final class444 method2643(boolean arg0, int arg1) {
        ++field6251;
        if (!arg0) {
            return null;
        } else {
            class444 var2 = (class444) class180.field2620.method2191((byte) -73, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class471.field7197.method1004(1, false, arg1);
                class444 var4 = new class444();
                var4.field6889 = arg1;
                if (var3 != null) {
                    var4.method2813(1, new class208(var3));
                }
                var4.method2809((byte) 82);
                if (~var4.field6888 == -3 && class16.field167.method1122((byte) 59, (long) arg1) == null) {
                    class16.field167.method1127(new class330(class398.field6001), (byte) 44, (long) arg1);
                    class274.field4354[class398.field6001++] = var4;
                }
                class180.field2620.method2188(-125, (long) arg1, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        if (arg0) {
            field6267 = -121;
        }
        ++field6260;
        return false;
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)V")
    public static void method2644(int arg0) {
        field6271 = null;
        if (arg0 >= 104) {
            field6279 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field6253;
        class536 var3 = this.method2639((byte) -116, arg1, (~this.field6263 == -1 ? 0 : 5) | 2048, this.field6262);
        if (var3 == null) {
            return null;
        } else {
            if (this.field6263 != 0) {
                var3.method280(this.field6263 * 2048);
            }
            class205 var4 = arg1.method1231();
            var4.method158(super.field6417, super.field6412, super.field6410);
            if (this.field6266 == null) {
                var3.method295(var4, (class182) null, 0);
            } else {
                class519 var5 = this.field6266.method2354();
                arg1.method1291(var3, var5, var4, (class182) null, 0);
            }
            if (arg0 != 2) {
                field6271 = null;
            }
            this.field6261 = var3.method305();
            this.method2640(var3, arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        ++field6254;
        int var8 = 115 % ((27 - arg4) / 32);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field6263 = arg12;
        this.field6250 = arg1 + arg2;
        this.field6262 = arg0;
        this.field6276 = arg4;
        class279 var14 = class85.field1242.method1972((byte) -58, this.field6262);
        int var15 = var14.field4398;
        if (~var15 == 0) {
            this.field6257 = true;
        } else {
            this.field6277 = class388.field5915.method1703(var15, -12536);
            this.field6257 = false;
        }
        if (~this.field6250 == ~arg2) {
            class35.method217((byte) -44, false, this.field6269, this.field6277, super.field6417, super.field6410, super.field6419);
        }
    }
}
