import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class424 extends class665 {

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "Loj;")
    public static class346 field5977 = new class346(16);

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "Lpj;")
    public static class132 field5976;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "Lmj;")
    public static class599 field5975;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "Ljava/lang/String;")
    public String field5972;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "[C")
    public char[] field5974;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "[C")
    public char[] field5978;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "[I")
    public int[] field5979;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "[I")
    public int[] field5984;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method2405(int arg0, byte[] arg1, int arg2, int arg3) {
        field5973++;
        byte[] var4;
        if (arg2 > 0) {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg1[arg2 + var5];
            }
        } else {
            var4 = arg1;
        }
        if (arg3 >= -51) {
            method2412(-19);
        }
        class526 var6 = new class526();
        var6.method2925(-20310);
        var6.method2922(8, var4, (long) (arg0 * 8));
        byte[] var7 = new byte[64];
        var6.method2923((byte) 127, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public static final void method2406(int arg0, int arg1) {
        class306.field4504 = arg1;
        class675.field9543 = -1;
        field5981++;
        int var2 = -52 % ((arg0 + 14) / 56);
        class623.field8692 = -1;
        class299.method1863((byte) -102);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(CI)I")
    public final int method2407(char arg0, int arg1) {
        field5982++;
        if (this.field5984 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field5984.length; var3++) {
            if (this.field5974[var3] == arg0) {
                return this.field5984[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(CI)I")
    public final int method2408(char arg0, int arg1) {
        int var3 = -65 / ((arg1 - 17) / 60);
        field5970++;
        if (this.field5979 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field5979.length; var4++) {
            if (this.field5978[var4] == arg0) {
                return this.field5979[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method2409(int arg0) {
        field5980++;
        if (this.field5979 != null) {
            for (int var2 = 0; var2 < this.field5979.length; var2++) {
                this.field5979[var2] = class266.method1624(this.field5979[var2], 32768);
            }
        }
        if (this.field5984 != null) {
            for (int var3 = 0; var3 < this.field5984.length; var3++) {
                this.field5984[var3] = class266.method1624(this.field5984[var3], 32768);
            }
        }
        if (arg0 > -46) {
            this.field5979 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLjr;)V")
    public final void method2410(byte arg0, class96 arg1) {
        field5971++;
        while (true) {
            int var3 = arg1.method718(78);
            if (var3 == 0) {
                if (arg0 == 91) {
                    return;
                } else {
                    field5975 = null;
                    return;
                }
            }
            this.method2411((byte) 127, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BILjr;)V")
    private final void method2411(byte arg0, int arg1, class96 arg2) {
        if (arg0 < 126) {
            this.method2410((byte) 69, null);
        }
        if (arg1 == 1) {
            this.field5972 = arg2.method739(84);
        } else if (arg1 == 2) {
            int var7 = arg2.method718(-69);
            this.field5974 = new char[var7];
            this.field5984 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5984[var8] = arg2.method743((byte) -35);
                byte var9 = arg2.method748(-813976688);
                this.field5974[var8] = var9 == 0 ? 0 : class274.method1671(var9, true);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method718(-109);
            this.field5978 = new char[var4];
            this.field5979 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5979[var5] = arg2.method743((byte) -9);
                byte var6 = arg2.method748(-813976688);
                this.field5978[var5] = var6 == 0 ? 0 : class274.method1671(var6, true);
            }
        }
        field5983++;
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
    public static void method2412(int arg0) {
        field5975 = null;
        if (arg0 == 0) {
            field5976 = null;
            field5977 = null;
        }
    }
}
