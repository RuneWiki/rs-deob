import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class20 extends class120 {

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "Z")
    public static boolean field321 = false;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "Ljava/lang/String;")
    public static String field323 = "slide:";

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "[B")
    private byte[] field320;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V", line = 5)
    public final void method221(int arg0, int arg1, int arg2) {
        if (arg2 != 512) {
            this.field326 = -119;
        }
        if (arg0 == 0) {
            this.field318 = this.field331 - (arg1 >= 0 ? arg1 : -arg1);
            this.field318 = this.field318 * this.field318 >> 12;
            this.field335 = 4096;
            this.field317 = this.field318;
        } else {
            this.field335 = this.field324 * this.field318 >> 12;
            this.field318 = this.field331 - (arg1 < 0 ? -arg1 : arg1);
            if (this.field335 < 0) {
                this.field335 = 0;
            } else if (this.field335 > 4096) {
                this.field335 = 4096;
            }
            this.field318 = this.field318 * this.field318 >> 12;
            this.field318 = this.field335 * this.field318 >> 12;
            this.field317 += this.field326 * this.field318 >> 12;
            this.field326 = this.field330 * this.field326 >> 12;
        }
        field319++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V", line = 45)
    public void method222(int arg0, byte arg1) {
        this.field320[arg0] = arg1;
        field322++;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Z)V", line = 61)
    public final void method223(boolean arg0) {
        field332++;
        this.field317 = 0;
        if (arg0) {
            this.method221(-68, -34, 80);
        }
        this.field327 = 0;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V", line = 77)
    public final void method224(int arg0) {
        this.field317 >>= 0x4;
        this.field326 = this.field330;
        if (this.field317 < 0) {
            this.field317 = 0;
        } else if (this.field317 > 255) {
            this.field317 = 255;
        }
        this.method222(this.field327++, (byte) this.field317);
        field334++;
        if (arg0 != -868156244) {
            field323 = (String) null;
        }
        this.field317 = 0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 99)
    public static void method225(byte arg0) {
        field323 = null;
        if (arg0 != -53) {
            field321 = false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 112)
    public static final String method226(int arg0, long arg1) {
        class22.field346.setTime(new Date(arg1));
        field329++;
        int var3 = class22.field346.get(7);
        int var4 = class22.field346.get(5);
        if (arg0 != -2) {
            field325 = -47;
        }
        int var5 = class22.field346.get(2);
        int var6 = class22.field346.get(1);
        int var7 = class22.field346.get(11);
        int var8 = class22.field346.get(12);
        int var9 = class22.field346.get(13);
        return class38.field578[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class165.field2621[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIIFFF)V", line = 143)
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field331 = (int) (arg6 * 4096.0F);
        this.field324 = (int) (arg7 * 4096.0F);
        this.field326 = this.field330 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILug;)V", line = 154)
    public static final void method227(int arg0, class25 arg1) {
        field333++;
        if ((arg1.field448.length - arg1.field397) < 1) {
            return;
        }
        int var2 = arg1.method281(arg0 - 132);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg1.field448.length - arg1.field397)) {
            return;
        }
        class139.field2321 = arg1.method281(arg0 - 132);
        if (class139.field2321 < 1) {
            class139.field2321 = 1;
        } else if (class139.field2321 > 4) {
            class139.field2321 = 4;
        }
        class109.method953(arg1.method281(arg0 ^ 0x2) == 1, (byte) -114);
        class274.field4252 = arg1.method281(arg0 + 108) == 1;
        class327.field5034 = arg1.method281(75) == 1;
        class121.field1878 = arg1.method281(90) == 1;
        class86.field1241 = arg1.method281(arg0 - 132) == 1;
        class108.field1626 = arg1.method281(-125) == 1;
        class290.field4504 = arg1.method281(61) == 1;
        class101.field1529 = arg1.method281(-128) == 1;
        class19.field311 = arg1.method281(-128);
        if (class19.field311 > 2) {
            class19.field311 = 2;
        }
        if (var2 >= 2) {
            class59.field927 = arg1.method281(-125) == 1;
        } else {
            class59.field927 = arg1.method281(arg0 + 14) == 1;
            arg1.method281(33);
        }
        class164.field2603 = arg1.method281(arg0 ^ 0xFFFFFF87) == 1;
        class343.field5451 = arg1.method281(-127) == 1;
        class74.field1091 = arg1.method281(arg0 ^ 0xFFFFFF82);
        if (class74.field1091 > 2) {
            class74.field1091 = 2;
        }
        class271.field4194 = class74.field1091;
        class110.field1686 = arg1.method281(56) == 1;
        class224.field3509 = arg1.method281(arg0 ^ 0xFFFFFF86);
        if (class224.field3509 > 127) {
            class224.field3509 = 127;
        }
        class239.field3720 = arg1.method281(arg0 + 120);
        class287.field4454 = arg1.method281(-128);
        if (class287.field4454 > 127) {
            class287.field4454 = 127;
        }
        if (var2 >= 1) {
            class68.field1047 = arg1.method314((byte) 82);
            class134.field2245 = arg1.method314((byte) 73);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method281(-128);
        }
        if (var2 >= 4) {
            int var4 = arg1.method281(arg0 + 96);
            if (class121.field1889 < 96) {
                var4 = 0;
            }
            class273.method1998(var4);
        }
        if (var2 >= 5) {
            class195.field3071 = arg1.method262((byte) 82);
        }
        if (arg0 <= var2) {
            class123.field1968 = arg1.method281(arg0 - 133);
        }
        if (var2 >= 7) {
            class4.field56 = arg1.method281(-126) == 1;
        }
        if (var2 >= 8) {
            class278.field4292 = arg1.method281(-125) == 1;
        }
        if (var2 >= 9) {
            class64.field989 = arg1.method281(51);
        }
        if (var2 >= 10) {
            class33.field502 = arg1.method281(-128) != 0;
        }
        if (var2 >= 11) {
            class321.field4946 = arg1.method281(-127) != 0;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZIZZIII)V", line = 313)
    public static final void method228(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg4 > arg6) {
            int var7 = arg6;
            int var8 = (arg4 + arg6) / 2;
            class316 var9 = class31.field484[var8];
            class31.field484[var8] = class31.field484[arg4];
            class31.field484[arg4] = var9;
            for (int var10 = arg6; var10 < arg4; var10++) {
                if (class43.method444(arg5, arg2, 0, arg1, arg3, var9, class31.field484[var10]) <= 0) {
                    class316 var11 = class31.field484[var10];
                    class31.field484[var10] = class31.field484[var7];
                    class31.field484[var7++] = var11;
                }
            }
            class31.field484[arg4] = class31.field484[var7];
            class31.field484[var7] = var9;
            method228(false, arg1, arg2, arg3, var7 - 1, arg5, arg6);
            method228(false, arg1, arg2, arg3, arg4, arg5, var7 + 1);
        }
        if (arg0) {
            field321 = true;
        }
        field328++;
    }
}
