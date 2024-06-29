import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class380 {

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "Leda;")
    private class14 field5706 = new class14(64);

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "Lla;")
    private class422 field5715;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Ltm;")
    public static class334 field5710 = new class334(24, 3);

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public static int field5712 = -1;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V", line = 4)
    public static void method2392(byte arg0) {
        field5710 = null;
        if (arg0 <= 29) {
            method2393(-53, 66, -61);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V", line = 16)
    public static final void method2393(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        if (var3 != null) {
            class542.method3172(var3.field1768);
            if (var3.field1768 != null) {
                var3.field1768 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 29)
    public final void method2394(int arg0) {
        if (arg0 != 255) {
            field5712 = -12;
        }
        class14 var2 = this.field5706;
        synchronized (this.field5706) {
            this.field5706.method76(arg0 - 204);
        }
        field5707++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)Llm;", line = 43)
    public final class204 method2395(byte arg0, int arg1) {
        field5713++;
        class14 var3 = this.field5706;
        class204 var4;
        synchronized (this.field5706) {
            var4 = (class204) this.field5706.method80((byte) -21, (long) arg1);
            int var5 = 51 / ((-arg0 - 52) / 41);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var6 = this.field5715;
        byte[] var7;
        synchronized (this.field5715) {
            var7 = this.field5715.method2624(0, 31, arg1);
        }
        class204 var8 = new class204();
        if (var7 != null) {
            var8.method1504(0, new class301(var7));
        }
        class14 var9 = this.field5706;
        synchronized (this.field5706) {
            this.field5706.method67((long) arg1, var8, -6772);
            return var8;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V", line = 73)
    public final void method2396(int arg0) {
        class14 var2 = this.field5706;
        synchronized (this.field5706) {
            if (arg0 <= 74) {
                method2393(90, 58, 0);
            }
            this.field5706.method71((byte) 44);
        }
        field5711++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([IIIIIIII)V", line = 88)
    public static final void method2397(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5714++;
        if (arg4 > 0 && !class668.method3743((byte) -122, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class668.method3743((byte) -121, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 32993) {
            int var8 = 0;
            int var9 = arg4 < arg1 ? arg4 : arg1;
            int var10 = arg4 >> 1;
            int var11 = arg1 >> 1;
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg7, var8, arg2, arg4, arg1, 0, arg3, arg6, var12, 0);
                if (var9 <= 1) {
                    if (arg5 != -30633) {
                        field5710 = null;
                        return;
                    }
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg4;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 >> 8 & 0xFF;
                        int var24 = var20 >> 24 & 0xFF;
                        int var25 = var12[var16++];
                        int var26 = (var20 & 0xFFA589) >> 16;
                        int var27 = var20 & 0xFF;
                        int var28 = ((var21 & 0xFF13) >> 8) + var23;
                        int var29 = (var21 >> 24 & 0xFF) + var24;
                        int var30 = (var21 & 0xFF) + var27;
                        int var31 = (var21 >> 16 & 0xFF) + var26;
                        int var32 = ((var22 & 0xFFD6) >> 8) + var28;
                        int var33 = (var22 & 0xFF) + var30;
                        int var34 = (var22 >> 16 & 0xFF) + var31;
                        int var35 = (var22 >> 24 & 0xFF) + var29;
                        int var36 = ((var25 & 0xFFF223) >> 16) + var34;
                        int var37 = (var25 & 0xFF) + var33;
                        int var38 = (var25 >> 24 & 0xFF) + var35;
                        int var39 = (var25 >> 8 & 0xFF) + var32;
                        var13[var14++] = class112.method903(class112.method903(class636.method3603(var39 << 6, 65280), class112.method903(class636.method3603(-16777216, var38 << 22), class636.method3603(var36, 1020) << 14)), class636.method3603(255, var37 >> 2));
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                arg1 = var11;
                var12 = var18;
                arg4 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(B)V", line = 194)
    public static final void method2398(byte arg0) {
        field5705++;
        if (class612.field8628 == null) {
            class612.field8628 = class432.method2684(27202);
            class159.field2475 = class612.field8628[0];
            class564.field7996 = class18.method109(-11121);
        }
        if (class346.field5112 == null) {
            class118.method932((byte) -27);
        }
        class432 var1 = class159.field2475;
        int var2 = class407.method2520(-107);
        if (class159.field2475 == var1) {
            class607.field8575 = class159.field2475.field6304.method3621(125, class467.field6804);
            if (class159.field2475.field6307) {
                class14.field151 = class159.field2475.field6308 + ((class159.field2475.field6312 - class159.field2475.field6308) * var2 / 100);
            }
            if (class159.field2475.field6301) {
                class607.field8575 = class607.field8575 + class14.field151 + "%";
            }
        } else if (class432.field6333 == class159.field2475) {
            class346.field5112 = null;
            class658.method3704(-5697, 3);
        } else {
            class607.field8575 = var1.field6315.method3621(110, class467.field6804);
            if (class159.field2475.field6301) {
                class607.field8575 = class607.field8575 + var1.field6312 + "%";
            }
            class14.field151 = var1.field6312;
            if (class159.field2475.field6307 || var1.field6307) {
                class564.field7996 = class18.method109(-11121);
            }
        }
        if (class346.field5112 != null) {
            class346.field5112.method3990(class564.field7996, (byte) -95, class14.field151, class159.field2475, class607.field8575);
            if (class13.field130 != null) {
                for (int var3 = class120.field1841 + 1; var3 < class13.field130.length; var3++) {
                    if (class13.field130[var3].method1756((byte) 56) >= 100 && var3 - 1 == class120.field1841 && class521.field7529 >= 1 && class346.field5112.method3980(31225)) {
                        try {
                            class13.field130[var3].method1757((byte) -84);
                        } catch (Exception var4) {
                            class13.field130 = null;
                            break;
                        }
                        class346.field5112.method3979(false, class13.field130[var3]);
                        class120.field1841++;
                        if (class120.field1841 >= (class13.field130.length - 1) && class13.field130.length > 1) {
                            class120.field1841 = class343.field5091.method1633((byte) -126) ? 0 : -1;
                        }
                    }
                }
            }
        }
        if (arg0 > -107) {
            method2397(null, -35, -93, -19, 80, -8, -77, -25);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI)V", line = 306)
    public final void method2399(boolean arg0, int arg1) {
        class14 var3 = this.field5706;
        synchronized (this.field5706) {
            this.field5706.method68(-16878, arg1);
        }
        if (arg0) {
            this.method2396(-89);
        }
        field5709++;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 322)
    public class380(class292 arg0, int arg1, class422 arg2) {
        this.field5715 = arg2;
        this.field5715.method2615(0, 31);
    }
}
