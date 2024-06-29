import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class235 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Z")
    public boolean field3782 = false;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field3779 = 0;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Z")
    public boolean field3783 = false;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "Z")
    public boolean field3793 = false;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "Lnr;")
    public class42 field3787 = null;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "[S")
    public short[] field3794;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "[S")
    public short[] field3781;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "[S")
    public short[] field3788;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "[S")
    public short[] field3778;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "[S")
    public short[] field3786;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "[B")
    public byte[] field3789;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "[S")
    private static short[] field3780 = new short[500];

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "[S")
    private static short[] field3784 = new short[500];

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "[S")
    private static short[] field3785 = new short[500];

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "[S")
    private static short[] field3791 = new short[500];

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "[S")
    private static short[] field3792 = new short[500];

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "[B")
    private static byte[] field3790 = new byte[500];

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "()V")
    public static void method1638() {
        field3784 = null;
        field3791 = null;
        field3792 = null;
        field3785 = null;
        field3780 = null;
        field3790 = null;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "([BLnr;)V")
    public class235(byte[] arg0, class42 arg1) {
        this.field3787 = arg1;
        try {
            class217 var3 = new class217(arg0);
            class217 var4 = new class217(arg0);
            var3.field3556 = 2;
            int var5 = var3.method1515((byte) 122);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3556 = var3.field3556 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3787.field551[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1515((byte) 127);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3784[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3791[var6] = var12;
                    } else {
                        field3791[var6] = (short) var4.method1562((byte) 81);
                    }
                    if ((var11 & 0x2) == 0) {
                        field3792[var6] = var12;
                    } else {
                        field3792[var6] = (short) var4.method1562((byte) 88);
                    }
                    if ((var11 & 0x4) == 0) {
                        field3785[var6] = var12;
                    } else {
                        field3785[var6] = (short) var4.method1562((byte) 107);
                    }
                    field3790[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field3791[var6] = (short) (((field3791[var6] & 0xFF) << 3) + (field3791[var6] >> 8 & 0x7));
                        field3792[var6] = (short) (((field3792[var6] & 0xFF) << 3) + (field3792[var6] >> 8 & 0x7));
                        field3785[var6] = (short) (((field3785[var6] & 0xFF) << 3) + (field3785[var6] >> 8 & 0x7));
                        field3791[var6] = (short) (field3791[var6] << 3);
                        field3792[var6] = (short) (field3792[var6] << 3);
                        field3785[var6] = (short) (field3785[var6] << 3);
                    }
                    field3780[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3780[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3782 = true;
                    } else if (var10 == 7) {
                        this.field3793 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field3783 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3556) {
                throw new RuntimeException();
            }
            this.field3779 = var6;
            this.field3794 = new short[var6];
            this.field3781 = new short[var6];
            this.field3788 = new short[var6];
            this.field3778 = new short[var6];
            this.field3786 = new short[var6];
            this.field3789 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3794[var13] = field3784[var13];
                this.field3781[var13] = field3791[var13];
                this.field3788[var13] = field3792[var13];
                this.field3778[var13] = field3785[var13];
                this.field3786[var13] = field3780[var13];
                this.field3789[var13] = field3790[var13];
            }
        } catch (Exception var14) {
            this.field3779 = 0;
            this.field3782 = false;
            this.field3793 = false;
        }
    }
}
