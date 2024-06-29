import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class123 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1704 = 0;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Z")
    public static boolean field1705 = false;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Ldu;")
    public static class479 field1703 = new class479();

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Llm;")
    public static class84 field1708 = new class84("", 13);

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Lli;")
    public static class336 field1710;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "[[B")
    public static byte[][] field1709;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 5)
    public static void method758(int arg0) {
        if (arg0 != -24952) {
            field1705 = true;
        }
        field1709 = null;
        field1703 = null;
        field1710 = null;
        field1708 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILdq;)V", line = 19)
    public static final void method759(int arg0, class14 arg1) {
        class400.field5591 = 3;
        field1706++;
        class175.method1160(true, 116);
        class327.field4526 = true;
        class255.field3578 = true;
        class80.field1205 = true;
        class256.field3582 = 127;
        class301.field4127 = true;
        class47.field766 = 255;
        class191.field2723 = true;
        class221.field3111 = 0;
        class47.field761 = 2;
        class216.field3068 = true;
        class304.field4157 = 0;
        class211.field2977 = 0;
        class460.field6481 = true;
        class216.field3069 = true;
        class491.field6932 = 127;
        class164.field2424 = true;
        class312.field4249 = true;
        class13.field210 = 0;
        class181.field2629 = 1;
        if (class154.field2227 >= 96) {
            class42.method351(2, (byte) -107);
        } else {
            class42.method351(0, (byte) 45);
        }
        class447.field6170 = false;
        class104.field1498 = false;
        class312.field4253 = arg0;
        class255.field3580 = true;
        class205.field2933 = class251.field3519 == 1 ? 2 : 4;
        class122.field1699 = true;
        class47.field768 = 2;
        class411.field5693 = 2;
        class222.field3135 = 0;
        class163.field2336 = false;
        class169 var2 = null;
        try {
            class420 var3 = arg1.method116(93);
            while (var3.field5789 == 0) {
                class258.method1603(arg0 - 649, 1L);
            }
            if (var3.field5789 == 1) {
                var2 = (class169) var3.field5791;
                byte[] var4 = new byte[(int) var2.method1045(arg0 ^ 0xFFFFFF80)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1046(var4.length - var5, var5, true, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class155.method944((byte) -76, new class425(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1044(true);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)V", line = 108)
    public static final void method760(int arg0, byte arg1) {
        if (arg0 != 22586) {
            field1704 = -103;
        }
        if (class484.field6821 == null) {
            class484.field6821 = new byte[4][class200.field2875][class422.field5811];
        }
        field1707++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class200.field2875; var3++) {
                for (int var4 = 0; var4 < class422.field5811; var4++) {
                    class484.field6821[var2][var3][var4] = arg1;
                }
            }
        }
    }
}
