import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class135 extends class59 {

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "Lph;")
    private static class229 field2189 = class266.method1858("Cancel", 0);

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "[I")
    public static int[] field2190 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "[I")
    public static int[] field2191 = new int[32];

    @OriginalMember(owner = "client!fn", name = "S", descriptor = "Lph;")
    public static class229 field2198 = class266.method1858("S-Blectionner", 0);

    @OriginalMember(owner = "client!fn", name = "O", descriptor = "[Lph;")
    public static class229[] field2194 = new class229[1000];

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "Lph;")
    public static class229 field2188 = field2189;

    @OriginalMember(owner = "client!fn", name = "M", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!fn", name = "N", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!fn", name = "T", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "[Lcl;")
    public static class32[] field2200;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIB[I[I)V", line = 6)
    public static final void method954(int arg0, int arg1, byte arg2, int[] arg3, int[] arg4) {
        field2193++;
        if (arg0 > arg1) {
            int var5 = (arg1 + arg0) / 2;
            int var6 = arg1;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (arg4[var9] > var7 + (var9 & 0x1)) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method954(var6 - 1, arg1, (byte) 67, arg3, arg4);
            method954(arg0, var6 + 1, (byte) 33, arg3, arg4);
        }
        if (arg2 <= 7) {
            field2191 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V", line = 66)
    public static void method955(byte arg0) {
        field2194 = null;
        field2189 = null;
        field2188 = null;
        field2200 = null;
        if (arg0 > -114) {
            field2189 = (class229) null;
        }
        field2191 = null;
        field2198 = null;
        field2190 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)I", line = 87)
    private final int method956(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -53;
        } else {
            int var4 = arg2 * 57 + arg0;
            field2195++;
            int var5 = var4 << 1 ^ var4;
            return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(III)Lge;", line = 102)
    public static final class281 method957(int arg0, int arg1, int arg2) {
        field2197++;
        class281 var3 = (class281) class177.field2918.method713(3365, (long) arg2 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class281(arg2, arg1);
            class177.field2918.method710(var3, (byte) 111, var3.field1325);
        }
        if (arg0 != 0) {
            field2191 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILph;B)V", line = 130)
    public static final void method958(int arg0, class229 arg1, byte arg2) {
        field2199++;
        class229 var3 = arg1.method1607((byte) -122).method1628(-32);
        boolean var4 = false;
        int var5 = 0;
        if (arg2 > -57) {
            field2189 = (class229) null;
        }
        while (var5 < class139.field2248) {
            class209 var6 = class114.field1931[class166.field2708[var5]];
            if (var6 != null && var6.field3463 != null && var6.field3463.method1630(10, var3)) {
                class226.method1568(1, class230.field3820.field5159[0], var6.field5159[0], class230.field3820.field5104[0], 1, var6.field5104[0], 0, -24320, 0, 2, false, 0);
                var4 = true;
                if (arg0 == 1) {
                    class44.field676++;
                    class121.field2033.method37(76, 59);
                    class121.field2033.method1180(102, class166.field2708[var5]);
                } else if (arg0 == 4) {
                    class121.field2033.method37(107, 184);
                    class257.field4301++;
                    class121.field2033.method1180(124, class166.field2708[var5]);
                } else if (arg0 == 5) {
                    class121.field2033.method37(100, 93);
                    class93.field1574++;
                    class121.field2033.method1160(class166.field2708[var5], -1247507120);
                } else if (arg0 == 6) {
                    class317.field5377++;
                    class121.field2033.method37(33, 135);
                    class121.field2033.method1170(false, class166.field2708[var5]);
                } else if (arg0 == 7) {
                    class121.field2033.method37(119, 119);
                    class22.field294++;
                    class121.field2033.method1155(-1640531527, class166.field2708[var5]);
                }
                break;
            }
            var5++;
        }
        if (!var4) {
            class205.method1439(class248.method1746(8528, new class229[] { class313.field5271, var3 }), true, 0, class134.field2172);
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)V", line = 219)
    public static final void method959(byte arg0) {
        field2192++;
        if (!class8.field103) {
            return;
        }
        class301 var1 = class167.method1224(class165.field2701, 121, class45.field689);
        if (arg0 < 105) {
            return;
        }
        if (var1 != null && var1.field4984 != null) {
            class157 var2 = new class157();
            var2.field2552 = var1.field4984;
            var2.field2551 = var1;
            class177.method1275(var2, -110);
        }
        class8.field103 = false;
        class296.method2006(var1, 125);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 244)
    public class135() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)[I", line = 250)
    public final int[] method63(boolean arg0, int arg1) {
        field2196++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (!arg0) {
            field2200 = (class32[]) null;
        }
        if (this.field846.field811) {
            int var4 = class269.field4504[arg1];
            for (int var5 = 0; var5 < class293.field4789; var5++) {
                var3[var5] = this.method956(class219.field3608[var5], !arg0, var4) % 4096;
            }
        }
        return var3;
    }
}
