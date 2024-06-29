import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class203 {

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "Z")
    public boolean field2821 = false;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field2813 = 104;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Lhp;")
    public class205 field2816;

    static {
        new class194("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1249(int arg0, int arg1, int arg2) {
        field2819++;
        if (arg2 != 0) {
            method1255(1, null);
        }
        return class455.method2656((byte) -85, arg0, arg1) | (arg0 & 0x800) != 0 || class56.method419(arg1, true, arg0);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Leq;IIZ)Lqg;", line = 18)
    public final class307 method1250(class134 arg0, int arg1, int arg2, boolean arg3) {
        field2815++;
        long var5 = (long) (arg2 << 16 | this.field2817 | (arg3 ? 262144 : 0) | arg0.field1706 << 19);
        class307 var7 = (class307) this.field2816.field2837.method40(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field2816.field2832.method1442(this.field2817, (byte) -119)) {
            class328 var8 = class328.method1978(this.field2816.field2832, this.field2817, arg1);
            if (var8 != null) {
                var8.field4783 = var8.field4779 = var8.field4777 = var8.field4784 = 0;
                if (arg3) {
                    var8.method1979();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1972();
                }
            }
            class307 var10 = arg0.method804(var8, true);
            if (var10 != null) {
                this.field2816.field2837.method36(-20960, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILae;I)V", line = 62)
    private final void method1251(int arg0, class156 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2817 = arg1.method993((byte) -124);
        } else if (arg0 == 2) {
            this.field2818 = arg1.method943(1295851312);
        } else if (arg0 == 3) {
            this.field2821 = true;
        } else if (arg0 == 4) {
            this.field2817 = -1;
        }
        if (arg2 != 2) {
            this.method1250(null, -108, -56, true);
        }
        field2814++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILae;)V", line = 93)
    public final void method1252(int arg0, class156 arg1) {
        while (true) {
            int var3 = arg1.method941((byte) 125);
            if (var3 == 0) {
                field2822++;
                if (arg0 != -1) {
                    this.method1251(14, null, 126);
                    return;
                }
                return;
            }
            this.method1251(var3, arg1, arg0 ^ 0xFFFFFFFD);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)Z", line = 115)
    public final boolean method1253(boolean arg0) {
        field2811++;
        if (!arg0) {
            this.method1250(null, -1, 120, false);
        }
        return this.field2816.field2832.method1442(this.field2817, (byte) -117);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 127)
    public static final void method1254(int arg0) {
        field2820++;
        class16 var1 = (class16) class286.field4086.method2096(arg0 - 21402);
        if (arg0 != 2) {
            field2813 = -110;
        }
        while (var1 != null) {
            class482 var2 = var1.field234;
            if (class355.field5121 != var2.field2956 || class263.field3748 > var2.field6956) {
                var1.method536(false);
                var2.method2808((byte) -127);
            } else if (var2.field6957 <= class263.field3748) {
                if (var2.field6982 > 0) {
                    class139 var3 = class504.field7697[var2.field6982 - 1];
                    if (var3 != null && var3.field2959 >= 0 && var3.field2959 < (class362.field5442 * 128) && var3.field2966 >= 0 && var3.field2966 < (field2813 * 128)) {
                        var2.method2804(class263.field3748, false, class103.method620(var2.field2956, var3.field2966, (byte) 20, var3.field2959) - var2.field6950, var3.field2966, var3.field2959);
                    }
                }
                if (var2.field6982 < 0) {
                    int var4 = -var2.field6982 - 1;
                    class313 var5;
                    if (class156.field2047 == var4) {
                        var5 = class415.field6145;
                    } else {
                        var5 = class262.field3742[var4];
                    }
                    if (var5 != null && var5.field2959 >= 0 && (class362.field5442 * 128) > var5.field2959 && var5.field2966 >= 0 && field2813 * 128 > var5.field2966) {
                        var2.method2804(class263.field3748, false, class103.method620(var2.field2956, var5.field2966, (byte) 20, var5.field2959) - var2.field6950, var5.field2966, var5.field2959);
                    }
                }
                var2.method2807(class91.field1245, 0);
                class76.method503(var2, true);
            }
            var1 = (class16) class286.field4086.method2084((byte) 19);
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(ILae;)Ln;", line = 185)
    public static final class15 method1255(int arg0, class156 arg1) {
        int var2 = 102 / ((46 - arg0) / 33);
        field2812++;
        return new class15(arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method936((byte) -96), arg1.method943(1295851312), arg1.method941((byte) 127));
    }
}
