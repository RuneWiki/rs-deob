import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class372 extends class115 {

    @OriginalMember(owner = "client!te", name = "m", descriptor = "J")
    public static long field5622 = 0L;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public int field5621;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field5623;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public int field5624;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public int field5625;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field5626;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public int field5627;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field5628;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field5629;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public int field5630;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public int field5631;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public int field5633;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public int field5636;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field5637;

    // $FF: synthetic field
    @OriginalMember(owner = "client!te", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5638;

    // $FF: synthetic method
    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2215(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[B", line = 22)
    public static final byte[] method2213(int arg0, byte arg1) {
        field5618++;
        class129 var2 = (class129) class219.field3140.method1781((long) arg0, 24);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class363.method2166(22591, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class129(var3);
            class219.field3140.method1780(var2, -20892, (long) arg0);
        }
        if (arg1 > -2) {
            method2213(-41, (byte) 49);
        }
        return var2.field1921;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lya;IB)Lt;", line = 72)
    public final class398 method2214(class11 arg0, int arg1, byte arg2) {
        int var4 = 57 / ((12 - arg2) / 56);
        field5634++;
        int var5 = class175.field2591[this.field5628];
        if (var5 == 0) {
            class512 var12 = class222.method1406(this.field5620, this.field5623, this.field5627);
            if (var12 instanceof class157) {
                class157 var13 = (class157) var12;
                if (var13.field2374 != null) {
                    return ((class401) var13.field2374).method241(arg1, arg0, -79);
                }
            }
        } else if (var5 == 1) {
            class169 var10 = class118.method886(this.field5620, this.field5623, this.field5627);
            if (var10 instanceof class239) {
                class239 var11 = (class239) var10;
                if (var11.field3352 != null) {
                    return ((class401) var11.field3352).method241(arg1, arg0, 116);
                }
            }
        } else if (var5 == 2) {
            class522 var6 = class534.method3160(this.field5620, this.field5623, this.field5627, field5638 == null ? (field5638 = method2215("gf")) : field5638);
            if (var6 instanceof class23) {
                class23 var7 = (class23) var6;
                if (var7.field337 != null) {
                    return ((class401) var7.field337).method241(arg1, arg0, 15);
                }
            }
        } else if (var5 == 3) {
            class259 var8 = class341.method2081(this.field5620, this.field5623, this.field5627);
            if (var8 instanceof class532) {
                class532 var9 = (class532) var8;
                if (var9.field7830 != null) {
                    return ((class401) var9.field7830).method241(arg1, arg0, 107);
                }
            }
        }
        return null;
    }
}
