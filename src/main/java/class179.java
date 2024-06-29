import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class179 {

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
    public boolean field2287 = false;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lad;")
    private class11 field2283 = new class11(64);

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "Lad;")
    public class11 field2304 = new class11(500);

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "Lad;")
    public class11 field2306 = new class11(30);

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "Lad;")
    public class11 field2307 = new class11(50);

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Ldn;")
    private class201 field2302;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "Z")
    public boolean field2300;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "Ldn;")
    public class201 field2289;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "Lhb;")
    public static class250 field2296;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "Ljd;")
    public static class408 field2303;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "Lmc;")
    public static class312 field2299;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "[Loh;")
    public static class448[] field2305;

    static {
        new class169("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field2296 = new class250(33, 11);
        new class169("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2303 = new class408(7, 0, 1, 1);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 4)
    public final void method1155(byte arg0) {
        class11 var2 = this.field2283;
        synchronized (this.field2283) {
            this.field2283.method84(-55);
            if (arg0 >= -124) {
                field2299 = null;
            }
        }
        field2294++;
        class11 var3 = this.field2304;
        synchronized (this.field2304) {
            this.field2304.method84(88);
        }
        class11 var4 = this.field2306;
        synchronized (this.field2306) {
            this.field2306.method84(-124);
        }
        class11 var5 = this.field2307;
        synchronized (this.field2307) {
            this.field2307.method84(110);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V", line = 30)
    public static final void method1156(int arg0, int arg1, int arg2) {
        field2284++;
        if (class139.field1855 == 1) {
            class182.method1204(0, class289.field3699, arg0, arg2);
        } else if (class139.field1855 == 2) {
            class258.method1616((byte) 101, arg2, arg0);
        }
        class289.field3699 = null;
        if (arg1 == 33) {
            class139.field1855 = 0;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V", line = 50)
    public final void method1157(int arg0, int arg1) {
        if (arg0 != -22344) {
            this.field2300 = true;
        }
        this.field2308 = arg1;
        field2297++;
        class11 var3 = this.field2304;
        synchronized (this.field2304) {
            this.field2304.method90((byte) -27);
        }
        class11 var4 = this.field2306;
        synchronized (this.field2306) {
            this.field2306.method90((byte) -27);
        }
        class11 var5 = this.field2307;
        synchronized (this.field2307) {
            this.field2307.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZZ)V", line = 72)
    public final void method1158(boolean arg0, boolean arg1) {
        field2285++;
        if (arg0 && arg1 != this.field2300) {
            this.field2300 = arg1;
            this.method1159(17);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 91)
    public final void method1159(int arg0) {
        class11 var2 = this.field2283;
        synchronized (this.field2283) {
            this.field2283.method90((byte) -27);
        }
        int var3 = -72 % ((-arg0 - 53) / 61);
        field2290++;
        class11 var4 = this.field2304;
        synchronized (this.field2304) {
            this.field2304.method90((byte) -27);
        }
        class11 var5 = this.field2306;
        synchronized (this.field2306) {
            this.field2306.method90((byte) -27);
        }
        class11 var6 = this.field2307;
        synchronized (this.field2307) {
            this.field2307.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 112)
    public static final int method1160(int arg0, Random arg1, int arg2) {
        field2298++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class158.method1064(arg2, (byte) -37)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = arg0 - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class274.method1680(var4, arg2, 342124927);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 141)
    public static void method1161(int arg0) {
        if (arg0 != 50) {
            method1156(54, 16, 88);
        }
        field2305 = null;
        field2299 = null;
        field2303 = null;
        field2296 = null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V", line = 154)
    public static final void method1162(byte arg0) {
        if (arg0 != -7) {
            method1169((byte) -95, -37);
        }
        field2292++;
        class117.field1641.method2241(true);
        class181.field2362 = null;
        class520.field7691 = 1;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLbt;)Lsd;", line = 170)
    public static final class263 method1163(boolean arg0, class88 arg1) {
        field2301++;
        if (arg0) {
            field2305 = null;
        }
        return new class263(arg1.method603((byte) -57), arg1.method603((byte) 110), arg1.method603((byte) 114), arg1.method603((byte) -101), arg1.method603((byte) -35), arg1.method603((byte) 116), arg1.method603((byte) -122), arg1.method603((byte) -80), arg1.method584(255), arg1.method617(2));
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)Ljt;", line = 184)
    public final class402 method1164(int arg0, int arg1) {
        field2286++;
        class11 var3 = this.field2283;
        class402 var4;
        synchronized (this.field2283) {
            var4 = (class402) this.field2283.method78((long) arg0, (byte) -92);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2302.method1313((byte) -112, class316.method1878(arg0, 200), class337.method1992(arg0, false));
        class402 var6 = new class402();
        var6.field5377 = arg0;
        var6.field5367 = this;
        if (var5 != null) {
            var6.method2390(new class88(var5), -56);
        }
        var6.method2395(arg1);
        if (!this.field2300 && var6.field5373) {
            var6.field5360 = null;
            var6.field5375 = null;
        }
        if (var6.field5384) {
            var6.field5400 = 0;
            var6.field5376 = false;
        }
        class11 var7 = this.field2283;
        synchronized (this.field2283) {
            this.field2283.method88((long) arg0, 103, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)V", line = 227)
    public final void method1165(int arg0, int arg1) {
        if (arg0 != 1370821792) {
            this.method1164(97, 64);
        }
        this.field2283 = new class11(arg1);
        field2295++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)V", line = 257)
    public final void method1166(int arg0, boolean arg1) {
        class11 var3 = this.field2283;
        synchronized (this.field2283) {
            this.field2283.method80(-119, arg0);
            if (arg1) {
                method1156(-125, -58, -21);
            }
        }
        field2288++;
        class11 var4 = this.field2304;
        synchronized (this.field2304) {
            this.field2304.method80(-126, arg0);
        }
        class11 var5 = this.field2306;
        synchronized (this.field2306) {
            this.field2306.method80(-35, arg0);
        }
        class11 var6 = this.field2307;
        synchronized (this.field2307) {
            this.field2307.method80(-47, arg0);
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lgt;IZLdn;Ldn;)V", line = 342)
    public class179(class65 arg0, int arg1, boolean arg2, class201 arg3, class201 arg4) {
        this.field2302 = arg3;
        this.field2300 = arg2;
        this.field2289 = arg4;
        if (this.field2302 != null) {
            int var6 = this.field2302.method1309((byte) 31) - 1;
            this.field2302.method1302(-98, var6);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILdn;Lm;)V", line = 285)
    public static final void method1167(int arg0, class201 arg1, class79 arg2) {
        class217.field2780 = arg1;
        class362.field4668 = arg2;
        field2293++;
        if (arg0 != -2) {
            method1160(-91, null, 82);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V", line = 297)
    public final void method1168(boolean arg0, int arg1) {
        field2291++;
        if (this.field2287 != arg0) {
            int var3 = 41 % ((arg1 + 48) / 56);
            this.field2287 = arg0;
            this.method1159(-124);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)I", line = 311)
    public static final int method1169(byte arg0, int arg1) {
        field2282++;
        int var2 = -47 % ((-arg0 - 37) / 58);
        return arg1 & 0xFF;
    }
}
