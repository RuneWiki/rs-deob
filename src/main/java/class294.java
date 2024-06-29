import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class294 {

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "Lrl;")
    public static class672 field4615 = new class672(4, 3);

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Lps;")
    public static class82 field4614;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZLrfa;[[B)V", line = 4)
    public static final void method2057(boolean arg0, class184 arg1, byte[][] arg2) {
        field4616++;
        if (arg0) {
            return;
        }
        int var3 = class307.field4835.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class476.field7058[var4] >> 8) * 64 - class612.field8702;
                int var7 = (class476.field7058[var4] & 0xFF) * 64 - class626.field8855;
                class636.method3698(!arg0);
                arg1.method1495(var5, var6, var7, class627.field8857, class10.field172, (byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V", line = 41)
    public static void method2058(byte arg0) {
        field4614 = null;
        field4615 = null;
        if (arg0 <= 26) {
            method2059((byte) -61, 50, -120, -88);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BIII)I", line = 55)
    public static final int method2059(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = 29 % ((arg0 - 79) / 33);
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        field4619++;
        return ((arg1 & 0xFF) >> 2 << 10) + (arg3 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V", line = 81)
    public static final void method2060(int arg0) {
        class529.field7721.method342(((float) class17.field282.field4861 * 0.1F + 0.7F) * 1.1523438F);
        field4617++;
        if (arg0 <= 67) {
            method2060(60);
        }
        class529.field7721.method296(class11.field184, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class529.field7721.method313(class22.field349, -1, 0);
        class529.field7721.method264(class476.field7059);
    }
}
