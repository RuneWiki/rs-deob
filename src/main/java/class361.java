import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class361 extends Canvas {

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field4979;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field4985 = 0;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "[I")
    public static int[] field4983 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "[Lwn;")
    public static class77[] field4987;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
    public static final void method2222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4981++;
        if (arg1 != 4096) {
            return;
        }
        int var10 = arg5 + 1;
        class149.method1112(arg4, arg2, 8, arg0, class83.field1157[arg5]);
        int var9 = arg3 - 1;
        class149.method1112(arg4, arg2, 8, arg0, class83.field1157[arg3]);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class83.field1157[var6];
            var7[arg0] = var7[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
    public static final int method2223(int arg0) {
        if (arg0 != -1) {
            return -84;
        }
        field4982++;
        class408 var1 = class146.field2124;
        synchronized (class146.field2124) {
            return class146.field2124.method2534((byte) -7);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method2224(String arg0, boolean arg1, byte arg2) {
        field4980++;
        if (arg0 == null) {
            return;
        }
        if (class42.field541 >= 100) {
            client.method1640(126, class259.field3588.method2313((byte) -70, class445.field6241));
            return;
        }
        String var3 = class68.method547((byte) 46, arg0);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 >= -94) {
            method2227(23);
        }
        while (class42.field541 > var4) {
            String var8 = class68.method547((byte) 46, class32.field443[var4]);
            if (var8 != null && var8.equals(var3)) {
                client.method1640(120, arg0 + class92.field1292.method2313((byte) -113, class445.field6241));
                return;
            }
            if (class394.field5478[var4] != null) {
                String var9 = class68.method547((byte) 46, class394.field5478[var4]);
                if (var9 != null && var9.equals(var3)) {
                    client.method1640(-27, arg0 + class92.field1292.method2313((byte) -128, class445.field6241));
                    return;
                }
            }
            var4++;
        }
        for (int var5 = 0; var5 < class353.field4751; var5++) {
            String var6 = class68.method547((byte) 46, class196.field2851[var5]);
            if (var6 != null && var6.equals(var3)) {
                client.method1640(108, class66.field904.method2313((byte) -96, class445.field6241) + arg0 + class142.field2075.method2313((byte) -96, class445.field6241));
                return;
            }
            if (class328.field4461[var5] != null) {
                String var7 = class68.method547((byte) 46, class328.field4461[var5]);
                if (var7 != null && var7.equals(var3)) {
                    client.method1640(118, class66.field904.method2313((byte) -92, class445.field6241) + arg0 + class142.field2075.method2313((byte) -120, class445.field6241));
                    return;
                }
            }
        }
        if (class68.method547((byte) 46, class359.field4970.field5869).equals(var3)) {
            client.method1640(123, class398.field5511.method2313((byte) -96, class445.field6241));
            return;
        }
        class429.field5971++;
        class88.field1232.method1151(140, (byte) 112);
        class88.field1232.method2280(class82.method662(12189, arg0) + 1, 1537846408);
        class88.field1232.method2285(arg0, (byte) -97);
        class88.field1232.method2280(arg1 ? 1 : 0, 1537846408);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lh;I)Ljava/lang/String;")
    public static final String method2225(class429 arg0, int arg1) {
        field4977++;
        int var2 = 41 / ((37 - arg1) / 58);
        return arg0.field5972 == null || arg0.field5972.length() <= 0 ? arg0.field5976 : arg0.field5976 + class310.field4202.method2313((byte) -70, class445.field6241) + arg0.field5972;
    }

    @OriginalMember(owner = "client!ho", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4979.paint(arg0);
        field4978++;
    }

    @OriginalMember(owner = "client!ho", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4979.update(arg0);
        field4984++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
    public static void method2226(boolean arg0) {
        field4983 = null;
        field4987 = null;
        if (!arg0) {
            field4987 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
    public static final void method2227(int arg0) {
        if (class269.field3688 == null || class62.field843 == null) {
            class269.field3688 = new int[256];
            class62.field843 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class269.field3688[var1] = (int) (Math.sin(var2) * 4096.0D);
                class62.field843[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field4986++;
        if (arg0 != 4096) {
            method2223(-107);
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class361(Component arg0) {
        this.field4979 = arg0;
    }
}
