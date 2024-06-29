import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class404 extends class337 {

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public int field6092 = 0;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "Llt;")
    public static class475 field6100 = new class475("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "[I")
    public static int[] field6107 = new int[1];

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public int field6087;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public int field6090;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
    public int field6097;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    public int field6098;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
    public int field6099;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public int field6101;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public int field6102;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public int field6104;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public int field6105;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "Lse;")
    public class167 field6103;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "Loq;")
    public class239 field6084;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Lkn;")
    public class519 field6083;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "Lct;")
    public class97 field6085;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "Lct;")
    public class97 field6093;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "Z")
    public boolean field6094;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "[I")
    public int[] field6095;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)I")
    public static final int method2430(int arg0, int arg1, int arg2, int arg3) {
        field6096++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        int var6 = arg2 / arg1;
        int var7 = arg1 + arg3 & arg2;
        int var8 = class352.method2205(var6, (byte) -81, var4);
        int var9 = class352.method2205(var6, (byte) -83, var4 + 1);
        int var10 = class352.method2205(var6 + 1, (byte) -101, var4);
        int var11 = class352.method2205(var6 + 1, (byte) -53, var4 + 1);
        int var12 = class509.method3014(1474329360, var9, var8, arg1, var5);
        int var13 = class509.method3014(arg3 ^ 0xA81F84EF, var11, var10, arg1, var5);
        return class509.method3014(1474329360, var13, var12, arg1, var7);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/awt/Component;)Lbv;")
    public static final class199 method2431(int arg0, Component arg1) {
        if (arg0 != 63) {
            field6100 = null;
        }
        field6106++;
        return new class251(arg1);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method2432(int arg0) {
        field6107 = null;
        field6100 = null;
        if (arg0 != -19026) {
            method2433(-124, -118, 125, -4);
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIII)V")
    public static final void method2433(int arg0, int arg1, int arg2, int arg3) {
        field6086++;
        String var4 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        if (arg2 == 4566) {
            class28.method168(true, 29120, var4);
        }
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
    public final void method2434(int arg0) {
        field6091++;
        if (arg0 != -1) {
            return;
        }
        int var2 = this.field6098;
        if (this.field6083 != null) {
            class519 var5 = this.field6083.method3067(class49.field796, -13012);
            if (var5 == null) {
                this.field6095 = null;
                this.field6088 = 0;
                this.field6089 = 0;
                this.field6090 = 0;
                this.field6098 = -1;
                this.field6105 = 0;
            } else {
                this.field6088 = var5.field7618;
                this.field6105 = var5.field7581;
                this.field6089 = var5.field7613 << 7;
                this.field6095 = var5.field7645;
                this.field6098 = var5.field7651;
                this.field6090 = var5.field7583;
            }
        } else if (this.field6103 != null) {
            int var3 = class531.method3135(this.field6103, 73);
            if (var2 != var3) {
                this.field6098 = var3;
                class342 var4 = this.field6103.field2472;
                if (var4.field4938 != null) {
                    var4 = var4.method2094(arg0 ^ 0x71, class49.field796);
                }
                if (var4 == null) {
                    this.field6105 = this.field6089 = 0;
                } else {
                    this.field6105 = var4.field4939;
                    this.field6089 = var4.field4919 << 7;
                }
            }
        } else if (this.field6084 != null) {
            this.field6098 = class462.method2782(arg0 + 5425, this.field6084);
            this.field6105 = this.field6084.field3544;
            this.field6089 = this.field6084.field3534 << 7;
        }
        if (this.field6098 != var2 && this.field6085 != null) {
            class366.field5591.method1794(this.field6085);
            this.field6085 = null;
        }
    }
}
