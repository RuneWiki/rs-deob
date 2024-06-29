import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class101 extends class43 {

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Z")
    public boolean field1173;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "[I")
    public static int[] field1182;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public static final void method608(byte arg0) {
        int var1 = 125 / ((13 - arg0) / 59);
        field1179++;
        class28.field316 = class364.method2284(8, true, 2048, 4, 0.4F, 8, 35, false);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)I")
    public static final int method609(int arg0, int arg1, int arg2, int arg3) {
        field1174++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        int var6 = arg3 / arg1;
        int var7 = arg1 - 1 & arg3;
        int var8 = class210.method1285(113, var4, var6);
        int var9 = class210.method1285(arg2 - 124, var4 + 1, var6);
        int var10 = class210.method1285(-105, var4, var6 + 1);
        int var11 = class210.method1285(122, var4 + 1, var6 + 1);
        if (arg2 == 2) {
            int var12 = class113.method661(var8, var9, arg1, var5, arg2 + 28276);
            int var13 = class113.method661(var10, var11, arg1, var5, arg2 + 28276);
            return class113.method661(var12, var13, arg1, var7, 28278);
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
    public static final void method610(int arg0, int arg1) {
        field1177++;
        class12 var2 = class390.method2422(341555040, arg1, 1);
        if (arg0 != 19453) {
            method610(-124, -22);
        }
        var2.method65(-122);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
    public static void method611(byte arg0) {
        if (arg0 != -82) {
            field1182 = null;
        }
        field1182 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIZ)V")
    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1180 = arg0;
        this.field1183 = arg3;
        this.field1178 = arg4;
        this.field1173 = arg5;
        this.field1175 = arg2;
        this.field1181 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lhh;")
    public static final class430 method612(Component arg0, boolean arg1, int arg2) {
        field1176++;
        if (arg2 != 8) {
            method609(-20, -126, 51, 113);
        }
        return new class290(arg0, arg1);
    }

    static {
        new class72("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field1182 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    }
}
