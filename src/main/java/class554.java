import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class554 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lsw;")
    private class641 field8156 = new class641(128);

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lsw;")
    public class641 field8163 = new class641(64);

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Ldn;")
    private class438 field8161;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Ldn;")
    public class438 field8153;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lcea;")
    public static class180 field8158;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lcea;")
    public static class180 field8162;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field8160;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field8164;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "[I")
    public static int[] field8152;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public final void method3241(int arg0) {
        field8159++;
        if (arg0 != 36) {
            this.method3244(-40, false);
        }
        class641 var2 = this.field8156;
        synchronized (this.field8156) {
            this.field8156.method3687(1402);
        }
        class641 var3 = this.field8163;
        synchronized (this.field8163) {
            this.field8163.method3687(arg0 + 1366);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static final void method3242(int arg0) {
        try {
            if (arg0 != 0) {
                field8162 = null;
            }
            Method var1 = (field8164 == null ? (field8164 = method3248("java.lang.Runtime")) : field8164).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class618.field8938 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field8151++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public final void method3243(byte arg0) {
        field8154++;
        class641 var2 = this.field8156;
        synchronized (this.field8156) {
            this.field8156.method3694(0);
        }
        class641 var3 = this.field8163;
        synchronized (this.field8163) {
            this.field8163.method3694(arg0 - 12);
            if (arg0 != 12) {
                method3247(-37);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ)V")
    public final void method3244(int arg0, boolean arg1) {
        class641 var3 = this.field8156;
        synchronized (this.field8156) {
            this.field8156.method3686((byte) 53, arg0);
        }
        field8157++;
        class641 var4 = this.field8163;
        synchronized (this.field8163) {
            this.field8163.method3686((byte) 53, arg0);
            if (!arg1) {
                this.field8156 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)Ldi;")
    public final class107 method3245(byte arg0, int arg1) {
        field8160++;
        class641 var3 = this.field8156;
        class107 var4;
        synchronized (this.field8156) {
            var4 = (class107) this.field8156.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field8161;
        byte[] var6;
        synchronized (this.field8161) {
            var6 = this.field8161.method2558(100, arg1, 36);
        }
        class107 var7 = new class107();
        var7.field1325 = this;
        if (arg0 != -119) {
            return null;
        }
        var7.field1336 = arg1;
        if (var6 != null) {
            var7.method629(126, new class374(var6));
        }
        var7.method624(1);
        class641 var8 = this.field8156;
        synchronized (this.field8156) {
            this.field8156.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZ)V")
    public final void method3246(int arg0, int arg1, boolean arg2) {
        this.field8156 = new class641(arg0);
        field8155++;
        this.field8163 = new class641(arg1);
        if (arg2) {
            field8158 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public static void method3247(int arg0) {
        field8152 = null;
        field8158 = null;
        if (arg0 <= -93) {
            field8162 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lre;ILdn;Ldn;)V")
    public class554(class515 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field8161 = arg2;
        this.field8153 = arg3;
        this.field8161.method2554(36, 126);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3248(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class180("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field8158 = new class180("Continue", "Weiter", "Continuer", "Continuar");
        field8162 = new class180("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");
    }
}
