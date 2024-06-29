import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class60 {

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lwb;")
    public class180 field820 = null;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Z")
    public boolean field822 = false;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public int field823 = 0;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "Z")
    public boolean field827 = false;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "[S")
    public short[] field818;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[S")
    public short[] field819;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "[S")
    public short[] field830;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[S")
    public short[] field821;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "[S")
    public short[] field828;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "[B")
    public byte[] field829;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "[S")
    private static short[] field815 = new short[500];

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[S")
    private static short[] field816 = new short[500];

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[B")
    private static byte[] field824 = new byte[500];

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[S")
    private static short[] field817 = new short[500];

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "[S")
    private static short[] field826 = new short[500];

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "[S")
    private static short[] field825 = new short[500];

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
    public static void method465() {
        field825 = null;
        field816 = null;
        field817 = null;
        field826 = null;
        field815 = null;
        field824 = null;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([BLwb;)V")
    public class60(byte[] arg0, class180 arg1) {
        this.field820 = arg1;
        try {
            class11 var3 = new class11(arg0);
            class11 var4 = new class11(arg0);
            var3.field191 = 2;
            int var5 = var3.method172((byte) 52);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field191 = var3.field191 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field820.field2473[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method172((byte) 52);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field825[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field816[var6] = var12;
                    } else {
                        field816[var6] = (short) var4.method199((byte) -51);
                    }
                    if ((var11 & 0x2) == 0) {
                        field817[var6] = var12;
                    } else {
                        field817[var6] = (short) var4.method199((byte) -84);
                    }
                    if ((var11 & 0x4) == 0) {
                        field826[var6] = var12;
                    } else {
                        field826[var6] = (short) var4.method199((byte) -43);
                    }
                    field824[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field816[var6] = (short) (((field816[var6] & 0xFF) << 3) + (field816[var6] >> 8 & 0x7));
                        field817[var6] = (short) (((field817[var6] & 0xFF) << 3) + (field817[var6] >> 8 & 0x7));
                        field826[var6] = (short) (((field826[var6] & 0xFF) << 3) + (field826[var6] >> 8 & 0x7));
                        field816[var6] = (short) (field816[var6] << 3);
                        field817[var6] = (short) (field817[var6] << 3);
                        field826[var6] = (short) (field826[var6] << 3);
                    }
                    field815[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field815[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field822 = true;
                    } else if (var10 == 7) {
                        this.field827 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field191) {
                throw new RuntimeException();
            }
            this.field823 = var6;
            this.field818 = new short[var6];
            this.field819 = new short[var6];
            this.field830 = new short[var6];
            this.field821 = new short[var6];
            this.field828 = new short[var6];
            this.field829 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field818[var13] = field825[var13];
                this.field819[var13] = field816[var13];
                this.field830[var13] = field817[var13];
                this.field821[var13] = field826[var13];
                this.field828[var13] = field815[var13];
                this.field829[var13] = field824[var13];
            }
        } catch (Exception var14) {
            this.field823 = 0;
            this.field822 = false;
            this.field827 = false;
        }
    }
}
