import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class182 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Z")
    public boolean field2905 = false;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
    public boolean field2911 = false;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public int field2915 = -1;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Ldi;")
    public class214 field2920 = null;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[S")
    public short[] field2910;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "[S")
    public short[] field2919;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "[S")
    public short[] field2913;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[S")
    public short[] field2908;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[S")
    public short[] field2907;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "[B")
    public byte[] field2916;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "[S")
    private static short[] field2912 = new short[500];

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[S")
    private static short[] field2906 = new short[500];

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[S")
    private static short[] field2914 = new short[500];

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "[S")
    private static short[] field2917 = new short[500];

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "[B")
    private static byte[] field2918 = new byte[500];

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "[S")
    private static short[] field2909 = new short[500];

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "([BLdi;)V", line = 60)
    public class182(byte[] arg0, class214 arg1) {
        this.field2920 = arg1;
        class202 var3 = new class202(arg0);
        class202 var4 = new class202(arg0);
        var3.field3249 = 2;
        int var5 = var3.method1317((byte) -110);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3249 = var3.field3249 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field2920.field3430[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1317((byte) -122);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field2914[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2909[var6] = var12;
                } else {
                    field2909[var6] = (short) var4.method1341((byte) 114);
                }
                if ((var11 & 0x2) == 0) {
                    field2912[var6] = var12;
                } else {
                    field2912[var6] = (short) var4.method1341((byte) 70);
                }
                if ((var11 & 0x4) == 0) {
                    field2906[var6] = var12;
                } else {
                    field2906[var6] = (short) var4.method1341((byte) 43);
                }
                field2918[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field2909[var6] = (short) (((field2909[var6] & 0xFF) << 3) + (field2909[var6] >> 8 & 0x7));
                    field2912[var6] = (short) (((field2912[var6] & 0xFF) << 3) + (field2912[var6] >> 8 & 0x7));
                    field2906[var6] = (short) (((field2906[var6] & 0xFF) << 3) + (field2906[var6] >> 8 & 0x7));
                }
                field2917[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field2917[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field2911 = true;
                } else if (var10 == 7) {
                    this.field2905 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3249) {
            throw new RuntimeException();
        }
        this.field2915 = var6;
        this.field2910 = new short[var6];
        this.field2919 = new short[var6];
        this.field2913 = new short[var6];
        this.field2908 = new short[var6];
        this.field2907 = new short[var6];
        this.field2916 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field2910[var13] = field2914[var13];
            this.field2919[var13] = field2909[var13];
            this.field2913[var13] = field2912[var13];
            this.field2908[var13] = field2906[var13];
            this.field2907[var13] = field2917[var13];
            this.field2916[var13] = field2918[var13];
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()V", line = 17)
    public static void method1141() {
        field2914 = null;
        field2909 = null;
        field2912 = null;
        field2906 = null;
        field2917 = null;
        field2918 = null;
    }
}
