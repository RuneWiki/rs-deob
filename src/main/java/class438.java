import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class438 {

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "[I")
    private int[] field6159 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "Lk;")
    public static class43 field6149 = new class43();

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "Lmq;")
    public static class78 field6158 = new class78(61, 3);

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "[I")
    public static int[] field6163 = new int[1];

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "Lnha;")
    public static class501 field6161 = new class501("", 11);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "Lfg;")
    public class418 field6156;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "Lkha;")
    public static class687 field6162;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "[I")
    private int[] field6157;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "[S")
    private short[] field6148;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "[S")
    private short[] field6150;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "[S")
    private short[] field6152;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "[S")
    private short[] field6155;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public static void method2583(int arg0) {
        field6161 = null;
        field6162 = null;
        field6158 = null;
        field6163 = null;
        field6149 = null;
        if (arg0 != 0) {
            field6162 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILkha;I)Lbea;")
    public static final class37 method2584(int arg0, class687 arg1, int arg2) {
        field6154++;
        if (arg2 != 0) {
            field6158 = null;
        }
        byte[] var3 = arg1.method3836(arg0, true);
        return var3 == null ? null : new class37(var3);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)Lid;")
    public final class415 method2585(byte arg0) {
        field6144++;
        if (this.field6157 == null) {
            return null;
        }
        class415[] var2 = new class415[this.field6157.length];
        class687 var3 = this.field6156.field5951;
        synchronized (this.field6156.field5951) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field6157.length) {
                    break;
                }
                var2[var4] = class566.method3193(true, 0, this.field6157[var4], this.field6156.field5951);
                var4++;
            }
        }
        if (arg0 >= -11) {
            this.method2591(125);
        }
        for (int var5 = 0; var5 < this.field6157.length; var5++) {
            if (var2[var5].field5853 < 13) {
                var2[var5].method2458((byte) 125, 2);
            }
        }
        class415 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class415(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field6150 != null) {
            for (int var7 = 0; var7 < this.field6150.length; var7++) {
                var6.method2472(55, this.field6150[var7], this.field6155[var7]);
            }
        }
        if (this.field6148 != null) {
            for (int var8 = 0; var8 < this.field6148.length; var8++) {
                var6.method2460(this.field6152[var8], 0, this.field6148[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)Z")
    public final boolean method2586(boolean arg0) {
        field6160++;
        if (this.field6157 == null) {
            return true;
        }
        boolean var2 = arg0;
        class687 var3 = this.field6156.field5951;
        synchronized (this.field6156.field5951) {
            for (int var4 = 0; var4 < this.field6157.length; var4++) {
                if (!this.field6156.field5951.method3811(0, (byte) 101, this.field6157[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
    public static final void method2587(byte arg0) {
        field6147++;
        class634.field8793++;
        class650 var1 = class314.method1837(class150.field1822, true, class625.field8727);
        var1.field8928.method1141(class126.method814((byte) 23), 31);
        var1.field8928.method1157(class599.field8320, (byte) 125);
        if (arg0 < 62) {
            method2584(-43, null, 101);
        }
        var1.field8928.method1157(class84.field1083, (byte) 121);
        var1.field8928.method1141(class223.field2944.field631.method1463((byte) -125), -103);
        class108.method745(var1, -103);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILtn;B)V")
    private final void method2588(int arg0, class179 arg1, byte arg2) {
        field6146++;
        int var4 = -91 % ((arg2 + 43) / 53);
        if (arg0 == 1) {
            arg1.method1094(255);
        } else if (arg0 == 2) {
            int var9 = arg1.method1094(255);
            this.field6157 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field6157[var10] = arg1.method1107(false);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var5 = arg1.method1094(255);
                this.field6150 = new short[var5];
                this.field6155 = new short[var5];
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field6150[var6] = (short) arg1.method1107(false);
                    this.field6155[var6] = (short) arg1.method1107(false);
                }
                return;
            }
            if (arg0 == 41) {
                int var7 = arg1.method1094(255);
                this.field6148 = new short[var7];
                this.field6152 = new short[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field6148[var8] = (short) arg1.method1107(false);
                    this.field6152[var8] = (short) arg1.method1107(false);
                }
                return;
            }
            if (arg0 >= 60 && arg0 < 70) {
                this.field6159[arg0 - 60] = arg1.method1107(false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILtn;)V")
    public final void method2589(int arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                field6145++;
                if (arg0 != -32087) {
                    method2583(-92);
                    return;
                }
                return;
            }
            this.method2588(var3, arg1, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)Z")
    public final boolean method2590(byte arg0) {
        field6153++;
        boolean var2 = true;
        class687 var3 = this.field6156.field5951;
        synchronized (this.field6156.field5951) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6159[var4] != -1 && !this.field6156.field5951.method3811(0, (byte) 101, this.field6159[var4])) {
                    var2 = false;
                }
            }
            if (arg0 <= 17) {
                field6158 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)Lid;")
    public final class415 method2591(int arg0) {
        field6151++;
        class415[] var2 = new class415[5];
        if (arg0 > -48) {
            return null;
        }
        int var3 = 0;
        class687 var4 = this.field6156.field5951;
        synchronized (this.field6156.field5951) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field6159[var5] != -1) {
                    var2[var3++] = class566.method3193(true, 0, this.field6159[var5], this.field6156.field5951);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field5853 < 13) {
                var2[var6].method2458((byte) 125, 2);
            }
        }
        class415 var7 = new class415(var2, var3);
        if (this.field6150 != null) {
            for (int var8 = 0; var8 < this.field6150.length; var8++) {
                var7.method2472(114, this.field6150[var8], this.field6155[var8]);
            }
        }
        if (this.field6148 != null) {
            for (int var9 = 0; var9 < this.field6148.length; var9++) {
                var7.method2460(this.field6152[var9], 0, this.field6148[var9]);
            }
        }
        return var7;
    }
}
