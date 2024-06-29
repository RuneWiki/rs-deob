import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class436 extends class261 {

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Llb;")
    public static class383 field6492 = new class383("WTQA", 2);

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "[I")
    public static int[] field6493 = new int[1000];

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field6476;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public int field6477;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public int field6478;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public int field6479;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public int field6480;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public int field6481;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public int field6482;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public int field6484;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public int field6485;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public int field6486;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public int field6487;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public int field6488;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public int field6489;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public int field6490;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public int field6491;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pe", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field6494;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILza;)Le;")
    public final class374 method2610(byte arg0, int arg1, class288 arg2) {
        if (arg0 != 101) {
            return null;
        }
        field6483++;
        int var4 = class87.field1784[this.field6488];
        if (var4 == 0) {
            class50 var11 = class211.method1435(this.field6477, this.field6480, this.field6487);
            if (var11 instanceof class237) {
                class237 var12 = (class237) var11;
                if (var12.field3664 != null) {
                    return ((class425) var12.field3664).method234(arg0 + 16, arg2, arg1);
                }
            }
        } else if (var4 == 1) {
            class210 var5 = class498.method3008(this.field6477, this.field6480, this.field6487);
            if (var5 instanceof class33) {
                class33 var6 = (class33) var5;
                if (var6.field511 != null) {
                    return ((class425) var6.field511).method234(arg0 + 12, arg2, arg1);
                }
            }
        } else if (var4 == 2) {
            class402 var9 = class479.method2859(this.field6477, this.field6480, this.field6487, field6494 == null ? (field6494 = method2612("rj")) : field6494);
            if (var9 instanceof class110) {
                class110 var10 = (class110) var9;
                if (var10.field2018 != null) {
                    return ((class425) var10.field2018).method234(101, arg2, arg1);
                }
            }
        } else if (var4 == 3) {
            class311 var7 = class296.method1911(this.field6477, this.field6480, this.field6487);
            if (var7 instanceof class65) {
                class65 var8 = (class65) var7;
                if (var8.field1320 != null) {
                    return ((class425) var8.field1320).method234(arg0 + 12, arg2, arg1);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method2611(int arg0) {
        if (arg0 < 97) {
            method2611(-44);
        }
        field6492 = null;
        field6493 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2612(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
