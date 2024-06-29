import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class352 {

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public int field4889 = 0;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Z")
    public boolean field4892 = false;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lib;")
    public class96 field4890 = null;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Z")
    public boolean field4884 = false;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[S")
    public short[] field4880;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[S")
    public short[] field4879;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[S")
    public short[] field4888;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[S")
    public short[] field4891;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[S")
    public short[] field4893;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[B")
    public byte[] field4886;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[S")
    private static short[] field4882 = new short[500];

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[S")
    private static short[] field4878 = new short[500];

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[B")
    private static byte[] field4885 = new byte[500];

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[S")
    private static short[] field4881 = new short[500];

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[S")
    private static short[] field4887 = new short[500];

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[S")
    private static short[] field4883 = new short[500];

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
    public static void method2176() {
        field4887 = null;
        field4881 = null;
        field4882 = null;
        field4883 = null;
        field4878 = null;
        field4885 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([BLib;)V")
    public class352(byte[] arg0, class96 arg1) {
        this.field4890 = arg1;
        try {
            class32 var3 = new class32(arg0);
            class32 var4 = new class32(arg0);
            var3.field456 = 2;
            int var5 = var3.method201((byte) -111);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field456 = var3.field456 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4890.field1407[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method201((byte) -119);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4887[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4881[var6] = var12;
                    } else {
                        field4881[var6] = (short) var4.method204((byte) 84);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4882[var6] = var12;
                    } else {
                        field4882[var6] = (short) var4.method204((byte) 124);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4883[var6] = var12;
                    } else {
                        field4883[var6] = (short) var4.method204((byte) 100);
                    }
                    field4885[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field4881[var6] = (short) (((field4881[var6] & 0xFF) << 3) + (field4881[var6] >> 8 & 0x7));
                        field4882[var6] = (short) (((field4882[var6] & 0xFF) << 3) + (field4882[var6] >> 8 & 0x7));
                        field4883[var6] = (short) (((field4883[var6] & 0xFF) << 3) + (field4883[var6] >> 8 & 0x7));
                        field4881[var6] = (short) (field4881[var6] << 3);
                        field4882[var6] = (short) (field4882[var6] << 3);
                        field4883[var6] = (short) (field4883[var6] << 3);
                    }
                    field4878[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4878[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4892 = true;
                    } else if (var10 == 7) {
                        this.field4884 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field456) {
                throw new RuntimeException();
            }
            this.field4889 = var6;
            this.field4880 = new short[var6];
            this.field4879 = new short[var6];
            this.field4888 = new short[var6];
            this.field4891 = new short[var6];
            this.field4893 = new short[var6];
            this.field4886 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4880[var13] = field4887[var13];
                this.field4879[var13] = field4881[var13];
                this.field4888[var13] = field4882[var13];
                this.field4891[var13] = field4883[var13];
                this.field4893[var13] = field4878[var13];
                this.field4886[var13] = field4885[var13];
            }
        } catch (Exception var14) {
            this.field4889 = 0;
            this.field4892 = false;
            this.field4884 = false;
        }
    }
}
