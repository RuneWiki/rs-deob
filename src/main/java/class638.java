import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class638 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "[B")
    public byte[] field9134;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "[S")
    public short[] field9128;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "[S")
    public short[] field9131;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "[S")
    public short[] field9132;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "[Z")
    public static boolean[] field9133;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lun;I)V", line = 4)
    public static final void method3638(class389 arg0, int arg1) {
        field9130++;
        byte[] var2 = new byte[24];
        if (arg1 != -16638) {
            return;
        }
        if (class23.field570 != null) {
            try {
                class23.field570.method2698((byte) -91, 0L);
                class23.field570.method2704(true, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2253(var2, (byte) -23, 24, 0);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V", line = 51)
    public static void method3639(byte arg0) {
        if (arg0 != -22) {
            method3638(null, 64);
        }
        field9133 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)V", line = 61)
    public static final void method3640(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field9127++;
        if (class505.field7053 == 0) {
            class601.field8666.method2084(1380416688, arg0);
        } else {
            class511.field7473 = arg0;
        }
    }
}
