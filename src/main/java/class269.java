import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class269 {

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "Lhk;")
    public static class153 field3785 = new class153(8, 0, 4, 1);

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field3798 = 0;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public int field3786;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "[B")
    public byte[] field3791;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "[B")
    public byte[] field3797;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "[Lnfa;")
    public static class745[] field3800;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
    public static void method1717(byte arg0) {
        if (arg0 < 82) {
            method1717((byte) -28);
        }
        field3800 = null;
        field3785 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)I")
    public static final int method1718(int arg0, int arg1) {
        field3794++;
        int var2 = arg1;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 = arg1 + 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BIII)I")
    public static final int method1719(byte arg0, int arg1, int arg2, int arg3) {
        field3796++;
        if (class466.field6347 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class751.field10445;
        if (arg0 >= -36) {
            field3785 = null;
        }
        int var7 = arg1 - class751.field10446;
        for (class770 var8 = (class770) class751.field10432.method3731((byte) -97); var8 != null; var8 = (class770) class751.field10432.method3729((byte) 43)) {
            if (var8.field10634 == arg2) {
                int var9 = var8.field10629;
                int var10 = var8.field10626;
                int var11 = var10 + class751.field10446 | var9 - -class751.field10445 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)Lmha;")
    public static final class422 method1720(boolean arg0) {
        if (arg0) {
            method1720(false);
        }
        field3795++;
        class335.field4759 = 0;
        return class411.method2420((byte) 101);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)[Lbn;")
    public static final class517[] method1721(int arg0) {
        field3801++;
        return arg0 == -2 ? new class517[] { class94.field1340, class547.field7574, class210.field3079, class121.field2060, class63.field963, class583.field8378 } : null;
    }
}
