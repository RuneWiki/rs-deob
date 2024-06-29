import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class60 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Z")
    public boolean field769 = false;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field766 = 0;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Z")
    public boolean field773 = false;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lcea;")
    public class226 field764 = null;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
    public boolean field775 = false;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[S")
    public short[] field768;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[S")
    public short[] field765;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[S")
    public short[] field774;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[S")
    public short[] field776;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[S")
    public short[] field772;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "[B")
    public byte[] field780;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[S")
    private static short[] field767 = new short[500];

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[S")
    private static short[] field771 = new short[500];

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[S")
    private static short[] field770 = new short[500];

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "[S")
    private static short[] field777 = new short[500];

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "[B")
    private static byte[] field779 = new byte[500];

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[S")
    private static short[] field778 = new short[500];

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([BLcea;)V", line = 65)
    public class60(byte[] arg0, class226 arg1) {
        this.field764 = arg1;
        try {
            class254 var3 = new class254(arg0);
            class254 var4 = new class254(arg0);
            var3.method1731((byte) 64);
            var3.field3725 += 2;
            int var5 = var3.method1731((byte) 64);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3725 = var3.field3725 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field764.field2928[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1731((byte) 64);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field770[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field767[var6] = var12;
                    } else {
                        field767[var6] = (short) var4.method1669(-16443);
                    }
                    if ((var11 & 0x2) == 0) {
                        field771[var6] = var12;
                    } else {
                        field771[var6] = (short) var4.method1669(-16443);
                    }
                    if ((var11 & 0x4) == 0) {
                        field777[var6] = var12;
                    } else {
                        field777[var6] = (short) var4.method1669(-16443);
                    }
                    field779[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field767[var6] = (short) (field767[var6] << 2 & 0x3FFF);
                        field771[var6] = (short) (field771[var6] << 2 & 0x3FFF);
                        field777[var6] = (short) (field777[var6] << 2 & 0x3FFF);
                    }
                    field778[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field778[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field769 = true;
                    } else if (var10 == 7) {
                        this.field773 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field775 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3725) {
                throw new RuntimeException();
            }
            this.field766 = var6;
            this.field768 = new short[var6];
            this.field765 = new short[var6];
            this.field774 = new short[var6];
            this.field776 = new short[var6];
            this.field772 = new short[var6];
            this.field780 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field768[var13] = field770[var13];
                this.field765[var13] = field767[var13];
                this.field774[var13] = field771[var13];
                this.field776[var13] = field777[var13];
                this.field772[var13] = field778[var13];
                this.field780[var13] = field779[var13];
            }
        } catch (Exception var14) {
            this.field766 = 0;
            this.field769 = false;
            this.field773 = false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 37)
    public static void method372() {
        field770 = null;
        field767 = null;
        field771 = null;
        field777 = null;
        field778 = null;
        field779 = null;
    }
}
