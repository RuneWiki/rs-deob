import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class284 {

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "Z")
    public boolean field3989 = false;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "Z")
    public boolean field3990 = false;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Lbb;")
    public class616 field3996 = null;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "Z")
    public boolean field4002 = false;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public int field3992 = 0;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "[S")
    public short[] field4003;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "[S")
    public short[] field3997;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "[S")
    public short[] field3991;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "[S")
    public short[] field3994;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "[S")
    public short[] field3995;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[B")
    public byte[] field3998;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "[S")
    private static short[] field3988 = new short[500];

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "[S")
    private static short[] field3993 = new short[500];

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "[S")
    private static short[] field4000 = new short[500];

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "[S")
    private static short[] field4001 = new short[500];

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "[B")
    private static byte[] field3999 = new byte[500];

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "[S")
    private static short[] field4004 = new short[500];

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "()V")
    public static void method2302() {
        field3988 = null;
        field4000 = null;
        field4001 = null;
        field4004 = null;
        field3993 = null;
        field3999 = null;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([BLbb;)V")
    public class284(byte[] arg0, class616 arg1) {
        this.field3996 = arg1;
        try {
            class711 var3 = new class711(arg0);
            class711 var4 = new class711(arg0);
            var3.method5128(0);
            var3.field9945 += 2;
            int var5 = var3.method5128(0);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field9945 = var3.field9945 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3996.field8793[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method5128(0);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3988[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4000[var6] = var12;
                    } else {
                        field4000[var6] = (short) var4.method5098((byte) 20);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4001[var6] = var12;
                    } else {
                        field4001[var6] = (short) var4.method5098((byte) -123);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4004[var6] = var12;
                    } else {
                        field4004[var6] = (short) var4.method5098((byte) 14);
                    }
                    field3999[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4000[var6] = (short) (field4000[var6] << 2 & 0x3FFF);
                        field4001[var6] = (short) (field4001[var6] << 2 & 0x3FFF);
                        field4004[var6] = (short) (field4004[var6] << 2 & 0x3FFF);
                    }
                    field3993[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3993[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3989 = true;
                    } else if (var10 == 7) {
                        this.field4002 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field3990 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field9945) {
                throw new RuntimeException();
            }
            this.field3992 = var6;
            this.field4003 = new short[var6];
            this.field3997 = new short[var6];
            this.field3991 = new short[var6];
            this.field3994 = new short[var6];
            this.field3995 = new short[var6];
            this.field3998 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4003[var13] = field3988[var13];
                this.field3997[var13] = field4000[var13];
                this.field3991[var13] = field4001[var13];
                this.field3994[var13] = field4004[var13];
                this.field3995[var13] = field3993[var13];
                this.field3998[var13] = field3999[var13];
            }
        } catch (Exception var14) {
            this.field3992 = 0;
            this.field3989 = false;
            this.field4002 = false;
        }
    }
}
