import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class213 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public int field3955 = -1;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lci;")
    public class31 field3956 = null;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Z")
    public boolean field3966 = false;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "[S")
    public short[] field3962;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "[S")
    public short[] field3961;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "[S")
    public short[] field3963;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[S")
    public short[] field3967;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[S")
    public short[] field3959;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[S")
    private static short[] field3958 = new short[500];

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "[S")
    private static short[] field3957 = new short[500];

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[S")
    private static short[] field3960 = new short[500];

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "[S")
    private static short[] field3964 = new short[500];

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "[S")
    private static short[] field3965 = new short[500];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V")
    public static void method1405() {
        field3960 = null;
        field3964 = null;
        field3957 = null;
        field3958 = null;
        field3965 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([BLci;)V")
    public class213(byte[] arg0, class31 arg1) {
        this.field3956 = arg1;
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        var3.field3432 = 2;
        int var5 = var3.method1243(3);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3432 = var3.field3432 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3956.field675[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1243(3);
            if (var11 > 0) {
                if (this.field3956.field675[var9] == 0) {
                    var8 = var9;
                }
                field3960[var6] = (short) var9;
                short var12 = 0;
                if (this.field3956.field675[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3964[var6] = var12;
                } else {
                    field3964[var6] = (short) var4.method1224(true);
                }
                if ((var11 & 0x2) == 0) {
                    field3957[var6] = var12;
                } else {
                    field3957[var6] = (short) var4.method1224(true);
                }
                if ((var11 & 0x4) == 0) {
                    field3958[var6] = var12;
                } else {
                    field3958[var6] = (short) var4.method1224(true);
                }
                if (this.field3956.field675[var9] == 2) {
                    field3964[var6] = (short) (((field3964[var6] & 0xFF) << 3) + (field3964[var6] >> 8 & 0x7));
                    field3957[var6] = (short) (((field3957[var6] & 0xFF) << 3) + (field3957[var6] >> 8 & 0x7));
                    field3958[var6] = (short) (((field3958[var6] & 0xFF) << 3) + (field3958[var6] >> 8 & 0x7));
                }
                field3965[var6] = -1;
                if (this.field3956.field675[var9] >= 1 && this.field3956.field675[var9] <= 3 && var7 > var8) {
                    field3965[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3956.field675[var9] == 5) {
                    this.field3966 = true;
                }
            }
        }
        if (arg0.length != var4.field3432) {
            throw new RuntimeException();
        }
        this.field3955 = var6;
        this.field3962 = new short[var6];
        this.field3961 = new short[var6];
        this.field3963 = new short[var6];
        this.field3967 = new short[var6];
        this.field3959 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3962[var10] = field3960[var10];
            this.field3961[var10] = field3964[var10];
            this.field3963[var10] = field3957[var10];
            this.field3967[var10] = field3958[var10];
            this.field3959[var10] = field3965[var10];
        }
    }
}
