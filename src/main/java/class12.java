import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class12 {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lkh;")
    public class154 field162 = new class154();

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    public static int[] field157 = new int[2000];

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Loh;")
    public static class258 field164 = class153.method1046("Schrifts-=tze geladen)3", 85);

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Loh;")
    public static class258 field156 = class153.method1046("Lade Schrifts-=tze )2 ", 100);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Lkh;")
    private class154 field165;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Lkh;", line = 5)
    public final class154 method78(byte arg0) {
        field153++;
        class154 var2 = this.field162.field2635;
        if (this.field162 == var2) {
            this.field165 = null;
            return null;
        }
        this.field165 = var2.field2635;
        if (arg0 != 58) {
            this.method80(-67);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lkh;I)V", line = 38)
    public final void method79(class154 arg0, int arg1) {
        if (arg0.field2635 != null) {
            arg0.method1054((byte) 82);
        }
        field159++;
        arg0.field2635 = this.field162;
        arg0.field2636 = this.field162.field2636;
        arg0.field2635.field2636 = arg0;
        arg0.field2636.field2635 = arg0;
        int var3 = 95 % ((-arg1 - 55) / 54);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 56)
    public final void method80(int arg0) {
        field160++;
        while (true) {
            class154 var2 = this.field162.field2636;
            if (this.field162 == var2) {
                this.field165 = null;
                if (arg0 != 0) {
                    this.field162 = (class154) null;
                }
                return;
            }
            var2.method1054((byte) 127);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lvi;[Lvi;[Lvi;[Ldb;[Lvi;ILgb;)V", line = 79)
    public static final void method81(class129[] arg0, class129[] arg1, class129[] arg2, class41[] arg3, class129[] arg4, int arg5, class213 arg6) {
        class246.field4269 = arg1;
        class56.field876 = arg2;
        class122.field2163 = arg0;
        class82.field1384 = arg3;
        class193.field3414 = arg6;
        class85.field1440 = arg4;
        if (arg5 < 44) {
            field156 = (class258) null;
        }
        field154++;
        class90.field1578.method80(0);
        int var7 = class193.field3414.method1451(-125, class277.field4772);
        int[] var8 = class193.field3414.method1431(var7, (byte) -84);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class90.field1578.method82(class279.method1965(new class235(class193.field3414.method1453(var7, (byte) -51, var8[var9])), (byte) -117), (byte) -39);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lkh;B)V", line = 111)
    public final void method82(class154 arg0, byte arg1) {
        if (arg0.field2635 != null) {
            arg0.method1054((byte) 88);
        }
        field163++;
        arg0.field2635 = this.field162.field2635;
        if (arg1 != -39) {
            this.method87((byte) -103);
        }
        arg0.field2636 = this.field162;
        arg0.field2635.field2636 = arg0;
        arg0.field2636.field2635 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lkh;", line = 140)
    public final class154 method83(int arg0) {
        field155++;
        if (arg0 > -44) {
            return (class154) null;
        }
        class154 var2 = this.field162.field2636;
        if (this.field162 == var2) {
            this.field165 = null;
            return null;
        } else {
            this.field165 = var2.field2636;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lkh;", line = 162)
    public final class154 method84(boolean arg0) {
        field161++;
        class154 var2 = this.field165;
        if (arg0) {
            field157 = (int[]) null;
        }
        if (this.field162 == var2) {
            this.field165 = null;
            return null;
        } else {
            this.field165 = var2.field2635;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 194)
    public static void method85(int arg0) {
        field164 = null;
        field156 = null;
        if (arg0 == -8) {
            field157 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Loh;", line = 213)
    public static final class258 method86(int arg0, int arg1) {
        if (arg0 != 11232) {
            field164 = (class258) null;
        }
        field151++;
        class258 var2 = class218.method1481(arg0 ^ 0xFFFFD46D, arg1);
        for (int var3 = var2.method1816(false) - 3; var3 > 0; var3 -= 3) {
            var2 = class100.method755(-6, new class258[] { var2.method1813(var3, 0, true), class98.field1744, var2.method1777((byte) 122, var3) });
        }
        if (var2.method1816(false) > 9) {
            return class100.method755(-6, new class258[] { class5.field68, var2.method1813(var2.method1816(false) - 8, 0, true), class6.field83, class121.field2148, var2, class255.field4371 });
        } else if (var2.method1816(false) > 6) {
            return class100.method755(-6, new class258[] { class114.field2035, var2.method1813(var2.method1816(false) - 4, 0, true), class214.field3713, class121.field2148, var2, class255.field4371 });
        } else {
            return class100.method755(-6, new class258[] { class178.field3184, var2, class45.field687 });
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)Lkh;", line = 245)
    public final class154 method87(byte arg0) {
        field150++;
        if (arg0 != -80) {
            method81((class129[]) null, (class129[]) null, (class129[]) null, (class41[]) null, (class129[]) null, 84, (class213) null);
        }
        class154 var2 = this.field165;
        if (this.field162 == var2) {
            this.field165 = null;
            return null;
        } else {
            this.field165 = var2.field2636;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 299)
    public class12() {
        this.field162.field2636 = this.field162;
        this.field162.field2635 = this.field162;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)Lkh;", line = 284)
    public final class154 method88(boolean arg0) {
        class154 var2 = this.field162.field2636;
        field152++;
        if (this.field162 == var2) {
            return null;
        }
        var2.method1054((byte) 119);
        if (!arg0) {
            field164 = (class258) null;
        }
        return var2;
    }
}
