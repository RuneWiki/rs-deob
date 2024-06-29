import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class68 {

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lpj;")
    public static class237 field1331 = class33.method353(" )2> <col=ffff00>", 117);

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field1335 = 0;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lpj;")
    private static class237 field1347 = class33.method353("Started 3d Library", 94);

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lpj;")
    public static class237 field1333 = field1347;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lak;")
    public static class135 field1332 = new class135(100);

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Lpj;")
    public static class237 field1350 = class33.method353("::rebuild", 22);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lcg;")
    public class162 field1343;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Lfa;")
    public static class239 field1349;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    public int[] field1325;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    public int[] field1327;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
    public int[] field1336;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[I")
    public int[] field1337;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "[I")
    public int[] field1344;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[I")
    public int[] field1346;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "[Lcg;")
    public class162[] field1341;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "[[I")
    public int[][] field1342;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "[[I")
    public int[][] field1345;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BB)V")
    private final void method554(byte[] arg0, byte arg1) {
        field1338++;
        class32 var3 = new class32(class216.method1454((byte) 50, arg0));
        int var4 = var3.method316((byte) -118);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1330 = 0;
        } else {
            this.field1330 = var3.method319((byte) -18);
        }
        int var5 = var3.method316((byte) 123);
        this.field1329 = var3.method339(-16777216);
        this.field1336 = new int[this.field1329];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field1329; var8++) {
            this.field1336[var8] = var6 += var3.method339(-16777216);
            if (this.field1336[var8] > var7) {
                var7 = this.field1336[var8];
            }
        }
        this.field1340 = var7 + 1;
        this.field1327 = new int[this.field1340];
        this.field1345 = new int[this.field1340][];
        this.field1337 = new int[this.field1340];
        this.field1344 = new int[this.field1340];
        this.field1325 = new int[this.field1340];
        if (var5 != 0) {
            this.field1346 = new int[this.field1340];
            for (int var9 = 0; var9 < this.field1340; var9++) {
                this.field1346[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1329; var10++) {
                this.field1346[this.field1336[var10]] = var3.method319((byte) -18);
            }
            this.field1343 = new class162(this.field1346);
        }
        for (int var11 = 0; var11 < this.field1329; var11++) {
            this.field1327[this.field1336[var11]] = var3.method319((byte) -18);
        }
        for (int var12 = 0; var12 < this.field1329; var12++) {
            this.field1325[this.field1336[var12]] = var3.method319((byte) -18);
        }
        for (int var13 = 0; var13 < this.field1329; var13++) {
            this.field1337[this.field1336[var13]] = var3.method339(-16777216);
        }
        int var14 = 0;
        if (arg1 < 16) {
            return;
        }
        while (this.field1329 > var14) {
            int var21 = 0;
            int var22 = this.field1336[var14];
            int var23 = this.field1337[var22];
            this.field1345[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1345[var22][var25] = var21 += var3.method339(-16777216);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field1344[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field1345[var22] = null;
            }
            var14++;
        }
        if (var5 == 0) {
            return;
        }
        this.field1342 = new int[var7 + 1][];
        this.field1341 = new class162[var7 + 1];
        for (int var15 = 0; var15 < this.field1329; var15++) {
            int var16 = this.field1336[var15];
            int var17 = this.field1337[var16];
            this.field1342[var16] = new int[this.field1344[var16]];
            for (int var18 = 0; var18 < this.field1344[var16]; var18++) {
                this.field1342[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1345[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1345[var16][var19];
                }
                this.field1342[var16][var20] = var3.method319((byte) -18);
            }
            this.field1341[var16] = new class162(this.field1342[var16]);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method555(byte arg0) {
        if (arg0 != 115) {
            field1332 = null;
        }
        field1331 = null;
        field1350 = null;
        field1349 = null;
        field1332 = null;
        field1347 = null;
        field1333 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[B)V")
    public static final void method556(int arg0, byte[] arg1) {
        field1326++;
        class32 var2 = new class32(arg1);
        var2.field647 += 2;
        int var3 = var2.method316((byte) -1);
        if (var3 != 1) {
            return;
        }
        boolean var4 = var2.method316((byte) -30) == 1;
        if (arg0 != 11295) {
            field1347 = null;
        }
        if (var4) {
            class275.method1870(arg0 - 37244, var2);
        }
        class62.method524((byte) -25, var2);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Lja;")
    public static final class58 method557(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 42) {
            method556(22, (byte[]) null);
        }
        class58 var4 = new class58();
        field1339++;
        var4.field1191 = arg3;
        var4.field1189 = arg1;
        class164.field2915.method562(var4, (long) arg0, (byte) 56);
        class102.method773(0, arg3);
        class141 var5 = class70.method572(20043, arg0);
        if (var5 != null) {
            class128.method911(var5, -17149);
        }
        if (class83.field1552 != null) {
            class128.method911(class83.field1552, -17149);
            class83.field1552 = null;
        }
        int var6 = class271.field4664;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class197.method1354(class235.field4090[var7], (byte) -127)) {
                class174.method1205((byte) 25, var7);
            }
        }
        if (class271.field4664 == 1) {
            class247.field4306 = false;
            class232.method1542(class23.field423, -26900, class166.field2940, class269.field4599, class176.field3088);
        } else {
            class232.method1542(class23.field423, -26900, class166.field2940, class269.field4599, class176.field3088);
            int var8 = class80.field1507.method1342(class239.field4181);
            for (int var9 = 0; var9 < class271.field4664; var9++) {
                int var10 = class80.field1507.method1342(class15.method135((byte) 21, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class23.field423 = var8 + 8;
            class166.field2940 = class271.field4664 * 15 + 22;
        }
        if (var5 != null) {
            class230.method1523(false, var5, 7318);
        }
        class15.method136(arg3, 127);
        if (class84.field1573 != -1) {
            class16.method146((byte) -91, class84.field1573, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([BI)V")
    public class68(byte[] arg0, int arg1) {
        this.field1334 = class101.method765(27, arg0, arg0.length);
        if (this.field1334 != arg1) {
            throw new RuntimeException();
        }
        this.method554(arg0, (byte) 41);
    }
}
