import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class56 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
    public boolean field1388 = true;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lad;")
    public static class5 field1389 = class88.method674("gelb:", 20);

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lad;")
    public static class5 field1386 = class88.method674("backhmid1", -81);

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lad;")
    public static class5 field1390 = class88.method674("Hier klicken)1 um fortzufahren)3)3)3", -111);

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1398 = 0;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Loc;")
    public static class87 field1393 = new class87();

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Lad;")
    public static class5 field1402 = class88.method674(" zuerst von Ihrer Ignorieren)2Liste(Q", 93);

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lad;")
    private static class5 field1401 = class88.method674("and choose the (Wcreate account(W", -101);

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lad;")
    public static class5 field1403 = class88.method674("redstone3", -121);

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lad;")
    public static class5 field1400 = field1401;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lad;")
    private static class5 field1405 = class88.method674("green:", 67);

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lad;")
    public static class5 field1404 = field1405;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[I")
    public static int[] field1395;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[I")
    public static int[] field1397;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 29)
    public static void method455(boolean arg0) {
        field1405 = null;
        if (arg0) {
            return;
        }
        field1402 = null;
        field1389 = null;
        field1400 = null;
        field1390 = null;
        field1386 = null;
        field1395 = null;
        field1404 = null;
        field1393 = null;
        field1397 = null;
        field1403 = null;
        field1401 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 50)
    public static final void method456(int arg0) {
        class108.field2723.method101((byte) -109);
        field1383++;
        if (arg0 != 21782) {
            method456(113);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 72)
    public static final void method457(byte arg0) {
        field1396++;
        Object var1 = class118.field2945;
        synchronized (class118.field2945) {
            if (arg0 < -56) {
                if (class43.field1103 == 0) {
                    class25.field631.method13(5, new class48(), 0);
                }
                class43.field1103 = 600;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIZ)V", line = 121)
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1394 = arg4;
        this.field1399 = arg0;
        this.field1384 = arg3;
        this.field1392 = arg2;
        this.field1388 = arg6;
        this.field1382 = arg5;
        this.field1385 = arg1;
    }
}
