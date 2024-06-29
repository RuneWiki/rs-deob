import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class73 {

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field979 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field982 = 12;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field984 = 205;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lui;")
    public static class451 field983;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "[S")
    public static short[] field989;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
    public abstract void method627(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII)I")
    public static final int method628(int arg0, int arg1, int arg2, int arg3) {
        field986++;
        int var4 = arg0 / arg3;
        int var5 = arg0 & arg3 - 1;
        int var6 = 86 % ((arg1 + 7) / 40);
        int var7 = arg2 / arg3;
        int var8 = arg3 - 1 & arg2;
        int var9 = class55.method397(1, var4, var7);
        int var10 = class55.method397(1, var4 + 1, var7);
        int var11 = class55.method397(1, var4, var7 + 1);
        int var12 = class55.method397(1, var4 + 1, var7 + 1);
        int var13 = class3.method25(0, var5, var10, arg3, var9);
        int var14 = class3.method25(0, var5, var12, arg3, var11);
        return class3.method25(0, var8, var14, arg3, var13);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static void method629(byte arg0) {
        field983 = null;
        if (arg0 >= 39) {
            field989 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)V")
    public abstract void method630(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static final void method631(int arg0) {
        field987++;
        if (class46.field664) {
            return;
        }
        class380.field5645 = true;
        if (class337.field5038.field3942) {
            class412.field5953 = (float) ((int) class412.field5953 + 47 & 0xFFFFFFF0);
        } else {
            class83.field1182 += (12.0F - class83.field1182) / 2.0F;
        }
        class46.field664 = true;
        if (arg0 != 8282) {
            method628(-81, 47, 13, -34);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V")
    public abstract void method632(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(III)V")
    public class73(int arg0, int arg1, int arg2) {
        this.field985 = arg0;
        this.field988 = arg1;
        this.field980 = arg2;
    }
}
