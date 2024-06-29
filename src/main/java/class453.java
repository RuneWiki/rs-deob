import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class453 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public int field6957 = 0;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Z")
    public boolean field6960 = false;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Z")
    public boolean field6966 = false;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Leb;")
    public class424 field6962 = null;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
    public boolean field6970 = false;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[S")
    public short[] field6961;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[S")
    public short[] field6968;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[S")
    public short[] field6973;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[S")
    public short[] field6959;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[S")
    public short[] field6965;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[B")
    public byte[] field6967;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[S")
    private static short[] field6964 = new short[500];

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[S")
    private static short[] field6958 = new short[500];

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[S")
    private static short[] field6969 = new short[500];

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[S")
    private static short[] field6963 = new short[500];

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "[B")
    private static byte[] field6971 = new byte[500];

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[S")
    private static short[] field6972 = new short[500];

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([BLeb;)V", line = 61)
    public class453(byte[] arg0, class424 arg1) {
        this.field6962 = arg1;
        try {
            class40 var3 = new class40(arg0);
            class40 var4 = new class40(arg0);
            var3.field585 = 2;
            int var5 = var3.method257((byte) 79);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field585 = var3.field585 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field6962.field6088[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method257((byte) 90);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field6972[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field6964[var6] = var12;
                    } else {
                        field6964[var6] = (short) var4.method271(255);
                    }
                    if ((var11 & 0x2) == 0) {
                        field6958[var6] = var12;
                    } else {
                        field6958[var6] = (short) var4.method271(255);
                    }
                    if ((var11 & 0x4) == 0) {
                        field6963[var6] = var12;
                    } else {
                        field6963[var6] = (short) var4.method271(255);
                    }
                    field6971[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field6964[var6] = (short) (((field6964[var6] & 0xFF) << 3) + (field6964[var6] >> 8 & 0x7));
                        field6958[var6] = (short) (((field6958[var6] & 0xFF) << 3) + (field6958[var6] >> 8 & 0x7));
                        field6963[var6] = (short) (((field6963[var6] & 0xFF) << 3) + (field6963[var6] >> 8 & 0x7));
                        field6964[var6] = (short) (field6964[var6] << 3);
                        field6958[var6] = (short) (field6958[var6] << 3);
                        field6963[var6] = (short) (field6963[var6] << 3);
                    }
                    field6969[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field6969[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field6970 = true;
                    } else if (var10 == 7) {
                        this.field6966 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field6960 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field585) {
                throw new RuntimeException();
            }
            this.field6957 = var6;
            this.field6961 = new short[var6];
            this.field6968 = new short[var6];
            this.field6973 = new short[var6];
            this.field6959 = new short[var6];
            this.field6965 = new short[var6];
            this.field6967 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field6961[var13] = field6972[var13];
                this.field6968[var13] = field6964[var13];
                this.field6973[var13] = field6958[var13];
                this.field6959[var13] = field6963[var13];
                this.field6965[var13] = field6969[var13];
                this.field6967[var13] = field6971[var13];
            }
        } catch (Exception var14) {
            this.field6957 = 0;
            this.field6970 = false;
            this.field6966 = false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 38)
    public static void method2701() {
        field6972 = null;
        field6964 = null;
        field6958 = null;
        field6963 = null;
        field6969 = null;
        field6971 = null;
    }
}
