import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public abstract class class210 extends class618 {

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Z")
    public boolean field2894 = false;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "B")
    public byte field2889;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "B")
    public byte field2895;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "Llq;")
    public class210 field2890;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "Z")
    public boolean field2899;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2891;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(B)I", line = 17)
    public int method1405(byte arg0) {
        field2886++;
        if (arg0 < 17) {
            method1407(null, (byte) 47);
        }
        return 0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[Lgu;II)I", line = 28)
    public final int method1406(int arg0, class757[] arg1, int arg2, int arg3) {
        field2885++;
        if (arg3 < 44) {
            this.method174(false, -102, (byte) 106, null, null, 125, 12);
        }
        long var5 = class412.field5464[this.field2895][arg0][arg2];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg1[var9++] = class491.field6306[var10 - 1].field10006;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 70)
    public static final String method1407(String arg0, byte arg1) {
        field2897++;
        int var2 = -69 % ((arg1 - 71) / 51);
        StringBuffer var3 = new StringBuffer();
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 == '%' && var4 > (var5 + 2)) {
                char var7 = arg0.charAt(var5 + 1);
                boolean var8 = false;
                int var9;
                if (var7 >= '0' && var7 <= '9') {
                    var9 = var7 - '0';
                } else if (var7 >= 'a' && var7 <= 'f') {
                    var9 = var7 - 87;
                } else {
                    if (var7 < 'A' || var7 > 'F') {
                        var3.append('%');
                        continue;
                    }
                    var9 = 10 - (65 - var7);
                }
                int var10 = var9 * 16;
                char var11 = arg0.charAt(var5 + 2);
                int var12;
                if (var11 >= '0' && var11 <= '9') {
                    var12 = var11 + var10 - 48;
                } else if (var11 >= 'a' && var11 <= 'f') {
                    var12 = var11 + var10 + 10 - 97;
                } else {
                    if (var11 < 'A' || var11 > 'F') {
                        var3.append('%');
                        continue;
                    }
                    var12 = var11 + var10 - 55;
                }
                if (var12 != 0 && class273.method1696((byte) var12, false)) {
                    var3.append(class752.method4080((byte) var12, (byte) 43));
                }
                var5 += 2;
            } else if (var6 == '+') {
                var3.append(' ');
            } else {
                var3.append(var6);
            }
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(B)V", line = 151)
    public static final void method1408(byte arg0) {
        if (class763.field10390 != null) {
            class763.field10390.method3072(5);
            class763.field10390 = null;
            class464.field6025 = null;
        }
        if (arg0 <= 62) {
            method1407(null, (byte) -96);
        }
        field2884++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILd;Ljava/awt/Canvas;B)Lha;", line = 172)
    public static final class570 method1409(int arg0, class284 arg1, Canvas arg2, byte arg3) {
        field2893++;
        if (arg3 != -65) {
            method1408((byte) 69);
        }
        return new class733(arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "(B)V", line = 189)
    public static void method1410(byte arg0) {
        if (arg0 > -29) {
            field2891 = null;
        }
        field2891 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILha;I)Z")
    public abstract boolean method179(int arg0, int arg1, class570 arg2, int arg3);

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public abstract void method185(int arg0);

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z")
    public abstract boolean method718(int arg0);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lha;I)V")
    public abstract void method182(class570 arg0, int arg1);

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)Z")
    public abstract boolean method743(byte arg0);

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(B)I")
    public abstract int method745(byte arg0);

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(Z)Z")
    public abstract boolean method738(boolean arg0);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZIBLlq;Lha;II)V")
    public abstract void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([Lgu;I)I")
    public abstract int method719(class757[] arg0, int arg1);

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILha;)Lpi;")
    public abstract class266 method187(int arg0, class570 arg1);

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)Z")
    public abstract boolean method171(int arg0);

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lha;I)Z")
    public abstract boolean method717(class570 arg0, int arg1);

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)I")
    public abstract int method747(int arg0);

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(ILha;)Lid;")
    public abstract class486 method170(int arg0, class570 arg1);
}
