import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class491 extends class130 {

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public int field7183 = 0;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "Lrl;")
    public static class530 field7184 = new class530(14, 1);

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Lrl;")
    public static class530 field7186 = new class530(15, 4);

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "Lrl;")
    public static class530 field7188 = new class530(16, -2);

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Lrl;")
    public static class530 field7189 = new class530(17, 0);

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "Lrl;")
    public static class530 field7190 = new class530(18, -2);

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Lrl;")
    public static class530 field7191 = new class530(19, -2);

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Lrl;")
    public static class530 field7192 = new class530(20, 6);

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Lrl;")
    public static class530 field7193 = new class530(21, 9);

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "Lrl;")
    public static class530 field7194 = new class530(22, -2);

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Lrl;")
    public static class530 field7195 = new class530(23, 4);

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Lrl;")
    public static class530 field7196 = new class530(24, -1);

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lrl;")
    public static class530 field7197 = new class530(25, -2);

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "[Lrl;")
    private static class530[] field7198 = new class530[32];

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public int field7165;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public int field7166;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public int field7168;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public int field7169;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public int field7172;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public int field7173;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public int field7174;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field7176;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field7178;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public int field7185;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public int field7187;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Llm;")
    public class248 field7170;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Llm;")
    public class248 field7182;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "Lii;")
    public class395 field7177;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "Lpv;")
    public class46 field7180;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lsj;")
    public class511 field7167;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Z")
    public boolean field7181;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "Z")
    public static boolean field7199;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
    public int[] field7175;

    static {
        class530[] var0 = class379.method2409((byte) -72);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field7198[var0[var1].field7746] = var0[var1];
        }
        new class179("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 15)
    public final void method2958(boolean arg0) {
        field7171++;
        int var2 = this.field7172;
        if (this.field7177 != null) {
            class395 var5 = this.field7177.method2485(class288.field4476, -113);
            if (var5 == null) {
                this.field7175 = null;
                this.field7178 = 0;
                this.field7172 = -1;
                this.field7168 = 0;
                this.field7187 = 0;
                this.field7166 = 0;
            } else {
                this.field7166 = var5.field5797;
                this.field7175 = var5.field5836;
                this.field7187 = var5.field5839;
                this.field7172 = var5.field5813;
                this.field7168 = var5.field5758 << 7;
                this.field7178 = var5.field5812;
            }
        } else if (this.field7180 != null) {
            int var3 = class150.method1081((byte) -72, this.field7180);
            if (var2 != var3) {
                this.field7172 = var3;
                class171 var4 = this.field7180.field718;
                if (var4.field2611 != null) {
                    var4 = var4.method1221(class288.field4476, 0);
                }
                if (var4 == null) {
                    this.field7178 = this.field7168 = 0;
                } else {
                    this.field7168 = var4.field2575 << 7;
                    this.field7178 = var4.field2647;
                }
            }
        } else if (this.field7167 != null) {
            this.field7172 = class199.method1412(this.field7167, 26582);
            this.field7178 = this.field7167.field7433;
            this.field7168 = this.field7167.field7436 << 7;
        }
        if (!arg0) {
            method2959(-47, -110);
        }
        if (this.field7172 != var2 && this.field7182 != null) {
            class503.field7313.method1802(this.field7182);
            this.field7182 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V", line = 100)
    public static final void method2959(int arg0, int arg1) {
        class414.field6095 = arg0;
        if (arg1 != 4) {
            field7196 = null;
        }
        field7179++;
        class242 var2 = class162.field2439;
        synchronized (class162.field2439) {
            class162.field2439.method1637((byte) 13);
        }
        class242 var3 = class98.field1525;
        synchronized (class98.field1525) {
            class98.field1525.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V", line = 119)
    public static void method2960(boolean arg0) {
        field7186 = null;
        field7189 = null;
        field7188 = null;
        field7196 = null;
        field7191 = null;
        field7195 = null;
        field7184 = null;
        field7197 = null;
        if (!arg0) {
            field7192 = null;
        }
        field7190 = null;
        field7192 = null;
        field7194 = null;
        field7198 = null;
        field7193 = null;
    }
}
