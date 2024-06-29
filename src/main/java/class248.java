import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class248 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    private int field4329 = -1;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    private int field4343 = 0;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lli;")
    private class277 field4338 = new class277();

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Z")
    public boolean field4346 = false;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    private int field4335;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[[[I")
    private int[][][] field4340;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[Lva;")
    private class34[] field4337;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Loh;")
    public static class263 field4328 = class253.method1681(-120, ")4l=");

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4330 = 0;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Loh;")
    private static class263 field4332 = class253.method1681(-117, "Loading world list data");

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Loh;")
    public static class263 field4339 = field4332;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Loh;")
    public static class263 field4344 = class253.method1681(-119, "Liste der Welten geladen");

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "[I")
    public static int[] field4341 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "[Z")
    public static boolean[] field4342 = new boolean[112];

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "Lue;")
    public static class86 field4345;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[[I")
    public static int[][] field4333;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1663(byte arg0) {
        field4342 = null;
        field4332 = null;
        if (arg0 < 56) {
            field4342 = null;
        }
        field4345 = null;
        field4333 = null;
        field4339 = null;
        field4341 = null;
        field4344 = null;
        field4328 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1664(int arg0) {
        field4327++;
        if (this.field4335 != this.field4334) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != 5262) {
            this.method1667(-119, -69);
        }
        while (var2 < this.field4335) {
            this.field4337[var2] = class96.field1872;
            var2++;
        }
        return this.field4340;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Lbb;")
    public static final class88 method1665(boolean arg0) {
        field4331++;
        class88 var1 = new class88(class240.field4200, class2.field46, class198.field3584[0], class46.field1003[0], class198.field3583[0], class181.field3289[0], class191.field3425[0], class103.field1965);
        class14.method111(0);
        return arg0 ? null : var1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public final void method1666(int arg0) {
        field4326++;
        if (arg0 > -3) {
            this.field4337 = null;
        }
        for (int var2 = 0; var2 < this.field4335; var2++) {
            this.field4340[var2][0] = null;
            this.field4340[var2][1] = null;
            this.field4340[var2][2] = null;
            this.field4340[var2] = null;
        }
        this.field4337 = null;
        this.field4340 = null;
        this.field4338.method1884(-33);
        this.field4338 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[[I")
    public final int[][] method1667(int arg0, int arg1) {
        field4336++;
        if (arg1 != 0) {
            field4333 = null;
        }
        if (this.field4335 == this.field4334) {
            this.field4346 = this.field4337[arg0] == null;
            this.field4337[arg0] = class96.field1872;
            return this.field4340[arg0];
        } else if (this.field4335 == 1) {
            this.field4346 = this.field4329 != arg0;
            this.field4329 = arg0;
            return this.field4340[0];
        } else {
            class34 var3 = this.field4337[arg0];
            if (var3 == null) {
                this.field4346 = true;
                if (this.field4343 >= this.field4335) {
                    class34 var4 = (class34) this.field4338.method1877((byte) -92);
                    var3 = new class34(arg0, var4.field810);
                    this.field4337[var4.field816] = null;
                    var4.method1614(-1204826926);
                } else {
                    var3 = new class34(arg0, this.field4343);
                    this.field4343++;
                }
                this.field4337[arg0] = var3;
            } else {
                this.field4346 = false;
            }
            this.field4338.method1880((byte) -113, var3);
            return this.field4340[var3.field810];
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(III)V")
    public class248(int arg0, int arg1, int arg2) {
        this.field4335 = arg0;
        this.field4334 = arg1;
        this.field4340 = new int[this.field4335][3][arg2];
        this.field4337 = new class34[this.field4334];
    }
}
