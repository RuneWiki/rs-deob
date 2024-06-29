import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class21 extends class35 {

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[Lic;")
    public class21[] field430;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Z")
    public boolean field444;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Lab;")
    public static class279 field445 = new class279(4);

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "Lsl;")
    public static class39 field449 = new class39(32);

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "Ljava/lang/String;")
    public static String field450 = "Loaded update list";

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lkf;")
    public class163 field443;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Loi;")
    public class27 field441;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "[I")
    public static int[] field452;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)V", line = 6)
    public final void method169(int arg0, byte arg1, int arg2) {
        int var4 = 78 / ((21 - arg1) / 62);
        int var5 = this.field436 == 255 ? arg2 : this.field436;
        field433++;
        if (this.field444) {
            this.field443 = new class163(var5, arg2, arg0);
        } else {
            this.field441 = new class27(var5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V", line = 29)
    public static final void method170() {
        GL var0 = class249.field3898;
        var0.glDisableClientState(32886);
        class249.method1648(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class249.method1650();
        for (int var1 = 0; var1 < class61.field1180[0].length; var1++) {
            class16 var2 = class61.field1180[0][var1];
            if (var2.field290 >= 0 && class85.method598(class284.field4393.method398((byte) 79, var2.field290), -1)) {
                var0.glColor4fv(class255.method1712(-128, var2.field295), 0);
                float var3 = 201.5F - (var2.field313 ? 1.0F : 0.5F);
                var2.method115(class326.field4975, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class249.method1666();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class249.method1659();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)[I", line = 63)
    public final int[] method171(int arg0, int arg1, int arg2) {
        field432++;
        int var4 = 76 / ((arg1 + 8) / 33);
        return this.field430[arg0].field444 ? this.field430[arg0].method177(-46, arg2) : this.field430[arg0].method175(arg2, (byte) 111)[0];
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZI)V", line = 88)
    public static final void method172(int arg0, int arg1, boolean arg2, int arg3) {
        field438++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class303.field4596 = arg0;
        class150.field2451 = arg1;
        if (arg3 == -2603) {
            class119.field2071 = arg2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)[[I", line = 106)
    public final int[][] method173(int arg0, int arg1, byte arg2) {
        if (arg2 <= 51) {
            return (int[][]) ((int[][]) null);
        }
        field446++;
        if (!this.field430[arg0].field444) {
            return this.field430[arg0].method175(arg1, (byte) 59);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field430[arg0].method177(-56, arg1);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 144)
    public void method174(int arg0) {
        if (this.field444) {
            this.field443.method1041((byte) -102);
            this.field443 = null;
        } else {
            this.field441.method224((byte) -121);
            this.field441 = null;
        }
        if (arg0 < -75) {
            field439++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)[[I", line = 169)
    public int[][] method175(int arg0, byte arg1) {
        if (arg1 <= 16) {
            return (int[][]) ((int[][]) null);
        } else {
            field437++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)V", line = 180)
    public static final void method176(long arg0, int arg1) {
        field442++;
        class14.field263.field3249 = 0;
        class14.field263.method1311(arg1, arg1 + 10943);
        class14.field263.method1353((byte) -105, arg0);
        class53.field1075 = 1;
        class341.field5296 = 0;
        class196.field3157 = 0;
        class40.field775 = -3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I", line = 198)
    public int[] method177(int arg0, int arg1) {
        int var3 = 50 % ((arg0 - 33) / 36);
        field431++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILag;)V", line = 208)
    public void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            method176(44L, 80);
        }
        field448++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I", line = 222)
    public int method179(boolean arg0) {
        field429++;
        return arg0 ? -1 : 32;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 245)
    public static final Object method180(byte[] arg0, int arg1, boolean arg2) {
        field434++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < arg0.length && !class294.field4497) {
            try {
                class159 var3 = (class159) Class.forName("lk").getDeclaredConstructor().newInstance();
                var3.method1025(arg0, false);
                return var3;
            } catch (Throwable var5) {
                class294.field4497 = true;
            }
        }
        return arg2 ? class140.method911(arg1 ^ 0xF42C8, arg0) : arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 275)
    public static final void method181(String arg0, boolean arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field428++;
        System.exit(1);
        if (!arg1) {
            field445 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 288)
    public static void method182(int arg0) {
        if (arg0 != 23106) {
            method180((byte[]) null, 44, false);
        }
        field450 = null;
        field445 = null;
        field452 = null;
        field449 = null;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IZ)V", line = 299)
    public class21(int arg0, boolean arg1) {
        this.field430 = new class21[arg0];
        this.field444 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V", line = 313)
    public void method183(byte arg0) {
        if (arg0 >= 82) {
            field440++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)I", line = 325)
    public int method184(byte arg0) {
        if (arg0 != 25) {
            field445 = (class279) null;
        }
        field435++;
        return -1;
    }
}
