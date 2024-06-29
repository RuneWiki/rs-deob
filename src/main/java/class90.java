import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class90 extends class291 {

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "Ldi;")
    public static class83 field1310 = new class83(46, -1);

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)Z")
    public static final boolean method672(int arg0, byte arg1) {
        field1311++;
        int var2 = 30 % ((-arg1 - 89) / 37);
        if (arg0 == 6 || arg0 == 45 || arg0 == 58 || arg0 == 48 || arg0 == 1011) {
            return true;
        } else {
            return arg0 == 10 || arg0 == 1006;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
    public static final void method673(byte arg0) {
        if (arg0 < 13) {
            return;
        }
        for (class82 var1 = (class82) class526.field7778.method2818((byte) -30); var1 != null; var1 = (class82) class526.field7778.method2820((byte) -58)) {
            if (class19.method120(true, var1.field1230)) {
                class140.method938(var1, (byte) -57);
            }
        }
        field1308++;
        if (class274.field3764 == 1) {
            class181.field2659 = false;
            class270.method1613(class142.field2034, class464.field6821, class88.field1290, class263.field3634, 0);
            return;
        }
        class270.method1613(class142.field2034, class464.field6821, class88.field1290, class263.field3634, 0);
        int var2 = class407.field5952.method2867(class391.field5725.method2731(62, class372.field5455), (byte) -70);
        for (class82 var3 = (class82) class526.field7778.method2818((byte) 112); var3 != null; var3 = (class82) class526.field7778.method2820((byte) -58)) {
            int var4 = class187.method1175(-1007, var3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class142.field2034 = class274.field3764 * 16 + (class476.field6942 ? 26 : 22);
        class464.field6821 = var2 + 8;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V")
    public static void method674(boolean arg0) {
        field1310 = null;
        if (!arg0) {
            method673((byte) -100);
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIII)V")
    public class90(int arg0, int arg1, int arg2, int arg3) {
        this.field1313 = arg1;
        this.field1307 = arg2;
        this.field1315 = arg3;
        this.field1309 = arg0;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILdr;)[Ljt;")
    public static final class68[] method675(int arg0, class504 arg1) {
        field1312++;
        if (!arg1.method2968(25859)) {
            return new class68[0];
        }
        class56 var2 = arg1.method2966(1);
        while (var2.field667 == 0) {
            class157.method1046(arg0 ^ 0xFFFFFFAE, 10L);
        }
        if (var2.field667 == 2) {
            return new class68[0];
        }
        int[] var3 = (int[]) var2.field670;
        class68[] var4 = new class68[var3.length >> 2];
        int var5 = 0;
        if (arg0 != 46) {
            field1314 = -54;
        }
        while (var4.length > var5) {
            class68 var6 = new class68();
            var4[var5] = var6;
            var6.field924 = var3[var5 << 2];
            var6.field928 = var3[(var5 << 2) + 1];
            var6.field925 = var3[(var5 << 2) + 2];
            var6.field923 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }
}
