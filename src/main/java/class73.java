import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class73 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1129 = "Loaded title screen";

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1130 = -1;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1132;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[Lai;")
    public static class126[] field1134;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 7)
    public static void method550(int arg0) {
        field1134 = null;
        field1129 = null;
        if (arg0 != 31) {
            method553(-119, 118, 13, 49, 126);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V", line = 18)
    public static final void method551(byte arg0, int arg1) {
        if (arg0 < -7) {
            field1131++;
            class139.field2209.method1828(arg1, (byte) -31);
            class9.field132.method1828(arg1, (byte) 98);
            class123.field1965.method1828(arg1, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BLpe;)V", line = 33)
    public final void method552(int arg0, byte[] arg1, class101 arg2) {
        field1128++;
        if (arg2.field1661[arg2.field1667] != 31 || arg2.field1661[arg2.field1667 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1132 == null) {
            this.field1132 = new Inflater(true);
        }
        try {
            this.field1132.setInput(arg2.field1661, arg2.field1667 + 10, arg2.field1661.length - arg0 - (arg2.field1667 - -8));
            this.field1132.inflate(arg1);
        } catch (Exception var5) {
            this.field1132.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1132.reset();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V", line = 58)
    public static final void method553(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1133++;
        if (arg1 < 110) {
            method550(-39);
        }
        int var5 = 0;
        int var6 = -1;
        class86.method614(arg0, -24891, arg2 + arg4, -arg4 + arg2, class102.field1729[arg3]);
        int var7 = arg4;
        int var8 = -arg4;
        while (var7 > var5) {
            var6 += 2;
            var5++;
            var8 += var6;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var9 = class102.field1729[arg3 - var7];
                int[] var10 = class102.field1729[arg3 + var7];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                class86.method614(arg0, -24891, var11, var12, var10);
                class86.method614(arg0, -24891, var11, var12, var9);
            }
            int var13 = arg2 - var7;
            int[] var14 = class102.field1729[arg3 + var5];
            int var15 = arg2 + var7;
            int[] var16 = class102.field1729[arg3 - var5];
            class86.method614(arg0, -24891, var15, var13, var14);
            class86.method614(arg0, -24891, var15, var13, var16);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 114)
    public class73() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V", line = 133)
    private class73(int arg0, int arg1, int arg2) {
    }
}
