import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class241 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
    public boolean field3966 = false;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lik;")
    public class75 field3967 = null;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public int field3976 = -1;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Z")
    public boolean field3978 = false;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[S")
    public short[] field3973;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[S")
    public short[] field3972;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "[S")
    public short[] field3979;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[S")
    public short[] field3969;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[S")
    public short[] field3965;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "[B")
    public byte[] field3980;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[S")
    private static short[] field3968 = new short[500];

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[S")
    private static short[] field3970 = new short[500];

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[S")
    private static short[] field3971 = new short[500];

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[S")
    private static short[] field3974 = new short[500];

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[S")
    private static short[] field3975 = new short[500];

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "[B")
    private static byte[] field3977 = new byte[500];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
    public static void method1689() {
        field3971 = null;
        field3968 = null;
        field3974 = null;
        field3975 = null;
        field3970 = null;
        field3977 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([BLik;)V")
    public class241(byte[] arg0, class75 arg1) {
        this.field3967 = arg1;
        class96 var3 = new class96(arg0);
        class96 var4 = new class96(arg0);
        var3.field1228 = 2;
        int var5 = var3.method584(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1228 = var3.field1228 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field3967.field939[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method584(255);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field3971[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field3968[var6] = var13;
                } else {
                    field3968[var6] = (short) var4.method565(-95);
                }
                if ((var12 & 0x2) == 0) {
                    field3974[var6] = var13;
                } else {
                    field3974[var6] = (short) var4.method565(-82);
                }
                if ((var12 & 0x4) == 0) {
                    field3975[var6] = var13;
                } else {
                    field3975[var6] = (short) var4.method565(-65);
                }
                field3977[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field3968[var6] = (short) (((field3968[var6] & 0xFF) << 3) + (field3968[var6] >> 8 & 0x7));
                    field3974[var6] = (short) (((field3974[var6] & 0xFF) << 3) + (field3974[var6] >> 8 & 0x7));
                    field3975[var6] = (short) (((field3975[var6] & 0xFF) << 3) + (field3975[var6] >> 8 & 0x7));
                }
                field3970[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field3970[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field3978 = true;
                } else if (var11 == 7) {
                    this.field3966 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1228) {
            throw new RuntimeException();
        }
        this.field3976 = var6;
        this.field3973 = new short[var6];
        this.field3972 = new short[var6];
        this.field3979 = new short[var6];
        this.field3969 = new short[var6];
        this.field3965 = new short[var6];
        this.field3980 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3973[var10] = field3971[var10];
            this.field3972[var10] = field3968[var10];
            this.field3979[var10] = field3974[var10];
            this.field3969[var10] = field3975[var10];
            this.field3965[var10] = field3970[var10];
            this.field3980[var10] = field3977[var10];
        }
    }
}
