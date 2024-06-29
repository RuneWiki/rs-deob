import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class56 extends class87 {

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Z")
    public boolean field1280 = false;

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
    private int field1284 = 0;

    @OriginalMember(owner = "client!jb", name = "nb", descriptor = "I")
    private int field1287 = 0;

    @OriginalMember(owner = "client!jb", name = "qb", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!jb", name = "xb", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!jb", name = "zb", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!jb", name = "vb", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client!jb", name = "sb", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!jb", name = "ob", descriptor = "Lc;")
    private class13 field1288;

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "Lec;")
    public static class28 field1283 = class28.method210(-46, "null");

    @OriginalMember(owner = "client!jb", name = "pb", descriptor = "Lec;")
    public static class28 field1289 = class28.method210(-46, "Examine @lre@");

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "Ldc;")
    public static class22 field1282 = new class22(5000);

    @OriginalMember(owner = "client!jb", name = "tb", descriptor = "[Lqa;")
    public static class96[] field1293 = new class96[5];

    @OriginalMember(owner = "client!jb", name = "wb", descriptor = "I")
    public static int field1296 = 0;

    @OriginalMember(owner = "client!jb", name = "yb", descriptor = "Lec;")
    public static class28 field1298 = class28.method210(-46, "l");

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!jb", name = "mb", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!jb", name = "rb", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!jb", name = "Ab", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!jb", name = "ub", descriptor = "Lvb;")
    public static class122 field1294;

    @OriginalMember(owner = "client!jb", name = "lb", descriptor = "Lbb;")
    public static class9 field1285;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Z")
    public static final boolean method454(byte arg0, int arg1) {
        field1279++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class74.field1636[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0 != -63) {
            field1294 = null;
        }
        return var2 == 13;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)Lfb;")
    public final class33 method290(int arg0) {
        field1281++;
        class123 var2 = class32.method252(-15381, this.field1295);
        int var3 = 108 % ((arg0 + 70) / 55);
        class33 var4;
        if (this.field1280) {
            var4 = var2.method948(-1, -102);
        } else {
            var4 = var2.method948(this.field1284, 115);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public static void method455(int arg0) {
        field1298 = null;
        field1282 = null;
        field1293 = null;
        if (arg0 != 0) {
            field1283 = null;
        }
        field1289 = null;
        field1283 = null;
        field1285 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(ZI)V")
    public static final void method456(boolean arg0, int arg1) {
        class37.field852++;
        field1291++;
        if (arg1 != 4370) {
            field1282 = null;
        }
        if (class37.field852 < 50 && !arg0) {
            return;
        }
        class37.field852 = 0;
        if (class129.field2773 || class106.field2239 == null) {
            return;
        }
        class92.field2025++;
        class5.field85.method161((byte) 125, 217);
        try {
            class106.field2239.method110(class5.field85.field2531, 0, (byte) -56, class5.field85.field2554);
            class5.field85.field2554 = 0;
        } catch (IOException var2) {
            class129.field2773 = true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(ZI)V")
    public final void method457(boolean arg0, int arg1) {
        field1277++;
        if (this.field1280 || !arg0) {
            return;
        }
        this.field1287 += arg1;
        while (this.field1288.field223[this.field1284] < this.field1287) {
            this.field1287 -= this.field1288.field223[this.field1284];
            this.field1284++;
            if (this.field1288.field245.length <= this.field1284) {
                this.field1280 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIII)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1290 = arg3;
        this.field1278 = arg4;
        this.field1297 = arg2;
        this.field1299 = arg5 + arg6;
        this.field1295 = arg0;
        this.field1292 = arg1;
        int var8 = class32.method252(-15381, this.field1295).field2668;
        if (var8 == -1) {
            this.field1280 = true;
        } else {
            this.field1280 = false;
            this.field1288 = class23.method166(0, var8);
        }
    }
}
