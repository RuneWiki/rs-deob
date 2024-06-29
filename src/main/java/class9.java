import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class9 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field91 = 0;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[S")
    public static short[] field93 = new short[256];

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[Lr;")
    public static class66[] field96 = new class66[500];

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lod;")
    public static class131 field95 = new class131();

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lr;")
    public static class66 field99 = class93.method641(43, " loggt sich aus)3");

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lr;")
    public static class66 field100 = class93.method641(43, "");

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static volatile int field104 = 0;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lsg;")
    public static class247 field97;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
    public static boolean field101;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[[[I")
    public static int[][][] field98;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method39(byte arg0) {
        field98 = null;
        if (arg0 < 125) {
            field97 = null;
        }
        field96 = null;
        field99 = null;
        field100 = null;
        field95 = null;
        field97 = null;
        field93 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method40(int arg0, byte arg1) {
        field94++;
        if (arg1 != -85) {
            return null;
        } else if (arg0 == 100 && class19.field264 > 0) {
            byte[] var2 = class243.field4255[--class19.field264];
            class243.field4255[class19.field264] = null;
            return var2;
        } else if (arg0 == 5000 && class80.field1574 > 0) {
            byte[] var3 = class225.field3855[--class80.field1574];
            class225.field3855[class80.field1574] = null;
            return var3;
        } else if (arg0 == 30000 && class115.field2172 > 0) {
            byte[] var4 = class69.field1391[--class115.field2172];
            class69.field1391[class115.field2172] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILha;IILjb;I)V")
    public static final void method41(int arg0, int arg1, class63 arg2, int arg3, int arg4, class256 arg5, int arg6) {
        field92++;
        if (arg5 == null) {
            return;
        }
        int var7 = class259.field4562 + class124.field2341 & 0x7FF;
        int var8 = Math.max(arg2.field1215 / 2, arg2.field1196 / 2) + 10;
        int var9 = arg4 * arg4 + (arg0 * arg0);
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class123.field2314[var7];
        int var11 = class123.field2326[var7];
        int var12 = var11 * 256 / (class240.field4172 + 256);
        int var13 = var10 * 256 / (class240.field4172 + 256);
        if (arg1 <= -23) {
            int var14 = arg0 * var13 + arg4 * var12 >> 16;
            int var15 = arg0 * var12 - (arg4 * var13) >> 16;
            ((class168) arg5).method1149(arg2.field1215 / 2 + arg3 + var14 - arg5.field4490 / 2, arg2.field1196 / 2 + arg6 + -(arg5.field4498 / 2) + -var15, arg2.field1177, arg2.field1106);
        }
    }
}
