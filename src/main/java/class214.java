import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class214 {

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field3403;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field3396;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[Z")
    public static boolean[] field3394 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lma;")
    private static class5 field3404 = class12.method119("purple:", (byte) 114);

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lma;")
    public static class5 field3397 = field3404;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lma;")
    public static class5 field3399 = field3404;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lwj;")
    public static class153 field3406 = new class153(64);

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1409(int arg0) {
        class200.field3184.method1392(-3564);
        int var1 = class200.field3184.method1387(true, 8);
        field3398++;
        if (var1 < class129.field1940) {
            for (int var2 = var1; var2 < class129.field1940; var2++) {
                class249.field4128[class168.field2554++] = class73.field1153[var2];
            }
        }
        if (class129.field1940 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class129.field1940 = 0;
        if (arg0 >= -11) {
            method1412((byte) -27);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class73.field1153[var3];
            class177 var5 = class119.field1804[var4];
            int var6 = class200.field3184.method1387(true, 1);
            if (var6 == 0) {
                class73.field1153[class129.field1940++] = var4;
                var5.field217 = class50.field784;
            } else {
                int var7 = class200.field3184.method1387(true, 2);
                if (var7 == 0) {
                    class73.field1153[class129.field1940++] = var4;
                    var5.field217 = class50.field784;
                    class156.field2320[class287.field4838++] = var4;
                } else if (var7 == 1) {
                    class73.field1153[class129.field1940++] = var4;
                    var5.field217 = class50.field784;
                    int var11 = class200.field3184.method1387(true, 3);
                    var5.method120(-1, false, var11);
                    int var12 = class200.field3184.method1387(true, 1);
                    if (var12 == 1) {
                        class156.field2320[class287.field4838++] = var4;
                    }
                } else if (var7 == 2) {
                    class73.field1153[class129.field1940++] = var4;
                    var5.field217 = class50.field784;
                    int var8 = class200.field3184.method1387(true, 3);
                    var5.method120(-1, true, var8);
                    int var9 = class200.field3184.method1387(true, 3);
                    var5.method120(-1, true, var9);
                    int var10 = class200.field3184.method1387(true, 1);
                    if (var10 == 1) {
                        class156.field2320[class287.field4838++] = var4;
                    }
                } else if (var7 == 3) {
                    class249.field4128[class168.field2554++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 111)
    public static final void method1410(int arg0, int arg1) {
        if (arg1 < 51) {
            field3399 = (class5) null;
        }
        class106.field1568.method517(false, arg0);
        field3405++;
        class193.field2995.method517(false, arg0);
        class210.field3352.method517(false, arg0);
        class252.field4177.method517(false, arg0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 136)
    public static final int method1411(KeyEvent arg0, int arg1) {
        field3402++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg1 != -9758) {
            field3397 = (class5) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 155)
    public static void method1412(byte arg0) {
        field3394 = null;
        field3406 = null;
        field3397 = null;
        field3399 = null;
        field3404 = null;
        if (arg0 > -94) {
            method1411((KeyEvent) null, -35);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 170)
    public static final void method1413(int arg0) {
        if (arg0 < 114) {
            method1409(101);
        }
        field3407++;
        class240.field3982.method1586(63);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 186)
    public class214() {
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB[Leb;III)V", line = 202)
    public static final void method1414(boolean arg0, byte arg1, class253[] arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= 75) {
            field3394 = (boolean[]) null;
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class253 var7 = arg2[var6];
            if (var7 != null && var7.field4196 == arg5) {
                class11.method109(arg4, true, var7, arg0, arg3);
                class167.method1114(1, var7, arg4, arg3);
                if (var7.field4307 - var7.field4228 < var7.field4233) {
                    var7.field4233 = var7.field4307 - var7.field4228;
                }
                if (var7.field4243 > (var7.field4334 - var7.field4190)) {
                    var7.field4243 = var7.field4334 - var7.field4190;
                }
                if (var7.field4243 < 0) {
                    var7.field4243 = 0;
                }
                if (var7.field4233 < 0) {
                    var7.field4233 = 0;
                }
                if (var7.field4216 == 0) {
                    class171.method1134(arg0, -93, var7);
                }
            }
        }
        field3400++;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Llb;)V", line = 249)
    public class214(class214 arg0) {
        this.field3401 = arg0.field3401;
        this.field3395 = arg0.field3395;
        this.field3403 = arg0.field3403;
        this.field3396 = arg0.field3396;
    }
}
