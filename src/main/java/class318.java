import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class318 {

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field4090 = 8;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field4084 = 16777215;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lpi;")
    public static class340 field4094 = new class340(29, -1);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Loi;")
    public static class169 field4095 = new class169("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Loi;")
    public static class169 field4096 = new class169("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Loi;")
    public static class169 field4097 = new class169("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field4099 = -1;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "F")
    public static float field4098;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field4089;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Z")
    public boolean field4085;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 5)
    public static void method1894(int arg0) {
        field4097 = null;
        field4095 = null;
        if (arg0 == -6) {
            field4094 = null;
            field4096 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBLbt;)V", line = 23)
    private final void method1895(int arg0, byte arg1, class88 arg2) {
        if (arg0 == 1) {
            this.field4090 = arg2.method568((byte) 110);
        } else if (arg0 == 2) {
            this.field4085 = true;
        } else if (arg0 == 3) {
            this.field4092 = arg2.method603((byte) -97);
            this.field4087 = arg2.method603((byte) -47);
            this.field4083 = arg2.method603((byte) 125);
        } else if (arg0 == 4) {
            this.field4091 = arg2.method617(2);
        } else if (arg0 == 5) {
            this.field4089 = arg2.method568((byte) 110);
        } else if (arg0 == 6) {
            this.field4084 = arg2.method584(255);
        }
        int var4 = 110 / ((-arg1 - 38) / 57);
        field4088++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lbt;I)V", line = 72)
    public final void method1896(class88 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method617(2);
            if (var3 == 0) {
                if (arg1 != 2732) {
                    this.field4083 = -50;
                }
                field4093++;
                return;
            }
            this.method1895(var3, (byte) -128, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 105)
    public static final void method1897(boolean arg0) {
        if (!arg0) {
            field4096 = null;
        }
        class41.method262();
        field4086++;
    }
}
