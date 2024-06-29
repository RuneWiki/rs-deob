import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class148 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lln;")
    public class159 field2512 = null;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public int field2516 = -1;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Z")
    public boolean field2523 = false;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[S")
    public short[] field2518;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "[S")
    public short[] field2521;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[S")
    public short[] field2522;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[S")
    public short[] field2513;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[S")
    public short[] field2514;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[S")
    private static short[] field2517 = new short[500];

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[S")
    private static short[] field2515 = new short[500];

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[S")
    private static short[] field2520 = new short[500];

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[S")
    private static short[] field2519 = new short[500];

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "[S")
    private static short[] field2524 = new short[500];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V", line = 6)
    public static void method1027() {
        field2524 = null;
        field2519 = null;
        field2515 = null;
        field2520 = null;
        field2517 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([BLln;)V", line = 53)
    public class148(byte[] arg0, class159 arg1) {
        this.field2512 = arg1;
        class153 var3 = new class153(arg0);
        class153 var4 = new class153(arg0);
        var3.field2611 = 2;
        int var5 = var3.method1082(-35);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2611 = var3.field2611 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field2512.field2758[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1082(-110);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field2524[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2519[var6] = var12;
                } else {
                    field2519[var6] = (short) var4.method1060(true);
                }
                if ((var11 & 0x2) == 0) {
                    field2515[var6] = var12;
                } else {
                    field2515[var6] = (short) var4.method1060(true);
                }
                if ((var11 & 0x4) == 0) {
                    field2520[var6] = var12;
                } else {
                    field2520[var6] = (short) var4.method1060(true);
                }
                if (var10 == 2) {
                    field2519[var6] = (short) (((field2519[var6] & 0xFF) << 3) + (field2519[var6] >> 8 & 0x7));
                    field2515[var6] = (short) (((field2515[var6] & 0xFF) << 3) + (field2515[var6] >> 8 & 0x7));
                    field2520[var6] = (short) (((field2520[var6] & 0xFF) << 3) + (field2520[var6] >> 8 & 0x7));
                }
                field2517[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field2517[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field2523 = true;
                } else if (var10 == 7) {
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2611) {
            throw new RuntimeException();
        }
        this.field2516 = var6;
        this.field2518 = new short[var6];
        this.field2521 = new short[var6];
        this.field2522 = new short[var6];
        this.field2513 = new short[var6];
        this.field2514 = new short[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field2518[var13] = field2524[var13];
            this.field2521[var13] = field2519[var13];
            this.field2522[var13] = field2515[var13];
            this.field2513[var13] = field2520[var13];
            this.field2514[var13] = field2517[var13];
        }
    }
}
