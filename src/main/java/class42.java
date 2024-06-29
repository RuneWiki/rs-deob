import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class42 {

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lol;")
    private class231 field675 = new class231(256);

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Lol;")
    private class231 field682 = new class231(256);

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lah;")
    private class205 field680;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lah;")
    private class205 field670;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Z")
    public static boolean field673 = false;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lwm;")
    public static class152 field671 = class157.method1048("::fps ", 104);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lwm;")
    public static class152 field677 = class157.method1048("null", 106);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lwm;")
    public static class152 field669 = class157.method1048("Titelbild ge-Offnet)3", 112);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZI[I)Lgm;", line = 5)
    private final class292 method290(int arg0, boolean arg1, int arg2, int[] arg3) {
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFFC) ^ arg2;
        field674++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class292 var9 = (class292) this.field682.method1586(var7, -115);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class144 var10 = class144.method905(this.field680, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class292 var11 = var10.method906();
            this.field682.method1593(var7, var11, 27497);
            if (arg3 != null) {
                arg3[0] -= var11.field5009.length;
            }
            if (!arg1) {
                field669 = (class152) null;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 53)
    public static void method291(byte arg0) {
        field677 = null;
        if (arg0 != 88) {
            method296((class85) null, (byte) -29);
        }
        field671 = null;
        field669 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([IZI)Lgm;", line = 72)
    public final class292 method292(int[] arg0, boolean arg1, int arg2) {
        field681++;
        if (this.field680.method1380((byte) 12) == 1) {
            return this.method290(0, true, arg2, arg0);
        } else if (this.field680.method1375(arg2, 0) == 1) {
            return this.method290(arg2, true, 0, arg0);
        } else {
            if (arg1) {
                method294((class12) null, (byte) 83);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[IB)Lgm;", line = 124)
    private final class292 method293(int arg0, int arg1, int[] arg2, byte arg3) {
        field672++;
        int var5 = (arg1 << 4 & 0xFFF9 | arg1 >>> 12) ^ arg0;
        if (arg3 != -8) {
            this.method290(-117, true, 50, (int[]) null);
        }
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class292 var9 = (class292) this.field682.method1586(var7, -82);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class315 var10 = (class315) this.field675.method1586(var7, -100);
            if (var10 == null) {
                var10 = class315.method2205(this.field670, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field675.method1593(var7, var10, 27497);
            }
            class292 var11 = var10.method2200(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1880(-25368);
                this.field682.method1593(var7, var11, 27497);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lse;B)V", line = 171)
    public static final void method294(class12 arg0, byte arg1) {
        if (arg1 > -63) {
            return;
        }
        field679++;
        class172 var2 = (class172) class57.field877.method1586(arg0.field146.method1013(-18674), -77);
        if (var2 == null) {
            return;
        }
        if (var2.field2746 != null) {
            class290.field4916.method1495(var2.field2746);
            var2.field2746 = null;
        }
        var2.method1880(-25368);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([III)Lgm;", line = 197)
    public final class292 method295(int[] arg0, int arg1, int arg2) {
        field676++;
        if (this.field670.method1380((byte) 12) == 1) {
            return this.method293(arg2, 0, arg0, (byte) -8);
        } else if (this.field670.method1375(arg2, arg1) == 1) {
            return this.method293(0, arg2, arg0, (byte) -8);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lpf;B)V", line = 214)
    public static final void method296(class85 arg0, byte arg1) {
        field668++;
        long var2 = 0L;
        if (arg0.field1182 == 0) {
            var2 = class79.method526(arg0.field1177, arg0.field1181, arg0.field1189);
        }
        int var4 = -1;
        if (arg0.field1182 == 1) {
            var2 = class58.method382(arg0.field1177, arg0.field1181, arg0.field1189);
        }
        int var5 = 0;
        if (arg0.field1182 == 2) {
            var2 = class112.method745(arg0.field1177, arg0.field1181, arg0.field1189);
        }
        if (arg1 > -101) {
            field667 = -48;
        }
        if (arg0.field1182 == 3) {
            var2 = class226.method1553(arg0.field1177, arg0.field1181, arg0.field1189);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var6 = ((int) var2 & 0x3BCD0E) >> 20;
            var5 = (int) var2 >> 14 & 0x1F;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field1193 = var5;
        arg0.field1196 = var4;
        arg0.field1187 = var6;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lah;Lah;)V", line = 264)
    public class42(class205 arg0, class205 arg1) {
        this.field680 = arg0;
        this.field670 = arg1;
    }
}
