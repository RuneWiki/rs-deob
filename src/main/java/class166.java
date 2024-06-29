import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class166 {

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public int field2636 = -1;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Lef;")
    public class215 field2639 = null;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Z")
    public boolean field2631 = false;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Z")
    public boolean field2643 = false;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[S")
    public short[] field2632;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[S")
    public short[] field2629;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[S")
    public short[] field2630;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[S")
    public short[] field2634;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[S")
    public short[] field2635;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[B")
    public byte[] field2637;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[S")
    private static short[] field2628 = new short[500];

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[S")
    private static short[] field2633 = new short[500];

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[S")
    private static short[] field2640 = new short[500];

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[B")
    private static byte[] field2638 = new byte[500];

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "[S")
    private static short[] field2642 = new short[500];

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[S")
    private static short[] field2641 = new short[500];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
    public static void method1147() {
        field2628 = null;
        field2642 = null;
        field2641 = null;
        field2640 = null;
        field2633 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([BLef;)V")
    public class166(byte[] arg0, class215 arg1) {
        this.field2639 = arg1;
        class221 var3 = new class221(arg0);
        class221 var4 = new class221(arg0);
        var3.field3655 = 2;
        int var5 = var3.method1517((byte) -96);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3655 = var3.field3655 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2639.field3514[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1517((byte) -96);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2628[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2642[var6] = var13;
                } else {
                    field2642[var6] = (short) var4.method1541(false);
                }
                if ((var12 & 0x2) == 0) {
                    field2641[var6] = var13;
                } else {
                    field2641[var6] = (short) var4.method1541(false);
                }
                if ((var12 & 0x4) == 0) {
                    field2640[var6] = var13;
                } else {
                    field2640[var6] = (short) var4.method1541(false);
                }
                field2638[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field2642[var6] = (short) (((field2642[var6] & 0xFF) << 3) + (field2642[var6] >> 8 & 0x7));
                    field2641[var6] = (short) (((field2641[var6] & 0xFF) << 3) + (field2641[var6] >> 8 & 0x7));
                    field2640[var6] = (short) (((field2640[var6] & 0xFF) << 3) + (field2640[var6] >> 8 & 0x7));
                }
                field2633[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2633[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2643 = true;
                } else if (var11 == 7) {
                    this.field2631 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3655) {
            throw new RuntimeException();
        }
        this.field2636 = var6;
        this.field2632 = new short[var6];
        this.field2629 = new short[var6];
        this.field2630 = new short[var6];
        this.field2634 = new short[var6];
        this.field2635 = new short[var6];
        this.field2637 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2632[var10] = field2628[var10];
            this.field2629[var10] = field2642[var10];
            this.field2630[var10] = field2641[var10];
            this.field2634[var10] = field2640[var10];
            this.field2635[var10] = field2633[var10];
            this.field2637[var10] = field2638[var10];
        }
    }
}
