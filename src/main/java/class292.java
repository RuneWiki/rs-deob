import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class292 {

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field4772 = -1;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lub;")
    public class192 field4775 = null;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Z")
    public boolean field4779 = false;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[S")
    public short[] field4770;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[S")
    public short[] field4777;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[S")
    public short[] field4771;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[S")
    public short[] field4774;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[S")
    public short[] field4769;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[S")
    private static short[] field4768 = new short[500];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[S")
    private static short[] field4767 = new short[500];

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[S")
    private static short[] field4773 = new short[500];

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[S")
    private static short[] field4776 = new short[500];

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[S")
    private static short[] field4778 = new short[500];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 15)
    public static void method1990() {
        field4778 = null;
        field4776 = null;
        field4768 = null;
        field4773 = null;
        field4767 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([BLub;)V", line = 53)
    public class292(byte[] arg0, class192 arg1) {
        this.field4775 = arg1;
        class164 var3 = new class164(arg0);
        class164 var4 = new class164(arg0);
        var3.field2670 = 2;
        int var5 = var3.method1178(8);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2670 = var3.field2670 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field4775.field3176[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1178(8);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field4778[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4776[var6] = var12;
                } else {
                    field4776[var6] = (short) var4.method1167(119);
                }
                if ((var11 & 0x2) == 0) {
                    field4768[var6] = var12;
                } else {
                    field4768[var6] = (short) var4.method1167(31);
                }
                if ((var11 & 0x4) == 0) {
                    field4773[var6] = var12;
                } else {
                    field4773[var6] = (short) var4.method1167(91);
                }
                if (var10 == 2) {
                    field4776[var6] = (short) (((field4776[var6] & 0xFF) << 3) + (field4776[var6] >> 8 & 0x7));
                    field4768[var6] = (short) (((field4768[var6] & 0xFF) << 3) + (field4768[var6] >> 8 & 0x7));
                    field4773[var6] = (short) (((field4773[var6] & 0xFF) << 3) + (field4773[var6] >> 8 & 0x7));
                }
                field4767[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field4767[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field4779 = true;
                } else if (var10 == 7) {
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2670) {
            throw new RuntimeException();
        }
        this.field4772 = var6;
        this.field4770 = new short[var6];
        this.field4777 = new short[var6];
        this.field4771 = new short[var6];
        this.field4774 = new short[var6];
        this.field4769 = new short[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field4770[var13] = field4778[var13];
            this.field4777[var13] = field4776[var13];
            this.field4771[var13] = field4768[var13];
            this.field4774[var13] = field4773[var13];
            this.field4769[var13] = field4767[var13];
        }
    }
}
