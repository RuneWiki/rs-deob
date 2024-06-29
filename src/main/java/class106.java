import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class106 extends class217 {

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "[I")
    public int[] field1575;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "[I")
    public int[] field1574;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "([[BII[I[II[[B[B)I")
    public static final int method801(byte[][] arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, byte[][] arg6, byte[] arg7) {
        field1573++;
        int var8 = arg3[arg1];
        int var9 = var8 + arg4[arg1];
        int var10 = arg3[arg5];
        int var11 = arg4[arg5] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg7[arg1] & arg2;
        if ((arg7[arg5] & 0xFF) < var14) {
            var14 = arg7[arg5] & 0xFF;
        }
        byte[] var15 = arg0[arg1];
        byte[] var16 = arg6[arg5];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;BI)Lvu;")
    public static final class313 method802(String arg0, byte arg1, int arg2) {
        field1571++;
        if (arg1 != -112) {
            method802(null, (byte) 115, 55);
        }
        class313 var3;
        try {
            var3 = (class313) Class.forName("vk").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class336();
        }
        var3.field4308 = arg0;
        var3.field4301 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(II[I[I)V")
    public class106(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1575 = arg2;
        this.field1574 = arg3;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)Z")
    public static final boolean method803(int arg0, int arg1, int arg2) {
        field1572++;
        if (arg1 == 255) {
            return (arg2 & 0x20) != 0;
        } else {
            return false;
        }
    }
}
