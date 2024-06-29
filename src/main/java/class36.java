import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class36 {

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field723 = -1;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lga;")
    public class67 field721 = null;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
    public boolean field722 = false;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[S")
    public short[] field724;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[S")
    public short[] field725;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[S")
    public short[] field717;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[S")
    public short[] field726;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[S")
    public short[] field718;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[S")
    private static short[] field715 = new short[500];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[S")
    private static short[] field716 = new short[500];

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[S")
    private static short[] field720 = new short[500];

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[S")
    private static short[] field719 = new short[500];

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[S")
    private static short[] field727 = new short[500];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static void method299() {
        field727 = null;
        field719 = null;
        field715 = null;
        field720 = null;
        field716 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([BLga;)V")
    public class36(byte[] arg0, class67 arg1) {
        this.field721 = arg1;
        class28 var3 = new class28(arg0);
        class28 var4 = new class28(arg0);
        var3.field526 = 2;
        int var5 = var3.method215(-1797813752);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field526 = var3.field526 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field721.field1201[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method215(-1797813752);
            if (var11 > 0) {
                if (this.field721.field1201[var9] == 0) {
                    var8 = var9;
                }
                field727[var6] = (short) var9;
                short var12 = 0;
                if (this.field721.field1201[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field719[var6] = var12;
                } else {
                    field719[var6] = (short) var4.method213(true);
                }
                if ((var11 & 0x2) == 0) {
                    field715[var6] = var12;
                } else {
                    field715[var6] = (short) var4.method213(true);
                }
                if ((var11 & 0x4) == 0) {
                    field720[var6] = var12;
                } else {
                    field720[var6] = (short) var4.method213(true);
                }
                if (this.field721.field1201[var9] == 2) {
                    field719[var6] = (short) (((field719[var6] & 0xFF) << 3) + (field719[var6] >> 8 & 0x7));
                    field715[var6] = (short) (((field715[var6] & 0xFF) << 3) + (field715[var6] >> 8 & 0x7));
                    field720[var6] = (short) (((field720[var6] & 0xFF) << 3) + (field720[var6] >> 8 & 0x7));
                }
                field716[var6] = -1;
                if (this.field721.field1201[var9] >= 1 && this.field721.field1201[var9] <= 3 && var7 > var8) {
                    field716[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field721.field1201[var9] == 5) {
                    this.field722 = true;
                }
            }
        }
        if (arg0.length != var4.field526) {
            throw new RuntimeException();
        }
        this.field723 = var6;
        this.field724 = new short[var6];
        this.field725 = new short[var6];
        this.field717 = new short[var6];
        this.field726 = new short[var6];
        this.field718 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field724[var10] = field727[var10];
            this.field725[var10] = field719[var10];
            this.field717[var10] = field715[var10];
            this.field726[var10] = field720[var10];
            this.field718[var10] = field716[var10];
        }
    }
}
