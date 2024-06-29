import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class31 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field439 = -1;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field445 = 128;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public int field441 = 16;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
    public boolean field447 = false;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public int field451 = 8;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Z")
    public boolean field442 = true;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public int field448 = 1190717;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public int field440 = 0;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public int field444 = -1;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Z")
    public boolean field453 = true;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field443 = -1;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[I")
    public static int[] field452 = new int[14];

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V", line = 9)
    public static final void method214() {
        GL var0 = class42.field627;
        var0.glDisableClientState(32886);
        class42.method283(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class42.method279();
        for (int var1 = 0; var1 < class307.field4899[0].length; var1++) {
            class299 var2 = class307.field4899[0][var1];
            if (var2.field4810 >= 0 && class27.method170((byte) 55, class153.field2439.method776(var2.field4810, (byte) 42))) {
                var0.glColor4fv(class182.method1430(3, var2.field4823), 0);
                float var3 = 201.5F - (var2.field4797 ? 1.0F : 0.5F);
                var2.method2141(class129.field2184, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class42.method287();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class42.method282();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Llf;", line = 49)
    public static final class260 method215(int arg0, int arg1) {
        field449++;
        class260 var2 = (class260) class159.field2538.method2329((byte) 107, (long) arg0);
        if (arg1 <= 88) {
            field443 = 80;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class118.field1992.method472(arg0, 102, 1);
        class260 var4 = new class260();
        var4.field4375 = arg0;
        if (var3 != null) {
            var4.method1985(new class227(var3), -2834);
        }
        var4.method1986((byte) 88);
        if (var4.field4365 == 2 && class214.field3437.method1268(92, (long) arg0) == null) {
            class214.field3437.method1273(1, (long) arg0, new class301(class131.field2227));
            class205.field3245[class131.field2227++] = var4;
        }
        class159.field2538.method2333((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILqm;)V", line = 87)
    private final void method216(int arg0, int arg1, int arg2, class227 arg3) {
        if (arg1 != 3072) {
            this.field439 = -31;
        }
        if (arg0 == 1) {
            this.field440 = class353.method2502(arg3.method1736(arg1 ^ 0xCFF), false);
        } else if (arg0 == 2) {
            this.field444 = arg3.method1720((byte) -74);
        } else if (arg0 == 3) {
            this.field444 = arg3.method1765(true);
            if (this.field444 == 65535) {
                this.field444 = -1;
            }
        } else if (arg0 == 5) {
            this.field453 = false;
        } else if (arg0 == 7) {
            this.field439 = class353.method2502(arg3.method1736(255), false);
        } else if (arg0 == 8) {
            class43.field658 = arg2;
        } else if (arg0 == 9) {
            this.field445 = arg3.method1765(true);
        } else if (arg0 == 10) {
            this.field442 = false;
        } else if (arg0 == 11) {
            this.field451 = arg3.method1720((byte) -66);
        } else if (arg0 == 12) {
            this.field447 = true;
        } else if (arg0 == 13) {
            this.field448 = arg3.method1736(255);
        } else if (arg0 == 14) {
            this.field441 = arg3.method1720((byte) -22);
        }
        field438++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILth;)Lsi;", line = 161)
    public static final class351 method217(byte arg0, int arg1, class57 arg2) {
        if (arg0 < 56) {
            return (class351) null;
        } else {
            field450++;
            return class45.method333((byte) -72, arg2, arg1) ? class272.method2039((byte) 70) : null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 199)
    public static void method218(int arg0) {
        field452 = null;
        if (arg0 != 3827) {
            method217((byte) 92, -72, (class57) null);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILqm;I)V", line = 217)
    public final void method219(int arg0, class227 arg1, int arg2) {
        int var4 = 3 / ((27 - arg0) / 53);
        while (true) {
            int var5 = arg1.method1720((byte) -64);
            if (var5 == 0) {
                field437++;
                return;
            }
            this.method216(var5, 3072, arg2, arg1);
        }
    }
}
