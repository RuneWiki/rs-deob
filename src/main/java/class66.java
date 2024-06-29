import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class66 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Ldq;")
    public class394 field976 = new class394();

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Z")
    public boolean field984 = false;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lqm;")
    public static class331 field978;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[[[Lut;")
    public static class465[][][] field977;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lpt;IIIII)V", line = 3)
    public static final void method428(class398 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6083 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class355.field5541[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class429 var13 = class435.field6486[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field6083; var14++) {
                            if (arg0.field6080[var14] == var13.field6429) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field6080[arg0.field6083++] = var13.field6429;
                        if (arg0.field6083 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field6083; var15 < 4; var15++) {
            arg0.field6080[var15] = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 68)
    public static final void method429(byte arg0) {
        field982++;
        if (!class187.field2934) {
            return;
        }
        class322.field5058 = null;
        if (arg0 < -43) {
            class187.field2934 = false;
            class328.field5172 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 86)
    public static void method430(int arg0) {
        field978 = null;
        if (arg0 != 0) {
            field977 = null;
        }
        field977 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V", line = 97)
    public static final void method431(byte arg0) {
        field983++;
        int var1 = class151.field2425;
        int[] var2 = class45.field734;
        if (arg0 != -83) {
            method432(null, null, 119);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class166 var4 = class435.field6489[var2[var3]];
            if (var4 != null) {
                class49.method353(0, var4, var4.method1143(0));
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([I[JI)V", line = 126)
    public static final void method432(int[] arg0, long[] arg1, int arg2) {
        if (arg2 != 395) {
            field977 = null;
        }
        field985++;
        class500.method2961(arg1.length - 1, (byte) 110, arg1, arg0, 0);
    }
}
