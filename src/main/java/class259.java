import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class259 extends class86 {

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    private int field3966 = 20;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    private int field3972 = 1365;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    private int field3973 = 0;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    private int field3971 = 0;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "Lkk;")
    public static class77 field3968 = null;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "Z")
    public static boolean field3965 = false;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3975 = "flash3:";

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lrn;Lrn;ZB)V", line = 14)
    public static final void method1905(class18 arg0, class18 arg1, boolean arg2, byte arg3) {
        class90.field1276 = arg2;
        field3970++;
        int var4 = -66 % ((arg3 + 66) / 58);
        class48.field745 = arg1;
        class44.field703 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 26)
    public static void method1906(byte arg0) {
        field3975 = null;
        field3968 = null;
        if (arg0 != 83) {
            field3968 = (class77) null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[I", line = 41)
    public final int[] method158(int arg0, int arg1) {
        field3967++;
        if (arg1 < 7) {
            this.method157(120, true, (class25) null);
        }
        int[] var3 = this.field1225.method1914(arg0, -80);
        if (this.field1225.field3995) {
            for (int var4 = 0; var4 < class93.field1424; var4++) {
                int var5 = (class347.field5515[var4] << 12) / this.field3972 + this.field3971;
                int var6 = (class135.field2257[arg0] << 12) / this.field3972 + this.field3973;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field3966) {
                    var13++;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var12 - var11;
                    var12 = var9 * var9 >> 12;
                    var11 = var10 * var10 >> 12;
                }
                var3[var4] = (this.field3966 - 1) > var13 ? (var13 << 12) / this.field3966 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 95)
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLug;)V", line = 118)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.field3972 = arg2.method314((byte) 58);
        } else if (arg0 == 1) {
            this.field3966 = arg2.method314((byte) 106);
        } else if (arg0 == 2) {
            this.field3971 = arg2.method314((byte) 83);
        } else if (arg0 == 3) {
            this.field3973 = arg2.method314((byte) 113);
        }
        if (arg1) {
            method1906((byte) 32);
        }
        field3974++;
    }
}
