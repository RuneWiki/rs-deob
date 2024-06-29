import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class489 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    private int field6724 = -1;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lv;")
    private class165 field6731 = new class165();

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Z")
    public static boolean field6728 = false;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
    public static int[] field6730 = new int[3];

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "J")
    private long field6729;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static void method2891(byte arg0) {
        if (arg0 != 34) {
            field6728 = false;
        }
        field6730 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLgga;)Lom;")
    public static final class389 method2892(byte arg0, class511 arg1) {
        field6727++;
        int var2 = arg1.method3013(-110);
        class267 var3 = class278.method1807(4)[arg1.method3013(7)];
        class15 var4 = class282.method1834(0)[arg1.method3013(-127)];
        int var5 = arg1.method3034(1);
        int var6 = arg1.method3034(1);
        int var7 = arg1.method3002(-1);
        int var8 = arg1.method3002(-1);
        int var9 = arg1.method3008(64);
        int var10 = arg1.method3008(64);
        if (arg0 >= -72) {
            field6730 = null;
        }
        int var11 = arg1.method3008(64);
        boolean var12 = arg1.method3013(-114) == 1;
        return new class389(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(BLgga;)V")
    private final void method2893(byte arg0, class511 arg1) {
        field6726++;
        this.field6729 = arg1.method3020(true);
        if (arg0 >= -13) {
            return;
        }
        this.field6724 = arg1.method3008(64);
        for (int var3 = arg1.method3013(12); var3 != 0; var3 = arg1.method3013(-107)) {
            if (class333.field4775) {
                System.out.println("t:" + var3);
            }
            class172 var4;
            if (var3 == 3) {
                var4 = new class315();
            } else if (var3 == 1) {
                var4 = new class24();
            } else if (var3 == 4) {
                var4 = new class322();
            } else if (var3 == 6) {
                var4 = new class642();
            } else if (var3 == 5) {
                var4 = new class465();
            } else if (var3 == 2) {
                var4 = new class630();
            } else if (var3 == 7) {
                var4 = new class567();
            } else if (var3 == 8) {
                var4 = new class379();
            } else if (var3 == 9) {
                var4 = new class751();
            } else if (var3 == 10) {
                var4 = new class135();
            } else if (var3 == 11) {
                var4 = new class543();
            } else if (var3 == 12) {
                var4 = new class131();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var4.method102(2048, arg1);
            this.field6731.method1039(var4, 0);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lhia;I)V")
    public final void method2894(class48 arg0, int arg1) {
        field6732++;
        if (this.field6729 != arg0.field536 || this.field6724 != arg0.field567) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class425.method2564(arg0.field536, arg1 + 1) + " updateNum:" + arg0.field567 + " delta.owner:" + class425.method2564(this.field6729, arg1 + 1) + " updateNum:" + this.field6724);
        }
        for (class172 var3 = (class172) this.field6731.method1041(1048832); var3 != null; var3 = (class172) this.field6731.method1033(-1)) {
            var3.method100((byte) 71, arg0);
        }
        if (arg1 != -1) {
            this.field6731 = null;
        }
        arg0.field567++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIB)I")
    public static final int method2895(int arg0, boolean arg1, int arg2, byte arg3) {
        field6725++;
        class717 var4 = class159.method1020(arg1, false, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 0;
            if (arg3 < 15) {
                field6728 = false;
            }
            while (var6 < var4.field9935.length) {
                if (var4.field9937[var6] == arg0) {
                    var5 += var4.field9935[var6];
                }
                var6++;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lgga;)V")
    public class489(class511 arg0) {
        this.method2893((byte) -71, arg0);
    }
}
