import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class221 {

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    private int field4107 = 0;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    private int field4111 = -1;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lsg;")
    private class203 field4109 = new class203();

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Z")
    public boolean field4114 = false;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    private int field4101;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[Lib;")
    private class89[] field4102;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    private int field4096;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "[[I")
    private int[][] field4112;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Z")
    public static boolean field4106 = false;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[S")
    public static short[] field4100 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Ldc;")
    public static class37 field4110 = class185.method1233((byte) 86, " loggt sich ein)3");

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Ldc;")
    public static class37 field4105 = class185.method1233((byte) 86, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method1455(int arg0) {
        int var1 = class246.field4491;
        field4113++;
        int var2 = class10.field141;
        int var3 = class225.field4164;
        int var4 = class149.field2826;
        int var5 = 6116423;
        class48.method420(var1, var2, var4, var3, var5);
        class48.method420(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class48.method413(var1 + 1, var2 + 18, var4 - 2, arg0 + var3, 0);
        class32.field633.method607(class135.field2505, var1 + 3, var2 + 14, var5, -1);
        int var6 = class80.field1416;
        int var7 = class235.field4271;
        for (int var8 = 0; var8 < class97.field1701; var8++) {
            int var9 = (class97.field1701 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < var1 + var4 && var9 - 13 < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class32.field633.method607(class194.method1295(var8, false), var1 + 3, var9, var10, 0);
        }
        class12.method76(class246.field4491, class149.field2826, class225.field4164, arg0 - 698, class10.field141);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public final void method1456(byte arg0) {
        field4104++;
        for (int var2 = 0; var2 < this.field4096; var2++) {
            this.field4112[var2] = null;
        }
        this.field4112 = null;
        this.field4102 = null;
        this.field4109.method1336(arg0 ^ 0xFFFFFFDA);
        if (arg0 != -13) {
            this.field4112 = null;
        }
        this.field4109 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ldc;ZLdc;Lwa;)[Lji;")
    public static final class106[] method1457(class37 arg0, boolean arg1, class37 arg2, class238 arg3) {
        if (arg1) {
            field4108++;
            int var4 = arg3.method1543(103, arg0);
            int var5 = arg3.method1546(arg2, -105, var4);
            return method1459(var4, arg3, var5, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLmf;)Ldc;")
    public static final class37 method1458(byte arg0, class136 arg1) {
        field4098++;
        if (arg0 > -107) {
            method1455(125);
        }
        if (class165.method1111(-96, class107.method699(arg1, 65)) == 0) {
            return null;
        } else if (arg1.field2506 == null || arg1.field2506.method332(50).method334(-61) == 0) {
            return class168.field3198 ? class235.field4281 : null;
        } else {
            return arg1.field2506;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILwa;II)[Lji;")
    public static final class106[] method1459(int arg0, class238 arg1, int arg2, int arg3) {
        field4103++;
        return class192.method1278(arg1, arg3 + arg3, arg0, arg2) ? class58.method445(arg3 ^ 0xFFFFFF96) : null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)[[I")
    public final int[][] method1460(byte arg0) {
        field4097++;
        if (this.field4101 != this.field4096) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -16) {
            field4105 = null;
        }
        for (int var2 = 0; var2 < this.field4096; var2++) {
            this.field4102[var2] = client.field673;
        }
        return this.field4112;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[I")
    public final int[] method1461(int arg0, byte arg1) {
        field4099++;
        if (arg1 >= -100) {
            method1459(7, null, 60, 25);
        }
        if (this.field4101 == this.field4096) {
            this.field4114 = this.field4102[arg0] == null;
            this.field4102[arg0] = client.field673;
            return this.field4112[arg0];
        } else if (this.field4096 == 1) {
            this.field4114 = this.field4111 != arg0;
            this.field4111 = arg0;
            return this.field4112[0];
        } else {
            class89 var3 = this.field4102[arg0];
            if (var3 == null) {
                this.field4114 = true;
                if (this.field4107 < this.field4096) {
                    var3 = new class89(arg0, this.field4107);
                    this.field4107++;
                } else {
                    class89 var4 = (class89) this.field4109.method1341(124);
                    var3 = new class89(arg0, var4.field1549);
                    this.field4102[var4.field1556] = null;
                    var4.method433(0);
                }
                this.field4102[arg0] = var3;
            } else {
                this.field4114 = false;
            }
            this.field4109.method1335(var3, -1);
            return this.field4112[var3.field1549];
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method1462(int arg0) {
        field4110 = null;
        if (arg0 > -97) {
            field4106 = true;
        }
        field4100 = null;
        field4105 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(III)V")
    public class221(int arg0, int arg1, int arg2) {
        this.field4101 = arg1;
        this.field4102 = new class89[this.field4101];
        this.field4096 = arg0;
        this.field4112 = new int[this.field4096][arg2];
    }
}
