import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class354 extends class745 {

    @OriginalMember(owner = "client!on", name = "D", descriptor = "B")
    public byte field4984 = 5;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "[Lfo;")
    public static class542[] field4983 = new class542[128];

    @OriginalMember(owner = "client!on", name = "w", descriptor = "Loo;")
    public static class652 field4977 = new class652(8);

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public int field4979;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public int field4986;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "Lgm;")
    public static class133 field4981;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "Z")
    public boolean field4982;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)Lbea;")
    public static final class234 method2253(int arg0, byte arg1) {
        field4980++;
        class234 var2 = new class234(arg0, false);
        if (arg1 <= 102) {
            method2253(-6, (byte) 124);
        }
        return var2;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public static void method2254(int arg0) {
        field4977 = null;
        if (arg0 != 5623) {
            method2254(122);
        }
        field4981 = null;
        field4983 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method2255(int arg0, int[] arg1) {
        field4978++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class75.field852;
        int var4 = 0;
        if (arg0 != -1) {
            return null;
        }
        while (arg1.length > var4) {
            class93 var5 = class240.field3602.method3430(arg1[var4], (byte) 116);
            if (var5.field1040 != -1) {
                class241 var6 = (class241) class483.field6802.method3742((byte) 67, (long) var5.field1040);
                if (var6 == null) {
                    class1 var7 = class1.method5(class152.field2163, var5.field1040, 0);
                    if (var7 != null) {
                        var6 = class37.field491.method551(var7, true);
                        class483.field6802.method3739((long) var5.field1040, (byte) 14, var6);
                    }
                }
                if (var6 != null) {
                    class132.field1980[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }
}
