import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class266 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field4738 = -1;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Z")
    public boolean field4742 = false;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lok;")
    public class40 field4748 = null;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
    public boolean field4749 = false;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[S")
    public short[] field4745;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[S")
    public short[] field4744;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[S")
    public short[] field4746;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[S")
    public short[] field4752;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[S")
    public short[] field4741;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[B")
    public byte[] field4750;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[S")
    private static short[] field4737 = new short[500];

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[S")
    private static short[] field4739 = new short[500];

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[S")
    private static short[] field4740 = new short[500];

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[B")
    private static byte[] field4747 = new byte[500];

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[S")
    private static short[] field4743 = new short[500];

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[S")
    private static short[] field4751 = new short[500];

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
    public static void method1851() {
        field4739 = null;
        field4740 = null;
        field4751 = null;
        field4737 = null;
        field4743 = null;
        field4747 = null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([BLok;)V")
    public class266(byte[] arg0, class40 arg1) {
        this.field4748 = arg1;
        class74 var3 = new class74(arg0);
        class74 var4 = new class74(arg0);
        var3.field1340 = 2;
        int var5 = var3.method489((byte) -22);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1340 = var3.field1340 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field4748.field634[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method489((byte) -50);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field4739[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field4740[var6] = var13;
                } else {
                    field4740[var6] = (short) var4.method486(-15839);
                }
                if ((var12 & 0x2) == 0) {
                    field4751[var6] = var13;
                } else {
                    field4751[var6] = (short) var4.method486(-15839);
                }
                if ((var12 & 0x4) == 0) {
                    field4737[var6] = var13;
                } else {
                    field4737[var6] = (short) var4.method486(-15839);
                }
                field4747[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field4740[var6] = (short) (((field4740[var6] & 0xFF) << 3) + (field4740[var6] >> 8 & 0x7));
                    field4751[var6] = (short) (((field4751[var6] & 0xFF) << 3) + (field4751[var6] >> 8 & 0x7));
                    field4737[var6] = (short) (((field4737[var6] & 0xFF) << 3) + (field4737[var6] >> 8 & 0x7));
                }
                field4743[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field4743[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field4742 = true;
                } else if (var11 == 7) {
                    this.field4749 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1340) {
            throw new RuntimeException();
        }
        this.field4738 = var6;
        this.field4745 = new short[var6];
        this.field4744 = new short[var6];
        this.field4746 = new short[var6];
        this.field4752 = new short[var6];
        this.field4741 = new short[var6];
        this.field4750 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4745[var10] = field4739[var10];
            this.field4744[var10] = field4740[var10];
            this.field4746[var10] = field4751[var10];
            this.field4752[var10] = field4737[var10];
            this.field4741[var10] = field4743[var10];
            this.field4750[var10] = field4747[var10];
        }
    }
}
