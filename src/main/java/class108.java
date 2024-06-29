import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class108 extends OutputStream {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
    public static int[] field1139 = new int[1000];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 5)
    public static void method743(byte arg0) {
        field1139 = null;
        int var1 = 32 % ((arg0 + 50) / 39);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBII)V", line = 25)
    public static final void method744(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1140++;
        int var5 = -101 % ((8 - arg2) / 53);
        int var6 = 0;
        int var7 = arg1;
        int var8 = -arg1;
        int var9 = -1;
        class223.method1297(class408.field5585[arg0], -7, arg4 - arg1, arg3, arg1 + arg4);
        while (var7 > var6) {
            var9 += 2;
            var6++;
            var8 += var9;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var10 = class408.field5585[arg0 + var7];
                int[] var11 = class408.field5585[arg0 - var7];
                int var12 = arg4 + var6;
                int var13 = arg4 - var6;
                class223.method1297(var10, -7, var13, arg3, var12);
                class223.method1297(var11, -7, var13, arg3, var12);
            }
            int var14 = arg4 + var7;
            int var15 = arg4 - var7;
            int[] var16 = class408.field5585[arg0 + var6];
            int[] var17 = class408.field5585[arg0 - var6];
            class223.method1297(var16, -7, var15, arg3, var14);
            class223.method1297(var17, -7, var15, arg3, var14);
        }
    }

    @OriginalMember(owner = "client!ra", name = "write", descriptor = "(I)V", line = 76)
    public final void write(int arg0) throws IOException {
        field1141++;
        throw new IOException();
    }
}
