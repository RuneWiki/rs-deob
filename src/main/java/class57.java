import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class57 extends class648 implements Runnable {

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
    private boolean field813 = true;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public int field811 = -1;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Laaa;")
    private class99 field812;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Z")
    public static boolean field810 = false;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "Ljava/lang/String;")
    public static String field822 = "";

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field821 = 1337;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "F")
    public static float field808;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Lei;")
    public static class329 field815;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public final void method462(int arg0) {
        if (arg0 >= 32) {
            field817++;
            (new Thread(this, "a")).start();
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
    public static final void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -1) {
            method467((byte) 1, 92, -33, 21);
        }
        field820++;
        if (arg2 >= arg1) {
            class614.method3490(arg0, arg1, arg4 ^ 0x61, class495.field6944[arg3], arg2);
        } else {
            class614.method3490(arg0, arg2, arg4 - 84, class495.field6944[arg3], arg1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field813) {
            this.field812.method845(0, this);
        }
        field816++;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public final void method464(int arg0) {
        field819++;
        this.field813 = false;
        if (arg0 != 1) {
            field822 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
    public static final boolean method465(int arg0, int arg1, int arg2) {
        if (arg1 < 16) {
            field815 = null;
        }
        field814++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static void method466(byte arg0) {
        if (arg0 != 6) {
            field808 = -0.97026587F;
        }
        field822 = null;
        field815 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BIII)I")
    public static final int method467(byte arg0, int arg1, int arg2, int arg3) {
        field818++;
        int var4 = arg3 / arg1;
        int var5 = arg1 - 1 & arg3;
        int var6 = arg2 / arg1;
        int var7 = arg1 - 1 & arg2;
        int var8 = class182.method1226((byte) -47, var6, var4);
        int var9 = class182.method1226((byte) -51, var6, var4 + 1);
        int var10 = class182.method1226((byte) -12, var6 + 1, var4);
        int var11 = class182.method1226((byte) -79, var6 + 1, var4 - -1);
        if (arg0 != 75) {
            method463(126, 51, 29, -77, 92);
        }
        int var12 = class14.method80(1, var8, var5, arg1, var9);
        int var13 = class14.method80(arg0 - 74, var10, var5, arg1, var11);
        return class14.method80(1, var12, var7, arg1, var13);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Laaa;)V")
    public class57(class99 arg0) {
        this.field812 = arg0;
    }
}
