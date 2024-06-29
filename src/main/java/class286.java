import java.awt.Canvas;
import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class286 extends class5 {

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "Lof;")
    public static class446 field4189;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "Ljava/util/Random;")
    public static Random field4197;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public int field4182;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public int field4188;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public int field4190;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public int field4191;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public int field4194;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "Ljava/awt/Frame;")
    public static Frame field4195;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wl", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field4198;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1841(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class446(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field4189 = new class446("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");
        field4197 = new Random();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lbp;", line = 4)
    public static final class267 method1836(Canvas arg0, byte arg1) {
        field4178++;
        try {
            Class var2 = Class.forName("hu");
            class267 var3 = (class267) var2.getDeclaredConstructor().newInstance();
            if (arg1 >= -21) {
                field4197 = null;
            }
            var3.method592(351943631, arg0);
            return var3;
        } catch (Throwable var5) {
            class414 var4 = new class414();
            var4.method592(351943631, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 35)
    public static void method1837(boolean arg0) {
        field4197 = null;
        field4195 = null;
        field4189 = null;
        if (!arg0) {
            field4197 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IC)B", line = 47)
    public static final byte method1838(int arg0, char arg1) {
        field4193++;
        if (arg0 != 1) {
            field4189 = null;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLqa;I)Lka;", line = 185)
    public final class334 method1839(byte arg0, class165 arg1, int arg2) {
        field4179++;
        if (arg0 != 24) {
            this.field4194 = 31;
        }
        int var4 = class23.field334[this.field4184];
        if (var4 == 0) {
            class535 var11 = class309.method1938(this.field4192, this.field4186, this.field4177);
            if (var11 instanceof class109) {
                class109 var12 = (class109) var11;
                if (var12.field1531 != null) {
                    return ((class68) var12.field1531).method337(arg2, arg1, 14221);
                }
            }
        } else if (var4 == 1) {
            class222 var5 = class307.method1926(this.field4192, this.field4186, this.field4177);
            if (var5 instanceof class322) {
                class322 var6 = (class322) var5;
                if (var6.field4660 != null) {
                    return ((class68) var6.field4660).method337(arg2, arg1, 14221);
                }
            }
        } else if (var4 == 2) {
            class140 var9 = class172.method1169(this.field4192, this.field4186, this.field4177, field4198 == null ? (field4198 = method1841("jt")) : field4198);
            if (var9 instanceof class200) {
                class200 var10 = (class200) var9;
                if (var10.field2690 != null) {
                    return ((class68) var10.field2690).method337(arg2, arg1, 14221);
                }
            }
        } else if (var4 == 3) {
            class394 var7 = class471.method2823(this.field4192, this.field4186, this.field4177);
            if (var7 instanceof class391) {
                class391 var8 = (class391) var7;
                if (var8.field5964 != null) {
                    return ((class68) var8.field5964).method337(arg2, arg1, 14221);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Z", line = 267)
    public static final boolean method1840(int arg0, int arg1, int arg2) {
        int var3 = class162.field2116[arg0][arg1][arg2];
        if (-class121.field1654 == var3) {
            return false;
        } else if (class121.field1654 == var3) {
            return true;
        } else {
            int var4 = arg1 << class10.field179;
            int var5 = arg2 << class10.field179;
            if (class127.method869(var4 + 1, class306.field4447[arg0].method222(arg1, arg2), var5 + 1) && class127.method869(class264.field3697 + var4 - 1, class306.field4447[arg0].method222(arg1 + 1, arg2), var5 + 1) && class127.method869(class264.field3697 + var4 - 1, class306.field4447[arg0].method222(arg1 + 1, arg2 + 1), class264.field3697 + var5 - 1) && class127.method869(var4 + 1, class306.field4447[arg0].method222(arg1, arg2 + 1), class264.field3697 + var5 - 1) && class127.method869(class251.field3501 + var4, class306.field4447[arg0].method222(arg1, arg2), var5 + 1) && class127.method869(class264.field3697 + var4 - 1, class306.field4447[arg0].method222(arg1 + 1, arg2), class251.field3501 + var5) && class127.method869(class251.field3501 + var4, class306.field4447[arg0].method222(arg1, arg2 + 1), class264.field3697 + var5 - 1) && class127.method869(class264.field3697 + var4 - 1, class306.field4447[arg0].method222(arg1, arg2), class251.field3501 + var5) && class127.method869(class251.field3501 + var4, class306.field4447[arg0].method222(arg1, arg2), class251.field3501 + var5)) {
                class162.field2116[arg0][arg1][arg2] = class121.field1654;
                return true;
            } else {
                class162.field2116[arg0][arg1][arg2] = -class121.field1654;
                return false;
            }
        }
    }
}
