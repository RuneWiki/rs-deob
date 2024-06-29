import java.math.BigInteger;
import java.util.Random;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class92 {

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1631 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static volatile int field1634 = 0;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Ljava/util/Random;")
    public static Random field1633 = new Random();

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lid;")
    public static class149 field1636 = class60.method382("_labels", (byte) 24);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1629;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BBLgd;)V")
    public final void method670(byte[] arg0, byte arg1, class74 arg2) {
        if (arg1 > -51) {
            method675(25, -69, -81, -62, true, 7);
        }
        field1628++;
        if (arg2.field1321[arg2.field1340] != 31 || arg2.field1321[arg2.field1340 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1629 == null) {
            this.field1629 = new Inflater(true);
        }
        try {
            this.field1629.setInput(arg2.field1321, arg2.field1340 + 10, arg2.field1321.length + -8 + -10 + -arg2.field1340);
            this.field1629.inflate(arg0);
        } catch (Exception var4) {
            this.field1629.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1629.reset();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final void method671(int arg0) {
        if (arg0 < -86) {
            field1632++;
            class231.field4066.method1291(0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class196.field3512 = arg0;
        class190.field3414 = arg2;
        class284.field5016 = arg3;
        if (arg5 != 2047) {
            field1635 = 61;
        }
        field1630++;
        class243.field4266 = arg4;
        class269.field4844 = arg1;
        if (class284.field5016 >= 100) {
            int var6 = class190.field3414 * 128 + 64;
            int var7 = class243.field4266 * 128 + 64;
            int var8 = class287.method1968(class277.field4948, var6, var7, (byte) 99) - class269.field4844;
            int var9 = var7 - class2.field29;
            int var10 = var8 - class10.field140;
            int var11 = var6 - class269.field4853;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class186.field3354 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class147.field2646 = (int) (-325.949D * Math.atan2((double) var11, (double) var9)) & 0x7FF;
            if (class186.field3354 < 128) {
                class186.field3354 = 128;
            }
            if (class186.field3354 > 383) {
                class186.field3354 = 383;
            }
        }
        class194.field3468 = 2;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class92() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBIZ)I")
    public static final int method673(int arg0, byte arg1, int arg2, boolean arg3) {
        field1625++;
        class19 var4 = (class19) class10.field135.method639((byte) -42, (long) arg2);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field290.length; var6++) {
            if (var4.field290[var6] >= 0 && class44.field678 > var4.field290[var6]) {
                class261 var7 = class226.method1516(var4.field290[var6], -28322);
                if (var7.field4637 != null) {
                    class143 var8 = (class143) var7.field4637.method639((byte) -113, (long) arg0);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field286[var6] * var8.field2606;
                        } else {
                            var5 += var8.field2606;
                        }
                    }
                }
            }
        }
        if (arg1 != 11) {
            method672(87, 105, -29, -13, 113, 121);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
    public static final int method674(int arg0, int arg1, int arg2) {
        int var3 = 74 % ((arg0 - 80) / 35);
        int var4 = 0;
        while (arg2 > 0) {
            var4 = var4 << 1 | arg1 & 0x1;
            arg2--;
            arg1 >>>= 0x1;
        }
        field1627++;
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIZI)V")
    public static final void method675(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1626++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        class269.field4849 = (short) arg5;
        if (arg2 == 64) {
            class223.field3931 = (short) arg3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method676(int arg0) {
        field1636 = null;
        if (arg0 == -8) {
            field1633 = null;
            field1631 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(III)V")
    private class92(int arg0, int arg1, int arg2) {
    }
}
