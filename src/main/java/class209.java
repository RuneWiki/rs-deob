import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class209 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Ldg;")
    public class142 field2982 = null;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Z")
    public boolean field2986 = false;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
    public boolean field2980 = false;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field2981 = -1;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[S")
    public short[] field2984;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[S")
    public short[] field2985;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[S")
    public short[] field2988;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "[S")
    public short[] field2990;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "[S")
    public short[] field2992;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "[B")
    public byte[] field2994;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[B")
    private static byte[] field2983 = new byte[500];

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "[S")
    private static short[] field2991 = new short[500];

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[S")
    private static short[] field2987 = new short[500];

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "[S")
    private static short[] field2989 = new short[500];

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "[S")
    private static short[] field2993 = new short[500];

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "[S")
    private static short[] field2995 = new short[500];

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
    public static void method1358() {
        field2995 = null;
        field2993 = null;
        field2987 = null;
        field2989 = null;
        field2991 = null;
        field2983 = null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "([BLdg;)V")
    public class209(byte[] arg0, class142 arg1) {
        this.field2982 = arg1;
        class224 var3 = new class224(arg0);
        class224 var4 = new class224(arg0);
        var3.field3402 = 2;
        int var5 = var3.method1453((byte) -127);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3402 = var3.field3402 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2982.field1970[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1453((byte) -128);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2995[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2993[var6] = var13;
                } else {
                    field2993[var6] = (short) var4.method1471((byte) -120);
                }
                if ((var12 & 0x2) == 0) {
                    field2987[var6] = var13;
                } else {
                    field2987[var6] = (short) var4.method1471((byte) -65);
                }
                if ((var12 & 0x4) == 0) {
                    field2989[var6] = var13;
                } else {
                    field2989[var6] = (short) var4.method1471((byte) -72);
                }
                field2983[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field2993[var6] = (short) (((field2993[var6] & 0xFF) << 3) + (field2993[var6] >> 8 & 0x7));
                    field2987[var6] = (short) (((field2987[var6] & 0xFF) << 3) + (field2987[var6] >> 8 & 0x7));
                    field2989[var6] = (short) (((field2989[var6] & 0xFF) << 3) + (field2989[var6] >> 8 & 0x7));
                }
                field2991[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2991[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2980 = true;
                } else if (var11 == 7) {
                    this.field2986 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3402) {
            throw new RuntimeException();
        }
        this.field2981 = var6;
        this.field2984 = new short[var6];
        this.field2985 = new short[var6];
        this.field2988 = new short[var6];
        this.field2990 = new short[var6];
        this.field2992 = new short[var6];
        this.field2994 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2984[var10] = field2995[var10];
            this.field2985[var10] = field2993[var10];
            this.field2988[var10] = field2987[var10];
            this.field2990[var10] = field2989[var10];
            this.field2992[var10] = field2991[var10];
            this.field2994[var10] = field2983[var10];
        }
    }
}
