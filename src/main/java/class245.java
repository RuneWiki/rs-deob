import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class245 {

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lsl;")
    public static class318 field3608;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "F")
    public static float field3609;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field3611;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[B")
    public byte[] field3606;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[S")
    public short[] field3605;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "[S")
    public short[] field3610;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "[S")
    public short[] field3612;

    static {
        new class331("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field3608 = new class318(49, 6);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B[B)Lae;", line = 3)
    public static final class164 method1607(byte arg0, byte[] arg1) {
        field3607++;
        class164 var2 = new class164();
        class65 var3 = new class65(arg1);
        var3.field827 = var3.field783.length - 2;
        int var4 = var3.method623((byte) -58);
        int var5 = var3.field783.length - var4 - 2 - 12;
        var3.field827 = var5;
        int var6 = var3.method616((byte) 95);
        var2.field2322 = var3.method623((byte) 114);
        var2.field2324 = var3.method623((byte) 127);
        var2.field2320 = var3.method623((byte) 124);
        var2.field2326 = var3.method623((byte) -70);
        int var7 = var3.method577(255);
        if (var7 > 0) {
            var2.field2330 = new class106[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method623((byte) -27);
                class106 var10 = new class106(class118.method934(var9, 269173057));
                var2.field2330[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method616((byte) 107);
                    int var12 = var3.method616((byte) 118);
                    var10.method878((long) var11, -2301, new class389(var12));
                }
            }
        }
        var3.field827 = 0;
        var2.field2328 = var3.method603(2113195248);
        int var13 = 78 / ((62 - arg0) / 44);
        var2.field2318 = new int[var6];
        var2.field2323 = new String[var6];
        var2.field2321 = new int[var6];
        int var14 = 0;
        while (var3.field827 < var5) {
            int var15 = var3.method623((byte) -54);
            if (var15 == 3) {
                var2.field2323[var14] = var3.method624((byte) -40).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var2.field2321[var14] = var3.method577(255);
            } else {
                var2.field2321[var14] = var3.method616((byte) 77);
            }
            var2.field2318[var14++] = var15;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 83)
    public static final void method1608(int arg0) {
        field3602++;
        if (class458.field6716) {
            return;
        }
        if (arg0 > -113) {
            field3611 = null;
        }
        class458.field6716 = true;
        if (class478.field7044.field3352) {
            class386.field5687 = ((int) class386.field5687 + 47 & 0xFFFFFFF0);
        } else {
            class323.field4542 += (12.0F - class323.field4542) / 2.0F;
        }
        class531.field7820 = true;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjava/util/Random;I)I", line = 107)
    public static final int method1609(byte arg0, Random arg1, int arg2) {
        field3604++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 94) {
            method1609((byte) -11, null, -37);
        }
        if (class305.method1900(200, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        }
        int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
        int var4;
        do {
            var4 = arg1.nextInt();
        } while (var4 >= var3);
        return class502.method3002(arg2, (byte) 81, var4);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 149)
    public static void method1610(int arg0) {
        if (arg0 != -7782) {
            method1610(-27);
        }
        field3608 = null;
        field3611 = null;
    }
}
