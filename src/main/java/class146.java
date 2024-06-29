import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class146 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lq;")
    public class145 field2989 = null;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Z")
    public boolean field2994 = false;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public int field2999 = -1;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
    public int[] field2993;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
    public int[] field2992;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public int[] field2990;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
    public int[] field2998;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[I")
    private static int[] field2996 = new int[500];

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
    private static int[] field2991 = new int[500];

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[I")
    private static int[] field2995 = new int[500];

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
    private static int[] field2997 = new int[500];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public static void method920() {
        field2995 = null;
        field2991 = null;
        field2996 = null;
        field2997 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([BLq;)V")
    public class146(byte[] arg0, class145 arg1) {
        this.field2989 = arg1;
        class89 var3 = new class89(arg0);
        class89 var4 = new class89(arg0);
        var3.field1727 = 2;
        int var5 = var3.method538((byte) -100);
        int var6 = -1;
        int var7 = 0;
        var4.field1727 = var3.field1727 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method538((byte) 126);
            if (var10 > 0) {
                if (this.field2989.field2982[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2989.field2982[var11] == 0) {
                            field2995[var7] = var11;
                            field2991[var7] = 0;
                            field2996[var7] = 0;
                            field2997[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2995[var7] = var8;
                short var12 = 0;
                if (this.field2989.field2982[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2991[var7] = var12;
                } else {
                    field2991[var7] = var4.method566(123);
                }
                if ((var10 & 0x2) == 0) {
                    field2996[var7] = var12;
                } else {
                    field2996[var7] = var4.method566(121);
                }
                if ((var10 & 0x4) == 0) {
                    field2997[var7] = var12;
                } else {
                    field2997[var7] = var4.method566(127);
                }
                var6 = var8;
                var7++;
                if (this.field2989.field2982[var8] == 5) {
                    this.field2994 = true;
                }
            }
        }
        if (arg0.length != var4.field1727) {
            throw new RuntimeException();
        }
        this.field2999 = var7;
        this.field2993 = new int[var7];
        this.field2992 = new int[var7];
        this.field2990 = new int[var7];
        this.field2998 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2993[var9] = field2995[var9];
            this.field2992[var9] = field2991[var9];
            this.field2990[var9] = field2996[var9];
            this.field2998[var9] = field2997[var9];
        }
    }
}
