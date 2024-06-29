import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class102 extends class417 {

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "F")
    public float field1351;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "F")
    public float field1354;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "Z")
    public boolean field1352;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "Lkn;")
    public static class530 field1356;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "Lo;")
    public static class24 field1357;

    static {
        new class530("Ok", "Okay", "OK", "Ok");
        field1356 = new class530("K", "T", "K", "K");
        new class530("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 4)
    public static void method702(byte arg0) {
        field1357 = null;
        if (arg0 == 87) {
            field1356 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V", line = 16)
    public static final void method703(byte arg0) {
        ++field1347;
        if (class30.field360 != 0) {
            class408.field5782 -= class30.field360 * 5;
            if (class408.field5782 >= class508.field7526) {
                class408.field5782 = class508.field7526 + -1;
            }
            class30.field360 = 0;
            if (~class408.field5782 > -1) {
                class408.field5782 = 0;
            }
        }
        if (~class421.field5931 > -103) {
            class421.field5931 += 6;
        }
        int var1 = 0;
        if (arg0 != 62) {
            field1356 = null;
        }
        while (var1 < class362.field5183) {
            class533 var2 = class14.field187[var1];
            int var3 = var2.method268((byte) 56);
            char var4 = var2.method273(127);
            int var5 = var2.method272(false);
            if (~var3 == -85) {
                class141.method885(false, (byte) 93);
            }
            if (var3 == 80) {
                class141.method885(true, (byte) 93);
            } else if (var3 == 66 && ~(4 & var5) != -1) {
                if (class2.field61 != null) {
                    String var6 = "";
                    for (int var7 = class133.field1752.length + -1; ~var7 <= -1; --var7) {
                        if (class133.field1752[var7] != null && ~class133.field1752[var7].length() < -1) {
                            var6 = var6 + class133.field1752[var7] + '\n';
                        }
                    }
                    class2.field61.setContents(new StringSelection(var6), (ClipboardOwner) null);
                }
            } else if (var3 == 67 && ~(var5 & 4) != -1) {
                if (class2.field61 != null) {
                    Transferable var8 = class2.field61.getContents((Object) null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class177.method1103('\n', var9, 0);
                                if (~var10.length >= -2) {
                                    class483.field6728 = class483.field6728 + var9;
                                } else {
                                    for (int var11 = 0; ~var10.length < ~var11; ++var11) {
                                        class483.field6728 = var10[var11];
                                        class141.method885(false, (byte) 93);
                                    }
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class511.field7567 > 0) {
                class483.field6728 = class483.field6728.substring(0, class511.field7567 + -1) + class483.field6728.substring(class511.field7567);
                --class511.field7567;
            } else if (var3 == 101 && ~class511.field7567 > ~class483.field6728.length()) {
                class483.field6728 = class483.field6728.substring(0, class511.field7567) + class483.field6728.substring(class511.field7567 - -1);
            } else if (var3 == 96 && class511.field7567 > 0) {
                --class511.field7567;
            } else if (var3 == 97 && ~class511.field7567 > ~class483.field6728.length()) {
                ++class511.field7567;
            } else if (~var3 != -103) {
                if (~var3 != -104) {
                    if (var3 == 104 && class133.field1752.length > class386.field5422) {
                        ++class386.field5422;
                        class160.method1023(arg0 + 3159);
                        class511.field7567 = class483.field6728.length();
                    } else if (~var3 == -106 && class386.field5422 > 0) {
                        --class386.field5422;
                        class160.method1023(3221);
                        class511.field7567 = class483.field6728.length();
                    } else if (class64.method513(false, var4) || var4 == ':' || ~var4 == -45 || var4 == ' ' || var4 == '_' || var4 == '-' || ~var4 == -44 || var4 == '[' || ~var4 == -94) {
                        class483.field6728 = class483.field6728.substring(0, class511.field7567) + class14.field187[var1].method273(120) + class483.field6728.substring(class511.field7567);
                        ++class511.field7567;
                    }
                } else {
                    class511.field7567 = class483.field6728.length();
                }
            } else {
                class511.field7567 = 0;
            }
            ++var1;
        }
        class362.field5183 = 0;
        class385.method2235((byte) 125);
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)J", line = 187)
    public static final long method704(byte arg0) {
        ++field1355;
        if (arg0 >= -91) {
            field1356 = null;
        }
        return class3.field65.method267(120);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lih;IIIZ[I)V", line = 200)
    public class102(class503 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1349 = arg3;
        this.field1350 = arg2;
        if (super.field6667 != 34037) {
            this.field1354 = this.field1351 = 1.0F;
            this.field1352 = true;
        } else {
            this.field1354 = (float) arg2;
            this.field1352 = false;
            this.field1351 = (float) arg3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lih;IIIII[BI)V", line = 223)
    public class102(class503 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1349 = arg3;
        this.field1350 = arg2;
        this.method2470(0, arg3, false, 0, true, arg6, 0, arg7, arg2, 0);
        this.field1351 = (float) arg3 / (float) arg5;
        this.field1352 = false;
        this.field1354 = (float) arg2 / (float) arg4;
        this.method2467(19, false, false);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lih;IIIIZ[BI)V", line = 239)
    public class102(class503 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1350 = arg3;
        this.field1349 = arg4;
        if (super.field6667 == 34037) {
            this.field1354 = (float) arg3;
            this.field1351 = (float) arg4;
            this.field1352 = false;
        } else {
            this.field1354 = this.field1351 = 1.0F;
            this.field1352 = true;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLhm;)V", line = 261)
    public static final void method705(boolean arg0, class150 arg1) {
        ++field1353;
        if (class427.field6024) {
            ++class132.field1738;
            if (arg1.field2107 != null) {
                class150 var2 = class343.method2046(class235.field3424, 0, class231.field3397);
                if (var2 != null) {
                    class389 var3 = new class389();
                    var3.field5466 = arg1.field2107;
                    var3.field5457 = arg1;
                    var3.field5473 = var2;
                    class495.method2866(var3);
                }
            }
            class61.method498(class501.field7092, 1);
            class30.field357.method2354(arg1.field2134, false);
            if (!arg0) {
                field1357 = null;
            }
            class30.field357.method2331(32196, class483.field6724);
            class30.field357.method2329(class231.field3397, 498581272);
            class30.field357.method2368(arg1.field2105, -31442);
            class30.field357.method2331(32196, class235.field3424);
            class30.field357.method2372(arg1.field2089, 33);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lih;IIIIIIZ)V", line = 302)
    public class102(class503 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1354 = (float) arg3 / (float) arg5;
        this.field1351 = (float) arg4 / (float) arg6;
        this.field1352 = false;
        this.field1349 = arg4;
        this.field1350 = arg3;
        this.method2467(19, false, false);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lih;IIIIIZ)V", line = 315)
    public class102(class503 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field1349 = arg5;
        this.field1350 = arg4;
        if (~super.field6667 == -34038) {
            this.field1351 = (float) arg5;
            this.field1352 = false;
            this.field1354 = (float) arg4;
        } else {
            this.field1354 = this.field1351 = 1.0F;
            this.field1352 = true;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII)Z", line = 336)
    public static final boolean method706(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method702((byte) -102);
        }
        ++field1348;
        return (1408 & arg1) != 0;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lih;IIII[I)V", line = 350)
    public class102(class503 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1350 = arg1;
        this.field1349 = arg2;
        this.method2473(0, 0, true, 0, -114, 0, arg2, arg5, arg1);
        this.field1352 = false;
        this.field1354 = (float) arg1 / (float) arg3;
        this.field1351 = (float) arg2 / (float) arg4;
        this.method2467(19, false, false);
    }
}
