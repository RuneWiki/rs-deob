import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class52 extends class383 {

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public int field685 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field683 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public int field690 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public int field693 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public int field691 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field686 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public int field684 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public int field695 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Ldt;")
    public class160 field696;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "[I")
    public static int[] field694 = new int[13];

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Lap;")
    public static class335 field692 = new class335("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Ldq;")
    public static class493 field697 = new class493(86, 2);

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Ldq;")
    public static class493 field698 = new class493(68, 1);

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "F")
    public static float field699;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BC)Z")
    public static final boolean method517(byte arg0, char arg1) {
        field682++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class489.method2969(arg1, -19880)) {
            return true;
        } else {
            char[] var2 = class90.field1110;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class143.field1838;
            if (arg0 != 59) {
                method520(117);
            }
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z")
    public static final boolean method518(int arg0) {
        field681++;
        class520 var1 = (class520) class201.field2616.field268.field5047;
        if (var1 == null || class201.field2616.field268 == var1) {
            return false;
        }
        if (var1.field7508 >= 2000) {
            var1.field7508 -= 2000;
        }
        if (arg0 != 13) {
            method519(null, null, null, 15, null);
        }
        return var1.field7508 == 1012;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lqn;Lgj;Lqn;ILqn;)Z")
    public static final boolean method519(class47 arg0, class450 arg1, class47 arg2, int arg3, class47 arg4) {
        class155.field1965 = arg1;
        class267.field3380 = arg4;
        field687++;
        if (arg3 < 105) {
            field697 = null;
        }
        class186.field2438 = arg0;
        class271.field3421 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
    public static void method520(int arg0) {
        if (arg0 == 1336) {
            field694 = null;
            field692 = null;
            field698 = null;
            field697 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
    public final boolean method521(int arg0, int arg1, int arg2) {
        if (arg0 != Integer.MIN_VALUE) {
            return false;
        }
        field688++;
        if (this.field685 <= arg2 && arg2 <= this.field690 && this.field691 <= arg1 && this.field684 >= arg1) {
            return true;
        } else {
            return this.field683 <= arg2 && this.field693 >= arg2 && this.field686 <= arg1 && this.field695 >= arg1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ldt;)V")
    public class52(class160 arg0) {
        this.field696 = arg0;
    }
}
