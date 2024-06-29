import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class243 extends class144 {

    @OriginalMember(owner = "client!wm", name = "hb", descriptor = "Z")
    public static boolean field3642 = false;

    @OriginalMember(owner = "client!wm", name = "fb", descriptor = "[I")
    public static int[] field3640 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!wm", name = "Z", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!wm", name = "ab", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!wm", name = "bb", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!wm", name = "cb", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!wm", name = "db", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!wm", name = "eb", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!wm", name = "gb", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!wm", name = "ib", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!wm", name = "jb", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!wm", name = "kb", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!wm", name = "lb", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!wm", name = "mb", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIBI)I", line = 5)
    public static final int method1645(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3638++;
        if (arg3 == -118) {
            int var5 = arg1 & 0xF;
            int var6 = var5 >= 8 ? arg2 : arg0;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg4) : arg2;
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[S)[S", line = 27)
    public static final short[] method1646(int arg0, short[] arg1) {
        if (arg0 != 7) {
            return (short[]) null;
        }
        field3643++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class85.method591(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "(I)V", line = 46)
    public static void method1647(int arg0) {
        field3640 = null;
        if (arg0 != 0) {
            field3641 = 39;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 58)
    public static final void method1648() {
        GL var0 = class117.field1801;
        var0.glDisableClientState(32886);
        class117.method830(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class117.method831();
        for (int var1 = 0; var1 < class209.field3152[0].length; var1++) {
            class86 var2 = class209.field3152[0][var1];
            if (var2.field1281 >= 0 && class148.field2233.method744(255, var2.field1281) == 4) {
                var0.glColor4fv(class12.method67(-1790, var2.field1261), 0);
                float var3 = 201.5F - (var2.field1270 ? 1.0F : 0.5F);
                var2.method601(class158.field2367, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class117.method808();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class117.method829();
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)[[I", line = 94)
    public final int[][] method445(int arg0, boolean arg1) {
        int[][] var3 = this.field1701.method1477((byte) 40, arg0);
        if (this.field1701.field3255 && this.method1029(22050)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = arg0 % this.field2173 * this.field2173;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class124.field1936; var8++) {
                int var9 = this.field2169[var8 % this.field2171 + var6];
                var7[var8] = class124.method893(4080, var9 << 4);
                var4[var8] = class124.method893(4080, var9 >> 4);
                var5[var8] = class124.method893(var9, 16711680) >> 12;
            }
        }
        field3647++;
        if (arg1) {
            field3640 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "(I)V", line = 140)
    public static final void method1649(int arg0) {
        field3639++;
        int var1 = class130.method965((byte) 120);
        if (arg0 != -4) {
            return;
        }
        if (var1 == 0) {
            class81.field1136 = (byte[][][]) null;
            class327.method2227(true, 0);
        } else if (var1 == 1) {
            class180.method1251(-115, (byte) 0);
            class327.method2227(true, 512);
            class295.method2057(18254);
        } else {
            class180.method1251(-108, (byte) (class207.field3135 - 4 & 0xFF));
            class327.method2227(true, 2);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)I", line = 172)
    public static final int method1650(int arg0, byte arg1) {
        if (class168.field2517 != null) {
            class168.field2517.method1138(-16726864);
            class168.field2517 = null;
        }
        class188.field2797++;
        field3646++;
        if (class188.field2797 > 4) {
            class188.field2797 = 0;
            class202.field3016 = 0;
            return arg0;
        }
        if (class178.field2636 == class110.field1697) {
            class178.field2636 = class76.field994;
        } else {
            class178.field2636 = class110.field1697;
        }
        class202.field3016 = 0;
        if (arg1 != 104) {
            field3642 = false;
        }
        return -1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZII)V", line = 212)
    public static final void method1651(boolean arg0, int arg1, int arg2) {
        field3637++;
        class204.field3070 = class111.field1719 - (1 - class296.field4533) - arg2;
        class154.field2321 = arg1 - class292.field4439;
        int var3 = class154.field2321 - ((int) ((float) class94.field1430.field5018 / class75.field980));
        int var4 = (int) ((float) class94.field1430.field5018 / class75.field980) + class154.field2321;
        if (!arg0) {
            method1649(-33);
        }
        if (var3 < 0) {
            class154.field2321 = (int) ((float) class94.field1430.field5018 / class75.field980);
        }
        int var5 = (int) ((float) class94.field1430.field4994 / class75.field980) + class204.field3070;
        int var6 = class204.field3070 - (int) ((float) class94.field1430.field4994 / class75.field980);
        if (var6 < 0) {
            class204.field3070 = (int) ((float) class94.field1430.field4994 / class75.field980);
        }
        if (var5 > class111.field1719) {
            class204.field3070 = class111.field1719 - ((int) ((float) class94.field1430.field4994 / class75.field980));
        }
        if (class41.field497 < var4) {
            class154.field2321 = class41.field497 - ((int) ((float) class94.field1430.field5018 / class75.field980));
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lre;Z)V", line = 258)
    public static final void method1652(class263 arg0, boolean arg1) {
        field3635++;
        int var2 = arg0.method1832(-32768);
        class226.field3437 = new class146[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class226.field3437[var3] = new class146();
            class226.field3437[var3].field2208 = arg0.method1832(-32768);
            class226.field3437[var3].field2203 = arg0.method1803(0);
        }
        class169.field2528 = arg0.method1832(-32768);
        class131.field2024 = arg0.method1832(-32768);
        class61.field813 = arg0.method1832(-32768);
        class74.field962 = new class178[class131.field2024 + 1 - class169.field2528];
        if (arg1) {
            return;
        }
        for (int var4 = 0; var4 < class61.field813; var4++) {
            int var5 = arg0.method1832(-32768);
            class178 var6 = class74.field962[var5] = new class178();
            var6.field170 = arg0.method1787(false);
            var6.field164 = arg0.method1826(-206227536);
            var6.field2643 = class169.field2528 + var5;
            var6.field2635 = arg0.method1803(0);
            var6.field2639 = arg0.method1803(0);
        }
        class44.field539 = arg0.method1826(-206227536);
        class75.field977 = true;
    }
}
