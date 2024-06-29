import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class136 extends class271 {

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "Lwa;")
    public static class75 field2331 = class66.method560("slr2)3ws?order=LPWM", false);

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Lql;")
    public static class16 field2328 = new class16(5000);

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "[Z")
    public static boolean[] field2336 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "[[I")
    public static int[][] field2337 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "Lvd;")
    private class126 field2332;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lcb;")
    public static class267 field2333;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "Lcb;")
    public static class267 field2339;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Lfb;")
    public static class55 field2326;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Z")
    public static boolean field2327;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method1040(int arg0, boolean arg1) {
        class54.method393((byte) 43);
        field2335++;
        if (class118.field2003 != 30 && class118.field2003 != 25) {
            return;
        }
        class310.field5293++;
        if (class310.field5293 < 50 && !arg1) {
            return;
        }
        class310.field5293 = 0;
        if (arg0 != 32) {
            return;
        }
        if (!class167.field2825 && class35.field513 != null) {
            class94.field1525++;
            class89.field1470.method87(65280, 199);
            try {
                class35.field513.method2043(class89.field1470.field997, class89.field1470.field1012, 0, -31544);
                class89.field1470.field1012 = 0;
            } catch (IOException var3) {
                class167.field2825 = true;
            }
        }
        class54.method393((byte) 43);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)I", line = 44)
    public final int method1041(byte arg0, int arg1, int arg2) {
        field2324++;
        if (this.field2332 == null) {
            return arg1;
        }
        class8 var4 = (class8) this.field2332.method1007((long) arg2, -17004);
        if (arg0 == 97) {
            return var4 == null ? arg1 : var4.field109;
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lja;B)V", line = 64)
    public final void method1042(class60 arg0, byte arg1) {
        field2329++;
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                if (arg1 != -78) {
                    field2327 = true;
                }
                return;
            }
            this.method1044(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILwa;B)Lwa;", line = 85)
    public final class75 method1043(int arg0, class75 arg1, byte arg2) {
        field2323++;
        if (this.field2332 == null) {
            return arg1;
        } else {
            int var4 = -106 / ((arg2 - 59) / 51);
            class111 var5 = (class111) this.field2332.method1007((long) arg0, -17004);
            return var5 == null ? arg1 : var5.field1893;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lja;IZ)V", line = 105)
    private final void method1044(class60 arg0, int arg1, boolean arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method501(0);
            if (this.field2332 == null) {
                int var5 = class118.method904(1440830960, var4);
                this.field2332 = new class126(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method501(0) == 1;
                int var8 = arg0.method489(-98);
                class206 var9;
                if (var7) {
                    var9 = new class111(arg0.method532(-1));
                } else {
                    var9 = new class8(arg0.method505(255));
                }
                this.field2332.method1004((byte) 73, (long) var8, var9);
            }
        }
        if (!arg2) {
            field2330++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I", line = 151)
    public static final int method1045(int arg0) {
        field2325++;
        if (arg0 != -17444) {
            method1046(-28, (class38[]) null);
        }
        return class145.field2499;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[Lcg;)V", line = 168)
    public static final void method1046(int arg0, class38[] arg1) {
        class215.field3672[arg0] = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 172)
    public static final void method1047(byte arg0) {
        class301.field5144 = null;
        class61.field1072 = null;
        if (arg0 >= -20) {
            method1040(111, false);
        }
        class132.field2280 = null;
        class63.field1101 = null;
        class246.field4156 = null;
        class215.field3675 = null;
        class24.field316 = null;
        class272.field4698 = null;
        class205.field3476 = null;
        class116.field1957 = null;
        class24.field306 = null;
        class269.field4654 = null;
        class89.field1473 = null;
        class196.field3295 = null;
        class94.field1526 = null;
        class69.field1188 = null;
        class3.field28 = null;
        class283.field4891 = null;
        class133.field2290 = null;
        class168.field2836 = null;
        field2334++;
        class66.field1144 = null;
        class51.field842 = null;
        class37.field544 = null;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V", line = 212)
    public static void method1048(int arg0) {
        field2339 = null;
        if (arg0 != 20754) {
            method1046(39, (class38[]) null);
        }
        field2328 = null;
        field2337 = (int[][]) null;
        field2331 = null;
        field2326 = null;
        field2336 = null;
        field2333 = null;
    }
}
