import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class639 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lqu;")
    public static class364 field9285 = new class364(27, 15);

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Ljt;")
    public static class489 field9293 = new class489(3);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public int field9289;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Llba;")
    public class237 field9288;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lmg;")
    public class639 field9291;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lk;III[Z)V", line = 7)
    public static final void method3698(class88 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class287.field4219 == class235.field3455) {
            return;
        }
        int var5 = class562.field8337[arg1].method1323(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class543 var7 = class562.field8337[var6];
                if (var7 != null) {
                    var7.method1314(arg0, arg2, var5 - var7.method1323(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 38)
    public final void method3699(byte arg0) {
        if (arg0 != 122) {
            method3702('\u0013', (byte) 70);
        }
        field9292++;
        if (class248.field3627 >= 500) {
            return;
        }
        this.field9289 = 0;
        this.field9288 = null;
        this.field9291 = class540.field8029;
        class540.field8029 = this;
        class248.field3627++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ln;ILjava/awt/Canvas;)Lqa;", line = 57)
    public static final class167 method3700(class472 arg0, int arg1, Canvas arg2) {
        field9294++;
        if (arg1 != 0) {
            method3701((byte) 56);
        }
        return new class329(arg2, arg0);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 68)
    public static final void method3701(byte arg0) {
        field9286++;
        class408.field5831++;
        if (arg0 == -74) {
            class165.method1046(-3466, class160.field2139);
            class221.field3268.method2608(class205.field3037, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(CB)Z", line = 81)
    public static final boolean method3702(char arg0, byte arg1) {
        field9290++;
        if (arg1 < 53) {
            field9293 = null;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)I", line = 96)
    public static final int method3703(byte arg0) {
        field9287++;
        if (class106.field1333 == null) {
            if (!class139.field1826 && class487.field7385 > 0) {
                if (class154.field1979 && class542.field8105.method1259(true, 81) && class487.field7385 > 2) {
                    return ((class548) class272.field4014.field6029.field7466.field7466).field8173;
                }
                return ((class548) class272.field4014.field6029.field7466).field8173;
            }
            int var1 = class350.field5071.method635(arg0 - 162);
            int var2 = class350.field5071.method633((byte) 29);
            int var3 = class290.field4257;
            int var4 = class218.field3232;
            int var5 = class452.field6607;
            if (var1 > var3 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class487.field7385; var7++) {
                    if (class455.field6636) {
                        int var11 = var4 - (-(class487.field7385 - var7 - 1) * 16 - 33);
                        if (var2 > var11 - 13 && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class487.field7385 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var12 - 13 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class186 var9 = new class186(class272.field4014);
                    for (class548 var10 = (class548) var9.method1222((byte) 86); var10 != null; var10 = (class548) var9.method1224(arg0 ^ 0xFF00FFE2)) {
                        if (var6 == (var8++)) {
                            return var10.field8173;
                        }
                    }
                }
            }
        }
        if (arg0 != -30) {
            method3701((byte) 66);
        }
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V", line = 186)
    public static void method3704(byte arg0) {
        field9285 = null;
        field9293 = null;
        int var1 = 24 % ((31 - arg0) / 43);
    }
}
