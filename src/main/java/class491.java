import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class491 extends class310 {

    @OriginalMember(owner = "client!im", name = "h", descriptor = "[I")
    public int[] field6873;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "[I")
    public int[] field6874;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Ldn;")
    public static class440 field6875;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
    public static void method2847(byte arg0) {
        if (arg0 < 120) {
            field6877 = -62;
        }
        field6875 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static final void method2848(int arg0) {
        if (arg0 != -26978) {
            method2848(74);
        }
        class218.field3105.method3468(27881);
        field6876++;
        class112.field1726 = 1;
        class291.field4011 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2849(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field6877 = -6;
        }
        field6871++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(II[I[I)V")
    public class491(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field6873 = arg2;
        this.field6874 = arg3;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I[B)Lfh;")
    public static final class560 method2850(int arg0, byte[] arg1) {
        field6872++;
        class560 var2 = new class560();
        class11 var3 = new class11(arg1);
        var3.field165 = var3.field138.length - 2;
        int var4 = var3.method93((byte) 104);
        int var5 = var3.field138.length - var4 - 2 - 12;
        var3.field165 = var5;
        int var6 = var3.method119(-105);
        var2.field7759 = var3.method93((byte) 80);
        var2.field7753 = var3.method93((byte) 93);
        var2.field7752 = var3.method93((byte) 99);
        var2.field7751 = var3.method93((byte) 117);
        int var7 = var3.method110((byte) 92);
        if (arg0 != -32598) {
            method2850(-65, null);
        }
        if (var7 > 0) {
            var2.field7762 = new class205[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method93((byte) 91);
                class205 var10 = new class205(class32.method326(var9, false));
                var2.field7762[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method119(-24);
                    int var12 = var3.method119(-59);
                    var10.method1241(new class10(var12), (long) var11, -112);
                }
            }
        }
        var3.field165 = 0;
        var2.field7760 = var3.method81(32767);
        var2.field7755 = new String[var6];
        var2.field7754 = new int[var6];
        var2.field7764 = new int[var6];
        int var13 = 0;
        while (var3.field165 < var5) {
            int var14 = var3.method93((byte) 75);
            if (var14 == 3) {
                var2.field7755[var13] = var3.method100((byte) 50).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field7754[var13] = var3.method110((byte) 60);
            } else {
                var2.field7754[var13] = var3.method119(class133.method898(arg0, 32526));
            }
            var2.field7764[var13++] = var14;
        }
        return var2;
    }

    static {
        new class104(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
