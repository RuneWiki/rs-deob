import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    public boolean field58 = false;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field57 = 0;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field60 = 0;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lph;")
    public static class229 field56 = class266.method1858(" weitere Optionen", 0);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Ltl;")
    public static class271 field64 = new class271();

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lph;")
    public static class229 field66 = class266.method1858("0", 0);

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lph;")
    public static class229 field67 = class266.method1858("", 0);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lbm;")
    public class140 field63;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field59;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[Lcl;")
    public static class32[] field65;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[[[B")
    public static byte[][][] field54;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method26(boolean arg0) {
        class235.field3882.method1414(83);
        if (!arg0) {
            method26(false);
        }
        class119.field1996.method1414(100);
        class12.field165.method1414(97);
        field53++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZ[Lri;II)V", line = 22)
    public static final void method27(int arg0, int arg1, boolean arg2, class301[] arg3, int arg4, int arg5) {
        int var6 = 77 / ((arg5 + 56) / 55);
        for (int var7 = 0; var7 < arg3.length; var7++) {
            class301 var8 = arg3[var7];
            if (var8 != null && var8.field5040 == arg0) {
                class208.method1447(-82, arg4, var8, arg2, arg1);
                class260.method1803(arg4, -107, var8, arg1);
                if (var8.field4937 > var8.field5006 - var8.field4923) {
                    var8.field4937 = var8.field5006 - var8.field4923;
                }
                if (var8.field4877 - var8.field4882 < var8.field4897) {
                    var8.field4897 = var8.field4877 - var8.field4882;
                }
                if (var8.field4937 < 0) {
                    var8.field4937 = 0;
                }
                if (var8.field4897 < 0) {
                    var8.field4897 = 0;
                }
                if (var8.field4920 == 0) {
                    class103.method787(arg2, var8, 118);
                }
            }
        }
        field61++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 69)
    public static void method28(int arg0) {
        field67 = null;
        field64 = null;
        field65 = null;
        field66 = null;
        field54 = (byte[][][]) null;
        field56 = null;
        if (arg0 >= -115) {
            field67 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIILrk;JLrk;Lrk;)V", line = 87)
    public static final void method29(int arg0, int arg1, int arg2, int arg3, class216 arg4, long arg5, class216 arg6, class216 arg7) {
        class101 var9 = new class101();
        var9.field1727 = arg4;
        var9.field1725 = arg1 * 128 + 64;
        var9.field1728 = arg2 * 128 + 64;
        var9.field1724 = arg3;
        var9.field1730 = arg5;
        var9.field1726 = arg6;
        var9.field1729 = arg7;
        int var10 = 0;
        class72 var11 = class225.field3705[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1211; var12++) {
                class152 var13 = var11.field1216[var12];
                if ((var13.field2479 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2461.method182();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1731 = -var10;
        if (class225.field3705[arg0][arg1][arg2] == null) {
            class225.field3705[arg0][arg1][arg2] = new class72(arg0, arg1, arg2);
        }
        class225.field3705[arg0][arg1][arg2].field1220 = var9;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lsi;Lsi;Lsi;ILsi;)V", line = 147)
    public static final void method30(class66 arg0, class66 arg1, class66 arg2, int arg3, class66 arg4) {
        class319.field5395 = arg0;
        class263.field4390 = arg2;
        class75.field1264 = arg1;
        field55++;
        class54.field765 = arg4;
        class37.field604 = new class301[class75.field1264.method499((byte) -93)][];
        class133.field2164 = new boolean[class75.field1264.method499((byte) -98)];
        if (arg3 > -107) {
            method30((class66) null, (class66) null, (class66) null, 109, (class66) null);
        }
    }
}
