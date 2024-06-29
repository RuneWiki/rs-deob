import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class264 extends class108 {

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Lpp;")
    public static class464 field3840 = new class464(42, 3);

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "Liu;")
    public static class517 field3842 = new class517(21, 3);

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field3843 = 0;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
    public static final void method1675(byte arg0) {
        field3838++;
        if (arg0 != -12) {
            method1676(90);
        }
        for (class587 var1 = (class587) class432.field6356.method427(true); var1 != null; var1 = (class587) class432.field6356.method420(false)) {
            if (class600.method3411(var1.field8359, 58)) {
                class644.method3716(false, var1);
            }
        }
        if (class480.field6825 == 1) {
            class576.method3296((byte) -100);
            return;
        }
        class83.method760(-1001, class6.field49, class354.field5064, class270.field3975, class526.field7324);
        int var2 = class26.field358.method3651(-10408, class291.field4210.method3220(false, class538.field7500));
        for (class587 var3 = (class587) class432.field6356.method427(true); var3 != null; var3 = (class587) class432.field6356.method420(false)) {
            int var4 = class469.method2728((byte) -105, var3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class526.field7324 = var2 + 8;
        class354.field5064 = class480.field6825 * 16 + (class255.field3709 ? 26 : 22);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field3840 = null;
        field3842 = null;
        if (arg0 != -1785070368) {
            method1676(-117);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(JIBI)V")
    public static final void method1677(long arg0, int arg1, byte arg2, int arg3) {
        field3837++;
        if (arg2 < 5) {
            field3842 = null;
        }
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = ((int) arg0 & 0x3B65F0) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class233.method1521(arg3, (byte) -117, 0, var5, var6, arg1, 0, true, 0);
            return;
        }
        class370 var8 = class552.field7819.method2890(0, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field5322;
            var9 = var8.field5277;
        } else {
            var9 = var8.field5322;
            var10 = var8.field5277;
        }
        int var11 = var8.field5266;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class233.method1521(arg3, (byte) -91, var11, 0, 0, arg1, var10, true, var9);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
    public class264() {
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
    public class264(int arg0) {
        this.field3841 = arg0;
    }
}
