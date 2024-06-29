import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class515 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field7102 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
    public static final int method3025(int arg0, int arg1) {
        field7101++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        if (arg1 != 592877665) {
            method3025(84, 30);
        }
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII)V")
    public static final void method3026(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class538.field7479; var5++) {
            Rectangle var6 = class342.field4863[var5];
            if (arg3 < var6.x + var6.width && arg0 + arg3 > var6.x && var6.y + var6.height > arg2 && var6.y < (arg2 + arg4)) {
                class438.field6082[var5] = true;
            }
        }
        if (arg1 != -36) {
            field7102 = -2;
        }
        field7100++;
        class528.method3090(3985, arg2 + arg4, arg2, arg3, arg0 + arg3);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static final void method3027(byte arg0) {
        class494 var1 = class729.field10165;
        synchronized (class729.field10165) {
            class729.field10165.method2881((byte) -37);
            int var2 = -71 / ((arg0 - 51) / 41);
        }
        field7103++;
    }
}
