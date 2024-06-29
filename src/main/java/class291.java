import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class291 extends class200 {

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    private int field4142;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field4146 = 0;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field4140 = 0;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Lpi;")
    public static class342 field4139 = new class342("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "Liv;")
    public static class64 field4149 = new class64(40, 8);

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "[Ltr;")
    public class191[] field4143;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "[[B")
    private byte[][] field4144;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Z")
    public final boolean method1837(int arg0, byte arg1) {
        field4147++;
        return arg1 == 84 ? this.field4143[arg0].field2844 : true;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)Z")
    public final boolean method1838(int arg0) {
        field4138++;
        if (this.field4143 != null) {
            return true;
        }
        if (this.field4144 == null) {
            if (!class92.field1577.method124(19928, this.field4142)) {
                return false;
            }
            int[] var2 = class92.field1577.method131(this.field4142, -122);
            this.field4144 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4144[var3] = class92.field1577.method114(var2[var3], this.field4142, -128);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4144.length; var5++) {
            byte[] var14 = this.field4144[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class51.field916.method129(true, var15);
        }
        if (!var4) {
            return false;
        }
        class392 var6 = new class392();
        int var7 = class92.field1577.method119(29630, this.field4142);
        this.field4143 = new class191[var7];
        int[] var8 = class92.field1577.method131(this.field4142, 54);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field4144[var9];
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            class498 var12 = null;
            for (class498 var13 = (class498) var6.method2427(117); var13 != null; var13 = (class498) var6.method2422(-91)) {
                if (var13.field7355 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class498(var11, class51.field916.method140(var11, 1));
                var6.method2417(-126, var12);
            }
            this.field4143[var8[var9]] = new class191(var10, var12);
        }
        if (arg0 > -42) {
            this.method1841(116, -100);
        }
        this.field4144 = null;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
    public final boolean method1839(int arg0, int arg1) {
        field4145++;
        if (arg0 >= -93) {
            field4140 = -111;
        }
        return this.field4143[arg1].field2841;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method1840(int arg0) {
        field4149 = null;
        field4139 = null;
        if (arg0 != -1456982776) {
            field4140 = -80;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
    public class291(int arg0) {
        this.field4142 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)Z")
    public final boolean method1841(int arg0, int arg1) {
        if (arg1 == 0) {
            field4141++;
            return this.field4143[arg0].field2843;
        } else {
            return false;
        }
    }
}
