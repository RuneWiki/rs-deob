import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class189 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lco;")
    public class293 field2965 = null;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
    public boolean field2963 = false;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Z")
    public boolean field2973 = false;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public int field2964 = -1;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[S")
    public short[] field2968;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[S")
    public short[] field2962;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[S")
    public short[] field2971;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[S")
    public short[] field2966;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[S")
    public short[] field2961;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[B")
    public byte[] field2976;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[S")
    private static short[] field2970 = new short[500];

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[S")
    private static short[] field2967 = new short[500];

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[S")
    private static short[] field2972 = new short[500];

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[S")
    private static short[] field2969 = new short[500];

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[B")
    private static byte[] field2975 = new byte[500];

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "[S")
    private static short[] field2974 = new short[500];

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([BLco;)V", line = 60)
    public class189(byte[] arg0, class293 arg1) {
        this.field2965 = arg1;
        class25 var3 = new class25(arg0);
        class25 var4 = new class25(arg0);
        var3.field397 = 2;
        int var5 = var3.method281(-124);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field397 = var3.field397 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field2965.field4546[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method281(-127);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field2967[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2969[var6] = var12;
                } else {
                    field2969[var6] = (short) var4.method303((byte) 105);
                }
                if ((var11 & 0x2) == 0) {
                    field2970[var6] = var12;
                } else {
                    field2970[var6] = (short) var4.method303((byte) 105);
                }
                if ((var11 & 0x4) == 0) {
                    field2974[var6] = var12;
                } else {
                    field2974[var6] = (short) var4.method303((byte) 105);
                }
                field2975[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field2969[var6] = (short) (((field2969[var6] & 0xFF) << 3) + (field2969[var6] >> 8 & 0x7));
                    field2970[var6] = (short) (((field2970[var6] & 0xFF) << 3) + (field2970[var6] >> 8 & 0x7));
                    field2974[var6] = (short) (((field2974[var6] & 0xFF) << 3) + (field2974[var6] >> 8 & 0x7));
                }
                field2972[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field2972[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field2963 = true;
                } else if (var10 == 7) {
                    this.field2973 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field397) {
            throw new RuntimeException();
        }
        this.field2964 = var6;
        this.field2968 = new short[var6];
        this.field2962 = new short[var6];
        this.field2971 = new short[var6];
        this.field2966 = new short[var6];
        this.field2961 = new short[var6];
        this.field2976 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field2968[var13] = field2967[var13];
            this.field2962[var13] = field2969[var13];
            this.field2971[var13] = field2970[var13];
            this.field2966[var13] = field2974[var13];
            this.field2961[var13] = field2972[var13];
            this.field2976[var13] = field2975[var13];
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V", line = 30)
    public static void method1450() {
        field2967 = null;
        field2969 = null;
        field2970 = null;
        field2974 = null;
        field2972 = null;
        field2975 = null;
    }
}
