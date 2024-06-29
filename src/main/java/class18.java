import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 extends class70 {

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "[Lbd;")
    public class11[] field351 = new class11[5];

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "[I")
    public int[] field362 = new int[5];

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public int field364 = 0;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Lcd;")
    public static class17 field348 = new class17();

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "Llc;")
    private static class69 field373 = class69.method470((byte) -114, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\u001c1(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "Llc;")
    public static class69 field375 = class69.method470((byte) -124, "Choose Option");

    @OriginalMember(owner = "client!ce", name = "lb", descriptor = "Llc;")
    public static class69 field378 = class69.method470((byte) -128, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
    public static int field376 = 0;

    @OriginalMember(owner = "client!ce", name = "mb", descriptor = "Llc;")
    public static class69 field379 = field373;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "Z")
    public static boolean field371 = false;

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "Llc;")
    public static class69 field374 = class69.method470((byte) -102, " is already on your ignore list");

    @OriginalMember(owner = "client!ce", name = "pb", descriptor = "Llc;")
    public static class69 field382 = class69.method470((byte) -128, "Add friend @whi@");

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "Lrc;")
    public class103 field361;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Ltb;")
    public class112 field360;

    @OriginalMember(owner = "client!ce", name = "ob", descriptor = "Lcb;")
    public static class15 field381;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "Lce;")
    public class18 field349;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "Ld;")
    public class19 field365;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "Lfc;")
    public class34 field358;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "Ll;")
    public class66 field369;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "Lma;")
    public class73 field343;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "Z")
    public boolean field347;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "Z")
    public boolean field350;

    @OriginalMember(owner = "client!ce", name = "nb", descriptor = "Z")
    public boolean field380;

    @OriginalMember(owner = "client!ce", name = "kb", descriptor = "[I")
    public static int[] field377;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLkc;)V")
    public static final void method103(byte arg0, class63 arg1) {
        field356++;
        class107.field2330 = arg1;
        if (arg0 < -23) {
            class50.field1081 = class107.field2330.method382(16, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V")
    public class18(int arg0, int arg1, int arg2) {
        this.field352 = this.field368 = arg0;
        this.field359 = arg2;
        this.field355 = arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method104(byte arg0) {
        field346++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class33.field655[var2 + (var1 - 2 << 7)] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (var15 << 7) + var14;
            class33.field655[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = var12 + (var4 << 7);
                class110.field2417[var13] = (class33.field655[var13 - 1] + class33.field655[var13 + 128] + class33.field655[var13 + 1] + class33.field655[var13 + -128]) / 4;
            }
        }
        class90.field1953 += 128;
        if (class90.field1953 > class4.field91.length) {
            class90.field1953 -= class4.field91.length;
            int var5 = (int) (Math.random() * 12.0D);
            class76.method539((byte) -120, class96.field2128[var5]);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = (var6 << 7) + var9;
                int var11 = class110.field2417[var10 + 128] - class4.field91[class4.field91.length - 1 & class90.field1953 + var10] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class33.field655[var10] = var11;
            }
        }
        if (arg0 <= 53) {
            method108(55, 110, null, -58);
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class47.field987[var7] = class47.field987[var7 + 1];
        }
        class47.field987[var1 - 1] = (int) (Math.sin((double) class62.field1282 / 14.0D) * 16.0D + Math.sin((double) class62.field1282 / 15.0D) * 14.0D + Math.sin((double) class62.field1282 / 16.0D) * 12.0D);
        if (class46.field976 > 0) {
            class46.field976 -= 4;
        }
        if (class122.field2656 > 0) {
            class122.field2656 -= 4;
        }
        if (class46.field976 != 0 || class122.field2656 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 1) {
            class122.field2656 = 1024;
        }
        if (var8 == 0) {
            class46.field976 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Graphics;I)V")
    public static final void method105(Graphics arg0, int arg1) {
        class29.field609.method69(arg0, 4, true, 0);
        if (arg1 < 83) {
            field375 = null;
        }
        field357++;
        class82.field1858.method69(arg0, 357, true, 0);
        class3.field47.method69(arg0, 4, true, 722);
        class30.field612.method69(arg0, 205, true, 743);
        class16.field283.method69(arg0, 0, true, 0);
        class90.field1966.method69(arg0, 4, true, 516);
        class68.field1447.method69(arg0, 205, true, 516);
        class98.field2155.method69(arg0, 357, true, 496);
        class80.field1824.method69(arg0, 338, true, 0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[BI)I")
    public static final int method106(int arg0, byte arg1, byte[] arg2, int arg3) {
        field367++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class70.field1546[(arg2[var5] ^ var4) & 0xFF];
        }
        if (arg1 != 9) {
            field375 = null;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static final void method107(byte arg0) {
        for (int var1 = -1; var1 < class27.field585; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class92.field2013[var1];
            }
            class60 var3 = class123.field2682[var2];
            if (var3 != null) {
                class47.method312(-19512, 1, var3);
            }
        }
        if (arg0 != -7) {
            field378 = null;
        }
        field344++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[Llc;I)Llc;")
    public static final class69 method108(int arg0, int arg1, class69[] arg2, int arg3) {
        field353++;
        int var4 = arg1;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class121.field2578;
            }
            var4 += arg2[arg0 + var5].field1523;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class69 var10 = arg2[arg0 + var8];
            class48.method316(var10.field1488, 0, var6, var7, var10.field1523);
            var7 += var10.field1523;
        }
        class69 var9 = new class69();
        var9.field1488 = var6;
        var9.field1523 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    public static void method109(int arg0) {
        field379 = null;
        field374 = null;
        field348 = null;
        field373 = null;
        field375 = null;
        field378 = null;
        field382 = null;
        field377 = null;
        if (arg0 != 29605) {
            field379 = null;
        }
        field381 = null;
    }
}
