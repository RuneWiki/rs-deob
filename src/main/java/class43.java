import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class43 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Lke;")
    public class113 field781 = null;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Z")
    public boolean field787 = false;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public int field782 = -1;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[S")
    public short[] field780;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "[S")
    public short[] field785;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[S")
    public short[] field784;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[S")
    public short[] field777;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[S")
    public short[] field778;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[S")
    private static short[] field776 = new short[500];

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[S")
    private static short[] field779 = new short[500];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[S")
    private static short[] field775 = new short[500];

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[S")
    private static short[] field783 = new short[500];

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "[S")
    private static short[] field786 = new short[500];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V", line = 19)
    public static void method371() {
        field783 = null;
        field776 = null;
        field779 = null;
        field775 = null;
        field786 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([BLke;)V", line = 53)
    public class43(byte[] arg0, class113 arg1) {
        this.field781 = arg1;
        class14 var3 = new class14(arg0);
        class14 var4 = new class14(arg0);
        var3.field195 = 2;
        int var5 = var3.method93(false);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field195 = var3.field195 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field781.field2039[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method93(false);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field783[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field776[var6] = var12;
                } else {
                    field776[var6] = (short) var4.method129(-49152);
                }
                if ((var11 & 0x2) == 0) {
                    field779[var6] = var12;
                } else {
                    field779[var6] = (short) var4.method129(-49152);
                }
                if ((var11 & 0x4) == 0) {
                    field775[var6] = var12;
                } else {
                    field775[var6] = (short) var4.method129(-49152);
                }
                if (var10 == 2) {
                    field776[var6] = (short) (((field776[var6] & 0xFF) << 3) + (field776[var6] >> 8 & 0x7));
                    field779[var6] = (short) (((field779[var6] & 0xFF) << 3) + (field779[var6] >> 8 & 0x7));
                    field775[var6] = (short) (((field775[var6] & 0xFF) << 3) + (field775[var6] >> 8 & 0x7));
                }
                field786[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field786[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field787 = true;
                } else if (var10 == 7) {
                }
                var6++;
            }
        }
        if (arg0.length != var4.field195) {
            throw new RuntimeException();
        }
        this.field782 = var6;
        this.field780 = new short[var6];
        this.field785 = new short[var6];
        this.field784 = new short[var6];
        this.field777 = new short[var6];
        this.field778 = new short[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field780[var13] = field783[var13];
            this.field785[var13] = field776[var13];
            this.field784[var13] = field779[var13];
            this.field777[var13] = field775[var13];
            this.field778[var13] = field786[var13];
        }
    }
}
