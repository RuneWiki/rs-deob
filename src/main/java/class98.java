import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class98 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lu;")
    public class125 field2318 = null;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Z")
    public boolean field2320 = false;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public int field2328 = -1;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[I")
    public int[] field2325;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
    public int[] field2322;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
    public int[] field2326;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[I")
    public int[] field2324;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
    private static int[] field2323 = new int[500];

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
    private static int[] field2321 = new int[500];

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    private static int[] field2319 = new int[500];

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
    private static int[] field2327 = new int[500];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 5)
    public static void method830() {
        field2319 = null;
        field2321 = null;
        field2323 = null;
        field2327 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([BLu;)V", line = 42)
    public class98(byte[] arg0, class125 arg1) {
        this.field2318 = arg1;
        class77 var3 = new class77(arg0);
        class77 var4 = new class77(arg0);
        var3.field1821 = 2;
        int var5 = var3.method620((byte) -8);
        int var6 = -1;
        int var7 = 0;
        var4.field1821 = var3.field1821 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method620((byte) -8);
            if (var10 > 0) {
                if (this.field2318.field3057[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2318.field3057[var11] == 0) {
                            field2319[var7] = var11;
                            field2321[var7] = 0;
                            field2323[var7] = 0;
                            field2327[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2319[var7] = var8;
                short var12 = 0;
                if (this.field2318.field3057[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2321[var7] = var12;
                } else {
                    field2321[var7] = var4.method653((byte) -98);
                }
                if ((var10 & 0x2) == 0) {
                    field2323[var7] = var12;
                } else {
                    field2323[var7] = var4.method653((byte) 23);
                }
                if ((var10 & 0x4) == 0) {
                    field2327[var7] = var12;
                } else {
                    field2327[var7] = var4.method653((byte) -84);
                }
                var6 = var8;
                var7++;
                if (this.field2318.field3057[var8] == 5) {
                    this.field2320 = true;
                }
            }
        }
        if (arg0.length != var4.field1821) {
            throw new RuntimeException();
        }
        this.field2328 = var7;
        this.field2325 = new int[var7];
        this.field2322 = new int[var7];
        this.field2326 = new int[var7];
        this.field2324 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2325[var9] = field2319[var9];
            this.field2322[var9] = field2321[var9];
            this.field2326[var9] = field2323[var9];
            this.field2324[var9] = field2327[var9];
        }
    }
}
