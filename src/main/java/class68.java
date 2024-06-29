import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class68 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    private int field1055 = 0;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    private int field1067 = -1;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lag;")
    private class97 field1066 = new class97();

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Z")
    public boolean field1072 = false;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[[I")
    private int[][] field1064;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[Ll;")
    private class260[] field1063;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field1059 = 0;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[I")
    public static int[] field1068 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Lhe;")
    public static class79 field1071 = new class79(5000);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
    public static long field1054;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
    public static final void method460(int arg0, byte arg1) {
        if (arg1 > -94) {
            method465(80, -112, -22, 64, 111, -113, 99, 123);
        }
        field1060++;
        if (!class159.method1072((byte) -14, arg0)) {
            return;
        }
        class267[] var2 = class19.field268[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class267 var4 = var2[var3];
            if (var4 != null) {
                var4.field4126 = 0;
                var4.field4190 = 1;
                var4.field4115 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public final void method461(boolean arg0) {
        if (arg0) {
            this.method463(-30, true);
        }
        for (int var2 = 0; var2 < this.field1062; var2++) {
            this.field1064[var2] = null;
        }
        field1065++;
        this.field1064 = null;
        this.field1063 = null;
        this.field1066.method647((byte) -70);
        this.field1066 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)[[I")
    public final int[][] method462(byte arg0) {
        field1058++;
        if (this.field1070 != this.field1062) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1062; var2++) {
            this.field1063[var2] = class94.field1433;
        }
        return arg0 >= -59 ? null : this.field1064;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[I")
    public final int[] method463(int arg0, boolean arg1) {
        if (arg1) {
            this.field1055 = -95;
        }
        field1057++;
        if (this.field1070 == this.field1062) {
            this.field1072 = this.field1063[arg0] == null;
            this.field1063[arg0] = class94.field1433;
            return this.field1064[arg0];
        } else if (this.field1062 == 1) {
            this.field1072 = this.field1067 != arg0;
            this.field1067 = arg0;
            return this.field1064[0];
        } else {
            class260 var3 = this.field1063[arg0];
            if (var3 == null) {
                this.field1072 = true;
                if (this.field1055 < this.field1062) {
                    var3 = new class260(arg0, this.field1055);
                    this.field1055++;
                } else {
                    class260 var4 = (class260) this.field1066.method649(82);
                    var3 = new class260(arg0, var4.field3931);
                    this.field1063[var4.field3930] = null;
                    var4.method1706(-71);
                }
                this.field1063[arg0] = var3;
            } else {
                this.field1072 = false;
            }
            this.field1066.method657(var3, (byte) 127);
            return this.field1064[var3.field3931];
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method464(int arg0) {
        field1071 = null;
        field1068 = null;
        if (arg0 != -16045) {
            field1068 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1061++;
        int var8 = arg7 + arg1;
        int var9 = arg6 - arg1;
        for (int var10 = arg7; var10 < var8; var10++) {
            class183.method1181(arg5, (byte) -69, arg0, class163.field2370[var10], arg3);
        }
        int var11 = arg3 + arg1;
        int var12 = arg0 - arg1;
        if (arg4 != 5000) {
            method464(62);
        }
        for (int var13 = arg6; var13 > var9; var13--) {
            class183.method1181(arg5, (byte) -69, arg0, class163.field2370[var13], arg3);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class163.field2370[var14];
            class183.method1181(arg5, (byte) -69, var11, var15, arg3);
            class183.method1181(arg2, (byte) -69, var12, var15, var11);
            class183.method1181(arg5, (byte) -69, arg0, var15, var12);
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(III)V")
    public class68(int arg0, int arg1, int arg2) {
        this.field1070 = arg1;
        this.field1062 = arg0;
        this.field1064 = new int[this.field1062][arg2];
        this.field1063 = new class260[this.field1070];
    }
}
