import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class132 {

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Z")
    public boolean field3115 = false;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public int field3114 = -1;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lla;")
    public class77 field3116 = null;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
    public int[] field3108;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[I")
    public int[] field3112;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
    public int[] field3109;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
    public int[] field3111;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[I")
    private static int[] field3110 = new int[500];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
    private static int[] field3106 = new int[500];

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[I")
    private static int[] field3113 = new int[500];

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
    private static int[] field3107 = new int[500];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
    public static void method989() {
        field3113 = null;
        field3110 = null;
        field3107 = null;
        field3106 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([BLla;)V")
    public class132(byte[] arg0, class77 arg1) {
        this.field3116 = arg1;
        class148 var3 = new class148(arg0);
        class148 var4 = new class148(arg0);
        var3.field3601 = 2;
        int var5 = var3.method1137(255);
        int var6 = -1;
        int var7 = 0;
        var4.field3601 = var3.field3601 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method1137(255);
            if (var10 > 0) {
                if (this.field3116.field1903[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3116.field1903[var11] == 0) {
                            field3113[var7] = var11;
                            field3110[var7] = 0;
                            field3107[var7] = 0;
                            field3106[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3113[var7] = var8;
                short var12 = 0;
                if (this.field3116.field1903[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3110[var7] = var12;
                } else {
                    field3110[var7] = var4.method1148(255);
                }
                if ((var10 & 0x2) == 0) {
                    field3107[var7] = var12;
                } else {
                    field3107[var7] = var4.method1148(255);
                }
                if ((var10 & 0x4) == 0) {
                    field3106[var7] = var12;
                } else {
                    field3106[var7] = var4.method1148(255);
                }
                var6 = var8;
                var7++;
                if (this.field3116.field1903[var8] == 5) {
                    this.field3115 = true;
                }
            }
        }
        if (arg0.length != var4.field3601) {
            throw new RuntimeException();
        }
        this.field3114 = var7;
        this.field3108 = new int[var7];
        this.field3112 = new int[var7];
        this.field3109 = new int[var7];
        this.field3111 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3108[var9] = field3113[var9];
            this.field3112[var9] = field3110[var9];
            this.field3109[var9] = field3107[var9];
            this.field3111[var9] = field3106[var9];
        }
    }
}
