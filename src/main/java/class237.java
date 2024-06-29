import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class237 {

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "Z")
    public boolean field3755 = false;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "Lno;")
    public class652 field3760 = null;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "Z")
    public boolean field3764 = false;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public int field3767 = 0;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "Z")
    public boolean field3766 = false;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "[S")
    public short[] field3768;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "[S")
    public short[] field3762;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "[S")
    public short[] field3771;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "[S")
    public short[] field3770;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "[S")
    public short[] field3756;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "[B")
    public byte[] field3761;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "[S")
    private static short[] field3763 = new short[500];

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "[B")
    private static byte[] field3757 = new byte[500];

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "[S")
    private static short[] field3758 = new short[500];

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "[S")
    private static short[] field3759 = new short[500];

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "[S")
    private static short[] field3765 = new short[500];

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "[S")
    private static short[] field3769 = new short[500];

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "()V")
    public static void method1708() {
        field3769 = null;
        field3759 = null;
        field3758 = null;
        field3763 = null;
        field3765 = null;
        field3757 = null;
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "([BLno;)V")
    public class237(byte[] arg0, class652 arg1) {
        this.field3760 = arg1;
        try {
            class6 var3 = new class6(arg0);
            class6 var4 = new class6(arg0);
            var3.method70(-9059);
            var3.field57 += 2;
            int var5 = var3.method70(-9059);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field57 = var3.field57 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3760.field9129[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method70(-9059);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3769[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3759[var6] = var12;
                    } else {
                        field3759[var6] = (short) var4.method40(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field3758[var6] = var12;
                    } else {
                        field3758[var6] = (short) var4.method40(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field3763[var6] = var12;
                    } else {
                        field3763[var6] = (short) var4.method40(false);
                    }
                    field3757[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field3759[var6] = (short) (field3759[var6] << 2 & 0x3FFF);
                        field3758[var6] = (short) (field3758[var6] << 2 & 0x3FFF);
                        field3763[var6] = (short) (field3763[var6] << 2 & 0x3FFF);
                    }
                    field3765[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3765[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3764 = true;
                    } else if (var10 == 7) {
                        this.field3755 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field3766 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field57) {
                throw new RuntimeException();
            }
            this.field3767 = var6;
            this.field3768 = new short[var6];
            this.field3762 = new short[var6];
            this.field3771 = new short[var6];
            this.field3770 = new short[var6];
            this.field3756 = new short[var6];
            this.field3761 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3768[var13] = field3769[var13];
                this.field3762[var13] = field3759[var13];
                this.field3771[var13] = field3758[var13];
                this.field3770[var13] = field3763[var13];
                this.field3756[var13] = field3765[var13];
                this.field3761[var13] = field3757[var13];
            }
        } catch (Exception var14) {
            this.field3767 = 0;
            this.field3764 = false;
            this.field3755 = false;
        }
    }
}
