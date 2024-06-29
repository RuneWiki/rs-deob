import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class378 extends class452 {

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Ltr;")
    public static class195 field5704 = new class195(6, 6);

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lhn;")
    public static class509 field5706 = new class509(36, -2);

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "Lqj;")
    public static class355 field5709 = class448.method2743(29627);

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lut;")
    public static class82 field5707;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Ljava/lang/String;")
    public String field5696;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[C")
    public char[] field5698;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "[C")
    public char[] field5699;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[I")
    public int[] field5703;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "[I")
    public int[] field5708;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(CI)I")
    public final int method2372(char arg0, int arg1) {
        field5695++;
        if (this.field5703 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5703.length; var3++) {
            if (this.field5699[var3] == arg0) {
                return this.field5703[var3];
            }
        }
        if (arg1 < 104) {
            method2378(-7, -50);
        }
        return -1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method2373(int arg0) {
        field5709 = null;
        field5707 = null;
        field5704 = null;
        field5706 = null;
        if (arg0 != -18639) {
            method2378(89, 14);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(CI)I")
    public final int method2374(char arg0, int arg1) {
        field5701++;
        if (this.field5708 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field5708.length; var3++) {
            if (this.field5698[var3] == arg0) {
                return this.field5708[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public final void method2375(byte arg0) {
        field5705++;
        int var2 = -128 % ((43 - arg0) / 63);
        if (this.field5708 != null) {
            for (int var3 = 0; var3 < this.field5708.length; var3++) {
                this.field5708[var3] = class264.method1763(this.field5708[var3], 32768);
            }
        }
        if (this.field5703 != null) {
            for (int var4 = 0; var4 < this.field5703.length; var4++) {
                this.field5703[var4] = class264.method1763(this.field5703[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLhp;I)V")
    private final void method2376(boolean arg0, class217 arg1, int arg2) {
        field5700++;
        if (arg0) {
            this.method2375((byte) 57);
        }
        if (arg2 == 1) {
            this.field5696 = arg1.method1550((byte) 28);
        } else if (arg2 == 2) {
            int var4 = arg1.method1515((byte) 121);
            this.field5703 = new int[var4];
            this.field5699 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5703[var5] = arg1.method1511(-127);
                byte var6 = arg1.method1565(true);
                this.field5699[var5] = var6 == 0 ? 0 : class467.method2818(var6, (byte) -30);
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg1.method1515((byte) 127);
            this.field5698 = new char[var7];
            this.field5708 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5708[var8] = arg1.method1511(-79);
                byte var9 = arg1.method1565(!arg0);
                this.field5698[var8] = var9 == 0 ? 0 : class467.method2818(var9, (byte) 121);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lhp;B)V")
    public final void method2377(class217 arg0, byte arg1) {
        field5697++;
        while (true) {
            int var3 = arg0.method1515((byte) 122);
            if (var3 == 0) {
                int var4 = -106 % ((72 - arg1) / 39);
                return;
            }
            this.method2376(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)Z")
    public static final boolean method2378(int arg0, int arg1) {
        if (arg0 == 9) {
            field5702++;
            return arg1 == 9 || arg1 == 10 || arg1 == 11;
        } else {
            return false;
        }
    }
}
