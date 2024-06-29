import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class120 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lh;")
    public class42 field2950 = null;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field2951 = -1;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Z")
    public boolean field2957 = false;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
    public int[] field2956;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
    public int[] field2953;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    public int[] field2955;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
    public int[] field2949;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
    private static int[] field2948 = new int[500];

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
    private static int[] field2954 = new int[500];

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[I")
    private static int[] field2952 = new int[500];

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[I")
    private static int[] field2958 = new int[500];

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V", line = 6)
    public static void method952() {
        field2958 = null;
        field2948 = null;
        field2954 = null;
        field2952 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([BLh;)V", line = 41)
    public class120(byte[] arg0, class42 arg1) {
        this.field2950 = arg1;
        class61 var3 = new class61(arg0);
        class61 var4 = new class61(arg0);
        var3.field1556 = 2;
        int var5 = var3.method494(20471);
        int var6 = -1;
        int var7 = 0;
        var4.field1556 = var3.field1556 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method494(20471);
            if (var10 > 0) {
                if (this.field2950.field1019[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2950.field1019[var11] == 0) {
                            field2958[var7] = var11;
                            field2948[var7] = 0;
                            field2954[var7] = 0;
                            field2952[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2958[var7] = var8;
                short var12 = 0;
                if (this.field2950.field1019[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2948[var7] = var12;
                } else {
                    field2948[var7] = var4.method503(255);
                }
                if ((var10 & 0x2) == 0) {
                    field2954[var7] = var12;
                } else {
                    field2954[var7] = var4.method503(255);
                }
                if ((var10 & 0x4) == 0) {
                    field2952[var7] = var12;
                } else {
                    field2952[var7] = var4.method503(255);
                }
                var6 = var8;
                var7++;
                if (this.field2950.field1019[var8] == 5) {
                    this.field2957 = true;
                }
            }
        }
        if (arg0.length != var4.field1556) {
            throw new RuntimeException();
        }
        this.field2951 = var7;
        this.field2956 = new int[var7];
        this.field2953 = new int[var7];
        this.field2955 = new int[var7];
        this.field2949 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2956[var9] = field2958[var9];
            this.field2953[var9] = field2948[var9];
            this.field2955[var9] = field2954[var9];
            this.field2949[var9] = field2952[var9];
        }
    }
}
