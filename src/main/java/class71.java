import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class71 {

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lmb;")
    public static class96 field1218 = class243.method1708("::fpsoff", (byte) 104);

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lmb;")
    public static class96 field1219 = class243.method1708("Speicher wird zugewiesen)3", (byte) 109);

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Lmb;")
    private static class96 field1221 = class243.method1708("Started 3d Library", (byte) 102);

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lmb;")
    public static class96 field1217 = field1221;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field1223 = 0;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Li;")
    public static class18 field1216;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZLpk;IIZ)V")
    public static final void method481(int arg0, boolean arg1, class67 arg2, int arg3, int arg4, boolean arg5) {
        field1222++;
        if (class58.field1012 >= 50 || arg2.field1146 == null || arg4 >= arg2.field1146.length || arg2.field1146[arg4] == null) {
            return;
        }
        int var6 = arg2.field1146[arg4][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0x77) >> 4;
        if (arg2.field1146[arg4].length > 1) {
            int var9 = (int) (Math.random() * (double) arg2.field1146[arg4].length);
            if (var9 > 0) {
                var7 = arg2.field1146[arg4][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (!arg1) {
            method486(19, false);
        }
        if (var10 == 0) {
            if (arg5) {
                class17.method113(0, var7, 25373, var8);
            }
        } else if (class5.field100 != 0) {
            int var11 = (arg3 - 64) / 128;
            class134.field2402[class58.field1012] = var7;
            class43.field741[class58.field1012] = var8;
            int var12 = (arg0 - 64) / 128;
            class138.field2479[class58.field1012] = 0;
            class154.field2711[class58.field1012] = null;
            class250.field4331[class58.field1012] = (var11 << 16) - (-(var12 << 8) - var10);
            class58.field1012++;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method482(int arg0) {
        field1216 = null;
        field1219 = null;
        field1217 = null;
        field1218 = null;
        field1221 = null;
        if (arg0 != 16589) {
            field1221 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static final void method483(int arg0) {
        field1225++;
        if (!class124.field2301) {
            return;
        }
        if (arg0 != -64) {
            method483(126);
        }
        class107 var1 = class1.method7(class133.field2382, class48.field851, -92);
        if (var1 != null && var1.field1857 != null) {
            class116 var2 = new class116();
            var2.field2155 = var1.field1857;
            var2.field2158 = var1;
            class141.method1044(var2, (byte) 76);
        }
        class124.field2301 = false;
        class53.method403(-74, var1);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)Llj;")
    public static final class226 method484(int arg0, boolean arg1) {
        class226 var2 = (class226) class57.field1004.method158((long) arg0, (byte) -36);
        field1220++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class212.field3660.method23(0, 103, arg0);
        if (var3 == null) {
            return null;
        }
        class226 var4 = new class226();
        class239 var5 = new class239(var3);
        if (arg1) {
            method481(-44, true, (class67) null, -5, -124, true);
        }
        var5.field4124 = var5.field4144.length - 2;
        int var6 = var5.method1663((byte) -96);
        int var7 = var5.field4144.length - var6 - 2 - 12;
        var5.field4124 = var7;
        int var8 = var5.method1617((byte) -43);
        var4.field3843 = var5.method1663((byte) -61);
        var4.field3842 = var5.method1663((byte) 120);
        var4.field3848 = var5.method1663((byte) -80);
        var4.field3844 = var5.method1663((byte) 99);
        int var9 = var5.method1651(4139);
        if (var9 > 0) {
            var4.field3858 = new class146[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1663((byte) -63);
                class146 var12 = new class146(class82.method578(0, var11));
                var4.field3858[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1617((byte) -43);
                    int var14 = var5.method1617((byte) -43);
                    var12.method1085(-1, new class46(var14), (long) var13);
                }
            }
        }
        var5.field4124 = 0;
        int var15 = 0;
        var4.field3853 = var5.method1649((byte) -115);
        var4.field3854 = new int[var8];
        var4.field3835 = new int[var8];
        var4.field3838 = new class96[var8];
        while (var5.field4124 < var7) {
            int var16 = var5.method1663((byte) 85);
            if (var16 == 3) {
                var4.field3838[var15] = var5.method1634(-68);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3835[var15] = var5.method1651(4139);
            } else {
                var4.field3835[var15] = var5.method1617((byte) -43);
            }
            var4.field3854[var15++] = var16;
        }
        class57.field1004.method155((long) arg0, var4, (byte) 93);
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method485(int arg0, Component arg1) {
        int var2 = -128 % ((77 - arg0) / 48);
        arg1.addMouseListener(class194.field3345);
        field1215++;
        arg1.addMouseMotionListener(class194.field3345);
        arg1.addFocusListener(class194.field3345);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IZ)Lri;")
    public static final class36 method486(int arg0, boolean arg1) {
        field1224++;
        if (class31.field488 && arg0 >= class259.field4477 && class52.field908 >= arg0) {
            return arg1 ? class83.field1414[arg0 - class259.field4477] : null;
        } else {
            return null;
        }
    }
}
