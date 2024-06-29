import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class777 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Lpja;")
    private class43 field10719 = new class43(64);

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "Lgj;")
    private class662 field10725;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "Lvl;")
    public static class15 field10726 = new class15(87, -1);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10720;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field10721;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field10722;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field10723;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field10724;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field10727;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Z")
    public static boolean field10728;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
    public final void method4261(int arg0, int arg1) {
        class43 var3 = this.field10719;
        synchronized (this.field10719) {
            if (arg1 != -4848) {
                field10728 = true;
            }
            this.field10719.method265(arg0, -34);
        }
        field10724++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static void method4262(int arg0) {
        field10726 = null;
        if (arg0 != -256) {
            field10726 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method4263(String arg0, int arg1) {
        if (arg1 == -1) {
            field10720++;
            System.out.println("Error: " + class246.method1641("%0a", "\n", arg0, (byte) -52));
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBII)Luv;")
    public static final class385 method4264(int arg0, byte arg1, int arg2, int arg3) {
        field10722++;
        class549 var4 = class325.field4448[arg2][arg0][arg3];
        if (var4 == null) {
            return null;
        }
        class385 var5 = null;
        if (arg1 != 25) {
            method4264(-80, (byte) 115, -25, 1);
        }
        int var6 = -1;
        for (class58 var7 = var4.field7466; var7 != null; var7 = var7.field811) {
            class597 var8 = var7.field815;
            if (var8 instanceof class385) {
                class385 var9 = (class385) var8;
                int var10 = var9.method2342((byte) -74) * 256 + 252 - 256;
                int var11 = var9.field7396 - var10 >> 9;
                int var12 = var9.field7398 - var10 >> 9;
                int var13 = var9.field7396 + var10 >> 9;
                int var14 = var9.field7398 + var10 >> 9;
                if (arg0 >= var11 && var12 <= arg3 && var13 >= arg0 && var14 >= arg3) {
                    int var15 = (var14 + 1 - arg3) * (var13 + 1 - arg0);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)Llfa;")
    public final class126 method4265(int arg0, int arg1) {
        field10727++;
        class43 var3 = this.field10719;
        class126 var4;
        synchronized (this.field10719) {
            var4 = (class126) this.field10719.method266((byte) -125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field10725;
        byte[] var6;
        synchronized (this.field10725) {
            var6 = this.field10725.method3732(arg1, 8906, 54);
        }
        class126 var7 = new class126();
        if (var6 != null) {
            var7.method1081(new class93(var6), 30592);
        }
        if (arg0 >= -14) {
            return null;
        }
        class43 var8 = this.field10719;
        synchronized (this.field10719) {
            this.field10719.method270(var7, (long) arg1, -122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    public final void method4266(int arg0) {
        class43 var2 = this.field10719;
        synchronized (this.field10719) {
            this.field10719.method272(20);
            if (arg0 >= -74) {
                field10726 = null;
            }
        }
        field10721++;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lim;ILgj;)V")
    public class777(class598 arg0, int arg1, class662 arg2) {
        this.field10725 = arg2;
        if (this.field10725 != null) {
            this.field10725.method3730((byte) -95, 54);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public final void method4267(byte arg0) {
        class43 var2 = this.field10719;
        synchronized (this.field10719) {
            this.field10719.method273(-63);
        }
        if (arg0 > 116) {
            field10723++;
        }
    }
}
