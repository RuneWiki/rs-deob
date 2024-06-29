import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class241 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lo;")
    public class11 field4174 = null;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Z")
    public boolean field4183 = false;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field4184 = -1;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[S")
    public short[] field4179;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "[S")
    public short[] field4186;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[S")
    public short[] field4182;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[S")
    public short[] field4181;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[S")
    public short[] field4180;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[S")
    private static short[] field4176 = new short[500];

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[S")
    private static short[] field4175 = new short[500];

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[S")
    private static short[] field4185 = new short[500];

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[S")
    private static short[] field4177 = new short[500];

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[S")
    private static short[] field4178 = new short[500];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public static void method1666() {
        field4177 = null;
        field4185 = null;
        field4175 = null;
        field4178 = null;
        field4176 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([BLo;)V")
    public class241(byte[] arg0, class11 arg1) {
        this.field4174 = arg1;
        class216 var3 = new class216(arg0);
        class216 var4 = new class216(arg0);
        var3.field3728 = 2;
        int var5 = var3.method1446(5350);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3728 = var3.field3728 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4174.field232[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1446(5350);
            if (var11 > 0) {
                if (this.field4174.field232[var9] == 0) {
                    var8 = var9;
                }
                field4177[var6] = (short) var9;
                short var12 = 0;
                if (this.field4174.field232[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4185[var6] = var12;
                } else {
                    field4185[var6] = (short) var4.method1473(77);
                }
                if ((var11 & 0x2) == 0) {
                    field4175[var6] = var12;
                } else {
                    field4175[var6] = (short) var4.method1473(48);
                }
                if ((var11 & 0x4) == 0) {
                    field4178[var6] = var12;
                } else {
                    field4178[var6] = (short) var4.method1473(96);
                }
                if (this.field4174.field232[var9] == 2) {
                    field4185[var6] = (short) (((field4185[var6] & 0xFF) << 3) + (field4185[var6] >> 8 & 0x7));
                    field4175[var6] = (short) (((field4175[var6] & 0xFF) << 3) + (field4175[var6] >> 8 & 0x7));
                    field4178[var6] = (short) (((field4178[var6] & 0xFF) << 3) + (field4178[var6] >> 8 & 0x7));
                }
                field4176[var6] = -1;
                if (this.field4174.field232[var9] >= 1 && this.field4174.field232[var9] <= 3 && var7 > var8) {
                    field4176[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field4174.field232[var9] == 5) {
                    this.field4183 = true;
                }
            }
        }
        if (arg0.length != var4.field3728) {
            throw new RuntimeException();
        }
        this.field4184 = var6;
        this.field4179 = new short[var6];
        this.field4186 = new short[var6];
        this.field4182 = new short[var6];
        this.field4181 = new short[var6];
        this.field4180 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4179[var10] = field4177[var10];
            this.field4186[var10] = field4185[var10];
            this.field4182[var10] = field4175[var10];
            this.field4181[var10] = field4178[var10];
            this.field4180[var10] = field4176[var10];
        }
    }
}
