import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class15 {

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "I")
    public static int field208 = 0;

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "J")
    public static volatile long field211 = 0L;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Z")
    public static volatile boolean field206 = false;

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lna;")
    public static class26 field205 = class30.method205((byte) 93, "Vegetable Store");

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Lna;")
    public static class26 field207 = class30.method205((byte) 98, "uitext has incorrect number of strings");

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Lca;")
    public static class5 field204 = new class5();

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Lna;")
    public static class26 field214 = class30.method205((byte) 34, "Saw Mill");

    @OriginalMember(owner = "mapview!ha", name = "l", descriptor = "Lna;")
    public static class26 field215 = class30.method205((byte) 70, "Chainmail Shop");

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "Lna;")
    public static class26 field213 = class30.method205((byte) 73, "Enter place name to find");

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "J")
    public long field212;

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Lha;")
    public class15 field209;

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "Lha;")
    public class15 field210;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 6)
    public final void method96(int arg0) {
        if (this.field209 == null) {
            return;
        }
        this.field209.field210 = this.field210;
        this.field210.field209 = this.field209;
        if (arg0 <= 96) {
            field213 = null;
        }
        this.field209 = null;
        this.field210 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 28)
    public static void method97(byte arg0) {
        field207 = null;
        field215 = null;
        if (arg0 > -124) {
            method100(-75, 27L);
        }
        field213 = null;
        field214 = null;
        field205 = null;
        field204 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(B)[Lm;", line = 53)
    public static final class23[] method98(byte arg0) {
        class23[] var1 = new class23[class30.field398];
        int var2 = 55 / ((arg0 - 44) / 56);
        for (int var3 = 0; var3 < class30.field398; var3++) {
            class23 var4 = var1[var3] = new class23();
            var4.field329 = class17.field224[var3];
            var4.field331 = class13.field192[var3];
            var4.field330 = class31.field408[var3];
            var4.field333 = class37.field479[var3];
            byte[] var5 = class30.field396[var3];
            int var6 = var4.field333 * var4.field330;
            var4.field332 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                var4.field332[var7] = class29.field385[class36.method227(var5[var7], 255)];
            }
        }
        class19.method119((byte) 105);
        return var1;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([BB)[B", line = 120)
    public static final byte[] method99(byte[] arg0, byte arg1) {
        class4 var2 = new class4(arg0);
        int var3 = var2.method49((byte) 67);
        int var4 = 19 / ((arg1 + 36) / 45);
        int var5 = var2.method43((byte) -95);
        if (var5 < 0 || class6.field150 != 0 && var5 > class6.field150) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var6 = new byte[var5];
            var2.method45(var5, false, 0, var6);
            return var6;
        } else {
            int var7 = var2.method43((byte) 73);
            if (var7 < 0 || class6.field150 != 0 && var7 > class6.field150) {
                throw new RuntimeException();
            }
            byte[] var8 = new byte[var7];
            if (var3 == 1) {
                class14.method88(var8, var7, arg0, var5, 9);
            } else {
                class13.field189.method231((byte) -109, var2, var8);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IJ)V", line = 169)
    public static final void method100(int arg0, long arg1) {
        try {
            if (arg0 != 0) {
                method100(91, 34L);
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([Lna;IZI)Lna;", line = 187)
    public static final class26 method101(class26[] arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class36.field468;
            }
            var4 += arg0[arg1 + var5].field367;
        }
        if (arg2) {
            field207 = null;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class26 var9 = arg0[arg1 + var8];
            class11.method79(var9.field358, 0, var6, var7, var9.field367);
            var7 += var9.field367;
        }
        class26 var10 = new class26();
        var10.field367 = var4;
        var10.field358 = var6;
        return var10;
    }
}
