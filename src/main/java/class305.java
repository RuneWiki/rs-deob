import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class305 {

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lhp;")
    private class277 field4488 = new class277(16);

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lkea;")
    private class203 field4490;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[[[I")
    public static int[][][] field4479;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBII)Lqb;", line = 6)
    public static final class191 method2027(int arg0, byte arg1, int arg2, int arg3) {
        field4484++;
        class99 var4 = class431.field6408[arg2][arg3][arg0];
        if (var4 == null) {
            return null;
        }
        class191 var5 = null;
        int var6 = -1;
        for (class104 var7 = var4.field1167; var7 != null; var7 = var7.field1251) {
            class144 var8 = var7.field1253;
            if (var8 instanceof class191) {
                class191 var9 = (class191) var8;
                int var10 = (var9.method1153(true) - 1) * 256 + 252;
                int var11 = var9.field1764 - var10 >> 9;
                int var12 = var9.field1768 - var10 >> 9;
                int var13 = var9.field1764 + var10 >> 9;
                int var14 = var9.field1768 + var10 >> 9;
                if (arg3 >= var11 && arg0 >= var12 && arg3 <= var13 && arg0 <= var14) {
                    int var15 = (var13 + 1 - arg3) * (var14 + 1 - arg0);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        if (arg1 != 60) {
            method2030(false, -26, -53, -102, (byte) 64);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILsu;III)Lll;", line = 67)
    public final class308 method2028(int arg0, int arg1, class179 arg2, int arg3, int arg4, int arg5) {
        field4481++;
        class29[] var7 = null;
        class331 var8 = this.method2031((byte) -107, arg0);
        if (arg1 != 0) {
            return null;
        }
        if (var8.field4763 != null) {
            var7 = new class29[var8.field4763.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class180 var10 = arg2.method1023(var8.field4763[var9], -111);
                var7[var9] = new class29(var10.field2214, var10.field2217, var10.field2212, var10.field2211, var10.field2209, var10.field2207, var10.field2213, var10.field2206);
            }
        }
        return new class308(var8.field4764, var7, var8.field4760, arg3, arg5, arg4);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 99)
    public final void method2029(int arg0) {
        class277 var2 = this.field4488;
        synchronized (this.field4488) {
            this.field4488.method1805(116);
        }
        if (arg0 != 100) {
            this.method2033(-96, 87);
        }
        field4486++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIB)V", line = 113)
    public static final void method2030(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4491++;
        if (class81.field908 == 0) {
            class657.method3753(false, 91);
        } else {
            class26.field270 = class81.field908;
            class418.method2644(0, (byte) 80);
        }
        class27.field289 = arg2;
        class163.field2004 = arg0;
        class355.field5054 = arg3;
        if (arg4 > 117) {
            class182.method1057(arg1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Lfu;", line = 137)
    private final class331 method2031(byte arg0, int arg1) {
        if (arg0 != -107) {
            method2036((byte) -3);
        }
        field4480++;
        class277 var3 = this.field4488;
        class331 var4;
        synchronized (this.field4488) {
            var4 = (class331) this.field4488.method1801(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field4490;
        byte[] var6;
        synchronized (this.field4490) {
            var6 = this.field4490.method1286(arg1, 29, (byte) -49);
        }
        class331 var7 = new class331();
        if (var6 != null) {
            var7.method2156(new class194(var6), -15143);
        }
        class277 var8 = this.field4488;
        synchronized (this.field4488) {
            this.field4488.method1808((long) arg1, var7, (byte) -23);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 170)
    public static void method2032(byte arg0) {
        field4479 = null;
        if (arg0 != -58) {
            field4487 = 121;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 181)
    public final void method2033(int arg0, int arg1) {
        class277 var3 = this.field4488;
        synchronized (this.field4488) {
            this.field4488.method1811((byte) 108, arg0);
            if (arg1 > -116) {
                method2027(-85, (byte) 111, 67, 58);
            }
        }
        field4489++;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V", line = 197)
    public final void method2034(byte arg0) {
        field4485++;
        if (arg0 == -46) {
            class277 var2 = this.field4488;
            synchronized (this.field4488) {
                this.field4488.method1810(false);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V", line = 210)
    public static final void method2035(int arg0) {
        field4482++;
        if (class437.field6502) {
            return;
        }
        class421.field6304 = true;
        if (class595.field8694.field6547) {
            class639.field9187 = ((int) class639.field9187 - 17 & 0xFFFFFFF0);
        } else {
            class99.field1159 += (-12.0F - class99.field1159) / 2.0F;
        }
        class437.field6502 = true;
        int var1 = 33 % ((67 - arg0) / 48);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V", line = 234)
    public static final void method2036(byte arg0) {
        if (arg0 != -4) {
            method2036((byte) -71);
        }
        field4483++;
        for (int var1 = 0; var1 < 100; var1++) {
            class260.field3707[var1] = null;
        }
        class434.field6442 = 0;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 256)
    public class305(class149 arg0, int arg1, class203 arg2) {
        this.field4490 = arg2;
        this.field4490.method1309(1675886592, 29);
    }
}
