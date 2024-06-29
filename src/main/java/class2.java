import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Lfa;")
    private class156 field3 = new class156(64);

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "Lfa;")
    public class156 field23 = new class156(50);

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "Lsq;")
    public class118 field24 = new class118(250);

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "Lmt;")
    private class272 field25 = new class272();

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "Lph;")
    private class454 field27;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "Lfs;")
    public class387 field14;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Lfs;")
    private class387 field18;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "Z")
    private boolean field21;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field29;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field26;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5 = new String[8];

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "[Ll;")
    public static class16[] field17;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZLcj;Lla;IILya;ZIIIZLya;)Ll;", line = 7)
    public final class16 method2(boolean arg0, class488 arg1, class314 arg2, int arg3, int arg4, class38 arg5, boolean arg6, int arg7, int arg8, int arg9, boolean arg10, class38 arg11) {
        field4++;
        class16 var13 = this.method3(arg11, arg3, -127, arg1, arg4, arg7, arg9, arg8);
        if (var13 != null) {
            return var13;
        }
        if (!arg10) {
            method14(64);
        }
        class72 var14 = this.method6(22883, arg3);
        if (arg7 > 1 && var14.field933 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field967[var16] <= arg7 && var14.field967[var16] != 0) {
                    var15 = var14.field933[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method6(22883, var15);
            }
        }
        int[] var17 = var14.method672(arg1, arg0, arg2, arg7, arg9, 0, arg4, arg11, arg8, arg5);
        if (var17 == null) {
            return null;
        }
        class16 var18;
        if (arg6) {
            var18 = arg5.method330(var17, 0, 36, 36, 32);
        } else {
            var18 = arg11.method330(var17, 0, 36, 36, 32);
        }
        if (!arg6) {
            class272 var19 = new class272();
            var19.field4021 = arg1 != null;
            var19.field4018 = arg9;
            var19.field4016 = arg3;
            var19.field4028 = arg4;
            var19.field4015 = arg7;
            var19.field4019 = arg11.field430;
            var19.field4023 = arg8;
            this.field24.method938(91, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lya;IILcj;IIII)Ll;", line = 72)
    public final class16 method3(class38 arg0, int arg1, int arg2, class488 arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field25.field4023 = arg7;
        this.field25.field4019 = arg0.field430;
        this.field25.field4028 = arg4;
        this.field25.field4018 = arg6;
        this.field25.field4021 = arg3 != null;
        this.field25.field4016 = arg1;
        field6++;
        this.field25.field4015 = arg5;
        if (arg2 > -112) {
            this.method6(24, 119);
        }
        return (class16) this.field24.method931(this.field25, 14278);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 91)
    public final void method4(byte arg0) {
        field1++;
        class118 var2 = this.field24;
        synchronized (this.field24) {
            if (arg0 == 65) {
                this.field24.method936(true);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 105)
    public final void method5(int arg0) {
        field8++;
        if (arg0 != 36) {
            this.method10((byte) 58);
        }
        class156 var2 = this.field3;
        synchronized (this.field3) {
            this.field3.method1119(arg0 ^ 0x4A);
        }
        class156 var3 = this.field23;
        synchronized (this.field23) {
            this.field23.method1119(112);
        }
        class118 var4 = this.field24;
        synchronized (this.field24) {
            this.field24.method937(107);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Lrv;", line = 125)
    public final class72 method6(int arg0, int arg1) {
        field7++;
        class156 var3 = this.field3;
        class72 var4;
        synchronized (this.field3) {
            var4 = (class72) this.field3.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field18.method2363(class263.method1687(arg0 - 22628, arg1), class315.method1967(arg1, (byte) 103), 91);
        class72 var6 = new class72();
        var6.field976 = arg1;
        var6.field975 = this;
        var6.field947 = new String[] { null, null, class138.field1972.method2031(true, this.field15), null, null };
        var6.field930 = new String[] { null, null, null, null, class140.field1985.method2031(true, this.field15) };
        if (arg0 != 22883) {
            field12 = -127;
        }
        if (var5 != null) {
            var6.method688(new class65(var5), arg0 ^ 0xFFFFA6EF);
        }
        var6.method689(arg0 ^ 0xFFFFA6FE);
        if (var6.field980 != -1) {
            var6.method685(arg0 ^ 0x591E, this.method6(arg0, var6.field963), this.method6(22883, var6.field980));
        }
        if (var6.field991 != -1) {
            var6.method677(this.method6(22883, var6.field936), this.method6(22883, var6.field991), true);
        }
        if (!this.field21 && var6.field945) {
            var6.field929 = class470.field6944.method2031(true, this.field15);
            var6.field987 = 0;
            var6.field947 = this.field29;
            var6.field923 = null;
            var6.field925 = false;
            var6.field930 = this.field26;
            if (var6.field984 != null) {
                boolean var7 = false;
                for (class223 var8 = var6.field984.method880((byte) -23); var8 != null; var8 = var6.field984.method879((byte) -20)) {
                    class284 var9 = this.field27.method2740((byte) 100, (int) var8.field3271);
                    if (var9.field4126) {
                        var8.method1525((byte) -34);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field984 = null;
                }
            }
        }
        class156 var10 = this.field3;
        synchronized (this.field3) {
            this.field3.method1107(1, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZZ)V", line = 200)
    public final void method7(boolean arg0, boolean arg1) {
        field16++;
        if (this.field21 == arg0) {
            return;
        }
        this.field21 = arg0;
        this.method10((byte) -73);
        if (!arg1) {
            this.method10((byte) 69);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Llh;B)V", line = 217)
    public static final void method8(class364 arg0, byte arg1) {
        field11++;
        class307 var2 = (class307) class453.field6669.method875((long) arg0.field1716, 125);
        if (arg1 <= 24) {
            method12(27, -65, 92, 95, -84, (byte) 1);
        }
        if (var2 == null) {
            return;
        }
        if (var2.field4367 != null) {
            class273.field4030.method1242(var2.field4367);
            var2.field4367 = null;
        }
        var2.method1525((byte) 88);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)V", line = 243)
    public final void method9(int arg0, int arg1) {
        class156 var3 = this.field3;
        synchronized (this.field3) {
            this.field3.method1116(arg1, -50);
        }
        field19++;
        class156 var4 = this.field23;
        synchronized (this.field23) {
            this.field23.method1116(arg1, -50);
        }
        class118 var5 = this.field24;
        synchronized (this.field24) {
            this.field24.method935(122, arg1);
        }
        int var6 = -67 / ((arg0 + 33) / 53);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V", line = 267)
    public final void method10(byte arg0) {
        class156 var2 = this.field3;
        synchronized (this.field3) {
            this.field3.method1105(false);
        }
        if (arg0 != -73) {
            this.field26 = null;
        }
        field9++;
        class156 var3 = this.field23;
        synchronized (this.field23) {
            this.field23.method1105(false);
        }
        class118 var4 = this.field24;
        synchronized (this.field24) {
            this.field24.method936(true);
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V", line = 291)
    public static void method11(int arg0) {
        field5 = null;
        field17 = null;
        if (arg0 != 1) {
            method12(-97, -47, -51, 6, 58, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIB)V", line = 308)
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = 22 % ((arg5 - 67) / 35);
        if (class72.field992 <= arg1 && class126.field1842 >= arg3 && class471.field6963 <= arg4 && class401.field5947 >= arg0) {
            class402.method2473(arg1, arg0, arg2, (byte) 113, arg3, arg4);
        } else {
            class458.method2756(arg4, arg2, -81, arg3, arg1, arg0);
        }
        field10++;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)V", line = 324)
    public final void method13(byte arg0) {
        class156 var2 = this.field23;
        synchronized (this.field23) {
            if (arg0 >= -68) {
                return;
            }
            this.field23.method1105(false);
        }
        field20++;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V", line = 339)
    public static final void method14(int arg0) {
        if (class225.field3300.method364()) {
            class225.field3300.method325(class148.field2081);
            class520.method3090((byte) 56);
            class225.field3300.method304(class148.field2081);
            class225.field3300.method307(class148.field2081);
        } else {
            class88.method780(class65.field802, (byte) 117);
        }
        field2++;
        if (arg0 > -30) {
            field5 = null;
        }
        class448.method2716(-11712);
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(II)V", line = 363)
    public final void method15(int arg0, int arg1) {
        if (arg1 != 8) {
            return;
        }
        field22++;
        this.field28 = arg0;
        class156 var3 = this.field23;
        synchronized (this.field23) {
            this.field23.method1105(false);
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Ljk;IZLph;Lfs;Lfs;)V", line = 396)
    public class2(class446 arg0, int arg1, boolean arg2, class454 arg3, class387 arg4, class387 arg5) {
        this.field27 = arg3;
        this.field14 = arg5;
        this.field18 = arg4;
        this.field21 = arg2;
        this.field15 = arg1;
        if (this.field18 == null) {
            this.field13 = 0;
        } else {
            int var7 = this.field18.method2359((byte) 39) - 1;
            this.field13 = this.field18.method2367(var7, 28724) + var7 * 256;
        }
        this.field29 = new String[] { null, null, class138.field1972.method2031(true, this.field15), null, null };
        this.field26 = new String[] { null, null, null, null, class140.field1985.method2031(true, this.field15) };
    }
}
