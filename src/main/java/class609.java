import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class609 {

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "Lla;")
    private class423 field8695;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "Lla;")
    private class423 field8688;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
    public static int field8692 = 0;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "Lgr;")
    public static class530 field8689 = new class530(1, 4);

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "Z")
    public static boolean field8694 = false;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "Lul;")
    private class364 field8687;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "[[B")
    public static byte[][] field8690;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V", line = 5)
    public static void method3544(byte arg0) {
        field8689 = null;
        field8690 = null;
        int var1 = -35 / ((arg0 - 20) / 49);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)[Luv;", line = 17)
    public static final class750[] method3545(int arg0) {
        if (class350.field5202 == null) {
            class750[] var1 = class31.method153(1006102306, class345.field4749);
            class750[] var2 = new class750[var1.length];
            int var3 = 0;
            int var4 = class243.field3580.field7983.method619(false);
            label73: for (int var5 = 0; var5 < var1.length; var5++) {
                class750 var9 = var1[var5];
                if ((var9.field10450 <= 0 || var9.field10450 >= 24) && var9.field10454 >= 800 && var9.field10455 >= 600 && (var4 != 2 || var9.field10454 <= 800 && var9.field10455 <= 600) && (var4 != 1 || var9.field10454 <= 1024 && var9.field10455 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class750 var11 = var2[var10];
                        if (var9.field10454 == var11.field10454 && var9.field10455 == var11.field10455) {
                            if (var11.field10450 < var9.field10450) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class350.field5202 = new class750[var3];
            class85.method680(var2, 0, class350.field5202, 0, var3);
            int[] var6 = new int[class350.field5202.length];
            for (int var7 = 0; var7 < class350.field5202.length; var7++) {
                class750 var8 = class350.field5202[var7];
                var6[var7] = var8.field10455 * var8.field10454;
            }
            class502.method3060(-102, var6, class350.field5202);
        }
        field8686++;
        return arg0 == -769 ? class350.field5202 : null;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)Lul;", line = 113)
    private final class364 method3546(int arg0) {
        field8693++;
        if (this.field8687 == null) {
            this.field8687 = new class364();
        }
        if (arg0 != 4966) {
            field8690 = null;
        }
        return this.field8687;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLbia;)Lko;", line = 136)
    public final class318 method3547(byte arg0, class409 arg1) {
        field8691++;
        if (arg0 != 124) {
            this.field8687 = null;
        }
        if (arg1 == null) {
            return null;
        }
        class57 var3 = arg1.method478(58);
        if (class165.field2341 == var3) {
            return new class706((class240) arg1);
        } else if (class147.field2153 == var3) {
            return new class589(this.method3546(4966), (class147) arg1);
        } else if (class153.field2228 == var3) {
            return new class288(this.field8688, (class548) arg1);
        } else if (class28.field260 == var3) {
            return new class299(this.field8688, (class56) arg1);
        } else if (class457.field6509 == var3) {
            return new class472(this.field8688, this.field8695, (class659) arg1);
        } else if (class438.field6242 == var3) {
            return new class39(this.field8688, this.field8695, (class536) arg1);
        } else if (class463.field6594 == var3) {
            return new class179(this.field8688, this.field8695, (class629) arg1);
        } else if (class438.field6249 == var3) {
            return new class84(this.field8688, this.field8695, (class326) arg1);
        } else if (class758.field10545 == var3) {
            return new class535(this.field8688, (class313) arg1);
        } else if (class556.field8079 == var3) {
            return new class30(this.field8688, this.field8695, (class53) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lla;Lla;)V", line = 192)
    public class609(class423 arg0, class423 arg1) {
        this.field8695 = arg1;
        this.field8688 = arg0;
    }
}
