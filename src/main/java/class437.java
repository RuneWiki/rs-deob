import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class437 extends class359 {

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public int field6401;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public int field6402;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Lfi;")
    public static class331 field6406 = new class331(64);

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lwf;")
    public static class70 field6407 = new class70(64);

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "Ljava/lang/String;")
    public static String field6409 = "Connected to update server";

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6408 = "Face here";

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "Lfi;")
    public static class331 field6410 = new class331(64);

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field6411 = 0;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field6412 = 0;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)I")
    public static final int method2712(int arg0, int arg1) {
        return class41.field481 == null ? 0 : class41.field481[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I")
    public static final int method2713(int arg0, byte arg1) {
        field6399++;
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1 != -123) {
            field6409 = null;
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public static void method2714(boolean arg0) {
        field6407 = null;
        field6408 = null;
        field6406 = null;
        field6409 = null;
        field6410 = null;
        if (!arg0) {
            field6408 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lbk;I)V")
    public static final void method2715(class211 arg0, int arg1) {
        field6405++;
        byte[] var2 = new byte[24];
        if (class348.field5086 != null) {
            try {
                class348.field5086.method2579(0L, 14653);
                class348.field5086.method2587((byte) -118, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1360(arg1, var2, 24, 1);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static final void method2716(int arg0) {
        field6403++;
        if (class192.field2627 < 102) {
            class192.field2627 += 6;
        }
        if (arg0 != 5411) {
            method2716(62);
        }
        for (int var1 = 0; var1 < class12.field127; var1++) {
            int var2 = class191.field2599[var1];
            char var3 = (char) class392.field5737[var1];
            if (var2 == 84) {
                class244.method1540(-8);
            } else if (class256.field3447[82] && var2 == 66) {
                if (class278.field3922 != null) {
                    String var8 = "";
                    for (int var9 = class133.field1857.length - 1; var9 >= 0; var9--) {
                        if (class133.field1857[var9] != null && class133.field1857[var9].length() > 0) {
                            var8 = var8 + class133.field1857[var9] + '\n';
                        }
                    }
                    class278.field3922.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class256.field3447[82] && var2 == 67) {
                if (class278.field3922 != null) {
                    Transferable var4 = class278.field3922.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class112.method617('\n', var5, arg0 + 16771804);
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class400.field5813 = var6[var7];
                                        class244.method1540(-45);
                                    }
                                } else {
                                    class400.field5813 = class400.field5813 + var5;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class400.field5813.length() > 0) {
                class400.field5813 = class400.field5813.substring(0, class400.field5813.length() - 1);
            } else if (var2 == 104 && class306.field4385 < class133.field1857.length) {
                class306.field4385++;
                class21.method148((byte) 73);
            } else if (var2 == 105 && class306.field4385 > 0) {
                class306.field4385--;
                class21.method148((byte) -125);
            } else if (class353.method2245(arg0 - 5535, var3) || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+') {
                class400.field5813 = class400.field5813 + (char) class392.field5737[var1];
            }
        }
        class12.field127 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class237.field3228[var10]) {
                var10002 = class447.field6515[var10]++;
                if (class447.field6515[var10] > 102) {
                    class237.field3228[var10] = false;
                }
            } else {
                var10002 = class447.field6515[var10]--;
                if (class447.field6515[var10] < 0) {
                    class356.field5206[var10] = (int) (Math.random() * (double) class38.field389);
                    class48.field560[var10] = (int) (Math.random() * 350.0D);
                    class447.field6515[var10] = 0;
                    class237.field3228[var10] = true;
                }
            }
        }
        class109.method609(15);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)Lbb;")
    public static final class182 method2717(int arg0, byte arg1) {
        field6398++;
        class331 var2 = class238.field3243;
        class182 var3;
        synchronized (class238.field3243) {
            var3 = (class182) class238.field3243.method2049(-120, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class124.field1646.method361(class72.method422(arg0, (byte) 115), 55, class373.method2341(arg0, 82));
        if (arg1 != -103) {
            field6409 = null;
        }
        class182 var5 = new class182();
        var5.field2494 = arg0;
        if (var4 != null) {
            var5.method1189(true, new class211(var4));
        }
        var5.method1186(92);
        class331 var6 = class238.field3243;
        synchronized (class238.field3243) {
            class238.field3243.method2046((long) arg0, 0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
    public static final void method2718(byte arg0) {
        class257.field3504.method999(((float) class287.field4044 * 0.1F + 0.7F) * class392.field5736);
        if (arg0 != -128) {
            method2716(74);
        }
        field6404++;
        class257.field3504.method1018(class21.field226, class330.field4712, class319.field4532, (float) class442.field6464, (float) class85.field965, (float) class434.field6370);
        class257.field3504.method1024(class244.field3291);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)V")
    public static final void method2719(int arg0, int arg1) {
        if (arg0 != 0) {
            method2716(14);
        }
        class369.field5414 = arg1;
        field6400++;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(II)V")
    public class437(int arg0, int arg1) {
        this.field6401 = arg1;
        this.field6402 = arg0;
    }
}
