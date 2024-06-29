import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public abstract class class61 extends class112 {

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "Z")
    public boolean field810 = false;

    @OriginalMember(owner = "client!gda", name = "B", descriptor = "I")
    public static int field821 = -1;

    @OriginalMember(owner = "client!gda", name = "A", descriptor = "Lbja;")
    public static class34 field820 = new class34(11, 0, 1, 2);

    @OriginalMember(owner = "client!gda", name = "E", descriptor = "[I")
    public static int[] field824 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!gda", name = "F", descriptor = "[Liaa;")
    public static class521[] field825 = new class521[2048];

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "B")
    public byte field808;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "B")
    public byte field811;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!gda", name = "s", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!gda", name = "t", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!gda", name = "v", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!gda", name = "x", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!gda", name = "y", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!gda", name = "D", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!gda", name = "C", descriptor = "Lgda;")
    public class61 field822;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "Z")
    public boolean field807;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IBI)Z")
    public static final boolean method521(int arg0, byte arg1, int arg2) {
        if (arg1 != 41) {
            method527(-26, -98, 68);
        }
        field812++;
        return (arg0 & 0x70000) != 0 | class173.method1170(arg0, (byte) 40, arg2) || class551.method3229(arg0, 64, arg2);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IBILha;)Z")
    public abstract boolean method501(int arg0, byte arg1, int arg2, class66 arg3);

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)V")
    public static void method522(byte arg0) {
        if (arg0 > 73) {
            field820 = null;
            field825 = null;
            field824 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lha;B)Z")
    public abstract boolean method523(class66 arg0, byte arg1);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lgda;Lha;IIZII)V")
    public abstract void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(Lha;I)V")
    public abstract void method500(class66 arg0, int arg1);

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(Z)I")
    public int method499(boolean arg0) {
        if (arg0) {
            field819++;
            return 0;
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIB[Lkp;)I")
    public final int method525(int arg0, int arg1, byte arg2, class515[] arg3) {
        field805++;
        long var5 = class425.field5640[this.field808][arg1][arg0];
        long var7 = 0L;
        if (arg2 > -104) {
            return 112;
        }
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg3[var9++] = class331.field4094[var10 - 1].field1374;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg3[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "(I)I")
    public abstract int method508(int arg0);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(CB)B")
    public static final byte method526(char arg0, byte arg1) {
        field815++;
        if (arg1 != -102) {
            method532(101, 83);
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(III)Z")
    public static final boolean method527(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method532(2, -105);
        }
        field818++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B[Lkp;)I")
    public abstract int method528(byte arg0, class515[] arg1);

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)I")
    public abstract int method509(int arg0);

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(Z)Z")
    public abstract boolean method503(boolean arg0);

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)Z")
    public abstract boolean method504(byte arg0);

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(ILha;)Lrk;")
    public abstract class35 method502(int arg0, class66 arg1);

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "(I)Z")
    public abstract boolean method529(int arg0);

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(Z)V")
    public abstract void method530(boolean arg0);

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "(Z)Z")
    public abstract boolean method531(boolean arg0);

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)I")
    public static final int method532(int arg0, int arg1) {
        return class68.field940 == null ? 0 : class68.field940[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZLha;)Loba;")
    public abstract class276 method507(boolean arg0, class66 arg1);
}
