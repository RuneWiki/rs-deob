import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class201 {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Z")
    public boolean field2877 = false;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
    public boolean field2875 = false;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Z")
    public boolean field2881 = false;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lgg;")
    public class119 field2885 = null;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public int field2886 = 0;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[S")
    public short[] field2873;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[S")
    public short[] field2880;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[S")
    public short[] field2879;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[S")
    public short[] field2876;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[S")
    public short[] field2882;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[B")
    public byte[] field2887;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[S")
    private static short[] field2872 = new short[500];

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[B")
    private static byte[] field2878 = new byte[500];

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "[S")
    private static short[] field2884 = new short[500];

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "[S")
    private static short[] field2888 = new short[500];

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[S")
    private static short[] field2883 = new short[500];

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[S")
    private static short[] field2874 = new short[500];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 7)
    public static void method1297() {
        field2872 = null;
        field2883 = null;
        field2884 = null;
        field2888 = null;
        field2874 = null;
        field2878 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([BLgg;)V", line = 65)
    public class201(byte[] arg0, class119 arg1) {
        this.field2885 = arg1;
        try {
            class403 var3 = new class403(arg0);
            class403 var4 = new class403(arg0);
            var3.field5665 = 2;
            int var5 = var3.method2357((byte) 113);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5665 = var3.field5665 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2885.field1649[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2357((byte) 113);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2872[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2883[var6] = var12;
                    } else {
                        field2883[var6] = (short) var4.method2360(118);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2884[var6] = var12;
                    } else {
                        field2884[var6] = (short) var4.method2360(127);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2888[var6] = var12;
                    } else {
                        field2888[var6] = (short) var4.method2360(117);
                    }
                    field2878[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2883[var6] = (short) (((field2883[var6] & 0xFF) << 3) + (field2883[var6] >> 8 & 0x7));
                        field2884[var6] = (short) (((field2884[var6] & 0xFF) << 3) + (field2884[var6] >> 8 & 0x7));
                        field2888[var6] = (short) (((field2888[var6] & 0xFF) << 3) + (field2888[var6] >> 8 & 0x7));
                        field2883[var6] = (short) (field2883[var6] << 3);
                        field2884[var6] = (short) (field2884[var6] << 3);
                        field2888[var6] = (short) (field2888[var6] << 3);
                    }
                    field2874[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2874[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2881 = true;
                    } else if (var10 == 7) {
                        this.field2875 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2877 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5665) {
                throw new RuntimeException();
            }
            this.field2886 = var6;
            this.field2873 = new short[var6];
            this.field2880 = new short[var6];
            this.field2879 = new short[var6];
            this.field2876 = new short[var6];
            this.field2882 = new short[var6];
            this.field2887 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2873[var13] = field2872[var13];
                this.field2880[var13] = field2883[var13];
                this.field2879[var13] = field2884[var13];
                this.field2876[var13] = field2888[var13];
                this.field2882[var13] = field2874[var13];
                this.field2887[var13] = field2878[var13];
            }
        } catch (Exception var14) {
            this.field2886 = 0;
            this.field2881 = false;
            this.field2875 = false;
        }
    }
}
