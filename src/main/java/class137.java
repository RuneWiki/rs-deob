import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class137 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[I")
    public static int[] field2181 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "F")
    public static float field2183;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "F")
    public static float field2184;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2182;

    static {
        new class342("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIBLvj;)Lmk;", line = 7)
    public static final class39 method1016(int arg0, int arg1, int arg2, int arg3, byte arg4, class303 arg5) {
        if (arg4 != -62) {
            method1022(null, (byte) -101);
        }
        field2182++;
        if (!arg5.field4583 && (!class354.method2243(0, arg2) || !class354.method2243(arg4 ^ 0xFFFFFFC2, arg0))) {
            return arg5.field4538 ? new class39(arg5, 34037, arg3, arg1, arg2, arg0, true) : new class39(arg5, arg3, arg1, arg2, arg0, class51.method464(1905326856, arg2), class51.method464(1905326856, arg0), true);
        } else {
            return new class39(arg5, 3553, arg3, arg1, arg2, arg0, true);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 35)
    public static void method1021(int arg0) {
        field2181 = null;
        if (arg0 != -29314) {
            method1016(-76, 127, 2, 91, (byte) -90, null);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 45)
    public static final void method1022(String arg0, byte arg1) {
        field2179++;
        if (!class99.field1638) {
            return;
        }
        boolean var2 = false;
        int var3 = class409.field6135;
        int[] var4 = class358.field5445;
        int var5 = 0;
        if (arg1 != 20) {
            field2184 = 1.0730239F;
        }
        while (var5 < var3) {
            class256 var6 = class183.field2747[var4[var5]];
            if (var6 != null && class139.field2224 != var6 && var6.field3684 != null && var6.field3684.equalsIgnoreCase(arg0)) {
                class281.field4022++;
                class28.method321(class359.field5450, arg1 ^ 0xFFFFEC63);
                class410.field6141.method1095(-52, class347.field5187);
                class410.field6141.method1068((byte) -65, class63.field1086);
                class410.field6141.method1068((byte) -31, var4[var5]);
                class410.field6141.method1117(class383.field5790, (byte) 12);
                class410.field6141.method1105(arg1 ^ 0x2F3E, 0);
                class222.method1475(true, var6.field7694[0], 0, var6.method1654(arg1 ^ 0x78), var6.method1654(96), -2, true, var6.field7692[0], 0);
                var2 = true;
                break;
            }
            var5++;
        }
        if (!var2) {
            class101.method754(class510.field7523.method2180(client.field2870, 29491) + arg0, arg1 ^ 0x14);
        }
        if (class99.field1638) {
            class227.method1486(0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)Z", line = 94)
    public final boolean method1023(int arg0) {
        field2180++;
        if (arg0 < 27) {
            field2181 = null;
        }
        return this.method1025(-75) || this.method1018(-87) || this.method1026(3553);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)Lji;")
    public abstract class432 method1015(boolean arg0);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public abstract void method1017(byte arg0);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
    public abstract boolean method1018(int arg0);

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)I")
    public abstract int method1019(byte arg0);

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
    public abstract void method1020(byte arg0);

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)I")
    public abstract int method1024(boolean arg0);

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Z")
    public abstract boolean method1025(int arg0);

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)Z")
    public abstract boolean method1026(int arg0);
}
