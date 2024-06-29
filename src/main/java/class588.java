import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class588 extends class282 {

    @OriginalMember(owner = "client!nda", name = "T", descriptor = "Lib;")
    public static class14 field8322 = new class14(3, 2);

    @OriginalMember(owner = "client!nda", name = "R", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!nda", name = "S", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!nda", name = "U", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!nda", name = "V", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!nda", name = "N", descriptor = "[B")
    private byte[] field8318;

    @OriginalMember(owner = "client!nda", name = "Q", descriptor = "[Z")
    public static boolean[] field8319;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3315(int arg0, int arg1, int arg2, int arg3) {
        this.field8318 = new byte[arg0 * arg2 * arg1 * 2];
        field8321++;
        this.method774(arg3 ^ 0xFFFFFF84, arg0, arg1, arg2);
        if (arg3 != -2) {
            field8322 = null;
        }
        return this.field8318;
    }

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "(I)V")
    public static void method3316(int arg0) {
        int var1 = 0 % ((-arg0 - 39) / 35);
        field8322 = null;
        field8319 = null;
    }

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "(I)V")
    public static final void method3317(int arg0) {
        if (class701.field9813 != null) {
            class517.field7362.method1666((byte) 71);
            class302.method1752();
            class527.method2968((byte) -26);
            class479.method2757((byte) -118);
            class165.method896((byte) 20);
            class337.method1935((byte) -107);
            if (class160.field1788 != null) {
                class160.field1788.method1568(0);
            }
            class120.method699((byte) 127);
            class471.method2715(false);
            class154.method839(24822);
            class505.method2896(1);
            class275.method1614(false, -31157);
            for (int var1 = 0; var1 < 2048; var1++) {
                class236 var5 = class139.field1540[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field9521.length; var6++) {
                        var5.field9521[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class53.field533; var2++) {
                class600 var3 = class653.field9160[var2].field2601;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field9521.length; var4++) {
                        var3.field9521[var4] = null;
                    }
                }
            }
            class499.field7213 = null;
            class143.field1593 = null;
            class701.field9813.method3203(5);
            class701.field9813 = null;
        }
        field8323++;
        int var7 = 2 / ((arg0 - 3) / 43);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBB)V")
    public final void method567(int arg0, byte arg1, byte arg2) {
        if (arg2 != 26) {
            method3317(23);
        }
        field8324++;
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field8318[var10001] = -1;
        this.field8318[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
    public class588() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
