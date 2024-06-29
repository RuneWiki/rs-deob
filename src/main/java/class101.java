import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class101 extends class55 {

    @OriginalMember(owner = "client!qfa", name = "K", descriptor = "I")
    public int field1349 = 0;

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "Z")
    public static boolean field1338 = false;

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "Lea;")
    public static class547 field1343 = new class547(42, 6);

    @OriginalMember(owner = "client!qfa", name = "V", descriptor = "J")
    public static long field1360 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!qfa", name = "S", descriptor = "Llga;")
    public static class712 field1357 = new class712(65, 2);

    @OriginalMember(owner = "client!qfa", name = "R", descriptor = "F")
    public static float field1356;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!qfa", name = "B", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!qfa", name = "D", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!qfa", name = "G", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!qfa", name = "I", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!qfa", name = "L", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!qfa", name = "M", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!qfa", name = "T", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!qfa", name = "U", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!qfa", name = "W", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "J")
    public static long field1331;

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "Lib;")
    public class155 field1330;

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "Lib;")
    public class155 field1333;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "Lcea;")
    public class215 field1328;

    @OriginalMember(owner = "client!qfa", name = "N", descriptor = "Lwi;")
    public class466 field1352;

    @OriginalMember(owner = "client!qfa", name = "P", descriptor = "Lwi;")
    public class466 field1354;

    @OriginalMember(owner = "client!qfa", name = "t", descriptor = "Lfw;")
    public class57 field1332;

    @OriginalMember(owner = "client!qfa", name = "O", descriptor = "Lfw;")
    public class57 field1353;

    @OriginalMember(owner = "client!qfa", name = "Q", descriptor = "Lvha;")
    public class685 field1355;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "Lgv;")
    public class83 field1325;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "Z")
    public boolean field1326;

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "Z")
    public boolean field1334;

    @OriginalMember(owner = "client!qfa", name = "J", descriptor = "Z")
    public boolean field1348;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "[I")
    public int[] field1327;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)V")
    public static final void method694(int arg0, int arg1) {
        field1346++;
        if (arg0 != 256) {
            field1361 = -78;
        }
        class585 var2 = (class585) class604.field8417.method2552((long) arg1, -1);
        if (var2 != null) {
            var2.field8185 = !var2.field8185;
            var2.field8189.method3706(var2.field8185, (byte) 22);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
    public static final void method695(boolean arg0) {
        field1336++;
        if (class610.field8514 == null) {
            class15 var1 = new class15();
            byte[] var2 = var1.method66(16, 20283, 128, 128);
            class610.field8514 = class41.method248(2, var2, false);
        }
        if (!arg0 && class210.field2521 == null) {
            class402 var3 = new class402();
            byte[] var4 = var3.method2327(!arg0, 128, 16, 128);
            class210.field2521 = class41.method248(2, var4, false);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Z)V")
    public final void method696(boolean arg0) {
        field1342++;
        if (!arg0) {
            this.field1350 = 82;
        }
        int var2 = this.field1329;
        boolean var3 = this.field1334;
        if (this.field1355 != null) {
            class685 var4 = this.field1355.method3875(class386.field5455, (byte) -96);
            if (var4 == null) {
                this.field1334 = false;
                this.field1359 = 256;
                this.field1350 = 0;
                this.field1327 = null;
                this.field1344 = 256;
                this.field1337 = 0;
                this.field1324 = 0;
                this.field1339 = 0;
                this.field1348 = false;
                this.field1358 = 0;
                this.field1329 = -1;
            } else {
                this.field1344 = var4.field9620;
                this.field1339 = var4.field9556;
                this.field1348 = var4.field9565;
                this.field1324 = var4.field9581;
                this.field1358 = var4.field9599;
                this.field1329 = var4.field9608;
                this.field1334 = var4.field9604;
                this.field1327 = var4.field9526;
                this.field1359 = var4.field9557;
                this.field1350 = var4.field9591 << 9;
            }
        } else if (this.field1328 != null) {
            int var5 = class201.method1115(125, this.field1328);
            if (var2 != var5) {
                this.field1329 = var5;
                class274 var6 = this.field1328.field2589;
                if (var6.field3616 != null) {
                    var6 = var6.method1637(class386.field5455, (byte) 79);
                }
                if (var6 == null) {
                    this.field1358 = this.field1350 = this.field1337 = 0;
                    this.field1334 = this.field1328.field2589.field3598;
                    this.field1359 = 256;
                    this.field1344 = 256;
                } else {
                    this.field1358 = var6.field3672;
                    this.field1344 = var6.field3606;
                    this.field1359 = var6.field3595;
                    this.field1334 = var6.field3598;
                    this.field1337 = var6.field3636 << 9;
                    this.field1350 = var6.field3640 << 9;
                }
            }
        } else if (this.field1325 != null) {
            this.field1329 = class439.method2484(this.field1325, arg0);
            this.field1344 = 256;
            this.field1337 = 0;
            this.field1350 = this.field1325.field1129 << 9;
            this.field1334 = this.field1325.field1131;
            this.field1358 = this.field1325.field1114;
            this.field1359 = 256;
        }
        if (this.field1329 == var2 && this.field1334 == var3) {
            return;
        }
        if (this.field1354 == null) {
            return;
        }
        class143.field1851.method2542(this.field1354);
        this.field1332 = null;
        this.field1354 = null;
        this.field1333 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method697(String arg0, int arg1) {
        if (arg1 == 0) {
            field1323++;
            return class289.field3833.containsKey(arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
    public static void method698(byte arg0) {
        field1343 = null;
        if (arg0 <= 77) {
            method694(-13, -115);
        }
        field1357 = null;
    }
}
