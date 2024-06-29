import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class39 extends RuntimeException {

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Ljava/lang/String;")
    public String field574;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field570;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "Ldr;")
    public static class675 field575 = new class675(109, 11);

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIII)I", line = 10)
    public static final int method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field573++;
        if (class299.field3801 == null) {
            return 0;
        }
        if (arg5 != 1) {
            field575 = null;
        }
        if (arg1 < 3) {
            int var6 = arg0 >> 9;
            int var7 = arg3 >> 9;
            if (arg2 < 0 || arg4 < 0 || (class85.field1090 - 1) < arg2 || class656.field8932 - 1 < arg4) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class85.field1090 - 1) < var6 || (class656.field8932 - 1) < var7) {
                return 0;
            }
            boolean var8 = (class234.field3033[1][arg0 >> 9][arg3 >> 9] & 0x2) != 0;
            if ((arg0 & 0x1FF) == 0) {
                boolean var9 = (class234.field3033[1][var6 - 1][arg3 >> 9] & 0x2) != 0;
                boolean var10 = (class234.field3033[1][var6][arg3 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class234.field3033[1][arg2][arg4] & 0x2) != 0;
                }
            }
            if ((arg3 & 0x1FF) == 0) {
                boolean var11 = (class234.field3033[1][arg0 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class234.field3033[1][arg0 >> 9][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class234.field3033[1][arg2][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg1++;
            }
        }
        return class299.field3801[arg1].method194(arg0, arg3);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([Ljava/lang/Object;B[I)V", line = 70)
    public static final void method251(Object[] arg0, byte arg1, int[] arg2) {
        int var3 = -22 / ((arg1 - 70) / 39);
        field572++;
        class527.method2845(arg0, 0, arg2, arg2.length - 1, 0);
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 79)
    public class39(Throwable arg0, String arg1) {
        this.field574 = arg1;
        this.field570 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)Z", line = 90)
    public static final boolean method252(int arg0, byte arg1, int arg2) {
        field571++;
        int var3 = 103 / ((60 - arg1) / 37);
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BII)Z", line = 103)
    public static final boolean method253(byte arg0, int arg1, int arg2) {
        if (arg0 != 11) {
            method250(-91, -87, 7, -104, 121, 57);
        }
        field576++;
        return class514.method2799(24419, arg1, arg2) & class148.method929(2048, arg1, arg2);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 116)
    public static void method254(int arg0) {
        if (arg0 != -19095) {
            method253((byte) -105, -51, 5);
        }
        field575 = null;
    }
}
