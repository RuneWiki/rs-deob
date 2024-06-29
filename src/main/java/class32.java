import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class32 {

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lab;")
    public class147 field541 = new class147();

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Ln;")
    public static class282 field540 = new class282(4);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Lab;")
    private class147 field544;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Ljh;", line = 5)
    public static final class267 method251(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class267 var4 = var3.field890;
            var3.field890 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lhn;", line = 17)
    public static final class33 method252(int arg0, int arg1) {
        class33 var2 = (class33) class81.field1264.method28((long) arg1, 1400);
        field537++;
        if (arg0 != 64) {
            method260(false, -77, -82);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2181.method1889(11, (byte) -122, arg1);
        class33 var4 = new class33();
        if (var3 != null) {
            var4.method270(207, new class82(var3));
        }
        class81.field1264.method33(var4, (long) arg1, (byte) 98);
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 44)
    public final void method253(int arg0) {
        while (true) {
            class147 var2 = this.field541.field2296;
            if (this.field541 == var2) {
                field542++;
                if (arg0 > -47) {
                    this.field541 = (class147) null;
                }
                this.field544 = null;
                return;
            }
            var2.method1006(-1024);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Lab;", line = 67)
    public final class147 method254(int arg0) {
        field529++;
        class147 var2 = this.field541.field2304;
        if (arg0 != 2) {
            method255(56, (class172[]) null);
        }
        if (this.field541 == var2) {
            this.field544 = null;
            return null;
        } else {
            this.field544 = var2.field2304;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lhg;)V", line = 87)
    public static final void method255(int arg0, class172[] arg1) {
        class323.field5561[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V", line = 102)
    public static final void method256(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class224 var5 = (class224) class147.field2306.method264(-118); var5 != null; var5 = (class224) class147.field2306.method263(arg4 ^ 0x5)) {
            class277.method1960(arg1, var5, arg3, arg0, arg2, 126);
        }
        field530++;
        for (class224 var6 = (class224) class285.field4793.method264(-62); var6 != null; var6 = (class224) class285.field4793.method263(4)) {
            byte var7 = 1;
            class236 var8 = var6.field3550.method1656(false);
            if (var6.field3550.field3901 == var8.field3751) {
                var7 = 0;
            } else if (var6.field3550.field3901 == var8.field3780 || var6.field3550.field3901 == var8.field3773 || var6.field3550.field3901 == var8.field3760 || var6.field3550.field3901 == var8.field3757) {
                var7 = 2;
            } else if (var6.field3550.field3901 == var8.field3786 || var6.field3550.field3901 == var8.field3756 || var6.field3550.field3901 == var8.field3765 || var6.field3550.field3901 == var8.field3794) {
                var7 = 3;
            }
            if (var6.field3548 != var7) {
                int var9 = class83.method649(var6.field3550, -1);
                if (var6.field3559 != var9) {
                    if (var6.field3537 != null) {
                        class301.field5195.method1313(var6.field3537);
                        var6.field3537 = null;
                    }
                    var6.field3559 = var9;
                }
                var6.field3548 = var7;
            }
            var6.field3553 = var6.field3550.field3962;
            var6.field3547 = var6.field3550.field3962 + var6.field3550.method1078((byte) 114) * 64;
            var6.field3532 = var6.field3550.field3972;
            var6.field3531 = var6.field3550.field3972 + var6.field3550.method1078((byte) 114) * 64;
            class277.method1960(arg1, var6, arg3, arg0, arg2, arg4 ^ 0x71);
        }
        if (arg4 != 1) {
            return;
        }
        for (class224 var10 = (class224) class94.field1538.method1823(88); var10 != null; var10 = (class224) class94.field1538.method1825(arg4 ^ 0xFFFFFFA4)) {
            byte var11 = 1;
            class236 var12 = var10.field3554.method1656(false);
            if (var10.field3554.field3901 == var12.field3751) {
                var11 = 0;
            } else if (var10.field3554.field3901 == var12.field3780 || var10.field3554.field3901 == var12.field3773 || var10.field3554.field3901 == var12.field3760 || var10.field3554.field3901 == var12.field3757) {
                var11 = 2;
            } else if (var10.field3554.field3901 == var12.field3786 || var10.field3554.field3901 == var12.field3756 || var10.field3554.field3901 == var12.field3765 || var10.field3554.field3901 == var12.field3794) {
                var11 = 3;
            }
            if (var10.field3548 != var11) {
                int var13 = class138.method922(0, var10.field3554);
                if (var10.field3559 != var13) {
                    if (var10.field3537 != null) {
                        class301.field5195.method1313(var10.field3537);
                        var10.field3537 = null;
                    }
                    var10.field3559 = var13;
                }
                var10.field3548 = var11;
            }
            var10.field3553 = var10.field3554.field3962;
            var10.field3547 = var10.field3554.field3962 + var10.field3554.method1078((byte) 114) * 64;
            var10.field3532 = var10.field3554.field3972;
            var10.field3531 = var10.field3554.field3972 + var10.field3554.method1078((byte) 114) * 64;
            class277.method1960(arg1, var10, arg3, arg0, arg2, 110);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLab;)V", line = 224)
    public final void method257(boolean arg0, class147 arg1) {
        if (arg1.field2304 != null) {
            arg1.method1006(-1024);
        }
        field539++;
        arg1.field2296 = this.field541;
        arg1.field2304 = this.field541.field2304;
        if (arg0) {
            arg1.field2304.field2296 = arg1;
            arg1.field2296.field2304 = arg1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILab;)V", line = 241)
    public final void method258(int arg0, class147 arg1) {
        if (arg1.field2304 != null) {
            arg1.method1006(-1024);
        }
        field538++;
        arg1.field2296 = this.field541.field2296;
        arg1.field2304 = this.field541;
        arg1.field2304.field2296 = arg1;
        arg1.field2296.field2304 = arg1;
        if (arg0 != 64) {
            this.method263(-77);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 265)
    public static void method259(int arg0) {
        field540 = null;
        if (arg0 != 0) {
            method255(56, (class172[]) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZII)Lna;", line = 278)
    public static final class26 method260(boolean arg0, int arg1, int arg2) {
        field531++;
        return arg1 <= 122 ? (class26) null : class97.method723((byte) -128, arg0, 10, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)Lab;", line = 290)
    public final class147 method261(int arg0) {
        if (arg0 < 13) {
            this.field541 = (class147) null;
        }
        field543++;
        class147 var2 = this.field544;
        if (this.field541 == var2) {
            this.field544 = null;
            return null;
        } else {
            this.field544 = var2.field2304;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 339)
    public class32() {
        this.field541.field2304 = this.field541;
        this.field541.field2296 = this.field541;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lab;", line = 320)
    public final class147 method262(byte arg0) {
        class147 var2 = this.field541.field2296;
        field535++;
        if (arg0 != -3) {
            return (class147) null;
        } else if (this.field541 == var2) {
            return null;
        } else {
            var2.method1006(arg0 - 1021);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)Lab;", line = 353)
    public final class147 method263(int arg0) {
        field534++;
        if (arg0 != 4) {
            return (class147) null;
        }
        class147 var2 = this.field544;
        if (this.field541 == var2) {
            this.field544 = null;
            return null;
        } else {
            this.field544 = var2.field2296;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)Lab;", line = 375)
    public final class147 method264(int arg0) {
        class147 var2 = this.field541.field2296;
        field532++;
        if (arg0 >= -16) {
            this.field544 = (class147) null;
        }
        if (this.field541 == var2) {
            this.field544 = null;
            return null;
        } else {
            this.field544 = var2.field2296;
            return var2;
        }
    }
}
