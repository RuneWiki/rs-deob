import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class504 {

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Lfc;")
    private class174 field7466 = new class174(64);

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Loi;")
    public class53 field7464;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Loi;")
    private class53 field7470;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field7469 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7459 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "[I")
    public static int[] field7471 = new int[32];

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 7)
    public static void method3000(int arg0) {
        int var1 = -100 / ((-arg0 - 33) / 35);
        field7459 = null;
        field7471 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)V", line = 18)
    public final void method3001(int arg0, boolean arg1) {
        field7468++;
        if (!arg1) {
            this.method3003(9);
        }
        class174 var3 = this.field7466;
        synchronized (this.field7466) {
            this.field7466.method1087(1, arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 31)
    public static final void method3002(byte arg0) {
        field7465++;
        class426.field5990.method2656(91);
        for (class214 var1 = (class214) class363.field5190.method2655(arg0 + 15145); var1 != null; var1 = (class214) class363.field5190.method2660((byte) 67)) {
            if (var1.field3094 < 1000) {
                var1.method2891(2);
                class426.field5990.method2657(8492, var1);
            }
        }
        class426.field5990.method2659(class363.field5190, (byte) 87);
        int var2 = -1;
        if (arg0 != 7) {
            return;
        }
        class432 var3 = (class432) class323.field4718.method2655(15152);
        if (var3 != null) {
            var2 = var3.method1080((byte) 111);
        }
        if (!class424.field5977) {
            if (var2 == 0 && (class234.field3409 == 1 && class37.field408 > 2 || class172.method1079((byte) -114))) {
                var2 = 2;
            }
            if (var2 == 2 && class37.field408 > 0 && var3 != null) {
                if (class471.field6573 == null && class171.field2480 == 0) {
                    class243.method1527(var3.method1084((byte) -102), var3.method1082(-769), (byte) -33);
                } else {
                    class358.field5129 = 2;
                }
            }
            if (var2 == 0 && class37.field408 > 0) {
                class78.method596(1);
            }
            if (class471.field6573 != null || class171.field2480 != 0) {
                return;
            }
            class358.field5129 = 0;
            class531.field7800 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class22.field277.method1192(true);
            int var5 = class22.field277.method1194(36);
            if (class123.field1679 - 10 > var4 || class123.field1679 + class388.field5445 + 10 < var4 || var5 < class250.field3725 - 10 || var5 > class250.field3725 + class2.field56 + 10) {
                class343.method2047(true);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class123.field1679;
        int var7 = class250.field3725;
        int var8 = class388.field5445;
        int var9 = var3.method1084((byte) -102);
        int var10 = var3.method1082(arg0 - 776);
        int var11 = -1;
        for (int var12 = 0; var12 < class37.field408; var12++) {
            if (class328.field4784) {
                int var17 = (class37.field408 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && var9 < var6 + var8 && var10 > (var17 - 13) && var10 < (var17 + 4)) {
                    var11 = var12;
                }
            } else {
                int var16 = var7 + ((class37.field408 + -1 + -var12) * 16) + 31;
                if (var9 > var6 && var9 < (var6 + var8) && var16 - 13 < var10 && var10 < var16 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class140 var14 = new class140(class363.field5190);
            for (class214 var15 = (class214) var14.method876((byte) -75); var15 != null; var15 = (class214) var14.method880((byte) -65)) {
                if (var11 == var13) {
                    class52.method417(var15, true, var10, var9);
                }
                var13++;
            }
        }
        class343.method2047(true);
        return;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V", line = 186)
    public final void method3003(int arg0) {
        field7472++;
        if (arg0 >= 11) {
            class174 var2 = this.field7466;
            synchronized (this.field7466) {
                this.field7466.method1095(0);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Luq;", line = 201)
    public final class114 method3004(int arg0, int arg1) {
        field7462++;
        class174 var3 = this.field7466;
        class114 var4;
        synchronized (this.field7466) {
            var4 = (class114) this.field7466.method1088((long) arg1, (byte) 76);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field7470;
        byte[] var6;
        synchronized (this.field7470) {
            var6 = this.field7470.method426(3, (byte) 9, arg1);
        }
        class114 var7 = new class114();
        var7.field1552 = this;
        if (var6 != null) {
            var7.method769(-114, new class403(var6));
        }
        class174 var8 = this.field7466;
        synchronized (this.field7466) {
            if (arg0 == -1) {
                this.field7466.method1097(19627, var7, (long) arg1);
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 232)
    public final void method3005(byte arg0) {
        field7467++;
        class174 var2 = this.field7466;
        synchronized (this.field7466) {
            if (arg0 <= 98) {
                method3000(-87);
            }
            this.field7466.method1096((byte) 127);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Z", line = 255)
    public static final boolean method3006(int arg0, int arg1, int arg2) {
        if (arg0 < 119) {
            method3002((byte) -60);
        }
        field7460++;
        return class519.method3073(arg2, arg1, (byte) 118) | (arg1 & 0x800) != 0 || class414.method2453(arg2, arg1, -122);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lle;ILoi;Loi;)V", line = 273)
    public class504(class205 arg0, int arg1, class53 arg2, class53 arg3) {
        this.field7464 = arg3;
        this.field7470 = arg2;
        this.field7470.method435(3, 0);
    }
}
