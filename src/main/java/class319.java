import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class319 {

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lki;")
    public class191 field4801 = null;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
    public boolean field4795 = false;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Z")
    public boolean field4799 = false;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field4802 = -1;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[S")
    public short[] field4796;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "[S")
    public short[] field4809;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[S")
    public short[] field4798;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[S")
    public short[] field4794;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "[S")
    public short[] field4807;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "[B")
    public byte[] field4803;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[S")
    private static short[] field4797 = new short[500];

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "[B")
    private static byte[] field4800 = new byte[500];

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "[S")
    private static short[] field4806 = new short[500];

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[S")
    private static short[] field4804 = new short[500];

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "[S")
    private static short[] field4808 = new short[500];

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[S")
    private static short[] field4805 = new short[500];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()V", line = 12)
    public static void method2225() {
        field4808 = null;
        field4806 = null;
        field4804 = null;
        field4805 = null;
        field4797 = null;
        field4800 = null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([BLki;)V", line = 60)
    public class319(byte[] arg0, class191 arg1) {
        this.field4801 = arg1;
        class190 var3 = new class190(arg0);
        class190 var4 = new class190(arg0);
        var3.field2776 = 2;
        int var5 = var3.method1319(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2776 = var3.field2776 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field4801.field2790[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1319(255);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field4808[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4806[var6] = var12;
                } else {
                    field4806[var6] = (short) var4.method1314(-97);
                }
                if ((var11 & 0x2) == 0) {
                    field4804[var6] = var12;
                } else {
                    field4804[var6] = (short) var4.method1314(-100);
                }
                if ((var11 & 0x4) == 0) {
                    field4805[var6] = var12;
                } else {
                    field4805[var6] = (short) var4.method1314(-99);
                }
                field4800[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field4806[var6] = (short) (((field4806[var6] & 0xFF) << 3) + (field4806[var6] >> 8 & 0x7));
                    field4804[var6] = (short) (((field4804[var6] & 0xFF) << 3) + (field4804[var6] >> 8 & 0x7));
                    field4805[var6] = (short) (((field4805[var6] & 0xFF) << 3) + (field4805[var6] >> 8 & 0x7));
                }
                field4797[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field4797[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field4799 = true;
                } else if (var10 == 7) {
                    this.field4795 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2776) {
            throw new RuntimeException();
        }
        this.field4802 = var6;
        this.field4796 = new short[var6];
        this.field4809 = new short[var6];
        this.field4798 = new short[var6];
        this.field4794 = new short[var6];
        this.field4807 = new short[var6];
        this.field4803 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field4796[var13] = field4808[var13];
            this.field4809[var13] = field4806[var13];
            this.field4798[var13] = field4804[var13];
            this.field4794[var13] = field4805[var13];
            this.field4807[var13] = field4797[var13];
            this.field4803[var13] = field4800[var13];
        }
    }
}
