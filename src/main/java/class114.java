import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class114 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Z")
    public boolean field1596 = false;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lgn;")
    public static class410 field1603;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Lqu;")
    public static class219 field1606;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lsr;")
    public class435 field1595;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public static void method732(boolean arg0) {
        field1603 = null;
        field1606 = null;
        if (!arg0) {
            method732(true);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lhw;II)V")
    private final void method733(class208 arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            this.field1596 = true;
        }
        if (arg2 == 1) {
            this.field1601 = arg0.method1455(-3387);
        } else if (arg2 == 2) {
            this.field1598 = arg0.method1452(3);
        } else if (arg2 == 3) {
            this.field1596 = true;
        } else if (arg2 == 4) {
            this.field1601 = -1;
        }
        field1597++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILhw;)V")
    public final void method734(int arg0, class208 arg1) {
        if (arg0 != 0) {
            method736((byte) 52, null);
        }
        field1600++;
        while (true) {
            int var3 = arg1.method1445(66);
            if (var3 == 0) {
                return;
            }
            this.method733(arg1, arg0 + 4, var3);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static final void method735(byte arg0) {
        if (arg0 <= 77) {
            field1606 = null;
        }
        class112.field1580 = null;
        class168.field2448 = false;
        field1599++;
        class236.method1667(2318);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method736(byte arg0, String arg1) {
        field1605++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        if (arg0 != -61) {
            field1603 = null;
        }
        while (var2 < var3 && class321.method2146(arg1.charAt(var2), (byte) -121)) {
            var2++;
        }
        while (var3 > var2 && class321.method2146(arg1.charAt(var3 - 1), (byte) -121)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class197.method1358(var7, arg0 ^ 0xFFFFFFC3)) {
                char var8 = class348.method2297(var7, (byte) -128);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Z")
    public final boolean method737(byte arg0) {
        if (arg0 <= 85) {
            return true;
        } else {
            field1604++;
            return this.field1595.field6565.method1012(this.field1601, true);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILza;I)Lo;")
    public final class139 method738(boolean arg0, int arg1, class497 arg2, int arg3) {
        field1602++;
        long var5 = (long) (this.field1601 | arg1 << 16 | (arg0 ? 262144 : 0) | arg2.field7472 << 19);
        class139 var7 = (class139) this.field1595.field6570.method2191((byte) -73, var5);
        if (var7 != null) {
            return var7;
        }
        if (arg3 != 2) {
            method736((byte) 74, null);
        }
        if (!this.field1595.field6565.method1012(this.field1601, true)) {
            return null;
        }
        class175 var8 = class175.method1115(this.field1595.field6565, this.field1601, 0);
        if (var8 != null) {
            var8.field2578 = var8.field2575 = var8.field2573 = var8.field2579 = 0;
            if (arg0) {
                var8.method1106();
            }
            for (int var9 = 0; var9 < arg1; var9++) {
                var8.method1104();
            }
        }
        class139 var10 = arg2.method1278(var8, true);
        if (var10 != null) {
            this.field1595.field6570.method2188(-128, var5, var10);
        }
        return var10;
    }

    static {
        new class213("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field1603 = new class410();
        field1606 = new class219(61, 3);
    }
}
