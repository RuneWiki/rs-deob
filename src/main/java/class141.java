import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class141 extends class643 {

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
    private int[] field2378 = new int[512];

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
    public static int[] field2376 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 6)
    public static void method1145(int arg0) {
        field2376 = null;
        int var1 = 80 % ((18 - arg0) / 54);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 15)
    public static final void method1146(int arg0) {
        field2379++;
        if (arg0 != -31455) {
            field2376 = null;
        }
        if (class462.field6286 == null) {
            return;
        }
        if (class462.field6286.field7412 == 1) {
            class462.field6286 = null;
            return;
        }
        if (class462.field6286.field7412 == 2) {
            class556.method3201(2, true, class651.field9023, class102.field1650);
            class462.field6286 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[FFIFIFIIFI)V", line = 45)
    public final void method1147(int arg0, float[] arg1, float arg2, int arg3, float arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10) {
        field2377++;
        int var12 = (int) ((float) arg10 * arg4 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg8 * arg2 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg7 * arg6 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg5 * arg6;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class277.method1784(5056, var21);
        int var25 = var20 & var17;
        if (arg0 != -10688) {
            this.field2378 = null;
        }
        int var26 = this.field2378[var23];
        int var27 = this.field2378[var25];
        for (int var28 = 0; var28 < arg8; var28++) {
            float var29 = (float) var28 * arg2;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class277.method1784(5056, var32);
            int var36 = var31 & var15;
            int var37 = this.field2378[var34 + var26];
            int var38 = this.field2378[var26 + var36];
            int var39 = this.field2378[var27 + var34];
            int var40 = this.field2378[var27 + var36];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg4;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class277.method1784(5056, var45);
                arg1[arg3++] = arg9 * class660.method3711(var24, class660.method3711(var35, class660.method3711(var49, class620.method3494(class204.method1456(this.field2378[var48 + var40], 7), var32, var45, var21, 1), class620.method3494(class204.method1456(this.field2378[var40 + var47], 7), var32, var46, var21, 1), (byte) 99), class660.method3711(var49, class620.method3494(class204.method1456(this.field2378[var39 + var48], 7), var33, var45, var21, arg0 + 10689), class620.method3494(class204.method1456(this.field2378[var47 + var39], 7), var33, var46, var21, 1), (byte) 82), (byte) 63), class660.method3711(var35, class660.method3711(var49, class620.method3494(class204.method1456(this.field2378[var38 + var48], 7), var32, var45, var22, class18.method125(arg0, -10687)), class620.method3494(class204.method1456(this.field2378[var38 + var47], 7), var32, var46, var22, 1), (byte) 86), class660.method3711(var49, class620.method3494(class204.method1456(7, this.field2378[var37 + var48]), var33, var45, var22, 1), class620.method3494(class204.method1456(this.field2378[var37 + var47], 7), var33, var46, var22, arg0 + 10689), (byte) 75), (byte) 100), (byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 135)
    public static final void method1148(int arg0) {
        if (class276.field3828 < 102) {
            class276.field3828 += 6;
        }
        field2374++;
        if (class130.field2262 != -1 && class126.field2230 < class197.method1423(arg0 - 2733)) {
            for (int var1 = class130.field2262; var1 < class470.field6353.length; var1++) {
                if (class470.field6353[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class470.field6353[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class652.method3663(arg0 ^ 0xACC, "Pausing for " + var2 + " seconds...");
                    class130.field2262 = var1 + 1;
                    class126.field2230 = (long) (var2 * 1000) + class197.method1423(1);
                    return;
                }
                class741.field10225 = class470.field6353[var1];
                class379.method2310(107, false);
            }
            class130.field2262 = -1;
        }
        if (class113.field2112 != 0) {
            class362.field4935 -= class113.field2112 * 5;
            if (class476.field6433 <= class362.field4935) {
                class362.field4935 = class476.field6433 - 1;
            }
            class113.field2112 = 0;
            if (class362.field4935 < 0) {
                class362.field4935 = 0;
            }
        }
        for (int var3 = 0; var3 < class399.field5508; var3++) {
            class349 var4 = class257.field3606[var3];
            int var5 = var4.method2151((byte) -50);
            char var6 = var4.method2154(-118);
            int var7 = var4.method2153(false);
            if (var5 == 84) {
                class379.method2310(arg0 - 2624, false);
            }
            if (var5 == 80) {
                class379.method2310(arg0 ^ 0xAF5, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class717.field9868 != null) {
                    String var11 = "";
                    for (int var12 = class238.field3400.length - 1; var12 >= 0; var12--) {
                        if (class238.field3400[var12] != null && class238.field3400[var12].length() > 0) {
                            var11 = var11 + class238.field3400[var12] + '\n';
                        }
                    }
                    class717.field9868.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class717.field9868 != null) {
                    Transferable var8 = class717.field9868.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class478.method2738(var9, '\n', 14388);
                                class520.method2958(arg0 ^ 0xFFFFF579, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class660.field9148 > 0) {
                class741.field10225 = class741.field10225.substring(0, class660.field9148 - 1) + class741.field10225.substring(class660.field9148);
                class660.field9148--;
            } else if (var5 == 101 && class660.field9148 < class741.field10225.length()) {
                class741.field10225 = class741.field10225.substring(0, class660.field9148) + class741.field10225.substring(class660.field9148 + 1);
            } else if (var5 == 96 && class660.field9148 > 0) {
                class660.field9148--;
            } else if (var5 == 97 && class660.field9148 < class741.field10225.length()) {
                class660.field9148++;
            } else if (var5 == 102) {
                class660.field9148 = 0;
            } else if (var5 == 103) {
                class660.field9148 = class741.field10225.length();
            } else if (var5 == 104 && class238.field3400.length > class724.field9953) {
                class724.field9953++;
                class57.method407(false);
                class660.field9148 = class741.field10225.length();
            } else if (var5 == 105 && class724.field9953 > 0) {
                class724.field9953--;
                class57.method407(false);
                class660.field9148 = class741.field10225.length();
            } else if (class684.method3855(-103, var6) || var6 == '\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class741.field10225 = class741.field10225.substring(0, class660.field9148) + class257.field3606[var3].method2154(-107) + class741.field10225.substring(class660.field9148);
                class660.field9148++;
            }
        }
        if (arg0 == 2734) {
            class399.field5508 = 0;
            class65.field944 = 0;
            class622.method3506(arg0 - 2613);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V", line = 342)
    public class141(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2378[var3] = this.field2378[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2378[var5];
            this.field2378[var5] = this.field2378[var5 + 256] = this.field2378[var4];
            this.field2378[var4] = this.field2378[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/io/File;BI)[B", line = 374)
    public static final byte[] method1149(File arg0, byte arg1, int arg2) {
        field2375++;
        int var3 = 119 % ((arg1 + 49) / 55);
        try {
            byte[] var4 = new byte[arg2];
            class153.method1201(arg2, arg0, var4, (byte) 112);
            return var4;
        } catch (IOException var5) {
            return null;
        }
    }
}
