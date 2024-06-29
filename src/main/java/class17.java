import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 extends class113 {

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lu;")
    public static class135 field372 = class87.method676((byte) -125, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "[I")
    public static int[] field373 = new int[5];

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "Lu;")
    public static class135 field378 = class87.method676((byte) -60, "Fallen lassen");

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field377 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
    public static int field381 = 1;

    @OriginalMember(owner = "client!cb", name = "pb", descriptor = "Lu;")
    private static class135 field383 = class87.method676((byte) -51, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!cb", name = "rb", descriptor = "Lu;")
    public static class135 field385 = field383;

    @OriginalMember(owner = "client!cb", name = "tb", descriptor = "Lu;")
    private static class135 field387 = class87.method676((byte) -118, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!cb", name = "ob", descriptor = "Lu;")
    public static class135 field382 = field387;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!cb", name = "qb", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cb", name = "sb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!cb", name = "mb", descriptor = "Lv;")
    public static class141 field380;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lic;II)V")
    private final void method107(class59 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field371 = arg0.method483((byte) 24);
            this.field370 = arg0.method480(0);
            this.field376 = arg0.method480(0);
        }
        if (arg2 != 15686) {
            field385 = null;
        }
        field374++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Lma;")
    public static final class84 method108(int arg0, int arg1) {
        field384++;
        class84 var2 = (class84) class79.field1878.method239(arg1 + 9325, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field2523.method324(arg1, arg0, 12);
        class84 var4 = new class84();
        if (var3 != null) {
            var4.method650(new class59(var3), -115);
        }
        var4.method656(arg1 - 116);
        class79.field1878.method241(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
    public static final void method109(byte arg0, int arg1, int arg2) {
        int var3 = 0;
        field367++;
        if (arg0 != 80) {
            return;
        }
        for (int var4 = 0; var4 < 100; var4++) {
            if (class125.field2976[var4] != null) {
                int var5 = class117.field2804[var4];
                int var6 = class53.field1261 + 70 + 4 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class135 var7 = class25.field589[var4];
                if (var7 != null && var7.method1087(class56.field1369, (byte) -52)) {
                    var7 = var7.method1065((byte) -54, 5);
                }
                if (var7 != null && var7.method1087(class26.field626, (byte) -52)) {
                    var7 = var7.method1065((byte) -29, 5);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class79.field1858 == 0 || class79.field1858 == 1 && class9.method48(var7, arg0 ^ 0x50))) {
                    if (arg1 > var6 - 14 && arg1 <= var6 && !var7.method1101(class116.field2789.field3516, (byte) 112)) {
                        class9.field161++;
                        class50.field1183++;
                        if (class5.field128 >= 1) {
                            class111.field2693++;
                            class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var7 }), class124.field2948, 0, 45);
                        }
                        class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var7 }), class146.field3550, 0, 56);
                        class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var7 }), class82.field1948, 0, 13);
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class63.field1559 == 0 && (var5 == 7 || class48.field1135 == 0 || class48.field1135 == 1 && class9.method48(var7, arg0 ^ 0x50))) {
                    if (arg1 > var6 - 14 && arg1 <= var6) {
                        if (class5.field128 >= 1) {
                            class111.field2693++;
                            class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var7 }), class124.field2948, 0, 45);
                        }
                        class50.field1183++;
                        class9.field161++;
                        class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var7 }), class146.field3550, 0, 56);
                        class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var7 }), class82.field1948, 0, 13);
                    }
                    var3++;
                }
                if (var5 == 4 && (class126.field3014 == 0 || class126.field3014 == 1 && class9.method48(var7, 0))) {
                    var3++;
                    if (arg1 > var6 - 14 && var6 >= arg1) {
                        class49.field1155++;
                        class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var7 }), class152.field3758, 0, 2);
                    }
                }
                if ((var5 == 5 || var5 == 6) && class63.field1559 == 0 && class48.field1135 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class126.field3014 == 0 || class126.field3014 == 1 && class9.method48(var7, arg0 - 80))) {
                    if (arg1 > var6 - 14 && arg1 <= var6) {
                        class95.method785(0, (byte) -99, 0, class107.method867(2, new class135[] { class49.field1160, var7 }), class9.field175, 0, 51);
                        class84.field1991++;
                    }
                    var3++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLic;)V")
    public final void method110(byte arg0, class59 arg1) {
        while (true) {
            int var3 = arg1.method480(0);
            if (var3 == 0) {
                field369++;
                if (arg0 < 44) {
                    method113(-121, 34, 101, 81, 127, 111, -119);
                    return;
                }
                return;
            }
            this.method107(arg1, var3, 15686);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method111(boolean arg0) {
        if (arg0) {
            field382 = null;
        }
        field373 = null;
        field380 = null;
        field383 = null;
        field378 = null;
        field387 = null;
        field377 = null;
        field382 = null;
        field385 = null;
        field372 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lg;Lg;I)V")
    public static final void method112(class43 arg0, class43 arg1, int arg2) {
        class119.field2869 = arg1;
        if (arg2 != 31128) {
            method113(-70, 86, -114, -43, -43, -106, 42);
        }
        class42.field968 = arg0;
        field366++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg0 & 0x1) == arg3) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        field379++;
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg5;
        } else {
            return 7 + 1 - arg4 - arg6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B[Lu;)[Lu;")
    public static final class135[] method114(byte arg0, class135[] arg1) {
        if (arg0 > -97) {
            return null;
        }
        field375++;
        class135[] var2 = new class135[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class107.method867(2, new class135[] { class68.method547(-1, var3), class2.field72 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class107.method867(2, new class135[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }
}
