import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class206 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lsf;")
    public static class108 field3697 = class140.method973(255, "hint_headicons");

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lsf;")
    public static class108 field3700 = null;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Ljd;")
    public static class141 field3694 = new class141();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[[[Lje;")
    public static class74[][][] field3701;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILrm;)V", line = 4)
    private final void method1441(int arg0, int arg1, class249 arg2) {
        field3695++;
        if (~arg0 == arg1) {
            this.field3698 = arg2.method1712(-1);
            this.field3704 = arg2.method1731(true);
            this.field3699 = arg2.method1731(true);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 24)
    public static void method1442(int arg0) {
        field3700 = null;
        field3694 = null;
        field3697 = null;
        field3701 = (class74[][][]) null;
        if (arg0 < 28) {
            field3701 = (class74[][][]) ((class74[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLrm;)V", line = 46)
    public final void method1443(byte arg0, class249 arg1) {
        field3696++;
        while (true) {
            int var3 = arg1.method1731(true);
            if (var3 == 0) {
                if (arg0 != 2) {
                    field3693 = 46;
                }
                return;
            }
            this.method1441(var3, -2, arg1);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZII[B)Z", line = 70)
    public static final boolean method1444(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field3691++;
        class249 var4 = new class249(arg3);
        int var5 = -1;
        boolean var6 = arg0;
        label57: while (true) {
            int var7 = var4.method1710((byte) -124);
            if (var7 == 0) {
                return var6;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method1739((byte) -117);
                    if (var11 == 0) {
                        continue label57;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var4.method1731(true) >> 2;
                    int var14 = (var8 & 0xFC7) >> 6;
                    int var15 = arg2 + var14;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class60 var17 = class201.method1424(var5, (byte) 117);
                        if (var13 != 22 || class137.field2427 || var17.field928 != 0 || var17.field946 == 1 || var17.field937) {
                            if (!var17.method417((byte) 72)) {
                                class155.field2793++;
                                var6 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var4.method1739((byte) -92);
                if (var10 == 0) {
                    break;
                }
                var4.method1731(true);
            }
        }
    }
}
