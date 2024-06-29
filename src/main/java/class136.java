import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class136 extends class448 {

    @OriginalMember(owner = "client!em", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field1803;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "Lwf;")
    public static class79 field1801 = new class79(55, 4);

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(B)Z")
    public final boolean method862(byte arg0) {
        if (arg0 == 110) {
            field1802++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lwt;Ljava/lang/Object;I)V")
    public class136(class186 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1803 = arg1;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method863(boolean arg0) {
        field1804++;
        return arg0 ? null : this.field1803;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V")
    public static void method864(int arg0) {
        if (arg0 != 0) {
            field1807 = 31;
        }
        field1801 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lkm;[I[II[I)V")
    public static final void method865(class216 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg3 >= -7) {
            method864(-92);
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field2120.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field2120[var9] = null;
                    } else {
                        class153 var10 = class64.field836.method2081(var6, 0);
                        int var11 = var10.field2260;
                        class360 var12 = arg0.field2120[var9];
                        if (var12 != null) {
                            if (var12.field5177 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field2120[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5175 = 0;
                                    var12.field5182 = 1;
                                    var12.field5176 = 0;
                                    var12.field5178 = var8;
                                    var12.field5181 = 0;
                                    class237.method1508(arg0.field4319, (byte) -12, arg0.field4331, 0, var10, arg0.field4317, false);
                                } else if (var11 == 2) {
                                    var12.field5175 = 0;
                                }
                            } else if (var10.field2289 >= class64.field836.method2081(var12.field5177, 0).field2289) {
                                var12 = arg0.field2120[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class360 var13 = arg0.field2120[var9] = new class360();
                            var13.field5181 = 0;
                            var13.field5176 = 0;
                            var13.field5182 = 1;
                            var13.field5177 = var6;
                            var13.field5178 = var8;
                            var13.field5175 = 0;
                            class237.method1508(arg0.field4319, (byte) -97, arg0.field4331, 0, var10, arg0.field4317, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field1805++;
    }
}
