import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class345 extends class5 {

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
    public int field5328;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    private int field5317;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    private int field5323;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public int field5324;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    private int field5319;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    private int field5316;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    public int field5325;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    private int field5318;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "Lpw;")
    public static class507 field5327 = new class507();

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "Lof;")
    public static class446 field5329 = new class446("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Z")
    public final boolean method2232(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method2235(19, 96, (byte) -16);
        }
        field5321++;
        return this.field5319 <= arg2 && arg2 <= this.field5323 && arg0 >= this.field5317 && this.field5318 >= arg0;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public static void method2233(int arg0) {
        if (arg0 == 0) {
            field5327 = null;
            field5329 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IB[II)V")
    public final void method2234(int arg0, byte arg1, int[] arg2, int arg3) {
        field5314++;
        if (arg1 != -117) {
            this.method2234(79, (byte) 12, null, -20);
        }
        arg2[2] = arg3 + this.field5317 - this.field5328;
        arg2[1] = this.field5319 + arg0 - this.field5325;
        arg2[0] = this.field5316;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)Z")
    public final boolean method2235(int arg0, int arg1, byte arg2) {
        field5315++;
        if (arg2 == 127) {
            return arg0 >= this.field5325 && this.field5324 >= arg0 && arg1 >= this.field5328 && this.field5322 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIII)Z")
    public final boolean method2236(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -75 / ((-arg2 - 67) / 58);
        field5320++;
        return this.field5316 == arg3 && this.field5319 <= arg0 && arg0 <= this.field5323 && this.field5317 <= arg1 && this.field5318 >= arg1;
    }

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "(I)V")
    public static final void method2237(int arg0) {
        if (class146.field1940 < 102) {
            class146.field1940 += 6;
        }
        if (class322.field4674 != 0) {
            class251.field3496 -= class322.field4674 * 5;
            if (class518.field7621 <= class251.field3496) {
                class251.field3496 = class518.field7621 - 1;
            }
            if (class251.field3496 < 0) {
                class251.field3496 = 0;
            }
            class322.field4674 = 0;
        }
        field5330++;
        for (int var1 = 0; var1 < class508.field7478; var1++) {
            class438 var2 = class492.field7261[var1];
            int var3 = var2.method348((byte) 97);
            char var4 = var2.method345(-20326);
            int var5 = var2.method346((byte) -98);
            if (var3 == 84) {
                class487.method2915((byte) 81, false);
            }
            if (var3 == 80) {
                class487.method2915((byte) 81, true);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class129.field1744 != null) {
                    String var6 = "";
                    for (int var7 = class470.field7013.length - 1; var7 >= 0; var7--) {
                        if (class470.field7013[var7] != null && class470.field7013[var7].length() > 0) {
                            var6 = var6 + class470.field7013[var7] + '\n';
                        }
                    }
                    class129.field1744.setContents(new StringSelection(var6), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class129.field1744 != null) {
                    Transferable var8 = class129.field1744.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class61.method437(var9, '\n', 243);
                                if (var10.length > 1) {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        class4.field31 = var10[var11];
                                        class487.method2915((byte) 81, false);
                                    }
                                } else {
                                    class4.field31 = class4.field31 + var9;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class44.field639 > 0) {
                class4.field31 = class4.field31.substring(0, class44.field639 - 1) + class4.field31.substring(class44.field639);
                class44.field639--;
            } else if (var3 == 101 && class44.field639 < class4.field31.length()) {
                class4.field31 = class4.field31.substring(0, class44.field639) + class4.field31.substring(class44.field639 + 1);
            } else if (var3 == 96 && class44.field639 > 0) {
                class44.field639--;
            } else if (var3 == 97 && class44.field639 < class4.field31.length()) {
                class44.field639++;
            } else if (var3 == 102) {
                class44.field639 = 0;
            } else if (var3 == 103) {
                class44.field639 = class4.field31.length();
            } else if (var3 == 104 && class470.field7013.length > class139.field1848) {
                class139.field1848++;
                class411.method2536(91);
                class44.field639 = class4.field31.length();
            } else if (var3 == 105 && class139.field1848 > 0) {
                class139.field1848--;
                class411.method2536(97);
                class44.field639 = class4.field31.length();
            } else if (class447.method2719((byte) -11, var4) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class4.field31 = class4.field31.substring(0, class44.field639) + class492.field7261[var1].method345(-20326) + class4.field31.substring(class44.field639);
                class44.field639++;
            }
        }
        class508.field7478 = 0;
        class141.method950(arg0);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "([IIII)V")
    public final void method2238(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = this.field5328 + arg3 - this.field5317;
        field5326++;
        arg0[0] = arg1;
        arg0[1] = this.field5325 + arg2 - this.field5319;
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5328 = arg6;
        this.field5317 = arg2;
        this.field5323 = arg3;
        this.field5324 = arg7;
        this.field5319 = arg1;
        this.field5316 = arg0;
        this.field5322 = arg8;
        this.field5325 = arg5;
        this.field5318 = arg4;
    }
}
