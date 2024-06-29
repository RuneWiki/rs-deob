import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class190 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lua;")
    public class111 field3436 = null;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Z")
    public boolean field3445 = false;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field3446 = -1;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "[S")
    public short[] field3447;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[S")
    public short[] field3442;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[S")
    public short[] field3437;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "[S")
    public short[] field3443;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[S")
    public short[] field3448;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[S")
    private static short[] field3444 = new short[500];

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[S")
    private static short[] field3438 = new short[500];

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[S")
    private static short[] field3439 = new short[500];

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[S")
    private static short[] field3440 = new short[500];

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[S")
    private static short[] field3441 = new short[500];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public static void method1378() {
        field3439 = null;
        field3441 = null;
        field3438 = null;
        field3440 = null;
        field3444 = null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([BLua;)V")
    public class190(byte[] arg0, class111 arg1) {
        this.field3436 = arg1;
        class128 var3 = new class128(arg0);
        class128 var4 = new class128(arg0);
        var3.field2379 = 2;
        int var5 = var3.method937(false);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2379 = var3.field2379 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3436.field2106[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method937(false);
            if (var11 > 0) {
                if (this.field3436.field2106[var9] == 0) {
                    var8 = var9;
                }
                field3439[var6] = (short) var9;
                short var12 = 0;
                if (this.field3436.field2106[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3441[var6] = var12;
                } else {
                    field3441[var6] = (short) var4.method929(false);
                }
                if ((var11 & 0x2) == 0) {
                    field3438[var6] = var12;
                } else {
                    field3438[var6] = (short) var4.method929(false);
                }
                if ((var11 & 0x4) == 0) {
                    field3440[var6] = var12;
                } else {
                    field3440[var6] = (short) var4.method929(false);
                }
                if (this.field3436.field2106[var9] == 2) {
                    field3441[var6] = (short) (((field3441[var6] & 0xFF) << 3) + (field3441[var6] >> 8 & 0x7));
                    field3438[var6] = (short) (((field3438[var6] & 0xFF) << 3) + (field3438[var6] >> 8 & 0x7));
                    field3440[var6] = (short) (((field3440[var6] & 0xFF) << 3) + (field3440[var6] >> 8 & 0x7));
                }
                field3444[var6] = -1;
                if (this.field3436.field2106[var9] >= 1 && this.field3436.field2106[var9] <= 3 && var7 > var8) {
                    field3444[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3436.field2106[var9] == 5) {
                    this.field3445 = true;
                }
            }
        }
        if (arg0.length != var4.field2379) {
            throw new RuntimeException();
        }
        this.field3446 = var6;
        this.field3447 = new short[var6];
        this.field3442 = new short[var6];
        this.field3437 = new short[var6];
        this.field3443 = new short[var6];
        this.field3448 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3447[var10] = field3439[var10];
            this.field3442[var10] = field3441[var10];
            this.field3437[var10] = field3438[var10];
            this.field3443[var10] = field3440[var10];
            this.field3448[var10] = field3444[var10];
        }
    }
}
