import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class144 extends class120 {

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public static volatile int field2198 = 0;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field2195 = 0;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "Lok;")
    public static class41 field2188 = class137.method956("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 45);

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "Lak;")
    public static class20 field2197 = new class20(5);

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "Lok;")
    public static class41 field2200 = class137.method956(": ", 45);

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "[I")
    public static int[] field2199 = new int[1000];

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "[[[I")
    public static int[][][] field2191;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IZ)[[I", line = 9)
    public final int[][] method168(int arg0, boolean arg1) {
        field2190++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[][] var4 = this.method858(0, arg0, 119);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class307.field5160; var11++) {
                var7[var11] = 4096 - var6[var11];
                var9[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var8[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 66)
    public class144() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILbc;B)V", line = 88)
    public static final void method996(int arg0, int arg1, class302 arg2, byte arg3) {
        field2194++;
        if (class5.field49 != 0 && class5.field49 != 3 || !arg2.method2077(true)) {
            return;
        }
        int var4 = arg2.field4960[arg1];
        if (arg0 < var4 || (arg2.field5038[arg1] + var4) < arg0) {
            return;
        }
        int var5 = class8.field101 + class136.field2032 & 0x7FF;
        int var6 = arg0 - arg2.field4936 / 2;
        int var7 = class31.field450[var5];
        int var8 = class31.field455[var5];
        if (arg3 != -88) {
            method997(true, (class41) null, (byte) 104);
        }
        int var9 = (class136.field2038 + 256) * var7 >> 8;
        int var10 = (class136.field2038 + 256) * var8 >> 8;
        int var11 = arg1 - arg2.field4949 / 2;
        int var12 = var6 * var10 + var9 * var11 >> 11;
        int var13 = var10 * var11 - var6 * var9 >> 11;
        int var14 = class62.field913.field4311 - var13 >> 7;
        int var15 = class62.field913.field4280 + var12 >> 7;
        if (class62.field919 > 0 && class85.field1225[82] && class85.field1225[81]) {
            class111.method750(class55.field807, class55.field809 + var14, class88.field1300 + var15, 0);
            return;
        }
        boolean var16 = class145.method1004(0, true, 0, 0, var15, 1, 0, class62.field913.field4341[0], class62.field913.field4306[0], 0, -125, var14);
        if (!var16) {
            return;
        }
        class285.field4642.method797(var6, -22096);
        class285.field4642.method797(var11, -22096);
        class285.field4642.method778(class8.field101, (byte) -4);
        class285.field4642.method797(57, arg3 - 22008);
        class285.field4642.method797(class136.field2032, arg3 - 22008);
        class285.field4642.method797(class136.field2038, arg3 ^ 0x5618);
        class285.field4642.method797(89, -22096);
        class285.field4642.method778(class62.field913.field4280, (byte) -4);
        class285.field4642.method778(class62.field913.field4311, (byte) -4);
        class285.field4642.method797(class292.field4732, -22096);
        class285.field4642.method797(63, -22096);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLok;B)V", line = 151)
    public static final void method997(boolean arg0, class41 arg1, byte arg2) {
        field2196++;
        if (arg2 != 77) {
            field2188 = (class41) null;
        }
        if (!arg0) {
            try {
                class30.field443.getAppletContext().showDocument(arg1.method295(class30.field443.getCodeBase(), -95), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class166.field2625 && class153.field2447) {
            try {
                class100.method701(class138.field2065.field3390, 126, new Object[] { arg1.method295(class30.field443.getCodeBase(), arg2 ^ 0xFFFFFFE0).toString() }, "openjs");
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class30.field443.getAppletContext().showDocument(arg1.method295(class30.field443.getCodeBase(), arg2 ^ 0xFFFFFFF6), "_blank");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 198)
    public static final void method998(int arg0, Component arg1) {
        if (arg0 != 13156) {
            return;
        }
        field2192++;
        Method var2 = class211.field3403;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class248.field3960);
        arg1.addFocusListener(class248.field3960);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Llb;II)V", line = 221)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1770 = arg0.method792(2) == 1;
        }
        field2189++;
        if (arg1 != -1) {
            method997(false, (class41) null, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V", line = 235)
    public static void method999(int arg0) {
        field2197 = null;
        if (arg0 != 1) {
            method998(-56, (Component) null);
        }
        field2188 = null;
        field2199 = null;
        field2191 = (int[][][]) null;
        field2200 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[I", line = 257)
    public final int[] method14(int arg0, int arg1) {
        field2193++;
        if (arg1 != -14959) {
            field2191 = (int[][][]) ((int[][][]) null);
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, arg0, -24059);
            for (int var5 = 0; var5 < class307.field5160; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }
}
