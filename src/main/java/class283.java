import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class283 extends class259 {

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "Lcc;")
    public static class209 field4974 = class95.method669(110, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "Lki;")
    public static class62 field4971 = new class62(0, 0);

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "Lcc;")
    private static class209 field4979 = class95.method669(118, "flash2:");

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Lcc;")
    public static class209 field4977 = field4979;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "Lcc;")
    public static class209 field4975 = field4979;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "Lcc;")
    public class209 field4969;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "[I")
    public int[] field4963;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "[I")
    public int[] field4965;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[I")
    public int[] field4968;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "[I")
    public int[] field4970;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILtf;)V")
    public final void method1899(int arg0, class106 arg1) {
        while (true) {
            int var3 = arg1.method774((byte) 115);
            if (var3 == 0) {
                field4976++;
                if (arg0 != 8296) {
                    field4979 = null;
                    return;
                }
                return;
            }
            this.method1904(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
    public static final void method1900(int arg0, byte arg1) {
        field4978++;
        if (arg1 != -114) {
            field4971 = null;
        }
        class230.field4177.method662(arg1 + 32882, arg0);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public final void method1901(byte arg0) {
        if (arg0 != -58) {
            field4979 = null;
        }
        if (this.field4963 != null) {
            for (int var2 = 0; var2 < this.field4963.length; var2++) {
                this.field4963[var2] = class6.method63(this.field4963[var2], 32768);
            }
        }
        field4962++;
        if (this.field4965 != null) {
            for (int var3 = 0; var3 < this.field4965.length; var3++) {
                this.field4965[var3] = class6.method63(this.field4965[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(II)I")
    public final int method1902(int arg0, int arg1) {
        field4967++;
        if (this.field4963 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4963.length; var3++) {
            if (this.field4968[var3] == arg1) {
                return this.field4963[var3];
            }
        }
        return arg0 == 30206 ? -1 : -76;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IB)I")
    public final int method1903(int arg0, byte arg1) {
        if (arg1 != 115) {
            field4977 = null;
        }
        field4964++;
        if (this.field4965 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4965.length; var3++) {
            if (this.field4970[var3] == arg0) {
                return this.field4965[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ltf;ZI)V")
    private final void method1904(class106 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return;
        }
        if (arg2 == 1) {
            this.field4969 = arg0.method755(1);
        } else if (arg2 == 2) {
            int var7 = arg0.method774((byte) 116);
            this.field4965 = new int[var7];
            this.field4970 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4965[var8] = arg0.method736(125);
                int var9 = arg0.method774((byte) 88);
                if (var9 == 0) {
                    this.field4970[var8] = -1;
                } else {
                    this.field4970[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method774((byte) 87);
            this.field4963 = new int[var4];
            this.field4968 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4963[var5] = arg0.method736(127);
                int var6 = arg0.method774((byte) 103);
                if (var6 == 0) {
                    this.field4968[var5] = -1;
                } else {
                    this.field4968[var5] = var6;
                }
            }
        }
        field4972++;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(II)V")
    public static final void method1905(int arg0, int arg1) {
        class286 var2 = class71.field1349;
        synchronized (class71.field1349) {
            if (arg0 < 96) {
                return;
            }
            class10.field199 = arg1;
        }
        field4966++;
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V")
    public static void method1906(int arg0) {
        field4971 = null;
        field4974 = null;
        int var1 = -99 / ((arg0 - 53) / 59);
        field4979 = null;
        field4975 = null;
        field4977 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[[I)V")
    public static final void method1907(int arg0, int[][] arg1) {
        int var2 = -101 % ((arg0 - 52) / 61);
        field4973++;
        class252.field4543 = arg1;
    }
}
