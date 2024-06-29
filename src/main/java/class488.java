import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class488 extends class208 {

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "B")
    public byte field6815 = 5;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "Ltja;")
    public static class288 field6822 = new class288(30);

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public int field6812;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public int field6814;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public int field6816;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public int field6817;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public int field6819;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public int field6821;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "Z")
    public boolean field6820;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V")
    public static void method2895(byte arg0) {
        field6822 = null;
        if (arg0 < 2) {
            method2897(null, 11);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Llc;ZLbt;)V")
    public static final void method2896(class675 arg0, boolean arg1, class48 arg2) {
        if (arg1) {
            return;
        }
        field6818++;
        class235.field2788 = arg2;
        class652.field8998 = "";
        class372.field4687 = arg0;
        if (class329.field4066.startsWith("win")) {
            class652.field8998 = class652.field8998 + "windows/";
        } else if (class329.field4066.startsWith("linux")) {
            class652.field8998 = class652.field8998 + "linux/";
        } else if (class329.field4066.startsWith("mac")) {
            class652.field8998 = class652.field8998 + "macos/";
        }
        if (class372.field4687.field9260) {
            class652.field8998 = class652.field8998 + "msjava/";
        } else if (class329.field4063.startsWith("amd64") || class329.field4063.startsWith("x86_64")) {
            class652.field8998 = class652.field8998 + "x86_64/";
        } else if (class329.field4063.startsWith("i386") || class329.field4063.startsWith("i486") || class329.field4063.startsWith("i586") || class329.field4063.startsWith("x86")) {
            class652.field8998 = class652.field8998 + "x86/";
        } else if (class329.field4063.startsWith("ppc")) {
            class652.field8998 = class652.field8998 + "ppc/";
        } else {
            class652.field8998 = class652.field8998 + "universal/";
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lkg;I)V")
    public static final void method2897(class287 arg0, int arg1) {
        field6813++;
        if (arg0.field3444 == null && arg0.field3373 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.field3444.length; var3++) {
            int var4 = -1;
            if (arg0.field3444 != null) {
                var4 = arg0.field3444[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var10;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var13 = var4 & 0xFFFFFFF;
                    int var14 = var13 >> 14;
                    var9 = -((var14 - class632.field8626) * 512) - (256 - arg0.field823);
                    int var15 = var13 & 0x3FFF;
                    var10 = -((var15 - class620.field8435) * 512 - arg0.field813) - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class273 var11 = (class273) class30.field444.method2121(69, (long) var4);
                    if (var11 == null) {
                        arg0.method1672(-1, -61, var3);
                        continue;
                    }
                    class388 var12 = var11.field3210;
                    var10 = arg0.field813 - var12.field813;
                    var9 = arg0.field823 - var12.field823;
                } else {
                    int var7 = var4 & 0x7FFF;
                    class521 var8 = class61.field825[var7];
                    if (var8 == null) {
                        arg0.method1672(-1, -65, var3);
                        continue;
                    }
                    var9 = arg0.field823 - var8.field823;
                    var10 = arg0.field813 - var8.field813;
                }
                if (var9 != 0 || var10 != 0) {
                    arg0.method1672((int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF, -91, var3);
                }
            } else if (!arg0.method1672(-1, -51, var3)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field3444 = null;
            arg0.field3373 = null;
        }
        if (arg1 != 16383) {
            method2895((byte) -68);
        }
    }
}
