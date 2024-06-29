import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class256 extends class261 {

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "F")
    public float field3920;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    private int field3919;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    private int field3923;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3934;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Ljb;")
    public static class344 field3933;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "[Lo;")
    public static class24[] field3927;

    static {
        new class309("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        new class309("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field3934 = "";
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I", line = 9)
    public final int method1646(int arg0) {
        if (arg0 >= -92) {
            return -64;
        } else {
            field3922++;
            return this.field3926;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)I", line = 20)
    public final int method1647(int arg0) {
        field3918++;
        return arg0 >= -116 ? -39 : this.field3923;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V", line = 37)
    public static final void method1648(int arg0) {
        field3925++;
        int var1 = 0;
        if (class186.field2990.method1129(0, class133.field2236)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class186.field2990.field2531) {
            var1 |= 0x40;
        }
        class475.method2844(var1, -40);
        class123.field2142.method1529(var1, false);
        class135.field2271.method1632(var1, false);
        class102.field1942.method848(-124, var1);
        class514.field7469.method597(0, var1);
        class32.method221((byte) -126, var1);
        class15.method101(var1, -27307);
        class139.method1043(var1, 13);
        if (arg0 > 68) {
            class513.method3063(true, var1);
            class488.method2957((byte) 118);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V", line = 73)
    public static final void method1649(byte arg0) {
        if (arg0 != -12) {
            return;
        }
        field3930++;
        class60[] var1 = class123.field2139;
        synchronized (class123.field2139) {
            for (int var2 = 0; var2 < class123.field2139.length; var2++) {
                class123.field2139[var2] = new class60();
                class81.field1639[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)F", line = 97)
    public final float method1650(int arg0) {
        field3931++;
        int var2 = -117 / ((9 - arg0) / 47);
        return this.field3920;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBI)I", line = 107)
    public static final int method1651(int arg0, int arg1, byte arg2, int arg3) {
        field3916++;
        if (class35.field537 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class319.field4876;
        int var7 = arg0 - class319.field4869;
        if (arg2 > -52) {
            return 23;
        }
        for (class97 var8 = (class97) class319.field4858.method1892(110); var8 != null; var8 = (class97) class319.field4858.method1893((byte) -2)) {
            if (var8.field1890 == arg1) {
                int var9 = var8.field1897;
                int var10 = var8.field1893;
                int var11 = class319.field4876 + var9 << 14 | class319.field4869 + var10;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)I", line = 157)
    public final int method1652(int arg0) {
        field3924++;
        if (arg0 != -17454) {
            this.field3929 = 14;
        }
        return this.field3919;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)I", line = 168)
    public final int method1653(byte arg0) {
        field3932++;
        if (arg0 >= -45) {
            this.field3928 = -119;
        }
        return this.field3929;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V", line = 182)
    public static final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -2) {
            method1654(47, -118, 62, -122, -46);
        }
        if (arg3 > arg0) {
            for (int var5 = arg0; var5 < arg3; var5++) {
                class316.field4797[var5][arg1] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg0; var6++) {
                class316.field4797[var6][arg1] = arg2;
            }
        }
        field3921++;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)I", line = 221)
    public final int method1655(byte arg0) {
        if (arg0 >= -57) {
            this.method1655((byte) -4);
        }
        field3917++;
        return this.field3928;
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)V", line = 234)
    public static void method1656(int arg0) {
        if (arg0 > -94) {
            field3927 = null;
        }
        field3933 = null;
        field3927 = null;
        field3934 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIF)V", line = 246)
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field3929 = arg2;
        this.field3920 = arg5;
        this.field3919 = arg4;
        this.field3928 = arg1;
        this.field3926 = arg0;
        this.field3923 = arg3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V")
    public abstract void method146(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IF)V")
    public abstract void method145(int arg0, float arg1);
}
