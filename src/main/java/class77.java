import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class77 extends class392 {

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    public static int field948 = 0;

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!aw", name = "w", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "Ljava/lang/String;")
    public String field938;

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "Z")
    public static boolean field942;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "[C")
    public char[] field945;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "[C")
    public char[] field946;

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "[I")
    public int[] field939;

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "[I")
    public int[] field943;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "[[[Llha;")
    public static class624[][][] field947;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILji;B)V")
    private final void method568(int arg0, class611 arg1, byte arg2) {
        field935++;
        if (arg2 <= 7) {
            this.method568(50, null, (byte) 94);
        }
        if (arg0 == 1) {
            this.field938 = arg1.method3403((byte) 84);
        } else if (arg0 == 2) {
            int var4 = arg1.method3428((byte) 30);
            this.field945 = new char[var4];
            this.field943 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field943[var5] = arg1.method3402((byte) 127);
                byte var6 = arg1.method3390((byte) -19);
                this.field945[var5] = var6 == 0 ? 0 : class14.method54(var6, (byte) 123);
            }
            return;
        } else if (arg0 == 3) {
            int var7 = arg1.method3428((byte) 45);
            this.field939 = new int[var7];
            this.field946 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field939[var8] = arg1.method3402((byte) 127);
                byte var9 = arg1.method3390((byte) -19);
                this.field946[var8] = var9 == 0 ? 0 : class14.method54(var9, (byte) 125);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IC)I")
    public final int method569(int arg0, char arg1) {
        field936++;
        if (this.field943 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field943.length; var3++) {
            if (this.field945[var3] == arg1) {
                return this.field943[var3];
            }
        }
        if (arg0 != -1) {
            this.field939 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(CB)I")
    public final int method570(char arg0, byte arg1) {
        field940++;
        if (this.field939 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field939.length; var3++) {
            if (this.field946[var3] == arg0) {
                return this.field939[var3];
            }
        }
        return arg1 > -119 ? 91 : -1;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)V")
    public static void method571(boolean arg0) {
        if (!arg0) {
            field948 = 117;
        }
        field947 = null;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
    public final void method572(int arg0) {
        field941++;
        if (arg0 != 32768) {
            field944 = 115;
        }
        if (this.field939 != null) {
            for (int var2 = 0; var2 < this.field939.length; var2++) {
                this.field939[var2] = class344.method2020(this.field939[var2], 32768);
            }
        }
        if (this.field943 != null) {
            for (int var3 = 0; var3 < this.field943.length; var3++) {
                this.field943[var3] = class344.method2020(this.field943[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lji;Z)V")
    public final void method573(class611 arg0, boolean arg1) {
        if (!arg1) {
            field947 = null;
        }
        while (true) {
            int var3 = arg0.method3428((byte) 29);
            if (var3 == 0) {
                field937++;
                return;
            }
            this.method568(var3, arg0, (byte) 61);
        }
    }
}
