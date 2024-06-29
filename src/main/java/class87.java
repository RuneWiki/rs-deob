import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class87 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public int field2062 = -1;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
    public boolean field2064 = false;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lea;")
    public class26 field2066 = null;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[I")
    public int[] field2067;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
    public int[] field2065;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
    public int[] field2057;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
    public int[] field2059;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
    private static int[] field2058 = new int[500];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    private static int[] field2060 = new int[500];

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
    private static int[] field2061 = new int[500];

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
    private static int[] field2063 = new int[500];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V", line = 12)
    public static void method650() {
        field2061 = null;
        field2058 = null;
        field2060 = null;
        field2063 = null;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([BLea;)V", line = 42)
    public class87(byte[] arg0, class26 arg1) {
        this.field2066 = arg1;
        class36 var3 = new class36(arg0);
        class36 var4 = new class36(arg0);
        var3.field1057 = 2;
        int var5 = var3.method365((byte) -125);
        int var6 = -1;
        int var7 = 0;
        var4.field1057 = var3.field1057 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method365((byte) -122);
            if (var10 > 0) {
                if (this.field2066.field746[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2066.field746[var11] == 0) {
                            field2061[var7] = var11;
                            field2058[var7] = 0;
                            field2060[var7] = 0;
                            field2063[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2061[var7] = var8;
                short var12 = 0;
                if (this.field2066.field746[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2058[var7] = var12;
                } else {
                    field2058[var7] = var4.method354(128);
                }
                if ((var10 & 0x2) == 0) {
                    field2060[var7] = var12;
                } else {
                    field2060[var7] = var4.method354(128);
                }
                if ((var10 & 0x4) == 0) {
                    field2063[var7] = var12;
                } else {
                    field2063[var7] = var4.method354(128);
                }
                var6 = var8;
                var7++;
                if (this.field2066.field746[var8] == 5) {
                    this.field2064 = true;
                }
            }
        }
        if (arg0.length != var4.field1057) {
            throw new RuntimeException();
        }
        this.field2062 = var7;
        this.field2067 = new int[var7];
        this.field2065 = new int[var7];
        this.field2057 = new int[var7];
        this.field2059 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2067[var9] = field2061[var9];
            this.field2065[var9] = field2058[var9];
            this.field2057[var9] = field2060[var9];
            this.field2059[var9] = field2063[var9];
        }
    }
}
