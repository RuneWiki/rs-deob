import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class270 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lsf;")
    public static class108 field4727 = class140.method973(255, "rouge:");

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lik;")
    public static class262 field4725;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[I")
    public static int[] field4729;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "[Lvd;")
    public static class135[] field4732;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1949(int arg0) {
        field4731++;
        class13.field145.method644((byte) 66);
        class74.field1115.method644((byte) 94);
        class272.field4753.method644((byte) 65);
        if (arg0 != -1) {
            method1950(86, -83, (class98[]) null, (byte) -54, -78, true);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[Lca;BIZ)V", line = 21)
    public static final void method1950(int arg0, int arg1, class98[] arg2, byte arg3, int arg4, boolean arg5) {
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class98 var7 = arg2[var6];
            if (var7 != null && var7.field1611 == arg1) {
                class39.method264(var7, arg5, arg4, 1, arg0);
                class1.method8(arg4, var7, 103, arg0);
                if (var7.field1691 - var7.field1673 < var7.field1597) {
                    var7.field1597 = var7.field1691 - var7.field1673;
                }
                if (var7.field1597 < 0) {
                    var7.field1597 = 0;
                }
                if (var7.field1701 > var7.field1703 - var7.field1688) {
                    var7.field1701 = var7.field1703 - var7.field1688;
                }
                if (var7.field1701 < 0) {
                    var7.field1701 = 0;
                }
                if (var7.field1677 == 0) {
                    class146.method1020((byte) -120, var7, arg5);
                }
            }
        }
        field4730++;
        int var8 = -119 / ((-arg3 - 30) / 58);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 73)
    public static void method1951(int arg0) {
        field4725 = null;
        field4729 = null;
        if (arg0 != 0) {
            method1952(-28, -50, -127);
        }
        field4732 = null;
        field4727 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V", line = 96)
    public static final void method1952(int arg0, int arg1, int arg2) {
        class25.field382 = class83.field1288 + class152.field2757 - arg2 - 1;
        field4728++;
        class301.field5243 = arg0 - class144.field2546;
        int var3 = class301.field5243 + ((int) ((float) class316.field5444.field1673 / class147.field2643));
        if (arg1 != -13545) {
            return;
        }
        int var4 = class301.field5243 - (int) ((float) class316.field5444.field1673 / class147.field2643);
        if (var4 < 0) {
            class301.field5243 = (int) ((float) class316.field5444.field1673 / class147.field2643);
        }
        int var5 = class25.field382 + ((int) ((float) class316.field5444.field1688 / class147.field2643));
        int var6 = class25.field382 - (int) ((float) class316.field5444.field1688 / class147.field2643);
        if (var6 < 0) {
            class25.field382 = (int) ((float) class316.field5444.field1688 / class147.field2643);
        }
        if (class74.field1113 < var3) {
            class301.field5243 = class74.field1113 - ((int) ((float) class316.field5444.field1673 / class147.field2643));
        }
        if (var5 > class152.field2757) {
            class25.field382 = class152.field2757 - ((int) ((float) class316.field5444.field1688 / class147.field2643));
        }
    }
}
