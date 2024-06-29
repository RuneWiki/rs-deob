import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class793 extends class337 {

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field10872 = 0;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public static int field10871;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field10873;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "[I")
    public static int[] field10874;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I")
    public abstract int method1591(int arg0);

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)I")
    public abstract int method1592(int arg0);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)I")
    public abstract int method1590(byte arg0);

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)I")
    public abstract int method1593(int arg0);

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)V")
    public static void method4337(int arg0) {
        if (arg0 == 5607) {
            field10874 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "(I)J")
    public abstract long method1589(int arg0);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "([IB[Ljava/lang/String;II)V")
    public static final void method4338(int[] arg0, byte arg1, String[] arg2, int arg3, int arg4) {
        field10871++;
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method4338(arg0, (byte) -126, arg2, arg3, var6 - 1);
            method4338(arg0, (byte) -103, arg2, var6 + 1, arg4);
        }
        if (arg1 >= -70) {
            method4339((byte) 98);
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
    public static final void method4339(byte arg0) {
        if (class576.field7320.method960()) {
            class576.field7320.method979(class678.field8763);
            class515.method2853((byte) 86);
            if (class602.field7657) {
                class549.method2970(1, class678.field8763);
            } else {
                Dimension var1 = class678.field8763.getSize();
                class576.field7320.method889(class678.field8763, var1.width, var1.height);
            }
            class576.field7320.method888(class678.field8763);
        } else {
            class432.method2483((byte) 76, class485.field6252.field6949.method2402(false), false);
        }
        field10873++;
        class135.method783(0);
        if (arg0 != -38) {
            method4338(null, (byte) -112, null, -116, -10);
        }
        class689.field8852 = true;
    }
}
