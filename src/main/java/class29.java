import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class29 {

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public int field413 = 2;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public int field415 = 1;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "Z")
    public boolean field414 = false;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public int field416 = 64;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "Z")
    public boolean field410 = false;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public int field418 = 64;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public int field423 = -1;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field412 = 12;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "[[I")
    public static int[][] field420 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "Lff;")
    public static class399 field421 = new class399(0, -1);

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "[B")
    public static byte[] field424 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 5)
    public static void method263(boolean arg0) {
        if (arg0) {
            method267(39, -2, (byte) 101, -92, 34, -53);
        }
        field421 = null;
        field420 = null;
        field424 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 17)
    public static final void method264(int arg0) {
        class39.field523 = arg0;
        for (int var1 = 0; var1 < class445.field6562; var1++) {
            for (int var2 = 0; var2 < class167.field2473; var2++) {
                if (class236.field3305[arg0][var1][var2] == null) {
                    class236.field3305[arg0][var1][var2] = new class306(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lgk;IB)V", line = 51)
    public final void method265(class468 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method2765(83);
            if (var4 == 0) {
                int var5 = -25 % ((arg2 + 38) / 43);
                field419++;
                return;
            }
            this.method266(-92, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILgk;)V", line = 71)
    private final void method266(int arg0, int arg1, int arg2, class468 arg3) {
        field411++;
        int var5 = -103 % ((70 - arg0) / 43);
        if (arg1 == 1) {
            this.field423 = arg3.method2727((byte) 43);
            if (this.field423 == 65535) {
                this.field423 = -1;
                return;
            }
        } else if (arg1 == 2) {
            this.field416 = arg3.method2727((byte) 43) + 1;
            this.field418 = arg3.method2727((byte) 43) + 1;
        } else if (arg1 == 3) {
            arg3.method2714((byte) -122);
            return;
        } else if (arg1 == 4) {
            this.field413 = arg3.method2765(92);
            return;
        } else if (arg1 == 5) {
            this.field415 = arg3.method2765(65);
            return;
        } else {
            if (arg1 == 6) {
                this.field414 = true;
            } else if (arg1 == 7) {
                this.field410 = true;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIBIII)V", line = 135)
    public static final void method267(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field417++;
        int var6 = arg0 - arg5;
        int var7 = arg4 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class215.method1375(arg5, arg1, arg3, arg4, (byte) 108);
            }
        } else if (var7 == 0) {
            class520.method3077(arg1, arg3, arg0, false, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = 83 % ((arg2 - 49) / 39);
            int var10 = arg3 - (arg5 * var8 >> 12);
            int var11;
            int var12;
            if (arg0 < class297.field4427) {
                var11 = (class297.field4427 * var8 >> 12) + var10;
                var12 = class297.field4427;
            } else if (arg0 <= class102.field1544) {
                var11 = arg4;
                var12 = arg0;
            } else {
                var12 = class102.field1544;
                var11 = (class102.field1544 * var8 >> 12) + var10;
            }
            int var13;
            int var14;
            if (class297.field4427 > arg5) {
                var13 = (class297.field4427 * var8 >> 12) + var10;
                var14 = class297.field4427;
            } else if (class102.field1544 < arg5) {
                var14 = class102.field1544;
                var13 = (class102.field1544 * var8 >> 12) + var10;
            } else {
                var14 = arg5;
                var13 = arg3;
            }
            if (var13 < class305.field4555) {
                var13 = class305.field4555;
                var14 = (class305.field4555 - var10 << 12) / var8;
            } else if (class286.field4290 < var13) {
                var13 = class286.field4290;
                var14 = (class286.field4290 - var10 << 12) / var8;
            }
            if (var11 < class305.field4555) {
                var11 = class305.field4555;
                var12 = (class305.field4555 - var10 << 12) / var8;
            } else if (var11 > class286.field4290) {
                var11 = class286.field4290;
                var12 = (class286.field4290 - var10 << 12) / var8;
            }
            class382.method2295(arg1, var11, (byte) -96, var14, var12, var13);
        }
    }
}
