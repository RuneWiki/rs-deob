import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class40 extends class425 {

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "Z")
    public boolean field550;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "[Lqn;")
    public class40[] field553;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "Lub;")
    public static class15 field548 = new class15(20);

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field557 = 0;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field558 = 0;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Lhr;")
    public class308 field555;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Lmk;")
    public class34 field551;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
    public static final void method258(boolean arg0) {
        if (arg0) {
            field543++;
            class262.field3867.method98(0);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method259(String arg0, byte arg1, int arg2) {
        field539++;
        class276 var3 = class264.method1816((byte) -88, arg2, 3);
        if (arg1 > -26) {
            field548 = null;
        }
        var3.method1876((byte) -121);
        var3.field3981 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZI)V")
    public void method260(int arg0, boolean arg1, int arg2) {
        field540++;
        int var4 = this.field549 == 255 ? arg0 : this.field549;
        if (!arg1) {
            field557 = -47;
        }
        if (this.field550) {
            this.field551 = new class34(var4, arg0, arg2);
        } else {
            this.field555 = new class308(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)[[I")
    public final int[][] method261(int arg0, int arg1, int arg2) {
        field541++;
        if (arg1 != 28552) {
            this.field549 = 17;
        }
        if (this.field553[arg0].field550) {
            int[] var4 = this.field553[arg0].method44((byte) -100, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field553[arg0].method112(arg1 - 28551, arg2);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[[I")
    public int[][] method112(int arg0, int arg1) {
        if (arg0 == 1) {
            field542++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)I")
    public int method262(byte arg0) {
        field554++;
        int var2 = 121 % ((arg0 + 68) / 42);
        return -1;
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V")
    public static final void method263(byte arg0) {
        class352.field5114.method2047((byte) -118);
        if (arg0 >= -53) {
            return;
        }
        field556++;
        int var1 = class352.field5114.method2053((byte) 0, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class352.field5114.method2053((byte) 0, 2);
        if (var2 == 0) {
            class314.field4623[class349.field5084++] = 2047;
        } else if (var2 == 1) {
            int var3 = class352.field5114.method2053((byte) 0, 3);
            class181.field2555.method776(1, var3, 23542);
            int var4 = class352.field5114.method2053((byte) 0, 1);
            if (var4 == 1) {
                class314.field4623[class349.field5084++] = 2047;
            }
        } else if (var2 == 2) {
            if (class352.field5114.method2053((byte) 0, 1) == 1) {
                int var5 = class352.field5114.method2053((byte) 0, 3);
                class181.field2555.method776(2, var5, 23542);
                int var6 = class352.field5114.method2053((byte) 0, 3);
                class181.field2555.method776(2, var6, 23542);
            } else {
                int var7 = class352.field5114.method2053((byte) 0, 3);
                class181.field2555.method776(0, var7, 23542);
            }
            int var8 = class352.field5114.method2053((byte) 0, 1);
            if (var8 == 1) {
                class314.field4623[class349.field5084++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class352.field5114.method2053((byte) 0, 1);
            if (var9 == 1) {
                class314.field4623[class349.field5084++] = 2047;
            }
            int var10 = class352.field5114.method2053((byte) 0, 7);
            int var11 = class352.field5114.method2053((byte) 0, 1);
            class158.field2302 = class352.field5114.method2053((byte) 0, 2);
            int var12 = class352.field5114.method2053((byte) 0, 7);
            class181.field2555.method779(-3, class158.field2302, var12, var11 == 1, var10);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILlf;)V")
    public void method43(int arg0, int arg1, class130 arg2) {
        field545++;
        if (arg1 < 79) {
            this.field555 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)[I")
    public int[] method44(byte arg0, int arg1) {
        if (arg0 >= -20) {
            method265(-15);
        }
        field538++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(B)V")
    public void method264(byte arg0) {
        if (arg0 != 71) {
            this.field555 = null;
        }
        field547++;
        if (this.field550) {
            this.field551.method188(0);
            this.field551 = null;
        } else {
            this.field555.method2072(arg0 ^ 0x47);
            this.field555 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(B)V")
    public void method39(byte arg0) {
        if (arg0 == -23) {
            field537++;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public static void method265(int arg0) {
        field548 = null;
        if (arg0 != 2) {
            method268(true, -74, -84);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)[I")
    public final int[] method266(byte arg0, int arg1, int arg2) {
        field546++;
        if (arg0 != -116) {
            method265(-82);
        }
        return this.field553[arg2].field550 ? this.field553[arg2].method44((byte) -76, arg1) : this.field553[arg2].method112(1, arg1)[0];
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)I")
    public int method267(int arg0) {
        if (arg0 == 28891) {
            field544++;
            return -1;
        } else {
            return -28;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IZ)V")
    public class40(int arg0, boolean arg1) {
        this.field550 = arg1;
        this.field553 = new class40[arg0];
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZII)V")
    public static final void method268(boolean arg0, int arg1, int arg2) {
        field552++;
        if (!arg0) {
            method258(true);
        }
        class276 var3 = class264.method1816((byte) -104, arg2, 5);
        var3.method1876((byte) -128);
        var3.field3986 = arg1;
    }
}
