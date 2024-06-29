import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class330 extends class79 {

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lva;")
    public static class288 field4663 = new class288(64);

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lns;")
    public static class230 field4667;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[[[I")
    public static int[][][] field4670;

    static {
        new class362("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field4668 = -1;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B[Ljava/lang/String;I[SI)V", line = 9)
    public static final void method2127(byte arg0, String[] arg1, int arg2, short[] arg3, int arg4) {
        if (arg0 < 76) {
            return;
        }
        field4666++;
        if (arg2 <= arg4) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg4;
        String var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var8;
        for (int var9 = arg4; var9 < arg2; var9++) {
            if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                String var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var8;
        method2127((byte) 82, arg1, var6 - 1, arg3, arg4);
        method2127((byte) 98, arg1, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BII)I", line = 63)
    public static final int method2128(byte arg0, int arg1, int arg2) {
        field4669++;
        if (arg0 <= 37) {
            method2129(-110);
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 88)
    public static void method2129(int arg0) {
        field4667 = null;
        field4670 = null;
        if (arg0 != -1) {
            method2129(98);
        }
        field4663 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lec;", line = 103)
    public static final class128 method2130(int arg0, int arg1) {
        field4664++;
        class128 var2 = (class128) class39.field443.method856((long) arg0, (byte) 123);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -2) {
            field4667 = null;
        }
        byte[] var3 = class406.field5866.method2431((byte) 82, arg0, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class128 var4 = class348.method2227(var3, arg1 ^ 0xFFFFA69C);
            class39.field443.method849((byte) 63, var4, (long) arg0);
            return var4;
        }
    }
}
