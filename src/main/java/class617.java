import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class617 extends class289 {

    @OriginalMember(owner = "client!nu", name = "Q", descriptor = "Ljb;")
    public static class519 field8325 = new class519(3, 1);

    @OriginalMember(owner = "client!nu", name = "S", descriptor = "Ljb;")
    public static class519 field8327 = new class519(51, 6);

    @OriginalMember(owner = "client!nu", name = "T", descriptor = "[Luaa;")
    public static class127[] field8328 = new class127[8];

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "Ljava/lang/Object;")
    public static Object field8324;

    @OriginalMember(owner = "client!nu", name = "R", descriptor = "[B")
    private byte[] field8326;

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
    public class617() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(IIZI)[B")
    public final byte[] method3421(int arg0, int arg1, boolean arg2, int arg3) {
        this.field8326 = new byte[arg3 * 2 * arg1 * arg0];
        field8323++;
        if (arg2) {
            return null;
        } else {
            this.method69(arg0, arg3, true, arg1);
            return this.field8326;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BIB)V")
    public final void method1855(byte arg0, int arg1, byte arg2) {
        field8320++;
        int var4 = -84 / ((78 - arg2) / 43);
        int var5 = arg1 * 2;
        int var6 = arg0 & 0xFF;
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field8326[var10001] = (byte) (var6 * 3 >> 5);
        this.field8326[var7] = (byte) (var6 * 3 >> 5);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIBI)V")
    public static final void method3422(int arg0, int arg1, byte arg2, int arg3) {
        class328.field4667 = new byte[arg0][arg1][arg3];
        field8322++;
        int var4 = 20 % ((arg2 - 14) / 32);
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V")
    public static void method3423(byte arg0) {
        if (arg0 != -121) {
            method3424(null, -125);
        }
        field8327 = null;
        field8325 = null;
        field8324 = null;
        field8328 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ldt;I)Lpha;")
    public static final class175 method3424(class254 arg0, int arg1) {
        arg0.method1731((byte) 64);
        field8321++;
        int var2 = arg0.method1731((byte) 64);
        if (arg1 >= -90) {
            field8328 = null;
        }
        class175 var3 = class9.method50(var2, (byte) -103);
        var3.field2309 = arg0.method1731((byte) 64);
        int var4 = arg0.method1731((byte) 64);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1731((byte) 64);
            var3.method44(var6, arg0, false);
        }
        var3.method46(-8);
        return var3;
    }
}
