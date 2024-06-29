import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class196 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Z")
    public boolean field2777 = false;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Z")
    public boolean field2786 = false;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Z")
    public boolean field2781 = false;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field2782 = 0;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Ldp;")
    public class3 field2790 = null;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[S")
    public short[] field2779;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[S")
    public short[] field2778;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[S")
    public short[] field2776;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "[S")
    public short[] field2789;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[S")
    public short[] field2783;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[B")
    public byte[] field2787;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "[S")
    private static short[] field2785 = new short[500];

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[S")
    private static short[] field2780 = new short[500];

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[B")
    private static byte[] field2784 = new byte[500];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[S")
    private static short[] field2774 = new short[500];

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[S")
    private static short[] field2788 = new short[500];

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[S")
    private static short[] field2775 = new short[500];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
    public static void method1213() {
        field2780 = null;
        field2788 = null;
        field2785 = null;
        field2775 = null;
        field2774 = null;
        field2784 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([BLdp;)V")
    public class196(byte[] arg0, class3 arg1) {
        this.field2790 = arg1;
        try {
            class11 var3 = new class11(arg0);
            class11 var4 = new class11(arg0);
            var3.field165 = 2;
            int var5 = var3.method110((byte) 101);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field165 = var3.field165 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2790.field38[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method110((byte) 109);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2780[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2788[var6] = var12;
                    } else {
                        field2788[var6] = (short) var4.method97(30570);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2785[var6] = var12;
                    } else {
                        field2785[var6] = (short) var4.method97(30570);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2775[var6] = var12;
                    } else {
                        field2775[var6] = (short) var4.method97(30570);
                    }
                    field2784[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2788[var6] = (short) (((field2788[var6] & 0xFF) << 3) + (field2788[var6] >> 8 & 0x7));
                        field2785[var6] = (short) (((field2785[var6] & 0xFF) << 3) + (field2785[var6] >> 8 & 0x7));
                        field2775[var6] = (short) (((field2775[var6] & 0xFF) << 3) + (field2775[var6] >> 8 & 0x7));
                        field2788[var6] = (short) (field2788[var6] << 3);
                        field2785[var6] = (short) (field2785[var6] << 3);
                        field2775[var6] = (short) (field2775[var6] << 3);
                    }
                    field2774[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2774[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2786 = true;
                    } else if (var10 == 7) {
                        this.field2777 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2781 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field165) {
                throw new RuntimeException();
            }
            this.field2782 = var6;
            this.field2779 = new short[var6];
            this.field2778 = new short[var6];
            this.field2776 = new short[var6];
            this.field2789 = new short[var6];
            this.field2783 = new short[var6];
            this.field2787 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2779[var13] = field2780[var13];
                this.field2778[var13] = field2788[var13];
                this.field2776[var13] = field2785[var13];
                this.field2789[var13] = field2775[var13];
                this.field2783[var13] = field2774[var13];
                this.field2787[var13] = field2784[var13];
            }
        } catch (Exception var14) {
            this.field2782 = 0;
            this.field2786 = false;
            this.field2777 = false;
        }
    }
}
