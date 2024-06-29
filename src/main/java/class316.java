import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class316 extends class17 {

    @OriginalMember(owner = "client!ak", name = "jb", descriptor = "I")
    private int field5442 = 4;

    @OriginalMember(owner = "client!ak", name = "kb", descriptor = "I")
    private int field5443 = 4;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "Z")
    public static boolean field5435 = false;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "I")
    public static int field5438 = 0;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!ak", name = "gb", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!ak", name = "hb", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!ak", name = "ib", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ak", name = "lb", descriptor = "Lca;")
    public static class98 field5444;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(II)I", line = 7)
    public static final int method2197(int arg0, int arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        field5441++;
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 == 16333) {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V", line = 23)
    public static void method2198(int arg0) {
        field5444 = null;
        if (arg0 != 0) {
            method2200(124, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)[[I", line = 48)
    public final int[][] method122(boolean arg0, int arg1) {
        field5439++;
        if (arg0) {
            method2197(-72, 115);
        }
        int[][] var3 = this.field224.method2081(arg1, -68);
        if (this.field224.field5106) {
            int var4 = class116.field2008 / this.field5443;
            int var5 = class289.field5059 / this.field5442;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method111(3, class289.field5059 * var6 / var5, 0);
            } else {
                var7 = this.method111(3, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var7[2];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class116.field2008; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class116.field2008 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var10[var14] = var8[var16];
                var11[var14] = var9[var16];
                var13[var14] = var12[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(III)V", line = 117)
    public static final void method2199(int arg0, int arg1, int arg2) {
        field5437++;
        if (class116.field2008 != arg0) {
            class61.field979 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class61.field979[var3] = (var3 << 12) / arg0;
            }
            class249.field4327 = arg0 - 1;
            class261.field4599 = arg0 == 64 ? 2048 : 4096;
            class116.field2008 = arg0;
        }
        if (class289.field5059 != arg1) {
            if (class116.field2008 == arg1) {
                class36.field504 = class61.field979;
            } else {
                class36.field504 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class36.field504[var4] = (var4 << 12) / arg1;
                }
            }
            class289.field5059 = arg1;
            class219.field3899 = arg1 - 1;
        }
        if (arg2 != -32527) {
            field5444 = (class98) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 164)
    public class316() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLrm;I)V", line = 170)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field5436++;
        if (arg2 == 0) {
            this.field5443 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field5442 = arg1.method1731(true);
        }
        if (arg0 != -114) {
            method2199(22, -98, 25);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 207)
    public static final void method2200(int arg0, Component arg1) {
        Method var2 = class139.field2458;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg1.addKeyListener(class229.field3987);
        field5434++;
        int var4 = 109 % ((-arg0 - 45) / 41);
        arg1.addFocusListener(class229.field3987);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZII)V", line = 227)
    public static final void method2201(boolean arg0, int arg1, int arg2) {
        field5440++;
        class206 var3 = client.method1819(-20727, arg1);
        int var4 = var3.field3698;
        if (!arg0) {
            return;
        }
        int var5 = var3.field3699;
        int var6 = var3.field3704;
        int var7 = class152.field2759[var5 - var6];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        class38.method259(class271.field4734[var4] & ~var8 | var8 & arg2 << var6, (byte) -120, var4);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(II)[I", line = 265)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            method2199(-23, -29, 72);
        }
        int[] var3 = this.field217.method1698(117, arg1);
        field5433++;
        if (this.field217.field4295) {
            int var4 = class289.field5059 / this.field5442;
            int var5 = class116.field2008 / this.field5443;
            int[] var6;
            if (var4 <= 0) {
                var6 = this.method124(85, 0, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method124(59, 0, class289.field5059 * var7 / var4);
            }
            for (int var8 = 0; var8 < class116.field2008; var8++) {
                if (var5 > 0) {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class116.field2008 * var9 / var5];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }
}
