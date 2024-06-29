import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class325 extends class104 {

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public int field4977 = 0;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[Z")
    public static boolean[] field4981 = new boolean[8];

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field4982 = 0;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4983 = "red:";

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Lii;")
    public static class227 field4978 = new class227(64);

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Lkh;")
    public static class16 field4987;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lp;B)V", line = 5)
    public final void method2251(class107 arg0, byte arg1) {
        field4979++;
        if (arg1 <= 118) {
            return;
        }
        while (true) {
            int var3 = arg0.method661(-1);
            if (var3 == 0) {
                return;
            }
            this.method2253(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Llc;I)V", line = 35)
    public static final void method2252(class175 arg0, int arg1) {
        if (arg1 != -12031) {
            field4981 = (boolean[]) null;
        }
        field4986++;
        class335.field5175 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILp;)V", line = 46)
    private final void method2253(boolean arg0, int arg1, class107 arg2) {
        field4980++;
        if (arg1 == 2) {
            this.field4977 = arg2.method624(14612);
        }
        if (!arg0) {
            this.method2251((class107) null, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V", line = 72)
    public static void method2254(boolean arg0) {
        field4987 = null;
        if (!arg0) {
            field4987 = (class16) null;
        }
        field4983 = null;
        field4981 = null;
        field4978 = null;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V", line = 84)
    public static final void method2255(boolean arg0) {
        if (arg0) {
            class158.field2184 = class150.field2081;
            class167.field2324 = class99.field1291;
            class7.field105 = class58.field703;
        } else {
            class158.field2184 = class248.field3764;
            class167.field2324 = class74.field957;
            class7.field105 = class281.field4365;
        }
        class90.field1128 = class158.field2184.length;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V", line = 112)
    public static final void method2256(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class90.field1128; var3++) {
            for (int var4 = 0; var4 < class62.field788; var4++) {
                for (int var5 = 0; var5 < class326.field4993; var5++) {
                    class225 var6 = class158.field2184[var3][var4][var5];
                    if (var6 != null) {
                        class168 var7 = var6.field3196;
                        if (var7 != null && var7.field2335.method274()) {
                            class320.method2231(var7.field2335, var3, var4, var5, 1, 1);
                            if (var7.field2331 != null && var7.field2331.method274()) {
                                class320.method2231(var7.field2331, var3, var4, var5, 1, 1);
                                var7.field2335.method277(var7.field2331, 0, 0, 0, false);
                                var7.field2331 = var7.field2331.method279(arg0, arg1, arg2);
                            }
                            var7.field2335 = var7.field2335.method279(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3214; var8++) {
                            class80 var9 = var6.field3199[var8];
                            if (var9 != null && var9.field1024.method274()) {
                                class320.method2231(var9.field1024, var3, var4, var5, var9.field1035 + 1 - var9.field1015, var9.field1028 - var9.field1027 + 1);
                                var9.field1024 = var9.field1024.method279(arg0, arg1, arg2);
                            }
                        }
                        class138 var10 = var6.field3209;
                        if (var10 != null && var10.field1935.method274()) {
                            class146.method987(var10.field1935, var3, var4, var5);
                            var10.field1935 = var10.field1935.method279(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
