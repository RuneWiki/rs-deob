import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class358 extends class6 {

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "Lnj;")
    public static class162 field5225 = new class162(64);

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "Ljava/lang/String;")
    public String field5224;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "[C")
    public char[] field5218;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "[C")
    public char[] field5221;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "[I")
    public int[] field5217;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "[I")
    public int[] field5228;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public static void method2142(byte arg0) {
        field5225 = null;
        if (arg0 > -72) {
            field5225 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)V")
    public final void method2143(int arg0) {
        if (this.field5217 != null) {
            for (int var2 = 0; var2 < this.field5217.length; var2++) {
                this.field5217[var2] = class255.method1532(this.field5217[var2], 32768);
            }
        }
        field5219++;
        int var3 = -99 / ((arg0 + 42) / 56);
        if (this.field5228 != null) {
            for (int var4 = 0; var4 < this.field5228.length; var4++) {
                this.field5228[var4] = class255.method1532(this.field5228[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(B)V")
    public static final void method2144(byte arg0) {
        if (class118.field1759 != null) {
            class118.field1759.method2608(-109);
        }
        int var1 = -112 / ((5 - arg0) / 39);
        field5227++;
        if (class102.field1544 != null) {
            class102.field1544.method2608(-118);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BILsi;)V")
    private final void method2145(byte arg0, int arg1, class391 arg2) {
        field5226++;
        if (arg1 == 1) {
            this.field5224 = arg2.method2347((byte) -70);
        } else if (arg1 == 2) {
            int var7 = arg2.method2348(-2);
            this.field5221 = new char[var7];
            this.field5228 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5228[var8] = arg2.method2353((byte) 121);
                byte var9 = arg2.method2337(-1);
                this.field5221[var8] = var9 == 0 ? 0 : class52.method452(30668, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method2348(-2);
            this.field5218 = new char[var4];
            this.field5217 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5217[var5] = arg2.method2353((byte) 91);
                byte var6 = arg2.method2337(-1);
                this.field5218[var5] = var6 == 0 ? 0 : class52.method452(30668, var6);
            }
        }
        if (arg0 <= 18) {
            this.field5217 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lsi;I)V")
    public final void method2146(class391 arg0, int arg1) {
        int var3 = 26 / ((15 - arg1) / 61);
        field5223++;
        while (true) {
            int var4 = arg0.method2348(-2);
            if (var4 == 0) {
                return;
            }
            this.method2145((byte) 67, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IC)I")
    public final int method2147(int arg0, char arg1) {
        field5220++;
        if (this.field5217 == null) {
            return -1;
        }
        if (arg0 != 64) {
            this.field5221 = null;
        }
        for (int var3 = 0; var3 < this.field5217.length; var3++) {
            if (this.field5218[var3] == arg1) {
                return this.field5217[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(IC)I")
    public final int method2148(int arg0, char arg1) {
        field5222++;
        if (arg0 != -1) {
            this.field5228 = null;
        }
        if (this.field5228 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5228.length; var3++) {
            if (this.field5221[var3] == arg1) {
                return this.field5228[var3];
            }
        }
        return -1;
    }
}
