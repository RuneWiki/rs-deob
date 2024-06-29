import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class505 {

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Z")
    public boolean field6986 = false;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public int field6985 = 0;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "Z")
    public boolean field6990 = false;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Lwha;")
    public class299 field6978 = null;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "Z")
    public boolean field6993 = false;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "[S")
    public short[] field6977;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "[S")
    public short[] field6981;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "[S")
    public short[] field6984;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "[S")
    public short[] field6987;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "[S")
    public short[] field6982;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "[B")
    public byte[] field6992;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "[S")
    private static short[] field6979 = new short[500];

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "[B")
    private static byte[] field6983 = new byte[500];

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "[S")
    private static short[] field6988 = new short[500];

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "[S")
    private static short[] field6980 = new short[500];

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "[S")
    private static short[] field6989 = new short[500];

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "[S")
    private static short[] field6991 = new short[500];

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "()V", line = 7)
    public static void method2928() {
        field6991 = null;
        field6988 = null;
        field6979 = null;
        field6980 = null;
        field6989 = null;
        field6983 = null;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "([BLwha;)V", line = 65)
    public class505(byte[] arg0, class299 arg1) {
        this.field6978 = arg1;
        try {
            class376 var3 = new class376(arg0);
            class376 var4 = new class376(arg0);
            var3.method2398(-1372747256);
            var3.field5459 += 2;
            int var5 = var3.method2398(-1372747256);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5459 = var3.field5459 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field6978.field4333[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2398(-1372747256);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field6991[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field6988[var6] = var12;
                    } else {
                        field6988[var6] = (short) var4.method2357(true);
                    }
                    if ((var11 & 0x2) == 0) {
                        field6979[var6] = var12;
                    } else {
                        field6979[var6] = (short) var4.method2357(true);
                    }
                    if ((var11 & 0x4) == 0) {
                        field6980[var6] = var12;
                    } else {
                        field6980[var6] = (short) var4.method2357(true);
                    }
                    field6983[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field6988[var6] = (short) (field6988[var6] << 2 & 0x3FFF);
                        field6979[var6] = (short) (field6979[var6] << 2 & 0x3FFF);
                        field6980[var6] = (short) (field6980[var6] << 2 & 0x3FFF);
                    }
                    field6989[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field6989[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field6993 = true;
                    } else if (var10 == 7) {
                        this.field6990 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field6986 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5459) {
                throw new RuntimeException();
            }
            this.field6985 = var6;
            this.field6977 = new short[var6];
            this.field6981 = new short[var6];
            this.field6984 = new short[var6];
            this.field6987 = new short[var6];
            this.field6982 = new short[var6];
            this.field6992 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field6977[var13] = field6991[var13];
                this.field6981[var13] = field6988[var13];
                this.field6984[var13] = field6979[var13];
                this.field6987[var13] = field6980[var13];
                this.field6982[var13] = field6989[var13];
                this.field6992[var13] = field6983[var13];
            }
        } catch (Exception var14) {
            this.field6985 = 0;
            this.field6993 = false;
            this.field6990 = false;
        }
    }
}
