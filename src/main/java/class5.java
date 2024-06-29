import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class295 {

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Lnr;")
    public class438 field31;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "[B")
    public static byte[] field32 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "Lbo;")
    public static class355 field34 = new class355();

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "Ljava/lang/String;")
    public static String field38 = "rating: ";

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Lrk;")
    public static class427 field40;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)V", line = 3)
    public static void method29(byte arg0) {
        field32 = null;
        field40 = null;
        field34 = null;
        field38 = null;
        if (arg0 != 2) {
            field40 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLjava/lang/Object;Lbd;)V", line = 18)
    public static final void method30(boolean arg0, Object arg1, class304 arg2) {
        field36++;
        if (arg2.field4115 == null) {
            return;
        }
        if (arg0) {
            method29((byte) -23);
        }
        for (int var3 = 0; var3 < 50 && arg2.field4115.peekEvent() != null; var3++) {
            class229.method1541(63, 1L);
        }
        if (arg1 != null) {
            arg2.field4115.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V", line = 44)
    public static final void method31(boolean arg0) {
        class446.field6428.method2533(0);
        field33++;
        if (!arg0) {
            field38 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[[[Ldg;)V", line = 55)
    public static final void method32(int arg0, class224[][][] arg1) {
        int var2 = -66 % ((-arg0 - 3) / 59);
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class224[][] var4 = arg1[var3];
            for (int var5 = 0; var5 < var4.length; var5++) {
                for (int var6 = 0; var6 < var4[var5].length; var6++) {
                    class224 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field3124 instanceof class111) {
                            ((class111) var7.field3124).method573((byte) -127);
                        }
                        if (var7.field3121 instanceof class111) {
                            ((class111) var7.field3121).method573((byte) -116);
                        }
                        if (var7.field3116 instanceof class111) {
                            ((class111) var7.field3116).method573((byte) -122);
                        }
                        if (var7.field3108 instanceof class111) {
                            ((class111) var7.field3108).method573((byte) -109);
                        }
                        if (var7.field3125 instanceof class111) {
                            ((class111) var7.field3125).method573((byte) -102);
                        }
                        for (class26 var8 = var7.field3129; var8 != null; var8 = var8.field463) {
                            class228 var9 = var8.field460;
                            if (var9 instanceof class111) {
                                ((class111) var9).method573((byte) -106);
                            }
                        }
                    }
                }
            }
        }
        field35++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lbi;II)Ljava/lang/String;", line = 129)
    public static final String method33(class139 arg0, int arg1, int arg2) {
        field39++;
        if (!client.method1648(arg0).method977(arg2, true) && arg0.field2073 == null) {
            return null;
        } else if (arg0.field1995 == null || arg2 >= arg0.field1995.length || arg0.field1995[arg2] == null || arg0.field1995[arg2].trim().length() == 0) {
            return class339.field4624 ? "Hidden-" + arg2 : null;
        } else {
            if (arg1 != -7058) {
                method29((byte) -43);
            }
            return arg0.field1995[arg2];
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lnr;)V", line = 153)
    public class5(class438 arg0) {
        this.field31 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIBI)V", line = 170)
    public static final void method34(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class3.field14 = arg1;
        class323.field4379 = arg0;
        field37++;
        class155.field2357 = arg4;
        if (arg3 != 111) {
            method32(-25, (class224[][][]) null);
        }
        class268.field3605 = arg2;
    }
}
