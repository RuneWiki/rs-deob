import java.awt.Color;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class425 extends InputStream {

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6441 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
    public static int[] field6440;

    @OriginalMember(owner = "client!cn", name = "read", descriptor = "()I")
    public final int read() {
        field6439++;
        class208.method1464((byte) -93, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lza;)V")
    public static final void method2692(class497 arg0) {
        for (int var1 = class109.field1556; var1 < class297.field4675; var1++) {
            for (int var2 = 0; var2 < class252.field4075; var2++) {
                for (int var3 = 0; var3 < class131.field1773; var3++) {
                    class409 var4 = class217.field3699[var1][var2][var3];
                    if (var4 != null) {
                        class477 var5 = var4.field6180;
                        class477 var6 = var4.field6188;
                        if (var5 != null && var5.method936(false)) {
                            class186.method1165(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method936(false)) {
                                class186.method1165(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method938(0, arg0, 0, false, (byte) -47, 0, var5);
                                var6.method934(287);
                            }
                            var5.method934(287);
                        }
                        for (class192 var7 = var4.field6175; var7 != null; var7 = var7.field2841) {
                            class423 var9 = var7.field2845;
                            if (var9 != null && var9.method936(false)) {
                                class186.method1165(arg0, var9, var1, var2, var3, var9.field6420 + 1 - var9.field6423, var9.field6418 - var9.field6424 + 1);
                                var9.method934(287);
                            }
                        }
                        class12 var8 = var4.field6176;
                        if (var8 != null && var8.method936(false)) {
                            class167.method1062(arg0, var8, var1, var2, var3);
                            var8.method934(287);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static void method2693(byte arg0) {
        field6440 = null;
        field6441 = null;
        if (arg0 != 108) {
            method2693((byte) -75);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static final void method2694(int arg0) {
        class389.field5929.method1128(34);
        field6438++;
        if (arg0 != 1) {
            field6441 = null;
        }
    }
}
