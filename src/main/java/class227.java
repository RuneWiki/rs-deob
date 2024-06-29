import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class227 extends class15 {

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public int field3149 = 12800;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public int field3150 = 12800;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public int field3152 = 0;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Z")
    public boolean field3145 = true;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public int field3148 = -1;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public int field3157 = 0;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public int field3160 = -1;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "Ljava/lang/String;")
    public String field3156;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Ljava/lang/String;")
    public String field3142;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lvf;")
    public class166 field3161;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Lsd;")
    public static class74 field3153 = new class74(75, 12);

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field3162;

    static {
        new class40("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 5)
    public static void method1249(int arg0) {
        if (arg0 >= 8) {
            field3153 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V", line = 17)
    public static final void method1250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3141++;
        if (arg3 != -4855) {
            field3162 = 24;
        }
        if (arg0 >= arg1) {
            class270.method1633(class240.field3303[arg4], arg0, arg2, arg1, 102);
        } else {
            class270.method1633(class240.field3303[arg4], arg1, arg2, arg0, 103);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[III)Z", line = 36)
    public final boolean method1251(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field3159++;
        for (class419 var6 = (class419) this.field3161.method802((byte) 116); var6 != null; var6 = (class419) this.field3161.method806((byte) 104)) {
            if (var6.method2497(arg1, arg4, 7, arg3)) {
                var6.method2492((byte) -122, arg2, arg3, arg1);
                return true;
            }
        }
        if (arg0 != 27513) {
            this.field3142 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)Z", line = 68)
    public final boolean method1252(int arg0, byte arg1, int arg2) {
        field3154++;
        for (class419 var4 = (class419) this.field3161.method802((byte) 126); var4 != null; var4 = (class419) this.field3161.method806((byte) 104)) {
            if (var4.method2491((byte) -28, arg2, arg0)) {
                return true;
            }
        }
        return arg1 >= -29 ? false : false;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 280)
    public class227(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3156 = arg2;
        this.field3155 = arg0;
        this.field3148 = arg6;
        this.field3160 = arg4;
        this.field3151 = arg3;
        this.field3145 = arg5;
        this.field3142 = arg1;
        if (this.field3148 == 255) {
            this.field3148 = 0;
        }
        this.field3161 = new class166();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(CB)Z", line = 95)
    public static final boolean method1253(char arg0, byte arg1) {
        if (arg1 != 68) {
            method1253('`', (byte) -6);
        }
        field3147++;
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V", line = 119)
    public static final void method1254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3144++;
        int var8 = class353.method2142((byte) -119, class328.field4729, arg0, class357.field5123);
        int var9 = class353.method2142((byte) 82, class328.field4729, arg3, class357.field5123);
        int var10 = class353.method2142((byte) 97, class453.field6396, arg1, class75.field912);
        int var11 = class353.method2142((byte) -48, class453.field6396, arg5, class75.field912);
        int var12 = class353.method2142((byte) 94, class328.field4729, arg0 + arg2, class357.field5123);
        int var13 = class353.method2142((byte) -85, class328.field4729, arg3 - arg2, class357.field5123);
        for (int var14 = var8; var14 < var12; var14++) {
            class270.method1633(class240.field3303[var14], var11, arg4, var10, 126);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class270.method1633(class240.field3303[var15], var11, arg4, var10, 119);
        }
        if (arg6 != -32659) {
            field3153 = null;
        }
        int var16 = class353.method2142((byte) -50, class453.field6396, arg1 + arg2, class75.field912);
        int var17 = class353.method2142((byte) 86, class453.field6396, arg5 - arg2, class75.field912);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class240.field3303[var18];
            class270.method1633(var19, var16, arg4, var10, arg6 ^ 0xFFFF8034);
            class270.method1633(var19, var17, arg7, var16, 116);
            class270.method1633(var19, var11, arg4, var17, 127);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIII)Z", line = 172)
    public final boolean method1255(int[] arg0, int arg1, int arg2, int arg3) {
        field3158++;
        for (class419 var5 = (class419) this.field3161.method802((byte) 111); var5 != null; var5 = (class419) this.field3161.method806((byte) 104)) {
            if (var5.method2490(arg1, arg3, (byte) -67)) {
                var5.method2498(arg0, arg3, false, arg1);
                return true;
            }
        }
        if (arg2 >= -49) {
            this.method1256((int[]) null, -114, -58, 39);
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "([IIII)Z", line = 200)
    public final boolean method1256(int[] arg0, int arg1, int arg2, int arg3) {
        field3143++;
        for (class419 var5 = (class419) this.field3161.method802((byte) 101); var5 != null; var5 = (class419) this.field3161.method806((byte) 104)) {
            if (var5.method2491((byte) -28, arg2, arg1)) {
                var5.method2492((byte) -126, arg0, arg1, arg2);
                return true;
            }
        }
        int var6 = 18 % ((32 - arg3) / 60);
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 235)
    public final void method1257(int arg0) {
        if (arg0 != 12094) {
            this.field3149 = 19;
        }
        this.field3152 = 0;
        this.field3149 = 12800;
        this.field3150 = 12800;
        this.field3157 = 0;
        field3146++;
        for (class419 var2 = (class419) this.field3161.method802((byte) 121); var2 != null; var2 = (class419) this.field3161.method806((byte) 104)) {
            if (var2.field6031 > this.field3157) {
                this.field3157 = var2.field6031;
            }
            if (var2.field6033 < this.field3150) {
                this.field3150 = var2.field6033;
            }
            if (this.field3149 > var2.field6042) {
                this.field3149 = var2.field6042;
            }
            if (this.field3152 < var2.field6036) {
                this.field3152 = var2.field6036;
            }
        }
    }
}
