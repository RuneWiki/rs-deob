import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class51 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field979 = new int[1000];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lvd;")
    public static class222 field980 = class212.method1357("welle2:", 10731);

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lvd;")
    public static class222 field984 = class212.method1357(" zuerst von Ihrer Freunde)2Liste(Q", 10731);

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lab;")
    public static class3 field983;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method367(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method368(byte arg0) {
        field984 = null;
        field980 = null;
        field979 = null;
        field983 = null;
        if (arg0 < 103) {
            field979 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method369(int arg0) {
        field982++;
        while (class21.field505.method1345(class70.field1306, (byte) -63) >= 27) {
            int var1 = class21.field505.method1350(15, arg0 ^ 0x7);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class202.field3696[var1] == null) {
                class202.field3696[var1] = new class193();
                var2 = true;
            }
            class193 var3 = class202.field3696[var1];
            class113.field2123[class173.field3263++] = var1;
            var3.field1348 = class175.field3280;
            var3.field3558 = class31.method254((byte) -119, class21.field505.method1350(14, 7));
            int var4 = class21.field505.method1350(1, 7);
            int var5 = class46.field936[class21.field505.method1350(3, 7)];
            if (var2) {
                var3.field1325 = var3.field1365 = var5;
            }
            int var6 = class21.field505.method1350(1, 7);
            if (var6 == 1) {
                class122.field2341[class162.field3088++] = var1;
            }
            int var7 = class21.field505.method1350(5, 7);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class21.field505.method1350(5, 7);
            var3.field1331 = var3.field3558.field2151;
            var3.field1354 = var3.field3558.field2141;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field1355 = var3.field3558.field2167;
            var3.field1319 = var3.field3558.field2147;
            var3.field1350 = var3.field3558.field2138;
            var3.field1311 = var3.field3558.field2142;
            var3.field1324 = var3.field3558.field2164;
            var3.field1322 = var3.field3558.field2168;
            if (var3.field1350 == 0) {
                var3.field1365 = 0;
            }
            var3.field1364 = var3.field3558.field2155;
            var3.method477(class17.field432.field1333[0] + var7, class17.field432.field1358[0] + var8, arg0 ^ 0xFFFFFF87, var4 == 1);
        }
        if (arg0 != 0) {
            method369(66);
        }
        class21.field505.method1352((byte) 119);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I")
    public abstract int method370(int arg0);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method371(byte arg0, Component arg1);
}
