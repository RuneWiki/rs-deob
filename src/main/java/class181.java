import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class181 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field2364 = 1337;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Lpb;")
    public static class296 field2371 = new class296("", 13);

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Ldn;")
    public static class201 field2362;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
    public final void method1188(int arg0, byte arg1) {
        OpenGL.glNewList(this.field2361 + arg0, 4864);
        field2365++;
        int var3 = 121 / ((5 - arg1) / 57);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZB)V")
    public static final void method1189(boolean arg0, byte arg1) {
        field2370++;
        if (arg0) {
            if (class282.field3610 != -1) {
                class275.method1690(class282.field3610, (byte) 80);
            }
            for (class367 var2 = (class367) class381.field4963.method2087(0); var2 != null; var2 = (class367) class381.field4963.method2091(-128)) {
                if (!var2.method3019(-127)) {
                    var2 = (class367) class381.field4963.method2087(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class176.method1142(false, (byte) 91, true, var2);
            }
            class282.field3610 = -1;
            class381.field4963 = new class357(8);
            class329.method1958(true);
            class282.field3610 = class422.field5654;
            class296.method1780(false, (byte) 31);
            class218.method1396((byte) 110);
            class490.method2927(class282.field3610);
        }
        class402.method2381((byte) -12);
        class501.field7364 = -1;
        class196.method1266(false, class169.field2205);
        class37.field573 = new class518();
        class37.field573.field6239 = class200.field2594 * 128 / 2;
        if (arg1 > -92) {
            method1189(false, (byte) 115);
        }
        class37.field573.field5246[0] = class200.field2594 / 2;
        class37.field573.field6241 = class118.field1647 * 128 / 2;
        class291.field3724 = 0;
        class299.field3885 = 0;
        class37.field573.field5251[0] = class118.field1647 / 2;
        if (class396.field5271 == 2) {
            class299.field3885 = class524.field7766 << 7;
            class291.field3724 = class517.field7619 << 7;
        } else {
            class6.method34(false);
        }
        class322.method1922((byte) -44);
        if (class299.field3885 == 0 || class291.field3724 == 0) {
            class294.method1767(10, (byte) -48);
        } else {
            class368.method2150(0);
            class294.method1767(28, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BC)V")
    public final void method1190(byte arg0, char arg1) {
        field2369++;
        int var3 = -59 % ((arg0 + 35) / 61);
        OpenGL.glCallList(this.field2361 + arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
    public static final void method1191(int arg0, int arg1, int arg2, int arg3) {
        field2368++;
        int var4 = class421.field5647.field7712 * arg1 >> 8;
        int var5 = 44 % ((-arg3 - 15) / 36);
        if (arg0 == -1 && !class265.field3366) {
            class179.method1162((byte) -7);
        } else if (arg0 != -1 && (class513.field7546 != arg0 || !class342.method2013(45)) && var4 != 0 && !class265.field3366) {
            class103.method689(-91, arg2, var4, class288.field3685, 0, arg0, false);
        }
        class513.field7546 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lgk;I)V")
    public class181(class463 arg0, int arg1) {
        this.field2361 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method1192(byte arg0) {
        if (arg0 > -102) {
            field2366 = 25;
        }
        field2362 = null;
        field2371 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public final void method1193(int arg0) {
        OpenGL.glEndList();
        int var2 = -79 / ((arg0 + 74) / 50);
        field2363++;
    }
}
