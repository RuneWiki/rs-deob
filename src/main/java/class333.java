import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class333 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lho;")
    public static class103 field4403 = new class103(78, -1);

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lsr;")
    public static class167 field4405 = new class167();

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field4406 = 205;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "J")
    public static long field4408;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Z")
    public static boolean field4409;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lnf;")
    public static class409 field4407;

    static {
        new class305("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field4408 = -1L;
        field4409 = true;
        field4411 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)[Lhk;", line = 3)
    public static final class68[] method1942(byte arg0) {
        field4402++;
        int var1 = 112 % ((arg0 + 62) / 39);
        return new class68[] { class459.field6847, class459.field6849, class459.field6850, class459.field6851, class459.field6852, class459.field6853, class459.field6854, class459.field6855, class459.field6856, class459.field6857, class459.field6858, class459.field6859 };
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method1943(boolean arg0) {
        field4404++;
        int var1 = class527.field7740 * 128 + 64;
        int var2 = class168.field2177 * 128 + 64;
        int var3 = class470.method2868(124, class210.field2808, var1, var2) - class43.field462;
        if (class199.field2579 < 100) {
            if (var1 > class238.field3171) {
                class238.field3171 += (var1 - class238.field3171) * class199.field2579 / 1000 + class456.field6808;
                if (class238.field3171 > var1) {
                    class238.field3171 = var1;
                }
            }
            if (class238.field3171 > var1) {
                class238.field3171 -= (class238.field3171 - var1) * class199.field2579 / 1000 + class456.field6808;
                if (class238.field3171 < var1) {
                    class238.field3171 = var1;
                }
            }
            if (class267.field3572 < var3) {
                class267.field3572 += (var3 - class267.field3572) * class199.field2579 / 1000 + class456.field6808;
                if (var3 < class267.field3572) {
                    class267.field3572 = var3;
                }
            }
            if (class139.field1857 < var2) {
                class139.field1857 += (var2 - class139.field1857) * class199.field2579 / 1000 + class456.field6808;
                if (var2 < class139.field1857) {
                    class139.field1857 = var2;
                }
            }
            if (class267.field3572 > var3) {
                class267.field3572 -= (class267.field3572 - var3) * class199.field2579 / 1000 + class456.field6808;
                if (class267.field3572 < var3) {
                    class267.field3572 = var3;
                }
            }
            if (var2 < class139.field1857) {
                class139.field1857 -= class456.field6808 + ((class139.field1857 - var2) * class199.field2579 / 1000);
                if (class139.field1857 < var2) {
                    class139.field1857 = var2;
                }
            }
        } else {
            class139.field1857 = class168.field2177 * 128 + 64;
            class238.field3171 = class527.field7740 * 128 + 64;
            class267.field3572 = class470.method2868(22, class210.field2808, class238.field3171, class139.field1857) - class43.field462;
        }
        int var4 = class95.field1149 * 128 + 64;
        int var5 = class15.field158 * 128 + 64;
        int var6 = class470.method2868(-33, class210.field2808, var4, var5) - class135.field1791;
        int var7 = var4 - class238.field3171;
        int var8 = var6 - class267.field3572;
        int var9 = var5 - class139.field1857;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class65.field739 < var11) {
            class65.field739 += class316.field4230 + ((var11 - class65.field739 >> 3) * class275.field3655 / 1000) << 3;
            if (var11 < class65.field739) {
                class65.field739 = var11;
            }
        }
        if (class65.field739 > var11) {
            class65.field739 -= (class65.field739 - var11 >> 3) * class275.field3655 / 1000 + class316.field4230 << 3;
            if (var11 > class65.field739) {
                class65.field739 = var11;
            }
        }
        int var13 = var12 - class9.field110;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class9.field110 += class316.field4230 + (class275.field3655 * var14 / 1000) << 3;
            class9.field110 &= 0x3FFF;
        }
        if (var14 < 0) {
            class9.field110 -= class316.field4230 + (-var14 * class275.field3655 / 1000) << 3;
            class9.field110 &= 0x3FFF;
        }
        int var15 = var12 - class9.field110;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class9.field110 = var12;
        }
        if (!arg0) {
            field4406 = -11;
        }
        class230.field3104 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 173)
    public static void method1944(byte arg0) {
        field4407 = null;
        if (arg0 == 5) {
            field4405 = null;
            field4403 = null;
        }
    }
}
