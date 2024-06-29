import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field2268 = -1;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Luc;")
    public class142 field2275 = null;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Z")
    public boolean field2270 = false;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
    public int[] field2267;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
    public int[] field2277;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public int[] field2273;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public int[] field2269;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[I")
    private static int[] field2271 = new int[500];

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[I")
    private static int[] field2272 = new int[500];

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[I")
    private static int[] field2276 = new int[500];

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
    private static int[] field2274 = new int[500];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
    public static void method757() {
        field2274 = null;
        field2271 = null;
        field2276 = null;
        field2272 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([BLuc;)V")
    public class98(byte[] arg0, class142 arg1) {
        this.field2275 = arg1;
        class86 var3 = new class86(arg0);
        class86 var4 = new class86(arg0);
        var3.field1924 = 2;
        int var5 = var3.method646(-15447);
        int var6 = -1;
        int var7 = 0;
        var4.field1924 = var3.field1924 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method646(-15447);
            if (var10 > 0) {
                if (this.field2275.field3324[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2275.field3324[var11] == 0) {
                            field2274[var7] = var11;
                            field2271[var7] = 0;
                            field2276[var7] = 0;
                            field2272[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2274[var7] = var8;
                short var12 = 0;
                if (this.field2275.field3324[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2271[var7] = var12;
                } else {
                    field2271[var7] = var4.method641(73);
                }
                if ((var10 & 0x2) == 0) {
                    field2276[var7] = var12;
                } else {
                    field2276[var7] = var4.method641(108);
                }
                if ((var10 & 0x4) == 0) {
                    field2272[var7] = var12;
                } else {
                    field2272[var7] = var4.method641(117);
                }
                var6 = var8;
                var7++;
                if (this.field2275.field3324[var8] == 5) {
                    this.field2270 = true;
                }
            }
        }
        if (arg0.length != var4.field1924) {
            throw new RuntimeException();
        }
        this.field2268 = var7;
        this.field2267 = new int[var7];
        this.field2277 = new int[var7];
        this.field2273 = new int[var7];
        this.field2269 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2267[var9] = field2274[var9];
            this.field2277[var9] = field2271[var9];
            this.field2273[var9] = field2276[var9];
            this.field2269[var9] = field2272[var9];
        }
    }
}
