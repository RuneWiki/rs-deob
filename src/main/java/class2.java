import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class29 {

    @OriginalMember(owner = "client!aa", name = "rb", descriptor = "I")
    private int field30 = 0;

    @OriginalMember(owner = "client!aa", name = "sb", descriptor = "I")
    private int field31 = 0;

    @OriginalMember(owner = "client!aa", name = "qb", descriptor = "Z")
    public boolean field29 = false;

    @OriginalMember(owner = "client!aa", name = "ub", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!aa", name = "tb", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!aa", name = "yb", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!aa", name = "Cb", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!aa", name = "Db", descriptor = "Lh;")
    private class49 field42;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "Z")
    public static boolean field20 = false;

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
    public static int field24 = 0;

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "Lka;")
    public static class70 field25 = new class70(512);

    @OriginalMember(owner = "client!aa", name = "vb", descriptor = "Lwd;")
    private static class150 field34 = method9(true, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!aa", name = "xb", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!aa", name = "Bb", descriptor = "Lwd;")
    public static class150 field40 = field34;

    @OriginalMember(owner = "client!aa", name = "Gb", descriptor = "Lwd;")
    private static class150 field45 = method9(true, "Loading game screen )2 ");

    @OriginalMember(owner = "client!aa", name = "Fb", descriptor = "Lwd;")
    public static class150 field44 = field45;

    @OriginalMember(owner = "client!aa", name = "Eb", descriptor = "Li;")
    public static class56 field43 = new class56(100);

    @OriginalMember(owner = "client!aa", name = "Hb", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!aa", name = "Ib", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!aa", name = "Lb", descriptor = "[Lwd;")
    public static class150[] field50 = new class150[500];

    @OriginalMember(owner = "client!aa", name = "Mb", descriptor = "J")
    public static long field51 = 0L;

    @OriginalMember(owner = "client!aa", name = "Kb", descriptor = "[[I")
    public static int[][] field49 = new int[104][104];

    @OriginalMember(owner = "client!aa", name = "Jb", descriptor = "Z")
    public static boolean field48 = false;

    @OriginalMember(owner = "client!aa", name = "Nb", descriptor = "Lwd;")
    public static class150 field52 = method9(true, "Neuer Benutzer");

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!aa", name = "ob", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!aa", name = "wb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "Ab", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "Ljava/awt/Font;")
    public static Font field23;

    @OriginalMember(owner = "client!aa", name = "zb", descriptor = "[I")
    public static int[] field38;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)[Lhb;")
    public static final class51[] method7(int arg0) {
        field22++;
        class51[] var1 = new class51[class28.field864];
        for (int var2 = arg0; var2 < class28.field864; var2++) {
            class51 var3 = var1[var2] = new class51();
            var3.field1374 = class17.field457;
            var3.field1375 = class134.field3162;
            var3.field1373 = class113.field2638[var2];
            var3.field1379 = class43.field1173[var2];
            var3.field1378 = class111.field2574[var2];
            var3.field1376 = class103.field2337[var2];
            int var4 = var3.field1378 * var3.field1376;
            byte[] var5 = class10.field250[var2];
            var3.field1377 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field1377[var6] = class15.field414[class94.method667(255, var5[var6])];
            }
        }
        class37.method276(0);
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
    public final void method8(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field35++;
        if (this.field29) {
            return;
        }
        this.field30 += arg0;
        while (this.field42.field1298[this.field31] < this.field30) {
            this.field30 -= this.field42.field1298[this.field31];
            this.field31++;
            if (this.field31 >= this.field42.field1308.length) {
                this.field29 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLjava/lang/String;)Lwd;")
    public static final class150 method9(boolean arg0, String arg1) {
        if (!arg0) {
            method10((byte) 27);
        }
        field26++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class150 var4 = new class150();
        var4.field3678 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3678[var4.field3718++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var4.field3678[var4.field3718++] = (byte) var6;
            }
        }
        var4.method1191(false);
        return var4.method1199(4096);
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(B)[Lqd;")
    public static final class114[] method10(byte arg0) {
        field28++;
        class114[] var1 = new class114[class28.field864];
        if (arg0 != 111) {
            field49 = null;
        }
        for (int var2 = 0; var2 < class28.field864; var2++) {
            class114 var3 = var1[var2] = new class114();
            var3.field2648 = class17.field457;
            var3.field2652 = class134.field3162;
            var3.field2651 = class113.field2638[var2];
            var3.field2650 = class43.field1173[var2];
            var3.field2653 = class111.field2574[var2];
            var3.field2647 = class103.field2337[var2];
            var3.field2654 = class15.field414;
            var3.field2649 = class10.field250[var2];
        }
        class37.method276(0);
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(B)V")
    public static void method11(byte arg0) {
        field23 = null;
        field52 = null;
        field50 = null;
        field43 = null;
        field25 = null;
        field45 = null;
        field40 = null;
        field34 = null;
        field44 = null;
        if (arg0 != -117) {
            field23 = null;
        }
        field38 = null;
        field49 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)Lbe;")
    public final class13 method12(boolean arg0) {
        field27++;
        if (!arg0) {
            return null;
        }
        class107 var2 = class128.method971(!arg0, this.field41);
        class13 var3;
        if (this.field29) {
            var3 = var2.method738((byte) -125, -1);
        } else {
            var3 = var2.method738((byte) -125, this.field31);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lrc;")
    public static final class119 method13(int arg0, byte arg1) {
        field18++;
        class119 var2 = (class119) class112.field2591.method440((long) arg0, 26976);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field2100.method315(arg0, true, 4);
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method864(arg0, new class148(var3), -1);
        }
        var4.method862(-127);
        int var5 = 66 % ((arg1 + 83) / 39);
        class112.field2591.method433(var4, (long) arg0, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILff;II)Lv;")
    public static final class140 method14(int arg0, class42 arg1, int arg2, int arg3) {
        field39++;
        if (class146.method1095(arg1, arg3, (byte) 21, arg0)) {
            if (arg2 != 0) {
                field25 = null;
            }
            return class144.method1086(arg2 ^ 0x78);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIII)V")
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field33 = arg3;
        this.field19 = arg2;
        this.field32 = arg1;
        this.field37 = arg4;
        this.field21 = arg5 + arg6;
        this.field41 = arg0;
        int var8 = class128.method971(false, this.field41).field2409;
        if (var8 == -1) {
            this.field29 = true;
        } else {
            this.field29 = false;
            this.field42 = class111.method785(var8, 22969);
        }
    }
}
