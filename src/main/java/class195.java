import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class195 extends class28 {

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "Lvf;")
    private static class265 field3488 = class87.method582(-46, "white:");

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "Lvf;")
    public static class265 field3499 = field3488;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Lvf;")
    public static class265 field3487 = field3488;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Lfd;")
    public static class207 field3491 = new class207(64);

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "[I")
    public static int[] field3500 = new int[128];

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "Lvf;")
    public static class265 field3501 = class87.method582(-46, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!gh", name = "bb", descriptor = "Lfl;")
    public static class192 field3502;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "Lvf;")
    public class265 field3497;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "[I")
    public int[] field3482;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "[I")
    public int[] field3492;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "[I")
    public int[] field3496;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "[I")
    public int[] field3498;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public static final void method1347(int arg0, int arg1) {
        field3486++;
        class237.field4127 = arg0 / arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)V")
    public static final void method1348(byte arg0, int arg1) {
        field3489++;
        class178 var2 = class188.method1282(arg1, 6, 261360480);
        var2.method1160(121);
        if (arg0 > -10) {
            method1356(-40, false, (class192) null);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Z")
    public static final boolean method1349(int arg0, int arg1) {
        if (arg1 != 31955) {
            return true;
        }
        field3493++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class118.field2079[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public final void method1350(int arg0) {
        field3484++;
        if (arg0 != 24202) {
            return;
        }
        if (this.field3498 != null) {
            for (int var2 = 0; var2 < this.field3498.length; var2++) {
                this.field3498[var2] = class144.method992(this.field3498[var2], 32768);
            }
        }
        if (this.field3492 != null) {
            for (int var3 = 0; var3 < this.field3492.length; var3++) {
                this.field3492[var3] = class144.method992(this.field3492[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)V")
    public static void method1351(byte arg0) {
        field3501 = null;
        field3499 = null;
        field3488 = null;
        field3487 = null;
        field3491 = null;
        if (arg0 < -90) {
            field3502 = null;
            field3500 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)I")
    public final int method1352(int arg0, int arg1) {
        if (arg0 != -7498) {
            return -125;
        }
        field3494++;
        if (this.field3492 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3492.length; var3++) {
            if (this.field3482[var3] == arg1) {
                return this.field3492[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLng;)V")
    public final void method1353(byte arg0, class135 arg1) {
        field3483++;
        int var3 = 122 / ((arg0 - 25) / 32);
        while (true) {
            int var4 = arg1.method920((byte) 41);
            if (var4 == 0) {
                return;
            }
            this.method1354(2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILng;)V")
    private final void method1354(int arg0, int arg1, class135 arg2) {
        field3485++;
        if (arg1 == 1) {
            this.field3497 = arg2.method942(false);
        } else if (arg1 == 2) {
            int var7 = arg2.method920((byte) 72);
            this.field3492 = new int[var7];
            this.field3482 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3492[var8] = arg2.method927(127);
                int var9 = arg2.method920((byte) 23);
                if (var9 == 0) {
                    this.field3482[var8] = -1;
                } else {
                    this.field3482[var8] = var9;
                }
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method920((byte) 33);
            this.field3496 = new int[var4];
            this.field3498 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3498[var5] = arg2.method927(125);
                int var6 = arg2.method920((byte) 95);
                if (var6 == 0) {
                    this.field3496[var5] = -1;
                } else {
                    this.field3496[var5] = var6;
                }
            }
        }
        if (arg0 != 2) {
            this.method1355(44, -66);
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(II)I")
    public final int method1355(int arg0, int arg1) {
        field3495++;
        if (this.field3498 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3498.length; var3++) {
            if (this.field3496[var3] == arg1) {
                return this.field3498[var3];
            }
        }
        if (arg0 != -1) {
            this.field3496 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZLfl;)Lic;")
    public static final class98 method1356(int arg0, boolean arg1, class192 arg2) {
        field3490++;
        byte[] var3 = arg2.method1327(-18782, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1) {
                field3502 = null;
            }
            return new class98(var3);
        }
    }
}
