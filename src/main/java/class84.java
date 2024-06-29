import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 {

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lbj;")
    private class173 field1293;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lol;")
    private class164 field1284;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lbh;")
    private class172 field1285;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field1282 = 50;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field1287 = 100;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "[J")
    public static long[] field1294 = new long[500];

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lca;")
    private class54 field1291;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[Lvc;")
    private class61[] field1288;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public final void method645(byte arg0) {
        field1281++;
        if (this.field1288 == null) {
            return;
        }
        int var2 = 5 / ((3 - arg0) / 59);
        for (int var3 = 0; var3 < this.field1288.length; var3++) {
            if (this.field1288[var3] != null) {
                this.field1288[var3].method503(383);
            }
        }
        for (int var4 = 0; var4 < this.field1288.length; var4++) {
            if (this.field1288[var4] != null) {
                this.field1288[var4].method508(false);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method646(int arg0) {
        field1294 = null;
        if (arg0 != -3) {
            method646(91);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lrg;Lrg;IZI)Lvc;")
    private final class61 method647(class222 arg0, class222 arg1, int arg2, boolean arg3, int arg4) {
        field1290++;
        if (this.field1291 == null) {
            throw new RuntimeException();
        }
        this.field1291.field887 = arg4 * 8 + 5;
        if (this.field1291.field848.length <= this.field1291.field887) {
            throw new RuntimeException();
        } else if (this.field1288[arg4] == null) {
            int var6 = this.field1291.method420((byte) -83);
            int var7 = 48 % ((arg2 - 54) / 60);
            int var8 = this.field1291.method420((byte) -120);
            class61 var9 = new class61(arg4, arg1, arg0, this.field1284, this.field1293, var6, var8, arg3);
            this.field1288[arg4] = var9;
            return var9;
        } else {
            return this.field1288[arg4];
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lrg;ILrg;I)Lvc;")
    public final class61 method648(class222 arg0, int arg1, class222 arg2, int arg3) {
        field1289++;
        if (arg1 != 6339) {
            this.field1291 = null;
        }
        return this.method647(arg0, arg2, 121, true, arg3);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII)V")
    public static final void method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1292++;
        int var7 = -59 % ((arg4 - 63) / 42);
        class130[] var8 = class234.field3610;
        for (int var9 = 0; var9 < var8.length; var9++) {
            class130 var10 = var8[var9];
            if (var10 != null && var10.field1913 == 2) {
                class249.method1702(arg2 >> 1, (var10.field1907 - class188.field2774 << 7) + var10.field1912, var10.field1910 * 2, arg3, 18602, arg5 >> 1, arg1, (var10.field1916 - class90.field1367 << 7) + var10.field1906);
                if (class224.field3479 > -1 && (class120.field1794 % 20) < 10) {
                    class135.field1974[var10.field1918].method1230(class224.field3479 + arg6 - 12, class125.field1845 + arg0 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lol;Lbj;)V")
    public class84(class164 arg0, class173 arg1) {
        this.field1293 = arg1;
        this.field1284 = arg0;
        if (!this.field1284.method1113(-30921)) {
            this.field1285 = this.field1284.method1115(-80, 255, (byte) 0, true, 255);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)Z")
    public final boolean method650(byte arg0) {
        int var2 = 41 / ((arg0 + 21) / 51);
        field1283++;
        if (this.field1291 != null) {
            return true;
        }
        if (this.field1285 == null) {
            if (this.field1284.method1113(-30921)) {
                return false;
            }
            this.field1285 = this.field1284.method1115(-60, 255, (byte) 0, true, 255);
        }
        if (this.field1285.field1572) {
            return false;
        } else {
            this.field1291 = new class54(this.field1285.method669(3));
            this.field1288 = new class61[(this.field1291.field848.length - 5) / 8];
            return true;
        }
    }
}
