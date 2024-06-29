import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class43 extends class521 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field460 = -1;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lao;")
    public static class191 field457 = new class191(16, 6);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lao;")
    public static class191 field461 = new class191(5, 6);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILza;II)V")
    public static final void method247(int arg0, class287 arg1, int arg2, int arg3) {
        field458++;
        class275.field3667 = arg1;
        class275.field3657 = new class6[arg3][arg2];
        if (class300.field3945 != null) {
            class525.field7728 = class500.method3003(class300.field3945[2], class300.field3945[1], class300.field3945[4], class300.field3945[0], class300.field3945[5], (byte) 122, class300.field3945[3]);
        }
        class358.field4873 = new class6();
        if (arg0 != 5) {
            field461 = null;
        }
        class217.method1380((byte) 118);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public static void method248(byte arg0) {
        if (arg0 != 2) {
            field457 = null;
        }
        field461 = null;
        field457 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Lwk;")
    public static final class96 method249(int arg0, int arg1, int arg2, int arg3) {
        field459++;
        class498 var4 = class186.field2421[arg0][arg2][arg1];
        if (var4 == null) {
            return null;
        }
        class96 var5 = null;
        if (arg3 != 1) {
            field461 = null;
        }
        int var6 = -1;
        for (class192 var7 = var4.field7263; var7 != null; var7 = var7.field2469) {
            class279 var8 = var7.field2466;
            if (var8 instanceof class96) {
                class96 var9 = (class96) var8;
                int var10 = (var9.method546(24273) - 1) * 64 + 60;
                int var11 = var9.field3704 - var10 >> 7;
                int var12 = var9.field3694 - var10 >> 7;
                int var13 = var9.field3704 + var10 >> 7;
                int var14 = var9.field3694 + var10 >> 7;
                if (var11 <= arg2 && arg1 >= var12 && var13 >= arg2 && var14 >= arg1) {
                    int var15 = (var14 + 1 - arg1) * (var13 + 1 - arg2);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class250 var7 = new class250();
        var7.field3346 = arg1 >> class351.field4688;
        var7.field3325 = arg2 >> class351.field4688;
        var7.field3324 = arg3 >> class351.field4688;
        var7.field3344 = arg4 >> class351.field4688;
        var7.field3330 = arg0;
        var7.field3328 = arg1;
        var7.field3343 = arg2;
        var7.field3339 = arg3;
        var7.field3338 = arg4;
        var7.field3331 = arg5;
        var7.field3342 = arg6;
        class508.field7354[class421.field6116++] = var7;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)Lsa;")
    public abstract class139 method251(byte arg0);
}
