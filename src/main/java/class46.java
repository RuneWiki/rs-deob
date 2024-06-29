import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 {

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    private int field1210 = 0;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[Lbe;")
    private class12[] field1205;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lad;")
    private static class5 field1192 = class88.method674("Loading textures )2 ", -101);

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Z")
    public static boolean field1195 = false;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lad;")
    public static class5 field1188 = field1192;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lad;")
    public static class5 field1199 = class88.method674("", 28);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lbb;")
    public static class9 field1202 = new class9(200);

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lad;")
    public static class5 field1206 = class88.method674("(U3", 24);

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lad;")
    private static class5 field1208 = class88.method674("Select", -125);

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "[I")
    public static int[] field1215 = new int[100];

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Lad;")
    private static class5 field1212 = class88.method674("glow3:", -73);

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lad;")
    public static class5 field1207 = field1212;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Lad;")
    public static class5 field1213 = class88.method674("Okay", 35);

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Lad;")
    private static class5 field1214 = class88.method674("Friends", -114);

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Lad;")
    public static class5 field1219 = field1208;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lad;")
    public static class5 field1209 = field1214;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "J")
    private long field1197;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Ltb;")
    public static class116 field1217;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lbe;")
    private class12 field1189;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Lbe;")
    private class12 field1211;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
    public static int[] field1198;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JLbe;Z)V", line = 12)
    public final void method403(long arg0, class12 arg1, boolean arg2) {
        if (arg1.field349 != null) {
            arg1.method114(-3789);
        }
        field1190++;
        if (!arg2) {
            return;
        }
        class12 var5 = this.field1205[(int) (arg0 & (long) (this.field1191 - 1))];
        arg1.field372 = var5;
        arg1.field363 = arg0;
        arg1.field349 = var5.field349;
        arg1.field349.field372 = arg1;
        arg1.field372.field349 = arg1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lbe;", line = 37)
    private final class12 method404(int arg0) {
        field1200++;
        if (~this.field1210 < arg0 && this.field1205[this.field1210 - 1] != this.field1211) {
            class12 var2 = this.field1211;
            this.field1211 = var2.field372;
            return var2;
        }
        while (this.field1210 < this.field1191) {
            class12 var3 = this.field1205[this.field1210++].field372;
            if (this.field1205[this.field1210 - 1] != var3) {
                this.field1211 = var3.field372;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Lbe;", line = 72)
    public final class12 method405(int arg0) {
        this.field1210 = 0;
        field1196++;
        if (arg0 != 8853) {
            field1214 = null;
        }
        return this.method404(arg0 - 8854);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 99)
    public static final void method406(byte arg0) {
        class5.field163.method209(244, 10);
        class1.field2++;
        if (arg0 != 7) {
            method406((byte) -128);
        }
        if (class10.field333 != -1) {
            class77.method599(class10.field333, (byte) -109);
            class80.field1885 = -1;
            class102.field2497 = true;
            class10.field333 = -1;
            class43.field1086 = true;
        }
        if (class6.field225 != -1) {
            class77.method599(class6.field225, (byte) -121);
            class80.field1885 = -1;
            class99.field2384 = true;
            class6.field225 = -1;
        }
        if (class69.field1626 != -1) {
            class77.method599(class69.field1626, (byte) -118);
            class69.field1626 = -1;
            class69.method541(30, arg0 - 135);
        }
        if (class33.field796 != -1) {
            class77.method599(class33.field796, (byte) -90);
            class33.field796 = -1;
        }
        field1203++;
        if (class53.field1334 != -1) {
            class77.method599(class53.field1334, (byte) -11);
            class53.field1334 = -1;
            class80.field1885 = -1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V", line = 169)
    public static final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1193++;
        for (class94 var5 = (class94) class7.field259.method180(arg3 ^ arg3); var5 != null; var5 = (class94) class7.field259.method181(0)) {
            if (var5.field2221 != -1 || var5.field2217 != null) {
                int var6 = 0;
                if (var5.field2235 < arg1) {
                    var6 += arg1 - var5.field2235;
                } else if (var5.field2211 > arg1) {
                    var6 += var5.field2211 - arg1;
                }
                if (arg4 > var5.field2220) {
                    var6 += arg4 - var5.field2220;
                } else if (arg4 < var5.field2225) {
                    var6 += var5.field2225 - arg4;
                }
                if (var5.field2212 < var6 - 64 || class106.field2681 == 0 || var5.field2222 != arg2) {
                    if (var5.field2215 != null) {
                        class58.field1417.method568(var5.field2215);
                        var5.field2215 = null;
                    }
                    if (var5.field2224 != null) {
                        class58.field1417.method568(var5.field2224);
                        var5.field2224 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field2212 - var6) * class106.field2681 / var5.field2212;
                    if (var5.field2215 != null) {
                        var5.field2215.method189(var7);
                    } else if (var5.field2221 >= 0) {
                        class11 var8 = class11.method108(class110.field2778, var5.field2221, 0);
                        if (var8 != null) {
                            class115 var9 = var8.method107().method919(class79.field1863);
                            class24 var10 = class24.method198(var9, 100, var7);
                            var10.method196(-1);
                            class58.field1417.method566(var10);
                            var5.field2215 = var10;
                        }
                    }
                    if (var5.field2224 != null) {
                        var5.field2224.method189(var7);
                        if (!var5.field2224.method202()) {
                            var5.field2224 = null;
                        }
                    } else if (var5.field2217 != null && (var5.field2226 -= arg0) <= 0) {
                        int var11 = (int) ((double) var5.field2217.length * Math.random());
                        class11 var12 = class11.method108(class110.field2778, var5.field2217[var11], 0);
                        if (var12 != null) {
                            class115 var13 = var12.method107().method919(class79.field1863);
                            class24 var14 = class24.method198(var13, 100, var7);
                            var14.method196(0);
                            class58.field1417.method566(var14);
                            var5.field2224 = var14;
                            var5.field2226 = (int) (Math.random() * (double) (var5.field2240 - var5.field2239)) + var5.field2239;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JI)Lbe;", line = 300)
    public final class12 method408(long arg0, int arg1) {
        if (arg1 <= 54) {
            return null;
        }
        field1201++;
        this.field1197 = arg0;
        class12 var4 = this.field1205[(int) (arg0 & (long) (this.field1191 - 1))];
        for (this.field1189 = var4.field372; this.field1189 != var4; this.field1189 = this.field1189.field372) {
            if (this.field1189.field363 == arg0) {
                class12 var5 = this.field1189;
                this.field1189 = this.field1189.field372;
                return var5;
            }
        }
        this.field1189 = null;
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 338)
    public static void method409(int arg0) {
        field1219 = null;
        field1192 = null;
        field1209 = null;
        field1199 = null;
        field1188 = null;
        if (arg0 != -1) {
            field1209 = null;
        }
        field1213 = null;
        field1198 = null;
        field1202 = null;
        field1214 = null;
        field1208 = null;
        field1206 = null;
        field1217 = null;
        field1215 = null;
        field1207 = null;
        field1212 = null;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Lbe;", line = 363)
    public final class12 method410(int arg0) {
        if (arg0 < 6) {
            this.field1210 = 11;
        }
        field1194++;
        if (this.field1189 == null) {
            return null;
        }
        class12 var2 = this.field1205[(int) ((long) (this.field1191 - 1) & this.field1197)];
        while (this.field1189 != var2) {
            if (this.field1189.field363 == this.field1197) {
                class12 var3 = this.field1189;
                this.field1189 = this.field1189.field372;
                return var3;
            }
            this.field1189 = this.field1189.field372;
        }
        this.field1189 = null;
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V", line = 411)
    public class46(int arg0) {
        this.field1191 = arg0;
        this.field1205 = new class12[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class12 var3 = this.field1205[var2] = new class12();
            var3.field372 = var3;
            var3.field349 = var3;
        }
    }
}
