import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class308 extends class209 {

    @OriginalMember(owner = "client!li", name = "B", descriptor = "[I")
    public static int[] field4931 = new int[14];

    @OriginalMember(owner = "client!li", name = "I", descriptor = "Lcc;")
    public static class222 field4938 = null;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "[I")
    public static int[] field4937 = new int[14];

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field4940 = 0;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "Ljava/lang/String;")
    public String field4933;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "[C")
    public char[] field4939;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "[C")
    public char[] field4946;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "[I")
    public int[] field4942;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "[I")
    public int[] field4943;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZC)I")
    public final int method2059(boolean arg0, char arg1) {
        field4944++;
        if (this.field4942 == null) {
            return -1;
        }
        int var3 = 0;
        if (!arg0) {
            field4938 = null;
        }
        while (var3 < this.field4942.length) {
            if (this.field4939[var3] == arg1) {
                return this.field4942[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLha;I)V")
    private final void method2060(boolean arg0, class31 arg1, int arg2) {
        if (arg0) {
            method2065(13);
        }
        field4932++;
        if (arg2 == 1) {
            this.field4933 = arg1.method262(11386);
        } else if (arg2 == 2) {
            int var4 = arg1.method265(-104);
            this.field4943 = new int[var4];
            this.field4946 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4943[var5] = arg1.method260((byte) -67);
                byte var6 = arg1.method266(-129);
                this.field4946[var5] = var6 == 0 ? 0 : class31.method292(-25717, var6);
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg1.method265(-87);
            this.field4942 = new int[var7];
            this.field4939 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4942[var8] = arg1.method260((byte) -67);
                byte var9 = arg1.method266(-129);
                this.field4939[var8] = var9 == 0 ? 0 : class31.method292(-25717, var9);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)V")
    public final void method2061(byte arg0) {
        field4945++;
        if (arg0 >= -17) {
            this.method2061((byte) -115);
        }
        if (this.field4942 != null) {
            for (int var2 = 0; var2 < this.field4942.length; var2++) {
                this.field4942[var2] = class44.method377(this.field4942[var2], 32768);
            }
        }
        if (this.field4943 != null) {
            for (int var3 = 0; var3 < this.field4943.length; var3++) {
                this.field4943[var3] = class44.method377(this.field4943[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(B)V")
    public static final void method2062(byte arg0) {
        field4941++;
        try {
            if (class105.field1640 == 1) {
                int var1 = class236.field3728.method172(-102);
                if (var1 > 0 && class236.field3728.method158((byte) 15)) {
                    int var2 = var1 - class266.field4209;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class236.field3728.method150(-11182, var2);
                    return;
                }
                class236.field3728.method179((byte) -13);
                class236.field3728.method148(arg0 ^ 0x7F9C);
                class153.field2262 = null;
                class290.field4513 = null;
                if (class220.field3361 == null) {
                    class105.field1640 = 0;
                } else {
                    class105.field1640 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class236.field3728.method179((byte) -13);
            class105.field1640 = 0;
            class153.field2262 = null;
            class290.field4513 = null;
            class220.field3361 = null;
        }
        if (arg0 != 104) {
            field4935 = -67;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(CI)I")
    public final int method2063(char arg0, int arg1) {
        if (arg1 != 32448) {
            this.method2059(false, '\u001b');
        }
        field4930++;
        if (this.field4943 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4943.length; var3++) {
            if (this.field4946[var3] == arg0) {
                return this.field4943[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLha;)V")
    public final void method2064(boolean arg0, class31 arg1) {
        while (true) {
            int var3 = arg1.method265(-125);
            if (var3 == 0) {
                field4934++;
                if (!arg0) {
                    this.field4946 = null;
                    return;
                }
                return;
            }
            this.method2060(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public static void method2065(int arg0) {
        field4938 = null;
        int var1 = -71 / ((arg0 + 37) / 34);
        field4931 = null;
        field4937 = null;
    }
}
