import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public abstract class class539 {

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
    public static int[] field7904 = new int[500];

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Z")
    public static boolean field7905 = false;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "[I")
    public static int[] field7906 = new int[8];

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Lla;")
    public static class319 field7902 = new class319(59, -2);

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "[I")
    public static int[] field7907 = new int[1];

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZ)Z", line = 3)
    public static final boolean method3181(int arg0, int arg1, boolean arg2) {
        field7903++;
        if (!arg2) {
            method3181(-108, 50, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)Luq;", line = 19)
    public static final class113 method3182(int arg0, int arg1, int arg2) {
        class452 var3 = class443.field6672[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class113 var4 = var3.field6796;
            var3.field6796 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lga;I)V", line = 29)
    public static final void method3183(class282 arg0, int arg1) {
        field7900++;
        if (arg0.field4103 == arg1 && arg0.field4012 != -1) {
            class480.method2851((byte) 93, class400.field6090, arg0);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 41)
    public static void method3184(int arg0) {
        field7904 = null;
        field7902 = null;
        field7906 = null;
        field7907 = null;
        if (arg0 != -10) {
            method3184(-59);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)B", line = 59)
    public static final byte method3185(int arg0, byte arg1, int arg2) {
        field7899++;
        if (arg2 == 9) {
            int var3 = 37 % ((-arg1 - 22) / 35);
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([BZLjava/lang/String;I)I", line = 80)
    public static final int method3186(byte[] arg0, boolean arg1, String arg2, int arg3) {
        field7901++;
        if (arg1) {
            return -31;
        }
        int var4 = arg2.length();
        int var5 = arg3;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 <= '\u007F') {
                arg0[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg0[var5++] = (byte) (class311.method1956(12325, var7) >> 6);
                arg0[var5++] = (byte) class311.method1956(class519.method3092(var7, 63), 128);
            } else {
                arg0[var5++] = (byte) (class311.method1956(var7, 918573) >> 12);
                arg0[var5++] = (byte) class311.method1956(class519.method3092(4064, var7) >> 6, 128);
                arg0[var5++] = (byte) class311.method1956(128, class519.method3092(var7, 63));
            }
        }
        return var5 - arg3;
    }
}
