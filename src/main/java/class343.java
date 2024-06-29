import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class343 {

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Z")
    public boolean field4797 = false;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Z")
    public boolean field4801 = false;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public int field4800 = 0;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Lpf;")
    public class346 field4803 = null;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "[S")
    public short[] field4789;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "[S")
    public short[] field4802;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "[S")
    public short[] field4798;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "[S")
    public short[] field4799;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "[S")
    public short[] field4796;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "[B")
    public byte[] field4792;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[S")
    private static short[] field4791 = new short[500];

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "[B")
    private static byte[] field4795 = new byte[500];

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "[S")
    private static short[] field4793 = new short[500];

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[S")
    private static short[] field4790 = new short[500];

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "[S")
    private static short[] field4794 = new short[500];

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "[S")
    private static short[] field4804 = new short[500];

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "()V", line = 7)
    public static void method2202() {
        field4794 = null;
        field4804 = null;
        field4790 = null;
        field4793 = null;
        field4791 = null;
        field4795 = null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([BLpf;)V", line = 61)
    public class343(byte[] arg0, class346 arg1) {
        this.field4803 = arg1;
        try {
            class371 var3 = new class371(arg0);
            class371 var4 = new class371(arg0);
            var3.field5273 = 2;
            int var5 = var3.method2429(0);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5273 = var3.field5273 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4803.field4853[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2429(0);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4794[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4804[var6] = var12;
                    } else {
                        field4804[var6] = (short) var4.method2423((byte) -124);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4790[var6] = var12;
                    } else {
                        field4790[var6] = (short) var4.method2423((byte) 112);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4793[var6] = var12;
                    } else {
                        field4793[var6] = (short) var4.method2423((byte) -123);
                    }
                    field4795[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field4804[var6] = (short) (((field4804[var6] & 0xFF) << 3) + (field4804[var6] >> 8 & 0x7));
                        field4790[var6] = (short) (((field4790[var6] & 0xFF) << 3) + (field4790[var6] >> 8 & 0x7));
                        field4793[var6] = (short) (((field4793[var6] & 0xFF) << 3) + (field4793[var6] >> 8 & 0x7));
                        field4804[var6] = (short) (field4804[var6] << 3);
                        field4790[var6] = (short) (field4790[var6] << 3);
                        field4793[var6] = (short) (field4793[var6] << 3);
                    }
                    field4791[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4791[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4801 = true;
                    } else if (var10 == 7) {
                        this.field4797 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5273) {
                throw new RuntimeException();
            }
            this.field4800 = var6;
            this.field4789 = new short[var6];
            this.field4802 = new short[var6];
            this.field4798 = new short[var6];
            this.field4799 = new short[var6];
            this.field4796 = new short[var6];
            this.field4792 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4789[var13] = field4794[var13];
                this.field4802[var13] = field4804[var13];
                this.field4798[var13] = field4790[var13];
                this.field4799[var13] = field4793[var13];
                this.field4796[var13] = field4791[var13];
                this.field4792[var13] = field4795[var13];
            }
        } catch (Exception var14) {
            this.field4800 = 0;
            this.field4801 = false;
            this.field4797 = false;
        }
    }
}
