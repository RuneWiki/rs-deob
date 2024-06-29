import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class172 implements class275 {

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Lqj;")
    private class280 field2616 = new class280(256);

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Lnk;")
    private class16 field2614;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Lnk;")
    private class16 field2622;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "[Lnb;")
    private class347[] field2608;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2615 = new String[100];

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([II[JII)V", line = 5)
    public static final void method1204(int[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if (var7 + ((long) (var10 & 0x1)) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var9;
            method1204(arg0, 117, arg2, arg3, var6 - 1);
            method1204(arg0, 108, arg2, var6 + 1, arg4);
        }
        int var14 = -10 / ((39 - arg1) / 36);
        field2620++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 58)
    public static void method1205(byte arg0) {
        field2615 = null;
        if (arg0 != -110) {
            method1204((int[]) null, -22, (long[]) null, 87, 48);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Z", line = 73)
    public final boolean method1206(int arg0, int arg1) {
        int var3 = 115 / ((arg1 + 25) / 58);
        class87 var4 = this.method943((byte) -126, arg0);
        field2610++;
        return var4 != null && var4.method550(this.field2622, this, -97);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)Lnb;", line = 89)
    public final class347 method1207(int arg0, byte arg1) {
        if (arg1 > -81) {
            method1208((String) null, 12, 70);
        }
        field2621++;
        return this.field2608[arg0];
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(BI)Lkd;", line = 114)
    public class87 method943(byte arg0, int arg1) {
        class259 var3 = this.field2616.method1998(-1114531641, (long) arg1);
        field2611++;
        if (var3 != null) {
            return (class87) var3;
        }
        byte[] var4 = this.field2614.method124(arg1, 12700);
        if (var4 == null) {
            return null;
        }
        if (arg0 >= -94) {
            method1209(38);
        }
        class87 var5 = new class87(new class143(var4));
        this.field2616.method2000(var5, (byte) -90, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 138)
    public static final void method1208(String arg0, int arg1, int arg2) {
        field2617++;
        if (arg2 < 116) {
            method1209(-18);
        }
        class279 var3 = class147.method1085(arg1, -19443, 2);
        var3.method1989(0);
        var3.field4399 = arg0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 156)
    public static final void method1209(int arg0) {
        if (arg0 <= 116) {
            method1205((byte) -65);
        }
        class197.field3006.method383((byte) -48);
        class188.field2830.method383((byte) -48);
        field2613++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIIIF)[I", line = 170)
    public final int[] method1210(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg0 != 9024) {
            this.field2616 = (class280) null;
        }
        field2619++;
        return this.method943((byte) -103, arg3).method559(this.field2608[arg3].field5495, arg4, arg1, this.field2622, (double) arg5, 1102507408, this, arg2);
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lnk;Lnk;Lnk;)V", line = 192)
    public class172(class16 arg0, class16 arg1, class16 arg2) {
        this.field2614 = arg1;
        this.field2622 = arg2;
        class143 var4 = new class143(arg0.method100(0, 0, (byte) -107));
        int var5 = var4.method1051(1);
        this.field2608 = new class347[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1043(true) == 1) {
                this.field2608[var6] = new class347();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2608[var7] != null) {
                this.field2608[var7].field5506 = var4.method1043(true) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2608[var8] != null) {
                this.field2608[var8].field5496 = var4.method1043(true) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2608[var9] != null) {
                this.field2608[var9].field5493 = var4.method1043(true) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2608[var10] != null) {
                this.field2608[var10].field5500 = var4.method1043(true) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2608[var11] != null) {
                this.field2608[var11].field5505 = var4.method1028(79030408);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2608[var12] != null) {
                this.field2608[var12].field5504 = var4.method1028(79030408);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2608[var13] != null) {
                this.field2608[var13].field5498 = var4.method1028(79030408);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2608[var14] != null) {
                this.field2608[var14].field5509 = var4.method1028(79030408);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2608[var15] != null) {
                this.field2608[var15].field5508 = (short) var4.method1051(1);
            }
        }
        if (var4.field2295 < var4.field2260.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2608[var16] != null) {
                    var4.method1028(79030408);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2608[var17] != null) {
                    var4.method1028(79030408);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2608[var18] != null) {
                    var4.method1043(true);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2608[var19] != null) {
                    this.field2608[var19].field5495 = var4.method1043(true) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2608[var20] != null) {
                    var4.method1028(79030408);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2608[var21] != null) {
                    var4.method1043(true);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2608[var22] != null) {
                    var4.method1043(true);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2608[var23] != null) {
                    var4.method1043(true);
                }
            }
        }
    }
}
