import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class747 extends class437 {

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field10395;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "Lvm;")
    public static class687 field10394 = new class687();

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "Lhda;")
    public static class752 field10396;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "[[Lvfa;")
    public static class672[][] field10393;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2173(int arg0) {
        field10398++;
        if (arg0 != -1) {
            this.field10395 = null;
        }
        return this.field10395;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
    public final boolean method2172(byte arg0) {
        if (arg0 >= -62) {
            return true;
        } else {
            field10397++;
            return false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method4184(int arg0, String arg1) {
        field10392++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg0 >= -12) {
            return null;
        }
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
    public static final void method4185(int arg0, int arg1) {
        class184 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class282 var4 = class113.field1866[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class143.field2290; var5++) {
                    for (int var6 = 0; var6 < class735.field10163; var6++) {
                        var2 = var4.method1746(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class140.field2224;
                            int var8 = var5 << class140.field2224;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class282 var10 = class113.field1866[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1742(var6, 98, var5) - var10.method1742(var6, 95, var5);
                                    int var12 = var4.method1742(var6 + 1, 74, var5) - var10.method1742(var6 + 1, 105, var5);
                                    int var13 = var4.method1742(var6 + 1, 90, var5 + 1) - var10.method1742(var6 + 1, 85, var5 + 1);
                                    int var14 = var4.method1742(var6, 115, var5 + 1) - var10.method1742(var6, 65, var5 + 1);
                                    var10.method1739(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lek;Ljava/lang/Object;I)V")
    public class747(class510 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field10395 = arg1;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public static void method4186(int arg0) {
        if (arg0 != 1) {
            field10393 = null;
        }
        field10394 = null;
        field10393 = null;
        field10396 = null;
    }
}
