import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class457 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public int field6801;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public int field6806;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public int field6804;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lvv;")
    public static class313 field6803 = new class313(70, -1);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 7)
    public static void method2736(int arg0) {
        field6803 = null;
        if (arg0 != 5298) {
            field6805 = 37;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZIB)V", line = 21)
    public static final void method2737(boolean arg0, int arg1, byte arg2) {
        field6802++;
        class112 var3 = class295.method1888(arg0, arg1, (byte) 76);
        if (var3 != null) {
            var3.method1821((byte) 124);
            if (arg2 <= 59) {
                field6803 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(III)V", line = 38)
    public class457(int arg0, int arg1, int arg2) {
        this.field6801 = arg1;
        this.field6806 = arg0;
        this.field6804 = arg2;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILap;)Z", line = 53)
    public static final boolean method2738(int arg0, int arg1, class340 arg2) {
        field6807++;
        int var3 = arg2.method2155(2, arg0 + 30135);
        if (var3 == 0) {
            if (arg2.method2155(1, 30390) != 0) {
                method2738(arg0, arg1, arg2);
            }
            int var4 = arg2.method2155(6, 30390);
            int var5 = arg2.method2155(6, 30390);
            boolean var6 = arg2.method2155(1, arg0 + 30135) == 1;
            if (var6) {
                class335.field5261[class299.field4808++] = arg1;
            }
            if (class435.field6489[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class260 var7 = class201.field3196[arg1];
            class166 var8 = class435.field6489[arg1] = new class166();
            var8.field3130 = arg1;
            if (class20.field226[arg1] != null) {
                var8.method1140(true, class20.field226[arg1]);
            }
            var8.method1305(16383, true, var7.field4355);
            var8.field3065 = var7.field4350;
            int var9 = var7.field4349;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            var8.field2649 = var7.field4354;
            int var12 = var9 & 0xFF;
            var8.field3152[0] = class506.field7364[arg1];
            var8.field4720 = (byte) var10;
            var8.method1134((var12 << 6) + var5 - class455.field6794, (var11 << 6) + -class16.field181 - -var4, (byte) 95);
            var8.field2628 = false;
            class201.field3196[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method2155(2, arg0 + 30135);
            int var14 = class201.field3196[arg1].field4349;
            class201.field3196[arg1].field4349 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method2155(5, arg0 ^ 0x7649);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class201.field3196[arg1].field4349;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class201.field3196[arg1].field4349 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg2.method2155(18, 30390);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = arg0 & var22;
            int var26 = class201.field3196[arg1].field4349;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class201.field3196[arg1].field4349 = (var27 << 28) + ((var28 << 14) + var29);
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZII)V")
    public abstract void method328(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
    public abstract void method334(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZ)V")
    public abstract void method331(int arg0, int arg1, boolean arg2);
}
