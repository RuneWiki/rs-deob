import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class221 extends class29 {

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "Lph;")
    private class229 field3632 = class230.field3826;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Lph;")
    public static class229 field3635 = class266.method1858("Spielwelt erstellt)3", 0);

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "Lph;")
    public static class229 field3636 = class266.method1858("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 0);

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "Lph;")
    private static class229 field3629 = class266.method1858("Loaded world list data", 0);

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "[F")
    public static float[] field3631 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Lph;")
    public static class229 field3634 = field3629;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    private int field3648;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lsi;")
    public static class66 field3637;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "Lfe;")
    public class97 field3630;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "Lfe;")
    private class97 field3645;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "[Lka;")
    public static class293[] field3625;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "[Lpe;")
    public static class77[] field3626;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIII)V", line = 11)
    public static final void method1538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3623++;
        int var9 = arg3 - arg8;
        int var10 = arg4 - arg0;
        if (arg5 > -6) {
            method1538(109, -123, 56, 3, 127, -99, 23, -32, 67);
        }
        int var11 = (arg6 - arg1 << 16) / var9;
        int var12 = (arg2 - arg7 << 16) / var10;
        class167.method1228(arg3, 0, var12, (byte) -66, arg4, arg0, var11, arg1, 0, arg8, arg7);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 47)
    private final void method1539(byte arg0) {
        this.field3645 = new class97(this.field3630.method719(0));
        for (class302 var2 = (class302) this.field3630.method711(0); var2 != null; var2 = (class302) this.field3630.method718(27263)) {
            class316 var3 = new class316(var2.field5052, (int) var2.field1325);
            this.field3645.method710(var3, (byte) 108, var2.field5052.method1601(255));
        }
        int var4 = -38 % ((28 - arg0) / 35);
        field3640++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lph;", line = 72)
    public final class229 method1540(int arg0, int arg1) {
        if (arg0 < 12) {
            return (class229) null;
        }
        field3641++;
        if (this.field3630 == null) {
            return this.field3632;
        } else {
            class302 var3 = (class302) this.field3630.method713(3365, (long) arg1);
            return var3 == null ? this.field3632 : var3.field5052;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lph;B)Z", line = 91)
    public final boolean method1541(class229 arg0, byte arg1) {
        if (arg1 != 59) {
            this.method1547((byte) 66, 28);
        }
        field3622++;
        if (this.field3630 == null) {
            return false;
        }
        if (this.field3645 == null) {
            this.method1539((byte) -85);
        }
        for (class316 var3 = (class316) this.field3645.method713(3365, arg0.method1601(255)); var3 != null; var3 = (class316) this.field3645.method717(29388)) {
            if (var3.field5367.method1618(false, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)V", line = 124)
    public static void method1542(int arg0) {
        field3626 = null;
        field3631 = null;
        field3637 = null;
        field3634 = null;
        field3635 = null;
        field3636 = null;
        if (arg0 != -26113) {
            method1546((byte) -35);
        }
        field3629 = null;
        field3625 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILhb;Z)V", line = 142)
    private final void method1543(int arg0, class164 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field3642 = arg1.method1178(8);
        } else if (arg0 == 2) {
            this.field3646 = arg1.method1178(8);
        } else if (arg0 == 3) {
            this.field3632 = arg1.method1190(0);
        } else if (arg0 == 4) {
            this.field3648 = arg1.method1191(31776);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1161(true);
            this.field3630 = new class97(class303.method2049(var4, 2539));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1191(31776);
                class80 var7;
                if (arg0 == 5) {
                    var7 = new class302(arg1.method1190(0));
                } else {
                    var7 = new class295(arg1.method1191(31776));
                }
                this.field3630.method710(var7, (byte) 127, (long) var6);
            }
        }
        if (arg2) {
            this.method1547((byte) -109, 123);
        }
        field3638++;
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V", line = 195)
    private final void method1544(int arg0) {
        field3647++;
        this.field3645 = new class97(this.field3630.method719(0));
        for (class295 var2 = (class295) this.field3630.method711(0); var2 != null; var2 = (class295) this.field3630.method718(27263)) {
            class295 var3 = new class295((int) var2.field1325);
            this.field3645.method710(var3, (byte) 105, (long) var2.field4829);
        }
        if (arg0 != 64) {
            this.field3632 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lhb;I)V", line = 221)
    public final void method1545(class164 arg0, int arg1) {
        if (arg1 > -64) {
            return;
        }
        while (true) {
            int var3 = arg0.method1178(8);
            if (var3 == 0) {
                field3643++;
                return;
            }
            this.method1543(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V", line = 242)
    public static final void method1546(byte arg0) {
        field3639++;
        class27.field408.method278(-22393);
        if (arg0 >= -124) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class203.field3343[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class24.field313[var2] = 0L;
        }
        class167.field2732 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)I", line = 270)
    public final int method1547(byte arg0, int arg1) {
        field3644++;
        if (this.field3630 == null) {
            return this.field3648;
        }
        class295 var3 = (class295) this.field3630.method713(3365, (long) arg1);
        if (arg0 != 107) {
            this.field3632 = (class229) null;
        }
        return var3 == null ? this.field3648 : var3.field4829;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IZ)V", line = 292)
    public static final void method1548(int arg0, boolean arg1) {
        field3627++;
        if (arg0 != 18933) {
            field3635 = (class229) null;
        }
        byte[][] var2;
        byte var3;
        if (class99.field1675 && arg1) {
            var2 = class277.field4608;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class178.field2932;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class287.field4723[var5] & 0xFF) * 64 - class1.field1;
            int var7 = (class287.field4723[var5] >> 8) * 64 - class1.field9;
            byte[] var8 = var2[var5];
            if (var8 != null) {
                class53.method364(14874);
                class289.method1978(class95.field1611 * 8 - 48, class122.field2054 * 8 + -48, var6, arg1, var7, class160.field2592, (byte) -42, var8);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class287.field4723[var9] & 0xFF) * 64 - class1.field1;
            byte[] var11 = var2[var9];
            int var12 = (class287.field4723[var9] >> 8) * 64 - class1.field9;
            if (var11 == null && class95.field1611 < 800) {
                class53.method364(14874);
                for (int var13 = 0; var13 < var3; var13++) {
                    class44.method330((byte) -100, var13, var12, var10, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Z", line = 364)
    public final boolean method1549(int arg0, int arg1) {
        field3633++;
        if (this.field3630 == null) {
            return false;
        }
        if (this.field3645 == null) {
            this.method1544(64);
        }
        class295 var3 = (class295) this.field3645.method713(3365, (long) arg1);
        if (arg0 != -30534) {
            this.method1544(14);
        }
        return var3 != null;
    }
}
