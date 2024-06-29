import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class125 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public int field3009 = -1;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Z")
    public boolean field3015 = false;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lrb;")
    public class115 field3018 = null;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "[I")
    public int[] field3008;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
    public int[] field3013;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "[I")
    public int[] field3014;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[I")
    public int[] field3010;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[I")
    private static int[] field3011 = new int[500];

    @OriginalMember(owner = "client!t", name = "i", descriptor = "[I")
    private static int[] field3016 = new int[500];

    @OriginalMember(owner = "client!t", name = "j", descriptor = "[I")
    private static int[] field3017 = new int[500];

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
    private static int[] field3012 = new int[500];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public static void method1004() {
        field3011 = null;
        field3017 = null;
        field3016 = null;
        field3012 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "([BLrb;)V")
    public class125(byte[] arg0, class115 arg1) {
        this.field3018 = arg1;
        class14 var3 = new class14(arg0);
        class14 var4 = new class14(arg0);
        var3.field314 = 2;
        int var5 = var3.method153(true);
        int var6 = -1;
        int var7 = 0;
        var4.field314 = var3.field314 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method153(true);
            if (var10 > 0) {
                if (this.field3018.field2806[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3018.field2806[var11] == 0) {
                            field3011[var7] = var11;
                            field3017[var7] = 0;
                            field3016[var7] = 0;
                            field3012[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3011[var7] = var8;
                short var12 = 0;
                if (this.field3018.field2806[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3017[var7] = var12;
                } else {
                    field3017[var7] = var4.method117((byte) -102);
                }
                if ((var10 & 0x2) == 0) {
                    field3016[var7] = var12;
                } else {
                    field3016[var7] = var4.method117((byte) -102);
                }
                if ((var10 & 0x4) == 0) {
                    field3012[var7] = var12;
                } else {
                    field3012[var7] = var4.method117((byte) -102);
                }
                var6 = var8;
                var7++;
                if (this.field3018.field2806[var8] == 5) {
                    this.field3015 = true;
                }
            }
        }
        if (arg0.length != var4.field314) {
            throw new RuntimeException();
        }
        this.field3009 = var7;
        this.field3008 = new int[var7];
        this.field3013 = new int[var7];
        this.field3014 = new int[var7];
        this.field3010 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3008[var9] = field3011[var9];
            this.field3013[var9] = field3017[var9];
            this.field3014[var9] = field3016[var9];
            this.field3010[var9] = field3012[var9];
        }
    }
}
