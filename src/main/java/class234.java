import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class234 {

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Lff;")
    private class7 field3910 = new class7();

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Ler;")
    private class54 field3916 = new class54();

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    private int field3915;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    private int field3914;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "Lbn;")
    private class256 field3918;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Z")
    public static boolean field3903 = true;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Lne;")
    public static class172 field3911 = null;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Lal;")
    public static class52 field3912 = new class52(256);

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "B")
    public static byte field3919;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lvd;")
    public static class26 field3906;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLff;J)V", line = 3)
    public final void method1655(boolean arg0, class7 arg1, long arg2) {
        if (this.field3914 == 0) {
            class7 var5 = this.field3916.method358(0);
            var5.method1120(-78);
            var5.method90((byte) -53);
            if (this.field3910 == var5) {
                class7 var6 = this.field3916.method358(0);
                var6.method1120(-103);
                var6.method90((byte) -53);
            }
        } else {
            this.field3914--;
        }
        if (!arg0) {
            field3904++;
            this.field3918.method1766(arg2, arg1, 79);
            this.field3916.method363(true, arg1);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 40)
    public static void method1656(byte arg0) {
        field3911 = null;
        field3912 = null;
        field3906 = null;
        if (arg0 != -86) {
            method1656((byte) 82);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 53)
    public final void method1657(int arg0) {
        if (arg0 != -8392) {
            field3907 = 88;
        }
        field3908++;
        this.field3916.method357((byte) -98);
        this.field3918.method1764(79);
        this.field3910 = new class7();
        this.field3914 = this.field3915;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/lang/String;)I", line = 70)
    public static final int method1658(int arg0, String arg1) {
        field3905++;
        int var2 = arg1.length();
        if (arg0 != 1) {
            field3903 = false;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class220.method1571(arg1.charAt(var4), (byte) -100) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILmo;)V", line = 93)
    public static final void method1659(int arg0, class447 arg1) {
        field3909++;
        class158.field2519 = arg1;
        class301.field4773 = class158.field2519.method2758(arg0, 14535);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IJ)Lff;", line = 102)
    public final class7 method1660(int arg0, long arg1) {
        field3913++;
        class7 var4 = (class7) this.field3918.method1770(-880, arg1);
        if (var4 != null) {
            this.field3916.method363(true, var4);
        }
        if (arg0 != 2) {
            this.field3910 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Le;IILpg;III[[[B[I[I[I[I[IIBIIZ)V", line = 125)
    public static final void method1661(class312 arg0, int arg1, int arg2, class435 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class67.field847 = arg0;
        class308.field4877 = arg1;
        class407.field6043 = arg3;
        class271.field4345 = class67.field847.method606() > 0;
        class235.field3937 = arg4 >> 7;
        class181.field2959 = arg6 >> 7;
        class40.field507 = arg4;
        class379.field5746 = arg6;
        class373.field5630 = arg5;
        class255.field4137 = class235.field3937 - class374.field5649;
        if (class255.field4137 < 0) {
            class173.field2886 = -class255.field4137;
            class255.field4137 = 0;
        } else {
            class173.field2886 = 0;
        }
        class269.field4315 = class181.field2959 - class374.field5649;
        if (class269.field4315 < 0) {
            class110.field1523 = -class269.field4315;
            class269.field4315 = 0;
        } else {
            class110.field1523 = 0;
        }
        class391.field5871 = class374.field5649 + class235.field3937;
        if (class391.field5871 > class156.field2449) {
            class391.field5871 = class156.field2449;
        }
        class236.field3952 = class374.field5649 + class181.field2959;
        if (class236.field3952 > class361.field5513) {
            class236.field3952 = class361.field5513;
        }
        for (int var18 = 0; var18 < class374.field5649 + class374.field5649 + 2; var18++) {
            for (int var23 = 0; var23 < class374.field5649 + class374.field5649 + 2; var23++) {
                int var24 = class235.field3937 + var18 - class374.field5649;
                int var25 = class181.field2959 + var23 - class374.field5649;
                if (var24 >= 0 && var25 >= 0 && var24 < class156.field2449 && var25 < class361.field5513) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class181.field2961[3].method779(var24, var25) - 1000;
                    int var29 = class364.field5542 == null ? class181.field2961[0].method779(var24, var25) + 128 : class364.field5542[0].method779(var24, var25) + 128;
                    class56.field706[var18][var23] = class67.field847.method708(var26, var28, var27, var26, var29, var27);
                } else {
                    class56.field706[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class374.field5649 + class374.field5649 + 1; var19++) {
            for (int var22 = 0; var22 < class374.field5649 + class374.field5649 + 1; var22++) {
                class241.field3991[var19][var22] = class56.field706[var19][var22] || class56.field706[var19 + 1][var22] || class56.field706[var19][var22 + 1] || class56.field706[var19 + 1][var22 + 1];
            }
        }
        class99.field1395 = arg8;
        class322.field5032 = arg9;
        class270.field4339 = arg10;
        class117.field1625 = arg11;
        class132.field2066 = arg12;
        class70.method441();
        class280.method1909(-119);
        for (class306 var20 = (class306) class449.field6542.method2430(67); var20 != null; var20 = (class306) class449.field6542.method2435(-224)) {
            var20.method2100(-108);
            class77.method484(false, var20);
        }
        if (class271.field4345) {
            for (int var21 = 0; var21 < class134.field2101; var21++) {
                class27.field317[var21].method2372((byte) 113, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class67.field847.method637(0);
            if (class264.field4255 == null || class264.field4255 instanceof class213) {
                class264.field4255 = new class431();
            }
        } else if (class264.field4255 == null || class264.field4255 instanceof class431) {
            class264.field4255 = new class213();
        }
        class264.field4255.method435((byte) -115, arg2);
        class264.field4255.method436(-120);
        if (class179.field2923 != null) {
            class91.method539(true);
            class264.field4255.method432(22, 32);
            class236.method1669(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class264.field4255.method436(-114);
            class264.field4255.method432(23, 32);
            class91.method539(false);
        }
        class236.method1669(arg2, arg7, arg13, arg14, arg15, arg16);
        class264.field4255.method436(-105);
        class264.field4255.method433(8);
        class264.field4255.method436(-119);
        if (arg2 > 1) {
            class67.field847.method674(0);
        }
        class67.field847.method613(0, (class62[]) null);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V", line = 320)
    public class234(int arg0) {
        this.field3915 = arg0;
        this.field3914 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3918 = new class256(var2);
    }
}
