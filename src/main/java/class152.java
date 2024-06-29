import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class152 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lgd;")
    public static class76 field2194 = class18.method127((byte) -114);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient;")
    public static client field2200;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Z")
    public static boolean field2199;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V")
    public static final void method917(int arg0, byte arg1) {
        field2195++;
        class187 var2 = class120.method762((byte) 87, 6, arg0);
        if (arg1 != -14) {
            method918((class124) null, 105);
        }
        var2.method1162(1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfd;I)V")
    public static final void method918(class124 arg0, int arg1) {
        if (arg1 <= -114) {
            field2198++;
            class246.field3684 = arg0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static final void method919(byte arg0) {
        class250.field3785 = null;
        if (arg0 >= -18) {
            return;
        }
        class196.method1222(0, 0, class180.field2748, class136.field1987, -100, 0, -1, class77.field1245, 0);
        if (class250.field3785 != null) {
            class62.method416(class180.field2748, class250.field3785, class77.field1245, -22614, class258.field3938, class15.field183.field4400, 0, class70.field1117, -1412584499, 0);
            class250.field3785 = null;
        }
        field2197++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method920(int arg0) {
        field2200 = null;
        field2194 = null;
        if (arg0 != 5440) {
            method917(-3, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILdi;)V")
    public static final void method921(int arg0, class179 arg1) {
        field2196++;
        short var2 = 256;
        if (arg0 != -31320) {
            return;
        }
        for (int var3 = 0; var3 < class267.field4020.length; var3++) {
            class267.field4020[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class267.field4020[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class1.field10[var15] = (class267.field4020[var15 - 1] + class267.field4020[var15 + 128] + class267.field4020[var15 - -1] + class267.field4020[var15 + -128]) / 4;
                }
            }
            int[] var13 = class267.field4020;
            class267.field4020 = class1.field10;
            class1.field10 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3876; var7++) {
            for (int var8 = 0; var8 < arg1.field3887; var8++) {
                if (arg1.field2731[var6++] != 0) {
                    int var9 = var7 + arg1.field3884 + 16;
                    int var10 = var8 - (-arg1.field3882 - 16);
                    int var11 = var10 + (var9 << 7);
                    class267.field4020[var11] = 0;
                }
            }
        }
    }
}
