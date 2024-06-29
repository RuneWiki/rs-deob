import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class189 {

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field3246 = 0;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lce;")
    public static class126 field3243 = class206.method1445(-7923, "(U");

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lce;")
    public static class126 field3239 = class206.method1445(-7923, "");

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field3247 = 0;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field3242 = 0;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lml;")
    public static class160 field3244 = new class160(64);

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field3249 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Ljava/lang/Thread;")
    public static Thread field3248;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILcc;)Z", line = 16)
    public static final boolean method1354(int arg0, int arg1, class313 arg2) {
        field3240++;
        byte[] var3 = arg2.method2168(arg0, (byte) 90);
        if (var3 == null) {
            return false;
        }
        class278.method1865(0, var3);
        if (arg1 < 78) {
            field3244 = (class160) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 33)
    public static void method1355(int arg0) {
        field3248 = null;
        field3239 = null;
        field3243 = null;
        field3244 = null;
        if (arg0 != -5) {
            field3249 = 82;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 63)
    public static final void method1356(byte arg0) {
        if (class59.field953 != null) {
            class59.field953.method1941((byte) 63);
            class59.field953 = null;
        }
        field3245++;
        class57.method393(-31678);
        class48.method304();
        for (int var1 = 0; var1 < 4; var1++) {
            class94.field1475[var1].method171(93);
        }
        class322.method2236(false, 0);
        System.gc();
        class212.method1477((byte) -111, 2);
        class51.field785 = false;
        class200.field3412 = -1;
        class33.method184(true, (byte) -5);
        class107.field1691 = 0;
        class58.field914 = 0;
        class138.field2473 = 0;
        class16.field219 = false;
        class23.field329 = 0;
        for (int var2 = 0; var2 < class100.field1623.length; var2++) {
            class100.field1623[var2] = null;
        }
        class239.field4036 = 0;
        class30.field425 = 0;
        if (arg0 != -103) {
            method1356((byte) -112);
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            class85.field1352[var3] = null;
            class229.field3861[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class199.field3391[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class89.field1388[var5][var6][var7] = null;
                }
            }
        }
        class54.method342(-6);
        class63.field1035 = 0;
        class53.method331(-69);
        class144.method1054((byte) 5, true);
    }
}
