import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class180 extends class149 {

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "[I")
    private int[] field3505 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public int field3494 = -1;

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "Z")
    public boolean field3516 = false;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "[[B")
    public static byte[][] field3509 = new byte[250][];

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Lqf;")
    public static class150 field3498 = null;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "Lsg;")
    private static class169 field3510 = class165.method1060("Loaded fonts", 1536);

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "Lsg;")
    public static class169 field3502 = field3510;

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3507 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "Z")
    public static volatile boolean field3513 = true;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "Lsg;")
    public static class169 field3517 = class165.method1060("60 Sekunden noch einmal)3)3)3", 1536);

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "Z")
    public static boolean field3519 = false;

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
    public static int field3514 = 0;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "Lsg;")
    private static class169 field3518 = class165.method1060("Login", 1536);

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "[Loa;")
    public static class127[] field3515 = new class127[2048];

    @OriginalMember(owner = "client!u", name = "rb", descriptor = "Lsg;")
    public static class169 field3520 = field3518;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "[I")
    private int[] field3496;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "[S")
    private short[] field3500;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "[S")
    private short[] field3501;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "[S")
    private short[] field3503;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "[S")
    private short[] field3506;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)I")
    public static final int method1193(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 179) {
            arg1 /= 2;
        }
        if (arg0 > 192) {
            arg1 /= 2;
        }
        field3493++;
        if (arg3 != -22548) {
            return -1;
        }
        if (arg0 > 217) {
            arg1 /= 2;
        }
        if (arg0 > 243) {
            arg1 /= 2;
        }
        return (arg1 / 32 << 7) + (arg2 / 4 << 10) + arg0 / 2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILoa;)V")
    private final void method1194(int arg0, int arg1, class127 arg2) {
        if (arg1 == 1) {
            this.field3494 = arg2.method819((byte) 22);
        } else if (arg1 == 2) {
            int var8 = arg2.method819((byte) 22);
            this.field3496 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3496[var9] = arg2.method785(true);
            }
        } else if (arg1 == 3) {
            this.field3516 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method819((byte) 22);
            this.field3503 = new short[var4];
            this.field3500 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3500[var5] = (short) arg2.method785(true);
                this.field3503[var5] = (short) arg2.method785(true);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method819((byte) 22);
            this.field3501 = new short[var6];
            this.field3506 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3506[var7] = (short) arg2.method785(true);
                this.field3501[var7] = (short) arg2.method785(true);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3505[arg1 - 60] = arg2.method785(true);
        }
        int var10 = 44 % ((arg0 - 37) / 55);
        field3492++;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Z")
    public final boolean method1195(byte arg0) {
        field3511++;
        boolean var2 = true;
        if (arg0 != 17) {
            return true;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3505[var3] != -1 && !class87.field1594.method567(0, 19406, this.field3505[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Li;")
    public static final class73 method1196(int arg0, int arg1) {
        field3512++;
        class73 var2 = (class73) class86.field1578.method1206((long) arg0, -24742);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class189.field3692.method552(arg0, 10, arg1);
        class73 var4 = new class73();
        var4.field1345 = arg0;
        if (var3 != null) {
            var4.method454(true, new class127(var3));
        }
        var4.method449(30270);
        if (var4.field1374 != -1) {
            var4.method447(method1196(var4.field1374, 0), (byte) 87, method1196(var4.field1341, 0));
        }
        if (!class22.field460 && var4.field1347) {
            var4.field1382 = 0;
            var4.field1333 = null;
            var4.field1366 = false;
            var4.field1367 = null;
            var4.field1383 = class46.field859;
        }
        class86.field1578.method1208((long) arg0, -88, var4);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)Lfe;")
    public final class52 method1197(byte arg0) {
        field3504++;
        class52[] var2 = new class52[5];
        int var3 = 0;
        if (arg0 != 121) {
            this.field3503 = null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3505[var4] != -1) {
                var2[var3++] = class52.method337(class87.field1594, this.field3505[var4], 0);
            }
        }
        class52 var5 = new class52(var2, var3);
        if (this.field3500 != null) {
            for (int var6 = 0; var6 < this.field3500.length; var6++) {
                var5.method324(this.field3500[var6], this.field3503[var6]);
            }
        }
        if (this.field3506 != null) {
            for (int var7 = 0; var7 < this.field3506.length; var7++) {
                var5.method340(this.field3506[var7], this.field3501[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Loa;I)V")
    public final void method1198(class127 arg0, int arg1) {
        if (arg1 != -1) {
            field3515 = null;
        }
        while (true) {
            int var3 = arg0.method819((byte) 22);
            if (var3 == 0) {
                field3497++;
                return;
            }
            this.method1194(110, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
    public static void method1199(byte arg0) {
        if (arg0 != -85) {
            return;
        }
        field3507 = null;
        field3520 = null;
        field3510 = null;
        field3509 = null;
        field3498 = null;
        field3518 = null;
        field3515 = null;
        field3502 = null;
        field3517 = null;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)Z")
    public final boolean method1200(int arg0) {
        field3508++;
        if (this.field3496 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 18327) {
            return false;
        }
        for (int var3 = 0; var3 < this.field3496.length; var3++) {
            if (!class87.field1594.method567(0, arg0 ^ 0xC59, this.field3496[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(B)Lfe;")
    public final class52 method1201(byte arg0) {
        field3499++;
        if (this.field3496 == null) {
            return null;
        }
        class52[] var2 = new class52[this.field3496.length];
        for (int var3 = 0; var3 < this.field3496.length; var3++) {
            var2[var3] = class52.method337(class87.field1594, this.field3496[var3], 0);
        }
        class52 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class52(var2, var2.length);
        }
        if (this.field3500 != null) {
            for (int var5 = 0; var5 < this.field3500.length; var5++) {
                var4.method324(this.field3500[var5], this.field3503[var5]);
            }
        }
        if (this.field3506 != null) {
            for (int var6 = 0; var6 < this.field3506.length; var6++) {
                var4.method340(this.field3506[var6], this.field3501[var6]);
            }
        }
        return arg0 == 43 ? var4 : null;
    }
}
