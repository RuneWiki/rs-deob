import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class57 extends class7 {

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    private int field780 = -32768;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Lbe;")
    public static class283 field777 = class153.method941(126, "<col=40ff00>");

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "Lbe;")
    public static class283 field775 = class153.method941(-32, "blinken2:");

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "[I")
    public static int[] field772 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "Z")
    public static boolean field783 = false;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "[Lbe;")
    public static class283[] field790 = new class283[1000];

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "Lek;")
    public static class172 field787;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "[S")
    public static short[] field785;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lek;Z)V", line = 5)
    public static final void method369(class172 arg0, boolean arg1) {
        field786++;
        class205.field3494 = class295.method2009(0, arg0, class178.field3071, (byte) -110);
        class15.field169 = new class95[class205.field3494.length];
        class213.field3629 = new class95[class205.field3494.length];
        class260.field4421 = new class95[class205.field3494.length];
        for (int var2 = 0; var2 < class205.field3494.length; var2++) {
            class205.field3494[var2].method614();
            class15.field169[var2] = class205.field3494[var2].method610();
            class205.field3494[var2].method614();
            class213.field3629[var2] = class205.field3494[var2].method610();
            class205.field3494[var2].method614();
            class260.field4421[var2] = class205.field3494[var2].method610();
            class205.field3494[var2].method614();
        }
        class25.field375 = class217.method1431(0, arg0, 0, class121.field2020);
        class280.field4677 = class122.method773(arg0, 83, 0, class66.field920);
        class280.field4683 = class122.method773(arg0, 83, 0, class129.field2172);
        class72.field1277 = class122.method773(arg0, 81, 0, class280.field4674);
        class217.field3680 = class122.method773(arg0, 86, 0, class126.field2092);
        class54.field751 = client.method1593(arg0, 0, (byte) 69, class160.field2637);
        class159.field2599 = client.method1593(arg0, 0, (byte) 69, class180.field3113);
        class126.field2093 = class281.method1884(class121.field2023, 0, (byte) -75, arg0);
        class16.field188 = client.method1593(arg0, 0, (byte) 69, class243.field4111);
        class243.field4100 = client.method1593(arg0, 0, (byte) 69, class207.field3559);
        class44.field605 = class65.method416(0, (byte) 48, class31.field477, arg0);
        class65.field895 = class65.method416(0, (byte) 86, class190.field3248, arg0);
        class107.field1831.method1655(class65.field895, (int[]) null);
        class269.field4539.method1655(class65.field895, (int[]) null);
        class240.field4056.method1655(class65.field895, (int[]) null);
        class212.field3610 = class295.method2009(0, arg0, class160.field2619, (byte) 62);
        for (int var3 = 0; var3 < class212.field3610.length; var3++) {
            class212.field3610[var3].method612();
        }
        class204 var4 = class281.method1881(arg0, 0, 128, class249.field4244);
        var4.method1302();
        class23.field354 = new class266(var4);
        class204[] var5 = class217.method1431(0, arg0, 0, class15.field173);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1302();
        }
        class259.field4407 = new class107[var5.length];
        for (int var7 = 0; var7 < var5.length; var7++) {
            class259.field4407[var7] = new class266(var5[var7]);
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class25.field375.length; var12++) {
            class25.field375[var12].method1312(var8 + var11, var9 - -var11, var10 + var11);
        }
        if (arg1) {
            method371((byte) -81);
        }
        class205.field3494[0].method615(var8 + var11, var9 + var11, var10 + var11);
        class69.field1148 = new class107[class25.field375.length];
        for (int var13 = 0; var13 < class25.field375.length; var13++) {
            class69.field1148[var13] = new class266(class25.field375[var13]);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIIJ)V", line = 119)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field778++;
        class289 var11 = class103.method676(this.field789, -1).method2061(23856, 0, this.field784, (class157) null);
        if (var11 != null) {
            var11.method41(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field780 = var11.method40();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLbe;)Lrh;", line = 138)
    public static final class128 method370(byte arg0, class283 arg1) {
        field782++;
        for (class128 var2 = (class128) class184.field3163.method1812((byte) -120); var2 != null; var2 = (class128) class184.field3163.method1813((byte) 102)) {
            if (var2.field2124.method1926(-16620, arg1)) {
                return var2;
            }
        }
        if (arg0 != -22) {
            field775 = (class283) null;
        }
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()I", line = 179)
    public final int method40() {
        field773++;
        return this.field780;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 192)
    public static void method371(byte arg0) {
        if (arg0 != -25) {
            return;
        }
        field787 = null;
        field772 = null;
        field790 = null;
        field785 = null;
        field775 = null;
        field777 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 207)
    public static final void method372(Component arg0, int arg1) {
        if (arg1 != 31499) {
            method370((byte) -38, (class283) null);
        }
        field776++;
        arg0.removeKeyListener(class278.field4645);
        arg0.removeFocusListener(class278.field4645);
        class232.field3937 = -1;
    }
}
