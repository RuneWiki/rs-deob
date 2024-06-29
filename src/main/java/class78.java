import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class78 {

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    private int field1305 = -1;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    private int field1308 = 0;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lud;")
    private class52 field1304 = new class52();

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "Z")
    public boolean field1320 = false;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "[[[I")
    private int[][][] field1306;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[Lof;")
    private class240[] field1303;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Z")
    public static boolean field1300 = false;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1310 = 0;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "Lmh;")
    private static class62 field1317 = class201.method1405(true, "Loaded fonts");

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "Lmh;")
    public static class62 field1319 = field1317;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lfg;")
    public static class74 field1307;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
    public static int[] field1312;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "[Lfd;")
    public static class61[] field1311;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 31)
    public final void method604(boolean arg0) {
        field1302++;
        for (int var2 = 0; var2 < this.field1313; var2++) {
            this.field1306[var2][0] = null;
            this.field1306[var2][1] = null;
            this.field1306[var2][2] = null;
            this.field1306[var2] = (int[][]) null;
        }
        this.field1306 = (int[][][]) null;
        this.field1303 = null;
        this.field1304.method328(arg0);
        this.field1304 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(III)V", line = 199)
    public class78(int arg0, int arg1, int arg2) {
        this.field1318 = arg1;
        this.field1313 = arg0;
        this.field1306 = new int[this.field1313][3][arg2];
        this.field1303 = new class240[this.field1318];
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[[I", line = 66)
    public final int[][] method605(int arg0, int arg1) {
        field1314++;
        if (arg1 != 19195) {
            field1310 = 22;
        }
        if (this.field1318 == this.field1313) {
            this.field1320 = this.field1303[arg0] == null;
            this.field1303[arg0] = class54.field797;
            return this.field1306[arg0];
        } else if (this.field1313 == 1) {
            this.field1320 = this.field1305 != arg0;
            this.field1305 = arg0;
            return this.field1306[0];
        } else {
            class240 var3 = this.field1303[arg0];
            if (var3 == null) {
                this.field1320 = true;
                if (this.field1313 > this.field1308) {
                    var3 = new class240(arg0, this.field1308);
                    this.field1308++;
                } else {
                    class240 var4 = (class240) this.field1304.method337(-106);
                    var3 = new class240(arg0, var4.field4100);
                    this.field1303[var4.field4095] = null;
                    var4.method1444((byte) 89);
                }
                this.field1303[arg0] = var3;
            } else {
                this.field1320 = false;
            }
            this.field1304.method338(var3, arg1 ^ 0xFFFFB504);
            return this.field1306[var3.field4100];
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 131)
    public static void method606(byte arg0) {
        field1317 = null;
        field1311 = null;
        field1319 = null;
        field1307 = null;
        int var1 = -89 / ((arg0 + 23) / 33);
        field1312 = null;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)V", line = 152)
    public static final void method607(int arg0, int arg1) {
        class90.field1422 = -1;
        field1301++;
        class103.field1696 = arg0;
        class114.field1915 = arg1;
        class225.method1595((byte) 63);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)[[[I", line = 173)
    public final int[][][] method608(int arg0) {
        field1309++;
        if (this.field1318 != this.field1313) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 <= 54) {
            this.field1318 = -86;
        }
        for (int var2 = 0; var2 < this.field1313; var2++) {
            this.field1303[var2] = class54.field797;
        }
        return this.field1306;
    }
}
