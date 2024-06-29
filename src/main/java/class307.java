import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class307 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lpca;")
    private class714 field4289 = new class714(64);

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lfp;")
    public class323 field4296;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lfp;")
    private class323 field4290;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    public static int[] field4297 = new int[2];

    @OriginalMember(owner = "client!le", name = "i", descriptor = "F")
    public static float field4294;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)Lkb;")
    public final class689 method2002(int arg0, byte arg1) {
        field4287++;
        class714 var3 = this.field4289;
        class689 var4;
        synchronized (this.field4289) {
            var4 = (class689) this.field4289.method4022((long) arg0, (byte) 119);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field4290;
        byte[] var6;
        synchronized (this.field4290) {
            var6 = this.field4290.method2100(arg0, (byte) 112, 3);
        }
        class689 var7 = new class689();
        var7.field9406 = this;
        if (var6 != null) {
            var7.method3848(new class675(var6), (byte) -36);
        }
        class714 var8 = this.field4289;
        synchronized (this.field4289) {
            this.field4289.method4018((byte) 124, var7, (long) arg0);
        }
        if (arg1 >= -3) {
            this.method2009((byte) -122, -92);
        }
        return var7;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public final void method2003(boolean arg0) {
        field4292++;
        if (arg0) {
            class714 var2 = this.field4289;
            synchronized (this.field4289) {
                this.field4289.method4023((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method2004(int arg0) {
        field4297 = null;
        if (arg0 > -9) {
            method2008(31, 13, -62);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIBIII)V")
    public static final void method2005(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4288++;
        int var6 = -65 % ((47 - arg2) / 51);
        long var7 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
        class95 var9 = (class95) class77.field1002.method1180((byte) 26, var7);
        if (var9 == null) {
            var9 = new class95();
            class77.field1002.method1179(var7, var9, (byte) -26);
        }
        if (arg4 >= var9.field1107.length) {
            int[] var10 = new int[arg4 + 1];
            int[] var11 = new int[arg4 + 1];
            for (int var12 = 0; var12 < var9.field1107.length; var12++) {
                var10[var12] = var9.field1107[var12];
                var11[var12] = var9.field1113[var12];
            }
            for (int var13 = var9.field1107.length; var13 < arg4; var13++) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var9.field1113 = var11;
            var9.field1107 = var10;
        }
        var9.field1107[arg4] = arg5;
        var9.field1113[arg4] = arg3;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public final void method2006(int arg0) {
        field4295++;
        class714 var2 = this.field4289;
        synchronized (this.field4289) {
            if (arg0 != 1) {
                this.field4289 = null;
            }
            this.field4289.method4024(0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILag;)V")
    public static final void method2007(int arg0, class682 arg1) {
        field4286++;
        arg1.method3831(7);
        int var2 = 0;
        for (int var3 = 0; var3 < class578.field8168; var3++) {
            int var15 = class240.field3201[var3];
            if ((class155.field2173[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class155.field2173[var15] = (byte) class325.method2116(class155.field2173[var15], 2);
                } else {
                    int var16 = arg1.method3821(1, (byte) 108);
                    if (var16 == 0) {
                        var2 = class529.method3079((byte) -5, arg1);
                        class155.field2173[var15] = (byte) class325.method2116(class155.field2173[var15], 2);
                    } else {
                        class473.method2830(arg1, false, var15);
                    }
                }
            }
        }
        arg1.method3827((byte) 116);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method3831(7);
        for (int var4 = 0; var4 < class578.field8168; var4++) {
            int var13 = class240.field3201[var4];
            if ((class155.field2173[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class155.field2173[var13] = (byte) class325.method2116(class155.field2173[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method3821(1, (byte) 108);
                    if (var14 == 0) {
                        var2 = class529.method3079((byte) -5, arg1);
                        class155.field2173[var13] = (byte) class325.method2116(class155.field2173[var13], 2);
                    } else {
                        class473.method2830(arg1, false, var13);
                    }
                }
            }
        }
        arg1.method3827((byte) 127);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method3831(7);
        for (int var5 = 0; var5 < class588.field8290; var5++) {
            int var11 = class179.field2402[var5];
            if ((class155.field2173[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class155.field2173[var11] = (byte) class325.method2116(class155.field2173[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method3821(1, (byte) 108);
                    if (var12 == 0) {
                        var2 = class529.method3079((byte) -5, arg1);
                        class155.field2173[var11] = (byte) class325.method2116(class155.field2173[var11], 2);
                    } else if (class96.method707(var11, arg1, 0)) {
                        class155.field2173[var11] = (byte) class325.method2116(class155.field2173[var11], 2);
                    }
                }
            }
        }
        arg1.method3827((byte) 115);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method3831(7);
        for (int var6 = 0; var6 < class588.field8290; var6++) {
            int var9 = class179.field2402[var6];
            if ((class155.field2173[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class155.field2173[var9] = (byte) class325.method2116(class155.field2173[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method3821(1, (byte) 108);
                    if (var10 == 0) {
                        var2 = class529.method3079((byte) -5, arg1);
                        class155.field2173[var9] = (byte) class325.method2116(class155.field2173[var9], 2);
                    } else if (class96.method707(var9, arg1, 0)) {
                        class155.field2173[var9] = (byte) class325.method2116(class155.field2173[var9], 2);
                    }
                }
            }
        }
        arg1.method3827((byte) 109);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class578.field8168 = 0;
        class588.field8290 = 0;
        if (arg0 != -4023) {
            method2010(-38, -5);
        }
        for (int var7 = 1; var7 < 2048; var7++) {
            class155.field2173[var7] = (byte) (class155.field2173[var7] >> 1);
            class280 var8 = class309.field4311[var7];
            if (var8 == null) {
                class179.field2402[class588.field8290++] = var7;
            } else {
                class240.field3201[class578.field8168++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Lwq;")
    public static final class165 method2008(int arg0, int arg1, int arg2) {
        if (class553.field7776[arg0][arg1][arg2] == null) {
            boolean var3 = class553.field7776[0][arg1][arg2] != null && class553.field7776[0][arg1][arg2].field2272 != null;
            if (var3 && arg0 >= class634.field8744 - 1) {
                return null;
            }
            class745.method4149(arg0, arg1, arg2);
        }
        return class553.field7776[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V")
    public final void method2009(byte arg0, int arg1) {
        if (arg0 != 48) {
            this.method2009((byte) -70, -3);
        }
        field4291++;
        class714 var3 = this.field4289;
        synchronized (this.field4289) {
            this.field4289.method4016(arg1, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
    public static final boolean method2010(int arg0, int arg1) {
        if (arg1 != -8714) {
            field4297 = null;
        }
        field4293++;
        return arg0 == 7 || arg0 == 8 || arg0 == 9;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lsaa;ILfp;Lfp;)V")
    public class307(class326 arg0, int arg1, class323 arg2, class323 arg3) {
        this.field4296 = arg3;
        this.field4290 = arg2;
        this.field4290.method2084(3, 0);
    }
}
