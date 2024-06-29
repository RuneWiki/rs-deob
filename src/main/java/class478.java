import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class478 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lhl;")
    public class367 field6977 = null;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public boolean field6981 = false;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field6983 = 0;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Z")
    public boolean field6987 = false;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Z")
    public boolean field6990 = false;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "[S")
    public short[] field6991;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[S")
    public short[] field6985;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[S")
    public short[] field6992;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[S")
    public short[] field6984;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "[S")
    public short[] field6988;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "[B")
    public byte[] field6986;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[B")
    private static byte[] field6980 = new byte[500];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[S")
    private static short[] field6979 = new short[500];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[S")
    private static short[] field6978 = new short[500];

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[S")
    private static short[] field6989 = new short[500];

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[S")
    private static short[] field6982 = new short[500];

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[S")
    private static short[] field6993 = new short[500];

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([BLhl;)V", line = 62)
    public class478(byte[] arg0, class367 arg1) {
        this.field6977 = arg1;
        try {
            class391 var3 = new class391(arg0);
            class391 var4 = new class391(arg0);
            var3.field5719 = 2;
            int var5 = var3.method2348(-2);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5719 = var3.field5719 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field6977.field5392[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2348(-2);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field6989[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field6993[var6] = var12;
                    } else {
                        field6993[var6] = (short) var4.method2354((byte) -54);
                    }
                    if ((var11 & 0x2) == 0) {
                        field6982[var6] = var12;
                    } else {
                        field6982[var6] = (short) var4.method2354((byte) -54);
                    }
                    if ((var11 & 0x4) == 0) {
                        field6978[var6] = var12;
                    } else {
                        field6978[var6] = (short) var4.method2354((byte) -54);
                    }
                    field6980[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field6993[var6] = (short) (((field6993[var6] & 0xFF) << 3) + (field6993[var6] >> 8 & 0x7));
                        field6982[var6] = (short) (((field6982[var6] & 0xFF) << 3) + (field6982[var6] >> 8 & 0x7));
                        field6978[var6] = (short) (((field6978[var6] & 0xFF) << 3) + (field6978[var6] >> 8 & 0x7));
                        field6993[var6] = (short) (field6993[var6] << 3);
                        field6982[var6] = (short) (field6982[var6] << 3);
                        field6978[var6] = (short) (field6978[var6] << 3);
                    }
                    field6979[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field6979[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field6990 = true;
                    } else if (var10 == 7) {
                        this.field6981 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field6987 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5719) {
                throw new RuntimeException();
            }
            this.field6983 = var6;
            this.field6991 = new short[var6];
            this.field6985 = new short[var6];
            this.field6992 = new short[var6];
            this.field6984 = new short[var6];
            this.field6988 = new short[var6];
            this.field6986 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field6991[var13] = field6989[var13];
                this.field6985[var13] = field6993[var13];
                this.field6992[var13] = field6982[var13];
                this.field6984[var13] = field6978[var13];
                this.field6988[var13] = field6979[var13];
                this.field6986[var13] = field6980[var13];
            }
        } catch (Exception var14) {
            this.field6983 = 0;
            this.field6990 = false;
            this.field6981 = false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 16)
    public static void method2804() {
        field6989 = null;
        field6993 = null;
        field6982 = null;
        field6978 = null;
        field6979 = null;
        field6980 = null;
    }
}
