import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class318 {

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Z")
    public boolean field4965 = false;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lal;")
    public class355 field4971 = null;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field4968 = -1;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Z")
    public boolean field4973 = false;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[S")
    public short[] field4960;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[S")
    public short[] field4958;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[S")
    public short[] field4970;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[S")
    public short[] field4966;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[S")
    public short[] field4969;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[B")
    public byte[] field4967;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[S")
    private static short[] field4961 = new short[500];

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[B")
    private static byte[] field4962 = new byte[500];

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[S")
    private static short[] field4964 = new short[500];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[S")
    private static short[] field4959 = new short[500];

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[S")
    private static short[] field4963 = new short[500];

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[S")
    private static short[] field4972 = new short[500];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 4)
    public static void method2231() {
        field4959 = null;
        field4972 = null;
        field4961 = null;
        field4963 = null;
        field4964 = null;
        field4962 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([BLal;)V", line = 60)
    public class318(byte[] arg0, class355 arg1) {
        this.field4971 = arg1;
        class143 var3 = new class143(arg0);
        class143 var4 = new class143(arg0);
        var3.field2295 = 2;
        int var5 = var3.method1043(true);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2295 = var3.field2295 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field4971.field5650[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1043(true);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field4959[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4972[var6] = var12;
                } else {
                    field4972[var6] = (short) var4.method1023(-10690);
                }
                if ((var11 & 0x2) == 0) {
                    field4961[var6] = var12;
                } else {
                    field4961[var6] = (short) var4.method1023(-10690);
                }
                if ((var11 & 0x4) == 0) {
                    field4963[var6] = var12;
                } else {
                    field4963[var6] = (short) var4.method1023(-10690);
                }
                field4962[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field4972[var6] = (short) (((field4972[var6] & 0xFF) << 3) + (field4972[var6] >> 8 & 0x7));
                    field4961[var6] = (short) (((field4961[var6] & 0xFF) << 3) + (field4961[var6] >> 8 & 0x7));
                    field4963[var6] = (short) (((field4963[var6] & 0xFF) << 3) + (field4963[var6] >> 8 & 0x7));
                }
                field4964[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field4964[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field4973 = true;
                } else if (var10 == 7) {
                    this.field4965 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2295) {
            throw new RuntimeException();
        }
        this.field4968 = var6;
        this.field4960 = new short[var6];
        this.field4958 = new short[var6];
        this.field4970 = new short[var6];
        this.field4966 = new short[var6];
        this.field4969 = new short[var6];
        this.field4967 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field4960[var13] = field4959[var13];
            this.field4958[var13] = field4972[var13];
            this.field4970[var13] = field4961[var13];
            this.field4966[var13] = field4963[var13];
            this.field4969[var13] = field4964[var13];
            this.field4967[var13] = field4962[var13];
        }
    }
}
