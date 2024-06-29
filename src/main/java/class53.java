import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class53 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Z")
    public boolean field813 = false;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lvf;")
    public class307 field818 = null;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field822 = -1;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Z")
    public boolean field821 = false;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[S")
    public short[] field817;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[S")
    public short[] field826;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[S")
    public short[] field828;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "[S")
    public short[] field823;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[S")
    public short[] field824;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[B")
    public byte[] field825;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[B")
    private static byte[] field815 = new byte[500];

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[S")
    private static short[] field819 = new short[500];

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[S")
    private static short[] field820 = new short[500];

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[S")
    private static short[] field816 = new short[500];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[S")
    private static short[] field814 = new short[500];

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "[S")
    private static short[] field827 = new short[500];

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([BLvf;)V", line = 60)
    public class53(byte[] arg0, class307 arg1) {
        this.field818 = arg1;
        class291 var3 = new class291(arg0);
        class291 var4 = new class291(arg0);
        var3.field4946 = 2;
        int var5 = var3.method2011(-55);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4946 = var3.field4946 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field818.field5274[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method2011(-20);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field819[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field814[var6] = var12;
                } else {
                    field814[var6] = (short) var4.method1961((byte) 63);
                }
                if ((var11 & 0x2) == 0) {
                    field820[var6] = var12;
                } else {
                    field820[var6] = (short) var4.method1961((byte) -99);
                }
                if ((var11 & 0x4) == 0) {
                    field827[var6] = var12;
                } else {
                    field827[var6] = (short) var4.method1961((byte) 115);
                }
                field815[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field814[var6] = (short) (((field814[var6] & 0xFF) << 3) + (field814[var6] >> 8 & 0x7));
                    field820[var6] = (short) (((field820[var6] & 0xFF) << 3) + (field820[var6] >> 8 & 0x7));
                    field827[var6] = (short) (((field827[var6] & 0xFF) << 3) + (field827[var6] >> 8 & 0x7));
                }
                field816[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field816[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field813 = true;
                } else if (var10 == 7) {
                    this.field821 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4946) {
            throw new RuntimeException();
        }
        this.field822 = var6;
        this.field817 = new short[var6];
        this.field826 = new short[var6];
        this.field828 = new short[var6];
        this.field823 = new short[var6];
        this.field824 = new short[var6];
        this.field825 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field817[var13] = field819[var13];
            this.field826[var13] = field814[var13];
            this.field828[var13] = field820[var13];
            this.field823[var13] = field827[var13];
            this.field824[var13] = field816[var13];
            this.field825[var13] = field815[var13];
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V", line = 26)
    public static void method357() {
        field819 = null;
        field814 = null;
        field820 = null;
        field827 = null;
        field816 = null;
        field815 = null;
    }
}
