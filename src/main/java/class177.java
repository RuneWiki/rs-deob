import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class177 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Z")
    public boolean field2947 = false;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field2952 = -1;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
    public boolean field2959 = false;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lol;")
    public class111 field2953 = null;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[S")
    public short[] field2948;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[S")
    public short[] field2949;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "[S")
    public short[] field2957;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "[S")
    public short[] field2951;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "[S")
    public short[] field2956;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[B")
    public byte[] field2961;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[S")
    private static short[] field2950 = new short[500];

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "[B")
    private static byte[] field2955 = new byte[500];

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "[S")
    private static short[] field2954 = new short[500];

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "[S")
    private static short[] field2958 = new short[500];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[S")
    private static short[] field2946 = new short[500];

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[S")
    private static short[] field2960 = new short[500];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
    public static void method1262() {
        field2950 = null;
        field2954 = null;
        field2946 = null;
        field2960 = null;
        field2958 = null;
        field2955 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([BLol;)V")
    public class177(byte[] arg0, class111 arg1) {
        this.field2953 = arg1;
        class136 var3 = new class136(arg0);
        class136 var4 = new class136(arg0);
        var3.field2231 = 2;
        int var5 = var3.method1012(4);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2231 = var3.field2231 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2953.field1715[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1012(4);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2950[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2954[var6] = var13;
                } else {
                    field2954[var6] = (short) var4.method992(-31623);
                }
                if ((var12 & 0x2) == 0) {
                    field2946[var6] = var13;
                } else {
                    field2946[var6] = (short) var4.method992(-31623);
                }
                if ((var12 & 0x4) == 0) {
                    field2960[var6] = var13;
                } else {
                    field2960[var6] = (short) var4.method992(-31623);
                }
                field2955[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field2954[var6] = (short) (((field2954[var6] & 0xFF) << 3) + (field2954[var6] >> 8 & 0x7));
                    field2946[var6] = (short) (((field2946[var6] & 0xFF) << 3) + (field2946[var6] >> 8 & 0x7));
                    field2960[var6] = (short) (((field2960[var6] & 0xFF) << 3) + (field2960[var6] >> 8 & 0x7));
                }
                field2958[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2958[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2947 = true;
                } else if (var11 == 7) {
                    this.field2959 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2231) {
            throw new RuntimeException();
        }
        this.field2952 = var6;
        this.field2948 = new short[var6];
        this.field2949 = new short[var6];
        this.field2957 = new short[var6];
        this.field2951 = new short[var6];
        this.field2956 = new short[var6];
        this.field2961 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2948[var10] = field2950[var10];
            this.field2949[var10] = field2954[var10];
            this.field2957[var10] = field2946[var10];
            this.field2951[var10] = field2960[var10];
            this.field2956[var10] = field2958[var10];
            this.field2961[var10] = field2955[var10];
        }
    }
}
