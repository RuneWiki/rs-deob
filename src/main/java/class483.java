import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class483 extends Canvas {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field6658;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lgd;")
    public static class206 field6656 = new class206("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lha;")
    public static class40 field6660 = null;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field6661 = 13156520;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method2812(byte arg0) {
        field6660 = null;
        if (arg0 != -59) {
            method2812((byte) 47);
        }
        field6656 = null;
    }

    @OriginalMember(owner = "client!qc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field6658.paint(arg0);
        field6659++;
    }

    @OriginalMember(owner = "client!qc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field6658.update(arg0);
        field6662++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILwm;)V")
    public static final void method2813(int arg0, class364 arg1) {
        arg1.method1981(0, 0, class424.field5738, 350);
        if (arg0 != -21358) {
            return;
        }
        field6657++;
        arg1.method2003(0, 0, class424.field5738, 350, class38.field560 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class377.field5196[var2] >> 4;
            int var14 = class377.field5193[var2] >> 4;
            int var15 = (class364.field4994[(var14 + (var13 & 0x40)) * 64 & 0x3FFF] >> 10) + var13;
            arg1.method2003(var15, var14, 2, 2, class138.field2010[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class107.field1603;
        if (class11.field130 > 0) {
            int var4 = 342 - class107.field1603;
            int var5 = var3 * var4 / (class11.field130 + var3 - 1);
            int var6 = 4;
            if (class11.field130 > 1) {
                var6 += (class11.field130 - class390.field5423 - 1) * (var4 - var5) / (class11.field130 - 1);
            }
            arg1.method2003(class424.field5738 - 16, var6, 12, var5, class38.field560 << 24 | 0x332277, 2);
            for (int var7 = class390.field5423; class390.field5423 + var3 > var7 && class11.field130 > var7; var7++) {
                String[] var8 = class490.method2852(arg0 + 21358, '\b', class471.field6495[var7]);
                int var9 = (class424.field5738 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = (var9 * var10) + 8;
                    arg1.method1981(var11, 0, var11 + var9 - 8, 350);
                    class284.field3828.method2124(var11, -16777216, 350 - class367.field5051 - class448.field6097.field4782 - ((var7 - class390.field5423) * class107.field1603) - 2, -1, (byte) -78, var8[var10]);
                }
            }
        }
        arg1.method1981(0, 0, class424.field5738, 350);
        arg1.method2224(0, 16384, class424.field5738, 350 - class367.field5051, -1);
        class93.field1366.method2124(10, -16777216, 350 - class392.field5448.field4782 - 1, -1, (byte) -71, "--> " + class309.field4083);
        int var12 = -1;
        if ((class70.field968 % 30) > 15) {
            var12 = 16777215;
        }
        arg1.method2215(var12, class392.field5448.method2145("--> " + class309.field4083.substring(0, class102.field1471), 13938) + 10, -class392.field5448.field4782 + -11 + 350, 12, (byte) -110);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class483(Component arg0) {
        this.field6658 = arg0;
    }
}
