import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class12 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field184 = 100;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field190 = 0;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Z")
    public static boolean field181 = false;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[Lol;")
    public static class188[] field191 = new class188[6];

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Ltb;")
    public static class220 field194;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[I")
    public static int[] field185;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BZ)V", line = 5)
    public static final void method89(byte arg0, boolean arg1) {
        field187++;
        if (arg0 >= -75) {
            field194 = (class220) null;
        }
        for (class239 var2 = (class239) class304.field4739.method636(-1); var2 != null; var2 = (class239) class304.field4739.method638(91)) {
            if (var2.field3806 != null) {
                class98.field1560.method1864(var2.field3806);
                var2.field3806 = null;
            }
            if (var2.field3808 != null) {
                class98.field1560.method1864(var2.field3808);
                var2.field3808 = null;
            }
            var2.method403(1);
        }
        if (!arg1) {
            return;
        }
        for (class239 var3 = (class239) class272.field4223.method636(-1); var3 != null; var3 = (class239) class272.field4223.method638(74)) {
            if (var3.field3806 != null) {
                class98.field1560.method1864(var3.field3806);
                var3.field3806 = null;
            }
            var3.method403(1);
        }
        for (class239 var4 = (class239) class55.field917.method1228(true); var4 != null; var4 = (class239) class55.field917.method1223((byte) 13)) {
            if (var4.field3806 != null) {
                class98.field1560.method1864(var4.field3806);
                var4.field3806 = null;
            }
            var4.method403(1);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 70)
    public static void method90(byte arg0) {
        if (arg0 <= 69) {
            field184 = 41;
        }
        field185 = null;
        field191 = null;
        field194 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V", line = 84)
    public static final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3 - arg4;
        int var7 = arg5 - arg1;
        field180++;
        if (var7 == 0) {
            if (var6 != 0) {
                class30.method258(arg0, (byte) 40, arg3, arg1, arg4);
            }
        } else if (var6 == 0) {
            class103.method745(28, arg5, arg1, arg4, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg3;
                arg3 = var9;
                int var10 = arg1;
                arg1 = arg4;
                arg4 = var10;
            }
            if (arg5 < arg1) {
                int var11 = arg1;
                arg1 = arg5;
                arg5 = var11;
                int var12 = arg4;
                arg4 = arg3;
                arg3 = var12;
            }
            int var13 = arg5 - arg1;
            int var14 = arg4;
            int var15 = arg3 - arg4;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var13 >> 1);
            int var17 = arg4 < arg3 ? 1 : -1;
            if (var8) {
                for (int var18 = arg1; var18 <= arg5; var18++) {
                    class34.field525[var18][var14] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var13;
                        var14 += var17;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg5; var19++) {
                    var16 += var15;
                    class34.field525[var14][var19] = arg0;
                    if (var16 > 0) {
                        var14 += var17;
                        var16 -= var13;
                    }
                }
            }
            int var20 = -97 / ((arg2 + 30) / 45);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I", line = 211)
    public static final int method92(int arg0, int arg1, int arg2) {
        field182++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg0 != -385541369) {
                field191 = (class188[]) null;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V", line = 264)
    public static final void method93(int arg0, boolean arg1) {
        field188++;
        if (class321.method2189(arg0, (byte) 79)) {
            if (!arg1) {
                field194 = (class220) null;
            }
            class63.method485(class163.field2463[arg0], (byte) 48, -1);
        }
    }
}
