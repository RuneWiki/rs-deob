import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class484 {

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "Z")
    public boolean field6668 = true;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public int field6669 = 2;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public int field6677 = 0;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "Z")
    public boolean field6666 = true;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "Z")
    public boolean field6675 = true;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "Z")
    public boolean field6684 = true;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Z")
    public boolean field6665 = true;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public int field6685 = 0;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public int field6687 = 127;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "Z")
    public boolean field6683 = true;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
    public int field6688 = 255;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public int field6682 = 2;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "Z")
    public boolean field6673 = true;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public int field6674 = 0;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public int field6671 = 127;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "Z")
    public boolean field6672 = true;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public int field6663 = 2;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "Z")
    public boolean field6679 = false;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    public int field6693 = 0;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "Z")
    public boolean field6681 = true;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public int field6678 = 0;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "Z")
    public boolean field6694 = true;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "Z")
    public boolean field6689 = false;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public int field6691 = 0;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "Z")
    public boolean field6676 = true;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "Z")
    public boolean field6686 = true;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "I")
    public int field6695 = 2;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    public int field6697 = 1;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Z")
    public boolean field6680 = true;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public int field6664 = 3;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "Ljava/lang/String;")
    public static String field6700;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "Lr;")
    public static class110 field6701;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Z")
    public boolean field6670;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "Z")
    public boolean field6696;

    static {
        new class206("Ok", "Okay", "OK", "Ok");
        field6698 = 0;
        field6700 = null;
        field6699 = 2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIII)V", line = 17)
    public static final void method2814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6690++;
        int var8 = arg3 + 1;
        class330.method1834(arg2, class102.field1472[arg3], arg5, arg0, 25084);
        int var9 = arg4 - 1;
        class330.method1834(arg2, class102.field1472[arg4], arg5, arg0, 25084);
        if (arg1 <= -42) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class102.field1472[var6];
                var7[arg0] = var7[arg2] = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;IIIZJIIZZLjava/lang/String;)V", line = 60)
    public static final void method2815(String arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, String arg10) {
        field6667++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class32 var14 = new class32(128);
        var14.method228(10, arg1 ^ 0x20);
        var14.method229((arg8 ? 4 : 0) | (arg9 ? 2 : 0) | (arg4 ? 1 : 0), 1309449544);
        var14.method218(16439, arg5);
        var14.method199((byte) -117, var12[0]);
        var14.method208(arg0, arg1 - 124);
        var14.method199((byte) -117, var12[1]);
        var14.method229(class448.field6099, 1309449544);
        var14.method228(arg2, 32);
        var14.method228(arg7, 32);
        var14.method199((byte) -117, var12[2]);
        var14.method229(arg6, 1309449544);
        var14.method229(arg3, 1309449544);
        var14.method199((byte) -117, var12[3]);
        var14.method220(class171.field2347, -75, class105.field1578);
        class32 var15 = new class32(350);
        var15.method208(arg10, -119);
        int var16 = 8 - (class231.method1292((byte) 3, arg10) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method228((int) (Math.random() * 255.0D), 32);
        }
        var15.method248(var12, -6051);
        class203.field2751.field456 = 0;
        class203.field2751.method228(class419.field5696.field1076, arg1 ^ 0x20);
        class203.field2751.method229(var15.field456 + var14.field456 + 2, 1309449544);
        class203.field2751.method229(578, 1309449544);
        class203.field2751.method243((byte) 125, 0, var14.field472, var14.field456);
        class203.field2751.method243((byte) 125, 0, var15.field472, var15.field456);
        class30.field400 = 1;
        class466.field6460 = arg1;
        class293.field3922 = -3;
        class128.field1893 = 0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 170)
    public static void method2816(int arg0) {
        field6701 = null;
        field6700 = null;
        if (arg0 != 255) {
            field6700 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 231)
    public static final void method2817(int arg0) {
        field6692++;
        class14.method88((byte) -41);
        if (arg0 != 0) {
            field6698 = -8;
        }
        class453.field6147 = null;
        class27.field357 = null;
        class177.field2408 = null;
        class69.field946 = null;
        class36.field546 = null;
    }
}
