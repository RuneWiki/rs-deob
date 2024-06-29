import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class19 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lfd;")
    public class111 field210 = null;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lfd;")
    public class111 field211 = null;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Lfd;")
    public class111 field207 = null;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[Lcd;")
    public class65[] field213 = null;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "[Lcd;")
    public class65[] field215 = null;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Z")
    public boolean field212;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)I")
    public static int method118(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BJ)V")
    public static final void method119(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field209++;
        if (arg0 >= -30) {
            method120(118, -32);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Lub;")
    public static final class305 method120(int arg0, int arg1) {
        field208++;
        if (arg1 == 0) {
            return new class224();
        } else if (arg1 == 1) {
            return new class110();
        } else if (arg1 == 2) {
            return new class51();
        } else if (arg1 == 3) {
            return new class272();
        } else if (arg1 == 4) {
            return new class398();
        } else if (arg1 == 5) {
            return new class193();
        } else if (arg1 == 6) {
            return new class432();
        } else if (arg1 == 7) {
            return new class206();
        } else if (arg1 == 8) {
            return new class4();
        } else if (arg1 == 9) {
            return new class430();
        } else if (arg1 == 10) {
            return new class496();
        } else if (arg1 == 11) {
            return new class89();
        } else if (arg1 == 12) {
            return new class85();
        } else if (arg1 == 13) {
            return new class447();
        } else if (arg1 == 14) {
            return new class487();
        } else if (arg1 == 15) {
            return new class301();
        } else if (arg1 == 16) {
            return new class96();
        } else if (arg1 == 17) {
            return new class490();
        } else if (arg1 == 18) {
            return new class129();
        } else if (arg1 == 19) {
            return new class365();
        } else if (arg1 == 20) {
            return new class256();
        } else if (arg1 == 21) {
            return new class251();
        } else if (arg1 == 22) {
            return new class514();
        } else if (arg1 == 23) {
            return new class397();
        } else if (arg1 == 24) {
            return new class338();
        } else if (arg1 == 25) {
            return new class183();
        } else if (arg1 == 26) {
            return new class386();
        } else if (arg1 == 27) {
            return new class3();
        } else if (arg1 == 28) {
            return new class438();
        } else if (arg1 == 29) {
            return new class532();
        } else if (arg1 == 30) {
            return new class12();
        } else if (arg1 == 31) {
            return new class298();
        } else if (arg1 == 32) {
            return new class528();
        } else if (arg1 == 33) {
            return new class324();
        } else if (arg1 == 34) {
            return new class47();
        } else if (arg1 == 35) {
            return new class367();
        } else if (arg1 == 36) {
            return new class540();
        } else if (arg1 == 37) {
            return new class531();
        } else if (arg1 == 38) {
            return new class433();
        } else if (arg1 == 39) {
            return new class436();
        } else {
            if (arg0 != 10) {
                method119((byte) -36, -13L);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ltt;)V")
    public class19(class249 arg0) {
        this.field212 = arg0.field4039;
        class12.method71(5819, arg0);
        if (this.field212) {
            byte[] var6 = class315.method2093((byte) 96, false, class372.field5523);
            this.field210 = new class111(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class315.method2093((byte) -120, false, class182.field2787);
            this.field211 = new class111(arg0, 6410, 128, 128, 16, var7, 6410);
            class159 var8 = arg0.field3924;
            if (var8.method1150(35632)) {
                byte[] var9 = class315.method2093((byte) -47, false, class288.field4479);
                this.field207 = new class111(arg0, 6408, 128, 128, 16);
                class111 var10 = new class111(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method1146(0, 2.0F, this.field207, var10)) {
                    this.field207.method1207(1);
                } else {
                    this.field207.method1201((byte) 100);
                    this.field207 = null;
                }
                var10.method1201((byte) 112);
            }
        } else {
            this.field213 = new class65[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class224.method1545(var2 * 2 * 128 * 128, 32768, 72, class372.field5523);
                this.field213[var2] = new class65(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field215 = new class65[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class224.method1545(var3 * 128 * 2 * 128, 32768, -74, class182.field2787);
                this.field215[var3] = new class65(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    static {
        new class179(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field214 = 1403;
        new class179(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }
}
