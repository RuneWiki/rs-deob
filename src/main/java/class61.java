import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class61 extends class148 {

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Lel;")
    public class218 field939 = new class218();

    @OriginalMember(owner = "client!g", name = "G", descriptor = "Lhk;")
    public class38 field949 = new class38();

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Lnd;")
    private class216 field946;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Lel;")
    public static class218 field945 = new class218();

    @OriginalMember(owner = "client!g", name = "P", descriptor = "Lma;")
    public static class5 field958 = class12.method119("null", (byte) 101);

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Lma;")
    public static class5 field955 = class12.method119("Speicher wird zugewiesen)3", (byte) 87);

    @OriginalMember(owner = "client!g", name = "R", descriptor = "Lma;")
    private static class5 field960 = class12.method119("Loading title screen )2 ", (byte) 125);

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Lma;")
    public static class5 field957 = field960;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "Z")
    public static boolean field961 = true;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "Lma;")
    public static class5 field959 = class12.method119("::cardmem", (byte) 120);

    @OriginalMember(owner = "client!g", name = "L", descriptor = "Lva;")
    public static class194 field954 = new class194();

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Lje;")
    public static class158 field953;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "Lje;")
    public static class158 field956;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "()Loj;", line = 5)
    public final class148 method279() {
        class41 var1 = (class41) this.field939.method1475(14);
        field942++;
        if (var1 == null) {
            return null;
        } else if (var1.field637 == null) {
            return this.method270();
        } else {
            return var1.field637;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "([III)V", line = 27)
    public final void method271(int[] arg0, int arg1, int arg2) {
        this.field949.method271(arg0, arg1, arg2);
        for (class41 var4 = (class41) this.field939.method1475(14); var4 != null; var4 = (class41) this.field939.method1486(38)) {
            if (!this.field946.method1428(var4, (byte) -54)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field633 >= var6) {
                        this.method449(-9190, arg0, var5, var4, var5 + var6, var6);
                        var4.field633 -= var6;
                        break;
                    }
                    this.method449(-9190, arg0, var5, var4, var5 + var6, var4.field633);
                    var5 += var4.field633;
                    var6 -= var4.field633;
                } while (!this.field946.method1424(arg0, var4, (byte) -108, var5, var6));
            }
        }
        field943++;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V", line = 61)
    public static void method448(byte arg0) {
        field957 = null;
        field959 = null;
        field955 = null;
        field945 = null;
        field958 = null;
        field954 = null;
        field960 = null;
        field953 = null;
        if (arg0 != 66) {
            method451((class202) null, (byte) 47);
        }
        field956 = null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V", line = 80)
    public final void method274(int arg0) {
        field947++;
        this.field949.method274(arg0);
        for (class41 var2 = (class41) this.field939.method1475(14); var2 != null; var2 = (class41) this.field939.method1486(38)) {
            if (!this.field946.method1428(var2, (byte) -54)) {
                int var3 = arg0;
                do {
                    if (var2.field633 >= var3) {
                        this.method452(var2, 0, var3);
                        var2.field633 -= var3;
                        break;
                    }
                    this.method452(var2, 0, var2.field633);
                    var3 -= var2.field633;
                } while (!this.field946.method1424((int[]) null, var2, (byte) -91, 0, var3));
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()I", line = 112)
    public final int method272() {
        field941++;
        return 0;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()Loj;", line = 121)
    public final class148 method270() {
        field950++;
        class41 var1;
        do {
            var1 = (class41) this.field939.method1486(38);
            if (var1 == null) {
                return null;
            }
        } while (var1.field637 == null);
        return var1.field637;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[IILri;II)V", line = 153)
    private final void method449(int arg0, int[] arg1, int arg2, class41 arg3, int arg4, int arg5) {
        field940++;
        if ((this.field946.field3446[arg3.field631] & 0x4) != 0 && arg3.field636 < 0) {
            int var7 = this.field946.field3454[arg3.field631] / class138.field2049;
            while (true) {
                int var8 = (1048575 - (arg3.field643 - var7)) / var7;
                if (var8 > arg5) {
                    arg3.field643 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg3.field637.method271(arg1, arg2, var8);
                int var9 = class138.field2049 / 100;
                arg3.field643 += var7 * var8 - 1048576;
                arg2 += var8;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class108 var11 = arg3.field637;
                if (this.field946.field3463[arg3.field631] == 0) {
                    arg3.field637 = class108.method692(arg3.field626, var11.method698(), var11.method701(), var11.method695());
                } else {
                    arg3.field637 = class108.method692(arg3.field626, var11.method698(), 0, var11.method695());
                    this.field946.method1440(arg3, arg3.field621.field1465[arg3.field629] < 0, 240642956);
                    arg3.field637.method705(var9, var11.method701());
                }
                if (arg3.field621.field1465[arg3.field629] < 0) {
                    arg3.field637.method700(-1);
                }
                var11.method707(var9);
                var11.method271(arg1, arg2, arg4 - arg2);
                if (var11.method688()) {
                    this.field949.method275(var11);
                }
            }
        }
        arg3.field637.method271(arg1, arg2, arg5);
        if (arg0 != -9190) {
            this.field946 = (class216) null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lma;I)Z", line = 220)
    public static final boolean method450(class5 arg0, int arg1) {
        field951++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class275.field4698; var2++) {
            if (arg0.method29(61, class244.field4048[var2])) {
                return true;
            }
        }
        if (arg0.method29(61, class151.field2183.field1367)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lnd;)V", line = 369)
    public class61(class216 arg0) {
        this.field946 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lni;B)V", line = 251)
    public static final void method451(class202 arg0, byte arg1) {
        class49.field769 = class218.method1482(0, arg0, class239.field3976, (byte) -44);
        field944++;
        class5.field36 = new class178[class49.field769.length];
        class118.field1789 = new class178[class49.field769.length];
        class14.field267 = new class178[class49.field769.length];
        for (int var2 = 0; var2 < class49.field769.length; var2++) {
            class49.field769[var2].method1165();
            class5.field36[var2] = class49.field769[var2].method1166();
            class49.field769[var2].method1165();
            class118.field1789[var2] = class49.field769[var2].method1166();
            class49.field769[var2].method1165();
            class14.field267[var2] = class49.field769[var2].method1166();
            class49.field769[var2].method1165();
        }
        class130.field1943 = class141.method908(arg0, 0, 0, class137.field2029);
        class294.field4957 = class230.method1636(class210.field3341, 0, arg0, 256);
        class217.field3498 = class230.method1636(class208.field3302, 0, arg0, 256);
        if (arg1 <= 82) {
            method448((byte) -121);
        }
        class185.field2841 = class230.method1636(class24.field423, 0, arg0, 256);
        class180.field2722 = class230.method1636(class50.field780, 0, arg0, 256);
        class66.field1030 = class193.method1268(arg0, (byte) -42, 0, class228.field3780);
        class90.field1344 = class193.method1268(arg0, (byte) -17, 0, class5.field50);
        class209.field3327 = class15.method137(-125, 0, arg0, class37.field592);
        class55.field855 = class193.method1268(arg0, (byte) -35, 0, class244.field4054);
        class213.field3382 = class193.method1268(arg0, (byte) -74, 0, class284.field4807);
        class202.field3240 = class241.method1702((byte) -119, class126.field1888, 0, arg0);
        class20.field343 = class241.method1702((byte) -119, class247.field4093, 0, arg0);
        class282.field4791.method2034(class20.field343, (int[]) null);
        class72.field1127.method2034(class20.field343, (int[]) null);
        class201.field3197.method2034(class20.field343, (int[]) null);
        class134.field1985 = class218.method1482(0, arg0, class231.field3839, (byte) -44);
        for (int var3 = 0; var3 < class134.field1985.length; var3++) {
            class134.field1985[var3].method1159();
        }
        class222 var4 = class157.method1007(0, class251.field4158, (byte) -97, arg0);
        var4.method1563();
        class65.field1026 = new class109(var4);
        class222[] var5 = class141.method908(arg0, 0, 0, class259.field4419);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1563();
        }
        class204.field3261 = new class237[var5.length];
        for (int var7 = 0; var7 < var5.length; var7++) {
            class204.field3261[var7] = new class109(var5[var7]);
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class130.field1943.length; var12++) {
            class130.field1943[var12].method1566(var8 + var11, var9 - -var11, var10 + var11);
        }
        class49.field769[0].method1162(var8 + var11, var9 + var11, var10 + var11);
        class232.field3862 = new class237[class130.field1943.length];
        for (int var13 = 0; var13 < class130.field1943.length; var13++) {
            class232.field3862[var13] = new class109(class130.field1943[var13]);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lri;II)V", line = 381)
    private final void method452(class41 arg0, int arg1, int arg2) {
        if ((this.field946.field3446[arg0.field631] & 0x4) != 0 && arg0.field636 < 0) {
            int var4 = this.field946.field3454[arg0.field631] / class138.field2049;
            int var5 = (1048575 - (arg0.field643 - var4)) / var4;
            arg0.field643 = arg2 * var4 + arg0.field643 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field946.field3463[arg0.field631] == 0) {
                    arg0.field637 = class108.method692(arg0.field626, arg0.field637.method698(), arg0.field637.method701(), arg0.field637.method695());
                } else {
                    arg0.field637 = class108.method692(arg0.field626, arg0.field637.method698(), 0, arg0.field637.method695());
                    this.field946.method1440(arg0, arg0.field621.field1465[arg0.field629] < 0, 240642956);
                }
                if (arg0.field621.field1465[arg0.field629] < 0) {
                    arg0.field637.method700(-1);
                }
                arg2 = arg0.field643 / var4;
            }
        }
        arg0.field637.method274(arg2);
        field948++;
        if (arg1 != 0) {
            method450((class5) null, 58);
        }
    }
}
