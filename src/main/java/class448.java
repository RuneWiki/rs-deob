import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class448 extends class617 {

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "Lot;")
    public class546 field6481;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "J")
    public static volatile long field6478 = 0L;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "Ldg;")
    public static class376 field6477 = new class376(19, 3);

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "Lli;")
    public static class392 field6482;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "[[[Lbt;")
    public static class40[][][] field6480;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "([ILpu;ILpu;)V")
    public static final void method2666(int[] arg0, class522 arg1, int arg2, class522 arg3) {
        field6476++;
        class558.field7879 = arg1;
        class141.field2086 = arg3;
        if (arg0 != null) {
            class254.field3898 = arg0;
        }
        if (arg2 != 6406) {
            method2668((byte) 106);
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
    public static void method2667(int arg0) {
        field6482 = null;
        if (arg0 != 85) {
            field6482 = null;
        }
        field6480 = null;
        field6477 = null;
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lok;II[B)V")
    public class448(class228 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6481 = class568.method3231(arg2, 100, arg1, arg3, 6406, false, arg0, 6406);
        this.field6481.method3736(-77, false, false);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public static final void method2668(byte arg0) {
        field6479++;
        if (class486.field6919 < 102) {
            class486.field6919 += 6;
        }
        if (arg0 != -33) {
            field6482 = null;
        }
        if (class575.field8084 != -1 && class84.field1393 < class490.method2840(true)) {
            for (int var1 = class575.field8084; var1 < class478.field6797.length; var1++) {
                if (class478.field6797[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class478.field6797[var1].substring(6));
                    } catch (Exception var15) {
                    }
                    class262.method1723(true, "Pausing for " + var2 + " seconds...");
                    class575.field8084 = var1 + 1;
                    class84.field1393 = (long) (var2 * 1000) + class490.method2840(true);
                    return;
                }
                class436.field6383 = class478.field6797[var1];
                class436.method2589(false, (byte) -4);
            }
            class575.field8084 = -1;
        }
        if (class691.field9722 != 0) {
            class619.field8629 -= class691.field9722 * 5;
            if (class619.field8629 >= class466.field6706) {
                class619.field8629 = class466.field6706 - 1;
            }
            class691.field9722 = 0;
            if (class619.field8629 < 0) {
                class619.field8629 = 0;
            }
        }
        for (int var3 = 0; var3 < class32.field502; var3++) {
            class121 var4 = class231.field3603[var3];
            int var5 = var4.method920((byte) -115);
            char var6 = var4.method923(8348);
            int var7 = var4.method919(-13589);
            if (var5 == 84) {
                class436.method2589(false, (byte) -4);
            }
            if (var5 == 80) {
                class436.method2589(true, (byte) -4);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class434.field6342 != null) {
                    String var13 = "";
                    for (int var14 = class520.field7335.length - 1; var14 >= 0; var14--) {
                        if (class520.field7335[var14] != null && class520.field7335[var14].length() > 0) {
                            var13 = var13 + class520.field7335[var14] + '\n';
                        }
                    }
                    class434.field6342.setContents(new StringSelection(var13), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class434.field6342 != null) {
                    Transferable var8 = class434.field6342.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class208.method1377('\n', (byte) -121, var9);
                                if (var10.length <= 1) {
                                    class436.field6383 = class436.field6383 + var9;
                                } else {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        if (var10[var11].startsWith("pause")) {
                                            int var12 = 5;
                                            try {
                                                var12 = Integer.parseInt(var10[var11].substring(6));
                                            } catch (Exception var16) {
                                            }
                                            class262.method1723(true, "Pausing for " + var12 + " seconds...");
                                            class478.field6797 = var10;
                                            class575.field8084 = var11 + 1;
                                            class84.field1393 = (long) (var12 * 1000) + class490.method2840(true);
                                            return;
                                        }
                                        class436.field6383 = var10[var11];
                                        class436.method2589(false, (byte) -4);
                                    }
                                }
                            }
                        } catch (Exception var17) {
                        }
                    }
                }
            } else if (var5 == 85 && class689.field9706 > 0) {
                class436.field6383 = class436.field6383.substring(0, class689.field9706 - 1) + class436.field6383.substring(class689.field9706);
                class689.field9706--;
            } else if (var5 == 101 && class689.field9706 < class436.field6383.length()) {
                class436.field6383 = class436.field6383.substring(0, class689.field9706) + class436.field6383.substring(class689.field9706 + 1);
            } else if (var5 == 96 && class689.field9706 > 0) {
                class689.field9706--;
            } else if (var5 == 97 && class689.field9706 < class436.field6383.length()) {
                class689.field9706++;
            } else if (var5 == 102) {
                class689.field9706 = 0;
            } else if (var5 == 103) {
                class689.field9706 = class436.field6383.length();
            } else if (var5 == 104 && class520.field7335.length > class126.field1881) {
                class126.field1881++;
                class530.method3027((byte) 106);
                class689.field9706 = class436.field6383.length();
            } else if (var5 == 105 && class126.field1881 > 0) {
                class126.field1881--;
                class530.method3027((byte) 115);
                class689.field9706 = class436.field6383.length();
            } else if (class386.method2306(6, var6) || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class436.field6383 = class436.field6383.substring(0, class689.field9706) + class231.field3603[var3].method923(8348) + class436.field6383.substring(class689.field9706);
                class689.field9706++;
            }
        }
        class22.field300 = 0;
        class32.field502 = 0;
        class158.method1100(arg0 + 159);
    }
}
