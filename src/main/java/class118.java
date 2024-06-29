import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class118 extends class206 {

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
    public int[] field1999 = new int[] { -1 };

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[I")
    public int[] field2001 = new int[] { 0 };

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field1998 = 0;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field1997 = -1;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field2003 = 0;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Lcb;")
    public static class267 field1995;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B[B)[B", line = 7)
    public static final byte[] method900(byte arg0, byte[] arg1) {
        field1994++;
        if (arg0 >= -33) {
            field2003 = -105;
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class231.method1687(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 26)
    public static final void method901(int arg0) {
        class112.field1909 = arg0;
        for (int var1 = 0; var1 < class150.field2573; var1++) {
            for (int var2 = 0; var2 < class262.field4440; var2++) {
                if (class271.field4681[arg0][var1][var2] == null) {
                    class271.field4681[arg0][var1][var2] = new class242(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V", line = 66)
    public static void method902(int arg0) {
        int var1 = 61 % ((64 - arg0) / 37);
        field1995 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V", line = 83)
    public static final void method903(int arg0, int arg1) {
        class26.field347.method1199(arg1, 124);
        class25.field323.method1199(arg1, 119);
        if (arg0 < -37) {
            class294.field5062.method1199(arg1, 125);
            class168.field2827.method1199(arg1, 124);
            field1996++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)I", line = 97)
    public static final int method904(int arg0, int arg1) {
        field2002++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 != 1440830960) {
            method900((byte) 125, (byte[]) null);
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)Lcm;", line = 117)
    public static final class181 method905(int arg0) {
        if (arg0 != -1) {
            field1998 = -36;
        }
        field2000++;
        int var1 = class287.field4936[0] * class210.field3590[0];
        byte[] var2 = class42.field687[0];
        class181 var6;
        if (class156.field2673[0]) {
            int[] var3 = new int[var1];
            byte[] var4 = class155.field2653[0];
            for (int var5 = 0; var5 < var1; var5++) {
                var3[var5] = class102.method799(class235.method1710(-16777216, var4[var5] << 24), class191.field3184[class235.method1710(255, var2[var5])]);
            }
            var6 = new class22(class263.field4571, class76.field1321, class85.field1404[0], class232.field3934[0], class210.field3590[0], class287.field4936[0], var3);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class191.field3184[class235.method1710(var2[var8], 255)];
            }
            var6 = new class181(class263.field4571, class76.field1321, class85.field1404[0], class232.field3934[0], class210.field3590[0], class287.field4936[0], var7);
        }
        class235.method1713(arg0 + 1);
        return var6;
    }
}
