import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class461 extends class114 {

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field6893 = 0;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "[[B")
    public static byte[][] field6905;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Ljava/awt/Frame;")
    public static Frame field6896;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "Ljava/lang/String;")
    public String field6900;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "[C")
    public char[] field6897;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "[C")
    public char[] field6903;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "[I")
    public int[] field6891;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "[I")
    public int[] field6892;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
    public static void method2786(int arg0) {
        field6896 = null;
        if (arg0 != -45091101) {
            field6905 = null;
        }
        field6905 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public final void method2787(boolean arg0) {
        field6894++;
        if (this.field6892 != null) {
            for (int var2 = 0; var2 < this.field6892.length; var2++) {
                this.field6892[var2] = class311.method1956(this.field6892[var2], 32768);
            }
        }
        if (arg0) {
            method2790(7);
        }
        if (this.field6891 != null) {
            for (int var3 = 0; var3 < this.field6891.length; var3++) {
                this.field6891[var3] = class311.method1956(this.field6891[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lnj;II)V")
    private final void method2788(class164 arg0, int arg1, int arg2) {
        field6901++;
        if (arg1 > -101) {
            method2790(99);
        }
        if (arg2 == 1) {
            this.field6900 = arg0.method1064(false);
        } else if (arg2 == 2) {
            int var4 = arg0.method1087(false);
            this.field6897 = new char[var4];
            this.field6891 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6891[var5] = arg0.method1074(-635989152);
                byte var6 = arg0.method1088((byte) -78);
                this.field6897[var5] = var6 == 0 ? 0 : class165.method1122((byte) -53, var6);
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg0.method1087(false);
            this.field6903 = new char[var7];
            this.field6892 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field6892[var8] = arg0.method1074(-635989152);
                byte var9 = arg0.method1088((byte) -80);
                this.field6903[var8] = var9 == 0 ? 0 : class165.method1122((byte) -34, var9);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(CZ)I")
    public final int method2789(char arg0, boolean arg1) {
        field6895++;
        if (!arg1) {
            this.field6891 = null;
        }
        if (this.field6891 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field6891.length; var3++) {
            if (this.field6897[var3] == arg0) {
                return this.field6891[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
    public static final void method2790(int arg0) {
        field6902++;
        if (class92.method621(class435.field6596, -4) || class404.method2491(class435.field6596, -9)) {
            class293.method1868(class140.field1869 >> 10, true, class199.field2646 >> 10, 5000);
        } else {
            int var1 = class56.field800.field3917[0] >> 3;
            int var2 = class56.field800.field3915[0] >> 3;
            if (var1 >= 0 && class398.field6071 >> 3 > var1 && var2 >= 0 && (class528.field7734 >> 3) > var2) {
                class293.method1868(var2, true, var1, 5000);
            } else {
                class293.method1868(class528.field7734 >> 4, true, class398.field6071 >> 4, 0);
            }
        }
        class38.method323((byte) -87);
        class466.method2801((byte) 55);
        if (arg0 >= -33) {
            field6893 = -34;
        }
        class402.method2485(true);
        class165.method1125((byte) 21);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public static final void method2791(byte arg0) {
        class538.field7879.field2185 = 0;
        field6904++;
        class205.field2737 = null;
        class485.field7175 = 0;
        class409.field6214.field2185 = 0;
        class501.field7394 = null;
        class101.field1471 = null;
        class14.field261 = 0;
        class250.field3479 = null;
        class497.field7326 = 0;
        class513.method3064(0);
        class177.method1188((byte) 25);
        for (int var1 = 0; var1 < 2048; var1++) {
            class241.field3398[var1] = null;
        }
        class56.field800 = null;
        for (int var2 = 0; var2 < class515.field7566; var2++) {
            class17 var4 = class480.field7090[var2].field348;
            if (var4 != null) {
                var4.field3833 = -1;
            }
        }
        class458.method2778(-125);
        class340.field5269 = 1;
        class134.method908(9, 2);
        if (arg0 <= 113) {
            field6905 = null;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class430.field6553[var3] = true;
        }
        class365.method2331(true);
        class203.field2719 = null;
        class515.field7569 = 0L;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(CB)I")
    public final int method2792(char arg0, byte arg1) {
        field6898++;
        if (this.field6892 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field6892.length; var3++) {
            if (this.field6903[var3] == arg0) {
                return this.field6892[var3];
            }
        }
        if (arg1 <= 89) {
            this.method2789('\u000f', false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILnj;)V")
    public final void method2793(int arg0, class164 arg1) {
        while (true) {
            int var3 = arg1.method1087(false);
            if (var3 == 0) {
                if (arg0 != 0) {
                    field6905 = null;
                }
                field6899++;
                return;
            }
            this.method2788(arg1, -125, var3);
        }
    }

    static {
        new class446("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field6905 = new byte[50][];
    }
}
