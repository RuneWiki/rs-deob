import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class418 extends class139 {

    @OriginalMember(owner = "client!or", name = "S", descriptor = "I")
    private int field5838 = -1;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field5828 = 0;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "Z")
    public static boolean field5833 = true;

    @OriginalMember(owner = "client!or", name = "U", descriptor = "Ldk;")
    public static class326 field5840 = new class326("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!or", name = "V", descriptor = "Ldk;")
    public static class326 field5841 = new class326("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!or", name = "Z", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!or", name = "X", descriptor = "I")
    public static int field5843 = field5845;

    @OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
    public static int field5844 = field5845 >> 2;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    private int field5829;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    private int field5832;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!or", name = "P", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!or", name = "Q", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!or", name = "T", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!or", name = "W", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!or", name = "R", descriptor = "[I")
    private int[] field5837;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public final void method876(int arg0) {
        super.method876(arg0);
        ++field5835;
        this.field5837 = null;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(B)I")
    public final int method875(byte arg0) {
        if (arg0 >= -45) {
            return 86;
        } else {
            ++field5834;
            return this.field5838;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field5831;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 > -67) {
            field5840 = null;
        }
        if (super.field1835.field2395) {
            int var4 = this.field5832 * (class241.field3615 != this.field5829 ? this.field5829 * arg1 / class241.field3615 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class356.field5147 == ~this.field5832) {
                for (int var8 = 0; class356.field5147 > var8; ++var8) {
                    int var9 = this.field5837[var4++];
                    var7[var8] = class367.method2256(var9, 255) << 4;
                    var6[var8] = class367.method2256(var9, 65280) >> 4;
                    var5[var8] = class367.method2256(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class356.field5147 > var10; ++var10) {
                    int var11 = this.field5832 * var10 / class356.field5147;
                    int var12 = this.field5837[var4 - -var11];
                    var7[var10] = class367.method2256(255, var12) << 4;
                    var6[var10] = class367.method2256(4080, var12 >> 4);
                    var5[var10] = class367.method2256(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field5838 = arg0.method1729(65280);
        }
        if (arg1 != -45) {
            this.field5837 = null;
        }
        ++field5839;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public static void method2454(int arg0) {
        if (arg0 != 4080) {
            field5840 = null;
        }
        field5840 = null;
        field5841 = null;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
    public class418() {
        super(0, false);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2455(byte arg0, String arg1) {
        ++field5836;
        class347.field5028 = arg1;
        if (class252.field3718.field6021 != null) {
            try {
                String var2 = class252.field3718.field6021.getParameter("cookieprefix");
                String var3 = class252.field3718.field6021.getParameter("cookiehost");
                if (arg0 <= -122) {
                    String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                    String var5;
                    if (arg1.length() == 0) {
                        var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var4 + "; Expires=" + class426.method2508(2, 94608000000L + class433.method2562(-2039)) + "; Max-Age=" + 94608000L;
                    }
                    class429.method2519((byte) 11, "document.cookie=\"" + var5 + "\"", class252.field3718.field6021);
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
    public final void method877(int arg0, int arg1, int arg2) {
        super.method877(arg0, arg1, arg2);
        ++field5830;
        if (this.field5838 >= 0 && class168.field2454 != null) {
            int var4 = class168.field2454.method703(12095, this.field5838).field4114 ? 64 : 128;
            this.field5837 = class168.field2454.method705(var4, 1.0F, false, var4, this.field5838, -30470);
            this.field5832 = var4;
            this.field5829 = var4;
        }
    }
}
