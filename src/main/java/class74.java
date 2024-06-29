import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class74 extends class116 {

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Lda;")
    private class275 field1227 = class191.field3277;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "[[I")
    public static int[][] field1215 = new int[104][104];

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "Lda;")
    public static class275 field1219 = class255.method1672(104, "Angreifen");

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "Lda;")
    public static class275 field1226 = class255.method1672(116, "cross");

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Lda;")
    public static class275 field1218 = class255.method1672(127, ")1o");

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Loa;")
    public class276 field1220;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "Loa;")
    private class276 field1225;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "[La;")
    public static class164[] field1224;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I")
    public final int method484(int arg0, int arg1) {
        if (arg1 != -24171) {
            this.field1216 = -19;
        }
        field1221++;
        if (this.field1220 == null) {
            return this.field1216;
        } else {
            class216 var3 = (class216) this.field1220.method1871(0, (long) arg0);
            return var3 == null ? this.field1216 : var3.field3692;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lda;I)Z")
    public final boolean method485(class275 arg0, int arg1) {
        field1223++;
        if (this.field1220 == null) {
            return false;
        }
        if (this.field1225 == null) {
            this.method490(arg1 + 88);
        }
        if (arg1 != -6) {
            this.method487((class85) null, -36, true);
        }
        for (class231 var3 = (class231) this.field1225.method1871(0, arg0.method1840(-71)); var3 != null; var3 = (class231) this.field1225.method1870((byte) -39)) {
            if (var3.field4040.method1828(true, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Z")
    public final boolean method486(byte arg0, int arg1) {
        if (arg0 > -24) {
            this.field1227 = null;
        }
        field1222++;
        if (this.field1220 == null) {
            return false;
        }
        if (this.field1225 == null) {
            this.method492(109);
        }
        class216 var3 = (class216) this.field1225.method1871(0, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lij;IZ)V")
    private final void method487(class85 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field1214 = arg0.method564((byte) 102);
        } else if (arg1 == 2) {
            this.field1229 = arg0.method564((byte) 101);
        } else if (arg1 == 3) {
            this.field1227 = arg0.method599(-1);
        } else if (arg1 == 4) {
            this.field1216 = arg0.method568(19845);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method608(125);
            this.field1220 = new class276(class181.method1214(var4, -1));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method568(19845);
                class103 var7;
                if (arg1 == 5) {
                    var7 = new class271(arg0.method599(-1));
                } else {
                    var7 = new class216(arg0.method568(19845));
                }
                this.field1220.method1867(arg2, (long) var6, var7);
            }
        }
        field1217++;
        if (!arg2) {
            this.method490(-12);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILij;)V")
    public final void method488(int arg0, class85 arg1) {
        while (true) {
            int var3 = arg1.method564((byte) 85);
            if (var3 == 0) {
                field1228++;
                if (arg0 != 7490) {
                    this.method488(91, (class85) null);
                    return;
                }
                return;
            }
            this.method487(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public static void method489(int arg0) {
        field1219 = null;
        field1224 = null;
        if (arg0 != 104) {
            method489(-88);
        }
        field1215 = null;
        field1218 = null;
        field1226 = null;
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)V")
    private final void method490(int arg0) {
        this.field1225 = new class276(this.field1220.method1866(-102));
        class271 var2 = (class271) this.field1220.method1864((byte) -88);
        if (arg0 <= 67) {
            field1215 = null;
        }
        while (var2 != null) {
            class231 var3 = new class231(var2.field4706, (int) var2.field1707);
            this.field1225.method1867(true, var2.field4706.method1840(-68), var3);
            var2 = (class271) this.field1220.method1869(-1);
        }
        field1213++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)Lda;")
    public final class275 method491(int arg0, boolean arg1) {
        field1212++;
        if (arg1) {
            return null;
        } else if (this.field1220 == null) {
            return this.field1227;
        } else {
            class271 var3 = (class271) this.field1220.method1871(0, (long) arg0);
            return var3 == null ? this.field1227 : var3.field4706;
        }
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)V")
    private final void method492(int arg0) {
        this.field1225 = new class276(this.field1220.method1866(-116));
        field1230++;
        class216 var2 = (class216) this.field1220.method1864((byte) -61);
        if (arg0 < 13) {
            this.method491(-11, true);
        }
        while (var2 != null) {
            class216 var3 = new class216((int) var2.field1707);
            this.field1225.method1867(true, (long) var2.field3692, var3);
            var2 = (class216) this.field1220.method1869(-1);
        }
    }
}
