import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class59 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Z")
    public boolean field968 = false;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lkd;")
    public class209 field972 = null;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public int field973 = -1;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Z")
    public boolean field967 = false;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[S")
    public short[] field974;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[S")
    public short[] field975;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[S")
    public short[] field961;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[S")
    public short[] field964;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[S")
    public short[] field962;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[B")
    public byte[] field969;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[B")
    private static byte[] field970 = new byte[500];

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[S")
    private static short[] field965 = new short[500];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[S")
    private static short[] field971 = new short[500];

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[S")
    private static short[] field966 = new short[500];

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[S")
    private static short[] field963 = new short[500];

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "[S")
    private static short[] field976 = new short[500];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
    public static void method446() {
        field965 = null;
        field963 = null;
        field966 = null;
        field971 = null;
        field976 = null;
        field970 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([BLkd;)V")
    public class59(byte[] arg0, class209 arg1) {
        this.field972 = arg1;
        class88 var3 = new class88(arg0);
        class88 var4 = new class88(arg0);
        var3.field1535 = 2;
        int var5 = var3.method633(73);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1535 = var3.field1535 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field972.field3253[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method633(110);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field965[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field963[var6] = var13;
                } else {
                    field963[var6] = (short) var4.method667(1210551352);
                }
                if ((var12 & 0x2) == 0) {
                    field966[var6] = var13;
                } else {
                    field966[var6] = (short) var4.method667(1210551352);
                }
                if ((var12 & 0x4) == 0) {
                    field971[var6] = var13;
                } else {
                    field971[var6] = (short) var4.method667(1210551352);
                }
                field970[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field963[var6] = (short) (((field963[var6] & 0xFF) << 3) + (field963[var6] >> 8 & 0x7));
                    field966[var6] = (short) (((field966[var6] & 0xFF) << 3) + (field966[var6] >> 8 & 0x7));
                    field971[var6] = (short) (((field971[var6] & 0xFF) << 3) + (field971[var6] >> 8 & 0x7));
                }
                field976[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field976[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field967 = true;
                } else if (var11 == 7) {
                    this.field968 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1535) {
            throw new RuntimeException();
        }
        this.field973 = var6;
        this.field974 = new short[var6];
        this.field975 = new short[var6];
        this.field961 = new short[var6];
        this.field964 = new short[var6];
        this.field962 = new short[var6];
        this.field969 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field974[var10] = field965[var10];
            this.field975[var10] = field963[var10];
            this.field961[var10] = field966[var10];
            this.field964[var10] = field971[var10];
            this.field962[var10] = field976[var10];
            this.field969[var10] = field970[var10];
        }
    }
}
