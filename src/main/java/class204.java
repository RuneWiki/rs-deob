import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class204 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field2993 = 0;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Z")
    public boolean field2999 = false;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
    public boolean field2992 = false;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lod;")
    public class466 field3000 = null;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Z")
    public boolean field3006 = false;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[S")
    public short[] field3002;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[S")
    public short[] field3005;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[S")
    public short[] field3004;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[S")
    public short[] field2998;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[S")
    public short[] field2995;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[B")
    public byte[] field2991;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[S")
    private static short[] field2994 = new short[500];

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[S")
    private static short[] field2997 = new short[500];

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[B")
    private static byte[] field3003 = new byte[500];

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[S")
    private static short[] field2996 = new short[500];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[S")
    private static short[] field3001 = new short[500];

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "[S")
    private static short[] field3007 = new short[500];

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([BLod;)V", line = 62)
    public class204(byte[] arg0, class466 arg1) {
        this.field3000 = arg1;
        try {
            class96 var3 = new class96(arg0);
            class96 var4 = new class96(arg0);
            var3.method718(98);
            var3.field1301 += 2;
            int var5 = var3.method718(123);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1301 = var3.field1301 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3000.field6549[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method718(-92);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3001[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3007[var6] = var12;
                    } else {
                        field3007[var6] = (short) var4.method709(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2997[var6] = var12;
                    } else {
                        field2997[var6] = (short) var4.method709(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2994[var6] = var12;
                    } else {
                        field2994[var6] = (short) var4.method709(false);
                    }
                    field3003[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field3007[var6] = (short) (field3007[var6] << 2 & 0x3FFF);
                        field2997[var6] = (short) (field2997[var6] << 2 & 0x3FFF);
                        field2994[var6] = (short) (field2994[var6] << 2 & 0x3FFF);
                    }
                    field2996[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2996[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2992 = true;
                    } else if (var10 == 7) {
                        this.field3006 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2999 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1301) {
                throw new RuntimeException();
            }
            this.field2993 = var6;
            this.field3002 = new short[var6];
            this.field3005 = new short[var6];
            this.field3004 = new short[var6];
            this.field2998 = new short[var6];
            this.field2995 = new short[var6];
            this.field2991 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3002[var13] = field3001[var13];
                this.field3005[var13] = field3007[var13];
                this.field3004[var13] = field2997[var13];
                this.field2998[var13] = field2994[var13];
                this.field2995[var13] = field2996[var13];
                this.field2991[var13] = field3003[var13];
            }
        } catch (Exception var14) {
            this.field2993 = 0;
            this.field2992 = false;
            this.field3006 = false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 17)
    public static void method1359() {
        field3001 = null;
        field3007 = null;
        field2997 = null;
        field2994 = null;
        field2996 = null;
        field3003 = null;
    }
}
