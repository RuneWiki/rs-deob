import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class566 {

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "Z")
    public boolean field7882 = false;

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
    public int field7894 = 0;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "Lvca;")
    public class760 field7885 = null;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "Z")
    public boolean field7896 = false;

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "Z")
    public boolean field7897 = false;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "[S")
    public short[] field7888;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "[S")
    public short[] field7890;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "[S")
    public short[] field7886;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "[S")
    public short[] field7893;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "[S")
    public short[] field7883;

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "[B")
    public byte[] field7895;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "[S")
    private static short[] field7881 = new short[500];

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "[S")
    private static short[] field7884 = new short[500];

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "[S")
    private static short[] field7887 = new short[500];

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "[S")
    private static short[] field7892 = new short[500];

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "[B")
    private static byte[] field7889 = new byte[500];

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "[S")
    private static short[] field7891 = new short[500];

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "()V", line = 10)
    public static void method3295() {
        field7884 = null;
        field7891 = null;
        field7892 = null;
        field7887 = null;
        field7881 = null;
        field7889 = null;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "([BLvca;)V", line = 65)
    public class566(byte[] arg0, class760 arg1) {
        this.field7885 = arg1;
        try {
            class431 var3 = new class431(arg0);
            class431 var4 = new class431(arg0);
            var3.method2557(14929);
            var3.field5983 += 2;
            int var5 = var3.method2557(14929);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5983 = var3.field5983 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field7885.field10525[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2557(14929);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field7884[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field7891[var6] = var12;
                    } else {
                        field7891[var6] = (short) var4.method2573((byte) 28);
                    }
                    if ((var11 & 0x2) == 0) {
                        field7892[var6] = var12;
                    } else {
                        field7892[var6] = (short) var4.method2573((byte) 28);
                    }
                    if ((var11 & 0x4) == 0) {
                        field7887[var6] = var12;
                    } else {
                        field7887[var6] = (short) var4.method2573((byte) 28);
                    }
                    field7889[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field7891[var6] = (short) (field7891[var6] << 2 & 0x3FFF);
                        field7892[var6] = (short) (field7892[var6] << 2 & 0x3FFF);
                        field7887[var6] = (short) (field7887[var6] << 2 & 0x3FFF);
                    }
                    field7881[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field7881[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field7882 = true;
                    } else if (var10 == 7) {
                        this.field7896 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field7897 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5983) {
                throw new RuntimeException();
            }
            this.field7894 = var6;
            this.field7888 = new short[var6];
            this.field7890 = new short[var6];
            this.field7886 = new short[var6];
            this.field7893 = new short[var6];
            this.field7883 = new short[var6];
            this.field7895 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field7888[var13] = field7884[var13];
                this.field7890[var13] = field7891[var13];
                this.field7886[var13] = field7892[var13];
                this.field7893[var13] = field7887[var13];
                this.field7883[var13] = field7881[var13];
                this.field7895[var13] = field7889[var13];
            }
        } catch (Exception var14) {
            this.field7894 = 0;
            this.field7882 = false;
            this.field7896 = false;
        }
    }
}
