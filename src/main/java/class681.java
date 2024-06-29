import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class681 extends class550 {

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field9649 = 64;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "([BB)Lba;")
    public static final class356 method3827(byte[] arg0, byte arg1) {
        field9652++;
        class356 var2 = new class356();
        class61 var3 = new class61(arg0);
        var3.field1393 = var3.field1397.length - 2;
        int var4 = var3.method723((byte) -25);
        int var5 = var3.field1397.length - var4 - 12 - 2;
        if (arg1 < 56) {
            field9650 = -33;
        }
        var3.field1393 = var5;
        int var6 = var3.method730(109);
        var2.field5327 = var3.method723((byte) -25);
        var2.field5324 = var3.method723((byte) -25);
        var2.field5320 = var3.method723((byte) -25);
        var2.field5325 = var3.method723((byte) -25);
        int var7 = var3.method732(-559537960);
        if (var7 > 0) {
            var2.field5329 = new class427[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method723((byte) -25);
                class427 var10 = new class427(class455.method2740(-1675135295, var9));
                var2.field5329[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method730(-82);
                    int var12 = var3.method730(92);
                    var10.method2598(new class149(var12), (long) var11, (byte) 8);
                }
            }
        }
        var3.field1393 = 0;
        var2.field5323 = var3.method736((byte) -44);
        var2.field5321 = new int[var6];
        var2.field5322 = new int[var6];
        var2.field5318 = new String[var6];
        int var13 = 0;
        while (var3.field1393 < var5) {
            int var14 = var3.method723((byte) -25);
            if (var14 == 3) {
                var2.field5318[var13] = var3.method747(14598).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field5322[var13] = var3.method732(-559537960);
            } else {
                var2.field5322[var13] = var3.method730(122);
            }
            var2.field5321[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)Z")
    public static final boolean method3828(int arg0, int arg1, int arg2) {
        field9653++;
        if (arg2 != 2) {
            field9650 = 97;
        }
        return class562.method3210(41, arg1, arg0) || class572.method3290(true, arg1, arg0);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)Z")
    public static final boolean method3829(int arg0, int arg1) {
        field9651++;
        if (arg1 != 29237) {
            method3829(121, 120);
        }
        return arg0 == 7 || arg0 == 9;
    }
}
