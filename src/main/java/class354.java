import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public abstract class class354 extends class5 {

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Z")
    public boolean field5466;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "[Lko;")
    public class354[] field5462;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "Lof;")
    public static class446 field5475 = new class446("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "Lla;")
    public static class319 field5479 = new class319(69, -1);

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "Lni;")
    public static class367 field5480 = new class367(68, 2);

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5481 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "Lni;")
    public static class367 field5482 = new class367(5, 0);

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "Lof;")
    public static class446 field5484 = new class446("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "Lmd;")
    public class386 field5474;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "Lim;")
    public class409 field5478;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIZ)V")
    public static final void method2271(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = class203.field2716.field1157 * arg0 >> 8;
        field5459++;
        if (arg2 == -1 && !class539.field7905) {
            class534.method3161((byte) -97);
        } else if (arg2 != -1 && (class513.field7536 != arg2 || !class429.method2622(-1)) && var4 != 0 && !class539.field7905) {
            class337.method2189((byte) 58, var4, false, class162.field2111, arg1, arg2, 0);
        }
        if (arg3) {
            field5483 = 125;
        }
        class513.field7536 = arg2;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(BI)[I")
    public int[] method270(byte arg0, int arg1) {
        field5463++;
        if (arg0 > -74) {
            this.method375(121);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
    public static final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5465++;
        int var5 = 0;
        int var6 = arg4;
        if (arg2 != 1869979233) {
            field5475 = null;
        }
        int var7 = -arg4;
        int var8 = -1;
        class221.method1489(class466.field6955[arg0], arg1 - arg4, arg1 - -arg4, (byte) -30, arg3);
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class466.field6955[arg0 + var6];
                int[] var10 = class466.field6955[arg0 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class221.method1489(var9, var12, var11, (byte) -30, arg3);
                class221.method1489(var10, var12, var11, (byte) -30, arg3);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class466.field6955[arg0 + var5];
            int[] var16 = class466.field6955[arg0 - var5];
            class221.method1489(var15, var14, var13, (byte) -30, arg3);
            class221.method1489(var16, var14, var13, (byte) -30, arg3);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)I")
    public int method2273(boolean arg0) {
        if (arg0) {
            this.field5478 = null;
        }
        field5461++;
        return -1;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public void method375(int arg0) {
        if (this.field5466) {
            this.field5478.method2524(0);
            this.field5478 = null;
        } else {
            this.field5474.method2412((byte) -111);
            this.field5474 = null;
        }
        field5469++;
        if (arg0 != 1) {
            this.method375(22);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BII)[[I")
    public final int[][] method2274(byte arg0, int arg1, int arg2) {
        if (arg0 != 84) {
            field5480 = null;
        }
        field5470++;
        if (this.field5462[arg2].field5466) {
            int[] var4 = this.field5462[arg2].method270((byte) -84, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5462[arg2].method354(arg1, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(BII)[I")
    public final int[] method2275(byte arg0, int arg1, int arg2) {
        field5471++;
        if (arg0 <= 69) {
            field5475 = null;
        }
        return this.field5462[arg1].field5466 ? this.field5462[arg1].method270((byte) -121, arg2) : this.field5462[arg1].method354(arg2, (byte) 110)[0];
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
    public void method373(int arg0, int arg1, int arg2) {
        field5460++;
        int var4 = 100 / ((11 - arg2) / 38);
        int var5 = this.field5472 == 255 ? arg0 : this.field5472;
        if (this.field5466) {
            this.field5478 = new class409(var5, arg0, arg1);
        } else {
            this.field5474 = new class386(var5, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lnj;II)V")
    public void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 == 1638) {
            field5464++;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5458++;
        int var7 = arg6 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg4;
        } else if (arg1 == -1310) {
            return var7 == 2 ? 7 + 1 - arg0 - arg2 : -arg5 - -1 + -arg4 + 7;
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZI)I")
    public static final int method2277(int arg0, boolean arg1, int arg2) {
        field5467++;
        if (arg1) {
            return 0;
        }
        class94 var3 = class402.method2483(arg1, (byte) -81, arg0);
        if (var3 == null) {
            return class313.field4574.method1474(-55, arg0).field5181;
        }
        int var4 = 0;
        for (int var5 = arg2; var5 < var3.field1373.length; var5++) {
            if (var3.field1373[var5] == -1) {
                var4++;
            }
        }
        return var4 + class313.field4574.method1474(arg2 - 122, arg0).field5181 - var3.field1373.length;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)[[I")
    public int[][] method354(int arg0, byte arg1) {
        int var3 = -44 / ((arg1 - 48) / 60);
        field5473++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)I")
    public int method371(int arg0) {
        field5468++;
        if (arg0 != -1) {
            this.method270((byte) 27, -123);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IZ)V")
    public class354(int arg0, boolean arg1) {
        this.field5466 = arg1;
        this.field5462 = new class354[arg0];
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
    public void method357(int arg0) {
        field5476++;
        if (arg0 <= 28) {
            this.method2274((byte) -112, 86, 54);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public static void method2278(byte arg0) {
        field5484 = null;
        field5475 = null;
        field5482 = null;
        field5481 = null;
        if (arg0 == 46) {
            field5480 = null;
            field5479 = null;
        }
    }
}
