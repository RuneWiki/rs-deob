import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class93 extends class196 {

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public int field1673 = 0;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Lai;")
    public class10 field1678 = class107.field1985;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Ldd;")
    public static class34 field1668 = new class34(64);

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "Lai;")
    public static class10 field1683 = class44.method278("Fertigkeit)2", 116);

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field1682 = 0;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field1684 = 0;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "[I")
    public static int[] field1685 = new int[128];

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field1688 = 255;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Lai;")
    public static class10 field1686 = class44.method278("gleiten:", -26);

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field1690 = 0;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "[I")
    public int[] field1669;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
    public int[] field1675;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "[Lai;")
    public class10[] field1671;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "[Lta;")
    public static class173[] field1680;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "[Lbf;")
    public static class17[] field1672;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "[S")
    public static short[] field1681;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JZ)V")
    public static final void method609(long arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field1677++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class78.field1375; var3++) {
            if (class153.field2935[var3] == arg0) {
                class78.field1375--;
                for (int var4 = var3; var4 < class78.field1375; var4++) {
                    class153.field2935[var4] = class153.field2935[var4 + 1];
                    class11.field178[var4] = class11.field178[var4 + 1];
                }
                class124.field2369++;
                class98.field1812 = class7.field78;
                class76.field1323.method635((byte) -84, 127);
                class76.field1323.method783(arg0, -97);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static final void method610(byte arg0) {
        field1670++;
        int var1 = -67 / ((62 - arg0) / 57);
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static void method611(byte arg0) {
        field1672 = null;
        field1668 = null;
        field1680 = null;
        field1683 = null;
        field1686 = null;
        field1681 = null;
        field1685 = null;
        if (arg0 != -67) {
            field1688 = 30;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILme;)V")
    private final void method612(int arg0, int arg1, class114 arg2) {
        if (arg1 != 3) {
            method610((byte) 90);
        }
        if (arg0 == 1) {
            this.field1674 = arg2.method767(true);
        } else if (arg0 == 2) {
            this.field1689 = arg2.method767(true);
        } else if (arg0 == 3) {
            this.field1678 = arg2.method764((byte) 11);
        } else if (arg0 == 4) {
            this.field1676 = arg2.method761(255);
        } else if (arg0 == 5) {
            this.field1673 = arg2.method762((byte) 100);
            this.field1671 = new class10[this.field1673];
            this.field1669 = new int[this.field1673];
            for (int var5 = 0; var5 < this.field1673; var5++) {
                this.field1669[var5] = arg2.method761(255);
                this.field1671[var5] = arg2.method764((byte) 73);
            }
        } else if (arg0 == 6) {
            this.field1673 = arg2.method762((byte) 88);
            this.field1669 = new int[this.field1673];
            this.field1675 = new int[this.field1673];
            for (int var4 = 0; var4 < this.field1673; var4++) {
                this.field1669[var4] = arg2.method761(255);
                this.field1675[var4] = arg2.method761(255);
            }
        }
        field1679++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lme;I)V")
    public final void method613(class114 arg0, int arg1) {
        if (arg1 != 0) {
            method609(-97L, false);
        }
        while (true) {
            int var3 = arg0.method767(true);
            if (var3 == 0) {
                field1687++;
                return;
            }
            this.method612(var3, 3, arg0);
        }
    }
}
