import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class616 {

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "[I")
    public int[] field8283 = new int[4];

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "B")
    public byte field8290;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "B")
    public byte field8286;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "[I")
    public int[] field8293;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "[I")
    public int[] field8281;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "S")
    public short field8282;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "S")
    public short field8285;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "S")
    public short field8291;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "[S")
    public short[] field8284;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "[S")
    public short[] field8292;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "[S")
    public short[] field8279;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "S")
    public short field8288;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field8280 = 0;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BLmfa;)V")
    public static final void method3488(byte arg0, class409 arg1) {
        if (arg0 != 97) {
            return;
        }
        field8287++;
        for (int var2 = 0; var2 < class385.field5530; var2++) {
            int var3 = class248.field3651[var2];
            class96 var4 = class251.field3675[var3];
            int var5 = arg1.method505((byte) -119);
            if ((var5 & 0x8) != 0) {
                var5 += arg1.method505((byte) -119) << 8;
            }
            if ((var5 & 0x1000) != 0) {
                var5 += arg1.method505((byte) -119) << 16;
            }
            class169.method1084(var5, 122, var3, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIILida;)V")
    public static final void method3489(int arg0, int arg1, int arg2, class272 arg3) {
        field8289++;
        if (!class25.field320) {
            return;
        }
        int var4 = 0;
        for (class558 var5 = (class558) arg3.field3951.method3828(123); var5 != null; var5 = (class558) arg3.field3951.method3829(-29202)) {
            int var10 = class428.method2659(var5, 88);
            if (var4 < var10) {
                var4 = var10;
            }
        }
        var4 += 8;
        int var6 = arg3.field3953 * 16 + 21;
        class467.field6492 = arg3.field3953 * 16 + (class484.field6743 ? 26 : 22);
        int var7 = class401.field5750 + class746.field10270;
        if ((var4 + var7) > class118.field1561) {
            var7 = class401.field5750 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class484.field6743 ? 33 : 31;
        int var9 = arg2 - (var8 - 13);
        if (class553.field7716 < var6 + var9) {
            var9 = class553.field7716 - var6;
        }
        class530.field7345 = var7;
        if (var9 < 0) {
            var9 = 0;
        }
        class479.field6657 = var9;
        class153.field2104 = var4;
        if (arg1 == 692) {
            class610.field8211 = arg3;
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field8290 = (byte) arg0;
        this.field8286 = (byte) arg1;
        this.field8293 = new int[4];
        this.field8281 = new int[4];
        this.field8283[3] = arg5;
        this.field8283[1] = arg3;
        this.field8283[2] = arg4;
        this.field8283[0] = arg2;
        this.field8293[0] = arg6;
        this.field8293[3] = arg9;
        this.field8293[1] = arg7;
        this.field8293[2] = arg8;
        this.field8281[2] = arg12;
        this.field8281[0] = arg10;
        this.field8281[3] = arg13;
        this.field8282 = (short) (arg2 >> class371.field5241);
        this.field8281[1] = arg11;
        this.field8285 = (short) (arg4 >> class371.field5241);
        this.field8291 = (short) (arg10 >> class371.field5241);
        this.field8284 = new short[4];
        this.field8292 = new short[4];
        this.field8279 = new short[4];
        this.field8288 = (short) (arg12 >> class371.field5241);
    }
}
