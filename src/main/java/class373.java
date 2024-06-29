import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class373 {

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Z")
    public boolean field5551 = false;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public int field5548;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public int field5556;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lrt;")
    public class154 field5554;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lul;")
    public static class406 field5555;

    static {
        new class234("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILya;Z)Ll;", line = 7)
    public final class16 method2333(int arg0, int arg1, class38 arg2, boolean arg3) {
        field5549++;
        long var5 = (long) (arg2.field510 << 19 | (arg3 ? 262144 : 0) | arg0 << 16 | this.field5556);
        class16 var7 = (class16) this.field5554.field2292.method87(var5, -2062335807);
        if (var7 != null) {
            return var7;
        } else if (this.field5554.field2284.method2556((byte) 21, this.field5556)) {
            if (arg1 != -1545209261) {
                method2338(-90);
            }
            class84 var8 = class84.method702(this.field5554.field2284, this.field5556, 0);
            if (var8 != null) {
                var8.field1212 = var8.field1205 = var8.field1206 = var8.field1209 = 0;
                if (arg3) {
                    var8.method708();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method704();
                }
            }
            class16 var10 = arg2.method345(var8, true);
            if (var10 != null) {
                this.field5554.field2292.method84(var5, var10, (byte) 27);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Z", line = 52)
    public final boolean method2334(int arg0) {
        field5553++;
        return arg0 == -2 ? this.field5554.field2284.method2556((byte) 21, this.field5556) : true;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILhp;)V", line = 65)
    public final void method2335(int arg0, class217 arg1) {
        while (true) {
            int var3 = arg1.method1515((byte) 123);
            if (var3 == 0) {
                field5550++;
                if (arg0 < 65) {
                    this.method2334(123);
                    return;
                }
                return;
            }
            this.method2337(var3, arg1, -13733);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V", line = 92)
    public static final void method2336(int arg0, byte arg1) {
        if (arg1 != -3) {
            method2336(41, (byte) -42);
        }
        field5546++;
        if (class60.field718 == 0) {
            class448.field6563.method1900(arg0, (byte) -128);
        } else {
            class326.field4909 = arg0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILhp;I)V", line = 110)
    private final void method2337(int arg0, class217 arg1, int arg2) {
        if (arg2 != -13733) {
            return;
        }
        if (arg0 == 1) {
            this.field5556 = arg1.method1511(76);
        } else if (arg0 == 2) {
            this.field5548 = arg1.method1548(31529);
        } else if (arg0 == 3) {
            this.field5551 = true;
        } else if (arg0 == 4) {
            this.field5556 = -1;
        }
        field5547++;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 139)
    public static final void method2338(int arg0) {
        if (arg0 != 9535) {
            field5557 = -11;
        }
        field5545++;
        class398.field5950 = 0;
        int var1 = (class398.field5947.field5837 >> 7) + class390.field5842;
        int var2 = (class398.field5947.field5833 >> 7) + class176.field2613;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class398.field5950 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class398.field5950 = 1;
        }
        if (class398.field5950 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class398.field5950 = 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 173)
    public static void method2339(boolean arg0) {
        field5555 = null;
        if (arg0) {
            method2339(false);
        }
    }
}
