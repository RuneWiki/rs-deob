import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class291 {

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Ljm;")
    public class230 field4952 = null;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Z")
    public boolean field4953 = false;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field4961 = -1;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[S")
    public short[] field4957;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[S")
    public short[] field4959;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[S")
    public short[] field4955;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[S")
    public short[] field4949;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[S")
    public short[] field4960;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[S")
    private static short[] field4950 = new short[500];

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[S")
    private static short[] field4951 = new short[500];

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[S")
    private static short[] field4954 = new short[500];

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[S")
    private static short[] field4956 = new short[500];

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[S")
    private static short[] field4958 = new short[500];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V", line = 6)
    public static void method2084() {
        field4956 = null;
        field4950 = null;
        field4954 = null;
        field4951 = null;
        field4958 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([BLjm;)V", line = 53)
    public class291(byte[] arg0, class230 arg1) {
        this.field4952 = arg1;
        class47 var3 = new class47(arg0);
        class47 var4 = new class47(arg0);
        var3.field857 = 2;
        int var5 = var3.method368(57);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field857 = var3.field857 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field4952.field3844[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method368(65);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field4956[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4950[var6] = var12;
                } else {
                    field4950[var6] = (short) var4.method369((byte) -118);
                }
                if ((var11 & 0x2) == 0) {
                    field4954[var6] = var12;
                } else {
                    field4954[var6] = (short) var4.method369((byte) -118);
                }
                if ((var11 & 0x4) == 0) {
                    field4951[var6] = var12;
                } else {
                    field4951[var6] = (short) var4.method369((byte) -118);
                }
                if (var10 == 2) {
                    field4950[var6] = (short) (((field4950[var6] & 0xFF) << 3) + (field4950[var6] >> 8 & 0x7));
                    field4954[var6] = (short) (((field4954[var6] & 0xFF) << 3) + (field4954[var6] >> 8 & 0x7));
                    field4951[var6] = (short) (((field4951[var6] & 0xFF) << 3) + (field4951[var6] >> 8 & 0x7));
                }
                field4958[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field4958[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field4953 = true;
                } else if (var10 == 7) {
                }
                var6++;
            }
        }
        if (arg0.length != var4.field857) {
            throw new RuntimeException();
        }
        this.field4961 = var6;
        this.field4957 = new short[var6];
        this.field4959 = new short[var6];
        this.field4955 = new short[var6];
        this.field4949 = new short[var6];
        this.field4960 = new short[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field4957[var13] = field4956[var13];
            this.field4959[var13] = field4950[var13];
            this.field4955[var13] = field4954[var13];
            this.field4949[var13] = field4951[var13];
            this.field4960[var13] = field4958[var13];
        }
    }
}
