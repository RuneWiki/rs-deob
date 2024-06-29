import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class35 {

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lga;")
    public class131 field640 = null;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field633 = -1;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Z")
    public boolean field642 = false;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[S")
    public short[] field637;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "[S")
    public short[] field644;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[S")
    public short[] field634;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[S")
    public short[] field645;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[S")
    public short[] field643;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[S")
    private static short[] field638 = new short[500];

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[S")
    private static short[] field636 = new short[500];

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[S")
    private static short[] field641 = new short[500];

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[S")
    private static short[] field639 = new short[500];

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[S")
    private static short[] field635 = new short[500];

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V")
    public static void method222() {
        field639 = null;
        field641 = null;
        field635 = null;
        field636 = null;
        field638 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([BLga;)V")
    public class35(byte[] arg0, class131 arg1) {
        this.field640 = arg1;
        class75 var3 = new class75(arg0);
        class75 var4 = new class75(arg0);
        var3.field1380 = 2;
        int var5 = var3.method558(1);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1380 = var3.field1380 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field640.field2403[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method558(1);
            if (var11 > 0) {
                if (this.field640.field2403[var9] == 0) {
                    var8 = var9;
                }
                field639[var6] = (short) var9;
                short var12 = 0;
                if (this.field640.field2403[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field641[var6] = var12;
                } else {
                    field641[var6] = (short) var4.method549(-54);
                }
                if ((var11 & 0x2) == 0) {
                    field635[var6] = var12;
                } else {
                    field635[var6] = (short) var4.method549(-99);
                }
                if ((var11 & 0x4) == 0) {
                    field636[var6] = var12;
                } else {
                    field636[var6] = (short) var4.method549(-115);
                }
                if (this.field640.field2403[var9] == 2) {
                    field641[var6] = (short) (((field641[var6] & 0xFF) << 3) + (field641[var6] >> 8 & 0x7));
                    field635[var6] = (short) (((field635[var6] & 0xFF) << 3) + (field635[var6] >> 8 & 0x7));
                    field636[var6] = (short) (((field636[var6] & 0xFF) << 3) + (field636[var6] >> 8 & 0x7));
                }
                field638[var6] = -1;
                if (this.field640.field2403[var9] >= 1 && this.field640.field2403[var9] <= 3 && var7 > var8) {
                    field638[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field640.field2403[var9] == 5) {
                    this.field642 = true;
                }
            }
        }
        if (arg0.length != var4.field1380) {
            throw new RuntimeException();
        }
        this.field633 = var6;
        this.field637 = new short[var6];
        this.field644 = new short[var6];
        this.field634 = new short[var6];
        this.field645 = new short[var6];
        this.field643 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field637[var10] = field639[var10];
            this.field644[var10] = field641[var10];
            this.field634[var10] = field635[var10];
            this.field645[var10] = field636[var10];
            this.field643[var10] = field638[var10];
        }
    }
}
