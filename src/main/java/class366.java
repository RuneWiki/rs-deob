import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class366 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lnj;")
    private class162 field5363 = new class162(64);

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lnj;")
    public class162 field5376 = new class162(50);

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lnj;")
    public class162 field5377 = new class162(5);

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Z")
    public boolean field5369;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lmg;")
    public class101 field5362;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lmg;")
    private class101 field5371;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field5364 = 0;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "[Z")
    public static boolean[] field5375 = new boolean[100];

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public int field5378;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lug;")
    public static class393 field5366;

    static {
        new class466("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V", line = 6)
    public final void method2204(int arg0, byte arg1) {
        this.field5378 = arg0;
        field5373++;
        class162 var3 = this.field5376;
        synchronized (this.field5376) {
            if (arg1 != -92) {
                return;
            }
            this.field5376.method1068(arg1 ^ 0xFFFFFFA4);
        }
        class162 var4 = this.field5377;
        synchronized (this.field5377) {
            this.field5377.method1068(0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V", line = 23)
    public final void method2205(int arg0, int arg1) {
        class162 var3 = this.field5363;
        synchronized (this.field5363) {
            int var4 = 121 % ((4 - arg0) / 48);
            this.field5363.method1065((byte) -95, arg1);
        }
        field5372++;
        class162 var5 = this.field5376;
        synchronized (this.field5376) {
            this.field5376.method1065((byte) -95, arg1);
        }
        class162 var6 = this.field5377;
        synchronized (this.field5377) {
            this.field5377.method1065((byte) -95, arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 46)
    public static void method2206(int arg0) {
        field5375 = null;
        if (arg0 != 15579) {
            field5364 = 111;
        }
        field5366 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 60)
    public final void method2207(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field5374++;
        class162 var2 = this.field5376;
        synchronized (this.field5376) {
            this.field5376.method1068(0);
        }
        class162 var3 = this.field5377;
        synchronized (this.field5377) {
            this.field5377.method1068(0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)Lej;", line = 76)
    public final class79 method2208(int arg0, int arg1) {
        field5365++;
        class162 var3 = this.field5363;
        class79 var4;
        synchronized (this.field5363) {
            var4 = (class79) this.field5363.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5371.method727(class361.method2169(arg0, 1006), class339.method2015(1, arg0), -84);
        class79 var6 = new class79();
        if (arg1 > -67) {
            return null;
        }
        var6.field1214 = this;
        var6.field1146 = arg0;
        if (var5 != null) {
            var6.method635(new class391(var5), (byte) -63);
        }
        var6.method642(0);
        class162 var7 = this.field5363;
        synchronized (this.field5363) {
            this.field5363.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 108)
    public final void method2209(int arg0) {
        class162 var2 = this.field5363;
        synchronized (this.field5363) {
            this.field5363.method1066(arg0 ^ 0xFFFFF00F);
        }
        field5370++;
        if (arg0 != -1) {
            return;
        }
        class162 var3 = this.field5376;
        synchronized (this.field5376) {
            this.field5376.method1066(4080);
        }
        class162 var4 = this.field5377;
        synchronized (this.field5377) {
            this.field5377.method1066(4080);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lal;IZLmg;Lmg;)V", line = 185)
    public class366(class66 arg0, int arg1, boolean arg2, class101 arg3, class101 arg4) {
        this.field5369 = arg2;
        this.field5362 = arg4;
        this.field5371 = arg3;
        if (this.field5371 != null) {
            int var6 = this.field5371.method746(71) - 1;
            this.field5371.method753(var6, -118);
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V", line = 139)
    public final void method2210(int arg0) {
        class162 var2 = this.field5363;
        synchronized (this.field5363) {
            this.field5363.method1068(arg0 ^ arg0);
        }
        field5367++;
        class162 var3 = this.field5376;
        synchronized (this.field5376) {
            this.field5376.method1068(0);
        }
        class162 var4 = this.field5377;
        synchronized (this.field5377) {
            this.field5377.method1068(0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V", line = 164)
    public final void method2211(boolean arg0, byte arg1) {
        field5368++;
        if (this.field5369 != arg0) {
            this.field5369 = arg0;
            int var3 = -55 % ((-arg1 - 74) / 32);
            this.method2210(100);
        }
    }
}
