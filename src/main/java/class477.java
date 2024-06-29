import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class class477 extends class484 {

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public int field7303;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public int field7304;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public int field7300;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public int field7302;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Lqu;")
    public static class219 field7305 = new class219(53, -1);

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "Lcg;")
    public static class10 field7307 = new class10(10, 2, 2, 0);

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "Lgi;")
    public static class437 field7309;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)I")
    public static final int method2958(int arg0, int arg1, int arg2, int arg3) {
        field7306++;
        int var4 = arg0 / arg1;
        int var5 = arg1 - 1 & arg0;
        int var6 = arg3 / arg1;
        int var7 = arg3 & arg1 - 1;
        int var8 = class119.method754(false, var6, var4);
        int var9 = class119.method754(false, var6, var4 + 1);
        int var10 = class119.method754(false, var6 + 1, var4);
        int var11 = -103 / ((arg2 + 26) / 57);
        int var12 = class119.method754(false, var6 + 1, var4 + 1);
        int var13 = class339.method2245((byte) -53, var8, var9, var5, arg1);
        int var14 = class339.method2245((byte) -53, var10, var12, var5, arg1);
        return class339.method2245((byte) -53, var13, var14, var7, arg1);
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(Z)V")
    public static void method2959(boolean arg0) {
        if (arg0) {
            field7309 = null;
            field7305 = null;
            field7307 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIII)V")
    public class477(int arg0, int arg1, int arg2, int arg3) {
        this.field7303 = arg2;
        this.field7304 = arg1;
        this.field7300 = arg0;
        this.field7302 = arg3;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method2960(String[] arg0, int arg1, int arg2, int arg3) {
        field7301++;
        if (arg1 == 0) {
            return "";
        } else if (arg2 >= -25) {
            return null;
        } else if (arg1 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    static {
        new class213("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field7308 = 2;
        field7309 = null;
    }
}
