import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class590 extends class55 {

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field8235 = 0;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public int field8234;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public int field8241;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
    public int[] field8233;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
    public int[] field8237;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "[I")
    public int[] field8240;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "[Ljt;")
    public class107[] field8243;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[Ljt;")
    public class107[] field8244;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[[[B")
    public byte[][][] field8238;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
    public static final void method3282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8242++;
        class252 var5 = class150.method916(arg4, -105, arg3);
        var5.method1502((byte) -103);
        var5.field3247 = arg0;
        var5.field3251 = arg2;
        var5.field3250 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3283(byte arg0, String arg1) {
        field8239++;
        if (!class595.field8291 || (class372.field5190 & 0x18) == 0 || arg0 != 36) {
            return;
        }
        boolean var2 = false;
        int var3 = class427.field6032;
        int[] var4 = class619.field8682;
        for (int var5 = 0; var5 < var3; var5++) {
            class83 var6 = class361.field4793[var4[var5]];
            if (var6.field1148 != null && var6.field1148.equalsIgnoreCase(arg1) && (class653.field9086 == var6 && (class372.field5190 & 0x10) != 0 || var6 != null && (class372.field5190 & 0x8) != 0)) {
                client.field4108++;
                class103 var7 = class752.method4186(260, class505.field6856, class449.field6285);
                var7.field1379.method3437(var4[var5], 128);
                var7.field1379.method3381(class355.field4735, (byte) 126);
                var7.field1379.method3444(class631.field8779, 1046032984);
                var7.field1379.method3430(0, (byte) -95);
                var7.field1379.method3381(class169.field2109, (byte) 126);
                class27.method104(false, var7);
                class556.method3152(0, 0, var6.method543(0), -2, 0, var6.field899[0], var6.field898[0], true, var6.method543(0));
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class247.method1484(class755.field10501.method4201(class723.field10095, (byte) 25) + arg1, 4, (byte) 71);
        }
        if (class595.field8291) {
            class96.method661((byte) 119);
        }
    }
}
