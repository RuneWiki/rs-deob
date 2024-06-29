import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class406 extends class18 {

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[I")
    public static int[] field6106 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Laa;")
    public static class76 field6109 = new class76(9, 0);

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "C")
    public char field6104;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public int field6112;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "J")
    public long field6113;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Luh;")
    public class406 field6119;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Z")
    public boolean field6110;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "[Ll;")
    public static class127[] field6122;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "[[S")
    public static short[][] field6118;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2441(int arg0, long arg1) {
        class519.field7606.setTime(new Date(arg1));
        if (arg0 != 10) {
            method2444(-86, -17, (byte) -47, -31, 52, -51, 88, -43, -2);
        }
        field6120++;
        int var3 = class519.field7606.get(7);
        int var4 = class519.field7606.get(5);
        int var5 = class519.field7606.get(2);
        int var6 = class519.field7606.get(1);
        int var7 = class519.field7606.get(11);
        int var8 = class519.field7606.get(12);
        int var9 = class519.field7606.get(13);
        return class476.field7025[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class491.field7316[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)Z")
    public final boolean method200(boolean arg0) {
        if (arg0) {
            method2444(45, -93, (byte) -109, 11, -31, 94, -55, -39, 113);
        }
        field6108++;
        return this.field6110;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)I")
    public final int method209(boolean arg0) {
        if (arg0) {
            field6117++;
            return this.field6121;
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)Lgo;")
    public static final class310 method2442(byte arg0, int arg1, int arg2) {
        field6107++;
        class310 var3 = class52.method386(0, arg1);
        if (arg0 >= -38) {
            field6122 = null;
        }
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4788 == null || arg2 >= var3.field4788.length) {
            return null;
        } else {
            return var3.field4788[arg2];
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIZI)V")
    public static final void method2443(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        class459.field6705 = arg2;
        class6.field60 = arg1;
        class460.field6713 = arg0;
        field6105++;
        class4.field33 = arg4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method2444(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 110) {
            method2442((byte) -66, 122, -43);
        }
        field6116++;
        class426.method2528(arg7, arg3, -75, arg5, arg0, arg6, 0, arg4, arg1, arg8);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)C")
    public final char method203(byte arg0) {
        field6111++;
        if (arg0 < 10) {
            this.method209(true);
        }
        return this.field6104;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)I")
    public final int method201(byte arg0) {
        field6115++;
        if (arg0 != -80) {
            field6106 = null;
        }
        return this.field6112;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public static void method2445(int arg0) {
        field6109 = null;
        int var1 = -32 % ((arg0 + 54) / 40);
        field6122 = null;
        field6118 = null;
        field6106 = null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)J")
    public final long method204(int arg0) {
        field6114++;
        if (arg0 < 3) {
            this.method204(18);
        }
        return this.field6113;
    }
}
