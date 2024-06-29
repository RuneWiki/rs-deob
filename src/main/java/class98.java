import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class98 extends class33 {

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "[Lob;")
    public static class141[] field1780 = new class141[4];

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "Lrd;")
    public static class173 field1781 = class133.method843("Neuer Benutzer", 82);

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Lrd;")
    public static class173 field1783 = class133.method843("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 10);

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    private int field1782;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    private int field1792;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "Lbc;")
    public static class14 field1789;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "Ldh;")
    public static class39 field1790;

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
    private class98(int arg0) {
        super(0, false);
        this.method602((byte) -25, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 > -99) {
            this.method602((byte) 114, -63);
        }
        ++field1784;
        if (arg0 == 0) {
            this.method602((byte) -25, arg2.method780(16711680));
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public static void method600(int arg0) {
        field1789 = null;
        field1790 = null;
        if (arg0 != -6561) {
            field1789 = null;
        }
        field1780 = null;
        field1783 = null;
        field1781 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class98() {
        this(0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -17123) {
            field1794 = -124;
        }
        ++field1787;
        int var7 = 2047 & -arg0 + 2048;
        int var8 = 0;
        int var9 = 0;
        int var10 = -arg5 + 2048 & 2047;
        int var11 = arg4;
        if (var7 != 0) {
            int var12 = class72.field1396[var7];
            int var13 = class72.field1404[var7];
            int var14 = var9 * var13 + -(arg4 * var12) >> 16;
            var11 = var9 * var12 - -(arg4 * var13) >> 16;
            var9 = var14;
        }
        if (var10 != 0) {
            int var15 = class72.field1404[var10];
            int var16 = class72.field1396[var10];
            int var17 = var8 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 + -(var8 * var16) >> 16;
            var8 = var17;
        }
        class168.field3246 = -var9 + arg3;
        class183.field3595 = arg5;
        class186.field3635 = arg0;
        class97.field1778 = -var11 + arg6;
        class62.field1225 = arg2 - var8;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        if (arg0 < 112) {
            return null;
        } else {
            ++field1786;
            int[][] var3 = super.field731.method1340(-119, arg1);
            if (super.field731.field3925) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class117.field2173 < ~var7; ++var7) {
                    var4[var7] = this.field1782;
                    var5[var7] = this.field1795;
                    var6[var7] = this.field1792;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
    private final void method602(byte arg0, int arg1) {
        this.field1795 = 4080 & arg1 >> 4;
        this.field1792 = (arg1 & 255) << 4;
        if (arg0 != -25) {
            this.method177(-19, 122, (class121) null);
        }
        this.field1782 = (16711680 & arg1) >> 12;
        ++field1788;
    }
}
