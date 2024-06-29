import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class653 extends class377 {

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    private int field9244 = -1;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    private int field9242 = -1;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public int field9240;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lin;")
    public static class380 field9245 = new class380(10, 0);

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Lfe;")
    public static class345 field9247 = new class345();

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field9249 = 0;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V")
    public static void method3673(byte arg0) {
        field9245 = null;
        if (arg0 >= 5) {
            field9247 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method3674(class475 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class29.field307 = arg0;
        class44.field585 = arg1;
        class494.field6789 = class44.field585 > 1 && class29.field307.method424();
        class679.field9600 = arg2;
        class253.field3624 = 1 << class679.field9600;
        class358.field5076 = class253.field3624 >> 1;
        Math.sqrt((double) (class358.field5076 * class358.field5076 + class358.field5076 * class358.field5076));
        class169.field2565 = arg3;
        class42.field520 = arg4;
        class681.field9665 = arg5;
        class162.field2499 = arg6;
        class205.field3010 = class766.method4238(120);
        class600.method3495((byte) -58);
        class723.field10084 = new class172[arg3][class42.field520][class681.field9665];
        class495.field6799 = new class419[arg3];
        if (arg7) {
            class510.field7018 = new int[class42.field520][class681.field9665];
            class97.field1386 = new byte[class42.field520][class681.field9665];
            class722.field10080 = new short[class42.field520][class681.field9665];
            class410.field5618 = new class172[1][class42.field520][class681.field9665];
            class454.field6207 = new class419[1];
        } else {
            class510.field7018 = null;
            class97.field1386 = null;
            class722.field10080 = null;
            class410.field5618 = null;
            class454.field6207 = null;
        }
        if (arg8) {
            class293.field4281 = new long[arg3][arg4][arg5];
            class208.field3032 = new class284[65535];
            class724.field10089 = new boolean[65535];
            class774.field10661 = 0;
        } else {
            class293.field4281 = null;
            class208.field3032 = null;
            class724.field10089 = null;
            class774.field10661 = 0;
        }
        class368.method2202(false);
        class5.field74 = new class745[2];
        class277.field3997 = new class745[2];
        class407.field5602 = new class745[2];
        class269.field3800 = new class745[10000];
        class761.field10539 = 0;
        class477.field6498 = new class745[5000];
        class502.field6879 = 0;
        class316.field4516 = new class208[5000];
        class401.field5525 = 0;
        class737.field10233 = new boolean[class162.field2499 + class162.field2499 + 1][class162.field2499 + class162.field2499 + 1];
        client.field1581 = new boolean[class162.field2499 + class162.field2499 + 2][class162.field2499 + class162.field2499 + 2];
        class789.field10793 = new int[class162.field2499 + class162.field2499 + 2];
        class316.field4495 = class316.field4508;
        if (class494.field6789) {
            class542.field7502 = new boolean[arg3][class162.field2499 + class162.field2499 + 1][class162.field2499 + class162.field2499 + 1];
            class568.field7902 = new boolean[arg3][][];
            if (class495.field6792 != null) {
                class577.method3400();
            }
            class495.field6792 = new class718[class44.field585];
            class29.field307.method499(class495.field6792.length + 1);
            class29.field307.method430(0);
            for (int var9 = 0; var9 < class495.field6792.length; ++var9) {
                class495.field6792[var9] = new class718(var9 + 1, class29.field307);
                (new Thread(class495.field6792[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class44.field585 == 2) {
                var10 = 4;
                class402.field5541 = 2;
            } else if (class44.field585 == 3) {
                var10 = 6;
                class402.field5541 = 3;
            } else {
                var10 = 8;
                class402.field5541 = 4;
            }
            class604.field8584 = new class544[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class604.field8584[var11] = new class544(class338.field4799[class44.field585 - 2][var11]);
            }
        } else {
            class402.field5541 = 1;
        }
        class456.field6222 = new int[class402.field5541 - 1];
        class134.field2239 = new int[class402.field5541 - 1];
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public final void method1359(int arg0) {
        if (arg0 != 3314) {
            field9245 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(this.field9244, this.field9242, 3553, 0, 0);
        ++field9243;
        this.field9242 = -1;
        this.field9244 = -1;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Llea;IIZ[[BI)V")
    public class653(class573 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field9240 = arg2;
        super.field5288.method3384(this, (byte) 82);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field5289, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2266(102, true);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILm;IIIIIIIILha;I)V")
    public static final void method3675(int arg0, class554 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class475 arg10, int arg11) {
        if (arg8 < arg3 && arg3 < arg7 + arg8 && arg5 + -13 < arg2 && arg5 - -3 > arg2 && arg1.field7695) {
            arg6 = arg0;
        }
        ++field9241;
        int[] var12 = null;
        if (!class662.method3711(25, arg1.field7682)) {
            if (arg1.field7683 != -1) {
                var12 = class422.field5873.method2937((byte) -42, arg1.field7683).field548;
            } else if (!class61.method628(-126, arg1.field7682)) {
                if (class506.method2959(arg1.field7682, (byte) -119)) {
                    Object var13 = null;
                    class416 var14;
                    if (arg1.field7682 != 1006) {
                        var14 = class312.field4418.method369((byte) 126, (int) (arg1.field7693 >>> 32 & 2147483647L));
                    } else {
                        var14 = class312.field4418.method369((byte) 125, (int) arg1.field7693);
                    }
                    if (var14.field5736 != null) {
                        var14 = var14.method2458(class578.field8328, -1);
                    }
                    if (var14 != null) {
                        var12 = var14.field5702;
                    }
                }
            } else {
                class647 var15 = (class647) class486.field6697.method4253((long) ((int) arg1.field7693), -1);
                if (var15 != null) {
                    class506 var16 = var15.field9191;
                    class179 var17 = var16.field6964;
                    if (var17.field2683 != null) {
                        var17 = var17.method1304(class578.field8328, -25917);
                    }
                    if (var17 != null) {
                        var12 = var17.field2704;
                    }
                }
            }
        } else {
            var12 = class422.field5873.method2937((byte) -101, (int) arg1.field7693).field548;
        }
        String var18 = class121.method1062((byte) 63, arg1);
        int var19 = 89 % ((-44 - arg4) / 43);
        if (var12 != null) {
            var18 = var18 + class722.method4012(var12, 0);
        }
        class670.field9398.method2622(var18, class91.field1312, class312.field4420, arg5, (byte) 119, 0, arg8 + 3, arg6);
        if (arg1.field7686) {
            class315.field4468.method759(arg8 - -5 + class675.field9477.method2748(var18, 8364), arg5 + -12);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Llea;IIZ[[I)V")
    public class653(class573 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field9240 = arg2;
        super.field5288.method3384(this, (byte) 92);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class296.method1865(var6 + 34069, (byte) -29, arg2, arg2, super.field5288.field8234, 32993, super.field5289, arg4[var6]);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field5289, arg2, arg2, 0, 32993, super.field5288.field8234, arg4[var7], 0);
            }
        }
        this.method2266(19, true);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Llea;II)V")
    public class653(class573 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field9240 = arg2;
        super.field5288.method3384(this, (byte) 54);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field5289, arg2, arg2, 0, class137.method1128(super.field5289, -118), 5121, (byte[]) null, 0);
        }
        this.method2266(75, true);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V")
    public final void method3676(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg4, arg0, arg2, super.field5284, arg3);
        if (arg1 <= 86) {
            method3673((byte) -123);
        }
        ++field9246;
        this.field9244 = arg4;
        this.field9242 = arg0;
    }
}
