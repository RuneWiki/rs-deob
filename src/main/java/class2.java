import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 extends class199 {

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public int field22 = 12800;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public int field24 = -1;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public int field26 = 12800;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public int field36 = 0;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public int field37 = 0;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "Z")
    public boolean field41 = true;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public int field44 = -1;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "Ljava/lang/String;")
    public String field42;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "Ljava/lang/String;")
    public String field43;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "Lql;")
    public class87 field30;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field29 = -1;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 8)
    public static final void method7(boolean arg0) {
        field39++;
        if (!arg0) {
            field29 = 43;
        }
        class214.field3255 = 0;
        int var1 = (class98.field1566.field1905 >> 7) + class213.field3249;
        int var2 = (class98.field1566.field1868 >> 7) + class342.field5328;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class214.field3255 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class214.field3255 = 1;
        }
        if (class214.field3255 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class214.field3255 = 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBII)[I", line = 36)
    public final int[] method8(int arg0, byte arg1, int arg2, int arg3) {
        field38++;
        if (arg1 < 106) {
            this.method8(53, (byte) -26, -8, 63);
        }
        for (class256 var5 = (class256) this.field30.method636(-1); var5 != null; var5 = (class256) this.field30.method638(84)) {
            if (var5.method1753(124, arg0, arg2, arg3)) {
                return var5.method1756(true, arg3, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)I", line = 64)
    public static final int method9(int arg0, int arg1) {
        field40++;
        class190 var2 = class320.method2172(arg1, 32370);
        int var3 = var2.field2848;
        if (arg0 != 0) {
            method14((String) null, '\u0015', 76);
        }
        int var4 = var2.field2850;
        int var5 = var2.field2852;
        int var6 = class280.field4307[var5 - var4];
        return var6 & class285.field4461[var3] >> var4;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 261)
    public class2(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field42 = arg1;
        this.field41 = arg5;
        this.field31 = arg3;
        this.field28 = arg0;
        this.field24 = arg4;
        this.field44 = arg6;
        this.field43 = arg2;
        if (this.field44 == 255) {
            this.field44 = 0;
        }
        this.field30 = new class87();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)[I", line = 88)
    public final int[] method10(int arg0, byte arg1, int arg2) {
        field23++;
        for (class256 var4 = (class256) this.field30.method636(-1); var4 != null; var4 = (class256) this.field30.method638(49)) {
            if (var4.method1752((byte) 126, arg2, arg0)) {
                return var4.method1756(true, arg0, arg2);
            }
        }
        int var5 = 24 / ((arg1 - 62) / 41);
        return null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 117)
    public final void method11(byte arg0) {
        this.field37 = 0;
        int var2 = 26 % ((-arg0 - 3) / 53);
        this.field26 = 12800;
        field33++;
        this.field36 = 0;
        this.field22 = 12800;
        for (class256 var3 = (class256) this.field30.method636(-1); var3 != null; var3 = (class256) this.field30.method638(75)) {
            if (var3.field4011 < this.field22) {
                this.field22 = var3.field4011;
            }
            if (this.field26 > var3.field4015) {
                this.field26 = var3.field4015;
            }
            if (this.field37 < var3.field4014) {
                this.field37 = var3.field4014;
            }
            if (this.field36 < var3.field4008) {
                this.field36 = var3.field4008;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 152)
    public static final void method12(byte arg0) {
        class73.field1193.method2176((byte) -23);
        int var1 = 95 / ((arg0 + 52) / 58);
        field32++;
        class152.field2284.method2176((byte) -28);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)[I", line = 168)
    public final int[] method13(int arg0, int arg1, int arg2) {
        field34++;
        if (arg0 > -100) {
            this.field43 = (String) null;
        }
        for (class256 var4 = (class256) this.field30.method636(-1); var4 != null; var4 = (class256) this.field30.method638(75)) {
            if (var4.method1755(true, arg2, arg1)) {
                return var4.method1754(-30460, arg2, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;CI)I", line = 193)
    public static final int method14(String arg0, char arg1, int arg2) {
        field25++;
        int var3 = arg2;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)Z", line = 238)
    public final boolean method15(int arg0, int arg1, byte arg2) {
        field35++;
        int var4 = -40 / ((arg2 + 66) / 38);
        for (class256 var5 = (class256) this.field30.method636(-1); var5 != null; var5 = (class256) this.field30.method638(98)) {
            if (var5.method1752((byte) 126, arg1, arg0)) {
                return true;
            }
        }
        return false;
    }
}
