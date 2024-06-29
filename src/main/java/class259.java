import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class259 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
    public boolean field4206 = false;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lwg;")
    public class275 field4217 = null;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Z")
    public boolean field4210 = false;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field4214 = -1;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[S")
    public short[] field4216;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[S")
    public short[] field4213;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[S")
    public short[] field4219;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[S")
    public short[] field4207;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[S")
    public short[] field4211;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[B")
    public byte[] field4215;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[S")
    private static short[] field4209 = new short[500];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[S")
    private static short[] field4212 = new short[500];

    @OriginalMember(owner = "client!s", name = "m", descriptor = "[B")
    private static byte[] field4218 = new byte[500];

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[S")
    private static short[] field4221 = new short[500];

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[S")
    private static short[] field4208 = new short[500];

    @OriginalMember(owner = "client!s", name = "o", descriptor = "[S")
    private static short[] field4220 = new short[500];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
    public static void method1831() {
        field4221 = null;
        field4208 = null;
        field4209 = null;
        field4212 = null;
        field4220 = null;
        field4218 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([BLwg;)V")
    public class259(byte[] arg0, class275 arg1) {
        this.field4217 = arg1;
        class170 var3 = new class170(arg0);
        class170 var4 = new class170(arg0);
        var3.field2676 = 2;
        int var5 = var3.method1218(-30);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2676 = var3.field2676 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field4217.field4458[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1218(-51);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field4221[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field4208[var6] = var13;
                } else {
                    field4208[var6] = (short) var4.method1208(255);
                }
                if ((var12 & 0x2) == 0) {
                    field4209[var6] = var13;
                } else {
                    field4209[var6] = (short) var4.method1208(255);
                }
                if ((var12 & 0x4) == 0) {
                    field4212[var6] = var13;
                } else {
                    field4212[var6] = (short) var4.method1208(255);
                }
                field4218[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field4208[var6] = (short) (((field4208[var6] & 0xFF) << 3) + (field4208[var6] >> 8 & 0x7));
                    field4209[var6] = (short) (((field4209[var6] & 0xFF) << 3) + (field4209[var6] >> 8 & 0x7));
                    field4212[var6] = (short) (((field4212[var6] & 0xFF) << 3) + (field4212[var6] >> 8 & 0x7));
                }
                field4220[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field4220[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field4210 = true;
                } else if (var11 == 7) {
                    this.field4206 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2676) {
            throw new RuntimeException();
        }
        this.field4214 = var6;
        this.field4216 = new short[var6];
        this.field4213 = new short[var6];
        this.field4219 = new short[var6];
        this.field4207 = new short[var6];
        this.field4211 = new short[var6];
        this.field4215 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4216[var10] = field4221[var10];
            this.field4213[var10] = field4208[var10];
            this.field4219[var10] = field4209[var10];
            this.field4207[var10] = field4212[var10];
            this.field4211[var10] = field4220[var10];
            this.field4215[var10] = field4218[var10];
        }
    }
}
