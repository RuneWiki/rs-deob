import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class263 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lvj;")
    public static class26 field4077 = new class26(4, 1);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field4079 = -1;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Ltm;")
    public static class334 field4081;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static final void method1751(byte arg0) {
        if (arg0 < 78) {
            field4081 = null;
        }
        field4078++;
        class142.method1105((byte) -83);
        class250.field3989 = false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([[[Llo;I)V")
    public static final void method1752(class114[][][] arg0, int arg1) {
        field4080++;
        for (int var2 = arg1; var2 < arg0.length; var2++) {
            class114[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class114 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1768 instanceof class523) {
                            ((class523) var6.field1768).method99(-17773);
                        }
                        if (var6.field1767 instanceof class523) {
                            ((class523) var6.field1767).method99(-17773);
                        }
                        if (var6.field1777 instanceof class523) {
                            ((class523) var6.field1777).method99(-17773);
                        }
                        if (var6.field1762 instanceof class523) {
                            ((class523) var6.field1762).method99(-17773);
                        }
                        if (var6.field1764 instanceof class523) {
                            ((class523) var6.field1764).method99(-17773);
                        }
                        for (class291 var7 = var6.field1772; var7 != null; var7 = var7.field4479) {
                            class559 var8 = var7.field4482;
                            if (var8 instanceof class523) {
                                ((class523) var8).method99(-17773);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static void method1753(boolean arg0) {
        if (!arg0) {
            method1752(null, 105);
        }
        field4081 = null;
        field4077 = null;
    }
}
